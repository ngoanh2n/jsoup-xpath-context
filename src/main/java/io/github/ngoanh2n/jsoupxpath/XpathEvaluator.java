package io.github.ngoanh2n.jsoupxpath;

import org.jsoup.nodes.Element;
import org.jsoup.select.Evaluator;

/**
 * {@linkplain XpathEvaluator} is a {@linkplain org.jsoup.select.Evaluator}
 * <br>
 * <br>
 * Repository: <a href="https://github.com/ngoanh2n/jsoup-xpath">https://github.com/ngoanh2n/jsoup-xpath</a>
 *
 * @author Ho Huu Ngoan (ngoanh2n@gmail.com)
 * @version 1.0.0
 * @since 2021-01-16
 */
public class XpathEvaluator extends Evaluator {

    private final Evaluator evaluator;

    public XpathEvaluator(NodeXpath xpath) {
        this.evaluator = XpathEvaluators.combination(xpath.toEvaluators());
    }

    @Override
    public boolean matches(Element root, Element element) {
        return evaluator.matches(root, element);
    }
}