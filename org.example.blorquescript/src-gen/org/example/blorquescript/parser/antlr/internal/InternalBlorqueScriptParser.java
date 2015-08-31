package org.example.blorquescript.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "TaggedString", "Continue", "Default", "Package", "Client", "Import", "Number", "Object", "Parent", "Return", "String", "Switch", "Break", "Class", "False", "While", "NONE", "Case", "Else", "Null", "This", "True", "Void", "LessThanSignLessThanSignEqualsSign", "GreaterThanSignGreaterThanSignEqualsSign", "SPC", "TAB", "For", "New", "ExclamationMarkEqualsSign", "PercentSignEqualsSign", "AmpersandAmpersand", "AmpersandEqualsSign", "AsteriskEqualsSign", "PlusSignPlusSign", "PlusSignEqualsSign", "HyphenMinusHyphenMinus", "HyphenMinusEqualsSign", "FullStopAsterisk", "SolidusEqualsSign", "LessThanSignLessThanSign", "LessThanSignEqualsSign", "EqualsSignEqualsSign", "GreaterThanSignEqualsSign", "GreaterThanSignGreaterThanSign", "CommercialAtEqualsSign", "NL", "CircumflexAccentEqualsSign", "If", "VerticalLineEqualsSign", "VerticalLineVerticalLine", "ExclamationMark", "DollarSign", "PercentSign", "Ampersand", "LeftParenthesis", "RightParenthesis", "Asterisk", "PlusSign", "Comma", "HyphenMinus", "FullStop", "Solidus", "Colon", "Semicolon", "LessThanSign", "EqualsSign", "GreaterThanSign", "QuestionMark", "CommercialAt", "LeftSquareBracket", "RightSquareBracket", "CircumflexAccent", "LeftCurlyBracket", "VerticalLine", "RightCurlyBracket", "Tilde", "RULE_HEX_VALUE", "RULE_ID", "RULE_INT", "RULE_ESCAPE_CODE", "RULE_STRING", "RULE_TAGGED_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int HyphenMinusHyphenMinus=40;
    public static final int New=32;
    public static final int Null=23;
    public static final int Import=9;
    public static final int AmpersandEqualsSign=36;
    public static final int SolidusEqualsSign=43;
    public static final int SPC=29;
    public static final int Break=16;
    public static final int True=25;
    public static final int String=14;
    public static final int False=18;
    public static final int LessThanSign=69;
    public static final int PercentSign=57;
    public static final int LeftParenthesis=59;
    public static final int RULE_ESCAPE_CODE=84;
    public static final int This=24;
    public static final int Ampersand=58;
    public static final int AsteriskEqualsSign=37;
    public static final int Client=8;
    public static final int NONE=20;
    public static final int Void=26;
    public static final int VerticalLineEqualsSign=53;
    public static final int RightSquareBracket=75;
    public static final int RULE_TAGGED_STRING=86;
    public static final int ExclamationMark=55;
    public static final int GreaterThanSign=71;
    public static final int RULE_ID=82;
    public static final int For=31;
    public static final int RightParenthesis=60;
    public static final int GreaterThanSignEqualsSign=47;
    public static final int EqualsSignEqualsSign=46;
    public static final int RULE_HEX_VALUE=81;
    public static final int Switch=15;
    public static final int VerticalLine=78;
    public static final int PlusSign=62;
    public static final int RULE_INT=83;
    public static final int FullStopAsterisk=42;
    public static final int RULE_ML_COMMENT=87;
    public static final int CircumflexAccentEqualsSign=51;
    public static final int TaggedString=4;
    public static final int Object=11;
    public static final int Class=17;
    public static final int LeftSquareBracket=74;
    public static final int Package=7;
    public static final int LessThanSignLessThanSign=44;
    public static final int If=52;
    public static final int NL=50;
    public static final int LessThanSignLessThanSignEqualsSign=27;
    public static final int Parent=12;
    public static final int VerticalLineVerticalLine=54;
    public static final int RULE_STRING=85;
    public static final int Continue=5;
    public static final int Case=21;
    public static final int RULE_SL_COMMENT=88;
    public static final int Comma=63;
    public static final int EqualsSign=70;
    public static final int HyphenMinus=64;
    public static final int Number=10;
    public static final int AmpersandAmpersand=35;
    public static final int HyphenMinusEqualsSign=41;
    public static final int LessThanSignEqualsSign=45;
    public static final int Solidus=66;
    public static final int Colon=67;
    public static final int RightCurlyBracket=79;
    public static final int EOF=-1;
    public static final int Asterisk=61;
    public static final int PercentSignEqualsSign=34;
    public static final int PlusSignEqualsSign=39;
    public static final int FullStop=65;
    public static final int Return=13;
    public static final int CommercialAtEqualsSign=49;
    public static final int RULE_WS=89;
    public static final int LeftCurlyBracket=77;
    public static final int Tilde=80;
    public static final int While=19;
    public static final int RULE_ANY_OTHER=90;
    public static final int GreaterThanSignGreaterThanSign=48;
    public static final int Default=6;
    public static final int CircumflexAccent=76;
    public static final int CommercialAt=73;
    public static final int Semicolon=68;
    public static final int TAB=30;
    public static final int PlusSignPlusSign=38;
    public static final int QuestionMark=72;
    public static final int Else=22;
    public static final int DollarSign=56;
    public static final int ExclamationMarkEqualsSign=33;
    public static final int GreaterThanSignGreaterThanSignEqualsSign=28;

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
    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:62:1: entryRuleBSFile returns [EObject current=null] : iv_ruleBSFile= ruleBSFile EOF ;
    public final EObject entryRuleBSFile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBSFile = null;


        try {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:63:2: (iv_ruleBSFile= ruleBSFile EOF )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:64:2: iv_ruleBSFile= ruleBSFile EOF
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
    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:71:1: ruleBSFile returns [EObject current=null] : ( (otherlv_0= Package ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= Semicolon )? ( (lv_imports_3_0= ruleBSImport ) )* ( (lv_classes_4_0= ruleBSClass ) )* ) ;
    public final EObject ruleBSFile() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_imports_3_0 = null;

        EObject lv_classes_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:74:28: ( ( (otherlv_0= Package ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= Semicolon )? ( (lv_imports_3_0= ruleBSImport ) )* ( (lv_classes_4_0= ruleBSClass ) )* ) )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:75:1: ( (otherlv_0= Package ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= Semicolon )? ( (lv_imports_3_0= ruleBSImport ) )* ( (lv_classes_4_0= ruleBSClass ) )* )
            {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:75:1: ( (otherlv_0= Package ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= Semicolon )? ( (lv_imports_3_0= ruleBSImport ) )* ( (lv_classes_4_0= ruleBSClass ) )* )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:75:2: (otherlv_0= Package ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= Semicolon )? ( (lv_imports_3_0= ruleBSImport ) )* ( (lv_classes_4_0= ruleBSClass ) )*
            {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:75:2: (otherlv_0= Package ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= Semicolon )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==Package) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:76:2: otherlv_0= Package ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= Semicolon
                    {
                    otherlv_0=(Token)match(input,Package,FOLLOW_Package_in_ruleBSFile116); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getBSFileAccess().getPackageKeyword_0_0());
                          
                    }
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:80:1: ( (lv_name_1_0= ruleQualifiedName ) )
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:81:1: (lv_name_1_0= ruleQualifiedName )
                    {
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:81:1: (lv_name_1_0= ruleQualifiedName )
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:82:3: lv_name_1_0= ruleQualifiedName
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

            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:103:3: ( (lv_imports_3_0= ruleBSImport ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==Import) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:104:1: (lv_imports_3_0= ruleBSImport )
            	    {
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:104:1: (lv_imports_3_0= ruleBSImport )
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:105:3: lv_imports_3_0= ruleBSImport
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

            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:121:3: ( (lv_classes_4_0= ruleBSClass ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==Class) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:122:1: (lv_classes_4_0= ruleBSClass )
            	    {
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:122:1: (lv_classes_4_0= ruleBSClass )
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:123:3: lv_classes_4_0= ruleBSClass
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
    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:147:1: entryRuleBSImport returns [EObject current=null] : iv_ruleBSImport= ruleBSImport EOF ;
    public final EObject entryRuleBSImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBSImport = null;


        try {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:148:2: (iv_ruleBSImport= ruleBSImport EOF )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:149:2: iv_ruleBSImport= ruleBSImport EOF
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
    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:156:1: ruleBSImport returns [EObject current=null] : (otherlv_0= Import ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) otherlv_2= Semicolon ) ;
    public final EObject ruleBSImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:159:28: ( (otherlv_0= Import ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) otherlv_2= Semicolon ) )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:160:1: (otherlv_0= Import ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) otherlv_2= Semicolon )
            {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:160:1: (otherlv_0= Import ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) otherlv_2= Semicolon )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:161:2: otherlv_0= Import ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) otherlv_2= Semicolon
            {
            otherlv_0=(Token)match(input,Import,FOLLOW_Import_in_ruleBSImport277); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getBSImportAccess().getImportKeyword_0());
                  
            }
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:165:1: ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:166:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:166:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:167:3: lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard
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
    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:196:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:197:1: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:198:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
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
    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:205:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= FullStopAsterisk )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;


         enterRule(); 
            
        try {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:209:6: ( (this_QualifiedName_0= ruleQualifiedName (kw= FullStopAsterisk )? ) )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:210:1: (this_QualifiedName_0= ruleQualifiedName (kw= FullStopAsterisk )? )
            {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:210:1: (this_QualifiedName_0= ruleQualifiedName (kw= FullStopAsterisk )? )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:211:5: this_QualifiedName_0= ruleQualifiedName (kw= FullStopAsterisk )?
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
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:221:1: (kw= FullStopAsterisk )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==FullStopAsterisk) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:222:2: kw= FullStopAsterisk
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
    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:235:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:236:1: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:237:2: iv_ruleQualifiedName= ruleQualifiedName EOF
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
    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:244:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= FullStop this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:248:6: ( (this_ID_0= RULE_ID (kw= FullStop this_ID_2= RULE_ID )* ) )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:249:1: (this_ID_0= RULE_ID (kw= FullStop this_ID_2= RULE_ID )* )
            {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:249:1: (this_ID_0= RULE_ID (kw= FullStop this_ID_2= RULE_ID )* )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:249:6: this_ID_0= RULE_ID (kw= FullStop this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName515); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:256:1: (kw= FullStop this_ID_2= RULE_ID )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==FullStop) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:257:2: kw= FullStop this_ID_2= RULE_ID
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
    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:277:1: entryRuleBSClass returns [EObject current=null] : iv_ruleBSClass= ruleBSClass EOF ;
    public final EObject entryRuleBSClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBSClass = null;


        try {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:278:2: (iv_ruleBSClass= ruleBSClass EOF )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:279:2: iv_ruleBSClass= ruleBSClass EOF
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
    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:286:1: ruleBSClass returns [EObject current=null] : (otherlv_0= Class ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= Colon ( ( ruleQualifiedName ) ) )? otherlv_4= LeftCurlyBracket ( (lv_members_5_0= ruleBSMember ) )* otherlv_6= RightCurlyBracket ) ;
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
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:289:28: ( (otherlv_0= Class ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= Colon ( ( ruleQualifiedName ) ) )? otherlv_4= LeftCurlyBracket ( (lv_members_5_0= ruleBSMember ) )* otherlv_6= RightCurlyBracket ) )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:290:1: (otherlv_0= Class ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= Colon ( ( ruleQualifiedName ) ) )? otherlv_4= LeftCurlyBracket ( (lv_members_5_0= ruleBSMember ) )* otherlv_6= RightCurlyBracket )
            {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:290:1: (otherlv_0= Class ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= Colon ( ( ruleQualifiedName ) ) )? otherlv_4= LeftCurlyBracket ( (lv_members_5_0= ruleBSMember ) )* otherlv_6= RightCurlyBracket )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:291:2: otherlv_0= Class ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= Colon ( ( ruleQualifiedName ) ) )? otherlv_4= LeftCurlyBracket ( (lv_members_5_0= ruleBSMember ) )* otherlv_6= RightCurlyBracket
            {
            otherlv_0=(Token)match(input,Class,FOLLOW_Class_in_ruleBSClass643); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getBSClassAccess().getClassKeyword_0());
                  
            }
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:295:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:296:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:296:1: (lv_name_1_0= RULE_ID )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:297:3: lv_name_1_0= RULE_ID
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

            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:313:2: (otherlv_2= Colon ( ( ruleQualifiedName ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==Colon) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:314:2: otherlv_2= Colon ( ( ruleQualifiedName ) )
                    {
                    otherlv_2=(Token)match(input,Colon,FOLLOW_Colon_in_ruleBSClass678); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getBSClassAccess().getColonKeyword_2_0());
                          
                    }
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:318:1: ( ( ruleQualifiedName ) )
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:319:1: ( ruleQualifiedName )
                    {
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:319:1: ( ruleQualifiedName )
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:320:3: ruleQualifiedName
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
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:338:1: ( (lv_members_5_0= ruleBSMember ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==TaggedString||(LA7_0>=Number && LA7_0<=Object)||LA7_0==String||LA7_0==NONE||LA7_0==Void||LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:339:1: (lv_members_5_0= ruleBSMember )
            	    {
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:339:1: (lv_members_5_0= ruleBSMember )
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:340:3: lv_members_5_0= ruleBSMember
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
    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:369:1: entryRuleBSMember returns [EObject current=null] : iv_ruleBSMember= ruleBSMember EOF ;
    public final EObject entryRuleBSMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBSMember = null;


        try {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:370:2: (iv_ruleBSMember= ruleBSMember EOF )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:371:2: iv_ruleBSMember= ruleBSMember EOF
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
    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:378:1: ruleBSMember returns [EObject current=null] : (this_BSField_0= ruleBSField | this_BSMethod_1= ruleBSMethod ) ;
    public final EObject ruleBSMember() throws RecognitionException {
        EObject current = null;

        EObject this_BSField_0 = null;

        EObject this_BSMethod_1 = null;


         enterRule(); 
            
        try {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:381:28: ( (this_BSField_0= ruleBSField | this_BSMethod_1= ruleBSMethod ) )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:382:1: (this_BSField_0= ruleBSField | this_BSMethod_1= ruleBSMethod )
            {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:382:1: (this_BSField_0= ruleBSField | this_BSMethod_1= ruleBSMethod )
            int alt8=2;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:383:5: this_BSField_0= ruleBSField
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
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:393:5: this_BSMethod_1= ruleBSMethod
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
    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:409:1: entryRuleBSField returns [EObject current=null] : iv_ruleBSField= ruleBSField EOF ;
    public final EObject entryRuleBSField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBSField = null;


        try {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:410:2: (iv_ruleBSField= ruleBSField EOF )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:411:2: iv_ruleBSField= ruleBSField EOF
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
    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:418:1: ruleBSField returns [EObject current=null] : ( ( ( (lv_pType_0_0= ruleBSPrimitiveType ) ) | ( ( ruleQualifiedName ) ) ) ( (lv_name_2_0= RULE_ID ) ) ( ( (lv_isArray_3_0= LeftSquareBracket ) ) otherlv_4= RightSquareBracket )? otherlv_5= Semicolon ) ;
    public final EObject ruleBSField() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;
        Token lv_isArray_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Enumerator lv_pType_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:421:28: ( ( ( ( (lv_pType_0_0= ruleBSPrimitiveType ) ) | ( ( ruleQualifiedName ) ) ) ( (lv_name_2_0= RULE_ID ) ) ( ( (lv_isArray_3_0= LeftSquareBracket ) ) otherlv_4= RightSquareBracket )? otherlv_5= Semicolon ) )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:422:1: ( ( ( (lv_pType_0_0= ruleBSPrimitiveType ) ) | ( ( ruleQualifiedName ) ) ) ( (lv_name_2_0= RULE_ID ) ) ( ( (lv_isArray_3_0= LeftSquareBracket ) ) otherlv_4= RightSquareBracket )? otherlv_5= Semicolon )
            {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:422:1: ( ( ( (lv_pType_0_0= ruleBSPrimitiveType ) ) | ( ( ruleQualifiedName ) ) ) ( (lv_name_2_0= RULE_ID ) ) ( ( (lv_isArray_3_0= LeftSquareBracket ) ) otherlv_4= RightSquareBracket )? otherlv_5= Semicolon )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:422:2: ( ( (lv_pType_0_0= ruleBSPrimitiveType ) ) | ( ( ruleQualifiedName ) ) ) ( (lv_name_2_0= RULE_ID ) ) ( ( (lv_isArray_3_0= LeftSquareBracket ) ) otherlv_4= RightSquareBracket )? otherlv_5= Semicolon
            {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:422:2: ( ( (lv_pType_0_0= ruleBSPrimitiveType ) ) | ( ( ruleQualifiedName ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==TaggedString||(LA9_0>=Number && LA9_0<=Object)||LA9_0==String||LA9_0==NONE||LA9_0==Void) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_ID) ) {
                alt9=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:422:3: ( (lv_pType_0_0= ruleBSPrimitiveType ) )
                    {
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:422:3: ( (lv_pType_0_0= ruleBSPrimitiveType ) )
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:423:1: (lv_pType_0_0= ruleBSPrimitiveType )
                    {
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:423:1: (lv_pType_0_0= ruleBSPrimitiveType )
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:424:3: lv_pType_0_0= ruleBSPrimitiveType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getBSFieldAccess().getPTypeBSPrimitiveTypeEnumRuleCall_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBSPrimitiveType_in_ruleBSField958);
                    lv_pType_0_0=ruleBSPrimitiveType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getBSFieldRule());
                      	        }
                             		set(
                             			current, 
                             			"pType",
                              		lv_pType_0_0, 
                              		"BSPrimitiveType");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:441:6: ( ( ruleQualifiedName ) )
                    {
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:441:6: ( ( ruleQualifiedName ) )
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:442:1: ( ruleQualifiedName )
                    {
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:442:1: ( ruleQualifiedName )
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:443:3: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getBSFieldRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getBSFieldAccess().getRTypeBSClassCrossReference_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleBSField987);
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

            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:456:3: ( (lv_name_2_0= RULE_ID ) )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:457:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:457:1: (lv_name_2_0= RULE_ID )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:458:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBSField1005); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_2_0, grammarAccess.getBSFieldAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getBSFieldRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:474:2: ( ( (lv_isArray_3_0= LeftSquareBracket ) ) otherlv_4= RightSquareBracket )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==LeftSquareBracket) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:474:3: ( (lv_isArray_3_0= LeftSquareBracket ) ) otherlv_4= RightSquareBracket
                    {
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:474:3: ( (lv_isArray_3_0= LeftSquareBracket ) )
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:475:1: (lv_isArray_3_0= LeftSquareBracket )
                    {
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:475:1: (lv_isArray_3_0= LeftSquareBracket )
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:476:3: lv_isArray_3_0= LeftSquareBracket
                    {
                    lv_isArray_3_0=(Token)match(input,LeftSquareBracket,FOLLOW_LeftSquareBracket_in_ruleBSField1030); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_isArray_3_0, grammarAccess.getBSFieldAccess().getIsArrayLeftSquareBracketKeyword_2_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getBSFieldRule());
                      	        }
                             		setWithLastConsumed(current, "isArray", true, "[");
                      	    
                    }

                    }


                    }

                    otherlv_4=(Token)match(input,RightSquareBracket,FOLLOW_RightSquareBracket_in_ruleBSField1054); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getBSFieldAccess().getRightSquareBracketKeyword_2_1());
                          
                    }

                    }
                    break;

            }

            otherlv_5=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_ruleBSField1068); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getBSFieldAccess().getSemicolonKeyword_3());
                  
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
    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:508:1: entryRuleBSMethod returns [EObject current=null] : iv_ruleBSMethod= ruleBSMethod EOF ;
    public final EObject entryRuleBSMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBSMethod = null;


        try {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:509:2: (iv_ruleBSMethod= ruleBSMethod EOF )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:510:2: iv_ruleBSMethod= ruleBSMethod EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBSMethodRule()); 
            }
            pushFollow(FOLLOW_ruleBSMethod_in_entryRuleBSMethod1102);
            iv_ruleBSMethod=ruleBSMethod();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBSMethod; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBSMethod1112); if (state.failed) return current;

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
    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:517:1: ruleBSMethod returns [EObject current=null] : ( ( ( (lv_pType_0_0= ruleBSPrimitiveType ) ) | ( ( ruleQualifiedName ) ) ) ( ( (lv_isArray_2_0= LeftSquareBracket ) ) otherlv_3= RightSquareBracket )? ( (lv_name_4_0= RULE_ID ) ) otherlv_5= LeftParenthesis ( ( (lv_params_6_0= ruleBSParameter ) ) (otherlv_7= Comma ( (lv_params_8_0= ruleBSParameter ) ) )* )? otherlv_9= RightParenthesis ( (lv_body_10_0= ruleBSMethodBody ) ) ) ;
    public final EObject ruleBSMethod() throws RecognitionException {
        EObject current = null;

        Token lv_isArray_2_0=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Enumerator lv_pType_0_0 = null;

        EObject lv_params_6_0 = null;

        EObject lv_params_8_0 = null;

        EObject lv_body_10_0 = null;


         enterRule(); 
            
        try {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:520:28: ( ( ( ( (lv_pType_0_0= ruleBSPrimitiveType ) ) | ( ( ruleQualifiedName ) ) ) ( ( (lv_isArray_2_0= LeftSquareBracket ) ) otherlv_3= RightSquareBracket )? ( (lv_name_4_0= RULE_ID ) ) otherlv_5= LeftParenthesis ( ( (lv_params_6_0= ruleBSParameter ) ) (otherlv_7= Comma ( (lv_params_8_0= ruleBSParameter ) ) )* )? otherlv_9= RightParenthesis ( (lv_body_10_0= ruleBSMethodBody ) ) ) )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:521:1: ( ( ( (lv_pType_0_0= ruleBSPrimitiveType ) ) | ( ( ruleQualifiedName ) ) ) ( ( (lv_isArray_2_0= LeftSquareBracket ) ) otherlv_3= RightSquareBracket )? ( (lv_name_4_0= RULE_ID ) ) otherlv_5= LeftParenthesis ( ( (lv_params_6_0= ruleBSParameter ) ) (otherlv_7= Comma ( (lv_params_8_0= ruleBSParameter ) ) )* )? otherlv_9= RightParenthesis ( (lv_body_10_0= ruleBSMethodBody ) ) )
            {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:521:1: ( ( ( (lv_pType_0_0= ruleBSPrimitiveType ) ) | ( ( ruleQualifiedName ) ) ) ( ( (lv_isArray_2_0= LeftSquareBracket ) ) otherlv_3= RightSquareBracket )? ( (lv_name_4_0= RULE_ID ) ) otherlv_5= LeftParenthesis ( ( (lv_params_6_0= ruleBSParameter ) ) (otherlv_7= Comma ( (lv_params_8_0= ruleBSParameter ) ) )* )? otherlv_9= RightParenthesis ( (lv_body_10_0= ruleBSMethodBody ) ) )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:521:2: ( ( (lv_pType_0_0= ruleBSPrimitiveType ) ) | ( ( ruleQualifiedName ) ) ) ( ( (lv_isArray_2_0= LeftSquareBracket ) ) otherlv_3= RightSquareBracket )? ( (lv_name_4_0= RULE_ID ) ) otherlv_5= LeftParenthesis ( ( (lv_params_6_0= ruleBSParameter ) ) (otherlv_7= Comma ( (lv_params_8_0= ruleBSParameter ) ) )* )? otherlv_9= RightParenthesis ( (lv_body_10_0= ruleBSMethodBody ) )
            {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:521:2: ( ( (lv_pType_0_0= ruleBSPrimitiveType ) ) | ( ( ruleQualifiedName ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==TaggedString||(LA11_0>=Number && LA11_0<=Object)||LA11_0==String||LA11_0==NONE||LA11_0==Void) ) {
                alt11=1;
            }
            else if ( (LA11_0==RULE_ID) ) {
                alt11=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:521:3: ( (lv_pType_0_0= ruleBSPrimitiveType ) )
                    {
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:521:3: ( (lv_pType_0_0= ruleBSPrimitiveType ) )
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:522:1: (lv_pType_0_0= ruleBSPrimitiveType )
                    {
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:522:1: (lv_pType_0_0= ruleBSPrimitiveType )
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:523:3: lv_pType_0_0= ruleBSPrimitiveType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getBSMethodAccess().getPTypeBSPrimitiveTypeEnumRuleCall_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBSPrimitiveType_in_ruleBSMethod1159);
                    lv_pType_0_0=ruleBSPrimitiveType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getBSMethodRule());
                      	        }
                             		set(
                             			current, 
                             			"pType",
                              		lv_pType_0_0, 
                              		"BSPrimitiveType");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:540:6: ( ( ruleQualifiedName ) )
                    {
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:540:6: ( ( ruleQualifiedName ) )
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:541:1: ( ruleQualifiedName )
                    {
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:541:1: ( ruleQualifiedName )
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:542:3: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getBSMethodRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getBSMethodAccess().getRTypeBSClassCrossReference_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleBSMethod1188);
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

            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:555:3: ( ( (lv_isArray_2_0= LeftSquareBracket ) ) otherlv_3= RightSquareBracket )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==LeftSquareBracket) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:555:4: ( (lv_isArray_2_0= LeftSquareBracket ) ) otherlv_3= RightSquareBracket
                    {
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:555:4: ( (lv_isArray_2_0= LeftSquareBracket ) )
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:556:1: (lv_isArray_2_0= LeftSquareBracket )
                    {
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:556:1: (lv_isArray_2_0= LeftSquareBracket )
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:557:3: lv_isArray_2_0= LeftSquareBracket
                    {
                    lv_isArray_2_0=(Token)match(input,LeftSquareBracket,FOLLOW_LeftSquareBracket_in_ruleBSMethod1209); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_isArray_2_0, grammarAccess.getBSMethodAccess().getIsArrayLeftSquareBracketKeyword_1_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getBSMethodRule());
                      	        }
                             		setWithLastConsumed(current, "isArray", true, "[");
                      	    
                    }

                    }


                    }

                    otherlv_3=(Token)match(input,RightSquareBracket,FOLLOW_RightSquareBracket_in_ruleBSMethod1233); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getBSMethodAccess().getRightSquareBracketKeyword_1_1());
                          
                    }

                    }
                    break;

            }

            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:576:3: ( (lv_name_4_0= RULE_ID ) )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:577:1: (lv_name_4_0= RULE_ID )
            {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:577:1: (lv_name_4_0= RULE_ID )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:578:3: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBSMethod1251); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_4_0, grammarAccess.getBSMethodAccess().getNameIDTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getBSMethodRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_4_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,LeftParenthesis,FOLLOW_LeftParenthesis_in_ruleBSMethod1269); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getBSMethodAccess().getLeftParenthesisKeyword_3());
                  
            }
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:599:1: ( ( (lv_params_6_0= ruleBSParameter ) ) (otherlv_7= Comma ( (lv_params_8_0= ruleBSParameter ) ) )* )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==TaggedString||(LA14_0>=Number && LA14_0<=Object)||LA14_0==String||LA14_0==NONE||LA14_0==Void||LA14_0==RULE_ID) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:599:2: ( (lv_params_6_0= ruleBSParameter ) ) (otherlv_7= Comma ( (lv_params_8_0= ruleBSParameter ) ) )*
                    {
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:599:2: ( (lv_params_6_0= ruleBSParameter ) )
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:600:1: (lv_params_6_0= ruleBSParameter )
                    {
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:600:1: (lv_params_6_0= ruleBSParameter )
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:601:3: lv_params_6_0= ruleBSParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getBSMethodAccess().getParamsBSParameterParserRuleCall_4_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBSParameter_in_ruleBSMethod1290);
                    lv_params_6_0=ruleBSParameter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getBSMethodRule());
                      	        }
                             		add(
                             			current, 
                             			"params",
                              		lv_params_6_0, 
                              		"BSParameter");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:617:2: (otherlv_7= Comma ( (lv_params_8_0= ruleBSParameter ) ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==Comma) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:618:2: otherlv_7= Comma ( (lv_params_8_0= ruleBSParameter ) )
                    	    {
                    	    otherlv_7=(Token)match(input,Comma,FOLLOW_Comma_in_ruleBSMethod1304); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_7, grammarAccess.getBSMethodAccess().getCommaKeyword_4_1_0());
                    	          
                    	    }
                    	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:622:1: ( (lv_params_8_0= ruleBSParameter ) )
                    	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:623:1: (lv_params_8_0= ruleBSParameter )
                    	    {
                    	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:623:1: (lv_params_8_0= ruleBSParameter )
                    	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:624:3: lv_params_8_0= ruleBSParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getBSMethodAccess().getParamsBSParameterParserRuleCall_4_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleBSParameter_in_ruleBSMethod1324);
                    	    lv_params_8_0=ruleBSParameter();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getBSMethodRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"params",
                    	              		lv_params_8_0, 
                    	              		"BSParameter");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_9=(Token)match(input,RightParenthesis,FOLLOW_RightParenthesis_in_ruleBSMethod1341); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_9, grammarAccess.getBSMethodAccess().getRightParenthesisKeyword_5());
                  
            }
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:645:1: ( (lv_body_10_0= ruleBSMethodBody ) )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:646:1: (lv_body_10_0= ruleBSMethodBody )
            {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:646:1: (lv_body_10_0= ruleBSMethodBody )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:647:3: lv_body_10_0= ruleBSMethodBody
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getBSMethodAccess().getBodyBSMethodBodyParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleBSMethodBody_in_ruleBSMethod1361);
            lv_body_10_0=ruleBSMethodBody();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getBSMethodRule());
              	        }
                     		set(
                     			current, 
                     			"body",
                      		lv_body_10_0, 
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
    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:671:1: entryRuleBSParameter returns [EObject current=null] : iv_ruleBSParameter= ruleBSParameter EOF ;
    public final EObject entryRuleBSParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBSParameter = null;


        try {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:672:2: (iv_ruleBSParameter= ruleBSParameter EOF )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:673:2: iv_ruleBSParameter= ruleBSParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBSParameterRule()); 
            }
            pushFollow(FOLLOW_ruleBSParameter_in_entryRuleBSParameter1396);
            iv_ruleBSParameter=ruleBSParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBSParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBSParameter1406); if (state.failed) return current;

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
    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:680:1: ruleBSParameter returns [EObject current=null] : ( ( ( (lv_pType_0_0= ruleBSPrimitiveType ) ) | ( ( ruleQualifiedName ) ) ) ( (lv_name_2_0= RULE_ID ) ) ( ( (lv_isArray_3_0= LeftSquareBracket ) ) otherlv_4= RightSquareBracket )? ) ;
    public final EObject ruleBSParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;
        Token lv_isArray_3_0=null;
        Token otherlv_4=null;
        Enumerator lv_pType_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:683:28: ( ( ( ( (lv_pType_0_0= ruleBSPrimitiveType ) ) | ( ( ruleQualifiedName ) ) ) ( (lv_name_2_0= RULE_ID ) ) ( ( (lv_isArray_3_0= LeftSquareBracket ) ) otherlv_4= RightSquareBracket )? ) )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:684:1: ( ( ( (lv_pType_0_0= ruleBSPrimitiveType ) ) | ( ( ruleQualifiedName ) ) ) ( (lv_name_2_0= RULE_ID ) ) ( ( (lv_isArray_3_0= LeftSquareBracket ) ) otherlv_4= RightSquareBracket )? )
            {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:684:1: ( ( ( (lv_pType_0_0= ruleBSPrimitiveType ) ) | ( ( ruleQualifiedName ) ) ) ( (lv_name_2_0= RULE_ID ) ) ( ( (lv_isArray_3_0= LeftSquareBracket ) ) otherlv_4= RightSquareBracket )? )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:684:2: ( ( (lv_pType_0_0= ruleBSPrimitiveType ) ) | ( ( ruleQualifiedName ) ) ) ( (lv_name_2_0= RULE_ID ) ) ( ( (lv_isArray_3_0= LeftSquareBracket ) ) otherlv_4= RightSquareBracket )?
            {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:684:2: ( ( (lv_pType_0_0= ruleBSPrimitiveType ) ) | ( ( ruleQualifiedName ) ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==TaggedString||(LA15_0>=Number && LA15_0<=Object)||LA15_0==String||LA15_0==NONE||LA15_0==Void) ) {
                alt15=1;
            }
            else if ( (LA15_0==RULE_ID) ) {
                alt15=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:684:3: ( (lv_pType_0_0= ruleBSPrimitiveType ) )
                    {
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:684:3: ( (lv_pType_0_0= ruleBSPrimitiveType ) )
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:685:1: (lv_pType_0_0= ruleBSPrimitiveType )
                    {
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:685:1: (lv_pType_0_0= ruleBSPrimitiveType )
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:686:3: lv_pType_0_0= ruleBSPrimitiveType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getBSParameterAccess().getPTypeBSPrimitiveTypeEnumRuleCall_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBSPrimitiveType_in_ruleBSParameter1453);
                    lv_pType_0_0=ruleBSPrimitiveType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getBSParameterRule());
                      	        }
                             		set(
                             			current, 
                             			"pType",
                              		lv_pType_0_0, 
                              		"BSPrimitiveType");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:703:6: ( ( ruleQualifiedName ) )
                    {
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:703:6: ( ( ruleQualifiedName ) )
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:704:1: ( ruleQualifiedName )
                    {
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:704:1: ( ruleQualifiedName )
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:705:3: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getBSParameterRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getBSParameterAccess().getRTypeBSClassCrossReference_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleBSParameter1482);
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

            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:718:3: ( (lv_name_2_0= RULE_ID ) )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:719:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:719:1: (lv_name_2_0= RULE_ID )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:720:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBSParameter1500); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_2_0, grammarAccess.getBSParameterAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getBSParameterRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:736:2: ( ( (lv_isArray_3_0= LeftSquareBracket ) ) otherlv_4= RightSquareBracket )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==LeftSquareBracket) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:736:3: ( (lv_isArray_3_0= LeftSquareBracket ) ) otherlv_4= RightSquareBracket
                    {
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:736:3: ( (lv_isArray_3_0= LeftSquareBracket ) )
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:737:1: (lv_isArray_3_0= LeftSquareBracket )
                    {
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:737:1: (lv_isArray_3_0= LeftSquareBracket )
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:738:3: lv_isArray_3_0= LeftSquareBracket
                    {
                    lv_isArray_3_0=(Token)match(input,LeftSquareBracket,FOLLOW_LeftSquareBracket_in_ruleBSParameter1525); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_isArray_3_0, grammarAccess.getBSParameterAccess().getIsArrayLeftSquareBracketKeyword_2_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getBSParameterRule());
                      	        }
                             		setWithLastConsumed(current, "isArray", true, "[");
                      	    
                    }

                    }


                    }

                    otherlv_4=(Token)match(input,RightSquareBracket,FOLLOW_RightSquareBracket_in_ruleBSParameter1549); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getBSParameterAccess().getRightSquareBracketKeyword_2_1());
                          
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
    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:765:1: entryRuleBSMethodBody returns [EObject current=null] : iv_ruleBSMethodBody= ruleBSMethodBody EOF ;
    public final EObject entryRuleBSMethodBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBSMethodBody = null;


        try {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:766:2: (iv_ruleBSMethodBody= ruleBSMethodBody EOF )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:767:2: iv_ruleBSMethodBody= ruleBSMethodBody EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBSMethodBodyRule()); 
            }
            pushFollow(FOLLOW_ruleBSMethodBody_in_entryRuleBSMethodBody1585);
            iv_ruleBSMethodBody=ruleBSMethodBody();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBSMethodBody; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBSMethodBody1595); if (state.failed) return current;

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
    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:774:1: ruleBSMethodBody returns [EObject current=null] : ( () otherlv_1= LeftCurlyBracket ( (lv_statements_2_0= ruleBSStatement ) )* otherlv_3= RightCurlyBracket ) ;
    public final EObject ruleBSMethodBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_statements_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:777:28: ( ( () otherlv_1= LeftCurlyBracket ( (lv_statements_2_0= ruleBSStatement ) )* otherlv_3= RightCurlyBracket ) )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:778:1: ( () otherlv_1= LeftCurlyBracket ( (lv_statements_2_0= ruleBSStatement ) )* otherlv_3= RightCurlyBracket )
            {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:778:1: ( () otherlv_1= LeftCurlyBracket ( (lv_statements_2_0= ruleBSStatement ) )* otherlv_3= RightCurlyBracket )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:778:2: () otherlv_1= LeftCurlyBracket ( (lv_statements_2_0= ruleBSStatement ) )* otherlv_3= RightCurlyBracket
            {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:778:2: ()
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:779:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getBSMethodBodyAccess().getBSMethodBodyAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,LeftCurlyBracket,FOLLOW_LeftCurlyBracket_in_ruleBSMethodBody1642); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getBSMethodBodyAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:789:1: ( (lv_statements_2_0= ruleBSStatement ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=TaggedString && LA17_0<=Continue)||LA17_0==Client||(LA17_0>=Number && LA17_0<=Break)||(LA17_0>=False && LA17_0<=NONE)||(LA17_0>=Null && LA17_0<=Void)||(LA17_0>=For && LA17_0<=New)||LA17_0==If||LA17_0==ExclamationMark||LA17_0==LeftParenthesis||LA17_0==PlusSign||LA17_0==HyphenMinus||(LA17_0>=Tilde && LA17_0<=RULE_INT)||LA17_0==RULE_STRING) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:790:1: (lv_statements_2_0= ruleBSStatement )
            	    {
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:790:1: (lv_statements_2_0= ruleBSStatement )
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:791:3: lv_statements_2_0= ruleBSStatement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getBSMethodBodyAccess().getStatementsBSStatementParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleBSStatement_in_ruleBSMethodBody1662);
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
            	    break loop17;
                }
            } while (true);

            otherlv_3=(Token)match(input,RightCurlyBracket,FOLLOW_RightCurlyBracket_in_ruleBSMethodBody1676); if (state.failed) return current;
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
    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:820:1: entryRuleBSStatement returns [EObject current=null] : iv_ruleBSStatement= ruleBSStatement EOF ;
    public final EObject entryRuleBSStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBSStatement = null;


        try {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:821:2: (iv_ruleBSStatement= ruleBSStatement EOF )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:822:2: iv_ruleBSStatement= ruleBSStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBSStatementRule()); 
            }
            pushFollow(FOLLOW_ruleBSStatement_in_entryRuleBSStatement1710);
            iv_ruleBSStatement=ruleBSStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBSStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBSStatement1720); if (state.failed) return current;

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
    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:829:1: ruleBSStatement returns [EObject current=null] : (this_BSVariableDeclaration_0= ruleBSVariableDeclaration | this_BSReturn_1= ruleBSReturn | this_BSBreak_2= ruleBSBreak | this_BSContinue_3= ruleBSContinue | (this_BSExpression_4= ruleBSExpression otherlv_5= Semicolon ) | this_BSIfStatement_6= ruleBSIfStatement | this_BSWhileLoop_7= ruleBSWhileLoop | this_BSForLoop_8= ruleBSForLoop | this_BSSwitchStatement_9= ruleBSSwitchStatement ) ;
    public final EObject ruleBSStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_5=null;
        EObject this_BSVariableDeclaration_0 = null;

        EObject this_BSReturn_1 = null;

        EObject this_BSBreak_2 = null;

        EObject this_BSContinue_3 = null;

        EObject this_BSExpression_4 = null;

        EObject this_BSIfStatement_6 = null;

        EObject this_BSWhileLoop_7 = null;

        EObject this_BSForLoop_8 = null;

        EObject this_BSSwitchStatement_9 = null;


         enterRule(); 
            
        try {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:832:28: ( (this_BSVariableDeclaration_0= ruleBSVariableDeclaration | this_BSReturn_1= ruleBSReturn | this_BSBreak_2= ruleBSBreak | this_BSContinue_3= ruleBSContinue | (this_BSExpression_4= ruleBSExpression otherlv_5= Semicolon ) | this_BSIfStatement_6= ruleBSIfStatement | this_BSWhileLoop_7= ruleBSWhileLoop | this_BSForLoop_8= ruleBSForLoop | this_BSSwitchStatement_9= ruleBSSwitchStatement ) )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:833:1: (this_BSVariableDeclaration_0= ruleBSVariableDeclaration | this_BSReturn_1= ruleBSReturn | this_BSBreak_2= ruleBSBreak | this_BSContinue_3= ruleBSContinue | (this_BSExpression_4= ruleBSExpression otherlv_5= Semicolon ) | this_BSIfStatement_6= ruleBSIfStatement | this_BSWhileLoop_7= ruleBSWhileLoop | this_BSForLoop_8= ruleBSForLoop | this_BSSwitchStatement_9= ruleBSSwitchStatement )
            {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:833:1: (this_BSVariableDeclaration_0= ruleBSVariableDeclaration | this_BSReturn_1= ruleBSReturn | this_BSBreak_2= ruleBSBreak | this_BSContinue_3= ruleBSContinue | (this_BSExpression_4= ruleBSExpression otherlv_5= Semicolon ) | this_BSIfStatement_6= ruleBSIfStatement | this_BSWhileLoop_7= ruleBSWhileLoop | this_BSForLoop_8= ruleBSForLoop | this_BSSwitchStatement_9= ruleBSSwitchStatement )
            int alt18=9;
            alt18 = dfa18.predict(input);
            switch (alt18) {
                case 1 :
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:834:5: this_BSVariableDeclaration_0= ruleBSVariableDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBSStatementAccess().getBSVariableDeclarationParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBSVariableDeclaration_in_ruleBSStatement1767);
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
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:844:5: this_BSReturn_1= ruleBSReturn
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBSStatementAccess().getBSReturnParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBSReturn_in_ruleBSStatement1794);
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
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:854:5: this_BSBreak_2= ruleBSBreak
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBSStatementAccess().getBSBreakParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBSBreak_in_ruleBSStatement1821);
                    this_BSBreak_2=ruleBSBreak();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_BSBreak_2;
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:864:5: this_BSContinue_3= ruleBSContinue
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBSStatementAccess().getBSContinueParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBSContinue_in_ruleBSStatement1848);
                    this_BSContinue_3=ruleBSContinue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_BSContinue_3;
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:873:6: (this_BSExpression_4= ruleBSExpression otherlv_5= Semicolon )
                    {
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:873:6: (this_BSExpression_4= ruleBSExpression otherlv_5= Semicolon )
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:874:5: this_BSExpression_4= ruleBSExpression otherlv_5= Semicolon
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBSStatementAccess().getBSExpressionParserRuleCall_4_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBSExpression_in_ruleBSStatement1876);
                    this_BSExpression_4=ruleBSExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_BSExpression_4;
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_5=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_ruleBSStatement1888); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getBSStatementAccess().getSemicolonKeyword_4_1());
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:889:5: this_BSIfStatement_6= ruleBSIfStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBSStatementAccess().getBSIfStatementParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBSIfStatement_in_ruleBSStatement1916);
                    this_BSIfStatement_6=ruleBSIfStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_BSIfStatement_6;
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 7 :
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:899:5: this_BSWhileLoop_7= ruleBSWhileLoop
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBSStatementAccess().getBSWhileLoopParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBSWhileLoop_in_ruleBSStatement1943);
                    this_BSWhileLoop_7=ruleBSWhileLoop();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_BSWhileLoop_7;
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 8 :
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:909:5: this_BSForLoop_8= ruleBSForLoop
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBSStatementAccess().getBSForLoopParserRuleCall_7()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBSForLoop_in_ruleBSStatement1970);
                    this_BSForLoop_8=ruleBSForLoop();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_BSForLoop_8;
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 9 :
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:919:5: this_BSSwitchStatement_9= ruleBSSwitchStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBSStatementAccess().getBSSwitchStatementParserRuleCall_8()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBSSwitchStatement_in_ruleBSStatement1997);
                    this_BSSwitchStatement_9=ruleBSSwitchStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_BSSwitchStatement_9;
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
    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:935:1: entryRuleBSReturn returns [EObject current=null] : iv_ruleBSReturn= ruleBSReturn EOF ;
    public final EObject entryRuleBSReturn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBSReturn = null;


        try {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:936:2: (iv_ruleBSReturn= ruleBSReturn EOF )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:937:2: iv_ruleBSReturn= ruleBSReturn EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBSReturnRule()); 
            }
            pushFollow(FOLLOW_ruleBSReturn_in_entryRuleBSReturn2031);
            iv_ruleBSReturn=ruleBSReturn();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBSReturn; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBSReturn2041); if (state.failed) return current;

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
    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:944:1: ruleBSReturn returns [EObject current=null] : ( () otherlv_1= Return ( (lv_expression_2_0= ruleBSExpression ) )? otherlv_3= Semicolon ) ;
    public final EObject ruleBSReturn() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:947:28: ( ( () otherlv_1= Return ( (lv_expression_2_0= ruleBSExpression ) )? otherlv_3= Semicolon ) )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:948:1: ( () otherlv_1= Return ( (lv_expression_2_0= ruleBSExpression ) )? otherlv_3= Semicolon )
            {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:948:1: ( () otherlv_1= Return ( (lv_expression_2_0= ruleBSExpression ) )? otherlv_3= Semicolon )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:948:2: () otherlv_1= Return ( (lv_expression_2_0= ruleBSExpression ) )? otherlv_3= Semicolon
            {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:948:2: ()
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:949:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getBSReturnAccess().getBSReturnAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,Return,FOLLOW_Return_in_ruleBSReturn2088); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getBSReturnAccess().getReturnKeyword_1());
                  
            }
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:959:1: ( (lv_expression_2_0= ruleBSExpression ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==Client||LA19_0==Parent||LA19_0==False||(LA19_0>=Null && LA19_0<=True)||LA19_0==New||LA19_0==ExclamationMark||LA19_0==LeftParenthesis||LA19_0==PlusSign||LA19_0==HyphenMinus||(LA19_0>=Tilde && LA19_0<=RULE_INT)||LA19_0==RULE_STRING) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:960:1: (lv_expression_2_0= ruleBSExpression )
                    {
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:960:1: (lv_expression_2_0= ruleBSExpression )
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:961:3: lv_expression_2_0= ruleBSExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getBSReturnAccess().getExpressionBSExpressionParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBSExpression_in_ruleBSReturn2108);
                    lv_expression_2_0=ruleBSExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getBSReturnRule());
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
                    break;

            }

            otherlv_3=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_ruleBSReturn2122); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getBSReturnAccess().getSemicolonKeyword_3());
                  
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


    // $ANTLR start "entryRuleBSBreak"
    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:990:1: entryRuleBSBreak returns [EObject current=null] : iv_ruleBSBreak= ruleBSBreak EOF ;
    public final EObject entryRuleBSBreak() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBSBreak = null;


        try {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:991:2: (iv_ruleBSBreak= ruleBSBreak EOF )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:992:2: iv_ruleBSBreak= ruleBSBreak EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBSBreakRule()); 
            }
            pushFollow(FOLLOW_ruleBSBreak_in_entryRuleBSBreak2156);
            iv_ruleBSBreak=ruleBSBreak();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBSBreak; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBSBreak2166); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBSBreak"


    // $ANTLR start "ruleBSBreak"
    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:999:1: ruleBSBreak returns [EObject current=null] : ( () otherlv_1= Break otherlv_2= Semicolon ) ;
    public final EObject ruleBSBreak() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1002:28: ( ( () otherlv_1= Break otherlv_2= Semicolon ) )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1003:1: ( () otherlv_1= Break otherlv_2= Semicolon )
            {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1003:1: ( () otherlv_1= Break otherlv_2= Semicolon )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1003:2: () otherlv_1= Break otherlv_2= Semicolon
            {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1003:2: ()
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1004:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getBSBreakAccess().getBSBreakAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,Break,FOLLOW_Break_in_ruleBSBreak2213); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getBSBreakAccess().getBreakKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_ruleBSBreak2225); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getBSBreakAccess().getSemicolonKeyword_2());
                  
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
    // $ANTLR end "ruleBSBreak"


    // $ANTLR start "entryRuleBSContinue"
    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1027:1: entryRuleBSContinue returns [EObject current=null] : iv_ruleBSContinue= ruleBSContinue EOF ;
    public final EObject entryRuleBSContinue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBSContinue = null;


        try {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1028:2: (iv_ruleBSContinue= ruleBSContinue EOF )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1029:2: iv_ruleBSContinue= ruleBSContinue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBSContinueRule()); 
            }
            pushFollow(FOLLOW_ruleBSContinue_in_entryRuleBSContinue2259);
            iv_ruleBSContinue=ruleBSContinue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBSContinue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBSContinue2269); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBSContinue"


    // $ANTLR start "ruleBSContinue"
    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1036:1: ruleBSContinue returns [EObject current=null] : ( () otherlv_1= Continue otherlv_2= Semicolon ) ;
    public final EObject ruleBSContinue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1039:28: ( ( () otherlv_1= Continue otherlv_2= Semicolon ) )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1040:1: ( () otherlv_1= Continue otherlv_2= Semicolon )
            {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1040:1: ( () otherlv_1= Continue otherlv_2= Semicolon )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1040:2: () otherlv_1= Continue otherlv_2= Semicolon
            {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1040:2: ()
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1041:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getBSContinueAccess().getBSContinueAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,Continue,FOLLOW_Continue_in_ruleBSContinue2316); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getBSContinueAccess().getContinueKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_ruleBSContinue2328); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getBSContinueAccess().getSemicolonKeyword_2());
                  
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
    // $ANTLR end "ruleBSContinue"


    // $ANTLR start "entryRuleBSVariableDeclaration"
    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1064:1: entryRuleBSVariableDeclaration returns [EObject current=null] : iv_ruleBSVariableDeclaration= ruleBSVariableDeclaration EOF ;
    public final EObject entryRuleBSVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBSVariableDeclaration = null;


        try {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1065:2: (iv_ruleBSVariableDeclaration= ruleBSVariableDeclaration EOF )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1066:2: iv_ruleBSVariableDeclaration= ruleBSVariableDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBSVariableDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleBSVariableDeclaration_in_entryRuleBSVariableDeclaration2362);
            iv_ruleBSVariableDeclaration=ruleBSVariableDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBSVariableDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBSVariableDeclaration2372); if (state.failed) return current;

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
    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1073:1: ruleBSVariableDeclaration returns [EObject current=null] : ( ( ( (lv_pType_0_0= ruleBSPrimitiveType ) ) | ( ( ruleQualifiedName ) ) ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= EqualsSign ( (lv_expression_4_0= ruleBSExpression ) ) )? otherlv_5= Semicolon ) ;
    public final EObject ruleBSVariableDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Enumerator lv_pType_0_0 = null;

        EObject lv_expression_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1076:28: ( ( ( ( (lv_pType_0_0= ruleBSPrimitiveType ) ) | ( ( ruleQualifiedName ) ) ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= EqualsSign ( (lv_expression_4_0= ruleBSExpression ) ) )? otherlv_5= Semicolon ) )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1077:1: ( ( ( (lv_pType_0_0= ruleBSPrimitiveType ) ) | ( ( ruleQualifiedName ) ) ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= EqualsSign ( (lv_expression_4_0= ruleBSExpression ) ) )? otherlv_5= Semicolon )
            {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1077:1: ( ( ( (lv_pType_0_0= ruleBSPrimitiveType ) ) | ( ( ruleQualifiedName ) ) ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= EqualsSign ( (lv_expression_4_0= ruleBSExpression ) ) )? otherlv_5= Semicolon )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1077:2: ( ( (lv_pType_0_0= ruleBSPrimitiveType ) ) | ( ( ruleQualifiedName ) ) ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= EqualsSign ( (lv_expression_4_0= ruleBSExpression ) ) )? otherlv_5= Semicolon
            {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1077:2: ( ( (lv_pType_0_0= ruleBSPrimitiveType ) ) | ( ( ruleQualifiedName ) ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==TaggedString||(LA20_0>=Number && LA20_0<=Object)||LA20_0==String||LA20_0==NONE||LA20_0==Void) ) {
                alt20=1;
            }
            else if ( (LA20_0==RULE_ID) ) {
                alt20=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1077:3: ( (lv_pType_0_0= ruleBSPrimitiveType ) )
                    {
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1077:3: ( (lv_pType_0_0= ruleBSPrimitiveType ) )
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1078:1: (lv_pType_0_0= ruleBSPrimitiveType )
                    {
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1078:1: (lv_pType_0_0= ruleBSPrimitiveType )
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1079:3: lv_pType_0_0= ruleBSPrimitiveType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getBSVariableDeclarationAccess().getPTypeBSPrimitiveTypeEnumRuleCall_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBSPrimitiveType_in_ruleBSVariableDeclaration2419);
                    lv_pType_0_0=ruleBSPrimitiveType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getBSVariableDeclarationRule());
                      	        }
                             		set(
                             			current, 
                             			"pType",
                              		lv_pType_0_0, 
                              		"BSPrimitiveType");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1096:6: ( ( ruleQualifiedName ) )
                    {
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1096:6: ( ( ruleQualifiedName ) )
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1097:1: ( ruleQualifiedName )
                    {
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1097:1: ( ruleQualifiedName )
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1098:3: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getBSVariableDeclarationRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getBSVariableDeclarationAccess().getRTypeBSClassCrossReference_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleBSVariableDeclaration2448);
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

            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1111:3: ( (lv_name_2_0= RULE_ID ) )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1112:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1112:1: (lv_name_2_0= RULE_ID )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1113:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBSVariableDeclaration2466); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_2_0, grammarAccess.getBSVariableDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getBSVariableDeclarationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1129:2: (otherlv_3= EqualsSign ( (lv_expression_4_0= ruleBSExpression ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==EqualsSign) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1130:2: otherlv_3= EqualsSign ( (lv_expression_4_0= ruleBSExpression ) )
                    {
                    otherlv_3=(Token)match(input,EqualsSign,FOLLOW_EqualsSign_in_ruleBSVariableDeclaration2485); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getBSVariableDeclarationAccess().getEqualsSignKeyword_2_0());
                          
                    }
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1134:1: ( (lv_expression_4_0= ruleBSExpression ) )
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1135:1: (lv_expression_4_0= ruleBSExpression )
                    {
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1135:1: (lv_expression_4_0= ruleBSExpression )
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1136:3: lv_expression_4_0= ruleBSExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getBSVariableDeclarationAccess().getExpressionBSExpressionParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBSExpression_in_ruleBSVariableDeclaration2505);
                    lv_expression_4_0=ruleBSExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getBSVariableDeclarationRule());
                      	        }
                             		set(
                             			current, 
                             			"expression",
                              		lv_expression_4_0, 
                              		"BSExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_ruleBSVariableDeclaration2520); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getBSVariableDeclarationAccess().getSemicolonKeyword_3());
                  
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
    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1165:1: entryRuleBSIfStatement returns [EObject current=null] : iv_ruleBSIfStatement= ruleBSIfStatement EOF ;
    public final EObject entryRuleBSIfStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBSIfStatement = null;


        try {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1166:2: (iv_ruleBSIfStatement= ruleBSIfStatement EOF )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1167:2: iv_ruleBSIfStatement= ruleBSIfStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBSIfStatementRule()); 
            }
            pushFollow(FOLLOW_ruleBSIfStatement_in_entryRuleBSIfStatement2554);
            iv_ruleBSIfStatement=ruleBSIfStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBSIfStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBSIfStatement2564); if (state.failed) return current;

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
    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1174:1: ruleBSIfStatement returns [EObject current=null] : (otherlv_0= If otherlv_1= LeftParenthesis ( (lv_expression_2_0= ruleBSExpression ) ) otherlv_3= RightParenthesis ( (lv_thenBlock_4_0= ruleBSIfBlock ) ) ( ( ( Else )=>otherlv_5= Else ) ( (lv_elseBlock_6_0= ruleBSIfBlock ) ) )? ) ;
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
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1177:28: ( (otherlv_0= If otherlv_1= LeftParenthesis ( (lv_expression_2_0= ruleBSExpression ) ) otherlv_3= RightParenthesis ( (lv_thenBlock_4_0= ruleBSIfBlock ) ) ( ( ( Else )=>otherlv_5= Else ) ( (lv_elseBlock_6_0= ruleBSIfBlock ) ) )? ) )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1178:1: (otherlv_0= If otherlv_1= LeftParenthesis ( (lv_expression_2_0= ruleBSExpression ) ) otherlv_3= RightParenthesis ( (lv_thenBlock_4_0= ruleBSIfBlock ) ) ( ( ( Else )=>otherlv_5= Else ) ( (lv_elseBlock_6_0= ruleBSIfBlock ) ) )? )
            {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1178:1: (otherlv_0= If otherlv_1= LeftParenthesis ( (lv_expression_2_0= ruleBSExpression ) ) otherlv_3= RightParenthesis ( (lv_thenBlock_4_0= ruleBSIfBlock ) ) ( ( ( Else )=>otherlv_5= Else ) ( (lv_elseBlock_6_0= ruleBSIfBlock ) ) )? )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1179:2: otherlv_0= If otherlv_1= LeftParenthesis ( (lv_expression_2_0= ruleBSExpression ) ) otherlv_3= RightParenthesis ( (lv_thenBlock_4_0= ruleBSIfBlock ) ) ( ( ( Else )=>otherlv_5= Else ) ( (lv_elseBlock_6_0= ruleBSIfBlock ) ) )?
            {
            otherlv_0=(Token)match(input,If,FOLLOW_If_in_ruleBSIfStatement2602); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getBSIfStatementAccess().getIfKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,LeftParenthesis,FOLLOW_LeftParenthesis_in_ruleBSIfStatement2614); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getBSIfStatementAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1188:1: ( (lv_expression_2_0= ruleBSExpression ) )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1189:1: (lv_expression_2_0= ruleBSExpression )
            {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1189:1: (lv_expression_2_0= ruleBSExpression )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1190:3: lv_expression_2_0= ruleBSExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getBSIfStatementAccess().getExpressionBSExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleBSExpression_in_ruleBSIfStatement2634);
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

            otherlv_3=(Token)match(input,RightParenthesis,FOLLOW_RightParenthesis_in_ruleBSIfStatement2647); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getBSIfStatementAccess().getRightParenthesisKeyword_3());
                  
            }
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1211:1: ( (lv_thenBlock_4_0= ruleBSIfBlock ) )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1212:1: (lv_thenBlock_4_0= ruleBSIfBlock )
            {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1212:1: (lv_thenBlock_4_0= ruleBSIfBlock )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1213:3: lv_thenBlock_4_0= ruleBSIfBlock
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getBSIfStatementAccess().getThenBlockBSIfBlockParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleBSIfBlock_in_ruleBSIfStatement2667);
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

            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1229:2: ( ( ( Else )=>otherlv_5= Else ) ( (lv_elseBlock_6_0= ruleBSIfBlock ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==Else) ) {
                int LA22_1 = input.LA(2);

                if ( (synpred1_InternalBlorqueScriptParser()) ) {
                    alt22=1;
                }
            }
            switch (alt22) {
                case 1 :
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1229:3: ( ( Else )=>otherlv_5= Else ) ( (lv_elseBlock_6_0= ruleBSIfBlock ) )
                    {
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1229:3: ( ( Else )=>otherlv_5= Else )
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1229:4: ( Else )=>otherlv_5= Else
                    {
                    otherlv_5=(Token)match(input,Else,FOLLOW_Else_in_ruleBSIfStatement2688); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getBSIfStatementAccess().getElseKeyword_5_0());
                          
                    }

                    }

                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1236:2: ( (lv_elseBlock_6_0= ruleBSIfBlock ) )
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1237:1: (lv_elseBlock_6_0= ruleBSIfBlock )
                    {
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1237:1: (lv_elseBlock_6_0= ruleBSIfBlock )
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1238:3: lv_elseBlock_6_0= ruleBSIfBlock
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getBSIfStatementAccess().getElseBlockBSIfBlockParserRuleCall_5_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBSIfBlock_in_ruleBSIfStatement2709);
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
    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1262:1: entryRuleBSWhileLoop returns [EObject current=null] : iv_ruleBSWhileLoop= ruleBSWhileLoop EOF ;
    public final EObject entryRuleBSWhileLoop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBSWhileLoop = null;


        try {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1263:2: (iv_ruleBSWhileLoop= ruleBSWhileLoop EOF )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1264:2: iv_ruleBSWhileLoop= ruleBSWhileLoop EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBSWhileLoopRule()); 
            }
            pushFollow(FOLLOW_ruleBSWhileLoop_in_entryRuleBSWhileLoop2746);
            iv_ruleBSWhileLoop=ruleBSWhileLoop();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBSWhileLoop; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBSWhileLoop2756); if (state.failed) return current;

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
    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1271:1: ruleBSWhileLoop returns [EObject current=null] : (otherlv_0= While otherlv_1= LeftParenthesis ( (lv_expression_2_0= ruleBSExpression ) ) otherlv_3= RightParenthesis ( (lv_block_4_0= ruleBSLoopBlock ) ) ) ;
    public final EObject ruleBSWhileLoop() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_expression_2_0 = null;

        EObject lv_block_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1274:28: ( (otherlv_0= While otherlv_1= LeftParenthesis ( (lv_expression_2_0= ruleBSExpression ) ) otherlv_3= RightParenthesis ( (lv_block_4_0= ruleBSLoopBlock ) ) ) )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1275:1: (otherlv_0= While otherlv_1= LeftParenthesis ( (lv_expression_2_0= ruleBSExpression ) ) otherlv_3= RightParenthesis ( (lv_block_4_0= ruleBSLoopBlock ) ) )
            {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1275:1: (otherlv_0= While otherlv_1= LeftParenthesis ( (lv_expression_2_0= ruleBSExpression ) ) otherlv_3= RightParenthesis ( (lv_block_4_0= ruleBSLoopBlock ) ) )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1276:2: otherlv_0= While otherlv_1= LeftParenthesis ( (lv_expression_2_0= ruleBSExpression ) ) otherlv_3= RightParenthesis ( (lv_block_4_0= ruleBSLoopBlock ) )
            {
            otherlv_0=(Token)match(input,While,FOLLOW_While_in_ruleBSWhileLoop2794); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getBSWhileLoopAccess().getWhileKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,LeftParenthesis,FOLLOW_LeftParenthesis_in_ruleBSWhileLoop2806); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getBSWhileLoopAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1285:1: ( (lv_expression_2_0= ruleBSExpression ) )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1286:1: (lv_expression_2_0= ruleBSExpression )
            {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1286:1: (lv_expression_2_0= ruleBSExpression )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1287:3: lv_expression_2_0= ruleBSExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getBSWhileLoopAccess().getExpressionBSExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleBSExpression_in_ruleBSWhileLoop2826);
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

            otherlv_3=(Token)match(input,RightParenthesis,FOLLOW_RightParenthesis_in_ruleBSWhileLoop2839); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getBSWhileLoopAccess().getRightParenthesisKeyword_3());
                  
            }
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1308:1: ( (lv_block_4_0= ruleBSLoopBlock ) )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1309:1: (lv_block_4_0= ruleBSLoopBlock )
            {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1309:1: (lv_block_4_0= ruleBSLoopBlock )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1310:3: lv_block_4_0= ruleBSLoopBlock
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getBSWhileLoopAccess().getBlockBSLoopBlockParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleBSLoopBlock_in_ruleBSWhileLoop2859);
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
    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1334:1: entryRuleBSForLoop returns [EObject current=null] : iv_ruleBSForLoop= ruleBSForLoop EOF ;
    public final EObject entryRuleBSForLoop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBSForLoop = null;


        try {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1335:2: (iv_ruleBSForLoop= ruleBSForLoop EOF )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1336:2: iv_ruleBSForLoop= ruleBSForLoop EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBSForLoopRule()); 
            }
            pushFollow(FOLLOW_ruleBSForLoop_in_entryRuleBSForLoop2894);
            iv_ruleBSForLoop=ruleBSForLoop();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBSForLoop; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBSForLoop2904); if (state.failed) return current;

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
    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1343:1: ruleBSForLoop returns [EObject current=null] : (otherlv_0= For otherlv_1= LeftParenthesis ( (lv_left_2_0= ruleBSExpression ) ) otherlv_3= Semicolon ( (lv_middle_4_0= ruleBSExpression ) ) otherlv_5= Semicolon ( (lv_right_6_0= ruleBSExpression ) ) otherlv_7= RightParenthesis ( (lv_block_8_0= ruleBSLoopBlock ) ) ) ;
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
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1346:28: ( (otherlv_0= For otherlv_1= LeftParenthesis ( (lv_left_2_0= ruleBSExpression ) ) otherlv_3= Semicolon ( (lv_middle_4_0= ruleBSExpression ) ) otherlv_5= Semicolon ( (lv_right_6_0= ruleBSExpression ) ) otherlv_7= RightParenthesis ( (lv_block_8_0= ruleBSLoopBlock ) ) ) )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1347:1: (otherlv_0= For otherlv_1= LeftParenthesis ( (lv_left_2_0= ruleBSExpression ) ) otherlv_3= Semicolon ( (lv_middle_4_0= ruleBSExpression ) ) otherlv_5= Semicolon ( (lv_right_6_0= ruleBSExpression ) ) otherlv_7= RightParenthesis ( (lv_block_8_0= ruleBSLoopBlock ) ) )
            {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1347:1: (otherlv_0= For otherlv_1= LeftParenthesis ( (lv_left_2_0= ruleBSExpression ) ) otherlv_3= Semicolon ( (lv_middle_4_0= ruleBSExpression ) ) otherlv_5= Semicolon ( (lv_right_6_0= ruleBSExpression ) ) otherlv_7= RightParenthesis ( (lv_block_8_0= ruleBSLoopBlock ) ) )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1348:2: otherlv_0= For otherlv_1= LeftParenthesis ( (lv_left_2_0= ruleBSExpression ) ) otherlv_3= Semicolon ( (lv_middle_4_0= ruleBSExpression ) ) otherlv_5= Semicolon ( (lv_right_6_0= ruleBSExpression ) ) otherlv_7= RightParenthesis ( (lv_block_8_0= ruleBSLoopBlock ) )
            {
            otherlv_0=(Token)match(input,For,FOLLOW_For_in_ruleBSForLoop2942); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getBSForLoopAccess().getForKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,LeftParenthesis,FOLLOW_LeftParenthesis_in_ruleBSForLoop2954); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getBSForLoopAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1357:1: ( (lv_left_2_0= ruleBSExpression ) )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1358:1: (lv_left_2_0= ruleBSExpression )
            {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1358:1: (lv_left_2_0= ruleBSExpression )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1359:3: lv_left_2_0= ruleBSExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getBSForLoopAccess().getLeftBSExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleBSExpression_in_ruleBSForLoop2974);
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

            otherlv_3=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_ruleBSForLoop2987); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getBSForLoopAccess().getSemicolonKeyword_3());
                  
            }
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1380:1: ( (lv_middle_4_0= ruleBSExpression ) )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1381:1: (lv_middle_4_0= ruleBSExpression )
            {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1381:1: (lv_middle_4_0= ruleBSExpression )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1382:3: lv_middle_4_0= ruleBSExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getBSForLoopAccess().getMiddleBSExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleBSExpression_in_ruleBSForLoop3007);
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

            otherlv_5=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_ruleBSForLoop3020); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getBSForLoopAccess().getSemicolonKeyword_5());
                  
            }
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1403:1: ( (lv_right_6_0= ruleBSExpression ) )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1404:1: (lv_right_6_0= ruleBSExpression )
            {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1404:1: (lv_right_6_0= ruleBSExpression )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1405:3: lv_right_6_0= ruleBSExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getBSForLoopAccess().getRightBSExpressionParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleBSExpression_in_ruleBSForLoop3040);
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

            otherlv_7=(Token)match(input,RightParenthesis,FOLLOW_RightParenthesis_in_ruleBSForLoop3053); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getBSForLoopAccess().getRightParenthesisKeyword_7());
                  
            }
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1426:1: ( (lv_block_8_0= ruleBSLoopBlock ) )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1427:1: (lv_block_8_0= ruleBSLoopBlock )
            {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1427:1: (lv_block_8_0= ruleBSLoopBlock )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1428:3: lv_block_8_0= ruleBSLoopBlock
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getBSForLoopAccess().getBlockBSLoopBlockParserRuleCall_8_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleBSLoopBlock_in_ruleBSForLoop3073);
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
    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1452:1: entryRuleBSSwitchStatement returns [EObject current=null] : iv_ruleBSSwitchStatement= ruleBSSwitchStatement EOF ;
    public final EObject entryRuleBSSwitchStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBSSwitchStatement = null;


        try {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1453:2: (iv_ruleBSSwitchStatement= ruleBSSwitchStatement EOF )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1454:2: iv_ruleBSSwitchStatement= ruleBSSwitchStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBSSwitchStatementRule()); 
            }
            pushFollow(FOLLOW_ruleBSSwitchStatement_in_entryRuleBSSwitchStatement3108);
            iv_ruleBSSwitchStatement=ruleBSSwitchStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBSSwitchStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBSSwitchStatement3118); if (state.failed) return current;

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
    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1461:1: ruleBSSwitchStatement returns [EObject current=null] : (otherlv_0= Switch ( (lv_stringSwitch_1_0= DollarSign ) )? otherlv_2= LeftParenthesis ( (lv_expression_3_0= ruleBSExpression ) ) otherlv_4= RightParenthesis ( (lv_block_5_0= ruleBSSwitchBlock ) ) ) ;
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
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1464:28: ( (otherlv_0= Switch ( (lv_stringSwitch_1_0= DollarSign ) )? otherlv_2= LeftParenthesis ( (lv_expression_3_0= ruleBSExpression ) ) otherlv_4= RightParenthesis ( (lv_block_5_0= ruleBSSwitchBlock ) ) ) )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1465:1: (otherlv_0= Switch ( (lv_stringSwitch_1_0= DollarSign ) )? otherlv_2= LeftParenthesis ( (lv_expression_3_0= ruleBSExpression ) ) otherlv_4= RightParenthesis ( (lv_block_5_0= ruleBSSwitchBlock ) ) )
            {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1465:1: (otherlv_0= Switch ( (lv_stringSwitch_1_0= DollarSign ) )? otherlv_2= LeftParenthesis ( (lv_expression_3_0= ruleBSExpression ) ) otherlv_4= RightParenthesis ( (lv_block_5_0= ruleBSSwitchBlock ) ) )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1466:2: otherlv_0= Switch ( (lv_stringSwitch_1_0= DollarSign ) )? otherlv_2= LeftParenthesis ( (lv_expression_3_0= ruleBSExpression ) ) otherlv_4= RightParenthesis ( (lv_block_5_0= ruleBSSwitchBlock ) )
            {
            otherlv_0=(Token)match(input,Switch,FOLLOW_Switch_in_ruleBSSwitchStatement3156); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getBSSwitchStatementAccess().getSwitchKeyword_0());
                  
            }
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1470:1: ( (lv_stringSwitch_1_0= DollarSign ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==DollarSign) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1471:1: (lv_stringSwitch_1_0= DollarSign )
                    {
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1471:1: (lv_stringSwitch_1_0= DollarSign )
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1472:3: lv_stringSwitch_1_0= DollarSign
                    {
                    lv_stringSwitch_1_0=(Token)match(input,DollarSign,FOLLOW_DollarSign_in_ruleBSSwitchStatement3174); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,LeftParenthesis,FOLLOW_LeftParenthesis_in_ruleBSSwitchStatement3199); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getBSSwitchStatementAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1491:1: ( (lv_expression_3_0= ruleBSExpression ) )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1492:1: (lv_expression_3_0= ruleBSExpression )
            {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1492:1: (lv_expression_3_0= ruleBSExpression )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1493:3: lv_expression_3_0= ruleBSExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getBSSwitchStatementAccess().getExpressionBSExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleBSExpression_in_ruleBSSwitchStatement3219);
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

            otherlv_4=(Token)match(input,RightParenthesis,FOLLOW_RightParenthesis_in_ruleBSSwitchStatement3232); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getBSSwitchStatementAccess().getRightParenthesisKeyword_4());
                  
            }
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1514:1: ( (lv_block_5_0= ruleBSSwitchBlock ) )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1515:1: (lv_block_5_0= ruleBSSwitchBlock )
            {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1515:1: (lv_block_5_0= ruleBSSwitchBlock )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1516:3: lv_block_5_0= ruleBSSwitchBlock
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getBSSwitchStatementAccess().getBlockBSSwitchBlockParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleBSSwitchBlock_in_ruleBSSwitchStatement3252);
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
    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1540:1: entryRuleBSIfBlock returns [EObject current=null] : iv_ruleBSIfBlock= ruleBSIfBlock EOF ;
    public final EObject entryRuleBSIfBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBSIfBlock = null;


        try {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1541:2: (iv_ruleBSIfBlock= ruleBSIfBlock EOF )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1542:2: iv_ruleBSIfBlock= ruleBSIfBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBSIfBlockRule()); 
            }
            pushFollow(FOLLOW_ruleBSIfBlock_in_entryRuleBSIfBlock3287);
            iv_ruleBSIfBlock=ruleBSIfBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBSIfBlock; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBSIfBlock3297); if (state.failed) return current;

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
    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1549:1: ruleBSIfBlock returns [EObject current=null] : ( ( (lv_statements_0_0= ruleBSStatement ) ) | ( () otherlv_2= LeftCurlyBracket ( (lv_statements_3_0= ruleBSStatement ) )* otherlv_4= RightCurlyBracket ) ) ;
    public final EObject ruleBSIfBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_statements_0_0 = null;

        EObject lv_statements_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1552:28: ( ( ( (lv_statements_0_0= ruleBSStatement ) ) | ( () otherlv_2= LeftCurlyBracket ( (lv_statements_3_0= ruleBSStatement ) )* otherlv_4= RightCurlyBracket ) ) )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1553:1: ( ( (lv_statements_0_0= ruleBSStatement ) ) | ( () otherlv_2= LeftCurlyBracket ( (lv_statements_3_0= ruleBSStatement ) )* otherlv_4= RightCurlyBracket ) )
            {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1553:1: ( ( (lv_statements_0_0= ruleBSStatement ) ) | ( () otherlv_2= LeftCurlyBracket ( (lv_statements_3_0= ruleBSStatement ) )* otherlv_4= RightCurlyBracket ) )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>=TaggedString && LA25_0<=Continue)||LA25_0==Client||(LA25_0>=Number && LA25_0<=Break)||(LA25_0>=False && LA25_0<=NONE)||(LA25_0>=Null && LA25_0<=Void)||(LA25_0>=For && LA25_0<=New)||LA25_0==If||LA25_0==ExclamationMark||LA25_0==LeftParenthesis||LA25_0==PlusSign||LA25_0==HyphenMinus||(LA25_0>=Tilde && LA25_0<=RULE_INT)||LA25_0==RULE_STRING) ) {
                alt25=1;
            }
            else if ( (LA25_0==LeftCurlyBracket) ) {
                alt25=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1553:2: ( (lv_statements_0_0= ruleBSStatement ) )
                    {
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1553:2: ( (lv_statements_0_0= ruleBSStatement ) )
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1554:1: (lv_statements_0_0= ruleBSStatement )
                    {
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1554:1: (lv_statements_0_0= ruleBSStatement )
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1555:3: lv_statements_0_0= ruleBSStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getBSIfBlockAccess().getStatementsBSStatementParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBSStatement_in_ruleBSIfBlock3343);
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
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1572:6: ( () otherlv_2= LeftCurlyBracket ( (lv_statements_3_0= ruleBSStatement ) )* otherlv_4= RightCurlyBracket )
                    {
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1572:6: ( () otherlv_2= LeftCurlyBracket ( (lv_statements_3_0= ruleBSStatement ) )* otherlv_4= RightCurlyBracket )
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1572:7: () otherlv_2= LeftCurlyBracket ( (lv_statements_3_0= ruleBSStatement ) )* otherlv_4= RightCurlyBracket
                    {
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1572:7: ()
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1573:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getBSIfBlockAccess().getBSIfBlockAction_1_0(),
                                  current);
                          
                    }

                    }

                    otherlv_2=(Token)match(input,LeftCurlyBracket,FOLLOW_LeftCurlyBracket_in_ruleBSIfBlock3372); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getBSIfBlockAccess().getLeftCurlyBracketKeyword_1_1());
                          
                    }
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1583:1: ( (lv_statements_3_0= ruleBSStatement ) )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( ((LA24_0>=TaggedString && LA24_0<=Continue)||LA24_0==Client||(LA24_0>=Number && LA24_0<=Break)||(LA24_0>=False && LA24_0<=NONE)||(LA24_0>=Null && LA24_0<=Void)||(LA24_0>=For && LA24_0<=New)||LA24_0==If||LA24_0==ExclamationMark||LA24_0==LeftParenthesis||LA24_0==PlusSign||LA24_0==HyphenMinus||(LA24_0>=Tilde && LA24_0<=RULE_INT)||LA24_0==RULE_STRING) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1584:1: (lv_statements_3_0= ruleBSStatement )
                    	    {
                    	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1584:1: (lv_statements_3_0= ruleBSStatement )
                    	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1585:3: lv_statements_3_0= ruleBSStatement
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getBSIfBlockAccess().getStatementsBSStatementParserRuleCall_1_2_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleBSStatement_in_ruleBSIfBlock3392);
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
                    	    break loop24;
                        }
                    } while (true);

                    otherlv_4=(Token)match(input,RightCurlyBracket,FOLLOW_RightCurlyBracket_in_ruleBSIfBlock3406); if (state.failed) return current;
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
    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1614:1: entryRuleBSLoopBlock returns [EObject current=null] : iv_ruleBSLoopBlock= ruleBSLoopBlock EOF ;
    public final EObject entryRuleBSLoopBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBSLoopBlock = null;


        try {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1615:2: (iv_ruleBSLoopBlock= ruleBSLoopBlock EOF )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1616:2: iv_ruleBSLoopBlock= ruleBSLoopBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBSLoopBlockRule()); 
            }
            pushFollow(FOLLOW_ruleBSLoopBlock_in_entryRuleBSLoopBlock3441);
            iv_ruleBSLoopBlock=ruleBSLoopBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBSLoopBlock; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBSLoopBlock3451); if (state.failed) return current;

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
    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1623:1: ruleBSLoopBlock returns [EObject current=null] : ( ( (lv_statements_0_0= ruleBSStatement ) ) | ( () otherlv_2= LeftCurlyBracket ( (lv_statements_3_0= ruleBSStatement ) )* otherlv_4= RightCurlyBracket ) ) ;
    public final EObject ruleBSLoopBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_statements_0_0 = null;

        EObject lv_statements_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1626:28: ( ( ( (lv_statements_0_0= ruleBSStatement ) ) | ( () otherlv_2= LeftCurlyBracket ( (lv_statements_3_0= ruleBSStatement ) )* otherlv_4= RightCurlyBracket ) ) )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1627:1: ( ( (lv_statements_0_0= ruleBSStatement ) ) | ( () otherlv_2= LeftCurlyBracket ( (lv_statements_3_0= ruleBSStatement ) )* otherlv_4= RightCurlyBracket ) )
            {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1627:1: ( ( (lv_statements_0_0= ruleBSStatement ) ) | ( () otherlv_2= LeftCurlyBracket ( (lv_statements_3_0= ruleBSStatement ) )* otherlv_4= RightCurlyBracket ) )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( ((LA27_0>=TaggedString && LA27_0<=Continue)||LA27_0==Client||(LA27_0>=Number && LA27_0<=Break)||(LA27_0>=False && LA27_0<=NONE)||(LA27_0>=Null && LA27_0<=Void)||(LA27_0>=For && LA27_0<=New)||LA27_0==If||LA27_0==ExclamationMark||LA27_0==LeftParenthesis||LA27_0==PlusSign||LA27_0==HyphenMinus||(LA27_0>=Tilde && LA27_0<=RULE_INT)||LA27_0==RULE_STRING) ) {
                alt27=1;
            }
            else if ( (LA27_0==LeftCurlyBracket) ) {
                alt27=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1627:2: ( (lv_statements_0_0= ruleBSStatement ) )
                    {
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1627:2: ( (lv_statements_0_0= ruleBSStatement ) )
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1628:1: (lv_statements_0_0= ruleBSStatement )
                    {
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1628:1: (lv_statements_0_0= ruleBSStatement )
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1629:3: lv_statements_0_0= ruleBSStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getBSLoopBlockAccess().getStatementsBSStatementParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBSStatement_in_ruleBSLoopBlock3497);
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
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1646:6: ( () otherlv_2= LeftCurlyBracket ( (lv_statements_3_0= ruleBSStatement ) )* otherlv_4= RightCurlyBracket )
                    {
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1646:6: ( () otherlv_2= LeftCurlyBracket ( (lv_statements_3_0= ruleBSStatement ) )* otherlv_4= RightCurlyBracket )
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1646:7: () otherlv_2= LeftCurlyBracket ( (lv_statements_3_0= ruleBSStatement ) )* otherlv_4= RightCurlyBracket
                    {
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1646:7: ()
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1647:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getBSLoopBlockAccess().getBSLoopBlockAction_1_0(),
                                  current);
                          
                    }

                    }

                    otherlv_2=(Token)match(input,LeftCurlyBracket,FOLLOW_LeftCurlyBracket_in_ruleBSLoopBlock3526); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getBSLoopBlockAccess().getLeftCurlyBracketKeyword_1_1());
                          
                    }
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1657:1: ( (lv_statements_3_0= ruleBSStatement ) )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( ((LA26_0>=TaggedString && LA26_0<=Continue)||LA26_0==Client||(LA26_0>=Number && LA26_0<=Break)||(LA26_0>=False && LA26_0<=NONE)||(LA26_0>=Null && LA26_0<=Void)||(LA26_0>=For && LA26_0<=New)||LA26_0==If||LA26_0==ExclamationMark||LA26_0==LeftParenthesis||LA26_0==PlusSign||LA26_0==HyphenMinus||(LA26_0>=Tilde && LA26_0<=RULE_INT)||LA26_0==RULE_STRING) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1658:1: (lv_statements_3_0= ruleBSStatement )
                    	    {
                    	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1658:1: (lv_statements_3_0= ruleBSStatement )
                    	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1659:3: lv_statements_3_0= ruleBSStatement
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getBSLoopBlockAccess().getStatementsBSStatementParserRuleCall_1_2_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleBSStatement_in_ruleBSLoopBlock3546);
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
                    	    break loop26;
                        }
                    } while (true);

                    otherlv_4=(Token)match(input,RightCurlyBracket,FOLLOW_RightCurlyBracket_in_ruleBSLoopBlock3560); if (state.failed) return current;
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
    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1688:1: entryRuleBSSwitchBlock returns [EObject current=null] : iv_ruleBSSwitchBlock= ruleBSSwitchBlock EOF ;
    public final EObject entryRuleBSSwitchBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBSSwitchBlock = null;


        try {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1689:2: (iv_ruleBSSwitchBlock= ruleBSSwitchBlock EOF )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1690:2: iv_ruleBSSwitchBlock= ruleBSSwitchBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBSSwitchBlockRule()); 
            }
            pushFollow(FOLLOW_ruleBSSwitchBlock_in_entryRuleBSSwitchBlock3595);
            iv_ruleBSSwitchBlock=ruleBSSwitchBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBSSwitchBlock; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBSSwitchBlock3605); if (state.failed) return current;

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
    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1697:1: ruleBSSwitchBlock returns [EObject current=null] : ( () otherlv_1= LeftCurlyBracket ( (lv_cases_2_0= ruleBSCase ) )* otherlv_3= RightCurlyBracket ) ;
    public final EObject ruleBSSwitchBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_cases_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1700:28: ( ( () otherlv_1= LeftCurlyBracket ( (lv_cases_2_0= ruleBSCase ) )* otherlv_3= RightCurlyBracket ) )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1701:1: ( () otherlv_1= LeftCurlyBracket ( (lv_cases_2_0= ruleBSCase ) )* otherlv_3= RightCurlyBracket )
            {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1701:1: ( () otherlv_1= LeftCurlyBracket ( (lv_cases_2_0= ruleBSCase ) )* otherlv_3= RightCurlyBracket )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1701:2: () otherlv_1= LeftCurlyBracket ( (lv_cases_2_0= ruleBSCase ) )* otherlv_3= RightCurlyBracket
            {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1701:2: ()
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1702:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getBSSwitchBlockAccess().getBSSwitchBlockAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,LeftCurlyBracket,FOLLOW_LeftCurlyBracket_in_ruleBSSwitchBlock3652); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getBSSwitchBlockAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1712:1: ( (lv_cases_2_0= ruleBSCase ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==Default||LA28_0==Case) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1713:1: (lv_cases_2_0= ruleBSCase )
            	    {
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1713:1: (lv_cases_2_0= ruleBSCase )
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1714:3: lv_cases_2_0= ruleBSCase
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getBSSwitchBlockAccess().getCasesBSCaseParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleBSCase_in_ruleBSSwitchBlock3672);
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
            	    break loop28;
                }
            } while (true);

            otherlv_3=(Token)match(input,RightCurlyBracket,FOLLOW_RightCurlyBracket_in_ruleBSSwitchBlock3686); if (state.failed) return current;
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
    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1743:1: entryRuleBSCase returns [EObject current=null] : iv_ruleBSCase= ruleBSCase EOF ;
    public final EObject entryRuleBSCase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBSCase = null;


        try {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1744:2: (iv_ruleBSCase= ruleBSCase EOF )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1745:2: iv_ruleBSCase= ruleBSCase EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBSCaseRule()); 
            }
            pushFollow(FOLLOW_ruleBSCase_in_entryRuleBSCase3720);
            iv_ruleBSCase=ruleBSCase();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBSCase; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBSCase3730); if (state.failed) return current;

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
    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1752:1: ruleBSCase returns [EObject current=null] : ( (otherlv_0= Case ( (lv_expression_1_0= ruleBSExpression ) ) otherlv_2= Colon ( (lv_block_3_0= ruleBSCaseBlock ) ) ) | (otherlv_4= Default otherlv_5= Colon ( (lv_block_6_0= ruleBSCaseBlock ) ) ) ) ;
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
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1755:28: ( ( (otherlv_0= Case ( (lv_expression_1_0= ruleBSExpression ) ) otherlv_2= Colon ( (lv_block_3_0= ruleBSCaseBlock ) ) ) | (otherlv_4= Default otherlv_5= Colon ( (lv_block_6_0= ruleBSCaseBlock ) ) ) ) )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1756:1: ( (otherlv_0= Case ( (lv_expression_1_0= ruleBSExpression ) ) otherlv_2= Colon ( (lv_block_3_0= ruleBSCaseBlock ) ) ) | (otherlv_4= Default otherlv_5= Colon ( (lv_block_6_0= ruleBSCaseBlock ) ) ) )
            {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1756:1: ( (otherlv_0= Case ( (lv_expression_1_0= ruleBSExpression ) ) otherlv_2= Colon ( (lv_block_3_0= ruleBSCaseBlock ) ) ) | (otherlv_4= Default otherlv_5= Colon ( (lv_block_6_0= ruleBSCaseBlock ) ) ) )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==Case) ) {
                alt29=1;
            }
            else if ( (LA29_0==Default) ) {
                alt29=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1756:2: (otherlv_0= Case ( (lv_expression_1_0= ruleBSExpression ) ) otherlv_2= Colon ( (lv_block_3_0= ruleBSCaseBlock ) ) )
                    {
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1756:2: (otherlv_0= Case ( (lv_expression_1_0= ruleBSExpression ) ) otherlv_2= Colon ( (lv_block_3_0= ruleBSCaseBlock ) ) )
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1757:2: otherlv_0= Case ( (lv_expression_1_0= ruleBSExpression ) ) otherlv_2= Colon ( (lv_block_3_0= ruleBSCaseBlock ) )
                    {
                    otherlv_0=(Token)match(input,Case,FOLLOW_Case_in_ruleBSCase3769); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getBSCaseAccess().getCaseKeyword_0_0());
                          
                    }
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1761:1: ( (lv_expression_1_0= ruleBSExpression ) )
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1762:1: (lv_expression_1_0= ruleBSExpression )
                    {
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1762:1: (lv_expression_1_0= ruleBSExpression )
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1763:3: lv_expression_1_0= ruleBSExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getBSCaseAccess().getExpressionBSExpressionParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBSExpression_in_ruleBSCase3789);
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

                    otherlv_2=(Token)match(input,Colon,FOLLOW_Colon_in_ruleBSCase3802); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getBSCaseAccess().getColonKeyword_0_2());
                          
                    }
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1784:1: ( (lv_block_3_0= ruleBSCaseBlock ) )
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1785:1: (lv_block_3_0= ruleBSCaseBlock )
                    {
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1785:1: (lv_block_3_0= ruleBSCaseBlock )
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1786:3: lv_block_3_0= ruleBSCaseBlock
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getBSCaseAccess().getBlockBSCaseBlockParserRuleCall_0_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBSCaseBlock_in_ruleBSCase3822);
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
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1803:6: (otherlv_4= Default otherlv_5= Colon ( (lv_block_6_0= ruleBSCaseBlock ) ) )
                    {
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1803:6: (otherlv_4= Default otherlv_5= Colon ( (lv_block_6_0= ruleBSCaseBlock ) ) )
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1804:2: otherlv_4= Default otherlv_5= Colon ( (lv_block_6_0= ruleBSCaseBlock ) )
                    {
                    otherlv_4=(Token)match(input,Default,FOLLOW_Default_in_ruleBSCase3843); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getBSCaseAccess().getDefaultKeyword_1_0());
                          
                    }
                    otherlv_5=(Token)match(input,Colon,FOLLOW_Colon_in_ruleBSCase3855); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getBSCaseAccess().getColonKeyword_1_1());
                          
                    }
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1813:1: ( (lv_block_6_0= ruleBSCaseBlock ) )
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1814:1: (lv_block_6_0= ruleBSCaseBlock )
                    {
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1814:1: (lv_block_6_0= ruleBSCaseBlock )
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1815:3: lv_block_6_0= ruleBSCaseBlock
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getBSCaseAccess().getBlockBSCaseBlockParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBSCaseBlock_in_ruleBSCase3875);
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
    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1839:1: entryRuleBSCaseBlock returns [EObject current=null] : iv_ruleBSCaseBlock= ruleBSCaseBlock EOF ;
    public final EObject entryRuleBSCaseBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBSCaseBlock = null;


        try {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1840:2: (iv_ruleBSCaseBlock= ruleBSCaseBlock EOF )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1841:2: iv_ruleBSCaseBlock= ruleBSCaseBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBSCaseBlockRule()); 
            }
            pushFollow(FOLLOW_ruleBSCaseBlock_in_entryRuleBSCaseBlock3911);
            iv_ruleBSCaseBlock=ruleBSCaseBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBSCaseBlock; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBSCaseBlock3921); if (state.failed) return current;

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
    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1848:1: ruleBSCaseBlock returns [EObject current=null] : ( () ( (lv_statements_1_0= ruleBSStatement ) )* ) ;
    public final EObject ruleBSCaseBlock() throws RecognitionException {
        EObject current = null;

        EObject lv_statements_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1851:28: ( ( () ( (lv_statements_1_0= ruleBSStatement ) )* ) )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1852:1: ( () ( (lv_statements_1_0= ruleBSStatement ) )* )
            {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1852:1: ( () ( (lv_statements_1_0= ruleBSStatement ) )* )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1852:2: () ( (lv_statements_1_0= ruleBSStatement ) )*
            {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1852:2: ()
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1853:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getBSCaseBlockAccess().getBSCaseBlockAction_0(),
                          current);
                  
            }

            }

            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1858:2: ( (lv_statements_1_0= ruleBSStatement ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( ((LA30_0>=TaggedString && LA30_0<=Continue)||LA30_0==Client||(LA30_0>=Number && LA30_0<=Break)||(LA30_0>=False && LA30_0<=NONE)||(LA30_0>=Null && LA30_0<=Void)||(LA30_0>=For && LA30_0<=New)||LA30_0==If||LA30_0==ExclamationMark||LA30_0==LeftParenthesis||LA30_0==PlusSign||LA30_0==HyphenMinus||(LA30_0>=Tilde && LA30_0<=RULE_INT)||LA30_0==RULE_STRING) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1859:1: (lv_statements_1_0= ruleBSStatement )
            	    {
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1859:1: (lv_statements_1_0= ruleBSStatement )
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1860:3: lv_statements_1_0= ruleBSStatement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getBSCaseBlockAccess().getStatementsBSStatementParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleBSStatement_in_ruleBSCaseBlock3976);
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
    // $ANTLR end "ruleBSCaseBlock"


    // $ANTLR start "entryRuleBSExpression"
    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1888:1: entryRuleBSExpression returns [EObject current=null] : iv_ruleBSExpression= ruleBSExpression EOF ;
    public final EObject entryRuleBSExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBSExpression = null;


        try {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1889:2: (iv_ruleBSExpression= ruleBSExpression EOF )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1890:2: iv_ruleBSExpression= ruleBSExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBSExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleBSExpression_in_entryRuleBSExpression4016);
            iv_ruleBSExpression=ruleBSExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBSExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBSExpression4026); if (state.failed) return current;

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
    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1897:1: ruleBSExpression returns [EObject current=null] : this_BSAssignmentOrTernaryExpression_0= ruleBSAssignmentOrTernaryExpression ;
    public final EObject ruleBSExpression() throws RecognitionException {
        EObject current = null;

        EObject this_BSAssignmentOrTernaryExpression_0 = null;


         enterRule(); 
            
        try {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1900:28: (this_BSAssignmentOrTernaryExpression_0= ruleBSAssignmentOrTernaryExpression )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1902:5: this_BSAssignmentOrTernaryExpression_0= ruleBSAssignmentOrTernaryExpression
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getBSExpressionAccess().getBSAssignmentOrTernaryExpressionParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleBSAssignmentOrTernaryExpression_in_ruleBSExpression4072);
            this_BSAssignmentOrTernaryExpression_0=ruleBSAssignmentOrTernaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = this_BSAssignmentOrTernaryExpression_0;
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


    // $ANTLR start "entryRuleBSAssignmentOrTernaryExpression"
    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1918:1: entryRuleBSAssignmentOrTernaryExpression returns [EObject current=null] : iv_ruleBSAssignmentOrTernaryExpression= ruleBSAssignmentOrTernaryExpression EOF ;
    public final EObject entryRuleBSAssignmentOrTernaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBSAssignmentOrTernaryExpression = null;


        try {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1919:2: (iv_ruleBSAssignmentOrTernaryExpression= ruleBSAssignmentOrTernaryExpression EOF )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1920:2: iv_ruleBSAssignmentOrTernaryExpression= ruleBSAssignmentOrTernaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBSAssignmentOrTernaryExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleBSAssignmentOrTernaryExpression_in_entryRuleBSAssignmentOrTernaryExpression4105);
            iv_ruleBSAssignmentOrTernaryExpression=ruleBSAssignmentOrTernaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBSAssignmentOrTernaryExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBSAssignmentOrTernaryExpression4115); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBSAssignmentOrTernaryExpression"


    // $ANTLR start "ruleBSAssignmentOrTernaryExpression"
    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1927:1: ruleBSAssignmentOrTernaryExpression returns [EObject current=null] : (this_BSBooleanOrExpression_0= ruleBSBooleanOrExpression ( ( () ( ( (lv_assignmentOperator_2_1= EqualsSign | lv_assignmentOperator_2_2= CommercialAtEqualsSign | lv_assignmentOperator_2_3= PlusSignEqualsSign | lv_assignmentOperator_2_4= HyphenMinusEqualsSign | lv_assignmentOperator_2_5= AsteriskEqualsSign | lv_assignmentOperator_2_6= SolidusEqualsSign | lv_assignmentOperator_2_7= PercentSignEqualsSign | lv_assignmentOperator_2_8= LessThanSignLessThanSignEqualsSign | lv_assignmentOperator_2_9= GreaterThanSignGreaterThanSignEqualsSign | lv_assignmentOperator_2_10= AmpersandEqualsSign | lv_assignmentOperator_2_11= CircumflexAccentEqualsSign | lv_assignmentOperator_2_12= VerticalLineEqualsSign ) ) ) ( (lv_right_3_0= ruleBSExpression ) ) ) | ( () otherlv_5= QuestionMark ( (lv_middle_6_0= ruleBSExpression ) ) otherlv_7= Colon ( (lv_right_8_0= ruleBSExpression ) ) ) )? ) ;
    public final EObject ruleBSAssignmentOrTernaryExpression() throws RecognitionException {
        EObject current = null;

        Token lv_assignmentOperator_2_1=null;
        Token lv_assignmentOperator_2_2=null;
        Token lv_assignmentOperator_2_3=null;
        Token lv_assignmentOperator_2_4=null;
        Token lv_assignmentOperator_2_5=null;
        Token lv_assignmentOperator_2_6=null;
        Token lv_assignmentOperator_2_7=null;
        Token lv_assignmentOperator_2_8=null;
        Token lv_assignmentOperator_2_9=null;
        Token lv_assignmentOperator_2_10=null;
        Token lv_assignmentOperator_2_11=null;
        Token lv_assignmentOperator_2_12=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject this_BSBooleanOrExpression_0 = null;

        EObject lv_right_3_0 = null;

        EObject lv_middle_6_0 = null;

        EObject lv_right_8_0 = null;


         enterRule(); 
            
        try {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1930:28: ( (this_BSBooleanOrExpression_0= ruleBSBooleanOrExpression ( ( () ( ( (lv_assignmentOperator_2_1= EqualsSign | lv_assignmentOperator_2_2= CommercialAtEqualsSign | lv_assignmentOperator_2_3= PlusSignEqualsSign | lv_assignmentOperator_2_4= HyphenMinusEqualsSign | lv_assignmentOperator_2_5= AsteriskEqualsSign | lv_assignmentOperator_2_6= SolidusEqualsSign | lv_assignmentOperator_2_7= PercentSignEqualsSign | lv_assignmentOperator_2_8= LessThanSignLessThanSignEqualsSign | lv_assignmentOperator_2_9= GreaterThanSignGreaterThanSignEqualsSign | lv_assignmentOperator_2_10= AmpersandEqualsSign | lv_assignmentOperator_2_11= CircumflexAccentEqualsSign | lv_assignmentOperator_2_12= VerticalLineEqualsSign ) ) ) ( (lv_right_3_0= ruleBSExpression ) ) ) | ( () otherlv_5= QuestionMark ( (lv_middle_6_0= ruleBSExpression ) ) otherlv_7= Colon ( (lv_right_8_0= ruleBSExpression ) ) ) )? ) )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1931:1: (this_BSBooleanOrExpression_0= ruleBSBooleanOrExpression ( ( () ( ( (lv_assignmentOperator_2_1= EqualsSign | lv_assignmentOperator_2_2= CommercialAtEqualsSign | lv_assignmentOperator_2_3= PlusSignEqualsSign | lv_assignmentOperator_2_4= HyphenMinusEqualsSign | lv_assignmentOperator_2_5= AsteriskEqualsSign | lv_assignmentOperator_2_6= SolidusEqualsSign | lv_assignmentOperator_2_7= PercentSignEqualsSign | lv_assignmentOperator_2_8= LessThanSignLessThanSignEqualsSign | lv_assignmentOperator_2_9= GreaterThanSignGreaterThanSignEqualsSign | lv_assignmentOperator_2_10= AmpersandEqualsSign | lv_assignmentOperator_2_11= CircumflexAccentEqualsSign | lv_assignmentOperator_2_12= VerticalLineEqualsSign ) ) ) ( (lv_right_3_0= ruleBSExpression ) ) ) | ( () otherlv_5= QuestionMark ( (lv_middle_6_0= ruleBSExpression ) ) otherlv_7= Colon ( (lv_right_8_0= ruleBSExpression ) ) ) )? )
            {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1931:1: (this_BSBooleanOrExpression_0= ruleBSBooleanOrExpression ( ( () ( ( (lv_assignmentOperator_2_1= EqualsSign | lv_assignmentOperator_2_2= CommercialAtEqualsSign | lv_assignmentOperator_2_3= PlusSignEqualsSign | lv_assignmentOperator_2_4= HyphenMinusEqualsSign | lv_assignmentOperator_2_5= AsteriskEqualsSign | lv_assignmentOperator_2_6= SolidusEqualsSign | lv_assignmentOperator_2_7= PercentSignEqualsSign | lv_assignmentOperator_2_8= LessThanSignLessThanSignEqualsSign | lv_assignmentOperator_2_9= GreaterThanSignGreaterThanSignEqualsSign | lv_assignmentOperator_2_10= AmpersandEqualsSign | lv_assignmentOperator_2_11= CircumflexAccentEqualsSign | lv_assignmentOperator_2_12= VerticalLineEqualsSign ) ) ) ( (lv_right_3_0= ruleBSExpression ) ) ) | ( () otherlv_5= QuestionMark ( (lv_middle_6_0= ruleBSExpression ) ) otherlv_7= Colon ( (lv_right_8_0= ruleBSExpression ) ) ) )? )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1932:5: this_BSBooleanOrExpression_0= ruleBSBooleanOrExpression ( ( () ( ( (lv_assignmentOperator_2_1= EqualsSign | lv_assignmentOperator_2_2= CommercialAtEqualsSign | lv_assignmentOperator_2_3= PlusSignEqualsSign | lv_assignmentOperator_2_4= HyphenMinusEqualsSign | lv_assignmentOperator_2_5= AsteriskEqualsSign | lv_assignmentOperator_2_6= SolidusEqualsSign | lv_assignmentOperator_2_7= PercentSignEqualsSign | lv_assignmentOperator_2_8= LessThanSignLessThanSignEqualsSign | lv_assignmentOperator_2_9= GreaterThanSignGreaterThanSignEqualsSign | lv_assignmentOperator_2_10= AmpersandEqualsSign | lv_assignmentOperator_2_11= CircumflexAccentEqualsSign | lv_assignmentOperator_2_12= VerticalLineEqualsSign ) ) ) ( (lv_right_3_0= ruleBSExpression ) ) ) | ( () otherlv_5= QuestionMark ( (lv_middle_6_0= ruleBSExpression ) ) otherlv_7= Colon ( (lv_right_8_0= ruleBSExpression ) ) ) )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getBSAssignmentOrTernaryExpressionAccess().getBSBooleanOrExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleBSBooleanOrExpression_in_ruleBSAssignmentOrTernaryExpression4162);
            this_BSBooleanOrExpression_0=ruleBSBooleanOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = this_BSBooleanOrExpression_0;
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1940:1: ( ( () ( ( (lv_assignmentOperator_2_1= EqualsSign | lv_assignmentOperator_2_2= CommercialAtEqualsSign | lv_assignmentOperator_2_3= PlusSignEqualsSign | lv_assignmentOperator_2_4= HyphenMinusEqualsSign | lv_assignmentOperator_2_5= AsteriskEqualsSign | lv_assignmentOperator_2_6= SolidusEqualsSign | lv_assignmentOperator_2_7= PercentSignEqualsSign | lv_assignmentOperator_2_8= LessThanSignLessThanSignEqualsSign | lv_assignmentOperator_2_9= GreaterThanSignGreaterThanSignEqualsSign | lv_assignmentOperator_2_10= AmpersandEqualsSign | lv_assignmentOperator_2_11= CircumflexAccentEqualsSign | lv_assignmentOperator_2_12= VerticalLineEqualsSign ) ) ) ( (lv_right_3_0= ruleBSExpression ) ) ) | ( () otherlv_5= QuestionMark ( (lv_middle_6_0= ruleBSExpression ) ) otherlv_7= Colon ( (lv_right_8_0= ruleBSExpression ) ) ) )?
            int alt32=3;
            int LA32_0 = input.LA(1);

            if ( ((LA32_0>=LessThanSignLessThanSignEqualsSign && LA32_0<=GreaterThanSignGreaterThanSignEqualsSign)||LA32_0==PercentSignEqualsSign||(LA32_0>=AmpersandEqualsSign && LA32_0<=AsteriskEqualsSign)||LA32_0==PlusSignEqualsSign||LA32_0==HyphenMinusEqualsSign||LA32_0==SolidusEqualsSign||LA32_0==CommercialAtEqualsSign||LA32_0==CircumflexAccentEqualsSign||LA32_0==VerticalLineEqualsSign||LA32_0==EqualsSign) ) {
                alt32=1;
            }
            else if ( (LA32_0==QuestionMark) ) {
                alt32=2;
            }
            switch (alt32) {
                case 1 :
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1940:2: ( () ( ( (lv_assignmentOperator_2_1= EqualsSign | lv_assignmentOperator_2_2= CommercialAtEqualsSign | lv_assignmentOperator_2_3= PlusSignEqualsSign | lv_assignmentOperator_2_4= HyphenMinusEqualsSign | lv_assignmentOperator_2_5= AsteriskEqualsSign | lv_assignmentOperator_2_6= SolidusEqualsSign | lv_assignmentOperator_2_7= PercentSignEqualsSign | lv_assignmentOperator_2_8= LessThanSignLessThanSignEqualsSign | lv_assignmentOperator_2_9= GreaterThanSignGreaterThanSignEqualsSign | lv_assignmentOperator_2_10= AmpersandEqualsSign | lv_assignmentOperator_2_11= CircumflexAccentEqualsSign | lv_assignmentOperator_2_12= VerticalLineEqualsSign ) ) ) ( (lv_right_3_0= ruleBSExpression ) ) )
                    {
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1940:2: ( () ( ( (lv_assignmentOperator_2_1= EqualsSign | lv_assignmentOperator_2_2= CommercialAtEqualsSign | lv_assignmentOperator_2_3= PlusSignEqualsSign | lv_assignmentOperator_2_4= HyphenMinusEqualsSign | lv_assignmentOperator_2_5= AsteriskEqualsSign | lv_assignmentOperator_2_6= SolidusEqualsSign | lv_assignmentOperator_2_7= PercentSignEqualsSign | lv_assignmentOperator_2_8= LessThanSignLessThanSignEqualsSign | lv_assignmentOperator_2_9= GreaterThanSignGreaterThanSignEqualsSign | lv_assignmentOperator_2_10= AmpersandEqualsSign | lv_assignmentOperator_2_11= CircumflexAccentEqualsSign | lv_assignmentOperator_2_12= VerticalLineEqualsSign ) ) ) ( (lv_right_3_0= ruleBSExpression ) ) )
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1940:3: () ( ( (lv_assignmentOperator_2_1= EqualsSign | lv_assignmentOperator_2_2= CommercialAtEqualsSign | lv_assignmentOperator_2_3= PlusSignEqualsSign | lv_assignmentOperator_2_4= HyphenMinusEqualsSign | lv_assignmentOperator_2_5= AsteriskEqualsSign | lv_assignmentOperator_2_6= SolidusEqualsSign | lv_assignmentOperator_2_7= PercentSignEqualsSign | lv_assignmentOperator_2_8= LessThanSignLessThanSignEqualsSign | lv_assignmentOperator_2_9= GreaterThanSignGreaterThanSignEqualsSign | lv_assignmentOperator_2_10= AmpersandEqualsSign | lv_assignmentOperator_2_11= CircumflexAccentEqualsSign | lv_assignmentOperator_2_12= VerticalLineEqualsSign ) ) ) ( (lv_right_3_0= ruleBSExpression ) )
                    {
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1940:3: ()
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1941:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getBSAssignmentOrTernaryExpressionAccess().getBSAssignmentExpressionLeftAction_1_0_0(),
                                  current);
                          
                    }

                    }

                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1946:2: ( ( (lv_assignmentOperator_2_1= EqualsSign | lv_assignmentOperator_2_2= CommercialAtEqualsSign | lv_assignmentOperator_2_3= PlusSignEqualsSign | lv_assignmentOperator_2_4= HyphenMinusEqualsSign | lv_assignmentOperator_2_5= AsteriskEqualsSign | lv_assignmentOperator_2_6= SolidusEqualsSign | lv_assignmentOperator_2_7= PercentSignEqualsSign | lv_assignmentOperator_2_8= LessThanSignLessThanSignEqualsSign | lv_assignmentOperator_2_9= GreaterThanSignGreaterThanSignEqualsSign | lv_assignmentOperator_2_10= AmpersandEqualsSign | lv_assignmentOperator_2_11= CircumflexAccentEqualsSign | lv_assignmentOperator_2_12= VerticalLineEqualsSign ) ) )
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1947:1: ( (lv_assignmentOperator_2_1= EqualsSign | lv_assignmentOperator_2_2= CommercialAtEqualsSign | lv_assignmentOperator_2_3= PlusSignEqualsSign | lv_assignmentOperator_2_4= HyphenMinusEqualsSign | lv_assignmentOperator_2_5= AsteriskEqualsSign | lv_assignmentOperator_2_6= SolidusEqualsSign | lv_assignmentOperator_2_7= PercentSignEqualsSign | lv_assignmentOperator_2_8= LessThanSignLessThanSignEqualsSign | lv_assignmentOperator_2_9= GreaterThanSignGreaterThanSignEqualsSign | lv_assignmentOperator_2_10= AmpersandEqualsSign | lv_assignmentOperator_2_11= CircumflexAccentEqualsSign | lv_assignmentOperator_2_12= VerticalLineEqualsSign ) )
                    {
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1947:1: ( (lv_assignmentOperator_2_1= EqualsSign | lv_assignmentOperator_2_2= CommercialAtEqualsSign | lv_assignmentOperator_2_3= PlusSignEqualsSign | lv_assignmentOperator_2_4= HyphenMinusEqualsSign | lv_assignmentOperator_2_5= AsteriskEqualsSign | lv_assignmentOperator_2_6= SolidusEqualsSign | lv_assignmentOperator_2_7= PercentSignEqualsSign | lv_assignmentOperator_2_8= LessThanSignLessThanSignEqualsSign | lv_assignmentOperator_2_9= GreaterThanSignGreaterThanSignEqualsSign | lv_assignmentOperator_2_10= AmpersandEqualsSign | lv_assignmentOperator_2_11= CircumflexAccentEqualsSign | lv_assignmentOperator_2_12= VerticalLineEqualsSign ) )
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1948:1: (lv_assignmentOperator_2_1= EqualsSign | lv_assignmentOperator_2_2= CommercialAtEqualsSign | lv_assignmentOperator_2_3= PlusSignEqualsSign | lv_assignmentOperator_2_4= HyphenMinusEqualsSign | lv_assignmentOperator_2_5= AsteriskEqualsSign | lv_assignmentOperator_2_6= SolidusEqualsSign | lv_assignmentOperator_2_7= PercentSignEqualsSign | lv_assignmentOperator_2_8= LessThanSignLessThanSignEqualsSign | lv_assignmentOperator_2_9= GreaterThanSignGreaterThanSignEqualsSign | lv_assignmentOperator_2_10= AmpersandEqualsSign | lv_assignmentOperator_2_11= CircumflexAccentEqualsSign | lv_assignmentOperator_2_12= VerticalLineEqualsSign )
                    {
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1948:1: (lv_assignmentOperator_2_1= EqualsSign | lv_assignmentOperator_2_2= CommercialAtEqualsSign | lv_assignmentOperator_2_3= PlusSignEqualsSign | lv_assignmentOperator_2_4= HyphenMinusEqualsSign | lv_assignmentOperator_2_5= AsteriskEqualsSign | lv_assignmentOperator_2_6= SolidusEqualsSign | lv_assignmentOperator_2_7= PercentSignEqualsSign | lv_assignmentOperator_2_8= LessThanSignLessThanSignEqualsSign | lv_assignmentOperator_2_9= GreaterThanSignGreaterThanSignEqualsSign | lv_assignmentOperator_2_10= AmpersandEqualsSign | lv_assignmentOperator_2_11= CircumflexAccentEqualsSign | lv_assignmentOperator_2_12= VerticalLineEqualsSign )
                    int alt31=12;
                    switch ( input.LA(1) ) {
                    case EqualsSign:
                        {
                        alt31=1;
                        }
                        break;
                    case CommercialAtEqualsSign:
                        {
                        alt31=2;
                        }
                        break;
                    case PlusSignEqualsSign:
                        {
                        alt31=3;
                        }
                        break;
                    case HyphenMinusEqualsSign:
                        {
                        alt31=4;
                        }
                        break;
                    case AsteriskEqualsSign:
                        {
                        alt31=5;
                        }
                        break;
                    case SolidusEqualsSign:
                        {
                        alt31=6;
                        }
                        break;
                    case PercentSignEqualsSign:
                        {
                        alt31=7;
                        }
                        break;
                    case LessThanSignLessThanSignEqualsSign:
                        {
                        alt31=8;
                        }
                        break;
                    case GreaterThanSignGreaterThanSignEqualsSign:
                        {
                        alt31=9;
                        }
                        break;
                    case AmpersandEqualsSign:
                        {
                        alt31=10;
                        }
                        break;
                    case CircumflexAccentEqualsSign:
                        {
                        alt31=11;
                        }
                        break;
                    case VerticalLineEqualsSign:
                        {
                        alt31=12;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 31, 0, input);

                        throw nvae;
                    }

                    switch (alt31) {
                        case 1 :
                            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1949:3: lv_assignmentOperator_2_1= EqualsSign
                            {
                            lv_assignmentOperator_2_1=(Token)match(input,EqualsSign,FOLLOW_EqualsSign_in_ruleBSAssignmentOrTernaryExpression4193); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_assignmentOperator_2_1, grammarAccess.getBSAssignmentOrTernaryExpressionAccess().getAssignmentOperatorEqualsSignKeyword_1_0_1_0_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getBSAssignmentOrTernaryExpressionRule());
                              	        }
                                     		setWithLastConsumed(current, "assignmentOperator", lv_assignmentOperator_2_1, null);
                              	    
                            }

                            }
                            break;
                        case 2 :
                            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1962:8: lv_assignmentOperator_2_2= CommercialAtEqualsSign
                            {
                            lv_assignmentOperator_2_2=(Token)match(input,CommercialAtEqualsSign,FOLLOW_CommercialAtEqualsSign_in_ruleBSAssignmentOrTernaryExpression4221); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_assignmentOperator_2_2, grammarAccess.getBSAssignmentOrTernaryExpressionAccess().getAssignmentOperatorCommercialAtEqualsSignKeyword_1_0_1_0_1());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getBSAssignmentOrTernaryExpressionRule());
                              	        }
                                     		setWithLastConsumed(current, "assignmentOperator", lv_assignmentOperator_2_2, null);
                              	    
                            }

                            }
                            break;
                        case 3 :
                            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1975:8: lv_assignmentOperator_2_3= PlusSignEqualsSign
                            {
                            lv_assignmentOperator_2_3=(Token)match(input,PlusSignEqualsSign,FOLLOW_PlusSignEqualsSign_in_ruleBSAssignmentOrTernaryExpression4249); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_assignmentOperator_2_3, grammarAccess.getBSAssignmentOrTernaryExpressionAccess().getAssignmentOperatorPlusSignEqualsSignKeyword_1_0_1_0_2());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getBSAssignmentOrTernaryExpressionRule());
                              	        }
                                     		setWithLastConsumed(current, "assignmentOperator", lv_assignmentOperator_2_3, null);
                              	    
                            }

                            }
                            break;
                        case 4 :
                            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1988:8: lv_assignmentOperator_2_4= HyphenMinusEqualsSign
                            {
                            lv_assignmentOperator_2_4=(Token)match(input,HyphenMinusEqualsSign,FOLLOW_HyphenMinusEqualsSign_in_ruleBSAssignmentOrTernaryExpression4277); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_assignmentOperator_2_4, grammarAccess.getBSAssignmentOrTernaryExpressionAccess().getAssignmentOperatorHyphenMinusEqualsSignKeyword_1_0_1_0_3());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getBSAssignmentOrTernaryExpressionRule());
                              	        }
                                     		setWithLastConsumed(current, "assignmentOperator", lv_assignmentOperator_2_4, null);
                              	    
                            }

                            }
                            break;
                        case 5 :
                            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2001:8: lv_assignmentOperator_2_5= AsteriskEqualsSign
                            {
                            lv_assignmentOperator_2_5=(Token)match(input,AsteriskEqualsSign,FOLLOW_AsteriskEqualsSign_in_ruleBSAssignmentOrTernaryExpression4305); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_assignmentOperator_2_5, grammarAccess.getBSAssignmentOrTernaryExpressionAccess().getAssignmentOperatorAsteriskEqualsSignKeyword_1_0_1_0_4());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getBSAssignmentOrTernaryExpressionRule());
                              	        }
                                     		setWithLastConsumed(current, "assignmentOperator", lv_assignmentOperator_2_5, null);
                              	    
                            }

                            }
                            break;
                        case 6 :
                            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2014:8: lv_assignmentOperator_2_6= SolidusEqualsSign
                            {
                            lv_assignmentOperator_2_6=(Token)match(input,SolidusEqualsSign,FOLLOW_SolidusEqualsSign_in_ruleBSAssignmentOrTernaryExpression4333); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_assignmentOperator_2_6, grammarAccess.getBSAssignmentOrTernaryExpressionAccess().getAssignmentOperatorSolidusEqualsSignKeyword_1_0_1_0_5());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getBSAssignmentOrTernaryExpressionRule());
                              	        }
                                     		setWithLastConsumed(current, "assignmentOperator", lv_assignmentOperator_2_6, null);
                              	    
                            }

                            }
                            break;
                        case 7 :
                            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2027:8: lv_assignmentOperator_2_7= PercentSignEqualsSign
                            {
                            lv_assignmentOperator_2_7=(Token)match(input,PercentSignEqualsSign,FOLLOW_PercentSignEqualsSign_in_ruleBSAssignmentOrTernaryExpression4361); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_assignmentOperator_2_7, grammarAccess.getBSAssignmentOrTernaryExpressionAccess().getAssignmentOperatorPercentSignEqualsSignKeyword_1_0_1_0_6());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getBSAssignmentOrTernaryExpressionRule());
                              	        }
                                     		setWithLastConsumed(current, "assignmentOperator", lv_assignmentOperator_2_7, null);
                              	    
                            }

                            }
                            break;
                        case 8 :
                            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2040:8: lv_assignmentOperator_2_8= LessThanSignLessThanSignEqualsSign
                            {
                            lv_assignmentOperator_2_8=(Token)match(input,LessThanSignLessThanSignEqualsSign,FOLLOW_LessThanSignLessThanSignEqualsSign_in_ruleBSAssignmentOrTernaryExpression4389); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_assignmentOperator_2_8, grammarAccess.getBSAssignmentOrTernaryExpressionAccess().getAssignmentOperatorLessThanSignLessThanSignEqualsSignKeyword_1_0_1_0_7());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getBSAssignmentOrTernaryExpressionRule());
                              	        }
                                     		setWithLastConsumed(current, "assignmentOperator", lv_assignmentOperator_2_8, null);
                              	    
                            }

                            }
                            break;
                        case 9 :
                            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2053:8: lv_assignmentOperator_2_9= GreaterThanSignGreaterThanSignEqualsSign
                            {
                            lv_assignmentOperator_2_9=(Token)match(input,GreaterThanSignGreaterThanSignEqualsSign,FOLLOW_GreaterThanSignGreaterThanSignEqualsSign_in_ruleBSAssignmentOrTernaryExpression4417); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_assignmentOperator_2_9, grammarAccess.getBSAssignmentOrTernaryExpressionAccess().getAssignmentOperatorGreaterThanSignGreaterThanSignEqualsSignKeyword_1_0_1_0_8());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getBSAssignmentOrTernaryExpressionRule());
                              	        }
                                     		setWithLastConsumed(current, "assignmentOperator", lv_assignmentOperator_2_9, null);
                              	    
                            }

                            }
                            break;
                        case 10 :
                            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2066:8: lv_assignmentOperator_2_10= AmpersandEqualsSign
                            {
                            lv_assignmentOperator_2_10=(Token)match(input,AmpersandEqualsSign,FOLLOW_AmpersandEqualsSign_in_ruleBSAssignmentOrTernaryExpression4445); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_assignmentOperator_2_10, grammarAccess.getBSAssignmentOrTernaryExpressionAccess().getAssignmentOperatorAmpersandEqualsSignKeyword_1_0_1_0_9());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getBSAssignmentOrTernaryExpressionRule());
                              	        }
                                     		setWithLastConsumed(current, "assignmentOperator", lv_assignmentOperator_2_10, null);
                              	    
                            }

                            }
                            break;
                        case 11 :
                            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2079:8: lv_assignmentOperator_2_11= CircumflexAccentEqualsSign
                            {
                            lv_assignmentOperator_2_11=(Token)match(input,CircumflexAccentEqualsSign,FOLLOW_CircumflexAccentEqualsSign_in_ruleBSAssignmentOrTernaryExpression4473); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_assignmentOperator_2_11, grammarAccess.getBSAssignmentOrTernaryExpressionAccess().getAssignmentOperatorCircumflexAccentEqualsSignKeyword_1_0_1_0_10());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getBSAssignmentOrTernaryExpressionRule());
                              	        }
                                     		setWithLastConsumed(current, "assignmentOperator", lv_assignmentOperator_2_11, null);
                              	    
                            }

                            }
                            break;
                        case 12 :
                            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2092:8: lv_assignmentOperator_2_12= VerticalLineEqualsSign
                            {
                            lv_assignmentOperator_2_12=(Token)match(input,VerticalLineEqualsSign,FOLLOW_VerticalLineEqualsSign_in_ruleBSAssignmentOrTernaryExpression4501); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_assignmentOperator_2_12, grammarAccess.getBSAssignmentOrTernaryExpressionAccess().getAssignmentOperatorVerticalLineEqualsSignKeyword_1_0_1_0_11());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getBSAssignmentOrTernaryExpressionRule());
                              	        }
                                     		setWithLastConsumed(current, "assignmentOperator", lv_assignmentOperator_2_12, null);
                              	    
                            }

                            }
                            break;

                    }


                    }


                    }

                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2108:2: ( (lv_right_3_0= ruleBSExpression ) )
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2109:1: (lv_right_3_0= ruleBSExpression )
                    {
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2109:1: (lv_right_3_0= ruleBSExpression )
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2110:3: lv_right_3_0= ruleBSExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getBSAssignmentOrTernaryExpressionAccess().getRightBSExpressionParserRuleCall_1_0_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBSExpression_in_ruleBSAssignmentOrTernaryExpression4536);
                    lv_right_3_0=ruleBSExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getBSAssignmentOrTernaryExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"right",
                              		lv_right_3_0, 
                              		"BSExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2127:6: ( () otherlv_5= QuestionMark ( (lv_middle_6_0= ruleBSExpression ) ) otherlv_7= Colon ( (lv_right_8_0= ruleBSExpression ) ) )
                    {
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2127:6: ( () otherlv_5= QuestionMark ( (lv_middle_6_0= ruleBSExpression ) ) otherlv_7= Colon ( (lv_right_8_0= ruleBSExpression ) ) )
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2127:7: () otherlv_5= QuestionMark ( (lv_middle_6_0= ruleBSExpression ) ) otherlv_7= Colon ( (lv_right_8_0= ruleBSExpression ) )
                    {
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2127:7: ()
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2128:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getBSAssignmentOrTernaryExpressionAccess().getBSTernaryExpressionLeftAction_1_1_0(),
                                  current);
                          
                    }

                    }

                    otherlv_5=(Token)match(input,QuestionMark,FOLLOW_QuestionMark_in_ruleBSAssignmentOrTernaryExpression4566); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getBSAssignmentOrTernaryExpressionAccess().getQuestionMarkKeyword_1_1_1());
                          
                    }
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2138:1: ( (lv_middle_6_0= ruleBSExpression ) )
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2139:1: (lv_middle_6_0= ruleBSExpression )
                    {
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2139:1: (lv_middle_6_0= ruleBSExpression )
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2140:3: lv_middle_6_0= ruleBSExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getBSAssignmentOrTernaryExpressionAccess().getMiddleBSExpressionParserRuleCall_1_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBSExpression_in_ruleBSAssignmentOrTernaryExpression4586);
                    lv_middle_6_0=ruleBSExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getBSAssignmentOrTernaryExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"middle",
                              		lv_middle_6_0, 
                              		"BSExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_7=(Token)match(input,Colon,FOLLOW_Colon_in_ruleBSAssignmentOrTernaryExpression4599); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getBSAssignmentOrTernaryExpressionAccess().getColonKeyword_1_1_3());
                          
                    }
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2161:1: ( (lv_right_8_0= ruleBSExpression ) )
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2162:1: (lv_right_8_0= ruleBSExpression )
                    {
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2162:1: (lv_right_8_0= ruleBSExpression )
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2163:3: lv_right_8_0= ruleBSExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getBSAssignmentOrTernaryExpressionAccess().getRightBSExpressionParserRuleCall_1_1_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBSExpression_in_ruleBSAssignmentOrTernaryExpression4619);
                    lv_right_8_0=ruleBSExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getBSAssignmentOrTernaryExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"right",
                              		lv_right_8_0, 
                              		"BSExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

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
    // $ANTLR end "ruleBSAssignmentOrTernaryExpression"


    // $ANTLR start "entryRuleBSBooleanOrExpression"
    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2187:1: entryRuleBSBooleanOrExpression returns [EObject current=null] : iv_ruleBSBooleanOrExpression= ruleBSBooleanOrExpression EOF ;
    public final EObject entryRuleBSBooleanOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBSBooleanOrExpression = null;


        try {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2188:2: (iv_ruleBSBooleanOrExpression= ruleBSBooleanOrExpression EOF )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2189:2: iv_ruleBSBooleanOrExpression= ruleBSBooleanOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBSBooleanOrExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleBSBooleanOrExpression_in_entryRuleBSBooleanOrExpression4657);
            iv_ruleBSBooleanOrExpression=ruleBSBooleanOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBSBooleanOrExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBSBooleanOrExpression4667); if (state.failed) return current;

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
    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2196:1: ruleBSBooleanOrExpression returns [EObject current=null] : (this_BSBooleanAndExpression_0= ruleBSBooleanAndExpression ( () otherlv_2= VerticalLineVerticalLine ( (lv_right_3_0= ruleBSBooleanAndExpression ) ) )* ) ;
    public final EObject ruleBSBooleanOrExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_BSBooleanAndExpression_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2199:28: ( (this_BSBooleanAndExpression_0= ruleBSBooleanAndExpression ( () otherlv_2= VerticalLineVerticalLine ( (lv_right_3_0= ruleBSBooleanAndExpression ) ) )* ) )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2200:1: (this_BSBooleanAndExpression_0= ruleBSBooleanAndExpression ( () otherlv_2= VerticalLineVerticalLine ( (lv_right_3_0= ruleBSBooleanAndExpression ) ) )* )
            {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2200:1: (this_BSBooleanAndExpression_0= ruleBSBooleanAndExpression ( () otherlv_2= VerticalLineVerticalLine ( (lv_right_3_0= ruleBSBooleanAndExpression ) ) )* )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2201:5: this_BSBooleanAndExpression_0= ruleBSBooleanAndExpression ( () otherlv_2= VerticalLineVerticalLine ( (lv_right_3_0= ruleBSBooleanAndExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getBSBooleanOrExpressionAccess().getBSBooleanAndExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleBSBooleanAndExpression_in_ruleBSBooleanOrExpression4714);
            this_BSBooleanAndExpression_0=ruleBSBooleanAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = this_BSBooleanAndExpression_0;
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2209:1: ( () otherlv_2= VerticalLineVerticalLine ( (lv_right_3_0= ruleBSBooleanAndExpression ) ) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==VerticalLineVerticalLine) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2209:2: () otherlv_2= VerticalLineVerticalLine ( (lv_right_3_0= ruleBSBooleanAndExpression ) )
            	    {
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2209:2: ()
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2210:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getBSBooleanOrExpressionAccess().getBSBooleanOrExpressionLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,VerticalLineVerticalLine,FOLLOW_VerticalLineVerticalLine_in_ruleBSBooleanOrExpression4736); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getBSBooleanOrExpressionAccess().getVerticalLineVerticalLineKeyword_1_1());
            	          
            	    }
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2220:1: ( (lv_right_3_0= ruleBSBooleanAndExpression ) )
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2221:1: (lv_right_3_0= ruleBSBooleanAndExpression )
            	    {
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2221:1: (lv_right_3_0= ruleBSBooleanAndExpression )
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2222:3: lv_right_3_0= ruleBSBooleanAndExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getBSBooleanOrExpressionAccess().getRightBSBooleanAndExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleBSBooleanAndExpression_in_ruleBSBooleanOrExpression4756);
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
            	    break loop33;
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
    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2246:1: entryRuleBSBooleanAndExpression returns [EObject current=null] : iv_ruleBSBooleanAndExpression= ruleBSBooleanAndExpression EOF ;
    public final EObject entryRuleBSBooleanAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBSBooleanAndExpression = null;


        try {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2247:2: (iv_ruleBSBooleanAndExpression= ruleBSBooleanAndExpression EOF )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2248:2: iv_ruleBSBooleanAndExpression= ruleBSBooleanAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBSBooleanAndExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleBSBooleanAndExpression_in_entryRuleBSBooleanAndExpression4793);
            iv_ruleBSBooleanAndExpression=ruleBSBooleanAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBSBooleanAndExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBSBooleanAndExpression4803); if (state.failed) return current;

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
    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2255:1: ruleBSBooleanAndExpression returns [EObject current=null] : (this_BSBitwiseOrExpression_0= ruleBSBitwiseOrExpression ( () otherlv_2= AmpersandAmpersand ( (lv_right_3_0= ruleBSBitwiseOrExpression ) ) )* ) ;
    public final EObject ruleBSBooleanAndExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_BSBitwiseOrExpression_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2258:28: ( (this_BSBitwiseOrExpression_0= ruleBSBitwiseOrExpression ( () otherlv_2= AmpersandAmpersand ( (lv_right_3_0= ruleBSBitwiseOrExpression ) ) )* ) )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2259:1: (this_BSBitwiseOrExpression_0= ruleBSBitwiseOrExpression ( () otherlv_2= AmpersandAmpersand ( (lv_right_3_0= ruleBSBitwiseOrExpression ) ) )* )
            {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2259:1: (this_BSBitwiseOrExpression_0= ruleBSBitwiseOrExpression ( () otherlv_2= AmpersandAmpersand ( (lv_right_3_0= ruleBSBitwiseOrExpression ) ) )* )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2260:5: this_BSBitwiseOrExpression_0= ruleBSBitwiseOrExpression ( () otherlv_2= AmpersandAmpersand ( (lv_right_3_0= ruleBSBitwiseOrExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getBSBooleanAndExpressionAccess().getBSBitwiseOrExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleBSBitwiseOrExpression_in_ruleBSBooleanAndExpression4850);
            this_BSBitwiseOrExpression_0=ruleBSBitwiseOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = this_BSBitwiseOrExpression_0;
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2268:1: ( () otherlv_2= AmpersandAmpersand ( (lv_right_3_0= ruleBSBitwiseOrExpression ) ) )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==AmpersandAmpersand) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2268:2: () otherlv_2= AmpersandAmpersand ( (lv_right_3_0= ruleBSBitwiseOrExpression ) )
            	    {
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2268:2: ()
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2269:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getBSBooleanAndExpressionAccess().getBSBooleanAndExpressionLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,AmpersandAmpersand,FOLLOW_AmpersandAmpersand_in_ruleBSBooleanAndExpression4872); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getBSBooleanAndExpressionAccess().getAmpersandAmpersandKeyword_1_1());
            	          
            	    }
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2279:1: ( (lv_right_3_0= ruleBSBitwiseOrExpression ) )
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2280:1: (lv_right_3_0= ruleBSBitwiseOrExpression )
            	    {
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2280:1: (lv_right_3_0= ruleBSBitwiseOrExpression )
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2281:3: lv_right_3_0= ruleBSBitwiseOrExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getBSBooleanAndExpressionAccess().getRightBSBitwiseOrExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleBSBitwiseOrExpression_in_ruleBSBooleanAndExpression4892);
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
    // $ANTLR end "ruleBSBooleanAndExpression"


    // $ANTLR start "entryRuleBSBitwiseOrExpression"
    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2305:1: entryRuleBSBitwiseOrExpression returns [EObject current=null] : iv_ruleBSBitwiseOrExpression= ruleBSBitwiseOrExpression EOF ;
    public final EObject entryRuleBSBitwiseOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBSBitwiseOrExpression = null;


        try {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2306:2: (iv_ruleBSBitwiseOrExpression= ruleBSBitwiseOrExpression EOF )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2307:2: iv_ruleBSBitwiseOrExpression= ruleBSBitwiseOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBSBitwiseOrExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleBSBitwiseOrExpression_in_entryRuleBSBitwiseOrExpression4929);
            iv_ruleBSBitwiseOrExpression=ruleBSBitwiseOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBSBitwiseOrExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBSBitwiseOrExpression4939); if (state.failed) return current;

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
    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2314:1: ruleBSBitwiseOrExpression returns [EObject current=null] : (this_BSBitwiseXorExpression_0= ruleBSBitwiseXorExpression ( () otherlv_2= VerticalLine ( (lv_right_3_0= ruleBSBitwiseXorExpression ) ) )* ) ;
    public final EObject ruleBSBitwiseOrExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_BSBitwiseXorExpression_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2317:28: ( (this_BSBitwiseXorExpression_0= ruleBSBitwiseXorExpression ( () otherlv_2= VerticalLine ( (lv_right_3_0= ruleBSBitwiseXorExpression ) ) )* ) )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2318:1: (this_BSBitwiseXorExpression_0= ruleBSBitwiseXorExpression ( () otherlv_2= VerticalLine ( (lv_right_3_0= ruleBSBitwiseXorExpression ) ) )* )
            {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2318:1: (this_BSBitwiseXorExpression_0= ruleBSBitwiseXorExpression ( () otherlv_2= VerticalLine ( (lv_right_3_0= ruleBSBitwiseXorExpression ) ) )* )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2319:5: this_BSBitwiseXorExpression_0= ruleBSBitwiseXorExpression ( () otherlv_2= VerticalLine ( (lv_right_3_0= ruleBSBitwiseXorExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getBSBitwiseOrExpressionAccess().getBSBitwiseXorExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleBSBitwiseXorExpression_in_ruleBSBitwiseOrExpression4986);
            this_BSBitwiseXorExpression_0=ruleBSBitwiseXorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = this_BSBitwiseXorExpression_0;
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2327:1: ( () otherlv_2= VerticalLine ( (lv_right_3_0= ruleBSBitwiseXorExpression ) ) )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==VerticalLine) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2327:2: () otherlv_2= VerticalLine ( (lv_right_3_0= ruleBSBitwiseXorExpression ) )
            	    {
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2327:2: ()
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2328:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getBSBitwiseOrExpressionAccess().getBSBitwiseOrExpressionLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,VerticalLine,FOLLOW_VerticalLine_in_ruleBSBitwiseOrExpression5008); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getBSBitwiseOrExpressionAccess().getVerticalLineKeyword_1_1());
            	          
            	    }
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2338:1: ( (lv_right_3_0= ruleBSBitwiseXorExpression ) )
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2339:1: (lv_right_3_0= ruleBSBitwiseXorExpression )
            	    {
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2339:1: (lv_right_3_0= ruleBSBitwiseXorExpression )
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2340:3: lv_right_3_0= ruleBSBitwiseXorExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getBSBitwiseOrExpressionAccess().getRightBSBitwiseXorExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleBSBitwiseXorExpression_in_ruleBSBitwiseOrExpression5028);
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
            	    break loop35;
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
    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2364:1: entryRuleBSBitwiseXorExpression returns [EObject current=null] : iv_ruleBSBitwiseXorExpression= ruleBSBitwiseXorExpression EOF ;
    public final EObject entryRuleBSBitwiseXorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBSBitwiseXorExpression = null;


        try {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2365:2: (iv_ruleBSBitwiseXorExpression= ruleBSBitwiseXorExpression EOF )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2366:2: iv_ruleBSBitwiseXorExpression= ruleBSBitwiseXorExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBSBitwiseXorExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleBSBitwiseXorExpression_in_entryRuleBSBitwiseXorExpression5065);
            iv_ruleBSBitwiseXorExpression=ruleBSBitwiseXorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBSBitwiseXorExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBSBitwiseXorExpression5075); if (state.failed) return current;

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
    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2373:1: ruleBSBitwiseXorExpression returns [EObject current=null] : (this_BSBitwiseAndExpression_0= ruleBSBitwiseAndExpression ( () otherlv_2= CircumflexAccent ( (lv_right_3_0= ruleBSBitwiseAndExpression ) ) )* ) ;
    public final EObject ruleBSBitwiseXorExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_BSBitwiseAndExpression_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2376:28: ( (this_BSBitwiseAndExpression_0= ruleBSBitwiseAndExpression ( () otherlv_2= CircumflexAccent ( (lv_right_3_0= ruleBSBitwiseAndExpression ) ) )* ) )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2377:1: (this_BSBitwiseAndExpression_0= ruleBSBitwiseAndExpression ( () otherlv_2= CircumflexAccent ( (lv_right_3_0= ruleBSBitwiseAndExpression ) ) )* )
            {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2377:1: (this_BSBitwiseAndExpression_0= ruleBSBitwiseAndExpression ( () otherlv_2= CircumflexAccent ( (lv_right_3_0= ruleBSBitwiseAndExpression ) ) )* )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2378:5: this_BSBitwiseAndExpression_0= ruleBSBitwiseAndExpression ( () otherlv_2= CircumflexAccent ( (lv_right_3_0= ruleBSBitwiseAndExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getBSBitwiseXorExpressionAccess().getBSBitwiseAndExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleBSBitwiseAndExpression_in_ruleBSBitwiseXorExpression5122);
            this_BSBitwiseAndExpression_0=ruleBSBitwiseAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = this_BSBitwiseAndExpression_0;
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2386:1: ( () otherlv_2= CircumflexAccent ( (lv_right_3_0= ruleBSBitwiseAndExpression ) ) )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==CircumflexAccent) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2386:2: () otherlv_2= CircumflexAccent ( (lv_right_3_0= ruleBSBitwiseAndExpression ) )
            	    {
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2386:2: ()
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2387:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getBSBitwiseXorExpressionAccess().getBSBitwiseXorExpressionLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,CircumflexAccent,FOLLOW_CircumflexAccent_in_ruleBSBitwiseXorExpression5144); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getBSBitwiseXorExpressionAccess().getCircumflexAccentKeyword_1_1());
            	          
            	    }
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2397:1: ( (lv_right_3_0= ruleBSBitwiseAndExpression ) )
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2398:1: (lv_right_3_0= ruleBSBitwiseAndExpression )
            	    {
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2398:1: (lv_right_3_0= ruleBSBitwiseAndExpression )
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2399:3: lv_right_3_0= ruleBSBitwiseAndExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getBSBitwiseXorExpressionAccess().getRightBSBitwiseAndExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleBSBitwiseAndExpression_in_ruleBSBitwiseXorExpression5164);
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
    // $ANTLR end "ruleBSBitwiseXorExpression"


    // $ANTLR start "entryRuleBSBitwiseAndExpression"
    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2423:1: entryRuleBSBitwiseAndExpression returns [EObject current=null] : iv_ruleBSBitwiseAndExpression= ruleBSBitwiseAndExpression EOF ;
    public final EObject entryRuleBSBitwiseAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBSBitwiseAndExpression = null;


        try {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2424:2: (iv_ruleBSBitwiseAndExpression= ruleBSBitwiseAndExpression EOF )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2425:2: iv_ruleBSBitwiseAndExpression= ruleBSBitwiseAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBSBitwiseAndExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleBSBitwiseAndExpression_in_entryRuleBSBitwiseAndExpression5201);
            iv_ruleBSBitwiseAndExpression=ruleBSBitwiseAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBSBitwiseAndExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBSBitwiseAndExpression5211); if (state.failed) return current;

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
    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2432:1: ruleBSBitwiseAndExpression returns [EObject current=null] : (this_BSEqualityExpression_0= ruleBSEqualityExpression ( () otherlv_2= Ampersand ( (lv_right_3_0= ruleBSEqualityExpression ) ) )* ) ;
    public final EObject ruleBSBitwiseAndExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_BSEqualityExpression_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2435:28: ( (this_BSEqualityExpression_0= ruleBSEqualityExpression ( () otherlv_2= Ampersand ( (lv_right_3_0= ruleBSEqualityExpression ) ) )* ) )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2436:1: (this_BSEqualityExpression_0= ruleBSEqualityExpression ( () otherlv_2= Ampersand ( (lv_right_3_0= ruleBSEqualityExpression ) ) )* )
            {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2436:1: (this_BSEqualityExpression_0= ruleBSEqualityExpression ( () otherlv_2= Ampersand ( (lv_right_3_0= ruleBSEqualityExpression ) ) )* )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2437:5: this_BSEqualityExpression_0= ruleBSEqualityExpression ( () otherlv_2= Ampersand ( (lv_right_3_0= ruleBSEqualityExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getBSBitwiseAndExpressionAccess().getBSEqualityExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleBSEqualityExpression_in_ruleBSBitwiseAndExpression5258);
            this_BSEqualityExpression_0=ruleBSEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = this_BSEqualityExpression_0;
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2445:1: ( () otherlv_2= Ampersand ( (lv_right_3_0= ruleBSEqualityExpression ) ) )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==Ampersand) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2445:2: () otherlv_2= Ampersand ( (lv_right_3_0= ruleBSEqualityExpression ) )
            	    {
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2445:2: ()
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2446:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getBSBitwiseAndExpressionAccess().getBSBitwiseAndExpressionLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,Ampersand,FOLLOW_Ampersand_in_ruleBSBitwiseAndExpression5280); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getBSBitwiseAndExpressionAccess().getAmpersandKeyword_1_1());
            	          
            	    }
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2456:1: ( (lv_right_3_0= ruleBSEqualityExpression ) )
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2457:1: (lv_right_3_0= ruleBSEqualityExpression )
            	    {
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2457:1: (lv_right_3_0= ruleBSEqualityExpression )
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2458:3: lv_right_3_0= ruleBSEqualityExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getBSBitwiseAndExpressionAccess().getRightBSEqualityExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleBSEqualityExpression_in_ruleBSBitwiseAndExpression5300);
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
            	    break loop37;
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
    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2482:1: entryRuleBSEqualityExpression returns [EObject current=null] : iv_ruleBSEqualityExpression= ruleBSEqualityExpression EOF ;
    public final EObject entryRuleBSEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBSEqualityExpression = null;


        try {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2483:2: (iv_ruleBSEqualityExpression= ruleBSEqualityExpression EOF )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2484:2: iv_ruleBSEqualityExpression= ruleBSEqualityExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBSEqualityExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleBSEqualityExpression_in_entryRuleBSEqualityExpression5337);
            iv_ruleBSEqualityExpression=ruleBSEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBSEqualityExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBSEqualityExpression5347); if (state.failed) return current;

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
    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2491:1: ruleBSEqualityExpression returns [EObject current=null] : (this_BSOrderedRelationExpression_0= ruleBSOrderedRelationExpression ( () ( ( (lv_operator_2_1= EqualsSignEqualsSign | lv_operator_2_2= ExclamationMarkEqualsSign ) ) ) ( (lv_right_3_0= ruleBSOrderedRelationExpression ) ) )* ) ;
    public final EObject ruleBSEqualityExpression() throws RecognitionException {
        EObject current = null;

        Token lv_operator_2_1=null;
        Token lv_operator_2_2=null;
        EObject this_BSOrderedRelationExpression_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2494:28: ( (this_BSOrderedRelationExpression_0= ruleBSOrderedRelationExpression ( () ( ( (lv_operator_2_1= EqualsSignEqualsSign | lv_operator_2_2= ExclamationMarkEqualsSign ) ) ) ( (lv_right_3_0= ruleBSOrderedRelationExpression ) ) )* ) )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2495:1: (this_BSOrderedRelationExpression_0= ruleBSOrderedRelationExpression ( () ( ( (lv_operator_2_1= EqualsSignEqualsSign | lv_operator_2_2= ExclamationMarkEqualsSign ) ) ) ( (lv_right_3_0= ruleBSOrderedRelationExpression ) ) )* )
            {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2495:1: (this_BSOrderedRelationExpression_0= ruleBSOrderedRelationExpression ( () ( ( (lv_operator_2_1= EqualsSignEqualsSign | lv_operator_2_2= ExclamationMarkEqualsSign ) ) ) ( (lv_right_3_0= ruleBSOrderedRelationExpression ) ) )* )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2496:5: this_BSOrderedRelationExpression_0= ruleBSOrderedRelationExpression ( () ( ( (lv_operator_2_1= EqualsSignEqualsSign | lv_operator_2_2= ExclamationMarkEqualsSign ) ) ) ( (lv_right_3_0= ruleBSOrderedRelationExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getBSEqualityExpressionAccess().getBSOrderedRelationExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleBSOrderedRelationExpression_in_ruleBSEqualityExpression5394);
            this_BSOrderedRelationExpression_0=ruleBSOrderedRelationExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = this_BSOrderedRelationExpression_0;
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2504:1: ( () ( ( (lv_operator_2_1= EqualsSignEqualsSign | lv_operator_2_2= ExclamationMarkEqualsSign ) ) ) ( (lv_right_3_0= ruleBSOrderedRelationExpression ) ) )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==ExclamationMarkEqualsSign||LA39_0==EqualsSignEqualsSign) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2504:2: () ( ( (lv_operator_2_1= EqualsSignEqualsSign | lv_operator_2_2= ExclamationMarkEqualsSign ) ) ) ( (lv_right_3_0= ruleBSOrderedRelationExpression ) )
            	    {
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2504:2: ()
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2505:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getBSEqualityExpressionAccess().getBSEqualityExpressionLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2510:2: ( ( (lv_operator_2_1= EqualsSignEqualsSign | lv_operator_2_2= ExclamationMarkEqualsSign ) ) )
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2511:1: ( (lv_operator_2_1= EqualsSignEqualsSign | lv_operator_2_2= ExclamationMarkEqualsSign ) )
            	    {
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2511:1: ( (lv_operator_2_1= EqualsSignEqualsSign | lv_operator_2_2= ExclamationMarkEqualsSign ) )
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2512:1: (lv_operator_2_1= EqualsSignEqualsSign | lv_operator_2_2= ExclamationMarkEqualsSign )
            	    {
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2512:1: (lv_operator_2_1= EqualsSignEqualsSign | lv_operator_2_2= ExclamationMarkEqualsSign )
            	    int alt38=2;
            	    int LA38_0 = input.LA(1);

            	    if ( (LA38_0==EqualsSignEqualsSign) ) {
            	        alt38=1;
            	    }
            	    else if ( (LA38_0==ExclamationMarkEqualsSign) ) {
            	        alt38=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 38, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt38) {
            	        case 1 :
            	            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2513:3: lv_operator_2_1= EqualsSignEqualsSign
            	            {
            	            lv_operator_2_1=(Token)match(input,EqualsSignEqualsSign,FOLLOW_EqualsSignEqualsSign_in_ruleBSEqualityExpression5424); if (state.failed) return current;
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
            	            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2526:8: lv_operator_2_2= ExclamationMarkEqualsSign
            	            {
            	            lv_operator_2_2=(Token)match(input,ExclamationMarkEqualsSign,FOLLOW_ExclamationMarkEqualsSign_in_ruleBSEqualityExpression5452); if (state.failed) return current;
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

            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2542:2: ( (lv_right_3_0= ruleBSOrderedRelationExpression ) )
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2543:1: (lv_right_3_0= ruleBSOrderedRelationExpression )
            	    {
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2543:1: (lv_right_3_0= ruleBSOrderedRelationExpression )
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2544:3: lv_right_3_0= ruleBSOrderedRelationExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getBSEqualityExpressionAccess().getRightBSOrderedRelationExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleBSOrderedRelationExpression_in_ruleBSEqualityExpression5487);
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
            	    break loop39;
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
    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2568:1: entryRuleBSOrderedRelationExpression returns [EObject current=null] : iv_ruleBSOrderedRelationExpression= ruleBSOrderedRelationExpression EOF ;
    public final EObject entryRuleBSOrderedRelationExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBSOrderedRelationExpression = null;


        try {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2569:2: (iv_ruleBSOrderedRelationExpression= ruleBSOrderedRelationExpression EOF )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2570:2: iv_ruleBSOrderedRelationExpression= ruleBSOrderedRelationExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBSOrderedRelationExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleBSOrderedRelationExpression_in_entryRuleBSOrderedRelationExpression5524);
            iv_ruleBSOrderedRelationExpression=ruleBSOrderedRelationExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBSOrderedRelationExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBSOrderedRelationExpression5534); if (state.failed) return current;

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
    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2577:1: ruleBSOrderedRelationExpression returns [EObject current=null] : (this_BSBitwiseShiftExpression_0= ruleBSBitwiseShiftExpression ( () ( ( (lv_operator_2_1= LessThanSign | lv_operator_2_2= GreaterThanSign | lv_operator_2_3= LessThanSignEqualsSign | lv_operator_2_4= GreaterThanSignEqualsSign ) ) ) ( (lv_right_3_0= ruleBSBitwiseShiftExpression ) ) )* ) ;
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
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2580:28: ( (this_BSBitwiseShiftExpression_0= ruleBSBitwiseShiftExpression ( () ( ( (lv_operator_2_1= LessThanSign | lv_operator_2_2= GreaterThanSign | lv_operator_2_3= LessThanSignEqualsSign | lv_operator_2_4= GreaterThanSignEqualsSign ) ) ) ( (lv_right_3_0= ruleBSBitwiseShiftExpression ) ) )* ) )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2581:1: (this_BSBitwiseShiftExpression_0= ruleBSBitwiseShiftExpression ( () ( ( (lv_operator_2_1= LessThanSign | lv_operator_2_2= GreaterThanSign | lv_operator_2_3= LessThanSignEqualsSign | lv_operator_2_4= GreaterThanSignEqualsSign ) ) ) ( (lv_right_3_0= ruleBSBitwiseShiftExpression ) ) )* )
            {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2581:1: (this_BSBitwiseShiftExpression_0= ruleBSBitwiseShiftExpression ( () ( ( (lv_operator_2_1= LessThanSign | lv_operator_2_2= GreaterThanSign | lv_operator_2_3= LessThanSignEqualsSign | lv_operator_2_4= GreaterThanSignEqualsSign ) ) ) ( (lv_right_3_0= ruleBSBitwiseShiftExpression ) ) )* )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2582:5: this_BSBitwiseShiftExpression_0= ruleBSBitwiseShiftExpression ( () ( ( (lv_operator_2_1= LessThanSign | lv_operator_2_2= GreaterThanSign | lv_operator_2_3= LessThanSignEqualsSign | lv_operator_2_4= GreaterThanSignEqualsSign ) ) ) ( (lv_right_3_0= ruleBSBitwiseShiftExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getBSOrderedRelationExpressionAccess().getBSBitwiseShiftExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleBSBitwiseShiftExpression_in_ruleBSOrderedRelationExpression5581);
            this_BSBitwiseShiftExpression_0=ruleBSBitwiseShiftExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = this_BSBitwiseShiftExpression_0;
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2590:1: ( () ( ( (lv_operator_2_1= LessThanSign | lv_operator_2_2= GreaterThanSign | lv_operator_2_3= LessThanSignEqualsSign | lv_operator_2_4= GreaterThanSignEqualsSign ) ) ) ( (lv_right_3_0= ruleBSBitwiseShiftExpression ) ) )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==LessThanSignEqualsSign||LA41_0==GreaterThanSignEqualsSign||LA41_0==LessThanSign||LA41_0==GreaterThanSign) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2590:2: () ( ( (lv_operator_2_1= LessThanSign | lv_operator_2_2= GreaterThanSign | lv_operator_2_3= LessThanSignEqualsSign | lv_operator_2_4= GreaterThanSignEqualsSign ) ) ) ( (lv_right_3_0= ruleBSBitwiseShiftExpression ) )
            	    {
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2590:2: ()
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2591:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getBSOrderedRelationExpressionAccess().getBSOrderedRelationExpressionLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2596:2: ( ( (lv_operator_2_1= LessThanSign | lv_operator_2_2= GreaterThanSign | lv_operator_2_3= LessThanSignEqualsSign | lv_operator_2_4= GreaterThanSignEqualsSign ) ) )
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2597:1: ( (lv_operator_2_1= LessThanSign | lv_operator_2_2= GreaterThanSign | lv_operator_2_3= LessThanSignEqualsSign | lv_operator_2_4= GreaterThanSignEqualsSign ) )
            	    {
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2597:1: ( (lv_operator_2_1= LessThanSign | lv_operator_2_2= GreaterThanSign | lv_operator_2_3= LessThanSignEqualsSign | lv_operator_2_4= GreaterThanSignEqualsSign ) )
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2598:1: (lv_operator_2_1= LessThanSign | lv_operator_2_2= GreaterThanSign | lv_operator_2_3= LessThanSignEqualsSign | lv_operator_2_4= GreaterThanSignEqualsSign )
            	    {
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2598:1: (lv_operator_2_1= LessThanSign | lv_operator_2_2= GreaterThanSign | lv_operator_2_3= LessThanSignEqualsSign | lv_operator_2_4= GreaterThanSignEqualsSign )
            	    int alt40=4;
            	    switch ( input.LA(1) ) {
            	    case LessThanSign:
            	        {
            	        alt40=1;
            	        }
            	        break;
            	    case GreaterThanSign:
            	        {
            	        alt40=2;
            	        }
            	        break;
            	    case LessThanSignEqualsSign:
            	        {
            	        alt40=3;
            	        }
            	        break;
            	    case GreaterThanSignEqualsSign:
            	        {
            	        alt40=4;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 40, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt40) {
            	        case 1 :
            	            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2599:3: lv_operator_2_1= LessThanSign
            	            {
            	            lv_operator_2_1=(Token)match(input,LessThanSign,FOLLOW_LessThanSign_in_ruleBSOrderedRelationExpression5611); if (state.failed) return current;
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
            	            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2612:8: lv_operator_2_2= GreaterThanSign
            	            {
            	            lv_operator_2_2=(Token)match(input,GreaterThanSign,FOLLOW_GreaterThanSign_in_ruleBSOrderedRelationExpression5639); if (state.failed) return current;
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
            	            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2625:8: lv_operator_2_3= LessThanSignEqualsSign
            	            {
            	            lv_operator_2_3=(Token)match(input,LessThanSignEqualsSign,FOLLOW_LessThanSignEqualsSign_in_ruleBSOrderedRelationExpression5667); if (state.failed) return current;
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
            	            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2638:8: lv_operator_2_4= GreaterThanSignEqualsSign
            	            {
            	            lv_operator_2_4=(Token)match(input,GreaterThanSignEqualsSign,FOLLOW_GreaterThanSignEqualsSign_in_ruleBSOrderedRelationExpression5695); if (state.failed) return current;
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

            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2654:2: ( (lv_right_3_0= ruleBSBitwiseShiftExpression ) )
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2655:1: (lv_right_3_0= ruleBSBitwiseShiftExpression )
            	    {
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2655:1: (lv_right_3_0= ruleBSBitwiseShiftExpression )
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2656:3: lv_right_3_0= ruleBSBitwiseShiftExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getBSOrderedRelationExpressionAccess().getRightBSBitwiseShiftExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleBSBitwiseShiftExpression_in_ruleBSOrderedRelationExpression5730);
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
            	    break loop41;
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
    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2680:1: entryRuleBSBitwiseShiftExpression returns [EObject current=null] : iv_ruleBSBitwiseShiftExpression= ruleBSBitwiseShiftExpression EOF ;
    public final EObject entryRuleBSBitwiseShiftExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBSBitwiseShiftExpression = null;


        try {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2681:2: (iv_ruleBSBitwiseShiftExpression= ruleBSBitwiseShiftExpression EOF )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2682:2: iv_ruleBSBitwiseShiftExpression= ruleBSBitwiseShiftExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBSBitwiseShiftExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleBSBitwiseShiftExpression_in_entryRuleBSBitwiseShiftExpression5767);
            iv_ruleBSBitwiseShiftExpression=ruleBSBitwiseShiftExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBSBitwiseShiftExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBSBitwiseShiftExpression5777); if (state.failed) return current;

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
    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2689:1: ruleBSBitwiseShiftExpression returns [EObject current=null] : (this_BSPlusMinusOrStringConcatExpression_0= ruleBSPlusMinusOrStringConcatExpression ( () ( ( (lv_operator_2_1= LessThanSignLessThanSign | lv_operator_2_2= GreaterThanSignGreaterThanSign ) ) ) ( (lv_right_3_0= ruleBSPlusMinusOrStringConcatExpression ) ) )* ) ;
    public final EObject ruleBSBitwiseShiftExpression() throws RecognitionException {
        EObject current = null;

        Token lv_operator_2_1=null;
        Token lv_operator_2_2=null;
        EObject this_BSPlusMinusOrStringConcatExpression_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2692:28: ( (this_BSPlusMinusOrStringConcatExpression_0= ruleBSPlusMinusOrStringConcatExpression ( () ( ( (lv_operator_2_1= LessThanSignLessThanSign | lv_operator_2_2= GreaterThanSignGreaterThanSign ) ) ) ( (lv_right_3_0= ruleBSPlusMinusOrStringConcatExpression ) ) )* ) )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2693:1: (this_BSPlusMinusOrStringConcatExpression_0= ruleBSPlusMinusOrStringConcatExpression ( () ( ( (lv_operator_2_1= LessThanSignLessThanSign | lv_operator_2_2= GreaterThanSignGreaterThanSign ) ) ) ( (lv_right_3_0= ruleBSPlusMinusOrStringConcatExpression ) ) )* )
            {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2693:1: (this_BSPlusMinusOrStringConcatExpression_0= ruleBSPlusMinusOrStringConcatExpression ( () ( ( (lv_operator_2_1= LessThanSignLessThanSign | lv_operator_2_2= GreaterThanSignGreaterThanSign ) ) ) ( (lv_right_3_0= ruleBSPlusMinusOrStringConcatExpression ) ) )* )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2694:5: this_BSPlusMinusOrStringConcatExpression_0= ruleBSPlusMinusOrStringConcatExpression ( () ( ( (lv_operator_2_1= LessThanSignLessThanSign | lv_operator_2_2= GreaterThanSignGreaterThanSign ) ) ) ( (lv_right_3_0= ruleBSPlusMinusOrStringConcatExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getBSBitwiseShiftExpressionAccess().getBSPlusMinusOrStringConcatExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleBSPlusMinusOrStringConcatExpression_in_ruleBSBitwiseShiftExpression5824);
            this_BSPlusMinusOrStringConcatExpression_0=ruleBSPlusMinusOrStringConcatExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = this_BSPlusMinusOrStringConcatExpression_0;
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2702:1: ( () ( ( (lv_operator_2_1= LessThanSignLessThanSign | lv_operator_2_2= GreaterThanSignGreaterThanSign ) ) ) ( (lv_right_3_0= ruleBSPlusMinusOrStringConcatExpression ) ) )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==LessThanSignLessThanSign||LA43_0==GreaterThanSignGreaterThanSign) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2702:2: () ( ( (lv_operator_2_1= LessThanSignLessThanSign | lv_operator_2_2= GreaterThanSignGreaterThanSign ) ) ) ( (lv_right_3_0= ruleBSPlusMinusOrStringConcatExpression ) )
            	    {
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2702:2: ()
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2703:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getBSBitwiseShiftExpressionAccess().getBSBitwiseShiftExpressionLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2708:2: ( ( (lv_operator_2_1= LessThanSignLessThanSign | lv_operator_2_2= GreaterThanSignGreaterThanSign ) ) )
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2709:1: ( (lv_operator_2_1= LessThanSignLessThanSign | lv_operator_2_2= GreaterThanSignGreaterThanSign ) )
            	    {
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2709:1: ( (lv_operator_2_1= LessThanSignLessThanSign | lv_operator_2_2= GreaterThanSignGreaterThanSign ) )
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2710:1: (lv_operator_2_1= LessThanSignLessThanSign | lv_operator_2_2= GreaterThanSignGreaterThanSign )
            	    {
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2710:1: (lv_operator_2_1= LessThanSignLessThanSign | lv_operator_2_2= GreaterThanSignGreaterThanSign )
            	    int alt42=2;
            	    int LA42_0 = input.LA(1);

            	    if ( (LA42_0==LessThanSignLessThanSign) ) {
            	        alt42=1;
            	    }
            	    else if ( (LA42_0==GreaterThanSignGreaterThanSign) ) {
            	        alt42=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 42, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt42) {
            	        case 1 :
            	            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2711:3: lv_operator_2_1= LessThanSignLessThanSign
            	            {
            	            lv_operator_2_1=(Token)match(input,LessThanSignLessThanSign,FOLLOW_LessThanSignLessThanSign_in_ruleBSBitwiseShiftExpression5854); if (state.failed) return current;
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
            	            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2724:8: lv_operator_2_2= GreaterThanSignGreaterThanSign
            	            {
            	            lv_operator_2_2=(Token)match(input,GreaterThanSignGreaterThanSign,FOLLOW_GreaterThanSignGreaterThanSign_in_ruleBSBitwiseShiftExpression5882); if (state.failed) return current;
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

            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2740:2: ( (lv_right_3_0= ruleBSPlusMinusOrStringConcatExpression ) )
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2741:1: (lv_right_3_0= ruleBSPlusMinusOrStringConcatExpression )
            	    {
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2741:1: (lv_right_3_0= ruleBSPlusMinusOrStringConcatExpression )
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2742:3: lv_right_3_0= ruleBSPlusMinusOrStringConcatExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getBSBitwiseShiftExpressionAccess().getRightBSPlusMinusOrStringConcatExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleBSPlusMinusOrStringConcatExpression_in_ruleBSBitwiseShiftExpression5917);
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
            	    break loop43;
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
    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2766:1: entryRuleBSPlusMinusOrStringConcatExpression returns [EObject current=null] : iv_ruleBSPlusMinusOrStringConcatExpression= ruleBSPlusMinusOrStringConcatExpression EOF ;
    public final EObject entryRuleBSPlusMinusOrStringConcatExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBSPlusMinusOrStringConcatExpression = null;


        try {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2767:2: (iv_ruleBSPlusMinusOrStringConcatExpression= ruleBSPlusMinusOrStringConcatExpression EOF )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2768:2: iv_ruleBSPlusMinusOrStringConcatExpression= ruleBSPlusMinusOrStringConcatExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBSPlusMinusOrStringConcatExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleBSPlusMinusOrStringConcatExpression_in_entryRuleBSPlusMinusOrStringConcatExpression5954);
            iv_ruleBSPlusMinusOrStringConcatExpression=ruleBSPlusMinusOrStringConcatExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBSPlusMinusOrStringConcatExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBSPlusMinusOrStringConcatExpression5964); if (state.failed) return current;

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
    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2775:1: ruleBSPlusMinusOrStringConcatExpression returns [EObject current=null] : (this_BSMulDivOrModExpression_0= ruleBSMulDivOrModExpression ( () ( ( (lv_operator_2_1= PlusSign | lv_operator_2_2= HyphenMinus | lv_operator_2_3= CommercialAt | lv_operator_2_4= SPC | lv_operator_2_5= NL | lv_operator_2_6= TAB ) ) ) ( (lv_right_3_0= ruleBSMulDivOrModExpression ) ) )* ) ;
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
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2778:28: ( (this_BSMulDivOrModExpression_0= ruleBSMulDivOrModExpression ( () ( ( (lv_operator_2_1= PlusSign | lv_operator_2_2= HyphenMinus | lv_operator_2_3= CommercialAt | lv_operator_2_4= SPC | lv_operator_2_5= NL | lv_operator_2_6= TAB ) ) ) ( (lv_right_3_0= ruleBSMulDivOrModExpression ) ) )* ) )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2779:1: (this_BSMulDivOrModExpression_0= ruleBSMulDivOrModExpression ( () ( ( (lv_operator_2_1= PlusSign | lv_operator_2_2= HyphenMinus | lv_operator_2_3= CommercialAt | lv_operator_2_4= SPC | lv_operator_2_5= NL | lv_operator_2_6= TAB ) ) ) ( (lv_right_3_0= ruleBSMulDivOrModExpression ) ) )* )
            {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2779:1: (this_BSMulDivOrModExpression_0= ruleBSMulDivOrModExpression ( () ( ( (lv_operator_2_1= PlusSign | lv_operator_2_2= HyphenMinus | lv_operator_2_3= CommercialAt | lv_operator_2_4= SPC | lv_operator_2_5= NL | lv_operator_2_6= TAB ) ) ) ( (lv_right_3_0= ruleBSMulDivOrModExpression ) ) )* )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2780:5: this_BSMulDivOrModExpression_0= ruleBSMulDivOrModExpression ( () ( ( (lv_operator_2_1= PlusSign | lv_operator_2_2= HyphenMinus | lv_operator_2_3= CommercialAt | lv_operator_2_4= SPC | lv_operator_2_5= NL | lv_operator_2_6= TAB ) ) ) ( (lv_right_3_0= ruleBSMulDivOrModExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getBSPlusMinusOrStringConcatExpressionAccess().getBSMulDivOrModExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleBSMulDivOrModExpression_in_ruleBSPlusMinusOrStringConcatExpression6011);
            this_BSMulDivOrModExpression_0=ruleBSMulDivOrModExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = this_BSMulDivOrModExpression_0;
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2788:1: ( () ( ( (lv_operator_2_1= PlusSign | lv_operator_2_2= HyphenMinus | lv_operator_2_3= CommercialAt | lv_operator_2_4= SPC | lv_operator_2_5= NL | lv_operator_2_6= TAB ) ) ) ( (lv_right_3_0= ruleBSMulDivOrModExpression ) ) )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( ((LA45_0>=SPC && LA45_0<=TAB)||LA45_0==NL||LA45_0==PlusSign||LA45_0==HyphenMinus||LA45_0==CommercialAt) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2788:2: () ( ( (lv_operator_2_1= PlusSign | lv_operator_2_2= HyphenMinus | lv_operator_2_3= CommercialAt | lv_operator_2_4= SPC | lv_operator_2_5= NL | lv_operator_2_6= TAB ) ) ) ( (lv_right_3_0= ruleBSMulDivOrModExpression ) )
            	    {
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2788:2: ()
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2789:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getBSPlusMinusOrStringConcatExpressionAccess().getBSPlusMinusOrStringConcatExpressionLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2794:2: ( ( (lv_operator_2_1= PlusSign | lv_operator_2_2= HyphenMinus | lv_operator_2_3= CommercialAt | lv_operator_2_4= SPC | lv_operator_2_5= NL | lv_operator_2_6= TAB ) ) )
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2795:1: ( (lv_operator_2_1= PlusSign | lv_operator_2_2= HyphenMinus | lv_operator_2_3= CommercialAt | lv_operator_2_4= SPC | lv_operator_2_5= NL | lv_operator_2_6= TAB ) )
            	    {
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2795:1: ( (lv_operator_2_1= PlusSign | lv_operator_2_2= HyphenMinus | lv_operator_2_3= CommercialAt | lv_operator_2_4= SPC | lv_operator_2_5= NL | lv_operator_2_6= TAB ) )
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2796:1: (lv_operator_2_1= PlusSign | lv_operator_2_2= HyphenMinus | lv_operator_2_3= CommercialAt | lv_operator_2_4= SPC | lv_operator_2_5= NL | lv_operator_2_6= TAB )
            	    {
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2796:1: (lv_operator_2_1= PlusSign | lv_operator_2_2= HyphenMinus | lv_operator_2_3= CommercialAt | lv_operator_2_4= SPC | lv_operator_2_5= NL | lv_operator_2_6= TAB )
            	    int alt44=6;
            	    switch ( input.LA(1) ) {
            	    case PlusSign:
            	        {
            	        alt44=1;
            	        }
            	        break;
            	    case HyphenMinus:
            	        {
            	        alt44=2;
            	        }
            	        break;
            	    case CommercialAt:
            	        {
            	        alt44=3;
            	        }
            	        break;
            	    case SPC:
            	        {
            	        alt44=4;
            	        }
            	        break;
            	    case NL:
            	        {
            	        alt44=5;
            	        }
            	        break;
            	    case TAB:
            	        {
            	        alt44=6;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 44, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt44) {
            	        case 1 :
            	            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2797:3: lv_operator_2_1= PlusSign
            	            {
            	            lv_operator_2_1=(Token)match(input,PlusSign,FOLLOW_PlusSign_in_ruleBSPlusMinusOrStringConcatExpression6041); if (state.failed) return current;
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
            	            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2810:8: lv_operator_2_2= HyphenMinus
            	            {
            	            lv_operator_2_2=(Token)match(input,HyphenMinus,FOLLOW_HyphenMinus_in_ruleBSPlusMinusOrStringConcatExpression6069); if (state.failed) return current;
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
            	            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2823:8: lv_operator_2_3= CommercialAt
            	            {
            	            lv_operator_2_3=(Token)match(input,CommercialAt,FOLLOW_CommercialAt_in_ruleBSPlusMinusOrStringConcatExpression6097); if (state.failed) return current;
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
            	            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2836:8: lv_operator_2_4= SPC
            	            {
            	            lv_operator_2_4=(Token)match(input,SPC,FOLLOW_SPC_in_ruleBSPlusMinusOrStringConcatExpression6125); if (state.failed) return current;
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
            	            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2849:8: lv_operator_2_5= NL
            	            {
            	            lv_operator_2_5=(Token)match(input,NL,FOLLOW_NL_in_ruleBSPlusMinusOrStringConcatExpression6153); if (state.failed) return current;
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
            	            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2862:8: lv_operator_2_6= TAB
            	            {
            	            lv_operator_2_6=(Token)match(input,TAB,FOLLOW_TAB_in_ruleBSPlusMinusOrStringConcatExpression6181); if (state.failed) return current;
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

            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2878:2: ( (lv_right_3_0= ruleBSMulDivOrModExpression ) )
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2879:1: (lv_right_3_0= ruleBSMulDivOrModExpression )
            	    {
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2879:1: (lv_right_3_0= ruleBSMulDivOrModExpression )
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2880:3: lv_right_3_0= ruleBSMulDivOrModExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getBSPlusMinusOrStringConcatExpressionAccess().getRightBSMulDivOrModExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleBSMulDivOrModExpression_in_ruleBSPlusMinusOrStringConcatExpression6216);
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
            	    break loop45;
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
    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2904:1: entryRuleBSMulDivOrModExpression returns [EObject current=null] : iv_ruleBSMulDivOrModExpression= ruleBSMulDivOrModExpression EOF ;
    public final EObject entryRuleBSMulDivOrModExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBSMulDivOrModExpression = null;


        try {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2905:2: (iv_ruleBSMulDivOrModExpression= ruleBSMulDivOrModExpression EOF )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2906:2: iv_ruleBSMulDivOrModExpression= ruleBSMulDivOrModExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBSMulDivOrModExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleBSMulDivOrModExpression_in_entryRuleBSMulDivOrModExpression6253);
            iv_ruleBSMulDivOrModExpression=ruleBSMulDivOrModExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBSMulDivOrModExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBSMulDivOrModExpression6263); if (state.failed) return current;

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
    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2913:1: ruleBSMulDivOrModExpression returns [EObject current=null] : (this_BSCastOrNewExpression_0= ruleBSCastOrNewExpression ( () ( ( (lv_operator_2_1= Asterisk | lv_operator_2_2= Solidus | lv_operator_2_3= PercentSign ) ) ) ( (lv_right_3_0= ruleBSCastOrNewExpression ) ) )* ) ;
    public final EObject ruleBSMulDivOrModExpression() throws RecognitionException {
        EObject current = null;

        Token lv_operator_2_1=null;
        Token lv_operator_2_2=null;
        Token lv_operator_2_3=null;
        EObject this_BSCastOrNewExpression_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2916:28: ( (this_BSCastOrNewExpression_0= ruleBSCastOrNewExpression ( () ( ( (lv_operator_2_1= Asterisk | lv_operator_2_2= Solidus | lv_operator_2_3= PercentSign ) ) ) ( (lv_right_3_0= ruleBSCastOrNewExpression ) ) )* ) )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2917:1: (this_BSCastOrNewExpression_0= ruleBSCastOrNewExpression ( () ( ( (lv_operator_2_1= Asterisk | lv_operator_2_2= Solidus | lv_operator_2_3= PercentSign ) ) ) ( (lv_right_3_0= ruleBSCastOrNewExpression ) ) )* )
            {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2917:1: (this_BSCastOrNewExpression_0= ruleBSCastOrNewExpression ( () ( ( (lv_operator_2_1= Asterisk | lv_operator_2_2= Solidus | lv_operator_2_3= PercentSign ) ) ) ( (lv_right_3_0= ruleBSCastOrNewExpression ) ) )* )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2918:5: this_BSCastOrNewExpression_0= ruleBSCastOrNewExpression ( () ( ( (lv_operator_2_1= Asterisk | lv_operator_2_2= Solidus | lv_operator_2_3= PercentSign ) ) ) ( (lv_right_3_0= ruleBSCastOrNewExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getBSMulDivOrModExpressionAccess().getBSCastOrNewExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleBSCastOrNewExpression_in_ruleBSMulDivOrModExpression6310);
            this_BSCastOrNewExpression_0=ruleBSCastOrNewExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = this_BSCastOrNewExpression_0;
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2926:1: ( () ( ( (lv_operator_2_1= Asterisk | lv_operator_2_2= Solidus | lv_operator_2_3= PercentSign ) ) ) ( (lv_right_3_0= ruleBSCastOrNewExpression ) ) )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==PercentSign||LA47_0==Asterisk||LA47_0==Solidus) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2926:2: () ( ( (lv_operator_2_1= Asterisk | lv_operator_2_2= Solidus | lv_operator_2_3= PercentSign ) ) ) ( (lv_right_3_0= ruleBSCastOrNewExpression ) )
            	    {
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2926:2: ()
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2927:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getBSMulDivOrModExpressionAccess().getBSMulDivOrModExpressionLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2932:2: ( ( (lv_operator_2_1= Asterisk | lv_operator_2_2= Solidus | lv_operator_2_3= PercentSign ) ) )
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2933:1: ( (lv_operator_2_1= Asterisk | lv_operator_2_2= Solidus | lv_operator_2_3= PercentSign ) )
            	    {
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2933:1: ( (lv_operator_2_1= Asterisk | lv_operator_2_2= Solidus | lv_operator_2_3= PercentSign ) )
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2934:1: (lv_operator_2_1= Asterisk | lv_operator_2_2= Solidus | lv_operator_2_3= PercentSign )
            	    {
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2934:1: (lv_operator_2_1= Asterisk | lv_operator_2_2= Solidus | lv_operator_2_3= PercentSign )
            	    int alt46=3;
            	    switch ( input.LA(1) ) {
            	    case Asterisk:
            	        {
            	        alt46=1;
            	        }
            	        break;
            	    case Solidus:
            	        {
            	        alt46=2;
            	        }
            	        break;
            	    case PercentSign:
            	        {
            	        alt46=3;
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
            	            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2935:3: lv_operator_2_1= Asterisk
            	            {
            	            lv_operator_2_1=(Token)match(input,Asterisk,FOLLOW_Asterisk_in_ruleBSMulDivOrModExpression6340); if (state.failed) return current;
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
            	            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2948:8: lv_operator_2_2= Solidus
            	            {
            	            lv_operator_2_2=(Token)match(input,Solidus,FOLLOW_Solidus_in_ruleBSMulDivOrModExpression6368); if (state.failed) return current;
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
            	            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2961:8: lv_operator_2_3= PercentSign
            	            {
            	            lv_operator_2_3=(Token)match(input,PercentSign,FOLLOW_PercentSign_in_ruleBSMulDivOrModExpression6396); if (state.failed) return current;
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

            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2977:2: ( (lv_right_3_0= ruleBSCastOrNewExpression ) )
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2978:1: (lv_right_3_0= ruleBSCastOrNewExpression )
            	    {
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2978:1: (lv_right_3_0= ruleBSCastOrNewExpression )
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:2979:3: lv_right_3_0= ruleBSCastOrNewExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getBSMulDivOrModExpressionAccess().getRightBSCastOrNewExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleBSCastOrNewExpression_in_ruleBSMulDivOrModExpression6431);
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
            	    break loop47;
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
    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3003:1: entryRuleBSCastOrNewExpression returns [EObject current=null] : iv_ruleBSCastOrNewExpression= ruleBSCastOrNewExpression EOF ;
    public final EObject entryRuleBSCastOrNewExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBSCastOrNewExpression = null;


        try {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3004:2: (iv_ruleBSCastOrNewExpression= ruleBSCastOrNewExpression EOF )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3005:2: iv_ruleBSCastOrNewExpression= ruleBSCastOrNewExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBSCastOrNewExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleBSCastOrNewExpression_in_entryRuleBSCastOrNewExpression6468);
            iv_ruleBSCastOrNewExpression=ruleBSCastOrNewExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBSCastOrNewExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBSCastOrNewExpression6478); if (state.failed) return current;

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
    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3012:1: ruleBSCastOrNewExpression returns [EObject current=null] : (this_BSUnaryModifierExpression_0= ruleBSUnaryModifierExpression | ( () otherlv_2= LeftParenthesis ( (lv_pType_3_0= ruleBSPrimitiveType ) ) ( ( (lv_isArray_4_0= LeftSquareBracket ) ) otherlv_5= RightSquareBracket )? otherlv_6= RightParenthesis ( (lv_castExpr_7_0= ruleBSCastOrNewExpression ) ) ) | ( () otherlv_9= New ( ( ruleQualifiedName ) ) ( ( ( (lv_isArray_11_0= LeftSquareBracket ) ) otherlv_12= RightSquareBracket )? | (otherlv_13= LeftParenthesis ( ( (lv_args_14_0= ruleBSExpression ) ) (otherlv_15= Comma ( (lv_args_16_0= ruleBSExpression ) ) )* )? otherlv_17= RightParenthesis ) ) ) ) ;
    public final EObject ruleBSCastOrNewExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_isArray_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_9=null;
        Token lv_isArray_11_0=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        EObject this_BSUnaryModifierExpression_0 = null;

        Enumerator lv_pType_3_0 = null;

        EObject lv_castExpr_7_0 = null;

        EObject lv_args_14_0 = null;

        EObject lv_args_16_0 = null;


         enterRule(); 
            
        try {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3015:28: ( (this_BSUnaryModifierExpression_0= ruleBSUnaryModifierExpression | ( () otherlv_2= LeftParenthesis ( (lv_pType_3_0= ruleBSPrimitiveType ) ) ( ( (lv_isArray_4_0= LeftSquareBracket ) ) otherlv_5= RightSquareBracket )? otherlv_6= RightParenthesis ( (lv_castExpr_7_0= ruleBSCastOrNewExpression ) ) ) | ( () otherlv_9= New ( ( ruleQualifiedName ) ) ( ( ( (lv_isArray_11_0= LeftSquareBracket ) ) otherlv_12= RightSquareBracket )? | (otherlv_13= LeftParenthesis ( ( (lv_args_14_0= ruleBSExpression ) ) (otherlv_15= Comma ( (lv_args_16_0= ruleBSExpression ) ) )* )? otherlv_17= RightParenthesis ) ) ) ) )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3016:1: (this_BSUnaryModifierExpression_0= ruleBSUnaryModifierExpression | ( () otherlv_2= LeftParenthesis ( (lv_pType_3_0= ruleBSPrimitiveType ) ) ( ( (lv_isArray_4_0= LeftSquareBracket ) ) otherlv_5= RightSquareBracket )? otherlv_6= RightParenthesis ( (lv_castExpr_7_0= ruleBSCastOrNewExpression ) ) ) | ( () otherlv_9= New ( ( ruleQualifiedName ) ) ( ( ( (lv_isArray_11_0= LeftSquareBracket ) ) otherlv_12= RightSquareBracket )? | (otherlv_13= LeftParenthesis ( ( (lv_args_14_0= ruleBSExpression ) ) (otherlv_15= Comma ( (lv_args_16_0= ruleBSExpression ) ) )* )? otherlv_17= RightParenthesis ) ) ) )
            {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3016:1: (this_BSUnaryModifierExpression_0= ruleBSUnaryModifierExpression | ( () otherlv_2= LeftParenthesis ( (lv_pType_3_0= ruleBSPrimitiveType ) ) ( ( (lv_isArray_4_0= LeftSquareBracket ) ) otherlv_5= RightSquareBracket )? otherlv_6= RightParenthesis ( (lv_castExpr_7_0= ruleBSCastOrNewExpression ) ) ) | ( () otherlv_9= New ( ( ruleQualifiedName ) ) ( ( ( (lv_isArray_11_0= LeftSquareBracket ) ) otherlv_12= RightSquareBracket )? | (otherlv_13= LeftParenthesis ( ( (lv_args_14_0= ruleBSExpression ) ) (otherlv_15= Comma ( (lv_args_16_0= ruleBSExpression ) ) )* )? otherlv_17= RightParenthesis ) ) ) )
            int alt53=3;
            switch ( input.LA(1) ) {
            case Client:
            case Parent:
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
                alt53=1;
                }
                break;
            case LeftParenthesis:
                {
                int LA53_2 = input.LA(2);

                if ( (LA53_2==TaggedString||(LA53_2>=Number && LA53_2<=Object)||LA53_2==String||LA53_2==NONE||LA53_2==Void) ) {
                    alt53=2;
                }
                else if ( (LA53_2==Client||LA53_2==Parent||LA53_2==False||(LA53_2>=Null && LA53_2<=True)||LA53_2==New||LA53_2==ExclamationMark||LA53_2==LeftParenthesis||LA53_2==PlusSign||LA53_2==HyphenMinus||(LA53_2>=Tilde && LA53_2<=RULE_INT)||LA53_2==RULE_STRING) ) {
                    alt53=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 53, 2, input);

                    throw nvae;
                }
                }
                break;
            case New:
                {
                alt53=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }

            switch (alt53) {
                case 1 :
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3017:5: this_BSUnaryModifierExpression_0= ruleBSUnaryModifierExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBSCastOrNewExpressionAccess().getBSUnaryModifierExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBSUnaryModifierExpression_in_ruleBSCastOrNewExpression6525);
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
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3026:6: ( () otherlv_2= LeftParenthesis ( (lv_pType_3_0= ruleBSPrimitiveType ) ) ( ( (lv_isArray_4_0= LeftSquareBracket ) ) otherlv_5= RightSquareBracket )? otherlv_6= RightParenthesis ( (lv_castExpr_7_0= ruleBSCastOrNewExpression ) ) )
                    {
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3026:6: ( () otherlv_2= LeftParenthesis ( (lv_pType_3_0= ruleBSPrimitiveType ) ) ( ( (lv_isArray_4_0= LeftSquareBracket ) ) otherlv_5= RightSquareBracket )? otherlv_6= RightParenthesis ( (lv_castExpr_7_0= ruleBSCastOrNewExpression ) ) )
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3026:7: () otherlv_2= LeftParenthesis ( (lv_pType_3_0= ruleBSPrimitiveType ) ) ( ( (lv_isArray_4_0= LeftSquareBracket ) ) otherlv_5= RightSquareBracket )? otherlv_6= RightParenthesis ( (lv_castExpr_7_0= ruleBSCastOrNewExpression ) )
                    {
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3026:7: ()
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3027:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getBSCastOrNewExpressionAccess().getBSCastExpressionAction_1_0(),
                                  current);
                          
                    }

                    }

                    otherlv_2=(Token)match(input,LeftParenthesis,FOLLOW_LeftParenthesis_in_ruleBSCastOrNewExpression6553); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getBSCastOrNewExpressionAccess().getLeftParenthesisKeyword_1_1());
                          
                    }
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3037:1: ( (lv_pType_3_0= ruleBSPrimitiveType ) )
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3038:1: (lv_pType_3_0= ruleBSPrimitiveType )
                    {
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3038:1: (lv_pType_3_0= ruleBSPrimitiveType )
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3039:3: lv_pType_3_0= ruleBSPrimitiveType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getBSCastOrNewExpressionAccess().getPTypeBSPrimitiveTypeEnumRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBSPrimitiveType_in_ruleBSCastOrNewExpression6573);
                    lv_pType_3_0=ruleBSPrimitiveType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getBSCastOrNewExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"pType",
                              		lv_pType_3_0, 
                              		"BSPrimitiveType");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3055:2: ( ( (lv_isArray_4_0= LeftSquareBracket ) ) otherlv_5= RightSquareBracket )?
                    int alt48=2;
                    int LA48_0 = input.LA(1);

                    if ( (LA48_0==LeftSquareBracket) ) {
                        alt48=1;
                    }
                    switch (alt48) {
                        case 1 :
                            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3055:3: ( (lv_isArray_4_0= LeftSquareBracket ) ) otherlv_5= RightSquareBracket
                            {
                            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3055:3: ( (lv_isArray_4_0= LeftSquareBracket ) )
                            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3056:1: (lv_isArray_4_0= LeftSquareBracket )
                            {
                            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3056:1: (lv_isArray_4_0= LeftSquareBracket )
                            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3057:3: lv_isArray_4_0= LeftSquareBracket
                            {
                            lv_isArray_4_0=(Token)match(input,LeftSquareBracket,FOLLOW_LeftSquareBracket_in_ruleBSCastOrNewExpression6593); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_isArray_4_0, grammarAccess.getBSCastOrNewExpressionAccess().getIsArrayLeftSquareBracketKeyword_1_3_0_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getBSCastOrNewExpressionRule());
                              	        }
                                     		setWithLastConsumed(current, "isArray", true, "[");
                              	    
                            }

                            }


                            }

                            otherlv_5=(Token)match(input,RightSquareBracket,FOLLOW_RightSquareBracket_in_ruleBSCastOrNewExpression6617); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_5, grammarAccess.getBSCastOrNewExpressionAccess().getRightSquareBracketKeyword_1_3_1());
                                  
                            }

                            }
                            break;

                    }

                    otherlv_6=(Token)match(input,RightParenthesis,FOLLOW_RightParenthesis_in_ruleBSCastOrNewExpression6631); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getBSCastOrNewExpressionAccess().getRightParenthesisKeyword_1_4());
                          
                    }
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3081:1: ( (lv_castExpr_7_0= ruleBSCastOrNewExpression ) )
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3082:1: (lv_castExpr_7_0= ruleBSCastOrNewExpression )
                    {
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3082:1: (lv_castExpr_7_0= ruleBSCastOrNewExpression )
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3083:3: lv_castExpr_7_0= ruleBSCastOrNewExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getBSCastOrNewExpressionAccess().getCastExprBSCastOrNewExpressionParserRuleCall_1_5_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBSCastOrNewExpression_in_ruleBSCastOrNewExpression6651);
                    lv_castExpr_7_0=ruleBSCastOrNewExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getBSCastOrNewExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"castExpr",
                              		lv_castExpr_7_0, 
                              		"BSCastOrNewExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3100:6: ( () otherlv_9= New ( ( ruleQualifiedName ) ) ( ( ( (lv_isArray_11_0= LeftSquareBracket ) ) otherlv_12= RightSquareBracket )? | (otherlv_13= LeftParenthesis ( ( (lv_args_14_0= ruleBSExpression ) ) (otherlv_15= Comma ( (lv_args_16_0= ruleBSExpression ) ) )* )? otherlv_17= RightParenthesis ) ) )
                    {
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3100:6: ( () otherlv_9= New ( ( ruleQualifiedName ) ) ( ( ( (lv_isArray_11_0= LeftSquareBracket ) ) otherlv_12= RightSquareBracket )? | (otherlv_13= LeftParenthesis ( ( (lv_args_14_0= ruleBSExpression ) ) (otherlv_15= Comma ( (lv_args_16_0= ruleBSExpression ) ) )* )? otherlv_17= RightParenthesis ) ) )
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3100:7: () otherlv_9= New ( ( ruleQualifiedName ) ) ( ( ( (lv_isArray_11_0= LeftSquareBracket ) ) otherlv_12= RightSquareBracket )? | (otherlv_13= LeftParenthesis ( ( (lv_args_14_0= ruleBSExpression ) ) (otherlv_15= Comma ( (lv_args_16_0= ruleBSExpression ) ) )* )? otherlv_17= RightParenthesis ) )
                    {
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3100:7: ()
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3101:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getBSCastOrNewExpressionAccess().getBSNewExpressionAction_2_0(),
                                  current);
                          
                    }

                    }

                    otherlv_9=(Token)match(input,New,FOLLOW_New_in_ruleBSCastOrNewExpression6681); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getBSCastOrNewExpressionAccess().getNewKeyword_2_1());
                          
                    }
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3111:1: ( ( ruleQualifiedName ) )
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3112:1: ( ruleQualifiedName )
                    {
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3112:1: ( ruleQualifiedName )
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3113:3: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getBSCastOrNewExpressionRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getBSCastOrNewExpressionAccess().getRTypeBSClassCrossReference_2_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleBSCastOrNewExpression6703);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3126:2: ( ( ( (lv_isArray_11_0= LeftSquareBracket ) ) otherlv_12= RightSquareBracket )? | (otherlv_13= LeftParenthesis ( ( (lv_args_14_0= ruleBSExpression ) ) (otherlv_15= Comma ( (lv_args_16_0= ruleBSExpression ) ) )* )? otherlv_17= RightParenthesis ) )
                    int alt52=2;
                    int LA52_0 = input.LA(1);

                    if ( (LA52_0==EOF||(LA52_0>=LessThanSignLessThanSignEqualsSign && LA52_0<=TAB)||(LA52_0>=ExclamationMarkEqualsSign && LA52_0<=AsteriskEqualsSign)||LA52_0==PlusSignEqualsSign||LA52_0==HyphenMinusEqualsSign||(LA52_0>=SolidusEqualsSign && LA52_0<=CircumflexAccentEqualsSign)||(LA52_0>=VerticalLineEqualsSign && LA52_0<=VerticalLineVerticalLine)||(LA52_0>=PercentSign && LA52_0<=Ampersand)||(LA52_0>=RightParenthesis && LA52_0<=HyphenMinus)||(LA52_0>=Solidus && LA52_0<=CircumflexAccent)||LA52_0==VerticalLine) ) {
                        alt52=1;
                    }
                    else if ( (LA52_0==LeftParenthesis) ) {
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
                            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3126:3: ( ( (lv_isArray_11_0= LeftSquareBracket ) ) otherlv_12= RightSquareBracket )?
                            {
                            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3126:3: ( ( (lv_isArray_11_0= LeftSquareBracket ) ) otherlv_12= RightSquareBracket )?
                            int alt49=2;
                            int LA49_0 = input.LA(1);

                            if ( (LA49_0==LeftSquareBracket) ) {
                                alt49=1;
                            }
                            switch (alt49) {
                                case 1 :
                                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3126:4: ( (lv_isArray_11_0= LeftSquareBracket ) ) otherlv_12= RightSquareBracket
                                    {
                                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3126:4: ( (lv_isArray_11_0= LeftSquareBracket ) )
                                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3127:1: (lv_isArray_11_0= LeftSquareBracket )
                                    {
                                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3127:1: (lv_isArray_11_0= LeftSquareBracket )
                                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3128:3: lv_isArray_11_0= LeftSquareBracket
                                    {
                                    lv_isArray_11_0=(Token)match(input,LeftSquareBracket,FOLLOW_LeftSquareBracket_in_ruleBSCastOrNewExpression6724); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                              newLeafNode(lv_isArray_11_0, grammarAccess.getBSCastOrNewExpressionAccess().getIsArrayLeftSquareBracketKeyword_2_3_0_0_0());
                                          
                                    }
                                    if ( state.backtracking==0 ) {

                                      	        if (current==null) {
                                      	            current = createModelElement(grammarAccess.getBSCastOrNewExpressionRule());
                                      	        }
                                             		setWithLastConsumed(current, "isArray", true, "[");
                                      	    
                                    }

                                    }


                                    }

                                    otherlv_12=(Token)match(input,RightSquareBracket,FOLLOW_RightSquareBracket_in_ruleBSCastOrNewExpression6748); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                          	newLeafNode(otherlv_12, grammarAccess.getBSCastOrNewExpressionAccess().getRightSquareBracketKeyword_2_3_0_1());
                                          
                                    }

                                    }
                                    break;

                            }


                            }
                            break;
                        case 2 :
                            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3148:6: (otherlv_13= LeftParenthesis ( ( (lv_args_14_0= ruleBSExpression ) ) (otherlv_15= Comma ( (lv_args_16_0= ruleBSExpression ) ) )* )? otherlv_17= RightParenthesis )
                            {
                            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3148:6: (otherlv_13= LeftParenthesis ( ( (lv_args_14_0= ruleBSExpression ) ) (otherlv_15= Comma ( (lv_args_16_0= ruleBSExpression ) ) )* )? otherlv_17= RightParenthesis )
                            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3149:2: otherlv_13= LeftParenthesis ( ( (lv_args_14_0= ruleBSExpression ) ) (otherlv_15= Comma ( (lv_args_16_0= ruleBSExpression ) ) )* )? otherlv_17= RightParenthesis
                            {
                            otherlv_13=(Token)match(input,LeftParenthesis,FOLLOW_LeftParenthesis_in_ruleBSCastOrNewExpression6769); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_13, grammarAccess.getBSCastOrNewExpressionAccess().getLeftParenthesisKeyword_2_3_1_0());
                                  
                            }
                            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3153:1: ( ( (lv_args_14_0= ruleBSExpression ) ) (otherlv_15= Comma ( (lv_args_16_0= ruleBSExpression ) ) )* )?
                            int alt51=2;
                            int LA51_0 = input.LA(1);

                            if ( (LA51_0==Client||LA51_0==Parent||LA51_0==False||(LA51_0>=Null && LA51_0<=True)||LA51_0==New||LA51_0==ExclamationMark||LA51_0==LeftParenthesis||LA51_0==PlusSign||LA51_0==HyphenMinus||(LA51_0>=Tilde && LA51_0<=RULE_INT)||LA51_0==RULE_STRING) ) {
                                alt51=1;
                            }
                            switch (alt51) {
                                case 1 :
                                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3153:2: ( (lv_args_14_0= ruleBSExpression ) ) (otherlv_15= Comma ( (lv_args_16_0= ruleBSExpression ) ) )*
                                    {
                                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3153:2: ( (lv_args_14_0= ruleBSExpression ) )
                                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3154:1: (lv_args_14_0= ruleBSExpression )
                                    {
                                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3154:1: (lv_args_14_0= ruleBSExpression )
                                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3155:3: lv_args_14_0= ruleBSExpression
                                    {
                                    if ( state.backtracking==0 ) {
                                       
                                      	        newCompositeNode(grammarAccess.getBSCastOrNewExpressionAccess().getArgsBSExpressionParserRuleCall_2_3_1_1_0_0()); 
                                      	    
                                    }
                                    pushFollow(FOLLOW_ruleBSExpression_in_ruleBSCastOrNewExpression6790);
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

                                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3171:2: (otherlv_15= Comma ( (lv_args_16_0= ruleBSExpression ) ) )*
                                    loop50:
                                    do {
                                        int alt50=2;
                                        int LA50_0 = input.LA(1);

                                        if ( (LA50_0==Comma) ) {
                                            alt50=1;
                                        }


                                        switch (alt50) {
                                    	case 1 :
                                    	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3172:2: otherlv_15= Comma ( (lv_args_16_0= ruleBSExpression ) )
                                    	    {
                                    	    otherlv_15=(Token)match(input,Comma,FOLLOW_Comma_in_ruleBSCastOrNewExpression6804); if (state.failed) return current;
                                    	    if ( state.backtracking==0 ) {

                                    	          	newLeafNode(otherlv_15, grammarAccess.getBSCastOrNewExpressionAccess().getCommaKeyword_2_3_1_1_1_0());
                                    	          
                                    	    }
                                    	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3176:1: ( (lv_args_16_0= ruleBSExpression ) )
                                    	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3177:1: (lv_args_16_0= ruleBSExpression )
                                    	    {
                                    	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3177:1: (lv_args_16_0= ruleBSExpression )
                                    	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3178:3: lv_args_16_0= ruleBSExpression
                                    	    {
                                    	    if ( state.backtracking==0 ) {
                                    	       
                                    	      	        newCompositeNode(grammarAccess.getBSCastOrNewExpressionAccess().getArgsBSExpressionParserRuleCall_2_3_1_1_1_1_0()); 
                                    	      	    
                                    	    }
                                    	    pushFollow(FOLLOW_ruleBSExpression_in_ruleBSCastOrNewExpression6824);
                                    	    lv_args_16_0=ruleBSExpression();

                                    	    state._fsp--;
                                    	    if (state.failed) return current;
                                    	    if ( state.backtracking==0 ) {

                                    	      	        if (current==null) {
                                    	      	            current = createModelElementForParent(grammarAccess.getBSCastOrNewExpressionRule());
                                    	      	        }
                                    	             		add(
                                    	             			current, 
                                    	             			"args",
                                    	              		lv_args_16_0, 
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

                            otherlv_17=(Token)match(input,RightParenthesis,FOLLOW_RightParenthesis_in_ruleBSCastOrNewExpression6841); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_17, grammarAccess.getBSCastOrNewExpressionAccess().getRightParenthesisKeyword_2_3_1_2());
                                  
                            }

                            }


                            }
                            break;

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
    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3207:1: entryRuleBSUnaryModifierExpression returns [EObject current=null] : iv_ruleBSUnaryModifierExpression= ruleBSUnaryModifierExpression EOF ;
    public final EObject entryRuleBSUnaryModifierExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBSUnaryModifierExpression = null;


        try {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3208:2: (iv_ruleBSUnaryModifierExpression= ruleBSUnaryModifierExpression EOF )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3209:2: iv_ruleBSUnaryModifierExpression= ruleBSUnaryModifierExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBSUnaryModifierExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleBSUnaryModifierExpression_in_entryRuleBSUnaryModifierExpression6878);
            iv_ruleBSUnaryModifierExpression=ruleBSUnaryModifierExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBSUnaryModifierExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBSUnaryModifierExpression6888); if (state.failed) return current;

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
    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3216:1: ruleBSUnaryModifierExpression returns [EObject current=null] : (this_BSInvokationExpression_0= ruleBSInvokationExpression | ( () ( ( (lv_operator_2_1= PlusSign | lv_operator_2_2= HyphenMinus | lv_operator_2_3= ExclamationMark | lv_operator_2_4= Tilde ) ) ) ( (lv_receiver_3_0= ruleBSUnaryModifierExpression ) ) ) ) ;
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
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3219:28: ( (this_BSInvokationExpression_0= ruleBSInvokationExpression | ( () ( ( (lv_operator_2_1= PlusSign | lv_operator_2_2= HyphenMinus | lv_operator_2_3= ExclamationMark | lv_operator_2_4= Tilde ) ) ) ( (lv_receiver_3_0= ruleBSUnaryModifierExpression ) ) ) ) )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3220:1: (this_BSInvokationExpression_0= ruleBSInvokationExpression | ( () ( ( (lv_operator_2_1= PlusSign | lv_operator_2_2= HyphenMinus | lv_operator_2_3= ExclamationMark | lv_operator_2_4= Tilde ) ) ) ( (lv_receiver_3_0= ruleBSUnaryModifierExpression ) ) ) )
            {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3220:1: (this_BSInvokationExpression_0= ruleBSInvokationExpression | ( () ( ( (lv_operator_2_1= PlusSign | lv_operator_2_2= HyphenMinus | lv_operator_2_3= ExclamationMark | lv_operator_2_4= Tilde ) ) ) ( (lv_receiver_3_0= ruleBSUnaryModifierExpression ) ) ) )
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==Client||LA55_0==Parent||LA55_0==False||(LA55_0>=Null && LA55_0<=True)||LA55_0==LeftParenthesis||(LA55_0>=RULE_HEX_VALUE && LA55_0<=RULE_INT)||LA55_0==RULE_STRING) ) {
                alt55=1;
            }
            else if ( (LA55_0==ExclamationMark||LA55_0==PlusSign||LA55_0==HyphenMinus||LA55_0==Tilde) ) {
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
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3221:5: this_BSInvokationExpression_0= ruleBSInvokationExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBSUnaryModifierExpressionAccess().getBSInvokationExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBSInvokationExpression_in_ruleBSUnaryModifierExpression6935);
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
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3230:6: ( () ( ( (lv_operator_2_1= PlusSign | lv_operator_2_2= HyphenMinus | lv_operator_2_3= ExclamationMark | lv_operator_2_4= Tilde ) ) ) ( (lv_receiver_3_0= ruleBSUnaryModifierExpression ) ) )
                    {
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3230:6: ( () ( ( (lv_operator_2_1= PlusSign | lv_operator_2_2= HyphenMinus | lv_operator_2_3= ExclamationMark | lv_operator_2_4= Tilde ) ) ) ( (lv_receiver_3_0= ruleBSUnaryModifierExpression ) ) )
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3230:7: () ( ( (lv_operator_2_1= PlusSign | lv_operator_2_2= HyphenMinus | lv_operator_2_3= ExclamationMark | lv_operator_2_4= Tilde ) ) ) ( (lv_receiver_3_0= ruleBSUnaryModifierExpression ) )
                    {
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3230:7: ()
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3231:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getBSUnaryModifierExpressionAccess().getBSUnaryModifierExpressionAction_1_0(),
                                  current);
                          
                    }

                    }

                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3236:2: ( ( (lv_operator_2_1= PlusSign | lv_operator_2_2= HyphenMinus | lv_operator_2_3= ExclamationMark | lv_operator_2_4= Tilde ) ) )
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3237:1: ( (lv_operator_2_1= PlusSign | lv_operator_2_2= HyphenMinus | lv_operator_2_3= ExclamationMark | lv_operator_2_4= Tilde ) )
                    {
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3237:1: ( (lv_operator_2_1= PlusSign | lv_operator_2_2= HyphenMinus | lv_operator_2_3= ExclamationMark | lv_operator_2_4= Tilde ) )
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3238:1: (lv_operator_2_1= PlusSign | lv_operator_2_2= HyphenMinus | lv_operator_2_3= ExclamationMark | lv_operator_2_4= Tilde )
                    {
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3238:1: (lv_operator_2_1= PlusSign | lv_operator_2_2= HyphenMinus | lv_operator_2_3= ExclamationMark | lv_operator_2_4= Tilde )
                    int alt54=4;
                    switch ( input.LA(1) ) {
                    case PlusSign:
                        {
                        alt54=1;
                        }
                        break;
                    case HyphenMinus:
                        {
                        alt54=2;
                        }
                        break;
                    case ExclamationMark:
                        {
                        alt54=3;
                        }
                        break;
                    case Tilde:
                        {
                        alt54=4;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 54, 0, input);

                        throw nvae;
                    }

                    switch (alt54) {
                        case 1 :
                            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3239:3: lv_operator_2_1= PlusSign
                            {
                            lv_operator_2_1=(Token)match(input,PlusSign,FOLLOW_PlusSign_in_ruleBSUnaryModifierExpression6971); if (state.failed) return current;
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
                            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3252:8: lv_operator_2_2= HyphenMinus
                            {
                            lv_operator_2_2=(Token)match(input,HyphenMinus,FOLLOW_HyphenMinus_in_ruleBSUnaryModifierExpression6999); if (state.failed) return current;
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
                            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3265:8: lv_operator_2_3= ExclamationMark
                            {
                            lv_operator_2_3=(Token)match(input,ExclamationMark,FOLLOW_ExclamationMark_in_ruleBSUnaryModifierExpression7027); if (state.failed) return current;
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
                            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3278:8: lv_operator_2_4= Tilde
                            {
                            lv_operator_2_4=(Token)match(input,Tilde,FOLLOW_Tilde_in_ruleBSUnaryModifierExpression7055); if (state.failed) return current;
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

                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3294:2: ( (lv_receiver_3_0= ruleBSUnaryModifierExpression ) )
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3295:1: (lv_receiver_3_0= ruleBSUnaryModifierExpression )
                    {
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3295:1: (lv_receiver_3_0= ruleBSUnaryModifierExpression )
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3296:3: lv_receiver_3_0= ruleBSUnaryModifierExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getBSUnaryModifierExpressionAccess().getReceiverBSUnaryModifierExpressionParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBSUnaryModifierExpression_in_ruleBSUnaryModifierExpression7090);
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
    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3320:1: entryRuleBSInvokationExpression returns [EObject current=null] : iv_ruleBSInvokationExpression= ruleBSInvokationExpression EOF ;
    public final EObject entryRuleBSInvokationExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBSInvokationExpression = null;


        try {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3321:2: (iv_ruleBSInvokationExpression= ruleBSInvokationExpression EOF )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3322:2: iv_ruleBSInvokationExpression= ruleBSInvokationExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBSInvokationExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleBSInvokationExpression_in_entryRuleBSInvokationExpression7126);
            iv_ruleBSInvokationExpression=ruleBSInvokationExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBSInvokationExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBSInvokationExpression7136); if (state.failed) return current;

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
    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3329:1: ruleBSInvokationExpression returns [EObject current=null] : (this_BSTerminalExpression_0= ruleBSTerminalExpression ( ( () otherlv_2= FullStop ( (lv_member_3_0= ruleBSTerminalExpression ) ) ) | ( () otherlv_5= LeftParenthesis ( ( (lv_args_6_0= ruleBSExpression ) ) (otherlv_7= Comma ( (lv_args_8_0= ruleBSExpression ) ) )* )? otherlv_9= RightParenthesis ) | ( () otherlv_11= LeftSquareBracket ( ( (lv_args_12_0= ruleBSExpression ) ) (otherlv_13= Comma ( (lv_args_14_0= ruleBSExpression ) ) )* )? otherlv_15= RightSquareBracket ) | ( () ( ( (lv_operator_17_1= PlusSignPlusSign | lv_operator_17_2= HyphenMinusHyphenMinus ) ) ) ) )* ) ;
    public final EObject ruleBSInvokationExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token lv_operator_17_1=null;
        Token lv_operator_17_2=null;
        EObject this_BSTerminalExpression_0 = null;

        EObject lv_member_3_0 = null;

        EObject lv_args_6_0 = null;

        EObject lv_args_8_0 = null;

        EObject lv_args_12_0 = null;

        EObject lv_args_14_0 = null;


         enterRule(); 
            
        try {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3332:28: ( (this_BSTerminalExpression_0= ruleBSTerminalExpression ( ( () otherlv_2= FullStop ( (lv_member_3_0= ruleBSTerminalExpression ) ) ) | ( () otherlv_5= LeftParenthesis ( ( (lv_args_6_0= ruleBSExpression ) ) (otherlv_7= Comma ( (lv_args_8_0= ruleBSExpression ) ) )* )? otherlv_9= RightParenthesis ) | ( () otherlv_11= LeftSquareBracket ( ( (lv_args_12_0= ruleBSExpression ) ) (otherlv_13= Comma ( (lv_args_14_0= ruleBSExpression ) ) )* )? otherlv_15= RightSquareBracket ) | ( () ( ( (lv_operator_17_1= PlusSignPlusSign | lv_operator_17_2= HyphenMinusHyphenMinus ) ) ) ) )* ) )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3333:1: (this_BSTerminalExpression_0= ruleBSTerminalExpression ( ( () otherlv_2= FullStop ( (lv_member_3_0= ruleBSTerminalExpression ) ) ) | ( () otherlv_5= LeftParenthesis ( ( (lv_args_6_0= ruleBSExpression ) ) (otherlv_7= Comma ( (lv_args_8_0= ruleBSExpression ) ) )* )? otherlv_9= RightParenthesis ) | ( () otherlv_11= LeftSquareBracket ( ( (lv_args_12_0= ruleBSExpression ) ) (otherlv_13= Comma ( (lv_args_14_0= ruleBSExpression ) ) )* )? otherlv_15= RightSquareBracket ) | ( () ( ( (lv_operator_17_1= PlusSignPlusSign | lv_operator_17_2= HyphenMinusHyphenMinus ) ) ) ) )* )
            {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3333:1: (this_BSTerminalExpression_0= ruleBSTerminalExpression ( ( () otherlv_2= FullStop ( (lv_member_3_0= ruleBSTerminalExpression ) ) ) | ( () otherlv_5= LeftParenthesis ( ( (lv_args_6_0= ruleBSExpression ) ) (otherlv_7= Comma ( (lv_args_8_0= ruleBSExpression ) ) )* )? otherlv_9= RightParenthesis ) | ( () otherlv_11= LeftSquareBracket ( ( (lv_args_12_0= ruleBSExpression ) ) (otherlv_13= Comma ( (lv_args_14_0= ruleBSExpression ) ) )* )? otherlv_15= RightSquareBracket ) | ( () ( ( (lv_operator_17_1= PlusSignPlusSign | lv_operator_17_2= HyphenMinusHyphenMinus ) ) ) ) )* )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3334:5: this_BSTerminalExpression_0= ruleBSTerminalExpression ( ( () otherlv_2= FullStop ( (lv_member_3_0= ruleBSTerminalExpression ) ) ) | ( () otherlv_5= LeftParenthesis ( ( (lv_args_6_0= ruleBSExpression ) ) (otherlv_7= Comma ( (lv_args_8_0= ruleBSExpression ) ) )* )? otherlv_9= RightParenthesis ) | ( () otherlv_11= LeftSquareBracket ( ( (lv_args_12_0= ruleBSExpression ) ) (otherlv_13= Comma ( (lv_args_14_0= ruleBSExpression ) ) )* )? otherlv_15= RightSquareBracket ) | ( () ( ( (lv_operator_17_1= PlusSignPlusSign | lv_operator_17_2= HyphenMinusHyphenMinus ) ) ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getBSInvokationExpressionAccess().getBSTerminalExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleBSTerminalExpression_in_ruleBSInvokationExpression7183);
            this_BSTerminalExpression_0=ruleBSTerminalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = this_BSTerminalExpression_0;
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3342:1: ( ( () otherlv_2= FullStop ( (lv_member_3_0= ruleBSTerminalExpression ) ) ) | ( () otherlv_5= LeftParenthesis ( ( (lv_args_6_0= ruleBSExpression ) ) (otherlv_7= Comma ( (lv_args_8_0= ruleBSExpression ) ) )* )? otherlv_9= RightParenthesis ) | ( () otherlv_11= LeftSquareBracket ( ( (lv_args_12_0= ruleBSExpression ) ) (otherlv_13= Comma ( (lv_args_14_0= ruleBSExpression ) ) )* )? otherlv_15= RightSquareBracket ) | ( () ( ( (lv_operator_17_1= PlusSignPlusSign | lv_operator_17_2= HyphenMinusHyphenMinus ) ) ) ) )*
            loop61:
            do {
                int alt61=5;
                switch ( input.LA(1) ) {
                case FullStop:
                    {
                    alt61=1;
                    }
                    break;
                case LeftParenthesis:
                    {
                    alt61=2;
                    }
                    break;
                case LeftSquareBracket:
                    {
                    alt61=3;
                    }
                    break;
                case PlusSignPlusSign:
                case HyphenMinusHyphenMinus:
                    {
                    alt61=4;
                    }
                    break;

                }

                switch (alt61) {
            	case 1 :
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3342:2: ( () otherlv_2= FullStop ( (lv_member_3_0= ruleBSTerminalExpression ) ) )
            	    {
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3342:2: ( () otherlv_2= FullStop ( (lv_member_3_0= ruleBSTerminalExpression ) ) )
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3342:3: () otherlv_2= FullStop ( (lv_member_3_0= ruleBSTerminalExpression ) )
            	    {
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3342:3: ()
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3343:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getBSInvokationExpressionAccess().getBSMemberSelectionExpressionReceiverAction_1_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,FullStop,FOLLOW_FullStop_in_ruleBSInvokationExpression7206); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getBSInvokationExpressionAccess().getFullStopKeyword_1_0_1());
            	          
            	    }
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3353:1: ( (lv_member_3_0= ruleBSTerminalExpression ) )
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3354:1: (lv_member_3_0= ruleBSTerminalExpression )
            	    {
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3354:1: (lv_member_3_0= ruleBSTerminalExpression )
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3355:3: lv_member_3_0= ruleBSTerminalExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getBSInvokationExpressionAccess().getMemberBSTerminalExpressionParserRuleCall_1_0_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleBSTerminalExpression_in_ruleBSInvokationExpression7226);
            	    lv_member_3_0=ruleBSTerminalExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getBSInvokationExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"member",
            	              		lv_member_3_0, 
            	              		"BSTerminalExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3372:6: ( () otherlv_5= LeftParenthesis ( ( (lv_args_6_0= ruleBSExpression ) ) (otherlv_7= Comma ( (lv_args_8_0= ruleBSExpression ) ) )* )? otherlv_9= RightParenthesis )
            	    {
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3372:6: ( () otherlv_5= LeftParenthesis ( ( (lv_args_6_0= ruleBSExpression ) ) (otherlv_7= Comma ( (lv_args_8_0= ruleBSExpression ) ) )* )? otherlv_9= RightParenthesis )
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3372:7: () otherlv_5= LeftParenthesis ( ( (lv_args_6_0= ruleBSExpression ) ) (otherlv_7= Comma ( (lv_args_8_0= ruleBSExpression ) ) )* )? otherlv_9= RightParenthesis
            	    {
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3372:7: ()
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3373:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getBSInvokationExpressionAccess().getBSMethodInvokationExpressionReceiverAction_1_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_5=(Token)match(input,LeftParenthesis,FOLLOW_LeftParenthesis_in_ruleBSInvokationExpression7256); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_5, grammarAccess.getBSInvokationExpressionAccess().getLeftParenthesisKeyword_1_1_1());
            	          
            	    }
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3383:1: ( ( (lv_args_6_0= ruleBSExpression ) ) (otherlv_7= Comma ( (lv_args_8_0= ruleBSExpression ) ) )* )?
            	    int alt57=2;
            	    int LA57_0 = input.LA(1);

            	    if ( (LA57_0==Client||LA57_0==Parent||LA57_0==False||(LA57_0>=Null && LA57_0<=True)||LA57_0==New||LA57_0==ExclamationMark||LA57_0==LeftParenthesis||LA57_0==PlusSign||LA57_0==HyphenMinus||(LA57_0>=Tilde && LA57_0<=RULE_INT)||LA57_0==RULE_STRING) ) {
            	        alt57=1;
            	    }
            	    switch (alt57) {
            	        case 1 :
            	            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3383:2: ( (lv_args_6_0= ruleBSExpression ) ) (otherlv_7= Comma ( (lv_args_8_0= ruleBSExpression ) ) )*
            	            {
            	            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3383:2: ( (lv_args_6_0= ruleBSExpression ) )
            	            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3384:1: (lv_args_6_0= ruleBSExpression )
            	            {
            	            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3384:1: (lv_args_6_0= ruleBSExpression )
            	            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3385:3: lv_args_6_0= ruleBSExpression
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getBSInvokationExpressionAccess().getArgsBSExpressionParserRuleCall_1_1_2_0_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleBSExpression_in_ruleBSInvokationExpression7277);
            	            lv_args_6_0=ruleBSExpression();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getBSInvokationExpressionRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"args",
            	                      		lv_args_6_0, 
            	                      		"BSExpression");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }


            	            }

            	            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3401:2: (otherlv_7= Comma ( (lv_args_8_0= ruleBSExpression ) ) )*
            	            loop56:
            	            do {
            	                int alt56=2;
            	                int LA56_0 = input.LA(1);

            	                if ( (LA56_0==Comma) ) {
            	                    alt56=1;
            	                }


            	                switch (alt56) {
            	            	case 1 :
            	            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3402:2: otherlv_7= Comma ( (lv_args_8_0= ruleBSExpression ) )
            	            	    {
            	            	    otherlv_7=(Token)match(input,Comma,FOLLOW_Comma_in_ruleBSInvokationExpression7291); if (state.failed) return current;
            	            	    if ( state.backtracking==0 ) {

            	            	          	newLeafNode(otherlv_7, grammarAccess.getBSInvokationExpressionAccess().getCommaKeyword_1_1_2_1_0());
            	            	          
            	            	    }
            	            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3406:1: ( (lv_args_8_0= ruleBSExpression ) )
            	            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3407:1: (lv_args_8_0= ruleBSExpression )
            	            	    {
            	            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3407:1: (lv_args_8_0= ruleBSExpression )
            	            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3408:3: lv_args_8_0= ruleBSExpression
            	            	    {
            	            	    if ( state.backtracking==0 ) {
            	            	       
            	            	      	        newCompositeNode(grammarAccess.getBSInvokationExpressionAccess().getArgsBSExpressionParserRuleCall_1_1_2_1_1_0()); 
            	            	      	    
            	            	    }
            	            	    pushFollow(FOLLOW_ruleBSExpression_in_ruleBSInvokationExpression7311);
            	            	    lv_args_8_0=ruleBSExpression();

            	            	    state._fsp--;
            	            	    if (state.failed) return current;
            	            	    if ( state.backtracking==0 ) {

            	            	      	        if (current==null) {
            	            	      	            current = createModelElementForParent(grammarAccess.getBSInvokationExpressionRule());
            	            	      	        }
            	            	             		add(
            	            	             			current, 
            	            	             			"args",
            	            	              		lv_args_8_0, 
            	            	              		"BSExpression");
            	            	      	        afterParserOrEnumRuleCall();
            	            	      	    
            	            	    }

            	            	    }


            	            	    }


            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop56;
            	                }
            	            } while (true);


            	            }
            	            break;

            	    }

            	    otherlv_9=(Token)match(input,RightParenthesis,FOLLOW_RightParenthesis_in_ruleBSInvokationExpression7328); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_9, grammarAccess.getBSInvokationExpressionAccess().getRightParenthesisKeyword_1_1_3());
            	          
            	    }

            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3430:6: ( () otherlv_11= LeftSquareBracket ( ( (lv_args_12_0= ruleBSExpression ) ) (otherlv_13= Comma ( (lv_args_14_0= ruleBSExpression ) ) )* )? otherlv_15= RightSquareBracket )
            	    {
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3430:6: ( () otherlv_11= LeftSquareBracket ( ( (lv_args_12_0= ruleBSExpression ) ) (otherlv_13= Comma ( (lv_args_14_0= ruleBSExpression ) ) )* )? otherlv_15= RightSquareBracket )
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3430:7: () otherlv_11= LeftSquareBracket ( ( (lv_args_12_0= ruleBSExpression ) ) (otherlv_13= Comma ( (lv_args_14_0= ruleBSExpression ) ) )* )? otherlv_15= RightSquareBracket
            	    {
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3430:7: ()
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3431:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getBSInvokationExpressionAccess().getBSArrayAccessExpressionReceiverAction_1_2_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_11=(Token)match(input,LeftSquareBracket,FOLLOW_LeftSquareBracket_in_ruleBSInvokationExpression7357); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_11, grammarAccess.getBSInvokationExpressionAccess().getLeftSquareBracketKeyword_1_2_1());
            	          
            	    }
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3441:1: ( ( (lv_args_12_0= ruleBSExpression ) ) (otherlv_13= Comma ( (lv_args_14_0= ruleBSExpression ) ) )* )?
            	    int alt59=2;
            	    int LA59_0 = input.LA(1);

            	    if ( (LA59_0==Client||LA59_0==Parent||LA59_0==False||(LA59_0>=Null && LA59_0<=True)||LA59_0==New||LA59_0==ExclamationMark||LA59_0==LeftParenthesis||LA59_0==PlusSign||LA59_0==HyphenMinus||(LA59_0>=Tilde && LA59_0<=RULE_INT)||LA59_0==RULE_STRING) ) {
            	        alt59=1;
            	    }
            	    switch (alt59) {
            	        case 1 :
            	            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3441:2: ( (lv_args_12_0= ruleBSExpression ) ) (otherlv_13= Comma ( (lv_args_14_0= ruleBSExpression ) ) )*
            	            {
            	            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3441:2: ( (lv_args_12_0= ruleBSExpression ) )
            	            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3442:1: (lv_args_12_0= ruleBSExpression )
            	            {
            	            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3442:1: (lv_args_12_0= ruleBSExpression )
            	            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3443:3: lv_args_12_0= ruleBSExpression
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getBSInvokationExpressionAccess().getArgsBSExpressionParserRuleCall_1_2_2_0_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleBSExpression_in_ruleBSInvokationExpression7378);
            	            lv_args_12_0=ruleBSExpression();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getBSInvokationExpressionRule());
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

            	            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3459:2: (otherlv_13= Comma ( (lv_args_14_0= ruleBSExpression ) ) )*
            	            loop58:
            	            do {
            	                int alt58=2;
            	                int LA58_0 = input.LA(1);

            	                if ( (LA58_0==Comma) ) {
            	                    alt58=1;
            	                }


            	                switch (alt58) {
            	            	case 1 :
            	            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3460:2: otherlv_13= Comma ( (lv_args_14_0= ruleBSExpression ) )
            	            	    {
            	            	    otherlv_13=(Token)match(input,Comma,FOLLOW_Comma_in_ruleBSInvokationExpression7392); if (state.failed) return current;
            	            	    if ( state.backtracking==0 ) {

            	            	          	newLeafNode(otherlv_13, grammarAccess.getBSInvokationExpressionAccess().getCommaKeyword_1_2_2_1_0());
            	            	          
            	            	    }
            	            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3464:1: ( (lv_args_14_0= ruleBSExpression ) )
            	            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3465:1: (lv_args_14_0= ruleBSExpression )
            	            	    {
            	            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3465:1: (lv_args_14_0= ruleBSExpression )
            	            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3466:3: lv_args_14_0= ruleBSExpression
            	            	    {
            	            	    if ( state.backtracking==0 ) {
            	            	       
            	            	      	        newCompositeNode(grammarAccess.getBSInvokationExpressionAccess().getArgsBSExpressionParserRuleCall_1_2_2_1_1_0()); 
            	            	      	    
            	            	    }
            	            	    pushFollow(FOLLOW_ruleBSExpression_in_ruleBSInvokationExpression7412);
            	            	    lv_args_14_0=ruleBSExpression();

            	            	    state._fsp--;
            	            	    if (state.failed) return current;
            	            	    if ( state.backtracking==0 ) {

            	            	      	        if (current==null) {
            	            	      	            current = createModelElementForParent(grammarAccess.getBSInvokationExpressionRule());
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
            	            	    break loop58;
            	                }
            	            } while (true);


            	            }
            	            break;

            	    }

            	    otherlv_15=(Token)match(input,RightSquareBracket,FOLLOW_RightSquareBracket_in_ruleBSInvokationExpression7429); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_15, grammarAccess.getBSInvokationExpressionAccess().getRightSquareBracketKeyword_1_2_3());
            	          
            	    }

            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3488:6: ( () ( ( (lv_operator_17_1= PlusSignPlusSign | lv_operator_17_2= HyphenMinusHyphenMinus ) ) ) )
            	    {
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3488:6: ( () ( ( (lv_operator_17_1= PlusSignPlusSign | lv_operator_17_2= HyphenMinusHyphenMinus ) ) ) )
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3488:7: () ( ( (lv_operator_17_1= PlusSignPlusSign | lv_operator_17_2= HyphenMinusHyphenMinus ) ) )
            	    {
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3488:7: ()
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3489:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getBSInvokationExpressionAccess().getBSPostfixArithmeticExpressionReceiverAction_1_3_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3494:2: ( ( (lv_operator_17_1= PlusSignPlusSign | lv_operator_17_2= HyphenMinusHyphenMinus ) ) )
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3495:1: ( (lv_operator_17_1= PlusSignPlusSign | lv_operator_17_2= HyphenMinusHyphenMinus ) )
            	    {
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3495:1: ( (lv_operator_17_1= PlusSignPlusSign | lv_operator_17_2= HyphenMinusHyphenMinus ) )
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3496:1: (lv_operator_17_1= PlusSignPlusSign | lv_operator_17_2= HyphenMinusHyphenMinus )
            	    {
            	    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3496:1: (lv_operator_17_1= PlusSignPlusSign | lv_operator_17_2= HyphenMinusHyphenMinus )
            	    int alt60=2;
            	    int LA60_0 = input.LA(1);

            	    if ( (LA60_0==PlusSignPlusSign) ) {
            	        alt60=1;
            	    }
            	    else if ( (LA60_0==HyphenMinusHyphenMinus) ) {
            	        alt60=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 60, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt60) {
            	        case 1 :
            	            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3497:3: lv_operator_17_1= PlusSignPlusSign
            	            {
            	            lv_operator_17_1=(Token)match(input,PlusSignPlusSign,FOLLOW_PlusSignPlusSign_in_ruleBSInvokationExpression7466); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_operator_17_1, grammarAccess.getBSInvokationExpressionAccess().getOperatorPlusSignPlusSignKeyword_1_3_1_0_0());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getBSInvokationExpressionRule());
            	              	        }
            	                     		setWithLastConsumed(current, "operator", lv_operator_17_1, null);
            	              	    
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3510:8: lv_operator_17_2= HyphenMinusHyphenMinus
            	            {
            	            lv_operator_17_2=(Token)match(input,HyphenMinusHyphenMinus,FOLLOW_HyphenMinusHyphenMinus_in_ruleBSInvokationExpression7494); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_operator_17_2, grammarAccess.getBSInvokationExpressionAccess().getOperatorHyphenMinusHyphenMinusKeyword_1_3_1_0_1());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getBSInvokationExpressionRule());
            	              	        }
            	                     		setWithLastConsumed(current, "operator", lv_operator_17_2, null);
            	              	    
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
            	    break loop61;
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
    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3534:1: entryRuleBSTerminalExpression returns [EObject current=null] : iv_ruleBSTerminalExpression= ruleBSTerminalExpression EOF ;
    public final EObject entryRuleBSTerminalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBSTerminalExpression = null;


        try {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3535:2: (iv_ruleBSTerminalExpression= ruleBSTerminalExpression EOF )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3536:2: iv_ruleBSTerminalExpression= ruleBSTerminalExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBSTerminalExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleBSTerminalExpression_in_entryRuleBSTerminalExpression7546);
            iv_ruleBSTerminalExpression=ruleBSTerminalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBSTerminalExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBSTerminalExpression7556); if (state.failed) return current;

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
    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3543:1: ruleBSTerminalExpression returns [EObject current=null] : ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) | ( () ( (lv_value_3_0= RULE_HEX_VALUE ) ) ) | ( () ( (lv_value_5_0= RULE_INT ) ) ( ( ( FullStop )=>otherlv_6= FullStop ) () ( (lv_right_8_0= RULE_INT ) ) )? ) | ( () ( ( (lv_value_10_1= True | lv_value_10_2= False ) ) ) ) | ( () otherlv_12= Null ) | ( () otherlv_14= This ) | ( () otherlv_16= Client ) | ( () otherlv_18= Parent ) | ( () ( (otherlv_20= RULE_ID ) ) ) | ( () otherlv_22= LeftParenthesis ( (lv_expression_23_0= ruleBSExpression ) ) otherlv_24= RightParenthesis ) ) ;
    public final EObject ruleBSTerminalExpression() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Token lv_value_3_0=null;
        Token lv_value_5_0=null;
        Token otherlv_6=null;
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
        EObject lv_expression_23_0 = null;


         enterRule(); 
            
        try {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3546:28: ( ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) | ( () ( (lv_value_3_0= RULE_HEX_VALUE ) ) ) | ( () ( (lv_value_5_0= RULE_INT ) ) ( ( ( FullStop )=>otherlv_6= FullStop ) () ( (lv_right_8_0= RULE_INT ) ) )? ) | ( () ( ( (lv_value_10_1= True | lv_value_10_2= False ) ) ) ) | ( () otherlv_12= Null ) | ( () otherlv_14= This ) | ( () otherlv_16= Client ) | ( () otherlv_18= Parent ) | ( () ( (otherlv_20= RULE_ID ) ) ) | ( () otherlv_22= LeftParenthesis ( (lv_expression_23_0= ruleBSExpression ) ) otherlv_24= RightParenthesis ) ) )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3547:1: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) | ( () ( (lv_value_3_0= RULE_HEX_VALUE ) ) ) | ( () ( (lv_value_5_0= RULE_INT ) ) ( ( ( FullStop )=>otherlv_6= FullStop ) () ( (lv_right_8_0= RULE_INT ) ) )? ) | ( () ( ( (lv_value_10_1= True | lv_value_10_2= False ) ) ) ) | ( () otherlv_12= Null ) | ( () otherlv_14= This ) | ( () otherlv_16= Client ) | ( () otherlv_18= Parent ) | ( () ( (otherlv_20= RULE_ID ) ) ) | ( () otherlv_22= LeftParenthesis ( (lv_expression_23_0= ruleBSExpression ) ) otherlv_24= RightParenthesis ) )
            {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3547:1: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) | ( () ( (lv_value_3_0= RULE_HEX_VALUE ) ) ) | ( () ( (lv_value_5_0= RULE_INT ) ) ( ( ( FullStop )=>otherlv_6= FullStop ) () ( (lv_right_8_0= RULE_INT ) ) )? ) | ( () ( ( (lv_value_10_1= True | lv_value_10_2= False ) ) ) ) | ( () otherlv_12= Null ) | ( () otherlv_14= This ) | ( () otherlv_16= Client ) | ( () otherlv_18= Parent ) | ( () ( (otherlv_20= RULE_ID ) ) ) | ( () otherlv_22= LeftParenthesis ( (lv_expression_23_0= ruleBSExpression ) ) otherlv_24= RightParenthesis ) )
            int alt64=10;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt64=1;
                }
                break;
            case RULE_HEX_VALUE:
                {
                alt64=2;
                }
                break;
            case RULE_INT:
                {
                alt64=3;
                }
                break;
            case False:
            case True:
                {
                alt64=4;
                }
                break;
            case Null:
                {
                alt64=5;
                }
                break;
            case This:
                {
                alt64=6;
                }
                break;
            case Client:
                {
                alt64=7;
                }
                break;
            case Parent:
                {
                alt64=8;
                }
                break;
            case RULE_ID:
                {
                alt64=9;
                }
                break;
            case LeftParenthesis:
                {
                alt64=10;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 64, 0, input);

                throw nvae;
            }

            switch (alt64) {
                case 1 :
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3547:2: ( () ( (lv_value_1_0= RULE_STRING ) ) )
                    {
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3547:2: ( () ( (lv_value_1_0= RULE_STRING ) ) )
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3547:3: () ( (lv_value_1_0= RULE_STRING ) )
                    {
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3547:3: ()
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3548:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getBSTerminalExpressionAccess().getBSStringConstantAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3553:2: ( (lv_value_1_0= RULE_STRING ) )
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3554:1: (lv_value_1_0= RULE_STRING )
                    {
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3554:1: (lv_value_1_0= RULE_STRING )
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3555:3: lv_value_1_0= RULE_STRING
                    {
                    lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleBSTerminalExpression7608); if (state.failed) return current;
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
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3572:6: ( () ( (lv_value_3_0= RULE_HEX_VALUE ) ) )
                    {
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3572:6: ( () ( (lv_value_3_0= RULE_HEX_VALUE ) ) )
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3572:7: () ( (lv_value_3_0= RULE_HEX_VALUE ) )
                    {
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3572:7: ()
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3573:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getBSTerminalExpressionAccess().getBSHexadecimalConstantAction_1_0(),
                                  current);
                          
                    }

                    }

                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3578:2: ( (lv_value_3_0= RULE_HEX_VALUE ) )
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3579:1: (lv_value_3_0= RULE_HEX_VALUE )
                    {
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3579:1: (lv_value_3_0= RULE_HEX_VALUE )
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3580:3: lv_value_3_0= RULE_HEX_VALUE
                    {
                    lv_value_3_0=(Token)match(input,RULE_HEX_VALUE,FOLLOW_RULE_HEX_VALUE_in_ruleBSTerminalExpression7647); if (state.failed) return current;
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
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3597:6: ( () ( (lv_value_5_0= RULE_INT ) ) ( ( ( FullStop )=>otherlv_6= FullStop ) () ( (lv_right_8_0= RULE_INT ) ) )? )
                    {
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3597:6: ( () ( (lv_value_5_0= RULE_INT ) ) ( ( ( FullStop )=>otherlv_6= FullStop ) () ( (lv_right_8_0= RULE_INT ) ) )? )
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3597:7: () ( (lv_value_5_0= RULE_INT ) ) ( ( ( FullStop )=>otherlv_6= FullStop ) () ( (lv_right_8_0= RULE_INT ) ) )?
                    {
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3597:7: ()
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3598:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getBSTerminalExpressionAccess().getBSNumberConstantAction_2_0(),
                                  current);
                          
                    }

                    }

                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3603:2: ( (lv_value_5_0= RULE_INT ) )
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3604:1: (lv_value_5_0= RULE_INT )
                    {
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3604:1: (lv_value_5_0= RULE_INT )
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3605:3: lv_value_5_0= RULE_INT
                    {
                    lv_value_5_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleBSTerminalExpression7686); if (state.failed) return current;
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

                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3621:2: ( ( ( FullStop )=>otherlv_6= FullStop ) () ( (lv_right_8_0= RULE_INT ) ) )?
                    int alt62=2;
                    int LA62_0 = input.LA(1);

                    if ( (LA62_0==FullStop) ) {
                        int LA62_1 = input.LA(2);

                        if ( (LA62_1==RULE_INT) ) {
                            int LA62_3 = input.LA(3);

                            if ( (synpred2_InternalBlorqueScriptParser()) ) {
                                alt62=1;
                            }
                        }
                    }
                    switch (alt62) {
                        case 1 :
                            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3621:3: ( ( FullStop )=>otherlv_6= FullStop ) () ( (lv_right_8_0= RULE_INT ) )
                            {
                            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3621:3: ( ( FullStop )=>otherlv_6= FullStop )
                            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3621:4: ( FullStop )=>otherlv_6= FullStop
                            {
                            otherlv_6=(Token)match(input,FullStop,FOLLOW_FullStop_in_ruleBSTerminalExpression7712); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_6, grammarAccess.getBSTerminalExpressionAccess().getFullStopKeyword_2_2_0());
                                  
                            }

                            }

                            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3628:2: ()
                            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3629:5: 
                            {
                            if ( state.backtracking==0 ) {

                                      current = forceCreateModelElementAndSet(
                                          grammarAccess.getBSTerminalExpressionAccess().getBSRealConstantLeftAction_2_2_1(),
                                          current);
                                  
                            }

                            }

                            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3634:2: ( (lv_right_8_0= RULE_INT ) )
                            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3635:1: (lv_right_8_0= RULE_INT )
                            {
                            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3635:1: (lv_right_8_0= RULE_INT )
                            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3636:3: lv_right_8_0= RULE_INT
                            {
                            lv_right_8_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleBSTerminalExpression7738); if (state.failed) return current;
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
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3653:6: ( () ( ( (lv_value_10_1= True | lv_value_10_2= False ) ) ) )
                    {
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3653:6: ( () ( ( (lv_value_10_1= True | lv_value_10_2= False ) ) ) )
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3653:7: () ( ( (lv_value_10_1= True | lv_value_10_2= False ) ) )
                    {
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3653:7: ()
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3654:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getBSTerminalExpressionAccess().getBSBooleanConstantAction_3_0(),
                                  current);
                          
                    }

                    }

                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3659:2: ( ( (lv_value_10_1= True | lv_value_10_2= False ) ) )
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3660:1: ( (lv_value_10_1= True | lv_value_10_2= False ) )
                    {
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3660:1: ( (lv_value_10_1= True | lv_value_10_2= False ) )
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3661:1: (lv_value_10_1= True | lv_value_10_2= False )
                    {
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3661:1: (lv_value_10_1= True | lv_value_10_2= False )
                    int alt63=2;
                    int LA63_0 = input.LA(1);

                    if ( (LA63_0==True) ) {
                        alt63=1;
                    }
                    else if ( (LA63_0==False) ) {
                        alt63=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 63, 0, input);

                        throw nvae;
                    }
                    switch (alt63) {
                        case 1 :
                            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3662:3: lv_value_10_1= True
                            {
                            lv_value_10_1=(Token)match(input,True,FOLLOW_True_in_ruleBSTerminalExpression7783); if (state.failed) return current;
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
                            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3675:8: lv_value_10_2= False
                            {
                            lv_value_10_2=(Token)match(input,False,FOLLOW_False_in_ruleBSTerminalExpression7811); if (state.failed) return current;
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
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3692:6: ( () otherlv_12= Null )
                    {
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3692:6: ( () otherlv_12= Null )
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3692:7: () otherlv_12= Null
                    {
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3692:7: ()
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3693:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getBSTerminalExpressionAccess().getBSNullLiteralAction_4_0(),
                                  current);
                          
                    }

                    }

                    otherlv_12=(Token)match(input,Null,FOLLOW_Null_in_ruleBSTerminalExpression7855); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_12, grammarAccess.getBSTerminalExpressionAccess().getNullKeyword_4_1());
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3704:6: ( () otherlv_14= This )
                    {
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3704:6: ( () otherlv_14= This )
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3704:7: () otherlv_14= This
                    {
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3704:7: ()
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3705:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getBSTerminalExpressionAccess().getBSThisLiteralAction_5_0(),
                                  current);
                          
                    }

                    }

                    otherlv_14=(Token)match(input,This,FOLLOW_This_in_ruleBSTerminalExpression7884); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_14, grammarAccess.getBSTerminalExpressionAccess().getThisKeyword_5_1());
                          
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3716:6: ( () otherlv_16= Client )
                    {
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3716:6: ( () otherlv_16= Client )
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3716:7: () otherlv_16= Client
                    {
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3716:7: ()
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3717:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getBSTerminalExpressionAccess().getBSClientLiteralAction_6_0(),
                                  current);
                          
                    }

                    }

                    otherlv_16=(Token)match(input,Client,FOLLOW_Client_in_ruleBSTerminalExpression7913); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_16, grammarAccess.getBSTerminalExpressionAccess().getClientKeyword_6_1());
                          
                    }

                    }


                    }
                    break;
                case 8 :
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3728:6: ( () otherlv_18= Parent )
                    {
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3728:6: ( () otherlv_18= Parent )
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3728:7: () otherlv_18= Parent
                    {
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3728:7: ()
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3729:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getBSTerminalExpressionAccess().getBSParentLiteralAction_7_0(),
                                  current);
                          
                    }

                    }

                    otherlv_18=(Token)match(input,Parent,FOLLOW_Parent_in_ruleBSTerminalExpression7942); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_18, grammarAccess.getBSTerminalExpressionAccess().getParentKeyword_7_1());
                          
                    }

                    }


                    }
                    break;
                case 9 :
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3740:6: ( () ( (otherlv_20= RULE_ID ) ) )
                    {
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3740:6: ( () ( (otherlv_20= RULE_ID ) ) )
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3740:7: () ( (otherlv_20= RULE_ID ) )
                    {
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3740:7: ()
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3741:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getBSTerminalExpressionAccess().getBSSymbolRefAction_8_0(),
                                  current);
                          
                    }

                    }

                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3746:2: ( (otherlv_20= RULE_ID ) )
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3747:1: (otherlv_20= RULE_ID )
                    {
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3747:1: (otherlv_20= RULE_ID )
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3748:3: otherlv_20= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getBSTerminalExpressionRule());
                      	        }
                              
                    }
                    otherlv_20=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBSTerminalExpression7978); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_20, grammarAccess.getBSTerminalExpressionAccess().getSymbolBSSymbolCrossReference_8_1_0()); 
                      	
                    }

                    }


                    }


                    }


                    }
                    break;
                case 10 :
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3760:6: ( () otherlv_22= LeftParenthesis ( (lv_expression_23_0= ruleBSExpression ) ) otherlv_24= RightParenthesis )
                    {
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3760:6: ( () otherlv_22= LeftParenthesis ( (lv_expression_23_0= ruleBSExpression ) ) otherlv_24= RightParenthesis )
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3760:7: () otherlv_22= LeftParenthesis ( (lv_expression_23_0= ruleBSExpression ) ) otherlv_24= RightParenthesis
                    {
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3760:7: ()
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3761:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getBSTerminalExpressionAccess().getBSParentheticalExpressionAction_9_0(),
                                  current);
                          
                    }

                    }

                    otherlv_22=(Token)match(input,LeftParenthesis,FOLLOW_LeftParenthesis_in_ruleBSTerminalExpression8008); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_22, grammarAccess.getBSTerminalExpressionAccess().getLeftParenthesisKeyword_9_1());
                          
                    }
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3771:1: ( (lv_expression_23_0= ruleBSExpression ) )
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3772:1: (lv_expression_23_0= ruleBSExpression )
                    {
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3772:1: (lv_expression_23_0= ruleBSExpression )
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3773:3: lv_expression_23_0= ruleBSExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getBSTerminalExpressionAccess().getExpressionBSExpressionParserRuleCall_9_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBSExpression_in_ruleBSTerminalExpression8028);
                    lv_expression_23_0=ruleBSExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getBSTerminalExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"expression",
                              		lv_expression_23_0, 
                              		"BSExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_24=(Token)match(input,RightParenthesis,FOLLOW_RightParenthesis_in_ruleBSTerminalExpression8041); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_24, grammarAccess.getBSTerminalExpressionAccess().getRightParenthesisKeyword_9_3());
                          
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


    // $ANTLR start "ruleBSPrimitiveType"
    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3802:1: ruleBSPrimitiveType returns [Enumerator current=null] : ( (enumLiteral_0= NONE ) | (enumLiteral_1= String ) | (enumLiteral_2= TaggedString ) | (enumLiteral_3= Number ) | (enumLiteral_4= Object ) | (enumLiteral_5= Void ) ) ;
    public final Enumerator ruleBSPrimitiveType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;

         enterRule(); 
        try {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3804:28: ( ( (enumLiteral_0= NONE ) | (enumLiteral_1= String ) | (enumLiteral_2= TaggedString ) | (enumLiteral_3= Number ) | (enumLiteral_4= Object ) | (enumLiteral_5= Void ) ) )
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3805:1: ( (enumLiteral_0= NONE ) | (enumLiteral_1= String ) | (enumLiteral_2= TaggedString ) | (enumLiteral_3= Number ) | (enumLiteral_4= Object ) | (enumLiteral_5= Void ) )
            {
            // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3805:1: ( (enumLiteral_0= NONE ) | (enumLiteral_1= String ) | (enumLiteral_2= TaggedString ) | (enumLiteral_3= Number ) | (enumLiteral_4= Object ) | (enumLiteral_5= Void ) )
            int alt65=6;
            switch ( input.LA(1) ) {
            case NONE:
                {
                alt65=1;
                }
                break;
            case String:
                {
                alt65=2;
                }
                break;
            case TaggedString:
                {
                alt65=3;
                }
                break;
            case Number:
                {
                alt65=4;
                }
                break;
            case Object:
                {
                alt65=5;
                }
                break;
            case Void:
                {
                alt65=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 65, 0, input);

                throw nvae;
            }

            switch (alt65) {
                case 1 :
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3805:2: (enumLiteral_0= NONE )
                    {
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3805:2: (enumLiteral_0= NONE )
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3805:7: enumLiteral_0= NONE
                    {
                    enumLiteral_0=(Token)match(input,NONE,FOLLOW_NONE_in_ruleBSPrimitiveType8094); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getBSPrimitiveTypeAccess().getNONEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getBSPrimitiveTypeAccess().getNONEEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3811:6: (enumLiteral_1= String )
                    {
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3811:6: (enumLiteral_1= String )
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3811:11: enumLiteral_1= String
                    {
                    enumLiteral_1=(Token)match(input,String,FOLLOW_String_in_ruleBSPrimitiveType8116); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getBSPrimitiveTypeAccess().getSTRINGEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getBSPrimitiveTypeAccess().getSTRINGEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3817:6: (enumLiteral_2= TaggedString )
                    {
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3817:6: (enumLiteral_2= TaggedString )
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3817:11: enumLiteral_2= TaggedString
                    {
                    enumLiteral_2=(Token)match(input,TaggedString,FOLLOW_TaggedString_in_ruleBSPrimitiveType8138); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getBSPrimitiveTypeAccess().getTAGGED_STRINGEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getBSPrimitiveTypeAccess().getTAGGED_STRINGEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3823:6: (enumLiteral_3= Number )
                    {
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3823:6: (enumLiteral_3= Number )
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3823:11: enumLiteral_3= Number
                    {
                    enumLiteral_3=(Token)match(input,Number,FOLLOW_Number_in_ruleBSPrimitiveType8160); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getBSPrimitiveTypeAccess().getNUMBEREnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getBSPrimitiveTypeAccess().getNUMBEREnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3829:6: (enumLiteral_4= Object )
                    {
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3829:6: (enumLiteral_4= Object )
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3829:11: enumLiteral_4= Object
                    {
                    enumLiteral_4=(Token)match(input,Object,FOLLOW_Object_in_ruleBSPrimitiveType8182); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getBSPrimitiveTypeAccess().getOBJECTEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getBSPrimitiveTypeAccess().getOBJECTEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3835:6: (enumLiteral_5= Void )
                    {
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3835:6: (enumLiteral_5= Void )
                    // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3835:11: enumLiteral_5= Void
                    {
                    enumLiteral_5=(Token)match(input,Void,FOLLOW_Void_in_ruleBSPrimitiveType8204); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getBSPrimitiveTypeAccess().getVOIDEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_5, grammarAccess.getBSPrimitiveTypeAccess().getVOIDEnumLiteralDeclaration_5()); 
                          
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
    // $ANTLR end "ruleBSPrimitiveType"

    // $ANTLR start synpred1_InternalBlorqueScriptParser
    public final void synpred1_InternalBlorqueScriptParser_fragment() throws RecognitionException {   
        // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1229:4: ( Else )
        // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:1230:1: Else
        {
        match(input,Else,FOLLOW_Else_in_synpred1_InternalBlorqueScriptParser2680); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalBlorqueScriptParser

    // $ANTLR start synpred2_InternalBlorqueScriptParser
    public final void synpred2_InternalBlorqueScriptParser_fragment() throws RecognitionException {   
        // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3621:4: ( FullStop )
        // ../org.example.blorquescript/src-gen/org/example/blorquescript/parser/antlr/internal/InternalBlorqueScriptParser.g:3622:1: FullStop
        {
        match(input,FullStop,FOLLOW_FullStop_in_synpred2_InternalBlorqueScriptParser7704); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_InternalBlorqueScriptParser

    // Delegated rules

    public final boolean synpred2_InternalBlorqueScriptParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalBlorqueScriptParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
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
    protected DFA18 dfa18 = new DFA18(this);
    static final String DFA8_eotS =
        "\15\uffff";
    static final String DFA8_eofS =
        "\15\uffff";
    static final String DFA8_minS =
        "\1\4\6\112\1\101\1\73\1\uffff\1\122\1\uffff\1\101";
    static final String DFA8_maxS =
        "\10\122\1\112\1\uffff\1\122\1\uffff\1\122";
    static final String DFA8_acceptS =
        "\11\uffff\1\2\1\uffff\1\1\1\uffff";
    static final String DFA8_specialS =
        "\15\uffff}>";
    static final String[] DFA8_transitionS = {
            "\1\3\5\uffff\1\4\1\5\2\uffff\1\2\5\uffff\1\1\5\uffff\1\6\67"+
            "\uffff\1\7",
            "\1\11\7\uffff\1\10",
            "\1\11\7\uffff\1\10",
            "\1\11\7\uffff\1\10",
            "\1\11\7\uffff\1\10",
            "\1\11\7\uffff\1\10",
            "\1\11\7\uffff\1\10",
            "\1\12\10\uffff\1\11\7\uffff\1\10",
            "\1\11\10\uffff\1\13\5\uffff\1\13",
            "",
            "\1\14",
            "",
            "\1\12\10\uffff\1\11\7\uffff\1\10"
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
            return "382:1: (this_BSField_0= ruleBSField | this_BSMethod_1= ruleBSMethod )";
        }
    }
    static final String DFA18_eotS =
        "\15\uffff";
    static final String DFA18_eofS =
        "\15\uffff";
    static final String DFA18_minS =
        "\1\4\1\uffff\1\33\10\uffff\1\10\1\33";
    static final String DFA18_maxS =
        "\1\125\1\uffff\1\122\10\uffff\1\125\1\122";
    static final String DFA18_acceptS =
        "\1\uffff\1\1\1\uffff\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\2\uffff";
    static final String DFA18_specialS =
        "\15\uffff}>";
    static final String[] DFA18_transitionS = {
            "\1\1\1\5\2\uffff\1\6\1\uffff\2\1\1\6\1\3\1\1\1\12\1\4\1\uffff"+
            "\1\6\1\10\1\1\2\uffff\3\6\1\1\4\uffff\1\11\1\6\23\uffff\1\7"+
            "\2\uffff\1\6\3\uffff\1\6\2\uffff\1\6\1\uffff\1\6\17\uffff\2"+
            "\6\1\2\1\6\1\uffff\1\6",
            "",
            "\4\6\2\uffff\11\6\1\uffff\11\6\1\uffff\2\6\2\uffff\3\6\1\uffff"+
            "\2\6\1\uffff\1\6\1\13\1\6\1\uffff\7\6\1\uffff\1\6\1\uffff\1"+
            "\6\3\uffff\1\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\6\3\uffff\1\6\5\uffff\1\6\4\uffff\3\6\41\uffff\1\6\25\uffff"+
            "\1\6\1\14\1\6\1\uffff\1\6",
            "\4\6\2\uffff\11\6\1\uffff\11\6\1\uffff\2\6\2\uffff\3\6\1\uffff"+
            "\2\6\1\uffff\1\6\1\13\1\6\1\uffff\7\6\1\uffff\1\6\1\uffff\1"+
            "\6\3\uffff\1\1"
    };

    static final short[] DFA18_eot = DFA.unpackEncodedString(DFA18_eotS);
    static final short[] DFA18_eof = DFA.unpackEncodedString(DFA18_eofS);
    static final char[] DFA18_min = DFA.unpackEncodedStringToUnsignedChars(DFA18_minS);
    static final char[] DFA18_max = DFA.unpackEncodedStringToUnsignedChars(DFA18_maxS);
    static final short[] DFA18_accept = DFA.unpackEncodedString(DFA18_acceptS);
    static final short[] DFA18_special = DFA.unpackEncodedString(DFA18_specialS);
    static final short[][] DFA18_transition;

    static {
        int numStates = DFA18_transitionS.length;
        DFA18_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA18_transition[i] = DFA.unpackEncodedString(DFA18_transitionS[i]);
        }
    }

    class DFA18 extends DFA {

        public DFA18(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 18;
            this.eot = DFA18_eot;
            this.eof = DFA18_eof;
            this.min = DFA18_min;
            this.max = DFA18_max;
            this.accept = DFA18_accept;
            this.special = DFA18_special;
            this.transition = DFA18_transition;
        }
        public String getDescription() {
            return "833:1: (this_BSVariableDeclaration_0= ruleBSVariableDeclaration | this_BSReturn_1= ruleBSReturn | this_BSBreak_2= ruleBSBreak | this_BSContinue_3= ruleBSContinue | (this_BSExpression_4= ruleBSExpression otherlv_5= Semicolon ) | this_BSIfStatement_6= ruleBSIfStatement | this_BSWhileLoop_7= ruleBSWhileLoop | this_BSForLoop_8= ruleBSForLoop | this_BSSwitchStatement_9= ruleBSSwitchStatement )";
        }
    }
 

    public static final BitSet FOLLOW_ruleBSFile_in_entryRuleBSFile67 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBSFile77 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Package_in_ruleBSFile116 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleBSFile136 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_Semicolon_in_ruleBSFile149 = new BitSet(new long[]{0x0000000000020202L});
    public static final BitSet FOLLOW_ruleBSImport_in_ruleBSFile171 = new BitSet(new long[]{0x0000000000020202L});
    public static final BitSet FOLLOW_ruleBSClass_in_ruleBSFile193 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_ruleBSImport_in_entryRuleBSImport229 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBSImport239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Import_in_ruleBSImport277 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_ruleBSImport297 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_Semicolon_in_ruleBSImport310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard345 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildcard403 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_FullStopAsterisk_in_ruleQualifiedNameWithWildcard422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName464 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName515 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_FullStop_in_ruleQualifiedName534 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName549 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBSClass_in_entryRuleBSClass595 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBSClass605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Class_in_ruleBSClass643 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBSClass659 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002008L});
    public static final BitSet FOLLOW_Colon_in_ruleBSClass678 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleBSClass700 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_LeftCurlyBracket_in_ruleBSClass715 = new BitSet(new long[]{0x0000000004104C10L,0x0000000000048000L});
    public static final BitSet FOLLOW_ruleBSMember_in_ruleBSClass735 = new BitSet(new long[]{0x0000000004104C10L,0x0000000000048000L});
    public static final BitSet FOLLOW_RightCurlyBracket_in_ruleBSClass749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBSMember_in_entryRuleBSMember783 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBSMember793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBSField_in_ruleBSMember840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBSMethod_in_ruleBSMember867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBSField_in_entryRuleBSField901 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBSField911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBSPrimitiveType_in_ruleBSField958 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleBSField987 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBSField1005 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000410L});
    public static final BitSet FOLLOW_LeftSquareBracket_in_ruleBSField1030 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_RightSquareBracket_in_ruleBSField1054 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_Semicolon_in_ruleBSField1068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBSMethod_in_entryRuleBSMethod1102 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBSMethod1112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBSPrimitiveType_in_ruleBSMethod1159 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040400L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleBSMethod1188 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040400L});
    public static final BitSet FOLLOW_LeftSquareBracket_in_ruleBSMethod1209 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_RightSquareBracket_in_ruleBSMethod1233 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBSMethod1251 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_LeftParenthesis_in_ruleBSMethod1269 = new BitSet(new long[]{0x1000000004104C10L,0x0000000000040000L});
    public static final BitSet FOLLOW_ruleBSParameter_in_ruleBSMethod1290 = new BitSet(new long[]{0x9000000000000000L});
    public static final BitSet FOLLOW_Comma_in_ruleBSMethod1304 = new BitSet(new long[]{0x0000000004104C10L,0x0000000000040000L});
    public static final BitSet FOLLOW_ruleBSParameter_in_ruleBSMethod1324 = new BitSet(new long[]{0x9000000000000000L});
    public static final BitSet FOLLOW_RightParenthesis_in_ruleBSMethod1341 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_ruleBSMethodBody_in_ruleBSMethod1361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBSParameter_in_entryRuleBSParameter1396 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBSParameter1406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBSPrimitiveType_in_ruleBSParameter1453 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleBSParameter1482 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBSParameter1500 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
    public static final BitSet FOLLOW_LeftSquareBracket_in_ruleBSParameter1525 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_RightSquareBracket_in_ruleBSParameter1549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBSMethodBody_in_entryRuleBSMethodBody1585 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBSMethodBody1595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LeftCurlyBracket_in_ruleBSMethodBody1642 = new BitSet(new long[]{0x48900001879DFD30L,0x00000000002F8001L});
    public static final BitSet FOLLOW_ruleBSStatement_in_ruleBSMethodBody1662 = new BitSet(new long[]{0x48900001879DFD30L,0x00000000002F8001L});
    public static final BitSet FOLLOW_RightCurlyBracket_in_ruleBSMethodBody1676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBSStatement_in_entryRuleBSStatement1710 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBSStatement1720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBSVariableDeclaration_in_ruleBSStatement1767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBSReturn_in_ruleBSStatement1794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBSBreak_in_ruleBSStatement1821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBSContinue_in_ruleBSStatement1848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBSExpression_in_ruleBSStatement1876 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_Semicolon_in_ruleBSStatement1888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBSIfStatement_in_ruleBSStatement1916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBSWhileLoop_in_ruleBSStatement1943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBSForLoop_in_ruleBSStatement1970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBSSwitchStatement_in_ruleBSStatement1997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBSReturn_in_entryRuleBSReturn2031 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBSReturn2041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Return_in_ruleBSReturn2088 = new BitSet(new long[]{0x4880000103841100L,0x00000000002F0011L});
    public static final BitSet FOLLOW_ruleBSExpression_in_ruleBSReturn2108 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_Semicolon_in_ruleBSReturn2122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBSBreak_in_entryRuleBSBreak2156 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBSBreak2166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Break_in_ruleBSBreak2213 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_Semicolon_in_ruleBSBreak2225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBSContinue_in_entryRuleBSContinue2259 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBSContinue2269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Continue_in_ruleBSContinue2316 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_Semicolon_in_ruleBSContinue2328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBSVariableDeclaration_in_entryRuleBSVariableDeclaration2362 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBSVariableDeclaration2372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBSPrimitiveType_in_ruleBSVariableDeclaration2419 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleBSVariableDeclaration2448 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBSVariableDeclaration2466 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000050L});
    public static final BitSet FOLLOW_EqualsSign_in_ruleBSVariableDeclaration2485 = new BitSet(new long[]{0x4880000103841100L,0x00000000002F0001L});
    public static final BitSet FOLLOW_ruleBSExpression_in_ruleBSVariableDeclaration2505 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_Semicolon_in_ruleBSVariableDeclaration2520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBSIfStatement_in_entryRuleBSIfStatement2554 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBSIfStatement2564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_If_in_ruleBSIfStatement2602 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_LeftParenthesis_in_ruleBSIfStatement2614 = new BitSet(new long[]{0x4880000103841100L,0x00000000002F0001L});
    public static final BitSet FOLLOW_ruleBSExpression_in_ruleBSIfStatement2634 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_RightParenthesis_in_ruleBSIfStatement2647 = new BitSet(new long[]{0x48900001879DFD30L,0x00000000002F2001L});
    public static final BitSet FOLLOW_ruleBSIfBlock_in_ruleBSIfStatement2667 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_Else_in_ruleBSIfStatement2688 = new BitSet(new long[]{0x48900001879DFD30L,0x00000000002F2001L});
    public static final BitSet FOLLOW_ruleBSIfBlock_in_ruleBSIfStatement2709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBSWhileLoop_in_entryRuleBSWhileLoop2746 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBSWhileLoop2756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_While_in_ruleBSWhileLoop2794 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_LeftParenthesis_in_ruleBSWhileLoop2806 = new BitSet(new long[]{0x4880000103841100L,0x00000000002F0001L});
    public static final BitSet FOLLOW_ruleBSExpression_in_ruleBSWhileLoop2826 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_RightParenthesis_in_ruleBSWhileLoop2839 = new BitSet(new long[]{0x48900001879DFD30L,0x00000000002F2001L});
    public static final BitSet FOLLOW_ruleBSLoopBlock_in_ruleBSWhileLoop2859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBSForLoop_in_entryRuleBSForLoop2894 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBSForLoop2904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_For_in_ruleBSForLoop2942 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_LeftParenthesis_in_ruleBSForLoop2954 = new BitSet(new long[]{0x4880000103841100L,0x00000000002F0001L});
    public static final BitSet FOLLOW_ruleBSExpression_in_ruleBSForLoop2974 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_Semicolon_in_ruleBSForLoop2987 = new BitSet(new long[]{0x4880000103841100L,0x00000000002F0001L});
    public static final BitSet FOLLOW_ruleBSExpression_in_ruleBSForLoop3007 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_Semicolon_in_ruleBSForLoop3020 = new BitSet(new long[]{0x4880000103841100L,0x00000000002F0001L});
    public static final BitSet FOLLOW_ruleBSExpression_in_ruleBSForLoop3040 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_RightParenthesis_in_ruleBSForLoop3053 = new BitSet(new long[]{0x48900001879DFD30L,0x00000000002F2001L});
    public static final BitSet FOLLOW_ruleBSLoopBlock_in_ruleBSForLoop3073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBSSwitchStatement_in_entryRuleBSSwitchStatement3108 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBSSwitchStatement3118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Switch_in_ruleBSSwitchStatement3156 = new BitSet(new long[]{0x0900000000000000L});
    public static final BitSet FOLLOW_DollarSign_in_ruleBSSwitchStatement3174 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_LeftParenthesis_in_ruleBSSwitchStatement3199 = new BitSet(new long[]{0x4880000103841100L,0x00000000002F0001L});
    public static final BitSet FOLLOW_ruleBSExpression_in_ruleBSSwitchStatement3219 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_RightParenthesis_in_ruleBSSwitchStatement3232 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_ruleBSSwitchBlock_in_ruleBSSwitchStatement3252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBSIfBlock_in_entryRuleBSIfBlock3287 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBSIfBlock3297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBSStatement_in_ruleBSIfBlock3343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LeftCurlyBracket_in_ruleBSIfBlock3372 = new BitSet(new long[]{0x48900001879DFD30L,0x00000000002F8001L});
    public static final BitSet FOLLOW_ruleBSStatement_in_ruleBSIfBlock3392 = new BitSet(new long[]{0x48900001879DFD30L,0x00000000002F8001L});
    public static final BitSet FOLLOW_RightCurlyBracket_in_ruleBSIfBlock3406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBSLoopBlock_in_entryRuleBSLoopBlock3441 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBSLoopBlock3451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBSStatement_in_ruleBSLoopBlock3497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LeftCurlyBracket_in_ruleBSLoopBlock3526 = new BitSet(new long[]{0x48900001879DFD30L,0x00000000002F8001L});
    public static final BitSet FOLLOW_ruleBSStatement_in_ruleBSLoopBlock3546 = new BitSet(new long[]{0x48900001879DFD30L,0x00000000002F8001L});
    public static final BitSet FOLLOW_RightCurlyBracket_in_ruleBSLoopBlock3560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBSSwitchBlock_in_entryRuleBSSwitchBlock3595 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBSSwitchBlock3605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LeftCurlyBracket_in_ruleBSSwitchBlock3652 = new BitSet(new long[]{0x0000000000200040L,0x0000000000008000L});
    public static final BitSet FOLLOW_ruleBSCase_in_ruleBSSwitchBlock3672 = new BitSet(new long[]{0x0000000000200040L,0x0000000000008000L});
    public static final BitSet FOLLOW_RightCurlyBracket_in_ruleBSSwitchBlock3686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBSCase_in_entryRuleBSCase3720 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBSCase3730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Case_in_ruleBSCase3769 = new BitSet(new long[]{0x4880000103841100L,0x00000000002F0001L});
    public static final BitSet FOLLOW_ruleBSExpression_in_ruleBSCase3789 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_Colon_in_ruleBSCase3802 = new BitSet(new long[]{0x48900001879DFD30L,0x00000000002F0001L});
    public static final BitSet FOLLOW_ruleBSCaseBlock_in_ruleBSCase3822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Default_in_ruleBSCase3843 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_Colon_in_ruleBSCase3855 = new BitSet(new long[]{0x48900001879DFD30L,0x00000000002F0001L});
    public static final BitSet FOLLOW_ruleBSCaseBlock_in_ruleBSCase3875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBSCaseBlock_in_entryRuleBSCaseBlock3911 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBSCaseBlock3921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBSStatement_in_ruleBSCaseBlock3976 = new BitSet(new long[]{0x48900001879DFD32L,0x00000000002F0001L});
    public static final BitSet FOLLOW_ruleBSExpression_in_entryRuleBSExpression4016 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBSExpression4026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBSAssignmentOrTernaryExpression_in_ruleBSExpression4072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBSAssignmentOrTernaryExpression_in_entryRuleBSAssignmentOrTernaryExpression4105 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBSAssignmentOrTernaryExpression4115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBSBooleanOrExpression_in_ruleBSAssignmentOrTernaryExpression4162 = new BitSet(new long[]{0x002A0AB418000002L,0x0000000000000140L});
    public static final BitSet FOLLOW_EqualsSign_in_ruleBSAssignmentOrTernaryExpression4193 = new BitSet(new long[]{0x4880000103841100L,0x00000000002F0001L});
    public static final BitSet FOLLOW_CommercialAtEqualsSign_in_ruleBSAssignmentOrTernaryExpression4221 = new BitSet(new long[]{0x4880000103841100L,0x00000000002F0001L});
    public static final BitSet FOLLOW_PlusSignEqualsSign_in_ruleBSAssignmentOrTernaryExpression4249 = new BitSet(new long[]{0x4880000103841100L,0x00000000002F0001L});
    public static final BitSet FOLLOW_HyphenMinusEqualsSign_in_ruleBSAssignmentOrTernaryExpression4277 = new BitSet(new long[]{0x4880000103841100L,0x00000000002F0001L});
    public static final BitSet FOLLOW_AsteriskEqualsSign_in_ruleBSAssignmentOrTernaryExpression4305 = new BitSet(new long[]{0x4880000103841100L,0x00000000002F0001L});
    public static final BitSet FOLLOW_SolidusEqualsSign_in_ruleBSAssignmentOrTernaryExpression4333 = new BitSet(new long[]{0x4880000103841100L,0x00000000002F0001L});
    public static final BitSet FOLLOW_PercentSignEqualsSign_in_ruleBSAssignmentOrTernaryExpression4361 = new BitSet(new long[]{0x4880000103841100L,0x00000000002F0001L});
    public static final BitSet FOLLOW_LessThanSignLessThanSignEqualsSign_in_ruleBSAssignmentOrTernaryExpression4389 = new BitSet(new long[]{0x4880000103841100L,0x00000000002F0001L});
    public static final BitSet FOLLOW_GreaterThanSignGreaterThanSignEqualsSign_in_ruleBSAssignmentOrTernaryExpression4417 = new BitSet(new long[]{0x4880000103841100L,0x00000000002F0001L});
    public static final BitSet FOLLOW_AmpersandEqualsSign_in_ruleBSAssignmentOrTernaryExpression4445 = new BitSet(new long[]{0x4880000103841100L,0x00000000002F0001L});
    public static final BitSet FOLLOW_CircumflexAccentEqualsSign_in_ruleBSAssignmentOrTernaryExpression4473 = new BitSet(new long[]{0x4880000103841100L,0x00000000002F0001L});
    public static final BitSet FOLLOW_VerticalLineEqualsSign_in_ruleBSAssignmentOrTernaryExpression4501 = new BitSet(new long[]{0x4880000103841100L,0x00000000002F0001L});
    public static final BitSet FOLLOW_ruleBSExpression_in_ruleBSAssignmentOrTernaryExpression4536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QuestionMark_in_ruleBSAssignmentOrTernaryExpression4566 = new BitSet(new long[]{0x4880000103841100L,0x00000000002F0001L});
    public static final BitSet FOLLOW_ruleBSExpression_in_ruleBSAssignmentOrTernaryExpression4586 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_Colon_in_ruleBSAssignmentOrTernaryExpression4599 = new BitSet(new long[]{0x4880000103841100L,0x00000000002F0001L});
    public static final BitSet FOLLOW_ruleBSExpression_in_ruleBSAssignmentOrTernaryExpression4619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBSBooleanOrExpression_in_entryRuleBSBooleanOrExpression4657 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBSBooleanOrExpression4667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBSBooleanAndExpression_in_ruleBSBooleanOrExpression4714 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_VerticalLineVerticalLine_in_ruleBSBooleanOrExpression4736 = new BitSet(new long[]{0x4880000103841100L,0x00000000002F0001L});
    public static final BitSet FOLLOW_ruleBSBooleanAndExpression_in_ruleBSBooleanOrExpression4756 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_ruleBSBooleanAndExpression_in_entryRuleBSBooleanAndExpression4793 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBSBooleanAndExpression4803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBSBitwiseOrExpression_in_ruleBSBooleanAndExpression4850 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_AmpersandAmpersand_in_ruleBSBooleanAndExpression4872 = new BitSet(new long[]{0x4880000103841100L,0x00000000002F0001L});
    public static final BitSet FOLLOW_ruleBSBitwiseOrExpression_in_ruleBSBooleanAndExpression4892 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_ruleBSBitwiseOrExpression_in_entryRuleBSBitwiseOrExpression4929 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBSBitwiseOrExpression4939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBSBitwiseXorExpression_in_ruleBSBitwiseOrExpression4986 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
    public static final BitSet FOLLOW_VerticalLine_in_ruleBSBitwiseOrExpression5008 = new BitSet(new long[]{0x4880000103841100L,0x00000000002F0001L});
    public static final BitSet FOLLOW_ruleBSBitwiseXorExpression_in_ruleBSBitwiseOrExpression5028 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
    public static final BitSet FOLLOW_ruleBSBitwiseXorExpression_in_entryRuleBSBitwiseXorExpression5065 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBSBitwiseXorExpression5075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBSBitwiseAndExpression_in_ruleBSBitwiseXorExpression5122 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_CircumflexAccent_in_ruleBSBitwiseXorExpression5144 = new BitSet(new long[]{0x4880000103841100L,0x00000000002F0001L});
    public static final BitSet FOLLOW_ruleBSBitwiseAndExpression_in_ruleBSBitwiseXorExpression5164 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleBSBitwiseAndExpression_in_entryRuleBSBitwiseAndExpression5201 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBSBitwiseAndExpression5211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBSEqualityExpression_in_ruleBSBitwiseAndExpression5258 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_Ampersand_in_ruleBSBitwiseAndExpression5280 = new BitSet(new long[]{0x4880000103841100L,0x00000000002F0001L});
    public static final BitSet FOLLOW_ruleBSEqualityExpression_in_ruleBSBitwiseAndExpression5300 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_ruleBSEqualityExpression_in_entryRuleBSEqualityExpression5337 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBSEqualityExpression5347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBSOrderedRelationExpression_in_ruleBSEqualityExpression5394 = new BitSet(new long[]{0x0000400200000002L});
    public static final BitSet FOLLOW_EqualsSignEqualsSign_in_ruleBSEqualityExpression5424 = new BitSet(new long[]{0x4880000103841100L,0x00000000002F0001L});
    public static final BitSet FOLLOW_ExclamationMarkEqualsSign_in_ruleBSEqualityExpression5452 = new BitSet(new long[]{0x4880000103841100L,0x00000000002F0001L});
    public static final BitSet FOLLOW_ruleBSOrderedRelationExpression_in_ruleBSEqualityExpression5487 = new BitSet(new long[]{0x0000400200000002L});
    public static final BitSet FOLLOW_ruleBSOrderedRelationExpression_in_entryRuleBSOrderedRelationExpression5524 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBSOrderedRelationExpression5534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBSBitwiseShiftExpression_in_ruleBSOrderedRelationExpression5581 = new BitSet(new long[]{0x0000A00000000002L,0x00000000000000A0L});
    public static final BitSet FOLLOW_LessThanSign_in_ruleBSOrderedRelationExpression5611 = new BitSet(new long[]{0x4880000103841100L,0x00000000002F0001L});
    public static final BitSet FOLLOW_GreaterThanSign_in_ruleBSOrderedRelationExpression5639 = new BitSet(new long[]{0x4880000103841100L,0x00000000002F0001L});
    public static final BitSet FOLLOW_LessThanSignEqualsSign_in_ruleBSOrderedRelationExpression5667 = new BitSet(new long[]{0x4880000103841100L,0x00000000002F0001L});
    public static final BitSet FOLLOW_GreaterThanSignEqualsSign_in_ruleBSOrderedRelationExpression5695 = new BitSet(new long[]{0x4880000103841100L,0x00000000002F0001L});
    public static final BitSet FOLLOW_ruleBSBitwiseShiftExpression_in_ruleBSOrderedRelationExpression5730 = new BitSet(new long[]{0x0000A00000000002L,0x00000000000000A0L});
    public static final BitSet FOLLOW_ruleBSBitwiseShiftExpression_in_entryRuleBSBitwiseShiftExpression5767 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBSBitwiseShiftExpression5777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBSPlusMinusOrStringConcatExpression_in_ruleBSBitwiseShiftExpression5824 = new BitSet(new long[]{0x0001100000000002L});
    public static final BitSet FOLLOW_LessThanSignLessThanSign_in_ruleBSBitwiseShiftExpression5854 = new BitSet(new long[]{0x4880000103841100L,0x00000000002F0001L});
    public static final BitSet FOLLOW_GreaterThanSignGreaterThanSign_in_ruleBSBitwiseShiftExpression5882 = new BitSet(new long[]{0x4880000103841100L,0x00000000002F0001L});
    public static final BitSet FOLLOW_ruleBSPlusMinusOrStringConcatExpression_in_ruleBSBitwiseShiftExpression5917 = new BitSet(new long[]{0x0001100000000002L});
    public static final BitSet FOLLOW_ruleBSPlusMinusOrStringConcatExpression_in_entryRuleBSPlusMinusOrStringConcatExpression5954 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBSPlusMinusOrStringConcatExpression5964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBSMulDivOrModExpression_in_ruleBSPlusMinusOrStringConcatExpression6011 = new BitSet(new long[]{0x4004000060000002L,0x0000000000000201L});
    public static final BitSet FOLLOW_PlusSign_in_ruleBSPlusMinusOrStringConcatExpression6041 = new BitSet(new long[]{0x4880000103841100L,0x00000000002F0001L});
    public static final BitSet FOLLOW_HyphenMinus_in_ruleBSPlusMinusOrStringConcatExpression6069 = new BitSet(new long[]{0x4880000103841100L,0x00000000002F0001L});
    public static final BitSet FOLLOW_CommercialAt_in_ruleBSPlusMinusOrStringConcatExpression6097 = new BitSet(new long[]{0x4880000103841100L,0x00000000002F0001L});
    public static final BitSet FOLLOW_SPC_in_ruleBSPlusMinusOrStringConcatExpression6125 = new BitSet(new long[]{0x4880000103841100L,0x00000000002F0001L});
    public static final BitSet FOLLOW_NL_in_ruleBSPlusMinusOrStringConcatExpression6153 = new BitSet(new long[]{0x4880000103841100L,0x00000000002F0001L});
    public static final BitSet FOLLOW_TAB_in_ruleBSPlusMinusOrStringConcatExpression6181 = new BitSet(new long[]{0x4880000103841100L,0x00000000002F0001L});
    public static final BitSet FOLLOW_ruleBSMulDivOrModExpression_in_ruleBSPlusMinusOrStringConcatExpression6216 = new BitSet(new long[]{0x4004000060000002L,0x0000000000000201L});
    public static final BitSet FOLLOW_ruleBSMulDivOrModExpression_in_entryRuleBSMulDivOrModExpression6253 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBSMulDivOrModExpression6263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBSCastOrNewExpression_in_ruleBSMulDivOrModExpression6310 = new BitSet(new long[]{0x2200000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_Asterisk_in_ruleBSMulDivOrModExpression6340 = new BitSet(new long[]{0x4880000103841100L,0x00000000002F0001L});
    public static final BitSet FOLLOW_Solidus_in_ruleBSMulDivOrModExpression6368 = new BitSet(new long[]{0x4880000103841100L,0x00000000002F0001L});
    public static final BitSet FOLLOW_PercentSign_in_ruleBSMulDivOrModExpression6396 = new BitSet(new long[]{0x4880000103841100L,0x00000000002F0001L});
    public static final BitSet FOLLOW_ruleBSCastOrNewExpression_in_ruleBSMulDivOrModExpression6431 = new BitSet(new long[]{0x2200000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruleBSCastOrNewExpression_in_entryRuleBSCastOrNewExpression6468 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBSCastOrNewExpression6478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBSUnaryModifierExpression_in_ruleBSCastOrNewExpression6525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LeftParenthesis_in_ruleBSCastOrNewExpression6553 = new BitSet(new long[]{0x0000000004104C10L});
    public static final BitSet FOLLOW_ruleBSPrimitiveType_in_ruleBSCastOrNewExpression6573 = new BitSet(new long[]{0x1000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_LeftSquareBracket_in_ruleBSCastOrNewExpression6593 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_RightSquareBracket_in_ruleBSCastOrNewExpression6617 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_RightParenthesis_in_ruleBSCastOrNewExpression6631 = new BitSet(new long[]{0x4880000103841100L,0x00000000002F0001L});
    public static final BitSet FOLLOW_ruleBSCastOrNewExpression_in_ruleBSCastOrNewExpression6651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_New_in_ruleBSCastOrNewExpression6681 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleBSCastOrNewExpression6703 = new BitSet(new long[]{0x0800000000000002L,0x0000000000000400L});
    public static final BitSet FOLLOW_LeftSquareBracket_in_ruleBSCastOrNewExpression6724 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_RightSquareBracket_in_ruleBSCastOrNewExpression6748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LeftParenthesis_in_ruleBSCastOrNewExpression6769 = new BitSet(new long[]{0x5880000103841100L,0x00000000002F0001L});
    public static final BitSet FOLLOW_ruleBSExpression_in_ruleBSCastOrNewExpression6790 = new BitSet(new long[]{0x9000000000000000L});
    public static final BitSet FOLLOW_Comma_in_ruleBSCastOrNewExpression6804 = new BitSet(new long[]{0x4880000103841100L,0x00000000002F0001L});
    public static final BitSet FOLLOW_ruleBSExpression_in_ruleBSCastOrNewExpression6824 = new BitSet(new long[]{0x9000000000000000L});
    public static final BitSet FOLLOW_RightParenthesis_in_ruleBSCastOrNewExpression6841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBSUnaryModifierExpression_in_entryRuleBSUnaryModifierExpression6878 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBSUnaryModifierExpression6888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBSInvokationExpression_in_ruleBSUnaryModifierExpression6935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PlusSign_in_ruleBSUnaryModifierExpression6971 = new BitSet(new long[]{0x4880000003841100L,0x00000000002F0001L});
    public static final BitSet FOLLOW_HyphenMinus_in_ruleBSUnaryModifierExpression6999 = new BitSet(new long[]{0x4880000003841100L,0x00000000002F0001L});
    public static final BitSet FOLLOW_ExclamationMark_in_ruleBSUnaryModifierExpression7027 = new BitSet(new long[]{0x4880000003841100L,0x00000000002F0001L});
    public static final BitSet FOLLOW_Tilde_in_ruleBSUnaryModifierExpression7055 = new BitSet(new long[]{0x4880000003841100L,0x00000000002F0001L});
    public static final BitSet FOLLOW_ruleBSUnaryModifierExpression_in_ruleBSUnaryModifierExpression7090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBSInvokationExpression_in_entryRuleBSInvokationExpression7126 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBSInvokationExpression7136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBSTerminalExpression_in_ruleBSInvokationExpression7183 = new BitSet(new long[]{0x0800014000000002L,0x0000000000000402L});
    public static final BitSet FOLLOW_FullStop_in_ruleBSInvokationExpression7206 = new BitSet(new long[]{0x0800000003841100L,0x00000000002E0000L});
    public static final BitSet FOLLOW_ruleBSTerminalExpression_in_ruleBSInvokationExpression7226 = new BitSet(new long[]{0x0800014000000002L,0x0000000000000402L});
    public static final BitSet FOLLOW_LeftParenthesis_in_ruleBSInvokationExpression7256 = new BitSet(new long[]{0x5880000103841100L,0x00000000002F0001L});
    public static final BitSet FOLLOW_ruleBSExpression_in_ruleBSInvokationExpression7277 = new BitSet(new long[]{0x9000000000000000L});
    public static final BitSet FOLLOW_Comma_in_ruleBSInvokationExpression7291 = new BitSet(new long[]{0x4880000103841100L,0x00000000002F0001L});
    public static final BitSet FOLLOW_ruleBSExpression_in_ruleBSInvokationExpression7311 = new BitSet(new long[]{0x9000000000000000L});
    public static final BitSet FOLLOW_RightParenthesis_in_ruleBSInvokationExpression7328 = new BitSet(new long[]{0x0800014000000002L,0x0000000000000402L});
    public static final BitSet FOLLOW_LeftSquareBracket_in_ruleBSInvokationExpression7357 = new BitSet(new long[]{0x4880000103841100L,0x00000000002F0801L});
    public static final BitSet FOLLOW_ruleBSExpression_in_ruleBSInvokationExpression7378 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_Comma_in_ruleBSInvokationExpression7392 = new BitSet(new long[]{0x4880000103841100L,0x00000000002F0001L});
    public static final BitSet FOLLOW_ruleBSExpression_in_ruleBSInvokationExpression7412 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_RightSquareBracket_in_ruleBSInvokationExpression7429 = new BitSet(new long[]{0x0800014000000002L,0x0000000000000402L});
    public static final BitSet FOLLOW_PlusSignPlusSign_in_ruleBSInvokationExpression7466 = new BitSet(new long[]{0x0800014000000002L,0x0000000000000402L});
    public static final BitSet FOLLOW_HyphenMinusHyphenMinus_in_ruleBSInvokationExpression7494 = new BitSet(new long[]{0x0800014000000002L,0x0000000000000402L});
    public static final BitSet FOLLOW_ruleBSTerminalExpression_in_entryRuleBSTerminalExpression7546 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBSTerminalExpression7556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleBSTerminalExpression7608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HEX_VALUE_in_ruleBSTerminalExpression7647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleBSTerminalExpression7686 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_FullStop_in_ruleBSTerminalExpression7712 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleBSTerminalExpression7738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_True_in_ruleBSTerminalExpression7783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_False_in_ruleBSTerminalExpression7811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Null_in_ruleBSTerminalExpression7855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_This_in_ruleBSTerminalExpression7884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Client_in_ruleBSTerminalExpression7913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Parent_in_ruleBSTerminalExpression7942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBSTerminalExpression7978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LeftParenthesis_in_ruleBSTerminalExpression8008 = new BitSet(new long[]{0x4880000103841100L,0x00000000002F0001L});
    public static final BitSet FOLLOW_ruleBSExpression_in_ruleBSTerminalExpression8028 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_RightParenthesis_in_ruleBSTerminalExpression8041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NONE_in_ruleBSPrimitiveType8094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_String_in_ruleBSPrimitiveType8116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TaggedString_in_ruleBSPrimitiveType8138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Number_in_ruleBSPrimitiveType8160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Object_in_ruleBSPrimitiveType8182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Void_in_ruleBSPrimitiveType8204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Else_in_synpred1_InternalBlorqueScriptParser2680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FullStop_in_synpred2_InternalBlorqueScriptParser7704 = new BitSet(new long[]{0x0000000000000002L});

}