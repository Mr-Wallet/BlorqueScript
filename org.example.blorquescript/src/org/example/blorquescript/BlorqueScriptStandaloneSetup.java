/*
 * generated by Xtext
 */
package org.example.blorquescript;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class BlorqueScriptStandaloneSetup extends BlorqueScriptStandaloneSetupGenerated{

	public static void doSetup() {
		new BlorqueScriptStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}
