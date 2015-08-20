package org.xtext.example.blorquescript.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.blorquescript.services.BlorqueScriptGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalBlorqueScriptParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "';'", "'import'", "'.*'", "'.'", "'class'", "':'", "'{'", "'}'", "'('", "','", "')'", "'return'", "'='", "'if'", "'else'", "'string'", "'number'", "'object'", "'true'", "'false'", "'null'", "'this'", "'client'", "'new'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalBlorqueScriptParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalBlorqueScriptParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalBlorqueScriptParser.tokenNames; }
    public String getGrammarFileName() { return "../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g"; }



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
    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:67:1: entryRuleBSFile returns [EObject current=null] : iv_ruleBSFile= ruleBSFile EOF ;
    public final EObject entryRuleBSFile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBSFile = null;


        try {
            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:68:2: (iv_ruleBSFile= ruleBSFile EOF )
            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:69:2: iv_ruleBSFile= ruleBSFile EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBSFileRule()); 
            }
            pushFollow(FOLLOW_ruleBSFile_in_entryRuleBSFile75);
            iv_ruleBSFile=ruleBSFile();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBSFile; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBSFile85); if (state.failed) return current;

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
    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:76:1: ruleBSFile returns [EObject current=null] : ( (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= ';' )? ( (lv_imports_3_0= ruleBSImport ) )* ( (lv_classes_4_0= ruleBSClass ) )* ) ;
    public final EObject ruleBSFile() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_imports_3_0 = null;

        EObject lv_classes_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:79:28: ( ( (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= ';' )? ( (lv_imports_3_0= ruleBSImport ) )* ( (lv_classes_4_0= ruleBSClass ) )* ) )
            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:80:1: ( (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= ';' )? ( (lv_imports_3_0= ruleBSImport ) )* ( (lv_classes_4_0= ruleBSClass ) )* )
            {
            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:80:1: ( (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= ';' )? ( (lv_imports_3_0= ruleBSImport ) )* ( (lv_classes_4_0= ruleBSClass ) )* )
            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:80:2: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= ';' )? ( (lv_imports_3_0= ruleBSImport ) )* ( (lv_classes_4_0= ruleBSClass ) )*
            {
            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:80:2: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= ';' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==11) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:80:4: otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= ';'
                    {
                    otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleBSFile123); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getBSFileAccess().getPackageKeyword_0_0());
                          
                    }
                    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:84:1: ( (lv_name_1_0= ruleQualifiedName ) )
                    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:85:1: (lv_name_1_0= ruleQualifiedName )
                    {
                    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:85:1: (lv_name_1_0= ruleQualifiedName )
                    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:86:3: lv_name_1_0= ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getBSFileAccess().getNameQualifiedNameParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleBSFile144);
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

                    otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleBSFile156); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getBSFileAccess().getSemicolonKeyword_0_2());
                          
                    }

                    }
                    break;

            }

            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:106:3: ( (lv_imports_3_0= ruleBSImport ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==13) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:107:1: (lv_imports_3_0= ruleBSImport )
            	    {
            	    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:107:1: (lv_imports_3_0= ruleBSImport )
            	    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:108:3: lv_imports_3_0= ruleBSImport
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getBSFileAccess().getImportsBSImportParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleBSImport_in_ruleBSFile179);
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

            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:124:3: ( (lv_classes_4_0= ruleBSClass ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==16) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:125:1: (lv_classes_4_0= ruleBSClass )
            	    {
            	    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:125:1: (lv_classes_4_0= ruleBSClass )
            	    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:126:3: lv_classes_4_0= ruleBSClass
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getBSFileAccess().getClassesBSClassParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleBSClass_in_ruleBSFile201);
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
    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:150:1: entryRuleBSImport returns [EObject current=null] : iv_ruleBSImport= ruleBSImport EOF ;
    public final EObject entryRuleBSImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBSImport = null;


        try {
            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:151:2: (iv_ruleBSImport= ruleBSImport EOF )
            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:152:2: iv_ruleBSImport= ruleBSImport EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBSImportRule()); 
            }
            pushFollow(FOLLOW_ruleBSImport_in_entryRuleBSImport238);
            iv_ruleBSImport=ruleBSImport();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBSImport; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBSImport248); if (state.failed) return current;

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
    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:159:1: ruleBSImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) otherlv_2= ';' ) ;
    public final EObject ruleBSImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:162:28: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) otherlv_2= ';' ) )
            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:163:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) otherlv_2= ';' )
            {
            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:163:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) otherlv_2= ';' )
            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:163:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleBSImport285); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getBSImportAccess().getImportKeyword_0());
                  
            }
            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:167:1: ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:168:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            {
            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:168:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:169:3: lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getBSImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_ruleBSImport306);
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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleBSImport318); if (state.failed) return current;
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
    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:197:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:198:2: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:199:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameWithWildcardRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard355);
            iv_ruleQualifiedNameWithWildcard=ruleQualifiedNameWithWildcard();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedNameWithWildcard.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard366); if (state.failed) return current;

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
    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:206:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;


         enterRule(); 
            
        try {
            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:209:28: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) )
            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:210:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            {
            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:210:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:211:5: this_QualifiedName_0= ruleQualifiedName (kw= '.*' )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildcard413);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_QualifiedName_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:221:1: (kw= '.*' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==14) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:222:2: kw= '.*'
                    {
                    kw=(Token)match(input,14,FOLLOW_14_in_ruleQualifiedNameWithWildcard432); if (state.failed) return current;
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
    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:235:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:236:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:237:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName475);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName486); if (state.failed) return current;

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
    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:244:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:247:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:248:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:248:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:248:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName526); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:255:1: (kw= '.' this_ID_2= RULE_ID )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==15) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:256:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,15,FOLLOW_15_in_ruleQualifiedName545); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName560); if (state.failed) return current;
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
    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:276:1: entryRuleBSClass returns [EObject current=null] : iv_ruleBSClass= ruleBSClass EOF ;
    public final EObject entryRuleBSClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBSClass = null;


        try {
            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:277:2: (iv_ruleBSClass= ruleBSClass EOF )
            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:278:2: iv_ruleBSClass= ruleBSClass EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBSClassRule()); 
            }
            pushFollow(FOLLOW_ruleBSClass_in_entryRuleBSClass607);
            iv_ruleBSClass=ruleBSClass();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBSClass; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBSClass617); if (state.failed) return current;

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
    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:285:1: ruleBSClass returns [EObject current=null] : (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( ( ruleQualifiedName ) ) )? otherlv_4= '{' ( (lv_members_5_0= ruleBSMember ) )* otherlv_6= '}' ) ;
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
            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:288:28: ( (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( ( ruleQualifiedName ) ) )? otherlv_4= '{' ( (lv_members_5_0= ruleBSMember ) )* otherlv_6= '}' ) )
            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:289:1: (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( ( ruleQualifiedName ) ) )? otherlv_4= '{' ( (lv_members_5_0= ruleBSMember ) )* otherlv_6= '}' )
            {
            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:289:1: (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( ( ruleQualifiedName ) ) )? otherlv_4= '{' ( (lv_members_5_0= ruleBSMember ) )* otherlv_6= '}' )
            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:289:3: otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( ( ruleQualifiedName ) ) )? otherlv_4= '{' ( (lv_members_5_0= ruleBSMember ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleBSClass654); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getBSClassAccess().getClassKeyword_0());
                  
            }
            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:293:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:294:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:294:1: (lv_name_1_0= RULE_ID )
            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:295:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBSClass671); if (state.failed) return current;
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

            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:311:2: (otherlv_2= ':' ( ( ruleQualifiedName ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:311:4: otherlv_2= ':' ( ( ruleQualifiedName ) )
                    {
                    otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleBSClass689); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getBSClassAccess().getColonKeyword_2_0());
                          
                    }
                    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:315:1: ( ( ruleQualifiedName ) )
                    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:316:1: ( ruleQualifiedName )
                    {
                    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:316:1: ( ruleQualifiedName )
                    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:317:3: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getBSClassRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getBSClassAccess().getSuperclassBSClassCrossReference_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleBSClass712);
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

            otherlv_4=(Token)match(input,18,FOLLOW_18_in_ruleBSClass726); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getBSClassAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:334:1: ( (lv_members_5_0= ruleBSMember ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:335:1: (lv_members_5_0= ruleBSMember )
            	    {
            	    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:335:1: (lv_members_5_0= ruleBSMember )
            	    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:336:3: lv_members_5_0= ruleBSMember
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getBSClassAccess().getMembersBSMemberParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleBSMember_in_ruleBSClass747);
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

            otherlv_6=(Token)match(input,19,FOLLOW_19_in_ruleBSClass760); if (state.failed) return current;
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
    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:364:1: entryRuleBSMember returns [EObject current=null] : iv_ruleBSMember= ruleBSMember EOF ;
    public final EObject entryRuleBSMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBSMember = null;


        try {
            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:365:2: (iv_ruleBSMember= ruleBSMember EOF )
            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:366:2: iv_ruleBSMember= ruleBSMember EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBSMemberRule()); 
            }
            pushFollow(FOLLOW_ruleBSMember_in_entryRuleBSMember796);
            iv_ruleBSMember=ruleBSMember();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBSMember; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBSMember806); if (state.failed) return current;

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
    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:373:1: ruleBSMember returns [EObject current=null] : (this_BSField_0= ruleBSField | this_BSMethod_1= ruleBSMethod ) ;
    public final EObject ruleBSMember() throws RecognitionException {
        EObject current = null;

        EObject this_BSField_0 = null;

        EObject this_BSMethod_1 = null;


         enterRule(); 
            
        try {
            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:376:28: ( (this_BSField_0= ruleBSField | this_BSMethod_1= ruleBSMethod ) )
            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:377:1: (this_BSField_0= ruleBSField | this_BSMethod_1= ruleBSMethod )
            {
            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:377:1: (this_BSField_0= ruleBSField | this_BSMethod_1= ruleBSMethod )
            int alt8=2;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:378:5: this_BSField_0= ruleBSField
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBSMemberAccess().getBSFieldParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBSField_in_ruleBSMember853);
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
                    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:388:5: this_BSMethod_1= ruleBSMethod
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBSMemberAccess().getBSMethodParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBSMethod_in_ruleBSMember880);
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
    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:404:1: entryRuleBSField returns [EObject current=null] : iv_ruleBSField= ruleBSField EOF ;
    public final EObject entryRuleBSField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBSField = null;


        try {
            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:405:2: (iv_ruleBSField= ruleBSField EOF )
            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:406:2: iv_ruleBSField= ruleBSField EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBSFieldRule()); 
            }
            pushFollow(FOLLOW_ruleBSField_in_entryRuleBSField915);
            iv_ruleBSField=ruleBSField();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBSField; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBSField925); if (state.failed) return current;

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
    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:413:1: ruleBSField returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) ;
    public final EObject ruleBSField() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:416:28: ( ( ( ( ruleQualifiedName ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) )
            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:417:1: ( ( ( ruleQualifiedName ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            {
            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:417:1: ( ( ( ruleQualifiedName ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:417:2: ( ( ruleQualifiedName ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';'
            {
            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:417:2: ( ( ruleQualifiedName ) )
            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:418:1: ( ruleQualifiedName )
            {
            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:418:1: ( ruleQualifiedName )
            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:419:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getBSFieldRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getBSFieldAccess().getTypeBSClassCrossReference_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleBSField973);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:432:2: ( (lv_name_1_0= RULE_ID ) )
            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:433:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:433:1: (lv_name_1_0= RULE_ID )
            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:434:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBSField990); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleBSField1007); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getBSFieldAccess().getSemicolonKeyword_2());
                  
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
    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:462:1: entryRuleBSMethod returns [EObject current=null] : iv_ruleBSMethod= ruleBSMethod EOF ;
    public final EObject entryRuleBSMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBSMethod = null;


        try {
            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:463:2: (iv_ruleBSMethod= ruleBSMethod EOF )
            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:464:2: iv_ruleBSMethod= ruleBSMethod EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBSMethodRule()); 
            }
            pushFollow(FOLLOW_ruleBSMethod_in_entryRuleBSMethod1043);
            iv_ruleBSMethod=ruleBSMethod();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBSMethod; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBSMethod1053); if (state.failed) return current;

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
    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:471:1: ruleBSMethod returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_params_3_0= ruleBSParameter ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleBSParameter ) ) )* )? otherlv_6= ')' ( (lv_body_7_0= ruleBSMethodBody ) ) ) ;
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
            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:474:28: ( ( ( ( ruleQualifiedName ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_params_3_0= ruleBSParameter ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleBSParameter ) ) )* )? otherlv_6= ')' ( (lv_body_7_0= ruleBSMethodBody ) ) ) )
            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:475:1: ( ( ( ruleQualifiedName ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_params_3_0= ruleBSParameter ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleBSParameter ) ) )* )? otherlv_6= ')' ( (lv_body_7_0= ruleBSMethodBody ) ) )
            {
            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:475:1: ( ( ( ruleQualifiedName ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_params_3_0= ruleBSParameter ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleBSParameter ) ) )* )? otherlv_6= ')' ( (lv_body_7_0= ruleBSMethodBody ) ) )
            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:475:2: ( ( ruleQualifiedName ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_params_3_0= ruleBSParameter ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleBSParameter ) ) )* )? otherlv_6= ')' ( (lv_body_7_0= ruleBSMethodBody ) )
            {
            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:475:2: ( ( ruleQualifiedName ) )
            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:476:1: ( ruleQualifiedName )
            {
            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:476:1: ( ruleQualifiedName )
            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:477:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getBSMethodRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getBSMethodAccess().getTypeBSClassCrossReference_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleBSMethod1101);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:490:2: ( (lv_name_1_0= RULE_ID ) )
            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:491:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:491:1: (lv_name_1_0= RULE_ID )
            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:492:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBSMethod1118); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleBSMethod1135); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getBSMethodAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:512:1: ( ( (lv_params_3_0= ruleBSParameter ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleBSParameter ) ) )* )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:512:2: ( (lv_params_3_0= ruleBSParameter ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleBSParameter ) ) )*
                    {
                    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:512:2: ( (lv_params_3_0= ruleBSParameter ) )
                    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:513:1: (lv_params_3_0= ruleBSParameter )
                    {
                    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:513:1: (lv_params_3_0= ruleBSParameter )
                    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:514:3: lv_params_3_0= ruleBSParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getBSMethodAccess().getParamsBSParameterParserRuleCall_3_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBSParameter_in_ruleBSMethod1157);
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

                    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:530:2: (otherlv_4= ',' ( (lv_params_5_0= ruleBSParameter ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==21) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:530:4: otherlv_4= ',' ( (lv_params_5_0= ruleBSParameter ) )
                    	    {
                    	    otherlv_4=(Token)match(input,21,FOLLOW_21_in_ruleBSMethod1170); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getBSMethodAccess().getCommaKeyword_3_1_0());
                    	          
                    	    }
                    	    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:534:1: ( (lv_params_5_0= ruleBSParameter ) )
                    	    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:535:1: (lv_params_5_0= ruleBSParameter )
                    	    {
                    	    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:535:1: (lv_params_5_0= ruleBSParameter )
                    	    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:536:3: lv_params_5_0= ruleBSParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getBSMethodAccess().getParamsBSParameterParserRuleCall_3_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleBSParameter_in_ruleBSMethod1191);
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
                    	    break loop9;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,22,FOLLOW_22_in_ruleBSMethod1207); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getBSMethodAccess().getRightParenthesisKeyword_4());
                  
            }
            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:556:1: ( (lv_body_7_0= ruleBSMethodBody ) )
            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:557:1: (lv_body_7_0= ruleBSMethodBody )
            {
            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:557:1: (lv_body_7_0= ruleBSMethodBody )
            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:558:3: lv_body_7_0= ruleBSMethodBody
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getBSMethodAccess().getBodyBSMethodBodyParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleBSMethodBody_in_ruleBSMethod1228);
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
    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:582:1: entryRuleBSParameter returns [EObject current=null] : iv_ruleBSParameter= ruleBSParameter EOF ;
    public final EObject entryRuleBSParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBSParameter = null;


        try {
            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:583:2: (iv_ruleBSParameter= ruleBSParameter EOF )
            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:584:2: iv_ruleBSParameter= ruleBSParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBSParameterRule()); 
            }
            pushFollow(FOLLOW_ruleBSParameter_in_entryRuleBSParameter1264);
            iv_ruleBSParameter=ruleBSParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBSParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBSParameter1274); if (state.failed) return current;

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
    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:591:1: ruleBSParameter returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleBSParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:594:28: ( ( ( ( ruleQualifiedName ) ) ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:595:1: ( ( ( ruleQualifiedName ) ) ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:595:1: ( ( ( ruleQualifiedName ) ) ( (lv_name_1_0= RULE_ID ) ) )
            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:595:2: ( ( ruleQualifiedName ) ) ( (lv_name_1_0= RULE_ID ) )
            {
            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:595:2: ( ( ruleQualifiedName ) )
            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:596:1: ( ruleQualifiedName )
            {
            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:596:1: ( ruleQualifiedName )
            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:597:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getBSParameterRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getBSParameterAccess().getTypeBSClassCrossReference_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleBSParameter1322);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:610:2: ( (lv_name_1_0= RULE_ID ) )
            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:611:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:611:1: (lv_name_1_0= RULE_ID )
            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:612:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBSParameter1339); if (state.failed) return current;
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
    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:636:1: entryRuleBSMethodBody returns [EObject current=null] : iv_ruleBSMethodBody= ruleBSMethodBody EOF ;
    public final EObject entryRuleBSMethodBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBSMethodBody = null;


        try {
            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:637:2: (iv_ruleBSMethodBody= ruleBSMethodBody EOF )
            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:638:2: iv_ruleBSMethodBody= ruleBSMethodBody EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBSMethodBodyRule()); 
            }
            pushFollow(FOLLOW_ruleBSMethodBody_in_entryRuleBSMethodBody1380);
            iv_ruleBSMethodBody=ruleBSMethodBody();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBSMethodBody; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBSMethodBody1390); if (state.failed) return current;

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
    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:645:1: ruleBSMethodBody returns [EObject current=null] : ( () otherlv_1= '{' ( (lv_statements_2_0= ruleBSStatement ) )* otherlv_3= '}' ) ;
    public final EObject ruleBSMethodBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_statements_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:648:28: ( ( () otherlv_1= '{' ( (lv_statements_2_0= ruleBSStatement ) )* otherlv_3= '}' ) )
            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:649:1: ( () otherlv_1= '{' ( (lv_statements_2_0= ruleBSStatement ) )* otherlv_3= '}' )
            {
            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:649:1: ( () otherlv_1= '{' ( (lv_statements_2_0= ruleBSStatement ) )* otherlv_3= '}' )
            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:649:2: () otherlv_1= '{' ( (lv_statements_2_0= ruleBSStatement ) )* otherlv_3= '}'
            {
            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:649:2: ()
            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:650:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getBSMethodBodyAccess().getBSMethodBodyAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleBSMethodBody1436); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getBSMethodBodyAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:659:1: ( (lv_statements_2_0= ruleBSStatement ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=RULE_ID && LA11_0<=RULE_INT)||LA11_0==20||LA11_0==23||LA11_0==25||(LA11_0>=30 && LA11_0<=35)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:660:1: (lv_statements_2_0= ruleBSStatement )
            	    {
            	    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:660:1: (lv_statements_2_0= ruleBSStatement )
            	    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:661:3: lv_statements_2_0= ruleBSStatement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getBSMethodBodyAccess().getStatementsBSStatementParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleBSStatement_in_ruleBSMethodBody1457);
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
            	    break loop11;
                }
            } while (true);

            otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleBSMethodBody1470); if (state.failed) return current;
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
    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:689:1: entryRuleBSStatement returns [EObject current=null] : iv_ruleBSStatement= ruleBSStatement EOF ;
    public final EObject entryRuleBSStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBSStatement = null;


        try {
            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:690:2: (iv_ruleBSStatement= ruleBSStatement EOF )
            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:691:2: iv_ruleBSStatement= ruleBSStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBSStatementRule()); 
            }
            pushFollow(FOLLOW_ruleBSStatement_in_entryRuleBSStatement1506);
            iv_ruleBSStatement=ruleBSStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBSStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBSStatement1516); if (state.failed) return current;

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
    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:698:1: ruleBSStatement returns [EObject current=null] : (this_BSVariableDeclaration_0= ruleBSVariableDeclaration | this_BSReturn_1= ruleBSReturn | (this_BSExpression_2= ruleBSExpression otherlv_3= ';' ) | this_BSIfStatement_4= ruleBSIfStatement ) ;
    public final EObject ruleBSStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        EObject this_BSVariableDeclaration_0 = null;

        EObject this_BSReturn_1 = null;

        EObject this_BSExpression_2 = null;

        EObject this_BSIfStatement_4 = null;


         enterRule(); 
            
        try {
            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:701:28: ( (this_BSVariableDeclaration_0= ruleBSVariableDeclaration | this_BSReturn_1= ruleBSReturn | (this_BSExpression_2= ruleBSExpression otherlv_3= ';' ) | this_BSIfStatement_4= ruleBSIfStatement ) )
            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:702:1: (this_BSVariableDeclaration_0= ruleBSVariableDeclaration | this_BSReturn_1= ruleBSReturn | (this_BSExpression_2= ruleBSExpression otherlv_3= ';' ) | this_BSIfStatement_4= ruleBSIfStatement )
            {
            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:702:1: (this_BSVariableDeclaration_0= ruleBSVariableDeclaration | this_BSReturn_1= ruleBSReturn | (this_BSExpression_2= ruleBSExpression otherlv_3= ';' ) | this_BSIfStatement_4= ruleBSIfStatement )
            int alt12=4;
            alt12 = dfa12.predict(input);
            switch (alt12) {
                case 1 :
                    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:703:5: this_BSVariableDeclaration_0= ruleBSVariableDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBSStatementAccess().getBSVariableDeclarationParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBSVariableDeclaration_in_ruleBSStatement1563);
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
                    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:713:5: this_BSReturn_1= ruleBSReturn
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBSStatementAccess().getBSReturnParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBSReturn_in_ruleBSStatement1590);
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
                    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:722:6: (this_BSExpression_2= ruleBSExpression otherlv_3= ';' )
                    {
                    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:722:6: (this_BSExpression_2= ruleBSExpression otherlv_3= ';' )
                    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:723:5: this_BSExpression_2= ruleBSExpression otherlv_3= ';'
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBSStatementAccess().getBSExpressionParserRuleCall_2_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBSExpression_in_ruleBSStatement1618);
                    this_BSExpression_2=ruleBSExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_BSExpression_2; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_3=(Token)match(input,12,FOLLOW_12_in_ruleBSStatement1629); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getBSStatementAccess().getSemicolonKeyword_2_1());
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:737:5: this_BSIfStatement_4= ruleBSIfStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBSStatementAccess().getBSIfStatementParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBSIfStatement_in_ruleBSStatement1658);
                    this_BSIfStatement_4=ruleBSIfStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_BSIfStatement_4; 
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
    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:753:1: entryRuleBSReturn returns [EObject current=null] : iv_ruleBSReturn= ruleBSReturn EOF ;
    public final EObject entryRuleBSReturn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBSReturn = null;


        try {
            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:754:2: (iv_ruleBSReturn= ruleBSReturn EOF )
            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:755:2: iv_ruleBSReturn= ruleBSReturn EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBSReturnRule()); 
            }
            pushFollow(FOLLOW_ruleBSReturn_in_entryRuleBSReturn1693);
            iv_ruleBSReturn=ruleBSReturn();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBSReturn; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBSReturn1703); if (state.failed) return current;

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
    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:762:1: ruleBSReturn returns [EObject current=null] : (otherlv_0= 'return' ( (lv_expression_1_0= ruleBSExpression ) ) otherlv_2= ';' ) ;
    public final EObject ruleBSReturn() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_expression_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:765:28: ( (otherlv_0= 'return' ( (lv_expression_1_0= ruleBSExpression ) ) otherlv_2= ';' ) )
            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:766:1: (otherlv_0= 'return' ( (lv_expression_1_0= ruleBSExpression ) ) otherlv_2= ';' )
            {
            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:766:1: (otherlv_0= 'return' ( (lv_expression_1_0= ruleBSExpression ) ) otherlv_2= ';' )
            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:766:3: otherlv_0= 'return' ( (lv_expression_1_0= ruleBSExpression ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_23_in_ruleBSReturn1740); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getBSReturnAccess().getReturnKeyword_0());
                  
            }
            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:770:1: ( (lv_expression_1_0= ruleBSExpression ) )
            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:771:1: (lv_expression_1_0= ruleBSExpression )
            {
            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:771:1: (lv_expression_1_0= ruleBSExpression )
            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:772:3: lv_expression_1_0= ruleBSExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getBSReturnAccess().getExpressionBSExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleBSExpression_in_ruleBSReturn1761);
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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleBSReturn1773); if (state.failed) return current;
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
    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:800:1: entryRuleBSVariableDeclaration returns [EObject current=null] : iv_ruleBSVariableDeclaration= ruleBSVariableDeclaration EOF ;
    public final EObject entryRuleBSVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBSVariableDeclaration = null;


        try {
            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:801:2: (iv_ruleBSVariableDeclaration= ruleBSVariableDeclaration EOF )
            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:802:2: iv_ruleBSVariableDeclaration= ruleBSVariableDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBSVariableDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleBSVariableDeclaration_in_entryRuleBSVariableDeclaration1809);
            iv_ruleBSVariableDeclaration=ruleBSVariableDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBSVariableDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBSVariableDeclaration1819); if (state.failed) return current;

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
    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:809:1: ruleBSVariableDeclaration returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '=' ( (lv_expression_3_0= ruleBSExpression ) ) )? otherlv_4= ';' ) ;
    public final EObject ruleBSVariableDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_expression_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:812:28: ( ( ( ( ruleQualifiedName ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '=' ( (lv_expression_3_0= ruleBSExpression ) ) )? otherlv_4= ';' ) )
            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:813:1: ( ( ( ruleQualifiedName ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '=' ( (lv_expression_3_0= ruleBSExpression ) ) )? otherlv_4= ';' )
            {
            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:813:1: ( ( ( ruleQualifiedName ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '=' ( (lv_expression_3_0= ruleBSExpression ) ) )? otherlv_4= ';' )
            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:813:2: ( ( ruleQualifiedName ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '=' ( (lv_expression_3_0= ruleBSExpression ) ) )? otherlv_4= ';'
            {
            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:813:2: ( ( ruleQualifiedName ) )
            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:814:1: ( ruleQualifiedName )
            {
            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:814:1: ( ruleQualifiedName )
            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:815:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getBSVariableDeclarationRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getBSVariableDeclarationAccess().getTypeBSClassCrossReference_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleBSVariableDeclaration1867);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:828:2: ( (lv_name_1_0= RULE_ID ) )
            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:829:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:829:1: (lv_name_1_0= RULE_ID )
            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:830:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBSVariableDeclaration1884); if (state.failed) return current;
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

            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:846:2: (otherlv_2= '=' ( (lv_expression_3_0= ruleBSExpression ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==24) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:846:4: otherlv_2= '=' ( (lv_expression_3_0= ruleBSExpression ) )
                    {
                    otherlv_2=(Token)match(input,24,FOLLOW_24_in_ruleBSVariableDeclaration1902); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getBSVariableDeclarationAccess().getEqualsSignKeyword_2_0());
                          
                    }
                    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:850:1: ( (lv_expression_3_0= ruleBSExpression ) )
                    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:851:1: (lv_expression_3_0= ruleBSExpression )
                    {
                    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:851:1: (lv_expression_3_0= ruleBSExpression )
                    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:852:3: lv_expression_3_0= ruleBSExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getBSVariableDeclarationAccess().getExpressionBSExpressionParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBSExpression_in_ruleBSVariableDeclaration1923);
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

            otherlv_4=(Token)match(input,12,FOLLOW_12_in_ruleBSVariableDeclaration1937); if (state.failed) return current;
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
    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:880:1: entryRuleBSIfStatement returns [EObject current=null] : iv_ruleBSIfStatement= ruleBSIfStatement EOF ;
    public final EObject entryRuleBSIfStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBSIfStatement = null;


        try {
            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:881:2: (iv_ruleBSIfStatement= ruleBSIfStatement EOF )
            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:882:2: iv_ruleBSIfStatement= ruleBSIfStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBSIfStatementRule()); 
            }
            pushFollow(FOLLOW_ruleBSIfStatement_in_entryRuleBSIfStatement1973);
            iv_ruleBSIfStatement=ruleBSIfStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBSIfStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBSIfStatement1983); if (state.failed) return current;

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
    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:889:1: ruleBSIfStatement returns [EObject current=null] : (otherlv_0= 'if' otherlv_1= '(' ( (lv_expression_2_0= ruleBSExpression ) ) otherlv_3= ')' ( (lv_thenBlock_4_0= ruleBSIfBlock ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseBlock_6_0= ruleBSIfBlock ) ) )? ) ;
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
            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:892:28: ( (otherlv_0= 'if' otherlv_1= '(' ( (lv_expression_2_0= ruleBSExpression ) ) otherlv_3= ')' ( (lv_thenBlock_4_0= ruleBSIfBlock ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseBlock_6_0= ruleBSIfBlock ) ) )? ) )
            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:893:1: (otherlv_0= 'if' otherlv_1= '(' ( (lv_expression_2_0= ruleBSExpression ) ) otherlv_3= ')' ( (lv_thenBlock_4_0= ruleBSIfBlock ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseBlock_6_0= ruleBSIfBlock ) ) )? )
            {
            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:893:1: (otherlv_0= 'if' otherlv_1= '(' ( (lv_expression_2_0= ruleBSExpression ) ) otherlv_3= ')' ( (lv_thenBlock_4_0= ruleBSIfBlock ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseBlock_6_0= ruleBSIfBlock ) ) )? )
            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:893:3: otherlv_0= 'if' otherlv_1= '(' ( (lv_expression_2_0= ruleBSExpression ) ) otherlv_3= ')' ( (lv_thenBlock_4_0= ruleBSIfBlock ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseBlock_6_0= ruleBSIfBlock ) ) )?
            {
            otherlv_0=(Token)match(input,25,FOLLOW_25_in_ruleBSIfStatement2020); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getBSIfStatementAccess().getIfKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleBSIfStatement2032); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getBSIfStatementAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:901:1: ( (lv_expression_2_0= ruleBSExpression ) )
            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:902:1: (lv_expression_2_0= ruleBSExpression )
            {
            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:902:1: (lv_expression_2_0= ruleBSExpression )
            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:903:3: lv_expression_2_0= ruleBSExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getBSIfStatementAccess().getExpressionBSExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleBSExpression_in_ruleBSIfStatement2053);
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

            otherlv_3=(Token)match(input,22,FOLLOW_22_in_ruleBSIfStatement2065); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getBSIfStatementAccess().getRightParenthesisKeyword_3());
                  
            }
            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:923:1: ( (lv_thenBlock_4_0= ruleBSIfBlock ) )
            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:924:1: (lv_thenBlock_4_0= ruleBSIfBlock )
            {
            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:924:1: (lv_thenBlock_4_0= ruleBSIfBlock )
            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:925:3: lv_thenBlock_4_0= ruleBSIfBlock
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getBSIfStatementAccess().getThenBlockBSIfBlockParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleBSIfBlock_in_ruleBSIfStatement2086);
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

            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:941:2: ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseBlock_6_0= ruleBSIfBlock ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==26) ) {
                int LA14_1 = input.LA(2);

                if ( (synpred1_InternalBlorqueScript()) ) {
                    alt14=1;
                }
            }
            switch (alt14) {
                case 1 :
                    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:941:3: ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseBlock_6_0= ruleBSIfBlock ) )
                    {
                    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:941:3: ( ( 'else' )=>otherlv_5= 'else' )
                    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:941:4: ( 'else' )=>otherlv_5= 'else'
                    {
                    otherlv_5=(Token)match(input,26,FOLLOW_26_in_ruleBSIfStatement2107); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getBSIfStatementAccess().getElseKeyword_5_0());
                          
                    }

                    }

                    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:946:2: ( (lv_elseBlock_6_0= ruleBSIfBlock ) )
                    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:947:1: (lv_elseBlock_6_0= ruleBSIfBlock )
                    {
                    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:947:1: (lv_elseBlock_6_0= ruleBSIfBlock )
                    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:948:3: lv_elseBlock_6_0= ruleBSIfBlock
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getBSIfStatementAccess().getElseBlockBSIfBlockParserRuleCall_5_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBSIfBlock_in_ruleBSIfStatement2129);
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


    // $ANTLR start "entryRuleBSIfBlock"
    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:972:1: entryRuleBSIfBlock returns [EObject current=null] : iv_ruleBSIfBlock= ruleBSIfBlock EOF ;
    public final EObject entryRuleBSIfBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBSIfBlock = null;


        try {
            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:973:2: (iv_ruleBSIfBlock= ruleBSIfBlock EOF )
            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:974:2: iv_ruleBSIfBlock= ruleBSIfBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBSIfBlockRule()); 
            }
            pushFollow(FOLLOW_ruleBSIfBlock_in_entryRuleBSIfBlock2167);
            iv_ruleBSIfBlock=ruleBSIfBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBSIfBlock; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBSIfBlock2177); if (state.failed) return current;

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
    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:981:1: ruleBSIfBlock returns [EObject current=null] : ( ( (lv_statements_0_0= ruleBSStatement ) ) | (otherlv_1= '{' ( (lv_statements_2_0= ruleBSStatement ) )+ otherlv_3= '}' ) ) ;
    public final EObject ruleBSIfBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_statements_0_0 = null;

        EObject lv_statements_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:984:28: ( ( ( (lv_statements_0_0= ruleBSStatement ) ) | (otherlv_1= '{' ( (lv_statements_2_0= ruleBSStatement ) )+ otherlv_3= '}' ) ) )
            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:985:1: ( ( (lv_statements_0_0= ruleBSStatement ) ) | (otherlv_1= '{' ( (lv_statements_2_0= ruleBSStatement ) )+ otherlv_3= '}' ) )
            {
            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:985:1: ( ( (lv_statements_0_0= ruleBSStatement ) ) | (otherlv_1= '{' ( (lv_statements_2_0= ruleBSStatement ) )+ otherlv_3= '}' ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=RULE_ID && LA16_0<=RULE_INT)||LA16_0==20||LA16_0==23||LA16_0==25||(LA16_0>=30 && LA16_0<=35)) ) {
                alt16=1;
            }
            else if ( (LA16_0==18) ) {
                alt16=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:985:2: ( (lv_statements_0_0= ruleBSStatement ) )
                    {
                    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:985:2: ( (lv_statements_0_0= ruleBSStatement ) )
                    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:986:1: (lv_statements_0_0= ruleBSStatement )
                    {
                    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:986:1: (lv_statements_0_0= ruleBSStatement )
                    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:987:3: lv_statements_0_0= ruleBSStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getBSIfBlockAccess().getStatementsBSStatementParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBSStatement_in_ruleBSIfBlock2223);
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
                    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:1004:6: (otherlv_1= '{' ( (lv_statements_2_0= ruleBSStatement ) )+ otherlv_3= '}' )
                    {
                    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:1004:6: (otherlv_1= '{' ( (lv_statements_2_0= ruleBSStatement ) )+ otherlv_3= '}' )
                    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:1004:8: otherlv_1= '{' ( (lv_statements_2_0= ruleBSStatement ) )+ otherlv_3= '}'
                    {
                    otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleBSIfBlock2242); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getBSIfBlockAccess().getLeftCurlyBracketKeyword_1_0());
                          
                    }
                    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:1008:1: ( (lv_statements_2_0= ruleBSStatement ) )+
                    int cnt15=0;
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( ((LA15_0>=RULE_ID && LA15_0<=RULE_INT)||LA15_0==20||LA15_0==23||LA15_0==25||(LA15_0>=30 && LA15_0<=35)) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:1009:1: (lv_statements_2_0= ruleBSStatement )
                    	    {
                    	    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:1009:1: (lv_statements_2_0= ruleBSStatement )
                    	    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:1010:3: lv_statements_2_0= ruleBSStatement
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getBSIfBlockAccess().getStatementsBSStatementParserRuleCall_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleBSStatement_in_ruleBSIfBlock2263);
                    	    lv_statements_2_0=ruleBSStatement();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getBSIfBlockRule());
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
                    	    if ( cnt15 >= 1 ) break loop15;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(15, input);
                                throw eee;
                        }
                        cnt15++;
                    } while (true);

                    otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleBSIfBlock2276); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getBSIfBlockAccess().getRightCurlyBracketKeyword_1_2());
                          
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


    // $ANTLR start "entryRuleBSExpression"
    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:1042:1: entryRuleBSExpression returns [EObject current=null] : iv_ruleBSExpression= ruleBSExpression EOF ;
    public final EObject entryRuleBSExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBSExpression = null;


        try {
            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:1043:2: (iv_ruleBSExpression= ruleBSExpression EOF )
            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:1044:2: iv_ruleBSExpression= ruleBSExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBSExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleBSExpression_in_entryRuleBSExpression2317);
            iv_ruleBSExpression=ruleBSExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBSExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBSExpression2327); if (state.failed) return current;

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
    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:1051:1: ruleBSExpression returns [EObject current=null] : this_BSAssignment_0= ruleBSAssignment ;
    public final EObject ruleBSExpression() throws RecognitionException {
        EObject current = null;

        EObject this_BSAssignment_0 = null;


         enterRule(); 
            
        try {
            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:1054:28: (this_BSAssignment_0= ruleBSAssignment )
            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:1056:5: this_BSAssignment_0= ruleBSAssignment
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getBSExpressionAccess().getBSAssignmentParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleBSAssignment_in_ruleBSExpression2373);
            this_BSAssignment_0=ruleBSAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_BSAssignment_0; 
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


    // $ANTLR start "entryRuleBSAssignment"
    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:1072:1: entryRuleBSAssignment returns [EObject current=null] : iv_ruleBSAssignment= ruleBSAssignment EOF ;
    public final EObject entryRuleBSAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBSAssignment = null;


        try {
            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:1073:2: (iv_ruleBSAssignment= ruleBSAssignment EOF )
            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:1074:2: iv_ruleBSAssignment= ruleBSAssignment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBSAssignmentRule()); 
            }
            pushFollow(FOLLOW_ruleBSAssignment_in_entryRuleBSAssignment2407);
            iv_ruleBSAssignment=ruleBSAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBSAssignment; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBSAssignment2417); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBSAssignment"


    // $ANTLR start "ruleBSAssignment"
    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:1081:1: ruleBSAssignment returns [EObject current=null] : ( (this_BSCastingExpression_0= ruleBSCastingExpression | this_BSSelectionExpression_1= ruleBSSelectionExpression ) ( () otherlv_3= '=' ( (lv_right_4_0= ruleBSExpression ) ) )? ) ;
    public final EObject ruleBSAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        EObject this_BSCastingExpression_0 = null;

        EObject this_BSSelectionExpression_1 = null;

        EObject lv_right_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:1084:28: ( ( (this_BSCastingExpression_0= ruleBSCastingExpression | this_BSSelectionExpression_1= ruleBSSelectionExpression ) ( () otherlv_3= '=' ( (lv_right_4_0= ruleBSExpression ) ) )? ) )
            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:1085:1: ( (this_BSCastingExpression_0= ruleBSCastingExpression | this_BSSelectionExpression_1= ruleBSSelectionExpression ) ( () otherlv_3= '=' ( (lv_right_4_0= ruleBSExpression ) ) )? )
            {
            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:1085:1: ( (this_BSCastingExpression_0= ruleBSCastingExpression | this_BSSelectionExpression_1= ruleBSSelectionExpression ) ( () otherlv_3= '=' ( (lv_right_4_0= ruleBSExpression ) ) )? )
            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:1085:2: (this_BSCastingExpression_0= ruleBSCastingExpression | this_BSSelectionExpression_1= ruleBSSelectionExpression ) ( () otherlv_3= '=' ( (lv_right_4_0= ruleBSExpression ) ) )?
            {
            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:1085:2: (this_BSCastingExpression_0= ruleBSCastingExpression | this_BSSelectionExpression_1= ruleBSSelectionExpression )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==20) ) {
                int LA17_1 = input.LA(2);

                if ( ((LA17_1>=RULE_ID && LA17_1<=RULE_INT)||LA17_1==20||(LA17_1>=30 && LA17_1<=35)) ) {
                    alt17=2;
                }
                else if ( ((LA17_1>=27 && LA17_1<=29)) ) {
                    alt17=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 17, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA17_0>=RULE_ID && LA17_0<=RULE_INT)||(LA17_0>=30 && LA17_0<=35)) ) {
                alt17=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:1086:5: this_BSCastingExpression_0= ruleBSCastingExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBSAssignmentAccess().getBSCastingExpressionParserRuleCall_0_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBSCastingExpression_in_ruleBSAssignment2465);
                    this_BSCastingExpression_0=ruleBSCastingExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_BSCastingExpression_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:1096:5: this_BSSelectionExpression_1= ruleBSSelectionExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBSAssignmentAccess().getBSSelectionExpressionParserRuleCall_0_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBSSelectionExpression_in_ruleBSAssignment2492);
                    this_BSSelectionExpression_1=ruleBSSelectionExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_BSSelectionExpression_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }

            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:1104:2: ( () otherlv_3= '=' ( (lv_right_4_0= ruleBSExpression ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==24) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:1104:3: () otherlv_3= '=' ( (lv_right_4_0= ruleBSExpression ) )
                    {
                    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:1104:3: ()
                    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:1105:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getBSAssignmentAccess().getBSAssignmentLeftAction_1_0(),
                                  current);
                          
                    }

                    }

                    otherlv_3=(Token)match(input,24,FOLLOW_24_in_ruleBSAssignment2514); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getBSAssignmentAccess().getEqualsSignKeyword_1_1());
                          
                    }
                    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:1114:1: ( (lv_right_4_0= ruleBSExpression ) )
                    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:1115:1: (lv_right_4_0= ruleBSExpression )
                    {
                    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:1115:1: (lv_right_4_0= ruleBSExpression )
                    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:1116:3: lv_right_4_0= ruleBSExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getBSAssignmentAccess().getRightBSExpressionParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBSExpression_in_ruleBSAssignment2535);
                    lv_right_4_0=ruleBSExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getBSAssignmentRule());
                      	        }
                             		set(
                             			current, 
                             			"right",
                              		lv_right_4_0, 
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
    // $ANTLR end "ruleBSAssignment"


    // $ANTLR start "entryRuleBSCastingExpression"
    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:1140:1: entryRuleBSCastingExpression returns [EObject current=null] : iv_ruleBSCastingExpression= ruleBSCastingExpression EOF ;
    public final EObject entryRuleBSCastingExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBSCastingExpression = null;


        try {
            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:1141:2: (iv_ruleBSCastingExpression= ruleBSCastingExpression EOF )
            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:1142:2: iv_ruleBSCastingExpression= ruleBSCastingExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBSCastingExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleBSCastingExpression_in_entryRuleBSCastingExpression2573);
            iv_ruleBSCastingExpression=ruleBSCastingExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBSCastingExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBSCastingExpression2583); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBSCastingExpression"


    // $ANTLR start "ruleBSCastingExpression"
    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:1149:1: ruleBSCastingExpression returns [EObject current=null] : (otherlv_0= '(' ( ( (lv_castType_1_1= 'string' | lv_castType_1_2= 'number' | lv_castType_1_3= 'object' ) ) ) otherlv_2= ')' ( (lv_castExpr_3_0= ruleBSSelectionExpression ) ) ) ;
    public final EObject ruleBSCastingExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_castType_1_1=null;
        Token lv_castType_1_2=null;
        Token lv_castType_1_3=null;
        Token otherlv_2=null;
        EObject lv_castExpr_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:1152:28: ( (otherlv_0= '(' ( ( (lv_castType_1_1= 'string' | lv_castType_1_2= 'number' | lv_castType_1_3= 'object' ) ) ) otherlv_2= ')' ( (lv_castExpr_3_0= ruleBSSelectionExpression ) ) ) )
            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:1153:1: (otherlv_0= '(' ( ( (lv_castType_1_1= 'string' | lv_castType_1_2= 'number' | lv_castType_1_3= 'object' ) ) ) otherlv_2= ')' ( (lv_castExpr_3_0= ruleBSSelectionExpression ) ) )
            {
            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:1153:1: (otherlv_0= '(' ( ( (lv_castType_1_1= 'string' | lv_castType_1_2= 'number' | lv_castType_1_3= 'object' ) ) ) otherlv_2= ')' ( (lv_castExpr_3_0= ruleBSSelectionExpression ) ) )
            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:1153:3: otherlv_0= '(' ( ( (lv_castType_1_1= 'string' | lv_castType_1_2= 'number' | lv_castType_1_3= 'object' ) ) ) otherlv_2= ')' ( (lv_castExpr_3_0= ruleBSSelectionExpression ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20_in_ruleBSCastingExpression2620); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getBSCastingExpressionAccess().getLeftParenthesisKeyword_0());
                  
            }
            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:1157:1: ( ( (lv_castType_1_1= 'string' | lv_castType_1_2= 'number' | lv_castType_1_3= 'object' ) ) )
            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:1158:1: ( (lv_castType_1_1= 'string' | lv_castType_1_2= 'number' | lv_castType_1_3= 'object' ) )
            {
            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:1158:1: ( (lv_castType_1_1= 'string' | lv_castType_1_2= 'number' | lv_castType_1_3= 'object' ) )
            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:1159:1: (lv_castType_1_1= 'string' | lv_castType_1_2= 'number' | lv_castType_1_3= 'object' )
            {
            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:1159:1: (lv_castType_1_1= 'string' | lv_castType_1_2= 'number' | lv_castType_1_3= 'object' )
            int alt19=3;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt19=1;
                }
                break;
            case 28:
                {
                alt19=2;
                }
                break;
            case 29:
                {
                alt19=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:1160:3: lv_castType_1_1= 'string'
                    {
                    lv_castType_1_1=(Token)match(input,27,FOLLOW_27_in_ruleBSCastingExpression2640); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_castType_1_1, grammarAccess.getBSCastingExpressionAccess().getCastTypeStringKeyword_1_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getBSCastingExpressionRule());
                      	        }
                             		setWithLastConsumed(current, "castType", lv_castType_1_1, null);
                      	    
                    }

                    }
                    break;
                case 2 :
                    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:1172:8: lv_castType_1_2= 'number'
                    {
                    lv_castType_1_2=(Token)match(input,28,FOLLOW_28_in_ruleBSCastingExpression2669); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_castType_1_2, grammarAccess.getBSCastingExpressionAccess().getCastTypeNumberKeyword_1_0_1());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getBSCastingExpressionRule());
                      	        }
                             		setWithLastConsumed(current, "castType", lv_castType_1_2, null);
                      	    
                    }

                    }
                    break;
                case 3 :
                    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:1184:8: lv_castType_1_3= 'object'
                    {
                    lv_castType_1_3=(Token)match(input,29,FOLLOW_29_in_ruleBSCastingExpression2698); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_castType_1_3, grammarAccess.getBSCastingExpressionAccess().getCastTypeObjectKeyword_1_0_2());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getBSCastingExpressionRule());
                      	        }
                             		setWithLastConsumed(current, "castType", lv_castType_1_3, null);
                      	    
                    }

                    }
                    break;

            }


            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_22_in_ruleBSCastingExpression2726); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getBSCastingExpressionAccess().getRightParenthesisKeyword_2());
                  
            }
            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:1203:1: ( (lv_castExpr_3_0= ruleBSSelectionExpression ) )
            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:1204:1: (lv_castExpr_3_0= ruleBSSelectionExpression )
            {
            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:1204:1: (lv_castExpr_3_0= ruleBSSelectionExpression )
            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:1205:3: lv_castExpr_3_0= ruleBSSelectionExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getBSCastingExpressionAccess().getCastExprBSSelectionExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleBSSelectionExpression_in_ruleBSCastingExpression2747);
            lv_castExpr_3_0=ruleBSSelectionExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getBSCastingExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"castExpr",
                      		lv_castExpr_3_0, 
                      		"BSSelectionExpression");
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
    // $ANTLR end "ruleBSCastingExpression"


    // $ANTLR start "entryRuleBSSelectionExpression"
    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:1229:1: entryRuleBSSelectionExpression returns [EObject current=null] : iv_ruleBSSelectionExpression= ruleBSSelectionExpression EOF ;
    public final EObject entryRuleBSSelectionExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBSSelectionExpression = null;


        try {
            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:1230:2: (iv_ruleBSSelectionExpression= ruleBSSelectionExpression EOF )
            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:1231:2: iv_ruleBSSelectionExpression= ruleBSSelectionExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBSSelectionExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleBSSelectionExpression_in_entryRuleBSSelectionExpression2783);
            iv_ruleBSSelectionExpression=ruleBSSelectionExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBSSelectionExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBSSelectionExpression2793); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBSSelectionExpression"


    // $ANTLR start "ruleBSSelectionExpression"
    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:1238:1: ruleBSSelectionExpression returns [EObject current=null] : (this_BSTerminalExpression_0= ruleBSTerminalExpression ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( (lv_methodinvocation_4_0= '(' ) ) ( ( (lv_args_5_0= ruleBSExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleBSExpression ) ) )* )? otherlv_8= ')' )? )* ) ;
    public final EObject ruleBSSelectionExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_methodinvocation_4_0=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject this_BSTerminalExpression_0 = null;

        EObject lv_args_5_0 = null;

        EObject lv_args_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:1241:28: ( (this_BSTerminalExpression_0= ruleBSTerminalExpression ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( (lv_methodinvocation_4_0= '(' ) ) ( ( (lv_args_5_0= ruleBSExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleBSExpression ) ) )* )? otherlv_8= ')' )? )* ) )
            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:1242:1: (this_BSTerminalExpression_0= ruleBSTerminalExpression ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( (lv_methodinvocation_4_0= '(' ) ) ( ( (lv_args_5_0= ruleBSExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleBSExpression ) ) )* )? otherlv_8= ')' )? )* )
            {
            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:1242:1: (this_BSTerminalExpression_0= ruleBSTerminalExpression ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( (lv_methodinvocation_4_0= '(' ) ) ( ( (lv_args_5_0= ruleBSExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleBSExpression ) ) )* )? otherlv_8= ')' )? )* )
            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:1243:5: this_BSTerminalExpression_0= ruleBSTerminalExpression ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( (lv_methodinvocation_4_0= '(' ) ) ( ( (lv_args_5_0= ruleBSExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleBSExpression ) ) )* )? otherlv_8= ')' )? )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getBSSelectionExpressionAccess().getBSTerminalExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleBSTerminalExpression_in_ruleBSSelectionExpression2840);
            this_BSTerminalExpression_0=ruleBSTerminalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_BSTerminalExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:1251:1: ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( (lv_methodinvocation_4_0= '(' ) ) ( ( (lv_args_5_0= ruleBSExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleBSExpression ) ) )* )? otherlv_8= ')' )? )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==15) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:1251:2: () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( (lv_methodinvocation_4_0= '(' ) ) ( ( (lv_args_5_0= ruleBSExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleBSExpression ) ) )* )? otherlv_8= ')' )?
            	    {
            	    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:1251:2: ()
            	    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:1252:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getBSSelectionExpressionAccess().getBSMemberSelectionReceiverAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleBSSelectionExpression2861); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getBSSelectionExpressionAccess().getFullStopKeyword_1_1());
            	          
            	    }
            	    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:1261:1: ( (otherlv_3= RULE_ID ) )
            	    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:1262:1: (otherlv_3= RULE_ID )
            	    {
            	    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:1262:1: (otherlv_3= RULE_ID )
            	    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:1263:3: otherlv_3= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getBSSelectionExpressionRule());
            	      	        }
            	              
            	    }
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBSSelectionExpression2881); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		newLeafNode(otherlv_3, grammarAccess.getBSSelectionExpressionAccess().getMemberBSMemberCrossReference_1_2_0()); 
            	      	
            	    }

            	    }


            	    }

            	    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:1274:2: ( ( (lv_methodinvocation_4_0= '(' ) ) ( ( (lv_args_5_0= ruleBSExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleBSExpression ) ) )* )? otherlv_8= ')' )?
            	    int alt22=2;
            	    int LA22_0 = input.LA(1);

            	    if ( (LA22_0==20) ) {
            	        alt22=1;
            	    }
            	    switch (alt22) {
            	        case 1 :
            	            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:1274:3: ( (lv_methodinvocation_4_0= '(' ) ) ( ( (lv_args_5_0= ruleBSExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleBSExpression ) ) )* )? otherlv_8= ')'
            	            {
            	            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:1274:3: ( (lv_methodinvocation_4_0= '(' ) )
            	            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:1275:1: (lv_methodinvocation_4_0= '(' )
            	            {
            	            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:1275:1: (lv_methodinvocation_4_0= '(' )
            	            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:1276:3: lv_methodinvocation_4_0= '('
            	            {
            	            lv_methodinvocation_4_0=(Token)match(input,20,FOLLOW_20_in_ruleBSSelectionExpression2900); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_methodinvocation_4_0, grammarAccess.getBSSelectionExpressionAccess().getMethodinvocationLeftParenthesisKeyword_1_3_0_0());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getBSSelectionExpressionRule());
            	              	        }
            	                     		setWithLastConsumed(current, "methodinvocation", true, "(");
            	              	    
            	            }

            	            }


            	            }

            	            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:1289:2: ( ( (lv_args_5_0= ruleBSExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleBSExpression ) ) )* )?
            	            int alt21=2;
            	            int LA21_0 = input.LA(1);

            	            if ( ((LA21_0>=RULE_ID && LA21_0<=RULE_INT)||LA21_0==20||(LA21_0>=30 && LA21_0<=35)) ) {
            	                alt21=1;
            	            }
            	            switch (alt21) {
            	                case 1 :
            	                    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:1289:3: ( (lv_args_5_0= ruleBSExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleBSExpression ) ) )*
            	                    {
            	                    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:1289:3: ( (lv_args_5_0= ruleBSExpression ) )
            	                    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:1290:1: (lv_args_5_0= ruleBSExpression )
            	                    {
            	                    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:1290:1: (lv_args_5_0= ruleBSExpression )
            	                    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:1291:3: lv_args_5_0= ruleBSExpression
            	                    {
            	                    if ( state.backtracking==0 ) {
            	                       
            	                      	        newCompositeNode(grammarAccess.getBSSelectionExpressionAccess().getArgsBSExpressionParserRuleCall_1_3_1_0_0()); 
            	                      	    
            	                    }
            	                    pushFollow(FOLLOW_ruleBSExpression_in_ruleBSSelectionExpression2935);
            	                    lv_args_5_0=ruleBSExpression();

            	                    state._fsp--;
            	                    if (state.failed) return current;
            	                    if ( state.backtracking==0 ) {

            	                      	        if (current==null) {
            	                      	            current = createModelElementForParent(grammarAccess.getBSSelectionExpressionRule());
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

            	                    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:1307:2: (otherlv_6= ',' ( (lv_args_7_0= ruleBSExpression ) ) )*
            	                    loop20:
            	                    do {
            	                        int alt20=2;
            	                        int LA20_0 = input.LA(1);

            	                        if ( (LA20_0==21) ) {
            	                            alt20=1;
            	                        }


            	                        switch (alt20) {
            	                    	case 1 :
            	                    	    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:1307:4: otherlv_6= ',' ( (lv_args_7_0= ruleBSExpression ) )
            	                    	    {
            	                    	    otherlv_6=(Token)match(input,21,FOLLOW_21_in_ruleBSSelectionExpression2948); if (state.failed) return current;
            	                    	    if ( state.backtracking==0 ) {

            	                    	          	newLeafNode(otherlv_6, grammarAccess.getBSSelectionExpressionAccess().getCommaKeyword_1_3_1_1_0());
            	                    	          
            	                    	    }
            	                    	    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:1311:1: ( (lv_args_7_0= ruleBSExpression ) )
            	                    	    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:1312:1: (lv_args_7_0= ruleBSExpression )
            	                    	    {
            	                    	    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:1312:1: (lv_args_7_0= ruleBSExpression )
            	                    	    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:1313:3: lv_args_7_0= ruleBSExpression
            	                    	    {
            	                    	    if ( state.backtracking==0 ) {
            	                    	       
            	                    	      	        newCompositeNode(grammarAccess.getBSSelectionExpressionAccess().getArgsBSExpressionParserRuleCall_1_3_1_1_1_0()); 
            	                    	      	    
            	                    	    }
            	                    	    pushFollow(FOLLOW_ruleBSExpression_in_ruleBSSelectionExpression2969);
            	                    	    lv_args_7_0=ruleBSExpression();

            	                    	    state._fsp--;
            	                    	    if (state.failed) return current;
            	                    	    if ( state.backtracking==0 ) {

            	                    	      	        if (current==null) {
            	                    	      	            current = createModelElementForParent(grammarAccess.getBSSelectionExpressionRule());
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
            	                    	    break loop20;
            	                        }
            	                    } while (true);


            	                    }
            	                    break;

            	            }

            	            otherlv_8=(Token)match(input,22,FOLLOW_22_in_ruleBSSelectionExpression2985); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_8, grammarAccess.getBSSelectionExpressionAccess().getRightParenthesisKeyword_1_3_2());
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
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
    // $ANTLR end "ruleBSSelectionExpression"


    // $ANTLR start "entryRuleBSTerminalExpression"
    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:1341:1: entryRuleBSTerminalExpression returns [EObject current=null] : iv_ruleBSTerminalExpression= ruleBSTerminalExpression EOF ;
    public final EObject entryRuleBSTerminalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBSTerminalExpression = null;


        try {
            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:1342:2: (iv_ruleBSTerminalExpression= ruleBSTerminalExpression EOF )
            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:1343:2: iv_ruleBSTerminalExpression= ruleBSTerminalExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBSTerminalExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleBSTerminalExpression_in_entryRuleBSTerminalExpression3025);
            iv_ruleBSTerminalExpression=ruleBSTerminalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBSTerminalExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBSTerminalExpression3035); if (state.failed) return current;

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
    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:1350:1: ruleBSTerminalExpression returns [EObject current=null] : ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) | ( () ( (lv_value_3_0= RULE_INT ) ) ) | ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) ) | ( () otherlv_7= 'null' ) | ( () otherlv_9= 'this' ) | ( () otherlv_11= 'client' ) | ( () ( (otherlv_13= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_methodinvocation_14_0= '(' ) ) ( ( (lv_args_15_0= ruleBSExpression ) ) (otherlv_16= ',' ( (lv_args_17_0= ruleBSExpression ) ) )* )? otherlv_18= ')' )? ) | ( () otherlv_20= 'new' ( ( ruleQualifiedName ) ) otherlv_22= '(' ( ( (lv_args_23_0= ruleBSExpression ) ) (otherlv_24= ',' ( (lv_args_25_0= ruleBSExpression ) ) )* )? otherlv_26= ')' ) | (otherlv_27= '(' this_BSExpression_28= ruleBSExpression otherlv_29= ')' ) ) ;
    public final EObject ruleBSTerminalExpression() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Token lv_value_3_0=null;
        Token lv_value_5_1=null;
        Token lv_value_5_2=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token lv_methodinvocation_14_0=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_29=null;
        EObject lv_args_15_0 = null;

        EObject lv_args_17_0 = null;

        EObject lv_args_23_0 = null;

        EObject lv_args_25_0 = null;

        EObject this_BSExpression_28 = null;


         enterRule(); 
            
        try {
            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:1353:28: ( ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) | ( () ( (lv_value_3_0= RULE_INT ) ) ) | ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) ) | ( () otherlv_7= 'null' ) | ( () otherlv_9= 'this' ) | ( () otherlv_11= 'client' ) | ( () ( (otherlv_13= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_methodinvocation_14_0= '(' ) ) ( ( (lv_args_15_0= ruleBSExpression ) ) (otherlv_16= ',' ( (lv_args_17_0= ruleBSExpression ) ) )* )? otherlv_18= ')' )? ) | ( () otherlv_20= 'new' ( ( ruleQualifiedName ) ) otherlv_22= '(' ( ( (lv_args_23_0= ruleBSExpression ) ) (otherlv_24= ',' ( (lv_args_25_0= ruleBSExpression ) ) )* )? otherlv_26= ')' ) | (otherlv_27= '(' this_BSExpression_28= ruleBSExpression otherlv_29= ')' ) ) )
            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:1354:1: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) | ( () ( (lv_value_3_0= RULE_INT ) ) ) | ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) ) | ( () otherlv_7= 'null' ) | ( () otherlv_9= 'this' ) | ( () otherlv_11= 'client' ) | ( () ( (otherlv_13= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_methodinvocation_14_0= '(' ) ) ( ( (lv_args_15_0= ruleBSExpression ) ) (otherlv_16= ',' ( (lv_args_17_0= ruleBSExpression ) ) )* )? otherlv_18= ')' )? ) | ( () otherlv_20= 'new' ( ( ruleQualifiedName ) ) otherlv_22= '(' ( ( (lv_args_23_0= ruleBSExpression ) ) (otherlv_24= ',' ( (lv_args_25_0= ruleBSExpression ) ) )* )? otherlv_26= ')' ) | (otherlv_27= '(' this_BSExpression_28= ruleBSExpression otherlv_29= ')' ) )
            {
            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:1354:1: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) | ( () ( (lv_value_3_0= RULE_INT ) ) ) | ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) ) | ( () otherlv_7= 'null' ) | ( () otherlv_9= 'this' ) | ( () otherlv_11= 'client' ) | ( () ( (otherlv_13= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_methodinvocation_14_0= '(' ) ) ( ( (lv_args_15_0= ruleBSExpression ) ) (otherlv_16= ',' ( (lv_args_17_0= ruleBSExpression ) ) )* )? otherlv_18= ')' )? ) | ( () otherlv_20= 'new' ( ( ruleQualifiedName ) ) otherlv_22= '(' ( ( (lv_args_23_0= ruleBSExpression ) ) (otherlv_24= ',' ( (lv_args_25_0= ruleBSExpression ) ) )* )? otherlv_26= ')' ) | (otherlv_27= '(' this_BSExpression_28= ruleBSExpression otherlv_29= ')' ) )
            int alt30=9;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt30=1;
                }
                break;
            case RULE_INT:
                {
                alt30=2;
                }
                break;
            case 30:
            case 31:
                {
                alt30=3;
                }
                break;
            case 32:
                {
                alt30=4;
                }
                break;
            case 33:
                {
                alt30=5;
                }
                break;
            case 34:
                {
                alt30=6;
                }
                break;
            case RULE_ID:
                {
                alt30=7;
                }
                break;
            case 35:
                {
                alt30=8;
                }
                break;
            case 20:
                {
                alt30=9;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:1354:2: ( () ( (lv_value_1_0= RULE_STRING ) ) )
                    {
                    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:1354:2: ( () ( (lv_value_1_0= RULE_STRING ) ) )
                    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:1354:3: () ( (lv_value_1_0= RULE_STRING ) )
                    {
                    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:1354:3: ()
                    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:1355:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getBSTerminalExpressionAccess().getBSStringConstantAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:1360:2: ( (lv_value_1_0= RULE_STRING ) )
                    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:1361:1: (lv_value_1_0= RULE_STRING )
                    {
                    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:1361:1: (lv_value_1_0= RULE_STRING )
                    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:1362:3: lv_value_1_0= RULE_STRING
                    {
                    lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleBSTerminalExpression3087); if (state.failed) return current;
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
                    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:1379:6: ( () ( (lv_value_3_0= RULE_INT ) ) )
                    {
                    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:1379:6: ( () ( (lv_value_3_0= RULE_INT ) ) )
                    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:1379:7: () ( (lv_value_3_0= RULE_INT ) )
                    {
                    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:1379:7: ()
                    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:1380:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getBSTerminalExpressionAccess().getBSNumberConstantAction_1_0(),
                                  current);
                          
                    }

                    }

                    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:1385:2: ( (lv_value_3_0= RULE_INT ) )
                    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:1386:1: (lv_value_3_0= RULE_INT )
                    {
                    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:1386:1: (lv_value_3_0= RULE_INT )
                    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:1387:3: lv_value_3_0= RULE_INT
                    {
                    lv_value_3_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleBSTerminalExpression3126); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_value_3_0, grammarAccess.getBSTerminalExpressionAccess().getValueINTTerminalRuleCall_1_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getBSTerminalExpressionRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"value",
                              		lv_value_3_0, 
                              		"INT");
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:1404:6: ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) )
                    {
                    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:1404:6: ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) )
                    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:1404:7: () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) )
                    {
                    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:1404:7: ()
                    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:1405:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getBSTerminalExpressionAccess().getBSBooleanConstantAction_2_0(),
                                  current);
                          
                    }

                    }

                    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:1410:2: ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) )
                    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:1411:1: ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) )
                    {
                    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:1411:1: ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) )
                    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:1412:1: (lv_value_5_1= 'true' | lv_value_5_2= 'false' )
                    {
                    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:1412:1: (lv_value_5_1= 'true' | lv_value_5_2= 'false' )
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==30) ) {
                        alt24=1;
                    }
                    else if ( (LA24_0==31) ) {
                        alt24=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 24, 0, input);

                        throw nvae;
                    }
                    switch (alt24) {
                        case 1 :
                            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:1413:3: lv_value_5_1= 'true'
                            {
                            lv_value_5_1=(Token)match(input,30,FOLLOW_30_in_ruleBSTerminalExpression3168); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_value_5_1, grammarAccess.getBSTerminalExpressionAccess().getValueTrueKeyword_2_1_0_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getBSTerminalExpressionRule());
                              	        }
                                     		setWithLastConsumed(current, "value", lv_value_5_1, null);
                              	    
                            }

                            }
                            break;
                        case 2 :
                            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:1425:8: lv_value_5_2= 'false'
                            {
                            lv_value_5_2=(Token)match(input,31,FOLLOW_31_in_ruleBSTerminalExpression3197); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_value_5_2, grammarAccess.getBSTerminalExpressionAccess().getValueFalseKeyword_2_1_0_1());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getBSTerminalExpressionRule());
                              	        }
                                     		setWithLastConsumed(current, "value", lv_value_5_2, null);
                              	    
                            }

                            }
                            break;

                    }


                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:1441:6: ( () otherlv_7= 'null' )
                    {
                    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:1441:6: ( () otherlv_7= 'null' )
                    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:1441:7: () otherlv_7= 'null'
                    {
                    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:1441:7: ()
                    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:1442:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getBSTerminalExpressionAccess().getBSNullAction_3_0(),
                                  current);
                          
                    }

                    }

                    otherlv_7=(Token)match(input,32,FOLLOW_32_in_ruleBSTerminalExpression3242); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getBSTerminalExpressionAccess().getNullKeyword_3_1());
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:1452:6: ( () otherlv_9= 'this' )
                    {
                    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:1452:6: ( () otherlv_9= 'this' )
                    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:1452:7: () otherlv_9= 'this'
                    {
                    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:1452:7: ()
                    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:1453:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getBSTerminalExpressionAccess().getBSThisAction_4_0(),
                                  current);
                          
                    }

                    }

                    otherlv_9=(Token)match(input,33,FOLLOW_33_in_ruleBSTerminalExpression3271); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getBSTerminalExpressionAccess().getThisKeyword_4_1());
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:1463:6: ( () otherlv_11= 'client' )
                    {
                    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:1463:6: ( () otherlv_11= 'client' )
                    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:1463:7: () otherlv_11= 'client'
                    {
                    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:1463:7: ()
                    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:1464:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getBSTerminalExpressionAccess().getBSClientAction_5_0(),
                                  current);
                          
                    }

                    }

                    otherlv_11=(Token)match(input,34,FOLLOW_34_in_ruleBSTerminalExpression3300); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_11, grammarAccess.getBSTerminalExpressionAccess().getClientKeyword_5_1());
                          
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:1474:6: ( () ( (otherlv_13= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_methodinvocation_14_0= '(' ) ) ( ( (lv_args_15_0= ruleBSExpression ) ) (otherlv_16= ',' ( (lv_args_17_0= ruleBSExpression ) ) )* )? otherlv_18= ')' )? )
                    {
                    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:1474:6: ( () ( (otherlv_13= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_methodinvocation_14_0= '(' ) ) ( ( (lv_args_15_0= ruleBSExpression ) ) (otherlv_16= ',' ( (lv_args_17_0= ruleBSExpression ) ) )* )? otherlv_18= ')' )? )
                    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:1474:7: () ( (otherlv_13= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_methodinvocation_14_0= '(' ) ) ( ( (lv_args_15_0= ruleBSExpression ) ) (otherlv_16= ',' ( (lv_args_17_0= ruleBSExpression ) ) )* )? otherlv_18= ')' )?
                    {
                    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:1474:7: ()
                    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:1475:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getBSTerminalExpressionAccess().getBSSymbolRefAction_6_0(),
                                  current);
                          
                    }

                    }

                    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:1480:2: ( (otherlv_13= RULE_ID ) )
                    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:1481:1: (otherlv_13= RULE_ID )
                    {
                    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:1481:1: (otherlv_13= RULE_ID )
                    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:1482:3: otherlv_13= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getBSTerminalExpressionRule());
                      	        }
                              
                    }
                    otherlv_13=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBSTerminalExpression3337); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_13, grammarAccess.getBSTerminalExpressionAccess().getSymbolBSSymbolCrossReference_6_1_0()); 
                      	
                    }

                    }


                    }

                    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:1493:2: ( ( ( ( '(' ) )=> (lv_methodinvocation_14_0= '(' ) ) ( ( (lv_args_15_0= ruleBSExpression ) ) (otherlv_16= ',' ( (lv_args_17_0= ruleBSExpression ) ) )* )? otherlv_18= ')' )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==20) && (synpred2_InternalBlorqueScript())) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:1493:3: ( ( ( '(' ) )=> (lv_methodinvocation_14_0= '(' ) ) ( ( (lv_args_15_0= ruleBSExpression ) ) (otherlv_16= ',' ( (lv_args_17_0= ruleBSExpression ) ) )* )? otherlv_18= ')'
                            {
                            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:1493:3: ( ( ( '(' ) )=> (lv_methodinvocation_14_0= '(' ) )
                            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:1493:4: ( ( '(' ) )=> (lv_methodinvocation_14_0= '(' )
                            {
                            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:1500:1: (lv_methodinvocation_14_0= '(' )
                            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:1501:3: lv_methodinvocation_14_0= '('
                            {
                            lv_methodinvocation_14_0=(Token)match(input,20,FOLLOW_20_in_ruleBSTerminalExpression3371); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_methodinvocation_14_0, grammarAccess.getBSTerminalExpressionAccess().getMethodinvocationLeftParenthesisKeyword_6_2_0_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getBSTerminalExpressionRule());
                              	        }
                                     		setWithLastConsumed(current, "methodinvocation", true, "(");
                              	    
                            }

                            }


                            }

                            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:1514:2: ( ( (lv_args_15_0= ruleBSExpression ) ) (otherlv_16= ',' ( (lv_args_17_0= ruleBSExpression ) ) )* )?
                            int alt26=2;
                            int LA26_0 = input.LA(1);

                            if ( ((LA26_0>=RULE_ID && LA26_0<=RULE_INT)||LA26_0==20||(LA26_0>=30 && LA26_0<=35)) ) {
                                alt26=1;
                            }
                            switch (alt26) {
                                case 1 :
                                    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:1514:3: ( (lv_args_15_0= ruleBSExpression ) ) (otherlv_16= ',' ( (lv_args_17_0= ruleBSExpression ) ) )*
                                    {
                                    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:1514:3: ( (lv_args_15_0= ruleBSExpression ) )
                                    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:1515:1: (lv_args_15_0= ruleBSExpression )
                                    {
                                    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:1515:1: (lv_args_15_0= ruleBSExpression )
                                    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:1516:3: lv_args_15_0= ruleBSExpression
                                    {
                                    if ( state.backtracking==0 ) {
                                       
                                      	        newCompositeNode(grammarAccess.getBSTerminalExpressionAccess().getArgsBSExpressionParserRuleCall_6_2_1_0_0()); 
                                      	    
                                    }
                                    pushFollow(FOLLOW_ruleBSExpression_in_ruleBSTerminalExpression3406);
                                    lv_args_15_0=ruleBSExpression();

                                    state._fsp--;
                                    if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      	        if (current==null) {
                                      	            current = createModelElementForParent(grammarAccess.getBSTerminalExpressionRule());
                                      	        }
                                             		add(
                                             			current, 
                                             			"args",
                                              		lv_args_15_0, 
                                              		"BSExpression");
                                      	        afterParserOrEnumRuleCall();
                                      	    
                                    }

                                    }


                                    }

                                    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:1532:2: (otherlv_16= ',' ( (lv_args_17_0= ruleBSExpression ) ) )*
                                    loop25:
                                    do {
                                        int alt25=2;
                                        int LA25_0 = input.LA(1);

                                        if ( (LA25_0==21) ) {
                                            alt25=1;
                                        }


                                        switch (alt25) {
                                    	case 1 :
                                    	    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:1532:4: otherlv_16= ',' ( (lv_args_17_0= ruleBSExpression ) )
                                    	    {
                                    	    otherlv_16=(Token)match(input,21,FOLLOW_21_in_ruleBSTerminalExpression3419); if (state.failed) return current;
                                    	    if ( state.backtracking==0 ) {

                                    	          	newLeafNode(otherlv_16, grammarAccess.getBSTerminalExpressionAccess().getCommaKeyword_6_2_1_1_0());
                                    	          
                                    	    }
                                    	    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:1536:1: ( (lv_args_17_0= ruleBSExpression ) )
                                    	    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:1537:1: (lv_args_17_0= ruleBSExpression )
                                    	    {
                                    	    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:1537:1: (lv_args_17_0= ruleBSExpression )
                                    	    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:1538:3: lv_args_17_0= ruleBSExpression
                                    	    {
                                    	    if ( state.backtracking==0 ) {
                                    	       
                                    	      	        newCompositeNode(grammarAccess.getBSTerminalExpressionAccess().getArgsBSExpressionParserRuleCall_6_2_1_1_1_0()); 
                                    	      	    
                                    	    }
                                    	    pushFollow(FOLLOW_ruleBSExpression_in_ruleBSTerminalExpression3440);
                                    	    lv_args_17_0=ruleBSExpression();

                                    	    state._fsp--;
                                    	    if (state.failed) return current;
                                    	    if ( state.backtracking==0 ) {

                                    	      	        if (current==null) {
                                    	      	            current = createModelElementForParent(grammarAccess.getBSTerminalExpressionRule());
                                    	      	        }
                                    	             		add(
                                    	             			current, 
                                    	             			"args",
                                    	              		lv_args_17_0, 
                                    	              		"BSExpression");
                                    	      	        afterParserOrEnumRuleCall();
                                    	      	    
                                    	    }

                                    	    }


                                    	    }


                                    	    }
                                    	    break;

                                    	default :
                                    	    break loop25;
                                        }
                                    } while (true);


                                    }
                                    break;

                            }

                            otherlv_18=(Token)match(input,22,FOLLOW_22_in_ruleBSTerminalExpression3456); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_18, grammarAccess.getBSTerminalExpressionAccess().getRightParenthesisKeyword_6_2_2());
                                  
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 8 :
                    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:1559:6: ( () otherlv_20= 'new' ( ( ruleQualifiedName ) ) otherlv_22= '(' ( ( (lv_args_23_0= ruleBSExpression ) ) (otherlv_24= ',' ( (lv_args_25_0= ruleBSExpression ) ) )* )? otherlv_26= ')' )
                    {
                    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:1559:6: ( () otherlv_20= 'new' ( ( ruleQualifiedName ) ) otherlv_22= '(' ( ( (lv_args_23_0= ruleBSExpression ) ) (otherlv_24= ',' ( (lv_args_25_0= ruleBSExpression ) ) )* )? otherlv_26= ')' )
                    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:1559:7: () otherlv_20= 'new' ( ( ruleQualifiedName ) ) otherlv_22= '(' ( ( (lv_args_23_0= ruleBSExpression ) ) (otherlv_24= ',' ( (lv_args_25_0= ruleBSExpression ) ) )* )? otherlv_26= ')'
                    {
                    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:1559:7: ()
                    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:1560:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getBSTerminalExpressionAccess().getBSNewAction_7_0(),
                                  current);
                          
                    }

                    }

                    otherlv_20=(Token)match(input,35,FOLLOW_35_in_ruleBSTerminalExpression3487); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_20, grammarAccess.getBSTerminalExpressionAccess().getNewKeyword_7_1());
                          
                    }
                    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:1569:1: ( ( ruleQualifiedName ) )
                    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:1570:1: ( ruleQualifiedName )
                    {
                    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:1570:1: ( ruleQualifiedName )
                    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:1571:3: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getBSTerminalExpressionRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getBSTerminalExpressionAccess().getTypeBSClassCrossReference_7_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleBSTerminalExpression3510);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_22=(Token)match(input,20,FOLLOW_20_in_ruleBSTerminalExpression3522); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_22, grammarAccess.getBSTerminalExpressionAccess().getLeftParenthesisKeyword_7_3());
                          
                    }
                    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:1588:1: ( ( (lv_args_23_0= ruleBSExpression ) ) (otherlv_24= ',' ( (lv_args_25_0= ruleBSExpression ) ) )* )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( ((LA29_0>=RULE_ID && LA29_0<=RULE_INT)||LA29_0==20||(LA29_0>=30 && LA29_0<=35)) ) {
                        alt29=1;
                    }
                    switch (alt29) {
                        case 1 :
                            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:1588:2: ( (lv_args_23_0= ruleBSExpression ) ) (otherlv_24= ',' ( (lv_args_25_0= ruleBSExpression ) ) )*
                            {
                            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:1588:2: ( (lv_args_23_0= ruleBSExpression ) )
                            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:1589:1: (lv_args_23_0= ruleBSExpression )
                            {
                            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:1589:1: (lv_args_23_0= ruleBSExpression )
                            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:1590:3: lv_args_23_0= ruleBSExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getBSTerminalExpressionAccess().getArgsBSExpressionParserRuleCall_7_4_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleBSExpression_in_ruleBSTerminalExpression3544);
                            lv_args_23_0=ruleBSExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getBSTerminalExpressionRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"args",
                                      		lv_args_23_0, 
                                      		"BSExpression");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:1606:2: (otherlv_24= ',' ( (lv_args_25_0= ruleBSExpression ) ) )*
                            loop28:
                            do {
                                int alt28=2;
                                int LA28_0 = input.LA(1);

                                if ( (LA28_0==21) ) {
                                    alt28=1;
                                }


                                switch (alt28) {
                            	case 1 :
                            	    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:1606:4: otherlv_24= ',' ( (lv_args_25_0= ruleBSExpression ) )
                            	    {
                            	    otherlv_24=(Token)match(input,21,FOLLOW_21_in_ruleBSTerminalExpression3557); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_24, grammarAccess.getBSTerminalExpressionAccess().getCommaKeyword_7_4_1_0());
                            	          
                            	    }
                            	    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:1610:1: ( (lv_args_25_0= ruleBSExpression ) )
                            	    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:1611:1: (lv_args_25_0= ruleBSExpression )
                            	    {
                            	    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:1611:1: (lv_args_25_0= ruleBSExpression )
                            	    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:1612:3: lv_args_25_0= ruleBSExpression
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getBSTerminalExpressionAccess().getArgsBSExpressionParserRuleCall_7_4_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleBSExpression_in_ruleBSTerminalExpression3578);
                            	    lv_args_25_0=ruleBSExpression();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getBSTerminalExpressionRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"args",
                            	              		lv_args_25_0, 
                            	              		"BSExpression");
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
                            break;

                    }

                    otherlv_26=(Token)match(input,22,FOLLOW_22_in_ruleBSTerminalExpression3594); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_26, grammarAccess.getBSTerminalExpressionAccess().getRightParenthesisKeyword_7_5());
                          
                    }

                    }


                    }
                    break;
                case 9 :
                    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:1633:6: (otherlv_27= '(' this_BSExpression_28= ruleBSExpression otherlv_29= ')' )
                    {
                    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:1633:6: (otherlv_27= '(' this_BSExpression_28= ruleBSExpression otherlv_29= ')' )
                    // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:1633:8: otherlv_27= '(' this_BSExpression_28= ruleBSExpression otherlv_29= ')'
                    {
                    otherlv_27=(Token)match(input,20,FOLLOW_20_in_ruleBSTerminalExpression3614); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_27, grammarAccess.getBSTerminalExpressionAccess().getLeftParenthesisKeyword_8_0());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBSTerminalExpressionAccess().getBSExpressionParserRuleCall_8_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBSExpression_in_ruleBSTerminalExpression3636);
                    this_BSExpression_28=ruleBSExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_BSExpression_28; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_29=(Token)match(input,22,FOLLOW_22_in_ruleBSTerminalExpression3647); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_29, grammarAccess.getBSTerminalExpressionAccess().getRightParenthesisKeyword_8_2());
                          
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

    // $ANTLR start synpred1_InternalBlorqueScript
    public final void synpred1_InternalBlorqueScript_fragment() throws RecognitionException {   
        // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:941:4: ( 'else' )
        // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:941:6: 'else'
        {
        match(input,26,FOLLOW_26_in_synpred1_InternalBlorqueScript2099); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalBlorqueScript

    // $ANTLR start synpred2_InternalBlorqueScript
    public final void synpred2_InternalBlorqueScript_fragment() throws RecognitionException {   
        // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:1493:4: ( ( '(' ) )
        // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:1494:1: ( '(' )
        {
        // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:1494:1: ( '(' )
        // ../org.example.blorquescript/src-gen/org/xtext/example/blorquescript/parser/antlr/internal/InternalBlorqueScript.g:1495:2: '('
        {
        match(input,20,FOLLOW_20_in_synpred2_InternalBlorqueScript3353); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred2_InternalBlorqueScript

    // Delegated rules

    public final boolean synpred1_InternalBlorqueScript() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalBlorqueScript_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_InternalBlorqueScript() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalBlorqueScript_fragment(); // can never throw exception
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
    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA8_eotS =
        "\7\uffff";
    static final String DFA8_eofS =
        "\7\uffff";
    static final String DFA8_minS =
        "\3\4\1\14\1\4\2\uffff";
    static final String DFA8_maxS =
        "\1\4\1\17\1\4\1\24\1\17\2\uffff";
    static final String DFA8_acceptS =
        "\5\uffff\1\2\1\1";
    static final String DFA8_specialS =
        "\7\uffff}>";
    static final String[] DFA8_transitionS = {
            "\1\1",
            "\1\3\12\uffff\1\2",
            "\1\4",
            "\1\6\7\uffff\1\5",
            "\1\3\12\uffff\1\2",
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
            return "377:1: (this_BSField_0= ruleBSField | this_BSMethod_1= ruleBSMethod )";
        }
    }
    static final String DFA12_eotS =
        "\10\uffff";
    static final String DFA12_eofS =
        "\10\uffff";
    static final String DFA12_minS =
        "\2\4\3\uffff\1\4\1\uffff\1\4";
    static final String DFA12_maxS =
        "\1\43\1\30\3\uffff\1\4\1\uffff\1\30";
    static final String DFA12_acceptS =
        "\2\uffff\1\2\1\3\1\4\1\uffff\1\1\1\uffff";
    static final String DFA12_specialS =
        "\10\uffff}>";
    static final String[] DFA12_transitionS = {
            "\1\1\2\3\15\uffff\1\3\2\uffff\1\2\1\uffff\1\4\4\uffff\6\3",
            "\1\6\7\uffff\1\3\2\uffff\1\5\4\uffff\1\3\3\uffff\1\3",
            "",
            "",
            "",
            "\1\7",
            "",
            "\1\6\7\uffff\1\3\2\uffff\1\5\4\uffff\1\3\3\uffff\1\3"
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "702:1: (this_BSVariableDeclaration_0= ruleBSVariableDeclaration | this_BSReturn_1= ruleBSReturn | (this_BSExpression_2= ruleBSExpression otherlv_3= ';' ) | this_BSIfStatement_4= ruleBSIfStatement )";
        }
    }
 

    public static final BitSet FOLLOW_ruleBSFile_in_entryRuleBSFile75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBSFile85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleBSFile123 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleBSFile144 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleBSFile156 = new BitSet(new long[]{0x0000000000012002L});
    public static final BitSet FOLLOW_ruleBSImport_in_ruleBSFile179 = new BitSet(new long[]{0x0000000000012002L});
    public static final BitSet FOLLOW_ruleBSClass_in_ruleBSFile201 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_ruleBSImport_in_entryRuleBSImport238 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBSImport248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleBSImport285 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_ruleBSImport306 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleBSImport318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard355 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildcard413 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_ruleQualifiedNameWithWildcard432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName475 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName526 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_ruleQualifiedName545 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName560 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_ruleBSClass_in_entryRuleBSClass607 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBSClass617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleBSClass654 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBSClass671 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_17_in_ruleBSClass689 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleBSClass712 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleBSClass726 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_ruleBSMember_in_ruleBSClass747 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_19_in_ruleBSClass760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBSMember_in_entryRuleBSMember796 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBSMember806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBSField_in_ruleBSMember853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBSMethod_in_ruleBSMember880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBSField_in_entryRuleBSField915 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBSField925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleBSField973 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBSField990 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleBSField1007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBSMethod_in_entryRuleBSMethod1043 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBSMethod1053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleBSMethod1101 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBSMethod1118 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleBSMethod1135 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_ruleBSParameter_in_ruleBSMethod1157 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_21_in_ruleBSMethod1170 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleBSParameter_in_ruleBSMethod1191 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_22_in_ruleBSMethod1207 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_ruleBSMethodBody_in_ruleBSMethod1228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBSParameter_in_entryRuleBSParameter1264 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBSParameter1274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleBSParameter1322 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBSParameter1339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBSMethodBody_in_entryRuleBSMethodBody1380 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBSMethodBody1390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleBSMethodBody1436 = new BitSet(new long[]{0x0000000FC2980070L});
    public static final BitSet FOLLOW_ruleBSStatement_in_ruleBSMethodBody1457 = new BitSet(new long[]{0x0000000FC2980070L});
    public static final BitSet FOLLOW_19_in_ruleBSMethodBody1470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBSStatement_in_entryRuleBSStatement1506 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBSStatement1516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBSVariableDeclaration_in_ruleBSStatement1563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBSReturn_in_ruleBSStatement1590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBSExpression_in_ruleBSStatement1618 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleBSStatement1629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBSIfStatement_in_ruleBSStatement1658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBSReturn_in_entryRuleBSReturn1693 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBSReturn1703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleBSReturn1740 = new BitSet(new long[]{0x0000000FC0100070L});
    public static final BitSet FOLLOW_ruleBSExpression_in_ruleBSReturn1761 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleBSReturn1773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBSVariableDeclaration_in_entryRuleBSVariableDeclaration1809 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBSVariableDeclaration1819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleBSVariableDeclaration1867 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBSVariableDeclaration1884 = new BitSet(new long[]{0x0000000001001000L});
    public static final BitSet FOLLOW_24_in_ruleBSVariableDeclaration1902 = new BitSet(new long[]{0x0000000FC0100070L});
    public static final BitSet FOLLOW_ruleBSExpression_in_ruleBSVariableDeclaration1923 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleBSVariableDeclaration1937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBSIfStatement_in_entryRuleBSIfStatement1973 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBSIfStatement1983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleBSIfStatement2020 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleBSIfStatement2032 = new BitSet(new long[]{0x0000000FC0100070L});
    public static final BitSet FOLLOW_ruleBSExpression_in_ruleBSIfStatement2053 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleBSIfStatement2065 = new BitSet(new long[]{0x0000000FC2940070L});
    public static final BitSet FOLLOW_ruleBSIfBlock_in_ruleBSIfStatement2086 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_26_in_ruleBSIfStatement2107 = new BitSet(new long[]{0x0000000FC2940070L});
    public static final BitSet FOLLOW_ruleBSIfBlock_in_ruleBSIfStatement2129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBSIfBlock_in_entryRuleBSIfBlock2167 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBSIfBlock2177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBSStatement_in_ruleBSIfBlock2223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleBSIfBlock2242 = new BitSet(new long[]{0x0000000FC2900070L});
    public static final BitSet FOLLOW_ruleBSStatement_in_ruleBSIfBlock2263 = new BitSet(new long[]{0x0000000FC2980070L});
    public static final BitSet FOLLOW_19_in_ruleBSIfBlock2276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBSExpression_in_entryRuleBSExpression2317 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBSExpression2327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBSAssignment_in_ruleBSExpression2373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBSAssignment_in_entryRuleBSAssignment2407 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBSAssignment2417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBSCastingExpression_in_ruleBSAssignment2465 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_ruleBSSelectionExpression_in_ruleBSAssignment2492 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24_in_ruleBSAssignment2514 = new BitSet(new long[]{0x0000000FC0100070L});
    public static final BitSet FOLLOW_ruleBSExpression_in_ruleBSAssignment2535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBSCastingExpression_in_entryRuleBSCastingExpression2573 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBSCastingExpression2583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleBSCastingExpression2620 = new BitSet(new long[]{0x0000000038000000L});
    public static final BitSet FOLLOW_27_in_ruleBSCastingExpression2640 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_28_in_ruleBSCastingExpression2669 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_29_in_ruleBSCastingExpression2698 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleBSCastingExpression2726 = new BitSet(new long[]{0x0000000FC0100070L});
    public static final BitSet FOLLOW_ruleBSSelectionExpression_in_ruleBSCastingExpression2747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBSSelectionExpression_in_entryRuleBSSelectionExpression2783 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBSSelectionExpression2793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBSTerminalExpression_in_ruleBSSelectionExpression2840 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_ruleBSSelectionExpression2861 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBSSelectionExpression2881 = new BitSet(new long[]{0x0000000000108002L});
    public static final BitSet FOLLOW_20_in_ruleBSSelectionExpression2900 = new BitSet(new long[]{0x0000000FC0500070L});
    public static final BitSet FOLLOW_ruleBSExpression_in_ruleBSSelectionExpression2935 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_21_in_ruleBSSelectionExpression2948 = new BitSet(new long[]{0x0000000FC0100070L});
    public static final BitSet FOLLOW_ruleBSExpression_in_ruleBSSelectionExpression2969 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_22_in_ruleBSSelectionExpression2985 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_ruleBSTerminalExpression_in_entryRuleBSTerminalExpression3025 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBSTerminalExpression3035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleBSTerminalExpression3087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleBSTerminalExpression3126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleBSTerminalExpression3168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleBSTerminalExpression3197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleBSTerminalExpression3242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleBSTerminalExpression3271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleBSTerminalExpression3300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBSTerminalExpression3337 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_20_in_ruleBSTerminalExpression3371 = new BitSet(new long[]{0x0000000FC0500070L});
    public static final BitSet FOLLOW_ruleBSExpression_in_ruleBSTerminalExpression3406 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_21_in_ruleBSTerminalExpression3419 = new BitSet(new long[]{0x0000000FC0100070L});
    public static final BitSet FOLLOW_ruleBSExpression_in_ruleBSTerminalExpression3440 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_22_in_ruleBSTerminalExpression3456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleBSTerminalExpression3487 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleBSTerminalExpression3510 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleBSTerminalExpression3522 = new BitSet(new long[]{0x0000000FC0500070L});
    public static final BitSet FOLLOW_ruleBSExpression_in_ruleBSTerminalExpression3544 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_21_in_ruleBSTerminalExpression3557 = new BitSet(new long[]{0x0000000FC0100070L});
    public static final BitSet FOLLOW_ruleBSExpression_in_ruleBSTerminalExpression3578 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_22_in_ruleBSTerminalExpression3594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleBSTerminalExpression3614 = new BitSet(new long[]{0x0000000FC0100070L});
    public static final BitSet FOLLOW_ruleBSExpression_in_ruleBSTerminalExpression3636 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleBSTerminalExpression3647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_synpred1_InternalBlorqueScript2099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_synpred2_InternalBlorqueScript3353 = new BitSet(new long[]{0x0000000000000002L});

}