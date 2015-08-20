package org.xtext.example.blorquescript.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.blorquescript.services.BlorqueScriptGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalBlorqueScriptParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'string'", "'number'", "'object'", "'true'", "'false'", "'package'", "';'", "'import'", "'.*'", "'.'", "'class'", "'{'", "'}'", "':'", "'('", "')'", "','", "'return'", "'='", "'if'", "'else'", "'null'", "'this'", "'client'", "'new'"
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
    public String getGrammarFileName() { return "../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g"; }


     
     	private BlorqueScriptGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(BlorqueScriptGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleBSFile"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:61:1: entryRuleBSFile : ruleBSFile EOF ;
    public final void entryRuleBSFile() throws RecognitionException {
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:62:1: ( ruleBSFile EOF )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:63:1: ruleBSFile EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBSFileRule()); 
            }
            pushFollow(FOLLOW_ruleBSFile_in_entryRuleBSFile67);
            ruleBSFile();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBSFileRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBSFile74); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBSFile"


    // $ANTLR start "ruleBSFile"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:70:1: ruleBSFile : ( ( rule__BSFile__Group__0 ) ) ;
    public final void ruleBSFile() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:74:2: ( ( ( rule__BSFile__Group__0 ) ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:75:1: ( ( rule__BSFile__Group__0 ) )
            {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:75:1: ( ( rule__BSFile__Group__0 ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:76:1: ( rule__BSFile__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBSFileAccess().getGroup()); 
            }
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:77:1: ( rule__BSFile__Group__0 )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:77:2: rule__BSFile__Group__0
            {
            pushFollow(FOLLOW_rule__BSFile__Group__0_in_ruleBSFile100);
            rule__BSFile__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBSFileAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBSFile"


    // $ANTLR start "entryRuleBSImport"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:89:1: entryRuleBSImport : ruleBSImport EOF ;
    public final void entryRuleBSImport() throws RecognitionException {
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:90:1: ( ruleBSImport EOF )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:91:1: ruleBSImport EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBSImportRule()); 
            }
            pushFollow(FOLLOW_ruleBSImport_in_entryRuleBSImport127);
            ruleBSImport();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBSImportRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBSImport134); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBSImport"


    // $ANTLR start "ruleBSImport"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:98:1: ruleBSImport : ( ( rule__BSImport__Group__0 ) ) ;
    public final void ruleBSImport() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:102:2: ( ( ( rule__BSImport__Group__0 ) ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:103:1: ( ( rule__BSImport__Group__0 ) )
            {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:103:1: ( ( rule__BSImport__Group__0 ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:104:1: ( rule__BSImport__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBSImportAccess().getGroup()); 
            }
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:105:1: ( rule__BSImport__Group__0 )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:105:2: rule__BSImport__Group__0
            {
            pushFollow(FOLLOW_rule__BSImport__Group__0_in_ruleBSImport160);
            rule__BSImport__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBSImportAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBSImport"


    // $ANTLR start "entryRuleQualifiedNameWithWildcard"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:117:1: entryRuleQualifiedNameWithWildcard : ruleQualifiedNameWithWildcard EOF ;
    public final void entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:118:1: ( ruleQualifiedNameWithWildcard EOF )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:119:1: ruleQualifiedNameWithWildcard EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildcardRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard187);
            ruleQualifiedNameWithWildcard();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameWithWildcardRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard194); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQualifiedNameWithWildcard"


    // $ANTLR start "ruleQualifiedNameWithWildcard"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:126:1: ruleQualifiedNameWithWildcard : ( ( rule__QualifiedNameWithWildcard__Group__0 ) ) ;
    public final void ruleQualifiedNameWithWildcard() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:130:2: ( ( ( rule__QualifiedNameWithWildcard__Group__0 ) ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:131:1: ( ( rule__QualifiedNameWithWildcard__Group__0 ) )
            {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:131:1: ( ( rule__QualifiedNameWithWildcard__Group__0 ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:132:1: ( rule__QualifiedNameWithWildcard__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup()); 
            }
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:133:1: ( rule__QualifiedNameWithWildcard__Group__0 )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:133:2: rule__QualifiedNameWithWildcard__Group__0
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildcard__Group__0_in_ruleQualifiedNameWithWildcard220);
            rule__QualifiedNameWithWildcard__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualifiedNameWithWildcard"


    // $ANTLR start "entryRuleQualifiedName"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:145:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:146:1: ( ruleQualifiedName EOF )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:147:1: ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName247);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName254); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:154:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:158:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:159:1: ( ( rule__QualifiedName__Group__0 ) )
            {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:159:1: ( ( rule__QualifiedName__Group__0 ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:160:1: ( rule__QualifiedName__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            }
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:161:1: ( rule__QualifiedName__Group__0 )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:161:2: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName280);
            rule__QualifiedName__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleBSClass"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:173:1: entryRuleBSClass : ruleBSClass EOF ;
    public final void entryRuleBSClass() throws RecognitionException {
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:174:1: ( ruleBSClass EOF )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:175:1: ruleBSClass EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBSClassRule()); 
            }
            pushFollow(FOLLOW_ruleBSClass_in_entryRuleBSClass307);
            ruleBSClass();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBSClassRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBSClass314); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBSClass"


    // $ANTLR start "ruleBSClass"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:182:1: ruleBSClass : ( ( rule__BSClass__Group__0 ) ) ;
    public final void ruleBSClass() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:186:2: ( ( ( rule__BSClass__Group__0 ) ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:187:1: ( ( rule__BSClass__Group__0 ) )
            {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:187:1: ( ( rule__BSClass__Group__0 ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:188:1: ( rule__BSClass__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBSClassAccess().getGroup()); 
            }
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:189:1: ( rule__BSClass__Group__0 )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:189:2: rule__BSClass__Group__0
            {
            pushFollow(FOLLOW_rule__BSClass__Group__0_in_ruleBSClass340);
            rule__BSClass__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBSClassAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBSClass"


    // $ANTLR start "entryRuleBSMember"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:201:1: entryRuleBSMember : ruleBSMember EOF ;
    public final void entryRuleBSMember() throws RecognitionException {
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:202:1: ( ruleBSMember EOF )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:203:1: ruleBSMember EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBSMemberRule()); 
            }
            pushFollow(FOLLOW_ruleBSMember_in_entryRuleBSMember367);
            ruleBSMember();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBSMemberRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBSMember374); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBSMember"


    // $ANTLR start "ruleBSMember"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:210:1: ruleBSMember : ( ( rule__BSMember__Alternatives ) ) ;
    public final void ruleBSMember() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:214:2: ( ( ( rule__BSMember__Alternatives ) ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:215:1: ( ( rule__BSMember__Alternatives ) )
            {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:215:1: ( ( rule__BSMember__Alternatives ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:216:1: ( rule__BSMember__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBSMemberAccess().getAlternatives()); 
            }
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:217:1: ( rule__BSMember__Alternatives )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:217:2: rule__BSMember__Alternatives
            {
            pushFollow(FOLLOW_rule__BSMember__Alternatives_in_ruleBSMember400);
            rule__BSMember__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBSMemberAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBSMember"


    // $ANTLR start "entryRuleBSField"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:229:1: entryRuleBSField : ruleBSField EOF ;
    public final void entryRuleBSField() throws RecognitionException {
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:230:1: ( ruleBSField EOF )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:231:1: ruleBSField EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBSFieldRule()); 
            }
            pushFollow(FOLLOW_ruleBSField_in_entryRuleBSField427);
            ruleBSField();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBSFieldRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBSField434); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBSField"


    // $ANTLR start "ruleBSField"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:238:1: ruleBSField : ( ( rule__BSField__Group__0 ) ) ;
    public final void ruleBSField() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:242:2: ( ( ( rule__BSField__Group__0 ) ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:243:1: ( ( rule__BSField__Group__0 ) )
            {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:243:1: ( ( rule__BSField__Group__0 ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:244:1: ( rule__BSField__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBSFieldAccess().getGroup()); 
            }
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:245:1: ( rule__BSField__Group__0 )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:245:2: rule__BSField__Group__0
            {
            pushFollow(FOLLOW_rule__BSField__Group__0_in_ruleBSField460);
            rule__BSField__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBSFieldAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBSField"


    // $ANTLR start "entryRuleBSMethod"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:257:1: entryRuleBSMethod : ruleBSMethod EOF ;
    public final void entryRuleBSMethod() throws RecognitionException {
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:258:1: ( ruleBSMethod EOF )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:259:1: ruleBSMethod EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBSMethodRule()); 
            }
            pushFollow(FOLLOW_ruleBSMethod_in_entryRuleBSMethod487);
            ruleBSMethod();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBSMethodRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBSMethod494); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBSMethod"


    // $ANTLR start "ruleBSMethod"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:266:1: ruleBSMethod : ( ( rule__BSMethod__Group__0 ) ) ;
    public final void ruleBSMethod() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:270:2: ( ( ( rule__BSMethod__Group__0 ) ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:271:1: ( ( rule__BSMethod__Group__0 ) )
            {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:271:1: ( ( rule__BSMethod__Group__0 ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:272:1: ( rule__BSMethod__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBSMethodAccess().getGroup()); 
            }
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:273:1: ( rule__BSMethod__Group__0 )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:273:2: rule__BSMethod__Group__0
            {
            pushFollow(FOLLOW_rule__BSMethod__Group__0_in_ruleBSMethod520);
            rule__BSMethod__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBSMethodAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBSMethod"


    // $ANTLR start "entryRuleBSParameter"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:285:1: entryRuleBSParameter : ruleBSParameter EOF ;
    public final void entryRuleBSParameter() throws RecognitionException {
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:286:1: ( ruleBSParameter EOF )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:287:1: ruleBSParameter EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBSParameterRule()); 
            }
            pushFollow(FOLLOW_ruleBSParameter_in_entryRuleBSParameter547);
            ruleBSParameter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBSParameterRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBSParameter554); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBSParameter"


    // $ANTLR start "ruleBSParameter"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:294:1: ruleBSParameter : ( ( rule__BSParameter__Group__0 ) ) ;
    public final void ruleBSParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:298:2: ( ( ( rule__BSParameter__Group__0 ) ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:299:1: ( ( rule__BSParameter__Group__0 ) )
            {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:299:1: ( ( rule__BSParameter__Group__0 ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:300:1: ( rule__BSParameter__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBSParameterAccess().getGroup()); 
            }
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:301:1: ( rule__BSParameter__Group__0 )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:301:2: rule__BSParameter__Group__0
            {
            pushFollow(FOLLOW_rule__BSParameter__Group__0_in_ruleBSParameter580);
            rule__BSParameter__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBSParameterAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBSParameter"


    // $ANTLR start "entryRuleBSMethodBody"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:313:1: entryRuleBSMethodBody : ruleBSMethodBody EOF ;
    public final void entryRuleBSMethodBody() throws RecognitionException {
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:314:1: ( ruleBSMethodBody EOF )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:315:1: ruleBSMethodBody EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBSMethodBodyRule()); 
            }
            pushFollow(FOLLOW_ruleBSMethodBody_in_entryRuleBSMethodBody607);
            ruleBSMethodBody();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBSMethodBodyRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBSMethodBody614); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBSMethodBody"


    // $ANTLR start "ruleBSMethodBody"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:322:1: ruleBSMethodBody : ( ( rule__BSMethodBody__Group__0 ) ) ;
    public final void ruleBSMethodBody() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:326:2: ( ( ( rule__BSMethodBody__Group__0 ) ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:327:1: ( ( rule__BSMethodBody__Group__0 ) )
            {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:327:1: ( ( rule__BSMethodBody__Group__0 ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:328:1: ( rule__BSMethodBody__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBSMethodBodyAccess().getGroup()); 
            }
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:329:1: ( rule__BSMethodBody__Group__0 )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:329:2: rule__BSMethodBody__Group__0
            {
            pushFollow(FOLLOW_rule__BSMethodBody__Group__0_in_ruleBSMethodBody640);
            rule__BSMethodBody__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBSMethodBodyAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBSMethodBody"


    // $ANTLR start "entryRuleBSStatement"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:341:1: entryRuleBSStatement : ruleBSStatement EOF ;
    public final void entryRuleBSStatement() throws RecognitionException {
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:342:1: ( ruleBSStatement EOF )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:343:1: ruleBSStatement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBSStatementRule()); 
            }
            pushFollow(FOLLOW_ruleBSStatement_in_entryRuleBSStatement667);
            ruleBSStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBSStatementRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBSStatement674); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBSStatement"


    // $ANTLR start "ruleBSStatement"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:350:1: ruleBSStatement : ( ( rule__BSStatement__Alternatives ) ) ;
    public final void ruleBSStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:354:2: ( ( ( rule__BSStatement__Alternatives ) ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:355:1: ( ( rule__BSStatement__Alternatives ) )
            {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:355:1: ( ( rule__BSStatement__Alternatives ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:356:1: ( rule__BSStatement__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBSStatementAccess().getAlternatives()); 
            }
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:357:1: ( rule__BSStatement__Alternatives )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:357:2: rule__BSStatement__Alternatives
            {
            pushFollow(FOLLOW_rule__BSStatement__Alternatives_in_ruleBSStatement700);
            rule__BSStatement__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBSStatementAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBSStatement"


    // $ANTLR start "entryRuleBSReturn"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:369:1: entryRuleBSReturn : ruleBSReturn EOF ;
    public final void entryRuleBSReturn() throws RecognitionException {
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:370:1: ( ruleBSReturn EOF )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:371:1: ruleBSReturn EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBSReturnRule()); 
            }
            pushFollow(FOLLOW_ruleBSReturn_in_entryRuleBSReturn727);
            ruleBSReturn();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBSReturnRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBSReturn734); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBSReturn"


    // $ANTLR start "ruleBSReturn"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:378:1: ruleBSReturn : ( ( rule__BSReturn__Group__0 ) ) ;
    public final void ruleBSReturn() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:382:2: ( ( ( rule__BSReturn__Group__0 ) ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:383:1: ( ( rule__BSReturn__Group__0 ) )
            {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:383:1: ( ( rule__BSReturn__Group__0 ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:384:1: ( rule__BSReturn__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBSReturnAccess().getGroup()); 
            }
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:385:1: ( rule__BSReturn__Group__0 )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:385:2: rule__BSReturn__Group__0
            {
            pushFollow(FOLLOW_rule__BSReturn__Group__0_in_ruleBSReturn760);
            rule__BSReturn__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBSReturnAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBSReturn"


    // $ANTLR start "entryRuleBSVariableDeclaration"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:397:1: entryRuleBSVariableDeclaration : ruleBSVariableDeclaration EOF ;
    public final void entryRuleBSVariableDeclaration() throws RecognitionException {
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:398:1: ( ruleBSVariableDeclaration EOF )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:399:1: ruleBSVariableDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBSVariableDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleBSVariableDeclaration_in_entryRuleBSVariableDeclaration787);
            ruleBSVariableDeclaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBSVariableDeclarationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBSVariableDeclaration794); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBSVariableDeclaration"


    // $ANTLR start "ruleBSVariableDeclaration"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:406:1: ruleBSVariableDeclaration : ( ( rule__BSVariableDeclaration__Group__0 ) ) ;
    public final void ruleBSVariableDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:410:2: ( ( ( rule__BSVariableDeclaration__Group__0 ) ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:411:1: ( ( rule__BSVariableDeclaration__Group__0 ) )
            {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:411:1: ( ( rule__BSVariableDeclaration__Group__0 ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:412:1: ( rule__BSVariableDeclaration__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBSVariableDeclarationAccess().getGroup()); 
            }
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:413:1: ( rule__BSVariableDeclaration__Group__0 )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:413:2: rule__BSVariableDeclaration__Group__0
            {
            pushFollow(FOLLOW_rule__BSVariableDeclaration__Group__0_in_ruleBSVariableDeclaration820);
            rule__BSVariableDeclaration__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBSVariableDeclarationAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBSVariableDeclaration"


    // $ANTLR start "entryRuleBSIfStatement"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:425:1: entryRuleBSIfStatement : ruleBSIfStatement EOF ;
    public final void entryRuleBSIfStatement() throws RecognitionException {
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:426:1: ( ruleBSIfStatement EOF )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:427:1: ruleBSIfStatement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBSIfStatementRule()); 
            }
            pushFollow(FOLLOW_ruleBSIfStatement_in_entryRuleBSIfStatement847);
            ruleBSIfStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBSIfStatementRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBSIfStatement854); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBSIfStatement"


    // $ANTLR start "ruleBSIfStatement"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:434:1: ruleBSIfStatement : ( ( rule__BSIfStatement__Group__0 ) ) ;
    public final void ruleBSIfStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:438:2: ( ( ( rule__BSIfStatement__Group__0 ) ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:439:1: ( ( rule__BSIfStatement__Group__0 ) )
            {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:439:1: ( ( rule__BSIfStatement__Group__0 ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:440:1: ( rule__BSIfStatement__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBSIfStatementAccess().getGroup()); 
            }
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:441:1: ( rule__BSIfStatement__Group__0 )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:441:2: rule__BSIfStatement__Group__0
            {
            pushFollow(FOLLOW_rule__BSIfStatement__Group__0_in_ruleBSIfStatement880);
            rule__BSIfStatement__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBSIfStatementAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBSIfStatement"


    // $ANTLR start "entryRuleBSIfBlock"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:453:1: entryRuleBSIfBlock : ruleBSIfBlock EOF ;
    public final void entryRuleBSIfBlock() throws RecognitionException {
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:454:1: ( ruleBSIfBlock EOF )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:455:1: ruleBSIfBlock EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBSIfBlockRule()); 
            }
            pushFollow(FOLLOW_ruleBSIfBlock_in_entryRuleBSIfBlock907);
            ruleBSIfBlock();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBSIfBlockRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBSIfBlock914); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBSIfBlock"


    // $ANTLR start "ruleBSIfBlock"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:462:1: ruleBSIfBlock : ( ( rule__BSIfBlock__Alternatives ) ) ;
    public final void ruleBSIfBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:466:2: ( ( ( rule__BSIfBlock__Alternatives ) ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:467:1: ( ( rule__BSIfBlock__Alternatives ) )
            {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:467:1: ( ( rule__BSIfBlock__Alternatives ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:468:1: ( rule__BSIfBlock__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBSIfBlockAccess().getAlternatives()); 
            }
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:469:1: ( rule__BSIfBlock__Alternatives )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:469:2: rule__BSIfBlock__Alternatives
            {
            pushFollow(FOLLOW_rule__BSIfBlock__Alternatives_in_ruleBSIfBlock940);
            rule__BSIfBlock__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBSIfBlockAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBSIfBlock"


    // $ANTLR start "entryRuleBSExpression"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:485:1: entryRuleBSExpression : ruleBSExpression EOF ;
    public final void entryRuleBSExpression() throws RecognitionException {
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:486:1: ( ruleBSExpression EOF )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:487:1: ruleBSExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBSExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleBSExpression_in_entryRuleBSExpression971);
            ruleBSExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBSExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBSExpression978); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBSExpression"


    // $ANTLR start "ruleBSExpression"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:494:1: ruleBSExpression : ( ruleBSAssignment ) ;
    public final void ruleBSExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:498:2: ( ( ruleBSAssignment ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:499:1: ( ruleBSAssignment )
            {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:499:1: ( ruleBSAssignment )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:500:1: ruleBSAssignment
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBSExpressionAccess().getBSAssignmentParserRuleCall()); 
            }
            pushFollow(FOLLOW_ruleBSAssignment_in_ruleBSExpression1004);
            ruleBSAssignment();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBSExpressionAccess().getBSAssignmentParserRuleCall()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBSExpression"


    // $ANTLR start "entryRuleBSAssignment"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:513:1: entryRuleBSAssignment : ruleBSAssignment EOF ;
    public final void entryRuleBSAssignment() throws RecognitionException {
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:514:1: ( ruleBSAssignment EOF )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:515:1: ruleBSAssignment EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBSAssignmentRule()); 
            }
            pushFollow(FOLLOW_ruleBSAssignment_in_entryRuleBSAssignment1030);
            ruleBSAssignment();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBSAssignmentRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBSAssignment1037); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBSAssignment"


    // $ANTLR start "ruleBSAssignment"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:522:1: ruleBSAssignment : ( ( rule__BSAssignment__Group__0 ) ) ;
    public final void ruleBSAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:526:2: ( ( ( rule__BSAssignment__Group__0 ) ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:527:1: ( ( rule__BSAssignment__Group__0 ) )
            {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:527:1: ( ( rule__BSAssignment__Group__0 ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:528:1: ( rule__BSAssignment__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBSAssignmentAccess().getGroup()); 
            }
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:529:1: ( rule__BSAssignment__Group__0 )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:529:2: rule__BSAssignment__Group__0
            {
            pushFollow(FOLLOW_rule__BSAssignment__Group__0_in_ruleBSAssignment1063);
            rule__BSAssignment__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBSAssignmentAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBSAssignment"


    // $ANTLR start "entryRuleBSCastingExpression"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:541:1: entryRuleBSCastingExpression : ruleBSCastingExpression EOF ;
    public final void entryRuleBSCastingExpression() throws RecognitionException {
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:542:1: ( ruleBSCastingExpression EOF )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:543:1: ruleBSCastingExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBSCastingExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleBSCastingExpression_in_entryRuleBSCastingExpression1090);
            ruleBSCastingExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBSCastingExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBSCastingExpression1097); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBSCastingExpression"


    // $ANTLR start "ruleBSCastingExpression"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:550:1: ruleBSCastingExpression : ( ( rule__BSCastingExpression__Group__0 ) ) ;
    public final void ruleBSCastingExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:554:2: ( ( ( rule__BSCastingExpression__Group__0 ) ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:555:1: ( ( rule__BSCastingExpression__Group__0 ) )
            {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:555:1: ( ( rule__BSCastingExpression__Group__0 ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:556:1: ( rule__BSCastingExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBSCastingExpressionAccess().getGroup()); 
            }
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:557:1: ( rule__BSCastingExpression__Group__0 )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:557:2: rule__BSCastingExpression__Group__0
            {
            pushFollow(FOLLOW_rule__BSCastingExpression__Group__0_in_ruleBSCastingExpression1123);
            rule__BSCastingExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBSCastingExpressionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBSCastingExpression"


    // $ANTLR start "entryRuleBSSelectionExpression"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:569:1: entryRuleBSSelectionExpression : ruleBSSelectionExpression EOF ;
    public final void entryRuleBSSelectionExpression() throws RecognitionException {
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:570:1: ( ruleBSSelectionExpression EOF )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:571:1: ruleBSSelectionExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBSSelectionExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleBSSelectionExpression_in_entryRuleBSSelectionExpression1150);
            ruleBSSelectionExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBSSelectionExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBSSelectionExpression1157); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBSSelectionExpression"


    // $ANTLR start "ruleBSSelectionExpression"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:578:1: ruleBSSelectionExpression : ( ( rule__BSSelectionExpression__Group__0 ) ) ;
    public final void ruleBSSelectionExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:582:2: ( ( ( rule__BSSelectionExpression__Group__0 ) ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:583:1: ( ( rule__BSSelectionExpression__Group__0 ) )
            {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:583:1: ( ( rule__BSSelectionExpression__Group__0 ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:584:1: ( rule__BSSelectionExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBSSelectionExpressionAccess().getGroup()); 
            }
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:585:1: ( rule__BSSelectionExpression__Group__0 )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:585:2: rule__BSSelectionExpression__Group__0
            {
            pushFollow(FOLLOW_rule__BSSelectionExpression__Group__0_in_ruleBSSelectionExpression1183);
            rule__BSSelectionExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBSSelectionExpressionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBSSelectionExpression"


    // $ANTLR start "entryRuleBSTerminalExpression"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:597:1: entryRuleBSTerminalExpression : ruleBSTerminalExpression EOF ;
    public final void entryRuleBSTerminalExpression() throws RecognitionException {
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:598:1: ( ruleBSTerminalExpression EOF )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:599:1: ruleBSTerminalExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBSTerminalExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleBSTerminalExpression_in_entryRuleBSTerminalExpression1210);
            ruleBSTerminalExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBSTerminalExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBSTerminalExpression1217); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBSTerminalExpression"


    // $ANTLR start "ruleBSTerminalExpression"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:606:1: ruleBSTerminalExpression : ( ( rule__BSTerminalExpression__Alternatives ) ) ;
    public final void ruleBSTerminalExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:610:2: ( ( ( rule__BSTerminalExpression__Alternatives ) ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:611:1: ( ( rule__BSTerminalExpression__Alternatives ) )
            {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:611:1: ( ( rule__BSTerminalExpression__Alternatives ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:612:1: ( rule__BSTerminalExpression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBSTerminalExpressionAccess().getAlternatives()); 
            }
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:613:1: ( rule__BSTerminalExpression__Alternatives )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:613:2: rule__BSTerminalExpression__Alternatives
            {
            pushFollow(FOLLOW_rule__BSTerminalExpression__Alternatives_in_ruleBSTerminalExpression1243);
            rule__BSTerminalExpression__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBSTerminalExpressionAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBSTerminalExpression"


    // $ANTLR start "rule__BSMember__Alternatives"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:625:1: rule__BSMember__Alternatives : ( ( ruleBSField ) | ( ruleBSMethod ) );
    public final void rule__BSMember__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:629:1: ( ( ruleBSField ) | ( ruleBSMethod ) )
            int alt1=2;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:630:1: ( ruleBSField )
                    {
                    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:630:1: ( ruleBSField )
                    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:631:1: ruleBSField
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBSMemberAccess().getBSFieldParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleBSField_in_rule__BSMember__Alternatives1279);
                    ruleBSField();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBSMemberAccess().getBSFieldParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:636:6: ( ruleBSMethod )
                    {
                    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:636:6: ( ruleBSMethod )
                    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:637:1: ruleBSMethod
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBSMemberAccess().getBSMethodParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleBSMethod_in_rule__BSMember__Alternatives1296);
                    ruleBSMethod();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBSMemberAccess().getBSMethodParserRuleCall_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSMember__Alternatives"


    // $ANTLR start "rule__BSStatement__Alternatives"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:647:1: rule__BSStatement__Alternatives : ( ( ruleBSVariableDeclaration ) | ( ruleBSReturn ) | ( ( rule__BSStatement__Group_2__0 ) ) | ( ruleBSIfStatement ) );
    public final void rule__BSStatement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:651:1: ( ( ruleBSVariableDeclaration ) | ( ruleBSReturn ) | ( ( rule__BSStatement__Group_2__0 ) ) | ( ruleBSIfStatement ) )
            int alt2=4;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:652:1: ( ruleBSVariableDeclaration )
                    {
                    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:652:1: ( ruleBSVariableDeclaration )
                    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:653:1: ruleBSVariableDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBSStatementAccess().getBSVariableDeclarationParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleBSVariableDeclaration_in_rule__BSStatement__Alternatives1328);
                    ruleBSVariableDeclaration();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBSStatementAccess().getBSVariableDeclarationParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:658:6: ( ruleBSReturn )
                    {
                    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:658:6: ( ruleBSReturn )
                    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:659:1: ruleBSReturn
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBSStatementAccess().getBSReturnParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleBSReturn_in_rule__BSStatement__Alternatives1345);
                    ruleBSReturn();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBSStatementAccess().getBSReturnParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:664:6: ( ( rule__BSStatement__Group_2__0 ) )
                    {
                    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:664:6: ( ( rule__BSStatement__Group_2__0 ) )
                    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:665:1: ( rule__BSStatement__Group_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBSStatementAccess().getGroup_2()); 
                    }
                    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:666:1: ( rule__BSStatement__Group_2__0 )
                    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:666:2: rule__BSStatement__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__BSStatement__Group_2__0_in_rule__BSStatement__Alternatives1362);
                    rule__BSStatement__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBSStatementAccess().getGroup_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:670:6: ( ruleBSIfStatement )
                    {
                    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:670:6: ( ruleBSIfStatement )
                    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:671:1: ruleBSIfStatement
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBSStatementAccess().getBSIfStatementParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_ruleBSIfStatement_in_rule__BSStatement__Alternatives1380);
                    ruleBSIfStatement();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBSStatementAccess().getBSIfStatementParserRuleCall_3()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSStatement__Alternatives"


    // $ANTLR start "rule__BSIfBlock__Alternatives"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:681:1: rule__BSIfBlock__Alternatives : ( ( ( rule__BSIfBlock__StatementsAssignment_0 ) ) | ( ( rule__BSIfBlock__Group_1__0 ) ) );
    public final void rule__BSIfBlock__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:685:1: ( ( ( rule__BSIfBlock__StatementsAssignment_0 ) ) | ( ( rule__BSIfBlock__Group_1__0 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=RULE_ID && LA3_0<=RULE_INT)||(LA3_0>=14 && LA3_0<=15)||LA3_0==25||LA3_0==28||LA3_0==30||(LA3_0>=32 && LA3_0<=35)) ) {
                alt3=1;
            }
            else if ( (LA3_0==22) ) {
                alt3=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:686:1: ( ( rule__BSIfBlock__StatementsAssignment_0 ) )
                    {
                    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:686:1: ( ( rule__BSIfBlock__StatementsAssignment_0 ) )
                    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:687:1: ( rule__BSIfBlock__StatementsAssignment_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBSIfBlockAccess().getStatementsAssignment_0()); 
                    }
                    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:688:1: ( rule__BSIfBlock__StatementsAssignment_0 )
                    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:688:2: rule__BSIfBlock__StatementsAssignment_0
                    {
                    pushFollow(FOLLOW_rule__BSIfBlock__StatementsAssignment_0_in_rule__BSIfBlock__Alternatives1412);
                    rule__BSIfBlock__StatementsAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBSIfBlockAccess().getStatementsAssignment_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:692:6: ( ( rule__BSIfBlock__Group_1__0 ) )
                    {
                    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:692:6: ( ( rule__BSIfBlock__Group_1__0 ) )
                    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:693:1: ( rule__BSIfBlock__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBSIfBlockAccess().getGroup_1()); 
                    }
                    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:694:1: ( rule__BSIfBlock__Group_1__0 )
                    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:694:2: rule__BSIfBlock__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__BSIfBlock__Group_1__0_in_rule__BSIfBlock__Alternatives1430);
                    rule__BSIfBlock__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBSIfBlockAccess().getGroup_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSIfBlock__Alternatives"


    // $ANTLR start "rule__BSAssignment__Alternatives_0"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:705:1: rule__BSAssignment__Alternatives_0 : ( ( ruleBSCastingExpression ) | ( ruleBSSelectionExpression ) );
    public final void rule__BSAssignment__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:709:1: ( ( ruleBSCastingExpression ) | ( ruleBSSelectionExpression ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==25) ) {
                int LA4_1 = input.LA(2);

                if ( ((LA4_1>=RULE_ID && LA4_1<=RULE_INT)||(LA4_1>=14 && LA4_1<=15)||LA4_1==25||(LA4_1>=32 && LA4_1<=35)) ) {
                    alt4=2;
                }
                else if ( ((LA4_1>=11 && LA4_1<=13)) ) {
                    alt4=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA4_0>=RULE_ID && LA4_0<=RULE_INT)||(LA4_0>=14 && LA4_0<=15)||(LA4_0>=32 && LA4_0<=35)) ) {
                alt4=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:710:1: ( ruleBSCastingExpression )
                    {
                    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:710:1: ( ruleBSCastingExpression )
                    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:711:1: ruleBSCastingExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBSAssignmentAccess().getBSCastingExpressionParserRuleCall_0_0()); 
                    }
                    pushFollow(FOLLOW_ruleBSCastingExpression_in_rule__BSAssignment__Alternatives_01465);
                    ruleBSCastingExpression();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBSAssignmentAccess().getBSCastingExpressionParserRuleCall_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:716:6: ( ruleBSSelectionExpression )
                    {
                    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:716:6: ( ruleBSSelectionExpression )
                    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:717:1: ruleBSSelectionExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBSAssignmentAccess().getBSSelectionExpressionParserRuleCall_0_1()); 
                    }
                    pushFollow(FOLLOW_ruleBSSelectionExpression_in_rule__BSAssignment__Alternatives_01482);
                    ruleBSSelectionExpression();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBSAssignmentAccess().getBSSelectionExpressionParserRuleCall_0_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSAssignment__Alternatives_0"


    // $ANTLR start "rule__BSCastingExpression__CastTypeAlternatives_1_0"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:727:1: rule__BSCastingExpression__CastTypeAlternatives_1_0 : ( ( 'string' ) | ( 'number' ) | ( 'object' ) );
    public final void rule__BSCastingExpression__CastTypeAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:731:1: ( ( 'string' ) | ( 'number' ) | ( 'object' ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt5=1;
                }
                break;
            case 12:
                {
                alt5=2;
                }
                break;
            case 13:
                {
                alt5=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:732:1: ( 'string' )
                    {
                    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:732:1: ( 'string' )
                    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:733:1: 'string'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBSCastingExpressionAccess().getCastTypeStringKeyword_1_0_0()); 
                    }
                    match(input,11,FOLLOW_11_in_rule__BSCastingExpression__CastTypeAlternatives_1_01515); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBSCastingExpressionAccess().getCastTypeStringKeyword_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:740:6: ( 'number' )
                    {
                    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:740:6: ( 'number' )
                    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:741:1: 'number'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBSCastingExpressionAccess().getCastTypeNumberKeyword_1_0_1()); 
                    }
                    match(input,12,FOLLOW_12_in_rule__BSCastingExpression__CastTypeAlternatives_1_01535); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBSCastingExpressionAccess().getCastTypeNumberKeyword_1_0_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:748:6: ( 'object' )
                    {
                    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:748:6: ( 'object' )
                    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:749:1: 'object'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBSCastingExpressionAccess().getCastTypeObjectKeyword_1_0_2()); 
                    }
                    match(input,13,FOLLOW_13_in_rule__BSCastingExpression__CastTypeAlternatives_1_01555); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBSCastingExpressionAccess().getCastTypeObjectKeyword_1_0_2()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSCastingExpression__CastTypeAlternatives_1_0"


    // $ANTLR start "rule__BSTerminalExpression__Alternatives"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:761:1: rule__BSTerminalExpression__Alternatives : ( ( ( rule__BSTerminalExpression__Group_0__0 ) ) | ( ( rule__BSTerminalExpression__Group_1__0 ) ) | ( ( rule__BSTerminalExpression__Group_2__0 ) ) | ( ( rule__BSTerminalExpression__Group_3__0 ) ) | ( ( rule__BSTerminalExpression__Group_4__0 ) ) | ( ( rule__BSTerminalExpression__Group_5__0 ) ) | ( ( rule__BSTerminalExpression__Group_6__0 ) ) | ( ( rule__BSTerminalExpression__Group_7__0 ) ) | ( ( rule__BSTerminalExpression__Group_8__0 ) ) );
    public final void rule__BSTerminalExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:765:1: ( ( ( rule__BSTerminalExpression__Group_0__0 ) ) | ( ( rule__BSTerminalExpression__Group_1__0 ) ) | ( ( rule__BSTerminalExpression__Group_2__0 ) ) | ( ( rule__BSTerminalExpression__Group_3__0 ) ) | ( ( rule__BSTerminalExpression__Group_4__0 ) ) | ( ( rule__BSTerminalExpression__Group_5__0 ) ) | ( ( rule__BSTerminalExpression__Group_6__0 ) ) | ( ( rule__BSTerminalExpression__Group_7__0 ) ) | ( ( rule__BSTerminalExpression__Group_8__0 ) ) )
            int alt6=9;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt6=1;
                }
                break;
            case RULE_INT:
                {
                alt6=2;
                }
                break;
            case 14:
            case 15:
                {
                alt6=3;
                }
                break;
            case 32:
                {
                alt6=4;
                }
                break;
            case 33:
                {
                alt6=5;
                }
                break;
            case 34:
                {
                alt6=6;
                }
                break;
            case RULE_ID:
                {
                alt6=7;
                }
                break;
            case 35:
                {
                alt6=8;
                }
                break;
            case 25:
                {
                alt6=9;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:766:1: ( ( rule__BSTerminalExpression__Group_0__0 ) )
                    {
                    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:766:1: ( ( rule__BSTerminalExpression__Group_0__0 ) )
                    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:767:1: ( rule__BSTerminalExpression__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBSTerminalExpressionAccess().getGroup_0()); 
                    }
                    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:768:1: ( rule__BSTerminalExpression__Group_0__0 )
                    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:768:2: rule__BSTerminalExpression__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__BSTerminalExpression__Group_0__0_in_rule__BSTerminalExpression__Alternatives1589);
                    rule__BSTerminalExpression__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBSTerminalExpressionAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:772:6: ( ( rule__BSTerminalExpression__Group_1__0 ) )
                    {
                    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:772:6: ( ( rule__BSTerminalExpression__Group_1__0 ) )
                    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:773:1: ( rule__BSTerminalExpression__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBSTerminalExpressionAccess().getGroup_1()); 
                    }
                    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:774:1: ( rule__BSTerminalExpression__Group_1__0 )
                    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:774:2: rule__BSTerminalExpression__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__BSTerminalExpression__Group_1__0_in_rule__BSTerminalExpression__Alternatives1607);
                    rule__BSTerminalExpression__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBSTerminalExpressionAccess().getGroup_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:778:6: ( ( rule__BSTerminalExpression__Group_2__0 ) )
                    {
                    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:778:6: ( ( rule__BSTerminalExpression__Group_2__0 ) )
                    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:779:1: ( rule__BSTerminalExpression__Group_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBSTerminalExpressionAccess().getGroup_2()); 
                    }
                    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:780:1: ( rule__BSTerminalExpression__Group_2__0 )
                    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:780:2: rule__BSTerminalExpression__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__BSTerminalExpression__Group_2__0_in_rule__BSTerminalExpression__Alternatives1625);
                    rule__BSTerminalExpression__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBSTerminalExpressionAccess().getGroup_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:784:6: ( ( rule__BSTerminalExpression__Group_3__0 ) )
                    {
                    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:784:6: ( ( rule__BSTerminalExpression__Group_3__0 ) )
                    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:785:1: ( rule__BSTerminalExpression__Group_3__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBSTerminalExpressionAccess().getGroup_3()); 
                    }
                    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:786:1: ( rule__BSTerminalExpression__Group_3__0 )
                    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:786:2: rule__BSTerminalExpression__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__BSTerminalExpression__Group_3__0_in_rule__BSTerminalExpression__Alternatives1643);
                    rule__BSTerminalExpression__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBSTerminalExpressionAccess().getGroup_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:790:6: ( ( rule__BSTerminalExpression__Group_4__0 ) )
                    {
                    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:790:6: ( ( rule__BSTerminalExpression__Group_4__0 ) )
                    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:791:1: ( rule__BSTerminalExpression__Group_4__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBSTerminalExpressionAccess().getGroup_4()); 
                    }
                    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:792:1: ( rule__BSTerminalExpression__Group_4__0 )
                    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:792:2: rule__BSTerminalExpression__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__BSTerminalExpression__Group_4__0_in_rule__BSTerminalExpression__Alternatives1661);
                    rule__BSTerminalExpression__Group_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBSTerminalExpressionAccess().getGroup_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:796:6: ( ( rule__BSTerminalExpression__Group_5__0 ) )
                    {
                    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:796:6: ( ( rule__BSTerminalExpression__Group_5__0 ) )
                    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:797:1: ( rule__BSTerminalExpression__Group_5__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBSTerminalExpressionAccess().getGroup_5()); 
                    }
                    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:798:1: ( rule__BSTerminalExpression__Group_5__0 )
                    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:798:2: rule__BSTerminalExpression__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__BSTerminalExpression__Group_5__0_in_rule__BSTerminalExpression__Alternatives1679);
                    rule__BSTerminalExpression__Group_5__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBSTerminalExpressionAccess().getGroup_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:802:6: ( ( rule__BSTerminalExpression__Group_6__0 ) )
                    {
                    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:802:6: ( ( rule__BSTerminalExpression__Group_6__0 ) )
                    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:803:1: ( rule__BSTerminalExpression__Group_6__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBSTerminalExpressionAccess().getGroup_6()); 
                    }
                    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:804:1: ( rule__BSTerminalExpression__Group_6__0 )
                    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:804:2: rule__BSTerminalExpression__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__BSTerminalExpression__Group_6__0_in_rule__BSTerminalExpression__Alternatives1697);
                    rule__BSTerminalExpression__Group_6__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBSTerminalExpressionAccess().getGroup_6()); 
                    }

                    }


                    }
                    break;
                case 8 :
                    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:808:6: ( ( rule__BSTerminalExpression__Group_7__0 ) )
                    {
                    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:808:6: ( ( rule__BSTerminalExpression__Group_7__0 ) )
                    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:809:1: ( rule__BSTerminalExpression__Group_7__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBSTerminalExpressionAccess().getGroup_7()); 
                    }
                    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:810:1: ( rule__BSTerminalExpression__Group_7__0 )
                    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:810:2: rule__BSTerminalExpression__Group_7__0
                    {
                    pushFollow(FOLLOW_rule__BSTerminalExpression__Group_7__0_in_rule__BSTerminalExpression__Alternatives1715);
                    rule__BSTerminalExpression__Group_7__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBSTerminalExpressionAccess().getGroup_7()); 
                    }

                    }


                    }
                    break;
                case 9 :
                    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:814:6: ( ( rule__BSTerminalExpression__Group_8__0 ) )
                    {
                    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:814:6: ( ( rule__BSTerminalExpression__Group_8__0 ) )
                    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:815:1: ( rule__BSTerminalExpression__Group_8__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBSTerminalExpressionAccess().getGroup_8()); 
                    }
                    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:816:1: ( rule__BSTerminalExpression__Group_8__0 )
                    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:816:2: rule__BSTerminalExpression__Group_8__0
                    {
                    pushFollow(FOLLOW_rule__BSTerminalExpression__Group_8__0_in_rule__BSTerminalExpression__Alternatives1733);
                    rule__BSTerminalExpression__Group_8__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBSTerminalExpressionAccess().getGroup_8()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSTerminalExpression__Alternatives"


    // $ANTLR start "rule__BSTerminalExpression__ValueAlternatives_2_1_0"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:825:1: rule__BSTerminalExpression__ValueAlternatives_2_1_0 : ( ( 'true' ) | ( 'false' ) );
    public final void rule__BSTerminalExpression__ValueAlternatives_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:829:1: ( ( 'true' ) | ( 'false' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==14) ) {
                alt7=1;
            }
            else if ( (LA7_0==15) ) {
                alt7=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:830:1: ( 'true' )
                    {
                    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:830:1: ( 'true' )
                    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:831:1: 'true'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBSTerminalExpressionAccess().getValueTrueKeyword_2_1_0_0()); 
                    }
                    match(input,14,FOLLOW_14_in_rule__BSTerminalExpression__ValueAlternatives_2_1_01767); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBSTerminalExpressionAccess().getValueTrueKeyword_2_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:838:6: ( 'false' )
                    {
                    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:838:6: ( 'false' )
                    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:839:1: 'false'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBSTerminalExpressionAccess().getValueFalseKeyword_2_1_0_1()); 
                    }
                    match(input,15,FOLLOW_15_in_rule__BSTerminalExpression__ValueAlternatives_2_1_01787); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBSTerminalExpressionAccess().getValueFalseKeyword_2_1_0_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSTerminalExpression__ValueAlternatives_2_1_0"


    // $ANTLR start "rule__BSFile__Group__0"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:853:1: rule__BSFile__Group__0 : rule__BSFile__Group__0__Impl rule__BSFile__Group__1 ;
    public final void rule__BSFile__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:857:1: ( rule__BSFile__Group__0__Impl rule__BSFile__Group__1 )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:858:2: rule__BSFile__Group__0__Impl rule__BSFile__Group__1
            {
            pushFollow(FOLLOW_rule__BSFile__Group__0__Impl_in_rule__BSFile__Group__01819);
            rule__BSFile__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__BSFile__Group__1_in_rule__BSFile__Group__01822);
            rule__BSFile__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSFile__Group__0"


    // $ANTLR start "rule__BSFile__Group__0__Impl"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:865:1: rule__BSFile__Group__0__Impl : ( ( rule__BSFile__Group_0__0 )? ) ;
    public final void rule__BSFile__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:869:1: ( ( ( rule__BSFile__Group_0__0 )? ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:870:1: ( ( rule__BSFile__Group_0__0 )? )
            {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:870:1: ( ( rule__BSFile__Group_0__0 )? )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:871:1: ( rule__BSFile__Group_0__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBSFileAccess().getGroup_0()); 
            }
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:872:1: ( rule__BSFile__Group_0__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==16) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:872:2: rule__BSFile__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__BSFile__Group_0__0_in_rule__BSFile__Group__0__Impl1849);
                    rule__BSFile__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBSFileAccess().getGroup_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSFile__Group__0__Impl"


    // $ANTLR start "rule__BSFile__Group__1"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:882:1: rule__BSFile__Group__1 : rule__BSFile__Group__1__Impl rule__BSFile__Group__2 ;
    public final void rule__BSFile__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:886:1: ( rule__BSFile__Group__1__Impl rule__BSFile__Group__2 )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:887:2: rule__BSFile__Group__1__Impl rule__BSFile__Group__2
            {
            pushFollow(FOLLOW_rule__BSFile__Group__1__Impl_in_rule__BSFile__Group__11880);
            rule__BSFile__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__BSFile__Group__2_in_rule__BSFile__Group__11883);
            rule__BSFile__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSFile__Group__1"


    // $ANTLR start "rule__BSFile__Group__1__Impl"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:894:1: rule__BSFile__Group__1__Impl : ( ( rule__BSFile__ImportsAssignment_1 )* ) ;
    public final void rule__BSFile__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:898:1: ( ( ( rule__BSFile__ImportsAssignment_1 )* ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:899:1: ( ( rule__BSFile__ImportsAssignment_1 )* )
            {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:899:1: ( ( rule__BSFile__ImportsAssignment_1 )* )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:900:1: ( rule__BSFile__ImportsAssignment_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBSFileAccess().getImportsAssignment_1()); 
            }
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:901:1: ( rule__BSFile__ImportsAssignment_1 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==18) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:901:2: rule__BSFile__ImportsAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__BSFile__ImportsAssignment_1_in_rule__BSFile__Group__1__Impl1910);
            	    rule__BSFile__ImportsAssignment_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBSFileAccess().getImportsAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSFile__Group__1__Impl"


    // $ANTLR start "rule__BSFile__Group__2"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:911:1: rule__BSFile__Group__2 : rule__BSFile__Group__2__Impl ;
    public final void rule__BSFile__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:915:1: ( rule__BSFile__Group__2__Impl )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:916:2: rule__BSFile__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__BSFile__Group__2__Impl_in_rule__BSFile__Group__21941);
            rule__BSFile__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSFile__Group__2"


    // $ANTLR start "rule__BSFile__Group__2__Impl"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:922:1: rule__BSFile__Group__2__Impl : ( ( rule__BSFile__ClassesAssignment_2 )* ) ;
    public final void rule__BSFile__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:926:1: ( ( ( rule__BSFile__ClassesAssignment_2 )* ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:927:1: ( ( rule__BSFile__ClassesAssignment_2 )* )
            {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:927:1: ( ( rule__BSFile__ClassesAssignment_2 )* )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:928:1: ( rule__BSFile__ClassesAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBSFileAccess().getClassesAssignment_2()); 
            }
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:929:1: ( rule__BSFile__ClassesAssignment_2 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==21) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:929:2: rule__BSFile__ClassesAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__BSFile__ClassesAssignment_2_in_rule__BSFile__Group__2__Impl1968);
            	    rule__BSFile__ClassesAssignment_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBSFileAccess().getClassesAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSFile__Group__2__Impl"


    // $ANTLR start "rule__BSFile__Group_0__0"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:945:1: rule__BSFile__Group_0__0 : rule__BSFile__Group_0__0__Impl rule__BSFile__Group_0__1 ;
    public final void rule__BSFile__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:949:1: ( rule__BSFile__Group_0__0__Impl rule__BSFile__Group_0__1 )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:950:2: rule__BSFile__Group_0__0__Impl rule__BSFile__Group_0__1
            {
            pushFollow(FOLLOW_rule__BSFile__Group_0__0__Impl_in_rule__BSFile__Group_0__02005);
            rule__BSFile__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__BSFile__Group_0__1_in_rule__BSFile__Group_0__02008);
            rule__BSFile__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSFile__Group_0__0"


    // $ANTLR start "rule__BSFile__Group_0__0__Impl"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:957:1: rule__BSFile__Group_0__0__Impl : ( 'package' ) ;
    public final void rule__BSFile__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:961:1: ( ( 'package' ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:962:1: ( 'package' )
            {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:962:1: ( 'package' )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:963:1: 'package'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBSFileAccess().getPackageKeyword_0_0()); 
            }
            match(input,16,FOLLOW_16_in_rule__BSFile__Group_0__0__Impl2036); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBSFileAccess().getPackageKeyword_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSFile__Group_0__0__Impl"


    // $ANTLR start "rule__BSFile__Group_0__1"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:976:1: rule__BSFile__Group_0__1 : rule__BSFile__Group_0__1__Impl rule__BSFile__Group_0__2 ;
    public final void rule__BSFile__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:980:1: ( rule__BSFile__Group_0__1__Impl rule__BSFile__Group_0__2 )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:981:2: rule__BSFile__Group_0__1__Impl rule__BSFile__Group_0__2
            {
            pushFollow(FOLLOW_rule__BSFile__Group_0__1__Impl_in_rule__BSFile__Group_0__12067);
            rule__BSFile__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__BSFile__Group_0__2_in_rule__BSFile__Group_0__12070);
            rule__BSFile__Group_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSFile__Group_0__1"


    // $ANTLR start "rule__BSFile__Group_0__1__Impl"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:988:1: rule__BSFile__Group_0__1__Impl : ( ( rule__BSFile__NameAssignment_0_1 ) ) ;
    public final void rule__BSFile__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:992:1: ( ( ( rule__BSFile__NameAssignment_0_1 ) ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:993:1: ( ( rule__BSFile__NameAssignment_0_1 ) )
            {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:993:1: ( ( rule__BSFile__NameAssignment_0_1 ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:994:1: ( rule__BSFile__NameAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBSFileAccess().getNameAssignment_0_1()); 
            }
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:995:1: ( rule__BSFile__NameAssignment_0_1 )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:995:2: rule__BSFile__NameAssignment_0_1
            {
            pushFollow(FOLLOW_rule__BSFile__NameAssignment_0_1_in_rule__BSFile__Group_0__1__Impl2097);
            rule__BSFile__NameAssignment_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBSFileAccess().getNameAssignment_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSFile__Group_0__1__Impl"


    // $ANTLR start "rule__BSFile__Group_0__2"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1005:1: rule__BSFile__Group_0__2 : rule__BSFile__Group_0__2__Impl ;
    public final void rule__BSFile__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1009:1: ( rule__BSFile__Group_0__2__Impl )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1010:2: rule__BSFile__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__BSFile__Group_0__2__Impl_in_rule__BSFile__Group_0__22127);
            rule__BSFile__Group_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSFile__Group_0__2"


    // $ANTLR start "rule__BSFile__Group_0__2__Impl"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1016:1: rule__BSFile__Group_0__2__Impl : ( ';' ) ;
    public final void rule__BSFile__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1020:1: ( ( ';' ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1021:1: ( ';' )
            {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1021:1: ( ';' )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1022:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBSFileAccess().getSemicolonKeyword_0_2()); 
            }
            match(input,17,FOLLOW_17_in_rule__BSFile__Group_0__2__Impl2155); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBSFileAccess().getSemicolonKeyword_0_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSFile__Group_0__2__Impl"


    // $ANTLR start "rule__BSImport__Group__0"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1041:1: rule__BSImport__Group__0 : rule__BSImport__Group__0__Impl rule__BSImport__Group__1 ;
    public final void rule__BSImport__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1045:1: ( rule__BSImport__Group__0__Impl rule__BSImport__Group__1 )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1046:2: rule__BSImport__Group__0__Impl rule__BSImport__Group__1
            {
            pushFollow(FOLLOW_rule__BSImport__Group__0__Impl_in_rule__BSImport__Group__02192);
            rule__BSImport__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__BSImport__Group__1_in_rule__BSImport__Group__02195);
            rule__BSImport__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSImport__Group__0"


    // $ANTLR start "rule__BSImport__Group__0__Impl"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1053:1: rule__BSImport__Group__0__Impl : ( 'import' ) ;
    public final void rule__BSImport__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1057:1: ( ( 'import' ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1058:1: ( 'import' )
            {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1058:1: ( 'import' )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1059:1: 'import'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBSImportAccess().getImportKeyword_0()); 
            }
            match(input,18,FOLLOW_18_in_rule__BSImport__Group__0__Impl2223); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBSImportAccess().getImportKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSImport__Group__0__Impl"


    // $ANTLR start "rule__BSImport__Group__1"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1072:1: rule__BSImport__Group__1 : rule__BSImport__Group__1__Impl rule__BSImport__Group__2 ;
    public final void rule__BSImport__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1076:1: ( rule__BSImport__Group__1__Impl rule__BSImport__Group__2 )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1077:2: rule__BSImport__Group__1__Impl rule__BSImport__Group__2
            {
            pushFollow(FOLLOW_rule__BSImport__Group__1__Impl_in_rule__BSImport__Group__12254);
            rule__BSImport__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__BSImport__Group__2_in_rule__BSImport__Group__12257);
            rule__BSImport__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSImport__Group__1"


    // $ANTLR start "rule__BSImport__Group__1__Impl"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1084:1: rule__BSImport__Group__1__Impl : ( ( rule__BSImport__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__BSImport__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1088:1: ( ( ( rule__BSImport__ImportedNamespaceAssignment_1 ) ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1089:1: ( ( rule__BSImport__ImportedNamespaceAssignment_1 ) )
            {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1089:1: ( ( rule__BSImport__ImportedNamespaceAssignment_1 ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1090:1: ( rule__BSImport__ImportedNamespaceAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBSImportAccess().getImportedNamespaceAssignment_1()); 
            }
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1091:1: ( rule__BSImport__ImportedNamespaceAssignment_1 )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1091:2: rule__BSImport__ImportedNamespaceAssignment_1
            {
            pushFollow(FOLLOW_rule__BSImport__ImportedNamespaceAssignment_1_in_rule__BSImport__Group__1__Impl2284);
            rule__BSImport__ImportedNamespaceAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBSImportAccess().getImportedNamespaceAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSImport__Group__1__Impl"


    // $ANTLR start "rule__BSImport__Group__2"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1101:1: rule__BSImport__Group__2 : rule__BSImport__Group__2__Impl ;
    public final void rule__BSImport__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1105:1: ( rule__BSImport__Group__2__Impl )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1106:2: rule__BSImport__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__BSImport__Group__2__Impl_in_rule__BSImport__Group__22314);
            rule__BSImport__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSImport__Group__2"


    // $ANTLR start "rule__BSImport__Group__2__Impl"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1112:1: rule__BSImport__Group__2__Impl : ( ';' ) ;
    public final void rule__BSImport__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1116:1: ( ( ';' ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1117:1: ( ';' )
            {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1117:1: ( ';' )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1118:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBSImportAccess().getSemicolonKeyword_2()); 
            }
            match(input,17,FOLLOW_17_in_rule__BSImport__Group__2__Impl2342); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBSImportAccess().getSemicolonKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSImport__Group__2__Impl"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__0"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1137:1: rule__QualifiedNameWithWildcard__Group__0 : rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 ;
    public final void rule__QualifiedNameWithWildcard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1141:1: ( rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1142:2: rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildcard__Group__0__Impl_in_rule__QualifiedNameWithWildcard__Group__02379);
            rule__QualifiedNameWithWildcard__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__QualifiedNameWithWildcard__Group__1_in_rule__QualifiedNameWithWildcard__Group__02382);
            rule__QualifiedNameWithWildcard__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__0"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__0__Impl"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1149:1: rule__QualifiedNameWithWildcard__Group__0__Impl : ( ruleQualifiedName ) ;
    public final void rule__QualifiedNameWithWildcard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1153:1: ( ( ruleQualifiedName ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1154:1: ( ruleQualifiedName )
            {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1154:1: ( ruleQualifiedName )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1155:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__QualifiedNameWithWildcard__Group__0__Impl2409);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__0__Impl"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__1"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1166:1: rule__QualifiedNameWithWildcard__Group__1 : rule__QualifiedNameWithWildcard__Group__1__Impl ;
    public final void rule__QualifiedNameWithWildcard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1170:1: ( rule__QualifiedNameWithWildcard__Group__1__Impl )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1171:2: rule__QualifiedNameWithWildcard__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildcard__Group__1__Impl_in_rule__QualifiedNameWithWildcard__Group__12438);
            rule__QualifiedNameWithWildcard__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__1"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__1__Impl"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1177:1: rule__QualifiedNameWithWildcard__Group__1__Impl : ( ( '.*' )? ) ;
    public final void rule__QualifiedNameWithWildcard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1181:1: ( ( ( '.*' )? ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1182:1: ( ( '.*' )? )
            {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1182:1: ( ( '.*' )? )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1183:1: ( '.*' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); 
            }
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1184:1: ( '.*' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==19) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1185:2: '.*'
                    {
                    match(input,19,FOLLOW_19_in_rule__QualifiedNameWithWildcard__Group__1__Impl2467); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1200:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1204:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1205:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__02504);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__02507);
            rule__QualifiedName__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0"


    // $ANTLR start "rule__QualifiedName__Group__0__Impl"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1212:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1216:1: ( ( RULE_ID ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1217:1: ( RULE_ID )
            {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1217:1: ( RULE_ID )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1218:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl2534); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group__1"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1229:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1233:1: ( rule__QualifiedName__Group__1__Impl )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1234:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__12563);
            rule__QualifiedName__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1"


    // $ANTLR start "rule__QualifiedName__Group__1__Impl"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1240:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1244:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1245:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1245:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1246:1: ( rule__QualifiedName__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            }
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1247:1: ( rule__QualifiedName__Group_1__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==20) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1247:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl2590);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__0"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1261:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1265:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1266:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__02625);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__02628);
            rule__QualifiedName__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0"


    // $ANTLR start "rule__QualifiedName__Group_1__0__Impl"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1273:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1277:1: ( ( '.' ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1278:1: ( '.' )
            {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1278:1: ( '.' )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1279:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            }
            match(input,20,FOLLOW_20_in_rule__QualifiedName__Group_1__0__Impl2656); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__1"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1292:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1296:1: ( rule__QualifiedName__Group_1__1__Impl )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1297:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__12687);
            rule__QualifiedName__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1"


    // $ANTLR start "rule__QualifiedName__Group_1__1__Impl"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1303:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1307:1: ( ( RULE_ID ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1308:1: ( RULE_ID )
            {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1308:1: ( RULE_ID )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1309:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl2714); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1__Impl"


    // $ANTLR start "rule__BSClass__Group__0"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1324:1: rule__BSClass__Group__0 : rule__BSClass__Group__0__Impl rule__BSClass__Group__1 ;
    public final void rule__BSClass__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1328:1: ( rule__BSClass__Group__0__Impl rule__BSClass__Group__1 )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1329:2: rule__BSClass__Group__0__Impl rule__BSClass__Group__1
            {
            pushFollow(FOLLOW_rule__BSClass__Group__0__Impl_in_rule__BSClass__Group__02747);
            rule__BSClass__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__BSClass__Group__1_in_rule__BSClass__Group__02750);
            rule__BSClass__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSClass__Group__0"


    // $ANTLR start "rule__BSClass__Group__0__Impl"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1336:1: rule__BSClass__Group__0__Impl : ( 'class' ) ;
    public final void rule__BSClass__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1340:1: ( ( 'class' ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1341:1: ( 'class' )
            {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1341:1: ( 'class' )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1342:1: 'class'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBSClassAccess().getClassKeyword_0()); 
            }
            match(input,21,FOLLOW_21_in_rule__BSClass__Group__0__Impl2778); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBSClassAccess().getClassKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSClass__Group__0__Impl"


    // $ANTLR start "rule__BSClass__Group__1"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1355:1: rule__BSClass__Group__1 : rule__BSClass__Group__1__Impl rule__BSClass__Group__2 ;
    public final void rule__BSClass__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1359:1: ( rule__BSClass__Group__1__Impl rule__BSClass__Group__2 )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1360:2: rule__BSClass__Group__1__Impl rule__BSClass__Group__2
            {
            pushFollow(FOLLOW_rule__BSClass__Group__1__Impl_in_rule__BSClass__Group__12809);
            rule__BSClass__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__BSClass__Group__2_in_rule__BSClass__Group__12812);
            rule__BSClass__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSClass__Group__1"


    // $ANTLR start "rule__BSClass__Group__1__Impl"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1367:1: rule__BSClass__Group__1__Impl : ( ( rule__BSClass__NameAssignment_1 ) ) ;
    public final void rule__BSClass__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1371:1: ( ( ( rule__BSClass__NameAssignment_1 ) ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1372:1: ( ( rule__BSClass__NameAssignment_1 ) )
            {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1372:1: ( ( rule__BSClass__NameAssignment_1 ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1373:1: ( rule__BSClass__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBSClassAccess().getNameAssignment_1()); 
            }
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1374:1: ( rule__BSClass__NameAssignment_1 )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1374:2: rule__BSClass__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__BSClass__NameAssignment_1_in_rule__BSClass__Group__1__Impl2839);
            rule__BSClass__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBSClassAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSClass__Group__1__Impl"


    // $ANTLR start "rule__BSClass__Group__2"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1384:1: rule__BSClass__Group__2 : rule__BSClass__Group__2__Impl rule__BSClass__Group__3 ;
    public final void rule__BSClass__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1388:1: ( rule__BSClass__Group__2__Impl rule__BSClass__Group__3 )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1389:2: rule__BSClass__Group__2__Impl rule__BSClass__Group__3
            {
            pushFollow(FOLLOW_rule__BSClass__Group__2__Impl_in_rule__BSClass__Group__22869);
            rule__BSClass__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__BSClass__Group__3_in_rule__BSClass__Group__22872);
            rule__BSClass__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSClass__Group__2"


    // $ANTLR start "rule__BSClass__Group__2__Impl"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1396:1: rule__BSClass__Group__2__Impl : ( ( rule__BSClass__Group_2__0 )? ) ;
    public final void rule__BSClass__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1400:1: ( ( ( rule__BSClass__Group_2__0 )? ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1401:1: ( ( rule__BSClass__Group_2__0 )? )
            {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1401:1: ( ( rule__BSClass__Group_2__0 )? )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1402:1: ( rule__BSClass__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBSClassAccess().getGroup_2()); 
            }
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1403:1: ( rule__BSClass__Group_2__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==24) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1403:2: rule__BSClass__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__BSClass__Group_2__0_in_rule__BSClass__Group__2__Impl2899);
                    rule__BSClass__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBSClassAccess().getGroup_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSClass__Group__2__Impl"


    // $ANTLR start "rule__BSClass__Group__3"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1413:1: rule__BSClass__Group__3 : rule__BSClass__Group__3__Impl rule__BSClass__Group__4 ;
    public final void rule__BSClass__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1417:1: ( rule__BSClass__Group__3__Impl rule__BSClass__Group__4 )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1418:2: rule__BSClass__Group__3__Impl rule__BSClass__Group__4
            {
            pushFollow(FOLLOW_rule__BSClass__Group__3__Impl_in_rule__BSClass__Group__32930);
            rule__BSClass__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__BSClass__Group__4_in_rule__BSClass__Group__32933);
            rule__BSClass__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSClass__Group__3"


    // $ANTLR start "rule__BSClass__Group__3__Impl"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1425:1: rule__BSClass__Group__3__Impl : ( '{' ) ;
    public final void rule__BSClass__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1429:1: ( ( '{' ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1430:1: ( '{' )
            {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1430:1: ( '{' )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1431:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBSClassAccess().getLeftCurlyBracketKeyword_3()); 
            }
            match(input,22,FOLLOW_22_in_rule__BSClass__Group__3__Impl2961); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBSClassAccess().getLeftCurlyBracketKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSClass__Group__3__Impl"


    // $ANTLR start "rule__BSClass__Group__4"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1444:1: rule__BSClass__Group__4 : rule__BSClass__Group__4__Impl rule__BSClass__Group__5 ;
    public final void rule__BSClass__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1448:1: ( rule__BSClass__Group__4__Impl rule__BSClass__Group__5 )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1449:2: rule__BSClass__Group__4__Impl rule__BSClass__Group__5
            {
            pushFollow(FOLLOW_rule__BSClass__Group__4__Impl_in_rule__BSClass__Group__42992);
            rule__BSClass__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__BSClass__Group__5_in_rule__BSClass__Group__42995);
            rule__BSClass__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSClass__Group__4"


    // $ANTLR start "rule__BSClass__Group__4__Impl"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1456:1: rule__BSClass__Group__4__Impl : ( ( rule__BSClass__MembersAssignment_4 )* ) ;
    public final void rule__BSClass__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1460:1: ( ( ( rule__BSClass__MembersAssignment_4 )* ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1461:1: ( ( rule__BSClass__MembersAssignment_4 )* )
            {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1461:1: ( ( rule__BSClass__MembersAssignment_4 )* )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1462:1: ( rule__BSClass__MembersAssignment_4 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBSClassAccess().getMembersAssignment_4()); 
            }
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1463:1: ( rule__BSClass__MembersAssignment_4 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ID) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1463:2: rule__BSClass__MembersAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__BSClass__MembersAssignment_4_in_rule__BSClass__Group__4__Impl3022);
            	    rule__BSClass__MembersAssignment_4();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBSClassAccess().getMembersAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSClass__Group__4__Impl"


    // $ANTLR start "rule__BSClass__Group__5"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1473:1: rule__BSClass__Group__5 : rule__BSClass__Group__5__Impl ;
    public final void rule__BSClass__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1477:1: ( rule__BSClass__Group__5__Impl )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1478:2: rule__BSClass__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__BSClass__Group__5__Impl_in_rule__BSClass__Group__53053);
            rule__BSClass__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSClass__Group__5"


    // $ANTLR start "rule__BSClass__Group__5__Impl"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1484:1: rule__BSClass__Group__5__Impl : ( '}' ) ;
    public final void rule__BSClass__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1488:1: ( ( '}' ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1489:1: ( '}' )
            {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1489:1: ( '}' )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1490:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBSClassAccess().getRightCurlyBracketKeyword_5()); 
            }
            match(input,23,FOLLOW_23_in_rule__BSClass__Group__5__Impl3081); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBSClassAccess().getRightCurlyBracketKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSClass__Group__5__Impl"


    // $ANTLR start "rule__BSClass__Group_2__0"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1515:1: rule__BSClass__Group_2__0 : rule__BSClass__Group_2__0__Impl rule__BSClass__Group_2__1 ;
    public final void rule__BSClass__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1519:1: ( rule__BSClass__Group_2__0__Impl rule__BSClass__Group_2__1 )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1520:2: rule__BSClass__Group_2__0__Impl rule__BSClass__Group_2__1
            {
            pushFollow(FOLLOW_rule__BSClass__Group_2__0__Impl_in_rule__BSClass__Group_2__03124);
            rule__BSClass__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__BSClass__Group_2__1_in_rule__BSClass__Group_2__03127);
            rule__BSClass__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSClass__Group_2__0"


    // $ANTLR start "rule__BSClass__Group_2__0__Impl"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1527:1: rule__BSClass__Group_2__0__Impl : ( ':' ) ;
    public final void rule__BSClass__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1531:1: ( ( ':' ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1532:1: ( ':' )
            {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1532:1: ( ':' )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1533:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBSClassAccess().getColonKeyword_2_0()); 
            }
            match(input,24,FOLLOW_24_in_rule__BSClass__Group_2__0__Impl3155); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBSClassAccess().getColonKeyword_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSClass__Group_2__0__Impl"


    // $ANTLR start "rule__BSClass__Group_2__1"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1546:1: rule__BSClass__Group_2__1 : rule__BSClass__Group_2__1__Impl ;
    public final void rule__BSClass__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1550:1: ( rule__BSClass__Group_2__1__Impl )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1551:2: rule__BSClass__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__BSClass__Group_2__1__Impl_in_rule__BSClass__Group_2__13186);
            rule__BSClass__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSClass__Group_2__1"


    // $ANTLR start "rule__BSClass__Group_2__1__Impl"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1557:1: rule__BSClass__Group_2__1__Impl : ( ( rule__BSClass__SuperclassAssignment_2_1 ) ) ;
    public final void rule__BSClass__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1561:1: ( ( ( rule__BSClass__SuperclassAssignment_2_1 ) ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1562:1: ( ( rule__BSClass__SuperclassAssignment_2_1 ) )
            {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1562:1: ( ( rule__BSClass__SuperclassAssignment_2_1 ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1563:1: ( rule__BSClass__SuperclassAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBSClassAccess().getSuperclassAssignment_2_1()); 
            }
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1564:1: ( rule__BSClass__SuperclassAssignment_2_1 )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1564:2: rule__BSClass__SuperclassAssignment_2_1
            {
            pushFollow(FOLLOW_rule__BSClass__SuperclassAssignment_2_1_in_rule__BSClass__Group_2__1__Impl3213);
            rule__BSClass__SuperclassAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBSClassAccess().getSuperclassAssignment_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSClass__Group_2__1__Impl"


    // $ANTLR start "rule__BSField__Group__0"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1578:1: rule__BSField__Group__0 : rule__BSField__Group__0__Impl rule__BSField__Group__1 ;
    public final void rule__BSField__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1582:1: ( rule__BSField__Group__0__Impl rule__BSField__Group__1 )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1583:2: rule__BSField__Group__0__Impl rule__BSField__Group__1
            {
            pushFollow(FOLLOW_rule__BSField__Group__0__Impl_in_rule__BSField__Group__03247);
            rule__BSField__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__BSField__Group__1_in_rule__BSField__Group__03250);
            rule__BSField__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSField__Group__0"


    // $ANTLR start "rule__BSField__Group__0__Impl"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1590:1: rule__BSField__Group__0__Impl : ( ( rule__BSField__TypeAssignment_0 ) ) ;
    public final void rule__BSField__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1594:1: ( ( ( rule__BSField__TypeAssignment_0 ) ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1595:1: ( ( rule__BSField__TypeAssignment_0 ) )
            {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1595:1: ( ( rule__BSField__TypeAssignment_0 ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1596:1: ( rule__BSField__TypeAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBSFieldAccess().getTypeAssignment_0()); 
            }
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1597:1: ( rule__BSField__TypeAssignment_0 )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1597:2: rule__BSField__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__BSField__TypeAssignment_0_in_rule__BSField__Group__0__Impl3277);
            rule__BSField__TypeAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBSFieldAccess().getTypeAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSField__Group__0__Impl"


    // $ANTLR start "rule__BSField__Group__1"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1607:1: rule__BSField__Group__1 : rule__BSField__Group__1__Impl rule__BSField__Group__2 ;
    public final void rule__BSField__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1611:1: ( rule__BSField__Group__1__Impl rule__BSField__Group__2 )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1612:2: rule__BSField__Group__1__Impl rule__BSField__Group__2
            {
            pushFollow(FOLLOW_rule__BSField__Group__1__Impl_in_rule__BSField__Group__13307);
            rule__BSField__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__BSField__Group__2_in_rule__BSField__Group__13310);
            rule__BSField__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSField__Group__1"


    // $ANTLR start "rule__BSField__Group__1__Impl"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1619:1: rule__BSField__Group__1__Impl : ( ( rule__BSField__NameAssignment_1 ) ) ;
    public final void rule__BSField__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1623:1: ( ( ( rule__BSField__NameAssignment_1 ) ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1624:1: ( ( rule__BSField__NameAssignment_1 ) )
            {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1624:1: ( ( rule__BSField__NameAssignment_1 ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1625:1: ( rule__BSField__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBSFieldAccess().getNameAssignment_1()); 
            }
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1626:1: ( rule__BSField__NameAssignment_1 )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1626:2: rule__BSField__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__BSField__NameAssignment_1_in_rule__BSField__Group__1__Impl3337);
            rule__BSField__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBSFieldAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSField__Group__1__Impl"


    // $ANTLR start "rule__BSField__Group__2"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1636:1: rule__BSField__Group__2 : rule__BSField__Group__2__Impl ;
    public final void rule__BSField__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1640:1: ( rule__BSField__Group__2__Impl )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1641:2: rule__BSField__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__BSField__Group__2__Impl_in_rule__BSField__Group__23367);
            rule__BSField__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSField__Group__2"


    // $ANTLR start "rule__BSField__Group__2__Impl"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1647:1: rule__BSField__Group__2__Impl : ( ';' ) ;
    public final void rule__BSField__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1651:1: ( ( ';' ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1652:1: ( ';' )
            {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1652:1: ( ';' )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1653:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBSFieldAccess().getSemicolonKeyword_2()); 
            }
            match(input,17,FOLLOW_17_in_rule__BSField__Group__2__Impl3395); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBSFieldAccess().getSemicolonKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSField__Group__2__Impl"


    // $ANTLR start "rule__BSMethod__Group__0"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1672:1: rule__BSMethod__Group__0 : rule__BSMethod__Group__0__Impl rule__BSMethod__Group__1 ;
    public final void rule__BSMethod__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1676:1: ( rule__BSMethod__Group__0__Impl rule__BSMethod__Group__1 )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1677:2: rule__BSMethod__Group__0__Impl rule__BSMethod__Group__1
            {
            pushFollow(FOLLOW_rule__BSMethod__Group__0__Impl_in_rule__BSMethod__Group__03432);
            rule__BSMethod__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__BSMethod__Group__1_in_rule__BSMethod__Group__03435);
            rule__BSMethod__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSMethod__Group__0"


    // $ANTLR start "rule__BSMethod__Group__0__Impl"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1684:1: rule__BSMethod__Group__0__Impl : ( ( rule__BSMethod__TypeAssignment_0 ) ) ;
    public final void rule__BSMethod__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1688:1: ( ( ( rule__BSMethod__TypeAssignment_0 ) ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1689:1: ( ( rule__BSMethod__TypeAssignment_0 ) )
            {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1689:1: ( ( rule__BSMethod__TypeAssignment_0 ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1690:1: ( rule__BSMethod__TypeAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBSMethodAccess().getTypeAssignment_0()); 
            }
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1691:1: ( rule__BSMethod__TypeAssignment_0 )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1691:2: rule__BSMethod__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__BSMethod__TypeAssignment_0_in_rule__BSMethod__Group__0__Impl3462);
            rule__BSMethod__TypeAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBSMethodAccess().getTypeAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSMethod__Group__0__Impl"


    // $ANTLR start "rule__BSMethod__Group__1"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1701:1: rule__BSMethod__Group__1 : rule__BSMethod__Group__1__Impl rule__BSMethod__Group__2 ;
    public final void rule__BSMethod__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1705:1: ( rule__BSMethod__Group__1__Impl rule__BSMethod__Group__2 )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1706:2: rule__BSMethod__Group__1__Impl rule__BSMethod__Group__2
            {
            pushFollow(FOLLOW_rule__BSMethod__Group__1__Impl_in_rule__BSMethod__Group__13492);
            rule__BSMethod__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__BSMethod__Group__2_in_rule__BSMethod__Group__13495);
            rule__BSMethod__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSMethod__Group__1"


    // $ANTLR start "rule__BSMethod__Group__1__Impl"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1713:1: rule__BSMethod__Group__1__Impl : ( ( rule__BSMethod__NameAssignment_1 ) ) ;
    public final void rule__BSMethod__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1717:1: ( ( ( rule__BSMethod__NameAssignment_1 ) ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1718:1: ( ( rule__BSMethod__NameAssignment_1 ) )
            {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1718:1: ( ( rule__BSMethod__NameAssignment_1 ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1719:1: ( rule__BSMethod__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBSMethodAccess().getNameAssignment_1()); 
            }
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1720:1: ( rule__BSMethod__NameAssignment_1 )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1720:2: rule__BSMethod__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__BSMethod__NameAssignment_1_in_rule__BSMethod__Group__1__Impl3522);
            rule__BSMethod__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBSMethodAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSMethod__Group__1__Impl"


    // $ANTLR start "rule__BSMethod__Group__2"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1730:1: rule__BSMethod__Group__2 : rule__BSMethod__Group__2__Impl rule__BSMethod__Group__3 ;
    public final void rule__BSMethod__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1734:1: ( rule__BSMethod__Group__2__Impl rule__BSMethod__Group__3 )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1735:2: rule__BSMethod__Group__2__Impl rule__BSMethod__Group__3
            {
            pushFollow(FOLLOW_rule__BSMethod__Group__2__Impl_in_rule__BSMethod__Group__23552);
            rule__BSMethod__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__BSMethod__Group__3_in_rule__BSMethod__Group__23555);
            rule__BSMethod__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSMethod__Group__2"


    // $ANTLR start "rule__BSMethod__Group__2__Impl"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1742:1: rule__BSMethod__Group__2__Impl : ( '(' ) ;
    public final void rule__BSMethod__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1746:1: ( ( '(' ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1747:1: ( '(' )
            {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1747:1: ( '(' )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1748:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBSMethodAccess().getLeftParenthesisKeyword_2()); 
            }
            match(input,25,FOLLOW_25_in_rule__BSMethod__Group__2__Impl3583); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBSMethodAccess().getLeftParenthesisKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSMethod__Group__2__Impl"


    // $ANTLR start "rule__BSMethod__Group__3"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1761:1: rule__BSMethod__Group__3 : rule__BSMethod__Group__3__Impl rule__BSMethod__Group__4 ;
    public final void rule__BSMethod__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1765:1: ( rule__BSMethod__Group__3__Impl rule__BSMethod__Group__4 )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1766:2: rule__BSMethod__Group__3__Impl rule__BSMethod__Group__4
            {
            pushFollow(FOLLOW_rule__BSMethod__Group__3__Impl_in_rule__BSMethod__Group__33614);
            rule__BSMethod__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__BSMethod__Group__4_in_rule__BSMethod__Group__33617);
            rule__BSMethod__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSMethod__Group__3"


    // $ANTLR start "rule__BSMethod__Group__3__Impl"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1773:1: rule__BSMethod__Group__3__Impl : ( ( rule__BSMethod__Group_3__0 )? ) ;
    public final void rule__BSMethod__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1777:1: ( ( ( rule__BSMethod__Group_3__0 )? ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1778:1: ( ( rule__BSMethod__Group_3__0 )? )
            {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1778:1: ( ( rule__BSMethod__Group_3__0 )? )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1779:1: ( rule__BSMethod__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBSMethodAccess().getGroup_3()); 
            }
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1780:1: ( rule__BSMethod__Group_3__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_ID) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1780:2: rule__BSMethod__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__BSMethod__Group_3__0_in_rule__BSMethod__Group__3__Impl3644);
                    rule__BSMethod__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBSMethodAccess().getGroup_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSMethod__Group__3__Impl"


    // $ANTLR start "rule__BSMethod__Group__4"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1790:1: rule__BSMethod__Group__4 : rule__BSMethod__Group__4__Impl rule__BSMethod__Group__5 ;
    public final void rule__BSMethod__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1794:1: ( rule__BSMethod__Group__4__Impl rule__BSMethod__Group__5 )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1795:2: rule__BSMethod__Group__4__Impl rule__BSMethod__Group__5
            {
            pushFollow(FOLLOW_rule__BSMethod__Group__4__Impl_in_rule__BSMethod__Group__43675);
            rule__BSMethod__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__BSMethod__Group__5_in_rule__BSMethod__Group__43678);
            rule__BSMethod__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSMethod__Group__4"


    // $ANTLR start "rule__BSMethod__Group__4__Impl"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1802:1: rule__BSMethod__Group__4__Impl : ( ')' ) ;
    public final void rule__BSMethod__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1806:1: ( ( ')' ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1807:1: ( ')' )
            {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1807:1: ( ')' )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1808:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBSMethodAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,26,FOLLOW_26_in_rule__BSMethod__Group__4__Impl3706); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBSMethodAccess().getRightParenthesisKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSMethod__Group__4__Impl"


    // $ANTLR start "rule__BSMethod__Group__5"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1821:1: rule__BSMethod__Group__5 : rule__BSMethod__Group__5__Impl ;
    public final void rule__BSMethod__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1825:1: ( rule__BSMethod__Group__5__Impl )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1826:2: rule__BSMethod__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__BSMethod__Group__5__Impl_in_rule__BSMethod__Group__53737);
            rule__BSMethod__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSMethod__Group__5"


    // $ANTLR start "rule__BSMethod__Group__5__Impl"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1832:1: rule__BSMethod__Group__5__Impl : ( ( rule__BSMethod__BodyAssignment_5 ) ) ;
    public final void rule__BSMethod__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1836:1: ( ( ( rule__BSMethod__BodyAssignment_5 ) ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1837:1: ( ( rule__BSMethod__BodyAssignment_5 ) )
            {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1837:1: ( ( rule__BSMethod__BodyAssignment_5 ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1838:1: ( rule__BSMethod__BodyAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBSMethodAccess().getBodyAssignment_5()); 
            }
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1839:1: ( rule__BSMethod__BodyAssignment_5 )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1839:2: rule__BSMethod__BodyAssignment_5
            {
            pushFollow(FOLLOW_rule__BSMethod__BodyAssignment_5_in_rule__BSMethod__Group__5__Impl3764);
            rule__BSMethod__BodyAssignment_5();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBSMethodAccess().getBodyAssignment_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSMethod__Group__5__Impl"


    // $ANTLR start "rule__BSMethod__Group_3__0"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1861:1: rule__BSMethod__Group_3__0 : rule__BSMethod__Group_3__0__Impl rule__BSMethod__Group_3__1 ;
    public final void rule__BSMethod__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1865:1: ( rule__BSMethod__Group_3__0__Impl rule__BSMethod__Group_3__1 )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1866:2: rule__BSMethod__Group_3__0__Impl rule__BSMethod__Group_3__1
            {
            pushFollow(FOLLOW_rule__BSMethod__Group_3__0__Impl_in_rule__BSMethod__Group_3__03806);
            rule__BSMethod__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__BSMethod__Group_3__1_in_rule__BSMethod__Group_3__03809);
            rule__BSMethod__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSMethod__Group_3__0"


    // $ANTLR start "rule__BSMethod__Group_3__0__Impl"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1873:1: rule__BSMethod__Group_3__0__Impl : ( ( rule__BSMethod__ParamsAssignment_3_0 ) ) ;
    public final void rule__BSMethod__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1877:1: ( ( ( rule__BSMethod__ParamsAssignment_3_0 ) ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1878:1: ( ( rule__BSMethod__ParamsAssignment_3_0 ) )
            {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1878:1: ( ( rule__BSMethod__ParamsAssignment_3_0 ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1879:1: ( rule__BSMethod__ParamsAssignment_3_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBSMethodAccess().getParamsAssignment_3_0()); 
            }
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1880:1: ( rule__BSMethod__ParamsAssignment_3_0 )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1880:2: rule__BSMethod__ParamsAssignment_3_0
            {
            pushFollow(FOLLOW_rule__BSMethod__ParamsAssignment_3_0_in_rule__BSMethod__Group_3__0__Impl3836);
            rule__BSMethod__ParamsAssignment_3_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBSMethodAccess().getParamsAssignment_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSMethod__Group_3__0__Impl"


    // $ANTLR start "rule__BSMethod__Group_3__1"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1890:1: rule__BSMethod__Group_3__1 : rule__BSMethod__Group_3__1__Impl ;
    public final void rule__BSMethod__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1894:1: ( rule__BSMethod__Group_3__1__Impl )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1895:2: rule__BSMethod__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__BSMethod__Group_3__1__Impl_in_rule__BSMethod__Group_3__13866);
            rule__BSMethod__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSMethod__Group_3__1"


    // $ANTLR start "rule__BSMethod__Group_3__1__Impl"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1901:1: rule__BSMethod__Group_3__1__Impl : ( ( rule__BSMethod__Group_3_1__0 )* ) ;
    public final void rule__BSMethod__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1905:1: ( ( ( rule__BSMethod__Group_3_1__0 )* ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1906:1: ( ( rule__BSMethod__Group_3_1__0 )* )
            {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1906:1: ( ( rule__BSMethod__Group_3_1__0 )* )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1907:1: ( rule__BSMethod__Group_3_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBSMethodAccess().getGroup_3_1()); 
            }
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1908:1: ( rule__BSMethod__Group_3_1__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==27) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1908:2: rule__BSMethod__Group_3_1__0
            	    {
            	    pushFollow(FOLLOW_rule__BSMethod__Group_3_1__0_in_rule__BSMethod__Group_3__1__Impl3893);
            	    rule__BSMethod__Group_3_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBSMethodAccess().getGroup_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSMethod__Group_3__1__Impl"


    // $ANTLR start "rule__BSMethod__Group_3_1__0"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1922:1: rule__BSMethod__Group_3_1__0 : rule__BSMethod__Group_3_1__0__Impl rule__BSMethod__Group_3_1__1 ;
    public final void rule__BSMethod__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1926:1: ( rule__BSMethod__Group_3_1__0__Impl rule__BSMethod__Group_3_1__1 )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1927:2: rule__BSMethod__Group_3_1__0__Impl rule__BSMethod__Group_3_1__1
            {
            pushFollow(FOLLOW_rule__BSMethod__Group_3_1__0__Impl_in_rule__BSMethod__Group_3_1__03928);
            rule__BSMethod__Group_3_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__BSMethod__Group_3_1__1_in_rule__BSMethod__Group_3_1__03931);
            rule__BSMethod__Group_3_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSMethod__Group_3_1__0"


    // $ANTLR start "rule__BSMethod__Group_3_1__0__Impl"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1934:1: rule__BSMethod__Group_3_1__0__Impl : ( ',' ) ;
    public final void rule__BSMethod__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1938:1: ( ( ',' ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1939:1: ( ',' )
            {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1939:1: ( ',' )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1940:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBSMethodAccess().getCommaKeyword_3_1_0()); 
            }
            match(input,27,FOLLOW_27_in_rule__BSMethod__Group_3_1__0__Impl3959); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBSMethodAccess().getCommaKeyword_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSMethod__Group_3_1__0__Impl"


    // $ANTLR start "rule__BSMethod__Group_3_1__1"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1953:1: rule__BSMethod__Group_3_1__1 : rule__BSMethod__Group_3_1__1__Impl ;
    public final void rule__BSMethod__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1957:1: ( rule__BSMethod__Group_3_1__1__Impl )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1958:2: rule__BSMethod__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_rule__BSMethod__Group_3_1__1__Impl_in_rule__BSMethod__Group_3_1__13990);
            rule__BSMethod__Group_3_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSMethod__Group_3_1__1"


    // $ANTLR start "rule__BSMethod__Group_3_1__1__Impl"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1964:1: rule__BSMethod__Group_3_1__1__Impl : ( ( rule__BSMethod__ParamsAssignment_3_1_1 ) ) ;
    public final void rule__BSMethod__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1968:1: ( ( ( rule__BSMethod__ParamsAssignment_3_1_1 ) ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1969:1: ( ( rule__BSMethod__ParamsAssignment_3_1_1 ) )
            {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1969:1: ( ( rule__BSMethod__ParamsAssignment_3_1_1 ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1970:1: ( rule__BSMethod__ParamsAssignment_3_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBSMethodAccess().getParamsAssignment_3_1_1()); 
            }
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1971:1: ( rule__BSMethod__ParamsAssignment_3_1_1 )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1971:2: rule__BSMethod__ParamsAssignment_3_1_1
            {
            pushFollow(FOLLOW_rule__BSMethod__ParamsAssignment_3_1_1_in_rule__BSMethod__Group_3_1__1__Impl4017);
            rule__BSMethod__ParamsAssignment_3_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBSMethodAccess().getParamsAssignment_3_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSMethod__Group_3_1__1__Impl"


    // $ANTLR start "rule__BSParameter__Group__0"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1985:1: rule__BSParameter__Group__0 : rule__BSParameter__Group__0__Impl rule__BSParameter__Group__1 ;
    public final void rule__BSParameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1989:1: ( rule__BSParameter__Group__0__Impl rule__BSParameter__Group__1 )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1990:2: rule__BSParameter__Group__0__Impl rule__BSParameter__Group__1
            {
            pushFollow(FOLLOW_rule__BSParameter__Group__0__Impl_in_rule__BSParameter__Group__04051);
            rule__BSParameter__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__BSParameter__Group__1_in_rule__BSParameter__Group__04054);
            rule__BSParameter__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSParameter__Group__0"


    // $ANTLR start "rule__BSParameter__Group__0__Impl"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:1997:1: rule__BSParameter__Group__0__Impl : ( ( rule__BSParameter__TypeAssignment_0 ) ) ;
    public final void rule__BSParameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2001:1: ( ( ( rule__BSParameter__TypeAssignment_0 ) ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2002:1: ( ( rule__BSParameter__TypeAssignment_0 ) )
            {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2002:1: ( ( rule__BSParameter__TypeAssignment_0 ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2003:1: ( rule__BSParameter__TypeAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBSParameterAccess().getTypeAssignment_0()); 
            }
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2004:1: ( rule__BSParameter__TypeAssignment_0 )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2004:2: rule__BSParameter__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__BSParameter__TypeAssignment_0_in_rule__BSParameter__Group__0__Impl4081);
            rule__BSParameter__TypeAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBSParameterAccess().getTypeAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSParameter__Group__0__Impl"


    // $ANTLR start "rule__BSParameter__Group__1"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2014:1: rule__BSParameter__Group__1 : rule__BSParameter__Group__1__Impl ;
    public final void rule__BSParameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2018:1: ( rule__BSParameter__Group__1__Impl )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2019:2: rule__BSParameter__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__BSParameter__Group__1__Impl_in_rule__BSParameter__Group__14111);
            rule__BSParameter__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSParameter__Group__1"


    // $ANTLR start "rule__BSParameter__Group__1__Impl"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2025:1: rule__BSParameter__Group__1__Impl : ( ( rule__BSParameter__NameAssignment_1 ) ) ;
    public final void rule__BSParameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2029:1: ( ( ( rule__BSParameter__NameAssignment_1 ) ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2030:1: ( ( rule__BSParameter__NameAssignment_1 ) )
            {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2030:1: ( ( rule__BSParameter__NameAssignment_1 ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2031:1: ( rule__BSParameter__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBSParameterAccess().getNameAssignment_1()); 
            }
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2032:1: ( rule__BSParameter__NameAssignment_1 )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2032:2: rule__BSParameter__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__BSParameter__NameAssignment_1_in_rule__BSParameter__Group__1__Impl4138);
            rule__BSParameter__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBSParameterAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSParameter__Group__1__Impl"


    // $ANTLR start "rule__BSMethodBody__Group__0"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2046:1: rule__BSMethodBody__Group__0 : rule__BSMethodBody__Group__0__Impl rule__BSMethodBody__Group__1 ;
    public final void rule__BSMethodBody__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2050:1: ( rule__BSMethodBody__Group__0__Impl rule__BSMethodBody__Group__1 )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2051:2: rule__BSMethodBody__Group__0__Impl rule__BSMethodBody__Group__1
            {
            pushFollow(FOLLOW_rule__BSMethodBody__Group__0__Impl_in_rule__BSMethodBody__Group__04172);
            rule__BSMethodBody__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__BSMethodBody__Group__1_in_rule__BSMethodBody__Group__04175);
            rule__BSMethodBody__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSMethodBody__Group__0"


    // $ANTLR start "rule__BSMethodBody__Group__0__Impl"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2058:1: rule__BSMethodBody__Group__0__Impl : ( () ) ;
    public final void rule__BSMethodBody__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2062:1: ( ( () ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2063:1: ( () )
            {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2063:1: ( () )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2064:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBSMethodBodyAccess().getBSMethodBodyAction_0()); 
            }
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2065:1: ()
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2067:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBSMethodBodyAccess().getBSMethodBodyAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSMethodBody__Group__0__Impl"


    // $ANTLR start "rule__BSMethodBody__Group__1"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2077:1: rule__BSMethodBody__Group__1 : rule__BSMethodBody__Group__1__Impl rule__BSMethodBody__Group__2 ;
    public final void rule__BSMethodBody__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2081:1: ( rule__BSMethodBody__Group__1__Impl rule__BSMethodBody__Group__2 )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2082:2: rule__BSMethodBody__Group__1__Impl rule__BSMethodBody__Group__2
            {
            pushFollow(FOLLOW_rule__BSMethodBody__Group__1__Impl_in_rule__BSMethodBody__Group__14233);
            rule__BSMethodBody__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__BSMethodBody__Group__2_in_rule__BSMethodBody__Group__14236);
            rule__BSMethodBody__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSMethodBody__Group__1"


    // $ANTLR start "rule__BSMethodBody__Group__1__Impl"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2089:1: rule__BSMethodBody__Group__1__Impl : ( '{' ) ;
    public final void rule__BSMethodBody__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2093:1: ( ( '{' ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2094:1: ( '{' )
            {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2094:1: ( '{' )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2095:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBSMethodBodyAccess().getLeftCurlyBracketKeyword_1()); 
            }
            match(input,22,FOLLOW_22_in_rule__BSMethodBody__Group__1__Impl4264); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBSMethodBodyAccess().getLeftCurlyBracketKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSMethodBody__Group__1__Impl"


    // $ANTLR start "rule__BSMethodBody__Group__2"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2108:1: rule__BSMethodBody__Group__2 : rule__BSMethodBody__Group__2__Impl rule__BSMethodBody__Group__3 ;
    public final void rule__BSMethodBody__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2112:1: ( rule__BSMethodBody__Group__2__Impl rule__BSMethodBody__Group__3 )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2113:2: rule__BSMethodBody__Group__2__Impl rule__BSMethodBody__Group__3
            {
            pushFollow(FOLLOW_rule__BSMethodBody__Group__2__Impl_in_rule__BSMethodBody__Group__24295);
            rule__BSMethodBody__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__BSMethodBody__Group__3_in_rule__BSMethodBody__Group__24298);
            rule__BSMethodBody__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSMethodBody__Group__2"


    // $ANTLR start "rule__BSMethodBody__Group__2__Impl"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2120:1: rule__BSMethodBody__Group__2__Impl : ( ( rule__BSMethodBody__StatementsAssignment_2 )* ) ;
    public final void rule__BSMethodBody__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2124:1: ( ( ( rule__BSMethodBody__StatementsAssignment_2 )* ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2125:1: ( ( rule__BSMethodBody__StatementsAssignment_2 )* )
            {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2125:1: ( ( rule__BSMethodBody__StatementsAssignment_2 )* )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2126:1: ( rule__BSMethodBody__StatementsAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBSMethodBodyAccess().getStatementsAssignment_2()); 
            }
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2127:1: ( rule__BSMethodBody__StatementsAssignment_2 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=RULE_ID && LA17_0<=RULE_INT)||(LA17_0>=14 && LA17_0<=15)||LA17_0==25||LA17_0==28||LA17_0==30||(LA17_0>=32 && LA17_0<=35)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2127:2: rule__BSMethodBody__StatementsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__BSMethodBody__StatementsAssignment_2_in_rule__BSMethodBody__Group__2__Impl4325);
            	    rule__BSMethodBody__StatementsAssignment_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBSMethodBodyAccess().getStatementsAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSMethodBody__Group__2__Impl"


    // $ANTLR start "rule__BSMethodBody__Group__3"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2137:1: rule__BSMethodBody__Group__3 : rule__BSMethodBody__Group__3__Impl ;
    public final void rule__BSMethodBody__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2141:1: ( rule__BSMethodBody__Group__3__Impl )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2142:2: rule__BSMethodBody__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__BSMethodBody__Group__3__Impl_in_rule__BSMethodBody__Group__34356);
            rule__BSMethodBody__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSMethodBody__Group__3"


    // $ANTLR start "rule__BSMethodBody__Group__3__Impl"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2148:1: rule__BSMethodBody__Group__3__Impl : ( '}' ) ;
    public final void rule__BSMethodBody__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2152:1: ( ( '}' ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2153:1: ( '}' )
            {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2153:1: ( '}' )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2154:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBSMethodBodyAccess().getRightCurlyBracketKeyword_3()); 
            }
            match(input,23,FOLLOW_23_in_rule__BSMethodBody__Group__3__Impl4384); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBSMethodBodyAccess().getRightCurlyBracketKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSMethodBody__Group__3__Impl"


    // $ANTLR start "rule__BSStatement__Group_2__0"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2175:1: rule__BSStatement__Group_2__0 : rule__BSStatement__Group_2__0__Impl rule__BSStatement__Group_2__1 ;
    public final void rule__BSStatement__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2179:1: ( rule__BSStatement__Group_2__0__Impl rule__BSStatement__Group_2__1 )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2180:2: rule__BSStatement__Group_2__0__Impl rule__BSStatement__Group_2__1
            {
            pushFollow(FOLLOW_rule__BSStatement__Group_2__0__Impl_in_rule__BSStatement__Group_2__04423);
            rule__BSStatement__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__BSStatement__Group_2__1_in_rule__BSStatement__Group_2__04426);
            rule__BSStatement__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSStatement__Group_2__0"


    // $ANTLR start "rule__BSStatement__Group_2__0__Impl"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2187:1: rule__BSStatement__Group_2__0__Impl : ( ruleBSExpression ) ;
    public final void rule__BSStatement__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2191:1: ( ( ruleBSExpression ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2192:1: ( ruleBSExpression )
            {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2192:1: ( ruleBSExpression )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2193:1: ruleBSExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBSStatementAccess().getBSExpressionParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleBSExpression_in_rule__BSStatement__Group_2__0__Impl4453);
            ruleBSExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBSStatementAccess().getBSExpressionParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSStatement__Group_2__0__Impl"


    // $ANTLR start "rule__BSStatement__Group_2__1"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2204:1: rule__BSStatement__Group_2__1 : rule__BSStatement__Group_2__1__Impl ;
    public final void rule__BSStatement__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2208:1: ( rule__BSStatement__Group_2__1__Impl )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2209:2: rule__BSStatement__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__BSStatement__Group_2__1__Impl_in_rule__BSStatement__Group_2__14482);
            rule__BSStatement__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSStatement__Group_2__1"


    // $ANTLR start "rule__BSStatement__Group_2__1__Impl"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2215:1: rule__BSStatement__Group_2__1__Impl : ( ';' ) ;
    public final void rule__BSStatement__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2219:1: ( ( ';' ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2220:1: ( ';' )
            {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2220:1: ( ';' )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2221:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBSStatementAccess().getSemicolonKeyword_2_1()); 
            }
            match(input,17,FOLLOW_17_in_rule__BSStatement__Group_2__1__Impl4510); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBSStatementAccess().getSemicolonKeyword_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSStatement__Group_2__1__Impl"


    // $ANTLR start "rule__BSReturn__Group__0"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2238:1: rule__BSReturn__Group__0 : rule__BSReturn__Group__0__Impl rule__BSReturn__Group__1 ;
    public final void rule__BSReturn__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2242:1: ( rule__BSReturn__Group__0__Impl rule__BSReturn__Group__1 )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2243:2: rule__BSReturn__Group__0__Impl rule__BSReturn__Group__1
            {
            pushFollow(FOLLOW_rule__BSReturn__Group__0__Impl_in_rule__BSReturn__Group__04545);
            rule__BSReturn__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__BSReturn__Group__1_in_rule__BSReturn__Group__04548);
            rule__BSReturn__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSReturn__Group__0"


    // $ANTLR start "rule__BSReturn__Group__0__Impl"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2250:1: rule__BSReturn__Group__0__Impl : ( 'return' ) ;
    public final void rule__BSReturn__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2254:1: ( ( 'return' ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2255:1: ( 'return' )
            {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2255:1: ( 'return' )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2256:1: 'return'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBSReturnAccess().getReturnKeyword_0()); 
            }
            match(input,28,FOLLOW_28_in_rule__BSReturn__Group__0__Impl4576); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBSReturnAccess().getReturnKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSReturn__Group__0__Impl"


    // $ANTLR start "rule__BSReturn__Group__1"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2269:1: rule__BSReturn__Group__1 : rule__BSReturn__Group__1__Impl rule__BSReturn__Group__2 ;
    public final void rule__BSReturn__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2273:1: ( rule__BSReturn__Group__1__Impl rule__BSReturn__Group__2 )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2274:2: rule__BSReturn__Group__1__Impl rule__BSReturn__Group__2
            {
            pushFollow(FOLLOW_rule__BSReturn__Group__1__Impl_in_rule__BSReturn__Group__14607);
            rule__BSReturn__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__BSReturn__Group__2_in_rule__BSReturn__Group__14610);
            rule__BSReturn__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSReturn__Group__1"


    // $ANTLR start "rule__BSReturn__Group__1__Impl"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2281:1: rule__BSReturn__Group__1__Impl : ( ( rule__BSReturn__ExpressionAssignment_1 ) ) ;
    public final void rule__BSReturn__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2285:1: ( ( ( rule__BSReturn__ExpressionAssignment_1 ) ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2286:1: ( ( rule__BSReturn__ExpressionAssignment_1 ) )
            {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2286:1: ( ( rule__BSReturn__ExpressionAssignment_1 ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2287:1: ( rule__BSReturn__ExpressionAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBSReturnAccess().getExpressionAssignment_1()); 
            }
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2288:1: ( rule__BSReturn__ExpressionAssignment_1 )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2288:2: rule__BSReturn__ExpressionAssignment_1
            {
            pushFollow(FOLLOW_rule__BSReturn__ExpressionAssignment_1_in_rule__BSReturn__Group__1__Impl4637);
            rule__BSReturn__ExpressionAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBSReturnAccess().getExpressionAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSReturn__Group__1__Impl"


    // $ANTLR start "rule__BSReturn__Group__2"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2298:1: rule__BSReturn__Group__2 : rule__BSReturn__Group__2__Impl ;
    public final void rule__BSReturn__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2302:1: ( rule__BSReturn__Group__2__Impl )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2303:2: rule__BSReturn__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__BSReturn__Group__2__Impl_in_rule__BSReturn__Group__24667);
            rule__BSReturn__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSReturn__Group__2"


    // $ANTLR start "rule__BSReturn__Group__2__Impl"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2309:1: rule__BSReturn__Group__2__Impl : ( ';' ) ;
    public final void rule__BSReturn__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2313:1: ( ( ';' ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2314:1: ( ';' )
            {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2314:1: ( ';' )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2315:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBSReturnAccess().getSemicolonKeyword_2()); 
            }
            match(input,17,FOLLOW_17_in_rule__BSReturn__Group__2__Impl4695); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBSReturnAccess().getSemicolonKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSReturn__Group__2__Impl"


    // $ANTLR start "rule__BSVariableDeclaration__Group__0"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2334:1: rule__BSVariableDeclaration__Group__0 : rule__BSVariableDeclaration__Group__0__Impl rule__BSVariableDeclaration__Group__1 ;
    public final void rule__BSVariableDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2338:1: ( rule__BSVariableDeclaration__Group__0__Impl rule__BSVariableDeclaration__Group__1 )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2339:2: rule__BSVariableDeclaration__Group__0__Impl rule__BSVariableDeclaration__Group__1
            {
            pushFollow(FOLLOW_rule__BSVariableDeclaration__Group__0__Impl_in_rule__BSVariableDeclaration__Group__04732);
            rule__BSVariableDeclaration__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__BSVariableDeclaration__Group__1_in_rule__BSVariableDeclaration__Group__04735);
            rule__BSVariableDeclaration__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSVariableDeclaration__Group__0"


    // $ANTLR start "rule__BSVariableDeclaration__Group__0__Impl"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2346:1: rule__BSVariableDeclaration__Group__0__Impl : ( ( rule__BSVariableDeclaration__TypeAssignment_0 ) ) ;
    public final void rule__BSVariableDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2350:1: ( ( ( rule__BSVariableDeclaration__TypeAssignment_0 ) ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2351:1: ( ( rule__BSVariableDeclaration__TypeAssignment_0 ) )
            {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2351:1: ( ( rule__BSVariableDeclaration__TypeAssignment_0 ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2352:1: ( rule__BSVariableDeclaration__TypeAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBSVariableDeclarationAccess().getTypeAssignment_0()); 
            }
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2353:1: ( rule__BSVariableDeclaration__TypeAssignment_0 )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2353:2: rule__BSVariableDeclaration__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__BSVariableDeclaration__TypeAssignment_0_in_rule__BSVariableDeclaration__Group__0__Impl4762);
            rule__BSVariableDeclaration__TypeAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBSVariableDeclarationAccess().getTypeAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSVariableDeclaration__Group__0__Impl"


    // $ANTLR start "rule__BSVariableDeclaration__Group__1"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2363:1: rule__BSVariableDeclaration__Group__1 : rule__BSVariableDeclaration__Group__1__Impl rule__BSVariableDeclaration__Group__2 ;
    public final void rule__BSVariableDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2367:1: ( rule__BSVariableDeclaration__Group__1__Impl rule__BSVariableDeclaration__Group__2 )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2368:2: rule__BSVariableDeclaration__Group__1__Impl rule__BSVariableDeclaration__Group__2
            {
            pushFollow(FOLLOW_rule__BSVariableDeclaration__Group__1__Impl_in_rule__BSVariableDeclaration__Group__14792);
            rule__BSVariableDeclaration__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__BSVariableDeclaration__Group__2_in_rule__BSVariableDeclaration__Group__14795);
            rule__BSVariableDeclaration__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSVariableDeclaration__Group__1"


    // $ANTLR start "rule__BSVariableDeclaration__Group__1__Impl"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2375:1: rule__BSVariableDeclaration__Group__1__Impl : ( ( rule__BSVariableDeclaration__NameAssignment_1 ) ) ;
    public final void rule__BSVariableDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2379:1: ( ( ( rule__BSVariableDeclaration__NameAssignment_1 ) ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2380:1: ( ( rule__BSVariableDeclaration__NameAssignment_1 ) )
            {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2380:1: ( ( rule__BSVariableDeclaration__NameAssignment_1 ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2381:1: ( rule__BSVariableDeclaration__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBSVariableDeclarationAccess().getNameAssignment_1()); 
            }
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2382:1: ( rule__BSVariableDeclaration__NameAssignment_1 )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2382:2: rule__BSVariableDeclaration__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__BSVariableDeclaration__NameAssignment_1_in_rule__BSVariableDeclaration__Group__1__Impl4822);
            rule__BSVariableDeclaration__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBSVariableDeclarationAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSVariableDeclaration__Group__1__Impl"


    // $ANTLR start "rule__BSVariableDeclaration__Group__2"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2392:1: rule__BSVariableDeclaration__Group__2 : rule__BSVariableDeclaration__Group__2__Impl rule__BSVariableDeclaration__Group__3 ;
    public final void rule__BSVariableDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2396:1: ( rule__BSVariableDeclaration__Group__2__Impl rule__BSVariableDeclaration__Group__3 )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2397:2: rule__BSVariableDeclaration__Group__2__Impl rule__BSVariableDeclaration__Group__3
            {
            pushFollow(FOLLOW_rule__BSVariableDeclaration__Group__2__Impl_in_rule__BSVariableDeclaration__Group__24852);
            rule__BSVariableDeclaration__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__BSVariableDeclaration__Group__3_in_rule__BSVariableDeclaration__Group__24855);
            rule__BSVariableDeclaration__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSVariableDeclaration__Group__2"


    // $ANTLR start "rule__BSVariableDeclaration__Group__2__Impl"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2404:1: rule__BSVariableDeclaration__Group__2__Impl : ( ( rule__BSVariableDeclaration__Group_2__0 )? ) ;
    public final void rule__BSVariableDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2408:1: ( ( ( rule__BSVariableDeclaration__Group_2__0 )? ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2409:1: ( ( rule__BSVariableDeclaration__Group_2__0 )? )
            {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2409:1: ( ( rule__BSVariableDeclaration__Group_2__0 )? )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2410:1: ( rule__BSVariableDeclaration__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBSVariableDeclarationAccess().getGroup_2()); 
            }
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2411:1: ( rule__BSVariableDeclaration__Group_2__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==29) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2411:2: rule__BSVariableDeclaration__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__BSVariableDeclaration__Group_2__0_in_rule__BSVariableDeclaration__Group__2__Impl4882);
                    rule__BSVariableDeclaration__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBSVariableDeclarationAccess().getGroup_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSVariableDeclaration__Group__2__Impl"


    // $ANTLR start "rule__BSVariableDeclaration__Group__3"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2421:1: rule__BSVariableDeclaration__Group__3 : rule__BSVariableDeclaration__Group__3__Impl ;
    public final void rule__BSVariableDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2425:1: ( rule__BSVariableDeclaration__Group__3__Impl )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2426:2: rule__BSVariableDeclaration__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__BSVariableDeclaration__Group__3__Impl_in_rule__BSVariableDeclaration__Group__34913);
            rule__BSVariableDeclaration__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSVariableDeclaration__Group__3"


    // $ANTLR start "rule__BSVariableDeclaration__Group__3__Impl"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2432:1: rule__BSVariableDeclaration__Group__3__Impl : ( ';' ) ;
    public final void rule__BSVariableDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2436:1: ( ( ';' ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2437:1: ( ';' )
            {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2437:1: ( ';' )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2438:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBSVariableDeclarationAccess().getSemicolonKeyword_3()); 
            }
            match(input,17,FOLLOW_17_in_rule__BSVariableDeclaration__Group__3__Impl4941); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBSVariableDeclarationAccess().getSemicolonKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSVariableDeclaration__Group__3__Impl"


    // $ANTLR start "rule__BSVariableDeclaration__Group_2__0"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2459:1: rule__BSVariableDeclaration__Group_2__0 : rule__BSVariableDeclaration__Group_2__0__Impl rule__BSVariableDeclaration__Group_2__1 ;
    public final void rule__BSVariableDeclaration__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2463:1: ( rule__BSVariableDeclaration__Group_2__0__Impl rule__BSVariableDeclaration__Group_2__1 )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2464:2: rule__BSVariableDeclaration__Group_2__0__Impl rule__BSVariableDeclaration__Group_2__1
            {
            pushFollow(FOLLOW_rule__BSVariableDeclaration__Group_2__0__Impl_in_rule__BSVariableDeclaration__Group_2__04980);
            rule__BSVariableDeclaration__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__BSVariableDeclaration__Group_2__1_in_rule__BSVariableDeclaration__Group_2__04983);
            rule__BSVariableDeclaration__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSVariableDeclaration__Group_2__0"


    // $ANTLR start "rule__BSVariableDeclaration__Group_2__0__Impl"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2471:1: rule__BSVariableDeclaration__Group_2__0__Impl : ( '=' ) ;
    public final void rule__BSVariableDeclaration__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2475:1: ( ( '=' ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2476:1: ( '=' )
            {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2476:1: ( '=' )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2477:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBSVariableDeclarationAccess().getEqualsSignKeyword_2_0()); 
            }
            match(input,29,FOLLOW_29_in_rule__BSVariableDeclaration__Group_2__0__Impl5011); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBSVariableDeclarationAccess().getEqualsSignKeyword_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSVariableDeclaration__Group_2__0__Impl"


    // $ANTLR start "rule__BSVariableDeclaration__Group_2__1"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2490:1: rule__BSVariableDeclaration__Group_2__1 : rule__BSVariableDeclaration__Group_2__1__Impl ;
    public final void rule__BSVariableDeclaration__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2494:1: ( rule__BSVariableDeclaration__Group_2__1__Impl )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2495:2: rule__BSVariableDeclaration__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__BSVariableDeclaration__Group_2__1__Impl_in_rule__BSVariableDeclaration__Group_2__15042);
            rule__BSVariableDeclaration__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSVariableDeclaration__Group_2__1"


    // $ANTLR start "rule__BSVariableDeclaration__Group_2__1__Impl"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2501:1: rule__BSVariableDeclaration__Group_2__1__Impl : ( ( rule__BSVariableDeclaration__ExpressionAssignment_2_1 ) ) ;
    public final void rule__BSVariableDeclaration__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2505:1: ( ( ( rule__BSVariableDeclaration__ExpressionAssignment_2_1 ) ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2506:1: ( ( rule__BSVariableDeclaration__ExpressionAssignment_2_1 ) )
            {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2506:1: ( ( rule__BSVariableDeclaration__ExpressionAssignment_2_1 ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2507:1: ( rule__BSVariableDeclaration__ExpressionAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBSVariableDeclarationAccess().getExpressionAssignment_2_1()); 
            }
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2508:1: ( rule__BSVariableDeclaration__ExpressionAssignment_2_1 )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2508:2: rule__BSVariableDeclaration__ExpressionAssignment_2_1
            {
            pushFollow(FOLLOW_rule__BSVariableDeclaration__ExpressionAssignment_2_1_in_rule__BSVariableDeclaration__Group_2__1__Impl5069);
            rule__BSVariableDeclaration__ExpressionAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBSVariableDeclarationAccess().getExpressionAssignment_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSVariableDeclaration__Group_2__1__Impl"


    // $ANTLR start "rule__BSIfStatement__Group__0"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2522:1: rule__BSIfStatement__Group__0 : rule__BSIfStatement__Group__0__Impl rule__BSIfStatement__Group__1 ;
    public final void rule__BSIfStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2526:1: ( rule__BSIfStatement__Group__0__Impl rule__BSIfStatement__Group__1 )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2527:2: rule__BSIfStatement__Group__0__Impl rule__BSIfStatement__Group__1
            {
            pushFollow(FOLLOW_rule__BSIfStatement__Group__0__Impl_in_rule__BSIfStatement__Group__05103);
            rule__BSIfStatement__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__BSIfStatement__Group__1_in_rule__BSIfStatement__Group__05106);
            rule__BSIfStatement__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSIfStatement__Group__0"


    // $ANTLR start "rule__BSIfStatement__Group__0__Impl"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2534:1: rule__BSIfStatement__Group__0__Impl : ( 'if' ) ;
    public final void rule__BSIfStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2538:1: ( ( 'if' ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2539:1: ( 'if' )
            {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2539:1: ( 'if' )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2540:1: 'if'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBSIfStatementAccess().getIfKeyword_0()); 
            }
            match(input,30,FOLLOW_30_in_rule__BSIfStatement__Group__0__Impl5134); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBSIfStatementAccess().getIfKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSIfStatement__Group__0__Impl"


    // $ANTLR start "rule__BSIfStatement__Group__1"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2553:1: rule__BSIfStatement__Group__1 : rule__BSIfStatement__Group__1__Impl rule__BSIfStatement__Group__2 ;
    public final void rule__BSIfStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2557:1: ( rule__BSIfStatement__Group__1__Impl rule__BSIfStatement__Group__2 )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2558:2: rule__BSIfStatement__Group__1__Impl rule__BSIfStatement__Group__2
            {
            pushFollow(FOLLOW_rule__BSIfStatement__Group__1__Impl_in_rule__BSIfStatement__Group__15165);
            rule__BSIfStatement__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__BSIfStatement__Group__2_in_rule__BSIfStatement__Group__15168);
            rule__BSIfStatement__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSIfStatement__Group__1"


    // $ANTLR start "rule__BSIfStatement__Group__1__Impl"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2565:1: rule__BSIfStatement__Group__1__Impl : ( '(' ) ;
    public final void rule__BSIfStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2569:1: ( ( '(' ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2570:1: ( '(' )
            {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2570:1: ( '(' )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2571:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBSIfStatementAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,25,FOLLOW_25_in_rule__BSIfStatement__Group__1__Impl5196); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBSIfStatementAccess().getLeftParenthesisKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSIfStatement__Group__1__Impl"


    // $ANTLR start "rule__BSIfStatement__Group__2"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2584:1: rule__BSIfStatement__Group__2 : rule__BSIfStatement__Group__2__Impl rule__BSIfStatement__Group__3 ;
    public final void rule__BSIfStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2588:1: ( rule__BSIfStatement__Group__2__Impl rule__BSIfStatement__Group__3 )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2589:2: rule__BSIfStatement__Group__2__Impl rule__BSIfStatement__Group__3
            {
            pushFollow(FOLLOW_rule__BSIfStatement__Group__2__Impl_in_rule__BSIfStatement__Group__25227);
            rule__BSIfStatement__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__BSIfStatement__Group__3_in_rule__BSIfStatement__Group__25230);
            rule__BSIfStatement__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSIfStatement__Group__2"


    // $ANTLR start "rule__BSIfStatement__Group__2__Impl"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2596:1: rule__BSIfStatement__Group__2__Impl : ( ( rule__BSIfStatement__ExpressionAssignment_2 ) ) ;
    public final void rule__BSIfStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2600:1: ( ( ( rule__BSIfStatement__ExpressionAssignment_2 ) ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2601:1: ( ( rule__BSIfStatement__ExpressionAssignment_2 ) )
            {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2601:1: ( ( rule__BSIfStatement__ExpressionAssignment_2 ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2602:1: ( rule__BSIfStatement__ExpressionAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBSIfStatementAccess().getExpressionAssignment_2()); 
            }
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2603:1: ( rule__BSIfStatement__ExpressionAssignment_2 )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2603:2: rule__BSIfStatement__ExpressionAssignment_2
            {
            pushFollow(FOLLOW_rule__BSIfStatement__ExpressionAssignment_2_in_rule__BSIfStatement__Group__2__Impl5257);
            rule__BSIfStatement__ExpressionAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBSIfStatementAccess().getExpressionAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSIfStatement__Group__2__Impl"


    // $ANTLR start "rule__BSIfStatement__Group__3"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2613:1: rule__BSIfStatement__Group__3 : rule__BSIfStatement__Group__3__Impl rule__BSIfStatement__Group__4 ;
    public final void rule__BSIfStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2617:1: ( rule__BSIfStatement__Group__3__Impl rule__BSIfStatement__Group__4 )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2618:2: rule__BSIfStatement__Group__3__Impl rule__BSIfStatement__Group__4
            {
            pushFollow(FOLLOW_rule__BSIfStatement__Group__3__Impl_in_rule__BSIfStatement__Group__35287);
            rule__BSIfStatement__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__BSIfStatement__Group__4_in_rule__BSIfStatement__Group__35290);
            rule__BSIfStatement__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSIfStatement__Group__3"


    // $ANTLR start "rule__BSIfStatement__Group__3__Impl"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2625:1: rule__BSIfStatement__Group__3__Impl : ( ')' ) ;
    public final void rule__BSIfStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2629:1: ( ( ')' ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2630:1: ( ')' )
            {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2630:1: ( ')' )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2631:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBSIfStatementAccess().getRightParenthesisKeyword_3()); 
            }
            match(input,26,FOLLOW_26_in_rule__BSIfStatement__Group__3__Impl5318); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBSIfStatementAccess().getRightParenthesisKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSIfStatement__Group__3__Impl"


    // $ANTLR start "rule__BSIfStatement__Group__4"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2644:1: rule__BSIfStatement__Group__4 : rule__BSIfStatement__Group__4__Impl rule__BSIfStatement__Group__5 ;
    public final void rule__BSIfStatement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2648:1: ( rule__BSIfStatement__Group__4__Impl rule__BSIfStatement__Group__5 )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2649:2: rule__BSIfStatement__Group__4__Impl rule__BSIfStatement__Group__5
            {
            pushFollow(FOLLOW_rule__BSIfStatement__Group__4__Impl_in_rule__BSIfStatement__Group__45349);
            rule__BSIfStatement__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__BSIfStatement__Group__5_in_rule__BSIfStatement__Group__45352);
            rule__BSIfStatement__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSIfStatement__Group__4"


    // $ANTLR start "rule__BSIfStatement__Group__4__Impl"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2656:1: rule__BSIfStatement__Group__4__Impl : ( ( rule__BSIfStatement__ThenBlockAssignment_4 ) ) ;
    public final void rule__BSIfStatement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2660:1: ( ( ( rule__BSIfStatement__ThenBlockAssignment_4 ) ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2661:1: ( ( rule__BSIfStatement__ThenBlockAssignment_4 ) )
            {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2661:1: ( ( rule__BSIfStatement__ThenBlockAssignment_4 ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2662:1: ( rule__BSIfStatement__ThenBlockAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBSIfStatementAccess().getThenBlockAssignment_4()); 
            }
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2663:1: ( rule__BSIfStatement__ThenBlockAssignment_4 )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2663:2: rule__BSIfStatement__ThenBlockAssignment_4
            {
            pushFollow(FOLLOW_rule__BSIfStatement__ThenBlockAssignment_4_in_rule__BSIfStatement__Group__4__Impl5379);
            rule__BSIfStatement__ThenBlockAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBSIfStatementAccess().getThenBlockAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSIfStatement__Group__4__Impl"


    // $ANTLR start "rule__BSIfStatement__Group__5"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2673:1: rule__BSIfStatement__Group__5 : rule__BSIfStatement__Group__5__Impl ;
    public final void rule__BSIfStatement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2677:1: ( rule__BSIfStatement__Group__5__Impl )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2678:2: rule__BSIfStatement__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__BSIfStatement__Group__5__Impl_in_rule__BSIfStatement__Group__55409);
            rule__BSIfStatement__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSIfStatement__Group__5"


    // $ANTLR start "rule__BSIfStatement__Group__5__Impl"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2684:1: rule__BSIfStatement__Group__5__Impl : ( ( rule__BSIfStatement__Group_5__0 )? ) ;
    public final void rule__BSIfStatement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2688:1: ( ( ( rule__BSIfStatement__Group_5__0 )? ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2689:1: ( ( rule__BSIfStatement__Group_5__0 )? )
            {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2689:1: ( ( rule__BSIfStatement__Group_5__0 )? )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2690:1: ( rule__BSIfStatement__Group_5__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBSIfStatementAccess().getGroup_5()); 
            }
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2691:1: ( rule__BSIfStatement__Group_5__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==31) ) {
                int LA19_1 = input.LA(2);

                if ( (synpred29_InternalBlorqueScript()) ) {
                    alt19=1;
                }
            }
            switch (alt19) {
                case 1 :
                    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2691:2: rule__BSIfStatement__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__BSIfStatement__Group_5__0_in_rule__BSIfStatement__Group__5__Impl5436);
                    rule__BSIfStatement__Group_5__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBSIfStatementAccess().getGroup_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSIfStatement__Group__5__Impl"


    // $ANTLR start "rule__BSIfStatement__Group_5__0"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2713:1: rule__BSIfStatement__Group_5__0 : rule__BSIfStatement__Group_5__0__Impl rule__BSIfStatement__Group_5__1 ;
    public final void rule__BSIfStatement__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2717:1: ( rule__BSIfStatement__Group_5__0__Impl rule__BSIfStatement__Group_5__1 )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2718:2: rule__BSIfStatement__Group_5__0__Impl rule__BSIfStatement__Group_5__1
            {
            pushFollow(FOLLOW_rule__BSIfStatement__Group_5__0__Impl_in_rule__BSIfStatement__Group_5__05479);
            rule__BSIfStatement__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__BSIfStatement__Group_5__1_in_rule__BSIfStatement__Group_5__05482);
            rule__BSIfStatement__Group_5__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSIfStatement__Group_5__0"


    // $ANTLR start "rule__BSIfStatement__Group_5__0__Impl"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2725:1: rule__BSIfStatement__Group_5__0__Impl : ( ( 'else' ) ) ;
    public final void rule__BSIfStatement__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2729:1: ( ( ( 'else' ) ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2730:1: ( ( 'else' ) )
            {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2730:1: ( ( 'else' ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2731:1: ( 'else' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBSIfStatementAccess().getElseKeyword_5_0()); 
            }
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2732:1: ( 'else' )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2733:2: 'else'
            {
            match(input,31,FOLLOW_31_in_rule__BSIfStatement__Group_5__0__Impl5511); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBSIfStatementAccess().getElseKeyword_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSIfStatement__Group_5__0__Impl"


    // $ANTLR start "rule__BSIfStatement__Group_5__1"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2744:1: rule__BSIfStatement__Group_5__1 : rule__BSIfStatement__Group_5__1__Impl ;
    public final void rule__BSIfStatement__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2748:1: ( rule__BSIfStatement__Group_5__1__Impl )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2749:2: rule__BSIfStatement__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__BSIfStatement__Group_5__1__Impl_in_rule__BSIfStatement__Group_5__15543);
            rule__BSIfStatement__Group_5__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSIfStatement__Group_5__1"


    // $ANTLR start "rule__BSIfStatement__Group_5__1__Impl"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2755:1: rule__BSIfStatement__Group_5__1__Impl : ( ( rule__BSIfStatement__ElseBlockAssignment_5_1 ) ) ;
    public final void rule__BSIfStatement__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2759:1: ( ( ( rule__BSIfStatement__ElseBlockAssignment_5_1 ) ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2760:1: ( ( rule__BSIfStatement__ElseBlockAssignment_5_1 ) )
            {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2760:1: ( ( rule__BSIfStatement__ElseBlockAssignment_5_1 ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2761:1: ( rule__BSIfStatement__ElseBlockAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBSIfStatementAccess().getElseBlockAssignment_5_1()); 
            }
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2762:1: ( rule__BSIfStatement__ElseBlockAssignment_5_1 )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2762:2: rule__BSIfStatement__ElseBlockAssignment_5_1
            {
            pushFollow(FOLLOW_rule__BSIfStatement__ElseBlockAssignment_5_1_in_rule__BSIfStatement__Group_5__1__Impl5570);
            rule__BSIfStatement__ElseBlockAssignment_5_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBSIfStatementAccess().getElseBlockAssignment_5_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSIfStatement__Group_5__1__Impl"


    // $ANTLR start "rule__BSIfBlock__Group_1__0"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2776:1: rule__BSIfBlock__Group_1__0 : rule__BSIfBlock__Group_1__0__Impl rule__BSIfBlock__Group_1__1 ;
    public final void rule__BSIfBlock__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2780:1: ( rule__BSIfBlock__Group_1__0__Impl rule__BSIfBlock__Group_1__1 )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2781:2: rule__BSIfBlock__Group_1__0__Impl rule__BSIfBlock__Group_1__1
            {
            pushFollow(FOLLOW_rule__BSIfBlock__Group_1__0__Impl_in_rule__BSIfBlock__Group_1__05604);
            rule__BSIfBlock__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__BSIfBlock__Group_1__1_in_rule__BSIfBlock__Group_1__05607);
            rule__BSIfBlock__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSIfBlock__Group_1__0"


    // $ANTLR start "rule__BSIfBlock__Group_1__0__Impl"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2788:1: rule__BSIfBlock__Group_1__0__Impl : ( '{' ) ;
    public final void rule__BSIfBlock__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2792:1: ( ( '{' ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2793:1: ( '{' )
            {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2793:1: ( '{' )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2794:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBSIfBlockAccess().getLeftCurlyBracketKeyword_1_0()); 
            }
            match(input,22,FOLLOW_22_in_rule__BSIfBlock__Group_1__0__Impl5635); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBSIfBlockAccess().getLeftCurlyBracketKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSIfBlock__Group_1__0__Impl"


    // $ANTLR start "rule__BSIfBlock__Group_1__1"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2807:1: rule__BSIfBlock__Group_1__1 : rule__BSIfBlock__Group_1__1__Impl rule__BSIfBlock__Group_1__2 ;
    public final void rule__BSIfBlock__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2811:1: ( rule__BSIfBlock__Group_1__1__Impl rule__BSIfBlock__Group_1__2 )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2812:2: rule__BSIfBlock__Group_1__1__Impl rule__BSIfBlock__Group_1__2
            {
            pushFollow(FOLLOW_rule__BSIfBlock__Group_1__1__Impl_in_rule__BSIfBlock__Group_1__15666);
            rule__BSIfBlock__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__BSIfBlock__Group_1__2_in_rule__BSIfBlock__Group_1__15669);
            rule__BSIfBlock__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSIfBlock__Group_1__1"


    // $ANTLR start "rule__BSIfBlock__Group_1__1__Impl"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2819:1: rule__BSIfBlock__Group_1__1__Impl : ( ( ( rule__BSIfBlock__StatementsAssignment_1_1 ) ) ( ( rule__BSIfBlock__StatementsAssignment_1_1 )* ) ) ;
    public final void rule__BSIfBlock__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2823:1: ( ( ( ( rule__BSIfBlock__StatementsAssignment_1_1 ) ) ( ( rule__BSIfBlock__StatementsAssignment_1_1 )* ) ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2824:1: ( ( ( rule__BSIfBlock__StatementsAssignment_1_1 ) ) ( ( rule__BSIfBlock__StatementsAssignment_1_1 )* ) )
            {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2824:1: ( ( ( rule__BSIfBlock__StatementsAssignment_1_1 ) ) ( ( rule__BSIfBlock__StatementsAssignment_1_1 )* ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2825:1: ( ( rule__BSIfBlock__StatementsAssignment_1_1 ) ) ( ( rule__BSIfBlock__StatementsAssignment_1_1 )* )
            {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2825:1: ( ( rule__BSIfBlock__StatementsAssignment_1_1 ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2826:1: ( rule__BSIfBlock__StatementsAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBSIfBlockAccess().getStatementsAssignment_1_1()); 
            }
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2827:1: ( rule__BSIfBlock__StatementsAssignment_1_1 )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2827:2: rule__BSIfBlock__StatementsAssignment_1_1
            {
            pushFollow(FOLLOW_rule__BSIfBlock__StatementsAssignment_1_1_in_rule__BSIfBlock__Group_1__1__Impl5698);
            rule__BSIfBlock__StatementsAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBSIfBlockAccess().getStatementsAssignment_1_1()); 
            }

            }

            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2830:1: ( ( rule__BSIfBlock__StatementsAssignment_1_1 )* )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2831:1: ( rule__BSIfBlock__StatementsAssignment_1_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBSIfBlockAccess().getStatementsAssignment_1_1()); 
            }
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2832:1: ( rule__BSIfBlock__StatementsAssignment_1_1 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=RULE_ID && LA20_0<=RULE_INT)||(LA20_0>=14 && LA20_0<=15)||LA20_0==25||LA20_0==28||LA20_0==30||(LA20_0>=32 && LA20_0<=35)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2832:2: rule__BSIfBlock__StatementsAssignment_1_1
            	    {
            	    pushFollow(FOLLOW_rule__BSIfBlock__StatementsAssignment_1_1_in_rule__BSIfBlock__Group_1__1__Impl5710);
            	    rule__BSIfBlock__StatementsAssignment_1_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBSIfBlockAccess().getStatementsAssignment_1_1()); 
            }

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSIfBlock__Group_1__1__Impl"


    // $ANTLR start "rule__BSIfBlock__Group_1__2"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2843:1: rule__BSIfBlock__Group_1__2 : rule__BSIfBlock__Group_1__2__Impl ;
    public final void rule__BSIfBlock__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2847:1: ( rule__BSIfBlock__Group_1__2__Impl )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2848:2: rule__BSIfBlock__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__BSIfBlock__Group_1__2__Impl_in_rule__BSIfBlock__Group_1__25743);
            rule__BSIfBlock__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSIfBlock__Group_1__2"


    // $ANTLR start "rule__BSIfBlock__Group_1__2__Impl"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2854:1: rule__BSIfBlock__Group_1__2__Impl : ( '}' ) ;
    public final void rule__BSIfBlock__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2858:1: ( ( '}' ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2859:1: ( '}' )
            {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2859:1: ( '}' )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2860:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBSIfBlockAccess().getRightCurlyBracketKeyword_1_2()); 
            }
            match(input,23,FOLLOW_23_in_rule__BSIfBlock__Group_1__2__Impl5771); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBSIfBlockAccess().getRightCurlyBracketKeyword_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSIfBlock__Group_1__2__Impl"


    // $ANTLR start "rule__BSAssignment__Group__0"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2879:1: rule__BSAssignment__Group__0 : rule__BSAssignment__Group__0__Impl rule__BSAssignment__Group__1 ;
    public final void rule__BSAssignment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2883:1: ( rule__BSAssignment__Group__0__Impl rule__BSAssignment__Group__1 )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2884:2: rule__BSAssignment__Group__0__Impl rule__BSAssignment__Group__1
            {
            pushFollow(FOLLOW_rule__BSAssignment__Group__0__Impl_in_rule__BSAssignment__Group__05808);
            rule__BSAssignment__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__BSAssignment__Group__1_in_rule__BSAssignment__Group__05811);
            rule__BSAssignment__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSAssignment__Group__0"


    // $ANTLR start "rule__BSAssignment__Group__0__Impl"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2891:1: rule__BSAssignment__Group__0__Impl : ( ( rule__BSAssignment__Alternatives_0 ) ) ;
    public final void rule__BSAssignment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2895:1: ( ( ( rule__BSAssignment__Alternatives_0 ) ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2896:1: ( ( rule__BSAssignment__Alternatives_0 ) )
            {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2896:1: ( ( rule__BSAssignment__Alternatives_0 ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2897:1: ( rule__BSAssignment__Alternatives_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBSAssignmentAccess().getAlternatives_0()); 
            }
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2898:1: ( rule__BSAssignment__Alternatives_0 )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2898:2: rule__BSAssignment__Alternatives_0
            {
            pushFollow(FOLLOW_rule__BSAssignment__Alternatives_0_in_rule__BSAssignment__Group__0__Impl5838);
            rule__BSAssignment__Alternatives_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBSAssignmentAccess().getAlternatives_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSAssignment__Group__0__Impl"


    // $ANTLR start "rule__BSAssignment__Group__1"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2908:1: rule__BSAssignment__Group__1 : rule__BSAssignment__Group__1__Impl ;
    public final void rule__BSAssignment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2912:1: ( rule__BSAssignment__Group__1__Impl )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2913:2: rule__BSAssignment__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__BSAssignment__Group__1__Impl_in_rule__BSAssignment__Group__15868);
            rule__BSAssignment__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSAssignment__Group__1"


    // $ANTLR start "rule__BSAssignment__Group__1__Impl"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2919:1: rule__BSAssignment__Group__1__Impl : ( ( rule__BSAssignment__Group_1__0 )? ) ;
    public final void rule__BSAssignment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2923:1: ( ( ( rule__BSAssignment__Group_1__0 )? ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2924:1: ( ( rule__BSAssignment__Group_1__0 )? )
            {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2924:1: ( ( rule__BSAssignment__Group_1__0 )? )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2925:1: ( rule__BSAssignment__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBSAssignmentAccess().getGroup_1()); 
            }
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2926:1: ( rule__BSAssignment__Group_1__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==29) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2926:2: rule__BSAssignment__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__BSAssignment__Group_1__0_in_rule__BSAssignment__Group__1__Impl5895);
                    rule__BSAssignment__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBSAssignmentAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSAssignment__Group__1__Impl"


    // $ANTLR start "rule__BSAssignment__Group_1__0"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2940:1: rule__BSAssignment__Group_1__0 : rule__BSAssignment__Group_1__0__Impl rule__BSAssignment__Group_1__1 ;
    public final void rule__BSAssignment__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2944:1: ( rule__BSAssignment__Group_1__0__Impl rule__BSAssignment__Group_1__1 )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2945:2: rule__BSAssignment__Group_1__0__Impl rule__BSAssignment__Group_1__1
            {
            pushFollow(FOLLOW_rule__BSAssignment__Group_1__0__Impl_in_rule__BSAssignment__Group_1__05930);
            rule__BSAssignment__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__BSAssignment__Group_1__1_in_rule__BSAssignment__Group_1__05933);
            rule__BSAssignment__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSAssignment__Group_1__0"


    // $ANTLR start "rule__BSAssignment__Group_1__0__Impl"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2952:1: rule__BSAssignment__Group_1__0__Impl : ( () ) ;
    public final void rule__BSAssignment__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2956:1: ( ( () ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2957:1: ( () )
            {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2957:1: ( () )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2958:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBSAssignmentAccess().getBSAssignmentLeftAction_1_0()); 
            }
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2959:1: ()
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2961:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBSAssignmentAccess().getBSAssignmentLeftAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSAssignment__Group_1__0__Impl"


    // $ANTLR start "rule__BSAssignment__Group_1__1"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2971:1: rule__BSAssignment__Group_1__1 : rule__BSAssignment__Group_1__1__Impl rule__BSAssignment__Group_1__2 ;
    public final void rule__BSAssignment__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2975:1: ( rule__BSAssignment__Group_1__1__Impl rule__BSAssignment__Group_1__2 )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2976:2: rule__BSAssignment__Group_1__1__Impl rule__BSAssignment__Group_1__2
            {
            pushFollow(FOLLOW_rule__BSAssignment__Group_1__1__Impl_in_rule__BSAssignment__Group_1__15991);
            rule__BSAssignment__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__BSAssignment__Group_1__2_in_rule__BSAssignment__Group_1__15994);
            rule__BSAssignment__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSAssignment__Group_1__1"


    // $ANTLR start "rule__BSAssignment__Group_1__1__Impl"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2983:1: rule__BSAssignment__Group_1__1__Impl : ( '=' ) ;
    public final void rule__BSAssignment__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2987:1: ( ( '=' ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2988:1: ( '=' )
            {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2988:1: ( '=' )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2989:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBSAssignmentAccess().getEqualsSignKeyword_1_1()); 
            }
            match(input,29,FOLLOW_29_in_rule__BSAssignment__Group_1__1__Impl6022); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBSAssignmentAccess().getEqualsSignKeyword_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSAssignment__Group_1__1__Impl"


    // $ANTLR start "rule__BSAssignment__Group_1__2"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3002:1: rule__BSAssignment__Group_1__2 : rule__BSAssignment__Group_1__2__Impl ;
    public final void rule__BSAssignment__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3006:1: ( rule__BSAssignment__Group_1__2__Impl )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3007:2: rule__BSAssignment__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__BSAssignment__Group_1__2__Impl_in_rule__BSAssignment__Group_1__26053);
            rule__BSAssignment__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSAssignment__Group_1__2"


    // $ANTLR start "rule__BSAssignment__Group_1__2__Impl"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3013:1: rule__BSAssignment__Group_1__2__Impl : ( ( rule__BSAssignment__RightAssignment_1_2 ) ) ;
    public final void rule__BSAssignment__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3017:1: ( ( ( rule__BSAssignment__RightAssignment_1_2 ) ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3018:1: ( ( rule__BSAssignment__RightAssignment_1_2 ) )
            {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3018:1: ( ( rule__BSAssignment__RightAssignment_1_2 ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3019:1: ( rule__BSAssignment__RightAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBSAssignmentAccess().getRightAssignment_1_2()); 
            }
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3020:1: ( rule__BSAssignment__RightAssignment_1_2 )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3020:2: rule__BSAssignment__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__BSAssignment__RightAssignment_1_2_in_rule__BSAssignment__Group_1__2__Impl6080);
            rule__BSAssignment__RightAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBSAssignmentAccess().getRightAssignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSAssignment__Group_1__2__Impl"


    // $ANTLR start "rule__BSCastingExpression__Group__0"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3036:1: rule__BSCastingExpression__Group__0 : rule__BSCastingExpression__Group__0__Impl rule__BSCastingExpression__Group__1 ;
    public final void rule__BSCastingExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3040:1: ( rule__BSCastingExpression__Group__0__Impl rule__BSCastingExpression__Group__1 )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3041:2: rule__BSCastingExpression__Group__0__Impl rule__BSCastingExpression__Group__1
            {
            pushFollow(FOLLOW_rule__BSCastingExpression__Group__0__Impl_in_rule__BSCastingExpression__Group__06116);
            rule__BSCastingExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__BSCastingExpression__Group__1_in_rule__BSCastingExpression__Group__06119);
            rule__BSCastingExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSCastingExpression__Group__0"


    // $ANTLR start "rule__BSCastingExpression__Group__0__Impl"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3048:1: rule__BSCastingExpression__Group__0__Impl : ( '(' ) ;
    public final void rule__BSCastingExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3052:1: ( ( '(' ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3053:1: ( '(' )
            {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3053:1: ( '(' )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3054:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBSCastingExpressionAccess().getLeftParenthesisKeyword_0()); 
            }
            match(input,25,FOLLOW_25_in_rule__BSCastingExpression__Group__0__Impl6147); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBSCastingExpressionAccess().getLeftParenthesisKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSCastingExpression__Group__0__Impl"


    // $ANTLR start "rule__BSCastingExpression__Group__1"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3067:1: rule__BSCastingExpression__Group__1 : rule__BSCastingExpression__Group__1__Impl rule__BSCastingExpression__Group__2 ;
    public final void rule__BSCastingExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3071:1: ( rule__BSCastingExpression__Group__1__Impl rule__BSCastingExpression__Group__2 )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3072:2: rule__BSCastingExpression__Group__1__Impl rule__BSCastingExpression__Group__2
            {
            pushFollow(FOLLOW_rule__BSCastingExpression__Group__1__Impl_in_rule__BSCastingExpression__Group__16178);
            rule__BSCastingExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__BSCastingExpression__Group__2_in_rule__BSCastingExpression__Group__16181);
            rule__BSCastingExpression__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSCastingExpression__Group__1"


    // $ANTLR start "rule__BSCastingExpression__Group__1__Impl"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3079:1: rule__BSCastingExpression__Group__1__Impl : ( ( rule__BSCastingExpression__CastTypeAssignment_1 ) ) ;
    public final void rule__BSCastingExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3083:1: ( ( ( rule__BSCastingExpression__CastTypeAssignment_1 ) ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3084:1: ( ( rule__BSCastingExpression__CastTypeAssignment_1 ) )
            {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3084:1: ( ( rule__BSCastingExpression__CastTypeAssignment_1 ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3085:1: ( rule__BSCastingExpression__CastTypeAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBSCastingExpressionAccess().getCastTypeAssignment_1()); 
            }
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3086:1: ( rule__BSCastingExpression__CastTypeAssignment_1 )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3086:2: rule__BSCastingExpression__CastTypeAssignment_1
            {
            pushFollow(FOLLOW_rule__BSCastingExpression__CastTypeAssignment_1_in_rule__BSCastingExpression__Group__1__Impl6208);
            rule__BSCastingExpression__CastTypeAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBSCastingExpressionAccess().getCastTypeAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSCastingExpression__Group__1__Impl"


    // $ANTLR start "rule__BSCastingExpression__Group__2"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3096:1: rule__BSCastingExpression__Group__2 : rule__BSCastingExpression__Group__2__Impl rule__BSCastingExpression__Group__3 ;
    public final void rule__BSCastingExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3100:1: ( rule__BSCastingExpression__Group__2__Impl rule__BSCastingExpression__Group__3 )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3101:2: rule__BSCastingExpression__Group__2__Impl rule__BSCastingExpression__Group__3
            {
            pushFollow(FOLLOW_rule__BSCastingExpression__Group__2__Impl_in_rule__BSCastingExpression__Group__26238);
            rule__BSCastingExpression__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__BSCastingExpression__Group__3_in_rule__BSCastingExpression__Group__26241);
            rule__BSCastingExpression__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSCastingExpression__Group__2"


    // $ANTLR start "rule__BSCastingExpression__Group__2__Impl"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3108:1: rule__BSCastingExpression__Group__2__Impl : ( ')' ) ;
    public final void rule__BSCastingExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3112:1: ( ( ')' ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3113:1: ( ')' )
            {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3113:1: ( ')' )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3114:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBSCastingExpressionAccess().getRightParenthesisKeyword_2()); 
            }
            match(input,26,FOLLOW_26_in_rule__BSCastingExpression__Group__2__Impl6269); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBSCastingExpressionAccess().getRightParenthesisKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSCastingExpression__Group__2__Impl"


    // $ANTLR start "rule__BSCastingExpression__Group__3"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3127:1: rule__BSCastingExpression__Group__3 : rule__BSCastingExpression__Group__3__Impl ;
    public final void rule__BSCastingExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3131:1: ( rule__BSCastingExpression__Group__3__Impl )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3132:2: rule__BSCastingExpression__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__BSCastingExpression__Group__3__Impl_in_rule__BSCastingExpression__Group__36300);
            rule__BSCastingExpression__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSCastingExpression__Group__3"


    // $ANTLR start "rule__BSCastingExpression__Group__3__Impl"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3138:1: rule__BSCastingExpression__Group__3__Impl : ( ( rule__BSCastingExpression__CastExprAssignment_3 ) ) ;
    public final void rule__BSCastingExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3142:1: ( ( ( rule__BSCastingExpression__CastExprAssignment_3 ) ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3143:1: ( ( rule__BSCastingExpression__CastExprAssignment_3 ) )
            {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3143:1: ( ( rule__BSCastingExpression__CastExprAssignment_3 ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3144:1: ( rule__BSCastingExpression__CastExprAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBSCastingExpressionAccess().getCastExprAssignment_3()); 
            }
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3145:1: ( rule__BSCastingExpression__CastExprAssignment_3 )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3145:2: rule__BSCastingExpression__CastExprAssignment_3
            {
            pushFollow(FOLLOW_rule__BSCastingExpression__CastExprAssignment_3_in_rule__BSCastingExpression__Group__3__Impl6327);
            rule__BSCastingExpression__CastExprAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBSCastingExpressionAccess().getCastExprAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSCastingExpression__Group__3__Impl"


    // $ANTLR start "rule__BSSelectionExpression__Group__0"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3163:1: rule__BSSelectionExpression__Group__0 : rule__BSSelectionExpression__Group__0__Impl rule__BSSelectionExpression__Group__1 ;
    public final void rule__BSSelectionExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3167:1: ( rule__BSSelectionExpression__Group__0__Impl rule__BSSelectionExpression__Group__1 )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3168:2: rule__BSSelectionExpression__Group__0__Impl rule__BSSelectionExpression__Group__1
            {
            pushFollow(FOLLOW_rule__BSSelectionExpression__Group__0__Impl_in_rule__BSSelectionExpression__Group__06365);
            rule__BSSelectionExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__BSSelectionExpression__Group__1_in_rule__BSSelectionExpression__Group__06368);
            rule__BSSelectionExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSSelectionExpression__Group__0"


    // $ANTLR start "rule__BSSelectionExpression__Group__0__Impl"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3175:1: rule__BSSelectionExpression__Group__0__Impl : ( ruleBSTerminalExpression ) ;
    public final void rule__BSSelectionExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3179:1: ( ( ruleBSTerminalExpression ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3180:1: ( ruleBSTerminalExpression )
            {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3180:1: ( ruleBSTerminalExpression )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3181:1: ruleBSTerminalExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBSSelectionExpressionAccess().getBSTerminalExpressionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleBSTerminalExpression_in_rule__BSSelectionExpression__Group__0__Impl6395);
            ruleBSTerminalExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBSSelectionExpressionAccess().getBSTerminalExpressionParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSSelectionExpression__Group__0__Impl"


    // $ANTLR start "rule__BSSelectionExpression__Group__1"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3192:1: rule__BSSelectionExpression__Group__1 : rule__BSSelectionExpression__Group__1__Impl ;
    public final void rule__BSSelectionExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3196:1: ( rule__BSSelectionExpression__Group__1__Impl )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3197:2: rule__BSSelectionExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__BSSelectionExpression__Group__1__Impl_in_rule__BSSelectionExpression__Group__16424);
            rule__BSSelectionExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSSelectionExpression__Group__1"


    // $ANTLR start "rule__BSSelectionExpression__Group__1__Impl"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3203:1: rule__BSSelectionExpression__Group__1__Impl : ( ( rule__BSSelectionExpression__Group_1__0 )* ) ;
    public final void rule__BSSelectionExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3207:1: ( ( ( rule__BSSelectionExpression__Group_1__0 )* ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3208:1: ( ( rule__BSSelectionExpression__Group_1__0 )* )
            {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3208:1: ( ( rule__BSSelectionExpression__Group_1__0 )* )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3209:1: ( rule__BSSelectionExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBSSelectionExpressionAccess().getGroup_1()); 
            }
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3210:1: ( rule__BSSelectionExpression__Group_1__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==20) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3210:2: rule__BSSelectionExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__BSSelectionExpression__Group_1__0_in_rule__BSSelectionExpression__Group__1__Impl6451);
            	    rule__BSSelectionExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBSSelectionExpressionAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSSelectionExpression__Group__1__Impl"


    // $ANTLR start "rule__BSSelectionExpression__Group_1__0"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3224:1: rule__BSSelectionExpression__Group_1__0 : rule__BSSelectionExpression__Group_1__0__Impl rule__BSSelectionExpression__Group_1__1 ;
    public final void rule__BSSelectionExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3228:1: ( rule__BSSelectionExpression__Group_1__0__Impl rule__BSSelectionExpression__Group_1__1 )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3229:2: rule__BSSelectionExpression__Group_1__0__Impl rule__BSSelectionExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__BSSelectionExpression__Group_1__0__Impl_in_rule__BSSelectionExpression__Group_1__06486);
            rule__BSSelectionExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__BSSelectionExpression__Group_1__1_in_rule__BSSelectionExpression__Group_1__06489);
            rule__BSSelectionExpression__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSSelectionExpression__Group_1__0"


    // $ANTLR start "rule__BSSelectionExpression__Group_1__0__Impl"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3236:1: rule__BSSelectionExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__BSSelectionExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3240:1: ( ( () ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3241:1: ( () )
            {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3241:1: ( () )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3242:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBSSelectionExpressionAccess().getBSMemberSelectionReceiverAction_1_0()); 
            }
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3243:1: ()
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3245:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBSSelectionExpressionAccess().getBSMemberSelectionReceiverAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSSelectionExpression__Group_1__0__Impl"


    // $ANTLR start "rule__BSSelectionExpression__Group_1__1"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3255:1: rule__BSSelectionExpression__Group_1__1 : rule__BSSelectionExpression__Group_1__1__Impl rule__BSSelectionExpression__Group_1__2 ;
    public final void rule__BSSelectionExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3259:1: ( rule__BSSelectionExpression__Group_1__1__Impl rule__BSSelectionExpression__Group_1__2 )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3260:2: rule__BSSelectionExpression__Group_1__1__Impl rule__BSSelectionExpression__Group_1__2
            {
            pushFollow(FOLLOW_rule__BSSelectionExpression__Group_1__1__Impl_in_rule__BSSelectionExpression__Group_1__16547);
            rule__BSSelectionExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__BSSelectionExpression__Group_1__2_in_rule__BSSelectionExpression__Group_1__16550);
            rule__BSSelectionExpression__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSSelectionExpression__Group_1__1"


    // $ANTLR start "rule__BSSelectionExpression__Group_1__1__Impl"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3267:1: rule__BSSelectionExpression__Group_1__1__Impl : ( '.' ) ;
    public final void rule__BSSelectionExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3271:1: ( ( '.' ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3272:1: ( '.' )
            {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3272:1: ( '.' )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3273:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBSSelectionExpressionAccess().getFullStopKeyword_1_1()); 
            }
            match(input,20,FOLLOW_20_in_rule__BSSelectionExpression__Group_1__1__Impl6578); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBSSelectionExpressionAccess().getFullStopKeyword_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSSelectionExpression__Group_1__1__Impl"


    // $ANTLR start "rule__BSSelectionExpression__Group_1__2"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3286:1: rule__BSSelectionExpression__Group_1__2 : rule__BSSelectionExpression__Group_1__2__Impl rule__BSSelectionExpression__Group_1__3 ;
    public final void rule__BSSelectionExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3290:1: ( rule__BSSelectionExpression__Group_1__2__Impl rule__BSSelectionExpression__Group_1__3 )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3291:2: rule__BSSelectionExpression__Group_1__2__Impl rule__BSSelectionExpression__Group_1__3
            {
            pushFollow(FOLLOW_rule__BSSelectionExpression__Group_1__2__Impl_in_rule__BSSelectionExpression__Group_1__26609);
            rule__BSSelectionExpression__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__BSSelectionExpression__Group_1__3_in_rule__BSSelectionExpression__Group_1__26612);
            rule__BSSelectionExpression__Group_1__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSSelectionExpression__Group_1__2"


    // $ANTLR start "rule__BSSelectionExpression__Group_1__2__Impl"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3298:1: rule__BSSelectionExpression__Group_1__2__Impl : ( ( rule__BSSelectionExpression__MemberAssignment_1_2 ) ) ;
    public final void rule__BSSelectionExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3302:1: ( ( ( rule__BSSelectionExpression__MemberAssignment_1_2 ) ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3303:1: ( ( rule__BSSelectionExpression__MemberAssignment_1_2 ) )
            {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3303:1: ( ( rule__BSSelectionExpression__MemberAssignment_1_2 ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3304:1: ( rule__BSSelectionExpression__MemberAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBSSelectionExpressionAccess().getMemberAssignment_1_2()); 
            }
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3305:1: ( rule__BSSelectionExpression__MemberAssignment_1_2 )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3305:2: rule__BSSelectionExpression__MemberAssignment_1_2
            {
            pushFollow(FOLLOW_rule__BSSelectionExpression__MemberAssignment_1_2_in_rule__BSSelectionExpression__Group_1__2__Impl6639);
            rule__BSSelectionExpression__MemberAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBSSelectionExpressionAccess().getMemberAssignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSSelectionExpression__Group_1__2__Impl"


    // $ANTLR start "rule__BSSelectionExpression__Group_1__3"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3315:1: rule__BSSelectionExpression__Group_1__3 : rule__BSSelectionExpression__Group_1__3__Impl ;
    public final void rule__BSSelectionExpression__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3319:1: ( rule__BSSelectionExpression__Group_1__3__Impl )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3320:2: rule__BSSelectionExpression__Group_1__3__Impl
            {
            pushFollow(FOLLOW_rule__BSSelectionExpression__Group_1__3__Impl_in_rule__BSSelectionExpression__Group_1__36669);
            rule__BSSelectionExpression__Group_1__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSSelectionExpression__Group_1__3"


    // $ANTLR start "rule__BSSelectionExpression__Group_1__3__Impl"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3326:1: rule__BSSelectionExpression__Group_1__3__Impl : ( ( rule__BSSelectionExpression__Group_1_3__0 )? ) ;
    public final void rule__BSSelectionExpression__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3330:1: ( ( ( rule__BSSelectionExpression__Group_1_3__0 )? ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3331:1: ( ( rule__BSSelectionExpression__Group_1_3__0 )? )
            {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3331:1: ( ( rule__BSSelectionExpression__Group_1_3__0 )? )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3332:1: ( rule__BSSelectionExpression__Group_1_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBSSelectionExpressionAccess().getGroup_1_3()); 
            }
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3333:1: ( rule__BSSelectionExpression__Group_1_3__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==25) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3333:2: rule__BSSelectionExpression__Group_1_3__0
                    {
                    pushFollow(FOLLOW_rule__BSSelectionExpression__Group_1_3__0_in_rule__BSSelectionExpression__Group_1__3__Impl6696);
                    rule__BSSelectionExpression__Group_1_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBSSelectionExpressionAccess().getGroup_1_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSSelectionExpression__Group_1__3__Impl"


    // $ANTLR start "rule__BSSelectionExpression__Group_1_3__0"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3351:1: rule__BSSelectionExpression__Group_1_3__0 : rule__BSSelectionExpression__Group_1_3__0__Impl rule__BSSelectionExpression__Group_1_3__1 ;
    public final void rule__BSSelectionExpression__Group_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3355:1: ( rule__BSSelectionExpression__Group_1_3__0__Impl rule__BSSelectionExpression__Group_1_3__1 )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3356:2: rule__BSSelectionExpression__Group_1_3__0__Impl rule__BSSelectionExpression__Group_1_3__1
            {
            pushFollow(FOLLOW_rule__BSSelectionExpression__Group_1_3__0__Impl_in_rule__BSSelectionExpression__Group_1_3__06735);
            rule__BSSelectionExpression__Group_1_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__BSSelectionExpression__Group_1_3__1_in_rule__BSSelectionExpression__Group_1_3__06738);
            rule__BSSelectionExpression__Group_1_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSSelectionExpression__Group_1_3__0"


    // $ANTLR start "rule__BSSelectionExpression__Group_1_3__0__Impl"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3363:1: rule__BSSelectionExpression__Group_1_3__0__Impl : ( ( rule__BSSelectionExpression__MethodinvocationAssignment_1_3_0 ) ) ;
    public final void rule__BSSelectionExpression__Group_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3367:1: ( ( ( rule__BSSelectionExpression__MethodinvocationAssignment_1_3_0 ) ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3368:1: ( ( rule__BSSelectionExpression__MethodinvocationAssignment_1_3_0 ) )
            {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3368:1: ( ( rule__BSSelectionExpression__MethodinvocationAssignment_1_3_0 ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3369:1: ( rule__BSSelectionExpression__MethodinvocationAssignment_1_3_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBSSelectionExpressionAccess().getMethodinvocationAssignment_1_3_0()); 
            }
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3370:1: ( rule__BSSelectionExpression__MethodinvocationAssignment_1_3_0 )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3370:2: rule__BSSelectionExpression__MethodinvocationAssignment_1_3_0
            {
            pushFollow(FOLLOW_rule__BSSelectionExpression__MethodinvocationAssignment_1_3_0_in_rule__BSSelectionExpression__Group_1_3__0__Impl6765);
            rule__BSSelectionExpression__MethodinvocationAssignment_1_3_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBSSelectionExpressionAccess().getMethodinvocationAssignment_1_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSSelectionExpression__Group_1_3__0__Impl"


    // $ANTLR start "rule__BSSelectionExpression__Group_1_3__1"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3380:1: rule__BSSelectionExpression__Group_1_3__1 : rule__BSSelectionExpression__Group_1_3__1__Impl rule__BSSelectionExpression__Group_1_3__2 ;
    public final void rule__BSSelectionExpression__Group_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3384:1: ( rule__BSSelectionExpression__Group_1_3__1__Impl rule__BSSelectionExpression__Group_1_3__2 )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3385:2: rule__BSSelectionExpression__Group_1_3__1__Impl rule__BSSelectionExpression__Group_1_3__2
            {
            pushFollow(FOLLOW_rule__BSSelectionExpression__Group_1_3__1__Impl_in_rule__BSSelectionExpression__Group_1_3__16795);
            rule__BSSelectionExpression__Group_1_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__BSSelectionExpression__Group_1_3__2_in_rule__BSSelectionExpression__Group_1_3__16798);
            rule__BSSelectionExpression__Group_1_3__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSSelectionExpression__Group_1_3__1"


    // $ANTLR start "rule__BSSelectionExpression__Group_1_3__1__Impl"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3392:1: rule__BSSelectionExpression__Group_1_3__1__Impl : ( ( rule__BSSelectionExpression__Group_1_3_1__0 )? ) ;
    public final void rule__BSSelectionExpression__Group_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3396:1: ( ( ( rule__BSSelectionExpression__Group_1_3_1__0 )? ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3397:1: ( ( rule__BSSelectionExpression__Group_1_3_1__0 )? )
            {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3397:1: ( ( rule__BSSelectionExpression__Group_1_3_1__0 )? )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3398:1: ( rule__BSSelectionExpression__Group_1_3_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBSSelectionExpressionAccess().getGroup_1_3_1()); 
            }
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3399:1: ( rule__BSSelectionExpression__Group_1_3_1__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=RULE_ID && LA24_0<=RULE_INT)||(LA24_0>=14 && LA24_0<=15)||LA24_0==25||(LA24_0>=32 && LA24_0<=35)) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3399:2: rule__BSSelectionExpression__Group_1_3_1__0
                    {
                    pushFollow(FOLLOW_rule__BSSelectionExpression__Group_1_3_1__0_in_rule__BSSelectionExpression__Group_1_3__1__Impl6825);
                    rule__BSSelectionExpression__Group_1_3_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBSSelectionExpressionAccess().getGroup_1_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSSelectionExpression__Group_1_3__1__Impl"


    // $ANTLR start "rule__BSSelectionExpression__Group_1_3__2"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3409:1: rule__BSSelectionExpression__Group_1_3__2 : rule__BSSelectionExpression__Group_1_3__2__Impl ;
    public final void rule__BSSelectionExpression__Group_1_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3413:1: ( rule__BSSelectionExpression__Group_1_3__2__Impl )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3414:2: rule__BSSelectionExpression__Group_1_3__2__Impl
            {
            pushFollow(FOLLOW_rule__BSSelectionExpression__Group_1_3__2__Impl_in_rule__BSSelectionExpression__Group_1_3__26856);
            rule__BSSelectionExpression__Group_1_3__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSSelectionExpression__Group_1_3__2"


    // $ANTLR start "rule__BSSelectionExpression__Group_1_3__2__Impl"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3420:1: rule__BSSelectionExpression__Group_1_3__2__Impl : ( ')' ) ;
    public final void rule__BSSelectionExpression__Group_1_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3424:1: ( ( ')' ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3425:1: ( ')' )
            {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3425:1: ( ')' )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3426:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBSSelectionExpressionAccess().getRightParenthesisKeyword_1_3_2()); 
            }
            match(input,26,FOLLOW_26_in_rule__BSSelectionExpression__Group_1_3__2__Impl6884); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBSSelectionExpressionAccess().getRightParenthesisKeyword_1_3_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSSelectionExpression__Group_1_3__2__Impl"


    // $ANTLR start "rule__BSSelectionExpression__Group_1_3_1__0"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3445:1: rule__BSSelectionExpression__Group_1_3_1__0 : rule__BSSelectionExpression__Group_1_3_1__0__Impl rule__BSSelectionExpression__Group_1_3_1__1 ;
    public final void rule__BSSelectionExpression__Group_1_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3449:1: ( rule__BSSelectionExpression__Group_1_3_1__0__Impl rule__BSSelectionExpression__Group_1_3_1__1 )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3450:2: rule__BSSelectionExpression__Group_1_3_1__0__Impl rule__BSSelectionExpression__Group_1_3_1__1
            {
            pushFollow(FOLLOW_rule__BSSelectionExpression__Group_1_3_1__0__Impl_in_rule__BSSelectionExpression__Group_1_3_1__06921);
            rule__BSSelectionExpression__Group_1_3_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__BSSelectionExpression__Group_1_3_1__1_in_rule__BSSelectionExpression__Group_1_3_1__06924);
            rule__BSSelectionExpression__Group_1_3_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSSelectionExpression__Group_1_3_1__0"


    // $ANTLR start "rule__BSSelectionExpression__Group_1_3_1__0__Impl"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3457:1: rule__BSSelectionExpression__Group_1_3_1__0__Impl : ( ( rule__BSSelectionExpression__ArgsAssignment_1_3_1_0 ) ) ;
    public final void rule__BSSelectionExpression__Group_1_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3461:1: ( ( ( rule__BSSelectionExpression__ArgsAssignment_1_3_1_0 ) ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3462:1: ( ( rule__BSSelectionExpression__ArgsAssignment_1_3_1_0 ) )
            {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3462:1: ( ( rule__BSSelectionExpression__ArgsAssignment_1_3_1_0 ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3463:1: ( rule__BSSelectionExpression__ArgsAssignment_1_3_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBSSelectionExpressionAccess().getArgsAssignment_1_3_1_0()); 
            }
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3464:1: ( rule__BSSelectionExpression__ArgsAssignment_1_3_1_0 )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3464:2: rule__BSSelectionExpression__ArgsAssignment_1_3_1_0
            {
            pushFollow(FOLLOW_rule__BSSelectionExpression__ArgsAssignment_1_3_1_0_in_rule__BSSelectionExpression__Group_1_3_1__0__Impl6951);
            rule__BSSelectionExpression__ArgsAssignment_1_3_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBSSelectionExpressionAccess().getArgsAssignment_1_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSSelectionExpression__Group_1_3_1__0__Impl"


    // $ANTLR start "rule__BSSelectionExpression__Group_1_3_1__1"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3474:1: rule__BSSelectionExpression__Group_1_3_1__1 : rule__BSSelectionExpression__Group_1_3_1__1__Impl ;
    public final void rule__BSSelectionExpression__Group_1_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3478:1: ( rule__BSSelectionExpression__Group_1_3_1__1__Impl )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3479:2: rule__BSSelectionExpression__Group_1_3_1__1__Impl
            {
            pushFollow(FOLLOW_rule__BSSelectionExpression__Group_1_3_1__1__Impl_in_rule__BSSelectionExpression__Group_1_3_1__16981);
            rule__BSSelectionExpression__Group_1_3_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSSelectionExpression__Group_1_3_1__1"


    // $ANTLR start "rule__BSSelectionExpression__Group_1_3_1__1__Impl"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3485:1: rule__BSSelectionExpression__Group_1_3_1__1__Impl : ( ( rule__BSSelectionExpression__Group_1_3_1_1__0 )* ) ;
    public final void rule__BSSelectionExpression__Group_1_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3489:1: ( ( ( rule__BSSelectionExpression__Group_1_3_1_1__0 )* ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3490:1: ( ( rule__BSSelectionExpression__Group_1_3_1_1__0 )* )
            {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3490:1: ( ( rule__BSSelectionExpression__Group_1_3_1_1__0 )* )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3491:1: ( rule__BSSelectionExpression__Group_1_3_1_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBSSelectionExpressionAccess().getGroup_1_3_1_1()); 
            }
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3492:1: ( rule__BSSelectionExpression__Group_1_3_1_1__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==27) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3492:2: rule__BSSelectionExpression__Group_1_3_1_1__0
            	    {
            	    pushFollow(FOLLOW_rule__BSSelectionExpression__Group_1_3_1_1__0_in_rule__BSSelectionExpression__Group_1_3_1__1__Impl7008);
            	    rule__BSSelectionExpression__Group_1_3_1_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBSSelectionExpressionAccess().getGroup_1_3_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSSelectionExpression__Group_1_3_1__1__Impl"


    // $ANTLR start "rule__BSSelectionExpression__Group_1_3_1_1__0"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3506:1: rule__BSSelectionExpression__Group_1_3_1_1__0 : rule__BSSelectionExpression__Group_1_3_1_1__0__Impl rule__BSSelectionExpression__Group_1_3_1_1__1 ;
    public final void rule__BSSelectionExpression__Group_1_3_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3510:1: ( rule__BSSelectionExpression__Group_1_3_1_1__0__Impl rule__BSSelectionExpression__Group_1_3_1_1__1 )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3511:2: rule__BSSelectionExpression__Group_1_3_1_1__0__Impl rule__BSSelectionExpression__Group_1_3_1_1__1
            {
            pushFollow(FOLLOW_rule__BSSelectionExpression__Group_1_3_1_1__0__Impl_in_rule__BSSelectionExpression__Group_1_3_1_1__07043);
            rule__BSSelectionExpression__Group_1_3_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__BSSelectionExpression__Group_1_3_1_1__1_in_rule__BSSelectionExpression__Group_1_3_1_1__07046);
            rule__BSSelectionExpression__Group_1_3_1_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSSelectionExpression__Group_1_3_1_1__0"


    // $ANTLR start "rule__BSSelectionExpression__Group_1_3_1_1__0__Impl"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3518:1: rule__BSSelectionExpression__Group_1_3_1_1__0__Impl : ( ',' ) ;
    public final void rule__BSSelectionExpression__Group_1_3_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3522:1: ( ( ',' ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3523:1: ( ',' )
            {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3523:1: ( ',' )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3524:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBSSelectionExpressionAccess().getCommaKeyword_1_3_1_1_0()); 
            }
            match(input,27,FOLLOW_27_in_rule__BSSelectionExpression__Group_1_3_1_1__0__Impl7074); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBSSelectionExpressionAccess().getCommaKeyword_1_3_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSSelectionExpression__Group_1_3_1_1__0__Impl"


    // $ANTLR start "rule__BSSelectionExpression__Group_1_3_1_1__1"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3537:1: rule__BSSelectionExpression__Group_1_3_1_1__1 : rule__BSSelectionExpression__Group_1_3_1_1__1__Impl ;
    public final void rule__BSSelectionExpression__Group_1_3_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3541:1: ( rule__BSSelectionExpression__Group_1_3_1_1__1__Impl )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3542:2: rule__BSSelectionExpression__Group_1_3_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__BSSelectionExpression__Group_1_3_1_1__1__Impl_in_rule__BSSelectionExpression__Group_1_3_1_1__17105);
            rule__BSSelectionExpression__Group_1_3_1_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSSelectionExpression__Group_1_3_1_1__1"


    // $ANTLR start "rule__BSSelectionExpression__Group_1_3_1_1__1__Impl"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3548:1: rule__BSSelectionExpression__Group_1_3_1_1__1__Impl : ( ( rule__BSSelectionExpression__ArgsAssignment_1_3_1_1_1 ) ) ;
    public final void rule__BSSelectionExpression__Group_1_3_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3552:1: ( ( ( rule__BSSelectionExpression__ArgsAssignment_1_3_1_1_1 ) ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3553:1: ( ( rule__BSSelectionExpression__ArgsAssignment_1_3_1_1_1 ) )
            {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3553:1: ( ( rule__BSSelectionExpression__ArgsAssignment_1_3_1_1_1 ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3554:1: ( rule__BSSelectionExpression__ArgsAssignment_1_3_1_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBSSelectionExpressionAccess().getArgsAssignment_1_3_1_1_1()); 
            }
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3555:1: ( rule__BSSelectionExpression__ArgsAssignment_1_3_1_1_1 )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3555:2: rule__BSSelectionExpression__ArgsAssignment_1_3_1_1_1
            {
            pushFollow(FOLLOW_rule__BSSelectionExpression__ArgsAssignment_1_3_1_1_1_in_rule__BSSelectionExpression__Group_1_3_1_1__1__Impl7132);
            rule__BSSelectionExpression__ArgsAssignment_1_3_1_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBSSelectionExpressionAccess().getArgsAssignment_1_3_1_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSSelectionExpression__Group_1_3_1_1__1__Impl"


    // $ANTLR start "rule__BSTerminalExpression__Group_0__0"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3569:1: rule__BSTerminalExpression__Group_0__0 : rule__BSTerminalExpression__Group_0__0__Impl rule__BSTerminalExpression__Group_0__1 ;
    public final void rule__BSTerminalExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3573:1: ( rule__BSTerminalExpression__Group_0__0__Impl rule__BSTerminalExpression__Group_0__1 )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3574:2: rule__BSTerminalExpression__Group_0__0__Impl rule__BSTerminalExpression__Group_0__1
            {
            pushFollow(FOLLOW_rule__BSTerminalExpression__Group_0__0__Impl_in_rule__BSTerminalExpression__Group_0__07166);
            rule__BSTerminalExpression__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__BSTerminalExpression__Group_0__1_in_rule__BSTerminalExpression__Group_0__07169);
            rule__BSTerminalExpression__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSTerminalExpression__Group_0__0"


    // $ANTLR start "rule__BSTerminalExpression__Group_0__0__Impl"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3581:1: rule__BSTerminalExpression__Group_0__0__Impl : ( () ) ;
    public final void rule__BSTerminalExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3585:1: ( ( () ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3586:1: ( () )
            {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3586:1: ( () )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3587:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBSTerminalExpressionAccess().getBSStringConstantAction_0_0()); 
            }
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3588:1: ()
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3590:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBSTerminalExpressionAccess().getBSStringConstantAction_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSTerminalExpression__Group_0__0__Impl"


    // $ANTLR start "rule__BSTerminalExpression__Group_0__1"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3600:1: rule__BSTerminalExpression__Group_0__1 : rule__BSTerminalExpression__Group_0__1__Impl ;
    public final void rule__BSTerminalExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3604:1: ( rule__BSTerminalExpression__Group_0__1__Impl )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3605:2: rule__BSTerminalExpression__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__BSTerminalExpression__Group_0__1__Impl_in_rule__BSTerminalExpression__Group_0__17227);
            rule__BSTerminalExpression__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSTerminalExpression__Group_0__1"


    // $ANTLR start "rule__BSTerminalExpression__Group_0__1__Impl"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3611:1: rule__BSTerminalExpression__Group_0__1__Impl : ( ( rule__BSTerminalExpression__ValueAssignment_0_1 ) ) ;
    public final void rule__BSTerminalExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3615:1: ( ( ( rule__BSTerminalExpression__ValueAssignment_0_1 ) ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3616:1: ( ( rule__BSTerminalExpression__ValueAssignment_0_1 ) )
            {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3616:1: ( ( rule__BSTerminalExpression__ValueAssignment_0_1 ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3617:1: ( rule__BSTerminalExpression__ValueAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBSTerminalExpressionAccess().getValueAssignment_0_1()); 
            }
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3618:1: ( rule__BSTerminalExpression__ValueAssignment_0_1 )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3618:2: rule__BSTerminalExpression__ValueAssignment_0_1
            {
            pushFollow(FOLLOW_rule__BSTerminalExpression__ValueAssignment_0_1_in_rule__BSTerminalExpression__Group_0__1__Impl7254);
            rule__BSTerminalExpression__ValueAssignment_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBSTerminalExpressionAccess().getValueAssignment_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSTerminalExpression__Group_0__1__Impl"


    // $ANTLR start "rule__BSTerminalExpression__Group_1__0"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3632:1: rule__BSTerminalExpression__Group_1__0 : rule__BSTerminalExpression__Group_1__0__Impl rule__BSTerminalExpression__Group_1__1 ;
    public final void rule__BSTerminalExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3636:1: ( rule__BSTerminalExpression__Group_1__0__Impl rule__BSTerminalExpression__Group_1__1 )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3637:2: rule__BSTerminalExpression__Group_1__0__Impl rule__BSTerminalExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__BSTerminalExpression__Group_1__0__Impl_in_rule__BSTerminalExpression__Group_1__07288);
            rule__BSTerminalExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__BSTerminalExpression__Group_1__1_in_rule__BSTerminalExpression__Group_1__07291);
            rule__BSTerminalExpression__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSTerminalExpression__Group_1__0"


    // $ANTLR start "rule__BSTerminalExpression__Group_1__0__Impl"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3644:1: rule__BSTerminalExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__BSTerminalExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3648:1: ( ( () ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3649:1: ( () )
            {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3649:1: ( () )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3650:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBSTerminalExpressionAccess().getBSNumberConstantAction_1_0()); 
            }
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3651:1: ()
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3653:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBSTerminalExpressionAccess().getBSNumberConstantAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSTerminalExpression__Group_1__0__Impl"


    // $ANTLR start "rule__BSTerminalExpression__Group_1__1"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3663:1: rule__BSTerminalExpression__Group_1__1 : rule__BSTerminalExpression__Group_1__1__Impl ;
    public final void rule__BSTerminalExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3667:1: ( rule__BSTerminalExpression__Group_1__1__Impl )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3668:2: rule__BSTerminalExpression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__BSTerminalExpression__Group_1__1__Impl_in_rule__BSTerminalExpression__Group_1__17349);
            rule__BSTerminalExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSTerminalExpression__Group_1__1"


    // $ANTLR start "rule__BSTerminalExpression__Group_1__1__Impl"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3674:1: rule__BSTerminalExpression__Group_1__1__Impl : ( ( rule__BSTerminalExpression__ValueAssignment_1_1 ) ) ;
    public final void rule__BSTerminalExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3678:1: ( ( ( rule__BSTerminalExpression__ValueAssignment_1_1 ) ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3679:1: ( ( rule__BSTerminalExpression__ValueAssignment_1_1 ) )
            {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3679:1: ( ( rule__BSTerminalExpression__ValueAssignment_1_1 ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3680:1: ( rule__BSTerminalExpression__ValueAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBSTerminalExpressionAccess().getValueAssignment_1_1()); 
            }
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3681:1: ( rule__BSTerminalExpression__ValueAssignment_1_1 )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3681:2: rule__BSTerminalExpression__ValueAssignment_1_1
            {
            pushFollow(FOLLOW_rule__BSTerminalExpression__ValueAssignment_1_1_in_rule__BSTerminalExpression__Group_1__1__Impl7376);
            rule__BSTerminalExpression__ValueAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBSTerminalExpressionAccess().getValueAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSTerminalExpression__Group_1__1__Impl"


    // $ANTLR start "rule__BSTerminalExpression__Group_2__0"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3695:1: rule__BSTerminalExpression__Group_2__0 : rule__BSTerminalExpression__Group_2__0__Impl rule__BSTerminalExpression__Group_2__1 ;
    public final void rule__BSTerminalExpression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3699:1: ( rule__BSTerminalExpression__Group_2__0__Impl rule__BSTerminalExpression__Group_2__1 )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3700:2: rule__BSTerminalExpression__Group_2__0__Impl rule__BSTerminalExpression__Group_2__1
            {
            pushFollow(FOLLOW_rule__BSTerminalExpression__Group_2__0__Impl_in_rule__BSTerminalExpression__Group_2__07410);
            rule__BSTerminalExpression__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__BSTerminalExpression__Group_2__1_in_rule__BSTerminalExpression__Group_2__07413);
            rule__BSTerminalExpression__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSTerminalExpression__Group_2__0"


    // $ANTLR start "rule__BSTerminalExpression__Group_2__0__Impl"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3707:1: rule__BSTerminalExpression__Group_2__0__Impl : ( () ) ;
    public final void rule__BSTerminalExpression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3711:1: ( ( () ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3712:1: ( () )
            {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3712:1: ( () )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3713:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBSTerminalExpressionAccess().getBSBooleanConstantAction_2_0()); 
            }
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3714:1: ()
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3716:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBSTerminalExpressionAccess().getBSBooleanConstantAction_2_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSTerminalExpression__Group_2__0__Impl"


    // $ANTLR start "rule__BSTerminalExpression__Group_2__1"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3726:1: rule__BSTerminalExpression__Group_2__1 : rule__BSTerminalExpression__Group_2__1__Impl ;
    public final void rule__BSTerminalExpression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3730:1: ( rule__BSTerminalExpression__Group_2__1__Impl )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3731:2: rule__BSTerminalExpression__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__BSTerminalExpression__Group_2__1__Impl_in_rule__BSTerminalExpression__Group_2__17471);
            rule__BSTerminalExpression__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSTerminalExpression__Group_2__1"


    // $ANTLR start "rule__BSTerminalExpression__Group_2__1__Impl"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3737:1: rule__BSTerminalExpression__Group_2__1__Impl : ( ( rule__BSTerminalExpression__ValueAssignment_2_1 ) ) ;
    public final void rule__BSTerminalExpression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3741:1: ( ( ( rule__BSTerminalExpression__ValueAssignment_2_1 ) ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3742:1: ( ( rule__BSTerminalExpression__ValueAssignment_2_1 ) )
            {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3742:1: ( ( rule__BSTerminalExpression__ValueAssignment_2_1 ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3743:1: ( rule__BSTerminalExpression__ValueAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBSTerminalExpressionAccess().getValueAssignment_2_1()); 
            }
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3744:1: ( rule__BSTerminalExpression__ValueAssignment_2_1 )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3744:2: rule__BSTerminalExpression__ValueAssignment_2_1
            {
            pushFollow(FOLLOW_rule__BSTerminalExpression__ValueAssignment_2_1_in_rule__BSTerminalExpression__Group_2__1__Impl7498);
            rule__BSTerminalExpression__ValueAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBSTerminalExpressionAccess().getValueAssignment_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSTerminalExpression__Group_2__1__Impl"


    // $ANTLR start "rule__BSTerminalExpression__Group_3__0"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3758:1: rule__BSTerminalExpression__Group_3__0 : rule__BSTerminalExpression__Group_3__0__Impl rule__BSTerminalExpression__Group_3__1 ;
    public final void rule__BSTerminalExpression__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3762:1: ( rule__BSTerminalExpression__Group_3__0__Impl rule__BSTerminalExpression__Group_3__1 )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3763:2: rule__BSTerminalExpression__Group_3__0__Impl rule__BSTerminalExpression__Group_3__1
            {
            pushFollow(FOLLOW_rule__BSTerminalExpression__Group_3__0__Impl_in_rule__BSTerminalExpression__Group_3__07532);
            rule__BSTerminalExpression__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__BSTerminalExpression__Group_3__1_in_rule__BSTerminalExpression__Group_3__07535);
            rule__BSTerminalExpression__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSTerminalExpression__Group_3__0"


    // $ANTLR start "rule__BSTerminalExpression__Group_3__0__Impl"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3770:1: rule__BSTerminalExpression__Group_3__0__Impl : ( () ) ;
    public final void rule__BSTerminalExpression__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3774:1: ( ( () ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3775:1: ( () )
            {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3775:1: ( () )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3776:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBSTerminalExpressionAccess().getBSNullAction_3_0()); 
            }
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3777:1: ()
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3779:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBSTerminalExpressionAccess().getBSNullAction_3_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSTerminalExpression__Group_3__0__Impl"


    // $ANTLR start "rule__BSTerminalExpression__Group_3__1"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3789:1: rule__BSTerminalExpression__Group_3__1 : rule__BSTerminalExpression__Group_3__1__Impl ;
    public final void rule__BSTerminalExpression__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3793:1: ( rule__BSTerminalExpression__Group_3__1__Impl )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3794:2: rule__BSTerminalExpression__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__BSTerminalExpression__Group_3__1__Impl_in_rule__BSTerminalExpression__Group_3__17593);
            rule__BSTerminalExpression__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSTerminalExpression__Group_3__1"


    // $ANTLR start "rule__BSTerminalExpression__Group_3__1__Impl"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3800:1: rule__BSTerminalExpression__Group_3__1__Impl : ( 'null' ) ;
    public final void rule__BSTerminalExpression__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3804:1: ( ( 'null' ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3805:1: ( 'null' )
            {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3805:1: ( 'null' )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3806:1: 'null'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBSTerminalExpressionAccess().getNullKeyword_3_1()); 
            }
            match(input,32,FOLLOW_32_in_rule__BSTerminalExpression__Group_3__1__Impl7621); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBSTerminalExpressionAccess().getNullKeyword_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSTerminalExpression__Group_3__1__Impl"


    // $ANTLR start "rule__BSTerminalExpression__Group_4__0"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3823:1: rule__BSTerminalExpression__Group_4__0 : rule__BSTerminalExpression__Group_4__0__Impl rule__BSTerminalExpression__Group_4__1 ;
    public final void rule__BSTerminalExpression__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3827:1: ( rule__BSTerminalExpression__Group_4__0__Impl rule__BSTerminalExpression__Group_4__1 )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3828:2: rule__BSTerminalExpression__Group_4__0__Impl rule__BSTerminalExpression__Group_4__1
            {
            pushFollow(FOLLOW_rule__BSTerminalExpression__Group_4__0__Impl_in_rule__BSTerminalExpression__Group_4__07656);
            rule__BSTerminalExpression__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__BSTerminalExpression__Group_4__1_in_rule__BSTerminalExpression__Group_4__07659);
            rule__BSTerminalExpression__Group_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSTerminalExpression__Group_4__0"


    // $ANTLR start "rule__BSTerminalExpression__Group_4__0__Impl"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3835:1: rule__BSTerminalExpression__Group_4__0__Impl : ( () ) ;
    public final void rule__BSTerminalExpression__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3839:1: ( ( () ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3840:1: ( () )
            {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3840:1: ( () )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3841:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBSTerminalExpressionAccess().getBSThisAction_4_0()); 
            }
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3842:1: ()
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3844:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBSTerminalExpressionAccess().getBSThisAction_4_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSTerminalExpression__Group_4__0__Impl"


    // $ANTLR start "rule__BSTerminalExpression__Group_4__1"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3854:1: rule__BSTerminalExpression__Group_4__1 : rule__BSTerminalExpression__Group_4__1__Impl ;
    public final void rule__BSTerminalExpression__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3858:1: ( rule__BSTerminalExpression__Group_4__1__Impl )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3859:2: rule__BSTerminalExpression__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__BSTerminalExpression__Group_4__1__Impl_in_rule__BSTerminalExpression__Group_4__17717);
            rule__BSTerminalExpression__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSTerminalExpression__Group_4__1"


    // $ANTLR start "rule__BSTerminalExpression__Group_4__1__Impl"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3865:1: rule__BSTerminalExpression__Group_4__1__Impl : ( 'this' ) ;
    public final void rule__BSTerminalExpression__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3869:1: ( ( 'this' ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3870:1: ( 'this' )
            {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3870:1: ( 'this' )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3871:1: 'this'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBSTerminalExpressionAccess().getThisKeyword_4_1()); 
            }
            match(input,33,FOLLOW_33_in_rule__BSTerminalExpression__Group_4__1__Impl7745); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBSTerminalExpressionAccess().getThisKeyword_4_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSTerminalExpression__Group_4__1__Impl"


    // $ANTLR start "rule__BSTerminalExpression__Group_5__0"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3888:1: rule__BSTerminalExpression__Group_5__0 : rule__BSTerminalExpression__Group_5__0__Impl rule__BSTerminalExpression__Group_5__1 ;
    public final void rule__BSTerminalExpression__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3892:1: ( rule__BSTerminalExpression__Group_5__0__Impl rule__BSTerminalExpression__Group_5__1 )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3893:2: rule__BSTerminalExpression__Group_5__0__Impl rule__BSTerminalExpression__Group_5__1
            {
            pushFollow(FOLLOW_rule__BSTerminalExpression__Group_5__0__Impl_in_rule__BSTerminalExpression__Group_5__07780);
            rule__BSTerminalExpression__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__BSTerminalExpression__Group_5__1_in_rule__BSTerminalExpression__Group_5__07783);
            rule__BSTerminalExpression__Group_5__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSTerminalExpression__Group_5__0"


    // $ANTLR start "rule__BSTerminalExpression__Group_5__0__Impl"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3900:1: rule__BSTerminalExpression__Group_5__0__Impl : ( () ) ;
    public final void rule__BSTerminalExpression__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3904:1: ( ( () ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3905:1: ( () )
            {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3905:1: ( () )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3906:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBSTerminalExpressionAccess().getBSClientAction_5_0()); 
            }
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3907:1: ()
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3909:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBSTerminalExpressionAccess().getBSClientAction_5_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSTerminalExpression__Group_5__0__Impl"


    // $ANTLR start "rule__BSTerminalExpression__Group_5__1"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3919:1: rule__BSTerminalExpression__Group_5__1 : rule__BSTerminalExpression__Group_5__1__Impl ;
    public final void rule__BSTerminalExpression__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3923:1: ( rule__BSTerminalExpression__Group_5__1__Impl )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3924:2: rule__BSTerminalExpression__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__BSTerminalExpression__Group_5__1__Impl_in_rule__BSTerminalExpression__Group_5__17841);
            rule__BSTerminalExpression__Group_5__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSTerminalExpression__Group_5__1"


    // $ANTLR start "rule__BSTerminalExpression__Group_5__1__Impl"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3930:1: rule__BSTerminalExpression__Group_5__1__Impl : ( 'client' ) ;
    public final void rule__BSTerminalExpression__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3934:1: ( ( 'client' ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3935:1: ( 'client' )
            {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3935:1: ( 'client' )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3936:1: 'client'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBSTerminalExpressionAccess().getClientKeyword_5_1()); 
            }
            match(input,34,FOLLOW_34_in_rule__BSTerminalExpression__Group_5__1__Impl7869); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBSTerminalExpressionAccess().getClientKeyword_5_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSTerminalExpression__Group_5__1__Impl"


    // $ANTLR start "rule__BSTerminalExpression__Group_6__0"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3953:1: rule__BSTerminalExpression__Group_6__0 : rule__BSTerminalExpression__Group_6__0__Impl rule__BSTerminalExpression__Group_6__1 ;
    public final void rule__BSTerminalExpression__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3957:1: ( rule__BSTerminalExpression__Group_6__0__Impl rule__BSTerminalExpression__Group_6__1 )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3958:2: rule__BSTerminalExpression__Group_6__0__Impl rule__BSTerminalExpression__Group_6__1
            {
            pushFollow(FOLLOW_rule__BSTerminalExpression__Group_6__0__Impl_in_rule__BSTerminalExpression__Group_6__07904);
            rule__BSTerminalExpression__Group_6__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__BSTerminalExpression__Group_6__1_in_rule__BSTerminalExpression__Group_6__07907);
            rule__BSTerminalExpression__Group_6__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSTerminalExpression__Group_6__0"


    // $ANTLR start "rule__BSTerminalExpression__Group_6__0__Impl"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3965:1: rule__BSTerminalExpression__Group_6__0__Impl : ( () ) ;
    public final void rule__BSTerminalExpression__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3969:1: ( ( () ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3970:1: ( () )
            {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3970:1: ( () )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3971:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBSTerminalExpressionAccess().getBSSymbolRefAction_6_0()); 
            }
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3972:1: ()
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3974:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBSTerminalExpressionAccess().getBSSymbolRefAction_6_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSTerminalExpression__Group_6__0__Impl"


    // $ANTLR start "rule__BSTerminalExpression__Group_6__1"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3984:1: rule__BSTerminalExpression__Group_6__1 : rule__BSTerminalExpression__Group_6__1__Impl rule__BSTerminalExpression__Group_6__2 ;
    public final void rule__BSTerminalExpression__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3988:1: ( rule__BSTerminalExpression__Group_6__1__Impl rule__BSTerminalExpression__Group_6__2 )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3989:2: rule__BSTerminalExpression__Group_6__1__Impl rule__BSTerminalExpression__Group_6__2
            {
            pushFollow(FOLLOW_rule__BSTerminalExpression__Group_6__1__Impl_in_rule__BSTerminalExpression__Group_6__17965);
            rule__BSTerminalExpression__Group_6__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__BSTerminalExpression__Group_6__2_in_rule__BSTerminalExpression__Group_6__17968);
            rule__BSTerminalExpression__Group_6__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSTerminalExpression__Group_6__1"


    // $ANTLR start "rule__BSTerminalExpression__Group_6__1__Impl"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:3996:1: rule__BSTerminalExpression__Group_6__1__Impl : ( ( rule__BSTerminalExpression__SymbolAssignment_6_1 ) ) ;
    public final void rule__BSTerminalExpression__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4000:1: ( ( ( rule__BSTerminalExpression__SymbolAssignment_6_1 ) ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4001:1: ( ( rule__BSTerminalExpression__SymbolAssignment_6_1 ) )
            {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4001:1: ( ( rule__BSTerminalExpression__SymbolAssignment_6_1 ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4002:1: ( rule__BSTerminalExpression__SymbolAssignment_6_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBSTerminalExpressionAccess().getSymbolAssignment_6_1()); 
            }
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4003:1: ( rule__BSTerminalExpression__SymbolAssignment_6_1 )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4003:2: rule__BSTerminalExpression__SymbolAssignment_6_1
            {
            pushFollow(FOLLOW_rule__BSTerminalExpression__SymbolAssignment_6_1_in_rule__BSTerminalExpression__Group_6__1__Impl7995);
            rule__BSTerminalExpression__SymbolAssignment_6_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBSTerminalExpressionAccess().getSymbolAssignment_6_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSTerminalExpression__Group_6__1__Impl"


    // $ANTLR start "rule__BSTerminalExpression__Group_6__2"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4013:1: rule__BSTerminalExpression__Group_6__2 : rule__BSTerminalExpression__Group_6__2__Impl ;
    public final void rule__BSTerminalExpression__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4017:1: ( rule__BSTerminalExpression__Group_6__2__Impl )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4018:2: rule__BSTerminalExpression__Group_6__2__Impl
            {
            pushFollow(FOLLOW_rule__BSTerminalExpression__Group_6__2__Impl_in_rule__BSTerminalExpression__Group_6__28025);
            rule__BSTerminalExpression__Group_6__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSTerminalExpression__Group_6__2"


    // $ANTLR start "rule__BSTerminalExpression__Group_6__2__Impl"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4024:1: rule__BSTerminalExpression__Group_6__2__Impl : ( ( rule__BSTerminalExpression__Group_6_2__0 )? ) ;
    public final void rule__BSTerminalExpression__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4028:1: ( ( ( rule__BSTerminalExpression__Group_6_2__0 )? ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4029:1: ( ( rule__BSTerminalExpression__Group_6_2__0 )? )
            {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4029:1: ( ( rule__BSTerminalExpression__Group_6_2__0 )? )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4030:1: ( rule__BSTerminalExpression__Group_6_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBSTerminalExpressionAccess().getGroup_6_2()); 
            }
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4031:1: ( rule__BSTerminalExpression__Group_6_2__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==25) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4031:2: rule__BSTerminalExpression__Group_6_2__0
                    {
                    pushFollow(FOLLOW_rule__BSTerminalExpression__Group_6_2__0_in_rule__BSTerminalExpression__Group_6__2__Impl8052);
                    rule__BSTerminalExpression__Group_6_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBSTerminalExpressionAccess().getGroup_6_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSTerminalExpression__Group_6__2__Impl"


    // $ANTLR start "rule__BSTerminalExpression__Group_6_2__0"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4047:1: rule__BSTerminalExpression__Group_6_2__0 : rule__BSTerminalExpression__Group_6_2__0__Impl rule__BSTerminalExpression__Group_6_2__1 ;
    public final void rule__BSTerminalExpression__Group_6_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4051:1: ( rule__BSTerminalExpression__Group_6_2__0__Impl rule__BSTerminalExpression__Group_6_2__1 )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4052:2: rule__BSTerminalExpression__Group_6_2__0__Impl rule__BSTerminalExpression__Group_6_2__1
            {
            pushFollow(FOLLOW_rule__BSTerminalExpression__Group_6_2__0__Impl_in_rule__BSTerminalExpression__Group_6_2__08089);
            rule__BSTerminalExpression__Group_6_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__BSTerminalExpression__Group_6_2__1_in_rule__BSTerminalExpression__Group_6_2__08092);
            rule__BSTerminalExpression__Group_6_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSTerminalExpression__Group_6_2__0"


    // $ANTLR start "rule__BSTerminalExpression__Group_6_2__0__Impl"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4059:1: rule__BSTerminalExpression__Group_6_2__0__Impl : ( ( rule__BSTerminalExpression__MethodinvocationAssignment_6_2_0 ) ) ;
    public final void rule__BSTerminalExpression__Group_6_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4063:1: ( ( ( rule__BSTerminalExpression__MethodinvocationAssignment_6_2_0 ) ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4064:1: ( ( rule__BSTerminalExpression__MethodinvocationAssignment_6_2_0 ) )
            {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4064:1: ( ( rule__BSTerminalExpression__MethodinvocationAssignment_6_2_0 ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4065:1: ( rule__BSTerminalExpression__MethodinvocationAssignment_6_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBSTerminalExpressionAccess().getMethodinvocationAssignment_6_2_0()); 
            }
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4066:1: ( rule__BSTerminalExpression__MethodinvocationAssignment_6_2_0 )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4066:2: rule__BSTerminalExpression__MethodinvocationAssignment_6_2_0
            {
            pushFollow(FOLLOW_rule__BSTerminalExpression__MethodinvocationAssignment_6_2_0_in_rule__BSTerminalExpression__Group_6_2__0__Impl8119);
            rule__BSTerminalExpression__MethodinvocationAssignment_6_2_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBSTerminalExpressionAccess().getMethodinvocationAssignment_6_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSTerminalExpression__Group_6_2__0__Impl"


    // $ANTLR start "rule__BSTerminalExpression__Group_6_2__1"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4076:1: rule__BSTerminalExpression__Group_6_2__1 : rule__BSTerminalExpression__Group_6_2__1__Impl rule__BSTerminalExpression__Group_6_2__2 ;
    public final void rule__BSTerminalExpression__Group_6_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4080:1: ( rule__BSTerminalExpression__Group_6_2__1__Impl rule__BSTerminalExpression__Group_6_2__2 )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4081:2: rule__BSTerminalExpression__Group_6_2__1__Impl rule__BSTerminalExpression__Group_6_2__2
            {
            pushFollow(FOLLOW_rule__BSTerminalExpression__Group_6_2__1__Impl_in_rule__BSTerminalExpression__Group_6_2__18149);
            rule__BSTerminalExpression__Group_6_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__BSTerminalExpression__Group_6_2__2_in_rule__BSTerminalExpression__Group_6_2__18152);
            rule__BSTerminalExpression__Group_6_2__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSTerminalExpression__Group_6_2__1"


    // $ANTLR start "rule__BSTerminalExpression__Group_6_2__1__Impl"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4088:1: rule__BSTerminalExpression__Group_6_2__1__Impl : ( ( rule__BSTerminalExpression__Group_6_2_1__0 )? ) ;
    public final void rule__BSTerminalExpression__Group_6_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4092:1: ( ( ( rule__BSTerminalExpression__Group_6_2_1__0 )? ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4093:1: ( ( rule__BSTerminalExpression__Group_6_2_1__0 )? )
            {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4093:1: ( ( rule__BSTerminalExpression__Group_6_2_1__0 )? )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4094:1: ( rule__BSTerminalExpression__Group_6_2_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBSTerminalExpressionAccess().getGroup_6_2_1()); 
            }
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4095:1: ( rule__BSTerminalExpression__Group_6_2_1__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( ((LA27_0>=RULE_ID && LA27_0<=RULE_INT)||(LA27_0>=14 && LA27_0<=15)||LA27_0==25||(LA27_0>=32 && LA27_0<=35)) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4095:2: rule__BSTerminalExpression__Group_6_2_1__0
                    {
                    pushFollow(FOLLOW_rule__BSTerminalExpression__Group_6_2_1__0_in_rule__BSTerminalExpression__Group_6_2__1__Impl8179);
                    rule__BSTerminalExpression__Group_6_2_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBSTerminalExpressionAccess().getGroup_6_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSTerminalExpression__Group_6_2__1__Impl"


    // $ANTLR start "rule__BSTerminalExpression__Group_6_2__2"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4105:1: rule__BSTerminalExpression__Group_6_2__2 : rule__BSTerminalExpression__Group_6_2__2__Impl ;
    public final void rule__BSTerminalExpression__Group_6_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4109:1: ( rule__BSTerminalExpression__Group_6_2__2__Impl )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4110:2: rule__BSTerminalExpression__Group_6_2__2__Impl
            {
            pushFollow(FOLLOW_rule__BSTerminalExpression__Group_6_2__2__Impl_in_rule__BSTerminalExpression__Group_6_2__28210);
            rule__BSTerminalExpression__Group_6_2__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSTerminalExpression__Group_6_2__2"


    // $ANTLR start "rule__BSTerminalExpression__Group_6_2__2__Impl"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4116:1: rule__BSTerminalExpression__Group_6_2__2__Impl : ( ')' ) ;
    public final void rule__BSTerminalExpression__Group_6_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4120:1: ( ( ')' ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4121:1: ( ')' )
            {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4121:1: ( ')' )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4122:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBSTerminalExpressionAccess().getRightParenthesisKeyword_6_2_2()); 
            }
            match(input,26,FOLLOW_26_in_rule__BSTerminalExpression__Group_6_2__2__Impl8238); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBSTerminalExpressionAccess().getRightParenthesisKeyword_6_2_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSTerminalExpression__Group_6_2__2__Impl"


    // $ANTLR start "rule__BSTerminalExpression__Group_6_2_1__0"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4141:1: rule__BSTerminalExpression__Group_6_2_1__0 : rule__BSTerminalExpression__Group_6_2_1__0__Impl rule__BSTerminalExpression__Group_6_2_1__1 ;
    public final void rule__BSTerminalExpression__Group_6_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4145:1: ( rule__BSTerminalExpression__Group_6_2_1__0__Impl rule__BSTerminalExpression__Group_6_2_1__1 )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4146:2: rule__BSTerminalExpression__Group_6_2_1__0__Impl rule__BSTerminalExpression__Group_6_2_1__1
            {
            pushFollow(FOLLOW_rule__BSTerminalExpression__Group_6_2_1__0__Impl_in_rule__BSTerminalExpression__Group_6_2_1__08275);
            rule__BSTerminalExpression__Group_6_2_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__BSTerminalExpression__Group_6_2_1__1_in_rule__BSTerminalExpression__Group_6_2_1__08278);
            rule__BSTerminalExpression__Group_6_2_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSTerminalExpression__Group_6_2_1__0"


    // $ANTLR start "rule__BSTerminalExpression__Group_6_2_1__0__Impl"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4153:1: rule__BSTerminalExpression__Group_6_2_1__0__Impl : ( ( rule__BSTerminalExpression__ArgsAssignment_6_2_1_0 ) ) ;
    public final void rule__BSTerminalExpression__Group_6_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4157:1: ( ( ( rule__BSTerminalExpression__ArgsAssignment_6_2_1_0 ) ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4158:1: ( ( rule__BSTerminalExpression__ArgsAssignment_6_2_1_0 ) )
            {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4158:1: ( ( rule__BSTerminalExpression__ArgsAssignment_6_2_1_0 ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4159:1: ( rule__BSTerminalExpression__ArgsAssignment_6_2_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBSTerminalExpressionAccess().getArgsAssignment_6_2_1_0()); 
            }
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4160:1: ( rule__BSTerminalExpression__ArgsAssignment_6_2_1_0 )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4160:2: rule__BSTerminalExpression__ArgsAssignment_6_2_1_0
            {
            pushFollow(FOLLOW_rule__BSTerminalExpression__ArgsAssignment_6_2_1_0_in_rule__BSTerminalExpression__Group_6_2_1__0__Impl8305);
            rule__BSTerminalExpression__ArgsAssignment_6_2_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBSTerminalExpressionAccess().getArgsAssignment_6_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSTerminalExpression__Group_6_2_1__0__Impl"


    // $ANTLR start "rule__BSTerminalExpression__Group_6_2_1__1"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4170:1: rule__BSTerminalExpression__Group_6_2_1__1 : rule__BSTerminalExpression__Group_6_2_1__1__Impl ;
    public final void rule__BSTerminalExpression__Group_6_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4174:1: ( rule__BSTerminalExpression__Group_6_2_1__1__Impl )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4175:2: rule__BSTerminalExpression__Group_6_2_1__1__Impl
            {
            pushFollow(FOLLOW_rule__BSTerminalExpression__Group_6_2_1__1__Impl_in_rule__BSTerminalExpression__Group_6_2_1__18335);
            rule__BSTerminalExpression__Group_6_2_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSTerminalExpression__Group_6_2_1__1"


    // $ANTLR start "rule__BSTerminalExpression__Group_6_2_1__1__Impl"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4181:1: rule__BSTerminalExpression__Group_6_2_1__1__Impl : ( ( rule__BSTerminalExpression__Group_6_2_1_1__0 )* ) ;
    public final void rule__BSTerminalExpression__Group_6_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4185:1: ( ( ( rule__BSTerminalExpression__Group_6_2_1_1__0 )* ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4186:1: ( ( rule__BSTerminalExpression__Group_6_2_1_1__0 )* )
            {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4186:1: ( ( rule__BSTerminalExpression__Group_6_2_1_1__0 )* )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4187:1: ( rule__BSTerminalExpression__Group_6_2_1_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBSTerminalExpressionAccess().getGroup_6_2_1_1()); 
            }
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4188:1: ( rule__BSTerminalExpression__Group_6_2_1_1__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==27) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4188:2: rule__BSTerminalExpression__Group_6_2_1_1__0
            	    {
            	    pushFollow(FOLLOW_rule__BSTerminalExpression__Group_6_2_1_1__0_in_rule__BSTerminalExpression__Group_6_2_1__1__Impl8362);
            	    rule__BSTerminalExpression__Group_6_2_1_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBSTerminalExpressionAccess().getGroup_6_2_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSTerminalExpression__Group_6_2_1__1__Impl"


    // $ANTLR start "rule__BSTerminalExpression__Group_6_2_1_1__0"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4202:1: rule__BSTerminalExpression__Group_6_2_1_1__0 : rule__BSTerminalExpression__Group_6_2_1_1__0__Impl rule__BSTerminalExpression__Group_6_2_1_1__1 ;
    public final void rule__BSTerminalExpression__Group_6_2_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4206:1: ( rule__BSTerminalExpression__Group_6_2_1_1__0__Impl rule__BSTerminalExpression__Group_6_2_1_1__1 )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4207:2: rule__BSTerminalExpression__Group_6_2_1_1__0__Impl rule__BSTerminalExpression__Group_6_2_1_1__1
            {
            pushFollow(FOLLOW_rule__BSTerminalExpression__Group_6_2_1_1__0__Impl_in_rule__BSTerminalExpression__Group_6_2_1_1__08397);
            rule__BSTerminalExpression__Group_6_2_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__BSTerminalExpression__Group_6_2_1_1__1_in_rule__BSTerminalExpression__Group_6_2_1_1__08400);
            rule__BSTerminalExpression__Group_6_2_1_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSTerminalExpression__Group_6_2_1_1__0"


    // $ANTLR start "rule__BSTerminalExpression__Group_6_2_1_1__0__Impl"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4214:1: rule__BSTerminalExpression__Group_6_2_1_1__0__Impl : ( ',' ) ;
    public final void rule__BSTerminalExpression__Group_6_2_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4218:1: ( ( ',' ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4219:1: ( ',' )
            {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4219:1: ( ',' )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4220:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBSTerminalExpressionAccess().getCommaKeyword_6_2_1_1_0()); 
            }
            match(input,27,FOLLOW_27_in_rule__BSTerminalExpression__Group_6_2_1_1__0__Impl8428); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBSTerminalExpressionAccess().getCommaKeyword_6_2_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSTerminalExpression__Group_6_2_1_1__0__Impl"


    // $ANTLR start "rule__BSTerminalExpression__Group_6_2_1_1__1"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4233:1: rule__BSTerminalExpression__Group_6_2_1_1__1 : rule__BSTerminalExpression__Group_6_2_1_1__1__Impl ;
    public final void rule__BSTerminalExpression__Group_6_2_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4237:1: ( rule__BSTerminalExpression__Group_6_2_1_1__1__Impl )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4238:2: rule__BSTerminalExpression__Group_6_2_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__BSTerminalExpression__Group_6_2_1_1__1__Impl_in_rule__BSTerminalExpression__Group_6_2_1_1__18459);
            rule__BSTerminalExpression__Group_6_2_1_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSTerminalExpression__Group_6_2_1_1__1"


    // $ANTLR start "rule__BSTerminalExpression__Group_6_2_1_1__1__Impl"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4244:1: rule__BSTerminalExpression__Group_6_2_1_1__1__Impl : ( ( rule__BSTerminalExpression__ArgsAssignment_6_2_1_1_1 ) ) ;
    public final void rule__BSTerminalExpression__Group_6_2_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4248:1: ( ( ( rule__BSTerminalExpression__ArgsAssignment_6_2_1_1_1 ) ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4249:1: ( ( rule__BSTerminalExpression__ArgsAssignment_6_2_1_1_1 ) )
            {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4249:1: ( ( rule__BSTerminalExpression__ArgsAssignment_6_2_1_1_1 ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4250:1: ( rule__BSTerminalExpression__ArgsAssignment_6_2_1_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBSTerminalExpressionAccess().getArgsAssignment_6_2_1_1_1()); 
            }
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4251:1: ( rule__BSTerminalExpression__ArgsAssignment_6_2_1_1_1 )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4251:2: rule__BSTerminalExpression__ArgsAssignment_6_2_1_1_1
            {
            pushFollow(FOLLOW_rule__BSTerminalExpression__ArgsAssignment_6_2_1_1_1_in_rule__BSTerminalExpression__Group_6_2_1_1__1__Impl8486);
            rule__BSTerminalExpression__ArgsAssignment_6_2_1_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBSTerminalExpressionAccess().getArgsAssignment_6_2_1_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSTerminalExpression__Group_6_2_1_1__1__Impl"


    // $ANTLR start "rule__BSTerminalExpression__Group_7__0"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4265:1: rule__BSTerminalExpression__Group_7__0 : rule__BSTerminalExpression__Group_7__0__Impl rule__BSTerminalExpression__Group_7__1 ;
    public final void rule__BSTerminalExpression__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4269:1: ( rule__BSTerminalExpression__Group_7__0__Impl rule__BSTerminalExpression__Group_7__1 )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4270:2: rule__BSTerminalExpression__Group_7__0__Impl rule__BSTerminalExpression__Group_7__1
            {
            pushFollow(FOLLOW_rule__BSTerminalExpression__Group_7__0__Impl_in_rule__BSTerminalExpression__Group_7__08520);
            rule__BSTerminalExpression__Group_7__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__BSTerminalExpression__Group_7__1_in_rule__BSTerminalExpression__Group_7__08523);
            rule__BSTerminalExpression__Group_7__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSTerminalExpression__Group_7__0"


    // $ANTLR start "rule__BSTerminalExpression__Group_7__0__Impl"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4277:1: rule__BSTerminalExpression__Group_7__0__Impl : ( () ) ;
    public final void rule__BSTerminalExpression__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4281:1: ( ( () ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4282:1: ( () )
            {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4282:1: ( () )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4283:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBSTerminalExpressionAccess().getBSNewAction_7_0()); 
            }
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4284:1: ()
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4286:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBSTerminalExpressionAccess().getBSNewAction_7_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSTerminalExpression__Group_7__0__Impl"


    // $ANTLR start "rule__BSTerminalExpression__Group_7__1"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4296:1: rule__BSTerminalExpression__Group_7__1 : rule__BSTerminalExpression__Group_7__1__Impl rule__BSTerminalExpression__Group_7__2 ;
    public final void rule__BSTerminalExpression__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4300:1: ( rule__BSTerminalExpression__Group_7__1__Impl rule__BSTerminalExpression__Group_7__2 )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4301:2: rule__BSTerminalExpression__Group_7__1__Impl rule__BSTerminalExpression__Group_7__2
            {
            pushFollow(FOLLOW_rule__BSTerminalExpression__Group_7__1__Impl_in_rule__BSTerminalExpression__Group_7__18581);
            rule__BSTerminalExpression__Group_7__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__BSTerminalExpression__Group_7__2_in_rule__BSTerminalExpression__Group_7__18584);
            rule__BSTerminalExpression__Group_7__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSTerminalExpression__Group_7__1"


    // $ANTLR start "rule__BSTerminalExpression__Group_7__1__Impl"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4308:1: rule__BSTerminalExpression__Group_7__1__Impl : ( 'new' ) ;
    public final void rule__BSTerminalExpression__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4312:1: ( ( 'new' ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4313:1: ( 'new' )
            {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4313:1: ( 'new' )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4314:1: 'new'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBSTerminalExpressionAccess().getNewKeyword_7_1()); 
            }
            match(input,35,FOLLOW_35_in_rule__BSTerminalExpression__Group_7__1__Impl8612); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBSTerminalExpressionAccess().getNewKeyword_7_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSTerminalExpression__Group_7__1__Impl"


    // $ANTLR start "rule__BSTerminalExpression__Group_7__2"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4327:1: rule__BSTerminalExpression__Group_7__2 : rule__BSTerminalExpression__Group_7__2__Impl rule__BSTerminalExpression__Group_7__3 ;
    public final void rule__BSTerminalExpression__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4331:1: ( rule__BSTerminalExpression__Group_7__2__Impl rule__BSTerminalExpression__Group_7__3 )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4332:2: rule__BSTerminalExpression__Group_7__2__Impl rule__BSTerminalExpression__Group_7__3
            {
            pushFollow(FOLLOW_rule__BSTerminalExpression__Group_7__2__Impl_in_rule__BSTerminalExpression__Group_7__28643);
            rule__BSTerminalExpression__Group_7__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__BSTerminalExpression__Group_7__3_in_rule__BSTerminalExpression__Group_7__28646);
            rule__BSTerminalExpression__Group_7__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSTerminalExpression__Group_7__2"


    // $ANTLR start "rule__BSTerminalExpression__Group_7__2__Impl"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4339:1: rule__BSTerminalExpression__Group_7__2__Impl : ( ( rule__BSTerminalExpression__TypeAssignment_7_2 ) ) ;
    public final void rule__BSTerminalExpression__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4343:1: ( ( ( rule__BSTerminalExpression__TypeAssignment_7_2 ) ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4344:1: ( ( rule__BSTerminalExpression__TypeAssignment_7_2 ) )
            {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4344:1: ( ( rule__BSTerminalExpression__TypeAssignment_7_2 ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4345:1: ( rule__BSTerminalExpression__TypeAssignment_7_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBSTerminalExpressionAccess().getTypeAssignment_7_2()); 
            }
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4346:1: ( rule__BSTerminalExpression__TypeAssignment_7_2 )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4346:2: rule__BSTerminalExpression__TypeAssignment_7_2
            {
            pushFollow(FOLLOW_rule__BSTerminalExpression__TypeAssignment_7_2_in_rule__BSTerminalExpression__Group_7__2__Impl8673);
            rule__BSTerminalExpression__TypeAssignment_7_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBSTerminalExpressionAccess().getTypeAssignment_7_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSTerminalExpression__Group_7__2__Impl"


    // $ANTLR start "rule__BSTerminalExpression__Group_7__3"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4356:1: rule__BSTerminalExpression__Group_7__3 : rule__BSTerminalExpression__Group_7__3__Impl rule__BSTerminalExpression__Group_7__4 ;
    public final void rule__BSTerminalExpression__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4360:1: ( rule__BSTerminalExpression__Group_7__3__Impl rule__BSTerminalExpression__Group_7__4 )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4361:2: rule__BSTerminalExpression__Group_7__3__Impl rule__BSTerminalExpression__Group_7__4
            {
            pushFollow(FOLLOW_rule__BSTerminalExpression__Group_7__3__Impl_in_rule__BSTerminalExpression__Group_7__38703);
            rule__BSTerminalExpression__Group_7__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__BSTerminalExpression__Group_7__4_in_rule__BSTerminalExpression__Group_7__38706);
            rule__BSTerminalExpression__Group_7__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSTerminalExpression__Group_7__3"


    // $ANTLR start "rule__BSTerminalExpression__Group_7__3__Impl"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4368:1: rule__BSTerminalExpression__Group_7__3__Impl : ( '(' ) ;
    public final void rule__BSTerminalExpression__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4372:1: ( ( '(' ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4373:1: ( '(' )
            {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4373:1: ( '(' )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4374:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBSTerminalExpressionAccess().getLeftParenthesisKeyword_7_3()); 
            }
            match(input,25,FOLLOW_25_in_rule__BSTerminalExpression__Group_7__3__Impl8734); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBSTerminalExpressionAccess().getLeftParenthesisKeyword_7_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSTerminalExpression__Group_7__3__Impl"


    // $ANTLR start "rule__BSTerminalExpression__Group_7__4"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4387:1: rule__BSTerminalExpression__Group_7__4 : rule__BSTerminalExpression__Group_7__4__Impl rule__BSTerminalExpression__Group_7__5 ;
    public final void rule__BSTerminalExpression__Group_7__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4391:1: ( rule__BSTerminalExpression__Group_7__4__Impl rule__BSTerminalExpression__Group_7__5 )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4392:2: rule__BSTerminalExpression__Group_7__4__Impl rule__BSTerminalExpression__Group_7__5
            {
            pushFollow(FOLLOW_rule__BSTerminalExpression__Group_7__4__Impl_in_rule__BSTerminalExpression__Group_7__48765);
            rule__BSTerminalExpression__Group_7__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__BSTerminalExpression__Group_7__5_in_rule__BSTerminalExpression__Group_7__48768);
            rule__BSTerminalExpression__Group_7__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSTerminalExpression__Group_7__4"


    // $ANTLR start "rule__BSTerminalExpression__Group_7__4__Impl"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4399:1: rule__BSTerminalExpression__Group_7__4__Impl : ( ( rule__BSTerminalExpression__Group_7_4__0 )? ) ;
    public final void rule__BSTerminalExpression__Group_7__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4403:1: ( ( ( rule__BSTerminalExpression__Group_7_4__0 )? ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4404:1: ( ( rule__BSTerminalExpression__Group_7_4__0 )? )
            {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4404:1: ( ( rule__BSTerminalExpression__Group_7_4__0 )? )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4405:1: ( rule__BSTerminalExpression__Group_7_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBSTerminalExpressionAccess().getGroup_7_4()); 
            }
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4406:1: ( rule__BSTerminalExpression__Group_7_4__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( ((LA29_0>=RULE_ID && LA29_0<=RULE_INT)||(LA29_0>=14 && LA29_0<=15)||LA29_0==25||(LA29_0>=32 && LA29_0<=35)) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4406:2: rule__BSTerminalExpression__Group_7_4__0
                    {
                    pushFollow(FOLLOW_rule__BSTerminalExpression__Group_7_4__0_in_rule__BSTerminalExpression__Group_7__4__Impl8795);
                    rule__BSTerminalExpression__Group_7_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBSTerminalExpressionAccess().getGroup_7_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSTerminalExpression__Group_7__4__Impl"


    // $ANTLR start "rule__BSTerminalExpression__Group_7__5"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4416:1: rule__BSTerminalExpression__Group_7__5 : rule__BSTerminalExpression__Group_7__5__Impl ;
    public final void rule__BSTerminalExpression__Group_7__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4420:1: ( rule__BSTerminalExpression__Group_7__5__Impl )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4421:2: rule__BSTerminalExpression__Group_7__5__Impl
            {
            pushFollow(FOLLOW_rule__BSTerminalExpression__Group_7__5__Impl_in_rule__BSTerminalExpression__Group_7__58826);
            rule__BSTerminalExpression__Group_7__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSTerminalExpression__Group_7__5"


    // $ANTLR start "rule__BSTerminalExpression__Group_7__5__Impl"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4427:1: rule__BSTerminalExpression__Group_7__5__Impl : ( ')' ) ;
    public final void rule__BSTerminalExpression__Group_7__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4431:1: ( ( ')' ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4432:1: ( ')' )
            {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4432:1: ( ')' )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4433:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBSTerminalExpressionAccess().getRightParenthesisKeyword_7_5()); 
            }
            match(input,26,FOLLOW_26_in_rule__BSTerminalExpression__Group_7__5__Impl8854); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBSTerminalExpressionAccess().getRightParenthesisKeyword_7_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSTerminalExpression__Group_7__5__Impl"


    // $ANTLR start "rule__BSTerminalExpression__Group_7_4__0"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4458:1: rule__BSTerminalExpression__Group_7_4__0 : rule__BSTerminalExpression__Group_7_4__0__Impl rule__BSTerminalExpression__Group_7_4__1 ;
    public final void rule__BSTerminalExpression__Group_7_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4462:1: ( rule__BSTerminalExpression__Group_7_4__0__Impl rule__BSTerminalExpression__Group_7_4__1 )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4463:2: rule__BSTerminalExpression__Group_7_4__0__Impl rule__BSTerminalExpression__Group_7_4__1
            {
            pushFollow(FOLLOW_rule__BSTerminalExpression__Group_7_4__0__Impl_in_rule__BSTerminalExpression__Group_7_4__08897);
            rule__BSTerminalExpression__Group_7_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__BSTerminalExpression__Group_7_4__1_in_rule__BSTerminalExpression__Group_7_4__08900);
            rule__BSTerminalExpression__Group_7_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSTerminalExpression__Group_7_4__0"


    // $ANTLR start "rule__BSTerminalExpression__Group_7_4__0__Impl"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4470:1: rule__BSTerminalExpression__Group_7_4__0__Impl : ( ( rule__BSTerminalExpression__ArgsAssignment_7_4_0 ) ) ;
    public final void rule__BSTerminalExpression__Group_7_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4474:1: ( ( ( rule__BSTerminalExpression__ArgsAssignment_7_4_0 ) ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4475:1: ( ( rule__BSTerminalExpression__ArgsAssignment_7_4_0 ) )
            {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4475:1: ( ( rule__BSTerminalExpression__ArgsAssignment_7_4_0 ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4476:1: ( rule__BSTerminalExpression__ArgsAssignment_7_4_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBSTerminalExpressionAccess().getArgsAssignment_7_4_0()); 
            }
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4477:1: ( rule__BSTerminalExpression__ArgsAssignment_7_4_0 )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4477:2: rule__BSTerminalExpression__ArgsAssignment_7_4_0
            {
            pushFollow(FOLLOW_rule__BSTerminalExpression__ArgsAssignment_7_4_0_in_rule__BSTerminalExpression__Group_7_4__0__Impl8927);
            rule__BSTerminalExpression__ArgsAssignment_7_4_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBSTerminalExpressionAccess().getArgsAssignment_7_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSTerminalExpression__Group_7_4__0__Impl"


    // $ANTLR start "rule__BSTerminalExpression__Group_7_4__1"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4487:1: rule__BSTerminalExpression__Group_7_4__1 : rule__BSTerminalExpression__Group_7_4__1__Impl ;
    public final void rule__BSTerminalExpression__Group_7_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4491:1: ( rule__BSTerminalExpression__Group_7_4__1__Impl )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4492:2: rule__BSTerminalExpression__Group_7_4__1__Impl
            {
            pushFollow(FOLLOW_rule__BSTerminalExpression__Group_7_4__1__Impl_in_rule__BSTerminalExpression__Group_7_4__18957);
            rule__BSTerminalExpression__Group_7_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSTerminalExpression__Group_7_4__1"


    // $ANTLR start "rule__BSTerminalExpression__Group_7_4__1__Impl"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4498:1: rule__BSTerminalExpression__Group_7_4__1__Impl : ( ( rule__BSTerminalExpression__Group_7_4_1__0 )* ) ;
    public final void rule__BSTerminalExpression__Group_7_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4502:1: ( ( ( rule__BSTerminalExpression__Group_7_4_1__0 )* ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4503:1: ( ( rule__BSTerminalExpression__Group_7_4_1__0 )* )
            {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4503:1: ( ( rule__BSTerminalExpression__Group_7_4_1__0 )* )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4504:1: ( rule__BSTerminalExpression__Group_7_4_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBSTerminalExpressionAccess().getGroup_7_4_1()); 
            }
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4505:1: ( rule__BSTerminalExpression__Group_7_4_1__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==27) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4505:2: rule__BSTerminalExpression__Group_7_4_1__0
            	    {
            	    pushFollow(FOLLOW_rule__BSTerminalExpression__Group_7_4_1__0_in_rule__BSTerminalExpression__Group_7_4__1__Impl8984);
            	    rule__BSTerminalExpression__Group_7_4_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBSTerminalExpressionAccess().getGroup_7_4_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSTerminalExpression__Group_7_4__1__Impl"


    // $ANTLR start "rule__BSTerminalExpression__Group_7_4_1__0"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4519:1: rule__BSTerminalExpression__Group_7_4_1__0 : rule__BSTerminalExpression__Group_7_4_1__0__Impl rule__BSTerminalExpression__Group_7_4_1__1 ;
    public final void rule__BSTerminalExpression__Group_7_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4523:1: ( rule__BSTerminalExpression__Group_7_4_1__0__Impl rule__BSTerminalExpression__Group_7_4_1__1 )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4524:2: rule__BSTerminalExpression__Group_7_4_1__0__Impl rule__BSTerminalExpression__Group_7_4_1__1
            {
            pushFollow(FOLLOW_rule__BSTerminalExpression__Group_7_4_1__0__Impl_in_rule__BSTerminalExpression__Group_7_4_1__09019);
            rule__BSTerminalExpression__Group_7_4_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__BSTerminalExpression__Group_7_4_1__1_in_rule__BSTerminalExpression__Group_7_4_1__09022);
            rule__BSTerminalExpression__Group_7_4_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSTerminalExpression__Group_7_4_1__0"


    // $ANTLR start "rule__BSTerminalExpression__Group_7_4_1__0__Impl"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4531:1: rule__BSTerminalExpression__Group_7_4_1__0__Impl : ( ',' ) ;
    public final void rule__BSTerminalExpression__Group_7_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4535:1: ( ( ',' ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4536:1: ( ',' )
            {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4536:1: ( ',' )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4537:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBSTerminalExpressionAccess().getCommaKeyword_7_4_1_0()); 
            }
            match(input,27,FOLLOW_27_in_rule__BSTerminalExpression__Group_7_4_1__0__Impl9050); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBSTerminalExpressionAccess().getCommaKeyword_7_4_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSTerminalExpression__Group_7_4_1__0__Impl"


    // $ANTLR start "rule__BSTerminalExpression__Group_7_4_1__1"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4550:1: rule__BSTerminalExpression__Group_7_4_1__1 : rule__BSTerminalExpression__Group_7_4_1__1__Impl ;
    public final void rule__BSTerminalExpression__Group_7_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4554:1: ( rule__BSTerminalExpression__Group_7_4_1__1__Impl )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4555:2: rule__BSTerminalExpression__Group_7_4_1__1__Impl
            {
            pushFollow(FOLLOW_rule__BSTerminalExpression__Group_7_4_1__1__Impl_in_rule__BSTerminalExpression__Group_7_4_1__19081);
            rule__BSTerminalExpression__Group_7_4_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSTerminalExpression__Group_7_4_1__1"


    // $ANTLR start "rule__BSTerminalExpression__Group_7_4_1__1__Impl"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4561:1: rule__BSTerminalExpression__Group_7_4_1__1__Impl : ( ( rule__BSTerminalExpression__ArgsAssignment_7_4_1_1 ) ) ;
    public final void rule__BSTerminalExpression__Group_7_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4565:1: ( ( ( rule__BSTerminalExpression__ArgsAssignment_7_4_1_1 ) ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4566:1: ( ( rule__BSTerminalExpression__ArgsAssignment_7_4_1_1 ) )
            {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4566:1: ( ( rule__BSTerminalExpression__ArgsAssignment_7_4_1_1 ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4567:1: ( rule__BSTerminalExpression__ArgsAssignment_7_4_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBSTerminalExpressionAccess().getArgsAssignment_7_4_1_1()); 
            }
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4568:1: ( rule__BSTerminalExpression__ArgsAssignment_7_4_1_1 )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4568:2: rule__BSTerminalExpression__ArgsAssignment_7_4_1_1
            {
            pushFollow(FOLLOW_rule__BSTerminalExpression__ArgsAssignment_7_4_1_1_in_rule__BSTerminalExpression__Group_7_4_1__1__Impl9108);
            rule__BSTerminalExpression__ArgsAssignment_7_4_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBSTerminalExpressionAccess().getArgsAssignment_7_4_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSTerminalExpression__Group_7_4_1__1__Impl"


    // $ANTLR start "rule__BSTerminalExpression__Group_8__0"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4582:1: rule__BSTerminalExpression__Group_8__0 : rule__BSTerminalExpression__Group_8__0__Impl rule__BSTerminalExpression__Group_8__1 ;
    public final void rule__BSTerminalExpression__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4586:1: ( rule__BSTerminalExpression__Group_8__0__Impl rule__BSTerminalExpression__Group_8__1 )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4587:2: rule__BSTerminalExpression__Group_8__0__Impl rule__BSTerminalExpression__Group_8__1
            {
            pushFollow(FOLLOW_rule__BSTerminalExpression__Group_8__0__Impl_in_rule__BSTerminalExpression__Group_8__09142);
            rule__BSTerminalExpression__Group_8__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__BSTerminalExpression__Group_8__1_in_rule__BSTerminalExpression__Group_8__09145);
            rule__BSTerminalExpression__Group_8__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSTerminalExpression__Group_8__0"


    // $ANTLR start "rule__BSTerminalExpression__Group_8__0__Impl"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4594:1: rule__BSTerminalExpression__Group_8__0__Impl : ( '(' ) ;
    public final void rule__BSTerminalExpression__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4598:1: ( ( '(' ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4599:1: ( '(' )
            {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4599:1: ( '(' )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4600:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBSTerminalExpressionAccess().getLeftParenthesisKeyword_8_0()); 
            }
            match(input,25,FOLLOW_25_in_rule__BSTerminalExpression__Group_8__0__Impl9173); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBSTerminalExpressionAccess().getLeftParenthesisKeyword_8_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSTerminalExpression__Group_8__0__Impl"


    // $ANTLR start "rule__BSTerminalExpression__Group_8__1"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4613:1: rule__BSTerminalExpression__Group_8__1 : rule__BSTerminalExpression__Group_8__1__Impl rule__BSTerminalExpression__Group_8__2 ;
    public final void rule__BSTerminalExpression__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4617:1: ( rule__BSTerminalExpression__Group_8__1__Impl rule__BSTerminalExpression__Group_8__2 )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4618:2: rule__BSTerminalExpression__Group_8__1__Impl rule__BSTerminalExpression__Group_8__2
            {
            pushFollow(FOLLOW_rule__BSTerminalExpression__Group_8__1__Impl_in_rule__BSTerminalExpression__Group_8__19204);
            rule__BSTerminalExpression__Group_8__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__BSTerminalExpression__Group_8__2_in_rule__BSTerminalExpression__Group_8__19207);
            rule__BSTerminalExpression__Group_8__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSTerminalExpression__Group_8__1"


    // $ANTLR start "rule__BSTerminalExpression__Group_8__1__Impl"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4625:1: rule__BSTerminalExpression__Group_8__1__Impl : ( ruleBSExpression ) ;
    public final void rule__BSTerminalExpression__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4629:1: ( ( ruleBSExpression ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4630:1: ( ruleBSExpression )
            {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4630:1: ( ruleBSExpression )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4631:1: ruleBSExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBSTerminalExpressionAccess().getBSExpressionParserRuleCall_8_1()); 
            }
            pushFollow(FOLLOW_ruleBSExpression_in_rule__BSTerminalExpression__Group_8__1__Impl9234);
            ruleBSExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBSTerminalExpressionAccess().getBSExpressionParserRuleCall_8_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSTerminalExpression__Group_8__1__Impl"


    // $ANTLR start "rule__BSTerminalExpression__Group_8__2"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4642:1: rule__BSTerminalExpression__Group_8__2 : rule__BSTerminalExpression__Group_8__2__Impl ;
    public final void rule__BSTerminalExpression__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4646:1: ( rule__BSTerminalExpression__Group_8__2__Impl )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4647:2: rule__BSTerminalExpression__Group_8__2__Impl
            {
            pushFollow(FOLLOW_rule__BSTerminalExpression__Group_8__2__Impl_in_rule__BSTerminalExpression__Group_8__29263);
            rule__BSTerminalExpression__Group_8__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSTerminalExpression__Group_8__2"


    // $ANTLR start "rule__BSTerminalExpression__Group_8__2__Impl"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4653:1: rule__BSTerminalExpression__Group_8__2__Impl : ( ')' ) ;
    public final void rule__BSTerminalExpression__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4657:1: ( ( ')' ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4658:1: ( ')' )
            {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4658:1: ( ')' )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4659:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBSTerminalExpressionAccess().getRightParenthesisKeyword_8_2()); 
            }
            match(input,26,FOLLOW_26_in_rule__BSTerminalExpression__Group_8__2__Impl9291); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBSTerminalExpressionAccess().getRightParenthesisKeyword_8_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSTerminalExpression__Group_8__2__Impl"


    // $ANTLR start "rule__BSFile__NameAssignment_0_1"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4679:1: rule__BSFile__NameAssignment_0_1 : ( ruleQualifiedName ) ;
    public final void rule__BSFile__NameAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4683:1: ( ( ruleQualifiedName ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4684:1: ( ruleQualifiedName )
            {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4684:1: ( ruleQualifiedName )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4685:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBSFileAccess().getNameQualifiedNameParserRuleCall_0_1_0()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__BSFile__NameAssignment_0_19333);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBSFileAccess().getNameQualifiedNameParserRuleCall_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSFile__NameAssignment_0_1"


    // $ANTLR start "rule__BSFile__ImportsAssignment_1"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4694:1: rule__BSFile__ImportsAssignment_1 : ( ruleBSImport ) ;
    public final void rule__BSFile__ImportsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4698:1: ( ( ruleBSImport ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4699:1: ( ruleBSImport )
            {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4699:1: ( ruleBSImport )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4700:1: ruleBSImport
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBSFileAccess().getImportsBSImportParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleBSImport_in_rule__BSFile__ImportsAssignment_19364);
            ruleBSImport();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBSFileAccess().getImportsBSImportParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSFile__ImportsAssignment_1"


    // $ANTLR start "rule__BSFile__ClassesAssignment_2"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4709:1: rule__BSFile__ClassesAssignment_2 : ( ruleBSClass ) ;
    public final void rule__BSFile__ClassesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4713:1: ( ( ruleBSClass ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4714:1: ( ruleBSClass )
            {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4714:1: ( ruleBSClass )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4715:1: ruleBSClass
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBSFileAccess().getClassesBSClassParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleBSClass_in_rule__BSFile__ClassesAssignment_29395);
            ruleBSClass();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBSFileAccess().getClassesBSClassParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSFile__ClassesAssignment_2"


    // $ANTLR start "rule__BSImport__ImportedNamespaceAssignment_1"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4724:1: rule__BSImport__ImportedNamespaceAssignment_1 : ( ruleQualifiedNameWithWildcard ) ;
    public final void rule__BSImport__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4728:1: ( ( ruleQualifiedNameWithWildcard ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4729:1: ( ruleQualifiedNameWithWildcard )
            {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4729:1: ( ruleQualifiedNameWithWildcard )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4730:1: ruleQualifiedNameWithWildcard
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBSImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_rule__BSImport__ImportedNamespaceAssignment_19426);
            ruleQualifiedNameWithWildcard();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBSImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSImport__ImportedNamespaceAssignment_1"


    // $ANTLR start "rule__BSClass__NameAssignment_1"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4739:1: rule__BSClass__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__BSClass__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4743:1: ( ( RULE_ID ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4744:1: ( RULE_ID )
            {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4744:1: ( RULE_ID )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4745:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBSClassAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__BSClass__NameAssignment_19457); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBSClassAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSClass__NameAssignment_1"


    // $ANTLR start "rule__BSClass__SuperclassAssignment_2_1"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4754:1: rule__BSClass__SuperclassAssignment_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__BSClass__SuperclassAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4758:1: ( ( ( ruleQualifiedName ) ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4759:1: ( ( ruleQualifiedName ) )
            {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4759:1: ( ( ruleQualifiedName ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4760:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBSClassAccess().getSuperclassBSClassCrossReference_2_1_0()); 
            }
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4761:1: ( ruleQualifiedName )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4762:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBSClassAccess().getSuperclassBSClassQualifiedNameParserRuleCall_2_1_0_1()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__BSClass__SuperclassAssignment_2_19492);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBSClassAccess().getSuperclassBSClassQualifiedNameParserRuleCall_2_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBSClassAccess().getSuperclassBSClassCrossReference_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSClass__SuperclassAssignment_2_1"


    // $ANTLR start "rule__BSClass__MembersAssignment_4"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4773:1: rule__BSClass__MembersAssignment_4 : ( ruleBSMember ) ;
    public final void rule__BSClass__MembersAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4777:1: ( ( ruleBSMember ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4778:1: ( ruleBSMember )
            {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4778:1: ( ruleBSMember )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4779:1: ruleBSMember
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBSClassAccess().getMembersBSMemberParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_ruleBSMember_in_rule__BSClass__MembersAssignment_49527);
            ruleBSMember();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBSClassAccess().getMembersBSMemberParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSClass__MembersAssignment_4"


    // $ANTLR start "rule__BSField__TypeAssignment_0"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4788:1: rule__BSField__TypeAssignment_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__BSField__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4792:1: ( ( ( ruleQualifiedName ) ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4793:1: ( ( ruleQualifiedName ) )
            {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4793:1: ( ( ruleQualifiedName ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4794:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBSFieldAccess().getTypeBSClassCrossReference_0_0()); 
            }
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4795:1: ( ruleQualifiedName )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4796:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBSFieldAccess().getTypeBSClassQualifiedNameParserRuleCall_0_0_1()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__BSField__TypeAssignment_09562);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBSFieldAccess().getTypeBSClassQualifiedNameParserRuleCall_0_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBSFieldAccess().getTypeBSClassCrossReference_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSField__TypeAssignment_0"


    // $ANTLR start "rule__BSField__NameAssignment_1"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4807:1: rule__BSField__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__BSField__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4811:1: ( ( RULE_ID ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4812:1: ( RULE_ID )
            {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4812:1: ( RULE_ID )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4813:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBSFieldAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__BSField__NameAssignment_19597); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBSFieldAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSField__NameAssignment_1"


    // $ANTLR start "rule__BSMethod__TypeAssignment_0"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4822:1: rule__BSMethod__TypeAssignment_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__BSMethod__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4826:1: ( ( ( ruleQualifiedName ) ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4827:1: ( ( ruleQualifiedName ) )
            {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4827:1: ( ( ruleQualifiedName ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4828:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBSMethodAccess().getTypeBSClassCrossReference_0_0()); 
            }
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4829:1: ( ruleQualifiedName )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4830:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBSMethodAccess().getTypeBSClassQualifiedNameParserRuleCall_0_0_1()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__BSMethod__TypeAssignment_09632);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBSMethodAccess().getTypeBSClassQualifiedNameParserRuleCall_0_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBSMethodAccess().getTypeBSClassCrossReference_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSMethod__TypeAssignment_0"


    // $ANTLR start "rule__BSMethod__NameAssignment_1"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4841:1: rule__BSMethod__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__BSMethod__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4845:1: ( ( RULE_ID ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4846:1: ( RULE_ID )
            {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4846:1: ( RULE_ID )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4847:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBSMethodAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__BSMethod__NameAssignment_19667); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBSMethodAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSMethod__NameAssignment_1"


    // $ANTLR start "rule__BSMethod__ParamsAssignment_3_0"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4856:1: rule__BSMethod__ParamsAssignment_3_0 : ( ruleBSParameter ) ;
    public final void rule__BSMethod__ParamsAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4860:1: ( ( ruleBSParameter ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4861:1: ( ruleBSParameter )
            {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4861:1: ( ruleBSParameter )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4862:1: ruleBSParameter
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBSMethodAccess().getParamsBSParameterParserRuleCall_3_0_0()); 
            }
            pushFollow(FOLLOW_ruleBSParameter_in_rule__BSMethod__ParamsAssignment_3_09698);
            ruleBSParameter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBSMethodAccess().getParamsBSParameterParserRuleCall_3_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSMethod__ParamsAssignment_3_0"


    // $ANTLR start "rule__BSMethod__ParamsAssignment_3_1_1"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4871:1: rule__BSMethod__ParamsAssignment_3_1_1 : ( ruleBSParameter ) ;
    public final void rule__BSMethod__ParamsAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4875:1: ( ( ruleBSParameter ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4876:1: ( ruleBSParameter )
            {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4876:1: ( ruleBSParameter )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4877:1: ruleBSParameter
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBSMethodAccess().getParamsBSParameterParserRuleCall_3_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleBSParameter_in_rule__BSMethod__ParamsAssignment_3_1_19729);
            ruleBSParameter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBSMethodAccess().getParamsBSParameterParserRuleCall_3_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSMethod__ParamsAssignment_3_1_1"


    // $ANTLR start "rule__BSMethod__BodyAssignment_5"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4886:1: rule__BSMethod__BodyAssignment_5 : ( ruleBSMethodBody ) ;
    public final void rule__BSMethod__BodyAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4890:1: ( ( ruleBSMethodBody ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4891:1: ( ruleBSMethodBody )
            {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4891:1: ( ruleBSMethodBody )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4892:1: ruleBSMethodBody
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBSMethodAccess().getBodyBSMethodBodyParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_ruleBSMethodBody_in_rule__BSMethod__BodyAssignment_59760);
            ruleBSMethodBody();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBSMethodAccess().getBodyBSMethodBodyParserRuleCall_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSMethod__BodyAssignment_5"


    // $ANTLR start "rule__BSParameter__TypeAssignment_0"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4901:1: rule__BSParameter__TypeAssignment_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__BSParameter__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4905:1: ( ( ( ruleQualifiedName ) ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4906:1: ( ( ruleQualifiedName ) )
            {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4906:1: ( ( ruleQualifiedName ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4907:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBSParameterAccess().getTypeBSClassCrossReference_0_0()); 
            }
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4908:1: ( ruleQualifiedName )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4909:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBSParameterAccess().getTypeBSClassQualifiedNameParserRuleCall_0_0_1()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__BSParameter__TypeAssignment_09795);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBSParameterAccess().getTypeBSClassQualifiedNameParserRuleCall_0_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBSParameterAccess().getTypeBSClassCrossReference_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSParameter__TypeAssignment_0"


    // $ANTLR start "rule__BSParameter__NameAssignment_1"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4920:1: rule__BSParameter__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__BSParameter__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4924:1: ( ( RULE_ID ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4925:1: ( RULE_ID )
            {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4925:1: ( RULE_ID )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4926:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBSParameterAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__BSParameter__NameAssignment_19830); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBSParameterAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSParameter__NameAssignment_1"


    // $ANTLR start "rule__BSMethodBody__StatementsAssignment_2"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4935:1: rule__BSMethodBody__StatementsAssignment_2 : ( ruleBSStatement ) ;
    public final void rule__BSMethodBody__StatementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4939:1: ( ( ruleBSStatement ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4940:1: ( ruleBSStatement )
            {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4940:1: ( ruleBSStatement )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4941:1: ruleBSStatement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBSMethodBodyAccess().getStatementsBSStatementParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleBSStatement_in_rule__BSMethodBody__StatementsAssignment_29861);
            ruleBSStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBSMethodBodyAccess().getStatementsBSStatementParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSMethodBody__StatementsAssignment_2"


    // $ANTLR start "rule__BSReturn__ExpressionAssignment_1"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4950:1: rule__BSReturn__ExpressionAssignment_1 : ( ruleBSExpression ) ;
    public final void rule__BSReturn__ExpressionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4954:1: ( ( ruleBSExpression ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4955:1: ( ruleBSExpression )
            {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4955:1: ( ruleBSExpression )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4956:1: ruleBSExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBSReturnAccess().getExpressionBSExpressionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleBSExpression_in_rule__BSReturn__ExpressionAssignment_19892);
            ruleBSExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBSReturnAccess().getExpressionBSExpressionParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSReturn__ExpressionAssignment_1"


    // $ANTLR start "rule__BSVariableDeclaration__TypeAssignment_0"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4965:1: rule__BSVariableDeclaration__TypeAssignment_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__BSVariableDeclaration__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4969:1: ( ( ( ruleQualifiedName ) ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4970:1: ( ( ruleQualifiedName ) )
            {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4970:1: ( ( ruleQualifiedName ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4971:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBSVariableDeclarationAccess().getTypeBSClassCrossReference_0_0()); 
            }
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4972:1: ( ruleQualifiedName )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4973:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBSVariableDeclarationAccess().getTypeBSClassQualifiedNameParserRuleCall_0_0_1()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__BSVariableDeclaration__TypeAssignment_09927);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBSVariableDeclarationAccess().getTypeBSClassQualifiedNameParserRuleCall_0_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBSVariableDeclarationAccess().getTypeBSClassCrossReference_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSVariableDeclaration__TypeAssignment_0"


    // $ANTLR start "rule__BSVariableDeclaration__NameAssignment_1"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4984:1: rule__BSVariableDeclaration__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__BSVariableDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4988:1: ( ( RULE_ID ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4989:1: ( RULE_ID )
            {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4989:1: ( RULE_ID )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4990:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBSVariableDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__BSVariableDeclaration__NameAssignment_19962); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBSVariableDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSVariableDeclaration__NameAssignment_1"


    // $ANTLR start "rule__BSVariableDeclaration__ExpressionAssignment_2_1"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:4999:1: rule__BSVariableDeclaration__ExpressionAssignment_2_1 : ( ruleBSExpression ) ;
    public final void rule__BSVariableDeclaration__ExpressionAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:5003:1: ( ( ruleBSExpression ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:5004:1: ( ruleBSExpression )
            {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:5004:1: ( ruleBSExpression )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:5005:1: ruleBSExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBSVariableDeclarationAccess().getExpressionBSExpressionParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleBSExpression_in_rule__BSVariableDeclaration__ExpressionAssignment_2_19993);
            ruleBSExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBSVariableDeclarationAccess().getExpressionBSExpressionParserRuleCall_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSVariableDeclaration__ExpressionAssignment_2_1"


    // $ANTLR start "rule__BSIfStatement__ExpressionAssignment_2"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:5014:1: rule__BSIfStatement__ExpressionAssignment_2 : ( ruleBSExpression ) ;
    public final void rule__BSIfStatement__ExpressionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:5018:1: ( ( ruleBSExpression ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:5019:1: ( ruleBSExpression )
            {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:5019:1: ( ruleBSExpression )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:5020:1: ruleBSExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBSIfStatementAccess().getExpressionBSExpressionParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleBSExpression_in_rule__BSIfStatement__ExpressionAssignment_210024);
            ruleBSExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBSIfStatementAccess().getExpressionBSExpressionParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSIfStatement__ExpressionAssignment_2"


    // $ANTLR start "rule__BSIfStatement__ThenBlockAssignment_4"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:5029:1: rule__BSIfStatement__ThenBlockAssignment_4 : ( ruleBSIfBlock ) ;
    public final void rule__BSIfStatement__ThenBlockAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:5033:1: ( ( ruleBSIfBlock ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:5034:1: ( ruleBSIfBlock )
            {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:5034:1: ( ruleBSIfBlock )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:5035:1: ruleBSIfBlock
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBSIfStatementAccess().getThenBlockBSIfBlockParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_ruleBSIfBlock_in_rule__BSIfStatement__ThenBlockAssignment_410055);
            ruleBSIfBlock();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBSIfStatementAccess().getThenBlockBSIfBlockParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSIfStatement__ThenBlockAssignment_4"


    // $ANTLR start "rule__BSIfStatement__ElseBlockAssignment_5_1"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:5044:1: rule__BSIfStatement__ElseBlockAssignment_5_1 : ( ruleBSIfBlock ) ;
    public final void rule__BSIfStatement__ElseBlockAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:5048:1: ( ( ruleBSIfBlock ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:5049:1: ( ruleBSIfBlock )
            {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:5049:1: ( ruleBSIfBlock )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:5050:1: ruleBSIfBlock
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBSIfStatementAccess().getElseBlockBSIfBlockParserRuleCall_5_1_0()); 
            }
            pushFollow(FOLLOW_ruleBSIfBlock_in_rule__BSIfStatement__ElseBlockAssignment_5_110086);
            ruleBSIfBlock();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBSIfStatementAccess().getElseBlockBSIfBlockParserRuleCall_5_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSIfStatement__ElseBlockAssignment_5_1"


    // $ANTLR start "rule__BSIfBlock__StatementsAssignment_0"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:5059:1: rule__BSIfBlock__StatementsAssignment_0 : ( ruleBSStatement ) ;
    public final void rule__BSIfBlock__StatementsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:5063:1: ( ( ruleBSStatement ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:5064:1: ( ruleBSStatement )
            {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:5064:1: ( ruleBSStatement )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:5065:1: ruleBSStatement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBSIfBlockAccess().getStatementsBSStatementParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleBSStatement_in_rule__BSIfBlock__StatementsAssignment_010117);
            ruleBSStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBSIfBlockAccess().getStatementsBSStatementParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSIfBlock__StatementsAssignment_0"


    // $ANTLR start "rule__BSIfBlock__StatementsAssignment_1_1"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:5074:1: rule__BSIfBlock__StatementsAssignment_1_1 : ( ruleBSStatement ) ;
    public final void rule__BSIfBlock__StatementsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:5078:1: ( ( ruleBSStatement ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:5079:1: ( ruleBSStatement )
            {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:5079:1: ( ruleBSStatement )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:5080:1: ruleBSStatement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBSIfBlockAccess().getStatementsBSStatementParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleBSStatement_in_rule__BSIfBlock__StatementsAssignment_1_110148);
            ruleBSStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBSIfBlockAccess().getStatementsBSStatementParserRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSIfBlock__StatementsAssignment_1_1"


    // $ANTLR start "rule__BSAssignment__RightAssignment_1_2"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:5089:1: rule__BSAssignment__RightAssignment_1_2 : ( ruleBSExpression ) ;
    public final void rule__BSAssignment__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:5093:1: ( ( ruleBSExpression ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:5094:1: ( ruleBSExpression )
            {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:5094:1: ( ruleBSExpression )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:5095:1: ruleBSExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBSAssignmentAccess().getRightBSExpressionParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_ruleBSExpression_in_rule__BSAssignment__RightAssignment_1_210179);
            ruleBSExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBSAssignmentAccess().getRightBSExpressionParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSAssignment__RightAssignment_1_2"


    // $ANTLR start "rule__BSCastingExpression__CastTypeAssignment_1"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:5104:1: rule__BSCastingExpression__CastTypeAssignment_1 : ( ( rule__BSCastingExpression__CastTypeAlternatives_1_0 ) ) ;
    public final void rule__BSCastingExpression__CastTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:5108:1: ( ( ( rule__BSCastingExpression__CastTypeAlternatives_1_0 ) ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:5109:1: ( ( rule__BSCastingExpression__CastTypeAlternatives_1_0 ) )
            {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:5109:1: ( ( rule__BSCastingExpression__CastTypeAlternatives_1_0 ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:5110:1: ( rule__BSCastingExpression__CastTypeAlternatives_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBSCastingExpressionAccess().getCastTypeAlternatives_1_0()); 
            }
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:5111:1: ( rule__BSCastingExpression__CastTypeAlternatives_1_0 )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:5111:2: rule__BSCastingExpression__CastTypeAlternatives_1_0
            {
            pushFollow(FOLLOW_rule__BSCastingExpression__CastTypeAlternatives_1_0_in_rule__BSCastingExpression__CastTypeAssignment_110210);
            rule__BSCastingExpression__CastTypeAlternatives_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBSCastingExpressionAccess().getCastTypeAlternatives_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSCastingExpression__CastTypeAssignment_1"


    // $ANTLR start "rule__BSCastingExpression__CastExprAssignment_3"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:5120:1: rule__BSCastingExpression__CastExprAssignment_3 : ( ruleBSSelectionExpression ) ;
    public final void rule__BSCastingExpression__CastExprAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:5124:1: ( ( ruleBSSelectionExpression ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:5125:1: ( ruleBSSelectionExpression )
            {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:5125:1: ( ruleBSSelectionExpression )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:5126:1: ruleBSSelectionExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBSCastingExpressionAccess().getCastExprBSSelectionExpressionParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleBSSelectionExpression_in_rule__BSCastingExpression__CastExprAssignment_310243);
            ruleBSSelectionExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBSCastingExpressionAccess().getCastExprBSSelectionExpressionParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSCastingExpression__CastExprAssignment_3"


    // $ANTLR start "rule__BSSelectionExpression__MemberAssignment_1_2"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:5135:1: rule__BSSelectionExpression__MemberAssignment_1_2 : ( ( RULE_ID ) ) ;
    public final void rule__BSSelectionExpression__MemberAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:5139:1: ( ( ( RULE_ID ) ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:5140:1: ( ( RULE_ID ) )
            {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:5140:1: ( ( RULE_ID ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:5141:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBSSelectionExpressionAccess().getMemberBSMemberCrossReference_1_2_0()); 
            }
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:5142:1: ( RULE_ID )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:5143:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBSSelectionExpressionAccess().getMemberBSMemberIDTerminalRuleCall_1_2_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__BSSelectionExpression__MemberAssignment_1_210278); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBSSelectionExpressionAccess().getMemberBSMemberIDTerminalRuleCall_1_2_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBSSelectionExpressionAccess().getMemberBSMemberCrossReference_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSSelectionExpression__MemberAssignment_1_2"


    // $ANTLR start "rule__BSSelectionExpression__MethodinvocationAssignment_1_3_0"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:5154:1: rule__BSSelectionExpression__MethodinvocationAssignment_1_3_0 : ( ( '(' ) ) ;
    public final void rule__BSSelectionExpression__MethodinvocationAssignment_1_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:5158:1: ( ( ( '(' ) ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:5159:1: ( ( '(' ) )
            {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:5159:1: ( ( '(' ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:5160:1: ( '(' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBSSelectionExpressionAccess().getMethodinvocationLeftParenthesisKeyword_1_3_0_0()); 
            }
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:5161:1: ( '(' )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:5162:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBSSelectionExpressionAccess().getMethodinvocationLeftParenthesisKeyword_1_3_0_0()); 
            }
            match(input,25,FOLLOW_25_in_rule__BSSelectionExpression__MethodinvocationAssignment_1_3_010318); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBSSelectionExpressionAccess().getMethodinvocationLeftParenthesisKeyword_1_3_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBSSelectionExpressionAccess().getMethodinvocationLeftParenthesisKeyword_1_3_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSSelectionExpression__MethodinvocationAssignment_1_3_0"


    // $ANTLR start "rule__BSSelectionExpression__ArgsAssignment_1_3_1_0"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:5177:1: rule__BSSelectionExpression__ArgsAssignment_1_3_1_0 : ( ruleBSExpression ) ;
    public final void rule__BSSelectionExpression__ArgsAssignment_1_3_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:5181:1: ( ( ruleBSExpression ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:5182:1: ( ruleBSExpression )
            {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:5182:1: ( ruleBSExpression )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:5183:1: ruleBSExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBSSelectionExpressionAccess().getArgsBSExpressionParserRuleCall_1_3_1_0_0()); 
            }
            pushFollow(FOLLOW_ruleBSExpression_in_rule__BSSelectionExpression__ArgsAssignment_1_3_1_010357);
            ruleBSExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBSSelectionExpressionAccess().getArgsBSExpressionParserRuleCall_1_3_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSSelectionExpression__ArgsAssignment_1_3_1_0"


    // $ANTLR start "rule__BSSelectionExpression__ArgsAssignment_1_3_1_1_1"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:5192:1: rule__BSSelectionExpression__ArgsAssignment_1_3_1_1_1 : ( ruleBSExpression ) ;
    public final void rule__BSSelectionExpression__ArgsAssignment_1_3_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:5196:1: ( ( ruleBSExpression ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:5197:1: ( ruleBSExpression )
            {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:5197:1: ( ruleBSExpression )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:5198:1: ruleBSExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBSSelectionExpressionAccess().getArgsBSExpressionParserRuleCall_1_3_1_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleBSExpression_in_rule__BSSelectionExpression__ArgsAssignment_1_3_1_1_110388);
            ruleBSExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBSSelectionExpressionAccess().getArgsBSExpressionParserRuleCall_1_3_1_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSSelectionExpression__ArgsAssignment_1_3_1_1_1"


    // $ANTLR start "rule__BSTerminalExpression__ValueAssignment_0_1"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:5207:1: rule__BSTerminalExpression__ValueAssignment_0_1 : ( RULE_STRING ) ;
    public final void rule__BSTerminalExpression__ValueAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:5211:1: ( ( RULE_STRING ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:5212:1: ( RULE_STRING )
            {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:5212:1: ( RULE_STRING )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:5213:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBSTerminalExpressionAccess().getValueSTRINGTerminalRuleCall_0_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__BSTerminalExpression__ValueAssignment_0_110419); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBSTerminalExpressionAccess().getValueSTRINGTerminalRuleCall_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSTerminalExpression__ValueAssignment_0_1"


    // $ANTLR start "rule__BSTerminalExpression__ValueAssignment_1_1"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:5222:1: rule__BSTerminalExpression__ValueAssignment_1_1 : ( RULE_INT ) ;
    public final void rule__BSTerminalExpression__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:5226:1: ( ( RULE_INT ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:5227:1: ( RULE_INT )
            {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:5227:1: ( RULE_INT )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:5228:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBSTerminalExpressionAccess().getValueINTTerminalRuleCall_1_1_0()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__BSTerminalExpression__ValueAssignment_1_110450); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBSTerminalExpressionAccess().getValueINTTerminalRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSTerminalExpression__ValueAssignment_1_1"


    // $ANTLR start "rule__BSTerminalExpression__ValueAssignment_2_1"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:5237:1: rule__BSTerminalExpression__ValueAssignment_2_1 : ( ( rule__BSTerminalExpression__ValueAlternatives_2_1_0 ) ) ;
    public final void rule__BSTerminalExpression__ValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:5241:1: ( ( ( rule__BSTerminalExpression__ValueAlternatives_2_1_0 ) ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:5242:1: ( ( rule__BSTerminalExpression__ValueAlternatives_2_1_0 ) )
            {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:5242:1: ( ( rule__BSTerminalExpression__ValueAlternatives_2_1_0 ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:5243:1: ( rule__BSTerminalExpression__ValueAlternatives_2_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBSTerminalExpressionAccess().getValueAlternatives_2_1_0()); 
            }
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:5244:1: ( rule__BSTerminalExpression__ValueAlternatives_2_1_0 )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:5244:2: rule__BSTerminalExpression__ValueAlternatives_2_1_0
            {
            pushFollow(FOLLOW_rule__BSTerminalExpression__ValueAlternatives_2_1_0_in_rule__BSTerminalExpression__ValueAssignment_2_110481);
            rule__BSTerminalExpression__ValueAlternatives_2_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBSTerminalExpressionAccess().getValueAlternatives_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSTerminalExpression__ValueAssignment_2_1"


    // $ANTLR start "rule__BSTerminalExpression__SymbolAssignment_6_1"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:5253:1: rule__BSTerminalExpression__SymbolAssignment_6_1 : ( ( RULE_ID ) ) ;
    public final void rule__BSTerminalExpression__SymbolAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:5257:1: ( ( ( RULE_ID ) ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:5258:1: ( ( RULE_ID ) )
            {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:5258:1: ( ( RULE_ID ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:5259:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBSTerminalExpressionAccess().getSymbolBSSymbolCrossReference_6_1_0()); 
            }
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:5260:1: ( RULE_ID )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:5261:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBSTerminalExpressionAccess().getSymbolBSSymbolIDTerminalRuleCall_6_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__BSTerminalExpression__SymbolAssignment_6_110518); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBSTerminalExpressionAccess().getSymbolBSSymbolIDTerminalRuleCall_6_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBSTerminalExpressionAccess().getSymbolBSSymbolCrossReference_6_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSTerminalExpression__SymbolAssignment_6_1"


    // $ANTLR start "rule__BSTerminalExpression__MethodinvocationAssignment_6_2_0"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:5272:1: rule__BSTerminalExpression__MethodinvocationAssignment_6_2_0 : ( ( '(' ) ) ;
    public final void rule__BSTerminalExpression__MethodinvocationAssignment_6_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:5276:1: ( ( ( '(' ) ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:5277:1: ( ( '(' ) )
            {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:5277:1: ( ( '(' ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:5278:1: ( '(' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBSTerminalExpressionAccess().getMethodinvocationLeftParenthesisKeyword_6_2_0_0()); 
            }
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:5279:1: ( '(' )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:5280:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBSTerminalExpressionAccess().getMethodinvocationLeftParenthesisKeyword_6_2_0_0()); 
            }
            match(input,25,FOLLOW_25_in_rule__BSTerminalExpression__MethodinvocationAssignment_6_2_010558); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBSTerminalExpressionAccess().getMethodinvocationLeftParenthesisKeyword_6_2_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBSTerminalExpressionAccess().getMethodinvocationLeftParenthesisKeyword_6_2_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSTerminalExpression__MethodinvocationAssignment_6_2_0"


    // $ANTLR start "rule__BSTerminalExpression__ArgsAssignment_6_2_1_0"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:5295:1: rule__BSTerminalExpression__ArgsAssignment_6_2_1_0 : ( ruleBSExpression ) ;
    public final void rule__BSTerminalExpression__ArgsAssignment_6_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:5299:1: ( ( ruleBSExpression ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:5300:1: ( ruleBSExpression )
            {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:5300:1: ( ruleBSExpression )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:5301:1: ruleBSExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBSTerminalExpressionAccess().getArgsBSExpressionParserRuleCall_6_2_1_0_0()); 
            }
            pushFollow(FOLLOW_ruleBSExpression_in_rule__BSTerminalExpression__ArgsAssignment_6_2_1_010597);
            ruleBSExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBSTerminalExpressionAccess().getArgsBSExpressionParserRuleCall_6_2_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSTerminalExpression__ArgsAssignment_6_2_1_0"


    // $ANTLR start "rule__BSTerminalExpression__ArgsAssignment_6_2_1_1_1"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:5310:1: rule__BSTerminalExpression__ArgsAssignment_6_2_1_1_1 : ( ruleBSExpression ) ;
    public final void rule__BSTerminalExpression__ArgsAssignment_6_2_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:5314:1: ( ( ruleBSExpression ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:5315:1: ( ruleBSExpression )
            {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:5315:1: ( ruleBSExpression )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:5316:1: ruleBSExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBSTerminalExpressionAccess().getArgsBSExpressionParserRuleCall_6_2_1_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleBSExpression_in_rule__BSTerminalExpression__ArgsAssignment_6_2_1_1_110628);
            ruleBSExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBSTerminalExpressionAccess().getArgsBSExpressionParserRuleCall_6_2_1_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSTerminalExpression__ArgsAssignment_6_2_1_1_1"


    // $ANTLR start "rule__BSTerminalExpression__TypeAssignment_7_2"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:5325:1: rule__BSTerminalExpression__TypeAssignment_7_2 : ( ( ruleQualifiedName ) ) ;
    public final void rule__BSTerminalExpression__TypeAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:5329:1: ( ( ( ruleQualifiedName ) ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:5330:1: ( ( ruleQualifiedName ) )
            {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:5330:1: ( ( ruleQualifiedName ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:5331:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBSTerminalExpressionAccess().getTypeBSClassCrossReference_7_2_0()); 
            }
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:5332:1: ( ruleQualifiedName )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:5333:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBSTerminalExpressionAccess().getTypeBSClassQualifiedNameParserRuleCall_7_2_0_1()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__BSTerminalExpression__TypeAssignment_7_210663);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBSTerminalExpressionAccess().getTypeBSClassQualifiedNameParserRuleCall_7_2_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBSTerminalExpressionAccess().getTypeBSClassCrossReference_7_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSTerminalExpression__TypeAssignment_7_2"


    // $ANTLR start "rule__BSTerminalExpression__ArgsAssignment_7_4_0"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:5344:1: rule__BSTerminalExpression__ArgsAssignment_7_4_0 : ( ruleBSExpression ) ;
    public final void rule__BSTerminalExpression__ArgsAssignment_7_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:5348:1: ( ( ruleBSExpression ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:5349:1: ( ruleBSExpression )
            {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:5349:1: ( ruleBSExpression )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:5350:1: ruleBSExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBSTerminalExpressionAccess().getArgsBSExpressionParserRuleCall_7_4_0_0()); 
            }
            pushFollow(FOLLOW_ruleBSExpression_in_rule__BSTerminalExpression__ArgsAssignment_7_4_010698);
            ruleBSExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBSTerminalExpressionAccess().getArgsBSExpressionParserRuleCall_7_4_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSTerminalExpression__ArgsAssignment_7_4_0"


    // $ANTLR start "rule__BSTerminalExpression__ArgsAssignment_7_4_1_1"
    // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:5359:1: rule__BSTerminalExpression__ArgsAssignment_7_4_1_1 : ( ruleBSExpression ) ;
    public final void rule__BSTerminalExpression__ArgsAssignment_7_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:5363:1: ( ( ruleBSExpression ) )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:5364:1: ( ruleBSExpression )
            {
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:5364:1: ( ruleBSExpression )
            // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:5365:1: ruleBSExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBSTerminalExpressionAccess().getArgsBSExpressionParserRuleCall_7_4_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleBSExpression_in_rule__BSTerminalExpression__ArgsAssignment_7_4_1_110729);
            ruleBSExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBSTerminalExpressionAccess().getArgsBSExpressionParserRuleCall_7_4_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BSTerminalExpression__ArgsAssignment_7_4_1_1"

    // $ANTLR start synpred29_InternalBlorqueScript
    public final void synpred29_InternalBlorqueScript_fragment() throws RecognitionException {   
        // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2691:2: ( rule__BSIfStatement__Group_5__0 )
        // ../org.example.blorquescript.ui/src-gen/org/xtext/example/blorquescript/ui/contentassist/antlr/internal/InternalBlorqueScript.g:2691:2: rule__BSIfStatement__Group_5__0
        {
        pushFollow(FOLLOW_rule__BSIfStatement__Group_5__0_in_synpred29_InternalBlorqueScript5436);
        rule__BSIfStatement__Group_5__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred29_InternalBlorqueScript

    // Delegated rules

    public final boolean synpred29_InternalBlorqueScript() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred29_InternalBlorqueScript_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA1 dfa1 = new DFA1(this);
    protected DFA2 dfa2 = new DFA2(this);
    static final String DFA1_eotS =
        "\7\uffff";
    static final String DFA1_eofS =
        "\7\uffff";
    static final String DFA1_minS =
        "\3\4\1\21\1\4\2\uffff";
    static final String DFA1_maxS =
        "\1\4\1\24\1\4\1\31\1\24\2\uffff";
    static final String DFA1_acceptS =
        "\5\uffff\1\2\1\1";
    static final String DFA1_specialS =
        "\7\uffff}>";
    static final String[] DFA1_transitionS = {
            "\1\1",
            "\1\3\17\uffff\1\2",
            "\1\4",
            "\1\6\7\uffff\1\5",
            "\1\3\17\uffff\1\2",
            "",
            ""
    };

    static final short[] DFA1_eot = DFA.unpackEncodedString(DFA1_eotS);
    static final short[] DFA1_eof = DFA.unpackEncodedString(DFA1_eofS);
    static final char[] DFA1_min = DFA.unpackEncodedStringToUnsignedChars(DFA1_minS);
    static final char[] DFA1_max = DFA.unpackEncodedStringToUnsignedChars(DFA1_maxS);
    static final short[] DFA1_accept = DFA.unpackEncodedString(DFA1_acceptS);
    static final short[] DFA1_special = DFA.unpackEncodedString(DFA1_specialS);
    static final short[][] DFA1_transition;

    static {
        int numStates = DFA1_transitionS.length;
        DFA1_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA1_transition[i] = DFA.unpackEncodedString(DFA1_transitionS[i]);
        }
    }

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = DFA1_eot;
            this.eof = DFA1_eof;
            this.min = DFA1_min;
            this.max = DFA1_max;
            this.accept = DFA1_accept;
            this.special = DFA1_special;
            this.transition = DFA1_transition;
        }
        public String getDescription() {
            return "625:1: rule__BSMember__Alternatives : ( ( ruleBSField ) | ( ruleBSMethod ) );";
        }
    }
    static final String DFA2_eotS =
        "\10\uffff";
    static final String DFA2_eofS =
        "\10\uffff";
    static final String DFA2_minS =
        "\2\4\3\uffff\1\4\1\uffff\1\4";
    static final String DFA2_maxS =
        "\1\43\1\35\3\uffff\1\4\1\uffff\1\35";
    static final String DFA2_acceptS =
        "\2\uffff\1\2\1\3\1\4\1\uffff\1\1\1\uffff";
    static final String DFA2_specialS =
        "\10\uffff}>";
    static final String[] DFA2_transitionS = {
            "\1\1\2\3\7\uffff\2\3\11\uffff\1\3\2\uffff\1\2\1\uffff\1\4\1"+
            "\uffff\4\3",
            "\1\6\14\uffff\1\3\2\uffff\1\5\4\uffff\1\3\3\uffff\1\3",
            "",
            "",
            "",
            "\1\7",
            "",
            "\1\6\14\uffff\1\3\2\uffff\1\5\4\uffff\1\3\3\uffff\1\3"
    };

    static final short[] DFA2_eot = DFA.unpackEncodedString(DFA2_eotS);
    static final short[] DFA2_eof = DFA.unpackEncodedString(DFA2_eofS);
    static final char[] DFA2_min = DFA.unpackEncodedStringToUnsignedChars(DFA2_minS);
    static final char[] DFA2_max = DFA.unpackEncodedStringToUnsignedChars(DFA2_maxS);
    static final short[] DFA2_accept = DFA.unpackEncodedString(DFA2_acceptS);
    static final short[] DFA2_special = DFA.unpackEncodedString(DFA2_specialS);
    static final short[][] DFA2_transition;

    static {
        int numStates = DFA2_transitionS.length;
        DFA2_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA2_transition[i] = DFA.unpackEncodedString(DFA2_transitionS[i]);
        }
    }

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = DFA2_eot;
            this.eof = DFA2_eof;
            this.min = DFA2_min;
            this.max = DFA2_max;
            this.accept = DFA2_accept;
            this.special = DFA2_special;
            this.transition = DFA2_transition;
        }
        public String getDescription() {
            return "647:1: rule__BSStatement__Alternatives : ( ( ruleBSVariableDeclaration ) | ( ruleBSReturn ) | ( ( rule__BSStatement__Group_2__0 ) ) | ( ruleBSIfStatement ) );";
        }
    }
 

    public static final BitSet FOLLOW_ruleBSFile_in_entryRuleBSFile67 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBSFile74 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BSFile__Group__0_in_ruleBSFile100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBSImport_in_entryRuleBSImport127 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBSImport134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BSImport__Group__0_in_ruleBSImport160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard187 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcard__Group__0_in_ruleQualifiedNameWithWildcard220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName247 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBSClass_in_entryRuleBSClass307 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBSClass314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BSClass__Group__0_in_ruleBSClass340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBSMember_in_entryRuleBSMember367 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBSMember374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BSMember__Alternatives_in_ruleBSMember400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBSField_in_entryRuleBSField427 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBSField434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BSField__Group__0_in_ruleBSField460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBSMethod_in_entryRuleBSMethod487 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBSMethod494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BSMethod__Group__0_in_ruleBSMethod520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBSParameter_in_entryRuleBSParameter547 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBSParameter554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BSParameter__Group__0_in_ruleBSParameter580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBSMethodBody_in_entryRuleBSMethodBody607 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBSMethodBody614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BSMethodBody__Group__0_in_ruleBSMethodBody640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBSStatement_in_entryRuleBSStatement667 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBSStatement674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BSStatement__Alternatives_in_ruleBSStatement700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBSReturn_in_entryRuleBSReturn727 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBSReturn734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BSReturn__Group__0_in_ruleBSReturn760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBSVariableDeclaration_in_entryRuleBSVariableDeclaration787 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBSVariableDeclaration794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BSVariableDeclaration__Group__0_in_ruleBSVariableDeclaration820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBSIfStatement_in_entryRuleBSIfStatement847 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBSIfStatement854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BSIfStatement__Group__0_in_ruleBSIfStatement880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBSIfBlock_in_entryRuleBSIfBlock907 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBSIfBlock914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BSIfBlock__Alternatives_in_ruleBSIfBlock940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBSExpression_in_entryRuleBSExpression971 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBSExpression978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBSAssignment_in_ruleBSExpression1004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBSAssignment_in_entryRuleBSAssignment1030 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBSAssignment1037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BSAssignment__Group__0_in_ruleBSAssignment1063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBSCastingExpression_in_entryRuleBSCastingExpression1090 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBSCastingExpression1097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BSCastingExpression__Group__0_in_ruleBSCastingExpression1123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBSSelectionExpression_in_entryRuleBSSelectionExpression1150 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBSSelectionExpression1157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BSSelectionExpression__Group__0_in_ruleBSSelectionExpression1183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBSTerminalExpression_in_entryRuleBSTerminalExpression1210 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBSTerminalExpression1217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BSTerminalExpression__Alternatives_in_ruleBSTerminalExpression1243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBSField_in_rule__BSMember__Alternatives1279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBSMethod_in_rule__BSMember__Alternatives1296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBSVariableDeclaration_in_rule__BSStatement__Alternatives1328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBSReturn_in_rule__BSStatement__Alternatives1345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BSStatement__Group_2__0_in_rule__BSStatement__Alternatives1362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBSIfStatement_in_rule__BSStatement__Alternatives1380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BSIfBlock__StatementsAssignment_0_in_rule__BSIfBlock__Alternatives1412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BSIfBlock__Group_1__0_in_rule__BSIfBlock__Alternatives1430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBSCastingExpression_in_rule__BSAssignment__Alternatives_01465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBSSelectionExpression_in_rule__BSAssignment__Alternatives_01482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__BSCastingExpression__CastTypeAlternatives_1_01515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__BSCastingExpression__CastTypeAlternatives_1_01535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__BSCastingExpression__CastTypeAlternatives_1_01555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BSTerminalExpression__Group_0__0_in_rule__BSTerminalExpression__Alternatives1589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BSTerminalExpression__Group_1__0_in_rule__BSTerminalExpression__Alternatives1607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BSTerminalExpression__Group_2__0_in_rule__BSTerminalExpression__Alternatives1625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BSTerminalExpression__Group_3__0_in_rule__BSTerminalExpression__Alternatives1643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BSTerminalExpression__Group_4__0_in_rule__BSTerminalExpression__Alternatives1661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BSTerminalExpression__Group_5__0_in_rule__BSTerminalExpression__Alternatives1679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BSTerminalExpression__Group_6__0_in_rule__BSTerminalExpression__Alternatives1697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BSTerminalExpression__Group_7__0_in_rule__BSTerminalExpression__Alternatives1715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BSTerminalExpression__Group_8__0_in_rule__BSTerminalExpression__Alternatives1733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__BSTerminalExpression__ValueAlternatives_2_1_01767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__BSTerminalExpression__ValueAlternatives_2_1_01787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BSFile__Group__0__Impl_in_rule__BSFile__Group__01819 = new BitSet(new long[]{0x0000000000240000L});
    public static final BitSet FOLLOW_rule__BSFile__Group__1_in_rule__BSFile__Group__01822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BSFile__Group_0__0_in_rule__BSFile__Group__0__Impl1849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BSFile__Group__1__Impl_in_rule__BSFile__Group__11880 = new BitSet(new long[]{0x0000000000240000L});
    public static final BitSet FOLLOW_rule__BSFile__Group__2_in_rule__BSFile__Group__11883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BSFile__ImportsAssignment_1_in_rule__BSFile__Group__1__Impl1910 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_rule__BSFile__Group__2__Impl_in_rule__BSFile__Group__21941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BSFile__ClassesAssignment_2_in_rule__BSFile__Group__2__Impl1968 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__BSFile__Group_0__0__Impl_in_rule__BSFile__Group_0__02005 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__BSFile__Group_0__1_in_rule__BSFile__Group_0__02008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__BSFile__Group_0__0__Impl2036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BSFile__Group_0__1__Impl_in_rule__BSFile__Group_0__12067 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__BSFile__Group_0__2_in_rule__BSFile__Group_0__12070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BSFile__NameAssignment_0_1_in_rule__BSFile__Group_0__1__Impl2097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BSFile__Group_0__2__Impl_in_rule__BSFile__Group_0__22127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__BSFile__Group_0__2__Impl2155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BSImport__Group__0__Impl_in_rule__BSImport__Group__02192 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__BSImport__Group__1_in_rule__BSImport__Group__02195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__BSImport__Group__0__Impl2223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BSImport__Group__1__Impl_in_rule__BSImport__Group__12254 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__BSImport__Group__2_in_rule__BSImport__Group__12257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BSImport__ImportedNamespaceAssignment_1_in_rule__BSImport__Group__1__Impl2284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BSImport__Group__2__Impl_in_rule__BSImport__Group__22314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__BSImport__Group__2__Impl2342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcard__Group__0__Impl_in_rule__QualifiedNameWithWildcard__Group__02379 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcard__Group__1_in_rule__QualifiedNameWithWildcard__Group__02382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__QualifiedNameWithWildcard__Group__0__Impl2409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcard__Group__1__Impl_in_rule__QualifiedNameWithWildcard__Group__12438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__QualifiedNameWithWildcard__Group__1__Impl2467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__02504 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__02507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl2534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__12563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl2590 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__02625 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__02628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__QualifiedName__Group_1__0__Impl2656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__12687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl2714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BSClass__Group__0__Impl_in_rule__BSClass__Group__02747 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__BSClass__Group__1_in_rule__BSClass__Group__02750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__BSClass__Group__0__Impl2778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BSClass__Group__1__Impl_in_rule__BSClass__Group__12809 = new BitSet(new long[]{0x0000000001400000L});
    public static final BitSet FOLLOW_rule__BSClass__Group__2_in_rule__BSClass__Group__12812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BSClass__NameAssignment_1_in_rule__BSClass__Group__1__Impl2839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BSClass__Group__2__Impl_in_rule__BSClass__Group__22869 = new BitSet(new long[]{0x0000000001400000L});
    public static final BitSet FOLLOW_rule__BSClass__Group__3_in_rule__BSClass__Group__22872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BSClass__Group_2__0_in_rule__BSClass__Group__2__Impl2899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BSClass__Group__3__Impl_in_rule__BSClass__Group__32930 = new BitSet(new long[]{0x0000000000800010L});
    public static final BitSet FOLLOW_rule__BSClass__Group__4_in_rule__BSClass__Group__32933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__BSClass__Group__3__Impl2961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BSClass__Group__4__Impl_in_rule__BSClass__Group__42992 = new BitSet(new long[]{0x0000000000800010L});
    public static final BitSet FOLLOW_rule__BSClass__Group__5_in_rule__BSClass__Group__42995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BSClass__MembersAssignment_4_in_rule__BSClass__Group__4__Impl3022 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__BSClass__Group__5__Impl_in_rule__BSClass__Group__53053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__BSClass__Group__5__Impl3081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BSClass__Group_2__0__Impl_in_rule__BSClass__Group_2__03124 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__BSClass__Group_2__1_in_rule__BSClass__Group_2__03127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__BSClass__Group_2__0__Impl3155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BSClass__Group_2__1__Impl_in_rule__BSClass__Group_2__13186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BSClass__SuperclassAssignment_2_1_in_rule__BSClass__Group_2__1__Impl3213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BSField__Group__0__Impl_in_rule__BSField__Group__03247 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__BSField__Group__1_in_rule__BSField__Group__03250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BSField__TypeAssignment_0_in_rule__BSField__Group__0__Impl3277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BSField__Group__1__Impl_in_rule__BSField__Group__13307 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__BSField__Group__2_in_rule__BSField__Group__13310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BSField__NameAssignment_1_in_rule__BSField__Group__1__Impl3337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BSField__Group__2__Impl_in_rule__BSField__Group__23367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__BSField__Group__2__Impl3395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BSMethod__Group__0__Impl_in_rule__BSMethod__Group__03432 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__BSMethod__Group__1_in_rule__BSMethod__Group__03435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BSMethod__TypeAssignment_0_in_rule__BSMethod__Group__0__Impl3462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BSMethod__Group__1__Impl_in_rule__BSMethod__Group__13492 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__BSMethod__Group__2_in_rule__BSMethod__Group__13495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BSMethod__NameAssignment_1_in_rule__BSMethod__Group__1__Impl3522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BSMethod__Group__2__Impl_in_rule__BSMethod__Group__23552 = new BitSet(new long[]{0x0000000004000010L});
    public static final BitSet FOLLOW_rule__BSMethod__Group__3_in_rule__BSMethod__Group__23555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__BSMethod__Group__2__Impl3583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BSMethod__Group__3__Impl_in_rule__BSMethod__Group__33614 = new BitSet(new long[]{0x0000000004000010L});
    public static final BitSet FOLLOW_rule__BSMethod__Group__4_in_rule__BSMethod__Group__33617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BSMethod__Group_3__0_in_rule__BSMethod__Group__3__Impl3644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BSMethod__Group__4__Impl_in_rule__BSMethod__Group__43675 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__BSMethod__Group__5_in_rule__BSMethod__Group__43678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__BSMethod__Group__4__Impl3706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BSMethod__Group__5__Impl_in_rule__BSMethod__Group__53737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BSMethod__BodyAssignment_5_in_rule__BSMethod__Group__5__Impl3764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BSMethod__Group_3__0__Impl_in_rule__BSMethod__Group_3__03806 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__BSMethod__Group_3__1_in_rule__BSMethod__Group_3__03809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BSMethod__ParamsAssignment_3_0_in_rule__BSMethod__Group_3__0__Impl3836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BSMethod__Group_3__1__Impl_in_rule__BSMethod__Group_3__13866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BSMethod__Group_3_1__0_in_rule__BSMethod__Group_3__1__Impl3893 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_rule__BSMethod__Group_3_1__0__Impl_in_rule__BSMethod__Group_3_1__03928 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__BSMethod__Group_3_1__1_in_rule__BSMethod__Group_3_1__03931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__BSMethod__Group_3_1__0__Impl3959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BSMethod__Group_3_1__1__Impl_in_rule__BSMethod__Group_3_1__13990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BSMethod__ParamsAssignment_3_1_1_in_rule__BSMethod__Group_3_1__1__Impl4017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BSParameter__Group__0__Impl_in_rule__BSParameter__Group__04051 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__BSParameter__Group__1_in_rule__BSParameter__Group__04054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BSParameter__TypeAssignment_0_in_rule__BSParameter__Group__0__Impl4081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BSParameter__Group__1__Impl_in_rule__BSParameter__Group__14111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BSParameter__NameAssignment_1_in_rule__BSParameter__Group__1__Impl4138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BSMethodBody__Group__0__Impl_in_rule__BSMethodBody__Group__04172 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__BSMethodBody__Group__1_in_rule__BSMethodBody__Group__04175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BSMethodBody__Group__1__Impl_in_rule__BSMethodBody__Group__14233 = new BitSet(new long[]{0x0000000F5280C070L});
    public static final BitSet FOLLOW_rule__BSMethodBody__Group__2_in_rule__BSMethodBody__Group__14236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__BSMethodBody__Group__1__Impl4264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BSMethodBody__Group__2__Impl_in_rule__BSMethodBody__Group__24295 = new BitSet(new long[]{0x0000000F5280C070L});
    public static final BitSet FOLLOW_rule__BSMethodBody__Group__3_in_rule__BSMethodBody__Group__24298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BSMethodBody__StatementsAssignment_2_in_rule__BSMethodBody__Group__2__Impl4325 = new BitSet(new long[]{0x0000000F5200C072L});
    public static final BitSet FOLLOW_rule__BSMethodBody__Group__3__Impl_in_rule__BSMethodBody__Group__34356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__BSMethodBody__Group__3__Impl4384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BSStatement__Group_2__0__Impl_in_rule__BSStatement__Group_2__04423 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__BSStatement__Group_2__1_in_rule__BSStatement__Group_2__04426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBSExpression_in_rule__BSStatement__Group_2__0__Impl4453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BSStatement__Group_2__1__Impl_in_rule__BSStatement__Group_2__14482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__BSStatement__Group_2__1__Impl4510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BSReturn__Group__0__Impl_in_rule__BSReturn__Group__04545 = new BitSet(new long[]{0x0000000F0200C070L});
    public static final BitSet FOLLOW_rule__BSReturn__Group__1_in_rule__BSReturn__Group__04548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__BSReturn__Group__0__Impl4576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BSReturn__Group__1__Impl_in_rule__BSReturn__Group__14607 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__BSReturn__Group__2_in_rule__BSReturn__Group__14610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BSReturn__ExpressionAssignment_1_in_rule__BSReturn__Group__1__Impl4637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BSReturn__Group__2__Impl_in_rule__BSReturn__Group__24667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__BSReturn__Group__2__Impl4695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BSVariableDeclaration__Group__0__Impl_in_rule__BSVariableDeclaration__Group__04732 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__BSVariableDeclaration__Group__1_in_rule__BSVariableDeclaration__Group__04735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BSVariableDeclaration__TypeAssignment_0_in_rule__BSVariableDeclaration__Group__0__Impl4762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BSVariableDeclaration__Group__1__Impl_in_rule__BSVariableDeclaration__Group__14792 = new BitSet(new long[]{0x0000000020020000L});
    public static final BitSet FOLLOW_rule__BSVariableDeclaration__Group__2_in_rule__BSVariableDeclaration__Group__14795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BSVariableDeclaration__NameAssignment_1_in_rule__BSVariableDeclaration__Group__1__Impl4822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BSVariableDeclaration__Group__2__Impl_in_rule__BSVariableDeclaration__Group__24852 = new BitSet(new long[]{0x0000000020020000L});
    public static final BitSet FOLLOW_rule__BSVariableDeclaration__Group__3_in_rule__BSVariableDeclaration__Group__24855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BSVariableDeclaration__Group_2__0_in_rule__BSVariableDeclaration__Group__2__Impl4882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BSVariableDeclaration__Group__3__Impl_in_rule__BSVariableDeclaration__Group__34913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__BSVariableDeclaration__Group__3__Impl4941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BSVariableDeclaration__Group_2__0__Impl_in_rule__BSVariableDeclaration__Group_2__04980 = new BitSet(new long[]{0x0000000F0200C070L});
    public static final BitSet FOLLOW_rule__BSVariableDeclaration__Group_2__1_in_rule__BSVariableDeclaration__Group_2__04983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__BSVariableDeclaration__Group_2__0__Impl5011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BSVariableDeclaration__Group_2__1__Impl_in_rule__BSVariableDeclaration__Group_2__15042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BSVariableDeclaration__ExpressionAssignment_2_1_in_rule__BSVariableDeclaration__Group_2__1__Impl5069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BSIfStatement__Group__0__Impl_in_rule__BSIfStatement__Group__05103 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__BSIfStatement__Group__1_in_rule__BSIfStatement__Group__05106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__BSIfStatement__Group__0__Impl5134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BSIfStatement__Group__1__Impl_in_rule__BSIfStatement__Group__15165 = new BitSet(new long[]{0x0000000F0200C070L});
    public static final BitSet FOLLOW_rule__BSIfStatement__Group__2_in_rule__BSIfStatement__Group__15168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__BSIfStatement__Group__1__Impl5196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BSIfStatement__Group__2__Impl_in_rule__BSIfStatement__Group__25227 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__BSIfStatement__Group__3_in_rule__BSIfStatement__Group__25230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BSIfStatement__ExpressionAssignment_2_in_rule__BSIfStatement__Group__2__Impl5257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BSIfStatement__Group__3__Impl_in_rule__BSIfStatement__Group__35287 = new BitSet(new long[]{0x0000000F5240C070L});
    public static final BitSet FOLLOW_rule__BSIfStatement__Group__4_in_rule__BSIfStatement__Group__35290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__BSIfStatement__Group__3__Impl5318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BSIfStatement__Group__4__Impl_in_rule__BSIfStatement__Group__45349 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__BSIfStatement__Group__5_in_rule__BSIfStatement__Group__45352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BSIfStatement__ThenBlockAssignment_4_in_rule__BSIfStatement__Group__4__Impl5379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BSIfStatement__Group__5__Impl_in_rule__BSIfStatement__Group__55409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BSIfStatement__Group_5__0_in_rule__BSIfStatement__Group__5__Impl5436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BSIfStatement__Group_5__0__Impl_in_rule__BSIfStatement__Group_5__05479 = new BitSet(new long[]{0x0000000F5240C070L});
    public static final BitSet FOLLOW_rule__BSIfStatement__Group_5__1_in_rule__BSIfStatement__Group_5__05482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__BSIfStatement__Group_5__0__Impl5511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BSIfStatement__Group_5__1__Impl_in_rule__BSIfStatement__Group_5__15543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BSIfStatement__ElseBlockAssignment_5_1_in_rule__BSIfStatement__Group_5__1__Impl5570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BSIfBlock__Group_1__0__Impl_in_rule__BSIfBlock__Group_1__05604 = new BitSet(new long[]{0x0000000F5200C070L});
    public static final BitSet FOLLOW_rule__BSIfBlock__Group_1__1_in_rule__BSIfBlock__Group_1__05607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__BSIfBlock__Group_1__0__Impl5635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BSIfBlock__Group_1__1__Impl_in_rule__BSIfBlock__Group_1__15666 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__BSIfBlock__Group_1__2_in_rule__BSIfBlock__Group_1__15669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BSIfBlock__StatementsAssignment_1_1_in_rule__BSIfBlock__Group_1__1__Impl5698 = new BitSet(new long[]{0x0000000F5200C072L});
    public static final BitSet FOLLOW_rule__BSIfBlock__StatementsAssignment_1_1_in_rule__BSIfBlock__Group_1__1__Impl5710 = new BitSet(new long[]{0x0000000F5200C072L});
    public static final BitSet FOLLOW_rule__BSIfBlock__Group_1__2__Impl_in_rule__BSIfBlock__Group_1__25743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__BSIfBlock__Group_1__2__Impl5771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BSAssignment__Group__0__Impl_in_rule__BSAssignment__Group__05808 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__BSAssignment__Group__1_in_rule__BSAssignment__Group__05811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BSAssignment__Alternatives_0_in_rule__BSAssignment__Group__0__Impl5838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BSAssignment__Group__1__Impl_in_rule__BSAssignment__Group__15868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BSAssignment__Group_1__0_in_rule__BSAssignment__Group__1__Impl5895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BSAssignment__Group_1__0__Impl_in_rule__BSAssignment__Group_1__05930 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__BSAssignment__Group_1__1_in_rule__BSAssignment__Group_1__05933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BSAssignment__Group_1__1__Impl_in_rule__BSAssignment__Group_1__15991 = new BitSet(new long[]{0x0000000F0200C070L});
    public static final BitSet FOLLOW_rule__BSAssignment__Group_1__2_in_rule__BSAssignment__Group_1__15994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__BSAssignment__Group_1__1__Impl6022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BSAssignment__Group_1__2__Impl_in_rule__BSAssignment__Group_1__26053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BSAssignment__RightAssignment_1_2_in_rule__BSAssignment__Group_1__2__Impl6080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BSCastingExpression__Group__0__Impl_in_rule__BSCastingExpression__Group__06116 = new BitSet(new long[]{0x0000000000003800L});
    public static final BitSet FOLLOW_rule__BSCastingExpression__Group__1_in_rule__BSCastingExpression__Group__06119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__BSCastingExpression__Group__0__Impl6147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BSCastingExpression__Group__1__Impl_in_rule__BSCastingExpression__Group__16178 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__BSCastingExpression__Group__2_in_rule__BSCastingExpression__Group__16181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BSCastingExpression__CastTypeAssignment_1_in_rule__BSCastingExpression__Group__1__Impl6208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BSCastingExpression__Group__2__Impl_in_rule__BSCastingExpression__Group__26238 = new BitSet(new long[]{0x0000000F0200C070L});
    public static final BitSet FOLLOW_rule__BSCastingExpression__Group__3_in_rule__BSCastingExpression__Group__26241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__BSCastingExpression__Group__2__Impl6269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BSCastingExpression__Group__3__Impl_in_rule__BSCastingExpression__Group__36300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BSCastingExpression__CastExprAssignment_3_in_rule__BSCastingExpression__Group__3__Impl6327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BSSelectionExpression__Group__0__Impl_in_rule__BSSelectionExpression__Group__06365 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__BSSelectionExpression__Group__1_in_rule__BSSelectionExpression__Group__06368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBSTerminalExpression_in_rule__BSSelectionExpression__Group__0__Impl6395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BSSelectionExpression__Group__1__Impl_in_rule__BSSelectionExpression__Group__16424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BSSelectionExpression__Group_1__0_in_rule__BSSelectionExpression__Group__1__Impl6451 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_rule__BSSelectionExpression__Group_1__0__Impl_in_rule__BSSelectionExpression__Group_1__06486 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__BSSelectionExpression__Group_1__1_in_rule__BSSelectionExpression__Group_1__06489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BSSelectionExpression__Group_1__1__Impl_in_rule__BSSelectionExpression__Group_1__16547 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__BSSelectionExpression__Group_1__2_in_rule__BSSelectionExpression__Group_1__16550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__BSSelectionExpression__Group_1__1__Impl6578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BSSelectionExpression__Group_1__2__Impl_in_rule__BSSelectionExpression__Group_1__26609 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__BSSelectionExpression__Group_1__3_in_rule__BSSelectionExpression__Group_1__26612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BSSelectionExpression__MemberAssignment_1_2_in_rule__BSSelectionExpression__Group_1__2__Impl6639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BSSelectionExpression__Group_1__3__Impl_in_rule__BSSelectionExpression__Group_1__36669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BSSelectionExpression__Group_1_3__0_in_rule__BSSelectionExpression__Group_1__3__Impl6696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BSSelectionExpression__Group_1_3__0__Impl_in_rule__BSSelectionExpression__Group_1_3__06735 = new BitSet(new long[]{0x0000000F0600C070L});
    public static final BitSet FOLLOW_rule__BSSelectionExpression__Group_1_3__1_in_rule__BSSelectionExpression__Group_1_3__06738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BSSelectionExpression__MethodinvocationAssignment_1_3_0_in_rule__BSSelectionExpression__Group_1_3__0__Impl6765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BSSelectionExpression__Group_1_3__1__Impl_in_rule__BSSelectionExpression__Group_1_3__16795 = new BitSet(new long[]{0x0000000F0600C070L});
    public static final BitSet FOLLOW_rule__BSSelectionExpression__Group_1_3__2_in_rule__BSSelectionExpression__Group_1_3__16798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BSSelectionExpression__Group_1_3_1__0_in_rule__BSSelectionExpression__Group_1_3__1__Impl6825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BSSelectionExpression__Group_1_3__2__Impl_in_rule__BSSelectionExpression__Group_1_3__26856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__BSSelectionExpression__Group_1_3__2__Impl6884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BSSelectionExpression__Group_1_3_1__0__Impl_in_rule__BSSelectionExpression__Group_1_3_1__06921 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__BSSelectionExpression__Group_1_3_1__1_in_rule__BSSelectionExpression__Group_1_3_1__06924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BSSelectionExpression__ArgsAssignment_1_3_1_0_in_rule__BSSelectionExpression__Group_1_3_1__0__Impl6951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BSSelectionExpression__Group_1_3_1__1__Impl_in_rule__BSSelectionExpression__Group_1_3_1__16981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BSSelectionExpression__Group_1_3_1_1__0_in_rule__BSSelectionExpression__Group_1_3_1__1__Impl7008 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_rule__BSSelectionExpression__Group_1_3_1_1__0__Impl_in_rule__BSSelectionExpression__Group_1_3_1_1__07043 = new BitSet(new long[]{0x0000000F0200C070L});
    public static final BitSet FOLLOW_rule__BSSelectionExpression__Group_1_3_1_1__1_in_rule__BSSelectionExpression__Group_1_3_1_1__07046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__BSSelectionExpression__Group_1_3_1_1__0__Impl7074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BSSelectionExpression__Group_1_3_1_1__1__Impl_in_rule__BSSelectionExpression__Group_1_3_1_1__17105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BSSelectionExpression__ArgsAssignment_1_3_1_1_1_in_rule__BSSelectionExpression__Group_1_3_1_1__1__Impl7132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BSTerminalExpression__Group_0__0__Impl_in_rule__BSTerminalExpression__Group_0__07166 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__BSTerminalExpression__Group_0__1_in_rule__BSTerminalExpression__Group_0__07169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BSTerminalExpression__Group_0__1__Impl_in_rule__BSTerminalExpression__Group_0__17227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BSTerminalExpression__ValueAssignment_0_1_in_rule__BSTerminalExpression__Group_0__1__Impl7254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BSTerminalExpression__Group_1__0__Impl_in_rule__BSTerminalExpression__Group_1__07288 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__BSTerminalExpression__Group_1__1_in_rule__BSTerminalExpression__Group_1__07291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BSTerminalExpression__Group_1__1__Impl_in_rule__BSTerminalExpression__Group_1__17349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BSTerminalExpression__ValueAssignment_1_1_in_rule__BSTerminalExpression__Group_1__1__Impl7376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BSTerminalExpression__Group_2__0__Impl_in_rule__BSTerminalExpression__Group_2__07410 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_rule__BSTerminalExpression__Group_2__1_in_rule__BSTerminalExpression__Group_2__07413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BSTerminalExpression__Group_2__1__Impl_in_rule__BSTerminalExpression__Group_2__17471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BSTerminalExpression__ValueAssignment_2_1_in_rule__BSTerminalExpression__Group_2__1__Impl7498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BSTerminalExpression__Group_3__0__Impl_in_rule__BSTerminalExpression__Group_3__07532 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__BSTerminalExpression__Group_3__1_in_rule__BSTerminalExpression__Group_3__07535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BSTerminalExpression__Group_3__1__Impl_in_rule__BSTerminalExpression__Group_3__17593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__BSTerminalExpression__Group_3__1__Impl7621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BSTerminalExpression__Group_4__0__Impl_in_rule__BSTerminalExpression__Group_4__07656 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__BSTerminalExpression__Group_4__1_in_rule__BSTerminalExpression__Group_4__07659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BSTerminalExpression__Group_4__1__Impl_in_rule__BSTerminalExpression__Group_4__17717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__BSTerminalExpression__Group_4__1__Impl7745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BSTerminalExpression__Group_5__0__Impl_in_rule__BSTerminalExpression__Group_5__07780 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__BSTerminalExpression__Group_5__1_in_rule__BSTerminalExpression__Group_5__07783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BSTerminalExpression__Group_5__1__Impl_in_rule__BSTerminalExpression__Group_5__17841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__BSTerminalExpression__Group_5__1__Impl7869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BSTerminalExpression__Group_6__0__Impl_in_rule__BSTerminalExpression__Group_6__07904 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__BSTerminalExpression__Group_6__1_in_rule__BSTerminalExpression__Group_6__07907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BSTerminalExpression__Group_6__1__Impl_in_rule__BSTerminalExpression__Group_6__17965 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__BSTerminalExpression__Group_6__2_in_rule__BSTerminalExpression__Group_6__17968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BSTerminalExpression__SymbolAssignment_6_1_in_rule__BSTerminalExpression__Group_6__1__Impl7995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BSTerminalExpression__Group_6__2__Impl_in_rule__BSTerminalExpression__Group_6__28025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BSTerminalExpression__Group_6_2__0_in_rule__BSTerminalExpression__Group_6__2__Impl8052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BSTerminalExpression__Group_6_2__0__Impl_in_rule__BSTerminalExpression__Group_6_2__08089 = new BitSet(new long[]{0x0000000F0600C070L});
    public static final BitSet FOLLOW_rule__BSTerminalExpression__Group_6_2__1_in_rule__BSTerminalExpression__Group_6_2__08092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BSTerminalExpression__MethodinvocationAssignment_6_2_0_in_rule__BSTerminalExpression__Group_6_2__0__Impl8119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BSTerminalExpression__Group_6_2__1__Impl_in_rule__BSTerminalExpression__Group_6_2__18149 = new BitSet(new long[]{0x0000000F0600C070L});
    public static final BitSet FOLLOW_rule__BSTerminalExpression__Group_6_2__2_in_rule__BSTerminalExpression__Group_6_2__18152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BSTerminalExpression__Group_6_2_1__0_in_rule__BSTerminalExpression__Group_6_2__1__Impl8179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BSTerminalExpression__Group_6_2__2__Impl_in_rule__BSTerminalExpression__Group_6_2__28210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__BSTerminalExpression__Group_6_2__2__Impl8238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BSTerminalExpression__Group_6_2_1__0__Impl_in_rule__BSTerminalExpression__Group_6_2_1__08275 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__BSTerminalExpression__Group_6_2_1__1_in_rule__BSTerminalExpression__Group_6_2_1__08278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BSTerminalExpression__ArgsAssignment_6_2_1_0_in_rule__BSTerminalExpression__Group_6_2_1__0__Impl8305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BSTerminalExpression__Group_6_2_1__1__Impl_in_rule__BSTerminalExpression__Group_6_2_1__18335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BSTerminalExpression__Group_6_2_1_1__0_in_rule__BSTerminalExpression__Group_6_2_1__1__Impl8362 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_rule__BSTerminalExpression__Group_6_2_1_1__0__Impl_in_rule__BSTerminalExpression__Group_6_2_1_1__08397 = new BitSet(new long[]{0x0000000F0200C070L});
    public static final BitSet FOLLOW_rule__BSTerminalExpression__Group_6_2_1_1__1_in_rule__BSTerminalExpression__Group_6_2_1_1__08400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__BSTerminalExpression__Group_6_2_1_1__0__Impl8428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BSTerminalExpression__Group_6_2_1_1__1__Impl_in_rule__BSTerminalExpression__Group_6_2_1_1__18459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BSTerminalExpression__ArgsAssignment_6_2_1_1_1_in_rule__BSTerminalExpression__Group_6_2_1_1__1__Impl8486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BSTerminalExpression__Group_7__0__Impl_in_rule__BSTerminalExpression__Group_7__08520 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__BSTerminalExpression__Group_7__1_in_rule__BSTerminalExpression__Group_7__08523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BSTerminalExpression__Group_7__1__Impl_in_rule__BSTerminalExpression__Group_7__18581 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__BSTerminalExpression__Group_7__2_in_rule__BSTerminalExpression__Group_7__18584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__BSTerminalExpression__Group_7__1__Impl8612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BSTerminalExpression__Group_7__2__Impl_in_rule__BSTerminalExpression__Group_7__28643 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__BSTerminalExpression__Group_7__3_in_rule__BSTerminalExpression__Group_7__28646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BSTerminalExpression__TypeAssignment_7_2_in_rule__BSTerminalExpression__Group_7__2__Impl8673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BSTerminalExpression__Group_7__3__Impl_in_rule__BSTerminalExpression__Group_7__38703 = new BitSet(new long[]{0x0000000F0600C070L});
    public static final BitSet FOLLOW_rule__BSTerminalExpression__Group_7__4_in_rule__BSTerminalExpression__Group_7__38706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__BSTerminalExpression__Group_7__3__Impl8734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BSTerminalExpression__Group_7__4__Impl_in_rule__BSTerminalExpression__Group_7__48765 = new BitSet(new long[]{0x0000000F0600C070L});
    public static final BitSet FOLLOW_rule__BSTerminalExpression__Group_7__5_in_rule__BSTerminalExpression__Group_7__48768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BSTerminalExpression__Group_7_4__0_in_rule__BSTerminalExpression__Group_7__4__Impl8795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BSTerminalExpression__Group_7__5__Impl_in_rule__BSTerminalExpression__Group_7__58826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__BSTerminalExpression__Group_7__5__Impl8854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BSTerminalExpression__Group_7_4__0__Impl_in_rule__BSTerminalExpression__Group_7_4__08897 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__BSTerminalExpression__Group_7_4__1_in_rule__BSTerminalExpression__Group_7_4__08900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BSTerminalExpression__ArgsAssignment_7_4_0_in_rule__BSTerminalExpression__Group_7_4__0__Impl8927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BSTerminalExpression__Group_7_4__1__Impl_in_rule__BSTerminalExpression__Group_7_4__18957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BSTerminalExpression__Group_7_4_1__0_in_rule__BSTerminalExpression__Group_7_4__1__Impl8984 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_rule__BSTerminalExpression__Group_7_4_1__0__Impl_in_rule__BSTerminalExpression__Group_7_4_1__09019 = new BitSet(new long[]{0x0000000F0200C070L});
    public static final BitSet FOLLOW_rule__BSTerminalExpression__Group_7_4_1__1_in_rule__BSTerminalExpression__Group_7_4_1__09022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__BSTerminalExpression__Group_7_4_1__0__Impl9050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BSTerminalExpression__Group_7_4_1__1__Impl_in_rule__BSTerminalExpression__Group_7_4_1__19081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BSTerminalExpression__ArgsAssignment_7_4_1_1_in_rule__BSTerminalExpression__Group_7_4_1__1__Impl9108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BSTerminalExpression__Group_8__0__Impl_in_rule__BSTerminalExpression__Group_8__09142 = new BitSet(new long[]{0x0000000F0200C070L});
    public static final BitSet FOLLOW_rule__BSTerminalExpression__Group_8__1_in_rule__BSTerminalExpression__Group_8__09145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__BSTerminalExpression__Group_8__0__Impl9173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BSTerminalExpression__Group_8__1__Impl_in_rule__BSTerminalExpression__Group_8__19204 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__BSTerminalExpression__Group_8__2_in_rule__BSTerminalExpression__Group_8__19207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBSExpression_in_rule__BSTerminalExpression__Group_8__1__Impl9234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BSTerminalExpression__Group_8__2__Impl_in_rule__BSTerminalExpression__Group_8__29263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__BSTerminalExpression__Group_8__2__Impl9291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__BSFile__NameAssignment_0_19333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBSImport_in_rule__BSFile__ImportsAssignment_19364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBSClass_in_rule__BSFile__ClassesAssignment_29395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_rule__BSImport__ImportedNamespaceAssignment_19426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__BSClass__NameAssignment_19457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__BSClass__SuperclassAssignment_2_19492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBSMember_in_rule__BSClass__MembersAssignment_49527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__BSField__TypeAssignment_09562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__BSField__NameAssignment_19597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__BSMethod__TypeAssignment_09632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__BSMethod__NameAssignment_19667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBSParameter_in_rule__BSMethod__ParamsAssignment_3_09698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBSParameter_in_rule__BSMethod__ParamsAssignment_3_1_19729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBSMethodBody_in_rule__BSMethod__BodyAssignment_59760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__BSParameter__TypeAssignment_09795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__BSParameter__NameAssignment_19830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBSStatement_in_rule__BSMethodBody__StatementsAssignment_29861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBSExpression_in_rule__BSReturn__ExpressionAssignment_19892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__BSVariableDeclaration__TypeAssignment_09927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__BSVariableDeclaration__NameAssignment_19962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBSExpression_in_rule__BSVariableDeclaration__ExpressionAssignment_2_19993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBSExpression_in_rule__BSIfStatement__ExpressionAssignment_210024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBSIfBlock_in_rule__BSIfStatement__ThenBlockAssignment_410055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBSIfBlock_in_rule__BSIfStatement__ElseBlockAssignment_5_110086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBSStatement_in_rule__BSIfBlock__StatementsAssignment_010117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBSStatement_in_rule__BSIfBlock__StatementsAssignment_1_110148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBSExpression_in_rule__BSAssignment__RightAssignment_1_210179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BSCastingExpression__CastTypeAlternatives_1_0_in_rule__BSCastingExpression__CastTypeAssignment_110210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBSSelectionExpression_in_rule__BSCastingExpression__CastExprAssignment_310243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__BSSelectionExpression__MemberAssignment_1_210278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__BSSelectionExpression__MethodinvocationAssignment_1_3_010318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBSExpression_in_rule__BSSelectionExpression__ArgsAssignment_1_3_1_010357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBSExpression_in_rule__BSSelectionExpression__ArgsAssignment_1_3_1_1_110388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__BSTerminalExpression__ValueAssignment_0_110419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__BSTerminalExpression__ValueAssignment_1_110450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BSTerminalExpression__ValueAlternatives_2_1_0_in_rule__BSTerminalExpression__ValueAssignment_2_110481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__BSTerminalExpression__SymbolAssignment_6_110518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__BSTerminalExpression__MethodinvocationAssignment_6_2_010558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBSExpression_in_rule__BSTerminalExpression__ArgsAssignment_6_2_1_010597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBSExpression_in_rule__BSTerminalExpression__ArgsAssignment_6_2_1_1_110628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__BSTerminalExpression__TypeAssignment_7_210663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBSExpression_in_rule__BSTerminalExpression__ArgsAssignment_7_4_010698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBSExpression_in_rule__BSTerminalExpression__ArgsAssignment_7_4_1_110729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BSIfStatement__Group_5__0_in_synpred29_InternalBlorqueScript5436 = new BitSet(new long[]{0x0000000000000002L});

}