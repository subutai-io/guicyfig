package org.safehaus.guicyfig.overrides;


import org.safehaus.guicyfig.FigSingleton;
import org.safehaus.guicyfig.GuicyFig;


/**
 * Another configuration interface.
 */
@FigSingleton
public interface OverridesSingletonFig extends GuicyFig {
    int getAbc();
}