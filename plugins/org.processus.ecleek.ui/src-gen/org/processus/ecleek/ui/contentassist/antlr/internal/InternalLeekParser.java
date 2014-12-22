package org.processus.ecleek.ui.contentassist.antlr.internal; 

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
import org.processus.ecleek.services.LeekGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalLeekParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_REAL", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'or'", "'||'", "'and'", "'&&'", "';'", "'{'", "'}'", "'='", "'if'", "'('", "')'", "'else'", "'while'", "'for'", "'var'", "'in'", "':'", "'function'", "','", "'global'", "'==='", "'=='", "'!=='", "'!='", "'<='", "'<'", "'>='", "'>'", "'+'", "'-'", "'*'", "'/'", "'['", "']'", "'return'", "'include'", "'@'"
    };
    public static final int RULE_ID=4;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int T__19=19;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
    public static final int RULE_REAL=5;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int RULE_SL_COMMENT=9;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=7;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=10;

    // delegates
    // delegators


        public InternalLeekParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalLeekParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalLeekParser.tokenNames; }
    public String getGrammarFileName() { return "../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g"; }


     
     	private LeekGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(LeekGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleScript"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:61:1: entryRuleScript : ruleScript EOF ;
    public final void entryRuleScript() throws RecognitionException {
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:62:1: ( ruleScript EOF )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:63:1: ruleScript EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScriptRule()); 
            }
            pushFollow(FOLLOW_ruleScript_in_entryRuleScript67);
            ruleScript();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getScriptRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleScript74); if (state.failed) return ;

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
    // $ANTLR end "entryRuleScript"


    // $ANTLR start "ruleScript"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:70:1: ruleScript : ( ( rule__Script__StatementsAssignment )* ) ;
    public final void ruleScript() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:74:2: ( ( ( rule__Script__StatementsAssignment )* ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:75:1: ( ( rule__Script__StatementsAssignment )* )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:75:1: ( ( rule__Script__StatementsAssignment )* )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:76:1: ( rule__Script__StatementsAssignment )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScriptAccess().getStatementsAssignment()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:77:1: ( rule__Script__StatementsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID||(LA1_0>=16 && LA1_0<=17)||LA1_0==20||(LA1_0>=24 && LA1_0<=26)||LA1_0==29||LA1_0==31||(LA1_0>=46 && LA1_0<=47)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:77:2: rule__Script__StatementsAssignment
            	    {
            	    pushFollow(FOLLOW_rule__Script__StatementsAssignment_in_ruleScript100);
            	    rule__Script__StatementsAssignment();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getScriptAccess().getStatementsAssignment()); 
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
    // $ANTLR end "ruleScript"


    // $ANTLR start "entryRuleToplevelStatement"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:89:1: entryRuleToplevelStatement : ruleToplevelStatement EOF ;
    public final void entryRuleToplevelStatement() throws RecognitionException {
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:90:1: ( ruleToplevelStatement EOF )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:91:1: ruleToplevelStatement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getToplevelStatementRule()); 
            }
            pushFollow(FOLLOW_ruleToplevelStatement_in_entryRuleToplevelStatement128);
            ruleToplevelStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getToplevelStatementRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleToplevelStatement135); if (state.failed) return ;

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
    // $ANTLR end "entryRuleToplevelStatement"


    // $ANTLR start "ruleToplevelStatement"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:98:1: ruleToplevelStatement : ( ( rule__ToplevelStatement__Alternatives ) ) ;
    public final void ruleToplevelStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:102:2: ( ( ( rule__ToplevelStatement__Alternatives ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:103:1: ( ( rule__ToplevelStatement__Alternatives ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:103:1: ( ( rule__ToplevelStatement__Alternatives ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:104:1: ( rule__ToplevelStatement__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getToplevelStatementAccess().getAlternatives()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:105:1: ( rule__ToplevelStatement__Alternatives )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:105:2: rule__ToplevelStatement__Alternatives
            {
            pushFollow(FOLLOW_rule__ToplevelStatement__Alternatives_in_ruleToplevelStatement161);
            rule__ToplevelStatement__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getToplevelStatementAccess().getAlternatives()); 
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
    // $ANTLR end "ruleToplevelStatement"


    // $ANTLR start "entryRuleStatement"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:117:1: entryRuleStatement : ruleStatement EOF ;
    public final void entryRuleStatement() throws RecognitionException {
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:118:1: ( ruleStatement EOF )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:119:1: ruleStatement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementRule()); 
            }
            pushFollow(FOLLOW_ruleStatement_in_entryRuleStatement188);
            ruleStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatement195); if (state.failed) return ;

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
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:126:1: ruleStatement : ( ( rule__Statement__Alternatives ) ) ;
    public final void ruleStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:130:2: ( ( ( rule__Statement__Alternatives ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:131:1: ( ( rule__Statement__Alternatives ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:131:1: ( ( rule__Statement__Alternatives ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:132:1: ( rule__Statement__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getAlternatives()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:133:1: ( rule__Statement__Alternatives )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:133:2: rule__Statement__Alternatives
            {
            pushFollow(FOLLOW_rule__Statement__Alternatives_in_ruleStatement221);
            rule__Statement__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getAlternatives()); 
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
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleStatementBlock"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:145:1: entryRuleStatementBlock : ruleStatementBlock EOF ;
    public final void entryRuleStatementBlock() throws RecognitionException {
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:146:1: ( ruleStatementBlock EOF )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:147:1: ruleStatementBlock EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementBlockRule()); 
            }
            pushFollow(FOLLOW_ruleStatementBlock_in_entryRuleStatementBlock248);
            ruleStatementBlock();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementBlockRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatementBlock255); if (state.failed) return ;

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
    // $ANTLR end "entryRuleStatementBlock"


    // $ANTLR start "ruleStatementBlock"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:154:1: ruleStatementBlock : ( ( rule__StatementBlock__Group__0 ) ) ;
    public final void ruleStatementBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:158:2: ( ( ( rule__StatementBlock__Group__0 ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:159:1: ( ( rule__StatementBlock__Group__0 ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:159:1: ( ( rule__StatementBlock__Group__0 ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:160:1: ( rule__StatementBlock__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementBlockAccess().getGroup()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:161:1: ( rule__StatementBlock__Group__0 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:161:2: rule__StatementBlock__Group__0
            {
            pushFollow(FOLLOW_rule__StatementBlock__Group__0_in_ruleStatementBlock281);
            rule__StatementBlock__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementBlockAccess().getGroup()); 
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
    // $ANTLR end "ruleStatementBlock"


    // $ANTLR start "entryRuleAffectation"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:173:1: entryRuleAffectation : ruleAffectation EOF ;
    public final void entryRuleAffectation() throws RecognitionException {
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:174:1: ( ruleAffectation EOF )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:175:1: ruleAffectation EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAffectationRule()); 
            }
            pushFollow(FOLLOW_ruleAffectation_in_entryRuleAffectation308);
            ruleAffectation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAffectationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAffectation315); if (state.failed) return ;

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
    // $ANTLR end "entryRuleAffectation"


    // $ANTLR start "ruleAffectation"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:182:1: ruleAffectation : ( ( rule__Affectation__Group__0 ) ) ;
    public final void ruleAffectation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:186:2: ( ( ( rule__Affectation__Group__0 ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:187:1: ( ( rule__Affectation__Group__0 ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:187:1: ( ( rule__Affectation__Group__0 ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:188:1: ( rule__Affectation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAffectationAccess().getGroup()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:189:1: ( rule__Affectation__Group__0 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:189:2: rule__Affectation__Group__0
            {
            pushFollow(FOLLOW_rule__Affectation__Group__0_in_ruleAffectation341);
            rule__Affectation__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAffectationAccess().getGroup()); 
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
    // $ANTLR end "ruleAffectation"


    // $ANTLR start "entryRuleIf"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:201:1: entryRuleIf : ruleIf EOF ;
    public final void entryRuleIf() throws RecognitionException {
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:202:1: ( ruleIf EOF )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:203:1: ruleIf EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfRule()); 
            }
            pushFollow(FOLLOW_ruleIf_in_entryRuleIf368);
            ruleIf();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIf375); if (state.failed) return ;

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
    // $ANTLR end "entryRuleIf"


    // $ANTLR start "ruleIf"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:210:1: ruleIf : ( ( rule__If__Group__0 ) ) ;
    public final void ruleIf() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:214:2: ( ( ( rule__If__Group__0 ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:215:1: ( ( rule__If__Group__0 ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:215:1: ( ( rule__If__Group__0 ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:216:1: ( rule__If__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getGroup()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:217:1: ( rule__If__Group__0 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:217:2: rule__If__Group__0
            {
            pushFollow(FOLLOW_rule__If__Group__0_in_ruleIf401);
            rule__If__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfAccess().getGroup()); 
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
    // $ANTLR end "ruleIf"


    // $ANTLR start "entryRuleWhile"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:229:1: entryRuleWhile : ruleWhile EOF ;
    public final void entryRuleWhile() throws RecognitionException {
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:230:1: ( ruleWhile EOF )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:231:1: ruleWhile EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileRule()); 
            }
            pushFollow(FOLLOW_ruleWhile_in_entryRuleWhile428);
            ruleWhile();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhileRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleWhile435); if (state.failed) return ;

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
    // $ANTLR end "entryRuleWhile"


    // $ANTLR start "ruleWhile"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:238:1: ruleWhile : ( ( rule__While__Group__0 ) ) ;
    public final void ruleWhile() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:242:2: ( ( ( rule__While__Group__0 ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:243:1: ( ( rule__While__Group__0 ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:243:1: ( ( rule__While__Group__0 ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:244:1: ( rule__While__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileAccess().getGroup()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:245:1: ( rule__While__Group__0 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:245:2: rule__While__Group__0
            {
            pushFollow(FOLLOW_rule__While__Group__0_in_ruleWhile461);
            rule__While__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhileAccess().getGroup()); 
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
    // $ANTLR end "ruleWhile"


    // $ANTLR start "entryRuleFor"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:257:1: entryRuleFor : ruleFor EOF ;
    public final void entryRuleFor() throws RecognitionException {
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:258:1: ( ruleFor EOF )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:259:1: ruleFor EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForRule()); 
            }
            pushFollow(FOLLOW_ruleFor_in_entryRuleFor488);
            ruleFor();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFor495); if (state.failed) return ;

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
    // $ANTLR end "entryRuleFor"


    // $ANTLR start "ruleFor"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:266:1: ruleFor : ( ( rule__For__Group__0 ) ) ;
    public final void ruleFor() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:270:2: ( ( ( rule__For__Group__0 ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:271:1: ( ( rule__For__Group__0 ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:271:1: ( ( rule__For__Group__0 ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:272:1: ( rule__For__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForAccess().getGroup()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:273:1: ( rule__For__Group__0 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:273:2: rule__For__Group__0
            {
            pushFollow(FOLLOW_rule__For__Group__0_in_ruleFor521);
            rule__For__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getForAccess().getGroup()); 
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
    // $ANTLR end "ruleFor"


    // $ANTLR start "entryRuleForIterator"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:285:1: entryRuleForIterator : ruleForIterator EOF ;
    public final void entryRuleForIterator() throws RecognitionException {
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:286:1: ( ruleForIterator EOF )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:287:1: ruleForIterator EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForIteratorRule()); 
            }
            pushFollow(FOLLOW_ruleForIterator_in_entryRuleForIterator548);
            ruleForIterator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForIteratorRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleForIterator555); if (state.failed) return ;

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
    // $ANTLR end "entryRuleForIterator"


    // $ANTLR start "ruleForIterator"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:294:1: ruleForIterator : ( ( rule__ForIterator__Alternatives ) ) ;
    public final void ruleForIterator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:298:2: ( ( ( rule__ForIterator__Alternatives ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:299:1: ( ( rule__ForIterator__Alternatives ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:299:1: ( ( rule__ForIterator__Alternatives ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:300:1: ( rule__ForIterator__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForIteratorAccess().getAlternatives()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:301:1: ( rule__ForIterator__Alternatives )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:301:2: rule__ForIterator__Alternatives
            {
            pushFollow(FOLLOW_rule__ForIterator__Alternatives_in_ruleForIterator581);
            rule__ForIterator__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getForIteratorAccess().getAlternatives()); 
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
    // $ANTLR end "ruleForIterator"


    // $ANTLR start "entryRuleEachIterator"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:313:1: entryRuleEachIterator : ruleEachIterator EOF ;
    public final void entryRuleEachIterator() throws RecognitionException {
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:314:1: ( ruleEachIterator EOF )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:315:1: ruleEachIterator EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEachIteratorRule()); 
            }
            pushFollow(FOLLOW_ruleEachIterator_in_entryRuleEachIterator608);
            ruleEachIterator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEachIteratorRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEachIterator615); if (state.failed) return ;

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
    // $ANTLR end "entryRuleEachIterator"


    // $ANTLR start "ruleEachIterator"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:322:1: ruleEachIterator : ( ( rule__EachIterator__Group__0 ) ) ;
    public final void ruleEachIterator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:326:2: ( ( ( rule__EachIterator__Group__0 ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:327:1: ( ( rule__EachIterator__Group__0 ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:327:1: ( ( rule__EachIterator__Group__0 ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:328:1: ( rule__EachIterator__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEachIteratorAccess().getGroup()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:329:1: ( rule__EachIterator__Group__0 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:329:2: rule__EachIterator__Group__0
            {
            pushFollow(FOLLOW_rule__EachIterator__Group__0_in_ruleEachIterator641);
            rule__EachIterator__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEachIteratorAccess().getGroup()); 
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
    // $ANTLR end "ruleEachIterator"


    // $ANTLR start "entryRuleVariableIterator"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:341:1: entryRuleVariableIterator : ruleVariableIterator EOF ;
    public final void entryRuleVariableIterator() throws RecognitionException {
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:342:1: ( ruleVariableIterator EOF )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:343:1: ruleVariableIterator EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableIteratorRule()); 
            }
            pushFollow(FOLLOW_ruleVariableIterator_in_entryRuleVariableIterator668);
            ruleVariableIterator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableIteratorRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableIterator675); if (state.failed) return ;

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
    // $ANTLR end "entryRuleVariableIterator"


    // $ANTLR start "ruleVariableIterator"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:350:1: ruleVariableIterator : ( ( rule__VariableIterator__Group__0 ) ) ;
    public final void ruleVariableIterator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:354:2: ( ( ( rule__VariableIterator__Group__0 ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:355:1: ( ( rule__VariableIterator__Group__0 ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:355:1: ( ( rule__VariableIterator__Group__0 ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:356:1: ( rule__VariableIterator__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableIteratorAccess().getGroup()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:357:1: ( rule__VariableIterator__Group__0 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:357:2: rule__VariableIterator__Group__0
            {
            pushFollow(FOLLOW_rule__VariableIterator__Group__0_in_ruleVariableIterator701);
            rule__VariableIterator__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableIteratorAccess().getGroup()); 
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
    // $ANTLR end "ruleVariableIterator"


    // $ANTLR start "entryRuleFunctionDeclaration"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:369:1: entryRuleFunctionDeclaration : ruleFunctionDeclaration EOF ;
    public final void entryRuleFunctionDeclaration() throws RecognitionException {
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:370:1: ( ruleFunctionDeclaration EOF )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:371:1: ruleFunctionDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleFunctionDeclaration_in_entryRuleFunctionDeclaration728);
            ruleFunctionDeclaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionDeclarationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionDeclaration735); if (state.failed) return ;

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
    // $ANTLR end "entryRuleFunctionDeclaration"


    // $ANTLR start "ruleFunctionDeclaration"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:378:1: ruleFunctionDeclaration : ( ( rule__FunctionDeclaration__Group__0 ) ) ;
    public final void ruleFunctionDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:382:2: ( ( ( rule__FunctionDeclaration__Group__0 ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:383:1: ( ( rule__FunctionDeclaration__Group__0 ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:383:1: ( ( rule__FunctionDeclaration__Group__0 ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:384:1: ( rule__FunctionDeclaration__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionDeclarationAccess().getGroup()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:385:1: ( rule__FunctionDeclaration__Group__0 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:385:2: rule__FunctionDeclaration__Group__0
            {
            pushFollow(FOLLOW_rule__FunctionDeclaration__Group__0_in_ruleFunctionDeclaration761);
            rule__FunctionDeclaration__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionDeclarationAccess().getGroup()); 
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
    // $ANTLR end "ruleFunctionDeclaration"


    // $ANTLR start "entryRuleParameterDeclaration"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:397:1: entryRuleParameterDeclaration : ruleParameterDeclaration EOF ;
    public final void entryRuleParameterDeclaration() throws RecognitionException {
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:398:1: ( ruleParameterDeclaration EOF )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:399:1: ruleParameterDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleParameterDeclaration_in_entryRuleParameterDeclaration788);
            ruleParameterDeclaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterDeclarationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameterDeclaration795); if (state.failed) return ;

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
    // $ANTLR end "entryRuleParameterDeclaration"


    // $ANTLR start "ruleParameterDeclaration"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:406:1: ruleParameterDeclaration : ( ( rule__ParameterDeclaration__Group__0 ) ) ;
    public final void ruleParameterDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:410:2: ( ( ( rule__ParameterDeclaration__Group__0 ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:411:1: ( ( rule__ParameterDeclaration__Group__0 ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:411:1: ( ( rule__ParameterDeclaration__Group__0 ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:412:1: ( rule__ParameterDeclaration__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterDeclarationAccess().getGroup()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:413:1: ( rule__ParameterDeclaration__Group__0 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:413:2: rule__ParameterDeclaration__Group__0
            {
            pushFollow(FOLLOW_rule__ParameterDeclaration__Group__0_in_ruleParameterDeclaration821);
            rule__ParameterDeclaration__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterDeclarationAccess().getGroup()); 
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
    // $ANTLR end "ruleParameterDeclaration"


    // $ANTLR start "entryRuleLocalDeclaration"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:425:1: entryRuleLocalDeclaration : ruleLocalDeclaration EOF ;
    public final void entryRuleLocalDeclaration() throws RecognitionException {
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:426:1: ( ruleLocalDeclaration EOF )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:427:1: ruleLocalDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleLocalDeclaration_in_entryRuleLocalDeclaration848);
            ruleLocalDeclaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocalDeclarationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLocalDeclaration855); if (state.failed) return ;

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
    // $ANTLR end "entryRuleLocalDeclaration"


    // $ANTLR start "ruleLocalDeclaration"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:434:1: ruleLocalDeclaration : ( ( rule__LocalDeclaration__Group__0 ) ) ;
    public final void ruleLocalDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:438:2: ( ( ( rule__LocalDeclaration__Group__0 ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:439:1: ( ( rule__LocalDeclaration__Group__0 ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:439:1: ( ( rule__LocalDeclaration__Group__0 ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:440:1: ( rule__LocalDeclaration__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalDeclarationAccess().getGroup()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:441:1: ( rule__LocalDeclaration__Group__0 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:441:2: rule__LocalDeclaration__Group__0
            {
            pushFollow(FOLLOW_rule__LocalDeclaration__Group__0_in_ruleLocalDeclaration881);
            rule__LocalDeclaration__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocalDeclarationAccess().getGroup()); 
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
    // $ANTLR end "ruleLocalDeclaration"


    // $ANTLR start "entryRuleGlobalDeclaration"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:453:1: entryRuleGlobalDeclaration : ruleGlobalDeclaration EOF ;
    public final void entryRuleGlobalDeclaration() throws RecognitionException {
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:454:1: ( ruleGlobalDeclaration EOF )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:455:1: ruleGlobalDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGlobalDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleGlobalDeclaration_in_entryRuleGlobalDeclaration908);
            ruleGlobalDeclaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGlobalDeclarationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGlobalDeclaration915); if (state.failed) return ;

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
    // $ANTLR end "entryRuleGlobalDeclaration"


    // $ANTLR start "ruleGlobalDeclaration"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:462:1: ruleGlobalDeclaration : ( ( rule__GlobalDeclaration__Group__0 ) ) ;
    public final void ruleGlobalDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:466:2: ( ( ( rule__GlobalDeclaration__Group__0 ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:467:1: ( ( rule__GlobalDeclaration__Group__0 ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:467:1: ( ( rule__GlobalDeclaration__Group__0 ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:468:1: ( rule__GlobalDeclaration__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGlobalDeclarationAccess().getGroup()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:469:1: ( rule__GlobalDeclaration__Group__0 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:469:2: rule__GlobalDeclaration__Group__0
            {
            pushFollow(FOLLOW_rule__GlobalDeclaration__Group__0_in_ruleGlobalDeclaration941);
            rule__GlobalDeclaration__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGlobalDeclarationAccess().getGroup()); 
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
    // $ANTLR end "ruleGlobalDeclaration"


    // $ANTLR start "entryRuleVariableDeclaration"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:481:1: entryRuleVariableDeclaration : ruleVariableDeclaration EOF ;
    public final void entryRuleVariableDeclaration() throws RecognitionException {
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:482:1: ( ruleVariableDeclaration EOF )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:483:1: ruleVariableDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleVariableDeclaration_in_entryRuleVariableDeclaration968);
            ruleVariableDeclaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableDeclarationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableDeclaration975); if (state.failed) return ;

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
    // $ANTLR end "entryRuleVariableDeclaration"


    // $ANTLR start "ruleVariableDeclaration"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:490:1: ruleVariableDeclaration : ( ( rule__VariableDeclaration__Group__0 ) ) ;
    public final void ruleVariableDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:494:2: ( ( ( rule__VariableDeclaration__Group__0 ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:495:1: ( ( rule__VariableDeclaration__Group__0 ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:495:1: ( ( rule__VariableDeclaration__Group__0 ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:496:1: ( rule__VariableDeclaration__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableDeclarationAccess().getGroup()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:497:1: ( rule__VariableDeclaration__Group__0 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:497:2: rule__VariableDeclaration__Group__0
            {
            pushFollow(FOLLOW_rule__VariableDeclaration__Group__0_in_ruleVariableDeclaration1001);
            rule__VariableDeclaration__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableDeclarationAccess().getGroup()); 
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
    // $ANTLR end "ruleVariableDeclaration"


    // $ANTLR start "entryRuleExpression"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:509:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:510:1: ( ruleExpression EOF )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:511:1: ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression1028);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression1035); if (state.failed) return ;

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
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:518:1: ruleExpression : ( ruleComparison ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:522:2: ( ( ruleComparison ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:523:1: ( ruleComparison )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:523:1: ( ruleComparison )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:524:1: ruleComparison
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getComparisonParserRuleCall()); 
            }
            pushFollow(FOLLOW_ruleComparison_in_ruleExpression1061);
            ruleComparison();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionAccess().getComparisonParserRuleCall()); 
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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleComparison"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:537:1: entryRuleComparison : ruleComparison EOF ;
    public final void entryRuleComparison() throws RecognitionException {
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:538:1: ( ruleComparison EOF )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:539:1: ruleComparison EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonRule()); 
            }
            pushFollow(FOLLOW_ruleComparison_in_entryRuleComparison1087);
            ruleComparison();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleComparison1094); if (state.failed) return ;

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
    // $ANTLR end "entryRuleComparison"


    // $ANTLR start "ruleComparison"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:546:1: ruleComparison : ( ( rule__Comparison__Group__0 ) ) ;
    public final void ruleComparison() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:550:2: ( ( ( rule__Comparison__Group__0 ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:551:1: ( ( rule__Comparison__Group__0 ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:551:1: ( ( rule__Comparison__Group__0 ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:552:1: ( rule__Comparison__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getGroup()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:553:1: ( rule__Comparison__Group__0 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:553:2: rule__Comparison__Group__0
            {
            pushFollow(FOLLOW_rule__Comparison__Group__0_in_ruleComparison1120);
            rule__Comparison__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonAccess().getGroup()); 
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
    // $ANTLR end "ruleComparison"


    // $ANTLR start "entryRuleOr"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:565:1: entryRuleOr : ruleOr EOF ;
    public final void entryRuleOr() throws RecognitionException {
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:566:1: ( ruleOr EOF )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:567:1: ruleOr EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrRule()); 
            }
            pushFollow(FOLLOW_ruleOr_in_entryRuleOr1147);
            ruleOr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOr1154); if (state.failed) return ;

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
    // $ANTLR end "entryRuleOr"


    // $ANTLR start "ruleOr"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:574:1: ruleOr : ( ( rule__Or__Group__0 ) ) ;
    public final void ruleOr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:578:2: ( ( ( rule__Or__Group__0 ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:579:1: ( ( rule__Or__Group__0 ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:579:1: ( ( rule__Or__Group__0 ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:580:1: ( rule__Or__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAccess().getGroup()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:581:1: ( rule__Or__Group__0 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:581:2: rule__Or__Group__0
            {
            pushFollow(FOLLOW_rule__Or__Group__0_in_ruleOr1180);
            rule__Or__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrAccess().getGroup()); 
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
    // $ANTLR end "ruleOr"


    // $ANTLR start "entryRuleAnd"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:593:1: entryRuleAnd : ruleAnd EOF ;
    public final void entryRuleAnd() throws RecognitionException {
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:594:1: ( ruleAnd EOF )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:595:1: ruleAnd EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndRule()); 
            }
            pushFollow(FOLLOW_ruleAnd_in_entryRuleAnd1207);
            ruleAnd();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnd1214); if (state.failed) return ;

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
    // $ANTLR end "entryRuleAnd"


    // $ANTLR start "ruleAnd"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:602:1: ruleAnd : ( ( rule__And__Group__0 ) ) ;
    public final void ruleAnd() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:606:2: ( ( ( rule__And__Group__0 ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:607:1: ( ( rule__And__Group__0 ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:607:1: ( ( rule__And__Group__0 ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:608:1: ( rule__And__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndAccess().getGroup()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:609:1: ( rule__And__Group__0 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:609:2: rule__And__Group__0
            {
            pushFollow(FOLLOW_rule__And__Group__0_in_ruleAnd1240);
            rule__And__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndAccess().getGroup()); 
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
    // $ANTLR end "ruleAnd"


    // $ANTLR start "entryRuleAddition"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:621:1: entryRuleAddition : ruleAddition EOF ;
    public final void entryRuleAddition() throws RecognitionException {
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:622:1: ( ruleAddition EOF )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:623:1: ruleAddition EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionRule()); 
            }
            pushFollow(FOLLOW_ruleAddition_in_entryRuleAddition1267);
            ruleAddition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAddition1274); if (state.failed) return ;

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
    // $ANTLR end "entryRuleAddition"


    // $ANTLR start "ruleAddition"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:630:1: ruleAddition : ( ( rule__Addition__Group__0 ) ) ;
    public final void ruleAddition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:634:2: ( ( ( rule__Addition__Group__0 ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:635:1: ( ( rule__Addition__Group__0 ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:635:1: ( ( rule__Addition__Group__0 ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:636:1: ( rule__Addition__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getGroup()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:637:1: ( rule__Addition__Group__0 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:637:2: rule__Addition__Group__0
            {
            pushFollow(FOLLOW_rule__Addition__Group__0_in_ruleAddition1300);
            rule__Addition__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditionAccess().getGroup()); 
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
    // $ANTLR end "ruleAddition"


    // $ANTLR start "entryRuleMultiplication"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:649:1: entryRuleMultiplication : ruleMultiplication EOF ;
    public final void entryRuleMultiplication() throws RecognitionException {
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:650:1: ( ruleMultiplication EOF )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:651:1: ruleMultiplication EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationRule()); 
            }
            pushFollow(FOLLOW_ruleMultiplication_in_entryRuleMultiplication1327);
            ruleMultiplication();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiplication1334); if (state.failed) return ;

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
    // $ANTLR end "entryRuleMultiplication"


    // $ANTLR start "ruleMultiplication"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:658:1: ruleMultiplication : ( ( rule__Multiplication__Group__0 ) ) ;
    public final void ruleMultiplication() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:662:2: ( ( ( rule__Multiplication__Group__0 ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:663:1: ( ( rule__Multiplication__Group__0 ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:663:1: ( ( rule__Multiplication__Group__0 ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:664:1: ( rule__Multiplication__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getGroup()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:665:1: ( rule__Multiplication__Group__0 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:665:2: rule__Multiplication__Group__0
            {
            pushFollow(FOLLOW_rule__Multiplication__Group__0_in_ruleMultiplication1360);
            rule__Multiplication__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicationAccess().getGroup()); 
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
    // $ANTLR end "ruleMultiplication"


    // $ANTLR start "entryRulePrimaryExpression"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:677:1: entryRulePrimaryExpression : rulePrimaryExpression EOF ;
    public final void entryRulePrimaryExpression() throws RecognitionException {
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:678:1: ( rulePrimaryExpression EOF )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:679:1: rulePrimaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExpressionRule()); 
            }
            pushFollow(FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression1387);
            rulePrimaryExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimaryExpression1394); if (state.failed) return ;

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
    // $ANTLR end "entryRulePrimaryExpression"


    // $ANTLR start "rulePrimaryExpression"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:686:1: rulePrimaryExpression : ( ( rule__PrimaryExpression__Alternatives ) ) ;
    public final void rulePrimaryExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:690:2: ( ( ( rule__PrimaryExpression__Alternatives ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:691:1: ( ( rule__PrimaryExpression__Alternatives ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:691:1: ( ( rule__PrimaryExpression__Alternatives ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:692:1: ( rule__PrimaryExpression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExpressionAccess().getAlternatives()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:693:1: ( rule__PrimaryExpression__Alternatives )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:693:2: rule__PrimaryExpression__Alternatives
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__Alternatives_in_rulePrimaryExpression1420);
            rule__PrimaryExpression__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryExpressionAccess().getAlternatives()); 
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
    // $ANTLR end "rulePrimaryExpression"


    // $ANTLR start "entryRuleArrayLiteral"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:705:1: entryRuleArrayLiteral : ruleArrayLiteral EOF ;
    public final void entryRuleArrayLiteral() throws RecognitionException {
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:706:1: ( ruleArrayLiteral EOF )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:707:1: ruleArrayLiteral EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleArrayLiteral_in_entryRuleArrayLiteral1447);
            ruleArrayLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayLiteralRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleArrayLiteral1454); if (state.failed) return ;

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
    // $ANTLR end "entryRuleArrayLiteral"


    // $ANTLR start "ruleArrayLiteral"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:714:1: ruleArrayLiteral : ( ( rule__ArrayLiteral__Group__0 ) ) ;
    public final void ruleArrayLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:718:2: ( ( ( rule__ArrayLiteral__Group__0 ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:719:1: ( ( rule__ArrayLiteral__Group__0 ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:719:1: ( ( rule__ArrayLiteral__Group__0 ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:720:1: ( rule__ArrayLiteral__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayLiteralAccess().getGroup()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:721:1: ( rule__ArrayLiteral__Group__0 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:721:2: rule__ArrayLiteral__Group__0
            {
            pushFollow(FOLLOW_rule__ArrayLiteral__Group__0_in_ruleArrayLiteral1480);
            rule__ArrayLiteral__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayLiteralAccess().getGroup()); 
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
    // $ANTLR end "ruleArrayLiteral"


    // $ANTLR start "entryRuleVariableReference"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:733:1: entryRuleVariableReference : ruleVariableReference EOF ;
    public final void entryRuleVariableReference() throws RecognitionException {
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:734:1: ( ruleVariableReference EOF )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:735:1: ruleVariableReference EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleVariableReference_in_entryRuleVariableReference1507);
            ruleVariableReference();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableReferenceRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableReference1514); if (state.failed) return ;

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
    // $ANTLR end "entryRuleVariableReference"


    // $ANTLR start "ruleVariableReference"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:742:1: ruleVariableReference : ( ( rule__VariableReference__Group__0 ) ) ;
    public final void ruleVariableReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:746:2: ( ( ( rule__VariableReference__Group__0 ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:747:1: ( ( rule__VariableReference__Group__0 ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:747:1: ( ( rule__VariableReference__Group__0 ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:748:1: ( rule__VariableReference__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableReferenceAccess().getGroup()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:749:1: ( rule__VariableReference__Group__0 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:749:2: rule__VariableReference__Group__0
            {
            pushFollow(FOLLOW_rule__VariableReference__Group__0_in_ruleVariableReference1540);
            rule__VariableReference__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableReferenceAccess().getGroup()); 
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
    // $ANTLR end "ruleVariableReference"


    // $ANTLR start "entryRuleFunctionCall"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:761:1: entryRuleFunctionCall : ruleFunctionCall EOF ;
    public final void entryRuleFunctionCall() throws RecognitionException {
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:762:1: ( ruleFunctionCall EOF )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:763:1: ruleFunctionCall EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallRule()); 
            }
            pushFollow(FOLLOW_ruleFunctionCall_in_entryRuleFunctionCall1567);
            ruleFunctionCall();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionCallRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionCall1574); if (state.failed) return ;

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
    // $ANTLR end "entryRuleFunctionCall"


    // $ANTLR start "ruleFunctionCall"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:770:1: ruleFunctionCall : ( ( rule__FunctionCall__Group__0 ) ) ;
    public final void ruleFunctionCall() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:774:2: ( ( ( rule__FunctionCall__Group__0 ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:775:1: ( ( rule__FunctionCall__Group__0 ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:775:1: ( ( rule__FunctionCall__Group__0 ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:776:1: ( rule__FunctionCall__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getGroup()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:777:1: ( rule__FunctionCall__Group__0 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:777:2: rule__FunctionCall__Group__0
            {
            pushFollow(FOLLOW_rule__FunctionCall__Group__0_in_ruleFunctionCall1600);
            rule__FunctionCall__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionCallAccess().getGroup()); 
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
    // $ANTLR end "ruleFunctionCall"


    // $ANTLR start "entryRuleReturn"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:789:1: entryRuleReturn : ruleReturn EOF ;
    public final void entryRuleReturn() throws RecognitionException {
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:790:1: ( ruleReturn EOF )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:791:1: ruleReturn EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReturnRule()); 
            }
            pushFollow(FOLLOW_ruleReturn_in_entryRuleReturn1627);
            ruleReturn();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReturnRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReturn1634); if (state.failed) return ;

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
    // $ANTLR end "entryRuleReturn"


    // $ANTLR start "ruleReturn"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:798:1: ruleReturn : ( ( rule__Return__Group__0 ) ) ;
    public final void ruleReturn() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:802:2: ( ( ( rule__Return__Group__0 ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:803:1: ( ( rule__Return__Group__0 ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:803:1: ( ( rule__Return__Group__0 ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:804:1: ( rule__Return__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReturnAccess().getGroup()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:805:1: ( rule__Return__Group__0 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:805:2: rule__Return__Group__0
            {
            pushFollow(FOLLOW_rule__Return__Group__0_in_ruleReturn1660);
            rule__Return__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getReturnAccess().getGroup()); 
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
    // $ANTLR end "ruleReturn"


    // $ANTLR start "entryRuleInclude"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:817:1: entryRuleInclude : ruleInclude EOF ;
    public final void entryRuleInclude() throws RecognitionException {
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:818:1: ( ruleInclude EOF )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:819:1: ruleInclude EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIncludeRule()); 
            }
            pushFollow(FOLLOW_ruleInclude_in_entryRuleInclude1687);
            ruleInclude();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIncludeRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInclude1694); if (state.failed) return ;

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
    // $ANTLR end "entryRuleInclude"


    // $ANTLR start "ruleInclude"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:826:1: ruleInclude : ( ( rule__Include__Group__0 ) ) ;
    public final void ruleInclude() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:830:2: ( ( ( rule__Include__Group__0 ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:831:1: ( ( rule__Include__Group__0 ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:831:1: ( ( rule__Include__Group__0 ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:832:1: ( rule__Include__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIncludeAccess().getGroup()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:833:1: ( rule__Include__Group__0 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:833:2: rule__Include__Group__0
            {
            pushFollow(FOLLOW_rule__Include__Group__0_in_ruleInclude1720);
            rule__Include__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIncludeAccess().getGroup()); 
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
    // $ANTLR end "ruleInclude"


    // $ANTLR start "rule__ToplevelStatement__Alternatives"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:845:1: rule__ToplevelStatement__Alternatives : ( ( ( rule__ToplevelStatement__Group_0__0 ) ) | ( ( rule__ToplevelStatement__Group_1__0 ) ) | ( ruleFunctionDeclaration ) | ( ruleStatement ) );
    public final void rule__ToplevelStatement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:849:1: ( ( ( rule__ToplevelStatement__Group_0__0 ) ) | ( ( rule__ToplevelStatement__Group_1__0 ) ) | ( ruleFunctionDeclaration ) | ( ruleStatement ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 47:
                {
                alt2=1;
                }
                break;
            case 31:
                {
                alt2=2;
                }
                break;
            case 29:
                {
                alt2=3;
                }
                break;
            case RULE_ID:
            case 16:
            case 17:
            case 20:
            case 24:
            case 25:
            case 26:
            case 46:
                {
                alt2=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:850:1: ( ( rule__ToplevelStatement__Group_0__0 ) )
                    {
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:850:1: ( ( rule__ToplevelStatement__Group_0__0 ) )
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:851:1: ( rule__ToplevelStatement__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getToplevelStatementAccess().getGroup_0()); 
                    }
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:852:1: ( rule__ToplevelStatement__Group_0__0 )
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:852:2: rule__ToplevelStatement__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__ToplevelStatement__Group_0__0_in_rule__ToplevelStatement__Alternatives1756);
                    rule__ToplevelStatement__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getToplevelStatementAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:856:6: ( ( rule__ToplevelStatement__Group_1__0 ) )
                    {
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:856:6: ( ( rule__ToplevelStatement__Group_1__0 ) )
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:857:1: ( rule__ToplevelStatement__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getToplevelStatementAccess().getGroup_1()); 
                    }
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:858:1: ( rule__ToplevelStatement__Group_1__0 )
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:858:2: rule__ToplevelStatement__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__ToplevelStatement__Group_1__0_in_rule__ToplevelStatement__Alternatives1774);
                    rule__ToplevelStatement__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getToplevelStatementAccess().getGroup_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:862:6: ( ruleFunctionDeclaration )
                    {
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:862:6: ( ruleFunctionDeclaration )
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:863:1: ruleFunctionDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getToplevelStatementAccess().getFunctionDeclarationParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_ruleFunctionDeclaration_in_rule__ToplevelStatement__Alternatives1792);
                    ruleFunctionDeclaration();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getToplevelStatementAccess().getFunctionDeclarationParserRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:868:6: ( ruleStatement )
                    {
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:868:6: ( ruleStatement )
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:869:1: ruleStatement
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getToplevelStatementAccess().getStatementParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_ruleStatement_in_rule__ToplevelStatement__Alternatives1809);
                    ruleStatement();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getToplevelStatementAccess().getStatementParserRuleCall_3()); 
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
    // $ANTLR end "rule__ToplevelStatement__Alternatives"


    // $ANTLR start "rule__Statement__Alternatives"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:879:1: rule__Statement__Alternatives : ( ( ( rule__Statement__Group_0__0 ) ) | ( ( rule__Statement__Group_1__0 ) ) | ( ( rule__Statement__Group_2__0 ) ) | ( ( rule__Statement__Group_3__0 ) ) | ( ruleFor ) | ( ruleWhile ) | ( ruleIf ) | ( ( rule__Statement__Group_7__0 ) ) | ( ruleStatementBlock ) );
    public final void rule__Statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:883:1: ( ( ( rule__Statement__Group_0__0 ) ) | ( ( rule__Statement__Group_1__0 ) ) | ( ( rule__Statement__Group_2__0 ) ) | ( ( rule__Statement__Group_3__0 ) ) | ( ruleFor ) | ( ruleWhile ) | ( ruleIf ) | ( ( rule__Statement__Group_7__0 ) ) | ( ruleStatementBlock ) )
            int alt3=9;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:884:1: ( ( rule__Statement__Group_0__0 ) )
                    {
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:884:1: ( ( rule__Statement__Group_0__0 ) )
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:885:1: ( rule__Statement__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getGroup_0()); 
                    }
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:886:1: ( rule__Statement__Group_0__0 )
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:886:2: rule__Statement__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Statement__Group_0__0_in_rule__Statement__Alternatives1841);
                    rule__Statement__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStatementAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:890:6: ( ( rule__Statement__Group_1__0 ) )
                    {
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:890:6: ( ( rule__Statement__Group_1__0 ) )
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:891:1: ( rule__Statement__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getGroup_1()); 
                    }
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:892:1: ( rule__Statement__Group_1__0 )
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:892:2: rule__Statement__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Statement__Group_1__0_in_rule__Statement__Alternatives1859);
                    rule__Statement__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStatementAccess().getGroup_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:896:6: ( ( rule__Statement__Group_2__0 ) )
                    {
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:896:6: ( ( rule__Statement__Group_2__0 ) )
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:897:1: ( rule__Statement__Group_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getGroup_2()); 
                    }
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:898:1: ( rule__Statement__Group_2__0 )
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:898:2: rule__Statement__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Statement__Group_2__0_in_rule__Statement__Alternatives1877);
                    rule__Statement__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStatementAccess().getGroup_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:902:6: ( ( rule__Statement__Group_3__0 ) )
                    {
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:902:6: ( ( rule__Statement__Group_3__0 ) )
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:903:1: ( rule__Statement__Group_3__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getGroup_3()); 
                    }
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:904:1: ( rule__Statement__Group_3__0 )
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:904:2: rule__Statement__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Statement__Group_3__0_in_rule__Statement__Alternatives1895);
                    rule__Statement__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStatementAccess().getGroup_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:908:6: ( ruleFor )
                    {
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:908:6: ( ruleFor )
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:909:1: ruleFor
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getForParserRuleCall_4()); 
                    }
                    pushFollow(FOLLOW_ruleFor_in_rule__Statement__Alternatives1913);
                    ruleFor();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStatementAccess().getForParserRuleCall_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:914:6: ( ruleWhile )
                    {
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:914:6: ( ruleWhile )
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:915:1: ruleWhile
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getWhileParserRuleCall_5()); 
                    }
                    pushFollow(FOLLOW_ruleWhile_in_rule__Statement__Alternatives1930);
                    ruleWhile();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStatementAccess().getWhileParserRuleCall_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:920:6: ( ruleIf )
                    {
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:920:6: ( ruleIf )
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:921:1: ruleIf
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getIfParserRuleCall_6()); 
                    }
                    pushFollow(FOLLOW_ruleIf_in_rule__Statement__Alternatives1947);
                    ruleIf();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStatementAccess().getIfParserRuleCall_6()); 
                    }

                    }


                    }
                    break;
                case 8 :
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:926:6: ( ( rule__Statement__Group_7__0 ) )
                    {
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:926:6: ( ( rule__Statement__Group_7__0 ) )
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:927:1: ( rule__Statement__Group_7__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getGroup_7()); 
                    }
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:928:1: ( rule__Statement__Group_7__0 )
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:928:2: rule__Statement__Group_7__0
                    {
                    pushFollow(FOLLOW_rule__Statement__Group_7__0_in_rule__Statement__Alternatives1964);
                    rule__Statement__Group_7__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStatementAccess().getGroup_7()); 
                    }

                    }


                    }
                    break;
                case 9 :
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:932:6: ( ruleStatementBlock )
                    {
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:932:6: ( ruleStatementBlock )
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:933:1: ruleStatementBlock
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getStatementBlockParserRuleCall_8()); 
                    }
                    pushFollow(FOLLOW_ruleStatementBlock_in_rule__Statement__Alternatives1982);
                    ruleStatementBlock();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStatementAccess().getStatementBlockParserRuleCall_8()); 
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
    // $ANTLR end "rule__Statement__Alternatives"


    // $ANTLR start "rule__ForIterator__Alternatives"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:943:1: rule__ForIterator__Alternatives : ( ( ruleEachIterator ) | ( ruleVariableIterator ) );
    public final void rule__ForIterator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:947:1: ( ( ruleEachIterator ) | ( ruleVariableIterator ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==26) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_ID) ) {
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
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:948:1: ( ruleEachIterator )
                    {
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:948:1: ( ruleEachIterator )
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:949:1: ruleEachIterator
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getForIteratorAccess().getEachIteratorParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleEachIterator_in_rule__ForIterator__Alternatives2014);
                    ruleEachIterator();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getForIteratorAccess().getEachIteratorParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:954:6: ( ruleVariableIterator )
                    {
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:954:6: ( ruleVariableIterator )
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:955:1: ruleVariableIterator
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getForIteratorAccess().getVariableIteratorParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleVariableIterator_in_rule__ForIterator__Alternatives2031);
                    ruleVariableIterator();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getForIteratorAccess().getVariableIteratorParserRuleCall_1()); 
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
    // $ANTLR end "rule__ForIterator__Alternatives"


    // $ANTLR start "rule__Comparison__Alternatives_1_0"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:965:1: rule__Comparison__Alternatives_1_0 : ( ( ( rule__Comparison__Group_1_0_0__0 ) ) | ( ( rule__Comparison__Group_1_0_1__0 ) ) | ( ( rule__Comparison__Group_1_0_2__0 ) ) | ( ( rule__Comparison__Group_1_0_3__0 ) ) | ( ( rule__Comparison__Group_1_0_4__0 ) ) | ( ( rule__Comparison__Group_1_0_5__0 ) ) | ( ( rule__Comparison__Group_1_0_6__0 ) ) | ( ( rule__Comparison__Group_1_0_7__0 ) ) );
    public final void rule__Comparison__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:969:1: ( ( ( rule__Comparison__Group_1_0_0__0 ) ) | ( ( rule__Comparison__Group_1_0_1__0 ) ) | ( ( rule__Comparison__Group_1_0_2__0 ) ) | ( ( rule__Comparison__Group_1_0_3__0 ) ) | ( ( rule__Comparison__Group_1_0_4__0 ) ) | ( ( rule__Comparison__Group_1_0_5__0 ) ) | ( ( rule__Comparison__Group_1_0_6__0 ) ) | ( ( rule__Comparison__Group_1_0_7__0 ) ) )
            int alt5=8;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt5=1;
                }
                break;
            case 33:
                {
                alt5=2;
                }
                break;
            case 34:
                {
                alt5=3;
                }
                break;
            case 35:
                {
                alt5=4;
                }
                break;
            case 36:
                {
                alt5=5;
                }
                break;
            case 37:
                {
                alt5=6;
                }
                break;
            case 38:
                {
                alt5=7;
                }
                break;
            case 39:
                {
                alt5=8;
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
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:970:1: ( ( rule__Comparison__Group_1_0_0__0 ) )
                    {
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:970:1: ( ( rule__Comparison__Group_1_0_0__0 ) )
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:971:1: ( rule__Comparison__Group_1_0_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComparisonAccess().getGroup_1_0_0()); 
                    }
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:972:1: ( rule__Comparison__Group_1_0_0__0 )
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:972:2: rule__Comparison__Group_1_0_0__0
                    {
                    pushFollow(FOLLOW_rule__Comparison__Group_1_0_0__0_in_rule__Comparison__Alternatives_1_02063);
                    rule__Comparison__Group_1_0_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getComparisonAccess().getGroup_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:976:6: ( ( rule__Comparison__Group_1_0_1__0 ) )
                    {
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:976:6: ( ( rule__Comparison__Group_1_0_1__0 ) )
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:977:1: ( rule__Comparison__Group_1_0_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComparisonAccess().getGroup_1_0_1()); 
                    }
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:978:1: ( rule__Comparison__Group_1_0_1__0 )
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:978:2: rule__Comparison__Group_1_0_1__0
                    {
                    pushFollow(FOLLOW_rule__Comparison__Group_1_0_1__0_in_rule__Comparison__Alternatives_1_02081);
                    rule__Comparison__Group_1_0_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getComparisonAccess().getGroup_1_0_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:982:6: ( ( rule__Comparison__Group_1_0_2__0 ) )
                    {
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:982:6: ( ( rule__Comparison__Group_1_0_2__0 ) )
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:983:1: ( rule__Comparison__Group_1_0_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComparisonAccess().getGroup_1_0_2()); 
                    }
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:984:1: ( rule__Comparison__Group_1_0_2__0 )
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:984:2: rule__Comparison__Group_1_0_2__0
                    {
                    pushFollow(FOLLOW_rule__Comparison__Group_1_0_2__0_in_rule__Comparison__Alternatives_1_02099);
                    rule__Comparison__Group_1_0_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getComparisonAccess().getGroup_1_0_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:988:6: ( ( rule__Comparison__Group_1_0_3__0 ) )
                    {
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:988:6: ( ( rule__Comparison__Group_1_0_3__0 ) )
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:989:1: ( rule__Comparison__Group_1_0_3__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComparisonAccess().getGroup_1_0_3()); 
                    }
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:990:1: ( rule__Comparison__Group_1_0_3__0 )
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:990:2: rule__Comparison__Group_1_0_3__0
                    {
                    pushFollow(FOLLOW_rule__Comparison__Group_1_0_3__0_in_rule__Comparison__Alternatives_1_02117);
                    rule__Comparison__Group_1_0_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getComparisonAccess().getGroup_1_0_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:994:6: ( ( rule__Comparison__Group_1_0_4__0 ) )
                    {
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:994:6: ( ( rule__Comparison__Group_1_0_4__0 ) )
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:995:1: ( rule__Comparison__Group_1_0_4__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComparisonAccess().getGroup_1_0_4()); 
                    }
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:996:1: ( rule__Comparison__Group_1_0_4__0 )
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:996:2: rule__Comparison__Group_1_0_4__0
                    {
                    pushFollow(FOLLOW_rule__Comparison__Group_1_0_4__0_in_rule__Comparison__Alternatives_1_02135);
                    rule__Comparison__Group_1_0_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getComparisonAccess().getGroup_1_0_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1000:6: ( ( rule__Comparison__Group_1_0_5__0 ) )
                    {
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1000:6: ( ( rule__Comparison__Group_1_0_5__0 ) )
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1001:1: ( rule__Comparison__Group_1_0_5__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComparisonAccess().getGroup_1_0_5()); 
                    }
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1002:1: ( rule__Comparison__Group_1_0_5__0 )
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1002:2: rule__Comparison__Group_1_0_5__0
                    {
                    pushFollow(FOLLOW_rule__Comparison__Group_1_0_5__0_in_rule__Comparison__Alternatives_1_02153);
                    rule__Comparison__Group_1_0_5__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getComparisonAccess().getGroup_1_0_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1006:6: ( ( rule__Comparison__Group_1_0_6__0 ) )
                    {
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1006:6: ( ( rule__Comparison__Group_1_0_6__0 ) )
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1007:1: ( rule__Comparison__Group_1_0_6__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComparisonAccess().getGroup_1_0_6()); 
                    }
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1008:1: ( rule__Comparison__Group_1_0_6__0 )
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1008:2: rule__Comparison__Group_1_0_6__0
                    {
                    pushFollow(FOLLOW_rule__Comparison__Group_1_0_6__0_in_rule__Comparison__Alternatives_1_02171);
                    rule__Comparison__Group_1_0_6__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getComparisonAccess().getGroup_1_0_6()); 
                    }

                    }


                    }
                    break;
                case 8 :
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1012:6: ( ( rule__Comparison__Group_1_0_7__0 ) )
                    {
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1012:6: ( ( rule__Comparison__Group_1_0_7__0 ) )
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1013:1: ( rule__Comparison__Group_1_0_7__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComparisonAccess().getGroup_1_0_7()); 
                    }
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1014:1: ( rule__Comparison__Group_1_0_7__0 )
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1014:2: rule__Comparison__Group_1_0_7__0
                    {
                    pushFollow(FOLLOW_rule__Comparison__Group_1_0_7__0_in_rule__Comparison__Alternatives_1_02189);
                    rule__Comparison__Group_1_0_7__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getComparisonAccess().getGroup_1_0_7()); 
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
    // $ANTLR end "rule__Comparison__Alternatives_1_0"


    // $ANTLR start "rule__Or__Alternatives_1_0_1"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1023:1: rule__Or__Alternatives_1_0_1 : ( ( 'or' ) | ( '||' ) );
    public final void rule__Or__Alternatives_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1027:1: ( ( 'or' ) | ( '||' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==12) ) {
                alt6=1;
            }
            else if ( (LA6_0==13) ) {
                alt6=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1028:1: ( 'or' )
                    {
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1028:1: ( 'or' )
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1029:1: 'or'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOrAccess().getOrKeyword_1_0_1_0()); 
                    }
                    match(input,12,FOLLOW_12_in_rule__Or__Alternatives_1_0_12223); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOrAccess().getOrKeyword_1_0_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1036:6: ( '||' )
                    {
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1036:6: ( '||' )
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1037:1: '||'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOrAccess().getVerticalLineVerticalLineKeyword_1_0_1_1()); 
                    }
                    match(input,13,FOLLOW_13_in_rule__Or__Alternatives_1_0_12243); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOrAccess().getVerticalLineVerticalLineKeyword_1_0_1_1()); 
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
    // $ANTLR end "rule__Or__Alternatives_1_0_1"


    // $ANTLR start "rule__And__Alternatives_1_0_1"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1049:1: rule__And__Alternatives_1_0_1 : ( ( 'and' ) | ( '&&' ) );
    public final void rule__And__Alternatives_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1053:1: ( ( 'and' ) | ( '&&' ) )
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
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1054:1: ( 'and' )
                    {
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1054:1: ( 'and' )
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1055:1: 'and'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAndAccess().getAndKeyword_1_0_1_0()); 
                    }
                    match(input,14,FOLLOW_14_in_rule__And__Alternatives_1_0_12278); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAndAccess().getAndKeyword_1_0_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1062:6: ( '&&' )
                    {
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1062:6: ( '&&' )
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1063:1: '&&'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAndAccess().getAmpersandAmpersandKeyword_1_0_1_1()); 
                    }
                    match(input,15,FOLLOW_15_in_rule__And__Alternatives_1_0_12298); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAndAccess().getAmpersandAmpersandKeyword_1_0_1_1()); 
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
    // $ANTLR end "rule__And__Alternatives_1_0_1"


    // $ANTLR start "rule__Addition__Alternatives_1_0"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1075:1: rule__Addition__Alternatives_1_0 : ( ( ( rule__Addition__Group_1_0_0__0 ) ) | ( ( rule__Addition__Group_1_0_1__0 ) ) );
    public final void rule__Addition__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1079:1: ( ( ( rule__Addition__Group_1_0_0__0 ) ) | ( ( rule__Addition__Group_1_0_1__0 ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==40) ) {
                alt8=1;
            }
            else if ( (LA8_0==41) ) {
                alt8=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1080:1: ( ( rule__Addition__Group_1_0_0__0 ) )
                    {
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1080:1: ( ( rule__Addition__Group_1_0_0__0 ) )
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1081:1: ( rule__Addition__Group_1_0_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAdditionAccess().getGroup_1_0_0()); 
                    }
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1082:1: ( rule__Addition__Group_1_0_0__0 )
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1082:2: rule__Addition__Group_1_0_0__0
                    {
                    pushFollow(FOLLOW_rule__Addition__Group_1_0_0__0_in_rule__Addition__Alternatives_1_02332);
                    rule__Addition__Group_1_0_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAdditionAccess().getGroup_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1086:6: ( ( rule__Addition__Group_1_0_1__0 ) )
                    {
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1086:6: ( ( rule__Addition__Group_1_0_1__0 ) )
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1087:1: ( rule__Addition__Group_1_0_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAdditionAccess().getGroup_1_0_1()); 
                    }
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1088:1: ( rule__Addition__Group_1_0_1__0 )
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1088:2: rule__Addition__Group_1_0_1__0
                    {
                    pushFollow(FOLLOW_rule__Addition__Group_1_0_1__0_in_rule__Addition__Alternatives_1_02350);
                    rule__Addition__Group_1_0_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAdditionAccess().getGroup_1_0_1()); 
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
    // $ANTLR end "rule__Addition__Alternatives_1_0"


    // $ANTLR start "rule__Multiplication__Alternatives_1_0"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1097:1: rule__Multiplication__Alternatives_1_0 : ( ( ( rule__Multiplication__Group_1_0_0__0 ) ) | ( ( rule__Multiplication__Group_1_0_1__0 ) ) );
    public final void rule__Multiplication__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1101:1: ( ( ( rule__Multiplication__Group_1_0_0__0 ) ) | ( ( rule__Multiplication__Group_1_0_1__0 ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==42) ) {
                alt9=1;
            }
            else if ( (LA9_0==43) ) {
                alt9=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1102:1: ( ( rule__Multiplication__Group_1_0_0__0 ) )
                    {
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1102:1: ( ( rule__Multiplication__Group_1_0_0__0 ) )
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1103:1: ( rule__Multiplication__Group_1_0_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMultiplicationAccess().getGroup_1_0_0()); 
                    }
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1104:1: ( rule__Multiplication__Group_1_0_0__0 )
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1104:2: rule__Multiplication__Group_1_0_0__0
                    {
                    pushFollow(FOLLOW_rule__Multiplication__Group_1_0_0__0_in_rule__Multiplication__Alternatives_1_02383);
                    rule__Multiplication__Group_1_0_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMultiplicationAccess().getGroup_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1108:6: ( ( rule__Multiplication__Group_1_0_1__0 ) )
                    {
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1108:6: ( ( rule__Multiplication__Group_1_0_1__0 ) )
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1109:1: ( rule__Multiplication__Group_1_0_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMultiplicationAccess().getGroup_1_0_1()); 
                    }
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1110:1: ( rule__Multiplication__Group_1_0_1__0 )
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1110:2: rule__Multiplication__Group_1_0_1__0
                    {
                    pushFollow(FOLLOW_rule__Multiplication__Group_1_0_1__0_in_rule__Multiplication__Alternatives_1_02401);
                    rule__Multiplication__Group_1_0_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMultiplicationAccess().getGroup_1_0_1()); 
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
    // $ANTLR end "rule__Multiplication__Alternatives_1_0"


    // $ANTLR start "rule__PrimaryExpression__Alternatives"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1119:1: rule__PrimaryExpression__Alternatives : ( ( ( rule__PrimaryExpression__Group_0__0 ) ) | ( ( rule__PrimaryExpression__Group_1__0 ) ) | ( ( rule__PrimaryExpression__Group_2__0 ) ) | ( ruleFunctionCall ) | ( ruleVariableReference ) | ( ( rule__PrimaryExpression__Group_5__0 ) ) | ( ruleArrayLiteral ) | ( ruleFunctionDeclaration ) );
    public final void rule__PrimaryExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1123:1: ( ( ( rule__PrimaryExpression__Group_0__0 ) ) | ( ( rule__PrimaryExpression__Group_1__0 ) ) | ( ( rule__PrimaryExpression__Group_2__0 ) ) | ( ruleFunctionCall ) | ( ruleVariableReference ) | ( ( rule__PrimaryExpression__Group_5__0 ) ) | ( ruleArrayLiteral ) | ( ruleFunctionDeclaration ) )
            int alt10=8;
            alt10 = dfa10.predict(input);
            switch (alt10) {
                case 1 :
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1124:1: ( ( rule__PrimaryExpression__Group_0__0 ) )
                    {
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1124:1: ( ( rule__PrimaryExpression__Group_0__0 ) )
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1125:1: ( rule__PrimaryExpression__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryExpressionAccess().getGroup_0()); 
                    }
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1126:1: ( rule__PrimaryExpression__Group_0__0 )
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1126:2: rule__PrimaryExpression__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__PrimaryExpression__Group_0__0_in_rule__PrimaryExpression__Alternatives2434);
                    rule__PrimaryExpression__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrimaryExpressionAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1130:6: ( ( rule__PrimaryExpression__Group_1__0 ) )
                    {
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1130:6: ( ( rule__PrimaryExpression__Group_1__0 ) )
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1131:1: ( rule__PrimaryExpression__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryExpressionAccess().getGroup_1()); 
                    }
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1132:1: ( rule__PrimaryExpression__Group_1__0 )
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1132:2: rule__PrimaryExpression__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__PrimaryExpression__Group_1__0_in_rule__PrimaryExpression__Alternatives2452);
                    rule__PrimaryExpression__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrimaryExpressionAccess().getGroup_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1136:6: ( ( rule__PrimaryExpression__Group_2__0 ) )
                    {
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1136:6: ( ( rule__PrimaryExpression__Group_2__0 ) )
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1137:1: ( rule__PrimaryExpression__Group_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryExpressionAccess().getGroup_2()); 
                    }
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1138:1: ( rule__PrimaryExpression__Group_2__0 )
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1138:2: rule__PrimaryExpression__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__PrimaryExpression__Group_2__0_in_rule__PrimaryExpression__Alternatives2470);
                    rule__PrimaryExpression__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrimaryExpressionAccess().getGroup_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1142:6: ( ruleFunctionCall )
                    {
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1142:6: ( ruleFunctionCall )
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1143:1: ruleFunctionCall
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryExpressionAccess().getFunctionCallParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_ruleFunctionCall_in_rule__PrimaryExpression__Alternatives2488);
                    ruleFunctionCall();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrimaryExpressionAccess().getFunctionCallParserRuleCall_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1148:6: ( ruleVariableReference )
                    {
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1148:6: ( ruleVariableReference )
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1149:1: ruleVariableReference
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryExpressionAccess().getVariableReferenceParserRuleCall_4()); 
                    }
                    pushFollow(FOLLOW_ruleVariableReference_in_rule__PrimaryExpression__Alternatives2505);
                    ruleVariableReference();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrimaryExpressionAccess().getVariableReferenceParserRuleCall_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1154:6: ( ( rule__PrimaryExpression__Group_5__0 ) )
                    {
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1154:6: ( ( rule__PrimaryExpression__Group_5__0 ) )
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1155:1: ( rule__PrimaryExpression__Group_5__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryExpressionAccess().getGroup_5()); 
                    }
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1156:1: ( rule__PrimaryExpression__Group_5__0 )
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1156:2: rule__PrimaryExpression__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__PrimaryExpression__Group_5__0_in_rule__PrimaryExpression__Alternatives2522);
                    rule__PrimaryExpression__Group_5__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrimaryExpressionAccess().getGroup_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1160:6: ( ruleArrayLiteral )
                    {
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1160:6: ( ruleArrayLiteral )
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1161:1: ruleArrayLiteral
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryExpressionAccess().getArrayLiteralParserRuleCall_6()); 
                    }
                    pushFollow(FOLLOW_ruleArrayLiteral_in_rule__PrimaryExpression__Alternatives2540);
                    ruleArrayLiteral();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrimaryExpressionAccess().getArrayLiteralParserRuleCall_6()); 
                    }

                    }


                    }
                    break;
                case 8 :
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1166:6: ( ruleFunctionDeclaration )
                    {
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1166:6: ( ruleFunctionDeclaration )
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1167:1: ruleFunctionDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryExpressionAccess().getFunctionDeclarationParserRuleCall_7()); 
                    }
                    pushFollow(FOLLOW_ruleFunctionDeclaration_in_rule__PrimaryExpression__Alternatives2557);
                    ruleFunctionDeclaration();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrimaryExpressionAccess().getFunctionDeclarationParserRuleCall_7()); 
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
    // $ANTLR end "rule__PrimaryExpression__Alternatives"


    // $ANTLR start "rule__ToplevelStatement__Group_0__0"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1179:1: rule__ToplevelStatement__Group_0__0 : rule__ToplevelStatement__Group_0__0__Impl rule__ToplevelStatement__Group_0__1 ;
    public final void rule__ToplevelStatement__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1183:1: ( rule__ToplevelStatement__Group_0__0__Impl rule__ToplevelStatement__Group_0__1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1184:2: rule__ToplevelStatement__Group_0__0__Impl rule__ToplevelStatement__Group_0__1
            {
            pushFollow(FOLLOW_rule__ToplevelStatement__Group_0__0__Impl_in_rule__ToplevelStatement__Group_0__02587);
            rule__ToplevelStatement__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ToplevelStatement__Group_0__1_in_rule__ToplevelStatement__Group_0__02590);
            rule__ToplevelStatement__Group_0__1();

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
    // $ANTLR end "rule__ToplevelStatement__Group_0__0"


    // $ANTLR start "rule__ToplevelStatement__Group_0__0__Impl"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1191:1: rule__ToplevelStatement__Group_0__0__Impl : ( ruleInclude ) ;
    public final void rule__ToplevelStatement__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1195:1: ( ( ruleInclude ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1196:1: ( ruleInclude )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1196:1: ( ruleInclude )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1197:1: ruleInclude
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getToplevelStatementAccess().getIncludeParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleInclude_in_rule__ToplevelStatement__Group_0__0__Impl2617);
            ruleInclude();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getToplevelStatementAccess().getIncludeParserRuleCall_0_0()); 
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
    // $ANTLR end "rule__ToplevelStatement__Group_0__0__Impl"


    // $ANTLR start "rule__ToplevelStatement__Group_0__1"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1208:1: rule__ToplevelStatement__Group_0__1 : rule__ToplevelStatement__Group_0__1__Impl ;
    public final void rule__ToplevelStatement__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1212:1: ( rule__ToplevelStatement__Group_0__1__Impl )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1213:2: rule__ToplevelStatement__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__ToplevelStatement__Group_0__1__Impl_in_rule__ToplevelStatement__Group_0__12646);
            rule__ToplevelStatement__Group_0__1__Impl();

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
    // $ANTLR end "rule__ToplevelStatement__Group_0__1"


    // $ANTLR start "rule__ToplevelStatement__Group_0__1__Impl"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1219:1: rule__ToplevelStatement__Group_0__1__Impl : ( ';' ) ;
    public final void rule__ToplevelStatement__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1223:1: ( ( ';' ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1224:1: ( ';' )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1224:1: ( ';' )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1225:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getToplevelStatementAccess().getSemicolonKeyword_0_1()); 
            }
            match(input,16,FOLLOW_16_in_rule__ToplevelStatement__Group_0__1__Impl2674); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getToplevelStatementAccess().getSemicolonKeyword_0_1()); 
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
    // $ANTLR end "rule__ToplevelStatement__Group_0__1__Impl"


    // $ANTLR start "rule__ToplevelStatement__Group_1__0"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1242:1: rule__ToplevelStatement__Group_1__0 : rule__ToplevelStatement__Group_1__0__Impl rule__ToplevelStatement__Group_1__1 ;
    public final void rule__ToplevelStatement__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1246:1: ( rule__ToplevelStatement__Group_1__0__Impl rule__ToplevelStatement__Group_1__1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1247:2: rule__ToplevelStatement__Group_1__0__Impl rule__ToplevelStatement__Group_1__1
            {
            pushFollow(FOLLOW_rule__ToplevelStatement__Group_1__0__Impl_in_rule__ToplevelStatement__Group_1__02709);
            rule__ToplevelStatement__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ToplevelStatement__Group_1__1_in_rule__ToplevelStatement__Group_1__02712);
            rule__ToplevelStatement__Group_1__1();

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
    // $ANTLR end "rule__ToplevelStatement__Group_1__0"


    // $ANTLR start "rule__ToplevelStatement__Group_1__0__Impl"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1254:1: rule__ToplevelStatement__Group_1__0__Impl : ( ruleGlobalDeclaration ) ;
    public final void rule__ToplevelStatement__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1258:1: ( ( ruleGlobalDeclaration ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1259:1: ( ruleGlobalDeclaration )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1259:1: ( ruleGlobalDeclaration )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1260:1: ruleGlobalDeclaration
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getToplevelStatementAccess().getGlobalDeclarationParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleGlobalDeclaration_in_rule__ToplevelStatement__Group_1__0__Impl2739);
            ruleGlobalDeclaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getToplevelStatementAccess().getGlobalDeclarationParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__ToplevelStatement__Group_1__0__Impl"


    // $ANTLR start "rule__ToplevelStatement__Group_1__1"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1271:1: rule__ToplevelStatement__Group_1__1 : rule__ToplevelStatement__Group_1__1__Impl ;
    public final void rule__ToplevelStatement__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1275:1: ( rule__ToplevelStatement__Group_1__1__Impl )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1276:2: rule__ToplevelStatement__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__ToplevelStatement__Group_1__1__Impl_in_rule__ToplevelStatement__Group_1__12768);
            rule__ToplevelStatement__Group_1__1__Impl();

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
    // $ANTLR end "rule__ToplevelStatement__Group_1__1"


    // $ANTLR start "rule__ToplevelStatement__Group_1__1__Impl"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1282:1: rule__ToplevelStatement__Group_1__1__Impl : ( ';' ) ;
    public final void rule__ToplevelStatement__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1286:1: ( ( ';' ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1287:1: ( ';' )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1287:1: ( ';' )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1288:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getToplevelStatementAccess().getSemicolonKeyword_1_1()); 
            }
            match(input,16,FOLLOW_16_in_rule__ToplevelStatement__Group_1__1__Impl2796); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getToplevelStatementAccess().getSemicolonKeyword_1_1()); 
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
    // $ANTLR end "rule__ToplevelStatement__Group_1__1__Impl"


    // $ANTLR start "rule__Statement__Group_0__0"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1305:1: rule__Statement__Group_0__0 : rule__Statement__Group_0__0__Impl rule__Statement__Group_0__1 ;
    public final void rule__Statement__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1309:1: ( rule__Statement__Group_0__0__Impl rule__Statement__Group_0__1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1310:2: rule__Statement__Group_0__0__Impl rule__Statement__Group_0__1
            {
            pushFollow(FOLLOW_rule__Statement__Group_0__0__Impl_in_rule__Statement__Group_0__02831);
            rule__Statement__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Statement__Group_0__1_in_rule__Statement__Group_0__02834);
            rule__Statement__Group_0__1();

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
    // $ANTLR end "rule__Statement__Group_0__0"


    // $ANTLR start "rule__Statement__Group_0__0__Impl"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1317:1: rule__Statement__Group_0__0__Impl : ( () ) ;
    public final void rule__Statement__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1321:1: ( ( () ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1322:1: ( () )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1322:1: ( () )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1323:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getEmptyStatementAction_0_0()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1324:1: ()
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1326:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getEmptyStatementAction_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_0__0__Impl"


    // $ANTLR start "rule__Statement__Group_0__1"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1336:1: rule__Statement__Group_0__1 : rule__Statement__Group_0__1__Impl ;
    public final void rule__Statement__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1340:1: ( rule__Statement__Group_0__1__Impl )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1341:2: rule__Statement__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Statement__Group_0__1__Impl_in_rule__Statement__Group_0__12892);
            rule__Statement__Group_0__1__Impl();

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
    // $ANTLR end "rule__Statement__Group_0__1"


    // $ANTLR start "rule__Statement__Group_0__1__Impl"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1347:1: rule__Statement__Group_0__1__Impl : ( ';' ) ;
    public final void rule__Statement__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1351:1: ( ( ';' ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1352:1: ( ';' )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1352:1: ( ';' )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1353:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getSemicolonKeyword_0_1()); 
            }
            match(input,16,FOLLOW_16_in_rule__Statement__Group_0__1__Impl2920); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getSemicolonKeyword_0_1()); 
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
    // $ANTLR end "rule__Statement__Group_0__1__Impl"


    // $ANTLR start "rule__Statement__Group_1__0"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1370:1: rule__Statement__Group_1__0 : rule__Statement__Group_1__0__Impl rule__Statement__Group_1__1 ;
    public final void rule__Statement__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1374:1: ( rule__Statement__Group_1__0__Impl rule__Statement__Group_1__1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1375:2: rule__Statement__Group_1__0__Impl rule__Statement__Group_1__1
            {
            pushFollow(FOLLOW_rule__Statement__Group_1__0__Impl_in_rule__Statement__Group_1__02955);
            rule__Statement__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Statement__Group_1__1_in_rule__Statement__Group_1__02958);
            rule__Statement__Group_1__1();

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
    // $ANTLR end "rule__Statement__Group_1__0"


    // $ANTLR start "rule__Statement__Group_1__0__Impl"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1382:1: rule__Statement__Group_1__0__Impl : ( ruleLocalDeclaration ) ;
    public final void rule__Statement__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1386:1: ( ( ruleLocalDeclaration ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1387:1: ( ruleLocalDeclaration )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1387:1: ( ruleLocalDeclaration )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1388:1: ruleLocalDeclaration
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getLocalDeclarationParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleLocalDeclaration_in_rule__Statement__Group_1__0__Impl2985);
            ruleLocalDeclaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getLocalDeclarationParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__Statement__Group_1__0__Impl"


    // $ANTLR start "rule__Statement__Group_1__1"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1399:1: rule__Statement__Group_1__1 : rule__Statement__Group_1__1__Impl ;
    public final void rule__Statement__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1403:1: ( rule__Statement__Group_1__1__Impl )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1404:2: rule__Statement__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Statement__Group_1__1__Impl_in_rule__Statement__Group_1__13014);
            rule__Statement__Group_1__1__Impl();

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
    // $ANTLR end "rule__Statement__Group_1__1"


    // $ANTLR start "rule__Statement__Group_1__1__Impl"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1410:1: rule__Statement__Group_1__1__Impl : ( ';' ) ;
    public final void rule__Statement__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1414:1: ( ( ';' ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1415:1: ( ';' )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1415:1: ( ';' )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1416:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getSemicolonKeyword_1_1()); 
            }
            match(input,16,FOLLOW_16_in_rule__Statement__Group_1__1__Impl3042); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getSemicolonKeyword_1_1()); 
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
    // $ANTLR end "rule__Statement__Group_1__1__Impl"


    // $ANTLR start "rule__Statement__Group_2__0"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1433:1: rule__Statement__Group_2__0 : rule__Statement__Group_2__0__Impl rule__Statement__Group_2__1 ;
    public final void rule__Statement__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1437:1: ( rule__Statement__Group_2__0__Impl rule__Statement__Group_2__1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1438:2: rule__Statement__Group_2__0__Impl rule__Statement__Group_2__1
            {
            pushFollow(FOLLOW_rule__Statement__Group_2__0__Impl_in_rule__Statement__Group_2__03077);
            rule__Statement__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Statement__Group_2__1_in_rule__Statement__Group_2__03080);
            rule__Statement__Group_2__1();

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
    // $ANTLR end "rule__Statement__Group_2__0"


    // $ANTLR start "rule__Statement__Group_2__0__Impl"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1445:1: rule__Statement__Group_2__0__Impl : ( ruleReturn ) ;
    public final void rule__Statement__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1449:1: ( ( ruleReturn ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1450:1: ( ruleReturn )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1450:1: ( ruleReturn )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1451:1: ruleReturn
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getReturnParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleReturn_in_rule__Statement__Group_2__0__Impl3107);
            ruleReturn();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getReturnParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__Statement__Group_2__0__Impl"


    // $ANTLR start "rule__Statement__Group_2__1"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1462:1: rule__Statement__Group_2__1 : rule__Statement__Group_2__1__Impl ;
    public final void rule__Statement__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1466:1: ( rule__Statement__Group_2__1__Impl )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1467:2: rule__Statement__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Statement__Group_2__1__Impl_in_rule__Statement__Group_2__13136);
            rule__Statement__Group_2__1__Impl();

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
    // $ANTLR end "rule__Statement__Group_2__1"


    // $ANTLR start "rule__Statement__Group_2__1__Impl"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1473:1: rule__Statement__Group_2__1__Impl : ( ';' ) ;
    public final void rule__Statement__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1477:1: ( ( ';' ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1478:1: ( ';' )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1478:1: ( ';' )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1479:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getSemicolonKeyword_2_1()); 
            }
            match(input,16,FOLLOW_16_in_rule__Statement__Group_2__1__Impl3164); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getSemicolonKeyword_2_1()); 
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
    // $ANTLR end "rule__Statement__Group_2__1__Impl"


    // $ANTLR start "rule__Statement__Group_3__0"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1496:1: rule__Statement__Group_3__0 : rule__Statement__Group_3__0__Impl rule__Statement__Group_3__1 ;
    public final void rule__Statement__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1500:1: ( rule__Statement__Group_3__0__Impl rule__Statement__Group_3__1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1501:2: rule__Statement__Group_3__0__Impl rule__Statement__Group_3__1
            {
            pushFollow(FOLLOW_rule__Statement__Group_3__0__Impl_in_rule__Statement__Group_3__03199);
            rule__Statement__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Statement__Group_3__1_in_rule__Statement__Group_3__03202);
            rule__Statement__Group_3__1();

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
    // $ANTLR end "rule__Statement__Group_3__0"


    // $ANTLR start "rule__Statement__Group_3__0__Impl"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1508:1: rule__Statement__Group_3__0__Impl : ( ruleFunctionCall ) ;
    public final void rule__Statement__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1512:1: ( ( ruleFunctionCall ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1513:1: ( ruleFunctionCall )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1513:1: ( ruleFunctionCall )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1514:1: ruleFunctionCall
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getFunctionCallParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleFunctionCall_in_rule__Statement__Group_3__0__Impl3229);
            ruleFunctionCall();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getFunctionCallParserRuleCall_3_0()); 
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
    // $ANTLR end "rule__Statement__Group_3__0__Impl"


    // $ANTLR start "rule__Statement__Group_3__1"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1525:1: rule__Statement__Group_3__1 : rule__Statement__Group_3__1__Impl ;
    public final void rule__Statement__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1529:1: ( rule__Statement__Group_3__1__Impl )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1530:2: rule__Statement__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Statement__Group_3__1__Impl_in_rule__Statement__Group_3__13258);
            rule__Statement__Group_3__1__Impl();

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
    // $ANTLR end "rule__Statement__Group_3__1"


    // $ANTLR start "rule__Statement__Group_3__1__Impl"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1536:1: rule__Statement__Group_3__1__Impl : ( ';' ) ;
    public final void rule__Statement__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1540:1: ( ( ';' ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1541:1: ( ';' )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1541:1: ( ';' )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1542:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getSemicolonKeyword_3_1()); 
            }
            match(input,16,FOLLOW_16_in_rule__Statement__Group_3__1__Impl3286); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getSemicolonKeyword_3_1()); 
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
    // $ANTLR end "rule__Statement__Group_3__1__Impl"


    // $ANTLR start "rule__Statement__Group_7__0"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1559:1: rule__Statement__Group_7__0 : rule__Statement__Group_7__0__Impl rule__Statement__Group_7__1 ;
    public final void rule__Statement__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1563:1: ( rule__Statement__Group_7__0__Impl rule__Statement__Group_7__1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1564:2: rule__Statement__Group_7__0__Impl rule__Statement__Group_7__1
            {
            pushFollow(FOLLOW_rule__Statement__Group_7__0__Impl_in_rule__Statement__Group_7__03321);
            rule__Statement__Group_7__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Statement__Group_7__1_in_rule__Statement__Group_7__03324);
            rule__Statement__Group_7__1();

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
    // $ANTLR end "rule__Statement__Group_7__0"


    // $ANTLR start "rule__Statement__Group_7__0__Impl"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1571:1: rule__Statement__Group_7__0__Impl : ( ruleAffectation ) ;
    public final void rule__Statement__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1575:1: ( ( ruleAffectation ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1576:1: ( ruleAffectation )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1576:1: ( ruleAffectation )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1577:1: ruleAffectation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getAffectationParserRuleCall_7_0()); 
            }
            pushFollow(FOLLOW_ruleAffectation_in_rule__Statement__Group_7__0__Impl3351);
            ruleAffectation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getAffectationParserRuleCall_7_0()); 
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
    // $ANTLR end "rule__Statement__Group_7__0__Impl"


    // $ANTLR start "rule__Statement__Group_7__1"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1588:1: rule__Statement__Group_7__1 : rule__Statement__Group_7__1__Impl ;
    public final void rule__Statement__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1592:1: ( rule__Statement__Group_7__1__Impl )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1593:2: rule__Statement__Group_7__1__Impl
            {
            pushFollow(FOLLOW_rule__Statement__Group_7__1__Impl_in_rule__Statement__Group_7__13380);
            rule__Statement__Group_7__1__Impl();

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
    // $ANTLR end "rule__Statement__Group_7__1"


    // $ANTLR start "rule__Statement__Group_7__1__Impl"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1599:1: rule__Statement__Group_7__1__Impl : ( ';' ) ;
    public final void rule__Statement__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1603:1: ( ( ';' ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1604:1: ( ';' )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1604:1: ( ';' )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1605:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getSemicolonKeyword_7_1()); 
            }
            match(input,16,FOLLOW_16_in_rule__Statement__Group_7__1__Impl3408); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getSemicolonKeyword_7_1()); 
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
    // $ANTLR end "rule__Statement__Group_7__1__Impl"


    // $ANTLR start "rule__StatementBlock__Group__0"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1622:1: rule__StatementBlock__Group__0 : rule__StatementBlock__Group__0__Impl rule__StatementBlock__Group__1 ;
    public final void rule__StatementBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1626:1: ( rule__StatementBlock__Group__0__Impl rule__StatementBlock__Group__1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1627:2: rule__StatementBlock__Group__0__Impl rule__StatementBlock__Group__1
            {
            pushFollow(FOLLOW_rule__StatementBlock__Group__0__Impl_in_rule__StatementBlock__Group__03443);
            rule__StatementBlock__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__StatementBlock__Group__1_in_rule__StatementBlock__Group__03446);
            rule__StatementBlock__Group__1();

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
    // $ANTLR end "rule__StatementBlock__Group__0"


    // $ANTLR start "rule__StatementBlock__Group__0__Impl"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1634:1: rule__StatementBlock__Group__0__Impl : ( '{' ) ;
    public final void rule__StatementBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1638:1: ( ( '{' ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1639:1: ( '{' )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1639:1: ( '{' )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1640:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementBlockAccess().getLeftCurlyBracketKeyword_0()); 
            }
            match(input,17,FOLLOW_17_in_rule__StatementBlock__Group__0__Impl3474); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementBlockAccess().getLeftCurlyBracketKeyword_0()); 
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
    // $ANTLR end "rule__StatementBlock__Group__0__Impl"


    // $ANTLR start "rule__StatementBlock__Group__1"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1653:1: rule__StatementBlock__Group__1 : rule__StatementBlock__Group__1__Impl rule__StatementBlock__Group__2 ;
    public final void rule__StatementBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1657:1: ( rule__StatementBlock__Group__1__Impl rule__StatementBlock__Group__2 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1658:2: rule__StatementBlock__Group__1__Impl rule__StatementBlock__Group__2
            {
            pushFollow(FOLLOW_rule__StatementBlock__Group__1__Impl_in_rule__StatementBlock__Group__13505);
            rule__StatementBlock__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__StatementBlock__Group__2_in_rule__StatementBlock__Group__13508);
            rule__StatementBlock__Group__2();

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
    // $ANTLR end "rule__StatementBlock__Group__1"


    // $ANTLR start "rule__StatementBlock__Group__1__Impl"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1665:1: rule__StatementBlock__Group__1__Impl : ( () ) ;
    public final void rule__StatementBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1669:1: ( ( () ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1670:1: ( () )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1670:1: ( () )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1671:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementBlockAccess().getStatementBlockAction_1()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1672:1: ()
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1674:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementBlockAccess().getStatementBlockAction_1()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StatementBlock__Group__1__Impl"


    // $ANTLR start "rule__StatementBlock__Group__2"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1684:1: rule__StatementBlock__Group__2 : rule__StatementBlock__Group__2__Impl rule__StatementBlock__Group__3 ;
    public final void rule__StatementBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1688:1: ( rule__StatementBlock__Group__2__Impl rule__StatementBlock__Group__3 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1689:2: rule__StatementBlock__Group__2__Impl rule__StatementBlock__Group__3
            {
            pushFollow(FOLLOW_rule__StatementBlock__Group__2__Impl_in_rule__StatementBlock__Group__23566);
            rule__StatementBlock__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__StatementBlock__Group__3_in_rule__StatementBlock__Group__23569);
            rule__StatementBlock__Group__3();

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
    // $ANTLR end "rule__StatementBlock__Group__2"


    // $ANTLR start "rule__StatementBlock__Group__2__Impl"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1696:1: rule__StatementBlock__Group__2__Impl : ( ( rule__StatementBlock__StatementsAssignment_2 )* ) ;
    public final void rule__StatementBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1700:1: ( ( ( rule__StatementBlock__StatementsAssignment_2 )* ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1701:1: ( ( rule__StatementBlock__StatementsAssignment_2 )* )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1701:1: ( ( rule__StatementBlock__StatementsAssignment_2 )* )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1702:1: ( rule__StatementBlock__StatementsAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementBlockAccess().getStatementsAssignment_2()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1703:1: ( rule__StatementBlock__StatementsAssignment_2 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID||(LA11_0>=16 && LA11_0<=17)||LA11_0==20||(LA11_0>=24 && LA11_0<=26)||LA11_0==46) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1703:2: rule__StatementBlock__StatementsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__StatementBlock__StatementsAssignment_2_in_rule__StatementBlock__Group__2__Impl3596);
            	    rule__StatementBlock__StatementsAssignment_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementBlockAccess().getStatementsAssignment_2()); 
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
    // $ANTLR end "rule__StatementBlock__Group__2__Impl"


    // $ANTLR start "rule__StatementBlock__Group__3"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1713:1: rule__StatementBlock__Group__3 : rule__StatementBlock__Group__3__Impl ;
    public final void rule__StatementBlock__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1717:1: ( rule__StatementBlock__Group__3__Impl )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1718:2: rule__StatementBlock__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__StatementBlock__Group__3__Impl_in_rule__StatementBlock__Group__33627);
            rule__StatementBlock__Group__3__Impl();

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
    // $ANTLR end "rule__StatementBlock__Group__3"


    // $ANTLR start "rule__StatementBlock__Group__3__Impl"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1724:1: rule__StatementBlock__Group__3__Impl : ( '}' ) ;
    public final void rule__StatementBlock__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1728:1: ( ( '}' ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1729:1: ( '}' )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1729:1: ( '}' )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1730:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementBlockAccess().getRightCurlyBracketKeyword_3()); 
            }
            match(input,18,FOLLOW_18_in_rule__StatementBlock__Group__3__Impl3655); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementBlockAccess().getRightCurlyBracketKeyword_3()); 
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
    // $ANTLR end "rule__StatementBlock__Group__3__Impl"


    // $ANTLR start "rule__Affectation__Group__0"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1751:1: rule__Affectation__Group__0 : rule__Affectation__Group__0__Impl rule__Affectation__Group__1 ;
    public final void rule__Affectation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1755:1: ( rule__Affectation__Group__0__Impl rule__Affectation__Group__1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1756:2: rule__Affectation__Group__0__Impl rule__Affectation__Group__1
            {
            pushFollow(FOLLOW_rule__Affectation__Group__0__Impl_in_rule__Affectation__Group__03694);
            rule__Affectation__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Affectation__Group__1_in_rule__Affectation__Group__03697);
            rule__Affectation__Group__1();

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
    // $ANTLR end "rule__Affectation__Group__0"


    // $ANTLR start "rule__Affectation__Group__0__Impl"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1763:1: rule__Affectation__Group__0__Impl : ( ( rule__Affectation__VariableAssignment_0 ) ) ;
    public final void rule__Affectation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1767:1: ( ( ( rule__Affectation__VariableAssignment_0 ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1768:1: ( ( rule__Affectation__VariableAssignment_0 ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1768:1: ( ( rule__Affectation__VariableAssignment_0 ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1769:1: ( rule__Affectation__VariableAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAffectationAccess().getVariableAssignment_0()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1770:1: ( rule__Affectation__VariableAssignment_0 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1770:2: rule__Affectation__VariableAssignment_0
            {
            pushFollow(FOLLOW_rule__Affectation__VariableAssignment_0_in_rule__Affectation__Group__0__Impl3724);
            rule__Affectation__VariableAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAffectationAccess().getVariableAssignment_0()); 
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
    // $ANTLR end "rule__Affectation__Group__0__Impl"


    // $ANTLR start "rule__Affectation__Group__1"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1780:1: rule__Affectation__Group__1 : rule__Affectation__Group__1__Impl rule__Affectation__Group__2 ;
    public final void rule__Affectation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1784:1: ( rule__Affectation__Group__1__Impl rule__Affectation__Group__2 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1785:2: rule__Affectation__Group__1__Impl rule__Affectation__Group__2
            {
            pushFollow(FOLLOW_rule__Affectation__Group__1__Impl_in_rule__Affectation__Group__13754);
            rule__Affectation__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Affectation__Group__2_in_rule__Affectation__Group__13757);
            rule__Affectation__Group__2();

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
    // $ANTLR end "rule__Affectation__Group__1"


    // $ANTLR start "rule__Affectation__Group__1__Impl"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1792:1: rule__Affectation__Group__1__Impl : ( '=' ) ;
    public final void rule__Affectation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1796:1: ( ( '=' ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1797:1: ( '=' )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1797:1: ( '=' )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1798:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAffectationAccess().getEqualsSignKeyword_1()); 
            }
            match(input,19,FOLLOW_19_in_rule__Affectation__Group__1__Impl3785); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAffectationAccess().getEqualsSignKeyword_1()); 
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
    // $ANTLR end "rule__Affectation__Group__1__Impl"


    // $ANTLR start "rule__Affectation__Group__2"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1811:1: rule__Affectation__Group__2 : rule__Affectation__Group__2__Impl ;
    public final void rule__Affectation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1815:1: ( rule__Affectation__Group__2__Impl )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1816:2: rule__Affectation__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Affectation__Group__2__Impl_in_rule__Affectation__Group__23816);
            rule__Affectation__Group__2__Impl();

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
    // $ANTLR end "rule__Affectation__Group__2"


    // $ANTLR start "rule__Affectation__Group__2__Impl"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1822:1: rule__Affectation__Group__2__Impl : ( ( rule__Affectation__ValueAssignment_2 ) ) ;
    public final void rule__Affectation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1826:1: ( ( ( rule__Affectation__ValueAssignment_2 ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1827:1: ( ( rule__Affectation__ValueAssignment_2 ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1827:1: ( ( rule__Affectation__ValueAssignment_2 ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1828:1: ( rule__Affectation__ValueAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAffectationAccess().getValueAssignment_2()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1829:1: ( rule__Affectation__ValueAssignment_2 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1829:2: rule__Affectation__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__Affectation__ValueAssignment_2_in_rule__Affectation__Group__2__Impl3843);
            rule__Affectation__ValueAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAffectationAccess().getValueAssignment_2()); 
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
    // $ANTLR end "rule__Affectation__Group__2__Impl"


    // $ANTLR start "rule__If__Group__0"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1845:1: rule__If__Group__0 : rule__If__Group__0__Impl rule__If__Group__1 ;
    public final void rule__If__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1849:1: ( rule__If__Group__0__Impl rule__If__Group__1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1850:2: rule__If__Group__0__Impl rule__If__Group__1
            {
            pushFollow(FOLLOW_rule__If__Group__0__Impl_in_rule__If__Group__03879);
            rule__If__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__If__Group__1_in_rule__If__Group__03882);
            rule__If__Group__1();

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
    // $ANTLR end "rule__If__Group__0"


    // $ANTLR start "rule__If__Group__0__Impl"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1857:1: rule__If__Group__0__Impl : ( 'if' ) ;
    public final void rule__If__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1861:1: ( ( 'if' ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1862:1: ( 'if' )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1862:1: ( 'if' )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1863:1: 'if'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getIfKeyword_0()); 
            }
            match(input,20,FOLLOW_20_in_rule__If__Group__0__Impl3910); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfAccess().getIfKeyword_0()); 
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
    // $ANTLR end "rule__If__Group__0__Impl"


    // $ANTLR start "rule__If__Group__1"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1876:1: rule__If__Group__1 : rule__If__Group__1__Impl rule__If__Group__2 ;
    public final void rule__If__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1880:1: ( rule__If__Group__1__Impl rule__If__Group__2 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1881:2: rule__If__Group__1__Impl rule__If__Group__2
            {
            pushFollow(FOLLOW_rule__If__Group__1__Impl_in_rule__If__Group__13941);
            rule__If__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__If__Group__2_in_rule__If__Group__13944);
            rule__If__Group__2();

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
    // $ANTLR end "rule__If__Group__1"


    // $ANTLR start "rule__If__Group__1__Impl"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1888:1: rule__If__Group__1__Impl : ( '(' ) ;
    public final void rule__If__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1892:1: ( ( '(' ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1893:1: ( '(' )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1893:1: ( '(' )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1894:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,21,FOLLOW_21_in_rule__If__Group__1__Impl3972); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfAccess().getLeftParenthesisKeyword_1()); 
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
    // $ANTLR end "rule__If__Group__1__Impl"


    // $ANTLR start "rule__If__Group__2"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1907:1: rule__If__Group__2 : rule__If__Group__2__Impl rule__If__Group__3 ;
    public final void rule__If__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1911:1: ( rule__If__Group__2__Impl rule__If__Group__3 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1912:2: rule__If__Group__2__Impl rule__If__Group__3
            {
            pushFollow(FOLLOW_rule__If__Group__2__Impl_in_rule__If__Group__24003);
            rule__If__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__If__Group__3_in_rule__If__Group__24006);
            rule__If__Group__3();

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
    // $ANTLR end "rule__If__Group__2"


    // $ANTLR start "rule__If__Group__2__Impl"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1919:1: rule__If__Group__2__Impl : ( ( rule__If__ConditionAssignment_2 ) ) ;
    public final void rule__If__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1923:1: ( ( ( rule__If__ConditionAssignment_2 ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1924:1: ( ( rule__If__ConditionAssignment_2 ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1924:1: ( ( rule__If__ConditionAssignment_2 ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1925:1: ( rule__If__ConditionAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getConditionAssignment_2()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1926:1: ( rule__If__ConditionAssignment_2 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1926:2: rule__If__ConditionAssignment_2
            {
            pushFollow(FOLLOW_rule__If__ConditionAssignment_2_in_rule__If__Group__2__Impl4033);
            rule__If__ConditionAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfAccess().getConditionAssignment_2()); 
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
    // $ANTLR end "rule__If__Group__2__Impl"


    // $ANTLR start "rule__If__Group__3"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1936:1: rule__If__Group__3 : rule__If__Group__3__Impl rule__If__Group__4 ;
    public final void rule__If__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1940:1: ( rule__If__Group__3__Impl rule__If__Group__4 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1941:2: rule__If__Group__3__Impl rule__If__Group__4
            {
            pushFollow(FOLLOW_rule__If__Group__3__Impl_in_rule__If__Group__34063);
            rule__If__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__If__Group__4_in_rule__If__Group__34066);
            rule__If__Group__4();

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
    // $ANTLR end "rule__If__Group__3"


    // $ANTLR start "rule__If__Group__3__Impl"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1948:1: rule__If__Group__3__Impl : ( ')' ) ;
    public final void rule__If__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1952:1: ( ( ')' ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1953:1: ( ')' )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1953:1: ( ')' )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1954:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getRightParenthesisKeyword_3()); 
            }
            match(input,22,FOLLOW_22_in_rule__If__Group__3__Impl4094); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfAccess().getRightParenthesisKeyword_3()); 
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
    // $ANTLR end "rule__If__Group__3__Impl"


    // $ANTLR start "rule__If__Group__4"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1967:1: rule__If__Group__4 : rule__If__Group__4__Impl rule__If__Group__5 ;
    public final void rule__If__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1971:1: ( rule__If__Group__4__Impl rule__If__Group__5 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1972:2: rule__If__Group__4__Impl rule__If__Group__5
            {
            pushFollow(FOLLOW_rule__If__Group__4__Impl_in_rule__If__Group__44125);
            rule__If__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__If__Group__5_in_rule__If__Group__44128);
            rule__If__Group__5();

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
    // $ANTLR end "rule__If__Group__4"


    // $ANTLR start "rule__If__Group__4__Impl"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1979:1: rule__If__Group__4__Impl : ( ( rule__If__ThenAssignment_4 ) ) ;
    public final void rule__If__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1983:1: ( ( ( rule__If__ThenAssignment_4 ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1984:1: ( ( rule__If__ThenAssignment_4 ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1984:1: ( ( rule__If__ThenAssignment_4 ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1985:1: ( rule__If__ThenAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getThenAssignment_4()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1986:1: ( rule__If__ThenAssignment_4 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1986:2: rule__If__ThenAssignment_4
            {
            pushFollow(FOLLOW_rule__If__ThenAssignment_4_in_rule__If__Group__4__Impl4155);
            rule__If__ThenAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfAccess().getThenAssignment_4()); 
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
    // $ANTLR end "rule__If__Group__4__Impl"


    // $ANTLR start "rule__If__Group__5"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1996:1: rule__If__Group__5 : rule__If__Group__5__Impl ;
    public final void rule__If__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2000:1: ( rule__If__Group__5__Impl )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2001:2: rule__If__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__If__Group__5__Impl_in_rule__If__Group__54185);
            rule__If__Group__5__Impl();

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
    // $ANTLR end "rule__If__Group__5"


    // $ANTLR start "rule__If__Group__5__Impl"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2007:1: rule__If__Group__5__Impl : ( ( rule__If__Group_5__0 )? ) ;
    public final void rule__If__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2011:1: ( ( ( rule__If__Group_5__0 )? ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2012:1: ( ( rule__If__Group_5__0 )? )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2012:1: ( ( rule__If__Group_5__0 )? )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2013:1: ( rule__If__Group_5__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getGroup_5()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2014:1: ( rule__If__Group_5__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==23) ) {
                int LA12_1 = input.LA(2);

                if ( (synpred33_InternalLeek()) ) {
                    alt12=1;
                }
            }
            switch (alt12) {
                case 1 :
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2014:2: rule__If__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__If__Group_5__0_in_rule__If__Group__5__Impl4212);
                    rule__If__Group_5__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfAccess().getGroup_5()); 
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
    // $ANTLR end "rule__If__Group__5__Impl"


    // $ANTLR start "rule__If__Group_5__0"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2036:1: rule__If__Group_5__0 : rule__If__Group_5__0__Impl rule__If__Group_5__1 ;
    public final void rule__If__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2040:1: ( rule__If__Group_5__0__Impl rule__If__Group_5__1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2041:2: rule__If__Group_5__0__Impl rule__If__Group_5__1
            {
            pushFollow(FOLLOW_rule__If__Group_5__0__Impl_in_rule__If__Group_5__04255);
            rule__If__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__If__Group_5__1_in_rule__If__Group_5__04258);
            rule__If__Group_5__1();

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
    // $ANTLR end "rule__If__Group_5__0"


    // $ANTLR start "rule__If__Group_5__0__Impl"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2048:1: rule__If__Group_5__0__Impl : ( ( 'else' ) ) ;
    public final void rule__If__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2052:1: ( ( ( 'else' ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2053:1: ( ( 'else' ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2053:1: ( ( 'else' ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2054:1: ( 'else' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getElseKeyword_5_0()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2055:1: ( 'else' )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2056:2: 'else'
            {
            match(input,23,FOLLOW_23_in_rule__If__Group_5__0__Impl4287); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfAccess().getElseKeyword_5_0()); 
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
    // $ANTLR end "rule__If__Group_5__0__Impl"


    // $ANTLR start "rule__If__Group_5__1"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2067:1: rule__If__Group_5__1 : rule__If__Group_5__1__Impl ;
    public final void rule__If__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2071:1: ( rule__If__Group_5__1__Impl )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2072:2: rule__If__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__If__Group_5__1__Impl_in_rule__If__Group_5__14319);
            rule__If__Group_5__1__Impl();

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
    // $ANTLR end "rule__If__Group_5__1"


    // $ANTLR start "rule__If__Group_5__1__Impl"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2078:1: rule__If__Group_5__1__Impl : ( ( rule__If__ElseAssignment_5_1 ) ) ;
    public final void rule__If__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2082:1: ( ( ( rule__If__ElseAssignment_5_1 ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2083:1: ( ( rule__If__ElseAssignment_5_1 ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2083:1: ( ( rule__If__ElseAssignment_5_1 ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2084:1: ( rule__If__ElseAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getElseAssignment_5_1()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2085:1: ( rule__If__ElseAssignment_5_1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2085:2: rule__If__ElseAssignment_5_1
            {
            pushFollow(FOLLOW_rule__If__ElseAssignment_5_1_in_rule__If__Group_5__1__Impl4346);
            rule__If__ElseAssignment_5_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfAccess().getElseAssignment_5_1()); 
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
    // $ANTLR end "rule__If__Group_5__1__Impl"


    // $ANTLR start "rule__While__Group__0"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2099:1: rule__While__Group__0 : rule__While__Group__0__Impl rule__While__Group__1 ;
    public final void rule__While__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2103:1: ( rule__While__Group__0__Impl rule__While__Group__1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2104:2: rule__While__Group__0__Impl rule__While__Group__1
            {
            pushFollow(FOLLOW_rule__While__Group__0__Impl_in_rule__While__Group__04380);
            rule__While__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__While__Group__1_in_rule__While__Group__04383);
            rule__While__Group__1();

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
    // $ANTLR end "rule__While__Group__0"


    // $ANTLR start "rule__While__Group__0__Impl"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2111:1: rule__While__Group__0__Impl : ( 'while' ) ;
    public final void rule__While__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2115:1: ( ( 'while' ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2116:1: ( 'while' )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2116:1: ( 'while' )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2117:1: 'while'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileAccess().getWhileKeyword_0()); 
            }
            match(input,24,FOLLOW_24_in_rule__While__Group__0__Impl4411); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhileAccess().getWhileKeyword_0()); 
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
    // $ANTLR end "rule__While__Group__0__Impl"


    // $ANTLR start "rule__While__Group__1"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2130:1: rule__While__Group__1 : rule__While__Group__1__Impl rule__While__Group__2 ;
    public final void rule__While__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2134:1: ( rule__While__Group__1__Impl rule__While__Group__2 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2135:2: rule__While__Group__1__Impl rule__While__Group__2
            {
            pushFollow(FOLLOW_rule__While__Group__1__Impl_in_rule__While__Group__14442);
            rule__While__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__While__Group__2_in_rule__While__Group__14445);
            rule__While__Group__2();

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
    // $ANTLR end "rule__While__Group__1"


    // $ANTLR start "rule__While__Group__1__Impl"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2142:1: rule__While__Group__1__Impl : ( '(' ) ;
    public final void rule__While__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2146:1: ( ( '(' ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2147:1: ( '(' )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2147:1: ( '(' )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2148:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,21,FOLLOW_21_in_rule__While__Group__1__Impl4473); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhileAccess().getLeftParenthesisKeyword_1()); 
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
    // $ANTLR end "rule__While__Group__1__Impl"


    // $ANTLR start "rule__While__Group__2"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2161:1: rule__While__Group__2 : rule__While__Group__2__Impl rule__While__Group__3 ;
    public final void rule__While__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2165:1: ( rule__While__Group__2__Impl rule__While__Group__3 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2166:2: rule__While__Group__2__Impl rule__While__Group__3
            {
            pushFollow(FOLLOW_rule__While__Group__2__Impl_in_rule__While__Group__24504);
            rule__While__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__While__Group__3_in_rule__While__Group__24507);
            rule__While__Group__3();

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
    // $ANTLR end "rule__While__Group__2"


    // $ANTLR start "rule__While__Group__2__Impl"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2173:1: rule__While__Group__2__Impl : ( ( rule__While__ConditionAssignment_2 ) ) ;
    public final void rule__While__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2177:1: ( ( ( rule__While__ConditionAssignment_2 ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2178:1: ( ( rule__While__ConditionAssignment_2 ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2178:1: ( ( rule__While__ConditionAssignment_2 ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2179:1: ( rule__While__ConditionAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileAccess().getConditionAssignment_2()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2180:1: ( rule__While__ConditionAssignment_2 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2180:2: rule__While__ConditionAssignment_2
            {
            pushFollow(FOLLOW_rule__While__ConditionAssignment_2_in_rule__While__Group__2__Impl4534);
            rule__While__ConditionAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhileAccess().getConditionAssignment_2()); 
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
    // $ANTLR end "rule__While__Group__2__Impl"


    // $ANTLR start "rule__While__Group__3"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2190:1: rule__While__Group__3 : rule__While__Group__3__Impl rule__While__Group__4 ;
    public final void rule__While__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2194:1: ( rule__While__Group__3__Impl rule__While__Group__4 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2195:2: rule__While__Group__3__Impl rule__While__Group__4
            {
            pushFollow(FOLLOW_rule__While__Group__3__Impl_in_rule__While__Group__34564);
            rule__While__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__While__Group__4_in_rule__While__Group__34567);
            rule__While__Group__4();

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
    // $ANTLR end "rule__While__Group__3"


    // $ANTLR start "rule__While__Group__3__Impl"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2202:1: rule__While__Group__3__Impl : ( ')' ) ;
    public final void rule__While__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2206:1: ( ( ')' ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2207:1: ( ')' )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2207:1: ( ')' )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2208:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileAccess().getRightParenthesisKeyword_3()); 
            }
            match(input,22,FOLLOW_22_in_rule__While__Group__3__Impl4595); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhileAccess().getRightParenthesisKeyword_3()); 
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
    // $ANTLR end "rule__While__Group__3__Impl"


    // $ANTLR start "rule__While__Group__4"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2221:1: rule__While__Group__4 : rule__While__Group__4__Impl ;
    public final void rule__While__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2225:1: ( rule__While__Group__4__Impl )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2226:2: rule__While__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__While__Group__4__Impl_in_rule__While__Group__44626);
            rule__While__Group__4__Impl();

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
    // $ANTLR end "rule__While__Group__4"


    // $ANTLR start "rule__While__Group__4__Impl"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2232:1: rule__While__Group__4__Impl : ( ( rule__While__StatementAssignment_4 ) ) ;
    public final void rule__While__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2236:1: ( ( ( rule__While__StatementAssignment_4 ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2237:1: ( ( rule__While__StatementAssignment_4 ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2237:1: ( ( rule__While__StatementAssignment_4 ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2238:1: ( rule__While__StatementAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileAccess().getStatementAssignment_4()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2239:1: ( rule__While__StatementAssignment_4 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2239:2: rule__While__StatementAssignment_4
            {
            pushFollow(FOLLOW_rule__While__StatementAssignment_4_in_rule__While__Group__4__Impl4653);
            rule__While__StatementAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhileAccess().getStatementAssignment_4()); 
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
    // $ANTLR end "rule__While__Group__4__Impl"


    // $ANTLR start "rule__For__Group__0"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2259:1: rule__For__Group__0 : rule__For__Group__0__Impl rule__For__Group__1 ;
    public final void rule__For__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2263:1: ( rule__For__Group__0__Impl rule__For__Group__1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2264:2: rule__For__Group__0__Impl rule__For__Group__1
            {
            pushFollow(FOLLOW_rule__For__Group__0__Impl_in_rule__For__Group__04693);
            rule__For__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__For__Group__1_in_rule__For__Group__04696);
            rule__For__Group__1();

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
    // $ANTLR end "rule__For__Group__0"


    // $ANTLR start "rule__For__Group__0__Impl"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2271:1: rule__For__Group__0__Impl : ( 'for' ) ;
    public final void rule__For__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2275:1: ( ( 'for' ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2276:1: ( 'for' )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2276:1: ( 'for' )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2277:1: 'for'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForAccess().getForKeyword_0()); 
            }
            match(input,25,FOLLOW_25_in_rule__For__Group__0__Impl4724); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForAccess().getForKeyword_0()); 
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
    // $ANTLR end "rule__For__Group__0__Impl"


    // $ANTLR start "rule__For__Group__1"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2290:1: rule__For__Group__1 : rule__For__Group__1__Impl rule__For__Group__2 ;
    public final void rule__For__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2294:1: ( rule__For__Group__1__Impl rule__For__Group__2 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2295:2: rule__For__Group__1__Impl rule__For__Group__2
            {
            pushFollow(FOLLOW_rule__For__Group__1__Impl_in_rule__For__Group__14755);
            rule__For__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__For__Group__2_in_rule__For__Group__14758);
            rule__For__Group__2();

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
    // $ANTLR end "rule__For__Group__1"


    // $ANTLR start "rule__For__Group__1__Impl"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2302:1: rule__For__Group__1__Impl : ( '(' ) ;
    public final void rule__For__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2306:1: ( ( '(' ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2307:1: ( '(' )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2307:1: ( '(' )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2308:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,21,FOLLOW_21_in_rule__For__Group__1__Impl4786); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForAccess().getLeftParenthesisKeyword_1()); 
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
    // $ANTLR end "rule__For__Group__1__Impl"


    // $ANTLR start "rule__For__Group__2"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2321:1: rule__For__Group__2 : rule__For__Group__2__Impl rule__For__Group__3 ;
    public final void rule__For__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2325:1: ( rule__For__Group__2__Impl rule__For__Group__3 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2326:2: rule__For__Group__2__Impl rule__For__Group__3
            {
            pushFollow(FOLLOW_rule__For__Group__2__Impl_in_rule__For__Group__24817);
            rule__For__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__For__Group__3_in_rule__For__Group__24820);
            rule__For__Group__3();

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
    // $ANTLR end "rule__For__Group__2"


    // $ANTLR start "rule__For__Group__2__Impl"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2333:1: rule__For__Group__2__Impl : ( ( rule__For__IteratorAssignment_2 ) ) ;
    public final void rule__For__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2337:1: ( ( ( rule__For__IteratorAssignment_2 ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2338:1: ( ( rule__For__IteratorAssignment_2 ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2338:1: ( ( rule__For__IteratorAssignment_2 ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2339:1: ( rule__For__IteratorAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForAccess().getIteratorAssignment_2()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2340:1: ( rule__For__IteratorAssignment_2 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2340:2: rule__For__IteratorAssignment_2
            {
            pushFollow(FOLLOW_rule__For__IteratorAssignment_2_in_rule__For__Group__2__Impl4847);
            rule__For__IteratorAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getForAccess().getIteratorAssignment_2()); 
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
    // $ANTLR end "rule__For__Group__2__Impl"


    // $ANTLR start "rule__For__Group__3"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2350:1: rule__For__Group__3 : rule__For__Group__3__Impl rule__For__Group__4 ;
    public final void rule__For__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2354:1: ( rule__For__Group__3__Impl rule__For__Group__4 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2355:2: rule__For__Group__3__Impl rule__For__Group__4
            {
            pushFollow(FOLLOW_rule__For__Group__3__Impl_in_rule__For__Group__34877);
            rule__For__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__For__Group__4_in_rule__For__Group__34880);
            rule__For__Group__4();

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
    // $ANTLR end "rule__For__Group__3"


    // $ANTLR start "rule__For__Group__3__Impl"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2362:1: rule__For__Group__3__Impl : ( ')' ) ;
    public final void rule__For__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2366:1: ( ( ')' ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2367:1: ( ')' )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2367:1: ( ')' )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2368:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForAccess().getRightParenthesisKeyword_3()); 
            }
            match(input,22,FOLLOW_22_in_rule__For__Group__3__Impl4908); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForAccess().getRightParenthesisKeyword_3()); 
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
    // $ANTLR end "rule__For__Group__3__Impl"


    // $ANTLR start "rule__For__Group__4"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2381:1: rule__For__Group__4 : rule__For__Group__4__Impl ;
    public final void rule__For__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2385:1: ( rule__For__Group__4__Impl )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2386:2: rule__For__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__For__Group__4__Impl_in_rule__For__Group__44939);
            rule__For__Group__4__Impl();

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
    // $ANTLR end "rule__For__Group__4"


    // $ANTLR start "rule__For__Group__4__Impl"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2392:1: rule__For__Group__4__Impl : ( ( rule__For__StatementAssignment_4 ) ) ;
    public final void rule__For__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2396:1: ( ( ( rule__For__StatementAssignment_4 ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2397:1: ( ( rule__For__StatementAssignment_4 ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2397:1: ( ( rule__For__StatementAssignment_4 ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2398:1: ( rule__For__StatementAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForAccess().getStatementAssignment_4()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2399:1: ( rule__For__StatementAssignment_4 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2399:2: rule__For__StatementAssignment_4
            {
            pushFollow(FOLLOW_rule__For__StatementAssignment_4_in_rule__For__Group__4__Impl4966);
            rule__For__StatementAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getForAccess().getStatementAssignment_4()); 
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
    // $ANTLR end "rule__For__Group__4__Impl"


    // $ANTLR start "rule__EachIterator__Group__0"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2419:1: rule__EachIterator__Group__0 : rule__EachIterator__Group__0__Impl rule__EachIterator__Group__1 ;
    public final void rule__EachIterator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2423:1: ( rule__EachIterator__Group__0__Impl rule__EachIterator__Group__1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2424:2: rule__EachIterator__Group__0__Impl rule__EachIterator__Group__1
            {
            pushFollow(FOLLOW_rule__EachIterator__Group__0__Impl_in_rule__EachIterator__Group__05006);
            rule__EachIterator__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EachIterator__Group__1_in_rule__EachIterator__Group__05009);
            rule__EachIterator__Group__1();

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
    // $ANTLR end "rule__EachIterator__Group__0"


    // $ANTLR start "rule__EachIterator__Group__0__Impl"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2431:1: rule__EachIterator__Group__0__Impl : ( ( rule__EachIterator__Group_0__0 )? ) ;
    public final void rule__EachIterator__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2435:1: ( ( ( rule__EachIterator__Group_0__0 )? ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2436:1: ( ( rule__EachIterator__Group_0__0 )? )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2436:1: ( ( rule__EachIterator__Group_0__0 )? )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2437:1: ( rule__EachIterator__Group_0__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEachIteratorAccess().getGroup_0()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2438:1: ( rule__EachIterator__Group_0__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==26) ) {
                int LA13_1 = input.LA(2);

                if ( (synpred34_InternalLeek()) ) {
                    alt13=1;
                }
            }
            switch (alt13) {
                case 1 :
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2438:2: rule__EachIterator__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__EachIterator__Group_0__0_in_rule__EachIterator__Group__0__Impl5036);
                    rule__EachIterator__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEachIteratorAccess().getGroup_0()); 
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
    // $ANTLR end "rule__EachIterator__Group__0__Impl"


    // $ANTLR start "rule__EachIterator__Group__1"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2448:1: rule__EachIterator__Group__1 : rule__EachIterator__Group__1__Impl rule__EachIterator__Group__2 ;
    public final void rule__EachIterator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2452:1: ( rule__EachIterator__Group__1__Impl rule__EachIterator__Group__2 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2453:2: rule__EachIterator__Group__1__Impl rule__EachIterator__Group__2
            {
            pushFollow(FOLLOW_rule__EachIterator__Group__1__Impl_in_rule__EachIterator__Group__15067);
            rule__EachIterator__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EachIterator__Group__2_in_rule__EachIterator__Group__15070);
            rule__EachIterator__Group__2();

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
    // $ANTLR end "rule__EachIterator__Group__1"


    // $ANTLR start "rule__EachIterator__Group__1__Impl"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2460:1: rule__EachIterator__Group__1__Impl : ( 'var' ) ;
    public final void rule__EachIterator__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2464:1: ( ( 'var' ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2465:1: ( 'var' )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2465:1: ( 'var' )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2466:1: 'var'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEachIteratorAccess().getVarKeyword_1()); 
            }
            match(input,26,FOLLOW_26_in_rule__EachIterator__Group__1__Impl5098); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEachIteratorAccess().getVarKeyword_1()); 
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
    // $ANTLR end "rule__EachIterator__Group__1__Impl"


    // $ANTLR start "rule__EachIterator__Group__2"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2479:1: rule__EachIterator__Group__2 : rule__EachIterator__Group__2__Impl rule__EachIterator__Group__3 ;
    public final void rule__EachIterator__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2483:1: ( rule__EachIterator__Group__2__Impl rule__EachIterator__Group__3 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2484:2: rule__EachIterator__Group__2__Impl rule__EachIterator__Group__3
            {
            pushFollow(FOLLOW_rule__EachIterator__Group__2__Impl_in_rule__EachIterator__Group__25129);
            rule__EachIterator__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EachIterator__Group__3_in_rule__EachIterator__Group__25132);
            rule__EachIterator__Group__3();

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
    // $ANTLR end "rule__EachIterator__Group__2"


    // $ANTLR start "rule__EachIterator__Group__2__Impl"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2491:1: rule__EachIterator__Group__2__Impl : ( ( rule__EachIterator__ValueAssignment_2 ) ) ;
    public final void rule__EachIterator__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2495:1: ( ( ( rule__EachIterator__ValueAssignment_2 ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2496:1: ( ( rule__EachIterator__ValueAssignment_2 ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2496:1: ( ( rule__EachIterator__ValueAssignment_2 ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2497:1: ( rule__EachIterator__ValueAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEachIteratorAccess().getValueAssignment_2()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2498:1: ( rule__EachIterator__ValueAssignment_2 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2498:2: rule__EachIterator__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__EachIterator__ValueAssignment_2_in_rule__EachIterator__Group__2__Impl5159);
            rule__EachIterator__ValueAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEachIteratorAccess().getValueAssignment_2()); 
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
    // $ANTLR end "rule__EachIterator__Group__2__Impl"


    // $ANTLR start "rule__EachIterator__Group__3"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2508:1: rule__EachIterator__Group__3 : rule__EachIterator__Group__3__Impl rule__EachIterator__Group__4 ;
    public final void rule__EachIterator__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2512:1: ( rule__EachIterator__Group__3__Impl rule__EachIterator__Group__4 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2513:2: rule__EachIterator__Group__3__Impl rule__EachIterator__Group__4
            {
            pushFollow(FOLLOW_rule__EachIterator__Group__3__Impl_in_rule__EachIterator__Group__35189);
            rule__EachIterator__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EachIterator__Group__4_in_rule__EachIterator__Group__35192);
            rule__EachIterator__Group__4();

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
    // $ANTLR end "rule__EachIterator__Group__3"


    // $ANTLR start "rule__EachIterator__Group__3__Impl"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2520:1: rule__EachIterator__Group__3__Impl : ( 'in' ) ;
    public final void rule__EachIterator__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2524:1: ( ( 'in' ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2525:1: ( 'in' )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2525:1: ( 'in' )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2526:1: 'in'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEachIteratorAccess().getInKeyword_3()); 
            }
            match(input,27,FOLLOW_27_in_rule__EachIterator__Group__3__Impl5220); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEachIteratorAccess().getInKeyword_3()); 
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
    // $ANTLR end "rule__EachIterator__Group__3__Impl"


    // $ANTLR start "rule__EachIterator__Group__4"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2539:1: rule__EachIterator__Group__4 : rule__EachIterator__Group__4__Impl ;
    public final void rule__EachIterator__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2543:1: ( rule__EachIterator__Group__4__Impl )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2544:2: rule__EachIterator__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__EachIterator__Group__4__Impl_in_rule__EachIterator__Group__45251);
            rule__EachIterator__Group__4__Impl();

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
    // $ANTLR end "rule__EachIterator__Group__4"


    // $ANTLR start "rule__EachIterator__Group__4__Impl"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2550:1: rule__EachIterator__Group__4__Impl : ( ( rule__EachIterator__ArrayAssignment_4 ) ) ;
    public final void rule__EachIterator__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2554:1: ( ( ( rule__EachIterator__ArrayAssignment_4 ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2555:1: ( ( rule__EachIterator__ArrayAssignment_4 ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2555:1: ( ( rule__EachIterator__ArrayAssignment_4 ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2556:1: ( rule__EachIterator__ArrayAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEachIteratorAccess().getArrayAssignment_4()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2557:1: ( rule__EachIterator__ArrayAssignment_4 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2557:2: rule__EachIterator__ArrayAssignment_4
            {
            pushFollow(FOLLOW_rule__EachIterator__ArrayAssignment_4_in_rule__EachIterator__Group__4__Impl5278);
            rule__EachIterator__ArrayAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEachIteratorAccess().getArrayAssignment_4()); 
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
    // $ANTLR end "rule__EachIterator__Group__4__Impl"


    // $ANTLR start "rule__EachIterator__Group_0__0"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2577:1: rule__EachIterator__Group_0__0 : rule__EachIterator__Group_0__0__Impl rule__EachIterator__Group_0__1 ;
    public final void rule__EachIterator__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2581:1: ( rule__EachIterator__Group_0__0__Impl rule__EachIterator__Group_0__1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2582:2: rule__EachIterator__Group_0__0__Impl rule__EachIterator__Group_0__1
            {
            pushFollow(FOLLOW_rule__EachIterator__Group_0__0__Impl_in_rule__EachIterator__Group_0__05318);
            rule__EachIterator__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EachIterator__Group_0__1_in_rule__EachIterator__Group_0__05321);
            rule__EachIterator__Group_0__1();

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
    // $ANTLR end "rule__EachIterator__Group_0__0"


    // $ANTLR start "rule__EachIterator__Group_0__0__Impl"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2589:1: rule__EachIterator__Group_0__0__Impl : ( ( 'var' ) ) ;
    public final void rule__EachIterator__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2593:1: ( ( ( 'var' ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2594:1: ( ( 'var' ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2594:1: ( ( 'var' ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2595:1: ( 'var' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEachIteratorAccess().getVarKeyword_0_0()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2596:1: ( 'var' )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2597:2: 'var'
            {
            match(input,26,FOLLOW_26_in_rule__EachIterator__Group_0__0__Impl5350); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEachIteratorAccess().getVarKeyword_0_0()); 
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
    // $ANTLR end "rule__EachIterator__Group_0__0__Impl"


    // $ANTLR start "rule__EachIterator__Group_0__1"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2608:1: rule__EachIterator__Group_0__1 : rule__EachIterator__Group_0__1__Impl rule__EachIterator__Group_0__2 ;
    public final void rule__EachIterator__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2612:1: ( rule__EachIterator__Group_0__1__Impl rule__EachIterator__Group_0__2 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2613:2: rule__EachIterator__Group_0__1__Impl rule__EachIterator__Group_0__2
            {
            pushFollow(FOLLOW_rule__EachIterator__Group_0__1__Impl_in_rule__EachIterator__Group_0__15382);
            rule__EachIterator__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EachIterator__Group_0__2_in_rule__EachIterator__Group_0__15385);
            rule__EachIterator__Group_0__2();

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
    // $ANTLR end "rule__EachIterator__Group_0__1"


    // $ANTLR start "rule__EachIterator__Group_0__1__Impl"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2620:1: rule__EachIterator__Group_0__1__Impl : ( ( rule__EachIterator__KeyAssignment_0_1 ) ) ;
    public final void rule__EachIterator__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2624:1: ( ( ( rule__EachIterator__KeyAssignment_0_1 ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2625:1: ( ( rule__EachIterator__KeyAssignment_0_1 ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2625:1: ( ( rule__EachIterator__KeyAssignment_0_1 ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2626:1: ( rule__EachIterator__KeyAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEachIteratorAccess().getKeyAssignment_0_1()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2627:1: ( rule__EachIterator__KeyAssignment_0_1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2627:2: rule__EachIterator__KeyAssignment_0_1
            {
            pushFollow(FOLLOW_rule__EachIterator__KeyAssignment_0_1_in_rule__EachIterator__Group_0__1__Impl5412);
            rule__EachIterator__KeyAssignment_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEachIteratorAccess().getKeyAssignment_0_1()); 
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
    // $ANTLR end "rule__EachIterator__Group_0__1__Impl"


    // $ANTLR start "rule__EachIterator__Group_0__2"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2637:1: rule__EachIterator__Group_0__2 : rule__EachIterator__Group_0__2__Impl ;
    public final void rule__EachIterator__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2641:1: ( rule__EachIterator__Group_0__2__Impl )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2642:2: rule__EachIterator__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__EachIterator__Group_0__2__Impl_in_rule__EachIterator__Group_0__25442);
            rule__EachIterator__Group_0__2__Impl();

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
    // $ANTLR end "rule__EachIterator__Group_0__2"


    // $ANTLR start "rule__EachIterator__Group_0__2__Impl"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2648:1: rule__EachIterator__Group_0__2__Impl : ( ':' ) ;
    public final void rule__EachIterator__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2652:1: ( ( ':' ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2653:1: ( ':' )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2653:1: ( ':' )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2654:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEachIteratorAccess().getColonKeyword_0_2()); 
            }
            match(input,28,FOLLOW_28_in_rule__EachIterator__Group_0__2__Impl5470); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEachIteratorAccess().getColonKeyword_0_2()); 
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
    // $ANTLR end "rule__EachIterator__Group_0__2__Impl"


    // $ANTLR start "rule__VariableIterator__Group__0"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2673:1: rule__VariableIterator__Group__0 : rule__VariableIterator__Group__0__Impl rule__VariableIterator__Group__1 ;
    public final void rule__VariableIterator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2677:1: ( rule__VariableIterator__Group__0__Impl rule__VariableIterator__Group__1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2678:2: rule__VariableIterator__Group__0__Impl rule__VariableIterator__Group__1
            {
            pushFollow(FOLLOW_rule__VariableIterator__Group__0__Impl_in_rule__VariableIterator__Group__05507);
            rule__VariableIterator__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__VariableIterator__Group__1_in_rule__VariableIterator__Group__05510);
            rule__VariableIterator__Group__1();

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
    // $ANTLR end "rule__VariableIterator__Group__0"


    // $ANTLR start "rule__VariableIterator__Group__0__Impl"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2685:1: rule__VariableIterator__Group__0__Impl : ( ( rule__VariableIterator__InitializationAssignment_0 ) ) ;
    public final void rule__VariableIterator__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2689:1: ( ( ( rule__VariableIterator__InitializationAssignment_0 ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2690:1: ( ( rule__VariableIterator__InitializationAssignment_0 ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2690:1: ( ( rule__VariableIterator__InitializationAssignment_0 ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2691:1: ( rule__VariableIterator__InitializationAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableIteratorAccess().getInitializationAssignment_0()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2692:1: ( rule__VariableIterator__InitializationAssignment_0 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2692:2: rule__VariableIterator__InitializationAssignment_0
            {
            pushFollow(FOLLOW_rule__VariableIterator__InitializationAssignment_0_in_rule__VariableIterator__Group__0__Impl5537);
            rule__VariableIterator__InitializationAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableIteratorAccess().getInitializationAssignment_0()); 
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
    // $ANTLR end "rule__VariableIterator__Group__0__Impl"


    // $ANTLR start "rule__VariableIterator__Group__1"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2702:1: rule__VariableIterator__Group__1 : rule__VariableIterator__Group__1__Impl rule__VariableIterator__Group__2 ;
    public final void rule__VariableIterator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2706:1: ( rule__VariableIterator__Group__1__Impl rule__VariableIterator__Group__2 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2707:2: rule__VariableIterator__Group__1__Impl rule__VariableIterator__Group__2
            {
            pushFollow(FOLLOW_rule__VariableIterator__Group__1__Impl_in_rule__VariableIterator__Group__15567);
            rule__VariableIterator__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__VariableIterator__Group__2_in_rule__VariableIterator__Group__15570);
            rule__VariableIterator__Group__2();

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
    // $ANTLR end "rule__VariableIterator__Group__1"


    // $ANTLR start "rule__VariableIterator__Group__1__Impl"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2714:1: rule__VariableIterator__Group__1__Impl : ( ';' ) ;
    public final void rule__VariableIterator__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2718:1: ( ( ';' ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2719:1: ( ';' )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2719:1: ( ';' )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2720:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableIteratorAccess().getSemicolonKeyword_1()); 
            }
            match(input,16,FOLLOW_16_in_rule__VariableIterator__Group__1__Impl5598); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableIteratorAccess().getSemicolonKeyword_1()); 
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
    // $ANTLR end "rule__VariableIterator__Group__1__Impl"


    // $ANTLR start "rule__VariableIterator__Group__2"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2733:1: rule__VariableIterator__Group__2 : rule__VariableIterator__Group__2__Impl rule__VariableIterator__Group__3 ;
    public final void rule__VariableIterator__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2737:1: ( rule__VariableIterator__Group__2__Impl rule__VariableIterator__Group__3 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2738:2: rule__VariableIterator__Group__2__Impl rule__VariableIterator__Group__3
            {
            pushFollow(FOLLOW_rule__VariableIterator__Group__2__Impl_in_rule__VariableIterator__Group__25629);
            rule__VariableIterator__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__VariableIterator__Group__3_in_rule__VariableIterator__Group__25632);
            rule__VariableIterator__Group__3();

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
    // $ANTLR end "rule__VariableIterator__Group__2"


    // $ANTLR start "rule__VariableIterator__Group__2__Impl"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2745:1: rule__VariableIterator__Group__2__Impl : ( ( rule__VariableIterator__ConditionAssignment_2 ) ) ;
    public final void rule__VariableIterator__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2749:1: ( ( ( rule__VariableIterator__ConditionAssignment_2 ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2750:1: ( ( rule__VariableIterator__ConditionAssignment_2 ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2750:1: ( ( rule__VariableIterator__ConditionAssignment_2 ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2751:1: ( rule__VariableIterator__ConditionAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableIteratorAccess().getConditionAssignment_2()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2752:1: ( rule__VariableIterator__ConditionAssignment_2 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2752:2: rule__VariableIterator__ConditionAssignment_2
            {
            pushFollow(FOLLOW_rule__VariableIterator__ConditionAssignment_2_in_rule__VariableIterator__Group__2__Impl5659);
            rule__VariableIterator__ConditionAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableIteratorAccess().getConditionAssignment_2()); 
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
    // $ANTLR end "rule__VariableIterator__Group__2__Impl"


    // $ANTLR start "rule__VariableIterator__Group__3"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2762:1: rule__VariableIterator__Group__3 : rule__VariableIterator__Group__3__Impl rule__VariableIterator__Group__4 ;
    public final void rule__VariableIterator__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2766:1: ( rule__VariableIterator__Group__3__Impl rule__VariableIterator__Group__4 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2767:2: rule__VariableIterator__Group__3__Impl rule__VariableIterator__Group__4
            {
            pushFollow(FOLLOW_rule__VariableIterator__Group__3__Impl_in_rule__VariableIterator__Group__35689);
            rule__VariableIterator__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__VariableIterator__Group__4_in_rule__VariableIterator__Group__35692);
            rule__VariableIterator__Group__4();

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
    // $ANTLR end "rule__VariableIterator__Group__3"


    // $ANTLR start "rule__VariableIterator__Group__3__Impl"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2774:1: rule__VariableIterator__Group__3__Impl : ( ';' ) ;
    public final void rule__VariableIterator__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2778:1: ( ( ';' ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2779:1: ( ';' )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2779:1: ( ';' )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2780:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableIteratorAccess().getSemicolonKeyword_3()); 
            }
            match(input,16,FOLLOW_16_in_rule__VariableIterator__Group__3__Impl5720); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableIteratorAccess().getSemicolonKeyword_3()); 
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
    // $ANTLR end "rule__VariableIterator__Group__3__Impl"


    // $ANTLR start "rule__VariableIterator__Group__4"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2793:1: rule__VariableIterator__Group__4 : rule__VariableIterator__Group__4__Impl ;
    public final void rule__VariableIterator__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2797:1: ( rule__VariableIterator__Group__4__Impl )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2798:2: rule__VariableIterator__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__VariableIterator__Group__4__Impl_in_rule__VariableIterator__Group__45751);
            rule__VariableIterator__Group__4__Impl();

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
    // $ANTLR end "rule__VariableIterator__Group__4"


    // $ANTLR start "rule__VariableIterator__Group__4__Impl"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2804:1: rule__VariableIterator__Group__4__Impl : ( ( rule__VariableIterator__IncrementAssignment_4 ) ) ;
    public final void rule__VariableIterator__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2808:1: ( ( ( rule__VariableIterator__IncrementAssignment_4 ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2809:1: ( ( rule__VariableIterator__IncrementAssignment_4 ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2809:1: ( ( rule__VariableIterator__IncrementAssignment_4 ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2810:1: ( rule__VariableIterator__IncrementAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableIteratorAccess().getIncrementAssignment_4()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2811:1: ( rule__VariableIterator__IncrementAssignment_4 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2811:2: rule__VariableIterator__IncrementAssignment_4
            {
            pushFollow(FOLLOW_rule__VariableIterator__IncrementAssignment_4_in_rule__VariableIterator__Group__4__Impl5778);
            rule__VariableIterator__IncrementAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableIteratorAccess().getIncrementAssignment_4()); 
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
    // $ANTLR end "rule__VariableIterator__Group__4__Impl"


    // $ANTLR start "rule__FunctionDeclaration__Group__0"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2831:1: rule__FunctionDeclaration__Group__0 : rule__FunctionDeclaration__Group__0__Impl rule__FunctionDeclaration__Group__1 ;
    public final void rule__FunctionDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2835:1: ( rule__FunctionDeclaration__Group__0__Impl rule__FunctionDeclaration__Group__1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2836:2: rule__FunctionDeclaration__Group__0__Impl rule__FunctionDeclaration__Group__1
            {
            pushFollow(FOLLOW_rule__FunctionDeclaration__Group__0__Impl_in_rule__FunctionDeclaration__Group__05818);
            rule__FunctionDeclaration__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FunctionDeclaration__Group__1_in_rule__FunctionDeclaration__Group__05821);
            rule__FunctionDeclaration__Group__1();

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
    // $ANTLR end "rule__FunctionDeclaration__Group__0"


    // $ANTLR start "rule__FunctionDeclaration__Group__0__Impl"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2843:1: rule__FunctionDeclaration__Group__0__Impl : ( 'function' ) ;
    public final void rule__FunctionDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2847:1: ( ( 'function' ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2848:1: ( 'function' )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2848:1: ( 'function' )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2849:1: 'function'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionDeclarationAccess().getFunctionKeyword_0()); 
            }
            match(input,29,FOLLOW_29_in_rule__FunctionDeclaration__Group__0__Impl5849); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionDeclarationAccess().getFunctionKeyword_0()); 
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
    // $ANTLR end "rule__FunctionDeclaration__Group__0__Impl"


    // $ANTLR start "rule__FunctionDeclaration__Group__1"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2862:1: rule__FunctionDeclaration__Group__1 : rule__FunctionDeclaration__Group__1__Impl rule__FunctionDeclaration__Group__2 ;
    public final void rule__FunctionDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2866:1: ( rule__FunctionDeclaration__Group__1__Impl rule__FunctionDeclaration__Group__2 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2867:2: rule__FunctionDeclaration__Group__1__Impl rule__FunctionDeclaration__Group__2
            {
            pushFollow(FOLLOW_rule__FunctionDeclaration__Group__1__Impl_in_rule__FunctionDeclaration__Group__15880);
            rule__FunctionDeclaration__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FunctionDeclaration__Group__2_in_rule__FunctionDeclaration__Group__15883);
            rule__FunctionDeclaration__Group__2();

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
    // $ANTLR end "rule__FunctionDeclaration__Group__1"


    // $ANTLR start "rule__FunctionDeclaration__Group__1__Impl"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2874:1: rule__FunctionDeclaration__Group__1__Impl : ( ( rule__FunctionDeclaration__NameAssignment_1 ) ) ;
    public final void rule__FunctionDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2878:1: ( ( ( rule__FunctionDeclaration__NameAssignment_1 ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2879:1: ( ( rule__FunctionDeclaration__NameAssignment_1 ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2879:1: ( ( rule__FunctionDeclaration__NameAssignment_1 ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2880:1: ( rule__FunctionDeclaration__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionDeclarationAccess().getNameAssignment_1()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2881:1: ( rule__FunctionDeclaration__NameAssignment_1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2881:2: rule__FunctionDeclaration__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__FunctionDeclaration__NameAssignment_1_in_rule__FunctionDeclaration__Group__1__Impl5910);
            rule__FunctionDeclaration__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionDeclarationAccess().getNameAssignment_1()); 
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
    // $ANTLR end "rule__FunctionDeclaration__Group__1__Impl"


    // $ANTLR start "rule__FunctionDeclaration__Group__2"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2891:1: rule__FunctionDeclaration__Group__2 : rule__FunctionDeclaration__Group__2__Impl rule__FunctionDeclaration__Group__3 ;
    public final void rule__FunctionDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2895:1: ( rule__FunctionDeclaration__Group__2__Impl rule__FunctionDeclaration__Group__3 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2896:2: rule__FunctionDeclaration__Group__2__Impl rule__FunctionDeclaration__Group__3
            {
            pushFollow(FOLLOW_rule__FunctionDeclaration__Group__2__Impl_in_rule__FunctionDeclaration__Group__25940);
            rule__FunctionDeclaration__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FunctionDeclaration__Group__3_in_rule__FunctionDeclaration__Group__25943);
            rule__FunctionDeclaration__Group__3();

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
    // $ANTLR end "rule__FunctionDeclaration__Group__2"


    // $ANTLR start "rule__FunctionDeclaration__Group__2__Impl"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2903:1: rule__FunctionDeclaration__Group__2__Impl : ( '(' ) ;
    public final void rule__FunctionDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2907:1: ( ( '(' ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2908:1: ( '(' )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2908:1: ( '(' )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2909:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionDeclarationAccess().getLeftParenthesisKeyword_2()); 
            }
            match(input,21,FOLLOW_21_in_rule__FunctionDeclaration__Group__2__Impl5971); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionDeclarationAccess().getLeftParenthesisKeyword_2()); 
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
    // $ANTLR end "rule__FunctionDeclaration__Group__2__Impl"


    // $ANTLR start "rule__FunctionDeclaration__Group__3"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2922:1: rule__FunctionDeclaration__Group__3 : rule__FunctionDeclaration__Group__3__Impl rule__FunctionDeclaration__Group__4 ;
    public final void rule__FunctionDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2926:1: ( rule__FunctionDeclaration__Group__3__Impl rule__FunctionDeclaration__Group__4 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2927:2: rule__FunctionDeclaration__Group__3__Impl rule__FunctionDeclaration__Group__4
            {
            pushFollow(FOLLOW_rule__FunctionDeclaration__Group__3__Impl_in_rule__FunctionDeclaration__Group__36002);
            rule__FunctionDeclaration__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FunctionDeclaration__Group__4_in_rule__FunctionDeclaration__Group__36005);
            rule__FunctionDeclaration__Group__4();

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
    // $ANTLR end "rule__FunctionDeclaration__Group__3"


    // $ANTLR start "rule__FunctionDeclaration__Group__3__Impl"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2934:1: rule__FunctionDeclaration__Group__3__Impl : ( ( rule__FunctionDeclaration__Group_3__0 )? ) ;
    public final void rule__FunctionDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2938:1: ( ( ( rule__FunctionDeclaration__Group_3__0 )? ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2939:1: ( ( rule__FunctionDeclaration__Group_3__0 )? )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2939:1: ( ( rule__FunctionDeclaration__Group_3__0 )? )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2940:1: ( rule__FunctionDeclaration__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionDeclarationAccess().getGroup_3()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2941:1: ( rule__FunctionDeclaration__Group_3__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==48) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2941:2: rule__FunctionDeclaration__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__FunctionDeclaration__Group_3__0_in_rule__FunctionDeclaration__Group__3__Impl6032);
                    rule__FunctionDeclaration__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionDeclarationAccess().getGroup_3()); 
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
    // $ANTLR end "rule__FunctionDeclaration__Group__3__Impl"


    // $ANTLR start "rule__FunctionDeclaration__Group__4"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2951:1: rule__FunctionDeclaration__Group__4 : rule__FunctionDeclaration__Group__4__Impl rule__FunctionDeclaration__Group__5 ;
    public final void rule__FunctionDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2955:1: ( rule__FunctionDeclaration__Group__4__Impl rule__FunctionDeclaration__Group__5 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2956:2: rule__FunctionDeclaration__Group__4__Impl rule__FunctionDeclaration__Group__5
            {
            pushFollow(FOLLOW_rule__FunctionDeclaration__Group__4__Impl_in_rule__FunctionDeclaration__Group__46063);
            rule__FunctionDeclaration__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FunctionDeclaration__Group__5_in_rule__FunctionDeclaration__Group__46066);
            rule__FunctionDeclaration__Group__5();

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
    // $ANTLR end "rule__FunctionDeclaration__Group__4"


    // $ANTLR start "rule__FunctionDeclaration__Group__4__Impl"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2963:1: rule__FunctionDeclaration__Group__4__Impl : ( ')' ) ;
    public final void rule__FunctionDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2967:1: ( ( ')' ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2968:1: ( ')' )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2968:1: ( ')' )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2969:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionDeclarationAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,22,FOLLOW_22_in_rule__FunctionDeclaration__Group__4__Impl6094); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionDeclarationAccess().getRightParenthesisKeyword_4()); 
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
    // $ANTLR end "rule__FunctionDeclaration__Group__4__Impl"


    // $ANTLR start "rule__FunctionDeclaration__Group__5"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2982:1: rule__FunctionDeclaration__Group__5 : rule__FunctionDeclaration__Group__5__Impl ;
    public final void rule__FunctionDeclaration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2986:1: ( rule__FunctionDeclaration__Group__5__Impl )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2987:2: rule__FunctionDeclaration__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__FunctionDeclaration__Group__5__Impl_in_rule__FunctionDeclaration__Group__56125);
            rule__FunctionDeclaration__Group__5__Impl();

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
    // $ANTLR end "rule__FunctionDeclaration__Group__5"


    // $ANTLR start "rule__FunctionDeclaration__Group__5__Impl"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2993:1: rule__FunctionDeclaration__Group__5__Impl : ( ( rule__FunctionDeclaration__BodyAssignment_5 ) ) ;
    public final void rule__FunctionDeclaration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2997:1: ( ( ( rule__FunctionDeclaration__BodyAssignment_5 ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2998:1: ( ( rule__FunctionDeclaration__BodyAssignment_5 ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2998:1: ( ( rule__FunctionDeclaration__BodyAssignment_5 ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2999:1: ( rule__FunctionDeclaration__BodyAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionDeclarationAccess().getBodyAssignment_5()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3000:1: ( rule__FunctionDeclaration__BodyAssignment_5 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3000:2: rule__FunctionDeclaration__BodyAssignment_5
            {
            pushFollow(FOLLOW_rule__FunctionDeclaration__BodyAssignment_5_in_rule__FunctionDeclaration__Group__5__Impl6152);
            rule__FunctionDeclaration__BodyAssignment_5();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionDeclarationAccess().getBodyAssignment_5()); 
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
    // $ANTLR end "rule__FunctionDeclaration__Group__5__Impl"


    // $ANTLR start "rule__FunctionDeclaration__Group_3__0"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3022:1: rule__FunctionDeclaration__Group_3__0 : rule__FunctionDeclaration__Group_3__0__Impl rule__FunctionDeclaration__Group_3__1 ;
    public final void rule__FunctionDeclaration__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3026:1: ( rule__FunctionDeclaration__Group_3__0__Impl rule__FunctionDeclaration__Group_3__1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3027:2: rule__FunctionDeclaration__Group_3__0__Impl rule__FunctionDeclaration__Group_3__1
            {
            pushFollow(FOLLOW_rule__FunctionDeclaration__Group_3__0__Impl_in_rule__FunctionDeclaration__Group_3__06194);
            rule__FunctionDeclaration__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FunctionDeclaration__Group_3__1_in_rule__FunctionDeclaration__Group_3__06197);
            rule__FunctionDeclaration__Group_3__1();

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
    // $ANTLR end "rule__FunctionDeclaration__Group_3__0"


    // $ANTLR start "rule__FunctionDeclaration__Group_3__0__Impl"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3034:1: rule__FunctionDeclaration__Group_3__0__Impl : ( ( rule__FunctionDeclaration__ParameterAssignment_3_0 ) ) ;
    public final void rule__FunctionDeclaration__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3038:1: ( ( ( rule__FunctionDeclaration__ParameterAssignment_3_0 ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3039:1: ( ( rule__FunctionDeclaration__ParameterAssignment_3_0 ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3039:1: ( ( rule__FunctionDeclaration__ParameterAssignment_3_0 ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3040:1: ( rule__FunctionDeclaration__ParameterAssignment_3_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionDeclarationAccess().getParameterAssignment_3_0()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3041:1: ( rule__FunctionDeclaration__ParameterAssignment_3_0 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3041:2: rule__FunctionDeclaration__ParameterAssignment_3_0
            {
            pushFollow(FOLLOW_rule__FunctionDeclaration__ParameterAssignment_3_0_in_rule__FunctionDeclaration__Group_3__0__Impl6224);
            rule__FunctionDeclaration__ParameterAssignment_3_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionDeclarationAccess().getParameterAssignment_3_0()); 
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
    // $ANTLR end "rule__FunctionDeclaration__Group_3__0__Impl"


    // $ANTLR start "rule__FunctionDeclaration__Group_3__1"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3051:1: rule__FunctionDeclaration__Group_3__1 : rule__FunctionDeclaration__Group_3__1__Impl ;
    public final void rule__FunctionDeclaration__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3055:1: ( rule__FunctionDeclaration__Group_3__1__Impl )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3056:2: rule__FunctionDeclaration__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__FunctionDeclaration__Group_3__1__Impl_in_rule__FunctionDeclaration__Group_3__16254);
            rule__FunctionDeclaration__Group_3__1__Impl();

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
    // $ANTLR end "rule__FunctionDeclaration__Group_3__1"


    // $ANTLR start "rule__FunctionDeclaration__Group_3__1__Impl"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3062:1: rule__FunctionDeclaration__Group_3__1__Impl : ( ( rule__FunctionDeclaration__Group_3_1__0 )* ) ;
    public final void rule__FunctionDeclaration__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3066:1: ( ( ( rule__FunctionDeclaration__Group_3_1__0 )* ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3067:1: ( ( rule__FunctionDeclaration__Group_3_1__0 )* )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3067:1: ( ( rule__FunctionDeclaration__Group_3_1__0 )* )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3068:1: ( rule__FunctionDeclaration__Group_3_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionDeclarationAccess().getGroup_3_1()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3069:1: ( rule__FunctionDeclaration__Group_3_1__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==30) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3069:2: rule__FunctionDeclaration__Group_3_1__0
            	    {
            	    pushFollow(FOLLOW_rule__FunctionDeclaration__Group_3_1__0_in_rule__FunctionDeclaration__Group_3__1__Impl6281);
            	    rule__FunctionDeclaration__Group_3_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionDeclarationAccess().getGroup_3_1()); 
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
    // $ANTLR end "rule__FunctionDeclaration__Group_3__1__Impl"


    // $ANTLR start "rule__FunctionDeclaration__Group_3_1__0"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3083:1: rule__FunctionDeclaration__Group_3_1__0 : rule__FunctionDeclaration__Group_3_1__0__Impl rule__FunctionDeclaration__Group_3_1__1 ;
    public final void rule__FunctionDeclaration__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3087:1: ( rule__FunctionDeclaration__Group_3_1__0__Impl rule__FunctionDeclaration__Group_3_1__1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3088:2: rule__FunctionDeclaration__Group_3_1__0__Impl rule__FunctionDeclaration__Group_3_1__1
            {
            pushFollow(FOLLOW_rule__FunctionDeclaration__Group_3_1__0__Impl_in_rule__FunctionDeclaration__Group_3_1__06316);
            rule__FunctionDeclaration__Group_3_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FunctionDeclaration__Group_3_1__1_in_rule__FunctionDeclaration__Group_3_1__06319);
            rule__FunctionDeclaration__Group_3_1__1();

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
    // $ANTLR end "rule__FunctionDeclaration__Group_3_1__0"


    // $ANTLR start "rule__FunctionDeclaration__Group_3_1__0__Impl"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3095:1: rule__FunctionDeclaration__Group_3_1__0__Impl : ( ',' ) ;
    public final void rule__FunctionDeclaration__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3099:1: ( ( ',' ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3100:1: ( ',' )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3100:1: ( ',' )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3101:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionDeclarationAccess().getCommaKeyword_3_1_0()); 
            }
            match(input,30,FOLLOW_30_in_rule__FunctionDeclaration__Group_3_1__0__Impl6347); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionDeclarationAccess().getCommaKeyword_3_1_0()); 
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
    // $ANTLR end "rule__FunctionDeclaration__Group_3_1__0__Impl"


    // $ANTLR start "rule__FunctionDeclaration__Group_3_1__1"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3114:1: rule__FunctionDeclaration__Group_3_1__1 : rule__FunctionDeclaration__Group_3_1__1__Impl ;
    public final void rule__FunctionDeclaration__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3118:1: ( rule__FunctionDeclaration__Group_3_1__1__Impl )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3119:2: rule__FunctionDeclaration__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_rule__FunctionDeclaration__Group_3_1__1__Impl_in_rule__FunctionDeclaration__Group_3_1__16378);
            rule__FunctionDeclaration__Group_3_1__1__Impl();

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
    // $ANTLR end "rule__FunctionDeclaration__Group_3_1__1"


    // $ANTLR start "rule__FunctionDeclaration__Group_3_1__1__Impl"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3125:1: rule__FunctionDeclaration__Group_3_1__1__Impl : ( ( rule__FunctionDeclaration__ParameterAssignment_3_1_1 ) ) ;
    public final void rule__FunctionDeclaration__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3129:1: ( ( ( rule__FunctionDeclaration__ParameterAssignment_3_1_1 ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3130:1: ( ( rule__FunctionDeclaration__ParameterAssignment_3_1_1 ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3130:1: ( ( rule__FunctionDeclaration__ParameterAssignment_3_1_1 ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3131:1: ( rule__FunctionDeclaration__ParameterAssignment_3_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionDeclarationAccess().getParameterAssignment_3_1_1()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3132:1: ( rule__FunctionDeclaration__ParameterAssignment_3_1_1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3132:2: rule__FunctionDeclaration__ParameterAssignment_3_1_1
            {
            pushFollow(FOLLOW_rule__FunctionDeclaration__ParameterAssignment_3_1_1_in_rule__FunctionDeclaration__Group_3_1__1__Impl6405);
            rule__FunctionDeclaration__ParameterAssignment_3_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionDeclarationAccess().getParameterAssignment_3_1_1()); 
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
    // $ANTLR end "rule__FunctionDeclaration__Group_3_1__1__Impl"


    // $ANTLR start "rule__ParameterDeclaration__Group__0"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3146:1: rule__ParameterDeclaration__Group__0 : rule__ParameterDeclaration__Group__0__Impl rule__ParameterDeclaration__Group__1 ;
    public final void rule__ParameterDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3150:1: ( rule__ParameterDeclaration__Group__0__Impl rule__ParameterDeclaration__Group__1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3151:2: rule__ParameterDeclaration__Group__0__Impl rule__ParameterDeclaration__Group__1
            {
            pushFollow(FOLLOW_rule__ParameterDeclaration__Group__0__Impl_in_rule__ParameterDeclaration__Group__06439);
            rule__ParameterDeclaration__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ParameterDeclaration__Group__1_in_rule__ParameterDeclaration__Group__06442);
            rule__ParameterDeclaration__Group__1();

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
    // $ANTLR end "rule__ParameterDeclaration__Group__0"


    // $ANTLR start "rule__ParameterDeclaration__Group__0__Impl"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3158:1: rule__ParameterDeclaration__Group__0__Impl : ( ( rule__ParameterDeclaration__ByAdressAssignment_0 ) ) ;
    public final void rule__ParameterDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3162:1: ( ( ( rule__ParameterDeclaration__ByAdressAssignment_0 ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3163:1: ( ( rule__ParameterDeclaration__ByAdressAssignment_0 ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3163:1: ( ( rule__ParameterDeclaration__ByAdressAssignment_0 ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3164:1: ( rule__ParameterDeclaration__ByAdressAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterDeclarationAccess().getByAdressAssignment_0()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3165:1: ( rule__ParameterDeclaration__ByAdressAssignment_0 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3165:2: rule__ParameterDeclaration__ByAdressAssignment_0
            {
            pushFollow(FOLLOW_rule__ParameterDeclaration__ByAdressAssignment_0_in_rule__ParameterDeclaration__Group__0__Impl6469);
            rule__ParameterDeclaration__ByAdressAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterDeclarationAccess().getByAdressAssignment_0()); 
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
    // $ANTLR end "rule__ParameterDeclaration__Group__0__Impl"


    // $ANTLR start "rule__ParameterDeclaration__Group__1"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3175:1: rule__ParameterDeclaration__Group__1 : rule__ParameterDeclaration__Group__1__Impl ;
    public final void rule__ParameterDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3179:1: ( rule__ParameterDeclaration__Group__1__Impl )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3180:2: rule__ParameterDeclaration__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ParameterDeclaration__Group__1__Impl_in_rule__ParameterDeclaration__Group__16499);
            rule__ParameterDeclaration__Group__1__Impl();

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
    // $ANTLR end "rule__ParameterDeclaration__Group__1"


    // $ANTLR start "rule__ParameterDeclaration__Group__1__Impl"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3186:1: rule__ParameterDeclaration__Group__1__Impl : ( ( rule__ParameterDeclaration__NameAssignment_1 ) ) ;
    public final void rule__ParameterDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3190:1: ( ( ( rule__ParameterDeclaration__NameAssignment_1 ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3191:1: ( ( rule__ParameterDeclaration__NameAssignment_1 ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3191:1: ( ( rule__ParameterDeclaration__NameAssignment_1 ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3192:1: ( rule__ParameterDeclaration__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterDeclarationAccess().getNameAssignment_1()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3193:1: ( rule__ParameterDeclaration__NameAssignment_1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3193:2: rule__ParameterDeclaration__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__ParameterDeclaration__NameAssignment_1_in_rule__ParameterDeclaration__Group__1__Impl6526);
            rule__ParameterDeclaration__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterDeclarationAccess().getNameAssignment_1()); 
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
    // $ANTLR end "rule__ParameterDeclaration__Group__1__Impl"


    // $ANTLR start "rule__LocalDeclaration__Group__0"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3207:1: rule__LocalDeclaration__Group__0 : rule__LocalDeclaration__Group__0__Impl rule__LocalDeclaration__Group__1 ;
    public final void rule__LocalDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3211:1: ( rule__LocalDeclaration__Group__0__Impl rule__LocalDeclaration__Group__1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3212:2: rule__LocalDeclaration__Group__0__Impl rule__LocalDeclaration__Group__1
            {
            pushFollow(FOLLOW_rule__LocalDeclaration__Group__0__Impl_in_rule__LocalDeclaration__Group__06560);
            rule__LocalDeclaration__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__LocalDeclaration__Group__1_in_rule__LocalDeclaration__Group__06563);
            rule__LocalDeclaration__Group__1();

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
    // $ANTLR end "rule__LocalDeclaration__Group__0"


    // $ANTLR start "rule__LocalDeclaration__Group__0__Impl"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3219:1: rule__LocalDeclaration__Group__0__Impl : ( 'var' ) ;
    public final void rule__LocalDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3223:1: ( ( 'var' ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3224:1: ( 'var' )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3224:1: ( 'var' )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3225:1: 'var'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalDeclarationAccess().getVarKeyword_0()); 
            }
            match(input,26,FOLLOW_26_in_rule__LocalDeclaration__Group__0__Impl6591); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocalDeclarationAccess().getVarKeyword_0()); 
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
    // $ANTLR end "rule__LocalDeclaration__Group__0__Impl"


    // $ANTLR start "rule__LocalDeclaration__Group__1"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3238:1: rule__LocalDeclaration__Group__1 : rule__LocalDeclaration__Group__1__Impl rule__LocalDeclaration__Group__2 ;
    public final void rule__LocalDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3242:1: ( rule__LocalDeclaration__Group__1__Impl rule__LocalDeclaration__Group__2 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3243:2: rule__LocalDeclaration__Group__1__Impl rule__LocalDeclaration__Group__2
            {
            pushFollow(FOLLOW_rule__LocalDeclaration__Group__1__Impl_in_rule__LocalDeclaration__Group__16622);
            rule__LocalDeclaration__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__LocalDeclaration__Group__2_in_rule__LocalDeclaration__Group__16625);
            rule__LocalDeclaration__Group__2();

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
    // $ANTLR end "rule__LocalDeclaration__Group__1"


    // $ANTLR start "rule__LocalDeclaration__Group__1__Impl"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3250:1: rule__LocalDeclaration__Group__1__Impl : ( ( rule__LocalDeclaration__VariablesAssignment_1 ) ) ;
    public final void rule__LocalDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3254:1: ( ( ( rule__LocalDeclaration__VariablesAssignment_1 ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3255:1: ( ( rule__LocalDeclaration__VariablesAssignment_1 ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3255:1: ( ( rule__LocalDeclaration__VariablesAssignment_1 ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3256:1: ( rule__LocalDeclaration__VariablesAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalDeclarationAccess().getVariablesAssignment_1()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3257:1: ( rule__LocalDeclaration__VariablesAssignment_1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3257:2: rule__LocalDeclaration__VariablesAssignment_1
            {
            pushFollow(FOLLOW_rule__LocalDeclaration__VariablesAssignment_1_in_rule__LocalDeclaration__Group__1__Impl6652);
            rule__LocalDeclaration__VariablesAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocalDeclarationAccess().getVariablesAssignment_1()); 
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
    // $ANTLR end "rule__LocalDeclaration__Group__1__Impl"


    // $ANTLR start "rule__LocalDeclaration__Group__2"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3267:1: rule__LocalDeclaration__Group__2 : rule__LocalDeclaration__Group__2__Impl ;
    public final void rule__LocalDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3271:1: ( rule__LocalDeclaration__Group__2__Impl )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3272:2: rule__LocalDeclaration__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__LocalDeclaration__Group__2__Impl_in_rule__LocalDeclaration__Group__26682);
            rule__LocalDeclaration__Group__2__Impl();

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
    // $ANTLR end "rule__LocalDeclaration__Group__2"


    // $ANTLR start "rule__LocalDeclaration__Group__2__Impl"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3278:1: rule__LocalDeclaration__Group__2__Impl : ( ( rule__LocalDeclaration__Group_2__0 )* ) ;
    public final void rule__LocalDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3282:1: ( ( ( rule__LocalDeclaration__Group_2__0 )* ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3283:1: ( ( rule__LocalDeclaration__Group_2__0 )* )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3283:1: ( ( rule__LocalDeclaration__Group_2__0 )* )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3284:1: ( rule__LocalDeclaration__Group_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalDeclarationAccess().getGroup_2()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3285:1: ( rule__LocalDeclaration__Group_2__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==30) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3285:2: rule__LocalDeclaration__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__LocalDeclaration__Group_2__0_in_rule__LocalDeclaration__Group__2__Impl6709);
            	    rule__LocalDeclaration__Group_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocalDeclarationAccess().getGroup_2()); 
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
    // $ANTLR end "rule__LocalDeclaration__Group__2__Impl"


    // $ANTLR start "rule__LocalDeclaration__Group_2__0"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3301:1: rule__LocalDeclaration__Group_2__0 : rule__LocalDeclaration__Group_2__0__Impl rule__LocalDeclaration__Group_2__1 ;
    public final void rule__LocalDeclaration__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3305:1: ( rule__LocalDeclaration__Group_2__0__Impl rule__LocalDeclaration__Group_2__1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3306:2: rule__LocalDeclaration__Group_2__0__Impl rule__LocalDeclaration__Group_2__1
            {
            pushFollow(FOLLOW_rule__LocalDeclaration__Group_2__0__Impl_in_rule__LocalDeclaration__Group_2__06746);
            rule__LocalDeclaration__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__LocalDeclaration__Group_2__1_in_rule__LocalDeclaration__Group_2__06749);
            rule__LocalDeclaration__Group_2__1();

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
    // $ANTLR end "rule__LocalDeclaration__Group_2__0"


    // $ANTLR start "rule__LocalDeclaration__Group_2__0__Impl"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3313:1: rule__LocalDeclaration__Group_2__0__Impl : ( ',' ) ;
    public final void rule__LocalDeclaration__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3317:1: ( ( ',' ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3318:1: ( ',' )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3318:1: ( ',' )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3319:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalDeclarationAccess().getCommaKeyword_2_0()); 
            }
            match(input,30,FOLLOW_30_in_rule__LocalDeclaration__Group_2__0__Impl6777); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocalDeclarationAccess().getCommaKeyword_2_0()); 
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
    // $ANTLR end "rule__LocalDeclaration__Group_2__0__Impl"


    // $ANTLR start "rule__LocalDeclaration__Group_2__1"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3332:1: rule__LocalDeclaration__Group_2__1 : rule__LocalDeclaration__Group_2__1__Impl ;
    public final void rule__LocalDeclaration__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3336:1: ( rule__LocalDeclaration__Group_2__1__Impl )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3337:2: rule__LocalDeclaration__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__LocalDeclaration__Group_2__1__Impl_in_rule__LocalDeclaration__Group_2__16808);
            rule__LocalDeclaration__Group_2__1__Impl();

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
    // $ANTLR end "rule__LocalDeclaration__Group_2__1"


    // $ANTLR start "rule__LocalDeclaration__Group_2__1__Impl"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3343:1: rule__LocalDeclaration__Group_2__1__Impl : ( ( rule__LocalDeclaration__VariablesAssignment_2_1 ) ) ;
    public final void rule__LocalDeclaration__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3347:1: ( ( ( rule__LocalDeclaration__VariablesAssignment_2_1 ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3348:1: ( ( rule__LocalDeclaration__VariablesAssignment_2_1 ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3348:1: ( ( rule__LocalDeclaration__VariablesAssignment_2_1 ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3349:1: ( rule__LocalDeclaration__VariablesAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalDeclarationAccess().getVariablesAssignment_2_1()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3350:1: ( rule__LocalDeclaration__VariablesAssignment_2_1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3350:2: rule__LocalDeclaration__VariablesAssignment_2_1
            {
            pushFollow(FOLLOW_rule__LocalDeclaration__VariablesAssignment_2_1_in_rule__LocalDeclaration__Group_2__1__Impl6835);
            rule__LocalDeclaration__VariablesAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocalDeclarationAccess().getVariablesAssignment_2_1()); 
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
    // $ANTLR end "rule__LocalDeclaration__Group_2__1__Impl"


    // $ANTLR start "rule__GlobalDeclaration__Group__0"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3364:1: rule__GlobalDeclaration__Group__0 : rule__GlobalDeclaration__Group__0__Impl rule__GlobalDeclaration__Group__1 ;
    public final void rule__GlobalDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3368:1: ( rule__GlobalDeclaration__Group__0__Impl rule__GlobalDeclaration__Group__1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3369:2: rule__GlobalDeclaration__Group__0__Impl rule__GlobalDeclaration__Group__1
            {
            pushFollow(FOLLOW_rule__GlobalDeclaration__Group__0__Impl_in_rule__GlobalDeclaration__Group__06869);
            rule__GlobalDeclaration__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GlobalDeclaration__Group__1_in_rule__GlobalDeclaration__Group__06872);
            rule__GlobalDeclaration__Group__1();

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
    // $ANTLR end "rule__GlobalDeclaration__Group__0"


    // $ANTLR start "rule__GlobalDeclaration__Group__0__Impl"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3376:1: rule__GlobalDeclaration__Group__0__Impl : ( 'global' ) ;
    public final void rule__GlobalDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3380:1: ( ( 'global' ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3381:1: ( 'global' )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3381:1: ( 'global' )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3382:1: 'global'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGlobalDeclarationAccess().getGlobalKeyword_0()); 
            }
            match(input,31,FOLLOW_31_in_rule__GlobalDeclaration__Group__0__Impl6900); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGlobalDeclarationAccess().getGlobalKeyword_0()); 
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
    // $ANTLR end "rule__GlobalDeclaration__Group__0__Impl"


    // $ANTLR start "rule__GlobalDeclaration__Group__1"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3395:1: rule__GlobalDeclaration__Group__1 : rule__GlobalDeclaration__Group__1__Impl rule__GlobalDeclaration__Group__2 ;
    public final void rule__GlobalDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3399:1: ( rule__GlobalDeclaration__Group__1__Impl rule__GlobalDeclaration__Group__2 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3400:2: rule__GlobalDeclaration__Group__1__Impl rule__GlobalDeclaration__Group__2
            {
            pushFollow(FOLLOW_rule__GlobalDeclaration__Group__1__Impl_in_rule__GlobalDeclaration__Group__16931);
            rule__GlobalDeclaration__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GlobalDeclaration__Group__2_in_rule__GlobalDeclaration__Group__16934);
            rule__GlobalDeclaration__Group__2();

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
    // $ANTLR end "rule__GlobalDeclaration__Group__1"


    // $ANTLR start "rule__GlobalDeclaration__Group__1__Impl"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3407:1: rule__GlobalDeclaration__Group__1__Impl : ( ( rule__GlobalDeclaration__VariablesAssignment_1 ) ) ;
    public final void rule__GlobalDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3411:1: ( ( ( rule__GlobalDeclaration__VariablesAssignment_1 ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3412:1: ( ( rule__GlobalDeclaration__VariablesAssignment_1 ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3412:1: ( ( rule__GlobalDeclaration__VariablesAssignment_1 ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3413:1: ( rule__GlobalDeclaration__VariablesAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGlobalDeclarationAccess().getVariablesAssignment_1()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3414:1: ( rule__GlobalDeclaration__VariablesAssignment_1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3414:2: rule__GlobalDeclaration__VariablesAssignment_1
            {
            pushFollow(FOLLOW_rule__GlobalDeclaration__VariablesAssignment_1_in_rule__GlobalDeclaration__Group__1__Impl6961);
            rule__GlobalDeclaration__VariablesAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGlobalDeclarationAccess().getVariablesAssignment_1()); 
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
    // $ANTLR end "rule__GlobalDeclaration__Group__1__Impl"


    // $ANTLR start "rule__GlobalDeclaration__Group__2"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3424:1: rule__GlobalDeclaration__Group__2 : rule__GlobalDeclaration__Group__2__Impl ;
    public final void rule__GlobalDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3428:1: ( rule__GlobalDeclaration__Group__2__Impl )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3429:2: rule__GlobalDeclaration__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__GlobalDeclaration__Group__2__Impl_in_rule__GlobalDeclaration__Group__26991);
            rule__GlobalDeclaration__Group__2__Impl();

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
    // $ANTLR end "rule__GlobalDeclaration__Group__2"


    // $ANTLR start "rule__GlobalDeclaration__Group__2__Impl"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3435:1: rule__GlobalDeclaration__Group__2__Impl : ( ( rule__GlobalDeclaration__Group_2__0 )* ) ;
    public final void rule__GlobalDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3439:1: ( ( ( rule__GlobalDeclaration__Group_2__0 )* ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3440:1: ( ( rule__GlobalDeclaration__Group_2__0 )* )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3440:1: ( ( rule__GlobalDeclaration__Group_2__0 )* )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3441:1: ( rule__GlobalDeclaration__Group_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGlobalDeclarationAccess().getGroup_2()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3442:1: ( rule__GlobalDeclaration__Group_2__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==30) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3442:2: rule__GlobalDeclaration__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__GlobalDeclaration__Group_2__0_in_rule__GlobalDeclaration__Group__2__Impl7018);
            	    rule__GlobalDeclaration__Group_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGlobalDeclarationAccess().getGroup_2()); 
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
    // $ANTLR end "rule__GlobalDeclaration__Group__2__Impl"


    // $ANTLR start "rule__GlobalDeclaration__Group_2__0"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3458:1: rule__GlobalDeclaration__Group_2__0 : rule__GlobalDeclaration__Group_2__0__Impl rule__GlobalDeclaration__Group_2__1 ;
    public final void rule__GlobalDeclaration__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3462:1: ( rule__GlobalDeclaration__Group_2__0__Impl rule__GlobalDeclaration__Group_2__1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3463:2: rule__GlobalDeclaration__Group_2__0__Impl rule__GlobalDeclaration__Group_2__1
            {
            pushFollow(FOLLOW_rule__GlobalDeclaration__Group_2__0__Impl_in_rule__GlobalDeclaration__Group_2__07055);
            rule__GlobalDeclaration__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GlobalDeclaration__Group_2__1_in_rule__GlobalDeclaration__Group_2__07058);
            rule__GlobalDeclaration__Group_2__1();

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
    // $ANTLR end "rule__GlobalDeclaration__Group_2__0"


    // $ANTLR start "rule__GlobalDeclaration__Group_2__0__Impl"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3470:1: rule__GlobalDeclaration__Group_2__0__Impl : ( ',' ) ;
    public final void rule__GlobalDeclaration__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3474:1: ( ( ',' ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3475:1: ( ',' )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3475:1: ( ',' )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3476:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGlobalDeclarationAccess().getCommaKeyword_2_0()); 
            }
            match(input,30,FOLLOW_30_in_rule__GlobalDeclaration__Group_2__0__Impl7086); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGlobalDeclarationAccess().getCommaKeyword_2_0()); 
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
    // $ANTLR end "rule__GlobalDeclaration__Group_2__0__Impl"


    // $ANTLR start "rule__GlobalDeclaration__Group_2__1"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3489:1: rule__GlobalDeclaration__Group_2__1 : rule__GlobalDeclaration__Group_2__1__Impl ;
    public final void rule__GlobalDeclaration__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3493:1: ( rule__GlobalDeclaration__Group_2__1__Impl )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3494:2: rule__GlobalDeclaration__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__GlobalDeclaration__Group_2__1__Impl_in_rule__GlobalDeclaration__Group_2__17117);
            rule__GlobalDeclaration__Group_2__1__Impl();

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
    // $ANTLR end "rule__GlobalDeclaration__Group_2__1"


    // $ANTLR start "rule__GlobalDeclaration__Group_2__1__Impl"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3500:1: rule__GlobalDeclaration__Group_2__1__Impl : ( ( rule__GlobalDeclaration__VariablesAssignment_2_1 ) ) ;
    public final void rule__GlobalDeclaration__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3504:1: ( ( ( rule__GlobalDeclaration__VariablesAssignment_2_1 ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3505:1: ( ( rule__GlobalDeclaration__VariablesAssignment_2_1 ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3505:1: ( ( rule__GlobalDeclaration__VariablesAssignment_2_1 ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3506:1: ( rule__GlobalDeclaration__VariablesAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGlobalDeclarationAccess().getVariablesAssignment_2_1()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3507:1: ( rule__GlobalDeclaration__VariablesAssignment_2_1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3507:2: rule__GlobalDeclaration__VariablesAssignment_2_1
            {
            pushFollow(FOLLOW_rule__GlobalDeclaration__VariablesAssignment_2_1_in_rule__GlobalDeclaration__Group_2__1__Impl7144);
            rule__GlobalDeclaration__VariablesAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGlobalDeclarationAccess().getVariablesAssignment_2_1()); 
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
    // $ANTLR end "rule__GlobalDeclaration__Group_2__1__Impl"


    // $ANTLR start "rule__VariableDeclaration__Group__0"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3521:1: rule__VariableDeclaration__Group__0 : rule__VariableDeclaration__Group__0__Impl rule__VariableDeclaration__Group__1 ;
    public final void rule__VariableDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3525:1: ( rule__VariableDeclaration__Group__0__Impl rule__VariableDeclaration__Group__1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3526:2: rule__VariableDeclaration__Group__0__Impl rule__VariableDeclaration__Group__1
            {
            pushFollow(FOLLOW_rule__VariableDeclaration__Group__0__Impl_in_rule__VariableDeclaration__Group__07178);
            rule__VariableDeclaration__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__VariableDeclaration__Group__1_in_rule__VariableDeclaration__Group__07181);
            rule__VariableDeclaration__Group__1();

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
    // $ANTLR end "rule__VariableDeclaration__Group__0"


    // $ANTLR start "rule__VariableDeclaration__Group__0__Impl"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3533:1: rule__VariableDeclaration__Group__0__Impl : ( ( rule__VariableDeclaration__NameAssignment_0 ) ) ;
    public final void rule__VariableDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3537:1: ( ( ( rule__VariableDeclaration__NameAssignment_0 ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3538:1: ( ( rule__VariableDeclaration__NameAssignment_0 ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3538:1: ( ( rule__VariableDeclaration__NameAssignment_0 ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3539:1: ( rule__VariableDeclaration__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableDeclarationAccess().getNameAssignment_0()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3540:1: ( rule__VariableDeclaration__NameAssignment_0 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3540:2: rule__VariableDeclaration__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__VariableDeclaration__NameAssignment_0_in_rule__VariableDeclaration__Group__0__Impl7208);
            rule__VariableDeclaration__NameAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableDeclarationAccess().getNameAssignment_0()); 
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
    // $ANTLR end "rule__VariableDeclaration__Group__0__Impl"


    // $ANTLR start "rule__VariableDeclaration__Group__1"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3550:1: rule__VariableDeclaration__Group__1 : rule__VariableDeclaration__Group__1__Impl ;
    public final void rule__VariableDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3554:1: ( rule__VariableDeclaration__Group__1__Impl )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3555:2: rule__VariableDeclaration__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__VariableDeclaration__Group__1__Impl_in_rule__VariableDeclaration__Group__17238);
            rule__VariableDeclaration__Group__1__Impl();

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
    // $ANTLR end "rule__VariableDeclaration__Group__1"


    // $ANTLR start "rule__VariableDeclaration__Group__1__Impl"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3561:1: rule__VariableDeclaration__Group__1__Impl : ( ( rule__VariableDeclaration__Group_1__0 )? ) ;
    public final void rule__VariableDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3565:1: ( ( ( rule__VariableDeclaration__Group_1__0 )? ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3566:1: ( ( rule__VariableDeclaration__Group_1__0 )? )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3566:1: ( ( rule__VariableDeclaration__Group_1__0 )? )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3567:1: ( rule__VariableDeclaration__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableDeclarationAccess().getGroup_1()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3568:1: ( rule__VariableDeclaration__Group_1__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==19) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3568:2: rule__VariableDeclaration__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__VariableDeclaration__Group_1__0_in_rule__VariableDeclaration__Group__1__Impl7265);
                    rule__VariableDeclaration__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableDeclarationAccess().getGroup_1()); 
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
    // $ANTLR end "rule__VariableDeclaration__Group__1__Impl"


    // $ANTLR start "rule__VariableDeclaration__Group_1__0"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3582:1: rule__VariableDeclaration__Group_1__0 : rule__VariableDeclaration__Group_1__0__Impl rule__VariableDeclaration__Group_1__1 ;
    public final void rule__VariableDeclaration__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3586:1: ( rule__VariableDeclaration__Group_1__0__Impl rule__VariableDeclaration__Group_1__1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3587:2: rule__VariableDeclaration__Group_1__0__Impl rule__VariableDeclaration__Group_1__1
            {
            pushFollow(FOLLOW_rule__VariableDeclaration__Group_1__0__Impl_in_rule__VariableDeclaration__Group_1__07300);
            rule__VariableDeclaration__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__VariableDeclaration__Group_1__1_in_rule__VariableDeclaration__Group_1__07303);
            rule__VariableDeclaration__Group_1__1();

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
    // $ANTLR end "rule__VariableDeclaration__Group_1__0"


    // $ANTLR start "rule__VariableDeclaration__Group_1__0__Impl"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3594:1: rule__VariableDeclaration__Group_1__0__Impl : ( '=' ) ;
    public final void rule__VariableDeclaration__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3598:1: ( ( '=' ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3599:1: ( '=' )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3599:1: ( '=' )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3600:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableDeclarationAccess().getEqualsSignKeyword_1_0()); 
            }
            match(input,19,FOLLOW_19_in_rule__VariableDeclaration__Group_1__0__Impl7331); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableDeclarationAccess().getEqualsSignKeyword_1_0()); 
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
    // $ANTLR end "rule__VariableDeclaration__Group_1__0__Impl"


    // $ANTLR start "rule__VariableDeclaration__Group_1__1"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3613:1: rule__VariableDeclaration__Group_1__1 : rule__VariableDeclaration__Group_1__1__Impl ;
    public final void rule__VariableDeclaration__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3617:1: ( rule__VariableDeclaration__Group_1__1__Impl )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3618:2: rule__VariableDeclaration__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__VariableDeclaration__Group_1__1__Impl_in_rule__VariableDeclaration__Group_1__17362);
            rule__VariableDeclaration__Group_1__1__Impl();

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
    // $ANTLR end "rule__VariableDeclaration__Group_1__1"


    // $ANTLR start "rule__VariableDeclaration__Group_1__1__Impl"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3624:1: rule__VariableDeclaration__Group_1__1__Impl : ( ( rule__VariableDeclaration__ValueAssignment_1_1 ) ) ;
    public final void rule__VariableDeclaration__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3628:1: ( ( ( rule__VariableDeclaration__ValueAssignment_1_1 ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3629:1: ( ( rule__VariableDeclaration__ValueAssignment_1_1 ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3629:1: ( ( rule__VariableDeclaration__ValueAssignment_1_1 ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3630:1: ( rule__VariableDeclaration__ValueAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableDeclarationAccess().getValueAssignment_1_1()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3631:1: ( rule__VariableDeclaration__ValueAssignment_1_1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3631:2: rule__VariableDeclaration__ValueAssignment_1_1
            {
            pushFollow(FOLLOW_rule__VariableDeclaration__ValueAssignment_1_1_in_rule__VariableDeclaration__Group_1__1__Impl7389);
            rule__VariableDeclaration__ValueAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableDeclarationAccess().getValueAssignment_1_1()); 
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
    // $ANTLR end "rule__VariableDeclaration__Group_1__1__Impl"


    // $ANTLR start "rule__Comparison__Group__0"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3645:1: rule__Comparison__Group__0 : rule__Comparison__Group__0__Impl rule__Comparison__Group__1 ;
    public final void rule__Comparison__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3649:1: ( rule__Comparison__Group__0__Impl rule__Comparison__Group__1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3650:2: rule__Comparison__Group__0__Impl rule__Comparison__Group__1
            {
            pushFollow(FOLLOW_rule__Comparison__Group__0__Impl_in_rule__Comparison__Group__07423);
            rule__Comparison__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Comparison__Group__1_in_rule__Comparison__Group__07426);
            rule__Comparison__Group__1();

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
    // $ANTLR end "rule__Comparison__Group__0"


    // $ANTLR start "rule__Comparison__Group__0__Impl"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3657:1: rule__Comparison__Group__0__Impl : ( ruleOr ) ;
    public final void rule__Comparison__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3661:1: ( ( ruleOr ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3662:1: ( ruleOr )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3662:1: ( ruleOr )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3663:1: ruleOr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getOrParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleOr_in_rule__Comparison__Group__0__Impl7453);
            ruleOr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonAccess().getOrParserRuleCall_0()); 
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
    // $ANTLR end "rule__Comparison__Group__0__Impl"


    // $ANTLR start "rule__Comparison__Group__1"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3674:1: rule__Comparison__Group__1 : rule__Comparison__Group__1__Impl ;
    public final void rule__Comparison__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3678:1: ( rule__Comparison__Group__1__Impl )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3679:2: rule__Comparison__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Comparison__Group__1__Impl_in_rule__Comparison__Group__17482);
            rule__Comparison__Group__1__Impl();

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
    // $ANTLR end "rule__Comparison__Group__1"


    // $ANTLR start "rule__Comparison__Group__1__Impl"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3685:1: rule__Comparison__Group__1__Impl : ( ( rule__Comparison__Group_1__0 )* ) ;
    public final void rule__Comparison__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3689:1: ( ( ( rule__Comparison__Group_1__0 )* ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3690:1: ( ( rule__Comparison__Group_1__0 )* )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3690:1: ( ( rule__Comparison__Group_1__0 )* )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3691:1: ( rule__Comparison__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getGroup_1()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3692:1: ( rule__Comparison__Group_1__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=32 && LA19_0<=39)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3692:2: rule__Comparison__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Comparison__Group_1__0_in_rule__Comparison__Group__1__Impl7509);
            	    rule__Comparison__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonAccess().getGroup_1()); 
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
    // $ANTLR end "rule__Comparison__Group__1__Impl"


    // $ANTLR start "rule__Comparison__Group_1__0"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3706:1: rule__Comparison__Group_1__0 : rule__Comparison__Group_1__0__Impl rule__Comparison__Group_1__1 ;
    public final void rule__Comparison__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3710:1: ( rule__Comparison__Group_1__0__Impl rule__Comparison__Group_1__1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3711:2: rule__Comparison__Group_1__0__Impl rule__Comparison__Group_1__1
            {
            pushFollow(FOLLOW_rule__Comparison__Group_1__0__Impl_in_rule__Comparison__Group_1__07544);
            rule__Comparison__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Comparison__Group_1__1_in_rule__Comparison__Group_1__07547);
            rule__Comparison__Group_1__1();

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
    // $ANTLR end "rule__Comparison__Group_1__0"


    // $ANTLR start "rule__Comparison__Group_1__0__Impl"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3718:1: rule__Comparison__Group_1__0__Impl : ( ( rule__Comparison__Alternatives_1_0 ) ) ;
    public final void rule__Comparison__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3722:1: ( ( ( rule__Comparison__Alternatives_1_0 ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3723:1: ( ( rule__Comparison__Alternatives_1_0 ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3723:1: ( ( rule__Comparison__Alternatives_1_0 ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3724:1: ( rule__Comparison__Alternatives_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getAlternatives_1_0()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3725:1: ( rule__Comparison__Alternatives_1_0 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3725:2: rule__Comparison__Alternatives_1_0
            {
            pushFollow(FOLLOW_rule__Comparison__Alternatives_1_0_in_rule__Comparison__Group_1__0__Impl7574);
            rule__Comparison__Alternatives_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonAccess().getAlternatives_1_0()); 
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
    // $ANTLR end "rule__Comparison__Group_1__0__Impl"


    // $ANTLR start "rule__Comparison__Group_1__1"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3735:1: rule__Comparison__Group_1__1 : rule__Comparison__Group_1__1__Impl ;
    public final void rule__Comparison__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3739:1: ( rule__Comparison__Group_1__1__Impl )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3740:2: rule__Comparison__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Comparison__Group_1__1__Impl_in_rule__Comparison__Group_1__17604);
            rule__Comparison__Group_1__1__Impl();

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
    // $ANTLR end "rule__Comparison__Group_1__1"


    // $ANTLR start "rule__Comparison__Group_1__1__Impl"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3746:1: rule__Comparison__Group_1__1__Impl : ( ( rule__Comparison__RightAssignment_1_1 ) ) ;
    public final void rule__Comparison__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3750:1: ( ( ( rule__Comparison__RightAssignment_1_1 ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3751:1: ( ( rule__Comparison__RightAssignment_1_1 ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3751:1: ( ( rule__Comparison__RightAssignment_1_1 ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3752:1: ( rule__Comparison__RightAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getRightAssignment_1_1()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3753:1: ( rule__Comparison__RightAssignment_1_1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3753:2: rule__Comparison__RightAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Comparison__RightAssignment_1_1_in_rule__Comparison__Group_1__1__Impl7631);
            rule__Comparison__RightAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonAccess().getRightAssignment_1_1()); 
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
    // $ANTLR end "rule__Comparison__Group_1__1__Impl"


    // $ANTLR start "rule__Comparison__Group_1_0_0__0"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3767:1: rule__Comparison__Group_1_0_0__0 : rule__Comparison__Group_1_0_0__0__Impl rule__Comparison__Group_1_0_0__1 ;
    public final void rule__Comparison__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3771:1: ( rule__Comparison__Group_1_0_0__0__Impl rule__Comparison__Group_1_0_0__1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3772:2: rule__Comparison__Group_1_0_0__0__Impl rule__Comparison__Group_1_0_0__1
            {
            pushFollow(FOLLOW_rule__Comparison__Group_1_0_0__0__Impl_in_rule__Comparison__Group_1_0_0__07665);
            rule__Comparison__Group_1_0_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Comparison__Group_1_0_0__1_in_rule__Comparison__Group_1_0_0__07668);
            rule__Comparison__Group_1_0_0__1();

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
    // $ANTLR end "rule__Comparison__Group_1_0_0__0"


    // $ANTLR start "rule__Comparison__Group_1_0_0__0__Impl"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3779:1: rule__Comparison__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__Comparison__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3783:1: ( ( () ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3784:1: ( () )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3784:1: ( () )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3785:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getTypedEqualsLeftAction_1_0_0_0()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3786:1: ()
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3788:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonAccess().getTypedEqualsLeftAction_1_0_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1_0_0__0__Impl"


    // $ANTLR start "rule__Comparison__Group_1_0_0__1"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3798:1: rule__Comparison__Group_1_0_0__1 : rule__Comparison__Group_1_0_0__1__Impl ;
    public final void rule__Comparison__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3802:1: ( rule__Comparison__Group_1_0_0__1__Impl )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3803:2: rule__Comparison__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Comparison__Group_1_0_0__1__Impl_in_rule__Comparison__Group_1_0_0__17726);
            rule__Comparison__Group_1_0_0__1__Impl();

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
    // $ANTLR end "rule__Comparison__Group_1_0_0__1"


    // $ANTLR start "rule__Comparison__Group_1_0_0__1__Impl"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3809:1: rule__Comparison__Group_1_0_0__1__Impl : ( '===' ) ;
    public final void rule__Comparison__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3813:1: ( ( '===' ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3814:1: ( '===' )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3814:1: ( '===' )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3815:1: '==='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getEqualsSignEqualsSignEqualsSignKeyword_1_0_0_1()); 
            }
            match(input,32,FOLLOW_32_in_rule__Comparison__Group_1_0_0__1__Impl7754); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonAccess().getEqualsSignEqualsSignEqualsSignKeyword_1_0_0_1()); 
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
    // $ANTLR end "rule__Comparison__Group_1_0_0__1__Impl"


    // $ANTLR start "rule__Comparison__Group_1_0_1__0"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3832:1: rule__Comparison__Group_1_0_1__0 : rule__Comparison__Group_1_0_1__0__Impl rule__Comparison__Group_1_0_1__1 ;
    public final void rule__Comparison__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3836:1: ( rule__Comparison__Group_1_0_1__0__Impl rule__Comparison__Group_1_0_1__1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3837:2: rule__Comparison__Group_1_0_1__0__Impl rule__Comparison__Group_1_0_1__1
            {
            pushFollow(FOLLOW_rule__Comparison__Group_1_0_1__0__Impl_in_rule__Comparison__Group_1_0_1__07789);
            rule__Comparison__Group_1_0_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Comparison__Group_1_0_1__1_in_rule__Comparison__Group_1_0_1__07792);
            rule__Comparison__Group_1_0_1__1();

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
    // $ANTLR end "rule__Comparison__Group_1_0_1__0"


    // $ANTLR start "rule__Comparison__Group_1_0_1__0__Impl"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3844:1: rule__Comparison__Group_1_0_1__0__Impl : ( () ) ;
    public final void rule__Comparison__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3848:1: ( ( () ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3849:1: ( () )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3849:1: ( () )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3850:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getEqualsLeftAction_1_0_1_0()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3851:1: ()
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3853:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonAccess().getEqualsLeftAction_1_0_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1_0_1__0__Impl"


    // $ANTLR start "rule__Comparison__Group_1_0_1__1"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3863:1: rule__Comparison__Group_1_0_1__1 : rule__Comparison__Group_1_0_1__1__Impl ;
    public final void rule__Comparison__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3867:1: ( rule__Comparison__Group_1_0_1__1__Impl )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3868:2: rule__Comparison__Group_1_0_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Comparison__Group_1_0_1__1__Impl_in_rule__Comparison__Group_1_0_1__17850);
            rule__Comparison__Group_1_0_1__1__Impl();

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
    // $ANTLR end "rule__Comparison__Group_1_0_1__1"


    // $ANTLR start "rule__Comparison__Group_1_0_1__1__Impl"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3874:1: rule__Comparison__Group_1_0_1__1__Impl : ( '==' ) ;
    public final void rule__Comparison__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3878:1: ( ( '==' ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3879:1: ( '==' )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3879:1: ( '==' )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3880:1: '=='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getEqualsSignEqualsSignKeyword_1_0_1_1()); 
            }
            match(input,33,FOLLOW_33_in_rule__Comparison__Group_1_0_1__1__Impl7878); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonAccess().getEqualsSignEqualsSignKeyword_1_0_1_1()); 
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
    // $ANTLR end "rule__Comparison__Group_1_0_1__1__Impl"


    // $ANTLR start "rule__Comparison__Group_1_0_2__0"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3897:1: rule__Comparison__Group_1_0_2__0 : rule__Comparison__Group_1_0_2__0__Impl rule__Comparison__Group_1_0_2__1 ;
    public final void rule__Comparison__Group_1_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3901:1: ( rule__Comparison__Group_1_0_2__0__Impl rule__Comparison__Group_1_0_2__1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3902:2: rule__Comparison__Group_1_0_2__0__Impl rule__Comparison__Group_1_0_2__1
            {
            pushFollow(FOLLOW_rule__Comparison__Group_1_0_2__0__Impl_in_rule__Comparison__Group_1_0_2__07913);
            rule__Comparison__Group_1_0_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Comparison__Group_1_0_2__1_in_rule__Comparison__Group_1_0_2__07916);
            rule__Comparison__Group_1_0_2__1();

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
    // $ANTLR end "rule__Comparison__Group_1_0_2__0"


    // $ANTLR start "rule__Comparison__Group_1_0_2__0__Impl"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3909:1: rule__Comparison__Group_1_0_2__0__Impl : ( () ) ;
    public final void rule__Comparison__Group_1_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3913:1: ( ( () ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3914:1: ( () )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3914:1: ( () )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3915:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getTypedDifferentLeftAction_1_0_2_0()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3916:1: ()
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3918:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonAccess().getTypedDifferentLeftAction_1_0_2_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1_0_2__0__Impl"


    // $ANTLR start "rule__Comparison__Group_1_0_2__1"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3928:1: rule__Comparison__Group_1_0_2__1 : rule__Comparison__Group_1_0_2__1__Impl ;
    public final void rule__Comparison__Group_1_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3932:1: ( rule__Comparison__Group_1_0_2__1__Impl )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3933:2: rule__Comparison__Group_1_0_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Comparison__Group_1_0_2__1__Impl_in_rule__Comparison__Group_1_0_2__17974);
            rule__Comparison__Group_1_0_2__1__Impl();

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
    // $ANTLR end "rule__Comparison__Group_1_0_2__1"


    // $ANTLR start "rule__Comparison__Group_1_0_2__1__Impl"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3939:1: rule__Comparison__Group_1_0_2__1__Impl : ( '!==' ) ;
    public final void rule__Comparison__Group_1_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3943:1: ( ( '!==' ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3944:1: ( '!==' )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3944:1: ( '!==' )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3945:1: '!=='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getExclamationMarkEqualsSignEqualsSignKeyword_1_0_2_1()); 
            }
            match(input,34,FOLLOW_34_in_rule__Comparison__Group_1_0_2__1__Impl8002); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonAccess().getExclamationMarkEqualsSignEqualsSignKeyword_1_0_2_1()); 
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
    // $ANTLR end "rule__Comparison__Group_1_0_2__1__Impl"


    // $ANTLR start "rule__Comparison__Group_1_0_3__0"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3962:1: rule__Comparison__Group_1_0_3__0 : rule__Comparison__Group_1_0_3__0__Impl rule__Comparison__Group_1_0_3__1 ;
    public final void rule__Comparison__Group_1_0_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3966:1: ( rule__Comparison__Group_1_0_3__0__Impl rule__Comparison__Group_1_0_3__1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3967:2: rule__Comparison__Group_1_0_3__0__Impl rule__Comparison__Group_1_0_3__1
            {
            pushFollow(FOLLOW_rule__Comparison__Group_1_0_3__0__Impl_in_rule__Comparison__Group_1_0_3__08037);
            rule__Comparison__Group_1_0_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Comparison__Group_1_0_3__1_in_rule__Comparison__Group_1_0_3__08040);
            rule__Comparison__Group_1_0_3__1();

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
    // $ANTLR end "rule__Comparison__Group_1_0_3__0"


    // $ANTLR start "rule__Comparison__Group_1_0_3__0__Impl"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3974:1: rule__Comparison__Group_1_0_3__0__Impl : ( () ) ;
    public final void rule__Comparison__Group_1_0_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3978:1: ( ( () ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3979:1: ( () )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3979:1: ( () )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3980:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getDifferentLeftAction_1_0_3_0()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3981:1: ()
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3983:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonAccess().getDifferentLeftAction_1_0_3_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1_0_3__0__Impl"


    // $ANTLR start "rule__Comparison__Group_1_0_3__1"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3993:1: rule__Comparison__Group_1_0_3__1 : rule__Comparison__Group_1_0_3__1__Impl ;
    public final void rule__Comparison__Group_1_0_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3997:1: ( rule__Comparison__Group_1_0_3__1__Impl )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3998:2: rule__Comparison__Group_1_0_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Comparison__Group_1_0_3__1__Impl_in_rule__Comparison__Group_1_0_3__18098);
            rule__Comparison__Group_1_0_3__1__Impl();

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
    // $ANTLR end "rule__Comparison__Group_1_0_3__1"


    // $ANTLR start "rule__Comparison__Group_1_0_3__1__Impl"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4004:1: rule__Comparison__Group_1_0_3__1__Impl : ( '!=' ) ;
    public final void rule__Comparison__Group_1_0_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4008:1: ( ( '!=' ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4009:1: ( '!=' )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4009:1: ( '!=' )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4010:1: '!='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getExclamationMarkEqualsSignKeyword_1_0_3_1()); 
            }
            match(input,35,FOLLOW_35_in_rule__Comparison__Group_1_0_3__1__Impl8126); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonAccess().getExclamationMarkEqualsSignKeyword_1_0_3_1()); 
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
    // $ANTLR end "rule__Comparison__Group_1_0_3__1__Impl"


    // $ANTLR start "rule__Comparison__Group_1_0_4__0"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4027:1: rule__Comparison__Group_1_0_4__0 : rule__Comparison__Group_1_0_4__0__Impl rule__Comparison__Group_1_0_4__1 ;
    public final void rule__Comparison__Group_1_0_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4031:1: ( rule__Comparison__Group_1_0_4__0__Impl rule__Comparison__Group_1_0_4__1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4032:2: rule__Comparison__Group_1_0_4__0__Impl rule__Comparison__Group_1_0_4__1
            {
            pushFollow(FOLLOW_rule__Comparison__Group_1_0_4__0__Impl_in_rule__Comparison__Group_1_0_4__08161);
            rule__Comparison__Group_1_0_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Comparison__Group_1_0_4__1_in_rule__Comparison__Group_1_0_4__08164);
            rule__Comparison__Group_1_0_4__1();

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
    // $ANTLR end "rule__Comparison__Group_1_0_4__0"


    // $ANTLR start "rule__Comparison__Group_1_0_4__0__Impl"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4039:1: rule__Comparison__Group_1_0_4__0__Impl : ( () ) ;
    public final void rule__Comparison__Group_1_0_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4043:1: ( ( () ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4044:1: ( () )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4044:1: ( () )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4045:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getLessOrEqualsLeftAction_1_0_4_0()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4046:1: ()
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4048:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonAccess().getLessOrEqualsLeftAction_1_0_4_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1_0_4__0__Impl"


    // $ANTLR start "rule__Comparison__Group_1_0_4__1"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4058:1: rule__Comparison__Group_1_0_4__1 : rule__Comparison__Group_1_0_4__1__Impl ;
    public final void rule__Comparison__Group_1_0_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4062:1: ( rule__Comparison__Group_1_0_4__1__Impl )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4063:2: rule__Comparison__Group_1_0_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Comparison__Group_1_0_4__1__Impl_in_rule__Comparison__Group_1_0_4__18222);
            rule__Comparison__Group_1_0_4__1__Impl();

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
    // $ANTLR end "rule__Comparison__Group_1_0_4__1"


    // $ANTLR start "rule__Comparison__Group_1_0_4__1__Impl"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4069:1: rule__Comparison__Group_1_0_4__1__Impl : ( '<=' ) ;
    public final void rule__Comparison__Group_1_0_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4073:1: ( ( '<=' ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4074:1: ( '<=' )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4074:1: ( '<=' )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4075:1: '<='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getLessThanSignEqualsSignKeyword_1_0_4_1()); 
            }
            match(input,36,FOLLOW_36_in_rule__Comparison__Group_1_0_4__1__Impl8250); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonAccess().getLessThanSignEqualsSignKeyword_1_0_4_1()); 
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
    // $ANTLR end "rule__Comparison__Group_1_0_4__1__Impl"


    // $ANTLR start "rule__Comparison__Group_1_0_5__0"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4092:1: rule__Comparison__Group_1_0_5__0 : rule__Comparison__Group_1_0_5__0__Impl rule__Comparison__Group_1_0_5__1 ;
    public final void rule__Comparison__Group_1_0_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4096:1: ( rule__Comparison__Group_1_0_5__0__Impl rule__Comparison__Group_1_0_5__1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4097:2: rule__Comparison__Group_1_0_5__0__Impl rule__Comparison__Group_1_0_5__1
            {
            pushFollow(FOLLOW_rule__Comparison__Group_1_0_5__0__Impl_in_rule__Comparison__Group_1_0_5__08285);
            rule__Comparison__Group_1_0_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Comparison__Group_1_0_5__1_in_rule__Comparison__Group_1_0_5__08288);
            rule__Comparison__Group_1_0_5__1();

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
    // $ANTLR end "rule__Comparison__Group_1_0_5__0"


    // $ANTLR start "rule__Comparison__Group_1_0_5__0__Impl"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4104:1: rule__Comparison__Group_1_0_5__0__Impl : ( () ) ;
    public final void rule__Comparison__Group_1_0_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4108:1: ( ( () ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4109:1: ( () )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4109:1: ( () )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4110:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getLessLeftAction_1_0_5_0()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4111:1: ()
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4113:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonAccess().getLessLeftAction_1_0_5_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1_0_5__0__Impl"


    // $ANTLR start "rule__Comparison__Group_1_0_5__1"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4123:1: rule__Comparison__Group_1_0_5__1 : rule__Comparison__Group_1_0_5__1__Impl ;
    public final void rule__Comparison__Group_1_0_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4127:1: ( rule__Comparison__Group_1_0_5__1__Impl )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4128:2: rule__Comparison__Group_1_0_5__1__Impl
            {
            pushFollow(FOLLOW_rule__Comparison__Group_1_0_5__1__Impl_in_rule__Comparison__Group_1_0_5__18346);
            rule__Comparison__Group_1_0_5__1__Impl();

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
    // $ANTLR end "rule__Comparison__Group_1_0_5__1"


    // $ANTLR start "rule__Comparison__Group_1_0_5__1__Impl"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4134:1: rule__Comparison__Group_1_0_5__1__Impl : ( '<' ) ;
    public final void rule__Comparison__Group_1_0_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4138:1: ( ( '<' ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4139:1: ( '<' )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4139:1: ( '<' )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4140:1: '<'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getLessThanSignKeyword_1_0_5_1()); 
            }
            match(input,37,FOLLOW_37_in_rule__Comparison__Group_1_0_5__1__Impl8374); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonAccess().getLessThanSignKeyword_1_0_5_1()); 
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
    // $ANTLR end "rule__Comparison__Group_1_0_5__1__Impl"


    // $ANTLR start "rule__Comparison__Group_1_0_6__0"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4157:1: rule__Comparison__Group_1_0_6__0 : rule__Comparison__Group_1_0_6__0__Impl rule__Comparison__Group_1_0_6__1 ;
    public final void rule__Comparison__Group_1_0_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4161:1: ( rule__Comparison__Group_1_0_6__0__Impl rule__Comparison__Group_1_0_6__1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4162:2: rule__Comparison__Group_1_0_6__0__Impl rule__Comparison__Group_1_0_6__1
            {
            pushFollow(FOLLOW_rule__Comparison__Group_1_0_6__0__Impl_in_rule__Comparison__Group_1_0_6__08409);
            rule__Comparison__Group_1_0_6__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Comparison__Group_1_0_6__1_in_rule__Comparison__Group_1_0_6__08412);
            rule__Comparison__Group_1_0_6__1();

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
    // $ANTLR end "rule__Comparison__Group_1_0_6__0"


    // $ANTLR start "rule__Comparison__Group_1_0_6__0__Impl"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4169:1: rule__Comparison__Group_1_0_6__0__Impl : ( () ) ;
    public final void rule__Comparison__Group_1_0_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4173:1: ( ( () ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4174:1: ( () )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4174:1: ( () )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4175:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getMoreOrEqualsLeftAction_1_0_6_0()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4176:1: ()
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4178:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonAccess().getMoreOrEqualsLeftAction_1_0_6_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1_0_6__0__Impl"


    // $ANTLR start "rule__Comparison__Group_1_0_6__1"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4188:1: rule__Comparison__Group_1_0_6__1 : rule__Comparison__Group_1_0_6__1__Impl ;
    public final void rule__Comparison__Group_1_0_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4192:1: ( rule__Comparison__Group_1_0_6__1__Impl )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4193:2: rule__Comparison__Group_1_0_6__1__Impl
            {
            pushFollow(FOLLOW_rule__Comparison__Group_1_0_6__1__Impl_in_rule__Comparison__Group_1_0_6__18470);
            rule__Comparison__Group_1_0_6__1__Impl();

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
    // $ANTLR end "rule__Comparison__Group_1_0_6__1"


    // $ANTLR start "rule__Comparison__Group_1_0_6__1__Impl"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4199:1: rule__Comparison__Group_1_0_6__1__Impl : ( '>=' ) ;
    public final void rule__Comparison__Group_1_0_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4203:1: ( ( '>=' ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4204:1: ( '>=' )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4204:1: ( '>=' )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4205:1: '>='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getGreaterThanSignEqualsSignKeyword_1_0_6_1()); 
            }
            match(input,38,FOLLOW_38_in_rule__Comparison__Group_1_0_6__1__Impl8498); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonAccess().getGreaterThanSignEqualsSignKeyword_1_0_6_1()); 
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
    // $ANTLR end "rule__Comparison__Group_1_0_6__1__Impl"


    // $ANTLR start "rule__Comparison__Group_1_0_7__0"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4222:1: rule__Comparison__Group_1_0_7__0 : rule__Comparison__Group_1_0_7__0__Impl rule__Comparison__Group_1_0_7__1 ;
    public final void rule__Comparison__Group_1_0_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4226:1: ( rule__Comparison__Group_1_0_7__0__Impl rule__Comparison__Group_1_0_7__1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4227:2: rule__Comparison__Group_1_0_7__0__Impl rule__Comparison__Group_1_0_7__1
            {
            pushFollow(FOLLOW_rule__Comparison__Group_1_0_7__0__Impl_in_rule__Comparison__Group_1_0_7__08533);
            rule__Comparison__Group_1_0_7__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Comparison__Group_1_0_7__1_in_rule__Comparison__Group_1_0_7__08536);
            rule__Comparison__Group_1_0_7__1();

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
    // $ANTLR end "rule__Comparison__Group_1_0_7__0"


    // $ANTLR start "rule__Comparison__Group_1_0_7__0__Impl"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4234:1: rule__Comparison__Group_1_0_7__0__Impl : ( () ) ;
    public final void rule__Comparison__Group_1_0_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4238:1: ( ( () ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4239:1: ( () )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4239:1: ( () )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4240:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getMoreLeftAction_1_0_7_0()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4241:1: ()
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4243:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonAccess().getMoreLeftAction_1_0_7_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1_0_7__0__Impl"


    // $ANTLR start "rule__Comparison__Group_1_0_7__1"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4253:1: rule__Comparison__Group_1_0_7__1 : rule__Comparison__Group_1_0_7__1__Impl ;
    public final void rule__Comparison__Group_1_0_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4257:1: ( rule__Comparison__Group_1_0_7__1__Impl )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4258:2: rule__Comparison__Group_1_0_7__1__Impl
            {
            pushFollow(FOLLOW_rule__Comparison__Group_1_0_7__1__Impl_in_rule__Comparison__Group_1_0_7__18594);
            rule__Comparison__Group_1_0_7__1__Impl();

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
    // $ANTLR end "rule__Comparison__Group_1_0_7__1"


    // $ANTLR start "rule__Comparison__Group_1_0_7__1__Impl"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4264:1: rule__Comparison__Group_1_0_7__1__Impl : ( '>' ) ;
    public final void rule__Comparison__Group_1_0_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4268:1: ( ( '>' ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4269:1: ( '>' )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4269:1: ( '>' )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4270:1: '>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getGreaterThanSignKeyword_1_0_7_1()); 
            }
            match(input,39,FOLLOW_39_in_rule__Comparison__Group_1_0_7__1__Impl8622); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonAccess().getGreaterThanSignKeyword_1_0_7_1()); 
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
    // $ANTLR end "rule__Comparison__Group_1_0_7__1__Impl"


    // $ANTLR start "rule__Or__Group__0"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4287:1: rule__Or__Group__0 : rule__Or__Group__0__Impl rule__Or__Group__1 ;
    public final void rule__Or__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4291:1: ( rule__Or__Group__0__Impl rule__Or__Group__1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4292:2: rule__Or__Group__0__Impl rule__Or__Group__1
            {
            pushFollow(FOLLOW_rule__Or__Group__0__Impl_in_rule__Or__Group__08657);
            rule__Or__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Or__Group__1_in_rule__Or__Group__08660);
            rule__Or__Group__1();

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
    // $ANTLR end "rule__Or__Group__0"


    // $ANTLR start "rule__Or__Group__0__Impl"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4299:1: rule__Or__Group__0__Impl : ( ruleAnd ) ;
    public final void rule__Or__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4303:1: ( ( ruleAnd ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4304:1: ( ruleAnd )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4304:1: ( ruleAnd )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4305:1: ruleAnd
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAccess().getAndParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleAnd_in_rule__Or__Group__0__Impl8687);
            ruleAnd();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrAccess().getAndParserRuleCall_0()); 
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
    // $ANTLR end "rule__Or__Group__0__Impl"


    // $ANTLR start "rule__Or__Group__1"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4316:1: rule__Or__Group__1 : rule__Or__Group__1__Impl ;
    public final void rule__Or__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4320:1: ( rule__Or__Group__1__Impl )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4321:2: rule__Or__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Or__Group__1__Impl_in_rule__Or__Group__18716);
            rule__Or__Group__1__Impl();

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
    // $ANTLR end "rule__Or__Group__1"


    // $ANTLR start "rule__Or__Group__1__Impl"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4327:1: rule__Or__Group__1__Impl : ( ( rule__Or__Group_1__0 )* ) ;
    public final void rule__Or__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4331:1: ( ( ( rule__Or__Group_1__0 )* ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4332:1: ( ( rule__Or__Group_1__0 )* )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4332:1: ( ( rule__Or__Group_1__0 )* )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4333:1: ( rule__Or__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAccess().getGroup_1()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4334:1: ( rule__Or__Group_1__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=12 && LA20_0<=13)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4334:2: rule__Or__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Or__Group_1__0_in_rule__Or__Group__1__Impl8743);
            	    rule__Or__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrAccess().getGroup_1()); 
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
    // $ANTLR end "rule__Or__Group__1__Impl"


    // $ANTLR start "rule__Or__Group_1__0"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4348:1: rule__Or__Group_1__0 : rule__Or__Group_1__0__Impl rule__Or__Group_1__1 ;
    public final void rule__Or__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4352:1: ( rule__Or__Group_1__0__Impl rule__Or__Group_1__1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4353:2: rule__Or__Group_1__0__Impl rule__Or__Group_1__1
            {
            pushFollow(FOLLOW_rule__Or__Group_1__0__Impl_in_rule__Or__Group_1__08778);
            rule__Or__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Or__Group_1__1_in_rule__Or__Group_1__08781);
            rule__Or__Group_1__1();

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
    // $ANTLR end "rule__Or__Group_1__0"


    // $ANTLR start "rule__Or__Group_1__0__Impl"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4360:1: rule__Or__Group_1__0__Impl : ( ( rule__Or__Group_1_0__0 ) ) ;
    public final void rule__Or__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4364:1: ( ( ( rule__Or__Group_1_0__0 ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4365:1: ( ( rule__Or__Group_1_0__0 ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4365:1: ( ( rule__Or__Group_1_0__0 ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4366:1: ( rule__Or__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAccess().getGroup_1_0()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4367:1: ( rule__Or__Group_1_0__0 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4367:2: rule__Or__Group_1_0__0
            {
            pushFollow(FOLLOW_rule__Or__Group_1_0__0_in_rule__Or__Group_1__0__Impl8808);
            rule__Or__Group_1_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrAccess().getGroup_1_0()); 
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
    // $ANTLR end "rule__Or__Group_1__0__Impl"


    // $ANTLR start "rule__Or__Group_1__1"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4377:1: rule__Or__Group_1__1 : rule__Or__Group_1__1__Impl ;
    public final void rule__Or__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4381:1: ( rule__Or__Group_1__1__Impl )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4382:2: rule__Or__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Or__Group_1__1__Impl_in_rule__Or__Group_1__18838);
            rule__Or__Group_1__1__Impl();

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
    // $ANTLR end "rule__Or__Group_1__1"


    // $ANTLR start "rule__Or__Group_1__1__Impl"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4388:1: rule__Or__Group_1__1__Impl : ( ( rule__Or__RightAssignment_1_1 ) ) ;
    public final void rule__Or__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4392:1: ( ( ( rule__Or__RightAssignment_1_1 ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4393:1: ( ( rule__Or__RightAssignment_1_1 ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4393:1: ( ( rule__Or__RightAssignment_1_1 ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4394:1: ( rule__Or__RightAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAccess().getRightAssignment_1_1()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4395:1: ( rule__Or__RightAssignment_1_1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4395:2: rule__Or__RightAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Or__RightAssignment_1_1_in_rule__Or__Group_1__1__Impl8865);
            rule__Or__RightAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrAccess().getRightAssignment_1_1()); 
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
    // $ANTLR end "rule__Or__Group_1__1__Impl"


    // $ANTLR start "rule__Or__Group_1_0__0"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4409:1: rule__Or__Group_1_0__0 : rule__Or__Group_1_0__0__Impl rule__Or__Group_1_0__1 ;
    public final void rule__Or__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4413:1: ( rule__Or__Group_1_0__0__Impl rule__Or__Group_1_0__1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4414:2: rule__Or__Group_1_0__0__Impl rule__Or__Group_1_0__1
            {
            pushFollow(FOLLOW_rule__Or__Group_1_0__0__Impl_in_rule__Or__Group_1_0__08899);
            rule__Or__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Or__Group_1_0__1_in_rule__Or__Group_1_0__08902);
            rule__Or__Group_1_0__1();

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
    // $ANTLR end "rule__Or__Group_1_0__0"


    // $ANTLR start "rule__Or__Group_1_0__0__Impl"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4421:1: rule__Or__Group_1_0__0__Impl : ( () ) ;
    public final void rule__Or__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4425:1: ( ( () ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4426:1: ( () )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4426:1: ( () )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4427:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAccess().getTypedEqualsLeftAction_1_0_0()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4428:1: ()
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4430:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrAccess().getTypedEqualsLeftAction_1_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group_1_0__0__Impl"


    // $ANTLR start "rule__Or__Group_1_0__1"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4440:1: rule__Or__Group_1_0__1 : rule__Or__Group_1_0__1__Impl ;
    public final void rule__Or__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4444:1: ( rule__Or__Group_1_0__1__Impl )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4445:2: rule__Or__Group_1_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Or__Group_1_0__1__Impl_in_rule__Or__Group_1_0__18960);
            rule__Or__Group_1_0__1__Impl();

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
    // $ANTLR end "rule__Or__Group_1_0__1"


    // $ANTLR start "rule__Or__Group_1_0__1__Impl"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4451:1: rule__Or__Group_1_0__1__Impl : ( ( rule__Or__Alternatives_1_0_1 ) ) ;
    public final void rule__Or__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4455:1: ( ( ( rule__Or__Alternatives_1_0_1 ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4456:1: ( ( rule__Or__Alternatives_1_0_1 ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4456:1: ( ( rule__Or__Alternatives_1_0_1 ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4457:1: ( rule__Or__Alternatives_1_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAccess().getAlternatives_1_0_1()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4458:1: ( rule__Or__Alternatives_1_0_1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4458:2: rule__Or__Alternatives_1_0_1
            {
            pushFollow(FOLLOW_rule__Or__Alternatives_1_0_1_in_rule__Or__Group_1_0__1__Impl8987);
            rule__Or__Alternatives_1_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrAccess().getAlternatives_1_0_1()); 
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
    // $ANTLR end "rule__Or__Group_1_0__1__Impl"


    // $ANTLR start "rule__And__Group__0"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4472:1: rule__And__Group__0 : rule__And__Group__0__Impl rule__And__Group__1 ;
    public final void rule__And__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4476:1: ( rule__And__Group__0__Impl rule__And__Group__1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4477:2: rule__And__Group__0__Impl rule__And__Group__1
            {
            pushFollow(FOLLOW_rule__And__Group__0__Impl_in_rule__And__Group__09021);
            rule__And__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__And__Group__1_in_rule__And__Group__09024);
            rule__And__Group__1();

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
    // $ANTLR end "rule__And__Group__0"


    // $ANTLR start "rule__And__Group__0__Impl"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4484:1: rule__And__Group__0__Impl : ( ruleAddition ) ;
    public final void rule__And__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4488:1: ( ( ruleAddition ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4489:1: ( ruleAddition )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4489:1: ( ruleAddition )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4490:1: ruleAddition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndAccess().getAdditionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleAddition_in_rule__And__Group__0__Impl9051);
            ruleAddition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndAccess().getAdditionParserRuleCall_0()); 
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
    // $ANTLR end "rule__And__Group__0__Impl"


    // $ANTLR start "rule__And__Group__1"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4501:1: rule__And__Group__1 : rule__And__Group__1__Impl ;
    public final void rule__And__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4505:1: ( rule__And__Group__1__Impl )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4506:2: rule__And__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__And__Group__1__Impl_in_rule__And__Group__19080);
            rule__And__Group__1__Impl();

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
    // $ANTLR end "rule__And__Group__1"


    // $ANTLR start "rule__And__Group__1__Impl"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4512:1: rule__And__Group__1__Impl : ( ( rule__And__Group_1__0 )* ) ;
    public final void rule__And__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4516:1: ( ( ( rule__And__Group_1__0 )* ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4517:1: ( ( rule__And__Group_1__0 )* )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4517:1: ( ( rule__And__Group_1__0 )* )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4518:1: ( rule__And__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndAccess().getGroup_1()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4519:1: ( rule__And__Group_1__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=14 && LA21_0<=15)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4519:2: rule__And__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__And__Group_1__0_in_rule__And__Group__1__Impl9107);
            	    rule__And__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndAccess().getGroup_1()); 
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
    // $ANTLR end "rule__And__Group__1__Impl"


    // $ANTLR start "rule__And__Group_1__0"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4533:1: rule__And__Group_1__0 : rule__And__Group_1__0__Impl rule__And__Group_1__1 ;
    public final void rule__And__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4537:1: ( rule__And__Group_1__0__Impl rule__And__Group_1__1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4538:2: rule__And__Group_1__0__Impl rule__And__Group_1__1
            {
            pushFollow(FOLLOW_rule__And__Group_1__0__Impl_in_rule__And__Group_1__09142);
            rule__And__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__And__Group_1__1_in_rule__And__Group_1__09145);
            rule__And__Group_1__1();

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
    // $ANTLR end "rule__And__Group_1__0"


    // $ANTLR start "rule__And__Group_1__0__Impl"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4545:1: rule__And__Group_1__0__Impl : ( ( rule__And__Group_1_0__0 ) ) ;
    public final void rule__And__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4549:1: ( ( ( rule__And__Group_1_0__0 ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4550:1: ( ( rule__And__Group_1_0__0 ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4550:1: ( ( rule__And__Group_1_0__0 ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4551:1: ( rule__And__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndAccess().getGroup_1_0()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4552:1: ( rule__And__Group_1_0__0 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4552:2: rule__And__Group_1_0__0
            {
            pushFollow(FOLLOW_rule__And__Group_1_0__0_in_rule__And__Group_1__0__Impl9172);
            rule__And__Group_1_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndAccess().getGroup_1_0()); 
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
    // $ANTLR end "rule__And__Group_1__0__Impl"


    // $ANTLR start "rule__And__Group_1__1"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4562:1: rule__And__Group_1__1 : rule__And__Group_1__1__Impl ;
    public final void rule__And__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4566:1: ( rule__And__Group_1__1__Impl )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4567:2: rule__And__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__And__Group_1__1__Impl_in_rule__And__Group_1__19202);
            rule__And__Group_1__1__Impl();

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
    // $ANTLR end "rule__And__Group_1__1"


    // $ANTLR start "rule__And__Group_1__1__Impl"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4573:1: rule__And__Group_1__1__Impl : ( ( rule__And__RightAssignment_1_1 ) ) ;
    public final void rule__And__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4577:1: ( ( ( rule__And__RightAssignment_1_1 ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4578:1: ( ( rule__And__RightAssignment_1_1 ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4578:1: ( ( rule__And__RightAssignment_1_1 ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4579:1: ( rule__And__RightAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndAccess().getRightAssignment_1_1()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4580:1: ( rule__And__RightAssignment_1_1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4580:2: rule__And__RightAssignment_1_1
            {
            pushFollow(FOLLOW_rule__And__RightAssignment_1_1_in_rule__And__Group_1__1__Impl9229);
            rule__And__RightAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndAccess().getRightAssignment_1_1()); 
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
    // $ANTLR end "rule__And__Group_1__1__Impl"


    // $ANTLR start "rule__And__Group_1_0__0"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4594:1: rule__And__Group_1_0__0 : rule__And__Group_1_0__0__Impl rule__And__Group_1_0__1 ;
    public final void rule__And__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4598:1: ( rule__And__Group_1_0__0__Impl rule__And__Group_1_0__1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4599:2: rule__And__Group_1_0__0__Impl rule__And__Group_1_0__1
            {
            pushFollow(FOLLOW_rule__And__Group_1_0__0__Impl_in_rule__And__Group_1_0__09263);
            rule__And__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__And__Group_1_0__1_in_rule__And__Group_1_0__09266);
            rule__And__Group_1_0__1();

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
    // $ANTLR end "rule__And__Group_1_0__0"


    // $ANTLR start "rule__And__Group_1_0__0__Impl"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4606:1: rule__And__Group_1_0__0__Impl : ( () ) ;
    public final void rule__And__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4610:1: ( ( () ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4611:1: ( () )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4611:1: ( () )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4612:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndAccess().getTypedEqualsLeftAction_1_0_0()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4613:1: ()
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4615:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndAccess().getTypedEqualsLeftAction_1_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group_1_0__0__Impl"


    // $ANTLR start "rule__And__Group_1_0__1"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4625:1: rule__And__Group_1_0__1 : rule__And__Group_1_0__1__Impl ;
    public final void rule__And__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4629:1: ( rule__And__Group_1_0__1__Impl )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4630:2: rule__And__Group_1_0__1__Impl
            {
            pushFollow(FOLLOW_rule__And__Group_1_0__1__Impl_in_rule__And__Group_1_0__19324);
            rule__And__Group_1_0__1__Impl();

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
    // $ANTLR end "rule__And__Group_1_0__1"


    // $ANTLR start "rule__And__Group_1_0__1__Impl"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4636:1: rule__And__Group_1_0__1__Impl : ( ( rule__And__Alternatives_1_0_1 ) ) ;
    public final void rule__And__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4640:1: ( ( ( rule__And__Alternatives_1_0_1 ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4641:1: ( ( rule__And__Alternatives_1_0_1 ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4641:1: ( ( rule__And__Alternatives_1_0_1 ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4642:1: ( rule__And__Alternatives_1_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndAccess().getAlternatives_1_0_1()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4643:1: ( rule__And__Alternatives_1_0_1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4643:2: rule__And__Alternatives_1_0_1
            {
            pushFollow(FOLLOW_rule__And__Alternatives_1_0_1_in_rule__And__Group_1_0__1__Impl9351);
            rule__And__Alternatives_1_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndAccess().getAlternatives_1_0_1()); 
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
    // $ANTLR end "rule__And__Group_1_0__1__Impl"


    // $ANTLR start "rule__Addition__Group__0"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4657:1: rule__Addition__Group__0 : rule__Addition__Group__0__Impl rule__Addition__Group__1 ;
    public final void rule__Addition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4661:1: ( rule__Addition__Group__0__Impl rule__Addition__Group__1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4662:2: rule__Addition__Group__0__Impl rule__Addition__Group__1
            {
            pushFollow(FOLLOW_rule__Addition__Group__0__Impl_in_rule__Addition__Group__09385);
            rule__Addition__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Addition__Group__1_in_rule__Addition__Group__09388);
            rule__Addition__Group__1();

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
    // $ANTLR end "rule__Addition__Group__0"


    // $ANTLR start "rule__Addition__Group__0__Impl"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4669:1: rule__Addition__Group__0__Impl : ( ruleMultiplication ) ;
    public final void rule__Addition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4673:1: ( ( ruleMultiplication ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4674:1: ( ruleMultiplication )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4674:1: ( ruleMultiplication )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4675:1: ruleMultiplication
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getMultiplicationParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleMultiplication_in_rule__Addition__Group__0__Impl9415);
            ruleMultiplication();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditionAccess().getMultiplicationParserRuleCall_0()); 
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
    // $ANTLR end "rule__Addition__Group__0__Impl"


    // $ANTLR start "rule__Addition__Group__1"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4686:1: rule__Addition__Group__1 : rule__Addition__Group__1__Impl ;
    public final void rule__Addition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4690:1: ( rule__Addition__Group__1__Impl )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4691:2: rule__Addition__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Addition__Group__1__Impl_in_rule__Addition__Group__19444);
            rule__Addition__Group__1__Impl();

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
    // $ANTLR end "rule__Addition__Group__1"


    // $ANTLR start "rule__Addition__Group__1__Impl"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4697:1: rule__Addition__Group__1__Impl : ( ( rule__Addition__Group_1__0 )* ) ;
    public final void rule__Addition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4701:1: ( ( ( rule__Addition__Group_1__0 )* ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4702:1: ( ( rule__Addition__Group_1__0 )* )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4702:1: ( ( rule__Addition__Group_1__0 )* )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4703:1: ( rule__Addition__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getGroup_1()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4704:1: ( rule__Addition__Group_1__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=40 && LA22_0<=41)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4704:2: rule__Addition__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Addition__Group_1__0_in_rule__Addition__Group__1__Impl9471);
            	    rule__Addition__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditionAccess().getGroup_1()); 
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
    // $ANTLR end "rule__Addition__Group__1__Impl"


    // $ANTLR start "rule__Addition__Group_1__0"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4718:1: rule__Addition__Group_1__0 : rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1 ;
    public final void rule__Addition__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4722:1: ( rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4723:2: rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1
            {
            pushFollow(FOLLOW_rule__Addition__Group_1__0__Impl_in_rule__Addition__Group_1__09506);
            rule__Addition__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Addition__Group_1__1_in_rule__Addition__Group_1__09509);
            rule__Addition__Group_1__1();

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
    // $ANTLR end "rule__Addition__Group_1__0"


    // $ANTLR start "rule__Addition__Group_1__0__Impl"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4730:1: rule__Addition__Group_1__0__Impl : ( ( rule__Addition__Alternatives_1_0 ) ) ;
    public final void rule__Addition__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4734:1: ( ( ( rule__Addition__Alternatives_1_0 ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4735:1: ( ( rule__Addition__Alternatives_1_0 ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4735:1: ( ( rule__Addition__Alternatives_1_0 ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4736:1: ( rule__Addition__Alternatives_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getAlternatives_1_0()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4737:1: ( rule__Addition__Alternatives_1_0 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4737:2: rule__Addition__Alternatives_1_0
            {
            pushFollow(FOLLOW_rule__Addition__Alternatives_1_0_in_rule__Addition__Group_1__0__Impl9536);
            rule__Addition__Alternatives_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditionAccess().getAlternatives_1_0()); 
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
    // $ANTLR end "rule__Addition__Group_1__0__Impl"


    // $ANTLR start "rule__Addition__Group_1__1"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4747:1: rule__Addition__Group_1__1 : rule__Addition__Group_1__1__Impl ;
    public final void rule__Addition__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4751:1: ( rule__Addition__Group_1__1__Impl )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4752:2: rule__Addition__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Addition__Group_1__1__Impl_in_rule__Addition__Group_1__19566);
            rule__Addition__Group_1__1__Impl();

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
    // $ANTLR end "rule__Addition__Group_1__1"


    // $ANTLR start "rule__Addition__Group_1__1__Impl"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4758:1: rule__Addition__Group_1__1__Impl : ( ( rule__Addition__RightAssignment_1_1 ) ) ;
    public final void rule__Addition__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4762:1: ( ( ( rule__Addition__RightAssignment_1_1 ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4763:1: ( ( rule__Addition__RightAssignment_1_1 ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4763:1: ( ( rule__Addition__RightAssignment_1_1 ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4764:1: ( rule__Addition__RightAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getRightAssignment_1_1()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4765:1: ( rule__Addition__RightAssignment_1_1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4765:2: rule__Addition__RightAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Addition__RightAssignment_1_1_in_rule__Addition__Group_1__1__Impl9593);
            rule__Addition__RightAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditionAccess().getRightAssignment_1_1()); 
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
    // $ANTLR end "rule__Addition__Group_1__1__Impl"


    // $ANTLR start "rule__Addition__Group_1_0_0__0"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4779:1: rule__Addition__Group_1_0_0__0 : rule__Addition__Group_1_0_0__0__Impl rule__Addition__Group_1_0_0__1 ;
    public final void rule__Addition__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4783:1: ( rule__Addition__Group_1_0_0__0__Impl rule__Addition__Group_1_0_0__1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4784:2: rule__Addition__Group_1_0_0__0__Impl rule__Addition__Group_1_0_0__1
            {
            pushFollow(FOLLOW_rule__Addition__Group_1_0_0__0__Impl_in_rule__Addition__Group_1_0_0__09627);
            rule__Addition__Group_1_0_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Addition__Group_1_0_0__1_in_rule__Addition__Group_1_0_0__09630);
            rule__Addition__Group_1_0_0__1();

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
    // $ANTLR end "rule__Addition__Group_1_0_0__0"


    // $ANTLR start "rule__Addition__Group_1_0_0__0__Impl"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4791:1: rule__Addition__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__Addition__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4795:1: ( ( () ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4796:1: ( () )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4796:1: ( () )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4797:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4798:1: ()
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4800:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1_0_0__0__Impl"


    // $ANTLR start "rule__Addition__Group_1_0_0__1"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4810:1: rule__Addition__Group_1_0_0__1 : rule__Addition__Group_1_0_0__1__Impl ;
    public final void rule__Addition__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4814:1: ( rule__Addition__Group_1_0_0__1__Impl )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4815:2: rule__Addition__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Addition__Group_1_0_0__1__Impl_in_rule__Addition__Group_1_0_0__19688);
            rule__Addition__Group_1_0_0__1__Impl();

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
    // $ANTLR end "rule__Addition__Group_1_0_0__1"


    // $ANTLR start "rule__Addition__Group_1_0_0__1__Impl"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4821:1: rule__Addition__Group_1_0_0__1__Impl : ( '+' ) ;
    public final void rule__Addition__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4825:1: ( ( '+' ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4826:1: ( '+' )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4826:1: ( '+' )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4827:1: '+'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getPlusSignKeyword_1_0_0_1()); 
            }
            match(input,40,FOLLOW_40_in_rule__Addition__Group_1_0_0__1__Impl9716); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditionAccess().getPlusSignKeyword_1_0_0_1()); 
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
    // $ANTLR end "rule__Addition__Group_1_0_0__1__Impl"


    // $ANTLR start "rule__Addition__Group_1_0_1__0"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4844:1: rule__Addition__Group_1_0_1__0 : rule__Addition__Group_1_0_1__0__Impl rule__Addition__Group_1_0_1__1 ;
    public final void rule__Addition__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4848:1: ( rule__Addition__Group_1_0_1__0__Impl rule__Addition__Group_1_0_1__1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4849:2: rule__Addition__Group_1_0_1__0__Impl rule__Addition__Group_1_0_1__1
            {
            pushFollow(FOLLOW_rule__Addition__Group_1_0_1__0__Impl_in_rule__Addition__Group_1_0_1__09751);
            rule__Addition__Group_1_0_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Addition__Group_1_0_1__1_in_rule__Addition__Group_1_0_1__09754);
            rule__Addition__Group_1_0_1__1();

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
    // $ANTLR end "rule__Addition__Group_1_0_1__0"


    // $ANTLR start "rule__Addition__Group_1_0_1__0__Impl"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4856:1: rule__Addition__Group_1_0_1__0__Impl : ( () ) ;
    public final void rule__Addition__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4860:1: ( ( () ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4861:1: ( () )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4861:1: ( () )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4862:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4863:1: ()
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4865:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1_0_1__0__Impl"


    // $ANTLR start "rule__Addition__Group_1_0_1__1"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4875:1: rule__Addition__Group_1_0_1__1 : rule__Addition__Group_1_0_1__1__Impl ;
    public final void rule__Addition__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4879:1: ( rule__Addition__Group_1_0_1__1__Impl )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4880:2: rule__Addition__Group_1_0_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Addition__Group_1_0_1__1__Impl_in_rule__Addition__Group_1_0_1__19812);
            rule__Addition__Group_1_0_1__1__Impl();

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
    // $ANTLR end "rule__Addition__Group_1_0_1__1"


    // $ANTLR start "rule__Addition__Group_1_0_1__1__Impl"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4886:1: rule__Addition__Group_1_0_1__1__Impl : ( '-' ) ;
    public final void rule__Addition__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4890:1: ( ( '-' ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4891:1: ( '-' )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4891:1: ( '-' )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4892:1: '-'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getHyphenMinusKeyword_1_0_1_1()); 
            }
            match(input,41,FOLLOW_41_in_rule__Addition__Group_1_0_1__1__Impl9840); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditionAccess().getHyphenMinusKeyword_1_0_1_1()); 
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
    // $ANTLR end "rule__Addition__Group_1_0_1__1__Impl"


    // $ANTLR start "rule__Multiplication__Group__0"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4909:1: rule__Multiplication__Group__0 : rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1 ;
    public final void rule__Multiplication__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4913:1: ( rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4914:2: rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1
            {
            pushFollow(FOLLOW_rule__Multiplication__Group__0__Impl_in_rule__Multiplication__Group__09875);
            rule__Multiplication__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Multiplication__Group__1_in_rule__Multiplication__Group__09878);
            rule__Multiplication__Group__1();

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
    // $ANTLR end "rule__Multiplication__Group__0"


    // $ANTLR start "rule__Multiplication__Group__0__Impl"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4921:1: rule__Multiplication__Group__0__Impl : ( rulePrimaryExpression ) ;
    public final void rule__Multiplication__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4925:1: ( ( rulePrimaryExpression ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4926:1: ( rulePrimaryExpression )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4926:1: ( rulePrimaryExpression )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4927:1: rulePrimaryExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getPrimaryExpressionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_rulePrimaryExpression_in_rule__Multiplication__Group__0__Impl9905);
            rulePrimaryExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicationAccess().getPrimaryExpressionParserRuleCall_0()); 
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
    // $ANTLR end "rule__Multiplication__Group__0__Impl"


    // $ANTLR start "rule__Multiplication__Group__1"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4938:1: rule__Multiplication__Group__1 : rule__Multiplication__Group__1__Impl ;
    public final void rule__Multiplication__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4942:1: ( rule__Multiplication__Group__1__Impl )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4943:2: rule__Multiplication__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Multiplication__Group__1__Impl_in_rule__Multiplication__Group__19934);
            rule__Multiplication__Group__1__Impl();

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
    // $ANTLR end "rule__Multiplication__Group__1"


    // $ANTLR start "rule__Multiplication__Group__1__Impl"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4949:1: rule__Multiplication__Group__1__Impl : ( ( rule__Multiplication__Group_1__0 )* ) ;
    public final void rule__Multiplication__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4953:1: ( ( ( rule__Multiplication__Group_1__0 )* ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4954:1: ( ( rule__Multiplication__Group_1__0 )* )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4954:1: ( ( rule__Multiplication__Group_1__0 )* )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4955:1: ( rule__Multiplication__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getGroup_1()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4956:1: ( rule__Multiplication__Group_1__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>=42 && LA23_0<=43)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4956:2: rule__Multiplication__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Multiplication__Group_1__0_in_rule__Multiplication__Group__1__Impl9961);
            	    rule__Multiplication__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicationAccess().getGroup_1()); 
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
    // $ANTLR end "rule__Multiplication__Group__1__Impl"


    // $ANTLR start "rule__Multiplication__Group_1__0"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4970:1: rule__Multiplication__Group_1__0 : rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1 ;
    public final void rule__Multiplication__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4974:1: ( rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4975:2: rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1
            {
            pushFollow(FOLLOW_rule__Multiplication__Group_1__0__Impl_in_rule__Multiplication__Group_1__09996);
            rule__Multiplication__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Multiplication__Group_1__1_in_rule__Multiplication__Group_1__09999);
            rule__Multiplication__Group_1__1();

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
    // $ANTLR end "rule__Multiplication__Group_1__0"


    // $ANTLR start "rule__Multiplication__Group_1__0__Impl"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4982:1: rule__Multiplication__Group_1__0__Impl : ( ( rule__Multiplication__Alternatives_1_0 ) ) ;
    public final void rule__Multiplication__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4986:1: ( ( ( rule__Multiplication__Alternatives_1_0 ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4987:1: ( ( rule__Multiplication__Alternatives_1_0 ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4987:1: ( ( rule__Multiplication__Alternatives_1_0 ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4988:1: ( rule__Multiplication__Alternatives_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getAlternatives_1_0()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4989:1: ( rule__Multiplication__Alternatives_1_0 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4989:2: rule__Multiplication__Alternatives_1_0
            {
            pushFollow(FOLLOW_rule__Multiplication__Alternatives_1_0_in_rule__Multiplication__Group_1__0__Impl10026);
            rule__Multiplication__Alternatives_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicationAccess().getAlternatives_1_0()); 
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
    // $ANTLR end "rule__Multiplication__Group_1__0__Impl"


    // $ANTLR start "rule__Multiplication__Group_1__1"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4999:1: rule__Multiplication__Group_1__1 : rule__Multiplication__Group_1__1__Impl ;
    public final void rule__Multiplication__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5003:1: ( rule__Multiplication__Group_1__1__Impl )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5004:2: rule__Multiplication__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Multiplication__Group_1__1__Impl_in_rule__Multiplication__Group_1__110056);
            rule__Multiplication__Group_1__1__Impl();

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
    // $ANTLR end "rule__Multiplication__Group_1__1"


    // $ANTLR start "rule__Multiplication__Group_1__1__Impl"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5010:1: rule__Multiplication__Group_1__1__Impl : ( ( rule__Multiplication__RightAssignment_1_1 ) ) ;
    public final void rule__Multiplication__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5014:1: ( ( ( rule__Multiplication__RightAssignment_1_1 ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5015:1: ( ( rule__Multiplication__RightAssignment_1_1 ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5015:1: ( ( rule__Multiplication__RightAssignment_1_1 ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5016:1: ( rule__Multiplication__RightAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getRightAssignment_1_1()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5017:1: ( rule__Multiplication__RightAssignment_1_1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5017:2: rule__Multiplication__RightAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Multiplication__RightAssignment_1_1_in_rule__Multiplication__Group_1__1__Impl10083);
            rule__Multiplication__RightAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicationAccess().getRightAssignment_1_1()); 
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
    // $ANTLR end "rule__Multiplication__Group_1__1__Impl"


    // $ANTLR start "rule__Multiplication__Group_1_0_0__0"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5031:1: rule__Multiplication__Group_1_0_0__0 : rule__Multiplication__Group_1_0_0__0__Impl rule__Multiplication__Group_1_0_0__1 ;
    public final void rule__Multiplication__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5035:1: ( rule__Multiplication__Group_1_0_0__0__Impl rule__Multiplication__Group_1_0_0__1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5036:2: rule__Multiplication__Group_1_0_0__0__Impl rule__Multiplication__Group_1_0_0__1
            {
            pushFollow(FOLLOW_rule__Multiplication__Group_1_0_0__0__Impl_in_rule__Multiplication__Group_1_0_0__010117);
            rule__Multiplication__Group_1_0_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Multiplication__Group_1_0_0__1_in_rule__Multiplication__Group_1_0_0__010120);
            rule__Multiplication__Group_1_0_0__1();

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
    // $ANTLR end "rule__Multiplication__Group_1_0_0__0"


    // $ANTLR start "rule__Multiplication__Group_1_0_0__0__Impl"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5043:1: rule__Multiplication__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__Multiplication__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5047:1: ( ( () ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5048:1: ( () )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5048:1: ( () )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5049:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0_0_0()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5050:1: ()
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5052:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1_0_0__0__Impl"


    // $ANTLR start "rule__Multiplication__Group_1_0_0__1"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5062:1: rule__Multiplication__Group_1_0_0__1 : rule__Multiplication__Group_1_0_0__1__Impl ;
    public final void rule__Multiplication__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5066:1: ( rule__Multiplication__Group_1_0_0__1__Impl )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5067:2: rule__Multiplication__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Multiplication__Group_1_0_0__1__Impl_in_rule__Multiplication__Group_1_0_0__110178);
            rule__Multiplication__Group_1_0_0__1__Impl();

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
    // $ANTLR end "rule__Multiplication__Group_1_0_0__1"


    // $ANTLR start "rule__Multiplication__Group_1_0_0__1__Impl"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5073:1: rule__Multiplication__Group_1_0_0__1__Impl : ( '*' ) ;
    public final void rule__Multiplication__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5077:1: ( ( '*' ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5078:1: ( '*' )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5078:1: ( '*' )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5079:1: '*'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getAsteriskKeyword_1_0_0_1()); 
            }
            match(input,42,FOLLOW_42_in_rule__Multiplication__Group_1_0_0__1__Impl10206); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicationAccess().getAsteriskKeyword_1_0_0_1()); 
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
    // $ANTLR end "rule__Multiplication__Group_1_0_0__1__Impl"


    // $ANTLR start "rule__Multiplication__Group_1_0_1__0"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5096:1: rule__Multiplication__Group_1_0_1__0 : rule__Multiplication__Group_1_0_1__0__Impl rule__Multiplication__Group_1_0_1__1 ;
    public final void rule__Multiplication__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5100:1: ( rule__Multiplication__Group_1_0_1__0__Impl rule__Multiplication__Group_1_0_1__1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5101:2: rule__Multiplication__Group_1_0_1__0__Impl rule__Multiplication__Group_1_0_1__1
            {
            pushFollow(FOLLOW_rule__Multiplication__Group_1_0_1__0__Impl_in_rule__Multiplication__Group_1_0_1__010241);
            rule__Multiplication__Group_1_0_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Multiplication__Group_1_0_1__1_in_rule__Multiplication__Group_1_0_1__010244);
            rule__Multiplication__Group_1_0_1__1();

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
    // $ANTLR end "rule__Multiplication__Group_1_0_1__0"


    // $ANTLR start "rule__Multiplication__Group_1_0_1__0__Impl"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5108:1: rule__Multiplication__Group_1_0_1__0__Impl : ( () ) ;
    public final void rule__Multiplication__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5112:1: ( ( () ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5113:1: ( () )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5113:1: ( () )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5114:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getDivLeftAction_1_0_1_0()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5115:1: ()
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5117:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicationAccess().getDivLeftAction_1_0_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1_0_1__0__Impl"


    // $ANTLR start "rule__Multiplication__Group_1_0_1__1"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5127:1: rule__Multiplication__Group_1_0_1__1 : rule__Multiplication__Group_1_0_1__1__Impl ;
    public final void rule__Multiplication__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5131:1: ( rule__Multiplication__Group_1_0_1__1__Impl )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5132:2: rule__Multiplication__Group_1_0_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Multiplication__Group_1_0_1__1__Impl_in_rule__Multiplication__Group_1_0_1__110302);
            rule__Multiplication__Group_1_0_1__1__Impl();

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
    // $ANTLR end "rule__Multiplication__Group_1_0_1__1"


    // $ANTLR start "rule__Multiplication__Group_1_0_1__1__Impl"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5138:1: rule__Multiplication__Group_1_0_1__1__Impl : ( '/' ) ;
    public final void rule__Multiplication__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5142:1: ( ( '/' ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5143:1: ( '/' )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5143:1: ( '/' )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5144:1: '/'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getSolidusKeyword_1_0_1_1()); 
            }
            match(input,43,FOLLOW_43_in_rule__Multiplication__Group_1_0_1__1__Impl10330); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicationAccess().getSolidusKeyword_1_0_1_1()); 
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
    // $ANTLR end "rule__Multiplication__Group_1_0_1__1__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_0__0"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5161:1: rule__PrimaryExpression__Group_0__0 : rule__PrimaryExpression__Group_0__0__Impl rule__PrimaryExpression__Group_0__1 ;
    public final void rule__PrimaryExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5165:1: ( rule__PrimaryExpression__Group_0__0__Impl rule__PrimaryExpression__Group_0__1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5166:2: rule__PrimaryExpression__Group_0__0__Impl rule__PrimaryExpression__Group_0__1
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__Group_0__0__Impl_in_rule__PrimaryExpression__Group_0__010365);
            rule__PrimaryExpression__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PrimaryExpression__Group_0__1_in_rule__PrimaryExpression__Group_0__010368);
            rule__PrimaryExpression__Group_0__1();

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
    // $ANTLR end "rule__PrimaryExpression__Group_0__0"


    // $ANTLR start "rule__PrimaryExpression__Group_0__0__Impl"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5173:1: rule__PrimaryExpression__Group_0__0__Impl : ( '(' ) ;
    public final void rule__PrimaryExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5177:1: ( ( '(' ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5178:1: ( '(' )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5178:1: ( '(' )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5179:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_0_0()); 
            }
            match(input,21,FOLLOW_21_in_rule__PrimaryExpression__Group_0__0__Impl10396); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_0_0()); 
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
    // $ANTLR end "rule__PrimaryExpression__Group_0__0__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_0__1"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5192:1: rule__PrimaryExpression__Group_0__1 : rule__PrimaryExpression__Group_0__1__Impl rule__PrimaryExpression__Group_0__2 ;
    public final void rule__PrimaryExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5196:1: ( rule__PrimaryExpression__Group_0__1__Impl rule__PrimaryExpression__Group_0__2 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5197:2: rule__PrimaryExpression__Group_0__1__Impl rule__PrimaryExpression__Group_0__2
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__Group_0__1__Impl_in_rule__PrimaryExpression__Group_0__110427);
            rule__PrimaryExpression__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PrimaryExpression__Group_0__2_in_rule__PrimaryExpression__Group_0__110430);
            rule__PrimaryExpression__Group_0__2();

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
    // $ANTLR end "rule__PrimaryExpression__Group_0__1"


    // $ANTLR start "rule__PrimaryExpression__Group_0__1__Impl"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5204:1: rule__PrimaryExpression__Group_0__1__Impl : ( ruleExpression ) ;
    public final void rule__PrimaryExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5208:1: ( ( ruleExpression ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5209:1: ( ruleExpression )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5209:1: ( ruleExpression )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5210:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExpressionAccess().getExpressionParserRuleCall_0_1()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__PrimaryExpression__Group_0__1__Impl10457);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryExpressionAccess().getExpressionParserRuleCall_0_1()); 
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
    // $ANTLR end "rule__PrimaryExpression__Group_0__1__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_0__2"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5221:1: rule__PrimaryExpression__Group_0__2 : rule__PrimaryExpression__Group_0__2__Impl ;
    public final void rule__PrimaryExpression__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5225:1: ( rule__PrimaryExpression__Group_0__2__Impl )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5226:2: rule__PrimaryExpression__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__Group_0__2__Impl_in_rule__PrimaryExpression__Group_0__210486);
            rule__PrimaryExpression__Group_0__2__Impl();

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
    // $ANTLR end "rule__PrimaryExpression__Group_0__2"


    // $ANTLR start "rule__PrimaryExpression__Group_0__2__Impl"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5232:1: rule__PrimaryExpression__Group_0__2__Impl : ( ')' ) ;
    public final void rule__PrimaryExpression__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5236:1: ( ( ')' ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5237:1: ( ')' )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5237:1: ( ')' )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5238:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_0_2()); 
            }
            match(input,22,FOLLOW_22_in_rule__PrimaryExpression__Group_0__2__Impl10514); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_0_2()); 
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
    // $ANTLR end "rule__PrimaryExpression__Group_0__2__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_1__0"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5257:1: rule__PrimaryExpression__Group_1__0 : rule__PrimaryExpression__Group_1__0__Impl rule__PrimaryExpression__Group_1__1 ;
    public final void rule__PrimaryExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5261:1: ( rule__PrimaryExpression__Group_1__0__Impl rule__PrimaryExpression__Group_1__1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5262:2: rule__PrimaryExpression__Group_1__0__Impl rule__PrimaryExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__Group_1__0__Impl_in_rule__PrimaryExpression__Group_1__010551);
            rule__PrimaryExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PrimaryExpression__Group_1__1_in_rule__PrimaryExpression__Group_1__010554);
            rule__PrimaryExpression__Group_1__1();

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
    // $ANTLR end "rule__PrimaryExpression__Group_1__0"


    // $ANTLR start "rule__PrimaryExpression__Group_1__0__Impl"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5269:1: rule__PrimaryExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__PrimaryExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5273:1: ( ( () ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5274:1: ( () )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5274:1: ( () )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5275:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExpressionAccess().getRealLiteralAction_1_0()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5276:1: ()
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5278:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryExpressionAccess().getRealLiteralAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_1__0__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_1__1"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5288:1: rule__PrimaryExpression__Group_1__1 : rule__PrimaryExpression__Group_1__1__Impl ;
    public final void rule__PrimaryExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5292:1: ( rule__PrimaryExpression__Group_1__1__Impl )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5293:2: rule__PrimaryExpression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__Group_1__1__Impl_in_rule__PrimaryExpression__Group_1__110612);
            rule__PrimaryExpression__Group_1__1__Impl();

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
    // $ANTLR end "rule__PrimaryExpression__Group_1__1"


    // $ANTLR start "rule__PrimaryExpression__Group_1__1__Impl"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5299:1: rule__PrimaryExpression__Group_1__1__Impl : ( ( rule__PrimaryExpression__ValueAssignment_1_1 ) ) ;
    public final void rule__PrimaryExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5303:1: ( ( ( rule__PrimaryExpression__ValueAssignment_1_1 ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5304:1: ( ( rule__PrimaryExpression__ValueAssignment_1_1 ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5304:1: ( ( rule__PrimaryExpression__ValueAssignment_1_1 ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5305:1: ( rule__PrimaryExpression__ValueAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExpressionAccess().getValueAssignment_1_1()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5306:1: ( rule__PrimaryExpression__ValueAssignment_1_1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5306:2: rule__PrimaryExpression__ValueAssignment_1_1
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__ValueAssignment_1_1_in_rule__PrimaryExpression__Group_1__1__Impl10639);
            rule__PrimaryExpression__ValueAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryExpressionAccess().getValueAssignment_1_1()); 
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
    // $ANTLR end "rule__PrimaryExpression__Group_1__1__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_2__0"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5320:1: rule__PrimaryExpression__Group_2__0 : rule__PrimaryExpression__Group_2__0__Impl rule__PrimaryExpression__Group_2__1 ;
    public final void rule__PrimaryExpression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5324:1: ( rule__PrimaryExpression__Group_2__0__Impl rule__PrimaryExpression__Group_2__1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5325:2: rule__PrimaryExpression__Group_2__0__Impl rule__PrimaryExpression__Group_2__1
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__Group_2__0__Impl_in_rule__PrimaryExpression__Group_2__010673);
            rule__PrimaryExpression__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PrimaryExpression__Group_2__1_in_rule__PrimaryExpression__Group_2__010676);
            rule__PrimaryExpression__Group_2__1();

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
    // $ANTLR end "rule__PrimaryExpression__Group_2__0"


    // $ANTLR start "rule__PrimaryExpression__Group_2__0__Impl"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5332:1: rule__PrimaryExpression__Group_2__0__Impl : ( () ) ;
    public final void rule__PrimaryExpression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5336:1: ( ( () ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5337:1: ( () )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5337:1: ( () )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5338:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExpressionAccess().getIntLiteralAction_2_0()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5339:1: ()
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5341:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryExpressionAccess().getIntLiteralAction_2_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_2__0__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_2__1"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5351:1: rule__PrimaryExpression__Group_2__1 : rule__PrimaryExpression__Group_2__1__Impl ;
    public final void rule__PrimaryExpression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5355:1: ( rule__PrimaryExpression__Group_2__1__Impl )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5356:2: rule__PrimaryExpression__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__Group_2__1__Impl_in_rule__PrimaryExpression__Group_2__110734);
            rule__PrimaryExpression__Group_2__1__Impl();

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
    // $ANTLR end "rule__PrimaryExpression__Group_2__1"


    // $ANTLR start "rule__PrimaryExpression__Group_2__1__Impl"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5362:1: rule__PrimaryExpression__Group_2__1__Impl : ( ( rule__PrimaryExpression__ValueAssignment_2_1 ) ) ;
    public final void rule__PrimaryExpression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5366:1: ( ( ( rule__PrimaryExpression__ValueAssignment_2_1 ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5367:1: ( ( rule__PrimaryExpression__ValueAssignment_2_1 ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5367:1: ( ( rule__PrimaryExpression__ValueAssignment_2_1 ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5368:1: ( rule__PrimaryExpression__ValueAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExpressionAccess().getValueAssignment_2_1()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5369:1: ( rule__PrimaryExpression__ValueAssignment_2_1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5369:2: rule__PrimaryExpression__ValueAssignment_2_1
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__ValueAssignment_2_1_in_rule__PrimaryExpression__Group_2__1__Impl10761);
            rule__PrimaryExpression__ValueAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryExpressionAccess().getValueAssignment_2_1()); 
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
    // $ANTLR end "rule__PrimaryExpression__Group_2__1__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_5__0"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5383:1: rule__PrimaryExpression__Group_5__0 : rule__PrimaryExpression__Group_5__0__Impl rule__PrimaryExpression__Group_5__1 ;
    public final void rule__PrimaryExpression__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5387:1: ( rule__PrimaryExpression__Group_5__0__Impl rule__PrimaryExpression__Group_5__1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5388:2: rule__PrimaryExpression__Group_5__0__Impl rule__PrimaryExpression__Group_5__1
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__Group_5__0__Impl_in_rule__PrimaryExpression__Group_5__010795);
            rule__PrimaryExpression__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PrimaryExpression__Group_5__1_in_rule__PrimaryExpression__Group_5__010798);
            rule__PrimaryExpression__Group_5__1();

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
    // $ANTLR end "rule__PrimaryExpression__Group_5__0"


    // $ANTLR start "rule__PrimaryExpression__Group_5__0__Impl"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5395:1: rule__PrimaryExpression__Group_5__0__Impl : ( () ) ;
    public final void rule__PrimaryExpression__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5399:1: ( ( () ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5400:1: ( () )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5400:1: ( () )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5401:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExpressionAccess().getStringLiteralAction_5_0()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5402:1: ()
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5404:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryExpressionAccess().getStringLiteralAction_5_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_5__0__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_5__1"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5414:1: rule__PrimaryExpression__Group_5__1 : rule__PrimaryExpression__Group_5__1__Impl ;
    public final void rule__PrimaryExpression__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5418:1: ( rule__PrimaryExpression__Group_5__1__Impl )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5419:2: rule__PrimaryExpression__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__Group_5__1__Impl_in_rule__PrimaryExpression__Group_5__110856);
            rule__PrimaryExpression__Group_5__1__Impl();

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
    // $ANTLR end "rule__PrimaryExpression__Group_5__1"


    // $ANTLR start "rule__PrimaryExpression__Group_5__1__Impl"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5425:1: rule__PrimaryExpression__Group_5__1__Impl : ( ( rule__PrimaryExpression__ValueAssignment_5_1 ) ) ;
    public final void rule__PrimaryExpression__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5429:1: ( ( ( rule__PrimaryExpression__ValueAssignment_5_1 ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5430:1: ( ( rule__PrimaryExpression__ValueAssignment_5_1 ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5430:1: ( ( rule__PrimaryExpression__ValueAssignment_5_1 ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5431:1: ( rule__PrimaryExpression__ValueAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExpressionAccess().getValueAssignment_5_1()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5432:1: ( rule__PrimaryExpression__ValueAssignment_5_1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5432:2: rule__PrimaryExpression__ValueAssignment_5_1
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__ValueAssignment_5_1_in_rule__PrimaryExpression__Group_5__1__Impl10883);
            rule__PrimaryExpression__ValueAssignment_5_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryExpressionAccess().getValueAssignment_5_1()); 
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
    // $ANTLR end "rule__PrimaryExpression__Group_5__1__Impl"


    // $ANTLR start "rule__ArrayLiteral__Group__0"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5446:1: rule__ArrayLiteral__Group__0 : rule__ArrayLiteral__Group__0__Impl rule__ArrayLiteral__Group__1 ;
    public final void rule__ArrayLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5450:1: ( rule__ArrayLiteral__Group__0__Impl rule__ArrayLiteral__Group__1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5451:2: rule__ArrayLiteral__Group__0__Impl rule__ArrayLiteral__Group__1
            {
            pushFollow(FOLLOW_rule__ArrayLiteral__Group__0__Impl_in_rule__ArrayLiteral__Group__010917);
            rule__ArrayLiteral__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ArrayLiteral__Group__1_in_rule__ArrayLiteral__Group__010920);
            rule__ArrayLiteral__Group__1();

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
    // $ANTLR end "rule__ArrayLiteral__Group__0"


    // $ANTLR start "rule__ArrayLiteral__Group__0__Impl"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5458:1: rule__ArrayLiteral__Group__0__Impl : ( () ) ;
    public final void rule__ArrayLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5462:1: ( ( () ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5463:1: ( () )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5463:1: ( () )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5464:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayLiteralAccess().getArrayLiteralAction_0()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5465:1: ()
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5467:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayLiteralAccess().getArrayLiteralAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayLiteral__Group__0__Impl"


    // $ANTLR start "rule__ArrayLiteral__Group__1"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5477:1: rule__ArrayLiteral__Group__1 : rule__ArrayLiteral__Group__1__Impl rule__ArrayLiteral__Group__2 ;
    public final void rule__ArrayLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5481:1: ( rule__ArrayLiteral__Group__1__Impl rule__ArrayLiteral__Group__2 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5482:2: rule__ArrayLiteral__Group__1__Impl rule__ArrayLiteral__Group__2
            {
            pushFollow(FOLLOW_rule__ArrayLiteral__Group__1__Impl_in_rule__ArrayLiteral__Group__110978);
            rule__ArrayLiteral__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ArrayLiteral__Group__2_in_rule__ArrayLiteral__Group__110981);
            rule__ArrayLiteral__Group__2();

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
    // $ANTLR end "rule__ArrayLiteral__Group__1"


    // $ANTLR start "rule__ArrayLiteral__Group__1__Impl"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5489:1: rule__ArrayLiteral__Group__1__Impl : ( '[' ) ;
    public final void rule__ArrayLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5493:1: ( ( '[' ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5494:1: ( '[' )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5494:1: ( '[' )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5495:1: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayLiteralAccess().getLeftSquareBracketKeyword_1()); 
            }
            match(input,44,FOLLOW_44_in_rule__ArrayLiteral__Group__1__Impl11009); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayLiteralAccess().getLeftSquareBracketKeyword_1()); 
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
    // $ANTLR end "rule__ArrayLiteral__Group__1__Impl"


    // $ANTLR start "rule__ArrayLiteral__Group__2"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5508:1: rule__ArrayLiteral__Group__2 : rule__ArrayLiteral__Group__2__Impl rule__ArrayLiteral__Group__3 ;
    public final void rule__ArrayLiteral__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5512:1: ( rule__ArrayLiteral__Group__2__Impl rule__ArrayLiteral__Group__3 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5513:2: rule__ArrayLiteral__Group__2__Impl rule__ArrayLiteral__Group__3
            {
            pushFollow(FOLLOW_rule__ArrayLiteral__Group__2__Impl_in_rule__ArrayLiteral__Group__211040);
            rule__ArrayLiteral__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ArrayLiteral__Group__3_in_rule__ArrayLiteral__Group__211043);
            rule__ArrayLiteral__Group__3();

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
    // $ANTLR end "rule__ArrayLiteral__Group__2"


    // $ANTLR start "rule__ArrayLiteral__Group__2__Impl"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5520:1: rule__ArrayLiteral__Group__2__Impl : ( ( rule__ArrayLiteral__Group_2__0 )? ) ;
    public final void rule__ArrayLiteral__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5524:1: ( ( ( rule__ArrayLiteral__Group_2__0 )? ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5525:1: ( ( rule__ArrayLiteral__Group_2__0 )? )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5525:1: ( ( rule__ArrayLiteral__Group_2__0 )? )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5526:1: ( rule__ArrayLiteral__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayLiteralAccess().getGroup_2()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5527:1: ( rule__ArrayLiteral__Group_2__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=RULE_ID && LA24_0<=RULE_STRING)||LA24_0==21||LA24_0==29||LA24_0==44) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5527:2: rule__ArrayLiteral__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__ArrayLiteral__Group_2__0_in_rule__ArrayLiteral__Group__2__Impl11070);
                    rule__ArrayLiteral__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayLiteralAccess().getGroup_2()); 
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
    // $ANTLR end "rule__ArrayLiteral__Group__2__Impl"


    // $ANTLR start "rule__ArrayLiteral__Group__3"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5537:1: rule__ArrayLiteral__Group__3 : rule__ArrayLiteral__Group__3__Impl ;
    public final void rule__ArrayLiteral__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5541:1: ( rule__ArrayLiteral__Group__3__Impl )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5542:2: rule__ArrayLiteral__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ArrayLiteral__Group__3__Impl_in_rule__ArrayLiteral__Group__311101);
            rule__ArrayLiteral__Group__3__Impl();

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
    // $ANTLR end "rule__ArrayLiteral__Group__3"


    // $ANTLR start "rule__ArrayLiteral__Group__3__Impl"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5548:1: rule__ArrayLiteral__Group__3__Impl : ( ']' ) ;
    public final void rule__ArrayLiteral__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5552:1: ( ( ']' ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5553:1: ( ']' )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5553:1: ( ']' )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5554:1: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayLiteralAccess().getRightSquareBracketKeyword_3()); 
            }
            match(input,45,FOLLOW_45_in_rule__ArrayLiteral__Group__3__Impl11129); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayLiteralAccess().getRightSquareBracketKeyword_3()); 
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
    // $ANTLR end "rule__ArrayLiteral__Group__3__Impl"


    // $ANTLR start "rule__ArrayLiteral__Group_2__0"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5575:1: rule__ArrayLiteral__Group_2__0 : rule__ArrayLiteral__Group_2__0__Impl rule__ArrayLiteral__Group_2__1 ;
    public final void rule__ArrayLiteral__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5579:1: ( rule__ArrayLiteral__Group_2__0__Impl rule__ArrayLiteral__Group_2__1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5580:2: rule__ArrayLiteral__Group_2__0__Impl rule__ArrayLiteral__Group_2__1
            {
            pushFollow(FOLLOW_rule__ArrayLiteral__Group_2__0__Impl_in_rule__ArrayLiteral__Group_2__011168);
            rule__ArrayLiteral__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ArrayLiteral__Group_2__1_in_rule__ArrayLiteral__Group_2__011171);
            rule__ArrayLiteral__Group_2__1();

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
    // $ANTLR end "rule__ArrayLiteral__Group_2__0"


    // $ANTLR start "rule__ArrayLiteral__Group_2__0__Impl"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5587:1: rule__ArrayLiteral__Group_2__0__Impl : ( ( rule__ArrayLiteral__ValuesAssignment_2_0 ) ) ;
    public final void rule__ArrayLiteral__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5591:1: ( ( ( rule__ArrayLiteral__ValuesAssignment_2_0 ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5592:1: ( ( rule__ArrayLiteral__ValuesAssignment_2_0 ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5592:1: ( ( rule__ArrayLiteral__ValuesAssignment_2_0 ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5593:1: ( rule__ArrayLiteral__ValuesAssignment_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayLiteralAccess().getValuesAssignment_2_0()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5594:1: ( rule__ArrayLiteral__ValuesAssignment_2_0 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5594:2: rule__ArrayLiteral__ValuesAssignment_2_0
            {
            pushFollow(FOLLOW_rule__ArrayLiteral__ValuesAssignment_2_0_in_rule__ArrayLiteral__Group_2__0__Impl11198);
            rule__ArrayLiteral__ValuesAssignment_2_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayLiteralAccess().getValuesAssignment_2_0()); 
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
    // $ANTLR end "rule__ArrayLiteral__Group_2__0__Impl"


    // $ANTLR start "rule__ArrayLiteral__Group_2__1"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5604:1: rule__ArrayLiteral__Group_2__1 : rule__ArrayLiteral__Group_2__1__Impl ;
    public final void rule__ArrayLiteral__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5608:1: ( rule__ArrayLiteral__Group_2__1__Impl )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5609:2: rule__ArrayLiteral__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__ArrayLiteral__Group_2__1__Impl_in_rule__ArrayLiteral__Group_2__111228);
            rule__ArrayLiteral__Group_2__1__Impl();

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
    // $ANTLR end "rule__ArrayLiteral__Group_2__1"


    // $ANTLR start "rule__ArrayLiteral__Group_2__1__Impl"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5615:1: rule__ArrayLiteral__Group_2__1__Impl : ( ( rule__ArrayLiteral__Group_2_1__0 )* ) ;
    public final void rule__ArrayLiteral__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5619:1: ( ( ( rule__ArrayLiteral__Group_2_1__0 )* ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5620:1: ( ( rule__ArrayLiteral__Group_2_1__0 )* )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5620:1: ( ( rule__ArrayLiteral__Group_2_1__0 )* )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5621:1: ( rule__ArrayLiteral__Group_2_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayLiteralAccess().getGroup_2_1()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5622:1: ( rule__ArrayLiteral__Group_2_1__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==30) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5622:2: rule__ArrayLiteral__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_rule__ArrayLiteral__Group_2_1__0_in_rule__ArrayLiteral__Group_2__1__Impl11255);
            	    rule__ArrayLiteral__Group_2_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayLiteralAccess().getGroup_2_1()); 
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
    // $ANTLR end "rule__ArrayLiteral__Group_2__1__Impl"


    // $ANTLR start "rule__ArrayLiteral__Group_2_1__0"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5636:1: rule__ArrayLiteral__Group_2_1__0 : rule__ArrayLiteral__Group_2_1__0__Impl rule__ArrayLiteral__Group_2_1__1 ;
    public final void rule__ArrayLiteral__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5640:1: ( rule__ArrayLiteral__Group_2_1__0__Impl rule__ArrayLiteral__Group_2_1__1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5641:2: rule__ArrayLiteral__Group_2_1__0__Impl rule__ArrayLiteral__Group_2_1__1
            {
            pushFollow(FOLLOW_rule__ArrayLiteral__Group_2_1__0__Impl_in_rule__ArrayLiteral__Group_2_1__011290);
            rule__ArrayLiteral__Group_2_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ArrayLiteral__Group_2_1__1_in_rule__ArrayLiteral__Group_2_1__011293);
            rule__ArrayLiteral__Group_2_1__1();

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
    // $ANTLR end "rule__ArrayLiteral__Group_2_1__0"


    // $ANTLR start "rule__ArrayLiteral__Group_2_1__0__Impl"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5648:1: rule__ArrayLiteral__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__ArrayLiteral__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5652:1: ( ( ',' ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5653:1: ( ',' )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5653:1: ( ',' )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5654:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayLiteralAccess().getCommaKeyword_2_1_0()); 
            }
            match(input,30,FOLLOW_30_in_rule__ArrayLiteral__Group_2_1__0__Impl11321); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayLiteralAccess().getCommaKeyword_2_1_0()); 
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
    // $ANTLR end "rule__ArrayLiteral__Group_2_1__0__Impl"


    // $ANTLR start "rule__ArrayLiteral__Group_2_1__1"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5667:1: rule__ArrayLiteral__Group_2_1__1 : rule__ArrayLiteral__Group_2_1__1__Impl ;
    public final void rule__ArrayLiteral__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5671:1: ( rule__ArrayLiteral__Group_2_1__1__Impl )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5672:2: rule__ArrayLiteral__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_rule__ArrayLiteral__Group_2_1__1__Impl_in_rule__ArrayLiteral__Group_2_1__111352);
            rule__ArrayLiteral__Group_2_1__1__Impl();

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
    // $ANTLR end "rule__ArrayLiteral__Group_2_1__1"


    // $ANTLR start "rule__ArrayLiteral__Group_2_1__1__Impl"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5678:1: rule__ArrayLiteral__Group_2_1__1__Impl : ( ( rule__ArrayLiteral__ValuesAssignment_2_1_1 ) ) ;
    public final void rule__ArrayLiteral__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5682:1: ( ( ( rule__ArrayLiteral__ValuesAssignment_2_1_1 ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5683:1: ( ( rule__ArrayLiteral__ValuesAssignment_2_1_1 ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5683:1: ( ( rule__ArrayLiteral__ValuesAssignment_2_1_1 ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5684:1: ( rule__ArrayLiteral__ValuesAssignment_2_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayLiteralAccess().getValuesAssignment_2_1_1()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5685:1: ( rule__ArrayLiteral__ValuesAssignment_2_1_1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5685:2: rule__ArrayLiteral__ValuesAssignment_2_1_1
            {
            pushFollow(FOLLOW_rule__ArrayLiteral__ValuesAssignment_2_1_1_in_rule__ArrayLiteral__Group_2_1__1__Impl11379);
            rule__ArrayLiteral__ValuesAssignment_2_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayLiteralAccess().getValuesAssignment_2_1_1()); 
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
    // $ANTLR end "rule__ArrayLiteral__Group_2_1__1__Impl"


    // $ANTLR start "rule__VariableReference__Group__0"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5699:1: rule__VariableReference__Group__0 : rule__VariableReference__Group__0__Impl rule__VariableReference__Group__1 ;
    public final void rule__VariableReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5703:1: ( rule__VariableReference__Group__0__Impl rule__VariableReference__Group__1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5704:2: rule__VariableReference__Group__0__Impl rule__VariableReference__Group__1
            {
            pushFollow(FOLLOW_rule__VariableReference__Group__0__Impl_in_rule__VariableReference__Group__011413);
            rule__VariableReference__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__VariableReference__Group__1_in_rule__VariableReference__Group__011416);
            rule__VariableReference__Group__1();

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
    // $ANTLR end "rule__VariableReference__Group__0"


    // $ANTLR start "rule__VariableReference__Group__0__Impl"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5711:1: rule__VariableReference__Group__0__Impl : ( ( rule__VariableReference__VariableAssignment_0 ) ) ;
    public final void rule__VariableReference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5715:1: ( ( ( rule__VariableReference__VariableAssignment_0 ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5716:1: ( ( rule__VariableReference__VariableAssignment_0 ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5716:1: ( ( rule__VariableReference__VariableAssignment_0 ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5717:1: ( rule__VariableReference__VariableAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableReferenceAccess().getVariableAssignment_0()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5718:1: ( rule__VariableReference__VariableAssignment_0 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5718:2: rule__VariableReference__VariableAssignment_0
            {
            pushFollow(FOLLOW_rule__VariableReference__VariableAssignment_0_in_rule__VariableReference__Group__0__Impl11443);
            rule__VariableReference__VariableAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableReferenceAccess().getVariableAssignment_0()); 
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
    // $ANTLR end "rule__VariableReference__Group__0__Impl"


    // $ANTLR start "rule__VariableReference__Group__1"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5728:1: rule__VariableReference__Group__1 : rule__VariableReference__Group__1__Impl ;
    public final void rule__VariableReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5732:1: ( rule__VariableReference__Group__1__Impl )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5733:2: rule__VariableReference__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__VariableReference__Group__1__Impl_in_rule__VariableReference__Group__111473);
            rule__VariableReference__Group__1__Impl();

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
    // $ANTLR end "rule__VariableReference__Group__1"


    // $ANTLR start "rule__VariableReference__Group__1__Impl"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5739:1: rule__VariableReference__Group__1__Impl : ( ( rule__VariableReference__Group_1__0 )* ) ;
    public final void rule__VariableReference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5743:1: ( ( ( rule__VariableReference__Group_1__0 )* ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5744:1: ( ( rule__VariableReference__Group_1__0 )* )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5744:1: ( ( rule__VariableReference__Group_1__0 )* )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5745:1: ( rule__VariableReference__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableReferenceAccess().getGroup_1()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5746:1: ( rule__VariableReference__Group_1__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==44) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5746:2: rule__VariableReference__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__VariableReference__Group_1__0_in_rule__VariableReference__Group__1__Impl11500);
            	    rule__VariableReference__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableReferenceAccess().getGroup_1()); 
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
    // $ANTLR end "rule__VariableReference__Group__1__Impl"


    // $ANTLR start "rule__VariableReference__Group_1__0"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5760:1: rule__VariableReference__Group_1__0 : rule__VariableReference__Group_1__0__Impl rule__VariableReference__Group_1__1 ;
    public final void rule__VariableReference__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5764:1: ( rule__VariableReference__Group_1__0__Impl rule__VariableReference__Group_1__1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5765:2: rule__VariableReference__Group_1__0__Impl rule__VariableReference__Group_1__1
            {
            pushFollow(FOLLOW_rule__VariableReference__Group_1__0__Impl_in_rule__VariableReference__Group_1__011535);
            rule__VariableReference__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__VariableReference__Group_1__1_in_rule__VariableReference__Group_1__011538);
            rule__VariableReference__Group_1__1();

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
    // $ANTLR end "rule__VariableReference__Group_1__0"


    // $ANTLR start "rule__VariableReference__Group_1__0__Impl"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5772:1: rule__VariableReference__Group_1__0__Impl : ( '[' ) ;
    public final void rule__VariableReference__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5776:1: ( ( '[' ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5777:1: ( '[' )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5777:1: ( '[' )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5778:1: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableReferenceAccess().getLeftSquareBracketKeyword_1_0()); 
            }
            match(input,44,FOLLOW_44_in_rule__VariableReference__Group_1__0__Impl11566); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableReferenceAccess().getLeftSquareBracketKeyword_1_0()); 
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
    // $ANTLR end "rule__VariableReference__Group_1__0__Impl"


    // $ANTLR start "rule__VariableReference__Group_1__1"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5791:1: rule__VariableReference__Group_1__1 : rule__VariableReference__Group_1__1__Impl rule__VariableReference__Group_1__2 ;
    public final void rule__VariableReference__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5795:1: ( rule__VariableReference__Group_1__1__Impl rule__VariableReference__Group_1__2 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5796:2: rule__VariableReference__Group_1__1__Impl rule__VariableReference__Group_1__2
            {
            pushFollow(FOLLOW_rule__VariableReference__Group_1__1__Impl_in_rule__VariableReference__Group_1__111597);
            rule__VariableReference__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__VariableReference__Group_1__2_in_rule__VariableReference__Group_1__111600);
            rule__VariableReference__Group_1__2();

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
    // $ANTLR end "rule__VariableReference__Group_1__1"


    // $ANTLR start "rule__VariableReference__Group_1__1__Impl"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5803:1: rule__VariableReference__Group_1__1__Impl : ( ( rule__VariableReference__DimensionsAssignment_1_1 ) ) ;
    public final void rule__VariableReference__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5807:1: ( ( ( rule__VariableReference__DimensionsAssignment_1_1 ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5808:1: ( ( rule__VariableReference__DimensionsAssignment_1_1 ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5808:1: ( ( rule__VariableReference__DimensionsAssignment_1_1 ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5809:1: ( rule__VariableReference__DimensionsAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableReferenceAccess().getDimensionsAssignment_1_1()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5810:1: ( rule__VariableReference__DimensionsAssignment_1_1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5810:2: rule__VariableReference__DimensionsAssignment_1_1
            {
            pushFollow(FOLLOW_rule__VariableReference__DimensionsAssignment_1_1_in_rule__VariableReference__Group_1__1__Impl11627);
            rule__VariableReference__DimensionsAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableReferenceAccess().getDimensionsAssignment_1_1()); 
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
    // $ANTLR end "rule__VariableReference__Group_1__1__Impl"


    // $ANTLR start "rule__VariableReference__Group_1__2"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5820:1: rule__VariableReference__Group_1__2 : rule__VariableReference__Group_1__2__Impl ;
    public final void rule__VariableReference__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5824:1: ( rule__VariableReference__Group_1__2__Impl )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5825:2: rule__VariableReference__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__VariableReference__Group_1__2__Impl_in_rule__VariableReference__Group_1__211657);
            rule__VariableReference__Group_1__2__Impl();

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
    // $ANTLR end "rule__VariableReference__Group_1__2"


    // $ANTLR start "rule__VariableReference__Group_1__2__Impl"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5831:1: rule__VariableReference__Group_1__2__Impl : ( ']' ) ;
    public final void rule__VariableReference__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5835:1: ( ( ']' ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5836:1: ( ']' )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5836:1: ( ']' )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5837:1: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableReferenceAccess().getRightSquareBracketKeyword_1_2()); 
            }
            match(input,45,FOLLOW_45_in_rule__VariableReference__Group_1__2__Impl11685); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableReferenceAccess().getRightSquareBracketKeyword_1_2()); 
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
    // $ANTLR end "rule__VariableReference__Group_1__2__Impl"


    // $ANTLR start "rule__FunctionCall__Group__0"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5856:1: rule__FunctionCall__Group__0 : rule__FunctionCall__Group__0__Impl rule__FunctionCall__Group__1 ;
    public final void rule__FunctionCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5860:1: ( rule__FunctionCall__Group__0__Impl rule__FunctionCall__Group__1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5861:2: rule__FunctionCall__Group__0__Impl rule__FunctionCall__Group__1
            {
            pushFollow(FOLLOW_rule__FunctionCall__Group__0__Impl_in_rule__FunctionCall__Group__011722);
            rule__FunctionCall__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FunctionCall__Group__1_in_rule__FunctionCall__Group__011725);
            rule__FunctionCall__Group__1();

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
    // $ANTLR end "rule__FunctionCall__Group__0"


    // $ANTLR start "rule__FunctionCall__Group__0__Impl"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5868:1: rule__FunctionCall__Group__0__Impl : ( () ) ;
    public final void rule__FunctionCall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5872:1: ( ( () ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5873:1: ( () )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5873:1: ( () )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5874:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getFunctionCallAction_0()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5875:1: ()
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5877:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionCallAccess().getFunctionCallAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__Group__0__Impl"


    // $ANTLR start "rule__FunctionCall__Group__1"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5887:1: rule__FunctionCall__Group__1 : rule__FunctionCall__Group__1__Impl rule__FunctionCall__Group__2 ;
    public final void rule__FunctionCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5891:1: ( rule__FunctionCall__Group__1__Impl rule__FunctionCall__Group__2 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5892:2: rule__FunctionCall__Group__1__Impl rule__FunctionCall__Group__2
            {
            pushFollow(FOLLOW_rule__FunctionCall__Group__1__Impl_in_rule__FunctionCall__Group__111783);
            rule__FunctionCall__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FunctionCall__Group__2_in_rule__FunctionCall__Group__111786);
            rule__FunctionCall__Group__2();

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
    // $ANTLR end "rule__FunctionCall__Group__1"


    // $ANTLR start "rule__FunctionCall__Group__1__Impl"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5899:1: rule__FunctionCall__Group__1__Impl : ( ( rule__FunctionCall__FunctionAssignment_1 ) ) ;
    public final void rule__FunctionCall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5903:1: ( ( ( rule__FunctionCall__FunctionAssignment_1 ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5904:1: ( ( rule__FunctionCall__FunctionAssignment_1 ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5904:1: ( ( rule__FunctionCall__FunctionAssignment_1 ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5905:1: ( rule__FunctionCall__FunctionAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getFunctionAssignment_1()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5906:1: ( rule__FunctionCall__FunctionAssignment_1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5906:2: rule__FunctionCall__FunctionAssignment_1
            {
            pushFollow(FOLLOW_rule__FunctionCall__FunctionAssignment_1_in_rule__FunctionCall__Group__1__Impl11813);
            rule__FunctionCall__FunctionAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionCallAccess().getFunctionAssignment_1()); 
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
    // $ANTLR end "rule__FunctionCall__Group__1__Impl"


    // $ANTLR start "rule__FunctionCall__Group__2"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5916:1: rule__FunctionCall__Group__2 : rule__FunctionCall__Group__2__Impl rule__FunctionCall__Group__3 ;
    public final void rule__FunctionCall__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5920:1: ( rule__FunctionCall__Group__2__Impl rule__FunctionCall__Group__3 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5921:2: rule__FunctionCall__Group__2__Impl rule__FunctionCall__Group__3
            {
            pushFollow(FOLLOW_rule__FunctionCall__Group__2__Impl_in_rule__FunctionCall__Group__211843);
            rule__FunctionCall__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FunctionCall__Group__3_in_rule__FunctionCall__Group__211846);
            rule__FunctionCall__Group__3();

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
    // $ANTLR end "rule__FunctionCall__Group__2"


    // $ANTLR start "rule__FunctionCall__Group__2__Impl"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5928:1: rule__FunctionCall__Group__2__Impl : ( '(' ) ;
    public final void rule__FunctionCall__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5932:1: ( ( '(' ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5933:1: ( '(' )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5933:1: ( '(' )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5934:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getLeftParenthesisKeyword_2()); 
            }
            match(input,21,FOLLOW_21_in_rule__FunctionCall__Group__2__Impl11874); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionCallAccess().getLeftParenthesisKeyword_2()); 
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
    // $ANTLR end "rule__FunctionCall__Group__2__Impl"


    // $ANTLR start "rule__FunctionCall__Group__3"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5947:1: rule__FunctionCall__Group__3 : rule__FunctionCall__Group__3__Impl rule__FunctionCall__Group__4 ;
    public final void rule__FunctionCall__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5951:1: ( rule__FunctionCall__Group__3__Impl rule__FunctionCall__Group__4 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5952:2: rule__FunctionCall__Group__3__Impl rule__FunctionCall__Group__4
            {
            pushFollow(FOLLOW_rule__FunctionCall__Group__3__Impl_in_rule__FunctionCall__Group__311905);
            rule__FunctionCall__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FunctionCall__Group__4_in_rule__FunctionCall__Group__311908);
            rule__FunctionCall__Group__4();

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
    // $ANTLR end "rule__FunctionCall__Group__3"


    // $ANTLR start "rule__FunctionCall__Group__3__Impl"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5959:1: rule__FunctionCall__Group__3__Impl : ( ( rule__FunctionCall__ArgsAssignment_3 ) ) ;
    public final void rule__FunctionCall__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5963:1: ( ( ( rule__FunctionCall__ArgsAssignment_3 ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5964:1: ( ( rule__FunctionCall__ArgsAssignment_3 ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5964:1: ( ( rule__FunctionCall__ArgsAssignment_3 ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5965:1: ( rule__FunctionCall__ArgsAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getArgsAssignment_3()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5966:1: ( rule__FunctionCall__ArgsAssignment_3 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5966:2: rule__FunctionCall__ArgsAssignment_3
            {
            pushFollow(FOLLOW_rule__FunctionCall__ArgsAssignment_3_in_rule__FunctionCall__Group__3__Impl11935);
            rule__FunctionCall__ArgsAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionCallAccess().getArgsAssignment_3()); 
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
    // $ANTLR end "rule__FunctionCall__Group__3__Impl"


    // $ANTLR start "rule__FunctionCall__Group__4"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5976:1: rule__FunctionCall__Group__4 : rule__FunctionCall__Group__4__Impl rule__FunctionCall__Group__5 ;
    public final void rule__FunctionCall__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5980:1: ( rule__FunctionCall__Group__4__Impl rule__FunctionCall__Group__5 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5981:2: rule__FunctionCall__Group__4__Impl rule__FunctionCall__Group__5
            {
            pushFollow(FOLLOW_rule__FunctionCall__Group__4__Impl_in_rule__FunctionCall__Group__411965);
            rule__FunctionCall__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FunctionCall__Group__5_in_rule__FunctionCall__Group__411968);
            rule__FunctionCall__Group__5();

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
    // $ANTLR end "rule__FunctionCall__Group__4"


    // $ANTLR start "rule__FunctionCall__Group__4__Impl"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5988:1: rule__FunctionCall__Group__4__Impl : ( ( rule__FunctionCall__Group_4__0 )* ) ;
    public final void rule__FunctionCall__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5992:1: ( ( ( rule__FunctionCall__Group_4__0 )* ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5993:1: ( ( rule__FunctionCall__Group_4__0 )* )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5993:1: ( ( rule__FunctionCall__Group_4__0 )* )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5994:1: ( rule__FunctionCall__Group_4__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getGroup_4()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5995:1: ( rule__FunctionCall__Group_4__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==30) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5995:2: rule__FunctionCall__Group_4__0
            	    {
            	    pushFollow(FOLLOW_rule__FunctionCall__Group_4__0_in_rule__FunctionCall__Group__4__Impl11995);
            	    rule__FunctionCall__Group_4__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionCallAccess().getGroup_4()); 
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
    // $ANTLR end "rule__FunctionCall__Group__4__Impl"


    // $ANTLR start "rule__FunctionCall__Group__5"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6005:1: rule__FunctionCall__Group__5 : rule__FunctionCall__Group__5__Impl ;
    public final void rule__FunctionCall__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6009:1: ( rule__FunctionCall__Group__5__Impl )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6010:2: rule__FunctionCall__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__FunctionCall__Group__5__Impl_in_rule__FunctionCall__Group__512026);
            rule__FunctionCall__Group__5__Impl();

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
    // $ANTLR end "rule__FunctionCall__Group__5"


    // $ANTLR start "rule__FunctionCall__Group__5__Impl"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6016:1: rule__FunctionCall__Group__5__Impl : ( ')' ) ;
    public final void rule__FunctionCall__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6020:1: ( ( ')' ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6021:1: ( ')' )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6021:1: ( ')' )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6022:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getRightParenthesisKeyword_5()); 
            }
            match(input,22,FOLLOW_22_in_rule__FunctionCall__Group__5__Impl12054); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionCallAccess().getRightParenthesisKeyword_5()); 
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
    // $ANTLR end "rule__FunctionCall__Group__5__Impl"


    // $ANTLR start "rule__FunctionCall__Group_4__0"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6047:1: rule__FunctionCall__Group_4__0 : rule__FunctionCall__Group_4__0__Impl rule__FunctionCall__Group_4__1 ;
    public final void rule__FunctionCall__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6051:1: ( rule__FunctionCall__Group_4__0__Impl rule__FunctionCall__Group_4__1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6052:2: rule__FunctionCall__Group_4__0__Impl rule__FunctionCall__Group_4__1
            {
            pushFollow(FOLLOW_rule__FunctionCall__Group_4__0__Impl_in_rule__FunctionCall__Group_4__012097);
            rule__FunctionCall__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FunctionCall__Group_4__1_in_rule__FunctionCall__Group_4__012100);
            rule__FunctionCall__Group_4__1();

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
    // $ANTLR end "rule__FunctionCall__Group_4__0"


    // $ANTLR start "rule__FunctionCall__Group_4__0__Impl"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6059:1: rule__FunctionCall__Group_4__0__Impl : ( ',' ) ;
    public final void rule__FunctionCall__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6063:1: ( ( ',' ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6064:1: ( ',' )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6064:1: ( ',' )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6065:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getCommaKeyword_4_0()); 
            }
            match(input,30,FOLLOW_30_in_rule__FunctionCall__Group_4__0__Impl12128); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionCallAccess().getCommaKeyword_4_0()); 
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
    // $ANTLR end "rule__FunctionCall__Group_4__0__Impl"


    // $ANTLR start "rule__FunctionCall__Group_4__1"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6078:1: rule__FunctionCall__Group_4__1 : rule__FunctionCall__Group_4__1__Impl ;
    public final void rule__FunctionCall__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6082:1: ( rule__FunctionCall__Group_4__1__Impl )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6083:2: rule__FunctionCall__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__FunctionCall__Group_4__1__Impl_in_rule__FunctionCall__Group_4__112159);
            rule__FunctionCall__Group_4__1__Impl();

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
    // $ANTLR end "rule__FunctionCall__Group_4__1"


    // $ANTLR start "rule__FunctionCall__Group_4__1__Impl"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6089:1: rule__FunctionCall__Group_4__1__Impl : ( ( rule__FunctionCall__ArgsAssignment_4_1 ) ) ;
    public final void rule__FunctionCall__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6093:1: ( ( ( rule__FunctionCall__ArgsAssignment_4_1 ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6094:1: ( ( rule__FunctionCall__ArgsAssignment_4_1 ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6094:1: ( ( rule__FunctionCall__ArgsAssignment_4_1 ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6095:1: ( rule__FunctionCall__ArgsAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getArgsAssignment_4_1()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6096:1: ( rule__FunctionCall__ArgsAssignment_4_1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6096:2: rule__FunctionCall__ArgsAssignment_4_1
            {
            pushFollow(FOLLOW_rule__FunctionCall__ArgsAssignment_4_1_in_rule__FunctionCall__Group_4__1__Impl12186);
            rule__FunctionCall__ArgsAssignment_4_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionCallAccess().getArgsAssignment_4_1()); 
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
    // $ANTLR end "rule__FunctionCall__Group_4__1__Impl"


    // $ANTLR start "rule__Return__Group__0"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6110:1: rule__Return__Group__0 : rule__Return__Group__0__Impl rule__Return__Group__1 ;
    public final void rule__Return__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6114:1: ( rule__Return__Group__0__Impl rule__Return__Group__1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6115:2: rule__Return__Group__0__Impl rule__Return__Group__1
            {
            pushFollow(FOLLOW_rule__Return__Group__0__Impl_in_rule__Return__Group__012220);
            rule__Return__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Return__Group__1_in_rule__Return__Group__012223);
            rule__Return__Group__1();

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
    // $ANTLR end "rule__Return__Group__0"


    // $ANTLR start "rule__Return__Group__0__Impl"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6122:1: rule__Return__Group__0__Impl : ( 'return' ) ;
    public final void rule__Return__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6126:1: ( ( 'return' ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6127:1: ( 'return' )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6127:1: ( 'return' )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6128:1: 'return'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReturnAccess().getReturnKeyword_0()); 
            }
            match(input,46,FOLLOW_46_in_rule__Return__Group__0__Impl12251); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReturnAccess().getReturnKeyword_0()); 
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
    // $ANTLR end "rule__Return__Group__0__Impl"


    // $ANTLR start "rule__Return__Group__1"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6141:1: rule__Return__Group__1 : rule__Return__Group__1__Impl ;
    public final void rule__Return__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6145:1: ( rule__Return__Group__1__Impl )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6146:2: rule__Return__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Return__Group__1__Impl_in_rule__Return__Group__112282);
            rule__Return__Group__1__Impl();

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
    // $ANTLR end "rule__Return__Group__1"


    // $ANTLR start "rule__Return__Group__1__Impl"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6152:1: rule__Return__Group__1__Impl : ( ( rule__Return__ValueAssignment_1 ) ) ;
    public final void rule__Return__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6156:1: ( ( ( rule__Return__ValueAssignment_1 ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6157:1: ( ( rule__Return__ValueAssignment_1 ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6157:1: ( ( rule__Return__ValueAssignment_1 ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6158:1: ( rule__Return__ValueAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReturnAccess().getValueAssignment_1()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6159:1: ( rule__Return__ValueAssignment_1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6159:2: rule__Return__ValueAssignment_1
            {
            pushFollow(FOLLOW_rule__Return__ValueAssignment_1_in_rule__Return__Group__1__Impl12309);
            rule__Return__ValueAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getReturnAccess().getValueAssignment_1()); 
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
    // $ANTLR end "rule__Return__Group__1__Impl"


    // $ANTLR start "rule__Include__Group__0"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6173:1: rule__Include__Group__0 : rule__Include__Group__0__Impl rule__Include__Group__1 ;
    public final void rule__Include__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6177:1: ( rule__Include__Group__0__Impl rule__Include__Group__1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6178:2: rule__Include__Group__0__Impl rule__Include__Group__1
            {
            pushFollow(FOLLOW_rule__Include__Group__0__Impl_in_rule__Include__Group__012343);
            rule__Include__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Include__Group__1_in_rule__Include__Group__012346);
            rule__Include__Group__1();

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
    // $ANTLR end "rule__Include__Group__0"


    // $ANTLR start "rule__Include__Group__0__Impl"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6185:1: rule__Include__Group__0__Impl : ( 'include' ) ;
    public final void rule__Include__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6189:1: ( ( 'include' ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6190:1: ( 'include' )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6190:1: ( 'include' )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6191:1: 'include'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIncludeAccess().getIncludeKeyword_0()); 
            }
            match(input,47,FOLLOW_47_in_rule__Include__Group__0__Impl12374); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIncludeAccess().getIncludeKeyword_0()); 
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
    // $ANTLR end "rule__Include__Group__0__Impl"


    // $ANTLR start "rule__Include__Group__1"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6204:1: rule__Include__Group__1 : rule__Include__Group__1__Impl rule__Include__Group__2 ;
    public final void rule__Include__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6208:1: ( rule__Include__Group__1__Impl rule__Include__Group__2 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6209:2: rule__Include__Group__1__Impl rule__Include__Group__2
            {
            pushFollow(FOLLOW_rule__Include__Group__1__Impl_in_rule__Include__Group__112405);
            rule__Include__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Include__Group__2_in_rule__Include__Group__112408);
            rule__Include__Group__2();

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
    // $ANTLR end "rule__Include__Group__1"


    // $ANTLR start "rule__Include__Group__1__Impl"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6216:1: rule__Include__Group__1__Impl : ( '(' ) ;
    public final void rule__Include__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6220:1: ( ( '(' ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6221:1: ( '(' )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6221:1: ( '(' )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6222:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIncludeAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,21,FOLLOW_21_in_rule__Include__Group__1__Impl12436); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIncludeAccess().getLeftParenthesisKeyword_1()); 
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
    // $ANTLR end "rule__Include__Group__1__Impl"


    // $ANTLR start "rule__Include__Group__2"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6235:1: rule__Include__Group__2 : rule__Include__Group__2__Impl rule__Include__Group__3 ;
    public final void rule__Include__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6239:1: ( rule__Include__Group__2__Impl rule__Include__Group__3 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6240:2: rule__Include__Group__2__Impl rule__Include__Group__3
            {
            pushFollow(FOLLOW_rule__Include__Group__2__Impl_in_rule__Include__Group__212467);
            rule__Include__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Include__Group__3_in_rule__Include__Group__212470);
            rule__Include__Group__3();

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
    // $ANTLR end "rule__Include__Group__2"


    // $ANTLR start "rule__Include__Group__2__Impl"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6247:1: rule__Include__Group__2__Impl : ( ( rule__Include__ImportURIAssignment_2 ) ) ;
    public final void rule__Include__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6251:1: ( ( ( rule__Include__ImportURIAssignment_2 ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6252:1: ( ( rule__Include__ImportURIAssignment_2 ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6252:1: ( ( rule__Include__ImportURIAssignment_2 ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6253:1: ( rule__Include__ImportURIAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIncludeAccess().getImportURIAssignment_2()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6254:1: ( rule__Include__ImportURIAssignment_2 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6254:2: rule__Include__ImportURIAssignment_2
            {
            pushFollow(FOLLOW_rule__Include__ImportURIAssignment_2_in_rule__Include__Group__2__Impl12497);
            rule__Include__ImportURIAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIncludeAccess().getImportURIAssignment_2()); 
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
    // $ANTLR end "rule__Include__Group__2__Impl"


    // $ANTLR start "rule__Include__Group__3"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6264:1: rule__Include__Group__3 : rule__Include__Group__3__Impl ;
    public final void rule__Include__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6268:1: ( rule__Include__Group__3__Impl )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6269:2: rule__Include__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Include__Group__3__Impl_in_rule__Include__Group__312527);
            rule__Include__Group__3__Impl();

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
    // $ANTLR end "rule__Include__Group__3"


    // $ANTLR start "rule__Include__Group__3__Impl"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6275:1: rule__Include__Group__3__Impl : ( ')' ) ;
    public final void rule__Include__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6279:1: ( ( ')' ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6280:1: ( ')' )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6280:1: ( ')' )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6281:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIncludeAccess().getRightParenthesisKeyword_3()); 
            }
            match(input,22,FOLLOW_22_in_rule__Include__Group__3__Impl12555); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIncludeAccess().getRightParenthesisKeyword_3()); 
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
    // $ANTLR end "rule__Include__Group__3__Impl"


    // $ANTLR start "rule__Script__StatementsAssignment"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6303:1: rule__Script__StatementsAssignment : ( ruleToplevelStatement ) ;
    public final void rule__Script__StatementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6307:1: ( ( ruleToplevelStatement ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6308:1: ( ruleToplevelStatement )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6308:1: ( ruleToplevelStatement )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6309:1: ruleToplevelStatement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScriptAccess().getStatementsToplevelStatementParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleToplevelStatement_in_rule__Script__StatementsAssignment12599);
            ruleToplevelStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getScriptAccess().getStatementsToplevelStatementParserRuleCall_0()); 
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
    // $ANTLR end "rule__Script__StatementsAssignment"


    // $ANTLR start "rule__StatementBlock__StatementsAssignment_2"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6318:1: rule__StatementBlock__StatementsAssignment_2 : ( ruleStatement ) ;
    public final void rule__StatementBlock__StatementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6322:1: ( ( ruleStatement ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6323:1: ( ruleStatement )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6323:1: ( ruleStatement )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6324:1: ruleStatement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementBlockAccess().getStatementsStatementParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleStatement_in_rule__StatementBlock__StatementsAssignment_212630);
            ruleStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementBlockAccess().getStatementsStatementParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__StatementBlock__StatementsAssignment_2"


    // $ANTLR start "rule__Affectation__VariableAssignment_0"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6333:1: rule__Affectation__VariableAssignment_0 : ( ruleVariableReference ) ;
    public final void rule__Affectation__VariableAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6337:1: ( ( ruleVariableReference ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6338:1: ( ruleVariableReference )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6338:1: ( ruleVariableReference )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6339:1: ruleVariableReference
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAffectationAccess().getVariableVariableReferenceParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleVariableReference_in_rule__Affectation__VariableAssignment_012661);
            ruleVariableReference();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAffectationAccess().getVariableVariableReferenceParserRuleCall_0_0()); 
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
    // $ANTLR end "rule__Affectation__VariableAssignment_0"


    // $ANTLR start "rule__Affectation__ValueAssignment_2"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6348:1: rule__Affectation__ValueAssignment_2 : ( ruleExpression ) ;
    public final void rule__Affectation__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6352:1: ( ( ruleExpression ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6353:1: ( ruleExpression )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6353:1: ( ruleExpression )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6354:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAffectationAccess().getValueExpressionParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__Affectation__ValueAssignment_212692);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAffectationAccess().getValueExpressionParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__Affectation__ValueAssignment_2"


    // $ANTLR start "rule__If__ConditionAssignment_2"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6363:1: rule__If__ConditionAssignment_2 : ( ruleExpression ) ;
    public final void rule__If__ConditionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6367:1: ( ( ruleExpression ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6368:1: ( ruleExpression )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6368:1: ( ruleExpression )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6369:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getConditionExpressionParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__If__ConditionAssignment_212723);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfAccess().getConditionExpressionParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__If__ConditionAssignment_2"


    // $ANTLR start "rule__If__ThenAssignment_4"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6378:1: rule__If__ThenAssignment_4 : ( ruleStatement ) ;
    public final void rule__If__ThenAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6382:1: ( ( ruleStatement ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6383:1: ( ruleStatement )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6383:1: ( ruleStatement )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6384:1: ruleStatement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getThenStatementParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_ruleStatement_in_rule__If__ThenAssignment_412754);
            ruleStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfAccess().getThenStatementParserRuleCall_4_0()); 
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
    // $ANTLR end "rule__If__ThenAssignment_4"


    // $ANTLR start "rule__If__ElseAssignment_5_1"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6393:1: rule__If__ElseAssignment_5_1 : ( ruleStatement ) ;
    public final void rule__If__ElseAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6397:1: ( ( ruleStatement ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6398:1: ( ruleStatement )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6398:1: ( ruleStatement )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6399:1: ruleStatement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getElseStatementParserRuleCall_5_1_0()); 
            }
            pushFollow(FOLLOW_ruleStatement_in_rule__If__ElseAssignment_5_112785);
            ruleStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfAccess().getElseStatementParserRuleCall_5_1_0()); 
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
    // $ANTLR end "rule__If__ElseAssignment_5_1"


    // $ANTLR start "rule__While__ConditionAssignment_2"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6408:1: rule__While__ConditionAssignment_2 : ( ruleExpression ) ;
    public final void rule__While__ConditionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6412:1: ( ( ruleExpression ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6413:1: ( ruleExpression )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6413:1: ( ruleExpression )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6414:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileAccess().getConditionExpressionParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__While__ConditionAssignment_212816);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhileAccess().getConditionExpressionParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__While__ConditionAssignment_2"


    // $ANTLR start "rule__While__StatementAssignment_4"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6423:1: rule__While__StatementAssignment_4 : ( ruleStatement ) ;
    public final void rule__While__StatementAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6427:1: ( ( ruleStatement ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6428:1: ( ruleStatement )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6428:1: ( ruleStatement )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6429:1: ruleStatement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileAccess().getStatementStatementParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_ruleStatement_in_rule__While__StatementAssignment_412847);
            ruleStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhileAccess().getStatementStatementParserRuleCall_4_0()); 
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
    // $ANTLR end "rule__While__StatementAssignment_4"


    // $ANTLR start "rule__For__IteratorAssignment_2"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6438:1: rule__For__IteratorAssignment_2 : ( ruleForIterator ) ;
    public final void rule__For__IteratorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6442:1: ( ( ruleForIterator ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6443:1: ( ruleForIterator )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6443:1: ( ruleForIterator )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6444:1: ruleForIterator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForAccess().getIteratorForIteratorParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleForIterator_in_rule__For__IteratorAssignment_212878);
            ruleForIterator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForAccess().getIteratorForIteratorParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__For__IteratorAssignment_2"


    // $ANTLR start "rule__For__StatementAssignment_4"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6453:1: rule__For__StatementAssignment_4 : ( ruleStatement ) ;
    public final void rule__For__StatementAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6457:1: ( ( ruleStatement ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6458:1: ( ruleStatement )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6458:1: ( ruleStatement )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6459:1: ruleStatement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForAccess().getStatementStatementParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_ruleStatement_in_rule__For__StatementAssignment_412909);
            ruleStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForAccess().getStatementStatementParserRuleCall_4_0()); 
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
    // $ANTLR end "rule__For__StatementAssignment_4"


    // $ANTLR start "rule__EachIterator__KeyAssignment_0_1"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6468:1: rule__EachIterator__KeyAssignment_0_1 : ( ruleVariableDeclaration ) ;
    public final void rule__EachIterator__KeyAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6472:1: ( ( ruleVariableDeclaration ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6473:1: ( ruleVariableDeclaration )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6473:1: ( ruleVariableDeclaration )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6474:1: ruleVariableDeclaration
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEachIteratorAccess().getKeyVariableDeclarationParserRuleCall_0_1_0()); 
            }
            pushFollow(FOLLOW_ruleVariableDeclaration_in_rule__EachIterator__KeyAssignment_0_112940);
            ruleVariableDeclaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEachIteratorAccess().getKeyVariableDeclarationParserRuleCall_0_1_0()); 
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
    // $ANTLR end "rule__EachIterator__KeyAssignment_0_1"


    // $ANTLR start "rule__EachIterator__ValueAssignment_2"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6483:1: rule__EachIterator__ValueAssignment_2 : ( ruleVariableDeclaration ) ;
    public final void rule__EachIterator__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6487:1: ( ( ruleVariableDeclaration ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6488:1: ( ruleVariableDeclaration )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6488:1: ( ruleVariableDeclaration )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6489:1: ruleVariableDeclaration
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEachIteratorAccess().getValueVariableDeclarationParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleVariableDeclaration_in_rule__EachIterator__ValueAssignment_212971);
            ruleVariableDeclaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEachIteratorAccess().getValueVariableDeclarationParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__EachIterator__ValueAssignment_2"


    // $ANTLR start "rule__EachIterator__ArrayAssignment_4"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6498:1: rule__EachIterator__ArrayAssignment_4 : ( ruleExpression ) ;
    public final void rule__EachIterator__ArrayAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6502:1: ( ( ruleExpression ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6503:1: ( ruleExpression )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6503:1: ( ruleExpression )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6504:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEachIteratorAccess().getArrayExpressionParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__EachIterator__ArrayAssignment_413002);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEachIteratorAccess().getArrayExpressionParserRuleCall_4_0()); 
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
    // $ANTLR end "rule__EachIterator__ArrayAssignment_4"


    // $ANTLR start "rule__VariableIterator__InitializationAssignment_0"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6513:1: rule__VariableIterator__InitializationAssignment_0 : ( ruleAffectation ) ;
    public final void rule__VariableIterator__InitializationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6517:1: ( ( ruleAffectation ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6518:1: ( ruleAffectation )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6518:1: ( ruleAffectation )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6519:1: ruleAffectation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableIteratorAccess().getInitializationAffectationParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleAffectation_in_rule__VariableIterator__InitializationAssignment_013033);
            ruleAffectation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableIteratorAccess().getInitializationAffectationParserRuleCall_0_0()); 
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
    // $ANTLR end "rule__VariableIterator__InitializationAssignment_0"


    // $ANTLR start "rule__VariableIterator__ConditionAssignment_2"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6528:1: rule__VariableIterator__ConditionAssignment_2 : ( ruleExpression ) ;
    public final void rule__VariableIterator__ConditionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6532:1: ( ( ruleExpression ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6533:1: ( ruleExpression )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6533:1: ( ruleExpression )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6534:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableIteratorAccess().getConditionExpressionParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__VariableIterator__ConditionAssignment_213064);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableIteratorAccess().getConditionExpressionParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__VariableIterator__ConditionAssignment_2"


    // $ANTLR start "rule__VariableIterator__IncrementAssignment_4"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6543:1: rule__VariableIterator__IncrementAssignment_4 : ( ruleExpression ) ;
    public final void rule__VariableIterator__IncrementAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6547:1: ( ( ruleExpression ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6548:1: ( ruleExpression )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6548:1: ( ruleExpression )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6549:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableIteratorAccess().getIncrementExpressionParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__VariableIterator__IncrementAssignment_413095);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableIteratorAccess().getIncrementExpressionParserRuleCall_4_0()); 
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
    // $ANTLR end "rule__VariableIterator__IncrementAssignment_4"


    // $ANTLR start "rule__FunctionDeclaration__NameAssignment_1"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6558:1: rule__FunctionDeclaration__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__FunctionDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6562:1: ( ( RULE_ID ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6563:1: ( RULE_ID )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6563:1: ( RULE_ID )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6564:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FunctionDeclaration__NameAssignment_113126); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
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
    // $ANTLR end "rule__FunctionDeclaration__NameAssignment_1"


    // $ANTLR start "rule__FunctionDeclaration__ParameterAssignment_3_0"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6573:1: rule__FunctionDeclaration__ParameterAssignment_3_0 : ( ruleParameterDeclaration ) ;
    public final void rule__FunctionDeclaration__ParameterAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6577:1: ( ( ruleParameterDeclaration ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6578:1: ( ruleParameterDeclaration )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6578:1: ( ruleParameterDeclaration )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6579:1: ruleParameterDeclaration
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionDeclarationAccess().getParameterParameterDeclarationParserRuleCall_3_0_0()); 
            }
            pushFollow(FOLLOW_ruleParameterDeclaration_in_rule__FunctionDeclaration__ParameterAssignment_3_013157);
            ruleParameterDeclaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionDeclarationAccess().getParameterParameterDeclarationParserRuleCall_3_0_0()); 
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
    // $ANTLR end "rule__FunctionDeclaration__ParameterAssignment_3_0"


    // $ANTLR start "rule__FunctionDeclaration__ParameterAssignment_3_1_1"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6588:1: rule__FunctionDeclaration__ParameterAssignment_3_1_1 : ( ruleParameterDeclaration ) ;
    public final void rule__FunctionDeclaration__ParameterAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6592:1: ( ( ruleParameterDeclaration ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6593:1: ( ruleParameterDeclaration )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6593:1: ( ruleParameterDeclaration )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6594:1: ruleParameterDeclaration
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionDeclarationAccess().getParameterParameterDeclarationParserRuleCall_3_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleParameterDeclaration_in_rule__FunctionDeclaration__ParameterAssignment_3_1_113188);
            ruleParameterDeclaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionDeclarationAccess().getParameterParameterDeclarationParserRuleCall_3_1_1_0()); 
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
    // $ANTLR end "rule__FunctionDeclaration__ParameterAssignment_3_1_1"


    // $ANTLR start "rule__FunctionDeclaration__BodyAssignment_5"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6603:1: rule__FunctionDeclaration__BodyAssignment_5 : ( ruleStatementBlock ) ;
    public final void rule__FunctionDeclaration__BodyAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6607:1: ( ( ruleStatementBlock ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6608:1: ( ruleStatementBlock )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6608:1: ( ruleStatementBlock )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6609:1: ruleStatementBlock
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionDeclarationAccess().getBodyStatementBlockParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_ruleStatementBlock_in_rule__FunctionDeclaration__BodyAssignment_513219);
            ruleStatementBlock();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionDeclarationAccess().getBodyStatementBlockParserRuleCall_5_0()); 
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
    // $ANTLR end "rule__FunctionDeclaration__BodyAssignment_5"


    // $ANTLR start "rule__ParameterDeclaration__ByAdressAssignment_0"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6618:1: rule__ParameterDeclaration__ByAdressAssignment_0 : ( ( '@' ) ) ;
    public final void rule__ParameterDeclaration__ByAdressAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6622:1: ( ( ( '@' ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6623:1: ( ( '@' ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6623:1: ( ( '@' ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6624:1: ( '@' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterDeclarationAccess().getByAdressCommercialAtKeyword_0_0()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6625:1: ( '@' )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6626:1: '@'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterDeclarationAccess().getByAdressCommercialAtKeyword_0_0()); 
            }
            match(input,48,FOLLOW_48_in_rule__ParameterDeclaration__ByAdressAssignment_013255); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterDeclarationAccess().getByAdressCommercialAtKeyword_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterDeclarationAccess().getByAdressCommercialAtKeyword_0_0()); 
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
    // $ANTLR end "rule__ParameterDeclaration__ByAdressAssignment_0"


    // $ANTLR start "rule__ParameterDeclaration__NameAssignment_1"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6641:1: rule__ParameterDeclaration__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ParameterDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6645:1: ( ( RULE_ID ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6646:1: ( RULE_ID )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6646:1: ( RULE_ID )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6647:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ParameterDeclaration__NameAssignment_113294); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
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
    // $ANTLR end "rule__ParameterDeclaration__NameAssignment_1"


    // $ANTLR start "rule__LocalDeclaration__VariablesAssignment_1"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6656:1: rule__LocalDeclaration__VariablesAssignment_1 : ( ruleVariableDeclaration ) ;
    public final void rule__LocalDeclaration__VariablesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6660:1: ( ( ruleVariableDeclaration ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6661:1: ( ruleVariableDeclaration )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6661:1: ( ruleVariableDeclaration )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6662:1: ruleVariableDeclaration
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalDeclarationAccess().getVariablesVariableDeclarationParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleVariableDeclaration_in_rule__LocalDeclaration__VariablesAssignment_113325);
            ruleVariableDeclaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocalDeclarationAccess().getVariablesVariableDeclarationParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__LocalDeclaration__VariablesAssignment_1"


    // $ANTLR start "rule__LocalDeclaration__VariablesAssignment_2_1"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6671:1: rule__LocalDeclaration__VariablesAssignment_2_1 : ( ruleVariableDeclaration ) ;
    public final void rule__LocalDeclaration__VariablesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6675:1: ( ( ruleVariableDeclaration ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6676:1: ( ruleVariableDeclaration )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6676:1: ( ruleVariableDeclaration )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6677:1: ruleVariableDeclaration
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalDeclarationAccess().getVariablesVariableDeclarationParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleVariableDeclaration_in_rule__LocalDeclaration__VariablesAssignment_2_113356);
            ruleVariableDeclaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocalDeclarationAccess().getVariablesVariableDeclarationParserRuleCall_2_1_0()); 
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
    // $ANTLR end "rule__LocalDeclaration__VariablesAssignment_2_1"


    // $ANTLR start "rule__GlobalDeclaration__VariablesAssignment_1"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6686:1: rule__GlobalDeclaration__VariablesAssignment_1 : ( ruleVariableDeclaration ) ;
    public final void rule__GlobalDeclaration__VariablesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6690:1: ( ( ruleVariableDeclaration ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6691:1: ( ruleVariableDeclaration )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6691:1: ( ruleVariableDeclaration )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6692:1: ruleVariableDeclaration
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGlobalDeclarationAccess().getVariablesVariableDeclarationParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleVariableDeclaration_in_rule__GlobalDeclaration__VariablesAssignment_113387);
            ruleVariableDeclaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGlobalDeclarationAccess().getVariablesVariableDeclarationParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__GlobalDeclaration__VariablesAssignment_1"


    // $ANTLR start "rule__GlobalDeclaration__VariablesAssignment_2_1"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6701:1: rule__GlobalDeclaration__VariablesAssignment_2_1 : ( ruleVariableDeclaration ) ;
    public final void rule__GlobalDeclaration__VariablesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6705:1: ( ( ruleVariableDeclaration ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6706:1: ( ruleVariableDeclaration )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6706:1: ( ruleVariableDeclaration )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6707:1: ruleVariableDeclaration
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGlobalDeclarationAccess().getVariablesVariableDeclarationParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleVariableDeclaration_in_rule__GlobalDeclaration__VariablesAssignment_2_113418);
            ruleVariableDeclaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGlobalDeclarationAccess().getVariablesVariableDeclarationParserRuleCall_2_1_0()); 
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
    // $ANTLR end "rule__GlobalDeclaration__VariablesAssignment_2_1"


    // $ANTLR start "rule__VariableDeclaration__NameAssignment_0"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6716:1: rule__VariableDeclaration__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__VariableDeclaration__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6720:1: ( ( RULE_ID ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6721:1: ( RULE_ID )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6721:1: ( RULE_ID )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6722:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableDeclarationAccess().getNameIDTerminalRuleCall_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__VariableDeclaration__NameAssignment_013449); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableDeclarationAccess().getNameIDTerminalRuleCall_0_0()); 
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
    // $ANTLR end "rule__VariableDeclaration__NameAssignment_0"


    // $ANTLR start "rule__VariableDeclaration__ValueAssignment_1_1"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6731:1: rule__VariableDeclaration__ValueAssignment_1_1 : ( ruleExpression ) ;
    public final void rule__VariableDeclaration__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6735:1: ( ( ruleExpression ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6736:1: ( ruleExpression )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6736:1: ( ruleExpression )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6737:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableDeclarationAccess().getValueExpressionParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__VariableDeclaration__ValueAssignment_1_113480);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableDeclarationAccess().getValueExpressionParserRuleCall_1_1_0()); 
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
    // $ANTLR end "rule__VariableDeclaration__ValueAssignment_1_1"


    // $ANTLR start "rule__Comparison__RightAssignment_1_1"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6746:1: rule__Comparison__RightAssignment_1_1 : ( ruleOr ) ;
    public final void rule__Comparison__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6750:1: ( ( ruleOr ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6751:1: ( ruleOr )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6751:1: ( ruleOr )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6752:1: ruleOr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getRightOrParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleOr_in_rule__Comparison__RightAssignment_1_113511);
            ruleOr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonAccess().getRightOrParserRuleCall_1_1_0()); 
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
    // $ANTLR end "rule__Comparison__RightAssignment_1_1"


    // $ANTLR start "rule__Or__RightAssignment_1_1"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6761:1: rule__Or__RightAssignment_1_1 : ( ruleAnd ) ;
    public final void rule__Or__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6765:1: ( ( ruleAnd ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6766:1: ( ruleAnd )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6766:1: ( ruleAnd )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6767:1: ruleAnd
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAccess().getRightAndParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleAnd_in_rule__Or__RightAssignment_1_113542);
            ruleAnd();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrAccess().getRightAndParserRuleCall_1_1_0()); 
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
    // $ANTLR end "rule__Or__RightAssignment_1_1"


    // $ANTLR start "rule__And__RightAssignment_1_1"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6776:1: rule__And__RightAssignment_1_1 : ( ruleAddition ) ;
    public final void rule__And__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6780:1: ( ( ruleAddition ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6781:1: ( ruleAddition )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6781:1: ( ruleAddition )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6782:1: ruleAddition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndAccess().getRightAdditionParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleAddition_in_rule__And__RightAssignment_1_113573);
            ruleAddition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndAccess().getRightAdditionParserRuleCall_1_1_0()); 
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
    // $ANTLR end "rule__And__RightAssignment_1_1"


    // $ANTLR start "rule__Addition__RightAssignment_1_1"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6791:1: rule__Addition__RightAssignment_1_1 : ( ruleMultiplication ) ;
    public final void rule__Addition__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6795:1: ( ( ruleMultiplication ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6796:1: ( ruleMultiplication )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6796:1: ( ruleMultiplication )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6797:1: ruleMultiplication
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getRightMultiplicationParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleMultiplication_in_rule__Addition__RightAssignment_1_113604);
            ruleMultiplication();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditionAccess().getRightMultiplicationParserRuleCall_1_1_0()); 
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
    // $ANTLR end "rule__Addition__RightAssignment_1_1"


    // $ANTLR start "rule__Multiplication__RightAssignment_1_1"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6806:1: rule__Multiplication__RightAssignment_1_1 : ( rulePrimaryExpression ) ;
    public final void rule__Multiplication__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6810:1: ( ( rulePrimaryExpression ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6811:1: ( rulePrimaryExpression )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6811:1: ( rulePrimaryExpression )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6812:1: rulePrimaryExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getRightPrimaryExpressionParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_rulePrimaryExpression_in_rule__Multiplication__RightAssignment_1_113635);
            rulePrimaryExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicationAccess().getRightPrimaryExpressionParserRuleCall_1_1_0()); 
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
    // $ANTLR end "rule__Multiplication__RightAssignment_1_1"


    // $ANTLR start "rule__PrimaryExpression__ValueAssignment_1_1"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6821:1: rule__PrimaryExpression__ValueAssignment_1_1 : ( RULE_REAL ) ;
    public final void rule__PrimaryExpression__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6825:1: ( ( RULE_REAL ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6826:1: ( RULE_REAL )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6826:1: ( RULE_REAL )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6827:1: RULE_REAL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExpressionAccess().getValueREALTerminalRuleCall_1_1_0()); 
            }
            match(input,RULE_REAL,FOLLOW_RULE_REAL_in_rule__PrimaryExpression__ValueAssignment_1_113666); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryExpressionAccess().getValueREALTerminalRuleCall_1_1_0()); 
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
    // $ANTLR end "rule__PrimaryExpression__ValueAssignment_1_1"


    // $ANTLR start "rule__PrimaryExpression__ValueAssignment_2_1"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6836:1: rule__PrimaryExpression__ValueAssignment_2_1 : ( RULE_INT ) ;
    public final void rule__PrimaryExpression__ValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6840:1: ( ( RULE_INT ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6841:1: ( RULE_INT )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6841:1: ( RULE_INT )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6842:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExpressionAccess().getValueINTTerminalRuleCall_2_1_0()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__PrimaryExpression__ValueAssignment_2_113697); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryExpressionAccess().getValueINTTerminalRuleCall_2_1_0()); 
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
    // $ANTLR end "rule__PrimaryExpression__ValueAssignment_2_1"


    // $ANTLR start "rule__PrimaryExpression__ValueAssignment_5_1"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6851:1: rule__PrimaryExpression__ValueAssignment_5_1 : ( RULE_STRING ) ;
    public final void rule__PrimaryExpression__ValueAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6855:1: ( ( RULE_STRING ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6856:1: ( RULE_STRING )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6856:1: ( RULE_STRING )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6857:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExpressionAccess().getValueSTRINGTerminalRuleCall_5_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__PrimaryExpression__ValueAssignment_5_113728); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryExpressionAccess().getValueSTRINGTerminalRuleCall_5_1_0()); 
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
    // $ANTLR end "rule__PrimaryExpression__ValueAssignment_5_1"


    // $ANTLR start "rule__ArrayLiteral__ValuesAssignment_2_0"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6866:1: rule__ArrayLiteral__ValuesAssignment_2_0 : ( ruleExpression ) ;
    public final void rule__ArrayLiteral__ValuesAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6870:1: ( ( ruleExpression ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6871:1: ( ruleExpression )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6871:1: ( ruleExpression )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6872:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayLiteralAccess().getValuesExpressionParserRuleCall_2_0_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__ArrayLiteral__ValuesAssignment_2_013759);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayLiteralAccess().getValuesExpressionParserRuleCall_2_0_0()); 
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
    // $ANTLR end "rule__ArrayLiteral__ValuesAssignment_2_0"


    // $ANTLR start "rule__ArrayLiteral__ValuesAssignment_2_1_1"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6881:1: rule__ArrayLiteral__ValuesAssignment_2_1_1 : ( ruleExpression ) ;
    public final void rule__ArrayLiteral__ValuesAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6885:1: ( ( ruleExpression ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6886:1: ( ruleExpression )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6886:1: ( ruleExpression )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6887:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayLiteralAccess().getValuesExpressionParserRuleCall_2_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__ArrayLiteral__ValuesAssignment_2_1_113790);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayLiteralAccess().getValuesExpressionParserRuleCall_2_1_1_0()); 
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
    // $ANTLR end "rule__ArrayLiteral__ValuesAssignment_2_1_1"


    // $ANTLR start "rule__VariableReference__VariableAssignment_0"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6896:1: rule__VariableReference__VariableAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__VariableReference__VariableAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6900:1: ( ( ( RULE_ID ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6901:1: ( ( RULE_ID ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6901:1: ( ( RULE_ID ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6902:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableReferenceAccess().getVariableVariableDeclarationCrossReference_0_0()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6903:1: ( RULE_ID )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6904:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableReferenceAccess().getVariableVariableDeclarationIDTerminalRuleCall_0_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__VariableReference__VariableAssignment_013825); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableReferenceAccess().getVariableVariableDeclarationIDTerminalRuleCall_0_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableReferenceAccess().getVariableVariableDeclarationCrossReference_0_0()); 
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
    // $ANTLR end "rule__VariableReference__VariableAssignment_0"


    // $ANTLR start "rule__VariableReference__DimensionsAssignment_1_1"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6915:1: rule__VariableReference__DimensionsAssignment_1_1 : ( ruleExpression ) ;
    public final void rule__VariableReference__DimensionsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6919:1: ( ( ruleExpression ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6920:1: ( ruleExpression )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6920:1: ( ruleExpression )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6921:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableReferenceAccess().getDimensionsExpressionParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__VariableReference__DimensionsAssignment_1_113860);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableReferenceAccess().getDimensionsExpressionParserRuleCall_1_1_0()); 
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
    // $ANTLR end "rule__VariableReference__DimensionsAssignment_1_1"


    // $ANTLR start "rule__FunctionCall__FunctionAssignment_1"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6930:1: rule__FunctionCall__FunctionAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__FunctionCall__FunctionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6934:1: ( ( ( RULE_ID ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6935:1: ( ( RULE_ID ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6935:1: ( ( RULE_ID ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6936:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getFunctionFunctionDeclarationCrossReference_1_0()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6937:1: ( RULE_ID )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6938:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getFunctionFunctionDeclarationIDTerminalRuleCall_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FunctionCall__FunctionAssignment_113895); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionCallAccess().getFunctionFunctionDeclarationIDTerminalRuleCall_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionCallAccess().getFunctionFunctionDeclarationCrossReference_1_0()); 
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
    // $ANTLR end "rule__FunctionCall__FunctionAssignment_1"


    // $ANTLR start "rule__FunctionCall__ArgsAssignment_3"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6949:1: rule__FunctionCall__ArgsAssignment_3 : ( ruleExpression ) ;
    public final void rule__FunctionCall__ArgsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6953:1: ( ( ruleExpression ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6954:1: ( ruleExpression )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6954:1: ( ruleExpression )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6955:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getArgsExpressionParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__FunctionCall__ArgsAssignment_313930);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionCallAccess().getArgsExpressionParserRuleCall_3_0()); 
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
    // $ANTLR end "rule__FunctionCall__ArgsAssignment_3"


    // $ANTLR start "rule__FunctionCall__ArgsAssignment_4_1"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6964:1: rule__FunctionCall__ArgsAssignment_4_1 : ( ruleExpression ) ;
    public final void rule__FunctionCall__ArgsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6968:1: ( ( ruleExpression ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6969:1: ( ruleExpression )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6969:1: ( ruleExpression )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6970:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getArgsExpressionParserRuleCall_4_1_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__FunctionCall__ArgsAssignment_4_113961);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionCallAccess().getArgsExpressionParserRuleCall_4_1_0()); 
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
    // $ANTLR end "rule__FunctionCall__ArgsAssignment_4_1"


    // $ANTLR start "rule__Return__ValueAssignment_1"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6979:1: rule__Return__ValueAssignment_1 : ( ruleExpression ) ;
    public final void rule__Return__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6983:1: ( ( ruleExpression ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6984:1: ( ruleExpression )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6984:1: ( ruleExpression )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6985:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReturnAccess().getValueExpressionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__Return__ValueAssignment_113992);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReturnAccess().getValueExpressionParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__Return__ValueAssignment_1"


    // $ANTLR start "rule__Include__ImportURIAssignment_2"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6994:1: rule__Include__ImportURIAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Include__ImportURIAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6998:1: ( ( RULE_STRING ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6999:1: ( RULE_STRING )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6999:1: ( RULE_STRING )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:7000:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIncludeAccess().getImportURISTRINGTerminalRuleCall_2_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Include__ImportURIAssignment_214023); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIncludeAccess().getImportURISTRINGTerminalRuleCall_2_0()); 
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
    // $ANTLR end "rule__Include__ImportURIAssignment_2"

    // $ANTLR start synpred33_InternalLeek
    public final void synpred33_InternalLeek_fragment() throws RecognitionException {   
        // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2014:2: ( rule__If__Group_5__0 )
        // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2014:2: rule__If__Group_5__0
        {
        pushFollow(FOLLOW_rule__If__Group_5__0_in_synpred33_InternalLeek4212);
        rule__If__Group_5__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred33_InternalLeek

    // $ANTLR start synpred34_InternalLeek
    public final void synpred34_InternalLeek_fragment() throws RecognitionException {   
        // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2438:2: ( rule__EachIterator__Group_0__0 )
        // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2438:2: rule__EachIterator__Group_0__0
        {
        pushFollow(FOLLOW_rule__EachIterator__Group_0__0_in_synpred34_InternalLeek5036);
        rule__EachIterator__Group_0__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred34_InternalLeek

    // Delegated rules

    public final boolean synpred34_InternalLeek() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred34_InternalLeek_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred33_InternalLeek() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred33_InternalLeek_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA3 dfa3 = new DFA3(this);
    protected DFA10 dfa10 = new DFA10(this);
    static final String DFA3_eotS =
        "\13\uffff";
    static final String DFA3_eofS =
        "\13\uffff";
    static final String DFA3_minS =
        "\1\4\3\uffff\1\23\6\uffff";
    static final String DFA3_maxS =
        "\1\56\3\uffff\1\54\6\uffff";
    static final String DFA3_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\uffff\1\5\1\6\1\7\1\11\1\10\1\4";
    static final String DFA3_specialS =
        "\13\uffff}>";
    static final String[] DFA3_transitionS = {
            "\1\4\13\uffff\1\1\1\10\2\uffff\1\7\3\uffff\1\6\1\5\1\2\23\uffff\1\3",
            "",
            "",
            "",
            "\1\11\1\uffff\1\12\26\uffff\1\11",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA3_eot = DFA.unpackEncodedString(DFA3_eotS);
    static final short[] DFA3_eof = DFA.unpackEncodedString(DFA3_eofS);
    static final char[] DFA3_min = DFA.unpackEncodedStringToUnsignedChars(DFA3_minS);
    static final char[] DFA3_max = DFA.unpackEncodedStringToUnsignedChars(DFA3_maxS);
    static final short[] DFA3_accept = DFA.unpackEncodedString(DFA3_acceptS);
    static final short[] DFA3_special = DFA.unpackEncodedString(DFA3_specialS);
    static final short[][] DFA3_transition;

    static {
        int numStates = DFA3_transitionS.length;
        DFA3_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA3_transition[i] = DFA.unpackEncodedString(DFA3_transitionS[i]);
        }
    }

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = DFA3_eot;
            this.eof = DFA3_eof;
            this.min = DFA3_min;
            this.max = DFA3_max;
            this.accept = DFA3_accept;
            this.special = DFA3_special;
            this.transition = DFA3_transition;
        }
        public String getDescription() {
            return "879:1: rule__Statement__Alternatives : ( ( ( rule__Statement__Group_0__0 ) ) | ( ( rule__Statement__Group_1__0 ) ) | ( ( rule__Statement__Group_2__0 ) ) | ( ( rule__Statement__Group_3__0 ) ) | ( ruleFor ) | ( ruleWhile ) | ( ruleIf ) | ( ( rule__Statement__Group_7__0 ) ) | ( ruleStatementBlock ) );";
        }
    }
    static final String DFA10_eotS =
        "\12\uffff";
    static final String DFA10_eofS =
        "\4\uffff\1\10\5\uffff";
    static final String DFA10_minS =
        "\1\4\3\uffff\1\14\5\uffff";
    static final String DFA10_maxS =
        "\1\54\3\uffff\1\55\5\uffff";
    static final String DFA10_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\uffff\1\6\1\7\1\10\1\5\1\4";
    static final String DFA10_specialS =
        "\12\uffff}>";
    static final String[] DFA10_transitionS = {
            "\1\4\1\2\1\3\1\5\15\uffff\1\1\7\uffff\1\7\16\uffff\1\6",
            "",
            "",
            "",
            "\5\10\4\uffff\1\11\1\10\4\uffff\2\10\1\uffff\1\10\1\uffff\16\10",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA10_eot = DFA.unpackEncodedString(DFA10_eotS);
    static final short[] DFA10_eof = DFA.unpackEncodedString(DFA10_eofS);
    static final char[] DFA10_min = DFA.unpackEncodedStringToUnsignedChars(DFA10_minS);
    static final char[] DFA10_max = DFA.unpackEncodedStringToUnsignedChars(DFA10_maxS);
    static final short[] DFA10_accept = DFA.unpackEncodedString(DFA10_acceptS);
    static final short[] DFA10_special = DFA.unpackEncodedString(DFA10_specialS);
    static final short[][] DFA10_transition;

    static {
        int numStates = DFA10_transitionS.length;
        DFA10_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA10_transition[i] = DFA.unpackEncodedString(DFA10_transitionS[i]);
        }
    }

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = DFA10_eot;
            this.eof = DFA10_eof;
            this.min = DFA10_min;
            this.max = DFA10_max;
            this.accept = DFA10_accept;
            this.special = DFA10_special;
            this.transition = DFA10_transition;
        }
        public String getDescription() {
            return "1119:1: rule__PrimaryExpression__Alternatives : ( ( ( rule__PrimaryExpression__Group_0__0 ) ) | ( ( rule__PrimaryExpression__Group_1__0 ) ) | ( ( rule__PrimaryExpression__Group_2__0 ) ) | ( ruleFunctionCall ) | ( ruleVariableReference ) | ( ( rule__PrimaryExpression__Group_5__0 ) ) | ( ruleArrayLiteral ) | ( ruleFunctionDeclaration ) );";
        }
    }
 

    public static final BitSet FOLLOW_ruleScript_in_entryRuleScript67 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleScript74 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Script__StatementsAssignment_in_ruleScript100 = new BitSet(new long[]{0x0000C000A7130012L});
    public static final BitSet FOLLOW_ruleToplevelStatement_in_entryRuleToplevelStatement128 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleToplevelStatement135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ToplevelStatement__Alternatives_in_ruleToplevelStatement161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_entryRuleStatement188 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatement195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Alternatives_in_ruleStatement221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatementBlock_in_entryRuleStatementBlock248 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatementBlock255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StatementBlock__Group__0_in_ruleStatementBlock281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAffectation_in_entryRuleAffectation308 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAffectation315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Affectation__Group__0_in_ruleAffectation341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIf_in_entryRuleIf368 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIf375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__Group__0_in_ruleIf401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhile_in_entryRuleWhile428 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWhile435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__While__Group__0_in_ruleWhile461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFor_in_entryRuleFor488 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFor495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__For__Group__0_in_ruleFor521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForIterator_in_entryRuleForIterator548 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleForIterator555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ForIterator__Alternatives_in_ruleForIterator581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEachIterator_in_entryRuleEachIterator608 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEachIterator615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EachIterator__Group__0_in_ruleEachIterator641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableIterator_in_entryRuleVariableIterator668 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableIterator675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableIterator__Group__0_in_ruleVariableIterator701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionDeclaration_in_entryRuleFunctionDeclaration728 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionDeclaration735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__Group__0_in_ruleFunctionDeclaration761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterDeclaration_in_entryRuleParameterDeclaration788 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameterDeclaration795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterDeclaration__Group__0_in_ruleParameterDeclaration821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocalDeclaration_in_entryRuleLocalDeclaration848 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLocalDeclaration855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LocalDeclaration__Group__0_in_ruleLocalDeclaration881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGlobalDeclaration_in_entryRuleGlobalDeclaration908 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGlobalDeclaration915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GlobalDeclaration__Group__0_in_ruleGlobalDeclaration941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_entryRuleVariableDeclaration968 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableDeclaration975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group__0_in_ruleVariableDeclaration1001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression1028 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression1035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparison_in_ruleExpression1061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparison_in_entryRuleComparison1087 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComparison1094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group__0_in_ruleComparison1120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOr_in_entryRuleOr1147 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOr1154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Or__Group__0_in_ruleOr1180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnd_in_entryRuleAnd1207 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnd1214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__And__Group__0_in_ruleAnd1240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddition_in_entryRuleAddition1267 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAddition1274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group__0_in_ruleAddition1300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplication_in_entryRuleMultiplication1327 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiplication1334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group__0_in_ruleMultiplication1360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression1387 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimaryExpression1394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Alternatives_in_rulePrimaryExpression1420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayLiteral_in_entryRuleArrayLiteral1447 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArrayLiteral1454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayLiteral__Group__0_in_ruleArrayLiteral1480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableReference_in_entryRuleVariableReference1507 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableReference1514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableReference__Group__0_in_ruleVariableReference1540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionCall_in_entryRuleFunctionCall1567 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionCall1574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionCall__Group__0_in_ruleFunctionCall1600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReturn_in_entryRuleReturn1627 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReturn1634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Return__Group__0_in_ruleReturn1660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInclude_in_entryRuleInclude1687 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInclude1694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Include__Group__0_in_ruleInclude1720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ToplevelStatement__Group_0__0_in_rule__ToplevelStatement__Alternatives1756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ToplevelStatement__Group_1__0_in_rule__ToplevelStatement__Alternatives1774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionDeclaration_in_rule__ToplevelStatement__Alternatives1792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_rule__ToplevelStatement__Alternatives1809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_0__0_in_rule__Statement__Alternatives1841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_1__0_in_rule__Statement__Alternatives1859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_2__0_in_rule__Statement__Alternatives1877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_3__0_in_rule__Statement__Alternatives1895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFor_in_rule__Statement__Alternatives1913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhile_in_rule__Statement__Alternatives1930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIf_in_rule__Statement__Alternatives1947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_7__0_in_rule__Statement__Alternatives1964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatementBlock_in_rule__Statement__Alternatives1982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEachIterator_in_rule__ForIterator__Alternatives2014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableIterator_in_rule__ForIterator__Alternatives2031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1_0_0__0_in_rule__Comparison__Alternatives_1_02063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1_0_1__0_in_rule__Comparison__Alternatives_1_02081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1_0_2__0_in_rule__Comparison__Alternatives_1_02099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1_0_3__0_in_rule__Comparison__Alternatives_1_02117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1_0_4__0_in_rule__Comparison__Alternatives_1_02135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1_0_5__0_in_rule__Comparison__Alternatives_1_02153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1_0_6__0_in_rule__Comparison__Alternatives_1_02171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1_0_7__0_in_rule__Comparison__Alternatives_1_02189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Or__Alternatives_1_0_12223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Or__Alternatives_1_0_12243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__And__Alternatives_1_0_12278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__And__Alternatives_1_0_12298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1_0_0__0_in_rule__Addition__Alternatives_1_02332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1_0_1__0_in_rule__Addition__Alternatives_1_02350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1_0_0__0_in_rule__Multiplication__Alternatives_1_02383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1_0_1__0_in_rule__Multiplication__Alternatives_1_02401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_0__0_in_rule__PrimaryExpression__Alternatives2434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_1__0_in_rule__PrimaryExpression__Alternatives2452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_2__0_in_rule__PrimaryExpression__Alternatives2470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionCall_in_rule__PrimaryExpression__Alternatives2488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableReference_in_rule__PrimaryExpression__Alternatives2505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_5__0_in_rule__PrimaryExpression__Alternatives2522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayLiteral_in_rule__PrimaryExpression__Alternatives2540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionDeclaration_in_rule__PrimaryExpression__Alternatives2557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ToplevelStatement__Group_0__0__Impl_in_rule__ToplevelStatement__Group_0__02587 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__ToplevelStatement__Group_0__1_in_rule__ToplevelStatement__Group_0__02590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInclude_in_rule__ToplevelStatement__Group_0__0__Impl2617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ToplevelStatement__Group_0__1__Impl_in_rule__ToplevelStatement__Group_0__12646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__ToplevelStatement__Group_0__1__Impl2674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ToplevelStatement__Group_1__0__Impl_in_rule__ToplevelStatement__Group_1__02709 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__ToplevelStatement__Group_1__1_in_rule__ToplevelStatement__Group_1__02712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGlobalDeclaration_in_rule__ToplevelStatement__Group_1__0__Impl2739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ToplevelStatement__Group_1__1__Impl_in_rule__ToplevelStatement__Group_1__12768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__ToplevelStatement__Group_1__1__Impl2796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_0__0__Impl_in_rule__Statement__Group_0__02831 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Statement__Group_0__1_in_rule__Statement__Group_0__02834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_0__1__Impl_in_rule__Statement__Group_0__12892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Statement__Group_0__1__Impl2920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_1__0__Impl_in_rule__Statement__Group_1__02955 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Statement__Group_1__1_in_rule__Statement__Group_1__02958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocalDeclaration_in_rule__Statement__Group_1__0__Impl2985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_1__1__Impl_in_rule__Statement__Group_1__13014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Statement__Group_1__1__Impl3042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_2__0__Impl_in_rule__Statement__Group_2__03077 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Statement__Group_2__1_in_rule__Statement__Group_2__03080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReturn_in_rule__Statement__Group_2__0__Impl3107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_2__1__Impl_in_rule__Statement__Group_2__13136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Statement__Group_2__1__Impl3164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_3__0__Impl_in_rule__Statement__Group_3__03199 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Statement__Group_3__1_in_rule__Statement__Group_3__03202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionCall_in_rule__Statement__Group_3__0__Impl3229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_3__1__Impl_in_rule__Statement__Group_3__13258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Statement__Group_3__1__Impl3286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_7__0__Impl_in_rule__Statement__Group_7__03321 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Statement__Group_7__1_in_rule__Statement__Group_7__03324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAffectation_in_rule__Statement__Group_7__0__Impl3351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_7__1__Impl_in_rule__Statement__Group_7__13380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Statement__Group_7__1__Impl3408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StatementBlock__Group__0__Impl_in_rule__StatementBlock__Group__03443 = new BitSet(new long[]{0x0000C000A7170010L});
    public static final BitSet FOLLOW_rule__StatementBlock__Group__1_in_rule__StatementBlock__Group__03446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__StatementBlock__Group__0__Impl3474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StatementBlock__Group__1__Impl_in_rule__StatementBlock__Group__13505 = new BitSet(new long[]{0x0000C000A7170010L});
    public static final BitSet FOLLOW_rule__StatementBlock__Group__2_in_rule__StatementBlock__Group__13508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StatementBlock__Group__2__Impl_in_rule__StatementBlock__Group__23566 = new BitSet(new long[]{0x0000C000A7170010L});
    public static final BitSet FOLLOW_rule__StatementBlock__Group__3_in_rule__StatementBlock__Group__23569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StatementBlock__StatementsAssignment_2_in_rule__StatementBlock__Group__2__Impl3596 = new BitSet(new long[]{0x0000C000A7130012L});
    public static final BitSet FOLLOW_rule__StatementBlock__Group__3__Impl_in_rule__StatementBlock__Group__33627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__StatementBlock__Group__3__Impl3655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Affectation__Group__0__Impl_in_rule__Affectation__Group__03694 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Affectation__Group__1_in_rule__Affectation__Group__03697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Affectation__VariableAssignment_0_in_rule__Affectation__Group__0__Impl3724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Affectation__Group__1__Impl_in_rule__Affectation__Group__13754 = new BitSet(new long[]{0x00001000202000F0L});
    public static final BitSet FOLLOW_rule__Affectation__Group__2_in_rule__Affectation__Group__13757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Affectation__Group__1__Impl3785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Affectation__Group__2__Impl_in_rule__Affectation__Group__23816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Affectation__ValueAssignment_2_in_rule__Affectation__Group__2__Impl3843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__Group__0__Impl_in_rule__If__Group__03879 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__If__Group__1_in_rule__If__Group__03882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__If__Group__0__Impl3910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__Group__1__Impl_in_rule__If__Group__13941 = new BitSet(new long[]{0x00001000202000F0L});
    public static final BitSet FOLLOW_rule__If__Group__2_in_rule__If__Group__13944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__If__Group__1__Impl3972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__Group__2__Impl_in_rule__If__Group__24003 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__If__Group__3_in_rule__If__Group__24006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__ConditionAssignment_2_in_rule__If__Group__2__Impl4033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__Group__3__Impl_in_rule__If__Group__34063 = new BitSet(new long[]{0x0000C000A7130010L});
    public static final BitSet FOLLOW_rule__If__Group__4_in_rule__If__Group__34066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__If__Group__3__Impl4094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__Group__4__Impl_in_rule__If__Group__44125 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__If__Group__5_in_rule__If__Group__44128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__ThenAssignment_4_in_rule__If__Group__4__Impl4155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__Group__5__Impl_in_rule__If__Group__54185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__Group_5__0_in_rule__If__Group__5__Impl4212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__Group_5__0__Impl_in_rule__If__Group_5__04255 = new BitSet(new long[]{0x0000C000A7130010L});
    public static final BitSet FOLLOW_rule__If__Group_5__1_in_rule__If__Group_5__04258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__If__Group_5__0__Impl4287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__Group_5__1__Impl_in_rule__If__Group_5__14319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__ElseAssignment_5_1_in_rule__If__Group_5__1__Impl4346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__While__Group__0__Impl_in_rule__While__Group__04380 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__While__Group__1_in_rule__While__Group__04383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__While__Group__0__Impl4411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__While__Group__1__Impl_in_rule__While__Group__14442 = new BitSet(new long[]{0x00001000202000F0L});
    public static final BitSet FOLLOW_rule__While__Group__2_in_rule__While__Group__14445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__While__Group__1__Impl4473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__While__Group__2__Impl_in_rule__While__Group__24504 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__While__Group__3_in_rule__While__Group__24507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__While__ConditionAssignment_2_in_rule__While__Group__2__Impl4534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__While__Group__3__Impl_in_rule__While__Group__34564 = new BitSet(new long[]{0x0000C000A7130010L});
    public static final BitSet FOLLOW_rule__While__Group__4_in_rule__While__Group__34567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__While__Group__3__Impl4595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__While__Group__4__Impl_in_rule__While__Group__44626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__While__StatementAssignment_4_in_rule__While__Group__4__Impl4653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__For__Group__0__Impl_in_rule__For__Group__04693 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__For__Group__1_in_rule__For__Group__04696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__For__Group__0__Impl4724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__For__Group__1__Impl_in_rule__For__Group__14755 = new BitSet(new long[]{0x0000000004000010L});
    public static final BitSet FOLLOW_rule__For__Group__2_in_rule__For__Group__14758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__For__Group__1__Impl4786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__For__Group__2__Impl_in_rule__For__Group__24817 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__For__Group__3_in_rule__For__Group__24820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__For__IteratorAssignment_2_in_rule__For__Group__2__Impl4847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__For__Group__3__Impl_in_rule__For__Group__34877 = new BitSet(new long[]{0x0000C000A7130010L});
    public static final BitSet FOLLOW_rule__For__Group__4_in_rule__For__Group__34880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__For__Group__3__Impl4908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__For__Group__4__Impl_in_rule__For__Group__44939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__For__StatementAssignment_4_in_rule__For__Group__4__Impl4966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EachIterator__Group__0__Impl_in_rule__EachIterator__Group__05006 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__EachIterator__Group__1_in_rule__EachIterator__Group__05009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EachIterator__Group_0__0_in_rule__EachIterator__Group__0__Impl5036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EachIterator__Group__1__Impl_in_rule__EachIterator__Group__15067 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EachIterator__Group__2_in_rule__EachIterator__Group__15070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__EachIterator__Group__1__Impl5098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EachIterator__Group__2__Impl_in_rule__EachIterator__Group__25129 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__EachIterator__Group__3_in_rule__EachIterator__Group__25132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EachIterator__ValueAssignment_2_in_rule__EachIterator__Group__2__Impl5159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EachIterator__Group__3__Impl_in_rule__EachIterator__Group__35189 = new BitSet(new long[]{0x00001000202000F0L});
    public static final BitSet FOLLOW_rule__EachIterator__Group__4_in_rule__EachIterator__Group__35192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__EachIterator__Group__3__Impl5220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EachIterator__Group__4__Impl_in_rule__EachIterator__Group__45251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EachIterator__ArrayAssignment_4_in_rule__EachIterator__Group__4__Impl5278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EachIterator__Group_0__0__Impl_in_rule__EachIterator__Group_0__05318 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EachIterator__Group_0__1_in_rule__EachIterator__Group_0__05321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__EachIterator__Group_0__0__Impl5350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EachIterator__Group_0__1__Impl_in_rule__EachIterator__Group_0__15382 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__EachIterator__Group_0__2_in_rule__EachIterator__Group_0__15385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EachIterator__KeyAssignment_0_1_in_rule__EachIterator__Group_0__1__Impl5412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EachIterator__Group_0__2__Impl_in_rule__EachIterator__Group_0__25442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__EachIterator__Group_0__2__Impl5470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableIterator__Group__0__Impl_in_rule__VariableIterator__Group__05507 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__VariableIterator__Group__1_in_rule__VariableIterator__Group__05510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableIterator__InitializationAssignment_0_in_rule__VariableIterator__Group__0__Impl5537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableIterator__Group__1__Impl_in_rule__VariableIterator__Group__15567 = new BitSet(new long[]{0x00001000202000F0L});
    public static final BitSet FOLLOW_rule__VariableIterator__Group__2_in_rule__VariableIterator__Group__15570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__VariableIterator__Group__1__Impl5598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableIterator__Group__2__Impl_in_rule__VariableIterator__Group__25629 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__VariableIterator__Group__3_in_rule__VariableIterator__Group__25632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableIterator__ConditionAssignment_2_in_rule__VariableIterator__Group__2__Impl5659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableIterator__Group__3__Impl_in_rule__VariableIterator__Group__35689 = new BitSet(new long[]{0x00001000202000F0L});
    public static final BitSet FOLLOW_rule__VariableIterator__Group__4_in_rule__VariableIterator__Group__35692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__VariableIterator__Group__3__Impl5720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableIterator__Group__4__Impl_in_rule__VariableIterator__Group__45751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableIterator__IncrementAssignment_4_in_rule__VariableIterator__Group__4__Impl5778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__Group__0__Impl_in_rule__FunctionDeclaration__Group__05818 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__Group__1_in_rule__FunctionDeclaration__Group__05821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__FunctionDeclaration__Group__0__Impl5849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__Group__1__Impl_in_rule__FunctionDeclaration__Group__15880 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__Group__2_in_rule__FunctionDeclaration__Group__15883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__NameAssignment_1_in_rule__FunctionDeclaration__Group__1__Impl5910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__Group__2__Impl_in_rule__FunctionDeclaration__Group__25940 = new BitSet(new long[]{0x0001000000400000L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__Group__3_in_rule__FunctionDeclaration__Group__25943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__FunctionDeclaration__Group__2__Impl5971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__Group__3__Impl_in_rule__FunctionDeclaration__Group__36002 = new BitSet(new long[]{0x0001000000400000L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__Group__4_in_rule__FunctionDeclaration__Group__36005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__Group_3__0_in_rule__FunctionDeclaration__Group__3__Impl6032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__Group__4__Impl_in_rule__FunctionDeclaration__Group__46063 = new BitSet(new long[]{0x0000C000A7130010L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__Group__5_in_rule__FunctionDeclaration__Group__46066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__FunctionDeclaration__Group__4__Impl6094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__Group__5__Impl_in_rule__FunctionDeclaration__Group__56125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__BodyAssignment_5_in_rule__FunctionDeclaration__Group__5__Impl6152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__Group_3__0__Impl_in_rule__FunctionDeclaration__Group_3__06194 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__Group_3__1_in_rule__FunctionDeclaration__Group_3__06197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__ParameterAssignment_3_0_in_rule__FunctionDeclaration__Group_3__0__Impl6224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__Group_3__1__Impl_in_rule__FunctionDeclaration__Group_3__16254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__Group_3_1__0_in_rule__FunctionDeclaration__Group_3__1__Impl6281 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__Group_3_1__0__Impl_in_rule__FunctionDeclaration__Group_3_1__06316 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__Group_3_1__1_in_rule__FunctionDeclaration__Group_3_1__06319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__FunctionDeclaration__Group_3_1__0__Impl6347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__Group_3_1__1__Impl_in_rule__FunctionDeclaration__Group_3_1__16378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__ParameterAssignment_3_1_1_in_rule__FunctionDeclaration__Group_3_1__1__Impl6405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterDeclaration__Group__0__Impl_in_rule__ParameterDeclaration__Group__06439 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ParameterDeclaration__Group__1_in_rule__ParameterDeclaration__Group__06442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterDeclaration__ByAdressAssignment_0_in_rule__ParameterDeclaration__Group__0__Impl6469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterDeclaration__Group__1__Impl_in_rule__ParameterDeclaration__Group__16499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterDeclaration__NameAssignment_1_in_rule__ParameterDeclaration__Group__1__Impl6526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LocalDeclaration__Group__0__Impl_in_rule__LocalDeclaration__Group__06560 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__LocalDeclaration__Group__1_in_rule__LocalDeclaration__Group__06563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__LocalDeclaration__Group__0__Impl6591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LocalDeclaration__Group__1__Impl_in_rule__LocalDeclaration__Group__16622 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__LocalDeclaration__Group__2_in_rule__LocalDeclaration__Group__16625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LocalDeclaration__VariablesAssignment_1_in_rule__LocalDeclaration__Group__1__Impl6652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LocalDeclaration__Group__2__Impl_in_rule__LocalDeclaration__Group__26682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LocalDeclaration__Group_2__0_in_rule__LocalDeclaration__Group__2__Impl6709 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_rule__LocalDeclaration__Group_2__0__Impl_in_rule__LocalDeclaration__Group_2__06746 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__LocalDeclaration__Group_2__1_in_rule__LocalDeclaration__Group_2__06749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__LocalDeclaration__Group_2__0__Impl6777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LocalDeclaration__Group_2__1__Impl_in_rule__LocalDeclaration__Group_2__16808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LocalDeclaration__VariablesAssignment_2_1_in_rule__LocalDeclaration__Group_2__1__Impl6835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GlobalDeclaration__Group__0__Impl_in_rule__GlobalDeclaration__Group__06869 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__GlobalDeclaration__Group__1_in_rule__GlobalDeclaration__Group__06872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__GlobalDeclaration__Group__0__Impl6900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GlobalDeclaration__Group__1__Impl_in_rule__GlobalDeclaration__Group__16931 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__GlobalDeclaration__Group__2_in_rule__GlobalDeclaration__Group__16934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GlobalDeclaration__VariablesAssignment_1_in_rule__GlobalDeclaration__Group__1__Impl6961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GlobalDeclaration__Group__2__Impl_in_rule__GlobalDeclaration__Group__26991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GlobalDeclaration__Group_2__0_in_rule__GlobalDeclaration__Group__2__Impl7018 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_rule__GlobalDeclaration__Group_2__0__Impl_in_rule__GlobalDeclaration__Group_2__07055 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__GlobalDeclaration__Group_2__1_in_rule__GlobalDeclaration__Group_2__07058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__GlobalDeclaration__Group_2__0__Impl7086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GlobalDeclaration__Group_2__1__Impl_in_rule__GlobalDeclaration__Group_2__17117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GlobalDeclaration__VariablesAssignment_2_1_in_rule__GlobalDeclaration__Group_2__1__Impl7144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group__0__Impl_in_rule__VariableDeclaration__Group__07178 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group__1_in_rule__VariableDeclaration__Group__07181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__NameAssignment_0_in_rule__VariableDeclaration__Group__0__Impl7208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group__1__Impl_in_rule__VariableDeclaration__Group__17238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group_1__0_in_rule__VariableDeclaration__Group__1__Impl7265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group_1__0__Impl_in_rule__VariableDeclaration__Group_1__07300 = new BitSet(new long[]{0x00001000202000F0L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group_1__1_in_rule__VariableDeclaration__Group_1__07303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__VariableDeclaration__Group_1__0__Impl7331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group_1__1__Impl_in_rule__VariableDeclaration__Group_1__17362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__ValueAssignment_1_1_in_rule__VariableDeclaration__Group_1__1__Impl7389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group__0__Impl_in_rule__Comparison__Group__07423 = new BitSet(new long[]{0x000000FF00000000L});
    public static final BitSet FOLLOW_rule__Comparison__Group__1_in_rule__Comparison__Group__07426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOr_in_rule__Comparison__Group__0__Impl7453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group__1__Impl_in_rule__Comparison__Group__17482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1__0_in_rule__Comparison__Group__1__Impl7509 = new BitSet(new long[]{0x000000FF00000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1__0__Impl_in_rule__Comparison__Group_1__07544 = new BitSet(new long[]{0x00001000202000F0L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1__1_in_rule__Comparison__Group_1__07547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Alternatives_1_0_in_rule__Comparison__Group_1__0__Impl7574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1__1__Impl_in_rule__Comparison__Group_1__17604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__RightAssignment_1_1_in_rule__Comparison__Group_1__1__Impl7631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1_0_0__0__Impl_in_rule__Comparison__Group_1_0_0__07665 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1_0_0__1_in_rule__Comparison__Group_1_0_0__07668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1_0_0__1__Impl_in_rule__Comparison__Group_1_0_0__17726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Comparison__Group_1_0_0__1__Impl7754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1_0_1__0__Impl_in_rule__Comparison__Group_1_0_1__07789 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1_0_1__1_in_rule__Comparison__Group_1_0_1__07792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1_0_1__1__Impl_in_rule__Comparison__Group_1_0_1__17850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Comparison__Group_1_0_1__1__Impl7878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1_0_2__0__Impl_in_rule__Comparison__Group_1_0_2__07913 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1_0_2__1_in_rule__Comparison__Group_1_0_2__07916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1_0_2__1__Impl_in_rule__Comparison__Group_1_0_2__17974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Comparison__Group_1_0_2__1__Impl8002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1_0_3__0__Impl_in_rule__Comparison__Group_1_0_3__08037 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1_0_3__1_in_rule__Comparison__Group_1_0_3__08040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1_0_3__1__Impl_in_rule__Comparison__Group_1_0_3__18098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Comparison__Group_1_0_3__1__Impl8126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1_0_4__0__Impl_in_rule__Comparison__Group_1_0_4__08161 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1_0_4__1_in_rule__Comparison__Group_1_0_4__08164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1_0_4__1__Impl_in_rule__Comparison__Group_1_0_4__18222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Comparison__Group_1_0_4__1__Impl8250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1_0_5__0__Impl_in_rule__Comparison__Group_1_0_5__08285 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1_0_5__1_in_rule__Comparison__Group_1_0_5__08288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1_0_5__1__Impl_in_rule__Comparison__Group_1_0_5__18346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Comparison__Group_1_0_5__1__Impl8374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1_0_6__0__Impl_in_rule__Comparison__Group_1_0_6__08409 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1_0_6__1_in_rule__Comparison__Group_1_0_6__08412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1_0_6__1__Impl_in_rule__Comparison__Group_1_0_6__18470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Comparison__Group_1_0_6__1__Impl8498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1_0_7__0__Impl_in_rule__Comparison__Group_1_0_7__08533 = new BitSet(new long[]{0x000000FF00000000L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1_0_7__1_in_rule__Comparison__Group_1_0_7__08536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1_0_7__1__Impl_in_rule__Comparison__Group_1_0_7__18594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Comparison__Group_1_0_7__1__Impl8622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Or__Group__0__Impl_in_rule__Or__Group__08657 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_rule__Or__Group__1_in_rule__Or__Group__08660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnd_in_rule__Or__Group__0__Impl8687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Or__Group__1__Impl_in_rule__Or__Group__18716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Or__Group_1__0_in_rule__Or__Group__1__Impl8743 = new BitSet(new long[]{0x0000000000003002L});
    public static final BitSet FOLLOW_rule__Or__Group_1__0__Impl_in_rule__Or__Group_1__08778 = new BitSet(new long[]{0x00001000202000F0L});
    public static final BitSet FOLLOW_rule__Or__Group_1__1_in_rule__Or__Group_1__08781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Or__Group_1_0__0_in_rule__Or__Group_1__0__Impl8808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Or__Group_1__1__Impl_in_rule__Or__Group_1__18838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Or__RightAssignment_1_1_in_rule__Or__Group_1__1__Impl8865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Or__Group_1_0__0__Impl_in_rule__Or__Group_1_0__08899 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_rule__Or__Group_1_0__1_in_rule__Or__Group_1_0__08902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Or__Group_1_0__1__Impl_in_rule__Or__Group_1_0__18960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Or__Alternatives_1_0_1_in_rule__Or__Group_1_0__1__Impl8987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__And__Group__0__Impl_in_rule__And__Group__09021 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_rule__And__Group__1_in_rule__And__Group__09024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddition_in_rule__And__Group__0__Impl9051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__And__Group__1__Impl_in_rule__And__Group__19080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__And__Group_1__0_in_rule__And__Group__1__Impl9107 = new BitSet(new long[]{0x000000000000C002L});
    public static final BitSet FOLLOW_rule__And__Group_1__0__Impl_in_rule__And__Group_1__09142 = new BitSet(new long[]{0x00001000202000F0L});
    public static final BitSet FOLLOW_rule__And__Group_1__1_in_rule__And__Group_1__09145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__And__Group_1_0__0_in_rule__And__Group_1__0__Impl9172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__And__Group_1__1__Impl_in_rule__And__Group_1__19202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__And__RightAssignment_1_1_in_rule__And__Group_1__1__Impl9229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__And__Group_1_0__0__Impl_in_rule__And__Group_1_0__09263 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_rule__And__Group_1_0__1_in_rule__And__Group_1_0__09266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__And__Group_1_0__1__Impl_in_rule__And__Group_1_0__19324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__And__Alternatives_1_0_1_in_rule__And__Group_1_0__1__Impl9351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group__0__Impl_in_rule__Addition__Group__09385 = new BitSet(new long[]{0x0000030000000000L});
    public static final BitSet FOLLOW_rule__Addition__Group__1_in_rule__Addition__Group__09388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplication_in_rule__Addition__Group__0__Impl9415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group__1__Impl_in_rule__Addition__Group__19444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1__0_in_rule__Addition__Group__1__Impl9471 = new BitSet(new long[]{0x0000030000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1__0__Impl_in_rule__Addition__Group_1__09506 = new BitSet(new long[]{0x00001000202000F0L});
    public static final BitSet FOLLOW_rule__Addition__Group_1__1_in_rule__Addition__Group_1__09509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Alternatives_1_0_in_rule__Addition__Group_1__0__Impl9536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1__1__Impl_in_rule__Addition__Group_1__19566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__RightAssignment_1_1_in_rule__Addition__Group_1__1__Impl9593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1_0_0__0__Impl_in_rule__Addition__Group_1_0_0__09627 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__Addition__Group_1_0_0__1_in_rule__Addition__Group_1_0_0__09630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1_0_0__1__Impl_in_rule__Addition__Group_1_0_0__19688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Addition__Group_1_0_0__1__Impl9716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1_0_1__0__Impl_in_rule__Addition__Group_1_0_1__09751 = new BitSet(new long[]{0x0000030000000000L});
    public static final BitSet FOLLOW_rule__Addition__Group_1_0_1__1_in_rule__Addition__Group_1_0_1__09754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1_0_1__1__Impl_in_rule__Addition__Group_1_0_1__19812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__Addition__Group_1_0_1__1__Impl9840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group__0__Impl_in_rule__Multiplication__Group__09875 = new BitSet(new long[]{0x00000C0000000000L});
    public static final BitSet FOLLOW_rule__Multiplication__Group__1_in_rule__Multiplication__Group__09878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_rule__Multiplication__Group__0__Impl9905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group__1__Impl_in_rule__Multiplication__Group__19934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1__0_in_rule__Multiplication__Group__1__Impl9961 = new BitSet(new long[]{0x00000C0000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1__0__Impl_in_rule__Multiplication__Group_1__09996 = new BitSet(new long[]{0x00001000202000F0L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1__1_in_rule__Multiplication__Group_1__09999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Alternatives_1_0_in_rule__Multiplication__Group_1__0__Impl10026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1__1__Impl_in_rule__Multiplication__Group_1__110056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__RightAssignment_1_1_in_rule__Multiplication__Group_1__1__Impl10083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1_0_0__0__Impl_in_rule__Multiplication__Group_1_0_0__010117 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1_0_0__1_in_rule__Multiplication__Group_1_0_0__010120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1_0_0__1__Impl_in_rule__Multiplication__Group_1_0_0__110178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__Multiplication__Group_1_0_0__1__Impl10206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1_0_1__0__Impl_in_rule__Multiplication__Group_1_0_1__010241 = new BitSet(new long[]{0x00000C0000000000L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1_0_1__1_in_rule__Multiplication__Group_1_0_1__010244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1_0_1__1__Impl_in_rule__Multiplication__Group_1_0_1__110302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__Multiplication__Group_1_0_1__1__Impl10330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_0__0__Impl_in_rule__PrimaryExpression__Group_0__010365 = new BitSet(new long[]{0x00001000202000F0L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_0__1_in_rule__PrimaryExpression__Group_0__010368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__PrimaryExpression__Group_0__0__Impl10396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_0__1__Impl_in_rule__PrimaryExpression__Group_0__110427 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_0__2_in_rule__PrimaryExpression__Group_0__110430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__PrimaryExpression__Group_0__1__Impl10457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_0__2__Impl_in_rule__PrimaryExpression__Group_0__210486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__PrimaryExpression__Group_0__2__Impl10514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_1__0__Impl_in_rule__PrimaryExpression__Group_1__010551 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_1__1_in_rule__PrimaryExpression__Group_1__010554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_1__1__Impl_in_rule__PrimaryExpression__Group_1__110612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__ValueAssignment_1_1_in_rule__PrimaryExpression__Group_1__1__Impl10639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_2__0__Impl_in_rule__PrimaryExpression__Group_2__010673 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_2__1_in_rule__PrimaryExpression__Group_2__010676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_2__1__Impl_in_rule__PrimaryExpression__Group_2__110734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__ValueAssignment_2_1_in_rule__PrimaryExpression__Group_2__1__Impl10761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_5__0__Impl_in_rule__PrimaryExpression__Group_5__010795 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_5__1_in_rule__PrimaryExpression__Group_5__010798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_5__1__Impl_in_rule__PrimaryExpression__Group_5__110856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__ValueAssignment_5_1_in_rule__PrimaryExpression__Group_5__1__Impl10883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayLiteral__Group__0__Impl_in_rule__ArrayLiteral__Group__010917 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_rule__ArrayLiteral__Group__1_in_rule__ArrayLiteral__Group__010920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayLiteral__Group__1__Impl_in_rule__ArrayLiteral__Group__110978 = new BitSet(new long[]{0x00003000202000F0L});
    public static final BitSet FOLLOW_rule__ArrayLiteral__Group__2_in_rule__ArrayLiteral__Group__110981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__ArrayLiteral__Group__1__Impl11009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayLiteral__Group__2__Impl_in_rule__ArrayLiteral__Group__211040 = new BitSet(new long[]{0x00003000202000F0L});
    public static final BitSet FOLLOW_rule__ArrayLiteral__Group__3_in_rule__ArrayLiteral__Group__211043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayLiteral__Group_2__0_in_rule__ArrayLiteral__Group__2__Impl11070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayLiteral__Group__3__Impl_in_rule__ArrayLiteral__Group__311101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__ArrayLiteral__Group__3__Impl11129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayLiteral__Group_2__0__Impl_in_rule__ArrayLiteral__Group_2__011168 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__ArrayLiteral__Group_2__1_in_rule__ArrayLiteral__Group_2__011171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayLiteral__ValuesAssignment_2_0_in_rule__ArrayLiteral__Group_2__0__Impl11198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayLiteral__Group_2__1__Impl_in_rule__ArrayLiteral__Group_2__111228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayLiteral__Group_2_1__0_in_rule__ArrayLiteral__Group_2__1__Impl11255 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_rule__ArrayLiteral__Group_2_1__0__Impl_in_rule__ArrayLiteral__Group_2_1__011290 = new BitSet(new long[]{0x00001000202000F0L});
    public static final BitSet FOLLOW_rule__ArrayLiteral__Group_2_1__1_in_rule__ArrayLiteral__Group_2_1__011293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__ArrayLiteral__Group_2_1__0__Impl11321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayLiteral__Group_2_1__1__Impl_in_rule__ArrayLiteral__Group_2_1__111352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayLiteral__ValuesAssignment_2_1_1_in_rule__ArrayLiteral__Group_2_1__1__Impl11379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableReference__Group__0__Impl_in_rule__VariableReference__Group__011413 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_rule__VariableReference__Group__1_in_rule__VariableReference__Group__011416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableReference__VariableAssignment_0_in_rule__VariableReference__Group__0__Impl11443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableReference__Group__1__Impl_in_rule__VariableReference__Group__111473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableReference__Group_1__0_in_rule__VariableReference__Group__1__Impl11500 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_rule__VariableReference__Group_1__0__Impl_in_rule__VariableReference__Group_1__011535 = new BitSet(new long[]{0x00001000202000F0L});
    public static final BitSet FOLLOW_rule__VariableReference__Group_1__1_in_rule__VariableReference__Group_1__011538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__VariableReference__Group_1__0__Impl11566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableReference__Group_1__1__Impl_in_rule__VariableReference__Group_1__111597 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_rule__VariableReference__Group_1__2_in_rule__VariableReference__Group_1__111600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableReference__DimensionsAssignment_1_1_in_rule__VariableReference__Group_1__1__Impl11627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableReference__Group_1__2__Impl_in_rule__VariableReference__Group_1__211657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__VariableReference__Group_1__2__Impl11685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionCall__Group__0__Impl_in_rule__FunctionCall__Group__011722 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__FunctionCall__Group__1_in_rule__FunctionCall__Group__011725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionCall__Group__1__Impl_in_rule__FunctionCall__Group__111783 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__FunctionCall__Group__2_in_rule__FunctionCall__Group__111786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionCall__FunctionAssignment_1_in_rule__FunctionCall__Group__1__Impl11813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionCall__Group__2__Impl_in_rule__FunctionCall__Group__211843 = new BitSet(new long[]{0x00001000202000F0L});
    public static final BitSet FOLLOW_rule__FunctionCall__Group__3_in_rule__FunctionCall__Group__211846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__FunctionCall__Group__2__Impl11874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionCall__Group__3__Impl_in_rule__FunctionCall__Group__311905 = new BitSet(new long[]{0x0000000040400000L});
    public static final BitSet FOLLOW_rule__FunctionCall__Group__4_in_rule__FunctionCall__Group__311908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionCall__ArgsAssignment_3_in_rule__FunctionCall__Group__3__Impl11935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionCall__Group__4__Impl_in_rule__FunctionCall__Group__411965 = new BitSet(new long[]{0x0000000040400000L});
    public static final BitSet FOLLOW_rule__FunctionCall__Group__5_in_rule__FunctionCall__Group__411968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionCall__Group_4__0_in_rule__FunctionCall__Group__4__Impl11995 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_rule__FunctionCall__Group__5__Impl_in_rule__FunctionCall__Group__512026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__FunctionCall__Group__5__Impl12054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionCall__Group_4__0__Impl_in_rule__FunctionCall__Group_4__012097 = new BitSet(new long[]{0x00001000202000F0L});
    public static final BitSet FOLLOW_rule__FunctionCall__Group_4__1_in_rule__FunctionCall__Group_4__012100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__FunctionCall__Group_4__0__Impl12128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionCall__Group_4__1__Impl_in_rule__FunctionCall__Group_4__112159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionCall__ArgsAssignment_4_1_in_rule__FunctionCall__Group_4__1__Impl12186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Return__Group__0__Impl_in_rule__Return__Group__012220 = new BitSet(new long[]{0x00001000202000F0L});
    public static final BitSet FOLLOW_rule__Return__Group__1_in_rule__Return__Group__012223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__Return__Group__0__Impl12251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Return__Group__1__Impl_in_rule__Return__Group__112282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Return__ValueAssignment_1_in_rule__Return__Group__1__Impl12309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Include__Group__0__Impl_in_rule__Include__Group__012343 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Include__Group__1_in_rule__Include__Group__012346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__Include__Group__0__Impl12374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Include__Group__1__Impl_in_rule__Include__Group__112405 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__Include__Group__2_in_rule__Include__Group__112408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Include__Group__1__Impl12436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Include__Group__2__Impl_in_rule__Include__Group__212467 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Include__Group__3_in_rule__Include__Group__212470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Include__ImportURIAssignment_2_in_rule__Include__Group__2__Impl12497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Include__Group__3__Impl_in_rule__Include__Group__312527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Include__Group__3__Impl12555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleToplevelStatement_in_rule__Script__StatementsAssignment12599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_rule__StatementBlock__StatementsAssignment_212630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableReference_in_rule__Affectation__VariableAssignment_012661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__Affectation__ValueAssignment_212692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__If__ConditionAssignment_212723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_rule__If__ThenAssignment_412754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_rule__If__ElseAssignment_5_112785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__While__ConditionAssignment_212816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_rule__While__StatementAssignment_412847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForIterator_in_rule__For__IteratorAssignment_212878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_rule__For__StatementAssignment_412909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_rule__EachIterator__KeyAssignment_0_112940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_rule__EachIterator__ValueAssignment_212971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__EachIterator__ArrayAssignment_413002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAffectation_in_rule__VariableIterator__InitializationAssignment_013033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__VariableIterator__ConditionAssignment_213064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__VariableIterator__IncrementAssignment_413095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FunctionDeclaration__NameAssignment_113126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterDeclaration_in_rule__FunctionDeclaration__ParameterAssignment_3_013157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterDeclaration_in_rule__FunctionDeclaration__ParameterAssignment_3_1_113188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatementBlock_in_rule__FunctionDeclaration__BodyAssignment_513219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__ParameterDeclaration__ByAdressAssignment_013255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ParameterDeclaration__NameAssignment_113294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_rule__LocalDeclaration__VariablesAssignment_113325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_rule__LocalDeclaration__VariablesAssignment_2_113356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_rule__GlobalDeclaration__VariablesAssignment_113387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_rule__GlobalDeclaration__VariablesAssignment_2_113418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__VariableDeclaration__NameAssignment_013449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__VariableDeclaration__ValueAssignment_1_113480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOr_in_rule__Comparison__RightAssignment_1_113511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnd_in_rule__Or__RightAssignment_1_113542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddition_in_rule__And__RightAssignment_1_113573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplication_in_rule__Addition__RightAssignment_1_113604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_rule__Multiplication__RightAssignment_1_113635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_REAL_in_rule__PrimaryExpression__ValueAssignment_1_113666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__PrimaryExpression__ValueAssignment_2_113697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__PrimaryExpression__ValueAssignment_5_113728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__ArrayLiteral__ValuesAssignment_2_013759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__ArrayLiteral__ValuesAssignment_2_1_113790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__VariableReference__VariableAssignment_013825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__VariableReference__DimensionsAssignment_1_113860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FunctionCall__FunctionAssignment_113895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__FunctionCall__ArgsAssignment_313930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__FunctionCall__ArgsAssignment_4_113961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__Return__ValueAssignment_113992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Include__ImportURIAssignment_214023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__Group_5__0_in_synpred33_InternalLeek4212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EachIterator__Group_0__0_in_synpred34_InternalLeek5036 = new BitSet(new long[]{0x0000000000000002L});

}