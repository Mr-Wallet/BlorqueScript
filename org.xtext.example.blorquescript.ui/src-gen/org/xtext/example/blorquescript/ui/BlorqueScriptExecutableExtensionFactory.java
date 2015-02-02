/*
 * generated by Xtext
 */
package org.xtext.example.blorquescript.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

import org.xtext.example.blorquescript.ui.internal.BlorqueScriptActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class BlorqueScriptExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return BlorqueScriptActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return BlorqueScriptActivator.getInstance().getInjector(BlorqueScriptActivator.ORG_XTEXT_EXAMPLE_BLORQUESCRIPT_BLORQUESCRIPT);
	}
	
}
