/*
 * generated by Xtext
 */
package org.xtext.example.blorquescript;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class BlorqueScriptStandaloneSetup extends BlorqueScriptStandaloneSetupGenerated{

	public static void doSetup() {
		new BlorqueScriptStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}
