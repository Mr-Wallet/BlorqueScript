package org.example.blorquescript.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.example.blorquescript.services.BlorqueScriptGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalBlorqueScriptParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "Continue", "Default", "Package", "Client", "Import", "Number", "Object", "Parent", "Return", "String", "Switch", "Break", "Class", "False", "While", "Case", "Else", "Null", "This", "True", "LessThanSignLessThanSignEqualsSign", "GreaterThanSignGreaterThanSignEqualsSign", "SPC", "TAB", "For", "New", "ExclamationMarkEqualsSign", "PercentSignEqualsSign", "AmpersandAmpersand", "AmpersandEqualsSign", "AsteriskEqualsSign", "PlusSignPlusSign", "PlusSignEqualsSign", "HyphenMinusHyphenMinus", "HyphenMinusEqualsSign", "FullStopAsterisk", "SolidusEqualsSign", "LessThanSignLessThanSign", "LessThanSignEqualsSign", "EqualsSignEqualsSign", "GreaterThanSignEqualsSign", "GreaterThanSignGreaterThanSign", "CommercialAtEqualsSign", "NL", "CircumflexAccentEqualsSign", "If", "VerticalLineEqualsSign", "VerticalLineVerticalLine", "ExclamationMark", "DollarSign", "PercentSign", "Ampersand", "LeftParenthesis", "RightParenthesis", "Asterisk", "PlusSign", "Comma", "HyphenMinus", "FullStop", "Solidus", "Colon", "Semicolon", "LessThanSign", "EqualsSign", "GreaterThanSign", "QuestionMark", "CommercialAt", "LeftSquareBracket", "RightSquareBracket", "CircumflexAccent", "LeftCurlyBracket", "VerticalLine", "RightCurlyBracket", "Tilde", "RULE_HEX_VALUE", "RULE_ID", "RULE_INT", "RULE_ESCAPE_CODE", "RULE_STRING", "RULE_TAGGED_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int HyphenMinusHyphenMinus=37;
    public static final int New=29;
    public static final int Null=21;
    public static final int Import=8;
    public static final int AmpersandEqualsSign=33;
    public static final int SolidusEqualsSign=40;
    public static final int SPC=26;
    public static final int Break=15;
    public static final int True=23;
    public static final int String=13;
    public static final int False=17;
    public static final int LessThanSign=66;
    public static final int PercentSign=54;
    public static final int LeftParenthesis=56;
    public static final int RULE_ESCAPE_CODE=81;
    public static final int This=22;
    public static final int Ampersand=55;
    public static final int AsteriskEqualsSign=34;
    public static final int Client=7;
    public static final int VerticalLineEqualsSign=50;
    public static final int RightSquareBracket=72;
    public static final int RULE_TAGGED_STRING=83;
    public static final int ExclamationMark=52;
    public static final int GreaterThanSign=68;
    public static final int RULE_ID=79;
    public static final int For=28;
    public static final int RightParenthesis=57;
    public static final int GreaterThanSignEqualsSign=44;
    public static final int EqualsSignEqualsSign=43;
    public static final int RULE_HEX_VALUE=78;
    public static final int Switch=14;
    public static final int VerticalLine=75;
    public static final int PlusSign=59;
    public static final int RULE_INT=80;
    public static final int FullStopAsterisk=39;
    public static final int RULE_ML_COMMENT=84;
    public static final int CircumflexAccentEqualsSign=48;
    public static final int Object=10;
    public static final int Class=16;
    public static final int LeftSquareBracket=71;
    public static final int Package=6;
    public static final int LessThanSignLessThanSign=41;
    public static final int If=49;
    public static final int NL=47;
    public static final int LessThanSignLessThanSignEqualsSign=24;
    public static final int Parent=11;
    public static final int VerticalLineVerticalLine=51;
    public static final int RULE_STRING=82;
    public static final int Continue=4;
    public static final int Case=19;
    public static final int RULE_SL_COMMENT=85;
    public static final int Comma=60;
    public static final int EqualsSign=67;
    public static final int HyphenMinus=61;
    public static final int Number=9;
    public static final int AmpersandAmpersand=32;
    public static final int HyphenMinusEqualsSign=38;
    public static final int LessThanSignEqualsSign=42;
    public static final int Solidus=63;
    public static final int Colon=64;
    public static final int RightCurlyBracket=76;
    public static final int EOF=-1;
    public static final int Asterisk=58;
    public static final int PercentSignEqualsSign=31;
    public static final int PlusSignEqualsSign=36;
    public static final int FullStop=62;
    public static final int Return=12;
    public static final int CommercialAtEqualsSign=46;
    public static final int RULE_WS=86;
    public static final int LeftCurlyBracket=74;
    public static final int Tilde=77;
    public static final int While=18;
    public static final int RULE_ANY_OTHER=87;
    public static final int GreaterThanSignGreaterThanSign=45;
    public static final int Default=5;
    public static final int CircumflexAccent=73;
    public static final int CommercialAt=70;
    public static final int Semicolon=65;
    public static final int TAB=27;
    public static final int PlusSignPlusSign=35;
    public static final int QuestionMark=69;
    public static final int Else=20;
    public static final int DollarSign=53;
    public static final int ExclamationMarkEqualsSign=30;
    public static final int GreaterThanSignGreaterThanSignEqualsSign=25;

    // delegates
    // delegators


        public InternalBlorqueScriptParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalBlorqueScriptParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalBlorqueScriptParser.tokenNames; }
    public String getGrammarFileName() { return "../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g"; }




    	private BlorqueScriptGrammarAccess grammarAccess;
    	 	
    	public InternalBlorqueScriptParser(TokenStream input, BlorqueScriptGrammarAccess grammarAccess) {
    		this(input);
    		this.grammarAccess = grammarAccess;
    		registerRules(grammarAccess.getGrammar());
    	}
    	
    	@Override
    	protected String getFirstRuleName() {
    		return "BSFile";	
    	} 
    	   	   	
    	@Override
    	protected BlorqueScriptGrammarAccess getGrammarAccess() {
    		return grammarAccess;
    	}



    // $ANTLR start "entryRuleBSFile"
    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:61:1: entryRuleBSFile returns [EObject current=null] : iv_ruleBSFile= ruleBSFile EOF ;
    public final EObject entryRuleBSFile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBSFile = null;


        try {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:62:2: (iv_ruleBSFile= ruleBSFile EOF )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:63:2: iv_ruleBSFile= ruleBSFile EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBSFileRule()); 
            }
            pushFollow(FOLLOW_ruleBSFile_in_entryRuleBSFile67);
            iv_ruleBSFile=ruleBSFile();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBSFile; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBSFile77); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBSFile"


    // $ANTLR start "ruleBSFile"
    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:70:1: ruleBSFile returns [EObject current=null] : ( (otherlv_0= Package ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= Semicolon )? ( (lv_imports_3_0= ruleBSImport ) )* ( (lv_classes_4_0= ruleBSClass ) )* ) ;
    public final EObject ruleBSFile() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_imports_3_0 = null;

        EObject lv_classes_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:73:28: ( ( (otherlv_0= Package ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= Semicolon )? ( (lv_imports_3_0= ruleBSImport ) )* ( (lv_classes_4_0= ruleBSClass ) )* ) )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:74:1: ( (otherlv_0= Package ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= Semicolon )? ( (lv_imports_3_0= ruleBSImport ) )* ( (lv_classes_4_0= ruleBSClass ) )* )
            {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:74:1: ( (otherlv_0= Package ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= Semicolon )? ( (lv_imports_3_0= ruleBSImport ) )* ( (lv_classes_4_0= ruleBSClass ) )* )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:74:2: (otherlv_0= Package ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= Semicolon )? ( (lv_imports_3_0= ruleBSImport ) )* ( (lv_classes_4_0= ruleBSClass ) )*
            {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:74:2: (otherlv_0= Package ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= Semicolon )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==Package) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:75:2: otherlv_0= Package ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= Semicolon
                    {
                    otherlv_0=(Token)match(input,Package,FOLLOW_Package_in_ruleBSFile116); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getBSFileAccess().getPackageKeyword_0_0());
                          
                    }
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:79:1: ( (lv_name_1_0= ruleQualifiedName ) )
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:80:1: (lv_name_1_0= ruleQualifiedName )
                    {
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:80:1: (lv_name_1_0= ruleQualifiedName )
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:81:3: lv_name_1_0= ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getBSFileAccess().getNameQualifiedNameParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleBSFile136);
                    lv_name_1_0=ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getBSFileRule());
                      	        }
                             		set(
                             			current, 
                             			"name",
                              		lv_name_1_0, 
                              		"QualifiedName");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_2=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_ruleBSFile149); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getBSFileAccess().getSemicolonKeyword_0_2());
                          
                    }

                    }
                    break;

            }

            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:102:3: ( (lv_imports_3_0= ruleBSImport ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==Import) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:103:1: (lv_imports_3_0= ruleBSImport )
            	    {
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:103:1: (lv_imports_3_0= ruleBSImport )
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:104:3: lv_imports_3_0= ruleBSImport
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getBSFileAccess().getImportsBSImportParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleBSImport_in_ruleBSFile171);
            	    lv_imports_3_0=ruleBSImport();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getBSFileRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"imports",
            	              		lv_imports_3_0, 
            	              		"BSImport");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:120:3: ( (lv_classes_4_0= ruleBSClass ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==Class) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:121:1: (lv_classes_4_0= ruleBSClass )
            	    {
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:121:1: (lv_classes_4_0= ruleBSClass )
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:122:3: lv_classes_4_0= ruleBSClass
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getBSFileAccess().getClassesBSClassParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleBSClass_in_ruleBSFile193);
            	    lv_classes_4_0=ruleBSClass();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getBSFileRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"classes",
            	              		lv_classes_4_0, 
            	              		"BSClass");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBSFile"


    // $ANTLR start "entryRuleBSImport"
    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:146:1: entryRuleBSImport returns [EObject current=null] : iv_ruleBSImport= ruleBSImport EOF ;
    public final EObject entryRuleBSImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBSImport = null;


        try {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:147:2: (iv_ruleBSImport= ruleBSImport EOF )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:148:2: iv_ruleBSImport= ruleBSImport EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBSImportRule()); 
            }
            pushFollow(FOLLOW_ruleBSImport_in_entryRuleBSImport229);
            iv_ruleBSImport=ruleBSImport();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBSImport; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBSImport239); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBSImport"


    // $ANTLR start "ruleBSImport"
    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:155:1: ruleBSImport returns [EObject current=null] : (otherlv_0= Import ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) otherlv_2= Semicolon ) ;
    public final EObject ruleBSImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:158:28: ( (otherlv_0= Import ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) otherlv_2= Semicolon ) )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:159:1: (otherlv_0= Import ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) otherlv_2= Semicolon )
            {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:159:1: (otherlv_0= Import ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) otherlv_2= Semicolon )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:160:2: otherlv_0= Import ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) otherlv_2= Semicolon
            {
            otherlv_0=(Token)match(input,Import,FOLLOW_Import_in_ruleBSImport277); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getBSImportAccess().getImportKeyword_0());
                  
            }
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:164:1: ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:165:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:165:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:166:3: lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getBSImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_ruleBSImport297);
            lv_importedNamespace_1_0=ruleQualifiedNameWithWildcard();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getBSImportRule());
              	        }
                     		set(
                     			current, 
                     			"importedNamespace",
                      		lv_importedNamespace_1_0, 
                      		"QualifiedNameWithWildcard");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_ruleBSImport310); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getBSImportAccess().getSemicolonKeyword_2());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBSImport"


    // $ANTLR start "entryRuleQualifiedNameWithWildcard"
    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:195:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:196:1: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:197:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameWithWildcardRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard345);
            iv_ruleQualifiedNameWithWildcard=ruleQualifiedNameWithWildcard();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedNameWithWildcard.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard356); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedNameWithWildcard"


    // $ANTLR start "ruleQualifiedNameWithWildcard"
    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:204:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= FullStopAsterisk )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;


         enterRule(); 
            
        try {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:208:6: ( (this_QualifiedName_0= ruleQualifiedName (kw= FullStopAsterisk )? ) )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:209:1: (this_QualifiedName_0= ruleQualifiedName (kw= FullStopAsterisk )? )
            {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:209:1: (this_QualifiedName_0= ruleQualifiedName (kw= FullStopAsterisk )? )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:210:5: this_QualifiedName_0= ruleQualifiedName (kw= FullStopAsterisk )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildcard403);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_QualifiedName_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:220:1: (kw= FullStopAsterisk )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==FullStopAsterisk) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:221:2: kw= FullStopAsterisk
                    {
                    kw=(Token)match(input,FullStopAsterisk,FOLLOW_FullStopAsterisk_in_ruleQualifiedNameWithWildcard422); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); 
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule();
                  
            }
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedNameWithWildcard"


    // $ANTLR start "entryRuleQualifiedName"
    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:234:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:235:1: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:236:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName464);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName475); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:243:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= FullStop this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:247:6: ( (this_ID_0= RULE_ID (kw= FullStop this_ID_2= RULE_ID )* ) )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:248:1: (this_ID_0= RULE_ID (kw= FullStop this_ID_2= RULE_ID )* )
            {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:248:1: (this_ID_0= RULE_ID (kw= FullStop this_ID_2= RULE_ID )* )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:248:6: this_ID_0= RULE_ID (kw= FullStop this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName515); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:255:1: (kw= FullStop this_ID_2= RULE_ID )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==FullStop) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:256:2: kw= FullStop this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,FullStop,FOLLOW_FullStop_in_ruleQualifiedName534); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName549); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule();
                  
            }
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleBSClass"
    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:276:1: entryRuleBSClass returns [EObject current=null] : iv_ruleBSClass= ruleBSClass EOF ;
    public final EObject entryRuleBSClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBSClass = null;


        try {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:277:2: (iv_ruleBSClass= ruleBSClass EOF )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:278:2: iv_ruleBSClass= ruleBSClass EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBSClassRule()); 
            }
            pushFollow(FOLLOW_ruleBSClass_in_entryRuleBSClass595);
            iv_ruleBSClass=ruleBSClass();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBSClass; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBSClass605); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBSClass"


    // $ANTLR start "ruleBSClass"
    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:285:1: ruleBSClass returns [EObject current=null] : (otherlv_0= Class ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= Colon ( ( ruleQualifiedName ) ) )? otherlv_4= LeftCurlyBracket ( (lv_members_5_0= ruleBSMember ) )* otherlv_6= RightCurlyBracket ) ;
    public final EObject ruleBSClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_members_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:288:28: ( (otherlv_0= Class ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= Colon ( ( ruleQualifiedName ) ) )? otherlv_4= LeftCurlyBracket ( (lv_members_5_0= ruleBSMember ) )* otherlv_6= RightCurlyBracket ) )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:289:1: (otherlv_0= Class ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= Colon ( ( ruleQualifiedName ) ) )? otherlv_4= LeftCurlyBracket ( (lv_members_5_0= ruleBSMember ) )* otherlv_6= RightCurlyBracket )
            {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:289:1: (otherlv_0= Class ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= Colon ( ( ruleQualifiedName ) ) )? otherlv_4= LeftCurlyBracket ( (lv_members_5_0= ruleBSMember ) )* otherlv_6= RightCurlyBracket )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:290:2: otherlv_0= Class ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= Colon ( ( ruleQualifiedName ) ) )? otherlv_4= LeftCurlyBracket ( (lv_members_5_0= ruleBSMember ) )* otherlv_6= RightCurlyBracket
            {
            otherlv_0=(Token)match(input,Class,FOLLOW_Class_in_ruleBSClass643); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getBSClassAccess().getClassKeyword_0());
                  
            }
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:294:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:295:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:295:1: (lv_name_1_0= RULE_ID )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:296:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBSClass659); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getBSClassAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getBSClassRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:312:2: (otherlv_2= Colon ( ( ruleQualifiedName ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==Colon) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:313:2: otherlv_2= Colon ( ( ruleQualifiedName ) )
                    {
                    otherlv_2=(Token)match(input,Colon,FOLLOW_Colon_in_ruleBSClass678); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getBSClassAccess().getColonKeyword_2_0());
                          
                    }
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:317:1: ( ( ruleQualifiedName ) )
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:318:1: ( ruleQualifiedName )
                    {
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:318:1: ( ruleQualifiedName )
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:319:3: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getBSClassRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getBSClassAccess().getSuperclassBSClassCrossReference_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleBSClass700);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,LeftCurlyBracket,FOLLOW_LeftCurlyBracket_in_ruleBSClass715); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getBSClassAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:337:1: ( (lv_members_5_0= ruleBSMember ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:338:1: (lv_members_5_0= ruleBSMember )
            	    {
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:338:1: (lv_members_5_0= ruleBSMember )
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:339:3: lv_members_5_0= ruleBSMember
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getBSClassAccess().getMembersBSMemberParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleBSMember_in_ruleBSClass735);
            	    lv_members_5_0=ruleBSMember();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getBSClassRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"members",
            	              		lv_members_5_0, 
            	              		"BSMember");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_6=(Token)match(input,RightCurlyBracket,FOLLOW_RightCurlyBracket_in_ruleBSClass749); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getBSClassAccess().getRightCurlyBracketKeyword_5());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBSClass"


    // $ANTLR start "entryRuleBSMember"
    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:368:1: entryRuleBSMember returns [EObject current=null] : iv_ruleBSMember= ruleBSMember EOF ;
    public final EObject entryRuleBSMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBSMember = null;


        try {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:369:2: (iv_ruleBSMember= ruleBSMember EOF )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:370:2: iv_ruleBSMember= ruleBSMember EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBSMemberRule()); 
            }
            pushFollow(FOLLOW_ruleBSMember_in_entryRuleBSMember783);
            iv_ruleBSMember=ruleBSMember();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBSMember; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBSMember793); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBSMember"


    // $ANTLR start "ruleBSMember"
    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:377:1: ruleBSMember returns [EObject current=null] : (this_BSField_0= ruleBSField | this_BSMethod_1= ruleBSMethod ) ;
    public final EObject ruleBSMember() throws RecognitionException {
        EObject current = null;

        EObject this_BSField_0 = null;

        EObject this_BSMethod_1 = null;


         enterRule(); 
            
        try {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:380:28: ( (this_BSField_0= ruleBSField | this_BSMethod_1= ruleBSMethod ) )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:381:1: (this_BSField_0= ruleBSField | this_BSMethod_1= ruleBSMethod )
            {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:381:1: (this_BSField_0= ruleBSField | this_BSMethod_1= ruleBSMethod )
            int alt8=2;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:382:5: this_BSField_0= ruleBSField
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBSMemberAccess().getBSFieldParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBSField_in_ruleBSMember840);
                    this_BSField_0=ruleBSField();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_BSField_0;
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:392:5: this_BSMethod_1= ruleBSMethod
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBSMemberAccess().getBSMethodParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBSMethod_in_ruleBSMember867);
                    this_BSMethod_1=ruleBSMethod();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_BSMethod_1;
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBSMember"


    // $ANTLR start "entryRuleBSField"
    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:408:1: entryRuleBSField returns [EObject current=null] : iv_ruleBSField= ruleBSField EOF ;
    public final EObject entryRuleBSField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBSField = null;


        try {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:409:2: (iv_ruleBSField= ruleBSField EOF )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:410:2: iv_ruleBSField= ruleBSField EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBSFieldRule()); 
            }
            pushFollow(FOLLOW_ruleBSField_in_entryRuleBSField901);
            iv_ruleBSField=ruleBSField();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBSField; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBSField911); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBSField"


    // $ANTLR start "ruleBSField"
    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:417:1: ruleBSField returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_isArray_2_0= LeftSquareBracket ) ) otherlv_3= RightSquareBracket )? otherlv_4= Semicolon ) ;
    public final EObject ruleBSField() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token lv_isArray_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:420:28: ( ( ( ( ruleQualifiedName ) ) ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_isArray_2_0= LeftSquareBracket ) ) otherlv_3= RightSquareBracket )? otherlv_4= Semicolon ) )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:421:1: ( ( ( ruleQualifiedName ) ) ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_isArray_2_0= LeftSquareBracket ) ) otherlv_3= RightSquareBracket )? otherlv_4= Semicolon )
            {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:421:1: ( ( ( ruleQualifiedName ) ) ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_isArray_2_0= LeftSquareBracket ) ) otherlv_3= RightSquareBracket )? otherlv_4= Semicolon )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:421:2: ( ( ruleQualifiedName ) ) ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_isArray_2_0= LeftSquareBracket ) ) otherlv_3= RightSquareBracket )? otherlv_4= Semicolon
            {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:421:2: ( ( ruleQualifiedName ) )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:422:1: ( ruleQualifiedName )
            {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:422:1: ( ruleQualifiedName )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:423:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getBSFieldRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getBSFieldAccess().getTypeBSClassCrossReference_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleBSField959);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:436:2: ( (lv_name_1_0= RULE_ID ) )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:437:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:437:1: (lv_name_1_0= RULE_ID )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:438:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBSField976); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getBSFieldAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getBSFieldRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:454:2: ( ( (lv_isArray_2_0= LeftSquareBracket ) ) otherlv_3= RightSquareBracket )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==LeftSquareBracket) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:454:3: ( (lv_isArray_2_0= LeftSquareBracket ) ) otherlv_3= RightSquareBracket
                    {
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:454:3: ( (lv_isArray_2_0= LeftSquareBracket ) )
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:455:1: (lv_isArray_2_0= LeftSquareBracket )
                    {
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:455:1: (lv_isArray_2_0= LeftSquareBracket )
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:456:3: lv_isArray_2_0= LeftSquareBracket
                    {
                    lv_isArray_2_0=(Token)match(input,LeftSquareBracket,FOLLOW_LeftSquareBracket_in_ruleBSField1001); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_isArray_2_0, grammarAccess.getBSFieldAccess().getIsArrayLeftSquareBracketKeyword_2_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getBSFieldRule());
                      	        }
                             		setWithLastConsumed(current, "isArray", true, "[");
                      	    
                    }

                    }


                    }

                    otherlv_3=(Token)match(input,RightSquareBracket,FOLLOW_RightSquareBracket_in_ruleBSField1025); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getBSFieldAccess().getRightSquareBracketKeyword_2_1());
                          
                    }

                    }
                    break;

            }

            otherlv_4=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_ruleBSField1039); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getBSFieldAccess().getSemicolonKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBSField"


    // $ANTLR start "entryRuleBSMethod"
    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:488:1: entryRuleBSMethod returns [EObject current=null] : iv_ruleBSMethod= ruleBSMethod EOF ;
    public final EObject entryRuleBSMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBSMethod = null;


        try {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:489:2: (iv_ruleBSMethod= ruleBSMethod EOF )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:490:2: iv_ruleBSMethod= ruleBSMethod EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBSMethodRule()); 
            }
            pushFollow(FOLLOW_ruleBSMethod_in_entryRuleBSMethod1073);
            iv_ruleBSMethod=ruleBSMethod();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBSMethod; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBSMethod1083); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBSMethod"


    // $ANTLR start "ruleBSMethod"
    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:497:1: ruleBSMethod returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= LeftParenthesis ( ( (lv_params_3_0= ruleBSParameter ) ) (otherlv_4= Comma ( (lv_params_5_0= ruleBSParameter ) ) )* )? otherlv_6= RightParenthesis ( (lv_body_7_0= ruleBSMethodBody ) ) ) ;
    public final EObject ruleBSMethod() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_params_3_0 = null;

        EObject lv_params_5_0 = null;

        EObject lv_body_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:500:28: ( ( ( ( ruleQualifiedName ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= LeftParenthesis ( ( (lv_params_3_0= ruleBSParameter ) ) (otherlv_4= Comma ( (lv_params_5_0= ruleBSParameter ) ) )* )? otherlv_6= RightParenthesis ( (lv_body_7_0= ruleBSMethodBody ) ) ) )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:501:1: ( ( ( ruleQualifiedName ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= LeftParenthesis ( ( (lv_params_3_0= ruleBSParameter ) ) (otherlv_4= Comma ( (lv_params_5_0= ruleBSParameter ) ) )* )? otherlv_6= RightParenthesis ( (lv_body_7_0= ruleBSMethodBody ) ) )
            {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:501:1: ( ( ( ruleQualifiedName ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= LeftParenthesis ( ( (lv_params_3_0= ruleBSParameter ) ) (otherlv_4= Comma ( (lv_params_5_0= ruleBSParameter ) ) )* )? otherlv_6= RightParenthesis ( (lv_body_7_0= ruleBSMethodBody ) ) )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:501:2: ( ( ruleQualifiedName ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= LeftParenthesis ( ( (lv_params_3_0= ruleBSParameter ) ) (otherlv_4= Comma ( (lv_params_5_0= ruleBSParameter ) ) )* )? otherlv_6= RightParenthesis ( (lv_body_7_0= ruleBSMethodBody ) )
            {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:501:2: ( ( ruleQualifiedName ) )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:502:1: ( ruleQualifiedName )
            {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:502:1: ( ruleQualifiedName )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:503:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getBSMethodRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getBSMethodAccess().getTypeBSClassCrossReference_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleBSMethod1131);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:516:2: ( (lv_name_1_0= RULE_ID ) )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:517:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:517:1: (lv_name_1_0= RULE_ID )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:518:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBSMethod1148); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getBSMethodAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getBSMethodRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,LeftParenthesis,FOLLOW_LeftParenthesis_in_ruleBSMethod1166); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getBSMethodAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:539:1: ( ( (lv_params_3_0= ruleBSParameter ) ) (otherlv_4= Comma ( (lv_params_5_0= ruleBSParameter ) ) )* )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:539:2: ( (lv_params_3_0= ruleBSParameter ) ) (otherlv_4= Comma ( (lv_params_5_0= ruleBSParameter ) ) )*
                    {
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:539:2: ( (lv_params_3_0= ruleBSParameter ) )
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:540:1: (lv_params_3_0= ruleBSParameter )
                    {
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:540:1: (lv_params_3_0= ruleBSParameter )
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:541:3: lv_params_3_0= ruleBSParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getBSMethodAccess().getParamsBSParameterParserRuleCall_3_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBSParameter_in_ruleBSMethod1187);
                    lv_params_3_0=ruleBSParameter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getBSMethodRule());
                      	        }
                             		add(
                             			current, 
                             			"params",
                              		lv_params_3_0, 
                              		"BSParameter");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:557:2: (otherlv_4= Comma ( (lv_params_5_0= ruleBSParameter ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==Comma) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:558:2: otherlv_4= Comma ( (lv_params_5_0= ruleBSParameter ) )
                    	    {
                    	    otherlv_4=(Token)match(input,Comma,FOLLOW_Comma_in_ruleBSMethod1201); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getBSMethodAccess().getCommaKeyword_3_1_0());
                    	          
                    	    }
                    	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:562:1: ( (lv_params_5_0= ruleBSParameter ) )
                    	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:563:1: (lv_params_5_0= ruleBSParameter )
                    	    {
                    	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:563:1: (lv_params_5_0= ruleBSParameter )
                    	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:564:3: lv_params_5_0= ruleBSParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getBSMethodAccess().getParamsBSParameterParserRuleCall_3_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleBSParameter_in_ruleBSMethod1221);
                    	    lv_params_5_0=ruleBSParameter();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getBSMethodRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"params",
                    	              		lv_params_5_0, 
                    	              		"BSParameter");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,RightParenthesis,FOLLOW_RightParenthesis_in_ruleBSMethod1238); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getBSMethodAccess().getRightParenthesisKeyword_4());
                  
            }
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:585:1: ( (lv_body_7_0= ruleBSMethodBody ) )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:586:1: (lv_body_7_0= ruleBSMethodBody )
            {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:586:1: (lv_body_7_0= ruleBSMethodBody )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:587:3: lv_body_7_0= ruleBSMethodBody
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getBSMethodAccess().getBodyBSMethodBodyParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleBSMethodBody_in_ruleBSMethod1258);
            lv_body_7_0=ruleBSMethodBody();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getBSMethodRule());
              	        }
                     		set(
                     			current, 
                     			"body",
                      		lv_body_7_0, 
                      		"BSMethodBody");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBSMethod"


    // $ANTLR start "entryRuleBSParameter"
    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:611:1: entryRuleBSParameter returns [EObject current=null] : iv_ruleBSParameter= ruleBSParameter EOF ;
    public final EObject entryRuleBSParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBSParameter = null;


        try {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:612:2: (iv_ruleBSParameter= ruleBSParameter EOF )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:613:2: iv_ruleBSParameter= ruleBSParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBSParameterRule()); 
            }
            pushFollow(FOLLOW_ruleBSParameter_in_entryRuleBSParameter1293);
            iv_ruleBSParameter=ruleBSParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBSParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBSParameter1303); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBSParameter"


    // $ANTLR start "ruleBSParameter"
    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:620:1: ruleBSParameter returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_isArray_2_0= LeftSquareBracket ) ) otherlv_3= RightSquareBracket )? ) ;
    public final EObject ruleBSParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token lv_isArray_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:623:28: ( ( ( ( ruleQualifiedName ) ) ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_isArray_2_0= LeftSquareBracket ) ) otherlv_3= RightSquareBracket )? ) )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:624:1: ( ( ( ruleQualifiedName ) ) ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_isArray_2_0= LeftSquareBracket ) ) otherlv_3= RightSquareBracket )? )
            {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:624:1: ( ( ( ruleQualifiedName ) ) ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_isArray_2_0= LeftSquareBracket ) ) otherlv_3= RightSquareBracket )? )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:624:2: ( ( ruleQualifiedName ) ) ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_isArray_2_0= LeftSquareBracket ) ) otherlv_3= RightSquareBracket )?
            {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:624:2: ( ( ruleQualifiedName ) )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:625:1: ( ruleQualifiedName )
            {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:625:1: ( ruleQualifiedName )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:626:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getBSParameterRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getBSParameterAccess().getTypeBSClassCrossReference_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleBSParameter1351);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:639:2: ( (lv_name_1_0= RULE_ID ) )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:640:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:640:1: (lv_name_1_0= RULE_ID )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:641:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBSParameter1368); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getBSParameterAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getBSParameterRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:657:2: ( ( (lv_isArray_2_0= LeftSquareBracket ) ) otherlv_3= RightSquareBracket )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==LeftSquareBracket) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:657:3: ( (lv_isArray_2_0= LeftSquareBracket ) ) otherlv_3= RightSquareBracket
                    {
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:657:3: ( (lv_isArray_2_0= LeftSquareBracket ) )
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:658:1: (lv_isArray_2_0= LeftSquareBracket )
                    {
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:658:1: (lv_isArray_2_0= LeftSquareBracket )
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:659:3: lv_isArray_2_0= LeftSquareBracket
                    {
                    lv_isArray_2_0=(Token)match(input,LeftSquareBracket,FOLLOW_LeftSquareBracket_in_ruleBSParameter1393); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_isArray_2_0, grammarAccess.getBSParameterAccess().getIsArrayLeftSquareBracketKeyword_2_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getBSParameterRule());
                      	        }
                             		setWithLastConsumed(current, "isArray", true, "[");
                      	    
                    }

                    }


                    }

                    otherlv_3=(Token)match(input,RightSquareBracket,FOLLOW_RightSquareBracket_in_ruleBSParameter1417); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getBSParameterAccess().getRightSquareBracketKeyword_2_1());
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBSParameter"


    // $ANTLR start "entryRuleBSMethodBody"
    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:686:1: entryRuleBSMethodBody returns [EObject current=null] : iv_ruleBSMethodBody= ruleBSMethodBody EOF ;
    public final EObject entryRuleBSMethodBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBSMethodBody = null;


        try {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:687:2: (iv_ruleBSMethodBody= ruleBSMethodBody EOF )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:688:2: iv_ruleBSMethodBody= ruleBSMethodBody EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBSMethodBodyRule()); 
            }
            pushFollow(FOLLOW_ruleBSMethodBody_in_entryRuleBSMethodBody1453);
            iv_ruleBSMethodBody=ruleBSMethodBody();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBSMethodBody; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBSMethodBody1463); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBSMethodBody"


    // $ANTLR start "ruleBSMethodBody"
    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:695:1: ruleBSMethodBody returns [EObject current=null] : ( () otherlv_1= LeftCurlyBracket ( (lv_statements_2_0= ruleBSStatement ) )* otherlv_3= RightCurlyBracket ) ;
    public final EObject ruleBSMethodBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_statements_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:698:28: ( ( () otherlv_1= LeftCurlyBracket ( (lv_statements_2_0= ruleBSStatement ) )* otherlv_3= RightCurlyBracket ) )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:699:1: ( () otherlv_1= LeftCurlyBracket ( (lv_statements_2_0= ruleBSStatement ) )* otherlv_3= RightCurlyBracket )
            {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:699:1: ( () otherlv_1= LeftCurlyBracket ( (lv_statements_2_0= ruleBSStatement ) )* otherlv_3= RightCurlyBracket )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:699:2: () otherlv_1= LeftCurlyBracket ( (lv_statements_2_0= ruleBSStatement ) )* otherlv_3= RightCurlyBracket
            {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:699:2: ()
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:700:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getBSMethodBodyAccess().getBSMethodBodyAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,LeftCurlyBracket,FOLLOW_LeftCurlyBracket_in_ruleBSMethodBody1510); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getBSMethodBodyAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:710:1: ( (lv_statements_2_0= ruleBSStatement ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==Continue||LA13_0==Client||(LA13_0>=Parent && LA13_0<=Return)||(LA13_0>=Switch && LA13_0<=Break)||(LA13_0>=False && LA13_0<=While)||(LA13_0>=Null && LA13_0<=True)||(LA13_0>=For && LA13_0<=New)||LA13_0==If||LA13_0==ExclamationMark||LA13_0==LeftParenthesis||LA13_0==PlusSign||LA13_0==HyphenMinus||(LA13_0>=Tilde && LA13_0<=RULE_INT)||LA13_0==RULE_STRING) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:711:1: (lv_statements_2_0= ruleBSStatement )
            	    {
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:711:1: (lv_statements_2_0= ruleBSStatement )
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:712:3: lv_statements_2_0= ruleBSStatement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getBSMethodBodyAccess().getStatementsBSStatementParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleBSStatement_in_ruleBSMethodBody1530);
            	    lv_statements_2_0=ruleBSStatement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getBSMethodBodyRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"statements",
            	              		lv_statements_2_0, 
            	              		"BSStatement");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            otherlv_3=(Token)match(input,RightCurlyBracket,FOLLOW_RightCurlyBracket_in_ruleBSMethodBody1544); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getBSMethodBodyAccess().getRightCurlyBracketKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBSMethodBody"


    // $ANTLR start "entryRuleBSStatement"
    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:741:1: entryRuleBSStatement returns [EObject current=null] : iv_ruleBSStatement= ruleBSStatement EOF ;
    public final EObject entryRuleBSStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBSStatement = null;


        try {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:742:2: (iv_ruleBSStatement= ruleBSStatement EOF )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:743:2: iv_ruleBSStatement= ruleBSStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBSStatementRule()); 
            }
            pushFollow(FOLLOW_ruleBSStatement_in_entryRuleBSStatement1578);
            iv_ruleBSStatement=ruleBSStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBSStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBSStatement1588); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBSStatement"


    // $ANTLR start "ruleBSStatement"
    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:750:1: ruleBSStatement returns [EObject current=null] : (this_BSVariableDeclaration_0= ruleBSVariableDeclaration | this_BSReturn_1= ruleBSReturn | (this_BSExpression_2= ruleBSExpression otherlv_3= Semicolon ) | this_BSIfStatement_4= ruleBSIfStatement | this_BSWhileLoop_5= ruleBSWhileLoop | this_BSForLoop_6= ruleBSForLoop | this_BSSwitchStatement_7= ruleBSSwitchStatement ) ;
    public final EObject ruleBSStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        EObject this_BSVariableDeclaration_0 = null;

        EObject this_BSReturn_1 = null;

        EObject this_BSExpression_2 = null;

        EObject this_BSIfStatement_4 = null;

        EObject this_BSWhileLoop_5 = null;

        EObject this_BSForLoop_6 = null;

        EObject this_BSSwitchStatement_7 = null;


         enterRule(); 
            
        try {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:753:28: ( (this_BSVariableDeclaration_0= ruleBSVariableDeclaration | this_BSReturn_1= ruleBSReturn | (this_BSExpression_2= ruleBSExpression otherlv_3= Semicolon ) | this_BSIfStatement_4= ruleBSIfStatement | this_BSWhileLoop_5= ruleBSWhileLoop | this_BSForLoop_6= ruleBSForLoop | this_BSSwitchStatement_7= ruleBSSwitchStatement ) )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:754:1: (this_BSVariableDeclaration_0= ruleBSVariableDeclaration | this_BSReturn_1= ruleBSReturn | (this_BSExpression_2= ruleBSExpression otherlv_3= Semicolon ) | this_BSIfStatement_4= ruleBSIfStatement | this_BSWhileLoop_5= ruleBSWhileLoop | this_BSForLoop_6= ruleBSForLoop | this_BSSwitchStatement_7= ruleBSSwitchStatement )
            {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:754:1: (this_BSVariableDeclaration_0= ruleBSVariableDeclaration | this_BSReturn_1= ruleBSReturn | (this_BSExpression_2= ruleBSExpression otherlv_3= Semicolon ) | this_BSIfStatement_4= ruleBSIfStatement | this_BSWhileLoop_5= ruleBSWhileLoop | this_BSForLoop_6= ruleBSForLoop | this_BSSwitchStatement_7= ruleBSSwitchStatement )
            int alt14=7;
            alt14 = dfa14.predict(input);
            switch (alt14) {
                case 1 :
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:755:5: this_BSVariableDeclaration_0= ruleBSVariableDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBSStatementAccess().getBSVariableDeclarationParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBSVariableDeclaration_in_ruleBSStatement1635);
                    this_BSVariableDeclaration_0=ruleBSVariableDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_BSVariableDeclaration_0;
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:765:5: this_BSReturn_1= ruleBSReturn
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBSStatementAccess().getBSReturnParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBSReturn_in_ruleBSStatement1662);
                    this_BSReturn_1=ruleBSReturn();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_BSReturn_1;
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:774:6: (this_BSExpression_2= ruleBSExpression otherlv_3= Semicolon )
                    {
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:774:6: (this_BSExpression_2= ruleBSExpression otherlv_3= Semicolon )
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:775:5: this_BSExpression_2= ruleBSExpression otherlv_3= Semicolon
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBSStatementAccess().getBSExpressionParserRuleCall_2_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBSExpression_in_ruleBSStatement1690);
                    this_BSExpression_2=ruleBSExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_BSExpression_2;
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_3=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_ruleBSStatement1702); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getBSStatementAccess().getSemicolonKeyword_2_1());
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:790:5: this_BSIfStatement_4= ruleBSIfStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBSStatementAccess().getBSIfStatementParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBSIfStatement_in_ruleBSStatement1730);
                    this_BSIfStatement_4=ruleBSIfStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_BSIfStatement_4;
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:800:5: this_BSWhileLoop_5= ruleBSWhileLoop
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBSStatementAccess().getBSWhileLoopParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBSWhileLoop_in_ruleBSStatement1757);
                    this_BSWhileLoop_5=ruleBSWhileLoop();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_BSWhileLoop_5;
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:810:5: this_BSForLoop_6= ruleBSForLoop
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBSStatementAccess().getBSForLoopParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBSForLoop_in_ruleBSStatement1784);
                    this_BSForLoop_6=ruleBSForLoop();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_BSForLoop_6;
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 7 :
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:820:5: this_BSSwitchStatement_7= ruleBSSwitchStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBSStatementAccess().getBSSwitchStatementParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBSSwitchStatement_in_ruleBSStatement1811);
                    this_BSSwitchStatement_7=ruleBSSwitchStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_BSSwitchStatement_7;
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBSStatement"


    // $ANTLR start "entryRuleBSReturn"
    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:836:1: entryRuleBSReturn returns [EObject current=null] : iv_ruleBSReturn= ruleBSReturn EOF ;
    public final EObject entryRuleBSReturn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBSReturn = null;


        try {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:837:2: (iv_ruleBSReturn= ruleBSReturn EOF )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:838:2: iv_ruleBSReturn= ruleBSReturn EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBSReturnRule()); 
            }
            pushFollow(FOLLOW_ruleBSReturn_in_entryRuleBSReturn1845);
            iv_ruleBSReturn=ruleBSReturn();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBSReturn; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBSReturn1855); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBSReturn"


    // $ANTLR start "ruleBSReturn"
    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:845:1: ruleBSReturn returns [EObject current=null] : (otherlv_0= Return ( (lv_expression_1_0= ruleBSExpression ) ) otherlv_2= Semicolon ) ;
    public final EObject ruleBSReturn() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_expression_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:848:28: ( (otherlv_0= Return ( (lv_expression_1_0= ruleBSExpression ) ) otherlv_2= Semicolon ) )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:849:1: (otherlv_0= Return ( (lv_expression_1_0= ruleBSExpression ) ) otherlv_2= Semicolon )
            {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:849:1: (otherlv_0= Return ( (lv_expression_1_0= ruleBSExpression ) ) otherlv_2= Semicolon )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:850:2: otherlv_0= Return ( (lv_expression_1_0= ruleBSExpression ) ) otherlv_2= Semicolon
            {
            otherlv_0=(Token)match(input,Return,FOLLOW_Return_in_ruleBSReturn1893); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getBSReturnAccess().getReturnKeyword_0());
                  
            }
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:854:1: ( (lv_expression_1_0= ruleBSExpression ) )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:855:1: (lv_expression_1_0= ruleBSExpression )
            {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:855:1: (lv_expression_1_0= ruleBSExpression )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:856:3: lv_expression_1_0= ruleBSExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getBSReturnAccess().getExpressionBSExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleBSExpression_in_ruleBSReturn1913);
            lv_expression_1_0=ruleBSExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getBSReturnRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_1_0, 
                      		"BSExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_ruleBSReturn1926); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getBSReturnAccess().getSemicolonKeyword_2());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBSReturn"


    // $ANTLR start "entryRuleBSVariableDeclaration"
    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:885:1: entryRuleBSVariableDeclaration returns [EObject current=null] : iv_ruleBSVariableDeclaration= ruleBSVariableDeclaration EOF ;
    public final EObject entryRuleBSVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBSVariableDeclaration = null;


        try {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:886:2: (iv_ruleBSVariableDeclaration= ruleBSVariableDeclaration EOF )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:887:2: iv_ruleBSVariableDeclaration= ruleBSVariableDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBSVariableDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleBSVariableDeclaration_in_entryRuleBSVariableDeclaration1960);
            iv_ruleBSVariableDeclaration=ruleBSVariableDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBSVariableDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBSVariableDeclaration1970); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBSVariableDeclaration"


    // $ANTLR start "ruleBSVariableDeclaration"
    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:894:1: ruleBSVariableDeclaration returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= EqualsSign ( (lv_expression_3_0= ruleBSExpression ) ) )? otherlv_4= Semicolon ) ;
    public final EObject ruleBSVariableDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_expression_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:897:28: ( ( ( ( ruleQualifiedName ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= EqualsSign ( (lv_expression_3_0= ruleBSExpression ) ) )? otherlv_4= Semicolon ) )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:898:1: ( ( ( ruleQualifiedName ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= EqualsSign ( (lv_expression_3_0= ruleBSExpression ) ) )? otherlv_4= Semicolon )
            {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:898:1: ( ( ( ruleQualifiedName ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= EqualsSign ( (lv_expression_3_0= ruleBSExpression ) ) )? otherlv_4= Semicolon )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:898:2: ( ( ruleQualifiedName ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= EqualsSign ( (lv_expression_3_0= ruleBSExpression ) ) )? otherlv_4= Semicolon
            {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:898:2: ( ( ruleQualifiedName ) )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:899:1: ( ruleQualifiedName )
            {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:899:1: ( ruleQualifiedName )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:900:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getBSVariableDeclarationRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getBSVariableDeclarationAccess().getTypeBSClassCrossReference_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleBSVariableDeclaration2018);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:913:2: ( (lv_name_1_0= RULE_ID ) )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:914:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:914:1: (lv_name_1_0= RULE_ID )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:915:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBSVariableDeclaration2035); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getBSVariableDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getBSVariableDeclarationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:931:2: (otherlv_2= EqualsSign ( (lv_expression_3_0= ruleBSExpression ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==EqualsSign) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:932:2: otherlv_2= EqualsSign ( (lv_expression_3_0= ruleBSExpression ) )
                    {
                    otherlv_2=(Token)match(input,EqualsSign,FOLLOW_EqualsSign_in_ruleBSVariableDeclaration2054); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getBSVariableDeclarationAccess().getEqualsSignKeyword_2_0());
                          
                    }
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:936:1: ( (lv_expression_3_0= ruleBSExpression ) )
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:937:1: (lv_expression_3_0= ruleBSExpression )
                    {
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:937:1: (lv_expression_3_0= ruleBSExpression )
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:938:3: lv_expression_3_0= ruleBSExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getBSVariableDeclarationAccess().getExpressionBSExpressionParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBSExpression_in_ruleBSVariableDeclaration2074);
                    lv_expression_3_0=ruleBSExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getBSVariableDeclarationRule());
                      	        }
                             		set(
                             			current, 
                             			"expression",
                              		lv_expression_3_0, 
                              		"BSExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_ruleBSVariableDeclaration2089); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getBSVariableDeclarationAccess().getSemicolonKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBSVariableDeclaration"


    // $ANTLR start "entryRuleBSIfStatement"
    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:967:1: entryRuleBSIfStatement returns [EObject current=null] : iv_ruleBSIfStatement= ruleBSIfStatement EOF ;
    public final EObject entryRuleBSIfStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBSIfStatement = null;


        try {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:968:2: (iv_ruleBSIfStatement= ruleBSIfStatement EOF )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:969:2: iv_ruleBSIfStatement= ruleBSIfStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBSIfStatementRule()); 
            }
            pushFollow(FOLLOW_ruleBSIfStatement_in_entryRuleBSIfStatement2123);
            iv_ruleBSIfStatement=ruleBSIfStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBSIfStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBSIfStatement2133); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBSIfStatement"


    // $ANTLR start "ruleBSIfStatement"
    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:976:1: ruleBSIfStatement returns [EObject current=null] : (otherlv_0= If otherlv_1= LeftParenthesis ( (lv_expression_2_0= ruleBSExpression ) ) otherlv_3= RightParenthesis ( (lv_thenBlock_4_0= ruleBSIfBlock ) ) ( ( ( Else )=>otherlv_5= Else ) ( (lv_elseBlock_6_0= ruleBSIfBlock ) ) )? ) ;
    public final EObject ruleBSIfStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_expression_2_0 = null;

        EObject lv_thenBlock_4_0 = null;

        EObject lv_elseBlock_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:979:28: ( (otherlv_0= If otherlv_1= LeftParenthesis ( (lv_expression_2_0= ruleBSExpression ) ) otherlv_3= RightParenthesis ( (lv_thenBlock_4_0= ruleBSIfBlock ) ) ( ( ( Else )=>otherlv_5= Else ) ( (lv_elseBlock_6_0= ruleBSIfBlock ) ) )? ) )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:980:1: (otherlv_0= If otherlv_1= LeftParenthesis ( (lv_expression_2_0= ruleBSExpression ) ) otherlv_3= RightParenthesis ( (lv_thenBlock_4_0= ruleBSIfBlock ) ) ( ( ( Else )=>otherlv_5= Else ) ( (lv_elseBlock_6_0= ruleBSIfBlock ) ) )? )
            {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:980:1: (otherlv_0= If otherlv_1= LeftParenthesis ( (lv_expression_2_0= ruleBSExpression ) ) otherlv_3= RightParenthesis ( (lv_thenBlock_4_0= ruleBSIfBlock ) ) ( ( ( Else )=>otherlv_5= Else ) ( (lv_elseBlock_6_0= ruleBSIfBlock ) ) )? )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:981:2: otherlv_0= If otherlv_1= LeftParenthesis ( (lv_expression_2_0= ruleBSExpression ) ) otherlv_3= RightParenthesis ( (lv_thenBlock_4_0= ruleBSIfBlock ) ) ( ( ( Else )=>otherlv_5= Else ) ( (lv_elseBlock_6_0= ruleBSIfBlock ) ) )?
            {
            otherlv_0=(Token)match(input,If,FOLLOW_If_in_ruleBSIfStatement2171); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getBSIfStatementAccess().getIfKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,LeftParenthesis,FOLLOW_LeftParenthesis_in_ruleBSIfStatement2183); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getBSIfStatementAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:990:1: ( (lv_expression_2_0= ruleBSExpression ) )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:991:1: (lv_expression_2_0= ruleBSExpression )
            {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:991:1: (lv_expression_2_0= ruleBSExpression )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:992:3: lv_expression_2_0= ruleBSExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getBSIfStatementAccess().getExpressionBSExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleBSExpression_in_ruleBSIfStatement2203);
            lv_expression_2_0=ruleBSExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getBSIfStatementRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_2_0, 
                      		"BSExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,RightParenthesis,FOLLOW_RightParenthesis_in_ruleBSIfStatement2216); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getBSIfStatementAccess().getRightParenthesisKeyword_3());
                  
            }
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1013:1: ( (lv_thenBlock_4_0= ruleBSIfBlock ) )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1014:1: (lv_thenBlock_4_0= ruleBSIfBlock )
            {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1014:1: (lv_thenBlock_4_0= ruleBSIfBlock )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1015:3: lv_thenBlock_4_0= ruleBSIfBlock
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getBSIfStatementAccess().getThenBlockBSIfBlockParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleBSIfBlock_in_ruleBSIfStatement2236);
            lv_thenBlock_4_0=ruleBSIfBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getBSIfStatementRule());
              	        }
                     		set(
                     			current, 
                     			"thenBlock",
                      		lv_thenBlock_4_0, 
                      		"BSIfBlock");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1031:2: ( ( ( Else )=>otherlv_5= Else ) ( (lv_elseBlock_6_0= ruleBSIfBlock ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==Else) ) {
                int LA16_1 = input.LA(2);

                if ( (synpred1_InternalBlorqueScriptParser()) ) {
                    alt16=1;
                }
            }
            switch (alt16) {
                case 1 :
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1031:3: ( ( Else )=>otherlv_5= Else ) ( (lv_elseBlock_6_0= ruleBSIfBlock ) )
                    {
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1031:3: ( ( Else )=>otherlv_5= Else )
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1031:4: ( Else )=>otherlv_5= Else
                    {
                    otherlv_5=(Token)match(input,Else,FOLLOW_Else_in_ruleBSIfStatement2257); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getBSIfStatementAccess().getElseKeyword_5_0());
                          
                    }

                    }

                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1038:2: ( (lv_elseBlock_6_0= ruleBSIfBlock ) )
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1039:1: (lv_elseBlock_6_0= ruleBSIfBlock )
                    {
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1039:1: (lv_elseBlock_6_0= ruleBSIfBlock )
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1040:3: lv_elseBlock_6_0= ruleBSIfBlock
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getBSIfStatementAccess().getElseBlockBSIfBlockParserRuleCall_5_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBSIfBlock_in_ruleBSIfStatement2278);
                    lv_elseBlock_6_0=ruleBSIfBlock();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getBSIfStatementRule());
                      	        }
                             		set(
                             			current, 
                             			"elseBlock",
                              		lv_elseBlock_6_0, 
                              		"BSIfBlock");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBSIfStatement"


    // $ANTLR start "entryRuleBSWhileLoop"
    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1064:1: entryRuleBSWhileLoop returns [EObject current=null] : iv_ruleBSWhileLoop= ruleBSWhileLoop EOF ;
    public final EObject entryRuleBSWhileLoop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBSWhileLoop = null;


        try {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1065:2: (iv_ruleBSWhileLoop= ruleBSWhileLoop EOF )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1066:2: iv_ruleBSWhileLoop= ruleBSWhileLoop EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBSWhileLoopRule()); 
            }
            pushFollow(FOLLOW_ruleBSWhileLoop_in_entryRuleBSWhileLoop2315);
            iv_ruleBSWhileLoop=ruleBSWhileLoop();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBSWhileLoop; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBSWhileLoop2325); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBSWhileLoop"


    // $ANTLR start "ruleBSWhileLoop"
    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1073:1: ruleBSWhileLoop returns [EObject current=null] : (otherlv_0= While otherlv_1= LeftParenthesis ( (lv_expression_2_0= ruleBSExpression ) ) otherlv_3= RightParenthesis ( (lv_block_4_0= ruleBSLoopBlock ) ) ) ;
    public final EObject ruleBSWhileLoop() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_expression_2_0 = null;

        EObject lv_block_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1076:28: ( (otherlv_0= While otherlv_1= LeftParenthesis ( (lv_expression_2_0= ruleBSExpression ) ) otherlv_3= RightParenthesis ( (lv_block_4_0= ruleBSLoopBlock ) ) ) )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1077:1: (otherlv_0= While otherlv_1= LeftParenthesis ( (lv_expression_2_0= ruleBSExpression ) ) otherlv_3= RightParenthesis ( (lv_block_4_0= ruleBSLoopBlock ) ) )
            {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1077:1: (otherlv_0= While otherlv_1= LeftParenthesis ( (lv_expression_2_0= ruleBSExpression ) ) otherlv_3= RightParenthesis ( (lv_block_4_0= ruleBSLoopBlock ) ) )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1078:2: otherlv_0= While otherlv_1= LeftParenthesis ( (lv_expression_2_0= ruleBSExpression ) ) otherlv_3= RightParenthesis ( (lv_block_4_0= ruleBSLoopBlock ) )
            {
            otherlv_0=(Token)match(input,While,FOLLOW_While_in_ruleBSWhileLoop2363); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getBSWhileLoopAccess().getWhileKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,LeftParenthesis,FOLLOW_LeftParenthesis_in_ruleBSWhileLoop2375); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getBSWhileLoopAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1087:1: ( (lv_expression_2_0= ruleBSExpression ) )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1088:1: (lv_expression_2_0= ruleBSExpression )
            {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1088:1: (lv_expression_2_0= ruleBSExpression )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1089:3: lv_expression_2_0= ruleBSExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getBSWhileLoopAccess().getExpressionBSExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleBSExpression_in_ruleBSWhileLoop2395);
            lv_expression_2_0=ruleBSExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getBSWhileLoopRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_2_0, 
                      		"BSExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,RightParenthesis,FOLLOW_RightParenthesis_in_ruleBSWhileLoop2408); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getBSWhileLoopAccess().getRightParenthesisKeyword_3());
                  
            }
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1110:1: ( (lv_block_4_0= ruleBSLoopBlock ) )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1111:1: (lv_block_4_0= ruleBSLoopBlock )
            {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1111:1: (lv_block_4_0= ruleBSLoopBlock )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1112:3: lv_block_4_0= ruleBSLoopBlock
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getBSWhileLoopAccess().getBlockBSLoopBlockParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleBSLoopBlock_in_ruleBSWhileLoop2428);
            lv_block_4_0=ruleBSLoopBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getBSWhileLoopRule());
              	        }
                     		set(
                     			current, 
                     			"block",
                      		lv_block_4_0, 
                      		"BSLoopBlock");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBSWhileLoop"


    // $ANTLR start "entryRuleBSForLoop"
    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1136:1: entryRuleBSForLoop returns [EObject current=null] : iv_ruleBSForLoop= ruleBSForLoop EOF ;
    public final EObject entryRuleBSForLoop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBSForLoop = null;


        try {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1137:2: (iv_ruleBSForLoop= ruleBSForLoop EOF )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1138:2: iv_ruleBSForLoop= ruleBSForLoop EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBSForLoopRule()); 
            }
            pushFollow(FOLLOW_ruleBSForLoop_in_entryRuleBSForLoop2463);
            iv_ruleBSForLoop=ruleBSForLoop();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBSForLoop; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBSForLoop2473); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBSForLoop"


    // $ANTLR start "ruleBSForLoop"
    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1145:1: ruleBSForLoop returns [EObject current=null] : (otherlv_0= For otherlv_1= LeftParenthesis ( (lv_left_2_0= ruleBSExpression ) ) otherlv_3= Semicolon ( (lv_middle_4_0= ruleBSExpression ) ) otherlv_5= Semicolon ( (lv_right_6_0= ruleBSExpression ) ) otherlv_7= RightParenthesis ( (lv_block_8_0= ruleBSLoopBlock ) ) ) ;
    public final EObject ruleBSForLoop() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_left_2_0 = null;

        EObject lv_middle_4_0 = null;

        EObject lv_right_6_0 = null;

        EObject lv_block_8_0 = null;


         enterRule(); 
            
        try {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1148:28: ( (otherlv_0= For otherlv_1= LeftParenthesis ( (lv_left_2_0= ruleBSExpression ) ) otherlv_3= Semicolon ( (lv_middle_4_0= ruleBSExpression ) ) otherlv_5= Semicolon ( (lv_right_6_0= ruleBSExpression ) ) otherlv_7= RightParenthesis ( (lv_block_8_0= ruleBSLoopBlock ) ) ) )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1149:1: (otherlv_0= For otherlv_1= LeftParenthesis ( (lv_left_2_0= ruleBSExpression ) ) otherlv_3= Semicolon ( (lv_middle_4_0= ruleBSExpression ) ) otherlv_5= Semicolon ( (lv_right_6_0= ruleBSExpression ) ) otherlv_7= RightParenthesis ( (lv_block_8_0= ruleBSLoopBlock ) ) )
            {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1149:1: (otherlv_0= For otherlv_1= LeftParenthesis ( (lv_left_2_0= ruleBSExpression ) ) otherlv_3= Semicolon ( (lv_middle_4_0= ruleBSExpression ) ) otherlv_5= Semicolon ( (lv_right_6_0= ruleBSExpression ) ) otherlv_7= RightParenthesis ( (lv_block_8_0= ruleBSLoopBlock ) ) )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1150:2: otherlv_0= For otherlv_1= LeftParenthesis ( (lv_left_2_0= ruleBSExpression ) ) otherlv_3= Semicolon ( (lv_middle_4_0= ruleBSExpression ) ) otherlv_5= Semicolon ( (lv_right_6_0= ruleBSExpression ) ) otherlv_7= RightParenthesis ( (lv_block_8_0= ruleBSLoopBlock ) )
            {
            otherlv_0=(Token)match(input,For,FOLLOW_For_in_ruleBSForLoop2511); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getBSForLoopAccess().getForKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,LeftParenthesis,FOLLOW_LeftParenthesis_in_ruleBSForLoop2523); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getBSForLoopAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1159:1: ( (lv_left_2_0= ruleBSExpression ) )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1160:1: (lv_left_2_0= ruleBSExpression )
            {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1160:1: (lv_left_2_0= ruleBSExpression )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1161:3: lv_left_2_0= ruleBSExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getBSForLoopAccess().getLeftBSExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleBSExpression_in_ruleBSForLoop2543);
            lv_left_2_0=ruleBSExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getBSForLoopRule());
              	        }
                     		set(
                     			current, 
                     			"left",
                      		lv_left_2_0, 
                      		"BSExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_ruleBSForLoop2556); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getBSForLoopAccess().getSemicolonKeyword_3());
                  
            }
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1182:1: ( (lv_middle_4_0= ruleBSExpression ) )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1183:1: (lv_middle_4_0= ruleBSExpression )
            {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1183:1: (lv_middle_4_0= ruleBSExpression )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1184:3: lv_middle_4_0= ruleBSExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getBSForLoopAccess().getMiddleBSExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleBSExpression_in_ruleBSForLoop2576);
            lv_middle_4_0=ruleBSExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getBSForLoopRule());
              	        }
                     		set(
                     			current, 
                     			"middle",
                      		lv_middle_4_0, 
                      		"BSExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_ruleBSForLoop2589); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getBSForLoopAccess().getSemicolonKeyword_5());
                  
            }
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1205:1: ( (lv_right_6_0= ruleBSExpression ) )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1206:1: (lv_right_6_0= ruleBSExpression )
            {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1206:1: (lv_right_6_0= ruleBSExpression )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1207:3: lv_right_6_0= ruleBSExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getBSForLoopAccess().getRightBSExpressionParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleBSExpression_in_ruleBSForLoop2609);
            lv_right_6_0=ruleBSExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getBSForLoopRule());
              	        }
                     		set(
                     			current, 
                     			"right",
                      		lv_right_6_0, 
                      		"BSExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_7=(Token)match(input,RightParenthesis,FOLLOW_RightParenthesis_in_ruleBSForLoop2622); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getBSForLoopAccess().getRightParenthesisKeyword_7());
                  
            }
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1228:1: ( (lv_block_8_0= ruleBSLoopBlock ) )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1229:1: (lv_block_8_0= ruleBSLoopBlock )
            {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1229:1: (lv_block_8_0= ruleBSLoopBlock )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1230:3: lv_block_8_0= ruleBSLoopBlock
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getBSForLoopAccess().getBlockBSLoopBlockParserRuleCall_8_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleBSLoopBlock_in_ruleBSForLoop2642);
            lv_block_8_0=ruleBSLoopBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getBSForLoopRule());
              	        }
                     		set(
                     			current, 
                     			"block",
                      		lv_block_8_0, 
                      		"BSLoopBlock");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBSForLoop"


    // $ANTLR start "entryRuleBSSwitchStatement"
    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1254:1: entryRuleBSSwitchStatement returns [EObject current=null] : iv_ruleBSSwitchStatement= ruleBSSwitchStatement EOF ;
    public final EObject entryRuleBSSwitchStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBSSwitchStatement = null;


        try {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1255:2: (iv_ruleBSSwitchStatement= ruleBSSwitchStatement EOF )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1256:2: iv_ruleBSSwitchStatement= ruleBSSwitchStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBSSwitchStatementRule()); 
            }
            pushFollow(FOLLOW_ruleBSSwitchStatement_in_entryRuleBSSwitchStatement2677);
            iv_ruleBSSwitchStatement=ruleBSSwitchStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBSSwitchStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBSSwitchStatement2687); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBSSwitchStatement"


    // $ANTLR start "ruleBSSwitchStatement"
    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1263:1: ruleBSSwitchStatement returns [EObject current=null] : (otherlv_0= Switch ( (lv_stringSwitch_1_0= DollarSign ) )? otherlv_2= LeftParenthesis ( (lv_expression_3_0= ruleBSExpression ) ) otherlv_4= RightParenthesis ( (lv_block_5_0= ruleBSSwitchBlock ) ) ) ;
    public final EObject ruleBSSwitchStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_stringSwitch_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_expression_3_0 = null;

        EObject lv_block_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1266:28: ( (otherlv_0= Switch ( (lv_stringSwitch_1_0= DollarSign ) )? otherlv_2= LeftParenthesis ( (lv_expression_3_0= ruleBSExpression ) ) otherlv_4= RightParenthesis ( (lv_block_5_0= ruleBSSwitchBlock ) ) ) )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1267:1: (otherlv_0= Switch ( (lv_stringSwitch_1_0= DollarSign ) )? otherlv_2= LeftParenthesis ( (lv_expression_3_0= ruleBSExpression ) ) otherlv_4= RightParenthesis ( (lv_block_5_0= ruleBSSwitchBlock ) ) )
            {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1267:1: (otherlv_0= Switch ( (lv_stringSwitch_1_0= DollarSign ) )? otherlv_2= LeftParenthesis ( (lv_expression_3_0= ruleBSExpression ) ) otherlv_4= RightParenthesis ( (lv_block_5_0= ruleBSSwitchBlock ) ) )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1268:2: otherlv_0= Switch ( (lv_stringSwitch_1_0= DollarSign ) )? otherlv_2= LeftParenthesis ( (lv_expression_3_0= ruleBSExpression ) ) otherlv_4= RightParenthesis ( (lv_block_5_0= ruleBSSwitchBlock ) )
            {
            otherlv_0=(Token)match(input,Switch,FOLLOW_Switch_in_ruleBSSwitchStatement2725); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getBSSwitchStatementAccess().getSwitchKeyword_0());
                  
            }
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1272:1: ( (lv_stringSwitch_1_0= DollarSign ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==DollarSign) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1273:1: (lv_stringSwitch_1_0= DollarSign )
                    {
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1273:1: (lv_stringSwitch_1_0= DollarSign )
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1274:3: lv_stringSwitch_1_0= DollarSign
                    {
                    lv_stringSwitch_1_0=(Token)match(input,DollarSign,FOLLOW_DollarSign_in_ruleBSSwitchStatement2743); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_stringSwitch_1_0, grammarAccess.getBSSwitchStatementAccess().getStringSwitchDollarSignKeyword_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getBSSwitchStatementRule());
                      	        }
                             		setWithLastConsumed(current, "stringSwitch", true, "$");
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,LeftParenthesis,FOLLOW_LeftParenthesis_in_ruleBSSwitchStatement2768); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getBSSwitchStatementAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1293:1: ( (lv_expression_3_0= ruleBSExpression ) )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1294:1: (lv_expression_3_0= ruleBSExpression )
            {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1294:1: (lv_expression_3_0= ruleBSExpression )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1295:3: lv_expression_3_0= ruleBSExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getBSSwitchStatementAccess().getExpressionBSExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleBSExpression_in_ruleBSSwitchStatement2788);
            lv_expression_3_0=ruleBSExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getBSSwitchStatementRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_3_0, 
                      		"BSExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,RightParenthesis,FOLLOW_RightParenthesis_in_ruleBSSwitchStatement2801); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getBSSwitchStatementAccess().getRightParenthesisKeyword_4());
                  
            }
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1316:1: ( (lv_block_5_0= ruleBSSwitchBlock ) )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1317:1: (lv_block_5_0= ruleBSSwitchBlock )
            {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1317:1: (lv_block_5_0= ruleBSSwitchBlock )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1318:3: lv_block_5_0= ruleBSSwitchBlock
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getBSSwitchStatementAccess().getBlockBSSwitchBlockParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleBSSwitchBlock_in_ruleBSSwitchStatement2821);
            lv_block_5_0=ruleBSSwitchBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getBSSwitchStatementRule());
              	        }
                     		set(
                     			current, 
                     			"block",
                      		lv_block_5_0, 
                      		"BSSwitchBlock");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBSSwitchStatement"


    // $ANTLR start "entryRuleBSIfBlock"
    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1342:1: entryRuleBSIfBlock returns [EObject current=null] : iv_ruleBSIfBlock= ruleBSIfBlock EOF ;
    public final EObject entryRuleBSIfBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBSIfBlock = null;


        try {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1343:2: (iv_ruleBSIfBlock= ruleBSIfBlock EOF )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1344:2: iv_ruleBSIfBlock= ruleBSIfBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBSIfBlockRule()); 
            }
            pushFollow(FOLLOW_ruleBSIfBlock_in_entryRuleBSIfBlock2856);
            iv_ruleBSIfBlock=ruleBSIfBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBSIfBlock; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBSIfBlock2866); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBSIfBlock"


    // $ANTLR start "ruleBSIfBlock"
    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1351:1: ruleBSIfBlock returns [EObject current=null] : ( ( (lv_statements_0_0= ruleBSStatement ) ) | ( () otherlv_2= LeftCurlyBracket ( (lv_statements_3_0= ruleBSStatement ) )* otherlv_4= RightCurlyBracket ) ) ;
    public final EObject ruleBSIfBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_statements_0_0 = null;

        EObject lv_statements_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1354:28: ( ( ( (lv_statements_0_0= ruleBSStatement ) ) | ( () otherlv_2= LeftCurlyBracket ( (lv_statements_3_0= ruleBSStatement ) )* otherlv_4= RightCurlyBracket ) ) )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1355:1: ( ( (lv_statements_0_0= ruleBSStatement ) ) | ( () otherlv_2= LeftCurlyBracket ( (lv_statements_3_0= ruleBSStatement ) )* otherlv_4= RightCurlyBracket ) )
            {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1355:1: ( ( (lv_statements_0_0= ruleBSStatement ) ) | ( () otherlv_2= LeftCurlyBracket ( (lv_statements_3_0= ruleBSStatement ) )* otherlv_4= RightCurlyBracket ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==Continue||LA19_0==Client||(LA19_0>=Parent && LA19_0<=Return)||(LA19_0>=Switch && LA19_0<=Break)||(LA19_0>=False && LA19_0<=While)||(LA19_0>=Null && LA19_0<=True)||(LA19_0>=For && LA19_0<=New)||LA19_0==If||LA19_0==ExclamationMark||LA19_0==LeftParenthesis||LA19_0==PlusSign||LA19_0==HyphenMinus||(LA19_0>=Tilde && LA19_0<=RULE_INT)||LA19_0==RULE_STRING) ) {
                alt19=1;
            }
            else if ( (LA19_0==LeftCurlyBracket) ) {
                alt19=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1355:2: ( (lv_statements_0_0= ruleBSStatement ) )
                    {
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1355:2: ( (lv_statements_0_0= ruleBSStatement ) )
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1356:1: (lv_statements_0_0= ruleBSStatement )
                    {
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1356:1: (lv_statements_0_0= ruleBSStatement )
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1357:3: lv_statements_0_0= ruleBSStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getBSIfBlockAccess().getStatementsBSStatementParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBSStatement_in_ruleBSIfBlock2912);
                    lv_statements_0_0=ruleBSStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getBSIfBlockRule());
                      	        }
                             		add(
                             			current, 
                             			"statements",
                              		lv_statements_0_0, 
                              		"BSStatement");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1374:6: ( () otherlv_2= LeftCurlyBracket ( (lv_statements_3_0= ruleBSStatement ) )* otherlv_4= RightCurlyBracket )
                    {
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1374:6: ( () otherlv_2= LeftCurlyBracket ( (lv_statements_3_0= ruleBSStatement ) )* otherlv_4= RightCurlyBracket )
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1374:7: () otherlv_2= LeftCurlyBracket ( (lv_statements_3_0= ruleBSStatement ) )* otherlv_4= RightCurlyBracket
                    {
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1374:7: ()
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1375:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getBSIfBlockAccess().getBSIfBlockAction_1_0(),
                                  current);
                          
                    }

                    }

                    otherlv_2=(Token)match(input,LeftCurlyBracket,FOLLOW_LeftCurlyBracket_in_ruleBSIfBlock2941); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getBSIfBlockAccess().getLeftCurlyBracketKeyword_1_1());
                          
                    }
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1385:1: ( (lv_statements_3_0= ruleBSStatement ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==Continue||LA18_0==Client||(LA18_0>=Parent && LA18_0<=Return)||(LA18_0>=Switch && LA18_0<=Break)||(LA18_0>=False && LA18_0<=While)||(LA18_0>=Null && LA18_0<=True)||(LA18_0>=For && LA18_0<=New)||LA18_0==If||LA18_0==ExclamationMark||LA18_0==LeftParenthesis||LA18_0==PlusSign||LA18_0==HyphenMinus||(LA18_0>=Tilde && LA18_0<=RULE_INT)||LA18_0==RULE_STRING) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1386:1: (lv_statements_3_0= ruleBSStatement )
                    	    {
                    	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1386:1: (lv_statements_3_0= ruleBSStatement )
                    	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1387:3: lv_statements_3_0= ruleBSStatement
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getBSIfBlockAccess().getStatementsBSStatementParserRuleCall_1_2_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleBSStatement_in_ruleBSIfBlock2961);
                    	    lv_statements_3_0=ruleBSStatement();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getBSIfBlockRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"statements",
                    	              		lv_statements_3_0, 
                    	              		"BSStatement");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);

                    otherlv_4=(Token)match(input,RightCurlyBracket,FOLLOW_RightCurlyBracket_in_ruleBSIfBlock2975); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getBSIfBlockAccess().getRightCurlyBracketKeyword_1_3());
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBSIfBlock"


    // $ANTLR start "entryRuleBSLoopBlock"
    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1416:1: entryRuleBSLoopBlock returns [EObject current=null] : iv_ruleBSLoopBlock= ruleBSLoopBlock EOF ;
    public final EObject entryRuleBSLoopBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBSLoopBlock = null;


        try {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1417:2: (iv_ruleBSLoopBlock= ruleBSLoopBlock EOF )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1418:2: iv_ruleBSLoopBlock= ruleBSLoopBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBSLoopBlockRule()); 
            }
            pushFollow(FOLLOW_ruleBSLoopBlock_in_entryRuleBSLoopBlock3010);
            iv_ruleBSLoopBlock=ruleBSLoopBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBSLoopBlock; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBSLoopBlock3020); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBSLoopBlock"


    // $ANTLR start "ruleBSLoopBlock"
    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1425:1: ruleBSLoopBlock returns [EObject current=null] : ( ( (lv_statements_0_0= ruleBSStatement ) ) | ( () otherlv_2= LeftCurlyBracket ( (lv_statements_3_0= ruleBSStatement ) )* otherlv_4= RightCurlyBracket ) ) ;
    public final EObject ruleBSLoopBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_statements_0_0 = null;

        EObject lv_statements_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1428:28: ( ( ( (lv_statements_0_0= ruleBSStatement ) ) | ( () otherlv_2= LeftCurlyBracket ( (lv_statements_3_0= ruleBSStatement ) )* otherlv_4= RightCurlyBracket ) ) )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1429:1: ( ( (lv_statements_0_0= ruleBSStatement ) ) | ( () otherlv_2= LeftCurlyBracket ( (lv_statements_3_0= ruleBSStatement ) )* otherlv_4= RightCurlyBracket ) )
            {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1429:1: ( ( (lv_statements_0_0= ruleBSStatement ) ) | ( () otherlv_2= LeftCurlyBracket ( (lv_statements_3_0= ruleBSStatement ) )* otherlv_4= RightCurlyBracket ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==Continue||LA21_0==Client||(LA21_0>=Parent && LA21_0<=Return)||(LA21_0>=Switch && LA21_0<=Break)||(LA21_0>=False && LA21_0<=While)||(LA21_0>=Null && LA21_0<=True)||(LA21_0>=For && LA21_0<=New)||LA21_0==If||LA21_0==ExclamationMark||LA21_0==LeftParenthesis||LA21_0==PlusSign||LA21_0==HyphenMinus||(LA21_0>=Tilde && LA21_0<=RULE_INT)||LA21_0==RULE_STRING) ) {
                alt21=1;
            }
            else if ( (LA21_0==LeftCurlyBracket) ) {
                alt21=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1429:2: ( (lv_statements_0_0= ruleBSStatement ) )
                    {
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1429:2: ( (lv_statements_0_0= ruleBSStatement ) )
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1430:1: (lv_statements_0_0= ruleBSStatement )
                    {
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1430:1: (lv_statements_0_0= ruleBSStatement )
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1431:3: lv_statements_0_0= ruleBSStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getBSLoopBlockAccess().getStatementsBSStatementParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBSStatement_in_ruleBSLoopBlock3066);
                    lv_statements_0_0=ruleBSStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getBSLoopBlockRule());
                      	        }
                             		add(
                             			current, 
                             			"statements",
                              		lv_statements_0_0, 
                              		"BSStatement");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1448:6: ( () otherlv_2= LeftCurlyBracket ( (lv_statements_3_0= ruleBSStatement ) )* otherlv_4= RightCurlyBracket )
                    {
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1448:6: ( () otherlv_2= LeftCurlyBracket ( (lv_statements_3_0= ruleBSStatement ) )* otherlv_4= RightCurlyBracket )
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1448:7: () otherlv_2= LeftCurlyBracket ( (lv_statements_3_0= ruleBSStatement ) )* otherlv_4= RightCurlyBracket
                    {
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1448:7: ()
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1449:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getBSLoopBlockAccess().getBSLoopBlockAction_1_0(),
                                  current);
                          
                    }

                    }

                    otherlv_2=(Token)match(input,LeftCurlyBracket,FOLLOW_LeftCurlyBracket_in_ruleBSLoopBlock3095); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getBSLoopBlockAccess().getLeftCurlyBracketKeyword_1_1());
                          
                    }
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1459:1: ( (lv_statements_3_0= ruleBSStatement ) )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==Continue||LA20_0==Client||(LA20_0>=Parent && LA20_0<=Return)||(LA20_0>=Switch && LA20_0<=Break)||(LA20_0>=False && LA20_0<=While)||(LA20_0>=Null && LA20_0<=True)||(LA20_0>=For && LA20_0<=New)||LA20_0==If||LA20_0==ExclamationMark||LA20_0==LeftParenthesis||LA20_0==PlusSign||LA20_0==HyphenMinus||(LA20_0>=Tilde && LA20_0<=RULE_INT)||LA20_0==RULE_STRING) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1460:1: (lv_statements_3_0= ruleBSStatement )
                    	    {
                    	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1460:1: (lv_statements_3_0= ruleBSStatement )
                    	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1461:3: lv_statements_3_0= ruleBSStatement
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getBSLoopBlockAccess().getStatementsBSStatementParserRuleCall_1_2_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleBSStatement_in_ruleBSLoopBlock3115);
                    	    lv_statements_3_0=ruleBSStatement();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getBSLoopBlockRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"statements",
                    	              		lv_statements_3_0, 
                    	              		"BSStatement");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop20;
                        }
                    } while (true);

                    otherlv_4=(Token)match(input,RightCurlyBracket,FOLLOW_RightCurlyBracket_in_ruleBSLoopBlock3129); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getBSLoopBlockAccess().getRightCurlyBracketKeyword_1_3());
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBSLoopBlock"


    // $ANTLR start "entryRuleBSSwitchBlock"
    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1490:1: entryRuleBSSwitchBlock returns [EObject current=null] : iv_ruleBSSwitchBlock= ruleBSSwitchBlock EOF ;
    public final EObject entryRuleBSSwitchBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBSSwitchBlock = null;


        try {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1491:2: (iv_ruleBSSwitchBlock= ruleBSSwitchBlock EOF )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1492:2: iv_ruleBSSwitchBlock= ruleBSSwitchBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBSSwitchBlockRule()); 
            }
            pushFollow(FOLLOW_ruleBSSwitchBlock_in_entryRuleBSSwitchBlock3164);
            iv_ruleBSSwitchBlock=ruleBSSwitchBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBSSwitchBlock; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBSSwitchBlock3174); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBSSwitchBlock"


    // $ANTLR start "ruleBSSwitchBlock"
    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1499:1: ruleBSSwitchBlock returns [EObject current=null] : ( () otherlv_1= LeftCurlyBracket ( (lv_cases_2_0= ruleBSCase ) )* otherlv_3= RightCurlyBracket ) ;
    public final EObject ruleBSSwitchBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_cases_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1502:28: ( ( () otherlv_1= LeftCurlyBracket ( (lv_cases_2_0= ruleBSCase ) )* otherlv_3= RightCurlyBracket ) )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1503:1: ( () otherlv_1= LeftCurlyBracket ( (lv_cases_2_0= ruleBSCase ) )* otherlv_3= RightCurlyBracket )
            {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1503:1: ( () otherlv_1= LeftCurlyBracket ( (lv_cases_2_0= ruleBSCase ) )* otherlv_3= RightCurlyBracket )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1503:2: () otherlv_1= LeftCurlyBracket ( (lv_cases_2_0= ruleBSCase ) )* otherlv_3= RightCurlyBracket
            {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1503:2: ()
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1504:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getBSSwitchBlockAccess().getBSSwitchBlockAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,LeftCurlyBracket,FOLLOW_LeftCurlyBracket_in_ruleBSSwitchBlock3221); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getBSSwitchBlockAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1514:1: ( (lv_cases_2_0= ruleBSCase ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==Default||LA22_0==Case) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1515:1: (lv_cases_2_0= ruleBSCase )
            	    {
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1515:1: (lv_cases_2_0= ruleBSCase )
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1516:3: lv_cases_2_0= ruleBSCase
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getBSSwitchBlockAccess().getCasesBSCaseParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleBSCase_in_ruleBSSwitchBlock3241);
            	    lv_cases_2_0=ruleBSCase();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getBSSwitchBlockRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"cases",
            	              		lv_cases_2_0, 
            	              		"BSCase");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            otherlv_3=(Token)match(input,RightCurlyBracket,FOLLOW_RightCurlyBracket_in_ruleBSSwitchBlock3255); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getBSSwitchBlockAccess().getRightCurlyBracketKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBSSwitchBlock"


    // $ANTLR start "entryRuleBSCase"
    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1545:1: entryRuleBSCase returns [EObject current=null] : iv_ruleBSCase= ruleBSCase EOF ;
    public final EObject entryRuleBSCase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBSCase = null;


        try {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1546:2: (iv_ruleBSCase= ruleBSCase EOF )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1547:2: iv_ruleBSCase= ruleBSCase EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBSCaseRule()); 
            }
            pushFollow(FOLLOW_ruleBSCase_in_entryRuleBSCase3289);
            iv_ruleBSCase=ruleBSCase();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBSCase; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBSCase3299); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBSCase"


    // $ANTLR start "ruleBSCase"
    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1554:1: ruleBSCase returns [EObject current=null] : ( (otherlv_0= Case ( (lv_expression_1_0= ruleBSExpression ) ) otherlv_2= Colon ( (lv_block_3_0= ruleBSCaseBlock ) ) ) | (otherlv_4= Default otherlv_5= Colon ( (lv_block_6_0= ruleBSCaseBlock ) ) ) ) ;
    public final EObject ruleBSCase() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_expression_1_0 = null;

        EObject lv_block_3_0 = null;

        EObject lv_block_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1557:28: ( ( (otherlv_0= Case ( (lv_expression_1_0= ruleBSExpression ) ) otherlv_2= Colon ( (lv_block_3_0= ruleBSCaseBlock ) ) ) | (otherlv_4= Default otherlv_5= Colon ( (lv_block_6_0= ruleBSCaseBlock ) ) ) ) )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1558:1: ( (otherlv_0= Case ( (lv_expression_1_0= ruleBSExpression ) ) otherlv_2= Colon ( (lv_block_3_0= ruleBSCaseBlock ) ) ) | (otherlv_4= Default otherlv_5= Colon ( (lv_block_6_0= ruleBSCaseBlock ) ) ) )
            {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1558:1: ( (otherlv_0= Case ( (lv_expression_1_0= ruleBSExpression ) ) otherlv_2= Colon ( (lv_block_3_0= ruleBSCaseBlock ) ) ) | (otherlv_4= Default otherlv_5= Colon ( (lv_block_6_0= ruleBSCaseBlock ) ) ) )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==Case) ) {
                alt23=1;
            }
            else if ( (LA23_0==Default) ) {
                alt23=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1558:2: (otherlv_0= Case ( (lv_expression_1_0= ruleBSExpression ) ) otherlv_2= Colon ( (lv_block_3_0= ruleBSCaseBlock ) ) )
                    {
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1558:2: (otherlv_0= Case ( (lv_expression_1_0= ruleBSExpression ) ) otherlv_2= Colon ( (lv_block_3_0= ruleBSCaseBlock ) ) )
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1559:2: otherlv_0= Case ( (lv_expression_1_0= ruleBSExpression ) ) otherlv_2= Colon ( (lv_block_3_0= ruleBSCaseBlock ) )
                    {
                    otherlv_0=(Token)match(input,Case,FOLLOW_Case_in_ruleBSCase3338); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getBSCaseAccess().getCaseKeyword_0_0());
                          
                    }
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1563:1: ( (lv_expression_1_0= ruleBSExpression ) )
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1564:1: (lv_expression_1_0= ruleBSExpression )
                    {
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1564:1: (lv_expression_1_0= ruleBSExpression )
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1565:3: lv_expression_1_0= ruleBSExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getBSCaseAccess().getExpressionBSExpressionParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBSExpression_in_ruleBSCase3358);
                    lv_expression_1_0=ruleBSExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getBSCaseRule());
                      	        }
                             		set(
                             			current, 
                             			"expression",
                              		lv_expression_1_0, 
                              		"BSExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_2=(Token)match(input,Colon,FOLLOW_Colon_in_ruleBSCase3371); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getBSCaseAccess().getColonKeyword_0_2());
                          
                    }
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1586:1: ( (lv_block_3_0= ruleBSCaseBlock ) )
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1587:1: (lv_block_3_0= ruleBSCaseBlock )
                    {
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1587:1: (lv_block_3_0= ruleBSCaseBlock )
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1588:3: lv_block_3_0= ruleBSCaseBlock
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getBSCaseAccess().getBlockBSCaseBlockParserRuleCall_0_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBSCaseBlock_in_ruleBSCase3391);
                    lv_block_3_0=ruleBSCaseBlock();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getBSCaseRule());
                      	        }
                             		set(
                             			current, 
                             			"block",
                              		lv_block_3_0, 
                              		"BSCaseBlock");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1605:6: (otherlv_4= Default otherlv_5= Colon ( (lv_block_6_0= ruleBSCaseBlock ) ) )
                    {
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1605:6: (otherlv_4= Default otherlv_5= Colon ( (lv_block_6_0= ruleBSCaseBlock ) ) )
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1606:2: otherlv_4= Default otherlv_5= Colon ( (lv_block_6_0= ruleBSCaseBlock ) )
                    {
                    otherlv_4=(Token)match(input,Default,FOLLOW_Default_in_ruleBSCase3412); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getBSCaseAccess().getDefaultKeyword_1_0());
                          
                    }
                    otherlv_5=(Token)match(input,Colon,FOLLOW_Colon_in_ruleBSCase3424); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getBSCaseAccess().getColonKeyword_1_1());
                          
                    }
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1615:1: ( (lv_block_6_0= ruleBSCaseBlock ) )
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1616:1: (lv_block_6_0= ruleBSCaseBlock )
                    {
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1616:1: (lv_block_6_0= ruleBSCaseBlock )
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1617:3: lv_block_6_0= ruleBSCaseBlock
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getBSCaseAccess().getBlockBSCaseBlockParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBSCaseBlock_in_ruleBSCase3444);
                    lv_block_6_0=ruleBSCaseBlock();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getBSCaseRule());
                      	        }
                             		set(
                             			current, 
                             			"block",
                              		lv_block_6_0, 
                              		"BSCaseBlock");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBSCase"


    // $ANTLR start "entryRuleBSCaseBlock"
    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1641:1: entryRuleBSCaseBlock returns [EObject current=null] : iv_ruleBSCaseBlock= ruleBSCaseBlock EOF ;
    public final EObject entryRuleBSCaseBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBSCaseBlock = null;


        try {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1642:2: (iv_ruleBSCaseBlock= ruleBSCaseBlock EOF )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1643:2: iv_ruleBSCaseBlock= ruleBSCaseBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBSCaseBlockRule()); 
            }
            pushFollow(FOLLOW_ruleBSCaseBlock_in_entryRuleBSCaseBlock3480);
            iv_ruleBSCaseBlock=ruleBSCaseBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBSCaseBlock; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBSCaseBlock3490); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBSCaseBlock"


    // $ANTLR start "ruleBSCaseBlock"
    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1650:1: ruleBSCaseBlock returns [EObject current=null] : ( () ( (lv_statements_1_0= ruleBSStatement ) )* ) ;
    public final EObject ruleBSCaseBlock() throws RecognitionException {
        EObject current = null;

        EObject lv_statements_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1653:28: ( ( () ( (lv_statements_1_0= ruleBSStatement ) )* ) )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1654:1: ( () ( (lv_statements_1_0= ruleBSStatement ) )* )
            {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1654:1: ( () ( (lv_statements_1_0= ruleBSStatement ) )* )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1654:2: () ( (lv_statements_1_0= ruleBSStatement ) )*
            {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1654:2: ()
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1655:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getBSCaseBlockAccess().getBSCaseBlockAction_0(),
                          current);
                  
            }

            }

            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1660:2: ( (lv_statements_1_0= ruleBSStatement ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==Continue||LA24_0==Client||(LA24_0>=Parent && LA24_0<=Return)||(LA24_0>=Switch && LA24_0<=Break)||(LA24_0>=False && LA24_0<=While)||(LA24_0>=Null && LA24_0<=True)||(LA24_0>=For && LA24_0<=New)||LA24_0==If||LA24_0==ExclamationMark||LA24_0==LeftParenthesis||LA24_0==PlusSign||LA24_0==HyphenMinus||(LA24_0>=Tilde && LA24_0<=RULE_INT)||LA24_0==RULE_STRING) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1661:1: (lv_statements_1_0= ruleBSStatement )
            	    {
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1661:1: (lv_statements_1_0= ruleBSStatement )
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1662:3: lv_statements_1_0= ruleBSStatement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getBSCaseBlockAccess().getStatementsBSStatementParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleBSStatement_in_ruleBSCaseBlock3545);
            	    lv_statements_1_0=ruleBSStatement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getBSCaseBlockRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"statements",
            	              		lv_statements_1_0, 
            	              		"BSStatement");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBSCaseBlock"


    // $ANTLR start "entryRuleBSExpression"
    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1690:1: entryRuleBSExpression returns [EObject current=null] : iv_ruleBSExpression= ruleBSExpression EOF ;
    public final EObject entryRuleBSExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBSExpression = null;


        try {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1691:2: (iv_ruleBSExpression= ruleBSExpression EOF )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1692:2: iv_ruleBSExpression= ruleBSExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBSExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleBSExpression_in_entryRuleBSExpression3585);
            iv_ruleBSExpression=ruleBSExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBSExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBSExpression3595); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBSExpression"


    // $ANTLR start "ruleBSExpression"
    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1699:1: ruleBSExpression returns [EObject current=null] : this_BSTernaryExpression_0= ruleBSTernaryExpression ;
    public final EObject ruleBSExpression() throws RecognitionException {
        EObject current = null;

        EObject this_BSTernaryExpression_0 = null;


         enterRule(); 
            
        try {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1702:28: (this_BSTernaryExpression_0= ruleBSTernaryExpression )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1704:5: this_BSTernaryExpression_0= ruleBSTernaryExpression
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getBSExpressionAccess().getBSTernaryExpressionParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleBSTernaryExpression_in_ruleBSExpression3641);
            this_BSTernaryExpression_0=ruleBSTernaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = this_BSTernaryExpression_0;
                      afterParserOrEnumRuleCall();
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBSExpression"


    // $ANTLR start "entryRuleBSTernaryExpression"
    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1722:1: entryRuleBSTernaryExpression returns [EObject current=null] : iv_ruleBSTernaryExpression= ruleBSTernaryExpression EOF ;
    public final EObject entryRuleBSTernaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBSTernaryExpression = null;


        try {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1723:2: (iv_ruleBSTernaryExpression= ruleBSTernaryExpression EOF )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1724:2: iv_ruleBSTernaryExpression= ruleBSTernaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBSTernaryExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleBSTernaryExpression_in_entryRuleBSTernaryExpression3676);
            iv_ruleBSTernaryExpression=ruleBSTernaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBSTernaryExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBSTernaryExpression3686); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBSTernaryExpression"


    // $ANTLR start "ruleBSTernaryExpression"
    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1731:1: ruleBSTernaryExpression returns [EObject current=null] : (this_BSBooleanOrExpression_0= ruleBSBooleanOrExpression ( () otherlv_2= QuestionMark ( (lv_middle_3_0= ruleBSExpression ) ) otherlv_4= Colon ( (lv_right_5_0= ruleBSExpression ) ) )? ) ;
    public final EObject ruleBSTernaryExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_BSBooleanOrExpression_0 = null;

        EObject lv_middle_3_0 = null;

        EObject lv_right_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1734:28: ( (this_BSBooleanOrExpression_0= ruleBSBooleanOrExpression ( () otherlv_2= QuestionMark ( (lv_middle_3_0= ruleBSExpression ) ) otherlv_4= Colon ( (lv_right_5_0= ruleBSExpression ) ) )? ) )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1735:1: (this_BSBooleanOrExpression_0= ruleBSBooleanOrExpression ( () otherlv_2= QuestionMark ( (lv_middle_3_0= ruleBSExpression ) ) otherlv_4= Colon ( (lv_right_5_0= ruleBSExpression ) ) )? )
            {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1735:1: (this_BSBooleanOrExpression_0= ruleBSBooleanOrExpression ( () otherlv_2= QuestionMark ( (lv_middle_3_0= ruleBSExpression ) ) otherlv_4= Colon ( (lv_right_5_0= ruleBSExpression ) ) )? )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1736:5: this_BSBooleanOrExpression_0= ruleBSBooleanOrExpression ( () otherlv_2= QuestionMark ( (lv_middle_3_0= ruleBSExpression ) ) otherlv_4= Colon ( (lv_right_5_0= ruleBSExpression ) ) )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getBSTernaryExpressionAccess().getBSBooleanOrExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleBSBooleanOrExpression_in_ruleBSTernaryExpression3733);
            this_BSBooleanOrExpression_0=ruleBSBooleanOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = this_BSBooleanOrExpression_0;
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1744:1: ( () otherlv_2= QuestionMark ( (lv_middle_3_0= ruleBSExpression ) ) otherlv_4= Colon ( (lv_right_5_0= ruleBSExpression ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==QuestionMark) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1744:2: () otherlv_2= QuestionMark ( (lv_middle_3_0= ruleBSExpression ) ) otherlv_4= Colon ( (lv_right_5_0= ruleBSExpression ) )
                    {
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1744:2: ()
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1745:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getBSTernaryExpressionAccess().getBSTernaryExpressionLeftAction_1_0(),
                                  current);
                          
                    }

                    }

                    otherlv_2=(Token)match(input,QuestionMark,FOLLOW_QuestionMark_in_ruleBSTernaryExpression3755); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getBSTernaryExpressionAccess().getQuestionMarkKeyword_1_1());
                          
                    }
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1755:1: ( (lv_middle_3_0= ruleBSExpression ) )
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1756:1: (lv_middle_3_0= ruleBSExpression )
                    {
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1756:1: (lv_middle_3_0= ruleBSExpression )
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1757:3: lv_middle_3_0= ruleBSExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getBSTernaryExpressionAccess().getMiddleBSExpressionParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBSExpression_in_ruleBSTernaryExpression3775);
                    lv_middle_3_0=ruleBSExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getBSTernaryExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"middle",
                              		lv_middle_3_0, 
                              		"BSExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_4=(Token)match(input,Colon,FOLLOW_Colon_in_ruleBSTernaryExpression3788); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getBSTernaryExpressionAccess().getColonKeyword_1_3());
                          
                    }
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1778:1: ( (lv_right_5_0= ruleBSExpression ) )
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1779:1: (lv_right_5_0= ruleBSExpression )
                    {
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1779:1: (lv_right_5_0= ruleBSExpression )
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1780:3: lv_right_5_0= ruleBSExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getBSTernaryExpressionAccess().getRightBSExpressionParserRuleCall_1_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBSExpression_in_ruleBSTernaryExpression3808);
                    lv_right_5_0=ruleBSExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getBSTernaryExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"right",
                              		lv_right_5_0, 
                              		"BSExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBSTernaryExpression"


    // $ANTLR start "entryRuleBSBooleanOrExpression"
    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1804:1: entryRuleBSBooleanOrExpression returns [EObject current=null] : iv_ruleBSBooleanOrExpression= ruleBSBooleanOrExpression EOF ;
    public final EObject entryRuleBSBooleanOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBSBooleanOrExpression = null;


        try {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1805:2: (iv_ruleBSBooleanOrExpression= ruleBSBooleanOrExpression EOF )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1806:2: iv_ruleBSBooleanOrExpression= ruleBSBooleanOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBSBooleanOrExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleBSBooleanOrExpression_in_entryRuleBSBooleanOrExpression3845);
            iv_ruleBSBooleanOrExpression=ruleBSBooleanOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBSBooleanOrExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBSBooleanOrExpression3855); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBSBooleanOrExpression"


    // $ANTLR start "ruleBSBooleanOrExpression"
    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1813:1: ruleBSBooleanOrExpression returns [EObject current=null] : (this_BSBooleanAndExpression_0= ruleBSBooleanAndExpression ( () otherlv_2= VerticalLineVerticalLine ( (lv_right_3_0= ruleBSBooleanAndExpression ) ) )* ) ;
    public final EObject ruleBSBooleanOrExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_BSBooleanAndExpression_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1816:28: ( (this_BSBooleanAndExpression_0= ruleBSBooleanAndExpression ( () otherlv_2= VerticalLineVerticalLine ( (lv_right_3_0= ruleBSBooleanAndExpression ) ) )* ) )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1817:1: (this_BSBooleanAndExpression_0= ruleBSBooleanAndExpression ( () otherlv_2= VerticalLineVerticalLine ( (lv_right_3_0= ruleBSBooleanAndExpression ) ) )* )
            {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1817:1: (this_BSBooleanAndExpression_0= ruleBSBooleanAndExpression ( () otherlv_2= VerticalLineVerticalLine ( (lv_right_3_0= ruleBSBooleanAndExpression ) ) )* )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1818:5: this_BSBooleanAndExpression_0= ruleBSBooleanAndExpression ( () otherlv_2= VerticalLineVerticalLine ( (lv_right_3_0= ruleBSBooleanAndExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getBSBooleanOrExpressionAccess().getBSBooleanAndExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleBSBooleanAndExpression_in_ruleBSBooleanOrExpression3902);
            this_BSBooleanAndExpression_0=ruleBSBooleanAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = this_BSBooleanAndExpression_0;
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1826:1: ( () otherlv_2= VerticalLineVerticalLine ( (lv_right_3_0= ruleBSBooleanAndExpression ) ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==VerticalLineVerticalLine) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1826:2: () otherlv_2= VerticalLineVerticalLine ( (lv_right_3_0= ruleBSBooleanAndExpression ) )
            	    {
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1826:2: ()
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1827:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getBSBooleanOrExpressionAccess().getBSBooleanOrExpressionLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,VerticalLineVerticalLine,FOLLOW_VerticalLineVerticalLine_in_ruleBSBooleanOrExpression3924); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getBSBooleanOrExpressionAccess().getVerticalLineVerticalLineKeyword_1_1());
            	          
            	    }
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1837:1: ( (lv_right_3_0= ruleBSBooleanAndExpression ) )
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1838:1: (lv_right_3_0= ruleBSBooleanAndExpression )
            	    {
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1838:1: (lv_right_3_0= ruleBSBooleanAndExpression )
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1839:3: lv_right_3_0= ruleBSBooleanAndExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getBSBooleanOrExpressionAccess().getRightBSBooleanAndExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleBSBooleanAndExpression_in_ruleBSBooleanOrExpression3944);
            	    lv_right_3_0=ruleBSBooleanAndExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getBSBooleanOrExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_3_0, 
            	              		"BSBooleanAndExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBSBooleanOrExpression"


    // $ANTLR start "entryRuleBSBooleanAndExpression"
    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1863:1: entryRuleBSBooleanAndExpression returns [EObject current=null] : iv_ruleBSBooleanAndExpression= ruleBSBooleanAndExpression EOF ;
    public final EObject entryRuleBSBooleanAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBSBooleanAndExpression = null;


        try {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1864:2: (iv_ruleBSBooleanAndExpression= ruleBSBooleanAndExpression EOF )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1865:2: iv_ruleBSBooleanAndExpression= ruleBSBooleanAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBSBooleanAndExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleBSBooleanAndExpression_in_entryRuleBSBooleanAndExpression3981);
            iv_ruleBSBooleanAndExpression=ruleBSBooleanAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBSBooleanAndExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBSBooleanAndExpression3991); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBSBooleanAndExpression"


    // $ANTLR start "ruleBSBooleanAndExpression"
    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1872:1: ruleBSBooleanAndExpression returns [EObject current=null] : (this_BSBitwiseOrExpression_0= ruleBSBitwiseOrExpression ( () otherlv_2= AmpersandAmpersand ( (lv_right_3_0= ruleBSBitwiseOrExpression ) ) )* ) ;
    public final EObject ruleBSBooleanAndExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_BSBitwiseOrExpression_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1875:28: ( (this_BSBitwiseOrExpression_0= ruleBSBitwiseOrExpression ( () otherlv_2= AmpersandAmpersand ( (lv_right_3_0= ruleBSBitwiseOrExpression ) ) )* ) )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1876:1: (this_BSBitwiseOrExpression_0= ruleBSBitwiseOrExpression ( () otherlv_2= AmpersandAmpersand ( (lv_right_3_0= ruleBSBitwiseOrExpression ) ) )* )
            {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1876:1: (this_BSBitwiseOrExpression_0= ruleBSBitwiseOrExpression ( () otherlv_2= AmpersandAmpersand ( (lv_right_3_0= ruleBSBitwiseOrExpression ) ) )* )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1877:5: this_BSBitwiseOrExpression_0= ruleBSBitwiseOrExpression ( () otherlv_2= AmpersandAmpersand ( (lv_right_3_0= ruleBSBitwiseOrExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getBSBooleanAndExpressionAccess().getBSBitwiseOrExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleBSBitwiseOrExpression_in_ruleBSBooleanAndExpression4038);
            this_BSBitwiseOrExpression_0=ruleBSBitwiseOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = this_BSBitwiseOrExpression_0;
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1885:1: ( () otherlv_2= AmpersandAmpersand ( (lv_right_3_0= ruleBSBitwiseOrExpression ) ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==AmpersandAmpersand) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1885:2: () otherlv_2= AmpersandAmpersand ( (lv_right_3_0= ruleBSBitwiseOrExpression ) )
            	    {
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1885:2: ()
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1886:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getBSBooleanAndExpressionAccess().getBSBooleanAndExpressionLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,AmpersandAmpersand,FOLLOW_AmpersandAmpersand_in_ruleBSBooleanAndExpression4060); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getBSBooleanAndExpressionAccess().getAmpersandAmpersandKeyword_1_1());
            	          
            	    }
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1896:1: ( (lv_right_3_0= ruleBSBitwiseOrExpression ) )
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1897:1: (lv_right_3_0= ruleBSBitwiseOrExpression )
            	    {
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1897:1: (lv_right_3_0= ruleBSBitwiseOrExpression )
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1898:3: lv_right_3_0= ruleBSBitwiseOrExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getBSBooleanAndExpressionAccess().getRightBSBitwiseOrExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleBSBitwiseOrExpression_in_ruleBSBooleanAndExpression4080);
            	    lv_right_3_0=ruleBSBitwiseOrExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getBSBooleanAndExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_3_0, 
            	              		"BSBitwiseOrExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBSBooleanAndExpression"


    // $ANTLR start "entryRuleBSBitwiseOrExpression"
    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1922:1: entryRuleBSBitwiseOrExpression returns [EObject current=null] : iv_ruleBSBitwiseOrExpression= ruleBSBitwiseOrExpression EOF ;
    public final EObject entryRuleBSBitwiseOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBSBitwiseOrExpression = null;


        try {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1923:2: (iv_ruleBSBitwiseOrExpression= ruleBSBitwiseOrExpression EOF )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1924:2: iv_ruleBSBitwiseOrExpression= ruleBSBitwiseOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBSBitwiseOrExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleBSBitwiseOrExpression_in_entryRuleBSBitwiseOrExpression4117);
            iv_ruleBSBitwiseOrExpression=ruleBSBitwiseOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBSBitwiseOrExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBSBitwiseOrExpression4127); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBSBitwiseOrExpression"


    // $ANTLR start "ruleBSBitwiseOrExpression"
    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1931:1: ruleBSBitwiseOrExpression returns [EObject current=null] : (this_BSBitwiseXorExpression_0= ruleBSBitwiseXorExpression ( () otherlv_2= VerticalLine ( (lv_right_3_0= ruleBSBitwiseXorExpression ) ) )* ) ;
    public final EObject ruleBSBitwiseOrExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_BSBitwiseXorExpression_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1934:28: ( (this_BSBitwiseXorExpression_0= ruleBSBitwiseXorExpression ( () otherlv_2= VerticalLine ( (lv_right_3_0= ruleBSBitwiseXorExpression ) ) )* ) )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1935:1: (this_BSBitwiseXorExpression_0= ruleBSBitwiseXorExpression ( () otherlv_2= VerticalLine ( (lv_right_3_0= ruleBSBitwiseXorExpression ) ) )* )
            {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1935:1: (this_BSBitwiseXorExpression_0= ruleBSBitwiseXorExpression ( () otherlv_2= VerticalLine ( (lv_right_3_0= ruleBSBitwiseXorExpression ) ) )* )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1936:5: this_BSBitwiseXorExpression_0= ruleBSBitwiseXorExpression ( () otherlv_2= VerticalLine ( (lv_right_3_0= ruleBSBitwiseXorExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getBSBitwiseOrExpressionAccess().getBSBitwiseXorExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleBSBitwiseXorExpression_in_ruleBSBitwiseOrExpression4174);
            this_BSBitwiseXorExpression_0=ruleBSBitwiseXorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = this_BSBitwiseXorExpression_0;
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1944:1: ( () otherlv_2= VerticalLine ( (lv_right_3_0= ruleBSBitwiseXorExpression ) ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==VerticalLine) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1944:2: () otherlv_2= VerticalLine ( (lv_right_3_0= ruleBSBitwiseXorExpression ) )
            	    {
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1944:2: ()
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1945:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getBSBitwiseOrExpressionAccess().getBSBitwiseOrExpressionLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,VerticalLine,FOLLOW_VerticalLine_in_ruleBSBitwiseOrExpression4196); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getBSBitwiseOrExpressionAccess().getVerticalLineKeyword_1_1());
            	          
            	    }
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1955:1: ( (lv_right_3_0= ruleBSBitwiseXorExpression ) )
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1956:1: (lv_right_3_0= ruleBSBitwiseXorExpression )
            	    {
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1956:1: (lv_right_3_0= ruleBSBitwiseXorExpression )
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1957:3: lv_right_3_0= ruleBSBitwiseXorExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getBSBitwiseOrExpressionAccess().getRightBSBitwiseXorExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleBSBitwiseXorExpression_in_ruleBSBitwiseOrExpression4216);
            	    lv_right_3_0=ruleBSBitwiseXorExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getBSBitwiseOrExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_3_0, 
            	              		"BSBitwiseXorExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBSBitwiseOrExpression"


    // $ANTLR start "entryRuleBSBitwiseXorExpression"
    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1981:1: entryRuleBSBitwiseXorExpression returns [EObject current=null] : iv_ruleBSBitwiseXorExpression= ruleBSBitwiseXorExpression EOF ;
    public final EObject entryRuleBSBitwiseXorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBSBitwiseXorExpression = null;


        try {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1982:2: (iv_ruleBSBitwiseXorExpression= ruleBSBitwiseXorExpression EOF )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1983:2: iv_ruleBSBitwiseXorExpression= ruleBSBitwiseXorExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBSBitwiseXorExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleBSBitwiseXorExpression_in_entryRuleBSBitwiseXorExpression4253);
            iv_ruleBSBitwiseXorExpression=ruleBSBitwiseXorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBSBitwiseXorExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBSBitwiseXorExpression4263); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBSBitwiseXorExpression"


    // $ANTLR start "ruleBSBitwiseXorExpression"
    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1990:1: ruleBSBitwiseXorExpression returns [EObject current=null] : (this_BSBitwiseAndExpression_0= ruleBSBitwiseAndExpression ( () otherlv_2= CircumflexAccent ( (lv_right_3_0= ruleBSBitwiseAndExpression ) ) )* ) ;
    public final EObject ruleBSBitwiseXorExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_BSBitwiseAndExpression_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1993:28: ( (this_BSBitwiseAndExpression_0= ruleBSBitwiseAndExpression ( () otherlv_2= CircumflexAccent ( (lv_right_3_0= ruleBSBitwiseAndExpression ) ) )* ) )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1994:1: (this_BSBitwiseAndExpression_0= ruleBSBitwiseAndExpression ( () otherlv_2= CircumflexAccent ( (lv_right_3_0= ruleBSBitwiseAndExpression ) ) )* )
            {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1994:1: (this_BSBitwiseAndExpression_0= ruleBSBitwiseAndExpression ( () otherlv_2= CircumflexAccent ( (lv_right_3_0= ruleBSBitwiseAndExpression ) ) )* )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1995:5: this_BSBitwiseAndExpression_0= ruleBSBitwiseAndExpression ( () otherlv_2= CircumflexAccent ( (lv_right_3_0= ruleBSBitwiseAndExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getBSBitwiseXorExpressionAccess().getBSBitwiseAndExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleBSBitwiseAndExpression_in_ruleBSBitwiseXorExpression4310);
            this_BSBitwiseAndExpression_0=ruleBSBitwiseAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = this_BSBitwiseAndExpression_0;
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2003:1: ( () otherlv_2= CircumflexAccent ( (lv_right_3_0= ruleBSBitwiseAndExpression ) ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==CircumflexAccent) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2003:2: () otherlv_2= CircumflexAccent ( (lv_right_3_0= ruleBSBitwiseAndExpression ) )
            	    {
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2003:2: ()
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2004:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getBSBitwiseXorExpressionAccess().getBSBitwiseXorExpressionLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,CircumflexAccent,FOLLOW_CircumflexAccent_in_ruleBSBitwiseXorExpression4332); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getBSBitwiseXorExpressionAccess().getCircumflexAccentKeyword_1_1());
            	          
            	    }
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2014:1: ( (lv_right_3_0= ruleBSBitwiseAndExpression ) )
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2015:1: (lv_right_3_0= ruleBSBitwiseAndExpression )
            	    {
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2015:1: (lv_right_3_0= ruleBSBitwiseAndExpression )
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2016:3: lv_right_3_0= ruleBSBitwiseAndExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getBSBitwiseXorExpressionAccess().getRightBSBitwiseAndExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleBSBitwiseAndExpression_in_ruleBSBitwiseXorExpression4352);
            	    lv_right_3_0=ruleBSBitwiseAndExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getBSBitwiseXorExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_3_0, 
            	              		"BSBitwiseAndExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBSBitwiseXorExpression"


    // $ANTLR start "entryRuleBSBitwiseAndExpression"
    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2040:1: entryRuleBSBitwiseAndExpression returns [EObject current=null] : iv_ruleBSBitwiseAndExpression= ruleBSBitwiseAndExpression EOF ;
    public final EObject entryRuleBSBitwiseAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBSBitwiseAndExpression = null;


        try {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2041:2: (iv_ruleBSBitwiseAndExpression= ruleBSBitwiseAndExpression EOF )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2042:2: iv_ruleBSBitwiseAndExpression= ruleBSBitwiseAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBSBitwiseAndExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleBSBitwiseAndExpression_in_entryRuleBSBitwiseAndExpression4389);
            iv_ruleBSBitwiseAndExpression=ruleBSBitwiseAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBSBitwiseAndExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBSBitwiseAndExpression4399); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBSBitwiseAndExpression"


    // $ANTLR start "ruleBSBitwiseAndExpression"
    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2049:1: ruleBSBitwiseAndExpression returns [EObject current=null] : (this_BSEqualityExpression_0= ruleBSEqualityExpression ( () otherlv_2= Ampersand ( (lv_right_3_0= ruleBSEqualityExpression ) ) )* ) ;
    public final EObject ruleBSBitwiseAndExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_BSEqualityExpression_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2052:28: ( (this_BSEqualityExpression_0= ruleBSEqualityExpression ( () otherlv_2= Ampersand ( (lv_right_3_0= ruleBSEqualityExpression ) ) )* ) )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2053:1: (this_BSEqualityExpression_0= ruleBSEqualityExpression ( () otherlv_2= Ampersand ( (lv_right_3_0= ruleBSEqualityExpression ) ) )* )
            {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2053:1: (this_BSEqualityExpression_0= ruleBSEqualityExpression ( () otherlv_2= Ampersand ( (lv_right_3_0= ruleBSEqualityExpression ) ) )* )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2054:5: this_BSEqualityExpression_0= ruleBSEqualityExpression ( () otherlv_2= Ampersand ( (lv_right_3_0= ruleBSEqualityExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getBSBitwiseAndExpressionAccess().getBSEqualityExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleBSEqualityExpression_in_ruleBSBitwiseAndExpression4446);
            this_BSEqualityExpression_0=ruleBSEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = this_BSEqualityExpression_0;
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2062:1: ( () otherlv_2= Ampersand ( (lv_right_3_0= ruleBSEqualityExpression ) ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==Ampersand) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2062:2: () otherlv_2= Ampersand ( (lv_right_3_0= ruleBSEqualityExpression ) )
            	    {
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2062:2: ()
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2063:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getBSBitwiseAndExpressionAccess().getBSBitwiseAndExpressionLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,Ampersand,FOLLOW_Ampersand_in_ruleBSBitwiseAndExpression4468); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getBSBitwiseAndExpressionAccess().getAmpersandKeyword_1_1());
            	          
            	    }
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2073:1: ( (lv_right_3_0= ruleBSEqualityExpression ) )
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2074:1: (lv_right_3_0= ruleBSEqualityExpression )
            	    {
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2074:1: (lv_right_3_0= ruleBSEqualityExpression )
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2075:3: lv_right_3_0= ruleBSEqualityExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getBSBitwiseAndExpressionAccess().getRightBSEqualityExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleBSEqualityExpression_in_ruleBSBitwiseAndExpression4488);
            	    lv_right_3_0=ruleBSEqualityExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getBSBitwiseAndExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_3_0, 
            	              		"BSEqualityExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBSBitwiseAndExpression"


    // $ANTLR start "entryRuleBSEqualityExpression"
    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2099:1: entryRuleBSEqualityExpression returns [EObject current=null] : iv_ruleBSEqualityExpression= ruleBSEqualityExpression EOF ;
    public final EObject entryRuleBSEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBSEqualityExpression = null;


        try {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2100:2: (iv_ruleBSEqualityExpression= ruleBSEqualityExpression EOF )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2101:2: iv_ruleBSEqualityExpression= ruleBSEqualityExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBSEqualityExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleBSEqualityExpression_in_entryRuleBSEqualityExpression4525);
            iv_ruleBSEqualityExpression=ruleBSEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBSEqualityExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBSEqualityExpression4535); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBSEqualityExpression"


    // $ANTLR start "ruleBSEqualityExpression"
    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2108:1: ruleBSEqualityExpression returns [EObject current=null] : (this_BSOrderedRelationExpression_0= ruleBSOrderedRelationExpression ( () ( ( (lv_operator_2_1= EqualsSignEqualsSign | lv_operator_2_2= ExclamationMarkEqualsSign ) ) ) ( (lv_right_3_0= ruleBSOrderedRelationExpression ) ) )* ) ;
    public final EObject ruleBSEqualityExpression() throws RecognitionException {
        EObject current = null;

        Token lv_operator_2_1=null;
        Token lv_operator_2_2=null;
        EObject this_BSOrderedRelationExpression_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2111:28: ( (this_BSOrderedRelationExpression_0= ruleBSOrderedRelationExpression ( () ( ( (lv_operator_2_1= EqualsSignEqualsSign | lv_operator_2_2= ExclamationMarkEqualsSign ) ) ) ( (lv_right_3_0= ruleBSOrderedRelationExpression ) ) )* ) )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2112:1: (this_BSOrderedRelationExpression_0= ruleBSOrderedRelationExpression ( () ( ( (lv_operator_2_1= EqualsSignEqualsSign | lv_operator_2_2= ExclamationMarkEqualsSign ) ) ) ( (lv_right_3_0= ruleBSOrderedRelationExpression ) ) )* )
            {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2112:1: (this_BSOrderedRelationExpression_0= ruleBSOrderedRelationExpression ( () ( ( (lv_operator_2_1= EqualsSignEqualsSign | lv_operator_2_2= ExclamationMarkEqualsSign ) ) ) ( (lv_right_3_0= ruleBSOrderedRelationExpression ) ) )* )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2113:5: this_BSOrderedRelationExpression_0= ruleBSOrderedRelationExpression ( () ( ( (lv_operator_2_1= EqualsSignEqualsSign | lv_operator_2_2= ExclamationMarkEqualsSign ) ) ) ( (lv_right_3_0= ruleBSOrderedRelationExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getBSEqualityExpressionAccess().getBSOrderedRelationExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleBSOrderedRelationExpression_in_ruleBSEqualityExpression4582);
            this_BSOrderedRelationExpression_0=ruleBSOrderedRelationExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = this_BSOrderedRelationExpression_0;
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2121:1: ( () ( ( (lv_operator_2_1= EqualsSignEqualsSign | lv_operator_2_2= ExclamationMarkEqualsSign ) ) ) ( (lv_right_3_0= ruleBSOrderedRelationExpression ) ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==ExclamationMarkEqualsSign||LA32_0==EqualsSignEqualsSign) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2121:2: () ( ( (lv_operator_2_1= EqualsSignEqualsSign | lv_operator_2_2= ExclamationMarkEqualsSign ) ) ) ( (lv_right_3_0= ruleBSOrderedRelationExpression ) )
            	    {
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2121:2: ()
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2122:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getBSEqualityExpressionAccess().getBSEqualityExpressionLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2127:2: ( ( (lv_operator_2_1= EqualsSignEqualsSign | lv_operator_2_2= ExclamationMarkEqualsSign ) ) )
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2128:1: ( (lv_operator_2_1= EqualsSignEqualsSign | lv_operator_2_2= ExclamationMarkEqualsSign ) )
            	    {
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2128:1: ( (lv_operator_2_1= EqualsSignEqualsSign | lv_operator_2_2= ExclamationMarkEqualsSign ) )
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2129:1: (lv_operator_2_1= EqualsSignEqualsSign | lv_operator_2_2= ExclamationMarkEqualsSign )
            	    {
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2129:1: (lv_operator_2_1= EqualsSignEqualsSign | lv_operator_2_2= ExclamationMarkEqualsSign )
            	    int alt31=2;
            	    int LA31_0 = input.LA(1);

            	    if ( (LA31_0==EqualsSignEqualsSign) ) {
            	        alt31=1;
            	    }
            	    else if ( (LA31_0==ExclamationMarkEqualsSign) ) {
            	        alt31=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 31, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt31) {
            	        case 1 :
            	            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2130:3: lv_operator_2_1= EqualsSignEqualsSign
            	            {
            	            lv_operator_2_1=(Token)match(input,EqualsSignEqualsSign,FOLLOW_EqualsSignEqualsSign_in_ruleBSEqualityExpression4612); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_operator_2_1, grammarAccess.getBSEqualityExpressionAccess().getOperatorEqualsSignEqualsSignKeyword_1_1_0_0());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getBSEqualityExpressionRule());
            	              	        }
            	                     		setWithLastConsumed(current, "operator", lv_operator_2_1, null);
            	              	    
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2143:8: lv_operator_2_2= ExclamationMarkEqualsSign
            	            {
            	            lv_operator_2_2=(Token)match(input,ExclamationMarkEqualsSign,FOLLOW_ExclamationMarkEqualsSign_in_ruleBSEqualityExpression4640); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_operator_2_2, grammarAccess.getBSEqualityExpressionAccess().getOperatorExclamationMarkEqualsSignKeyword_1_1_0_1());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getBSEqualityExpressionRule());
            	              	        }
            	                     		setWithLastConsumed(current, "operator", lv_operator_2_2, null);
            	              	    
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2159:2: ( (lv_right_3_0= ruleBSOrderedRelationExpression ) )
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2160:1: (lv_right_3_0= ruleBSOrderedRelationExpression )
            	    {
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2160:1: (lv_right_3_0= ruleBSOrderedRelationExpression )
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2161:3: lv_right_3_0= ruleBSOrderedRelationExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getBSEqualityExpressionAccess().getRightBSOrderedRelationExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleBSOrderedRelationExpression_in_ruleBSEqualityExpression4675);
            	    lv_right_3_0=ruleBSOrderedRelationExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getBSEqualityExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_3_0, 
            	              		"BSOrderedRelationExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBSEqualityExpression"


    // $ANTLR start "entryRuleBSOrderedRelationExpression"
    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2185:1: entryRuleBSOrderedRelationExpression returns [EObject current=null] : iv_ruleBSOrderedRelationExpression= ruleBSOrderedRelationExpression EOF ;
    public final EObject entryRuleBSOrderedRelationExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBSOrderedRelationExpression = null;


        try {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2186:2: (iv_ruleBSOrderedRelationExpression= ruleBSOrderedRelationExpression EOF )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2187:2: iv_ruleBSOrderedRelationExpression= ruleBSOrderedRelationExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBSOrderedRelationExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleBSOrderedRelationExpression_in_entryRuleBSOrderedRelationExpression4712);
            iv_ruleBSOrderedRelationExpression=ruleBSOrderedRelationExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBSOrderedRelationExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBSOrderedRelationExpression4722); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBSOrderedRelationExpression"


    // $ANTLR start "ruleBSOrderedRelationExpression"
    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2194:1: ruleBSOrderedRelationExpression returns [EObject current=null] : (this_BSBitwiseShiftExpression_0= ruleBSBitwiseShiftExpression ( () ( ( (lv_operator_2_1= LessThanSign | lv_operator_2_2= GreaterThanSign | lv_operator_2_3= LessThanSignEqualsSign | lv_operator_2_4= GreaterThanSignEqualsSign ) ) ) ( (lv_right_3_0= ruleBSBitwiseShiftExpression ) ) )* ) ;
    public final EObject ruleBSOrderedRelationExpression() throws RecognitionException {
        EObject current = null;

        Token lv_operator_2_1=null;
        Token lv_operator_2_2=null;
        Token lv_operator_2_3=null;
        Token lv_operator_2_4=null;
        EObject this_BSBitwiseShiftExpression_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2197:28: ( (this_BSBitwiseShiftExpression_0= ruleBSBitwiseShiftExpression ( () ( ( (lv_operator_2_1= LessThanSign | lv_operator_2_2= GreaterThanSign | lv_operator_2_3= LessThanSignEqualsSign | lv_operator_2_4= GreaterThanSignEqualsSign ) ) ) ( (lv_right_3_0= ruleBSBitwiseShiftExpression ) ) )* ) )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2198:1: (this_BSBitwiseShiftExpression_0= ruleBSBitwiseShiftExpression ( () ( ( (lv_operator_2_1= LessThanSign | lv_operator_2_2= GreaterThanSign | lv_operator_2_3= LessThanSignEqualsSign | lv_operator_2_4= GreaterThanSignEqualsSign ) ) ) ( (lv_right_3_0= ruleBSBitwiseShiftExpression ) ) )* )
            {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2198:1: (this_BSBitwiseShiftExpression_0= ruleBSBitwiseShiftExpression ( () ( ( (lv_operator_2_1= LessThanSign | lv_operator_2_2= GreaterThanSign | lv_operator_2_3= LessThanSignEqualsSign | lv_operator_2_4= GreaterThanSignEqualsSign ) ) ) ( (lv_right_3_0= ruleBSBitwiseShiftExpression ) ) )* )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2199:5: this_BSBitwiseShiftExpression_0= ruleBSBitwiseShiftExpression ( () ( ( (lv_operator_2_1= LessThanSign | lv_operator_2_2= GreaterThanSign | lv_operator_2_3= LessThanSignEqualsSign | lv_operator_2_4= GreaterThanSignEqualsSign ) ) ) ( (lv_right_3_0= ruleBSBitwiseShiftExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getBSOrderedRelationExpressionAccess().getBSBitwiseShiftExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleBSBitwiseShiftExpression_in_ruleBSOrderedRelationExpression4769);
            this_BSBitwiseShiftExpression_0=ruleBSBitwiseShiftExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = this_BSBitwiseShiftExpression_0;
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2207:1: ( () ( ( (lv_operator_2_1= LessThanSign | lv_operator_2_2= GreaterThanSign | lv_operator_2_3= LessThanSignEqualsSign | lv_operator_2_4= GreaterThanSignEqualsSign ) ) ) ( (lv_right_3_0= ruleBSBitwiseShiftExpression ) ) )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==LessThanSignEqualsSign||LA34_0==GreaterThanSignEqualsSign||LA34_0==LessThanSign||LA34_0==GreaterThanSign) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2207:2: () ( ( (lv_operator_2_1= LessThanSign | lv_operator_2_2= GreaterThanSign | lv_operator_2_3= LessThanSignEqualsSign | lv_operator_2_4= GreaterThanSignEqualsSign ) ) ) ( (lv_right_3_0= ruleBSBitwiseShiftExpression ) )
            	    {
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2207:2: ()
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2208:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getBSOrderedRelationExpressionAccess().getBSOrderedRelationExpressionLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2213:2: ( ( (lv_operator_2_1= LessThanSign | lv_operator_2_2= GreaterThanSign | lv_operator_2_3= LessThanSignEqualsSign | lv_operator_2_4= GreaterThanSignEqualsSign ) ) )
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2214:1: ( (lv_operator_2_1= LessThanSign | lv_operator_2_2= GreaterThanSign | lv_operator_2_3= LessThanSignEqualsSign | lv_operator_2_4= GreaterThanSignEqualsSign ) )
            	    {
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2214:1: ( (lv_operator_2_1= LessThanSign | lv_operator_2_2= GreaterThanSign | lv_operator_2_3= LessThanSignEqualsSign | lv_operator_2_4= GreaterThanSignEqualsSign ) )
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2215:1: (lv_operator_2_1= LessThanSign | lv_operator_2_2= GreaterThanSign | lv_operator_2_3= LessThanSignEqualsSign | lv_operator_2_4= GreaterThanSignEqualsSign )
            	    {
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2215:1: (lv_operator_2_1= LessThanSign | lv_operator_2_2= GreaterThanSign | lv_operator_2_3= LessThanSignEqualsSign | lv_operator_2_4= GreaterThanSignEqualsSign )
            	    int alt33=4;
            	    switch ( input.LA(1) ) {
            	    case LessThanSign:
            	        {
            	        alt33=1;
            	        }
            	        break;
            	    case GreaterThanSign:
            	        {
            	        alt33=2;
            	        }
            	        break;
            	    case LessThanSignEqualsSign:
            	        {
            	        alt33=3;
            	        }
            	        break;
            	    case GreaterThanSignEqualsSign:
            	        {
            	        alt33=4;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 33, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt33) {
            	        case 1 :
            	            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2216:3: lv_operator_2_1= LessThanSign
            	            {
            	            lv_operator_2_1=(Token)match(input,LessThanSign,FOLLOW_LessThanSign_in_ruleBSOrderedRelationExpression4799); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_operator_2_1, grammarAccess.getBSOrderedRelationExpressionAccess().getOperatorLessThanSignKeyword_1_1_0_0());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getBSOrderedRelationExpressionRule());
            	              	        }
            	                     		setWithLastConsumed(current, "operator", lv_operator_2_1, null);
            	              	    
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2229:8: lv_operator_2_2= GreaterThanSign
            	            {
            	            lv_operator_2_2=(Token)match(input,GreaterThanSign,FOLLOW_GreaterThanSign_in_ruleBSOrderedRelationExpression4827); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_operator_2_2, grammarAccess.getBSOrderedRelationExpressionAccess().getOperatorGreaterThanSignKeyword_1_1_0_1());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getBSOrderedRelationExpressionRule());
            	              	        }
            	                     		setWithLastConsumed(current, "operator", lv_operator_2_2, null);
            	              	    
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2242:8: lv_operator_2_3= LessThanSignEqualsSign
            	            {
            	            lv_operator_2_3=(Token)match(input,LessThanSignEqualsSign,FOLLOW_LessThanSignEqualsSign_in_ruleBSOrderedRelationExpression4855); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_operator_2_3, grammarAccess.getBSOrderedRelationExpressionAccess().getOperatorLessThanSignEqualsSignKeyword_1_1_0_2());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getBSOrderedRelationExpressionRule());
            	              	        }
            	                     		setWithLastConsumed(current, "operator", lv_operator_2_3, null);
            	              	    
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2255:8: lv_operator_2_4= GreaterThanSignEqualsSign
            	            {
            	            lv_operator_2_4=(Token)match(input,GreaterThanSignEqualsSign,FOLLOW_GreaterThanSignEqualsSign_in_ruleBSOrderedRelationExpression4883); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_operator_2_4, grammarAccess.getBSOrderedRelationExpressionAccess().getOperatorGreaterThanSignEqualsSignKeyword_1_1_0_3());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getBSOrderedRelationExpressionRule());
            	              	        }
            	                     		setWithLastConsumed(current, "operator", lv_operator_2_4, null);
            	              	    
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2271:2: ( (lv_right_3_0= ruleBSBitwiseShiftExpression ) )
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2272:1: (lv_right_3_0= ruleBSBitwiseShiftExpression )
            	    {
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2272:1: (lv_right_3_0= ruleBSBitwiseShiftExpression )
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2273:3: lv_right_3_0= ruleBSBitwiseShiftExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getBSOrderedRelationExpressionAccess().getRightBSBitwiseShiftExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleBSBitwiseShiftExpression_in_ruleBSOrderedRelationExpression4918);
            	    lv_right_3_0=ruleBSBitwiseShiftExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getBSOrderedRelationExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_3_0, 
            	              		"BSBitwiseShiftExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBSOrderedRelationExpression"


    // $ANTLR start "entryRuleBSBitwiseShiftExpression"
    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2297:1: entryRuleBSBitwiseShiftExpression returns [EObject current=null] : iv_ruleBSBitwiseShiftExpression= ruleBSBitwiseShiftExpression EOF ;
    public final EObject entryRuleBSBitwiseShiftExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBSBitwiseShiftExpression = null;


        try {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2298:2: (iv_ruleBSBitwiseShiftExpression= ruleBSBitwiseShiftExpression EOF )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2299:2: iv_ruleBSBitwiseShiftExpression= ruleBSBitwiseShiftExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBSBitwiseShiftExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleBSBitwiseShiftExpression_in_entryRuleBSBitwiseShiftExpression4955);
            iv_ruleBSBitwiseShiftExpression=ruleBSBitwiseShiftExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBSBitwiseShiftExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBSBitwiseShiftExpression4965); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBSBitwiseShiftExpression"


    // $ANTLR start "ruleBSBitwiseShiftExpression"
    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2306:1: ruleBSBitwiseShiftExpression returns [EObject current=null] : (this_BSPlusMinusOrStringConcatExpression_0= ruleBSPlusMinusOrStringConcatExpression ( () ( ( (lv_operator_2_1= LessThanSignLessThanSign | lv_operator_2_2= GreaterThanSignGreaterThanSign ) ) ) ( (lv_right_3_0= ruleBSPlusMinusOrStringConcatExpression ) ) )* ) ;
    public final EObject ruleBSBitwiseShiftExpression() throws RecognitionException {
        EObject current = null;

        Token lv_operator_2_1=null;
        Token lv_operator_2_2=null;
        EObject this_BSPlusMinusOrStringConcatExpression_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2309:28: ( (this_BSPlusMinusOrStringConcatExpression_0= ruleBSPlusMinusOrStringConcatExpression ( () ( ( (lv_operator_2_1= LessThanSignLessThanSign | lv_operator_2_2= GreaterThanSignGreaterThanSign ) ) ) ( (lv_right_3_0= ruleBSPlusMinusOrStringConcatExpression ) ) )* ) )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2310:1: (this_BSPlusMinusOrStringConcatExpression_0= ruleBSPlusMinusOrStringConcatExpression ( () ( ( (lv_operator_2_1= LessThanSignLessThanSign | lv_operator_2_2= GreaterThanSignGreaterThanSign ) ) ) ( (lv_right_3_0= ruleBSPlusMinusOrStringConcatExpression ) ) )* )
            {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2310:1: (this_BSPlusMinusOrStringConcatExpression_0= ruleBSPlusMinusOrStringConcatExpression ( () ( ( (lv_operator_2_1= LessThanSignLessThanSign | lv_operator_2_2= GreaterThanSignGreaterThanSign ) ) ) ( (lv_right_3_0= ruleBSPlusMinusOrStringConcatExpression ) ) )* )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2311:5: this_BSPlusMinusOrStringConcatExpression_0= ruleBSPlusMinusOrStringConcatExpression ( () ( ( (lv_operator_2_1= LessThanSignLessThanSign | lv_operator_2_2= GreaterThanSignGreaterThanSign ) ) ) ( (lv_right_3_0= ruleBSPlusMinusOrStringConcatExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getBSBitwiseShiftExpressionAccess().getBSPlusMinusOrStringConcatExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleBSPlusMinusOrStringConcatExpression_in_ruleBSBitwiseShiftExpression5012);
            this_BSPlusMinusOrStringConcatExpression_0=ruleBSPlusMinusOrStringConcatExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = this_BSPlusMinusOrStringConcatExpression_0;
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2319:1: ( () ( ( (lv_operator_2_1= LessThanSignLessThanSign | lv_operator_2_2= GreaterThanSignGreaterThanSign ) ) ) ( (lv_right_3_0= ruleBSPlusMinusOrStringConcatExpression ) ) )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==LessThanSignLessThanSign||LA36_0==GreaterThanSignGreaterThanSign) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2319:2: () ( ( (lv_operator_2_1= LessThanSignLessThanSign | lv_operator_2_2= GreaterThanSignGreaterThanSign ) ) ) ( (lv_right_3_0= ruleBSPlusMinusOrStringConcatExpression ) )
            	    {
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2319:2: ()
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2320:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getBSBitwiseShiftExpressionAccess().getBSBitwiseShiftExpressionLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2325:2: ( ( (lv_operator_2_1= LessThanSignLessThanSign | lv_operator_2_2= GreaterThanSignGreaterThanSign ) ) )
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2326:1: ( (lv_operator_2_1= LessThanSignLessThanSign | lv_operator_2_2= GreaterThanSignGreaterThanSign ) )
            	    {
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2326:1: ( (lv_operator_2_1= LessThanSignLessThanSign | lv_operator_2_2= GreaterThanSignGreaterThanSign ) )
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2327:1: (lv_operator_2_1= LessThanSignLessThanSign | lv_operator_2_2= GreaterThanSignGreaterThanSign )
            	    {
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2327:1: (lv_operator_2_1= LessThanSignLessThanSign | lv_operator_2_2= GreaterThanSignGreaterThanSign )
            	    int alt35=2;
            	    int LA35_0 = input.LA(1);

            	    if ( (LA35_0==LessThanSignLessThanSign) ) {
            	        alt35=1;
            	    }
            	    else if ( (LA35_0==GreaterThanSignGreaterThanSign) ) {
            	        alt35=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 35, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt35) {
            	        case 1 :
            	            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2328:3: lv_operator_2_1= LessThanSignLessThanSign
            	            {
            	            lv_operator_2_1=(Token)match(input,LessThanSignLessThanSign,FOLLOW_LessThanSignLessThanSign_in_ruleBSBitwiseShiftExpression5042); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_operator_2_1, grammarAccess.getBSBitwiseShiftExpressionAccess().getOperatorLessThanSignLessThanSignKeyword_1_1_0_0());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getBSBitwiseShiftExpressionRule());
            	              	        }
            	                     		setWithLastConsumed(current, "operator", lv_operator_2_1, null);
            	              	    
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2341:8: lv_operator_2_2= GreaterThanSignGreaterThanSign
            	            {
            	            lv_operator_2_2=(Token)match(input,GreaterThanSignGreaterThanSign,FOLLOW_GreaterThanSignGreaterThanSign_in_ruleBSBitwiseShiftExpression5070); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_operator_2_2, grammarAccess.getBSBitwiseShiftExpressionAccess().getOperatorGreaterThanSignGreaterThanSignKeyword_1_1_0_1());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getBSBitwiseShiftExpressionRule());
            	              	        }
            	                     		setWithLastConsumed(current, "operator", lv_operator_2_2, null);
            	              	    
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2357:2: ( (lv_right_3_0= ruleBSPlusMinusOrStringConcatExpression ) )
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2358:1: (lv_right_3_0= ruleBSPlusMinusOrStringConcatExpression )
            	    {
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2358:1: (lv_right_3_0= ruleBSPlusMinusOrStringConcatExpression )
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2359:3: lv_right_3_0= ruleBSPlusMinusOrStringConcatExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getBSBitwiseShiftExpressionAccess().getRightBSPlusMinusOrStringConcatExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleBSPlusMinusOrStringConcatExpression_in_ruleBSBitwiseShiftExpression5105);
            	    lv_right_3_0=ruleBSPlusMinusOrStringConcatExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getBSBitwiseShiftExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_3_0, 
            	              		"BSPlusMinusOrStringConcatExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBSBitwiseShiftExpression"


    // $ANTLR start "entryRuleBSPlusMinusOrStringConcatExpression"
    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2383:1: entryRuleBSPlusMinusOrStringConcatExpression returns [EObject current=null] : iv_ruleBSPlusMinusOrStringConcatExpression= ruleBSPlusMinusOrStringConcatExpression EOF ;
    public final EObject entryRuleBSPlusMinusOrStringConcatExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBSPlusMinusOrStringConcatExpression = null;


        try {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2384:2: (iv_ruleBSPlusMinusOrStringConcatExpression= ruleBSPlusMinusOrStringConcatExpression EOF )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2385:2: iv_ruleBSPlusMinusOrStringConcatExpression= ruleBSPlusMinusOrStringConcatExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBSPlusMinusOrStringConcatExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleBSPlusMinusOrStringConcatExpression_in_entryRuleBSPlusMinusOrStringConcatExpression5142);
            iv_ruleBSPlusMinusOrStringConcatExpression=ruleBSPlusMinusOrStringConcatExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBSPlusMinusOrStringConcatExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBSPlusMinusOrStringConcatExpression5152); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBSPlusMinusOrStringConcatExpression"


    // $ANTLR start "ruleBSPlusMinusOrStringConcatExpression"
    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2392:1: ruleBSPlusMinusOrStringConcatExpression returns [EObject current=null] : (this_BSMulDivOrModExpression_0= ruleBSMulDivOrModExpression ( () ( ( (lv_operator_2_1= PlusSign | lv_operator_2_2= HyphenMinus | lv_operator_2_3= CommercialAt | lv_operator_2_4= SPC | lv_operator_2_5= NL | lv_operator_2_6= TAB ) ) ) ( (lv_right_3_0= ruleBSMulDivOrModExpression ) ) )* ) ;
    public final EObject ruleBSPlusMinusOrStringConcatExpression() throws RecognitionException {
        EObject current = null;

        Token lv_operator_2_1=null;
        Token lv_operator_2_2=null;
        Token lv_operator_2_3=null;
        Token lv_operator_2_4=null;
        Token lv_operator_2_5=null;
        Token lv_operator_2_6=null;
        EObject this_BSMulDivOrModExpression_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2395:28: ( (this_BSMulDivOrModExpression_0= ruleBSMulDivOrModExpression ( () ( ( (lv_operator_2_1= PlusSign | lv_operator_2_2= HyphenMinus | lv_operator_2_3= CommercialAt | lv_operator_2_4= SPC | lv_operator_2_5= NL | lv_operator_2_6= TAB ) ) ) ( (lv_right_3_0= ruleBSMulDivOrModExpression ) ) )* ) )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2396:1: (this_BSMulDivOrModExpression_0= ruleBSMulDivOrModExpression ( () ( ( (lv_operator_2_1= PlusSign | lv_operator_2_2= HyphenMinus | lv_operator_2_3= CommercialAt | lv_operator_2_4= SPC | lv_operator_2_5= NL | lv_operator_2_6= TAB ) ) ) ( (lv_right_3_0= ruleBSMulDivOrModExpression ) ) )* )
            {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2396:1: (this_BSMulDivOrModExpression_0= ruleBSMulDivOrModExpression ( () ( ( (lv_operator_2_1= PlusSign | lv_operator_2_2= HyphenMinus | lv_operator_2_3= CommercialAt | lv_operator_2_4= SPC | lv_operator_2_5= NL | lv_operator_2_6= TAB ) ) ) ( (lv_right_3_0= ruleBSMulDivOrModExpression ) ) )* )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2397:5: this_BSMulDivOrModExpression_0= ruleBSMulDivOrModExpression ( () ( ( (lv_operator_2_1= PlusSign | lv_operator_2_2= HyphenMinus | lv_operator_2_3= CommercialAt | lv_operator_2_4= SPC | lv_operator_2_5= NL | lv_operator_2_6= TAB ) ) ) ( (lv_right_3_0= ruleBSMulDivOrModExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getBSPlusMinusOrStringConcatExpressionAccess().getBSMulDivOrModExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleBSMulDivOrModExpression_in_ruleBSPlusMinusOrStringConcatExpression5199);
            this_BSMulDivOrModExpression_0=ruleBSMulDivOrModExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = this_BSMulDivOrModExpression_0;
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2405:1: ( () ( ( (lv_operator_2_1= PlusSign | lv_operator_2_2= HyphenMinus | lv_operator_2_3= CommercialAt | lv_operator_2_4= SPC | lv_operator_2_5= NL | lv_operator_2_6= TAB ) ) ) ( (lv_right_3_0= ruleBSMulDivOrModExpression ) ) )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( ((LA38_0>=SPC && LA38_0<=TAB)||LA38_0==NL||LA38_0==PlusSign||LA38_0==HyphenMinus||LA38_0==CommercialAt) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2405:2: () ( ( (lv_operator_2_1= PlusSign | lv_operator_2_2= HyphenMinus | lv_operator_2_3= CommercialAt | lv_operator_2_4= SPC | lv_operator_2_5= NL | lv_operator_2_6= TAB ) ) ) ( (lv_right_3_0= ruleBSMulDivOrModExpression ) )
            	    {
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2405:2: ()
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2406:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getBSPlusMinusOrStringConcatExpressionAccess().getBSPlusMinusOrStringConcatExpressionLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2411:2: ( ( (lv_operator_2_1= PlusSign | lv_operator_2_2= HyphenMinus | lv_operator_2_3= CommercialAt | lv_operator_2_4= SPC | lv_operator_2_5= NL | lv_operator_2_6= TAB ) ) )
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2412:1: ( (lv_operator_2_1= PlusSign | lv_operator_2_2= HyphenMinus | lv_operator_2_3= CommercialAt | lv_operator_2_4= SPC | lv_operator_2_5= NL | lv_operator_2_6= TAB ) )
            	    {
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2412:1: ( (lv_operator_2_1= PlusSign | lv_operator_2_2= HyphenMinus | lv_operator_2_3= CommercialAt | lv_operator_2_4= SPC | lv_operator_2_5= NL | lv_operator_2_6= TAB ) )
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2413:1: (lv_operator_2_1= PlusSign | lv_operator_2_2= HyphenMinus | lv_operator_2_3= CommercialAt | lv_operator_2_4= SPC | lv_operator_2_5= NL | lv_operator_2_6= TAB )
            	    {
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2413:1: (lv_operator_2_1= PlusSign | lv_operator_2_2= HyphenMinus | lv_operator_2_3= CommercialAt | lv_operator_2_4= SPC | lv_operator_2_5= NL | lv_operator_2_6= TAB )
            	    int alt37=6;
            	    switch ( input.LA(1) ) {
            	    case PlusSign:
            	        {
            	        alt37=1;
            	        }
            	        break;
            	    case HyphenMinus:
            	        {
            	        alt37=2;
            	        }
            	        break;
            	    case CommercialAt:
            	        {
            	        alt37=3;
            	        }
            	        break;
            	    case SPC:
            	        {
            	        alt37=4;
            	        }
            	        break;
            	    case NL:
            	        {
            	        alt37=5;
            	        }
            	        break;
            	    case TAB:
            	        {
            	        alt37=6;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 37, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt37) {
            	        case 1 :
            	            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2414:3: lv_operator_2_1= PlusSign
            	            {
            	            lv_operator_2_1=(Token)match(input,PlusSign,FOLLOW_PlusSign_in_ruleBSPlusMinusOrStringConcatExpression5229); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_operator_2_1, grammarAccess.getBSPlusMinusOrStringConcatExpressionAccess().getOperatorPlusSignKeyword_1_1_0_0());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getBSPlusMinusOrStringConcatExpressionRule());
            	              	        }
            	                     		setWithLastConsumed(current, "operator", lv_operator_2_1, null);
            	              	    
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2427:8: lv_operator_2_2= HyphenMinus
            	            {
            	            lv_operator_2_2=(Token)match(input,HyphenMinus,FOLLOW_HyphenMinus_in_ruleBSPlusMinusOrStringConcatExpression5257); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_operator_2_2, grammarAccess.getBSPlusMinusOrStringConcatExpressionAccess().getOperatorHyphenMinusKeyword_1_1_0_1());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getBSPlusMinusOrStringConcatExpressionRule());
            	              	        }
            	                     		setWithLastConsumed(current, "operator", lv_operator_2_2, null);
            	              	    
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2440:8: lv_operator_2_3= CommercialAt
            	            {
            	            lv_operator_2_3=(Token)match(input,CommercialAt,FOLLOW_CommercialAt_in_ruleBSPlusMinusOrStringConcatExpression5285); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_operator_2_3, grammarAccess.getBSPlusMinusOrStringConcatExpressionAccess().getOperatorCommercialAtKeyword_1_1_0_2());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getBSPlusMinusOrStringConcatExpressionRule());
            	              	        }
            	                     		setWithLastConsumed(current, "operator", lv_operator_2_3, null);
            	              	    
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2453:8: lv_operator_2_4= SPC
            	            {
            	            lv_operator_2_4=(Token)match(input,SPC,FOLLOW_SPC_in_ruleBSPlusMinusOrStringConcatExpression5313); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_operator_2_4, grammarAccess.getBSPlusMinusOrStringConcatExpressionAccess().getOperatorSPCKeyword_1_1_0_3());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getBSPlusMinusOrStringConcatExpressionRule());
            	              	        }
            	                     		setWithLastConsumed(current, "operator", lv_operator_2_4, null);
            	              	    
            	            }

            	            }
            	            break;
            	        case 5 :
            	            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2466:8: lv_operator_2_5= NL
            	            {
            	            lv_operator_2_5=(Token)match(input,NL,FOLLOW_NL_in_ruleBSPlusMinusOrStringConcatExpression5341); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_operator_2_5, grammarAccess.getBSPlusMinusOrStringConcatExpressionAccess().getOperatorNLKeyword_1_1_0_4());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getBSPlusMinusOrStringConcatExpressionRule());
            	              	        }
            	                     		setWithLastConsumed(current, "operator", lv_operator_2_5, null);
            	              	    
            	            }

            	            }
            	            break;
            	        case 6 :
            	            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2479:8: lv_operator_2_6= TAB
            	            {
            	            lv_operator_2_6=(Token)match(input,TAB,FOLLOW_TAB_in_ruleBSPlusMinusOrStringConcatExpression5369); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_operator_2_6, grammarAccess.getBSPlusMinusOrStringConcatExpressionAccess().getOperatorTABKeyword_1_1_0_5());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getBSPlusMinusOrStringConcatExpressionRule());
            	              	        }
            	                     		setWithLastConsumed(current, "operator", lv_operator_2_6, null);
            	              	    
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2495:2: ( (lv_right_3_0= ruleBSMulDivOrModExpression ) )
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2496:1: (lv_right_3_0= ruleBSMulDivOrModExpression )
            	    {
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2496:1: (lv_right_3_0= ruleBSMulDivOrModExpression )
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2497:3: lv_right_3_0= ruleBSMulDivOrModExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getBSPlusMinusOrStringConcatExpressionAccess().getRightBSMulDivOrModExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleBSMulDivOrModExpression_in_ruleBSPlusMinusOrStringConcatExpression5404);
            	    lv_right_3_0=ruleBSMulDivOrModExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getBSPlusMinusOrStringConcatExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_3_0, 
            	              		"BSMulDivOrModExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBSPlusMinusOrStringConcatExpression"


    // $ANTLR start "entryRuleBSMulDivOrModExpression"
    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2521:1: entryRuleBSMulDivOrModExpression returns [EObject current=null] : iv_ruleBSMulDivOrModExpression= ruleBSMulDivOrModExpression EOF ;
    public final EObject entryRuleBSMulDivOrModExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBSMulDivOrModExpression = null;


        try {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2522:2: (iv_ruleBSMulDivOrModExpression= ruleBSMulDivOrModExpression EOF )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2523:2: iv_ruleBSMulDivOrModExpression= ruleBSMulDivOrModExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBSMulDivOrModExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleBSMulDivOrModExpression_in_entryRuleBSMulDivOrModExpression5441);
            iv_ruleBSMulDivOrModExpression=ruleBSMulDivOrModExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBSMulDivOrModExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBSMulDivOrModExpression5451); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBSMulDivOrModExpression"


    // $ANTLR start "ruleBSMulDivOrModExpression"
    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2530:1: ruleBSMulDivOrModExpression returns [EObject current=null] : (this_BSCastOrNewExpression_0= ruleBSCastOrNewExpression ( () ( ( (lv_operator_2_1= Asterisk | lv_operator_2_2= Solidus | lv_operator_2_3= PercentSign ) ) ) ( (lv_right_3_0= ruleBSCastOrNewExpression ) ) )* ) ;
    public final EObject ruleBSMulDivOrModExpression() throws RecognitionException {
        EObject current = null;

        Token lv_operator_2_1=null;
        Token lv_operator_2_2=null;
        Token lv_operator_2_3=null;
        EObject this_BSCastOrNewExpression_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2533:28: ( (this_BSCastOrNewExpression_0= ruleBSCastOrNewExpression ( () ( ( (lv_operator_2_1= Asterisk | lv_operator_2_2= Solidus | lv_operator_2_3= PercentSign ) ) ) ( (lv_right_3_0= ruleBSCastOrNewExpression ) ) )* ) )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2534:1: (this_BSCastOrNewExpression_0= ruleBSCastOrNewExpression ( () ( ( (lv_operator_2_1= Asterisk | lv_operator_2_2= Solidus | lv_operator_2_3= PercentSign ) ) ) ( (lv_right_3_0= ruleBSCastOrNewExpression ) ) )* )
            {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2534:1: (this_BSCastOrNewExpression_0= ruleBSCastOrNewExpression ( () ( ( (lv_operator_2_1= Asterisk | lv_operator_2_2= Solidus | lv_operator_2_3= PercentSign ) ) ) ( (lv_right_3_0= ruleBSCastOrNewExpression ) ) )* )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2535:5: this_BSCastOrNewExpression_0= ruleBSCastOrNewExpression ( () ( ( (lv_operator_2_1= Asterisk | lv_operator_2_2= Solidus | lv_operator_2_3= PercentSign ) ) ) ( (lv_right_3_0= ruleBSCastOrNewExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getBSMulDivOrModExpressionAccess().getBSCastOrNewExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleBSCastOrNewExpression_in_ruleBSMulDivOrModExpression5498);
            this_BSCastOrNewExpression_0=ruleBSCastOrNewExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = this_BSCastOrNewExpression_0;
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2543:1: ( () ( ( (lv_operator_2_1= Asterisk | lv_operator_2_2= Solidus | lv_operator_2_3= PercentSign ) ) ) ( (lv_right_3_0= ruleBSCastOrNewExpression ) ) )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==PercentSign||LA40_0==Asterisk||LA40_0==Solidus) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2543:2: () ( ( (lv_operator_2_1= Asterisk | lv_operator_2_2= Solidus | lv_operator_2_3= PercentSign ) ) ) ( (lv_right_3_0= ruleBSCastOrNewExpression ) )
            	    {
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2543:2: ()
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2544:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getBSMulDivOrModExpressionAccess().getBSMulDivOrModExpressionLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2549:2: ( ( (lv_operator_2_1= Asterisk | lv_operator_2_2= Solidus | lv_operator_2_3= PercentSign ) ) )
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2550:1: ( (lv_operator_2_1= Asterisk | lv_operator_2_2= Solidus | lv_operator_2_3= PercentSign ) )
            	    {
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2550:1: ( (lv_operator_2_1= Asterisk | lv_operator_2_2= Solidus | lv_operator_2_3= PercentSign ) )
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2551:1: (lv_operator_2_1= Asterisk | lv_operator_2_2= Solidus | lv_operator_2_3= PercentSign )
            	    {
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2551:1: (lv_operator_2_1= Asterisk | lv_operator_2_2= Solidus | lv_operator_2_3= PercentSign )
            	    int alt39=3;
            	    switch ( input.LA(1) ) {
            	    case Asterisk:
            	        {
            	        alt39=1;
            	        }
            	        break;
            	    case Solidus:
            	        {
            	        alt39=2;
            	        }
            	        break;
            	    case PercentSign:
            	        {
            	        alt39=3;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 39, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt39) {
            	        case 1 :
            	            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2552:3: lv_operator_2_1= Asterisk
            	            {
            	            lv_operator_2_1=(Token)match(input,Asterisk,FOLLOW_Asterisk_in_ruleBSMulDivOrModExpression5528); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_operator_2_1, grammarAccess.getBSMulDivOrModExpressionAccess().getOperatorAsteriskKeyword_1_1_0_0());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getBSMulDivOrModExpressionRule());
            	              	        }
            	                     		setWithLastConsumed(current, "operator", lv_operator_2_1, null);
            	              	    
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2565:8: lv_operator_2_2= Solidus
            	            {
            	            lv_operator_2_2=(Token)match(input,Solidus,FOLLOW_Solidus_in_ruleBSMulDivOrModExpression5556); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_operator_2_2, grammarAccess.getBSMulDivOrModExpressionAccess().getOperatorSolidusKeyword_1_1_0_1());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getBSMulDivOrModExpressionRule());
            	              	        }
            	                     		setWithLastConsumed(current, "operator", lv_operator_2_2, null);
            	              	    
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2578:8: lv_operator_2_3= PercentSign
            	            {
            	            lv_operator_2_3=(Token)match(input,PercentSign,FOLLOW_PercentSign_in_ruleBSMulDivOrModExpression5584); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_operator_2_3, grammarAccess.getBSMulDivOrModExpressionAccess().getOperatorPercentSignKeyword_1_1_0_2());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getBSMulDivOrModExpressionRule());
            	              	        }
            	                     		setWithLastConsumed(current, "operator", lv_operator_2_3, null);
            	              	    
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2594:2: ( (lv_right_3_0= ruleBSCastOrNewExpression ) )
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2595:1: (lv_right_3_0= ruleBSCastOrNewExpression )
            	    {
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2595:1: (lv_right_3_0= ruleBSCastOrNewExpression )
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2596:3: lv_right_3_0= ruleBSCastOrNewExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getBSMulDivOrModExpressionAccess().getRightBSCastOrNewExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleBSCastOrNewExpression_in_ruleBSMulDivOrModExpression5619);
            	    lv_right_3_0=ruleBSCastOrNewExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getBSMulDivOrModExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_3_0, 
            	              		"BSCastOrNewExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBSMulDivOrModExpression"


    // $ANTLR start "entryRuleBSCastOrNewExpression"
    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2620:1: entryRuleBSCastOrNewExpression returns [EObject current=null] : iv_ruleBSCastOrNewExpression= ruleBSCastOrNewExpression EOF ;
    public final EObject entryRuleBSCastOrNewExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBSCastOrNewExpression = null;


        try {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2621:2: (iv_ruleBSCastOrNewExpression= ruleBSCastOrNewExpression EOF )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2622:2: iv_ruleBSCastOrNewExpression= ruleBSCastOrNewExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBSCastOrNewExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleBSCastOrNewExpression_in_entryRuleBSCastOrNewExpression5656);
            iv_ruleBSCastOrNewExpression=ruleBSCastOrNewExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBSCastOrNewExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBSCastOrNewExpression5666); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBSCastOrNewExpression"


    // $ANTLR start "ruleBSCastOrNewExpression"
    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2629:1: ruleBSCastOrNewExpression returns [EObject current=null] : (this_BSUnaryModifierExpression_0= ruleBSUnaryModifierExpression | ( () otherlv_2= LeftParenthesis ( ( (lv_castType_3_1= String | lv_castType_3_2= Number | lv_castType_3_3= Object ) ) ) otherlv_4= RightParenthesis ( (lv_castExpr_5_0= ruleBSCastOrNewExpression ) ) ) | ( () otherlv_7= New ( ( (lv_isArray_8_0= LeftSquareBracket ) ) otherlv_9= RightSquareBracket )? ( ( ruleQualifiedName ) ) otherlv_11= LeftParenthesis ( ( (lv_args_12_0= ruleBSExpression ) ) (otherlv_13= Comma ( (lv_args_14_0= ruleBSExpression ) ) )* )? otherlv_15= RightParenthesis ) ) ;
    public final EObject ruleBSCastOrNewExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_castType_3_1=null;
        Token lv_castType_3_2=null;
        Token lv_castType_3_3=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        Token lv_isArray_8_0=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        EObject this_BSUnaryModifierExpression_0 = null;

        EObject lv_castExpr_5_0 = null;

        EObject lv_args_12_0 = null;

        EObject lv_args_14_0 = null;


         enterRule(); 
            
        try {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2632:28: ( (this_BSUnaryModifierExpression_0= ruleBSUnaryModifierExpression | ( () otherlv_2= LeftParenthesis ( ( (lv_castType_3_1= String | lv_castType_3_2= Number | lv_castType_3_3= Object ) ) ) otherlv_4= RightParenthesis ( (lv_castExpr_5_0= ruleBSCastOrNewExpression ) ) ) | ( () otherlv_7= New ( ( (lv_isArray_8_0= LeftSquareBracket ) ) otherlv_9= RightSquareBracket )? ( ( ruleQualifiedName ) ) otherlv_11= LeftParenthesis ( ( (lv_args_12_0= ruleBSExpression ) ) (otherlv_13= Comma ( (lv_args_14_0= ruleBSExpression ) ) )* )? otherlv_15= RightParenthesis ) ) )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2633:1: (this_BSUnaryModifierExpression_0= ruleBSUnaryModifierExpression | ( () otherlv_2= LeftParenthesis ( ( (lv_castType_3_1= String | lv_castType_3_2= Number | lv_castType_3_3= Object ) ) ) otherlv_4= RightParenthesis ( (lv_castExpr_5_0= ruleBSCastOrNewExpression ) ) ) | ( () otherlv_7= New ( ( (lv_isArray_8_0= LeftSquareBracket ) ) otherlv_9= RightSquareBracket )? ( ( ruleQualifiedName ) ) otherlv_11= LeftParenthesis ( ( (lv_args_12_0= ruleBSExpression ) ) (otherlv_13= Comma ( (lv_args_14_0= ruleBSExpression ) ) )* )? otherlv_15= RightParenthesis ) )
            {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2633:1: (this_BSUnaryModifierExpression_0= ruleBSUnaryModifierExpression | ( () otherlv_2= LeftParenthesis ( ( (lv_castType_3_1= String | lv_castType_3_2= Number | lv_castType_3_3= Object ) ) ) otherlv_4= RightParenthesis ( (lv_castExpr_5_0= ruleBSCastOrNewExpression ) ) ) | ( () otherlv_7= New ( ( (lv_isArray_8_0= LeftSquareBracket ) ) otherlv_9= RightSquareBracket )? ( ( ruleQualifiedName ) ) otherlv_11= LeftParenthesis ( ( (lv_args_12_0= ruleBSExpression ) ) (otherlv_13= Comma ( (lv_args_14_0= ruleBSExpression ) ) )* )? otherlv_15= RightParenthesis ) )
            int alt45=3;
            switch ( input.LA(1) ) {
            case Continue:
            case Client:
            case Parent:
            case Break:
            case False:
            case Null:
            case This:
            case True:
            case ExclamationMark:
            case PlusSign:
            case HyphenMinus:
            case Tilde:
            case RULE_HEX_VALUE:
            case RULE_ID:
            case RULE_INT:
            case RULE_STRING:
                {
                alt45=1;
                }
                break;
            case LeftParenthesis:
                {
                int LA45_2 = input.LA(2);

                if ( (LA45_2==Continue||LA45_2==Client||LA45_2==Parent||LA45_2==Break||LA45_2==False||(LA45_2>=Null && LA45_2<=True)||LA45_2==New||LA45_2==ExclamationMark||LA45_2==LeftParenthesis||LA45_2==PlusSign||LA45_2==HyphenMinus||(LA45_2>=Tilde && LA45_2<=RULE_INT)||LA45_2==RULE_STRING) ) {
                    alt45=1;
                }
                else if ( ((LA45_2>=Number && LA45_2<=Object)||LA45_2==String) ) {
                    alt45=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 45, 2, input);

                    throw nvae;
                }
                }
                break;
            case New:
                {
                alt45=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }

            switch (alt45) {
                case 1 :
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2634:5: this_BSUnaryModifierExpression_0= ruleBSUnaryModifierExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBSCastOrNewExpressionAccess().getBSUnaryModifierExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBSUnaryModifierExpression_in_ruleBSCastOrNewExpression5713);
                    this_BSUnaryModifierExpression_0=ruleBSUnaryModifierExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_BSUnaryModifierExpression_0;
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2643:6: ( () otherlv_2= LeftParenthesis ( ( (lv_castType_3_1= String | lv_castType_3_2= Number | lv_castType_3_3= Object ) ) ) otherlv_4= RightParenthesis ( (lv_castExpr_5_0= ruleBSCastOrNewExpression ) ) )
                    {
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2643:6: ( () otherlv_2= LeftParenthesis ( ( (lv_castType_3_1= String | lv_castType_3_2= Number | lv_castType_3_3= Object ) ) ) otherlv_4= RightParenthesis ( (lv_castExpr_5_0= ruleBSCastOrNewExpression ) ) )
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2643:7: () otherlv_2= LeftParenthesis ( ( (lv_castType_3_1= String | lv_castType_3_2= Number | lv_castType_3_3= Object ) ) ) otherlv_4= RightParenthesis ( (lv_castExpr_5_0= ruleBSCastOrNewExpression ) )
                    {
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2643:7: ()
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2644:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getBSCastOrNewExpressionAccess().getBSCastExpressionAction_1_0(),
                                  current);
                          
                    }

                    }

                    otherlv_2=(Token)match(input,LeftParenthesis,FOLLOW_LeftParenthesis_in_ruleBSCastOrNewExpression5741); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getBSCastOrNewExpressionAccess().getLeftParenthesisKeyword_1_1());
                          
                    }
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2654:1: ( ( (lv_castType_3_1= String | lv_castType_3_2= Number | lv_castType_3_3= Object ) ) )
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2655:1: ( (lv_castType_3_1= String | lv_castType_3_2= Number | lv_castType_3_3= Object ) )
                    {
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2655:1: ( (lv_castType_3_1= String | lv_castType_3_2= Number | lv_castType_3_3= Object ) )
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2656:1: (lv_castType_3_1= String | lv_castType_3_2= Number | lv_castType_3_3= Object )
                    {
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2656:1: (lv_castType_3_1= String | lv_castType_3_2= Number | lv_castType_3_3= Object )
                    int alt41=3;
                    switch ( input.LA(1) ) {
                    case String:
                        {
                        alt41=1;
                        }
                        break;
                    case Number:
                        {
                        alt41=2;
                        }
                        break;
                    case Object:
                        {
                        alt41=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 41, 0, input);

                        throw nvae;
                    }

                    switch (alt41) {
                        case 1 :
                            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2657:3: lv_castType_3_1= String
                            {
                            lv_castType_3_1=(Token)match(input,String,FOLLOW_String_in_ruleBSCastOrNewExpression5761); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_castType_3_1, grammarAccess.getBSCastOrNewExpressionAccess().getCastTypeStringKeyword_1_2_0_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getBSCastOrNewExpressionRule());
                              	        }
                                     		setWithLastConsumed(current, "castType", lv_castType_3_1, null);
                              	    
                            }

                            }
                            break;
                        case 2 :
                            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2670:8: lv_castType_3_2= Number
                            {
                            lv_castType_3_2=(Token)match(input,Number,FOLLOW_Number_in_ruleBSCastOrNewExpression5789); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_castType_3_2, grammarAccess.getBSCastOrNewExpressionAccess().getCastTypeNumberKeyword_1_2_0_1());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getBSCastOrNewExpressionRule());
                              	        }
                                     		setWithLastConsumed(current, "castType", lv_castType_3_2, null);
                              	    
                            }

                            }
                            break;
                        case 3 :
                            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2683:8: lv_castType_3_3= Object
                            {
                            lv_castType_3_3=(Token)match(input,Object,FOLLOW_Object_in_ruleBSCastOrNewExpression5817); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_castType_3_3, grammarAccess.getBSCastOrNewExpressionAccess().getCastTypeObjectKeyword_1_2_0_2());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getBSCastOrNewExpressionRule());
                              	        }
                                     		setWithLastConsumed(current, "castType", lv_castType_3_3, null);
                              	    
                            }

                            }
                            break;

                    }


                    }


                    }

                    otherlv_4=(Token)match(input,RightParenthesis,FOLLOW_RightParenthesis_in_ruleBSCastOrNewExpression5844); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getBSCastOrNewExpressionAccess().getRightParenthesisKeyword_1_3());
                          
                    }
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2704:1: ( (lv_castExpr_5_0= ruleBSCastOrNewExpression ) )
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2705:1: (lv_castExpr_5_0= ruleBSCastOrNewExpression )
                    {
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2705:1: (lv_castExpr_5_0= ruleBSCastOrNewExpression )
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2706:3: lv_castExpr_5_0= ruleBSCastOrNewExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getBSCastOrNewExpressionAccess().getCastExprBSCastOrNewExpressionParserRuleCall_1_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBSCastOrNewExpression_in_ruleBSCastOrNewExpression5864);
                    lv_castExpr_5_0=ruleBSCastOrNewExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getBSCastOrNewExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"castExpr",
                              		lv_castExpr_5_0, 
                              		"BSCastOrNewExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2723:6: ( () otherlv_7= New ( ( (lv_isArray_8_0= LeftSquareBracket ) ) otherlv_9= RightSquareBracket )? ( ( ruleQualifiedName ) ) otherlv_11= LeftParenthesis ( ( (lv_args_12_0= ruleBSExpression ) ) (otherlv_13= Comma ( (lv_args_14_0= ruleBSExpression ) ) )* )? otherlv_15= RightParenthesis )
                    {
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2723:6: ( () otherlv_7= New ( ( (lv_isArray_8_0= LeftSquareBracket ) ) otherlv_9= RightSquareBracket )? ( ( ruleQualifiedName ) ) otherlv_11= LeftParenthesis ( ( (lv_args_12_0= ruleBSExpression ) ) (otherlv_13= Comma ( (lv_args_14_0= ruleBSExpression ) ) )* )? otherlv_15= RightParenthesis )
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2723:7: () otherlv_7= New ( ( (lv_isArray_8_0= LeftSquareBracket ) ) otherlv_9= RightSquareBracket )? ( ( ruleQualifiedName ) ) otherlv_11= LeftParenthesis ( ( (lv_args_12_0= ruleBSExpression ) ) (otherlv_13= Comma ( (lv_args_14_0= ruleBSExpression ) ) )* )? otherlv_15= RightParenthesis
                    {
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2723:7: ()
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2724:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getBSCastOrNewExpressionAccess().getBSNewExpressionAction_2_0(),
                                  current);
                          
                    }

                    }

                    otherlv_7=(Token)match(input,New,FOLLOW_New_in_ruleBSCastOrNewExpression5894); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getBSCastOrNewExpressionAccess().getNewKeyword_2_1());
                          
                    }
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2734:1: ( ( (lv_isArray_8_0= LeftSquareBracket ) ) otherlv_9= RightSquareBracket )?
                    int alt42=2;
                    int LA42_0 = input.LA(1);

                    if ( (LA42_0==LeftSquareBracket) ) {
                        alt42=1;
                    }
                    switch (alt42) {
                        case 1 :
                            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2734:2: ( (lv_isArray_8_0= LeftSquareBracket ) ) otherlv_9= RightSquareBracket
                            {
                            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2734:2: ( (lv_isArray_8_0= LeftSquareBracket ) )
                            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2735:1: (lv_isArray_8_0= LeftSquareBracket )
                            {
                            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2735:1: (lv_isArray_8_0= LeftSquareBracket )
                            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2736:3: lv_isArray_8_0= LeftSquareBracket
                            {
                            lv_isArray_8_0=(Token)match(input,LeftSquareBracket,FOLLOW_LeftSquareBracket_in_ruleBSCastOrNewExpression5913); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_isArray_8_0, grammarAccess.getBSCastOrNewExpressionAccess().getIsArrayLeftSquareBracketKeyword_2_2_0_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getBSCastOrNewExpressionRule());
                              	        }
                                     		setWithLastConsumed(current, "isArray", true, "[");
                              	    
                            }

                            }


                            }

                            otherlv_9=(Token)match(input,RightSquareBracket,FOLLOW_RightSquareBracket_in_ruleBSCastOrNewExpression5937); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_9, grammarAccess.getBSCastOrNewExpressionAccess().getRightSquareBracketKeyword_2_2_1());
                                  
                            }

                            }
                            break;

                    }

                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2755:3: ( ( ruleQualifiedName ) )
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2756:1: ( ruleQualifiedName )
                    {
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2756:1: ( ruleQualifiedName )
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2757:3: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getBSCastOrNewExpressionRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getBSCastOrNewExpressionAccess().getTypeBSClassCrossReference_2_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleBSCastOrNewExpression5961);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_11=(Token)match(input,LeftParenthesis,FOLLOW_LeftParenthesis_in_ruleBSCastOrNewExpression5974); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_11, grammarAccess.getBSCastOrNewExpressionAccess().getLeftParenthesisKeyword_2_4());
                          
                    }
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2775:1: ( ( (lv_args_12_0= ruleBSExpression ) ) (otherlv_13= Comma ( (lv_args_14_0= ruleBSExpression ) ) )* )?
                    int alt44=2;
                    int LA44_0 = input.LA(1);

                    if ( (LA44_0==Continue||LA44_0==Client||LA44_0==Parent||LA44_0==Break||LA44_0==False||(LA44_0>=Null && LA44_0<=True)||LA44_0==New||LA44_0==ExclamationMark||LA44_0==LeftParenthesis||LA44_0==PlusSign||LA44_0==HyphenMinus||(LA44_0>=Tilde && LA44_0<=RULE_INT)||LA44_0==RULE_STRING) ) {
                        alt44=1;
                    }
                    switch (alt44) {
                        case 1 :
                            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2775:2: ( (lv_args_12_0= ruleBSExpression ) ) (otherlv_13= Comma ( (lv_args_14_0= ruleBSExpression ) ) )*
                            {
                            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2775:2: ( (lv_args_12_0= ruleBSExpression ) )
                            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2776:1: (lv_args_12_0= ruleBSExpression )
                            {
                            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2776:1: (lv_args_12_0= ruleBSExpression )
                            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2777:3: lv_args_12_0= ruleBSExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getBSCastOrNewExpressionAccess().getArgsBSExpressionParserRuleCall_2_5_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleBSExpression_in_ruleBSCastOrNewExpression5995);
                            lv_args_12_0=ruleBSExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getBSCastOrNewExpressionRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"args",
                                      		lv_args_12_0, 
                                      		"BSExpression");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2793:2: (otherlv_13= Comma ( (lv_args_14_0= ruleBSExpression ) ) )*
                            loop43:
                            do {
                                int alt43=2;
                                int LA43_0 = input.LA(1);

                                if ( (LA43_0==Comma) ) {
                                    alt43=1;
                                }


                                switch (alt43) {
                            	case 1 :
                            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2794:2: otherlv_13= Comma ( (lv_args_14_0= ruleBSExpression ) )
                            	    {
                            	    otherlv_13=(Token)match(input,Comma,FOLLOW_Comma_in_ruleBSCastOrNewExpression6009); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_13, grammarAccess.getBSCastOrNewExpressionAccess().getCommaKeyword_2_5_1_0());
                            	          
                            	    }
                            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2798:1: ( (lv_args_14_0= ruleBSExpression ) )
                            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2799:1: (lv_args_14_0= ruleBSExpression )
                            	    {
                            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2799:1: (lv_args_14_0= ruleBSExpression )
                            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2800:3: lv_args_14_0= ruleBSExpression
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getBSCastOrNewExpressionAccess().getArgsBSExpressionParserRuleCall_2_5_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleBSExpression_in_ruleBSCastOrNewExpression6029);
                            	    lv_args_14_0=ruleBSExpression();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getBSCastOrNewExpressionRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"args",
                            	              		lv_args_14_0, 
                            	              		"BSExpression");
                            	      	        afterParserOrEnumRuleCall();
                            	      	    
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop43;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_15=(Token)match(input,RightParenthesis,FOLLOW_RightParenthesis_in_ruleBSCastOrNewExpression6046); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_15, grammarAccess.getBSCastOrNewExpressionAccess().getRightParenthesisKeyword_2_6());
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBSCastOrNewExpression"


    // $ANTLR start "entryRuleBSUnaryModifierExpression"
    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2829:1: entryRuleBSUnaryModifierExpression returns [EObject current=null] : iv_ruleBSUnaryModifierExpression= ruleBSUnaryModifierExpression EOF ;
    public final EObject entryRuleBSUnaryModifierExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBSUnaryModifierExpression = null;


        try {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2830:2: (iv_ruleBSUnaryModifierExpression= ruleBSUnaryModifierExpression EOF )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2831:2: iv_ruleBSUnaryModifierExpression= ruleBSUnaryModifierExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBSUnaryModifierExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleBSUnaryModifierExpression_in_entryRuleBSUnaryModifierExpression6081);
            iv_ruleBSUnaryModifierExpression=ruleBSUnaryModifierExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBSUnaryModifierExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBSUnaryModifierExpression6091); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBSUnaryModifierExpression"


    // $ANTLR start "ruleBSUnaryModifierExpression"
    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2838:1: ruleBSUnaryModifierExpression returns [EObject current=null] : (this_BSInvokationExpression_0= ruleBSInvokationExpression | ( () ( ( (lv_operator_2_1= PlusSign | lv_operator_2_2= HyphenMinus | lv_operator_2_3= ExclamationMark | lv_operator_2_4= Tilde ) ) ) ( (lv_receiver_3_0= ruleBSUnaryModifierExpression ) ) ) ) ;
    public final EObject ruleBSUnaryModifierExpression() throws RecognitionException {
        EObject current = null;

        Token lv_operator_2_1=null;
        Token lv_operator_2_2=null;
        Token lv_operator_2_3=null;
        Token lv_operator_2_4=null;
        EObject this_BSInvokationExpression_0 = null;

        EObject lv_receiver_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2841:28: ( (this_BSInvokationExpression_0= ruleBSInvokationExpression | ( () ( ( (lv_operator_2_1= PlusSign | lv_operator_2_2= HyphenMinus | lv_operator_2_3= ExclamationMark | lv_operator_2_4= Tilde ) ) ) ( (lv_receiver_3_0= ruleBSUnaryModifierExpression ) ) ) ) )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2842:1: (this_BSInvokationExpression_0= ruleBSInvokationExpression | ( () ( ( (lv_operator_2_1= PlusSign | lv_operator_2_2= HyphenMinus | lv_operator_2_3= ExclamationMark | lv_operator_2_4= Tilde ) ) ) ( (lv_receiver_3_0= ruleBSUnaryModifierExpression ) ) ) )
            {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2842:1: (this_BSInvokationExpression_0= ruleBSInvokationExpression | ( () ( ( (lv_operator_2_1= PlusSign | lv_operator_2_2= HyphenMinus | lv_operator_2_3= ExclamationMark | lv_operator_2_4= Tilde ) ) ) ( (lv_receiver_3_0= ruleBSUnaryModifierExpression ) ) ) )
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==Continue||LA47_0==Client||LA47_0==Parent||LA47_0==Break||LA47_0==False||(LA47_0>=Null && LA47_0<=True)||LA47_0==LeftParenthesis||(LA47_0>=RULE_HEX_VALUE && LA47_0<=RULE_INT)||LA47_0==RULE_STRING) ) {
                alt47=1;
            }
            else if ( (LA47_0==ExclamationMark||LA47_0==PlusSign||LA47_0==HyphenMinus||LA47_0==Tilde) ) {
                alt47=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }
            switch (alt47) {
                case 1 :
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2843:5: this_BSInvokationExpression_0= ruleBSInvokationExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBSUnaryModifierExpressionAccess().getBSInvokationExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBSInvokationExpression_in_ruleBSUnaryModifierExpression6138);
                    this_BSInvokationExpression_0=ruleBSInvokationExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_BSInvokationExpression_0;
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2852:6: ( () ( ( (lv_operator_2_1= PlusSign | lv_operator_2_2= HyphenMinus | lv_operator_2_3= ExclamationMark | lv_operator_2_4= Tilde ) ) ) ( (lv_receiver_3_0= ruleBSUnaryModifierExpression ) ) )
                    {
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2852:6: ( () ( ( (lv_operator_2_1= PlusSign | lv_operator_2_2= HyphenMinus | lv_operator_2_3= ExclamationMark | lv_operator_2_4= Tilde ) ) ) ( (lv_receiver_3_0= ruleBSUnaryModifierExpression ) ) )
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2852:7: () ( ( (lv_operator_2_1= PlusSign | lv_operator_2_2= HyphenMinus | lv_operator_2_3= ExclamationMark | lv_operator_2_4= Tilde ) ) ) ( (lv_receiver_3_0= ruleBSUnaryModifierExpression ) )
                    {
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2852:7: ()
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2853:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getBSUnaryModifierExpressionAccess().getBSUnaryModifierExpressionAction_1_0(),
                                  current);
                          
                    }

                    }

                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2858:2: ( ( (lv_operator_2_1= PlusSign | lv_operator_2_2= HyphenMinus | lv_operator_2_3= ExclamationMark | lv_operator_2_4= Tilde ) ) )
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2859:1: ( (lv_operator_2_1= PlusSign | lv_operator_2_2= HyphenMinus | lv_operator_2_3= ExclamationMark | lv_operator_2_4= Tilde ) )
                    {
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2859:1: ( (lv_operator_2_1= PlusSign | lv_operator_2_2= HyphenMinus | lv_operator_2_3= ExclamationMark | lv_operator_2_4= Tilde ) )
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2860:1: (lv_operator_2_1= PlusSign | lv_operator_2_2= HyphenMinus | lv_operator_2_3= ExclamationMark | lv_operator_2_4= Tilde )
                    {
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2860:1: (lv_operator_2_1= PlusSign | lv_operator_2_2= HyphenMinus | lv_operator_2_3= ExclamationMark | lv_operator_2_4= Tilde )
                    int alt46=4;
                    switch ( input.LA(1) ) {
                    case PlusSign:
                        {
                        alt46=1;
                        }
                        break;
                    case HyphenMinus:
                        {
                        alt46=2;
                        }
                        break;
                    case ExclamationMark:
                        {
                        alt46=3;
                        }
                        break;
                    case Tilde:
                        {
                        alt46=4;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 46, 0, input);

                        throw nvae;
                    }

                    switch (alt46) {
                        case 1 :
                            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2861:3: lv_operator_2_1= PlusSign
                            {
                            lv_operator_2_1=(Token)match(input,PlusSign,FOLLOW_PlusSign_in_ruleBSUnaryModifierExpression6174); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_operator_2_1, grammarAccess.getBSUnaryModifierExpressionAccess().getOperatorPlusSignKeyword_1_1_0_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getBSUnaryModifierExpressionRule());
                              	        }
                                     		setWithLastConsumed(current, "operator", lv_operator_2_1, null);
                              	    
                            }

                            }
                            break;
                        case 2 :
                            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2874:8: lv_operator_2_2= HyphenMinus
                            {
                            lv_operator_2_2=(Token)match(input,HyphenMinus,FOLLOW_HyphenMinus_in_ruleBSUnaryModifierExpression6202); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_operator_2_2, grammarAccess.getBSUnaryModifierExpressionAccess().getOperatorHyphenMinusKeyword_1_1_0_1());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getBSUnaryModifierExpressionRule());
                              	        }
                                     		setWithLastConsumed(current, "operator", lv_operator_2_2, null);
                              	    
                            }

                            }
                            break;
                        case 3 :
                            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2887:8: lv_operator_2_3= ExclamationMark
                            {
                            lv_operator_2_3=(Token)match(input,ExclamationMark,FOLLOW_ExclamationMark_in_ruleBSUnaryModifierExpression6230); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_operator_2_3, grammarAccess.getBSUnaryModifierExpressionAccess().getOperatorExclamationMarkKeyword_1_1_0_2());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getBSUnaryModifierExpressionRule());
                              	        }
                                     		setWithLastConsumed(current, "operator", lv_operator_2_3, null);
                              	    
                            }

                            }
                            break;
                        case 4 :
                            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2900:8: lv_operator_2_4= Tilde
                            {
                            lv_operator_2_4=(Token)match(input,Tilde,FOLLOW_Tilde_in_ruleBSUnaryModifierExpression6258); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_operator_2_4, grammarAccess.getBSUnaryModifierExpressionAccess().getOperatorTildeKeyword_1_1_0_3());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getBSUnaryModifierExpressionRule());
                              	        }
                                     		setWithLastConsumed(current, "operator", lv_operator_2_4, null);
                              	    
                            }

                            }
                            break;

                    }


                    }


                    }

                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2916:2: ( (lv_receiver_3_0= ruleBSUnaryModifierExpression ) )
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2917:1: (lv_receiver_3_0= ruleBSUnaryModifierExpression )
                    {
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2917:1: (lv_receiver_3_0= ruleBSUnaryModifierExpression )
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2918:3: lv_receiver_3_0= ruleBSUnaryModifierExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getBSUnaryModifierExpressionAccess().getReceiverBSUnaryModifierExpressionParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBSUnaryModifierExpression_in_ruleBSUnaryModifierExpression6293);
                    lv_receiver_3_0=ruleBSUnaryModifierExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getBSUnaryModifierExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"receiver",
                              		lv_receiver_3_0, 
                              		"BSUnaryModifierExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBSUnaryModifierExpression"


    // $ANTLR start "entryRuleBSInvokationExpression"
    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2942:1: entryRuleBSInvokationExpression returns [EObject current=null] : iv_ruleBSInvokationExpression= ruleBSInvokationExpression EOF ;
    public final EObject entryRuleBSInvokationExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBSInvokationExpression = null;


        try {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2943:2: (iv_ruleBSInvokationExpression= ruleBSInvokationExpression EOF )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2944:2: iv_ruleBSInvokationExpression= ruleBSInvokationExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBSInvokationExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleBSInvokationExpression_in_entryRuleBSInvokationExpression6329);
            iv_ruleBSInvokationExpression=ruleBSInvokationExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBSInvokationExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBSInvokationExpression6339); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBSInvokationExpression"


    // $ANTLR start "ruleBSInvokationExpression"
    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2951:1: ruleBSInvokationExpression returns [EObject current=null] : (this_BSTerminalExpression_0= ruleBSTerminalExpression ( ( () otherlv_2= FullStop ) | ( () otherlv_4= LeftParenthesis ( ( (lv_args_5_0= ruleBSExpression ) ) (otherlv_6= Comma ( (lv_args_7_0= ruleBSExpression ) ) )* )? otherlv_8= RightParenthesis ) | ( () otherlv_10= LeftSquareBracket ( ( (lv_args_11_0= ruleBSExpression ) ) (otherlv_12= Comma ( (lv_args_13_0= ruleBSExpression ) ) )* )? otherlv_14= RightSquareBracket ) | ( () ( ( (lv_operator_16_1= PlusSignPlusSign | lv_operator_16_2= HyphenMinusHyphenMinus ) ) ) ) )* ) ;
    public final EObject ruleBSInvokationExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token lv_operator_16_1=null;
        Token lv_operator_16_2=null;
        EObject this_BSTerminalExpression_0 = null;

        EObject lv_args_5_0 = null;

        EObject lv_args_7_0 = null;

        EObject lv_args_11_0 = null;

        EObject lv_args_13_0 = null;


         enterRule(); 
            
        try {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2954:28: ( (this_BSTerminalExpression_0= ruleBSTerminalExpression ( ( () otherlv_2= FullStop ) | ( () otherlv_4= LeftParenthesis ( ( (lv_args_5_0= ruleBSExpression ) ) (otherlv_6= Comma ( (lv_args_7_0= ruleBSExpression ) ) )* )? otherlv_8= RightParenthesis ) | ( () otherlv_10= LeftSquareBracket ( ( (lv_args_11_0= ruleBSExpression ) ) (otherlv_12= Comma ( (lv_args_13_0= ruleBSExpression ) ) )* )? otherlv_14= RightSquareBracket ) | ( () ( ( (lv_operator_16_1= PlusSignPlusSign | lv_operator_16_2= HyphenMinusHyphenMinus ) ) ) ) )* ) )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2955:1: (this_BSTerminalExpression_0= ruleBSTerminalExpression ( ( () otherlv_2= FullStop ) | ( () otherlv_4= LeftParenthesis ( ( (lv_args_5_0= ruleBSExpression ) ) (otherlv_6= Comma ( (lv_args_7_0= ruleBSExpression ) ) )* )? otherlv_8= RightParenthesis ) | ( () otherlv_10= LeftSquareBracket ( ( (lv_args_11_0= ruleBSExpression ) ) (otherlv_12= Comma ( (lv_args_13_0= ruleBSExpression ) ) )* )? otherlv_14= RightSquareBracket ) | ( () ( ( (lv_operator_16_1= PlusSignPlusSign | lv_operator_16_2= HyphenMinusHyphenMinus ) ) ) ) )* )
            {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2955:1: (this_BSTerminalExpression_0= ruleBSTerminalExpression ( ( () otherlv_2= FullStop ) | ( () otherlv_4= LeftParenthesis ( ( (lv_args_5_0= ruleBSExpression ) ) (otherlv_6= Comma ( (lv_args_7_0= ruleBSExpression ) ) )* )? otherlv_8= RightParenthesis ) | ( () otherlv_10= LeftSquareBracket ( ( (lv_args_11_0= ruleBSExpression ) ) (otherlv_12= Comma ( (lv_args_13_0= ruleBSExpression ) ) )* )? otherlv_14= RightSquareBracket ) | ( () ( ( (lv_operator_16_1= PlusSignPlusSign | lv_operator_16_2= HyphenMinusHyphenMinus ) ) ) ) )* )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2956:5: this_BSTerminalExpression_0= ruleBSTerminalExpression ( ( () otherlv_2= FullStop ) | ( () otherlv_4= LeftParenthesis ( ( (lv_args_5_0= ruleBSExpression ) ) (otherlv_6= Comma ( (lv_args_7_0= ruleBSExpression ) ) )* )? otherlv_8= RightParenthesis ) | ( () otherlv_10= LeftSquareBracket ( ( (lv_args_11_0= ruleBSExpression ) ) (otherlv_12= Comma ( (lv_args_13_0= ruleBSExpression ) ) )* )? otherlv_14= RightSquareBracket ) | ( () ( ( (lv_operator_16_1= PlusSignPlusSign | lv_operator_16_2= HyphenMinusHyphenMinus ) ) ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getBSInvokationExpressionAccess().getBSTerminalExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleBSTerminalExpression_in_ruleBSInvokationExpression6386);
            this_BSTerminalExpression_0=ruleBSTerminalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = this_BSTerminalExpression_0;
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2964:1: ( ( () otherlv_2= FullStop ) | ( () otherlv_4= LeftParenthesis ( ( (lv_args_5_0= ruleBSExpression ) ) (otherlv_6= Comma ( (lv_args_7_0= ruleBSExpression ) ) )* )? otherlv_8= RightParenthesis ) | ( () otherlv_10= LeftSquareBracket ( ( (lv_args_11_0= ruleBSExpression ) ) (otherlv_12= Comma ( (lv_args_13_0= ruleBSExpression ) ) )* )? otherlv_14= RightSquareBracket ) | ( () ( ( (lv_operator_16_1= PlusSignPlusSign | lv_operator_16_2= HyphenMinusHyphenMinus ) ) ) ) )*
            loop53:
            do {
                int alt53=5;
                switch ( input.LA(1) ) {
                case FullStop:
                    {
                    alt53=1;
                    }
                    break;
                case LeftParenthesis:
                    {
                    alt53=2;
                    }
                    break;
                case LeftSquareBracket:
                    {
                    alt53=3;
                    }
                    break;
                case PlusSignPlusSign:
                case HyphenMinusHyphenMinus:
                    {
                    alt53=4;
                    }
                    break;

                }

                switch (alt53) {
            	case 1 :
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2964:2: ( () otherlv_2= FullStop )
            	    {
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2964:2: ( () otherlv_2= FullStop )
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2964:3: () otherlv_2= FullStop
            	    {
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2964:3: ()
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2965:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getBSInvokationExpressionAccess().getBSMemberSelectionExpressionReceiverAction_1_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,FullStop,FOLLOW_FullStop_in_ruleBSInvokationExpression6409); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getBSInvokationExpressionAccess().getFullStopKeyword_1_0_1());
            	          
            	    }

            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2976:6: ( () otherlv_4= LeftParenthesis ( ( (lv_args_5_0= ruleBSExpression ) ) (otherlv_6= Comma ( (lv_args_7_0= ruleBSExpression ) ) )* )? otherlv_8= RightParenthesis )
            	    {
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2976:6: ( () otherlv_4= LeftParenthesis ( ( (lv_args_5_0= ruleBSExpression ) ) (otherlv_6= Comma ( (lv_args_7_0= ruleBSExpression ) ) )* )? otherlv_8= RightParenthesis )
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2976:7: () otherlv_4= LeftParenthesis ( ( (lv_args_5_0= ruleBSExpression ) ) (otherlv_6= Comma ( (lv_args_7_0= ruleBSExpression ) ) )* )? otherlv_8= RightParenthesis
            	    {
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2976:7: ()
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2977:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getBSInvokationExpressionAccess().getBSMethodInvokationExpressionReceiverAction_1_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_4=(Token)match(input,LeftParenthesis,FOLLOW_LeftParenthesis_in_ruleBSInvokationExpression6438); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_4, grammarAccess.getBSInvokationExpressionAccess().getLeftParenthesisKeyword_1_1_1());
            	          
            	    }
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2987:1: ( ( (lv_args_5_0= ruleBSExpression ) ) (otherlv_6= Comma ( (lv_args_7_0= ruleBSExpression ) ) )* )?
            	    int alt49=2;
            	    int LA49_0 = input.LA(1);

            	    if ( (LA49_0==Continue||LA49_0==Client||LA49_0==Parent||LA49_0==Break||LA49_0==False||(LA49_0>=Null && LA49_0<=True)||LA49_0==New||LA49_0==ExclamationMark||LA49_0==LeftParenthesis||LA49_0==PlusSign||LA49_0==HyphenMinus||(LA49_0>=Tilde && LA49_0<=RULE_INT)||LA49_0==RULE_STRING) ) {
            	        alt49=1;
            	    }
            	    switch (alt49) {
            	        case 1 :
            	            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2987:2: ( (lv_args_5_0= ruleBSExpression ) ) (otherlv_6= Comma ( (lv_args_7_0= ruleBSExpression ) ) )*
            	            {
            	            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2987:2: ( (lv_args_5_0= ruleBSExpression ) )
            	            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2988:1: (lv_args_5_0= ruleBSExpression )
            	            {
            	            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2988:1: (lv_args_5_0= ruleBSExpression )
            	            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2989:3: lv_args_5_0= ruleBSExpression
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getBSInvokationExpressionAccess().getArgsBSExpressionParserRuleCall_1_1_2_0_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleBSExpression_in_ruleBSInvokationExpression6459);
            	            lv_args_5_0=ruleBSExpression();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getBSInvokationExpressionRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"args",
            	                      		lv_args_5_0, 
            	                      		"BSExpression");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }


            	            }

            	            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3005:2: (otherlv_6= Comma ( (lv_args_7_0= ruleBSExpression ) ) )*
            	            loop48:
            	            do {
            	                int alt48=2;
            	                int LA48_0 = input.LA(1);

            	                if ( (LA48_0==Comma) ) {
            	                    alt48=1;
            	                }


            	                switch (alt48) {
            	            	case 1 :
            	            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3006:2: otherlv_6= Comma ( (lv_args_7_0= ruleBSExpression ) )
            	            	    {
            	            	    otherlv_6=(Token)match(input,Comma,FOLLOW_Comma_in_ruleBSInvokationExpression6473); if (state.failed) return current;
            	            	    if ( state.backtracking==0 ) {

            	            	          	newLeafNode(otherlv_6, grammarAccess.getBSInvokationExpressionAccess().getCommaKeyword_1_1_2_1_0());
            	            	          
            	            	    }
            	            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3010:1: ( (lv_args_7_0= ruleBSExpression ) )
            	            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3011:1: (lv_args_7_0= ruleBSExpression )
            	            	    {
            	            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3011:1: (lv_args_7_0= ruleBSExpression )
            	            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3012:3: lv_args_7_0= ruleBSExpression
            	            	    {
            	            	    if ( state.backtracking==0 ) {
            	            	       
            	            	      	        newCompositeNode(grammarAccess.getBSInvokationExpressionAccess().getArgsBSExpressionParserRuleCall_1_1_2_1_1_0()); 
            	            	      	    
            	            	    }
            	            	    pushFollow(FOLLOW_ruleBSExpression_in_ruleBSInvokationExpression6493);
            	            	    lv_args_7_0=ruleBSExpression();

            	            	    state._fsp--;
            	            	    if (state.failed) return current;
            	            	    if ( state.backtracking==0 ) {

            	            	      	        if (current==null) {
            	            	      	            current = createModelElementForParent(grammarAccess.getBSInvokationExpressionRule());
            	            	      	        }
            	            	             		add(
            	            	             			current, 
            	            	             			"args",
            	            	              		lv_args_7_0, 
            	            	              		"BSExpression");
            	            	      	        afterParserOrEnumRuleCall();
            	            	      	    
            	            	    }

            	            	    }


            	            	    }


            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop48;
            	                }
            	            } while (true);


            	            }
            	            break;

            	    }

            	    otherlv_8=(Token)match(input,RightParenthesis,FOLLOW_RightParenthesis_in_ruleBSInvokationExpression6510); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_8, grammarAccess.getBSInvokationExpressionAccess().getRightParenthesisKeyword_1_1_3());
            	          
            	    }

            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3034:6: ( () otherlv_10= LeftSquareBracket ( ( (lv_args_11_0= ruleBSExpression ) ) (otherlv_12= Comma ( (lv_args_13_0= ruleBSExpression ) ) )* )? otherlv_14= RightSquareBracket )
            	    {
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3034:6: ( () otherlv_10= LeftSquareBracket ( ( (lv_args_11_0= ruleBSExpression ) ) (otherlv_12= Comma ( (lv_args_13_0= ruleBSExpression ) ) )* )? otherlv_14= RightSquareBracket )
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3034:7: () otherlv_10= LeftSquareBracket ( ( (lv_args_11_0= ruleBSExpression ) ) (otherlv_12= Comma ( (lv_args_13_0= ruleBSExpression ) ) )* )? otherlv_14= RightSquareBracket
            	    {
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3034:7: ()
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3035:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getBSInvokationExpressionAccess().getBSArrayAccessExpressionReceiverAction_1_2_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_10=(Token)match(input,LeftSquareBracket,FOLLOW_LeftSquareBracket_in_ruleBSInvokationExpression6539); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_10, grammarAccess.getBSInvokationExpressionAccess().getLeftSquareBracketKeyword_1_2_1());
            	          
            	    }
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3045:1: ( ( (lv_args_11_0= ruleBSExpression ) ) (otherlv_12= Comma ( (lv_args_13_0= ruleBSExpression ) ) )* )?
            	    int alt51=2;
            	    int LA51_0 = input.LA(1);

            	    if ( (LA51_0==Continue||LA51_0==Client||LA51_0==Parent||LA51_0==Break||LA51_0==False||(LA51_0>=Null && LA51_0<=True)||LA51_0==New||LA51_0==ExclamationMark||LA51_0==LeftParenthesis||LA51_0==PlusSign||LA51_0==HyphenMinus||(LA51_0>=Tilde && LA51_0<=RULE_INT)||LA51_0==RULE_STRING) ) {
            	        alt51=1;
            	    }
            	    switch (alt51) {
            	        case 1 :
            	            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3045:2: ( (lv_args_11_0= ruleBSExpression ) ) (otherlv_12= Comma ( (lv_args_13_0= ruleBSExpression ) ) )*
            	            {
            	            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3045:2: ( (lv_args_11_0= ruleBSExpression ) )
            	            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3046:1: (lv_args_11_0= ruleBSExpression )
            	            {
            	            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3046:1: (lv_args_11_0= ruleBSExpression )
            	            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3047:3: lv_args_11_0= ruleBSExpression
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getBSInvokationExpressionAccess().getArgsBSExpressionParserRuleCall_1_2_2_0_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleBSExpression_in_ruleBSInvokationExpression6560);
            	            lv_args_11_0=ruleBSExpression();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getBSInvokationExpressionRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"args",
            	                      		lv_args_11_0, 
            	                      		"BSExpression");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }


            	            }

            	            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3063:2: (otherlv_12= Comma ( (lv_args_13_0= ruleBSExpression ) ) )*
            	            loop50:
            	            do {
            	                int alt50=2;
            	                int LA50_0 = input.LA(1);

            	                if ( (LA50_0==Comma) ) {
            	                    alt50=1;
            	                }


            	                switch (alt50) {
            	            	case 1 :
            	            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3064:2: otherlv_12= Comma ( (lv_args_13_0= ruleBSExpression ) )
            	            	    {
            	            	    otherlv_12=(Token)match(input,Comma,FOLLOW_Comma_in_ruleBSInvokationExpression6574); if (state.failed) return current;
            	            	    if ( state.backtracking==0 ) {

            	            	          	newLeafNode(otherlv_12, grammarAccess.getBSInvokationExpressionAccess().getCommaKeyword_1_2_2_1_0());
            	            	          
            	            	    }
            	            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3068:1: ( (lv_args_13_0= ruleBSExpression ) )
            	            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3069:1: (lv_args_13_0= ruleBSExpression )
            	            	    {
            	            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3069:1: (lv_args_13_0= ruleBSExpression )
            	            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3070:3: lv_args_13_0= ruleBSExpression
            	            	    {
            	            	    if ( state.backtracking==0 ) {
            	            	       
            	            	      	        newCompositeNode(grammarAccess.getBSInvokationExpressionAccess().getArgsBSExpressionParserRuleCall_1_2_2_1_1_0()); 
            	            	      	    
            	            	    }
            	            	    pushFollow(FOLLOW_ruleBSExpression_in_ruleBSInvokationExpression6594);
            	            	    lv_args_13_0=ruleBSExpression();

            	            	    state._fsp--;
            	            	    if (state.failed) return current;
            	            	    if ( state.backtracking==0 ) {

            	            	      	        if (current==null) {
            	            	      	            current = createModelElementForParent(grammarAccess.getBSInvokationExpressionRule());
            	            	      	        }
            	            	             		add(
            	            	             			current, 
            	            	             			"args",
            	            	              		lv_args_13_0, 
            	            	              		"BSExpression");
            	            	      	        afterParserOrEnumRuleCall();
            	            	      	    
            	            	    }

            	            	    }


            	            	    }


            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop50;
            	                }
            	            } while (true);


            	            }
            	            break;

            	    }

            	    otherlv_14=(Token)match(input,RightSquareBracket,FOLLOW_RightSquareBracket_in_ruleBSInvokationExpression6611); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_14, grammarAccess.getBSInvokationExpressionAccess().getRightSquareBracketKeyword_1_2_3());
            	          
            	    }

            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3092:6: ( () ( ( (lv_operator_16_1= PlusSignPlusSign | lv_operator_16_2= HyphenMinusHyphenMinus ) ) ) )
            	    {
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3092:6: ( () ( ( (lv_operator_16_1= PlusSignPlusSign | lv_operator_16_2= HyphenMinusHyphenMinus ) ) ) )
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3092:7: () ( ( (lv_operator_16_1= PlusSignPlusSign | lv_operator_16_2= HyphenMinusHyphenMinus ) ) )
            	    {
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3092:7: ()
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3093:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getBSInvokationExpressionAccess().getBSPostfixArithmeticExpressionReceiverAction_1_3_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3098:2: ( ( (lv_operator_16_1= PlusSignPlusSign | lv_operator_16_2= HyphenMinusHyphenMinus ) ) )
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3099:1: ( (lv_operator_16_1= PlusSignPlusSign | lv_operator_16_2= HyphenMinusHyphenMinus ) )
            	    {
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3099:1: ( (lv_operator_16_1= PlusSignPlusSign | lv_operator_16_2= HyphenMinusHyphenMinus ) )
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3100:1: (lv_operator_16_1= PlusSignPlusSign | lv_operator_16_2= HyphenMinusHyphenMinus )
            	    {
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3100:1: (lv_operator_16_1= PlusSignPlusSign | lv_operator_16_2= HyphenMinusHyphenMinus )
            	    int alt52=2;
            	    int LA52_0 = input.LA(1);

            	    if ( (LA52_0==PlusSignPlusSign) ) {
            	        alt52=1;
            	    }
            	    else if ( (LA52_0==HyphenMinusHyphenMinus) ) {
            	        alt52=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 52, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt52) {
            	        case 1 :
            	            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3101:3: lv_operator_16_1= PlusSignPlusSign
            	            {
            	            lv_operator_16_1=(Token)match(input,PlusSignPlusSign,FOLLOW_PlusSignPlusSign_in_ruleBSInvokationExpression6648); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_operator_16_1, grammarAccess.getBSInvokationExpressionAccess().getOperatorPlusSignPlusSignKeyword_1_3_1_0_0());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getBSInvokationExpressionRule());
            	              	        }
            	                     		setWithLastConsumed(current, "operator", lv_operator_16_1, null);
            	              	    
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3114:8: lv_operator_16_2= HyphenMinusHyphenMinus
            	            {
            	            lv_operator_16_2=(Token)match(input,HyphenMinusHyphenMinus,FOLLOW_HyphenMinusHyphenMinus_in_ruleBSInvokationExpression6676); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_operator_16_2, grammarAccess.getBSInvokationExpressionAccess().getOperatorHyphenMinusHyphenMinusKeyword_1_3_1_0_1());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getBSInvokationExpressionRule());
            	              	        }
            	                     		setWithLastConsumed(current, "operator", lv_operator_16_2, null);
            	              	    
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop53;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBSInvokationExpression"


    // $ANTLR start "entryRuleBSTerminalExpression"
    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3138:1: entryRuleBSTerminalExpression returns [EObject current=null] : iv_ruleBSTerminalExpression= ruleBSTerminalExpression EOF ;
    public final EObject entryRuleBSTerminalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBSTerminalExpression = null;


        try {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3139:2: (iv_ruleBSTerminalExpression= ruleBSTerminalExpression EOF )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3140:2: iv_ruleBSTerminalExpression= ruleBSTerminalExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBSTerminalExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleBSTerminalExpression_in_entryRuleBSTerminalExpression6728);
            iv_ruleBSTerminalExpression=ruleBSTerminalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBSTerminalExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBSTerminalExpression6738); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBSTerminalExpression"


    // $ANTLR start "ruleBSTerminalExpression"
    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3147:1: ruleBSTerminalExpression returns [EObject current=null] : ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) | ( () ( (lv_value_3_0= RULE_HEX_VALUE ) ) ) | ( () ( (lv_value_5_0= RULE_INT ) ) ( () otherlv_7= FullStop ( (lv_right_8_0= RULE_INT ) ) )? ) | ( () ( ( (lv_value_10_1= True | lv_value_10_2= False ) ) ) ) | ( () otherlv_12= Null ) | ( () otherlv_14= Break ) | ( () otherlv_16= Continue ) | ( () otherlv_18= This ) | ( () otherlv_20= Client ) | ( () otherlv_22= Parent ) | ( () ( (otherlv_24= RULE_ID ) ) ) | ( () otherlv_26= LeftParenthesis ( (lv_expression_27_0= ruleBSExpression ) ) otherlv_28= RightParenthesis ) ) ;
    public final EObject ruleBSTerminalExpression() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Token lv_value_3_0=null;
        Token lv_value_5_0=null;
        Token otherlv_7=null;
        Token lv_right_8_0=null;
        Token lv_value_10_1=null;
        Token lv_value_10_2=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_28=null;
        EObject lv_expression_27_0 = null;


         enterRule(); 
            
        try {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3150:28: ( ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) | ( () ( (lv_value_3_0= RULE_HEX_VALUE ) ) ) | ( () ( (lv_value_5_0= RULE_INT ) ) ( () otherlv_7= FullStop ( (lv_right_8_0= RULE_INT ) ) )? ) | ( () ( ( (lv_value_10_1= True | lv_value_10_2= False ) ) ) ) | ( () otherlv_12= Null ) | ( () otherlv_14= Break ) | ( () otherlv_16= Continue ) | ( () otherlv_18= This ) | ( () otherlv_20= Client ) | ( () otherlv_22= Parent ) | ( () ( (otherlv_24= RULE_ID ) ) ) | ( () otherlv_26= LeftParenthesis ( (lv_expression_27_0= ruleBSExpression ) ) otherlv_28= RightParenthesis ) ) )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3151:1: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) | ( () ( (lv_value_3_0= RULE_HEX_VALUE ) ) ) | ( () ( (lv_value_5_0= RULE_INT ) ) ( () otherlv_7= FullStop ( (lv_right_8_0= RULE_INT ) ) )? ) | ( () ( ( (lv_value_10_1= True | lv_value_10_2= False ) ) ) ) | ( () otherlv_12= Null ) | ( () otherlv_14= Break ) | ( () otherlv_16= Continue ) | ( () otherlv_18= This ) | ( () otherlv_20= Client ) | ( () otherlv_22= Parent ) | ( () ( (otherlv_24= RULE_ID ) ) ) | ( () otherlv_26= LeftParenthesis ( (lv_expression_27_0= ruleBSExpression ) ) otherlv_28= RightParenthesis ) )
            {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3151:1: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) | ( () ( (lv_value_3_0= RULE_HEX_VALUE ) ) ) | ( () ( (lv_value_5_0= RULE_INT ) ) ( () otherlv_7= FullStop ( (lv_right_8_0= RULE_INT ) ) )? ) | ( () ( ( (lv_value_10_1= True | lv_value_10_2= False ) ) ) ) | ( () otherlv_12= Null ) | ( () otherlv_14= Break ) | ( () otherlv_16= Continue ) | ( () otherlv_18= This ) | ( () otherlv_20= Client ) | ( () otherlv_22= Parent ) | ( () ( (otherlv_24= RULE_ID ) ) ) | ( () otherlv_26= LeftParenthesis ( (lv_expression_27_0= ruleBSExpression ) ) otherlv_28= RightParenthesis ) )
            int alt56=12;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt56=1;
                }
                break;
            case RULE_HEX_VALUE:
                {
                alt56=2;
                }
                break;
            case RULE_INT:
                {
                alt56=3;
                }
                break;
            case False:
            case True:
                {
                alt56=4;
                }
                break;
            case Null:
                {
                alt56=5;
                }
                break;
            case Break:
                {
                alt56=6;
                }
                break;
            case Continue:
                {
                alt56=7;
                }
                break;
            case This:
                {
                alt56=8;
                }
                break;
            case Client:
                {
                alt56=9;
                }
                break;
            case Parent:
                {
                alt56=10;
                }
                break;
            case RULE_ID:
                {
                alt56=11;
                }
                break;
            case LeftParenthesis:
                {
                alt56=12;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }

            switch (alt56) {
                case 1 :
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3151:2: ( () ( (lv_value_1_0= RULE_STRING ) ) )
                    {
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3151:2: ( () ( (lv_value_1_0= RULE_STRING ) ) )
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3151:3: () ( (lv_value_1_0= RULE_STRING ) )
                    {
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3151:3: ()
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3152:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getBSTerminalExpressionAccess().getBSStringConstantAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3157:2: ( (lv_value_1_0= RULE_STRING ) )
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3158:1: (lv_value_1_0= RULE_STRING )
                    {
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3158:1: (lv_value_1_0= RULE_STRING )
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3159:3: lv_value_1_0= RULE_STRING
                    {
                    lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleBSTerminalExpression6790); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_value_1_0, grammarAccess.getBSTerminalExpressionAccess().getValueSTRINGTerminalRuleCall_0_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getBSTerminalExpressionRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"value",
                              		lv_value_1_0, 
                              		"STRING");
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3176:6: ( () ( (lv_value_3_0= RULE_HEX_VALUE ) ) )
                    {
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3176:6: ( () ( (lv_value_3_0= RULE_HEX_VALUE ) ) )
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3176:7: () ( (lv_value_3_0= RULE_HEX_VALUE ) )
                    {
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3176:7: ()
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3177:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getBSTerminalExpressionAccess().getBSHexadecimalConstantAction_1_0(),
                                  current);
                          
                    }

                    }

                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3182:2: ( (lv_value_3_0= RULE_HEX_VALUE ) )
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3183:1: (lv_value_3_0= RULE_HEX_VALUE )
                    {
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3183:1: (lv_value_3_0= RULE_HEX_VALUE )
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3184:3: lv_value_3_0= RULE_HEX_VALUE
                    {
                    lv_value_3_0=(Token)match(input,RULE_HEX_VALUE,FOLLOW_RULE_HEX_VALUE_in_ruleBSTerminalExpression6829); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_value_3_0, grammarAccess.getBSTerminalExpressionAccess().getValueHEX_VALUETerminalRuleCall_1_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getBSTerminalExpressionRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"value",
                              		lv_value_3_0, 
                              		"HEX_VALUE");
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3201:6: ( () ( (lv_value_5_0= RULE_INT ) ) ( () otherlv_7= FullStop ( (lv_right_8_0= RULE_INT ) ) )? )
                    {
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3201:6: ( () ( (lv_value_5_0= RULE_INT ) ) ( () otherlv_7= FullStop ( (lv_right_8_0= RULE_INT ) ) )? )
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3201:7: () ( (lv_value_5_0= RULE_INT ) ) ( () otherlv_7= FullStop ( (lv_right_8_0= RULE_INT ) ) )?
                    {
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3201:7: ()
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3202:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getBSTerminalExpressionAccess().getBSNumberConstantAction_2_0(),
                                  current);
                          
                    }

                    }

                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3207:2: ( (lv_value_5_0= RULE_INT ) )
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3208:1: (lv_value_5_0= RULE_INT )
                    {
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3208:1: (lv_value_5_0= RULE_INT )
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3209:3: lv_value_5_0= RULE_INT
                    {
                    lv_value_5_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleBSTerminalExpression6868); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_value_5_0, grammarAccess.getBSTerminalExpressionAccess().getValueINTTerminalRuleCall_2_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getBSTerminalExpressionRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"value",
                              		lv_value_5_0, 
                              		"INT");
                      	    
                    }

                    }


                    }

                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3225:2: ( () otherlv_7= FullStop ( (lv_right_8_0= RULE_INT ) ) )?
                    int alt54=2;
                    int LA54_0 = input.LA(1);

                    if ( (LA54_0==FullStop) ) {
                        int LA54_1 = input.LA(2);

                        if ( (LA54_1==RULE_INT) ) {
                            alt54=1;
                        }
                    }
                    switch (alt54) {
                        case 1 :
                            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3225:3: () otherlv_7= FullStop ( (lv_right_8_0= RULE_INT ) )
                            {
                            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3225:3: ()
                            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3226:5: 
                            {
                            if ( state.backtracking==0 ) {

                                      current = forceCreateModelElementAndSet(
                                          grammarAccess.getBSTerminalExpressionAccess().getBSRealConstantLeftAction_2_2_0(),
                                          current);
                                  
                            }

                            }

                            otherlv_7=(Token)match(input,FullStop,FOLLOW_FullStop_in_ruleBSTerminalExpression6896); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_7, grammarAccess.getBSTerminalExpressionAccess().getFullStopKeyword_2_2_1());
                                  
                            }
                            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3236:1: ( (lv_right_8_0= RULE_INT ) )
                            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3237:1: (lv_right_8_0= RULE_INT )
                            {
                            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3237:1: (lv_right_8_0= RULE_INT )
                            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3238:3: lv_right_8_0= RULE_INT
                            {
                            lv_right_8_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleBSTerminalExpression6912); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_right_8_0, grammarAccess.getBSTerminalExpressionAccess().getRightINTTerminalRuleCall_2_2_2_0()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getBSTerminalExpressionRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"right",
                                      		lv_right_8_0, 
                                      		"INT");
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 4 :
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3255:6: ( () ( ( (lv_value_10_1= True | lv_value_10_2= False ) ) ) )
                    {
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3255:6: ( () ( ( (lv_value_10_1= True | lv_value_10_2= False ) ) ) )
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3255:7: () ( ( (lv_value_10_1= True | lv_value_10_2= False ) ) )
                    {
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3255:7: ()
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3256:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getBSTerminalExpressionAccess().getBSBooleanConstantAction_3_0(),
                                  current);
                          
                    }

                    }

                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3261:2: ( ( (lv_value_10_1= True | lv_value_10_2= False ) ) )
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3262:1: ( (lv_value_10_1= True | lv_value_10_2= False ) )
                    {
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3262:1: ( (lv_value_10_1= True | lv_value_10_2= False ) )
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3263:1: (lv_value_10_1= True | lv_value_10_2= False )
                    {
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3263:1: (lv_value_10_1= True | lv_value_10_2= False )
                    int alt55=2;
                    int LA55_0 = input.LA(1);

                    if ( (LA55_0==True) ) {
                        alt55=1;
                    }
                    else if ( (LA55_0==False) ) {
                        alt55=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 55, 0, input);

                        throw nvae;
                    }
                    switch (alt55) {
                        case 1 :
                            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3264:3: lv_value_10_1= True
                            {
                            lv_value_10_1=(Token)match(input,True,FOLLOW_True_in_ruleBSTerminalExpression6957); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_value_10_1, grammarAccess.getBSTerminalExpressionAccess().getValueTrueKeyword_3_1_0_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getBSTerminalExpressionRule());
                              	        }
                                     		setWithLastConsumed(current, "value", lv_value_10_1, null);
                              	    
                            }

                            }
                            break;
                        case 2 :
                            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3277:8: lv_value_10_2= False
                            {
                            lv_value_10_2=(Token)match(input,False,FOLLOW_False_in_ruleBSTerminalExpression6985); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_value_10_2, grammarAccess.getBSTerminalExpressionAccess().getValueFalseKeyword_3_1_0_1());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getBSTerminalExpressionRule());
                              	        }
                                     		setWithLastConsumed(current, "value", lv_value_10_2, null);
                              	    
                            }

                            }
                            break;

                    }


                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3294:6: ( () otherlv_12= Null )
                    {
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3294:6: ( () otherlv_12= Null )
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3294:7: () otherlv_12= Null
                    {
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3294:7: ()
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3295:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getBSTerminalExpressionAccess().getBSNullLiteralAction_4_0(),
                                  current);
                          
                    }

                    }

                    otherlv_12=(Token)match(input,Null,FOLLOW_Null_in_ruleBSTerminalExpression7029); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_12, grammarAccess.getBSTerminalExpressionAccess().getNullKeyword_4_1());
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3306:6: ( () otherlv_14= Break )
                    {
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3306:6: ( () otherlv_14= Break )
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3306:7: () otherlv_14= Break
                    {
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3306:7: ()
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3307:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getBSTerminalExpressionAccess().getBSBreakLiteralAction_5_0(),
                                  current);
                          
                    }

                    }

                    otherlv_14=(Token)match(input,Break,FOLLOW_Break_in_ruleBSTerminalExpression7058); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_14, grammarAccess.getBSTerminalExpressionAccess().getBreakKeyword_5_1());
                          
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3318:6: ( () otherlv_16= Continue )
                    {
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3318:6: ( () otherlv_16= Continue )
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3318:7: () otherlv_16= Continue
                    {
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3318:7: ()
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3319:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getBSTerminalExpressionAccess().getBSContinueLiteralAction_6_0(),
                                  current);
                          
                    }

                    }

                    otherlv_16=(Token)match(input,Continue,FOLLOW_Continue_in_ruleBSTerminalExpression7087); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_16, grammarAccess.getBSTerminalExpressionAccess().getContinueKeyword_6_1());
                          
                    }

                    }


                    }
                    break;
                case 8 :
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3330:6: ( () otherlv_18= This )
                    {
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3330:6: ( () otherlv_18= This )
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3330:7: () otherlv_18= This
                    {
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3330:7: ()
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3331:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getBSTerminalExpressionAccess().getBSThisLiteralAction_7_0(),
                                  current);
                          
                    }

                    }

                    otherlv_18=(Token)match(input,This,FOLLOW_This_in_ruleBSTerminalExpression7116); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_18, grammarAccess.getBSTerminalExpressionAccess().getThisKeyword_7_1());
                          
                    }

                    }


                    }
                    break;
                case 9 :
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3342:6: ( () otherlv_20= Client )
                    {
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3342:6: ( () otherlv_20= Client )
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3342:7: () otherlv_20= Client
                    {
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3342:7: ()
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3343:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getBSTerminalExpressionAccess().getBSClientLiteralAction_8_0(),
                                  current);
                          
                    }

                    }

                    otherlv_20=(Token)match(input,Client,FOLLOW_Client_in_ruleBSTerminalExpression7145); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_20, grammarAccess.getBSTerminalExpressionAccess().getClientKeyword_8_1());
                          
                    }

                    }


                    }
                    break;
                case 10 :
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3354:6: ( () otherlv_22= Parent )
                    {
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3354:6: ( () otherlv_22= Parent )
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3354:7: () otherlv_22= Parent
                    {
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3354:7: ()
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3355:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getBSTerminalExpressionAccess().getBSParentLiteralAction_9_0(),
                                  current);
                          
                    }

                    }

                    otherlv_22=(Token)match(input,Parent,FOLLOW_Parent_in_ruleBSTerminalExpression7174); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_22, grammarAccess.getBSTerminalExpressionAccess().getParentKeyword_9_1());
                          
                    }

                    }


                    }
                    break;
                case 11 :
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3366:6: ( () ( (otherlv_24= RULE_ID ) ) )
                    {
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3366:6: ( () ( (otherlv_24= RULE_ID ) ) )
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3366:7: () ( (otherlv_24= RULE_ID ) )
                    {
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3366:7: ()
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3367:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getBSTerminalExpressionAccess().getBSSymbolRefAction_10_0(),
                                  current);
                          
                    }

                    }

                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3372:2: ( (otherlv_24= RULE_ID ) )
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3373:1: (otherlv_24= RULE_ID )
                    {
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3373:1: (otherlv_24= RULE_ID )
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3374:3: otherlv_24= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getBSTerminalExpressionRule());
                      	        }
                              
                    }
                    otherlv_24=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBSTerminalExpression7210); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_24, grammarAccess.getBSTerminalExpressionAccess().getSymbolBSSymbolCrossReference_10_1_0()); 
                      	
                    }

                    }


                    }


                    }


                    }
                    break;
                case 12 :
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3386:6: ( () otherlv_26= LeftParenthesis ( (lv_expression_27_0= ruleBSExpression ) ) otherlv_28= RightParenthesis )
                    {
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3386:6: ( () otherlv_26= LeftParenthesis ( (lv_expression_27_0= ruleBSExpression ) ) otherlv_28= RightParenthesis )
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3386:7: () otherlv_26= LeftParenthesis ( (lv_expression_27_0= ruleBSExpression ) ) otherlv_28= RightParenthesis
                    {
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3386:7: ()
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3387:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getBSTerminalExpressionAccess().getBSParentheticalExpressionAction_11_0(),
                                  current);
                          
                    }

                    }

                    otherlv_26=(Token)match(input,LeftParenthesis,FOLLOW_LeftParenthesis_in_ruleBSTerminalExpression7240); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_26, grammarAccess.getBSTerminalExpressionAccess().getLeftParenthesisKeyword_11_1());
                          
                    }
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3397:1: ( (lv_expression_27_0= ruleBSExpression ) )
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3398:1: (lv_expression_27_0= ruleBSExpression )
                    {
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3398:1: (lv_expression_27_0= ruleBSExpression )
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3399:3: lv_expression_27_0= ruleBSExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getBSTerminalExpressionAccess().getExpressionBSExpressionParserRuleCall_11_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBSExpression_in_ruleBSTerminalExpression7260);
                    lv_expression_27_0=ruleBSExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getBSTerminalExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"expression",
                              		lv_expression_27_0, 
                              		"BSExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_28=(Token)match(input,RightParenthesis,FOLLOW_RightParenthesis_in_ruleBSTerminalExpression7273); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_28, grammarAccess.getBSTerminalExpressionAccess().getRightParenthesisKeyword_11_3());
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBSTerminalExpression"

    // $ANTLR start synpred1_InternalBlorqueScriptParser
    public final void synpred1_InternalBlorqueScriptParser_fragment() throws RecognitionException {   
        // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1031:4: ( Else )
        // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1032:1: Else
        {
        match(input,Else,FOLLOW_Else_in_synpred1_InternalBlorqueScriptParser2249); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalBlorqueScriptParser

    // Delegated rules

    public final boolean synpred1_InternalBlorqueScriptParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalBlorqueScriptParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA8 dfa8 = new DFA8(this);
    protected DFA14 dfa14 = new DFA14(this);
    static final String DFA8_eotS =
        "\7\uffff";
    static final String DFA8_eofS =
        "\7\uffff";
    static final String DFA8_minS =
        "\1\117\1\76\1\117\1\70\1\76\2\uffff";
    static final String DFA8_maxS =
        "\3\117\1\107\1\117\2\uffff";
    static final String DFA8_acceptS =
        "\5\uffff\1\1\1\2";
    static final String DFA8_specialS =
        "\7\uffff}>";
    static final String[] DFA8_transitionS = {
            "\1\1",
            "\1\2\20\uffff\1\3",
            "\1\4",
            "\1\6\10\uffff\1\5\5\uffff\1\5",
            "\1\2\20\uffff\1\3",
            "",
            ""
    };

    static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
    static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
    static final char[] DFA8_min = DFA.unpackEncodedStringToUnsignedChars(DFA8_minS);
    static final char[] DFA8_max = DFA.unpackEncodedStringToUnsignedChars(DFA8_maxS);
    static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
    static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
    static final short[][] DFA8_transition;

    static {
        int numStates = DFA8_transitionS.length;
        DFA8_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
        }
    }

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = DFA8_eot;
            this.eof = DFA8_eof;
            this.min = DFA8_min;
            this.max = DFA8_max;
            this.accept = DFA8_accept;
            this.special = DFA8_special;
            this.transition = DFA8_transition;
        }
        public String getDescription() {
            return "381:1: (this_BSField_0= ruleBSField | this_BSMethod_1= ruleBSMethod )";
        }
    }
    static final String DFA14_eotS =
        "\12\uffff";
    static final String DFA14_eofS =
        "\12\uffff";
    static final String DFA14_minS =
        "\1\4\1\32\6\uffff\1\32\1\uffff";
    static final String DFA14_maxS =
        "\1\122\1\117\6\uffff\1\117\1\uffff";
    static final String DFA14_acceptS =
        "\2\uffff\1\2\1\3\1\4\1\5\1\6\1\7\1\uffff\1\1";
    static final String DFA14_specialS =
        "\12\uffff}>";
    static final String[] DFA14_transitionS = {
            "\1\3\2\uffff\1\3\3\uffff\1\3\1\2\1\uffff\1\7\1\3\1\uffff\1"+
            "\3\1\5\2\uffff\3\3\4\uffff\1\6\1\3\23\uffff\1\4\2\uffff\1\3"+
            "\3\uffff\1\3\2\uffff\1\3\1\uffff\1\3\17\uffff\2\3\1\1\1\3\1"+
            "\uffff\1\3",
            "\2\3\2\uffff\1\3\1\uffff\1\3\2\uffff\1\3\1\uffff\1\3\3\uffff"+
            "\5\3\1\uffff\1\3\3\uffff\1\3\2\uffff\3\3\1\uffff\2\3\1\uffff"+
            "\1\3\1\10\1\3\1\uffff\2\3\1\uffff\4\3\1\uffff\1\3\1\uffff\1"+
            "\3\3\uffff\1\11",
            "",
            "",
            "",
            "",
            "",
            "",
            "\2\3\2\uffff\1\3\1\uffff\1\3\2\uffff\1\3\1\uffff\1\3\3\uffff"+
            "\5\3\1\uffff\1\3\3\uffff\1\3\2\uffff\3\3\1\uffff\2\3\1\uffff"+
            "\3\3\1\uffff\2\3\1\uffff\4\3\1\uffff\1\3\1\uffff\1\3\3\uffff"+
            "\1\11",
            ""
    };

    static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
    static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
    static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
    static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
    static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
    static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
    static final short[][] DFA14_transition;

    static {
        int numStates = DFA14_transitionS.length;
        DFA14_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
        }
    }

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = DFA14_eot;
            this.eof = DFA14_eof;
            this.min = DFA14_min;
            this.max = DFA14_max;
            this.accept = DFA14_accept;
            this.special = DFA14_special;
            this.transition = DFA14_transition;
        }
        public String getDescription() {
            return "754:1: (this_BSVariableDeclaration_0= ruleBSVariableDeclaration | this_BSReturn_1= ruleBSReturn | (this_BSExpression_2= ruleBSExpression otherlv_3= Semicolon ) | this_BSIfStatement_4= ruleBSIfStatement | this_BSWhileLoop_5= ruleBSWhileLoop | this_BSForLoop_6= ruleBSForLoop | this_BSSwitchStatement_7= ruleBSSwitchStatement )";
        }
    }
 

    public static final BitSet FOLLOW_ruleBSFile_in_entryRuleBSFile67 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBSFile77 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Package_in_ruleBSFile116 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleBSFile136 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_Semicolon_in_ruleBSFile149 = new BitSet(new long[]{0x0000000000010102L});
    public static final BitSet FOLLOW_ruleBSImport_in_ruleBSFile171 = new BitSet(new long[]{0x0000000000010102L});
    public static final BitSet FOLLOW_ruleBSClass_in_ruleBSFile193 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_ruleBSImport_in_entryRuleBSImport229 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBSImport239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Import_in_ruleBSImport277 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_ruleBSImport297 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_Semicolon_in_ruleBSImport310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard345 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildcard403 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_FullStopAsterisk_in_ruleQualifiedNameWithWildcard422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName464 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName515 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_FullStop_in_ruleQualifiedName534 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName549 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_ruleBSClass_in_entryRuleBSClass595 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBSClass605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Class_in_ruleBSClass643 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBSClass659 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000401L});
    public static final BitSet FOLLOW_Colon_in_ruleBSClass678 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleBSClass700 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_LeftCurlyBracket_in_ruleBSClass715 = new BitSet(new long[]{0x0000000000000000L,0x0000000000009000L});
    public static final BitSet FOLLOW_ruleBSMember_in_ruleBSClass735 = new BitSet(new long[]{0x0000000000000000L,0x0000000000009000L});
    public static final BitSet FOLLOW_RightCurlyBracket_in_ruleBSClass749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBSMember_in_entryRuleBSMember783 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBSMember793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBSField_in_ruleBSMember840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBSMethod_in_ruleBSMember867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBSField_in_entryRuleBSField901 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBSField911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleBSField959 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBSField976 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000082L});
    public static final BitSet FOLLOW_LeftSquareBracket_in_ruleBSField1001 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_RightSquareBracket_in_ruleBSField1025 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_Semicolon_in_ruleBSField1039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBSMethod_in_entryRuleBSMethod1073 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBSMethod1083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleBSMethod1131 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBSMethod1148 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_LeftParenthesis_in_ruleBSMethod1166 = new BitSet(new long[]{0x0200000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_ruleBSParameter_in_ruleBSMethod1187 = new BitSet(new long[]{0x1200000000000000L});
    public static final BitSet FOLLOW_Comma_in_ruleBSMethod1201 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_ruleBSParameter_in_ruleBSMethod1221 = new BitSet(new long[]{0x1200000000000000L});
    public static final BitSet FOLLOW_RightParenthesis_in_ruleBSMethod1238 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_ruleBSMethodBody_in_ruleBSMethod1258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBSParameter_in_entryRuleBSParameter1293 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBSParameter1303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleBSParameter1351 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBSParameter1368 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_LeftSquareBracket_in_ruleBSParameter1393 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_RightSquareBracket_in_ruleBSParameter1417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBSMethodBody_in_entryRuleBSMethodBody1453 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBSMethodBody1463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LeftCurlyBracket_in_ruleBSMethodBody1510 = new BitSet(new long[]{0x2912000030E6D890L,0x000000000005F000L});
    public static final BitSet FOLLOW_ruleBSStatement_in_ruleBSMethodBody1530 = new BitSet(new long[]{0x2912000030E6D890L,0x000000000005F000L});
    public static final BitSet FOLLOW_RightCurlyBracket_in_ruleBSMethodBody1544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBSStatement_in_entryRuleBSStatement1578 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBSStatement1588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBSVariableDeclaration_in_ruleBSStatement1635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBSReturn_in_ruleBSStatement1662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBSExpression_in_ruleBSStatement1690 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_Semicolon_in_ruleBSStatement1702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBSIfStatement_in_ruleBSStatement1730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBSWhileLoop_in_ruleBSStatement1757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBSForLoop_in_ruleBSStatement1784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBSSwitchStatement_in_ruleBSStatement1811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBSReturn_in_entryRuleBSReturn1845 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBSReturn1855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Return_in_ruleBSReturn1893 = new BitSet(new long[]{0x2910000020E28890L,0x000000000005E000L});
    public static final BitSet FOLLOW_ruleBSExpression_in_ruleBSReturn1913 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_Semicolon_in_ruleBSReturn1926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBSVariableDeclaration_in_entryRuleBSVariableDeclaration1960 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBSVariableDeclaration1970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleBSVariableDeclaration2018 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBSVariableDeclaration2035 = new BitSet(new long[]{0x0000000000000000L,0x000000000000000AL});
    public static final BitSet FOLLOW_EqualsSign_in_ruleBSVariableDeclaration2054 = new BitSet(new long[]{0x2910000020E28890L,0x000000000005E000L});
    public static final BitSet FOLLOW_ruleBSExpression_in_ruleBSVariableDeclaration2074 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_Semicolon_in_ruleBSVariableDeclaration2089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBSIfStatement_in_entryRuleBSIfStatement2123 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBSIfStatement2133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_If_in_ruleBSIfStatement2171 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_LeftParenthesis_in_ruleBSIfStatement2183 = new BitSet(new long[]{0x2910000020E28890L,0x000000000005E000L});
    public static final BitSet FOLLOW_ruleBSExpression_in_ruleBSIfStatement2203 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_RightParenthesis_in_ruleBSIfStatement2216 = new BitSet(new long[]{0x2912000030E6D890L,0x000000000005E400L});
    public static final BitSet FOLLOW_ruleBSIfBlock_in_ruleBSIfStatement2236 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_Else_in_ruleBSIfStatement2257 = new BitSet(new long[]{0x2912000030E6D890L,0x000000000005E400L});
    public static final BitSet FOLLOW_ruleBSIfBlock_in_ruleBSIfStatement2278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBSWhileLoop_in_entryRuleBSWhileLoop2315 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBSWhileLoop2325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_While_in_ruleBSWhileLoop2363 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_LeftParenthesis_in_ruleBSWhileLoop2375 = new BitSet(new long[]{0x2910000020E28890L,0x000000000005E000L});
    public static final BitSet FOLLOW_ruleBSExpression_in_ruleBSWhileLoop2395 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_RightParenthesis_in_ruleBSWhileLoop2408 = new BitSet(new long[]{0x2912000030E6D890L,0x000000000005E400L});
    public static final BitSet FOLLOW_ruleBSLoopBlock_in_ruleBSWhileLoop2428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBSForLoop_in_entryRuleBSForLoop2463 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBSForLoop2473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_For_in_ruleBSForLoop2511 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_LeftParenthesis_in_ruleBSForLoop2523 = new BitSet(new long[]{0x2910000020E28890L,0x000000000005E000L});
    public static final BitSet FOLLOW_ruleBSExpression_in_ruleBSForLoop2543 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_Semicolon_in_ruleBSForLoop2556 = new BitSet(new long[]{0x2910000020E28890L,0x000000000005E000L});
    public static final BitSet FOLLOW_ruleBSExpression_in_ruleBSForLoop2576 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_Semicolon_in_ruleBSForLoop2589 = new BitSet(new long[]{0x2910000020E28890L,0x000000000005E000L});
    public static final BitSet FOLLOW_ruleBSExpression_in_ruleBSForLoop2609 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_RightParenthesis_in_ruleBSForLoop2622 = new BitSet(new long[]{0x2912000030E6D890L,0x000000000005E400L});
    public static final BitSet FOLLOW_ruleBSLoopBlock_in_ruleBSForLoop2642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBSSwitchStatement_in_entryRuleBSSwitchStatement2677 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBSSwitchStatement2687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Switch_in_ruleBSSwitchStatement2725 = new BitSet(new long[]{0x0120000000000000L});
    public static final BitSet FOLLOW_DollarSign_in_ruleBSSwitchStatement2743 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_LeftParenthesis_in_ruleBSSwitchStatement2768 = new BitSet(new long[]{0x2910000020E28890L,0x000000000005E000L});
    public static final BitSet FOLLOW_ruleBSExpression_in_ruleBSSwitchStatement2788 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_RightParenthesis_in_ruleBSSwitchStatement2801 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_ruleBSSwitchBlock_in_ruleBSSwitchStatement2821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBSIfBlock_in_entryRuleBSIfBlock2856 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBSIfBlock2866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBSStatement_in_ruleBSIfBlock2912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LeftCurlyBracket_in_ruleBSIfBlock2941 = new BitSet(new long[]{0x2912000030E6D890L,0x000000000005F000L});
    public static final BitSet FOLLOW_ruleBSStatement_in_ruleBSIfBlock2961 = new BitSet(new long[]{0x2912000030E6D890L,0x000000000005F000L});
    public static final BitSet FOLLOW_RightCurlyBracket_in_ruleBSIfBlock2975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBSLoopBlock_in_entryRuleBSLoopBlock3010 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBSLoopBlock3020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBSStatement_in_ruleBSLoopBlock3066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LeftCurlyBracket_in_ruleBSLoopBlock3095 = new BitSet(new long[]{0x2912000030E6D890L,0x000000000005F000L});
    public static final BitSet FOLLOW_ruleBSStatement_in_ruleBSLoopBlock3115 = new BitSet(new long[]{0x2912000030E6D890L,0x000000000005F000L});
    public static final BitSet FOLLOW_RightCurlyBracket_in_ruleBSLoopBlock3129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBSSwitchBlock_in_entryRuleBSSwitchBlock3164 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBSSwitchBlock3174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LeftCurlyBracket_in_ruleBSSwitchBlock3221 = new BitSet(new long[]{0x0000000000080020L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleBSCase_in_ruleBSSwitchBlock3241 = new BitSet(new long[]{0x0000000000080020L,0x0000000000001000L});
    public static final BitSet FOLLOW_RightCurlyBracket_in_ruleBSSwitchBlock3255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBSCase_in_entryRuleBSCase3289 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBSCase3299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Case_in_ruleBSCase3338 = new BitSet(new long[]{0x2910000020E28890L,0x000000000005E000L});
    public static final BitSet FOLLOW_ruleBSExpression_in_ruleBSCase3358 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_Colon_in_ruleBSCase3371 = new BitSet(new long[]{0x2912000030E6D890L,0x000000000005E000L});
    public static final BitSet FOLLOW_ruleBSCaseBlock_in_ruleBSCase3391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Default_in_ruleBSCase3412 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_Colon_in_ruleBSCase3424 = new BitSet(new long[]{0x2912000030E6D890L,0x000000000005E000L});
    public static final BitSet FOLLOW_ruleBSCaseBlock_in_ruleBSCase3444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBSCaseBlock_in_entryRuleBSCaseBlock3480 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBSCaseBlock3490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBSStatement_in_ruleBSCaseBlock3545 = new BitSet(new long[]{0x2912000030E6D892L,0x000000000005E000L});
    public static final BitSet FOLLOW_ruleBSExpression_in_entryRuleBSExpression3585 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBSExpression3595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBSTernaryExpression_in_ruleBSExpression3641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBSTernaryExpression_in_entryRuleBSTernaryExpression3676 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBSTernaryExpression3686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBSBooleanOrExpression_in_ruleBSTernaryExpression3733 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_QuestionMark_in_ruleBSTernaryExpression3755 = new BitSet(new long[]{0x2910000020E28890L,0x000000000005E000L});
    public static final BitSet FOLLOW_ruleBSExpression_in_ruleBSTernaryExpression3775 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_Colon_in_ruleBSTernaryExpression3788 = new BitSet(new long[]{0x2910000020E28890L,0x000000000005E000L});
    public static final BitSet FOLLOW_ruleBSExpression_in_ruleBSTernaryExpression3808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBSBooleanOrExpression_in_entryRuleBSBooleanOrExpression3845 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBSBooleanOrExpression3855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBSBooleanAndExpression_in_ruleBSBooleanOrExpression3902 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_VerticalLineVerticalLine_in_ruleBSBooleanOrExpression3924 = new BitSet(new long[]{0x2910000020E28890L,0x000000000005E000L});
    public static final BitSet FOLLOW_ruleBSBooleanAndExpression_in_ruleBSBooleanOrExpression3944 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_ruleBSBooleanAndExpression_in_entryRuleBSBooleanAndExpression3981 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBSBooleanAndExpression3991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBSBitwiseOrExpression_in_ruleBSBooleanAndExpression4038 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_AmpersandAmpersand_in_ruleBSBooleanAndExpression4060 = new BitSet(new long[]{0x2910000020E28890L,0x000000000005E000L});
    public static final BitSet FOLLOW_ruleBSBitwiseOrExpression_in_ruleBSBooleanAndExpression4080 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_ruleBSBitwiseOrExpression_in_entryRuleBSBitwiseOrExpression4117 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBSBitwiseOrExpression4127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBSBitwiseXorExpression_in_ruleBSBitwiseOrExpression4174 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_VerticalLine_in_ruleBSBitwiseOrExpression4196 = new BitSet(new long[]{0x2910000020E28890L,0x000000000005E000L});
    public static final BitSet FOLLOW_ruleBSBitwiseXorExpression_in_ruleBSBitwiseOrExpression4216 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_ruleBSBitwiseXorExpression_in_entryRuleBSBitwiseXorExpression4253 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBSBitwiseXorExpression4263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBSBitwiseAndExpression_in_ruleBSBitwiseXorExpression4310 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
    public static final BitSet FOLLOW_CircumflexAccent_in_ruleBSBitwiseXorExpression4332 = new BitSet(new long[]{0x2910000020E28890L,0x000000000005E000L});
    public static final BitSet FOLLOW_ruleBSBitwiseAndExpression_in_ruleBSBitwiseXorExpression4352 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleBSBitwiseAndExpression_in_entryRuleBSBitwiseAndExpression4389 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBSBitwiseAndExpression4399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBSEqualityExpression_in_ruleBSBitwiseAndExpression4446 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_Ampersand_in_ruleBSBitwiseAndExpression4468 = new BitSet(new long[]{0x2910000020E28890L,0x000000000005E000L});
    public static final BitSet FOLLOW_ruleBSEqualityExpression_in_ruleBSBitwiseAndExpression4488 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_ruleBSEqualityExpression_in_entryRuleBSEqualityExpression4525 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBSEqualityExpression4535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBSOrderedRelationExpression_in_ruleBSEqualityExpression4582 = new BitSet(new long[]{0x0000080040000002L});
    public static final BitSet FOLLOW_EqualsSignEqualsSign_in_ruleBSEqualityExpression4612 = new BitSet(new long[]{0x2910000020E28890L,0x000000000005E000L});
    public static final BitSet FOLLOW_ExclamationMarkEqualsSign_in_ruleBSEqualityExpression4640 = new BitSet(new long[]{0x2910000020E28890L,0x000000000005E000L});
    public static final BitSet FOLLOW_ruleBSOrderedRelationExpression_in_ruleBSEqualityExpression4675 = new BitSet(new long[]{0x0000080040000002L});
    public static final BitSet FOLLOW_ruleBSOrderedRelationExpression_in_entryRuleBSOrderedRelationExpression4712 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBSOrderedRelationExpression4722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBSBitwiseShiftExpression_in_ruleBSOrderedRelationExpression4769 = new BitSet(new long[]{0x0000140000000002L,0x0000000000000014L});
    public static final BitSet FOLLOW_LessThanSign_in_ruleBSOrderedRelationExpression4799 = new BitSet(new long[]{0x2910000020E28890L,0x000000000005E000L});
    public static final BitSet FOLLOW_GreaterThanSign_in_ruleBSOrderedRelationExpression4827 = new BitSet(new long[]{0x2910000020E28890L,0x000000000005E000L});
    public static final BitSet FOLLOW_LessThanSignEqualsSign_in_ruleBSOrderedRelationExpression4855 = new BitSet(new long[]{0x2910000020E28890L,0x000000000005E000L});
    public static final BitSet FOLLOW_GreaterThanSignEqualsSign_in_ruleBSOrderedRelationExpression4883 = new BitSet(new long[]{0x2910000020E28890L,0x000000000005E000L});
    public static final BitSet FOLLOW_ruleBSBitwiseShiftExpression_in_ruleBSOrderedRelationExpression4918 = new BitSet(new long[]{0x0000140000000002L,0x0000000000000014L});
    public static final BitSet FOLLOW_ruleBSBitwiseShiftExpression_in_entryRuleBSBitwiseShiftExpression4955 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBSBitwiseShiftExpression4965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBSPlusMinusOrStringConcatExpression_in_ruleBSBitwiseShiftExpression5012 = new BitSet(new long[]{0x0000220000000002L});
    public static final BitSet FOLLOW_LessThanSignLessThanSign_in_ruleBSBitwiseShiftExpression5042 = new BitSet(new long[]{0x2910000020E28890L,0x000000000005E000L});
    public static final BitSet FOLLOW_GreaterThanSignGreaterThanSign_in_ruleBSBitwiseShiftExpression5070 = new BitSet(new long[]{0x2910000020E28890L,0x000000000005E000L});
    public static final BitSet FOLLOW_ruleBSPlusMinusOrStringConcatExpression_in_ruleBSBitwiseShiftExpression5105 = new BitSet(new long[]{0x0000220000000002L});
    public static final BitSet FOLLOW_ruleBSPlusMinusOrStringConcatExpression_in_entryRuleBSPlusMinusOrStringConcatExpression5142 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBSPlusMinusOrStringConcatExpression5152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBSMulDivOrModExpression_in_ruleBSPlusMinusOrStringConcatExpression5199 = new BitSet(new long[]{0x280080000C000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_PlusSign_in_ruleBSPlusMinusOrStringConcatExpression5229 = new BitSet(new long[]{0x2910000020E28890L,0x000000000005E000L});
    public static final BitSet FOLLOW_HyphenMinus_in_ruleBSPlusMinusOrStringConcatExpression5257 = new BitSet(new long[]{0x2910000020E28890L,0x000000000005E000L});
    public static final BitSet FOLLOW_CommercialAt_in_ruleBSPlusMinusOrStringConcatExpression5285 = new BitSet(new long[]{0x2910000020E28890L,0x000000000005E000L});
    public static final BitSet FOLLOW_SPC_in_ruleBSPlusMinusOrStringConcatExpression5313 = new BitSet(new long[]{0x2910000020E28890L,0x000000000005E000L});
    public static final BitSet FOLLOW_NL_in_ruleBSPlusMinusOrStringConcatExpression5341 = new BitSet(new long[]{0x2910000020E28890L,0x000000000005E000L});
    public static final BitSet FOLLOW_TAB_in_ruleBSPlusMinusOrStringConcatExpression5369 = new BitSet(new long[]{0x2910000020E28890L,0x000000000005E000L});
    public static final BitSet FOLLOW_ruleBSMulDivOrModExpression_in_ruleBSPlusMinusOrStringConcatExpression5404 = new BitSet(new long[]{0x280080000C000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleBSMulDivOrModExpression_in_entryRuleBSMulDivOrModExpression5441 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBSMulDivOrModExpression5451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBSCastOrNewExpression_in_ruleBSMulDivOrModExpression5498 = new BitSet(new long[]{0x8440000000000002L});
    public static final BitSet FOLLOW_Asterisk_in_ruleBSMulDivOrModExpression5528 = new BitSet(new long[]{0x2910000020E28890L,0x000000000005E000L});
    public static final BitSet FOLLOW_Solidus_in_ruleBSMulDivOrModExpression5556 = new BitSet(new long[]{0x2910000020E28890L,0x000000000005E000L});
    public static final BitSet FOLLOW_PercentSign_in_ruleBSMulDivOrModExpression5584 = new BitSet(new long[]{0x2910000020E28890L,0x000000000005E000L});
    public static final BitSet FOLLOW_ruleBSCastOrNewExpression_in_ruleBSMulDivOrModExpression5619 = new BitSet(new long[]{0x8440000000000002L});
    public static final BitSet FOLLOW_ruleBSCastOrNewExpression_in_entryRuleBSCastOrNewExpression5656 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBSCastOrNewExpression5666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBSUnaryModifierExpression_in_ruleBSCastOrNewExpression5713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LeftParenthesis_in_ruleBSCastOrNewExpression5741 = new BitSet(new long[]{0x0000000000002600L});
    public static final BitSet FOLLOW_String_in_ruleBSCastOrNewExpression5761 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_Number_in_ruleBSCastOrNewExpression5789 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_Object_in_ruleBSCastOrNewExpression5817 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_RightParenthesis_in_ruleBSCastOrNewExpression5844 = new BitSet(new long[]{0x2910000020E28890L,0x000000000005E000L});
    public static final BitSet FOLLOW_ruleBSCastOrNewExpression_in_ruleBSCastOrNewExpression5864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_New_in_ruleBSCastOrNewExpression5894 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008080L});
    public static final BitSet FOLLOW_LeftSquareBracket_in_ruleBSCastOrNewExpression5913 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_RightSquareBracket_in_ruleBSCastOrNewExpression5937 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleBSCastOrNewExpression5961 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_LeftParenthesis_in_ruleBSCastOrNewExpression5974 = new BitSet(new long[]{0x2B10000020E28890L,0x000000000005E000L});
    public static final BitSet FOLLOW_ruleBSExpression_in_ruleBSCastOrNewExpression5995 = new BitSet(new long[]{0x1200000000000000L});
    public static final BitSet FOLLOW_Comma_in_ruleBSCastOrNewExpression6009 = new BitSet(new long[]{0x2910000020E28890L,0x000000000005E000L});
    public static final BitSet FOLLOW_ruleBSExpression_in_ruleBSCastOrNewExpression6029 = new BitSet(new long[]{0x1200000000000000L});
    public static final BitSet FOLLOW_RightParenthesis_in_ruleBSCastOrNewExpression6046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBSUnaryModifierExpression_in_entryRuleBSUnaryModifierExpression6081 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBSUnaryModifierExpression6091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBSInvokationExpression_in_ruleBSUnaryModifierExpression6138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PlusSign_in_ruleBSUnaryModifierExpression6174 = new BitSet(new long[]{0x2910000000E28890L,0x000000000005E000L});
    public static final BitSet FOLLOW_HyphenMinus_in_ruleBSUnaryModifierExpression6202 = new BitSet(new long[]{0x2910000000E28890L,0x000000000005E000L});
    public static final BitSet FOLLOW_ExclamationMark_in_ruleBSUnaryModifierExpression6230 = new BitSet(new long[]{0x2910000000E28890L,0x000000000005E000L});
    public static final BitSet FOLLOW_Tilde_in_ruleBSUnaryModifierExpression6258 = new BitSet(new long[]{0x2910000000E28890L,0x000000000005E000L});
    public static final BitSet FOLLOW_ruleBSUnaryModifierExpression_in_ruleBSUnaryModifierExpression6293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBSInvokationExpression_in_entryRuleBSInvokationExpression6329 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBSInvokationExpression6339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBSTerminalExpression_in_ruleBSInvokationExpression6386 = new BitSet(new long[]{0x4100002800000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_FullStop_in_ruleBSInvokationExpression6409 = new BitSet(new long[]{0x4100002800000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_LeftParenthesis_in_ruleBSInvokationExpression6438 = new BitSet(new long[]{0x2B10000020E28890L,0x000000000005E000L});
    public static final BitSet FOLLOW_ruleBSExpression_in_ruleBSInvokationExpression6459 = new BitSet(new long[]{0x1200000000000000L});
    public static final BitSet FOLLOW_Comma_in_ruleBSInvokationExpression6473 = new BitSet(new long[]{0x2910000020E28890L,0x000000000005E000L});
    public static final BitSet FOLLOW_ruleBSExpression_in_ruleBSInvokationExpression6493 = new BitSet(new long[]{0x1200000000000000L});
    public static final BitSet FOLLOW_RightParenthesis_in_ruleBSInvokationExpression6510 = new BitSet(new long[]{0x4100002800000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_LeftSquareBracket_in_ruleBSInvokationExpression6539 = new BitSet(new long[]{0x2910000020E28890L,0x000000000005E100L});
    public static final BitSet FOLLOW_ruleBSExpression_in_ruleBSInvokationExpression6560 = new BitSet(new long[]{0x1000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_Comma_in_ruleBSInvokationExpression6574 = new BitSet(new long[]{0x2910000020E28890L,0x000000000005E000L});
    public static final BitSet FOLLOW_ruleBSExpression_in_ruleBSInvokationExpression6594 = new BitSet(new long[]{0x1000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_RightSquareBracket_in_ruleBSInvokationExpression6611 = new BitSet(new long[]{0x4100002800000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_PlusSignPlusSign_in_ruleBSInvokationExpression6648 = new BitSet(new long[]{0x4100002800000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_HyphenMinusHyphenMinus_in_ruleBSInvokationExpression6676 = new BitSet(new long[]{0x4100002800000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleBSTerminalExpression_in_entryRuleBSTerminalExpression6728 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBSTerminalExpression6738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleBSTerminalExpression6790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HEX_VALUE_in_ruleBSTerminalExpression6829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleBSTerminalExpression6868 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_FullStop_in_ruleBSTerminalExpression6896 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleBSTerminalExpression6912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_True_in_ruleBSTerminalExpression6957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_False_in_ruleBSTerminalExpression6985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Null_in_ruleBSTerminalExpression7029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Break_in_ruleBSTerminalExpression7058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Continue_in_ruleBSTerminalExpression7087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_This_in_ruleBSTerminalExpression7116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Client_in_ruleBSTerminalExpression7145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Parent_in_ruleBSTerminalExpression7174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBSTerminalExpression7210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LeftParenthesis_in_ruleBSTerminalExpression7240 = new BitSet(new long[]{0x2910000020E28890L,0x000000000005E000L});
    public static final BitSet FOLLOW_ruleBSExpression_in_ruleBSTerminalExpression7260 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_RightParenthesis_in_ruleBSTerminalExpression7273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Else_in_synpred1_InternalBlorqueScriptParser2249 = new BitSet(new long[]{0x0000000000000002L});

}