package org.vaadin.gwtol3.client.style;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArrayNumber;

/**
 * Stroke style for a feature
 */
public class StrokeStyle extends JavaScriptObject {
    protected StrokeStyle() {
    }

    /** creates a new StrokeStyle instance
     *
     * @param options
     * @return
     */
    public static final native StrokeStyle create(StrokeStyleOptions options) /*-{
        return new $wnd.ol.style.Stroke(options);
    }-*/;

    public final native String getColor() /*-{
        return this.getColor();
    }-*/;

    public final native String getLineCap() /*-{
        return this.getLineCap();
    }-*/;

    public final native JsArrayNumber getLineDash() /*-{
        return this.getLineDash();
    }-*/;

    public final native String getLineJoin() /*-{
        return this.getLineJoin();
    }-*/;

    public final native Double getMiterLimit() /*-{
		var res = this.getMiterLimit();
        return res == null ? null : @java.lang.Double::valueOf(D)(res);
    }-*/;

    public final native Double getWidth() /*-{
        var res = this.getWidth();
        return res == null ? null : @java.lang.Double::valueOf(D)(res);
    }-*/;


}
