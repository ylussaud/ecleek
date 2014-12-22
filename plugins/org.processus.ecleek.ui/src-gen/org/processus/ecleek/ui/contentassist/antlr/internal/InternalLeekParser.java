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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_REAL", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'or'", "'||'", "'and'", "'&&'", "';'", "'{'", "'}'", "'='", "'if'", "'('", "')'", "'else'", "'while'", "'for'", "'var'", "'in'", "':'", "'function'", "','", "'global'", "'==='", "'=='", "'!=='", "'!='", "'<='", "'<'", "'>='", "'>'", "'+'", "'-'", "'*'", "'/'", "'['", "']'", "'include'", "'\"'", "'@'"
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

                if ( (LA1_0==RULE_ID||LA1_0==17||LA1_0==20||(LA1_0>=24 && LA1_0<=26)||LA1_0==29||LA1_0==31||LA1_0==46) ) {
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


    // $ANTLR start "entryRuleStatement"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:89:1: entryRuleStatement : ruleStatement EOF ;
    public final void entryRuleStatement() throws RecognitionException {
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:90:1: ( ruleStatement EOF )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:91:1: ruleStatement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementRule()); 
            }
            pushFollow(FOLLOW_ruleStatement_in_entryRuleStatement128);
            ruleStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatement135); if (state.failed) return ;

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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:98:1: ruleStatement : ( ( rule__Statement__Alternatives ) ) ;
    public final void ruleStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:102:2: ( ( ( rule__Statement__Alternatives ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:103:1: ( ( rule__Statement__Alternatives ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:103:1: ( ( rule__Statement__Alternatives ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:104:1: ( rule__Statement__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getAlternatives()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:105:1: ( rule__Statement__Alternatives )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:105:2: rule__Statement__Alternatives
            {
            pushFollow(FOLLOW_rule__Statement__Alternatives_in_ruleStatement161);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:117:1: entryRuleStatementBlock : ruleStatementBlock EOF ;
    public final void entryRuleStatementBlock() throws RecognitionException {
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:118:1: ( ruleStatementBlock EOF )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:119:1: ruleStatementBlock EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementBlockRule()); 
            }
            pushFollow(FOLLOW_ruleStatementBlock_in_entryRuleStatementBlock188);
            ruleStatementBlock();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementBlockRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatementBlock195); if (state.failed) return ;

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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:126:1: ruleStatementBlock : ( ( rule__StatementBlock__Group__0 ) ) ;
    public final void ruleStatementBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:130:2: ( ( ( rule__StatementBlock__Group__0 ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:131:1: ( ( rule__StatementBlock__Group__0 ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:131:1: ( ( rule__StatementBlock__Group__0 ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:132:1: ( rule__StatementBlock__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementBlockAccess().getGroup()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:133:1: ( rule__StatementBlock__Group__0 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:133:2: rule__StatementBlock__Group__0
            {
            pushFollow(FOLLOW_rule__StatementBlock__Group__0_in_ruleStatementBlock221);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:145:1: entryRuleAffectation : ruleAffectation EOF ;
    public final void entryRuleAffectation() throws RecognitionException {
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:146:1: ( ruleAffectation EOF )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:147:1: ruleAffectation EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAffectationRule()); 
            }
            pushFollow(FOLLOW_ruleAffectation_in_entryRuleAffectation248);
            ruleAffectation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAffectationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAffectation255); if (state.failed) return ;

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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:154:1: ruleAffectation : ( ( rule__Affectation__Group__0 ) ) ;
    public final void ruleAffectation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:158:2: ( ( ( rule__Affectation__Group__0 ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:159:1: ( ( rule__Affectation__Group__0 ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:159:1: ( ( rule__Affectation__Group__0 ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:160:1: ( rule__Affectation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAffectationAccess().getGroup()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:161:1: ( rule__Affectation__Group__0 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:161:2: rule__Affectation__Group__0
            {
            pushFollow(FOLLOW_rule__Affectation__Group__0_in_ruleAffectation281);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:173:1: entryRuleIf : ruleIf EOF ;
    public final void entryRuleIf() throws RecognitionException {
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:174:1: ( ruleIf EOF )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:175:1: ruleIf EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfRule()); 
            }
            pushFollow(FOLLOW_ruleIf_in_entryRuleIf308);
            ruleIf();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIf315); if (state.failed) return ;

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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:182:1: ruleIf : ( ( rule__If__Group__0 ) ) ;
    public final void ruleIf() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:186:2: ( ( ( rule__If__Group__0 ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:187:1: ( ( rule__If__Group__0 ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:187:1: ( ( rule__If__Group__0 ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:188:1: ( rule__If__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getGroup()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:189:1: ( rule__If__Group__0 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:189:2: rule__If__Group__0
            {
            pushFollow(FOLLOW_rule__If__Group__0_in_ruleIf341);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:201:1: entryRuleWhile : ruleWhile EOF ;
    public final void entryRuleWhile() throws RecognitionException {
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:202:1: ( ruleWhile EOF )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:203:1: ruleWhile EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileRule()); 
            }
            pushFollow(FOLLOW_ruleWhile_in_entryRuleWhile368);
            ruleWhile();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhileRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleWhile375); if (state.failed) return ;

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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:210:1: ruleWhile : ( ( rule__While__Group__0 ) ) ;
    public final void ruleWhile() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:214:2: ( ( ( rule__While__Group__0 ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:215:1: ( ( rule__While__Group__0 ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:215:1: ( ( rule__While__Group__0 ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:216:1: ( rule__While__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileAccess().getGroup()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:217:1: ( rule__While__Group__0 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:217:2: rule__While__Group__0
            {
            pushFollow(FOLLOW_rule__While__Group__0_in_ruleWhile401);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:229:1: entryRuleFor : ruleFor EOF ;
    public final void entryRuleFor() throws RecognitionException {
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:230:1: ( ruleFor EOF )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:231:1: ruleFor EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForRule()); 
            }
            pushFollow(FOLLOW_ruleFor_in_entryRuleFor428);
            ruleFor();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFor435); if (state.failed) return ;

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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:238:1: ruleFor : ( ( rule__For__Group__0 ) ) ;
    public final void ruleFor() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:242:2: ( ( ( rule__For__Group__0 ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:243:1: ( ( rule__For__Group__0 ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:243:1: ( ( rule__For__Group__0 ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:244:1: ( rule__For__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForAccess().getGroup()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:245:1: ( rule__For__Group__0 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:245:2: rule__For__Group__0
            {
            pushFollow(FOLLOW_rule__For__Group__0_in_ruleFor461);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:257:1: entryRuleForIterator : ruleForIterator EOF ;
    public final void entryRuleForIterator() throws RecognitionException {
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:258:1: ( ruleForIterator EOF )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:259:1: ruleForIterator EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForIteratorRule()); 
            }
            pushFollow(FOLLOW_ruleForIterator_in_entryRuleForIterator488);
            ruleForIterator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForIteratorRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleForIterator495); if (state.failed) return ;

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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:266:1: ruleForIterator : ( ( rule__ForIterator__Alternatives ) ) ;
    public final void ruleForIterator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:270:2: ( ( ( rule__ForIterator__Alternatives ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:271:1: ( ( rule__ForIterator__Alternatives ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:271:1: ( ( rule__ForIterator__Alternatives ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:272:1: ( rule__ForIterator__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForIteratorAccess().getAlternatives()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:273:1: ( rule__ForIterator__Alternatives )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:273:2: rule__ForIterator__Alternatives
            {
            pushFollow(FOLLOW_rule__ForIterator__Alternatives_in_ruleForIterator521);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:285:1: entryRuleEachIterator : ruleEachIterator EOF ;
    public final void entryRuleEachIterator() throws RecognitionException {
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:286:1: ( ruleEachIterator EOF )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:287:1: ruleEachIterator EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEachIteratorRule()); 
            }
            pushFollow(FOLLOW_ruleEachIterator_in_entryRuleEachIterator548);
            ruleEachIterator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEachIteratorRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEachIterator555); if (state.failed) return ;

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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:294:1: ruleEachIterator : ( ( rule__EachIterator__Group__0 ) ) ;
    public final void ruleEachIterator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:298:2: ( ( ( rule__EachIterator__Group__0 ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:299:1: ( ( rule__EachIterator__Group__0 ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:299:1: ( ( rule__EachIterator__Group__0 ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:300:1: ( rule__EachIterator__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEachIteratorAccess().getGroup()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:301:1: ( rule__EachIterator__Group__0 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:301:2: rule__EachIterator__Group__0
            {
            pushFollow(FOLLOW_rule__EachIterator__Group__0_in_ruleEachIterator581);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:313:1: entryRuleVariableIterator : ruleVariableIterator EOF ;
    public final void entryRuleVariableIterator() throws RecognitionException {
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:314:1: ( ruleVariableIterator EOF )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:315:1: ruleVariableIterator EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableIteratorRule()); 
            }
            pushFollow(FOLLOW_ruleVariableIterator_in_entryRuleVariableIterator608);
            ruleVariableIterator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableIteratorRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableIterator615); if (state.failed) return ;

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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:322:1: ruleVariableIterator : ( ( rule__VariableIterator__Group__0 ) ) ;
    public final void ruleVariableIterator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:326:2: ( ( ( rule__VariableIterator__Group__0 ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:327:1: ( ( rule__VariableIterator__Group__0 ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:327:1: ( ( rule__VariableIterator__Group__0 ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:328:1: ( rule__VariableIterator__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableIteratorAccess().getGroup()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:329:1: ( rule__VariableIterator__Group__0 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:329:2: rule__VariableIterator__Group__0
            {
            pushFollow(FOLLOW_rule__VariableIterator__Group__0_in_ruleVariableIterator641);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:341:1: entryRuleFunctionDeclaration : ruleFunctionDeclaration EOF ;
    public final void entryRuleFunctionDeclaration() throws RecognitionException {
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:342:1: ( ruleFunctionDeclaration EOF )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:343:1: ruleFunctionDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleFunctionDeclaration_in_entryRuleFunctionDeclaration668);
            ruleFunctionDeclaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionDeclarationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionDeclaration675); if (state.failed) return ;

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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:350:1: ruleFunctionDeclaration : ( ( rule__FunctionDeclaration__Group__0 ) ) ;
    public final void ruleFunctionDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:354:2: ( ( ( rule__FunctionDeclaration__Group__0 ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:355:1: ( ( rule__FunctionDeclaration__Group__0 ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:355:1: ( ( rule__FunctionDeclaration__Group__0 ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:356:1: ( rule__FunctionDeclaration__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionDeclarationAccess().getGroup()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:357:1: ( rule__FunctionDeclaration__Group__0 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:357:2: rule__FunctionDeclaration__Group__0
            {
            pushFollow(FOLLOW_rule__FunctionDeclaration__Group__0_in_ruleFunctionDeclaration701);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:369:1: entryRuleParameterDeclaration : ruleParameterDeclaration EOF ;
    public final void entryRuleParameterDeclaration() throws RecognitionException {
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:370:1: ( ruleParameterDeclaration EOF )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:371:1: ruleParameterDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleParameterDeclaration_in_entryRuleParameterDeclaration728);
            ruleParameterDeclaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterDeclarationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameterDeclaration735); if (state.failed) return ;

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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:378:1: ruleParameterDeclaration : ( ( rule__ParameterDeclaration__Group__0 ) ) ;
    public final void ruleParameterDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:382:2: ( ( ( rule__ParameterDeclaration__Group__0 ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:383:1: ( ( rule__ParameterDeclaration__Group__0 ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:383:1: ( ( rule__ParameterDeclaration__Group__0 ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:384:1: ( rule__ParameterDeclaration__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterDeclarationAccess().getGroup()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:385:1: ( rule__ParameterDeclaration__Group__0 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:385:2: rule__ParameterDeclaration__Group__0
            {
            pushFollow(FOLLOW_rule__ParameterDeclaration__Group__0_in_ruleParameterDeclaration761);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:397:1: entryRuleLocalDeclaration : ruleLocalDeclaration EOF ;
    public final void entryRuleLocalDeclaration() throws RecognitionException {
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:398:1: ( ruleLocalDeclaration EOF )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:399:1: ruleLocalDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleLocalDeclaration_in_entryRuleLocalDeclaration788);
            ruleLocalDeclaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocalDeclarationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLocalDeclaration795); if (state.failed) return ;

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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:406:1: ruleLocalDeclaration : ( ( rule__LocalDeclaration__Group__0 ) ) ;
    public final void ruleLocalDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:410:2: ( ( ( rule__LocalDeclaration__Group__0 ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:411:1: ( ( rule__LocalDeclaration__Group__0 ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:411:1: ( ( rule__LocalDeclaration__Group__0 ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:412:1: ( rule__LocalDeclaration__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalDeclarationAccess().getGroup()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:413:1: ( rule__LocalDeclaration__Group__0 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:413:2: rule__LocalDeclaration__Group__0
            {
            pushFollow(FOLLOW_rule__LocalDeclaration__Group__0_in_ruleLocalDeclaration821);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:425:1: entryRuleGlobalDeclaration : ruleGlobalDeclaration EOF ;
    public final void entryRuleGlobalDeclaration() throws RecognitionException {
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:426:1: ( ruleGlobalDeclaration EOF )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:427:1: ruleGlobalDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGlobalDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleGlobalDeclaration_in_entryRuleGlobalDeclaration848);
            ruleGlobalDeclaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGlobalDeclarationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGlobalDeclaration855); if (state.failed) return ;

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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:434:1: ruleGlobalDeclaration : ( ( rule__GlobalDeclaration__Group__0 ) ) ;
    public final void ruleGlobalDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:438:2: ( ( ( rule__GlobalDeclaration__Group__0 ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:439:1: ( ( rule__GlobalDeclaration__Group__0 ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:439:1: ( ( rule__GlobalDeclaration__Group__0 ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:440:1: ( rule__GlobalDeclaration__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGlobalDeclarationAccess().getGroup()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:441:1: ( rule__GlobalDeclaration__Group__0 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:441:2: rule__GlobalDeclaration__Group__0
            {
            pushFollow(FOLLOW_rule__GlobalDeclaration__Group__0_in_ruleGlobalDeclaration881);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:453:1: entryRuleVariableDeclaration : ruleVariableDeclaration EOF ;
    public final void entryRuleVariableDeclaration() throws RecognitionException {
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:454:1: ( ruleVariableDeclaration EOF )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:455:1: ruleVariableDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleVariableDeclaration_in_entryRuleVariableDeclaration908);
            ruleVariableDeclaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableDeclarationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableDeclaration915); if (state.failed) return ;

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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:462:1: ruleVariableDeclaration : ( ( rule__VariableDeclaration__Group__0 ) ) ;
    public final void ruleVariableDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:466:2: ( ( ( rule__VariableDeclaration__Group__0 ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:467:1: ( ( rule__VariableDeclaration__Group__0 ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:467:1: ( ( rule__VariableDeclaration__Group__0 ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:468:1: ( rule__VariableDeclaration__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableDeclarationAccess().getGroup()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:469:1: ( rule__VariableDeclaration__Group__0 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:469:2: rule__VariableDeclaration__Group__0
            {
            pushFollow(FOLLOW_rule__VariableDeclaration__Group__0_in_ruleVariableDeclaration941);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:481:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:482:1: ( ruleExpression EOF )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:483:1: ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression968);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression975); if (state.failed) return ;

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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:490:1: ruleExpression : ( ruleComparison ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:494:2: ( ( ruleComparison ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:495:1: ( ruleComparison )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:495:1: ( ruleComparison )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:496:1: ruleComparison
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getComparisonParserRuleCall()); 
            }
            pushFollow(FOLLOW_ruleComparison_in_ruleExpression1001);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:509:1: entryRuleComparison : ruleComparison EOF ;
    public final void entryRuleComparison() throws RecognitionException {
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:510:1: ( ruleComparison EOF )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:511:1: ruleComparison EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonRule()); 
            }
            pushFollow(FOLLOW_ruleComparison_in_entryRuleComparison1027);
            ruleComparison();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleComparison1034); if (state.failed) return ;

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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:518:1: ruleComparison : ( ( rule__Comparison__Group__0 ) ) ;
    public final void ruleComparison() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:522:2: ( ( ( rule__Comparison__Group__0 ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:523:1: ( ( rule__Comparison__Group__0 ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:523:1: ( ( rule__Comparison__Group__0 ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:524:1: ( rule__Comparison__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getGroup()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:525:1: ( rule__Comparison__Group__0 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:525:2: rule__Comparison__Group__0
            {
            pushFollow(FOLLOW_rule__Comparison__Group__0_in_ruleComparison1060);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:537:1: entryRuleOr : ruleOr EOF ;
    public final void entryRuleOr() throws RecognitionException {
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:538:1: ( ruleOr EOF )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:539:1: ruleOr EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrRule()); 
            }
            pushFollow(FOLLOW_ruleOr_in_entryRuleOr1087);
            ruleOr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOr1094); if (state.failed) return ;

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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:546:1: ruleOr : ( ( rule__Or__Group__0 ) ) ;
    public final void ruleOr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:550:2: ( ( ( rule__Or__Group__0 ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:551:1: ( ( rule__Or__Group__0 ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:551:1: ( ( rule__Or__Group__0 ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:552:1: ( rule__Or__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAccess().getGroup()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:553:1: ( rule__Or__Group__0 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:553:2: rule__Or__Group__0
            {
            pushFollow(FOLLOW_rule__Or__Group__0_in_ruleOr1120);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:565:1: entryRuleAnd : ruleAnd EOF ;
    public final void entryRuleAnd() throws RecognitionException {
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:566:1: ( ruleAnd EOF )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:567:1: ruleAnd EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndRule()); 
            }
            pushFollow(FOLLOW_ruleAnd_in_entryRuleAnd1147);
            ruleAnd();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnd1154); if (state.failed) return ;

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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:574:1: ruleAnd : ( ( rule__And__Group__0 ) ) ;
    public final void ruleAnd() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:578:2: ( ( ( rule__And__Group__0 ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:579:1: ( ( rule__And__Group__0 ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:579:1: ( ( rule__And__Group__0 ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:580:1: ( rule__And__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndAccess().getGroup()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:581:1: ( rule__And__Group__0 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:581:2: rule__And__Group__0
            {
            pushFollow(FOLLOW_rule__And__Group__0_in_ruleAnd1180);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:593:1: entryRuleAddition : ruleAddition EOF ;
    public final void entryRuleAddition() throws RecognitionException {
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:594:1: ( ruleAddition EOF )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:595:1: ruleAddition EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionRule()); 
            }
            pushFollow(FOLLOW_ruleAddition_in_entryRuleAddition1207);
            ruleAddition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAddition1214); if (state.failed) return ;

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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:602:1: ruleAddition : ( ( rule__Addition__Group__0 ) ) ;
    public final void ruleAddition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:606:2: ( ( ( rule__Addition__Group__0 ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:607:1: ( ( rule__Addition__Group__0 ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:607:1: ( ( rule__Addition__Group__0 ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:608:1: ( rule__Addition__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getGroup()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:609:1: ( rule__Addition__Group__0 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:609:2: rule__Addition__Group__0
            {
            pushFollow(FOLLOW_rule__Addition__Group__0_in_ruleAddition1240);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:621:1: entryRuleMultiplication : ruleMultiplication EOF ;
    public final void entryRuleMultiplication() throws RecognitionException {
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:622:1: ( ruleMultiplication EOF )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:623:1: ruleMultiplication EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationRule()); 
            }
            pushFollow(FOLLOW_ruleMultiplication_in_entryRuleMultiplication1267);
            ruleMultiplication();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiplication1274); if (state.failed) return ;

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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:630:1: ruleMultiplication : ( ( rule__Multiplication__Group__0 ) ) ;
    public final void ruleMultiplication() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:634:2: ( ( ( rule__Multiplication__Group__0 ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:635:1: ( ( rule__Multiplication__Group__0 ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:635:1: ( ( rule__Multiplication__Group__0 ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:636:1: ( rule__Multiplication__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getGroup()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:637:1: ( rule__Multiplication__Group__0 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:637:2: rule__Multiplication__Group__0
            {
            pushFollow(FOLLOW_rule__Multiplication__Group__0_in_ruleMultiplication1300);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:649:1: entryRulePrimaryExpression : rulePrimaryExpression EOF ;
    public final void entryRulePrimaryExpression() throws RecognitionException {
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:650:1: ( rulePrimaryExpression EOF )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:651:1: rulePrimaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExpressionRule()); 
            }
            pushFollow(FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression1327);
            rulePrimaryExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimaryExpression1334); if (state.failed) return ;

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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:658:1: rulePrimaryExpression : ( ( rule__PrimaryExpression__Alternatives ) ) ;
    public final void rulePrimaryExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:662:2: ( ( ( rule__PrimaryExpression__Alternatives ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:663:1: ( ( rule__PrimaryExpression__Alternatives ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:663:1: ( ( rule__PrimaryExpression__Alternatives ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:664:1: ( rule__PrimaryExpression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExpressionAccess().getAlternatives()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:665:1: ( rule__PrimaryExpression__Alternatives )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:665:2: rule__PrimaryExpression__Alternatives
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__Alternatives_in_rulePrimaryExpression1360);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:677:1: entryRuleArrayLiteral : ruleArrayLiteral EOF ;
    public final void entryRuleArrayLiteral() throws RecognitionException {
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:678:1: ( ruleArrayLiteral EOF )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:679:1: ruleArrayLiteral EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleArrayLiteral_in_entryRuleArrayLiteral1387);
            ruleArrayLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayLiteralRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleArrayLiteral1394); if (state.failed) return ;

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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:686:1: ruleArrayLiteral : ( ( rule__ArrayLiteral__Group__0 ) ) ;
    public final void ruleArrayLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:690:2: ( ( ( rule__ArrayLiteral__Group__0 ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:691:1: ( ( rule__ArrayLiteral__Group__0 ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:691:1: ( ( rule__ArrayLiteral__Group__0 ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:692:1: ( rule__ArrayLiteral__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayLiteralAccess().getGroup()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:693:1: ( rule__ArrayLiteral__Group__0 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:693:2: rule__ArrayLiteral__Group__0
            {
            pushFollow(FOLLOW_rule__ArrayLiteral__Group__0_in_ruleArrayLiteral1420);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:705:1: entryRuleVariableReference : ruleVariableReference EOF ;
    public final void entryRuleVariableReference() throws RecognitionException {
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:706:1: ( ruleVariableReference EOF )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:707:1: ruleVariableReference EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleVariableReference_in_entryRuleVariableReference1447);
            ruleVariableReference();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableReferenceRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableReference1454); if (state.failed) return ;

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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:714:1: ruleVariableReference : ( ( rule__VariableReference__Group__0 ) ) ;
    public final void ruleVariableReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:718:2: ( ( ( rule__VariableReference__Group__0 ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:719:1: ( ( rule__VariableReference__Group__0 ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:719:1: ( ( rule__VariableReference__Group__0 ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:720:1: ( rule__VariableReference__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableReferenceAccess().getGroup()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:721:1: ( rule__VariableReference__Group__0 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:721:2: rule__VariableReference__Group__0
            {
            pushFollow(FOLLOW_rule__VariableReference__Group__0_in_ruleVariableReference1480);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:733:1: entryRuleFunctionCall : ruleFunctionCall EOF ;
    public final void entryRuleFunctionCall() throws RecognitionException {
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:734:1: ( ruleFunctionCall EOF )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:735:1: ruleFunctionCall EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallRule()); 
            }
            pushFollow(FOLLOW_ruleFunctionCall_in_entryRuleFunctionCall1507);
            ruleFunctionCall();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionCallRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionCall1514); if (state.failed) return ;

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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:742:1: ruleFunctionCall : ( ( rule__FunctionCall__Group__0 ) ) ;
    public final void ruleFunctionCall() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:746:2: ( ( ( rule__FunctionCall__Group__0 ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:747:1: ( ( rule__FunctionCall__Group__0 ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:747:1: ( ( rule__FunctionCall__Group__0 ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:748:1: ( rule__FunctionCall__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getGroup()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:749:1: ( rule__FunctionCall__Group__0 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:749:2: rule__FunctionCall__Group__0
            {
            pushFollow(FOLLOW_rule__FunctionCall__Group__0_in_ruleFunctionCall1540);
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


    // $ANTLR start "entryRuleInclude"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:761:1: entryRuleInclude : ruleInclude EOF ;
    public final void entryRuleInclude() throws RecognitionException {
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:762:1: ( ruleInclude EOF )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:763:1: ruleInclude EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIncludeRule()); 
            }
            pushFollow(FOLLOW_ruleInclude_in_entryRuleInclude1567);
            ruleInclude();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIncludeRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInclude1574); if (state.failed) return ;

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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:770:1: ruleInclude : ( ( rule__Include__Group__0 ) ) ;
    public final void ruleInclude() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:774:2: ( ( ( rule__Include__Group__0 ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:775:1: ( ( rule__Include__Group__0 ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:775:1: ( ( rule__Include__Group__0 ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:776:1: ( rule__Include__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIncludeAccess().getGroup()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:777:1: ( rule__Include__Group__0 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:777:2: rule__Include__Group__0
            {
            pushFollow(FOLLOW_rule__Include__Group__0_in_ruleInclude1600);
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


    // $ANTLR start "rule__Statement__Alternatives"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:789:1: rule__Statement__Alternatives : ( ( ruleInclude ) | ( ruleGlobalDeclaration ) | ( ruleLocalDeclaration ) | ( ruleFunctionDeclaration ) | ( ( rule__Statement__Group_4__0 ) ) | ( ruleFor ) | ( ruleWhile ) | ( ruleIf ) | ( ( rule__Statement__Group_8__0 ) ) | ( ruleStatementBlock ) );
    public final void rule__Statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:793:1: ( ( ruleInclude ) | ( ruleGlobalDeclaration ) | ( ruleLocalDeclaration ) | ( ruleFunctionDeclaration ) | ( ( rule__Statement__Group_4__0 ) ) | ( ruleFor ) | ( ruleWhile ) | ( ruleIf ) | ( ( rule__Statement__Group_8__0 ) ) | ( ruleStatementBlock ) )
            int alt2=10;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:794:1: ( ruleInclude )
                    {
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:794:1: ( ruleInclude )
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:795:1: ruleInclude
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getIncludeParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleInclude_in_rule__Statement__Alternatives1636);
                    ruleInclude();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStatementAccess().getIncludeParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:800:6: ( ruleGlobalDeclaration )
                    {
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:800:6: ( ruleGlobalDeclaration )
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:801:1: ruleGlobalDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getGlobalDeclarationParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleGlobalDeclaration_in_rule__Statement__Alternatives1653);
                    ruleGlobalDeclaration();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStatementAccess().getGlobalDeclarationParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:806:6: ( ruleLocalDeclaration )
                    {
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:806:6: ( ruleLocalDeclaration )
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:807:1: ruleLocalDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getLocalDeclarationParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_ruleLocalDeclaration_in_rule__Statement__Alternatives1670);
                    ruleLocalDeclaration();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStatementAccess().getLocalDeclarationParserRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:812:6: ( ruleFunctionDeclaration )
                    {
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:812:6: ( ruleFunctionDeclaration )
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:813:1: ruleFunctionDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getFunctionDeclarationParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_ruleFunctionDeclaration_in_rule__Statement__Alternatives1687);
                    ruleFunctionDeclaration();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStatementAccess().getFunctionDeclarationParserRuleCall_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:818:6: ( ( rule__Statement__Group_4__0 ) )
                    {
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:818:6: ( ( rule__Statement__Group_4__0 ) )
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:819:1: ( rule__Statement__Group_4__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getGroup_4()); 
                    }
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:820:1: ( rule__Statement__Group_4__0 )
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:820:2: rule__Statement__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Statement__Group_4__0_in_rule__Statement__Alternatives1704);
                    rule__Statement__Group_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStatementAccess().getGroup_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:824:6: ( ruleFor )
                    {
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:824:6: ( ruleFor )
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:825:1: ruleFor
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getForParserRuleCall_5()); 
                    }
                    pushFollow(FOLLOW_ruleFor_in_rule__Statement__Alternatives1722);
                    ruleFor();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStatementAccess().getForParserRuleCall_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:830:6: ( ruleWhile )
                    {
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:830:6: ( ruleWhile )
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:831:1: ruleWhile
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getWhileParserRuleCall_6()); 
                    }
                    pushFollow(FOLLOW_ruleWhile_in_rule__Statement__Alternatives1739);
                    ruleWhile();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStatementAccess().getWhileParserRuleCall_6()); 
                    }

                    }


                    }
                    break;
                case 8 :
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:836:6: ( ruleIf )
                    {
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:836:6: ( ruleIf )
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:837:1: ruleIf
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getIfParserRuleCall_7()); 
                    }
                    pushFollow(FOLLOW_ruleIf_in_rule__Statement__Alternatives1756);
                    ruleIf();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStatementAccess().getIfParserRuleCall_7()); 
                    }

                    }


                    }
                    break;
                case 9 :
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:842:6: ( ( rule__Statement__Group_8__0 ) )
                    {
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:842:6: ( ( rule__Statement__Group_8__0 ) )
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:843:1: ( rule__Statement__Group_8__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getGroup_8()); 
                    }
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:844:1: ( rule__Statement__Group_8__0 )
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:844:2: rule__Statement__Group_8__0
                    {
                    pushFollow(FOLLOW_rule__Statement__Group_8__0_in_rule__Statement__Alternatives1773);
                    rule__Statement__Group_8__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStatementAccess().getGroup_8()); 
                    }

                    }


                    }
                    break;
                case 10 :
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:848:6: ( ruleStatementBlock )
                    {
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:848:6: ( ruleStatementBlock )
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:849:1: ruleStatementBlock
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getStatementBlockParserRuleCall_9()); 
                    }
                    pushFollow(FOLLOW_ruleStatementBlock_in_rule__Statement__Alternatives1791);
                    ruleStatementBlock();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStatementAccess().getStatementBlockParserRuleCall_9()); 
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:859:1: rule__ForIterator__Alternatives : ( ( ruleEachIterator ) | ( ruleVariableIterator ) );
    public final void rule__ForIterator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:863:1: ( ( ruleEachIterator ) | ( ruleVariableIterator ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==26) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ID) ) {
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
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:864:1: ( ruleEachIterator )
                    {
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:864:1: ( ruleEachIterator )
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:865:1: ruleEachIterator
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getForIteratorAccess().getEachIteratorParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleEachIterator_in_rule__ForIterator__Alternatives1823);
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
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:870:6: ( ruleVariableIterator )
                    {
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:870:6: ( ruleVariableIterator )
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:871:1: ruleVariableIterator
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getForIteratorAccess().getVariableIteratorParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleVariableIterator_in_rule__ForIterator__Alternatives1840);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:881:1: rule__Comparison__Alternatives_1_0 : ( ( ( rule__Comparison__Group_1_0_0__0 ) ) | ( ( rule__Comparison__Group_1_0_1__0 ) ) | ( ( rule__Comparison__Group_1_0_2__0 ) ) | ( ( rule__Comparison__Group_1_0_3__0 ) ) | ( ( rule__Comparison__Group_1_0_4__0 ) ) | ( ( rule__Comparison__Group_1_0_5__0 ) ) | ( ( rule__Comparison__Group_1_0_6__0 ) ) | ( ( rule__Comparison__Group_1_0_7__0 ) ) );
    public final void rule__Comparison__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:885:1: ( ( ( rule__Comparison__Group_1_0_0__0 ) ) | ( ( rule__Comparison__Group_1_0_1__0 ) ) | ( ( rule__Comparison__Group_1_0_2__0 ) ) | ( ( rule__Comparison__Group_1_0_3__0 ) ) | ( ( rule__Comparison__Group_1_0_4__0 ) ) | ( ( rule__Comparison__Group_1_0_5__0 ) ) | ( ( rule__Comparison__Group_1_0_6__0 ) ) | ( ( rule__Comparison__Group_1_0_7__0 ) ) )
            int alt4=8;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt4=1;
                }
                break;
            case 33:
                {
                alt4=2;
                }
                break;
            case 34:
                {
                alt4=3;
                }
                break;
            case 35:
                {
                alt4=4;
                }
                break;
            case 36:
                {
                alt4=5;
                }
                break;
            case 37:
                {
                alt4=6;
                }
                break;
            case 38:
                {
                alt4=7;
                }
                break;
            case 39:
                {
                alt4=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:886:1: ( ( rule__Comparison__Group_1_0_0__0 ) )
                    {
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:886:1: ( ( rule__Comparison__Group_1_0_0__0 ) )
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:887:1: ( rule__Comparison__Group_1_0_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComparisonAccess().getGroup_1_0_0()); 
                    }
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:888:1: ( rule__Comparison__Group_1_0_0__0 )
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:888:2: rule__Comparison__Group_1_0_0__0
                    {
                    pushFollow(FOLLOW_rule__Comparison__Group_1_0_0__0_in_rule__Comparison__Alternatives_1_01872);
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
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:892:6: ( ( rule__Comparison__Group_1_0_1__0 ) )
                    {
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:892:6: ( ( rule__Comparison__Group_1_0_1__0 ) )
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:893:1: ( rule__Comparison__Group_1_0_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComparisonAccess().getGroup_1_0_1()); 
                    }
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:894:1: ( rule__Comparison__Group_1_0_1__0 )
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:894:2: rule__Comparison__Group_1_0_1__0
                    {
                    pushFollow(FOLLOW_rule__Comparison__Group_1_0_1__0_in_rule__Comparison__Alternatives_1_01890);
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
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:898:6: ( ( rule__Comparison__Group_1_0_2__0 ) )
                    {
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:898:6: ( ( rule__Comparison__Group_1_0_2__0 ) )
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:899:1: ( rule__Comparison__Group_1_0_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComparisonAccess().getGroup_1_0_2()); 
                    }
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:900:1: ( rule__Comparison__Group_1_0_2__0 )
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:900:2: rule__Comparison__Group_1_0_2__0
                    {
                    pushFollow(FOLLOW_rule__Comparison__Group_1_0_2__0_in_rule__Comparison__Alternatives_1_01908);
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
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:904:6: ( ( rule__Comparison__Group_1_0_3__0 ) )
                    {
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:904:6: ( ( rule__Comparison__Group_1_0_3__0 ) )
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:905:1: ( rule__Comparison__Group_1_0_3__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComparisonAccess().getGroup_1_0_3()); 
                    }
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:906:1: ( rule__Comparison__Group_1_0_3__0 )
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:906:2: rule__Comparison__Group_1_0_3__0
                    {
                    pushFollow(FOLLOW_rule__Comparison__Group_1_0_3__0_in_rule__Comparison__Alternatives_1_01926);
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
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:910:6: ( ( rule__Comparison__Group_1_0_4__0 ) )
                    {
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:910:6: ( ( rule__Comparison__Group_1_0_4__0 ) )
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:911:1: ( rule__Comparison__Group_1_0_4__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComparisonAccess().getGroup_1_0_4()); 
                    }
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:912:1: ( rule__Comparison__Group_1_0_4__0 )
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:912:2: rule__Comparison__Group_1_0_4__0
                    {
                    pushFollow(FOLLOW_rule__Comparison__Group_1_0_4__0_in_rule__Comparison__Alternatives_1_01944);
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
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:916:6: ( ( rule__Comparison__Group_1_0_5__0 ) )
                    {
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:916:6: ( ( rule__Comparison__Group_1_0_5__0 ) )
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:917:1: ( rule__Comparison__Group_1_0_5__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComparisonAccess().getGroup_1_0_5()); 
                    }
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:918:1: ( rule__Comparison__Group_1_0_5__0 )
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:918:2: rule__Comparison__Group_1_0_5__0
                    {
                    pushFollow(FOLLOW_rule__Comparison__Group_1_0_5__0_in_rule__Comparison__Alternatives_1_01962);
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
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:922:6: ( ( rule__Comparison__Group_1_0_6__0 ) )
                    {
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:922:6: ( ( rule__Comparison__Group_1_0_6__0 ) )
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:923:1: ( rule__Comparison__Group_1_0_6__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComparisonAccess().getGroup_1_0_6()); 
                    }
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:924:1: ( rule__Comparison__Group_1_0_6__0 )
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:924:2: rule__Comparison__Group_1_0_6__0
                    {
                    pushFollow(FOLLOW_rule__Comparison__Group_1_0_6__0_in_rule__Comparison__Alternatives_1_01980);
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
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:928:6: ( ( rule__Comparison__Group_1_0_7__0 ) )
                    {
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:928:6: ( ( rule__Comparison__Group_1_0_7__0 ) )
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:929:1: ( rule__Comparison__Group_1_0_7__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComparisonAccess().getGroup_1_0_7()); 
                    }
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:930:1: ( rule__Comparison__Group_1_0_7__0 )
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:930:2: rule__Comparison__Group_1_0_7__0
                    {
                    pushFollow(FOLLOW_rule__Comparison__Group_1_0_7__0_in_rule__Comparison__Alternatives_1_01998);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:939:1: rule__Or__Alternatives_1_0_1 : ( ( 'or' ) | ( '||' ) );
    public final void rule__Or__Alternatives_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:943:1: ( ( 'or' ) | ( '||' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==12) ) {
                alt5=1;
            }
            else if ( (LA5_0==13) ) {
                alt5=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:944:1: ( 'or' )
                    {
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:944:1: ( 'or' )
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:945:1: 'or'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOrAccess().getOrKeyword_1_0_1_0()); 
                    }
                    match(input,12,FOLLOW_12_in_rule__Or__Alternatives_1_0_12032); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOrAccess().getOrKeyword_1_0_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:952:6: ( '||' )
                    {
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:952:6: ( '||' )
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:953:1: '||'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOrAccess().getVerticalLineVerticalLineKeyword_1_0_1_1()); 
                    }
                    match(input,13,FOLLOW_13_in_rule__Or__Alternatives_1_0_12052); if (state.failed) return ;
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:965:1: rule__And__Alternatives_1_0_1 : ( ( 'and' ) | ( '&&' ) );
    public final void rule__And__Alternatives_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:969:1: ( ( 'and' ) | ( '&&' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==14) ) {
                alt6=1;
            }
            else if ( (LA6_0==15) ) {
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
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:970:1: ( 'and' )
                    {
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:970:1: ( 'and' )
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:971:1: 'and'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAndAccess().getAndKeyword_1_0_1_0()); 
                    }
                    match(input,14,FOLLOW_14_in_rule__And__Alternatives_1_0_12087); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAndAccess().getAndKeyword_1_0_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:978:6: ( '&&' )
                    {
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:978:6: ( '&&' )
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:979:1: '&&'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAndAccess().getAmpersandAmpersandKeyword_1_0_1_1()); 
                    }
                    match(input,15,FOLLOW_15_in_rule__And__Alternatives_1_0_12107); if (state.failed) return ;
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:991:1: rule__Addition__Alternatives_1_0 : ( ( ( rule__Addition__Group_1_0_0__0 ) ) | ( ( rule__Addition__Group_1_0_1__0 ) ) );
    public final void rule__Addition__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:995:1: ( ( ( rule__Addition__Group_1_0_0__0 ) ) | ( ( rule__Addition__Group_1_0_1__0 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==40) ) {
                alt7=1;
            }
            else if ( (LA7_0==41) ) {
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
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:996:1: ( ( rule__Addition__Group_1_0_0__0 ) )
                    {
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:996:1: ( ( rule__Addition__Group_1_0_0__0 ) )
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:997:1: ( rule__Addition__Group_1_0_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAdditionAccess().getGroup_1_0_0()); 
                    }
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:998:1: ( rule__Addition__Group_1_0_0__0 )
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:998:2: rule__Addition__Group_1_0_0__0
                    {
                    pushFollow(FOLLOW_rule__Addition__Group_1_0_0__0_in_rule__Addition__Alternatives_1_02141);
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
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1002:6: ( ( rule__Addition__Group_1_0_1__0 ) )
                    {
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1002:6: ( ( rule__Addition__Group_1_0_1__0 ) )
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1003:1: ( rule__Addition__Group_1_0_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAdditionAccess().getGroup_1_0_1()); 
                    }
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1004:1: ( rule__Addition__Group_1_0_1__0 )
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1004:2: rule__Addition__Group_1_0_1__0
                    {
                    pushFollow(FOLLOW_rule__Addition__Group_1_0_1__0_in_rule__Addition__Alternatives_1_02159);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1013:1: rule__Multiplication__Alternatives_1_0 : ( ( ( rule__Multiplication__Group_1_0_0__0 ) ) | ( ( rule__Multiplication__Group_1_0_1__0 ) ) );
    public final void rule__Multiplication__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1017:1: ( ( ( rule__Multiplication__Group_1_0_0__0 ) ) | ( ( rule__Multiplication__Group_1_0_1__0 ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==42) ) {
                alt8=1;
            }
            else if ( (LA8_0==43) ) {
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
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1018:1: ( ( rule__Multiplication__Group_1_0_0__0 ) )
                    {
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1018:1: ( ( rule__Multiplication__Group_1_0_0__0 ) )
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1019:1: ( rule__Multiplication__Group_1_0_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMultiplicationAccess().getGroup_1_0_0()); 
                    }
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1020:1: ( rule__Multiplication__Group_1_0_0__0 )
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1020:2: rule__Multiplication__Group_1_0_0__0
                    {
                    pushFollow(FOLLOW_rule__Multiplication__Group_1_0_0__0_in_rule__Multiplication__Alternatives_1_02192);
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
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1024:6: ( ( rule__Multiplication__Group_1_0_1__0 ) )
                    {
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1024:6: ( ( rule__Multiplication__Group_1_0_1__0 ) )
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1025:1: ( rule__Multiplication__Group_1_0_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMultiplicationAccess().getGroup_1_0_1()); 
                    }
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1026:1: ( rule__Multiplication__Group_1_0_1__0 )
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1026:2: rule__Multiplication__Group_1_0_1__0
                    {
                    pushFollow(FOLLOW_rule__Multiplication__Group_1_0_1__0_in_rule__Multiplication__Alternatives_1_02210);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1035:1: rule__PrimaryExpression__Alternatives : ( ( ( rule__PrimaryExpression__Group_0__0 ) ) | ( ( rule__PrimaryExpression__Group_1__0 ) ) | ( ( rule__PrimaryExpression__Group_2__0 ) ) | ( ruleFunctionCall ) | ( ruleVariableReference ) | ( ( rule__PrimaryExpression__Group_5__0 ) ) | ( ruleArrayLiteral ) );
    public final void rule__PrimaryExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1039:1: ( ( ( rule__PrimaryExpression__Group_0__0 ) ) | ( ( rule__PrimaryExpression__Group_1__0 ) ) | ( ( rule__PrimaryExpression__Group_2__0 ) ) | ( ruleFunctionCall ) | ( ruleVariableReference ) | ( ( rule__PrimaryExpression__Group_5__0 ) ) | ( ruleArrayLiteral ) )
            int alt9=7;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt9=1;
                }
                break;
            case RULE_REAL:
                {
                alt9=2;
                }
                break;
            case RULE_INT:
                {
                alt9=3;
                }
                break;
            case RULE_ID:
                {
                int LA9_4 = input.LA(2);

                if ( (LA9_4==EOF||(LA9_4>=12 && LA9_4<=16)||LA9_4==22||(LA9_4>=27 && LA9_4<=28)||LA9_4==30||(LA9_4>=32 && LA9_4<=45)) ) {
                    alt9=5;
                }
                else if ( (LA9_4==21) ) {
                    alt9=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 4, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
                {
                alt9=6;
                }
                break;
            case 44:
                {
                alt9=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1040:1: ( ( rule__PrimaryExpression__Group_0__0 ) )
                    {
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1040:1: ( ( rule__PrimaryExpression__Group_0__0 ) )
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1041:1: ( rule__PrimaryExpression__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryExpressionAccess().getGroup_0()); 
                    }
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1042:1: ( rule__PrimaryExpression__Group_0__0 )
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1042:2: rule__PrimaryExpression__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__PrimaryExpression__Group_0__0_in_rule__PrimaryExpression__Alternatives2243);
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
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1046:6: ( ( rule__PrimaryExpression__Group_1__0 ) )
                    {
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1046:6: ( ( rule__PrimaryExpression__Group_1__0 ) )
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1047:1: ( rule__PrimaryExpression__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryExpressionAccess().getGroup_1()); 
                    }
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1048:1: ( rule__PrimaryExpression__Group_1__0 )
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1048:2: rule__PrimaryExpression__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__PrimaryExpression__Group_1__0_in_rule__PrimaryExpression__Alternatives2261);
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
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1052:6: ( ( rule__PrimaryExpression__Group_2__0 ) )
                    {
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1052:6: ( ( rule__PrimaryExpression__Group_2__0 ) )
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1053:1: ( rule__PrimaryExpression__Group_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryExpressionAccess().getGroup_2()); 
                    }
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1054:1: ( rule__PrimaryExpression__Group_2__0 )
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1054:2: rule__PrimaryExpression__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__PrimaryExpression__Group_2__0_in_rule__PrimaryExpression__Alternatives2279);
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
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1058:6: ( ruleFunctionCall )
                    {
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1058:6: ( ruleFunctionCall )
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1059:1: ruleFunctionCall
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryExpressionAccess().getFunctionCallParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_ruleFunctionCall_in_rule__PrimaryExpression__Alternatives2297);
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
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1064:6: ( ruleVariableReference )
                    {
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1064:6: ( ruleVariableReference )
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1065:1: ruleVariableReference
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryExpressionAccess().getVariableReferenceParserRuleCall_4()); 
                    }
                    pushFollow(FOLLOW_ruleVariableReference_in_rule__PrimaryExpression__Alternatives2314);
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
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1070:6: ( ( rule__PrimaryExpression__Group_5__0 ) )
                    {
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1070:6: ( ( rule__PrimaryExpression__Group_5__0 ) )
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1071:1: ( rule__PrimaryExpression__Group_5__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryExpressionAccess().getGroup_5()); 
                    }
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1072:1: ( rule__PrimaryExpression__Group_5__0 )
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1072:2: rule__PrimaryExpression__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__PrimaryExpression__Group_5__0_in_rule__PrimaryExpression__Alternatives2331);
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
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1076:6: ( ruleArrayLiteral )
                    {
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1076:6: ( ruleArrayLiteral )
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1077:1: ruleArrayLiteral
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryExpressionAccess().getArrayLiteralParserRuleCall_6()); 
                    }
                    pushFollow(FOLLOW_ruleArrayLiteral_in_rule__PrimaryExpression__Alternatives2349);
                    ruleArrayLiteral();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrimaryExpressionAccess().getArrayLiteralParserRuleCall_6()); 
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


    // $ANTLR start "rule__Statement__Group_4__0"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1089:1: rule__Statement__Group_4__0 : rule__Statement__Group_4__0__Impl rule__Statement__Group_4__1 ;
    public final void rule__Statement__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1093:1: ( rule__Statement__Group_4__0__Impl rule__Statement__Group_4__1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1094:2: rule__Statement__Group_4__0__Impl rule__Statement__Group_4__1
            {
            pushFollow(FOLLOW_rule__Statement__Group_4__0__Impl_in_rule__Statement__Group_4__02379);
            rule__Statement__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Statement__Group_4__1_in_rule__Statement__Group_4__02382);
            rule__Statement__Group_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_4__0"


    // $ANTLR start "rule__Statement__Group_4__0__Impl"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1101:1: rule__Statement__Group_4__0__Impl : ( ruleFunctionCall ) ;
    public final void rule__Statement__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1105:1: ( ( ruleFunctionCall ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1106:1: ( ruleFunctionCall )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1106:1: ( ruleFunctionCall )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1107:1: ruleFunctionCall
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getFunctionCallParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_ruleFunctionCall_in_rule__Statement__Group_4__0__Impl2409);
            ruleFunctionCall();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getFunctionCallParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_4__0__Impl"


    // $ANTLR start "rule__Statement__Group_4__1"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1118:1: rule__Statement__Group_4__1 : rule__Statement__Group_4__1__Impl ;
    public final void rule__Statement__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1122:1: ( rule__Statement__Group_4__1__Impl )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1123:2: rule__Statement__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Statement__Group_4__1__Impl_in_rule__Statement__Group_4__12438);
            rule__Statement__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_4__1"


    // $ANTLR start "rule__Statement__Group_4__1__Impl"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1129:1: rule__Statement__Group_4__1__Impl : ( ';' ) ;
    public final void rule__Statement__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1133:1: ( ( ';' ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1134:1: ( ';' )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1134:1: ( ';' )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1135:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getSemicolonKeyword_4_1()); 
            }
            match(input,16,FOLLOW_16_in_rule__Statement__Group_4__1__Impl2466); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getSemicolonKeyword_4_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_4__1__Impl"


    // $ANTLR start "rule__Statement__Group_8__0"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1152:1: rule__Statement__Group_8__0 : rule__Statement__Group_8__0__Impl rule__Statement__Group_8__1 ;
    public final void rule__Statement__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1156:1: ( rule__Statement__Group_8__0__Impl rule__Statement__Group_8__1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1157:2: rule__Statement__Group_8__0__Impl rule__Statement__Group_8__1
            {
            pushFollow(FOLLOW_rule__Statement__Group_8__0__Impl_in_rule__Statement__Group_8__02501);
            rule__Statement__Group_8__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Statement__Group_8__1_in_rule__Statement__Group_8__02504);
            rule__Statement__Group_8__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_8__0"


    // $ANTLR start "rule__Statement__Group_8__0__Impl"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1164:1: rule__Statement__Group_8__0__Impl : ( ruleAffectation ) ;
    public final void rule__Statement__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1168:1: ( ( ruleAffectation ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1169:1: ( ruleAffectation )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1169:1: ( ruleAffectation )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1170:1: ruleAffectation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getAffectationParserRuleCall_8_0()); 
            }
            pushFollow(FOLLOW_ruleAffectation_in_rule__Statement__Group_8__0__Impl2531);
            ruleAffectation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getAffectationParserRuleCall_8_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_8__0__Impl"


    // $ANTLR start "rule__Statement__Group_8__1"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1181:1: rule__Statement__Group_8__1 : rule__Statement__Group_8__1__Impl ;
    public final void rule__Statement__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1185:1: ( rule__Statement__Group_8__1__Impl )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1186:2: rule__Statement__Group_8__1__Impl
            {
            pushFollow(FOLLOW_rule__Statement__Group_8__1__Impl_in_rule__Statement__Group_8__12560);
            rule__Statement__Group_8__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_8__1"


    // $ANTLR start "rule__Statement__Group_8__1__Impl"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1192:1: rule__Statement__Group_8__1__Impl : ( ';' ) ;
    public final void rule__Statement__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1196:1: ( ( ';' ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1197:1: ( ';' )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1197:1: ( ';' )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1198:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getSemicolonKeyword_8_1()); 
            }
            match(input,16,FOLLOW_16_in_rule__Statement__Group_8__1__Impl2588); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getSemicolonKeyword_8_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_8__1__Impl"


    // $ANTLR start "rule__StatementBlock__Group__0"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1215:1: rule__StatementBlock__Group__0 : rule__StatementBlock__Group__0__Impl rule__StatementBlock__Group__1 ;
    public final void rule__StatementBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1219:1: ( rule__StatementBlock__Group__0__Impl rule__StatementBlock__Group__1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1220:2: rule__StatementBlock__Group__0__Impl rule__StatementBlock__Group__1
            {
            pushFollow(FOLLOW_rule__StatementBlock__Group__0__Impl_in_rule__StatementBlock__Group__02623);
            rule__StatementBlock__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__StatementBlock__Group__1_in_rule__StatementBlock__Group__02626);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1227:1: rule__StatementBlock__Group__0__Impl : ( '{' ) ;
    public final void rule__StatementBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1231:1: ( ( '{' ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1232:1: ( '{' )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1232:1: ( '{' )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1233:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementBlockAccess().getLeftCurlyBracketKeyword_0()); 
            }
            match(input,17,FOLLOW_17_in_rule__StatementBlock__Group__0__Impl2654); if (state.failed) return ;
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1246:1: rule__StatementBlock__Group__1 : rule__StatementBlock__Group__1__Impl rule__StatementBlock__Group__2 ;
    public final void rule__StatementBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1250:1: ( rule__StatementBlock__Group__1__Impl rule__StatementBlock__Group__2 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1251:2: rule__StatementBlock__Group__1__Impl rule__StatementBlock__Group__2
            {
            pushFollow(FOLLOW_rule__StatementBlock__Group__1__Impl_in_rule__StatementBlock__Group__12685);
            rule__StatementBlock__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__StatementBlock__Group__2_in_rule__StatementBlock__Group__12688);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1258:1: rule__StatementBlock__Group__1__Impl : ( () ) ;
    public final void rule__StatementBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1262:1: ( ( () ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1263:1: ( () )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1263:1: ( () )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1264:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementBlockAccess().getStatementBlockAction_1()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1265:1: ()
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1267:1: 
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1277:1: rule__StatementBlock__Group__2 : rule__StatementBlock__Group__2__Impl rule__StatementBlock__Group__3 ;
    public final void rule__StatementBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1281:1: ( rule__StatementBlock__Group__2__Impl rule__StatementBlock__Group__3 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1282:2: rule__StatementBlock__Group__2__Impl rule__StatementBlock__Group__3
            {
            pushFollow(FOLLOW_rule__StatementBlock__Group__2__Impl_in_rule__StatementBlock__Group__22746);
            rule__StatementBlock__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__StatementBlock__Group__3_in_rule__StatementBlock__Group__22749);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1289:1: rule__StatementBlock__Group__2__Impl : ( ( rule__StatementBlock__StatementsAssignment_2 )* ) ;
    public final void rule__StatementBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1293:1: ( ( ( rule__StatementBlock__StatementsAssignment_2 )* ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1294:1: ( ( rule__StatementBlock__StatementsAssignment_2 )* )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1294:1: ( ( rule__StatementBlock__StatementsAssignment_2 )* )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1295:1: ( rule__StatementBlock__StatementsAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementBlockAccess().getStatementsAssignment_2()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1296:1: ( rule__StatementBlock__StatementsAssignment_2 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID||LA10_0==17||LA10_0==20||(LA10_0>=24 && LA10_0<=26)||LA10_0==29||LA10_0==31||LA10_0==46) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1296:2: rule__StatementBlock__StatementsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__StatementBlock__StatementsAssignment_2_in_rule__StatementBlock__Group__2__Impl2776);
            	    rule__StatementBlock__StatementsAssignment_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop10;
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1306:1: rule__StatementBlock__Group__3 : rule__StatementBlock__Group__3__Impl ;
    public final void rule__StatementBlock__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1310:1: ( rule__StatementBlock__Group__3__Impl )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1311:2: rule__StatementBlock__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__StatementBlock__Group__3__Impl_in_rule__StatementBlock__Group__32807);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1317:1: rule__StatementBlock__Group__3__Impl : ( '}' ) ;
    public final void rule__StatementBlock__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1321:1: ( ( '}' ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1322:1: ( '}' )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1322:1: ( '}' )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1323:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementBlockAccess().getRightCurlyBracketKeyword_3()); 
            }
            match(input,18,FOLLOW_18_in_rule__StatementBlock__Group__3__Impl2835); if (state.failed) return ;
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1344:1: rule__Affectation__Group__0 : rule__Affectation__Group__0__Impl rule__Affectation__Group__1 ;
    public final void rule__Affectation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1348:1: ( rule__Affectation__Group__0__Impl rule__Affectation__Group__1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1349:2: rule__Affectation__Group__0__Impl rule__Affectation__Group__1
            {
            pushFollow(FOLLOW_rule__Affectation__Group__0__Impl_in_rule__Affectation__Group__02874);
            rule__Affectation__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Affectation__Group__1_in_rule__Affectation__Group__02877);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1356:1: rule__Affectation__Group__0__Impl : ( ( rule__Affectation__VariableAssignment_0 ) ) ;
    public final void rule__Affectation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1360:1: ( ( ( rule__Affectation__VariableAssignment_0 ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1361:1: ( ( rule__Affectation__VariableAssignment_0 ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1361:1: ( ( rule__Affectation__VariableAssignment_0 ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1362:1: ( rule__Affectation__VariableAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAffectationAccess().getVariableAssignment_0()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1363:1: ( rule__Affectation__VariableAssignment_0 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1363:2: rule__Affectation__VariableAssignment_0
            {
            pushFollow(FOLLOW_rule__Affectation__VariableAssignment_0_in_rule__Affectation__Group__0__Impl2904);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1373:1: rule__Affectation__Group__1 : rule__Affectation__Group__1__Impl rule__Affectation__Group__2 ;
    public final void rule__Affectation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1377:1: ( rule__Affectation__Group__1__Impl rule__Affectation__Group__2 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1378:2: rule__Affectation__Group__1__Impl rule__Affectation__Group__2
            {
            pushFollow(FOLLOW_rule__Affectation__Group__1__Impl_in_rule__Affectation__Group__12934);
            rule__Affectation__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Affectation__Group__2_in_rule__Affectation__Group__12937);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1385:1: rule__Affectation__Group__1__Impl : ( '=' ) ;
    public final void rule__Affectation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1389:1: ( ( '=' ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1390:1: ( '=' )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1390:1: ( '=' )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1391:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAffectationAccess().getEqualsSignKeyword_1()); 
            }
            match(input,19,FOLLOW_19_in_rule__Affectation__Group__1__Impl2965); if (state.failed) return ;
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1404:1: rule__Affectation__Group__2 : rule__Affectation__Group__2__Impl ;
    public final void rule__Affectation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1408:1: ( rule__Affectation__Group__2__Impl )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1409:2: rule__Affectation__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Affectation__Group__2__Impl_in_rule__Affectation__Group__22996);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1415:1: rule__Affectation__Group__2__Impl : ( ( rule__Affectation__ValueAssignment_2 ) ) ;
    public final void rule__Affectation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1419:1: ( ( ( rule__Affectation__ValueAssignment_2 ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1420:1: ( ( rule__Affectation__ValueAssignment_2 ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1420:1: ( ( rule__Affectation__ValueAssignment_2 ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1421:1: ( rule__Affectation__ValueAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAffectationAccess().getValueAssignment_2()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1422:1: ( rule__Affectation__ValueAssignment_2 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1422:2: rule__Affectation__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__Affectation__ValueAssignment_2_in_rule__Affectation__Group__2__Impl3023);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1438:1: rule__If__Group__0 : rule__If__Group__0__Impl rule__If__Group__1 ;
    public final void rule__If__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1442:1: ( rule__If__Group__0__Impl rule__If__Group__1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1443:2: rule__If__Group__0__Impl rule__If__Group__1
            {
            pushFollow(FOLLOW_rule__If__Group__0__Impl_in_rule__If__Group__03059);
            rule__If__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__If__Group__1_in_rule__If__Group__03062);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1450:1: rule__If__Group__0__Impl : ( 'if' ) ;
    public final void rule__If__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1454:1: ( ( 'if' ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1455:1: ( 'if' )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1455:1: ( 'if' )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1456:1: 'if'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getIfKeyword_0()); 
            }
            match(input,20,FOLLOW_20_in_rule__If__Group__0__Impl3090); if (state.failed) return ;
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1469:1: rule__If__Group__1 : rule__If__Group__1__Impl rule__If__Group__2 ;
    public final void rule__If__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1473:1: ( rule__If__Group__1__Impl rule__If__Group__2 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1474:2: rule__If__Group__1__Impl rule__If__Group__2
            {
            pushFollow(FOLLOW_rule__If__Group__1__Impl_in_rule__If__Group__13121);
            rule__If__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__If__Group__2_in_rule__If__Group__13124);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1481:1: rule__If__Group__1__Impl : ( '(' ) ;
    public final void rule__If__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1485:1: ( ( '(' ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1486:1: ( '(' )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1486:1: ( '(' )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1487:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,21,FOLLOW_21_in_rule__If__Group__1__Impl3152); if (state.failed) return ;
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1500:1: rule__If__Group__2 : rule__If__Group__2__Impl rule__If__Group__3 ;
    public final void rule__If__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1504:1: ( rule__If__Group__2__Impl rule__If__Group__3 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1505:2: rule__If__Group__2__Impl rule__If__Group__3
            {
            pushFollow(FOLLOW_rule__If__Group__2__Impl_in_rule__If__Group__23183);
            rule__If__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__If__Group__3_in_rule__If__Group__23186);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1512:1: rule__If__Group__2__Impl : ( ( rule__If__ConditionAssignment_2 ) ) ;
    public final void rule__If__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1516:1: ( ( ( rule__If__ConditionAssignment_2 ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1517:1: ( ( rule__If__ConditionAssignment_2 ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1517:1: ( ( rule__If__ConditionAssignment_2 ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1518:1: ( rule__If__ConditionAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getConditionAssignment_2()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1519:1: ( rule__If__ConditionAssignment_2 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1519:2: rule__If__ConditionAssignment_2
            {
            pushFollow(FOLLOW_rule__If__ConditionAssignment_2_in_rule__If__Group__2__Impl3213);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1529:1: rule__If__Group__3 : rule__If__Group__3__Impl rule__If__Group__4 ;
    public final void rule__If__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1533:1: ( rule__If__Group__3__Impl rule__If__Group__4 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1534:2: rule__If__Group__3__Impl rule__If__Group__4
            {
            pushFollow(FOLLOW_rule__If__Group__3__Impl_in_rule__If__Group__33243);
            rule__If__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__If__Group__4_in_rule__If__Group__33246);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1541:1: rule__If__Group__3__Impl : ( ')' ) ;
    public final void rule__If__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1545:1: ( ( ')' ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1546:1: ( ')' )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1546:1: ( ')' )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1547:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getRightParenthesisKeyword_3()); 
            }
            match(input,22,FOLLOW_22_in_rule__If__Group__3__Impl3274); if (state.failed) return ;
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1560:1: rule__If__Group__4 : rule__If__Group__4__Impl rule__If__Group__5 ;
    public final void rule__If__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1564:1: ( rule__If__Group__4__Impl rule__If__Group__5 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1565:2: rule__If__Group__4__Impl rule__If__Group__5
            {
            pushFollow(FOLLOW_rule__If__Group__4__Impl_in_rule__If__Group__43305);
            rule__If__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__If__Group__5_in_rule__If__Group__43308);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1572:1: rule__If__Group__4__Impl : ( ( rule__If__ThenAssignment_4 ) ) ;
    public final void rule__If__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1576:1: ( ( ( rule__If__ThenAssignment_4 ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1577:1: ( ( rule__If__ThenAssignment_4 ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1577:1: ( ( rule__If__ThenAssignment_4 ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1578:1: ( rule__If__ThenAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getThenAssignment_4()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1579:1: ( rule__If__ThenAssignment_4 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1579:2: rule__If__ThenAssignment_4
            {
            pushFollow(FOLLOW_rule__If__ThenAssignment_4_in_rule__If__Group__4__Impl3335);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1589:1: rule__If__Group__5 : rule__If__Group__5__Impl ;
    public final void rule__If__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1593:1: ( rule__If__Group__5__Impl )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1594:2: rule__If__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__If__Group__5__Impl_in_rule__If__Group__53365);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1600:1: rule__If__Group__5__Impl : ( ( rule__If__Group_5__0 )? ) ;
    public final void rule__If__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1604:1: ( ( ( rule__If__Group_5__0 )? ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1605:1: ( ( rule__If__Group_5__0 )? )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1605:1: ( ( rule__If__Group_5__0 )? )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1606:1: ( rule__If__Group_5__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getGroup_5()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1607:1: ( rule__If__Group_5__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==23) ) {
                int LA11_1 = input.LA(2);

                if ( (synpred30_InternalLeek()) ) {
                    alt11=1;
                }
            }
            switch (alt11) {
                case 1 :
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1607:2: rule__If__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__If__Group_5__0_in_rule__If__Group__5__Impl3392);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1629:1: rule__If__Group_5__0 : rule__If__Group_5__0__Impl rule__If__Group_5__1 ;
    public final void rule__If__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1633:1: ( rule__If__Group_5__0__Impl rule__If__Group_5__1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1634:2: rule__If__Group_5__0__Impl rule__If__Group_5__1
            {
            pushFollow(FOLLOW_rule__If__Group_5__0__Impl_in_rule__If__Group_5__03435);
            rule__If__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__If__Group_5__1_in_rule__If__Group_5__03438);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1641:1: rule__If__Group_5__0__Impl : ( ( 'else' ) ) ;
    public final void rule__If__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1645:1: ( ( ( 'else' ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1646:1: ( ( 'else' ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1646:1: ( ( 'else' ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1647:1: ( 'else' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getElseKeyword_5_0()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1648:1: ( 'else' )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1649:2: 'else'
            {
            match(input,23,FOLLOW_23_in_rule__If__Group_5__0__Impl3467); if (state.failed) return ;

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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1660:1: rule__If__Group_5__1 : rule__If__Group_5__1__Impl ;
    public final void rule__If__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1664:1: ( rule__If__Group_5__1__Impl )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1665:2: rule__If__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__If__Group_5__1__Impl_in_rule__If__Group_5__13499);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1671:1: rule__If__Group_5__1__Impl : ( ( rule__If__ElseAssignment_5_1 ) ) ;
    public final void rule__If__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1675:1: ( ( ( rule__If__ElseAssignment_5_1 ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1676:1: ( ( rule__If__ElseAssignment_5_1 ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1676:1: ( ( rule__If__ElseAssignment_5_1 ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1677:1: ( rule__If__ElseAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getElseAssignment_5_1()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1678:1: ( rule__If__ElseAssignment_5_1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1678:2: rule__If__ElseAssignment_5_1
            {
            pushFollow(FOLLOW_rule__If__ElseAssignment_5_1_in_rule__If__Group_5__1__Impl3526);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1692:1: rule__While__Group__0 : rule__While__Group__0__Impl rule__While__Group__1 ;
    public final void rule__While__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1696:1: ( rule__While__Group__0__Impl rule__While__Group__1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1697:2: rule__While__Group__0__Impl rule__While__Group__1
            {
            pushFollow(FOLLOW_rule__While__Group__0__Impl_in_rule__While__Group__03560);
            rule__While__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__While__Group__1_in_rule__While__Group__03563);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1704:1: rule__While__Group__0__Impl : ( 'while' ) ;
    public final void rule__While__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1708:1: ( ( 'while' ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1709:1: ( 'while' )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1709:1: ( 'while' )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1710:1: 'while'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileAccess().getWhileKeyword_0()); 
            }
            match(input,24,FOLLOW_24_in_rule__While__Group__0__Impl3591); if (state.failed) return ;
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1723:1: rule__While__Group__1 : rule__While__Group__1__Impl rule__While__Group__2 ;
    public final void rule__While__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1727:1: ( rule__While__Group__1__Impl rule__While__Group__2 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1728:2: rule__While__Group__1__Impl rule__While__Group__2
            {
            pushFollow(FOLLOW_rule__While__Group__1__Impl_in_rule__While__Group__13622);
            rule__While__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__While__Group__2_in_rule__While__Group__13625);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1735:1: rule__While__Group__1__Impl : ( '(' ) ;
    public final void rule__While__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1739:1: ( ( '(' ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1740:1: ( '(' )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1740:1: ( '(' )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1741:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,21,FOLLOW_21_in_rule__While__Group__1__Impl3653); if (state.failed) return ;
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1754:1: rule__While__Group__2 : rule__While__Group__2__Impl rule__While__Group__3 ;
    public final void rule__While__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1758:1: ( rule__While__Group__2__Impl rule__While__Group__3 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1759:2: rule__While__Group__2__Impl rule__While__Group__3
            {
            pushFollow(FOLLOW_rule__While__Group__2__Impl_in_rule__While__Group__23684);
            rule__While__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__While__Group__3_in_rule__While__Group__23687);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1766:1: rule__While__Group__2__Impl : ( ( rule__While__ConditionAssignment_2 ) ) ;
    public final void rule__While__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1770:1: ( ( ( rule__While__ConditionAssignment_2 ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1771:1: ( ( rule__While__ConditionAssignment_2 ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1771:1: ( ( rule__While__ConditionAssignment_2 ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1772:1: ( rule__While__ConditionAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileAccess().getConditionAssignment_2()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1773:1: ( rule__While__ConditionAssignment_2 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1773:2: rule__While__ConditionAssignment_2
            {
            pushFollow(FOLLOW_rule__While__ConditionAssignment_2_in_rule__While__Group__2__Impl3714);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1783:1: rule__While__Group__3 : rule__While__Group__3__Impl rule__While__Group__4 ;
    public final void rule__While__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1787:1: ( rule__While__Group__3__Impl rule__While__Group__4 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1788:2: rule__While__Group__3__Impl rule__While__Group__4
            {
            pushFollow(FOLLOW_rule__While__Group__3__Impl_in_rule__While__Group__33744);
            rule__While__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__While__Group__4_in_rule__While__Group__33747);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1795:1: rule__While__Group__3__Impl : ( ')' ) ;
    public final void rule__While__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1799:1: ( ( ')' ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1800:1: ( ')' )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1800:1: ( ')' )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1801:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileAccess().getRightParenthesisKeyword_3()); 
            }
            match(input,22,FOLLOW_22_in_rule__While__Group__3__Impl3775); if (state.failed) return ;
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1814:1: rule__While__Group__4 : rule__While__Group__4__Impl ;
    public final void rule__While__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1818:1: ( rule__While__Group__4__Impl )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1819:2: rule__While__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__While__Group__4__Impl_in_rule__While__Group__43806);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1825:1: rule__While__Group__4__Impl : ( ( rule__While__StatementAssignment_4 ) ) ;
    public final void rule__While__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1829:1: ( ( ( rule__While__StatementAssignment_4 ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1830:1: ( ( rule__While__StatementAssignment_4 ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1830:1: ( ( rule__While__StatementAssignment_4 ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1831:1: ( rule__While__StatementAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileAccess().getStatementAssignment_4()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1832:1: ( rule__While__StatementAssignment_4 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1832:2: rule__While__StatementAssignment_4
            {
            pushFollow(FOLLOW_rule__While__StatementAssignment_4_in_rule__While__Group__4__Impl3833);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1852:1: rule__For__Group__0 : rule__For__Group__0__Impl rule__For__Group__1 ;
    public final void rule__For__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1856:1: ( rule__For__Group__0__Impl rule__For__Group__1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1857:2: rule__For__Group__0__Impl rule__For__Group__1
            {
            pushFollow(FOLLOW_rule__For__Group__0__Impl_in_rule__For__Group__03873);
            rule__For__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__For__Group__1_in_rule__For__Group__03876);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1864:1: rule__For__Group__0__Impl : ( 'for' ) ;
    public final void rule__For__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1868:1: ( ( 'for' ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1869:1: ( 'for' )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1869:1: ( 'for' )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1870:1: 'for'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForAccess().getForKeyword_0()); 
            }
            match(input,25,FOLLOW_25_in_rule__For__Group__0__Impl3904); if (state.failed) return ;
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1883:1: rule__For__Group__1 : rule__For__Group__1__Impl rule__For__Group__2 ;
    public final void rule__For__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1887:1: ( rule__For__Group__1__Impl rule__For__Group__2 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1888:2: rule__For__Group__1__Impl rule__For__Group__2
            {
            pushFollow(FOLLOW_rule__For__Group__1__Impl_in_rule__For__Group__13935);
            rule__For__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__For__Group__2_in_rule__For__Group__13938);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1895:1: rule__For__Group__1__Impl : ( '(' ) ;
    public final void rule__For__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1899:1: ( ( '(' ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1900:1: ( '(' )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1900:1: ( '(' )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1901:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,21,FOLLOW_21_in_rule__For__Group__1__Impl3966); if (state.failed) return ;
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1914:1: rule__For__Group__2 : rule__For__Group__2__Impl rule__For__Group__3 ;
    public final void rule__For__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1918:1: ( rule__For__Group__2__Impl rule__For__Group__3 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1919:2: rule__For__Group__2__Impl rule__For__Group__3
            {
            pushFollow(FOLLOW_rule__For__Group__2__Impl_in_rule__For__Group__23997);
            rule__For__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__For__Group__3_in_rule__For__Group__24000);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1926:1: rule__For__Group__2__Impl : ( ( rule__For__IteratorAssignment_2 ) ) ;
    public final void rule__For__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1930:1: ( ( ( rule__For__IteratorAssignment_2 ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1931:1: ( ( rule__For__IteratorAssignment_2 ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1931:1: ( ( rule__For__IteratorAssignment_2 ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1932:1: ( rule__For__IteratorAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForAccess().getIteratorAssignment_2()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1933:1: ( rule__For__IteratorAssignment_2 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1933:2: rule__For__IteratorAssignment_2
            {
            pushFollow(FOLLOW_rule__For__IteratorAssignment_2_in_rule__For__Group__2__Impl4027);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1943:1: rule__For__Group__3 : rule__For__Group__3__Impl rule__For__Group__4 ;
    public final void rule__For__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1947:1: ( rule__For__Group__3__Impl rule__For__Group__4 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1948:2: rule__For__Group__3__Impl rule__For__Group__4
            {
            pushFollow(FOLLOW_rule__For__Group__3__Impl_in_rule__For__Group__34057);
            rule__For__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__For__Group__4_in_rule__For__Group__34060);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1955:1: rule__For__Group__3__Impl : ( ')' ) ;
    public final void rule__For__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1959:1: ( ( ')' ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1960:1: ( ')' )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1960:1: ( ')' )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1961:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForAccess().getRightParenthesisKeyword_3()); 
            }
            match(input,22,FOLLOW_22_in_rule__For__Group__3__Impl4088); if (state.failed) return ;
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1974:1: rule__For__Group__4 : rule__For__Group__4__Impl ;
    public final void rule__For__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1978:1: ( rule__For__Group__4__Impl )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1979:2: rule__For__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__For__Group__4__Impl_in_rule__For__Group__44119);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1985:1: rule__For__Group__4__Impl : ( ( rule__For__StatementAssignment_4 ) ) ;
    public final void rule__For__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1989:1: ( ( ( rule__For__StatementAssignment_4 ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1990:1: ( ( rule__For__StatementAssignment_4 ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1990:1: ( ( rule__For__StatementAssignment_4 ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1991:1: ( rule__For__StatementAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForAccess().getStatementAssignment_4()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1992:1: ( rule__For__StatementAssignment_4 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1992:2: rule__For__StatementAssignment_4
            {
            pushFollow(FOLLOW_rule__For__StatementAssignment_4_in_rule__For__Group__4__Impl4146);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2012:1: rule__EachIterator__Group__0 : rule__EachIterator__Group__0__Impl rule__EachIterator__Group__1 ;
    public final void rule__EachIterator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2016:1: ( rule__EachIterator__Group__0__Impl rule__EachIterator__Group__1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2017:2: rule__EachIterator__Group__0__Impl rule__EachIterator__Group__1
            {
            pushFollow(FOLLOW_rule__EachIterator__Group__0__Impl_in_rule__EachIterator__Group__04186);
            rule__EachIterator__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EachIterator__Group__1_in_rule__EachIterator__Group__04189);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2024:1: rule__EachIterator__Group__0__Impl : ( ( rule__EachIterator__Group_0__0 )? ) ;
    public final void rule__EachIterator__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2028:1: ( ( ( rule__EachIterator__Group_0__0 )? ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2029:1: ( ( rule__EachIterator__Group_0__0 )? )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2029:1: ( ( rule__EachIterator__Group_0__0 )? )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2030:1: ( rule__EachIterator__Group_0__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEachIteratorAccess().getGroup_0()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2031:1: ( rule__EachIterator__Group_0__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==26) ) {
                int LA12_1 = input.LA(2);

                if ( (synpred31_InternalLeek()) ) {
                    alt12=1;
                }
            }
            switch (alt12) {
                case 1 :
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2031:2: rule__EachIterator__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__EachIterator__Group_0__0_in_rule__EachIterator__Group__0__Impl4216);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2041:1: rule__EachIterator__Group__1 : rule__EachIterator__Group__1__Impl rule__EachIterator__Group__2 ;
    public final void rule__EachIterator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2045:1: ( rule__EachIterator__Group__1__Impl rule__EachIterator__Group__2 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2046:2: rule__EachIterator__Group__1__Impl rule__EachIterator__Group__2
            {
            pushFollow(FOLLOW_rule__EachIterator__Group__1__Impl_in_rule__EachIterator__Group__14247);
            rule__EachIterator__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EachIterator__Group__2_in_rule__EachIterator__Group__14250);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2053:1: rule__EachIterator__Group__1__Impl : ( 'var' ) ;
    public final void rule__EachIterator__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2057:1: ( ( 'var' ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2058:1: ( 'var' )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2058:1: ( 'var' )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2059:1: 'var'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEachIteratorAccess().getVarKeyword_1()); 
            }
            match(input,26,FOLLOW_26_in_rule__EachIterator__Group__1__Impl4278); if (state.failed) return ;
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2072:1: rule__EachIterator__Group__2 : rule__EachIterator__Group__2__Impl rule__EachIterator__Group__3 ;
    public final void rule__EachIterator__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2076:1: ( rule__EachIterator__Group__2__Impl rule__EachIterator__Group__3 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2077:2: rule__EachIterator__Group__2__Impl rule__EachIterator__Group__3
            {
            pushFollow(FOLLOW_rule__EachIterator__Group__2__Impl_in_rule__EachIterator__Group__24309);
            rule__EachIterator__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EachIterator__Group__3_in_rule__EachIterator__Group__24312);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2084:1: rule__EachIterator__Group__2__Impl : ( ( rule__EachIterator__ValueAssignment_2 ) ) ;
    public final void rule__EachIterator__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2088:1: ( ( ( rule__EachIterator__ValueAssignment_2 ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2089:1: ( ( rule__EachIterator__ValueAssignment_2 ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2089:1: ( ( rule__EachIterator__ValueAssignment_2 ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2090:1: ( rule__EachIterator__ValueAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEachIteratorAccess().getValueAssignment_2()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2091:1: ( rule__EachIterator__ValueAssignment_2 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2091:2: rule__EachIterator__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__EachIterator__ValueAssignment_2_in_rule__EachIterator__Group__2__Impl4339);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2101:1: rule__EachIterator__Group__3 : rule__EachIterator__Group__3__Impl rule__EachIterator__Group__4 ;
    public final void rule__EachIterator__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2105:1: ( rule__EachIterator__Group__3__Impl rule__EachIterator__Group__4 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2106:2: rule__EachIterator__Group__3__Impl rule__EachIterator__Group__4
            {
            pushFollow(FOLLOW_rule__EachIterator__Group__3__Impl_in_rule__EachIterator__Group__34369);
            rule__EachIterator__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EachIterator__Group__4_in_rule__EachIterator__Group__34372);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2113:1: rule__EachIterator__Group__3__Impl : ( 'in' ) ;
    public final void rule__EachIterator__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2117:1: ( ( 'in' ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2118:1: ( 'in' )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2118:1: ( 'in' )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2119:1: 'in'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEachIteratorAccess().getInKeyword_3()); 
            }
            match(input,27,FOLLOW_27_in_rule__EachIterator__Group__3__Impl4400); if (state.failed) return ;
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2132:1: rule__EachIterator__Group__4 : rule__EachIterator__Group__4__Impl ;
    public final void rule__EachIterator__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2136:1: ( rule__EachIterator__Group__4__Impl )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2137:2: rule__EachIterator__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__EachIterator__Group__4__Impl_in_rule__EachIterator__Group__44431);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2143:1: rule__EachIterator__Group__4__Impl : ( ( rule__EachIterator__ArrayAssignment_4 ) ) ;
    public final void rule__EachIterator__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2147:1: ( ( ( rule__EachIterator__ArrayAssignment_4 ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2148:1: ( ( rule__EachIterator__ArrayAssignment_4 ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2148:1: ( ( rule__EachIterator__ArrayAssignment_4 ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2149:1: ( rule__EachIterator__ArrayAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEachIteratorAccess().getArrayAssignment_4()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2150:1: ( rule__EachIterator__ArrayAssignment_4 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2150:2: rule__EachIterator__ArrayAssignment_4
            {
            pushFollow(FOLLOW_rule__EachIterator__ArrayAssignment_4_in_rule__EachIterator__Group__4__Impl4458);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2170:1: rule__EachIterator__Group_0__0 : rule__EachIterator__Group_0__0__Impl rule__EachIterator__Group_0__1 ;
    public final void rule__EachIterator__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2174:1: ( rule__EachIterator__Group_0__0__Impl rule__EachIterator__Group_0__1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2175:2: rule__EachIterator__Group_0__0__Impl rule__EachIterator__Group_0__1
            {
            pushFollow(FOLLOW_rule__EachIterator__Group_0__0__Impl_in_rule__EachIterator__Group_0__04498);
            rule__EachIterator__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EachIterator__Group_0__1_in_rule__EachIterator__Group_0__04501);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2182:1: rule__EachIterator__Group_0__0__Impl : ( ( 'var' ) ) ;
    public final void rule__EachIterator__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2186:1: ( ( ( 'var' ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2187:1: ( ( 'var' ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2187:1: ( ( 'var' ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2188:1: ( 'var' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEachIteratorAccess().getVarKeyword_0_0()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2189:1: ( 'var' )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2190:2: 'var'
            {
            match(input,26,FOLLOW_26_in_rule__EachIterator__Group_0__0__Impl4530); if (state.failed) return ;

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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2201:1: rule__EachIterator__Group_0__1 : rule__EachIterator__Group_0__1__Impl rule__EachIterator__Group_0__2 ;
    public final void rule__EachIterator__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2205:1: ( rule__EachIterator__Group_0__1__Impl rule__EachIterator__Group_0__2 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2206:2: rule__EachIterator__Group_0__1__Impl rule__EachIterator__Group_0__2
            {
            pushFollow(FOLLOW_rule__EachIterator__Group_0__1__Impl_in_rule__EachIterator__Group_0__14562);
            rule__EachIterator__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EachIterator__Group_0__2_in_rule__EachIterator__Group_0__14565);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2213:1: rule__EachIterator__Group_0__1__Impl : ( ( rule__EachIterator__KeyAssignment_0_1 ) ) ;
    public final void rule__EachIterator__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2217:1: ( ( ( rule__EachIterator__KeyAssignment_0_1 ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2218:1: ( ( rule__EachIterator__KeyAssignment_0_1 ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2218:1: ( ( rule__EachIterator__KeyAssignment_0_1 ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2219:1: ( rule__EachIterator__KeyAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEachIteratorAccess().getKeyAssignment_0_1()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2220:1: ( rule__EachIterator__KeyAssignment_0_1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2220:2: rule__EachIterator__KeyAssignment_0_1
            {
            pushFollow(FOLLOW_rule__EachIterator__KeyAssignment_0_1_in_rule__EachIterator__Group_0__1__Impl4592);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2230:1: rule__EachIterator__Group_0__2 : rule__EachIterator__Group_0__2__Impl ;
    public final void rule__EachIterator__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2234:1: ( rule__EachIterator__Group_0__2__Impl )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2235:2: rule__EachIterator__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__EachIterator__Group_0__2__Impl_in_rule__EachIterator__Group_0__24622);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2241:1: rule__EachIterator__Group_0__2__Impl : ( ':' ) ;
    public final void rule__EachIterator__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2245:1: ( ( ':' ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2246:1: ( ':' )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2246:1: ( ':' )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2247:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEachIteratorAccess().getColonKeyword_0_2()); 
            }
            match(input,28,FOLLOW_28_in_rule__EachIterator__Group_0__2__Impl4650); if (state.failed) return ;
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2266:1: rule__VariableIterator__Group__0 : rule__VariableIterator__Group__0__Impl rule__VariableIterator__Group__1 ;
    public final void rule__VariableIterator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2270:1: ( rule__VariableIterator__Group__0__Impl rule__VariableIterator__Group__1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2271:2: rule__VariableIterator__Group__0__Impl rule__VariableIterator__Group__1
            {
            pushFollow(FOLLOW_rule__VariableIterator__Group__0__Impl_in_rule__VariableIterator__Group__04687);
            rule__VariableIterator__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__VariableIterator__Group__1_in_rule__VariableIterator__Group__04690);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2278:1: rule__VariableIterator__Group__0__Impl : ( ( rule__VariableIterator__InitializationAssignment_0 ) ) ;
    public final void rule__VariableIterator__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2282:1: ( ( ( rule__VariableIterator__InitializationAssignment_0 ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2283:1: ( ( rule__VariableIterator__InitializationAssignment_0 ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2283:1: ( ( rule__VariableIterator__InitializationAssignment_0 ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2284:1: ( rule__VariableIterator__InitializationAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableIteratorAccess().getInitializationAssignment_0()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2285:1: ( rule__VariableIterator__InitializationAssignment_0 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2285:2: rule__VariableIterator__InitializationAssignment_0
            {
            pushFollow(FOLLOW_rule__VariableIterator__InitializationAssignment_0_in_rule__VariableIterator__Group__0__Impl4717);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2295:1: rule__VariableIterator__Group__1 : rule__VariableIterator__Group__1__Impl rule__VariableIterator__Group__2 ;
    public final void rule__VariableIterator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2299:1: ( rule__VariableIterator__Group__1__Impl rule__VariableIterator__Group__2 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2300:2: rule__VariableIterator__Group__1__Impl rule__VariableIterator__Group__2
            {
            pushFollow(FOLLOW_rule__VariableIterator__Group__1__Impl_in_rule__VariableIterator__Group__14747);
            rule__VariableIterator__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__VariableIterator__Group__2_in_rule__VariableIterator__Group__14750);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2307:1: rule__VariableIterator__Group__1__Impl : ( ';' ) ;
    public final void rule__VariableIterator__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2311:1: ( ( ';' ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2312:1: ( ';' )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2312:1: ( ';' )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2313:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableIteratorAccess().getSemicolonKeyword_1()); 
            }
            match(input,16,FOLLOW_16_in_rule__VariableIterator__Group__1__Impl4778); if (state.failed) return ;
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2326:1: rule__VariableIterator__Group__2 : rule__VariableIterator__Group__2__Impl rule__VariableIterator__Group__3 ;
    public final void rule__VariableIterator__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2330:1: ( rule__VariableIterator__Group__2__Impl rule__VariableIterator__Group__3 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2331:2: rule__VariableIterator__Group__2__Impl rule__VariableIterator__Group__3
            {
            pushFollow(FOLLOW_rule__VariableIterator__Group__2__Impl_in_rule__VariableIterator__Group__24809);
            rule__VariableIterator__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__VariableIterator__Group__3_in_rule__VariableIterator__Group__24812);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2338:1: rule__VariableIterator__Group__2__Impl : ( ( rule__VariableIterator__ConditionAssignment_2 ) ) ;
    public final void rule__VariableIterator__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2342:1: ( ( ( rule__VariableIterator__ConditionAssignment_2 ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2343:1: ( ( rule__VariableIterator__ConditionAssignment_2 ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2343:1: ( ( rule__VariableIterator__ConditionAssignment_2 ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2344:1: ( rule__VariableIterator__ConditionAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableIteratorAccess().getConditionAssignment_2()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2345:1: ( rule__VariableIterator__ConditionAssignment_2 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2345:2: rule__VariableIterator__ConditionAssignment_2
            {
            pushFollow(FOLLOW_rule__VariableIterator__ConditionAssignment_2_in_rule__VariableIterator__Group__2__Impl4839);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2355:1: rule__VariableIterator__Group__3 : rule__VariableIterator__Group__3__Impl rule__VariableIterator__Group__4 ;
    public final void rule__VariableIterator__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2359:1: ( rule__VariableIterator__Group__3__Impl rule__VariableIterator__Group__4 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2360:2: rule__VariableIterator__Group__3__Impl rule__VariableIterator__Group__4
            {
            pushFollow(FOLLOW_rule__VariableIterator__Group__3__Impl_in_rule__VariableIterator__Group__34869);
            rule__VariableIterator__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__VariableIterator__Group__4_in_rule__VariableIterator__Group__34872);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2367:1: rule__VariableIterator__Group__3__Impl : ( ';' ) ;
    public final void rule__VariableIterator__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2371:1: ( ( ';' ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2372:1: ( ';' )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2372:1: ( ';' )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2373:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableIteratorAccess().getSemicolonKeyword_3()); 
            }
            match(input,16,FOLLOW_16_in_rule__VariableIterator__Group__3__Impl4900); if (state.failed) return ;
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2386:1: rule__VariableIterator__Group__4 : rule__VariableIterator__Group__4__Impl ;
    public final void rule__VariableIterator__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2390:1: ( rule__VariableIterator__Group__4__Impl )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2391:2: rule__VariableIterator__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__VariableIterator__Group__4__Impl_in_rule__VariableIterator__Group__44931);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2397:1: rule__VariableIterator__Group__4__Impl : ( ( rule__VariableIterator__IncrementAssignment_4 ) ) ;
    public final void rule__VariableIterator__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2401:1: ( ( ( rule__VariableIterator__IncrementAssignment_4 ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2402:1: ( ( rule__VariableIterator__IncrementAssignment_4 ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2402:1: ( ( rule__VariableIterator__IncrementAssignment_4 ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2403:1: ( rule__VariableIterator__IncrementAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableIteratorAccess().getIncrementAssignment_4()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2404:1: ( rule__VariableIterator__IncrementAssignment_4 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2404:2: rule__VariableIterator__IncrementAssignment_4
            {
            pushFollow(FOLLOW_rule__VariableIterator__IncrementAssignment_4_in_rule__VariableIterator__Group__4__Impl4958);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2424:1: rule__FunctionDeclaration__Group__0 : rule__FunctionDeclaration__Group__0__Impl rule__FunctionDeclaration__Group__1 ;
    public final void rule__FunctionDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2428:1: ( rule__FunctionDeclaration__Group__0__Impl rule__FunctionDeclaration__Group__1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2429:2: rule__FunctionDeclaration__Group__0__Impl rule__FunctionDeclaration__Group__1
            {
            pushFollow(FOLLOW_rule__FunctionDeclaration__Group__0__Impl_in_rule__FunctionDeclaration__Group__04998);
            rule__FunctionDeclaration__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FunctionDeclaration__Group__1_in_rule__FunctionDeclaration__Group__05001);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2436:1: rule__FunctionDeclaration__Group__0__Impl : ( 'function' ) ;
    public final void rule__FunctionDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2440:1: ( ( 'function' ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2441:1: ( 'function' )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2441:1: ( 'function' )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2442:1: 'function'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionDeclarationAccess().getFunctionKeyword_0()); 
            }
            match(input,29,FOLLOW_29_in_rule__FunctionDeclaration__Group__0__Impl5029); if (state.failed) return ;
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2455:1: rule__FunctionDeclaration__Group__1 : rule__FunctionDeclaration__Group__1__Impl rule__FunctionDeclaration__Group__2 ;
    public final void rule__FunctionDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2459:1: ( rule__FunctionDeclaration__Group__1__Impl rule__FunctionDeclaration__Group__2 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2460:2: rule__FunctionDeclaration__Group__1__Impl rule__FunctionDeclaration__Group__2
            {
            pushFollow(FOLLOW_rule__FunctionDeclaration__Group__1__Impl_in_rule__FunctionDeclaration__Group__15060);
            rule__FunctionDeclaration__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FunctionDeclaration__Group__2_in_rule__FunctionDeclaration__Group__15063);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2467:1: rule__FunctionDeclaration__Group__1__Impl : ( ( rule__FunctionDeclaration__NameAssignment_1 ) ) ;
    public final void rule__FunctionDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2471:1: ( ( ( rule__FunctionDeclaration__NameAssignment_1 ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2472:1: ( ( rule__FunctionDeclaration__NameAssignment_1 ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2472:1: ( ( rule__FunctionDeclaration__NameAssignment_1 ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2473:1: ( rule__FunctionDeclaration__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionDeclarationAccess().getNameAssignment_1()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2474:1: ( rule__FunctionDeclaration__NameAssignment_1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2474:2: rule__FunctionDeclaration__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__FunctionDeclaration__NameAssignment_1_in_rule__FunctionDeclaration__Group__1__Impl5090);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2484:1: rule__FunctionDeclaration__Group__2 : rule__FunctionDeclaration__Group__2__Impl rule__FunctionDeclaration__Group__3 ;
    public final void rule__FunctionDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2488:1: ( rule__FunctionDeclaration__Group__2__Impl rule__FunctionDeclaration__Group__3 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2489:2: rule__FunctionDeclaration__Group__2__Impl rule__FunctionDeclaration__Group__3
            {
            pushFollow(FOLLOW_rule__FunctionDeclaration__Group__2__Impl_in_rule__FunctionDeclaration__Group__25120);
            rule__FunctionDeclaration__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FunctionDeclaration__Group__3_in_rule__FunctionDeclaration__Group__25123);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2496:1: rule__FunctionDeclaration__Group__2__Impl : ( '(' ) ;
    public final void rule__FunctionDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2500:1: ( ( '(' ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2501:1: ( '(' )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2501:1: ( '(' )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2502:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionDeclarationAccess().getLeftParenthesisKeyword_2()); 
            }
            match(input,21,FOLLOW_21_in_rule__FunctionDeclaration__Group__2__Impl5151); if (state.failed) return ;
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2515:1: rule__FunctionDeclaration__Group__3 : rule__FunctionDeclaration__Group__3__Impl rule__FunctionDeclaration__Group__4 ;
    public final void rule__FunctionDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2519:1: ( rule__FunctionDeclaration__Group__3__Impl rule__FunctionDeclaration__Group__4 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2520:2: rule__FunctionDeclaration__Group__3__Impl rule__FunctionDeclaration__Group__4
            {
            pushFollow(FOLLOW_rule__FunctionDeclaration__Group__3__Impl_in_rule__FunctionDeclaration__Group__35182);
            rule__FunctionDeclaration__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FunctionDeclaration__Group__4_in_rule__FunctionDeclaration__Group__35185);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2527:1: rule__FunctionDeclaration__Group__3__Impl : ( ( rule__FunctionDeclaration__Group_3__0 )? ) ;
    public final void rule__FunctionDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2531:1: ( ( ( rule__FunctionDeclaration__Group_3__0 )? ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2532:1: ( ( rule__FunctionDeclaration__Group_3__0 )? )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2532:1: ( ( rule__FunctionDeclaration__Group_3__0 )? )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2533:1: ( rule__FunctionDeclaration__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionDeclarationAccess().getGroup_3()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2534:1: ( rule__FunctionDeclaration__Group_3__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==48) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2534:2: rule__FunctionDeclaration__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__FunctionDeclaration__Group_3__0_in_rule__FunctionDeclaration__Group__3__Impl5212);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2544:1: rule__FunctionDeclaration__Group__4 : rule__FunctionDeclaration__Group__4__Impl ;
    public final void rule__FunctionDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2548:1: ( rule__FunctionDeclaration__Group__4__Impl )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2549:2: rule__FunctionDeclaration__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__FunctionDeclaration__Group__4__Impl_in_rule__FunctionDeclaration__Group__45243);
            rule__FunctionDeclaration__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2555:1: rule__FunctionDeclaration__Group__4__Impl : ( ')' ) ;
    public final void rule__FunctionDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2559:1: ( ( ')' ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2560:1: ( ')' )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2560:1: ( ')' )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2561:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionDeclarationAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,22,FOLLOW_22_in_rule__FunctionDeclaration__Group__4__Impl5271); if (state.failed) return ;
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


    // $ANTLR start "rule__FunctionDeclaration__Group_3__0"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2584:1: rule__FunctionDeclaration__Group_3__0 : rule__FunctionDeclaration__Group_3__0__Impl rule__FunctionDeclaration__Group_3__1 ;
    public final void rule__FunctionDeclaration__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2588:1: ( rule__FunctionDeclaration__Group_3__0__Impl rule__FunctionDeclaration__Group_3__1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2589:2: rule__FunctionDeclaration__Group_3__0__Impl rule__FunctionDeclaration__Group_3__1
            {
            pushFollow(FOLLOW_rule__FunctionDeclaration__Group_3__0__Impl_in_rule__FunctionDeclaration__Group_3__05312);
            rule__FunctionDeclaration__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FunctionDeclaration__Group_3__1_in_rule__FunctionDeclaration__Group_3__05315);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2596:1: rule__FunctionDeclaration__Group_3__0__Impl : ( ( rule__FunctionDeclaration__ParameterAssignment_3_0 ) ) ;
    public final void rule__FunctionDeclaration__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2600:1: ( ( ( rule__FunctionDeclaration__ParameterAssignment_3_0 ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2601:1: ( ( rule__FunctionDeclaration__ParameterAssignment_3_0 ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2601:1: ( ( rule__FunctionDeclaration__ParameterAssignment_3_0 ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2602:1: ( rule__FunctionDeclaration__ParameterAssignment_3_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionDeclarationAccess().getParameterAssignment_3_0()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2603:1: ( rule__FunctionDeclaration__ParameterAssignment_3_0 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2603:2: rule__FunctionDeclaration__ParameterAssignment_3_0
            {
            pushFollow(FOLLOW_rule__FunctionDeclaration__ParameterAssignment_3_0_in_rule__FunctionDeclaration__Group_3__0__Impl5342);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2613:1: rule__FunctionDeclaration__Group_3__1 : rule__FunctionDeclaration__Group_3__1__Impl ;
    public final void rule__FunctionDeclaration__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2617:1: ( rule__FunctionDeclaration__Group_3__1__Impl )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2618:2: rule__FunctionDeclaration__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__FunctionDeclaration__Group_3__1__Impl_in_rule__FunctionDeclaration__Group_3__15372);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2624:1: rule__FunctionDeclaration__Group_3__1__Impl : ( ( rule__FunctionDeclaration__Group_3_1__0 )* ) ;
    public final void rule__FunctionDeclaration__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2628:1: ( ( ( rule__FunctionDeclaration__Group_3_1__0 )* ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2629:1: ( ( rule__FunctionDeclaration__Group_3_1__0 )* )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2629:1: ( ( rule__FunctionDeclaration__Group_3_1__0 )* )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2630:1: ( rule__FunctionDeclaration__Group_3_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionDeclarationAccess().getGroup_3_1()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2631:1: ( rule__FunctionDeclaration__Group_3_1__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==30) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2631:2: rule__FunctionDeclaration__Group_3_1__0
            	    {
            	    pushFollow(FOLLOW_rule__FunctionDeclaration__Group_3_1__0_in_rule__FunctionDeclaration__Group_3__1__Impl5399);
            	    rule__FunctionDeclaration__Group_3_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop14;
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2645:1: rule__FunctionDeclaration__Group_3_1__0 : rule__FunctionDeclaration__Group_3_1__0__Impl rule__FunctionDeclaration__Group_3_1__1 ;
    public final void rule__FunctionDeclaration__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2649:1: ( rule__FunctionDeclaration__Group_3_1__0__Impl rule__FunctionDeclaration__Group_3_1__1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2650:2: rule__FunctionDeclaration__Group_3_1__0__Impl rule__FunctionDeclaration__Group_3_1__1
            {
            pushFollow(FOLLOW_rule__FunctionDeclaration__Group_3_1__0__Impl_in_rule__FunctionDeclaration__Group_3_1__05434);
            rule__FunctionDeclaration__Group_3_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FunctionDeclaration__Group_3_1__1_in_rule__FunctionDeclaration__Group_3_1__05437);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2657:1: rule__FunctionDeclaration__Group_3_1__0__Impl : ( ',' ) ;
    public final void rule__FunctionDeclaration__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2661:1: ( ( ',' ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2662:1: ( ',' )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2662:1: ( ',' )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2663:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionDeclarationAccess().getCommaKeyword_3_1_0()); 
            }
            match(input,30,FOLLOW_30_in_rule__FunctionDeclaration__Group_3_1__0__Impl5465); if (state.failed) return ;
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2676:1: rule__FunctionDeclaration__Group_3_1__1 : rule__FunctionDeclaration__Group_3_1__1__Impl ;
    public final void rule__FunctionDeclaration__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2680:1: ( rule__FunctionDeclaration__Group_3_1__1__Impl )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2681:2: rule__FunctionDeclaration__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_rule__FunctionDeclaration__Group_3_1__1__Impl_in_rule__FunctionDeclaration__Group_3_1__15496);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2687:1: rule__FunctionDeclaration__Group_3_1__1__Impl : ( ( rule__FunctionDeclaration__ParameterAssignment_3_1_1 ) ) ;
    public final void rule__FunctionDeclaration__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2691:1: ( ( ( rule__FunctionDeclaration__ParameterAssignment_3_1_1 ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2692:1: ( ( rule__FunctionDeclaration__ParameterAssignment_3_1_1 ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2692:1: ( ( rule__FunctionDeclaration__ParameterAssignment_3_1_1 ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2693:1: ( rule__FunctionDeclaration__ParameterAssignment_3_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionDeclarationAccess().getParameterAssignment_3_1_1()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2694:1: ( rule__FunctionDeclaration__ParameterAssignment_3_1_1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2694:2: rule__FunctionDeclaration__ParameterAssignment_3_1_1
            {
            pushFollow(FOLLOW_rule__FunctionDeclaration__ParameterAssignment_3_1_1_in_rule__FunctionDeclaration__Group_3_1__1__Impl5523);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2708:1: rule__ParameterDeclaration__Group__0 : rule__ParameterDeclaration__Group__0__Impl rule__ParameterDeclaration__Group__1 ;
    public final void rule__ParameterDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2712:1: ( rule__ParameterDeclaration__Group__0__Impl rule__ParameterDeclaration__Group__1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2713:2: rule__ParameterDeclaration__Group__0__Impl rule__ParameterDeclaration__Group__1
            {
            pushFollow(FOLLOW_rule__ParameterDeclaration__Group__0__Impl_in_rule__ParameterDeclaration__Group__05557);
            rule__ParameterDeclaration__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ParameterDeclaration__Group__1_in_rule__ParameterDeclaration__Group__05560);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2720:1: rule__ParameterDeclaration__Group__0__Impl : ( ( rule__ParameterDeclaration__ByAdressAssignment_0 ) ) ;
    public final void rule__ParameterDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2724:1: ( ( ( rule__ParameterDeclaration__ByAdressAssignment_0 ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2725:1: ( ( rule__ParameterDeclaration__ByAdressAssignment_0 ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2725:1: ( ( rule__ParameterDeclaration__ByAdressAssignment_0 ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2726:1: ( rule__ParameterDeclaration__ByAdressAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterDeclarationAccess().getByAdressAssignment_0()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2727:1: ( rule__ParameterDeclaration__ByAdressAssignment_0 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2727:2: rule__ParameterDeclaration__ByAdressAssignment_0
            {
            pushFollow(FOLLOW_rule__ParameterDeclaration__ByAdressAssignment_0_in_rule__ParameterDeclaration__Group__0__Impl5587);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2737:1: rule__ParameterDeclaration__Group__1 : rule__ParameterDeclaration__Group__1__Impl ;
    public final void rule__ParameterDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2741:1: ( rule__ParameterDeclaration__Group__1__Impl )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2742:2: rule__ParameterDeclaration__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ParameterDeclaration__Group__1__Impl_in_rule__ParameterDeclaration__Group__15617);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2748:1: rule__ParameterDeclaration__Group__1__Impl : ( ( rule__ParameterDeclaration__NameAssignment_1 ) ) ;
    public final void rule__ParameterDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2752:1: ( ( ( rule__ParameterDeclaration__NameAssignment_1 ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2753:1: ( ( rule__ParameterDeclaration__NameAssignment_1 ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2753:1: ( ( rule__ParameterDeclaration__NameAssignment_1 ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2754:1: ( rule__ParameterDeclaration__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterDeclarationAccess().getNameAssignment_1()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2755:1: ( rule__ParameterDeclaration__NameAssignment_1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2755:2: rule__ParameterDeclaration__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__ParameterDeclaration__NameAssignment_1_in_rule__ParameterDeclaration__Group__1__Impl5644);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2769:1: rule__LocalDeclaration__Group__0 : rule__LocalDeclaration__Group__0__Impl rule__LocalDeclaration__Group__1 ;
    public final void rule__LocalDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2773:1: ( rule__LocalDeclaration__Group__0__Impl rule__LocalDeclaration__Group__1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2774:2: rule__LocalDeclaration__Group__0__Impl rule__LocalDeclaration__Group__1
            {
            pushFollow(FOLLOW_rule__LocalDeclaration__Group__0__Impl_in_rule__LocalDeclaration__Group__05678);
            rule__LocalDeclaration__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__LocalDeclaration__Group__1_in_rule__LocalDeclaration__Group__05681);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2781:1: rule__LocalDeclaration__Group__0__Impl : ( 'var' ) ;
    public final void rule__LocalDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2785:1: ( ( 'var' ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2786:1: ( 'var' )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2786:1: ( 'var' )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2787:1: 'var'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalDeclarationAccess().getVarKeyword_0()); 
            }
            match(input,26,FOLLOW_26_in_rule__LocalDeclaration__Group__0__Impl5709); if (state.failed) return ;
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2800:1: rule__LocalDeclaration__Group__1 : rule__LocalDeclaration__Group__1__Impl rule__LocalDeclaration__Group__2 ;
    public final void rule__LocalDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2804:1: ( rule__LocalDeclaration__Group__1__Impl rule__LocalDeclaration__Group__2 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2805:2: rule__LocalDeclaration__Group__1__Impl rule__LocalDeclaration__Group__2
            {
            pushFollow(FOLLOW_rule__LocalDeclaration__Group__1__Impl_in_rule__LocalDeclaration__Group__15740);
            rule__LocalDeclaration__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__LocalDeclaration__Group__2_in_rule__LocalDeclaration__Group__15743);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2812:1: rule__LocalDeclaration__Group__1__Impl : ( ( rule__LocalDeclaration__VariablesAssignment_1 ) ) ;
    public final void rule__LocalDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2816:1: ( ( ( rule__LocalDeclaration__VariablesAssignment_1 ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2817:1: ( ( rule__LocalDeclaration__VariablesAssignment_1 ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2817:1: ( ( rule__LocalDeclaration__VariablesAssignment_1 ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2818:1: ( rule__LocalDeclaration__VariablesAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalDeclarationAccess().getVariablesAssignment_1()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2819:1: ( rule__LocalDeclaration__VariablesAssignment_1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2819:2: rule__LocalDeclaration__VariablesAssignment_1
            {
            pushFollow(FOLLOW_rule__LocalDeclaration__VariablesAssignment_1_in_rule__LocalDeclaration__Group__1__Impl5770);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2829:1: rule__LocalDeclaration__Group__2 : rule__LocalDeclaration__Group__2__Impl rule__LocalDeclaration__Group__3 ;
    public final void rule__LocalDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2833:1: ( rule__LocalDeclaration__Group__2__Impl rule__LocalDeclaration__Group__3 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2834:2: rule__LocalDeclaration__Group__2__Impl rule__LocalDeclaration__Group__3
            {
            pushFollow(FOLLOW_rule__LocalDeclaration__Group__2__Impl_in_rule__LocalDeclaration__Group__25800);
            rule__LocalDeclaration__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__LocalDeclaration__Group__3_in_rule__LocalDeclaration__Group__25803);
            rule__LocalDeclaration__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2841:1: rule__LocalDeclaration__Group__2__Impl : ( ( rule__LocalDeclaration__Group_2__0 )* ) ;
    public final void rule__LocalDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2845:1: ( ( ( rule__LocalDeclaration__Group_2__0 )* ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2846:1: ( ( rule__LocalDeclaration__Group_2__0 )* )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2846:1: ( ( rule__LocalDeclaration__Group_2__0 )* )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2847:1: ( rule__LocalDeclaration__Group_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalDeclarationAccess().getGroup_2()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2848:1: ( rule__LocalDeclaration__Group_2__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==30) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2848:2: rule__LocalDeclaration__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__LocalDeclaration__Group_2__0_in_rule__LocalDeclaration__Group__2__Impl5830);
            	    rule__LocalDeclaration__Group_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop15;
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


    // $ANTLR start "rule__LocalDeclaration__Group__3"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2858:1: rule__LocalDeclaration__Group__3 : rule__LocalDeclaration__Group__3__Impl ;
    public final void rule__LocalDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2862:1: ( rule__LocalDeclaration__Group__3__Impl )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2863:2: rule__LocalDeclaration__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__LocalDeclaration__Group__3__Impl_in_rule__LocalDeclaration__Group__35861);
            rule__LocalDeclaration__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalDeclaration__Group__3"


    // $ANTLR start "rule__LocalDeclaration__Group__3__Impl"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2869:1: rule__LocalDeclaration__Group__3__Impl : ( ';' ) ;
    public final void rule__LocalDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2873:1: ( ( ';' ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2874:1: ( ';' )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2874:1: ( ';' )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2875:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalDeclarationAccess().getSemicolonKeyword_3()); 
            }
            match(input,16,FOLLOW_16_in_rule__LocalDeclaration__Group__3__Impl5889); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocalDeclarationAccess().getSemicolonKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalDeclaration__Group__3__Impl"


    // $ANTLR start "rule__LocalDeclaration__Group_2__0"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2896:1: rule__LocalDeclaration__Group_2__0 : rule__LocalDeclaration__Group_2__0__Impl rule__LocalDeclaration__Group_2__1 ;
    public final void rule__LocalDeclaration__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2900:1: ( rule__LocalDeclaration__Group_2__0__Impl rule__LocalDeclaration__Group_2__1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2901:2: rule__LocalDeclaration__Group_2__0__Impl rule__LocalDeclaration__Group_2__1
            {
            pushFollow(FOLLOW_rule__LocalDeclaration__Group_2__0__Impl_in_rule__LocalDeclaration__Group_2__05928);
            rule__LocalDeclaration__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__LocalDeclaration__Group_2__1_in_rule__LocalDeclaration__Group_2__05931);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2908:1: rule__LocalDeclaration__Group_2__0__Impl : ( ',' ) ;
    public final void rule__LocalDeclaration__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2912:1: ( ( ',' ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2913:1: ( ',' )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2913:1: ( ',' )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2914:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalDeclarationAccess().getCommaKeyword_2_0()); 
            }
            match(input,30,FOLLOW_30_in_rule__LocalDeclaration__Group_2__0__Impl5959); if (state.failed) return ;
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2927:1: rule__LocalDeclaration__Group_2__1 : rule__LocalDeclaration__Group_2__1__Impl ;
    public final void rule__LocalDeclaration__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2931:1: ( rule__LocalDeclaration__Group_2__1__Impl )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2932:2: rule__LocalDeclaration__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__LocalDeclaration__Group_2__1__Impl_in_rule__LocalDeclaration__Group_2__15990);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2938:1: rule__LocalDeclaration__Group_2__1__Impl : ( ( rule__LocalDeclaration__VariablesAssignment_2_1 ) ) ;
    public final void rule__LocalDeclaration__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2942:1: ( ( ( rule__LocalDeclaration__VariablesAssignment_2_1 ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2943:1: ( ( rule__LocalDeclaration__VariablesAssignment_2_1 ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2943:1: ( ( rule__LocalDeclaration__VariablesAssignment_2_1 ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2944:1: ( rule__LocalDeclaration__VariablesAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalDeclarationAccess().getVariablesAssignment_2_1()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2945:1: ( rule__LocalDeclaration__VariablesAssignment_2_1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2945:2: rule__LocalDeclaration__VariablesAssignment_2_1
            {
            pushFollow(FOLLOW_rule__LocalDeclaration__VariablesAssignment_2_1_in_rule__LocalDeclaration__Group_2__1__Impl6017);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2959:1: rule__GlobalDeclaration__Group__0 : rule__GlobalDeclaration__Group__0__Impl rule__GlobalDeclaration__Group__1 ;
    public final void rule__GlobalDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2963:1: ( rule__GlobalDeclaration__Group__0__Impl rule__GlobalDeclaration__Group__1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2964:2: rule__GlobalDeclaration__Group__0__Impl rule__GlobalDeclaration__Group__1
            {
            pushFollow(FOLLOW_rule__GlobalDeclaration__Group__0__Impl_in_rule__GlobalDeclaration__Group__06051);
            rule__GlobalDeclaration__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GlobalDeclaration__Group__1_in_rule__GlobalDeclaration__Group__06054);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2971:1: rule__GlobalDeclaration__Group__0__Impl : ( 'global' ) ;
    public final void rule__GlobalDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2975:1: ( ( 'global' ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2976:1: ( 'global' )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2976:1: ( 'global' )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2977:1: 'global'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGlobalDeclarationAccess().getGlobalKeyword_0()); 
            }
            match(input,31,FOLLOW_31_in_rule__GlobalDeclaration__Group__0__Impl6082); if (state.failed) return ;
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2990:1: rule__GlobalDeclaration__Group__1 : rule__GlobalDeclaration__Group__1__Impl rule__GlobalDeclaration__Group__2 ;
    public final void rule__GlobalDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2994:1: ( rule__GlobalDeclaration__Group__1__Impl rule__GlobalDeclaration__Group__2 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2995:2: rule__GlobalDeclaration__Group__1__Impl rule__GlobalDeclaration__Group__2
            {
            pushFollow(FOLLOW_rule__GlobalDeclaration__Group__1__Impl_in_rule__GlobalDeclaration__Group__16113);
            rule__GlobalDeclaration__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GlobalDeclaration__Group__2_in_rule__GlobalDeclaration__Group__16116);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3002:1: rule__GlobalDeclaration__Group__1__Impl : ( ( rule__GlobalDeclaration__VariablesAssignment_1 ) ) ;
    public final void rule__GlobalDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3006:1: ( ( ( rule__GlobalDeclaration__VariablesAssignment_1 ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3007:1: ( ( rule__GlobalDeclaration__VariablesAssignment_1 ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3007:1: ( ( rule__GlobalDeclaration__VariablesAssignment_1 ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3008:1: ( rule__GlobalDeclaration__VariablesAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGlobalDeclarationAccess().getVariablesAssignment_1()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3009:1: ( rule__GlobalDeclaration__VariablesAssignment_1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3009:2: rule__GlobalDeclaration__VariablesAssignment_1
            {
            pushFollow(FOLLOW_rule__GlobalDeclaration__VariablesAssignment_1_in_rule__GlobalDeclaration__Group__1__Impl6143);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3019:1: rule__GlobalDeclaration__Group__2 : rule__GlobalDeclaration__Group__2__Impl rule__GlobalDeclaration__Group__3 ;
    public final void rule__GlobalDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3023:1: ( rule__GlobalDeclaration__Group__2__Impl rule__GlobalDeclaration__Group__3 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3024:2: rule__GlobalDeclaration__Group__2__Impl rule__GlobalDeclaration__Group__3
            {
            pushFollow(FOLLOW_rule__GlobalDeclaration__Group__2__Impl_in_rule__GlobalDeclaration__Group__26173);
            rule__GlobalDeclaration__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GlobalDeclaration__Group__3_in_rule__GlobalDeclaration__Group__26176);
            rule__GlobalDeclaration__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3031:1: rule__GlobalDeclaration__Group__2__Impl : ( ( rule__GlobalDeclaration__Group_2__0 )* ) ;
    public final void rule__GlobalDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3035:1: ( ( ( rule__GlobalDeclaration__Group_2__0 )* ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3036:1: ( ( rule__GlobalDeclaration__Group_2__0 )* )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3036:1: ( ( rule__GlobalDeclaration__Group_2__0 )* )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3037:1: ( rule__GlobalDeclaration__Group_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGlobalDeclarationAccess().getGroup_2()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3038:1: ( rule__GlobalDeclaration__Group_2__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==30) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3038:2: rule__GlobalDeclaration__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__GlobalDeclaration__Group_2__0_in_rule__GlobalDeclaration__Group__2__Impl6203);
            	    rule__GlobalDeclaration__Group_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop16;
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


    // $ANTLR start "rule__GlobalDeclaration__Group__3"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3048:1: rule__GlobalDeclaration__Group__3 : rule__GlobalDeclaration__Group__3__Impl ;
    public final void rule__GlobalDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3052:1: ( rule__GlobalDeclaration__Group__3__Impl )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3053:2: rule__GlobalDeclaration__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__GlobalDeclaration__Group__3__Impl_in_rule__GlobalDeclaration__Group__36234);
            rule__GlobalDeclaration__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalDeclaration__Group__3"


    // $ANTLR start "rule__GlobalDeclaration__Group__3__Impl"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3059:1: rule__GlobalDeclaration__Group__3__Impl : ( ';' ) ;
    public final void rule__GlobalDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3063:1: ( ( ';' ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3064:1: ( ';' )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3064:1: ( ';' )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3065:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGlobalDeclarationAccess().getSemicolonKeyword_3()); 
            }
            match(input,16,FOLLOW_16_in_rule__GlobalDeclaration__Group__3__Impl6262); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGlobalDeclarationAccess().getSemicolonKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalDeclaration__Group__3__Impl"


    // $ANTLR start "rule__GlobalDeclaration__Group_2__0"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3086:1: rule__GlobalDeclaration__Group_2__0 : rule__GlobalDeclaration__Group_2__0__Impl rule__GlobalDeclaration__Group_2__1 ;
    public final void rule__GlobalDeclaration__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3090:1: ( rule__GlobalDeclaration__Group_2__0__Impl rule__GlobalDeclaration__Group_2__1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3091:2: rule__GlobalDeclaration__Group_2__0__Impl rule__GlobalDeclaration__Group_2__1
            {
            pushFollow(FOLLOW_rule__GlobalDeclaration__Group_2__0__Impl_in_rule__GlobalDeclaration__Group_2__06301);
            rule__GlobalDeclaration__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GlobalDeclaration__Group_2__1_in_rule__GlobalDeclaration__Group_2__06304);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3098:1: rule__GlobalDeclaration__Group_2__0__Impl : ( ',' ) ;
    public final void rule__GlobalDeclaration__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3102:1: ( ( ',' ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3103:1: ( ',' )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3103:1: ( ',' )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3104:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGlobalDeclarationAccess().getCommaKeyword_2_0()); 
            }
            match(input,30,FOLLOW_30_in_rule__GlobalDeclaration__Group_2__0__Impl6332); if (state.failed) return ;
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3117:1: rule__GlobalDeclaration__Group_2__1 : rule__GlobalDeclaration__Group_2__1__Impl ;
    public final void rule__GlobalDeclaration__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3121:1: ( rule__GlobalDeclaration__Group_2__1__Impl )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3122:2: rule__GlobalDeclaration__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__GlobalDeclaration__Group_2__1__Impl_in_rule__GlobalDeclaration__Group_2__16363);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3128:1: rule__GlobalDeclaration__Group_2__1__Impl : ( ( rule__GlobalDeclaration__VariablesAssignment_2_1 ) ) ;
    public final void rule__GlobalDeclaration__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3132:1: ( ( ( rule__GlobalDeclaration__VariablesAssignment_2_1 ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3133:1: ( ( rule__GlobalDeclaration__VariablesAssignment_2_1 ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3133:1: ( ( rule__GlobalDeclaration__VariablesAssignment_2_1 ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3134:1: ( rule__GlobalDeclaration__VariablesAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGlobalDeclarationAccess().getVariablesAssignment_2_1()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3135:1: ( rule__GlobalDeclaration__VariablesAssignment_2_1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3135:2: rule__GlobalDeclaration__VariablesAssignment_2_1
            {
            pushFollow(FOLLOW_rule__GlobalDeclaration__VariablesAssignment_2_1_in_rule__GlobalDeclaration__Group_2__1__Impl6390);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3149:1: rule__VariableDeclaration__Group__0 : rule__VariableDeclaration__Group__0__Impl rule__VariableDeclaration__Group__1 ;
    public final void rule__VariableDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3153:1: ( rule__VariableDeclaration__Group__0__Impl rule__VariableDeclaration__Group__1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3154:2: rule__VariableDeclaration__Group__0__Impl rule__VariableDeclaration__Group__1
            {
            pushFollow(FOLLOW_rule__VariableDeclaration__Group__0__Impl_in_rule__VariableDeclaration__Group__06424);
            rule__VariableDeclaration__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__VariableDeclaration__Group__1_in_rule__VariableDeclaration__Group__06427);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3161:1: rule__VariableDeclaration__Group__0__Impl : ( ( rule__VariableDeclaration__NameAssignment_0 ) ) ;
    public final void rule__VariableDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3165:1: ( ( ( rule__VariableDeclaration__NameAssignment_0 ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3166:1: ( ( rule__VariableDeclaration__NameAssignment_0 ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3166:1: ( ( rule__VariableDeclaration__NameAssignment_0 ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3167:1: ( rule__VariableDeclaration__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableDeclarationAccess().getNameAssignment_0()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3168:1: ( rule__VariableDeclaration__NameAssignment_0 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3168:2: rule__VariableDeclaration__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__VariableDeclaration__NameAssignment_0_in_rule__VariableDeclaration__Group__0__Impl6454);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3178:1: rule__VariableDeclaration__Group__1 : rule__VariableDeclaration__Group__1__Impl ;
    public final void rule__VariableDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3182:1: ( rule__VariableDeclaration__Group__1__Impl )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3183:2: rule__VariableDeclaration__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__VariableDeclaration__Group__1__Impl_in_rule__VariableDeclaration__Group__16484);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3189:1: rule__VariableDeclaration__Group__1__Impl : ( ( rule__VariableDeclaration__Group_1__0 )? ) ;
    public final void rule__VariableDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3193:1: ( ( ( rule__VariableDeclaration__Group_1__0 )? ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3194:1: ( ( rule__VariableDeclaration__Group_1__0 )? )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3194:1: ( ( rule__VariableDeclaration__Group_1__0 )? )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3195:1: ( rule__VariableDeclaration__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableDeclarationAccess().getGroup_1()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3196:1: ( rule__VariableDeclaration__Group_1__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==19) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3196:2: rule__VariableDeclaration__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__VariableDeclaration__Group_1__0_in_rule__VariableDeclaration__Group__1__Impl6511);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3210:1: rule__VariableDeclaration__Group_1__0 : rule__VariableDeclaration__Group_1__0__Impl rule__VariableDeclaration__Group_1__1 ;
    public final void rule__VariableDeclaration__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3214:1: ( rule__VariableDeclaration__Group_1__0__Impl rule__VariableDeclaration__Group_1__1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3215:2: rule__VariableDeclaration__Group_1__0__Impl rule__VariableDeclaration__Group_1__1
            {
            pushFollow(FOLLOW_rule__VariableDeclaration__Group_1__0__Impl_in_rule__VariableDeclaration__Group_1__06546);
            rule__VariableDeclaration__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__VariableDeclaration__Group_1__1_in_rule__VariableDeclaration__Group_1__06549);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3222:1: rule__VariableDeclaration__Group_1__0__Impl : ( '=' ) ;
    public final void rule__VariableDeclaration__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3226:1: ( ( '=' ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3227:1: ( '=' )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3227:1: ( '=' )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3228:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableDeclarationAccess().getEqualsSignKeyword_1_0()); 
            }
            match(input,19,FOLLOW_19_in_rule__VariableDeclaration__Group_1__0__Impl6577); if (state.failed) return ;
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3241:1: rule__VariableDeclaration__Group_1__1 : rule__VariableDeclaration__Group_1__1__Impl ;
    public final void rule__VariableDeclaration__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3245:1: ( rule__VariableDeclaration__Group_1__1__Impl )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3246:2: rule__VariableDeclaration__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__VariableDeclaration__Group_1__1__Impl_in_rule__VariableDeclaration__Group_1__16608);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3252:1: rule__VariableDeclaration__Group_1__1__Impl : ( ( rule__VariableDeclaration__ValueAssignment_1_1 ) ) ;
    public final void rule__VariableDeclaration__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3256:1: ( ( ( rule__VariableDeclaration__ValueAssignment_1_1 ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3257:1: ( ( rule__VariableDeclaration__ValueAssignment_1_1 ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3257:1: ( ( rule__VariableDeclaration__ValueAssignment_1_1 ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3258:1: ( rule__VariableDeclaration__ValueAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableDeclarationAccess().getValueAssignment_1_1()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3259:1: ( rule__VariableDeclaration__ValueAssignment_1_1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3259:2: rule__VariableDeclaration__ValueAssignment_1_1
            {
            pushFollow(FOLLOW_rule__VariableDeclaration__ValueAssignment_1_1_in_rule__VariableDeclaration__Group_1__1__Impl6635);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3273:1: rule__Comparison__Group__0 : rule__Comparison__Group__0__Impl rule__Comparison__Group__1 ;
    public final void rule__Comparison__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3277:1: ( rule__Comparison__Group__0__Impl rule__Comparison__Group__1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3278:2: rule__Comparison__Group__0__Impl rule__Comparison__Group__1
            {
            pushFollow(FOLLOW_rule__Comparison__Group__0__Impl_in_rule__Comparison__Group__06669);
            rule__Comparison__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Comparison__Group__1_in_rule__Comparison__Group__06672);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3285:1: rule__Comparison__Group__0__Impl : ( ruleOr ) ;
    public final void rule__Comparison__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3289:1: ( ( ruleOr ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3290:1: ( ruleOr )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3290:1: ( ruleOr )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3291:1: ruleOr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getOrParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleOr_in_rule__Comparison__Group__0__Impl6699);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3302:1: rule__Comparison__Group__1 : rule__Comparison__Group__1__Impl ;
    public final void rule__Comparison__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3306:1: ( rule__Comparison__Group__1__Impl )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3307:2: rule__Comparison__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Comparison__Group__1__Impl_in_rule__Comparison__Group__16728);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3313:1: rule__Comparison__Group__1__Impl : ( ( rule__Comparison__Group_1__0 )* ) ;
    public final void rule__Comparison__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3317:1: ( ( ( rule__Comparison__Group_1__0 )* ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3318:1: ( ( rule__Comparison__Group_1__0 )* )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3318:1: ( ( rule__Comparison__Group_1__0 )* )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3319:1: ( rule__Comparison__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getGroup_1()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3320:1: ( rule__Comparison__Group_1__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=32 && LA18_0<=39)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3320:2: rule__Comparison__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Comparison__Group_1__0_in_rule__Comparison__Group__1__Impl6755);
            	    rule__Comparison__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop18;
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3334:1: rule__Comparison__Group_1__0 : rule__Comparison__Group_1__0__Impl rule__Comparison__Group_1__1 ;
    public final void rule__Comparison__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3338:1: ( rule__Comparison__Group_1__0__Impl rule__Comparison__Group_1__1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3339:2: rule__Comparison__Group_1__0__Impl rule__Comparison__Group_1__1
            {
            pushFollow(FOLLOW_rule__Comparison__Group_1__0__Impl_in_rule__Comparison__Group_1__06790);
            rule__Comparison__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Comparison__Group_1__1_in_rule__Comparison__Group_1__06793);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3346:1: rule__Comparison__Group_1__0__Impl : ( ( rule__Comparison__Alternatives_1_0 ) ) ;
    public final void rule__Comparison__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3350:1: ( ( ( rule__Comparison__Alternatives_1_0 ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3351:1: ( ( rule__Comparison__Alternatives_1_0 ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3351:1: ( ( rule__Comparison__Alternatives_1_0 ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3352:1: ( rule__Comparison__Alternatives_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getAlternatives_1_0()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3353:1: ( rule__Comparison__Alternatives_1_0 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3353:2: rule__Comparison__Alternatives_1_0
            {
            pushFollow(FOLLOW_rule__Comparison__Alternatives_1_0_in_rule__Comparison__Group_1__0__Impl6820);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3363:1: rule__Comparison__Group_1__1 : rule__Comparison__Group_1__1__Impl ;
    public final void rule__Comparison__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3367:1: ( rule__Comparison__Group_1__1__Impl )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3368:2: rule__Comparison__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Comparison__Group_1__1__Impl_in_rule__Comparison__Group_1__16850);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3374:1: rule__Comparison__Group_1__1__Impl : ( ( rule__Comparison__RightAssignment_1_1 ) ) ;
    public final void rule__Comparison__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3378:1: ( ( ( rule__Comparison__RightAssignment_1_1 ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3379:1: ( ( rule__Comparison__RightAssignment_1_1 ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3379:1: ( ( rule__Comparison__RightAssignment_1_1 ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3380:1: ( rule__Comparison__RightAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getRightAssignment_1_1()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3381:1: ( rule__Comparison__RightAssignment_1_1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3381:2: rule__Comparison__RightAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Comparison__RightAssignment_1_1_in_rule__Comparison__Group_1__1__Impl6877);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3395:1: rule__Comparison__Group_1_0_0__0 : rule__Comparison__Group_1_0_0__0__Impl rule__Comparison__Group_1_0_0__1 ;
    public final void rule__Comparison__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3399:1: ( rule__Comparison__Group_1_0_0__0__Impl rule__Comparison__Group_1_0_0__1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3400:2: rule__Comparison__Group_1_0_0__0__Impl rule__Comparison__Group_1_0_0__1
            {
            pushFollow(FOLLOW_rule__Comparison__Group_1_0_0__0__Impl_in_rule__Comparison__Group_1_0_0__06911);
            rule__Comparison__Group_1_0_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Comparison__Group_1_0_0__1_in_rule__Comparison__Group_1_0_0__06914);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3407:1: rule__Comparison__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__Comparison__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3411:1: ( ( () ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3412:1: ( () )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3412:1: ( () )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3413:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getTypedEqualsLeftAction_1_0_0_0()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3414:1: ()
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3416:1: 
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3426:1: rule__Comparison__Group_1_0_0__1 : rule__Comparison__Group_1_0_0__1__Impl ;
    public final void rule__Comparison__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3430:1: ( rule__Comparison__Group_1_0_0__1__Impl )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3431:2: rule__Comparison__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Comparison__Group_1_0_0__1__Impl_in_rule__Comparison__Group_1_0_0__16972);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3437:1: rule__Comparison__Group_1_0_0__1__Impl : ( '===' ) ;
    public final void rule__Comparison__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3441:1: ( ( '===' ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3442:1: ( '===' )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3442:1: ( '===' )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3443:1: '==='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getEqualsSignEqualsSignEqualsSignKeyword_1_0_0_1()); 
            }
            match(input,32,FOLLOW_32_in_rule__Comparison__Group_1_0_0__1__Impl7000); if (state.failed) return ;
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3460:1: rule__Comparison__Group_1_0_1__0 : rule__Comparison__Group_1_0_1__0__Impl rule__Comparison__Group_1_0_1__1 ;
    public final void rule__Comparison__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3464:1: ( rule__Comparison__Group_1_0_1__0__Impl rule__Comparison__Group_1_0_1__1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3465:2: rule__Comparison__Group_1_0_1__0__Impl rule__Comparison__Group_1_0_1__1
            {
            pushFollow(FOLLOW_rule__Comparison__Group_1_0_1__0__Impl_in_rule__Comparison__Group_1_0_1__07035);
            rule__Comparison__Group_1_0_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Comparison__Group_1_0_1__1_in_rule__Comparison__Group_1_0_1__07038);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3472:1: rule__Comparison__Group_1_0_1__0__Impl : ( () ) ;
    public final void rule__Comparison__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3476:1: ( ( () ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3477:1: ( () )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3477:1: ( () )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3478:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getEqualsLeftAction_1_0_1_0()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3479:1: ()
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3481:1: 
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3491:1: rule__Comparison__Group_1_0_1__1 : rule__Comparison__Group_1_0_1__1__Impl ;
    public final void rule__Comparison__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3495:1: ( rule__Comparison__Group_1_0_1__1__Impl )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3496:2: rule__Comparison__Group_1_0_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Comparison__Group_1_0_1__1__Impl_in_rule__Comparison__Group_1_0_1__17096);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3502:1: rule__Comparison__Group_1_0_1__1__Impl : ( '==' ) ;
    public final void rule__Comparison__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3506:1: ( ( '==' ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3507:1: ( '==' )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3507:1: ( '==' )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3508:1: '=='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getEqualsSignEqualsSignKeyword_1_0_1_1()); 
            }
            match(input,33,FOLLOW_33_in_rule__Comparison__Group_1_0_1__1__Impl7124); if (state.failed) return ;
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3525:1: rule__Comparison__Group_1_0_2__0 : rule__Comparison__Group_1_0_2__0__Impl rule__Comparison__Group_1_0_2__1 ;
    public final void rule__Comparison__Group_1_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3529:1: ( rule__Comparison__Group_1_0_2__0__Impl rule__Comparison__Group_1_0_2__1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3530:2: rule__Comparison__Group_1_0_2__0__Impl rule__Comparison__Group_1_0_2__1
            {
            pushFollow(FOLLOW_rule__Comparison__Group_1_0_2__0__Impl_in_rule__Comparison__Group_1_0_2__07159);
            rule__Comparison__Group_1_0_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Comparison__Group_1_0_2__1_in_rule__Comparison__Group_1_0_2__07162);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3537:1: rule__Comparison__Group_1_0_2__0__Impl : ( () ) ;
    public final void rule__Comparison__Group_1_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3541:1: ( ( () ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3542:1: ( () )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3542:1: ( () )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3543:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getTypedDifferentLeftAction_1_0_2_0()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3544:1: ()
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3546:1: 
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3556:1: rule__Comparison__Group_1_0_2__1 : rule__Comparison__Group_1_0_2__1__Impl ;
    public final void rule__Comparison__Group_1_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3560:1: ( rule__Comparison__Group_1_0_2__1__Impl )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3561:2: rule__Comparison__Group_1_0_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Comparison__Group_1_0_2__1__Impl_in_rule__Comparison__Group_1_0_2__17220);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3567:1: rule__Comparison__Group_1_0_2__1__Impl : ( '!==' ) ;
    public final void rule__Comparison__Group_1_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3571:1: ( ( '!==' ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3572:1: ( '!==' )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3572:1: ( '!==' )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3573:1: '!=='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getExclamationMarkEqualsSignEqualsSignKeyword_1_0_2_1()); 
            }
            match(input,34,FOLLOW_34_in_rule__Comparison__Group_1_0_2__1__Impl7248); if (state.failed) return ;
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3590:1: rule__Comparison__Group_1_0_3__0 : rule__Comparison__Group_1_0_3__0__Impl rule__Comparison__Group_1_0_3__1 ;
    public final void rule__Comparison__Group_1_0_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3594:1: ( rule__Comparison__Group_1_0_3__0__Impl rule__Comparison__Group_1_0_3__1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3595:2: rule__Comparison__Group_1_0_3__0__Impl rule__Comparison__Group_1_0_3__1
            {
            pushFollow(FOLLOW_rule__Comparison__Group_1_0_3__0__Impl_in_rule__Comparison__Group_1_0_3__07283);
            rule__Comparison__Group_1_0_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Comparison__Group_1_0_3__1_in_rule__Comparison__Group_1_0_3__07286);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3602:1: rule__Comparison__Group_1_0_3__0__Impl : ( () ) ;
    public final void rule__Comparison__Group_1_0_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3606:1: ( ( () ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3607:1: ( () )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3607:1: ( () )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3608:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getDifferentLeftAction_1_0_3_0()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3609:1: ()
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3611:1: 
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3621:1: rule__Comparison__Group_1_0_3__1 : rule__Comparison__Group_1_0_3__1__Impl ;
    public final void rule__Comparison__Group_1_0_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3625:1: ( rule__Comparison__Group_1_0_3__1__Impl )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3626:2: rule__Comparison__Group_1_0_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Comparison__Group_1_0_3__1__Impl_in_rule__Comparison__Group_1_0_3__17344);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3632:1: rule__Comparison__Group_1_0_3__1__Impl : ( '!=' ) ;
    public final void rule__Comparison__Group_1_0_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3636:1: ( ( '!=' ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3637:1: ( '!=' )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3637:1: ( '!=' )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3638:1: '!='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getExclamationMarkEqualsSignKeyword_1_0_3_1()); 
            }
            match(input,35,FOLLOW_35_in_rule__Comparison__Group_1_0_3__1__Impl7372); if (state.failed) return ;
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3655:1: rule__Comparison__Group_1_0_4__0 : rule__Comparison__Group_1_0_4__0__Impl rule__Comparison__Group_1_0_4__1 ;
    public final void rule__Comparison__Group_1_0_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3659:1: ( rule__Comparison__Group_1_0_4__0__Impl rule__Comparison__Group_1_0_4__1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3660:2: rule__Comparison__Group_1_0_4__0__Impl rule__Comparison__Group_1_0_4__1
            {
            pushFollow(FOLLOW_rule__Comparison__Group_1_0_4__0__Impl_in_rule__Comparison__Group_1_0_4__07407);
            rule__Comparison__Group_1_0_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Comparison__Group_1_0_4__1_in_rule__Comparison__Group_1_0_4__07410);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3667:1: rule__Comparison__Group_1_0_4__0__Impl : ( () ) ;
    public final void rule__Comparison__Group_1_0_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3671:1: ( ( () ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3672:1: ( () )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3672:1: ( () )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3673:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getLessOrEqualsLeftAction_1_0_4_0()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3674:1: ()
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3676:1: 
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3686:1: rule__Comparison__Group_1_0_4__1 : rule__Comparison__Group_1_0_4__1__Impl ;
    public final void rule__Comparison__Group_1_0_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3690:1: ( rule__Comparison__Group_1_0_4__1__Impl )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3691:2: rule__Comparison__Group_1_0_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Comparison__Group_1_0_4__1__Impl_in_rule__Comparison__Group_1_0_4__17468);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3697:1: rule__Comparison__Group_1_0_4__1__Impl : ( '<=' ) ;
    public final void rule__Comparison__Group_1_0_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3701:1: ( ( '<=' ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3702:1: ( '<=' )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3702:1: ( '<=' )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3703:1: '<='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getLessThanSignEqualsSignKeyword_1_0_4_1()); 
            }
            match(input,36,FOLLOW_36_in_rule__Comparison__Group_1_0_4__1__Impl7496); if (state.failed) return ;
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3720:1: rule__Comparison__Group_1_0_5__0 : rule__Comparison__Group_1_0_5__0__Impl rule__Comparison__Group_1_0_5__1 ;
    public final void rule__Comparison__Group_1_0_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3724:1: ( rule__Comparison__Group_1_0_5__0__Impl rule__Comparison__Group_1_0_5__1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3725:2: rule__Comparison__Group_1_0_5__0__Impl rule__Comparison__Group_1_0_5__1
            {
            pushFollow(FOLLOW_rule__Comparison__Group_1_0_5__0__Impl_in_rule__Comparison__Group_1_0_5__07531);
            rule__Comparison__Group_1_0_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Comparison__Group_1_0_5__1_in_rule__Comparison__Group_1_0_5__07534);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3732:1: rule__Comparison__Group_1_0_5__0__Impl : ( () ) ;
    public final void rule__Comparison__Group_1_0_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3736:1: ( ( () ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3737:1: ( () )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3737:1: ( () )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3738:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getLessLeftAction_1_0_5_0()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3739:1: ()
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3741:1: 
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3751:1: rule__Comparison__Group_1_0_5__1 : rule__Comparison__Group_1_0_5__1__Impl ;
    public final void rule__Comparison__Group_1_0_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3755:1: ( rule__Comparison__Group_1_0_5__1__Impl )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3756:2: rule__Comparison__Group_1_0_5__1__Impl
            {
            pushFollow(FOLLOW_rule__Comparison__Group_1_0_5__1__Impl_in_rule__Comparison__Group_1_0_5__17592);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3762:1: rule__Comparison__Group_1_0_5__1__Impl : ( '<' ) ;
    public final void rule__Comparison__Group_1_0_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3766:1: ( ( '<' ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3767:1: ( '<' )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3767:1: ( '<' )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3768:1: '<'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getLessThanSignKeyword_1_0_5_1()); 
            }
            match(input,37,FOLLOW_37_in_rule__Comparison__Group_1_0_5__1__Impl7620); if (state.failed) return ;
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3785:1: rule__Comparison__Group_1_0_6__0 : rule__Comparison__Group_1_0_6__0__Impl rule__Comparison__Group_1_0_6__1 ;
    public final void rule__Comparison__Group_1_0_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3789:1: ( rule__Comparison__Group_1_0_6__0__Impl rule__Comparison__Group_1_0_6__1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3790:2: rule__Comparison__Group_1_0_6__0__Impl rule__Comparison__Group_1_0_6__1
            {
            pushFollow(FOLLOW_rule__Comparison__Group_1_0_6__0__Impl_in_rule__Comparison__Group_1_0_6__07655);
            rule__Comparison__Group_1_0_6__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Comparison__Group_1_0_6__1_in_rule__Comparison__Group_1_0_6__07658);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3797:1: rule__Comparison__Group_1_0_6__0__Impl : ( () ) ;
    public final void rule__Comparison__Group_1_0_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3801:1: ( ( () ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3802:1: ( () )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3802:1: ( () )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3803:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getMoreOrEqualsLeftAction_1_0_6_0()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3804:1: ()
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3806:1: 
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3816:1: rule__Comparison__Group_1_0_6__1 : rule__Comparison__Group_1_0_6__1__Impl ;
    public final void rule__Comparison__Group_1_0_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3820:1: ( rule__Comparison__Group_1_0_6__1__Impl )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3821:2: rule__Comparison__Group_1_0_6__1__Impl
            {
            pushFollow(FOLLOW_rule__Comparison__Group_1_0_6__1__Impl_in_rule__Comparison__Group_1_0_6__17716);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3827:1: rule__Comparison__Group_1_0_6__1__Impl : ( '>=' ) ;
    public final void rule__Comparison__Group_1_0_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3831:1: ( ( '>=' ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3832:1: ( '>=' )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3832:1: ( '>=' )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3833:1: '>='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getGreaterThanSignEqualsSignKeyword_1_0_6_1()); 
            }
            match(input,38,FOLLOW_38_in_rule__Comparison__Group_1_0_6__1__Impl7744); if (state.failed) return ;
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3850:1: rule__Comparison__Group_1_0_7__0 : rule__Comparison__Group_1_0_7__0__Impl rule__Comparison__Group_1_0_7__1 ;
    public final void rule__Comparison__Group_1_0_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3854:1: ( rule__Comparison__Group_1_0_7__0__Impl rule__Comparison__Group_1_0_7__1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3855:2: rule__Comparison__Group_1_0_7__0__Impl rule__Comparison__Group_1_0_7__1
            {
            pushFollow(FOLLOW_rule__Comparison__Group_1_0_7__0__Impl_in_rule__Comparison__Group_1_0_7__07779);
            rule__Comparison__Group_1_0_7__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Comparison__Group_1_0_7__1_in_rule__Comparison__Group_1_0_7__07782);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3862:1: rule__Comparison__Group_1_0_7__0__Impl : ( () ) ;
    public final void rule__Comparison__Group_1_0_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3866:1: ( ( () ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3867:1: ( () )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3867:1: ( () )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3868:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getMoreLeftAction_1_0_7_0()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3869:1: ()
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3871:1: 
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3881:1: rule__Comparison__Group_1_0_7__1 : rule__Comparison__Group_1_0_7__1__Impl ;
    public final void rule__Comparison__Group_1_0_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3885:1: ( rule__Comparison__Group_1_0_7__1__Impl )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3886:2: rule__Comparison__Group_1_0_7__1__Impl
            {
            pushFollow(FOLLOW_rule__Comparison__Group_1_0_7__1__Impl_in_rule__Comparison__Group_1_0_7__17840);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3892:1: rule__Comparison__Group_1_0_7__1__Impl : ( '>' ) ;
    public final void rule__Comparison__Group_1_0_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3896:1: ( ( '>' ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3897:1: ( '>' )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3897:1: ( '>' )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3898:1: '>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getGreaterThanSignKeyword_1_0_7_1()); 
            }
            match(input,39,FOLLOW_39_in_rule__Comparison__Group_1_0_7__1__Impl7868); if (state.failed) return ;
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3915:1: rule__Or__Group__0 : rule__Or__Group__0__Impl rule__Or__Group__1 ;
    public final void rule__Or__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3919:1: ( rule__Or__Group__0__Impl rule__Or__Group__1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3920:2: rule__Or__Group__0__Impl rule__Or__Group__1
            {
            pushFollow(FOLLOW_rule__Or__Group__0__Impl_in_rule__Or__Group__07903);
            rule__Or__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Or__Group__1_in_rule__Or__Group__07906);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3927:1: rule__Or__Group__0__Impl : ( ruleAnd ) ;
    public final void rule__Or__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3931:1: ( ( ruleAnd ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3932:1: ( ruleAnd )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3932:1: ( ruleAnd )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3933:1: ruleAnd
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAccess().getAndParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleAnd_in_rule__Or__Group__0__Impl7933);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3944:1: rule__Or__Group__1 : rule__Or__Group__1__Impl ;
    public final void rule__Or__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3948:1: ( rule__Or__Group__1__Impl )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3949:2: rule__Or__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Or__Group__1__Impl_in_rule__Or__Group__17962);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3955:1: rule__Or__Group__1__Impl : ( ( rule__Or__Group_1__0 )* ) ;
    public final void rule__Or__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3959:1: ( ( ( rule__Or__Group_1__0 )* ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3960:1: ( ( rule__Or__Group_1__0 )* )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3960:1: ( ( rule__Or__Group_1__0 )* )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3961:1: ( rule__Or__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAccess().getGroup_1()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3962:1: ( rule__Or__Group_1__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=12 && LA19_0<=13)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3962:2: rule__Or__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Or__Group_1__0_in_rule__Or__Group__1__Impl7989);
            	    rule__Or__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop19;
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3976:1: rule__Or__Group_1__0 : rule__Or__Group_1__0__Impl rule__Or__Group_1__1 ;
    public final void rule__Or__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3980:1: ( rule__Or__Group_1__0__Impl rule__Or__Group_1__1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3981:2: rule__Or__Group_1__0__Impl rule__Or__Group_1__1
            {
            pushFollow(FOLLOW_rule__Or__Group_1__0__Impl_in_rule__Or__Group_1__08024);
            rule__Or__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Or__Group_1__1_in_rule__Or__Group_1__08027);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3988:1: rule__Or__Group_1__0__Impl : ( ( rule__Or__Group_1_0__0 ) ) ;
    public final void rule__Or__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3992:1: ( ( ( rule__Or__Group_1_0__0 ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3993:1: ( ( rule__Or__Group_1_0__0 ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3993:1: ( ( rule__Or__Group_1_0__0 ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3994:1: ( rule__Or__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAccess().getGroup_1_0()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3995:1: ( rule__Or__Group_1_0__0 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3995:2: rule__Or__Group_1_0__0
            {
            pushFollow(FOLLOW_rule__Or__Group_1_0__0_in_rule__Or__Group_1__0__Impl8054);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4005:1: rule__Or__Group_1__1 : rule__Or__Group_1__1__Impl ;
    public final void rule__Or__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4009:1: ( rule__Or__Group_1__1__Impl )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4010:2: rule__Or__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Or__Group_1__1__Impl_in_rule__Or__Group_1__18084);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4016:1: rule__Or__Group_1__1__Impl : ( ( rule__Or__RightAssignment_1_1 ) ) ;
    public final void rule__Or__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4020:1: ( ( ( rule__Or__RightAssignment_1_1 ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4021:1: ( ( rule__Or__RightAssignment_1_1 ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4021:1: ( ( rule__Or__RightAssignment_1_1 ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4022:1: ( rule__Or__RightAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAccess().getRightAssignment_1_1()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4023:1: ( rule__Or__RightAssignment_1_1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4023:2: rule__Or__RightAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Or__RightAssignment_1_1_in_rule__Or__Group_1__1__Impl8111);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4037:1: rule__Or__Group_1_0__0 : rule__Or__Group_1_0__0__Impl rule__Or__Group_1_0__1 ;
    public final void rule__Or__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4041:1: ( rule__Or__Group_1_0__0__Impl rule__Or__Group_1_0__1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4042:2: rule__Or__Group_1_0__0__Impl rule__Or__Group_1_0__1
            {
            pushFollow(FOLLOW_rule__Or__Group_1_0__0__Impl_in_rule__Or__Group_1_0__08145);
            rule__Or__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Or__Group_1_0__1_in_rule__Or__Group_1_0__08148);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4049:1: rule__Or__Group_1_0__0__Impl : ( () ) ;
    public final void rule__Or__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4053:1: ( ( () ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4054:1: ( () )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4054:1: ( () )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4055:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAccess().getTypedEqualsLeftAction_1_0_0()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4056:1: ()
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4058:1: 
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4068:1: rule__Or__Group_1_0__1 : rule__Or__Group_1_0__1__Impl ;
    public final void rule__Or__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4072:1: ( rule__Or__Group_1_0__1__Impl )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4073:2: rule__Or__Group_1_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Or__Group_1_0__1__Impl_in_rule__Or__Group_1_0__18206);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4079:1: rule__Or__Group_1_0__1__Impl : ( ( rule__Or__Alternatives_1_0_1 ) ) ;
    public final void rule__Or__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4083:1: ( ( ( rule__Or__Alternatives_1_0_1 ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4084:1: ( ( rule__Or__Alternatives_1_0_1 ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4084:1: ( ( rule__Or__Alternatives_1_0_1 ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4085:1: ( rule__Or__Alternatives_1_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAccess().getAlternatives_1_0_1()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4086:1: ( rule__Or__Alternatives_1_0_1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4086:2: rule__Or__Alternatives_1_0_1
            {
            pushFollow(FOLLOW_rule__Or__Alternatives_1_0_1_in_rule__Or__Group_1_0__1__Impl8233);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4100:1: rule__And__Group__0 : rule__And__Group__0__Impl rule__And__Group__1 ;
    public final void rule__And__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4104:1: ( rule__And__Group__0__Impl rule__And__Group__1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4105:2: rule__And__Group__0__Impl rule__And__Group__1
            {
            pushFollow(FOLLOW_rule__And__Group__0__Impl_in_rule__And__Group__08267);
            rule__And__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__And__Group__1_in_rule__And__Group__08270);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4112:1: rule__And__Group__0__Impl : ( ruleAddition ) ;
    public final void rule__And__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4116:1: ( ( ruleAddition ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4117:1: ( ruleAddition )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4117:1: ( ruleAddition )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4118:1: ruleAddition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndAccess().getAdditionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleAddition_in_rule__And__Group__0__Impl8297);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4129:1: rule__And__Group__1 : rule__And__Group__1__Impl ;
    public final void rule__And__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4133:1: ( rule__And__Group__1__Impl )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4134:2: rule__And__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__And__Group__1__Impl_in_rule__And__Group__18326);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4140:1: rule__And__Group__1__Impl : ( ( rule__And__Group_1__0 )* ) ;
    public final void rule__And__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4144:1: ( ( ( rule__And__Group_1__0 )* ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4145:1: ( ( rule__And__Group_1__0 )* )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4145:1: ( ( rule__And__Group_1__0 )* )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4146:1: ( rule__And__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndAccess().getGroup_1()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4147:1: ( rule__And__Group_1__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=14 && LA20_0<=15)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4147:2: rule__And__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__And__Group_1__0_in_rule__And__Group__1__Impl8353);
            	    rule__And__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop20;
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4161:1: rule__And__Group_1__0 : rule__And__Group_1__0__Impl rule__And__Group_1__1 ;
    public final void rule__And__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4165:1: ( rule__And__Group_1__0__Impl rule__And__Group_1__1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4166:2: rule__And__Group_1__0__Impl rule__And__Group_1__1
            {
            pushFollow(FOLLOW_rule__And__Group_1__0__Impl_in_rule__And__Group_1__08388);
            rule__And__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__And__Group_1__1_in_rule__And__Group_1__08391);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4173:1: rule__And__Group_1__0__Impl : ( ( rule__And__Group_1_0__0 ) ) ;
    public final void rule__And__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4177:1: ( ( ( rule__And__Group_1_0__0 ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4178:1: ( ( rule__And__Group_1_0__0 ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4178:1: ( ( rule__And__Group_1_0__0 ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4179:1: ( rule__And__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndAccess().getGroup_1_0()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4180:1: ( rule__And__Group_1_0__0 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4180:2: rule__And__Group_1_0__0
            {
            pushFollow(FOLLOW_rule__And__Group_1_0__0_in_rule__And__Group_1__0__Impl8418);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4190:1: rule__And__Group_1__1 : rule__And__Group_1__1__Impl ;
    public final void rule__And__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4194:1: ( rule__And__Group_1__1__Impl )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4195:2: rule__And__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__And__Group_1__1__Impl_in_rule__And__Group_1__18448);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4201:1: rule__And__Group_1__1__Impl : ( ( rule__And__RightAssignment_1_1 ) ) ;
    public final void rule__And__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4205:1: ( ( ( rule__And__RightAssignment_1_1 ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4206:1: ( ( rule__And__RightAssignment_1_1 ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4206:1: ( ( rule__And__RightAssignment_1_1 ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4207:1: ( rule__And__RightAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndAccess().getRightAssignment_1_1()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4208:1: ( rule__And__RightAssignment_1_1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4208:2: rule__And__RightAssignment_1_1
            {
            pushFollow(FOLLOW_rule__And__RightAssignment_1_1_in_rule__And__Group_1__1__Impl8475);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4222:1: rule__And__Group_1_0__0 : rule__And__Group_1_0__0__Impl rule__And__Group_1_0__1 ;
    public final void rule__And__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4226:1: ( rule__And__Group_1_0__0__Impl rule__And__Group_1_0__1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4227:2: rule__And__Group_1_0__0__Impl rule__And__Group_1_0__1
            {
            pushFollow(FOLLOW_rule__And__Group_1_0__0__Impl_in_rule__And__Group_1_0__08509);
            rule__And__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__And__Group_1_0__1_in_rule__And__Group_1_0__08512);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4234:1: rule__And__Group_1_0__0__Impl : ( () ) ;
    public final void rule__And__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4238:1: ( ( () ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4239:1: ( () )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4239:1: ( () )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4240:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndAccess().getTypedEqualsLeftAction_1_0_0()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4241:1: ()
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4243:1: 
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4253:1: rule__And__Group_1_0__1 : rule__And__Group_1_0__1__Impl ;
    public final void rule__And__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4257:1: ( rule__And__Group_1_0__1__Impl )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4258:2: rule__And__Group_1_0__1__Impl
            {
            pushFollow(FOLLOW_rule__And__Group_1_0__1__Impl_in_rule__And__Group_1_0__18570);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4264:1: rule__And__Group_1_0__1__Impl : ( ( rule__And__Alternatives_1_0_1 ) ) ;
    public final void rule__And__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4268:1: ( ( ( rule__And__Alternatives_1_0_1 ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4269:1: ( ( rule__And__Alternatives_1_0_1 ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4269:1: ( ( rule__And__Alternatives_1_0_1 ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4270:1: ( rule__And__Alternatives_1_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndAccess().getAlternatives_1_0_1()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4271:1: ( rule__And__Alternatives_1_0_1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4271:2: rule__And__Alternatives_1_0_1
            {
            pushFollow(FOLLOW_rule__And__Alternatives_1_0_1_in_rule__And__Group_1_0__1__Impl8597);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4285:1: rule__Addition__Group__0 : rule__Addition__Group__0__Impl rule__Addition__Group__1 ;
    public final void rule__Addition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4289:1: ( rule__Addition__Group__0__Impl rule__Addition__Group__1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4290:2: rule__Addition__Group__0__Impl rule__Addition__Group__1
            {
            pushFollow(FOLLOW_rule__Addition__Group__0__Impl_in_rule__Addition__Group__08631);
            rule__Addition__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Addition__Group__1_in_rule__Addition__Group__08634);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4297:1: rule__Addition__Group__0__Impl : ( ruleMultiplication ) ;
    public final void rule__Addition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4301:1: ( ( ruleMultiplication ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4302:1: ( ruleMultiplication )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4302:1: ( ruleMultiplication )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4303:1: ruleMultiplication
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getMultiplicationParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleMultiplication_in_rule__Addition__Group__0__Impl8661);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4314:1: rule__Addition__Group__1 : rule__Addition__Group__1__Impl ;
    public final void rule__Addition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4318:1: ( rule__Addition__Group__1__Impl )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4319:2: rule__Addition__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Addition__Group__1__Impl_in_rule__Addition__Group__18690);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4325:1: rule__Addition__Group__1__Impl : ( ( rule__Addition__Group_1__0 )* ) ;
    public final void rule__Addition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4329:1: ( ( ( rule__Addition__Group_1__0 )* ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4330:1: ( ( rule__Addition__Group_1__0 )* )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4330:1: ( ( rule__Addition__Group_1__0 )* )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4331:1: ( rule__Addition__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getGroup_1()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4332:1: ( rule__Addition__Group_1__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=40 && LA21_0<=41)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4332:2: rule__Addition__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Addition__Group_1__0_in_rule__Addition__Group__1__Impl8717);
            	    rule__Addition__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop21;
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4346:1: rule__Addition__Group_1__0 : rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1 ;
    public final void rule__Addition__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4350:1: ( rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4351:2: rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1
            {
            pushFollow(FOLLOW_rule__Addition__Group_1__0__Impl_in_rule__Addition__Group_1__08752);
            rule__Addition__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Addition__Group_1__1_in_rule__Addition__Group_1__08755);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4358:1: rule__Addition__Group_1__0__Impl : ( ( rule__Addition__Alternatives_1_0 ) ) ;
    public final void rule__Addition__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4362:1: ( ( ( rule__Addition__Alternatives_1_0 ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4363:1: ( ( rule__Addition__Alternatives_1_0 ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4363:1: ( ( rule__Addition__Alternatives_1_0 ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4364:1: ( rule__Addition__Alternatives_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getAlternatives_1_0()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4365:1: ( rule__Addition__Alternatives_1_0 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4365:2: rule__Addition__Alternatives_1_0
            {
            pushFollow(FOLLOW_rule__Addition__Alternatives_1_0_in_rule__Addition__Group_1__0__Impl8782);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4375:1: rule__Addition__Group_1__1 : rule__Addition__Group_1__1__Impl ;
    public final void rule__Addition__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4379:1: ( rule__Addition__Group_1__1__Impl )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4380:2: rule__Addition__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Addition__Group_1__1__Impl_in_rule__Addition__Group_1__18812);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4386:1: rule__Addition__Group_1__1__Impl : ( ( rule__Addition__RightAssignment_1_1 ) ) ;
    public final void rule__Addition__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4390:1: ( ( ( rule__Addition__RightAssignment_1_1 ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4391:1: ( ( rule__Addition__RightAssignment_1_1 ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4391:1: ( ( rule__Addition__RightAssignment_1_1 ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4392:1: ( rule__Addition__RightAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getRightAssignment_1_1()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4393:1: ( rule__Addition__RightAssignment_1_1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4393:2: rule__Addition__RightAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Addition__RightAssignment_1_1_in_rule__Addition__Group_1__1__Impl8839);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4407:1: rule__Addition__Group_1_0_0__0 : rule__Addition__Group_1_0_0__0__Impl rule__Addition__Group_1_0_0__1 ;
    public final void rule__Addition__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4411:1: ( rule__Addition__Group_1_0_0__0__Impl rule__Addition__Group_1_0_0__1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4412:2: rule__Addition__Group_1_0_0__0__Impl rule__Addition__Group_1_0_0__1
            {
            pushFollow(FOLLOW_rule__Addition__Group_1_0_0__0__Impl_in_rule__Addition__Group_1_0_0__08873);
            rule__Addition__Group_1_0_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Addition__Group_1_0_0__1_in_rule__Addition__Group_1_0_0__08876);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4419:1: rule__Addition__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__Addition__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4423:1: ( ( () ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4424:1: ( () )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4424:1: ( () )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4425:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4426:1: ()
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4428:1: 
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4438:1: rule__Addition__Group_1_0_0__1 : rule__Addition__Group_1_0_0__1__Impl ;
    public final void rule__Addition__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4442:1: ( rule__Addition__Group_1_0_0__1__Impl )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4443:2: rule__Addition__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Addition__Group_1_0_0__1__Impl_in_rule__Addition__Group_1_0_0__18934);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4449:1: rule__Addition__Group_1_0_0__1__Impl : ( '+' ) ;
    public final void rule__Addition__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4453:1: ( ( '+' ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4454:1: ( '+' )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4454:1: ( '+' )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4455:1: '+'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getPlusSignKeyword_1_0_0_1()); 
            }
            match(input,40,FOLLOW_40_in_rule__Addition__Group_1_0_0__1__Impl8962); if (state.failed) return ;
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4472:1: rule__Addition__Group_1_0_1__0 : rule__Addition__Group_1_0_1__0__Impl rule__Addition__Group_1_0_1__1 ;
    public final void rule__Addition__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4476:1: ( rule__Addition__Group_1_0_1__0__Impl rule__Addition__Group_1_0_1__1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4477:2: rule__Addition__Group_1_0_1__0__Impl rule__Addition__Group_1_0_1__1
            {
            pushFollow(FOLLOW_rule__Addition__Group_1_0_1__0__Impl_in_rule__Addition__Group_1_0_1__08997);
            rule__Addition__Group_1_0_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Addition__Group_1_0_1__1_in_rule__Addition__Group_1_0_1__09000);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4484:1: rule__Addition__Group_1_0_1__0__Impl : ( () ) ;
    public final void rule__Addition__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4488:1: ( ( () ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4489:1: ( () )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4489:1: ( () )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4490:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4491:1: ()
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4493:1: 
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4503:1: rule__Addition__Group_1_0_1__1 : rule__Addition__Group_1_0_1__1__Impl ;
    public final void rule__Addition__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4507:1: ( rule__Addition__Group_1_0_1__1__Impl )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4508:2: rule__Addition__Group_1_0_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Addition__Group_1_0_1__1__Impl_in_rule__Addition__Group_1_0_1__19058);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4514:1: rule__Addition__Group_1_0_1__1__Impl : ( '-' ) ;
    public final void rule__Addition__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4518:1: ( ( '-' ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4519:1: ( '-' )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4519:1: ( '-' )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4520:1: '-'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getHyphenMinusKeyword_1_0_1_1()); 
            }
            match(input,41,FOLLOW_41_in_rule__Addition__Group_1_0_1__1__Impl9086); if (state.failed) return ;
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4537:1: rule__Multiplication__Group__0 : rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1 ;
    public final void rule__Multiplication__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4541:1: ( rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4542:2: rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1
            {
            pushFollow(FOLLOW_rule__Multiplication__Group__0__Impl_in_rule__Multiplication__Group__09121);
            rule__Multiplication__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Multiplication__Group__1_in_rule__Multiplication__Group__09124);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4549:1: rule__Multiplication__Group__0__Impl : ( rulePrimaryExpression ) ;
    public final void rule__Multiplication__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4553:1: ( ( rulePrimaryExpression ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4554:1: ( rulePrimaryExpression )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4554:1: ( rulePrimaryExpression )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4555:1: rulePrimaryExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getPrimaryExpressionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_rulePrimaryExpression_in_rule__Multiplication__Group__0__Impl9151);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4566:1: rule__Multiplication__Group__1 : rule__Multiplication__Group__1__Impl ;
    public final void rule__Multiplication__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4570:1: ( rule__Multiplication__Group__1__Impl )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4571:2: rule__Multiplication__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Multiplication__Group__1__Impl_in_rule__Multiplication__Group__19180);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4577:1: rule__Multiplication__Group__1__Impl : ( ( rule__Multiplication__Group_1__0 )* ) ;
    public final void rule__Multiplication__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4581:1: ( ( ( rule__Multiplication__Group_1__0 )* ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4582:1: ( ( rule__Multiplication__Group_1__0 )* )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4582:1: ( ( rule__Multiplication__Group_1__0 )* )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4583:1: ( rule__Multiplication__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getGroup_1()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4584:1: ( rule__Multiplication__Group_1__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=42 && LA22_0<=43)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4584:2: rule__Multiplication__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Multiplication__Group_1__0_in_rule__Multiplication__Group__1__Impl9207);
            	    rule__Multiplication__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop22;
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4598:1: rule__Multiplication__Group_1__0 : rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1 ;
    public final void rule__Multiplication__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4602:1: ( rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4603:2: rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1
            {
            pushFollow(FOLLOW_rule__Multiplication__Group_1__0__Impl_in_rule__Multiplication__Group_1__09242);
            rule__Multiplication__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Multiplication__Group_1__1_in_rule__Multiplication__Group_1__09245);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4610:1: rule__Multiplication__Group_1__0__Impl : ( ( rule__Multiplication__Alternatives_1_0 ) ) ;
    public final void rule__Multiplication__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4614:1: ( ( ( rule__Multiplication__Alternatives_1_0 ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4615:1: ( ( rule__Multiplication__Alternatives_1_0 ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4615:1: ( ( rule__Multiplication__Alternatives_1_0 ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4616:1: ( rule__Multiplication__Alternatives_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getAlternatives_1_0()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4617:1: ( rule__Multiplication__Alternatives_1_0 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4617:2: rule__Multiplication__Alternatives_1_0
            {
            pushFollow(FOLLOW_rule__Multiplication__Alternatives_1_0_in_rule__Multiplication__Group_1__0__Impl9272);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4627:1: rule__Multiplication__Group_1__1 : rule__Multiplication__Group_1__1__Impl ;
    public final void rule__Multiplication__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4631:1: ( rule__Multiplication__Group_1__1__Impl )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4632:2: rule__Multiplication__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Multiplication__Group_1__1__Impl_in_rule__Multiplication__Group_1__19302);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4638:1: rule__Multiplication__Group_1__1__Impl : ( ( rule__Multiplication__RightAssignment_1_1 ) ) ;
    public final void rule__Multiplication__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4642:1: ( ( ( rule__Multiplication__RightAssignment_1_1 ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4643:1: ( ( rule__Multiplication__RightAssignment_1_1 ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4643:1: ( ( rule__Multiplication__RightAssignment_1_1 ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4644:1: ( rule__Multiplication__RightAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getRightAssignment_1_1()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4645:1: ( rule__Multiplication__RightAssignment_1_1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4645:2: rule__Multiplication__RightAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Multiplication__RightAssignment_1_1_in_rule__Multiplication__Group_1__1__Impl9329);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4659:1: rule__Multiplication__Group_1_0_0__0 : rule__Multiplication__Group_1_0_0__0__Impl rule__Multiplication__Group_1_0_0__1 ;
    public final void rule__Multiplication__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4663:1: ( rule__Multiplication__Group_1_0_0__0__Impl rule__Multiplication__Group_1_0_0__1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4664:2: rule__Multiplication__Group_1_0_0__0__Impl rule__Multiplication__Group_1_0_0__1
            {
            pushFollow(FOLLOW_rule__Multiplication__Group_1_0_0__0__Impl_in_rule__Multiplication__Group_1_0_0__09363);
            rule__Multiplication__Group_1_0_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Multiplication__Group_1_0_0__1_in_rule__Multiplication__Group_1_0_0__09366);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4671:1: rule__Multiplication__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__Multiplication__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4675:1: ( ( () ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4676:1: ( () )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4676:1: ( () )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4677:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0_0_0()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4678:1: ()
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4680:1: 
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4690:1: rule__Multiplication__Group_1_0_0__1 : rule__Multiplication__Group_1_0_0__1__Impl ;
    public final void rule__Multiplication__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4694:1: ( rule__Multiplication__Group_1_0_0__1__Impl )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4695:2: rule__Multiplication__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Multiplication__Group_1_0_0__1__Impl_in_rule__Multiplication__Group_1_0_0__19424);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4701:1: rule__Multiplication__Group_1_0_0__1__Impl : ( '*' ) ;
    public final void rule__Multiplication__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4705:1: ( ( '*' ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4706:1: ( '*' )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4706:1: ( '*' )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4707:1: '*'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getAsteriskKeyword_1_0_0_1()); 
            }
            match(input,42,FOLLOW_42_in_rule__Multiplication__Group_1_0_0__1__Impl9452); if (state.failed) return ;
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4724:1: rule__Multiplication__Group_1_0_1__0 : rule__Multiplication__Group_1_0_1__0__Impl rule__Multiplication__Group_1_0_1__1 ;
    public final void rule__Multiplication__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4728:1: ( rule__Multiplication__Group_1_0_1__0__Impl rule__Multiplication__Group_1_0_1__1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4729:2: rule__Multiplication__Group_1_0_1__0__Impl rule__Multiplication__Group_1_0_1__1
            {
            pushFollow(FOLLOW_rule__Multiplication__Group_1_0_1__0__Impl_in_rule__Multiplication__Group_1_0_1__09487);
            rule__Multiplication__Group_1_0_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Multiplication__Group_1_0_1__1_in_rule__Multiplication__Group_1_0_1__09490);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4736:1: rule__Multiplication__Group_1_0_1__0__Impl : ( () ) ;
    public final void rule__Multiplication__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4740:1: ( ( () ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4741:1: ( () )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4741:1: ( () )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4742:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getDivLeftAction_1_0_1_0()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4743:1: ()
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4745:1: 
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4755:1: rule__Multiplication__Group_1_0_1__1 : rule__Multiplication__Group_1_0_1__1__Impl ;
    public final void rule__Multiplication__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4759:1: ( rule__Multiplication__Group_1_0_1__1__Impl )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4760:2: rule__Multiplication__Group_1_0_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Multiplication__Group_1_0_1__1__Impl_in_rule__Multiplication__Group_1_0_1__19548);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4766:1: rule__Multiplication__Group_1_0_1__1__Impl : ( '/' ) ;
    public final void rule__Multiplication__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4770:1: ( ( '/' ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4771:1: ( '/' )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4771:1: ( '/' )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4772:1: '/'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getSolidusKeyword_1_0_1_1()); 
            }
            match(input,43,FOLLOW_43_in_rule__Multiplication__Group_1_0_1__1__Impl9576); if (state.failed) return ;
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4789:1: rule__PrimaryExpression__Group_0__0 : rule__PrimaryExpression__Group_0__0__Impl rule__PrimaryExpression__Group_0__1 ;
    public final void rule__PrimaryExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4793:1: ( rule__PrimaryExpression__Group_0__0__Impl rule__PrimaryExpression__Group_0__1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4794:2: rule__PrimaryExpression__Group_0__0__Impl rule__PrimaryExpression__Group_0__1
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__Group_0__0__Impl_in_rule__PrimaryExpression__Group_0__09611);
            rule__PrimaryExpression__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PrimaryExpression__Group_0__1_in_rule__PrimaryExpression__Group_0__09614);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4801:1: rule__PrimaryExpression__Group_0__0__Impl : ( '(' ) ;
    public final void rule__PrimaryExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4805:1: ( ( '(' ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4806:1: ( '(' )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4806:1: ( '(' )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4807:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_0_0()); 
            }
            match(input,21,FOLLOW_21_in_rule__PrimaryExpression__Group_0__0__Impl9642); if (state.failed) return ;
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4820:1: rule__PrimaryExpression__Group_0__1 : rule__PrimaryExpression__Group_0__1__Impl rule__PrimaryExpression__Group_0__2 ;
    public final void rule__PrimaryExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4824:1: ( rule__PrimaryExpression__Group_0__1__Impl rule__PrimaryExpression__Group_0__2 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4825:2: rule__PrimaryExpression__Group_0__1__Impl rule__PrimaryExpression__Group_0__2
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__Group_0__1__Impl_in_rule__PrimaryExpression__Group_0__19673);
            rule__PrimaryExpression__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PrimaryExpression__Group_0__2_in_rule__PrimaryExpression__Group_0__19676);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4832:1: rule__PrimaryExpression__Group_0__1__Impl : ( ruleExpression ) ;
    public final void rule__PrimaryExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4836:1: ( ( ruleExpression ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4837:1: ( ruleExpression )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4837:1: ( ruleExpression )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4838:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExpressionAccess().getExpressionParserRuleCall_0_1()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__PrimaryExpression__Group_0__1__Impl9703);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4849:1: rule__PrimaryExpression__Group_0__2 : rule__PrimaryExpression__Group_0__2__Impl ;
    public final void rule__PrimaryExpression__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4853:1: ( rule__PrimaryExpression__Group_0__2__Impl )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4854:2: rule__PrimaryExpression__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__Group_0__2__Impl_in_rule__PrimaryExpression__Group_0__29732);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4860:1: rule__PrimaryExpression__Group_0__2__Impl : ( ')' ) ;
    public final void rule__PrimaryExpression__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4864:1: ( ( ')' ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4865:1: ( ')' )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4865:1: ( ')' )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4866:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_0_2()); 
            }
            match(input,22,FOLLOW_22_in_rule__PrimaryExpression__Group_0__2__Impl9760); if (state.failed) return ;
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4885:1: rule__PrimaryExpression__Group_1__0 : rule__PrimaryExpression__Group_1__0__Impl rule__PrimaryExpression__Group_1__1 ;
    public final void rule__PrimaryExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4889:1: ( rule__PrimaryExpression__Group_1__0__Impl rule__PrimaryExpression__Group_1__1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4890:2: rule__PrimaryExpression__Group_1__0__Impl rule__PrimaryExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__Group_1__0__Impl_in_rule__PrimaryExpression__Group_1__09797);
            rule__PrimaryExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PrimaryExpression__Group_1__1_in_rule__PrimaryExpression__Group_1__09800);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4897:1: rule__PrimaryExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__PrimaryExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4901:1: ( ( () ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4902:1: ( () )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4902:1: ( () )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4903:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExpressionAccess().getRealLiteralAction_1_0()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4904:1: ()
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4906:1: 
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4916:1: rule__PrimaryExpression__Group_1__1 : rule__PrimaryExpression__Group_1__1__Impl ;
    public final void rule__PrimaryExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4920:1: ( rule__PrimaryExpression__Group_1__1__Impl )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4921:2: rule__PrimaryExpression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__Group_1__1__Impl_in_rule__PrimaryExpression__Group_1__19858);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4927:1: rule__PrimaryExpression__Group_1__1__Impl : ( ( rule__PrimaryExpression__ValueAssignment_1_1 ) ) ;
    public final void rule__PrimaryExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4931:1: ( ( ( rule__PrimaryExpression__ValueAssignment_1_1 ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4932:1: ( ( rule__PrimaryExpression__ValueAssignment_1_1 ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4932:1: ( ( rule__PrimaryExpression__ValueAssignment_1_1 ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4933:1: ( rule__PrimaryExpression__ValueAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExpressionAccess().getValueAssignment_1_1()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4934:1: ( rule__PrimaryExpression__ValueAssignment_1_1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4934:2: rule__PrimaryExpression__ValueAssignment_1_1
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__ValueAssignment_1_1_in_rule__PrimaryExpression__Group_1__1__Impl9885);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4948:1: rule__PrimaryExpression__Group_2__0 : rule__PrimaryExpression__Group_2__0__Impl rule__PrimaryExpression__Group_2__1 ;
    public final void rule__PrimaryExpression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4952:1: ( rule__PrimaryExpression__Group_2__0__Impl rule__PrimaryExpression__Group_2__1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4953:2: rule__PrimaryExpression__Group_2__0__Impl rule__PrimaryExpression__Group_2__1
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__Group_2__0__Impl_in_rule__PrimaryExpression__Group_2__09919);
            rule__PrimaryExpression__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PrimaryExpression__Group_2__1_in_rule__PrimaryExpression__Group_2__09922);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4960:1: rule__PrimaryExpression__Group_2__0__Impl : ( () ) ;
    public final void rule__PrimaryExpression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4964:1: ( ( () ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4965:1: ( () )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4965:1: ( () )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4966:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExpressionAccess().getIntLiteralAction_2_0()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4967:1: ()
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4969:1: 
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4979:1: rule__PrimaryExpression__Group_2__1 : rule__PrimaryExpression__Group_2__1__Impl ;
    public final void rule__PrimaryExpression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4983:1: ( rule__PrimaryExpression__Group_2__1__Impl )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4984:2: rule__PrimaryExpression__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__Group_2__1__Impl_in_rule__PrimaryExpression__Group_2__19980);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4990:1: rule__PrimaryExpression__Group_2__1__Impl : ( ( rule__PrimaryExpression__ValueAssignment_2_1 ) ) ;
    public final void rule__PrimaryExpression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4994:1: ( ( ( rule__PrimaryExpression__ValueAssignment_2_1 ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4995:1: ( ( rule__PrimaryExpression__ValueAssignment_2_1 ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4995:1: ( ( rule__PrimaryExpression__ValueAssignment_2_1 ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4996:1: ( rule__PrimaryExpression__ValueAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExpressionAccess().getValueAssignment_2_1()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4997:1: ( rule__PrimaryExpression__ValueAssignment_2_1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4997:2: rule__PrimaryExpression__ValueAssignment_2_1
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__ValueAssignment_2_1_in_rule__PrimaryExpression__Group_2__1__Impl10007);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5011:1: rule__PrimaryExpression__Group_5__0 : rule__PrimaryExpression__Group_5__0__Impl rule__PrimaryExpression__Group_5__1 ;
    public final void rule__PrimaryExpression__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5015:1: ( rule__PrimaryExpression__Group_5__0__Impl rule__PrimaryExpression__Group_5__1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5016:2: rule__PrimaryExpression__Group_5__0__Impl rule__PrimaryExpression__Group_5__1
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__Group_5__0__Impl_in_rule__PrimaryExpression__Group_5__010041);
            rule__PrimaryExpression__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PrimaryExpression__Group_5__1_in_rule__PrimaryExpression__Group_5__010044);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5023:1: rule__PrimaryExpression__Group_5__0__Impl : ( () ) ;
    public final void rule__PrimaryExpression__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5027:1: ( ( () ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5028:1: ( () )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5028:1: ( () )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5029:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExpressionAccess().getStringLiteralAction_5_0()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5030:1: ()
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5032:1: 
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5042:1: rule__PrimaryExpression__Group_5__1 : rule__PrimaryExpression__Group_5__1__Impl ;
    public final void rule__PrimaryExpression__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5046:1: ( rule__PrimaryExpression__Group_5__1__Impl )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5047:2: rule__PrimaryExpression__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__Group_5__1__Impl_in_rule__PrimaryExpression__Group_5__110102);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5053:1: rule__PrimaryExpression__Group_5__1__Impl : ( ( rule__PrimaryExpression__ValueAssignment_5_1 ) ) ;
    public final void rule__PrimaryExpression__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5057:1: ( ( ( rule__PrimaryExpression__ValueAssignment_5_1 ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5058:1: ( ( rule__PrimaryExpression__ValueAssignment_5_1 ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5058:1: ( ( rule__PrimaryExpression__ValueAssignment_5_1 ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5059:1: ( rule__PrimaryExpression__ValueAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExpressionAccess().getValueAssignment_5_1()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5060:1: ( rule__PrimaryExpression__ValueAssignment_5_1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5060:2: rule__PrimaryExpression__ValueAssignment_5_1
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__ValueAssignment_5_1_in_rule__PrimaryExpression__Group_5__1__Impl10129);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5074:1: rule__ArrayLiteral__Group__0 : rule__ArrayLiteral__Group__0__Impl rule__ArrayLiteral__Group__1 ;
    public final void rule__ArrayLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5078:1: ( rule__ArrayLiteral__Group__0__Impl rule__ArrayLiteral__Group__1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5079:2: rule__ArrayLiteral__Group__0__Impl rule__ArrayLiteral__Group__1
            {
            pushFollow(FOLLOW_rule__ArrayLiteral__Group__0__Impl_in_rule__ArrayLiteral__Group__010163);
            rule__ArrayLiteral__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ArrayLiteral__Group__1_in_rule__ArrayLiteral__Group__010166);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5086:1: rule__ArrayLiteral__Group__0__Impl : ( '[' ) ;
    public final void rule__ArrayLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5090:1: ( ( '[' ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5091:1: ( '[' )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5091:1: ( '[' )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5092:1: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayLiteralAccess().getLeftSquareBracketKeyword_0()); 
            }
            match(input,44,FOLLOW_44_in_rule__ArrayLiteral__Group__0__Impl10194); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayLiteralAccess().getLeftSquareBracketKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayLiteral__Group__0__Impl"


    // $ANTLR start "rule__ArrayLiteral__Group__1"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5105:1: rule__ArrayLiteral__Group__1 : rule__ArrayLiteral__Group__1__Impl rule__ArrayLiteral__Group__2 ;
    public final void rule__ArrayLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5109:1: ( rule__ArrayLiteral__Group__1__Impl rule__ArrayLiteral__Group__2 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5110:2: rule__ArrayLiteral__Group__1__Impl rule__ArrayLiteral__Group__2
            {
            pushFollow(FOLLOW_rule__ArrayLiteral__Group__1__Impl_in_rule__ArrayLiteral__Group__110225);
            rule__ArrayLiteral__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ArrayLiteral__Group__2_in_rule__ArrayLiteral__Group__110228);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5117:1: rule__ArrayLiteral__Group__1__Impl : ( '(' ) ;
    public final void rule__ArrayLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5121:1: ( ( '(' ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5122:1: ( '(' )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5122:1: ( '(' )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5123:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayLiteralAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,21,FOLLOW_21_in_rule__ArrayLiteral__Group__1__Impl10256); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayLiteralAccess().getLeftParenthesisKeyword_1()); 
            }

            }


            }

        }
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5136:1: rule__ArrayLiteral__Group__2 : rule__ArrayLiteral__Group__2__Impl rule__ArrayLiteral__Group__3 ;
    public final void rule__ArrayLiteral__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5140:1: ( rule__ArrayLiteral__Group__2__Impl rule__ArrayLiteral__Group__3 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5141:2: rule__ArrayLiteral__Group__2__Impl rule__ArrayLiteral__Group__3
            {
            pushFollow(FOLLOW_rule__ArrayLiteral__Group__2__Impl_in_rule__ArrayLiteral__Group__210287);
            rule__ArrayLiteral__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ArrayLiteral__Group__3_in_rule__ArrayLiteral__Group__210290);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5148:1: rule__ArrayLiteral__Group__2__Impl : ( ( rule__ArrayLiteral__ValuesAssignment_2 ) ) ;
    public final void rule__ArrayLiteral__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5152:1: ( ( ( rule__ArrayLiteral__ValuesAssignment_2 ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5153:1: ( ( rule__ArrayLiteral__ValuesAssignment_2 ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5153:1: ( ( rule__ArrayLiteral__ValuesAssignment_2 ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5154:1: ( rule__ArrayLiteral__ValuesAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayLiteralAccess().getValuesAssignment_2()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5155:1: ( rule__ArrayLiteral__ValuesAssignment_2 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5155:2: rule__ArrayLiteral__ValuesAssignment_2
            {
            pushFollow(FOLLOW_rule__ArrayLiteral__ValuesAssignment_2_in_rule__ArrayLiteral__Group__2__Impl10317);
            rule__ArrayLiteral__ValuesAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayLiteralAccess().getValuesAssignment_2()); 
            }

            }


            }

        }
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5165:1: rule__ArrayLiteral__Group__3 : rule__ArrayLiteral__Group__3__Impl rule__ArrayLiteral__Group__4 ;
    public final void rule__ArrayLiteral__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5169:1: ( rule__ArrayLiteral__Group__3__Impl rule__ArrayLiteral__Group__4 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5170:2: rule__ArrayLiteral__Group__3__Impl rule__ArrayLiteral__Group__4
            {
            pushFollow(FOLLOW_rule__ArrayLiteral__Group__3__Impl_in_rule__ArrayLiteral__Group__310347);
            rule__ArrayLiteral__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ArrayLiteral__Group__4_in_rule__ArrayLiteral__Group__310350);
            rule__ArrayLiteral__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5177:1: rule__ArrayLiteral__Group__3__Impl : ( ( rule__ArrayLiteral__Group_3__0 )* ) ;
    public final void rule__ArrayLiteral__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5181:1: ( ( ( rule__ArrayLiteral__Group_3__0 )* ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5182:1: ( ( rule__ArrayLiteral__Group_3__0 )* )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5182:1: ( ( rule__ArrayLiteral__Group_3__0 )* )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5183:1: ( rule__ArrayLiteral__Group_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayLiteralAccess().getGroup_3()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5184:1: ( rule__ArrayLiteral__Group_3__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==30) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5184:2: rule__ArrayLiteral__Group_3__0
            	    {
            	    pushFollow(FOLLOW_rule__ArrayLiteral__Group_3__0_in_rule__ArrayLiteral__Group__3__Impl10377);
            	    rule__ArrayLiteral__Group_3__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayLiteralAccess().getGroup_3()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__ArrayLiteral__Group__4"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5194:1: rule__ArrayLiteral__Group__4 : rule__ArrayLiteral__Group__4__Impl ;
    public final void rule__ArrayLiteral__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5198:1: ( rule__ArrayLiteral__Group__4__Impl )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5199:2: rule__ArrayLiteral__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__ArrayLiteral__Group__4__Impl_in_rule__ArrayLiteral__Group__410408);
            rule__ArrayLiteral__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayLiteral__Group__4"


    // $ANTLR start "rule__ArrayLiteral__Group__4__Impl"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5205:1: rule__ArrayLiteral__Group__4__Impl : ( ']' ) ;
    public final void rule__ArrayLiteral__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5209:1: ( ( ']' ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5210:1: ( ']' )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5210:1: ( ']' )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5211:1: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayLiteralAccess().getRightSquareBracketKeyword_4()); 
            }
            match(input,45,FOLLOW_45_in_rule__ArrayLiteral__Group__4__Impl10436); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayLiteralAccess().getRightSquareBracketKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayLiteral__Group__4__Impl"


    // $ANTLR start "rule__ArrayLiteral__Group_3__0"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5234:1: rule__ArrayLiteral__Group_3__0 : rule__ArrayLiteral__Group_3__0__Impl rule__ArrayLiteral__Group_3__1 ;
    public final void rule__ArrayLiteral__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5238:1: ( rule__ArrayLiteral__Group_3__0__Impl rule__ArrayLiteral__Group_3__1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5239:2: rule__ArrayLiteral__Group_3__0__Impl rule__ArrayLiteral__Group_3__1
            {
            pushFollow(FOLLOW_rule__ArrayLiteral__Group_3__0__Impl_in_rule__ArrayLiteral__Group_3__010477);
            rule__ArrayLiteral__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ArrayLiteral__Group_3__1_in_rule__ArrayLiteral__Group_3__010480);
            rule__ArrayLiteral__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayLiteral__Group_3__0"


    // $ANTLR start "rule__ArrayLiteral__Group_3__0__Impl"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5246:1: rule__ArrayLiteral__Group_3__0__Impl : ( ',' ) ;
    public final void rule__ArrayLiteral__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5250:1: ( ( ',' ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5251:1: ( ',' )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5251:1: ( ',' )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5252:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayLiteralAccess().getCommaKeyword_3_0()); 
            }
            match(input,30,FOLLOW_30_in_rule__ArrayLiteral__Group_3__0__Impl10508); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayLiteralAccess().getCommaKeyword_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayLiteral__Group_3__0__Impl"


    // $ANTLR start "rule__ArrayLiteral__Group_3__1"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5265:1: rule__ArrayLiteral__Group_3__1 : rule__ArrayLiteral__Group_3__1__Impl ;
    public final void rule__ArrayLiteral__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5269:1: ( rule__ArrayLiteral__Group_3__1__Impl )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5270:2: rule__ArrayLiteral__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__ArrayLiteral__Group_3__1__Impl_in_rule__ArrayLiteral__Group_3__110539);
            rule__ArrayLiteral__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayLiteral__Group_3__1"


    // $ANTLR start "rule__ArrayLiteral__Group_3__1__Impl"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5276:1: rule__ArrayLiteral__Group_3__1__Impl : ( ( rule__ArrayLiteral__ValuesAssignment_3_1 ) ) ;
    public final void rule__ArrayLiteral__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5280:1: ( ( ( rule__ArrayLiteral__ValuesAssignment_3_1 ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5281:1: ( ( rule__ArrayLiteral__ValuesAssignment_3_1 ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5281:1: ( ( rule__ArrayLiteral__ValuesAssignment_3_1 ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5282:1: ( rule__ArrayLiteral__ValuesAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayLiteralAccess().getValuesAssignment_3_1()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5283:1: ( rule__ArrayLiteral__ValuesAssignment_3_1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5283:2: rule__ArrayLiteral__ValuesAssignment_3_1
            {
            pushFollow(FOLLOW_rule__ArrayLiteral__ValuesAssignment_3_1_in_rule__ArrayLiteral__Group_3__1__Impl10566);
            rule__ArrayLiteral__ValuesAssignment_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayLiteralAccess().getValuesAssignment_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayLiteral__Group_3__1__Impl"


    // $ANTLR start "rule__VariableReference__Group__0"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5297:1: rule__VariableReference__Group__0 : rule__VariableReference__Group__0__Impl rule__VariableReference__Group__1 ;
    public final void rule__VariableReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5301:1: ( rule__VariableReference__Group__0__Impl rule__VariableReference__Group__1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5302:2: rule__VariableReference__Group__0__Impl rule__VariableReference__Group__1
            {
            pushFollow(FOLLOW_rule__VariableReference__Group__0__Impl_in_rule__VariableReference__Group__010600);
            rule__VariableReference__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__VariableReference__Group__1_in_rule__VariableReference__Group__010603);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5309:1: rule__VariableReference__Group__0__Impl : ( ( rule__VariableReference__VariableAssignment_0 ) ) ;
    public final void rule__VariableReference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5313:1: ( ( ( rule__VariableReference__VariableAssignment_0 ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5314:1: ( ( rule__VariableReference__VariableAssignment_0 ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5314:1: ( ( rule__VariableReference__VariableAssignment_0 ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5315:1: ( rule__VariableReference__VariableAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableReferenceAccess().getVariableAssignment_0()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5316:1: ( rule__VariableReference__VariableAssignment_0 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5316:2: rule__VariableReference__VariableAssignment_0
            {
            pushFollow(FOLLOW_rule__VariableReference__VariableAssignment_0_in_rule__VariableReference__Group__0__Impl10630);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5326:1: rule__VariableReference__Group__1 : rule__VariableReference__Group__1__Impl ;
    public final void rule__VariableReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5330:1: ( rule__VariableReference__Group__1__Impl )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5331:2: rule__VariableReference__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__VariableReference__Group__1__Impl_in_rule__VariableReference__Group__110660);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5337:1: rule__VariableReference__Group__1__Impl : ( ( rule__VariableReference__Group_1__0 )* ) ;
    public final void rule__VariableReference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5341:1: ( ( ( rule__VariableReference__Group_1__0 )* ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5342:1: ( ( rule__VariableReference__Group_1__0 )* )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5342:1: ( ( rule__VariableReference__Group_1__0 )* )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5343:1: ( rule__VariableReference__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableReferenceAccess().getGroup_1()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5344:1: ( rule__VariableReference__Group_1__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==44) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5344:2: rule__VariableReference__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__VariableReference__Group_1__0_in_rule__VariableReference__Group__1__Impl10687);
            	    rule__VariableReference__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop24;
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5358:1: rule__VariableReference__Group_1__0 : rule__VariableReference__Group_1__0__Impl rule__VariableReference__Group_1__1 ;
    public final void rule__VariableReference__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5362:1: ( rule__VariableReference__Group_1__0__Impl rule__VariableReference__Group_1__1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5363:2: rule__VariableReference__Group_1__0__Impl rule__VariableReference__Group_1__1
            {
            pushFollow(FOLLOW_rule__VariableReference__Group_1__0__Impl_in_rule__VariableReference__Group_1__010722);
            rule__VariableReference__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__VariableReference__Group_1__1_in_rule__VariableReference__Group_1__010725);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5370:1: rule__VariableReference__Group_1__0__Impl : ( '[' ) ;
    public final void rule__VariableReference__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5374:1: ( ( '[' ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5375:1: ( '[' )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5375:1: ( '[' )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5376:1: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableReferenceAccess().getLeftSquareBracketKeyword_1_0()); 
            }
            match(input,44,FOLLOW_44_in_rule__VariableReference__Group_1__0__Impl10753); if (state.failed) return ;
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5389:1: rule__VariableReference__Group_1__1 : rule__VariableReference__Group_1__1__Impl rule__VariableReference__Group_1__2 ;
    public final void rule__VariableReference__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5393:1: ( rule__VariableReference__Group_1__1__Impl rule__VariableReference__Group_1__2 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5394:2: rule__VariableReference__Group_1__1__Impl rule__VariableReference__Group_1__2
            {
            pushFollow(FOLLOW_rule__VariableReference__Group_1__1__Impl_in_rule__VariableReference__Group_1__110784);
            rule__VariableReference__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__VariableReference__Group_1__2_in_rule__VariableReference__Group_1__110787);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5401:1: rule__VariableReference__Group_1__1__Impl : ( ( rule__VariableReference__DimensionsAssignment_1_1 ) ) ;
    public final void rule__VariableReference__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5405:1: ( ( ( rule__VariableReference__DimensionsAssignment_1_1 ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5406:1: ( ( rule__VariableReference__DimensionsAssignment_1_1 ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5406:1: ( ( rule__VariableReference__DimensionsAssignment_1_1 ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5407:1: ( rule__VariableReference__DimensionsAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableReferenceAccess().getDimensionsAssignment_1_1()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5408:1: ( rule__VariableReference__DimensionsAssignment_1_1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5408:2: rule__VariableReference__DimensionsAssignment_1_1
            {
            pushFollow(FOLLOW_rule__VariableReference__DimensionsAssignment_1_1_in_rule__VariableReference__Group_1__1__Impl10814);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5418:1: rule__VariableReference__Group_1__2 : rule__VariableReference__Group_1__2__Impl ;
    public final void rule__VariableReference__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5422:1: ( rule__VariableReference__Group_1__2__Impl )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5423:2: rule__VariableReference__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__VariableReference__Group_1__2__Impl_in_rule__VariableReference__Group_1__210844);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5429:1: rule__VariableReference__Group_1__2__Impl : ( ']' ) ;
    public final void rule__VariableReference__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5433:1: ( ( ']' ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5434:1: ( ']' )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5434:1: ( ']' )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5435:1: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableReferenceAccess().getRightSquareBracketKeyword_1_2()); 
            }
            match(input,45,FOLLOW_45_in_rule__VariableReference__Group_1__2__Impl10872); if (state.failed) return ;
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5454:1: rule__FunctionCall__Group__0 : rule__FunctionCall__Group__0__Impl rule__FunctionCall__Group__1 ;
    public final void rule__FunctionCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5458:1: ( rule__FunctionCall__Group__0__Impl rule__FunctionCall__Group__1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5459:2: rule__FunctionCall__Group__0__Impl rule__FunctionCall__Group__1
            {
            pushFollow(FOLLOW_rule__FunctionCall__Group__0__Impl_in_rule__FunctionCall__Group__010909);
            rule__FunctionCall__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FunctionCall__Group__1_in_rule__FunctionCall__Group__010912);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5466:1: rule__FunctionCall__Group__0__Impl : ( () ) ;
    public final void rule__FunctionCall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5470:1: ( ( () ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5471:1: ( () )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5471:1: ( () )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5472:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getFunctionCallAction_0()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5473:1: ()
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5475:1: 
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5485:1: rule__FunctionCall__Group__1 : rule__FunctionCall__Group__1__Impl rule__FunctionCall__Group__2 ;
    public final void rule__FunctionCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5489:1: ( rule__FunctionCall__Group__1__Impl rule__FunctionCall__Group__2 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5490:2: rule__FunctionCall__Group__1__Impl rule__FunctionCall__Group__2
            {
            pushFollow(FOLLOW_rule__FunctionCall__Group__1__Impl_in_rule__FunctionCall__Group__110970);
            rule__FunctionCall__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FunctionCall__Group__2_in_rule__FunctionCall__Group__110973);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5497:1: rule__FunctionCall__Group__1__Impl : ( ( rule__FunctionCall__FunctionAssignment_1 ) ) ;
    public final void rule__FunctionCall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5501:1: ( ( ( rule__FunctionCall__FunctionAssignment_1 ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5502:1: ( ( rule__FunctionCall__FunctionAssignment_1 ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5502:1: ( ( rule__FunctionCall__FunctionAssignment_1 ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5503:1: ( rule__FunctionCall__FunctionAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getFunctionAssignment_1()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5504:1: ( rule__FunctionCall__FunctionAssignment_1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5504:2: rule__FunctionCall__FunctionAssignment_1
            {
            pushFollow(FOLLOW_rule__FunctionCall__FunctionAssignment_1_in_rule__FunctionCall__Group__1__Impl11000);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5514:1: rule__FunctionCall__Group__2 : rule__FunctionCall__Group__2__Impl rule__FunctionCall__Group__3 ;
    public final void rule__FunctionCall__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5518:1: ( rule__FunctionCall__Group__2__Impl rule__FunctionCall__Group__3 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5519:2: rule__FunctionCall__Group__2__Impl rule__FunctionCall__Group__3
            {
            pushFollow(FOLLOW_rule__FunctionCall__Group__2__Impl_in_rule__FunctionCall__Group__211030);
            rule__FunctionCall__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FunctionCall__Group__3_in_rule__FunctionCall__Group__211033);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5526:1: rule__FunctionCall__Group__2__Impl : ( '(' ) ;
    public final void rule__FunctionCall__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5530:1: ( ( '(' ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5531:1: ( '(' )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5531:1: ( '(' )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5532:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getLeftParenthesisKeyword_2()); 
            }
            match(input,21,FOLLOW_21_in_rule__FunctionCall__Group__2__Impl11061); if (state.failed) return ;
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5545:1: rule__FunctionCall__Group__3 : rule__FunctionCall__Group__3__Impl rule__FunctionCall__Group__4 ;
    public final void rule__FunctionCall__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5549:1: ( rule__FunctionCall__Group__3__Impl rule__FunctionCall__Group__4 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5550:2: rule__FunctionCall__Group__3__Impl rule__FunctionCall__Group__4
            {
            pushFollow(FOLLOW_rule__FunctionCall__Group__3__Impl_in_rule__FunctionCall__Group__311092);
            rule__FunctionCall__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FunctionCall__Group__4_in_rule__FunctionCall__Group__311095);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5557:1: rule__FunctionCall__Group__3__Impl : ( ( rule__FunctionCall__ArgsAssignment_3 ) ) ;
    public final void rule__FunctionCall__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5561:1: ( ( ( rule__FunctionCall__ArgsAssignment_3 ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5562:1: ( ( rule__FunctionCall__ArgsAssignment_3 ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5562:1: ( ( rule__FunctionCall__ArgsAssignment_3 ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5563:1: ( rule__FunctionCall__ArgsAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getArgsAssignment_3()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5564:1: ( rule__FunctionCall__ArgsAssignment_3 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5564:2: rule__FunctionCall__ArgsAssignment_3
            {
            pushFollow(FOLLOW_rule__FunctionCall__ArgsAssignment_3_in_rule__FunctionCall__Group__3__Impl11122);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5574:1: rule__FunctionCall__Group__4 : rule__FunctionCall__Group__4__Impl rule__FunctionCall__Group__5 ;
    public final void rule__FunctionCall__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5578:1: ( rule__FunctionCall__Group__4__Impl rule__FunctionCall__Group__5 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5579:2: rule__FunctionCall__Group__4__Impl rule__FunctionCall__Group__5
            {
            pushFollow(FOLLOW_rule__FunctionCall__Group__4__Impl_in_rule__FunctionCall__Group__411152);
            rule__FunctionCall__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FunctionCall__Group__5_in_rule__FunctionCall__Group__411155);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5586:1: rule__FunctionCall__Group__4__Impl : ( ( rule__FunctionCall__Group_4__0 )* ) ;
    public final void rule__FunctionCall__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5590:1: ( ( ( rule__FunctionCall__Group_4__0 )* ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5591:1: ( ( rule__FunctionCall__Group_4__0 )* )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5591:1: ( ( rule__FunctionCall__Group_4__0 )* )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5592:1: ( rule__FunctionCall__Group_4__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getGroup_4()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5593:1: ( rule__FunctionCall__Group_4__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==30) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5593:2: rule__FunctionCall__Group_4__0
            	    {
            	    pushFollow(FOLLOW_rule__FunctionCall__Group_4__0_in_rule__FunctionCall__Group__4__Impl11182);
            	    rule__FunctionCall__Group_4__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop25;
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5603:1: rule__FunctionCall__Group__5 : rule__FunctionCall__Group__5__Impl ;
    public final void rule__FunctionCall__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5607:1: ( rule__FunctionCall__Group__5__Impl )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5608:2: rule__FunctionCall__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__FunctionCall__Group__5__Impl_in_rule__FunctionCall__Group__511213);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5614:1: rule__FunctionCall__Group__5__Impl : ( ')' ) ;
    public final void rule__FunctionCall__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5618:1: ( ( ')' ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5619:1: ( ')' )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5619:1: ( ')' )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5620:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getRightParenthesisKeyword_5()); 
            }
            match(input,22,FOLLOW_22_in_rule__FunctionCall__Group__5__Impl11241); if (state.failed) return ;
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5645:1: rule__FunctionCall__Group_4__0 : rule__FunctionCall__Group_4__0__Impl rule__FunctionCall__Group_4__1 ;
    public final void rule__FunctionCall__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5649:1: ( rule__FunctionCall__Group_4__0__Impl rule__FunctionCall__Group_4__1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5650:2: rule__FunctionCall__Group_4__0__Impl rule__FunctionCall__Group_4__1
            {
            pushFollow(FOLLOW_rule__FunctionCall__Group_4__0__Impl_in_rule__FunctionCall__Group_4__011284);
            rule__FunctionCall__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FunctionCall__Group_4__1_in_rule__FunctionCall__Group_4__011287);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5657:1: rule__FunctionCall__Group_4__0__Impl : ( ',' ) ;
    public final void rule__FunctionCall__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5661:1: ( ( ',' ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5662:1: ( ',' )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5662:1: ( ',' )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5663:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getCommaKeyword_4_0()); 
            }
            match(input,30,FOLLOW_30_in_rule__FunctionCall__Group_4__0__Impl11315); if (state.failed) return ;
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5676:1: rule__FunctionCall__Group_4__1 : rule__FunctionCall__Group_4__1__Impl ;
    public final void rule__FunctionCall__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5680:1: ( rule__FunctionCall__Group_4__1__Impl )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5681:2: rule__FunctionCall__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__FunctionCall__Group_4__1__Impl_in_rule__FunctionCall__Group_4__111346);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5687:1: rule__FunctionCall__Group_4__1__Impl : ( ( rule__FunctionCall__ArgsAssignment_4_1 ) ) ;
    public final void rule__FunctionCall__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5691:1: ( ( ( rule__FunctionCall__ArgsAssignment_4_1 ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5692:1: ( ( rule__FunctionCall__ArgsAssignment_4_1 ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5692:1: ( ( rule__FunctionCall__ArgsAssignment_4_1 ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5693:1: ( rule__FunctionCall__ArgsAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getArgsAssignment_4_1()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5694:1: ( rule__FunctionCall__ArgsAssignment_4_1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5694:2: rule__FunctionCall__ArgsAssignment_4_1
            {
            pushFollow(FOLLOW_rule__FunctionCall__ArgsAssignment_4_1_in_rule__FunctionCall__Group_4__1__Impl11373);
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


    // $ANTLR start "rule__Include__Group__0"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5708:1: rule__Include__Group__0 : rule__Include__Group__0__Impl rule__Include__Group__1 ;
    public final void rule__Include__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5712:1: ( rule__Include__Group__0__Impl rule__Include__Group__1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5713:2: rule__Include__Group__0__Impl rule__Include__Group__1
            {
            pushFollow(FOLLOW_rule__Include__Group__0__Impl_in_rule__Include__Group__011407);
            rule__Include__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Include__Group__1_in_rule__Include__Group__011410);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5720:1: rule__Include__Group__0__Impl : ( 'include' ) ;
    public final void rule__Include__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5724:1: ( ( 'include' ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5725:1: ( 'include' )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5725:1: ( 'include' )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5726:1: 'include'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIncludeAccess().getIncludeKeyword_0()); 
            }
            match(input,46,FOLLOW_46_in_rule__Include__Group__0__Impl11438); if (state.failed) return ;
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5739:1: rule__Include__Group__1 : rule__Include__Group__1__Impl rule__Include__Group__2 ;
    public final void rule__Include__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5743:1: ( rule__Include__Group__1__Impl rule__Include__Group__2 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5744:2: rule__Include__Group__1__Impl rule__Include__Group__2
            {
            pushFollow(FOLLOW_rule__Include__Group__1__Impl_in_rule__Include__Group__111469);
            rule__Include__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Include__Group__2_in_rule__Include__Group__111472);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5751:1: rule__Include__Group__1__Impl : ( '(' ) ;
    public final void rule__Include__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5755:1: ( ( '(' ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5756:1: ( '(' )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5756:1: ( '(' )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5757:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIncludeAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,21,FOLLOW_21_in_rule__Include__Group__1__Impl11500); if (state.failed) return ;
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5770:1: rule__Include__Group__2 : rule__Include__Group__2__Impl rule__Include__Group__3 ;
    public final void rule__Include__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5774:1: ( rule__Include__Group__2__Impl rule__Include__Group__3 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5775:2: rule__Include__Group__2__Impl rule__Include__Group__3
            {
            pushFollow(FOLLOW_rule__Include__Group__2__Impl_in_rule__Include__Group__211531);
            rule__Include__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Include__Group__3_in_rule__Include__Group__211534);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5782:1: rule__Include__Group__2__Impl : ( '\"' ) ;
    public final void rule__Include__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5786:1: ( ( '\"' ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5787:1: ( '\"' )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5787:1: ( '\"' )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5788:1: '\"'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIncludeAccess().getQuotationMarkKeyword_2()); 
            }
            match(input,47,FOLLOW_47_in_rule__Include__Group__2__Impl11562); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIncludeAccess().getQuotationMarkKeyword_2()); 
            }

            }


            }

        }
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5801:1: rule__Include__Group__3 : rule__Include__Group__3__Impl rule__Include__Group__4 ;
    public final void rule__Include__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5805:1: ( rule__Include__Group__3__Impl rule__Include__Group__4 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5806:2: rule__Include__Group__3__Impl rule__Include__Group__4
            {
            pushFollow(FOLLOW_rule__Include__Group__3__Impl_in_rule__Include__Group__311593);
            rule__Include__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Include__Group__4_in_rule__Include__Group__311596);
            rule__Include__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5813:1: rule__Include__Group__3__Impl : ( RULE_ID ) ;
    public final void rule__Include__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5817:1: ( ( RULE_ID ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5818:1: ( RULE_ID )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5818:1: ( RULE_ID )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5819:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIncludeAccess().getIDTerminalRuleCall_3()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Include__Group__3__Impl11623); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIncludeAccess().getIDTerminalRuleCall_3()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__Include__Group__4"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5830:1: rule__Include__Group__4 : rule__Include__Group__4__Impl rule__Include__Group__5 ;
    public final void rule__Include__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5834:1: ( rule__Include__Group__4__Impl rule__Include__Group__5 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5835:2: rule__Include__Group__4__Impl rule__Include__Group__5
            {
            pushFollow(FOLLOW_rule__Include__Group__4__Impl_in_rule__Include__Group__411652);
            rule__Include__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Include__Group__5_in_rule__Include__Group__411655);
            rule__Include__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Include__Group__4"


    // $ANTLR start "rule__Include__Group__4__Impl"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5842:1: rule__Include__Group__4__Impl : ( '\"' ) ;
    public final void rule__Include__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5846:1: ( ( '\"' ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5847:1: ( '\"' )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5847:1: ( '\"' )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5848:1: '\"'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIncludeAccess().getQuotationMarkKeyword_4()); 
            }
            match(input,47,FOLLOW_47_in_rule__Include__Group__4__Impl11683); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIncludeAccess().getQuotationMarkKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Include__Group__4__Impl"


    // $ANTLR start "rule__Include__Group__5"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5861:1: rule__Include__Group__5 : rule__Include__Group__5__Impl rule__Include__Group__6 ;
    public final void rule__Include__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5865:1: ( rule__Include__Group__5__Impl rule__Include__Group__6 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5866:2: rule__Include__Group__5__Impl rule__Include__Group__6
            {
            pushFollow(FOLLOW_rule__Include__Group__5__Impl_in_rule__Include__Group__511714);
            rule__Include__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Include__Group__6_in_rule__Include__Group__511717);
            rule__Include__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Include__Group__5"


    // $ANTLR start "rule__Include__Group__5__Impl"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5873:1: rule__Include__Group__5__Impl : ( ')' ) ;
    public final void rule__Include__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5877:1: ( ( ')' ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5878:1: ( ')' )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5878:1: ( ')' )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5879:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIncludeAccess().getRightParenthesisKeyword_5()); 
            }
            match(input,22,FOLLOW_22_in_rule__Include__Group__5__Impl11745); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIncludeAccess().getRightParenthesisKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Include__Group__5__Impl"


    // $ANTLR start "rule__Include__Group__6"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5892:1: rule__Include__Group__6 : rule__Include__Group__6__Impl ;
    public final void rule__Include__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5896:1: ( rule__Include__Group__6__Impl )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5897:2: rule__Include__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Include__Group__6__Impl_in_rule__Include__Group__611776);
            rule__Include__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Include__Group__6"


    // $ANTLR start "rule__Include__Group__6__Impl"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5903:1: rule__Include__Group__6__Impl : ( ';' ) ;
    public final void rule__Include__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5907:1: ( ( ';' ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5908:1: ( ';' )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5908:1: ( ';' )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5909:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIncludeAccess().getSemicolonKeyword_6()); 
            }
            match(input,16,FOLLOW_16_in_rule__Include__Group__6__Impl11804); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIncludeAccess().getSemicolonKeyword_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Include__Group__6__Impl"


    // $ANTLR start "rule__Script__StatementsAssignment"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5937:1: rule__Script__StatementsAssignment : ( ruleStatement ) ;
    public final void rule__Script__StatementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5941:1: ( ( ruleStatement ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5942:1: ( ruleStatement )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5942:1: ( ruleStatement )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5943:1: ruleStatement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScriptAccess().getStatementsStatementParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleStatement_in_rule__Script__StatementsAssignment11854);
            ruleStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getScriptAccess().getStatementsStatementParserRuleCall_0()); 
            }

            }


            }

        }
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5952:1: rule__StatementBlock__StatementsAssignment_2 : ( ruleStatement ) ;
    public final void rule__StatementBlock__StatementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5956:1: ( ( ruleStatement ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5957:1: ( ruleStatement )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5957:1: ( ruleStatement )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5958:1: ruleStatement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementBlockAccess().getStatementsStatementParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleStatement_in_rule__StatementBlock__StatementsAssignment_211885);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5967:1: rule__Affectation__VariableAssignment_0 : ( ruleVariableReference ) ;
    public final void rule__Affectation__VariableAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5971:1: ( ( ruleVariableReference ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5972:1: ( ruleVariableReference )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5972:1: ( ruleVariableReference )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5973:1: ruleVariableReference
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAffectationAccess().getVariableVariableReferenceParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleVariableReference_in_rule__Affectation__VariableAssignment_011916);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5982:1: rule__Affectation__ValueAssignment_2 : ( ruleExpression ) ;
    public final void rule__Affectation__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5986:1: ( ( ruleExpression ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5987:1: ( ruleExpression )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5987:1: ( ruleExpression )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5988:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAffectationAccess().getValueExpressionParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__Affectation__ValueAssignment_211947);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5997:1: rule__If__ConditionAssignment_2 : ( ruleExpression ) ;
    public final void rule__If__ConditionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6001:1: ( ( ruleExpression ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6002:1: ( ruleExpression )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6002:1: ( ruleExpression )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6003:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getConditionExpressionParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__If__ConditionAssignment_211978);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6012:1: rule__If__ThenAssignment_4 : ( ruleStatement ) ;
    public final void rule__If__ThenAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6016:1: ( ( ruleStatement ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6017:1: ( ruleStatement )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6017:1: ( ruleStatement )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6018:1: ruleStatement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getThenStatementParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_ruleStatement_in_rule__If__ThenAssignment_412009);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6027:1: rule__If__ElseAssignment_5_1 : ( ruleStatement ) ;
    public final void rule__If__ElseAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6031:1: ( ( ruleStatement ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6032:1: ( ruleStatement )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6032:1: ( ruleStatement )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6033:1: ruleStatement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getElseStatementParserRuleCall_5_1_0()); 
            }
            pushFollow(FOLLOW_ruleStatement_in_rule__If__ElseAssignment_5_112040);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6042:1: rule__While__ConditionAssignment_2 : ( ruleExpression ) ;
    public final void rule__While__ConditionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6046:1: ( ( ruleExpression ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6047:1: ( ruleExpression )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6047:1: ( ruleExpression )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6048:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileAccess().getConditionExpressionParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__While__ConditionAssignment_212071);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6057:1: rule__While__StatementAssignment_4 : ( ruleStatement ) ;
    public final void rule__While__StatementAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6061:1: ( ( ruleStatement ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6062:1: ( ruleStatement )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6062:1: ( ruleStatement )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6063:1: ruleStatement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileAccess().getStatementStatementParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_ruleStatement_in_rule__While__StatementAssignment_412102);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6072:1: rule__For__IteratorAssignment_2 : ( ruleForIterator ) ;
    public final void rule__For__IteratorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6076:1: ( ( ruleForIterator ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6077:1: ( ruleForIterator )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6077:1: ( ruleForIterator )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6078:1: ruleForIterator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForAccess().getIteratorForIteratorParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleForIterator_in_rule__For__IteratorAssignment_212133);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6087:1: rule__For__StatementAssignment_4 : ( ruleStatement ) ;
    public final void rule__For__StatementAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6091:1: ( ( ruleStatement ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6092:1: ( ruleStatement )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6092:1: ( ruleStatement )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6093:1: ruleStatement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForAccess().getStatementStatementParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_ruleStatement_in_rule__For__StatementAssignment_412164);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6102:1: rule__EachIterator__KeyAssignment_0_1 : ( ruleVariableDeclaration ) ;
    public final void rule__EachIterator__KeyAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6106:1: ( ( ruleVariableDeclaration ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6107:1: ( ruleVariableDeclaration )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6107:1: ( ruleVariableDeclaration )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6108:1: ruleVariableDeclaration
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEachIteratorAccess().getKeyVariableDeclarationParserRuleCall_0_1_0()); 
            }
            pushFollow(FOLLOW_ruleVariableDeclaration_in_rule__EachIterator__KeyAssignment_0_112195);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6117:1: rule__EachIterator__ValueAssignment_2 : ( ruleVariableDeclaration ) ;
    public final void rule__EachIterator__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6121:1: ( ( ruleVariableDeclaration ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6122:1: ( ruleVariableDeclaration )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6122:1: ( ruleVariableDeclaration )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6123:1: ruleVariableDeclaration
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEachIteratorAccess().getValueVariableDeclarationParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleVariableDeclaration_in_rule__EachIterator__ValueAssignment_212226);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6132:1: rule__EachIterator__ArrayAssignment_4 : ( ruleExpression ) ;
    public final void rule__EachIterator__ArrayAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6136:1: ( ( ruleExpression ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6137:1: ( ruleExpression )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6137:1: ( ruleExpression )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6138:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEachIteratorAccess().getArrayExpressionParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__EachIterator__ArrayAssignment_412257);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6147:1: rule__VariableIterator__InitializationAssignment_0 : ( ruleAffectation ) ;
    public final void rule__VariableIterator__InitializationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6151:1: ( ( ruleAffectation ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6152:1: ( ruleAffectation )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6152:1: ( ruleAffectation )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6153:1: ruleAffectation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableIteratorAccess().getInitializationAffectationParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleAffectation_in_rule__VariableIterator__InitializationAssignment_012288);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6162:1: rule__VariableIterator__ConditionAssignment_2 : ( ruleExpression ) ;
    public final void rule__VariableIterator__ConditionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6166:1: ( ( ruleExpression ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6167:1: ( ruleExpression )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6167:1: ( ruleExpression )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6168:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableIteratorAccess().getConditionExpressionParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__VariableIterator__ConditionAssignment_212319);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6177:1: rule__VariableIterator__IncrementAssignment_4 : ( ruleExpression ) ;
    public final void rule__VariableIterator__IncrementAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6181:1: ( ( ruleExpression ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6182:1: ( ruleExpression )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6182:1: ( ruleExpression )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6183:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableIteratorAccess().getIncrementExpressionParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__VariableIterator__IncrementAssignment_412350);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6192:1: rule__FunctionDeclaration__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__FunctionDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6196:1: ( ( RULE_ID ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6197:1: ( RULE_ID )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6197:1: ( RULE_ID )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6198:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FunctionDeclaration__NameAssignment_112381); if (state.failed) return ;
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6207:1: rule__FunctionDeclaration__ParameterAssignment_3_0 : ( ruleParameterDeclaration ) ;
    public final void rule__FunctionDeclaration__ParameterAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6211:1: ( ( ruleParameterDeclaration ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6212:1: ( ruleParameterDeclaration )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6212:1: ( ruleParameterDeclaration )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6213:1: ruleParameterDeclaration
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionDeclarationAccess().getParameterParameterDeclarationParserRuleCall_3_0_0()); 
            }
            pushFollow(FOLLOW_ruleParameterDeclaration_in_rule__FunctionDeclaration__ParameterAssignment_3_012412);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6222:1: rule__FunctionDeclaration__ParameterAssignment_3_1_1 : ( ruleParameterDeclaration ) ;
    public final void rule__FunctionDeclaration__ParameterAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6226:1: ( ( ruleParameterDeclaration ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6227:1: ( ruleParameterDeclaration )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6227:1: ( ruleParameterDeclaration )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6228:1: ruleParameterDeclaration
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionDeclarationAccess().getParameterParameterDeclarationParserRuleCall_3_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleParameterDeclaration_in_rule__FunctionDeclaration__ParameterAssignment_3_1_112443);
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


    // $ANTLR start "rule__ParameterDeclaration__ByAdressAssignment_0"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6237:1: rule__ParameterDeclaration__ByAdressAssignment_0 : ( ( '@' ) ) ;
    public final void rule__ParameterDeclaration__ByAdressAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6241:1: ( ( ( '@' ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6242:1: ( ( '@' ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6242:1: ( ( '@' ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6243:1: ( '@' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterDeclarationAccess().getByAdressCommercialAtKeyword_0_0()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6244:1: ( '@' )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6245:1: '@'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterDeclarationAccess().getByAdressCommercialAtKeyword_0_0()); 
            }
            match(input,48,FOLLOW_48_in_rule__ParameterDeclaration__ByAdressAssignment_012479); if (state.failed) return ;
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6260:1: rule__ParameterDeclaration__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ParameterDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6264:1: ( ( RULE_ID ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6265:1: ( RULE_ID )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6265:1: ( RULE_ID )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6266:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ParameterDeclaration__NameAssignment_112518); if (state.failed) return ;
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6275:1: rule__LocalDeclaration__VariablesAssignment_1 : ( ruleVariableDeclaration ) ;
    public final void rule__LocalDeclaration__VariablesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6279:1: ( ( ruleVariableDeclaration ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6280:1: ( ruleVariableDeclaration )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6280:1: ( ruleVariableDeclaration )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6281:1: ruleVariableDeclaration
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalDeclarationAccess().getVariablesVariableDeclarationParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleVariableDeclaration_in_rule__LocalDeclaration__VariablesAssignment_112549);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6290:1: rule__LocalDeclaration__VariablesAssignment_2_1 : ( ruleVariableDeclaration ) ;
    public final void rule__LocalDeclaration__VariablesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6294:1: ( ( ruleVariableDeclaration ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6295:1: ( ruleVariableDeclaration )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6295:1: ( ruleVariableDeclaration )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6296:1: ruleVariableDeclaration
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalDeclarationAccess().getVariablesVariableDeclarationParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleVariableDeclaration_in_rule__LocalDeclaration__VariablesAssignment_2_112580);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6305:1: rule__GlobalDeclaration__VariablesAssignment_1 : ( ruleVariableDeclaration ) ;
    public final void rule__GlobalDeclaration__VariablesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6309:1: ( ( ruleVariableDeclaration ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6310:1: ( ruleVariableDeclaration )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6310:1: ( ruleVariableDeclaration )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6311:1: ruleVariableDeclaration
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGlobalDeclarationAccess().getVariablesVariableDeclarationParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleVariableDeclaration_in_rule__GlobalDeclaration__VariablesAssignment_112611);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6320:1: rule__GlobalDeclaration__VariablesAssignment_2_1 : ( ruleVariableDeclaration ) ;
    public final void rule__GlobalDeclaration__VariablesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6324:1: ( ( ruleVariableDeclaration ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6325:1: ( ruleVariableDeclaration )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6325:1: ( ruleVariableDeclaration )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6326:1: ruleVariableDeclaration
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGlobalDeclarationAccess().getVariablesVariableDeclarationParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleVariableDeclaration_in_rule__GlobalDeclaration__VariablesAssignment_2_112642);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6335:1: rule__VariableDeclaration__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__VariableDeclaration__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6339:1: ( ( RULE_ID ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6340:1: ( RULE_ID )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6340:1: ( RULE_ID )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6341:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableDeclarationAccess().getNameIDTerminalRuleCall_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__VariableDeclaration__NameAssignment_012673); if (state.failed) return ;
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6350:1: rule__VariableDeclaration__ValueAssignment_1_1 : ( ruleExpression ) ;
    public final void rule__VariableDeclaration__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6354:1: ( ( ruleExpression ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6355:1: ( ruleExpression )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6355:1: ( ruleExpression )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6356:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableDeclarationAccess().getValueExpressionParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__VariableDeclaration__ValueAssignment_1_112704);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6365:1: rule__Comparison__RightAssignment_1_1 : ( ruleOr ) ;
    public final void rule__Comparison__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6369:1: ( ( ruleOr ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6370:1: ( ruleOr )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6370:1: ( ruleOr )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6371:1: ruleOr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getRightOrParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleOr_in_rule__Comparison__RightAssignment_1_112735);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6380:1: rule__Or__RightAssignment_1_1 : ( ruleAnd ) ;
    public final void rule__Or__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6384:1: ( ( ruleAnd ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6385:1: ( ruleAnd )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6385:1: ( ruleAnd )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6386:1: ruleAnd
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAccess().getRightAndParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleAnd_in_rule__Or__RightAssignment_1_112766);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6395:1: rule__And__RightAssignment_1_1 : ( ruleAddition ) ;
    public final void rule__And__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6399:1: ( ( ruleAddition ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6400:1: ( ruleAddition )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6400:1: ( ruleAddition )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6401:1: ruleAddition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndAccess().getRightAdditionParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleAddition_in_rule__And__RightAssignment_1_112797);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6410:1: rule__Addition__RightAssignment_1_1 : ( ruleMultiplication ) ;
    public final void rule__Addition__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6414:1: ( ( ruleMultiplication ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6415:1: ( ruleMultiplication )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6415:1: ( ruleMultiplication )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6416:1: ruleMultiplication
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getRightMultiplicationParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleMultiplication_in_rule__Addition__RightAssignment_1_112828);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6425:1: rule__Multiplication__RightAssignment_1_1 : ( rulePrimaryExpression ) ;
    public final void rule__Multiplication__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6429:1: ( ( rulePrimaryExpression ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6430:1: ( rulePrimaryExpression )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6430:1: ( rulePrimaryExpression )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6431:1: rulePrimaryExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getRightPrimaryExpressionParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_rulePrimaryExpression_in_rule__Multiplication__RightAssignment_1_112859);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6440:1: rule__PrimaryExpression__ValueAssignment_1_1 : ( RULE_REAL ) ;
    public final void rule__PrimaryExpression__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6444:1: ( ( RULE_REAL ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6445:1: ( RULE_REAL )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6445:1: ( RULE_REAL )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6446:1: RULE_REAL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExpressionAccess().getValueREALTerminalRuleCall_1_1_0()); 
            }
            match(input,RULE_REAL,FOLLOW_RULE_REAL_in_rule__PrimaryExpression__ValueAssignment_1_112890); if (state.failed) return ;
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6455:1: rule__PrimaryExpression__ValueAssignment_2_1 : ( RULE_INT ) ;
    public final void rule__PrimaryExpression__ValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6459:1: ( ( RULE_INT ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6460:1: ( RULE_INT )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6460:1: ( RULE_INT )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6461:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExpressionAccess().getValueINTTerminalRuleCall_2_1_0()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__PrimaryExpression__ValueAssignment_2_112921); if (state.failed) return ;
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6470:1: rule__PrimaryExpression__ValueAssignment_5_1 : ( RULE_STRING ) ;
    public final void rule__PrimaryExpression__ValueAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6474:1: ( ( RULE_STRING ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6475:1: ( RULE_STRING )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6475:1: ( RULE_STRING )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6476:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExpressionAccess().getValueSTRINGTerminalRuleCall_5_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__PrimaryExpression__ValueAssignment_5_112952); if (state.failed) return ;
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


    // $ANTLR start "rule__ArrayLiteral__ValuesAssignment_2"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6485:1: rule__ArrayLiteral__ValuesAssignment_2 : ( ruleExpression ) ;
    public final void rule__ArrayLiteral__ValuesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6489:1: ( ( ruleExpression ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6490:1: ( ruleExpression )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6490:1: ( ruleExpression )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6491:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayLiteralAccess().getValuesExpressionParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__ArrayLiteral__ValuesAssignment_212983);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayLiteralAccess().getValuesExpressionParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayLiteral__ValuesAssignment_2"


    // $ANTLR start "rule__ArrayLiteral__ValuesAssignment_3_1"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6500:1: rule__ArrayLiteral__ValuesAssignment_3_1 : ( ruleExpression ) ;
    public final void rule__ArrayLiteral__ValuesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6504:1: ( ( ruleExpression ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6505:1: ( ruleExpression )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6505:1: ( ruleExpression )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6506:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayLiteralAccess().getValuesExpressionParserRuleCall_3_1_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__ArrayLiteral__ValuesAssignment_3_113014);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayLiteralAccess().getValuesExpressionParserRuleCall_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayLiteral__ValuesAssignment_3_1"


    // $ANTLR start "rule__VariableReference__VariableAssignment_0"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6515:1: rule__VariableReference__VariableAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__VariableReference__VariableAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6519:1: ( ( ( RULE_ID ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6520:1: ( ( RULE_ID ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6520:1: ( ( RULE_ID ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6521:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableReferenceAccess().getVariableVariableDeclarationCrossReference_0_0()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6522:1: ( RULE_ID )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6523:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableReferenceAccess().getVariableVariableDeclarationIDTerminalRuleCall_0_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__VariableReference__VariableAssignment_013049); if (state.failed) return ;
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6534:1: rule__VariableReference__DimensionsAssignment_1_1 : ( ruleExpression ) ;
    public final void rule__VariableReference__DimensionsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6538:1: ( ( ruleExpression ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6539:1: ( ruleExpression )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6539:1: ( ruleExpression )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6540:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableReferenceAccess().getDimensionsExpressionParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__VariableReference__DimensionsAssignment_1_113084);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6549:1: rule__FunctionCall__FunctionAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__FunctionCall__FunctionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6553:1: ( ( ( RULE_ID ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6554:1: ( ( RULE_ID ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6554:1: ( ( RULE_ID ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6555:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getFunctionFunctionDeclarationCrossReference_1_0()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6556:1: ( RULE_ID )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6557:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getFunctionFunctionDeclarationIDTerminalRuleCall_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FunctionCall__FunctionAssignment_113119); if (state.failed) return ;
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6568:1: rule__FunctionCall__ArgsAssignment_3 : ( ruleExpression ) ;
    public final void rule__FunctionCall__ArgsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6572:1: ( ( ruleExpression ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6573:1: ( ruleExpression )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6573:1: ( ruleExpression )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6574:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getArgsExpressionParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__FunctionCall__ArgsAssignment_313154);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6583:1: rule__FunctionCall__ArgsAssignment_4_1 : ( ruleExpression ) ;
    public final void rule__FunctionCall__ArgsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6587:1: ( ( ruleExpression ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6588:1: ( ruleExpression )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6588:1: ( ruleExpression )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6589:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getArgsExpressionParserRuleCall_4_1_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__FunctionCall__ArgsAssignment_4_113185);
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

    // $ANTLR start synpred30_InternalLeek
    public final void synpred30_InternalLeek_fragment() throws RecognitionException {   
        // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1607:2: ( rule__If__Group_5__0 )
        // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1607:2: rule__If__Group_5__0
        {
        pushFollow(FOLLOW_rule__If__Group_5__0_in_synpred30_InternalLeek3392);
        rule__If__Group_5__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred30_InternalLeek

    // $ANTLR start synpred31_InternalLeek
    public final void synpred31_InternalLeek_fragment() throws RecognitionException {   
        // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2031:2: ( rule__EachIterator__Group_0__0 )
        // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2031:2: rule__EachIterator__Group_0__0
        {
        pushFollow(FOLLOW_rule__EachIterator__Group_0__0_in_synpred31_InternalLeek4216);
        rule__EachIterator__Group_0__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred31_InternalLeek

    // Delegated rules

    public final boolean synpred30_InternalLeek() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred30_InternalLeek_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred31_InternalLeek() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred31_InternalLeek_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA2 dfa2 = new DFA2(this);
    static final String DFA2_eotS =
        "\14\uffff";
    static final String DFA2_eofS =
        "\14\uffff";
    static final String DFA2_minS =
        "\1\4\4\uffff\1\23\6\uffff";
    static final String DFA2_maxS =
        "\1\56\4\uffff\1\54\6\uffff";
    static final String DFA2_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\uffff\1\6\1\7\1\10\1\12\1\5\1\11";
    static final String DFA2_specialS =
        "\14\uffff}>";
    static final String[] DFA2_transitionS = {
            "\1\5\14\uffff\1\11\2\uffff\1\10\3\uffff\1\7\1\6\1\3\2\uffff\1\4\1\uffff\1\2\16\uffff\1\1",
            "",
            "",
            "",
            "",
            "\1\13\1\uffff\1\12\26\uffff\1\13",
            "",
            "",
            "",
            "",
            "",
            ""
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
            return "789:1: rule__Statement__Alternatives : ( ( ruleInclude ) | ( ruleGlobalDeclaration ) | ( ruleLocalDeclaration ) | ( ruleFunctionDeclaration ) | ( ( rule__Statement__Group_4__0 ) ) | ( ruleFor ) | ( ruleWhile ) | ( ruleIf ) | ( ( rule__Statement__Group_8__0 ) ) | ( ruleStatementBlock ) );";
        }
    }
 

    public static final BitSet FOLLOW_ruleScript_in_entryRuleScript67 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleScript74 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Script__StatementsAssignment_in_ruleScript100 = new BitSet(new long[]{0x00004000A7120012L});
    public static final BitSet FOLLOW_ruleStatement_in_entryRuleStatement128 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatement135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Alternatives_in_ruleStatement161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatementBlock_in_entryRuleStatementBlock188 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatementBlock195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StatementBlock__Group__0_in_ruleStatementBlock221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAffectation_in_entryRuleAffectation248 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAffectation255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Affectation__Group__0_in_ruleAffectation281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIf_in_entryRuleIf308 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIf315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__Group__0_in_ruleIf341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhile_in_entryRuleWhile368 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWhile375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__While__Group__0_in_ruleWhile401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFor_in_entryRuleFor428 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFor435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__For__Group__0_in_ruleFor461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForIterator_in_entryRuleForIterator488 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleForIterator495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ForIterator__Alternatives_in_ruleForIterator521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEachIterator_in_entryRuleEachIterator548 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEachIterator555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EachIterator__Group__0_in_ruleEachIterator581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableIterator_in_entryRuleVariableIterator608 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableIterator615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableIterator__Group__0_in_ruleVariableIterator641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionDeclaration_in_entryRuleFunctionDeclaration668 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionDeclaration675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__Group__0_in_ruleFunctionDeclaration701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterDeclaration_in_entryRuleParameterDeclaration728 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameterDeclaration735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterDeclaration__Group__0_in_ruleParameterDeclaration761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocalDeclaration_in_entryRuleLocalDeclaration788 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLocalDeclaration795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LocalDeclaration__Group__0_in_ruleLocalDeclaration821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGlobalDeclaration_in_entryRuleGlobalDeclaration848 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGlobalDeclaration855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GlobalDeclaration__Group__0_in_ruleGlobalDeclaration881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_entryRuleVariableDeclaration908 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableDeclaration915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group__0_in_ruleVariableDeclaration941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression968 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparison_in_ruleExpression1001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparison_in_entryRuleComparison1027 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComparison1034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group__0_in_ruleComparison1060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOr_in_entryRuleOr1087 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOr1094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Or__Group__0_in_ruleOr1120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnd_in_entryRuleAnd1147 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnd1154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__And__Group__0_in_ruleAnd1180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddition_in_entryRuleAddition1207 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAddition1214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group__0_in_ruleAddition1240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplication_in_entryRuleMultiplication1267 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiplication1274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group__0_in_ruleMultiplication1300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression1327 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimaryExpression1334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Alternatives_in_rulePrimaryExpression1360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayLiteral_in_entryRuleArrayLiteral1387 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArrayLiteral1394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayLiteral__Group__0_in_ruleArrayLiteral1420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableReference_in_entryRuleVariableReference1447 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableReference1454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableReference__Group__0_in_ruleVariableReference1480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionCall_in_entryRuleFunctionCall1507 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionCall1514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionCall__Group__0_in_ruleFunctionCall1540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInclude_in_entryRuleInclude1567 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInclude1574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Include__Group__0_in_ruleInclude1600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInclude_in_rule__Statement__Alternatives1636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGlobalDeclaration_in_rule__Statement__Alternatives1653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocalDeclaration_in_rule__Statement__Alternatives1670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionDeclaration_in_rule__Statement__Alternatives1687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_4__0_in_rule__Statement__Alternatives1704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFor_in_rule__Statement__Alternatives1722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhile_in_rule__Statement__Alternatives1739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIf_in_rule__Statement__Alternatives1756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_8__0_in_rule__Statement__Alternatives1773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatementBlock_in_rule__Statement__Alternatives1791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEachIterator_in_rule__ForIterator__Alternatives1823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableIterator_in_rule__ForIterator__Alternatives1840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1_0_0__0_in_rule__Comparison__Alternatives_1_01872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1_0_1__0_in_rule__Comparison__Alternatives_1_01890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1_0_2__0_in_rule__Comparison__Alternatives_1_01908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1_0_3__0_in_rule__Comparison__Alternatives_1_01926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1_0_4__0_in_rule__Comparison__Alternatives_1_01944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1_0_5__0_in_rule__Comparison__Alternatives_1_01962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1_0_6__0_in_rule__Comparison__Alternatives_1_01980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1_0_7__0_in_rule__Comparison__Alternatives_1_01998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Or__Alternatives_1_0_12032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Or__Alternatives_1_0_12052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__And__Alternatives_1_0_12087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__And__Alternatives_1_0_12107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1_0_0__0_in_rule__Addition__Alternatives_1_02141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1_0_1__0_in_rule__Addition__Alternatives_1_02159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1_0_0__0_in_rule__Multiplication__Alternatives_1_02192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1_0_1__0_in_rule__Multiplication__Alternatives_1_02210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_0__0_in_rule__PrimaryExpression__Alternatives2243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_1__0_in_rule__PrimaryExpression__Alternatives2261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_2__0_in_rule__PrimaryExpression__Alternatives2279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionCall_in_rule__PrimaryExpression__Alternatives2297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableReference_in_rule__PrimaryExpression__Alternatives2314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_5__0_in_rule__PrimaryExpression__Alternatives2331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayLiteral_in_rule__PrimaryExpression__Alternatives2349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_4__0__Impl_in_rule__Statement__Group_4__02379 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Statement__Group_4__1_in_rule__Statement__Group_4__02382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionCall_in_rule__Statement__Group_4__0__Impl2409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_4__1__Impl_in_rule__Statement__Group_4__12438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Statement__Group_4__1__Impl2466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_8__0__Impl_in_rule__Statement__Group_8__02501 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Statement__Group_8__1_in_rule__Statement__Group_8__02504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAffectation_in_rule__Statement__Group_8__0__Impl2531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_8__1__Impl_in_rule__Statement__Group_8__12560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Statement__Group_8__1__Impl2588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StatementBlock__Group__0__Impl_in_rule__StatementBlock__Group__02623 = new BitSet(new long[]{0x00004000A7160010L});
    public static final BitSet FOLLOW_rule__StatementBlock__Group__1_in_rule__StatementBlock__Group__02626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__StatementBlock__Group__0__Impl2654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StatementBlock__Group__1__Impl_in_rule__StatementBlock__Group__12685 = new BitSet(new long[]{0x00004000A7160010L});
    public static final BitSet FOLLOW_rule__StatementBlock__Group__2_in_rule__StatementBlock__Group__12688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StatementBlock__Group__2__Impl_in_rule__StatementBlock__Group__22746 = new BitSet(new long[]{0x00004000A7160010L});
    public static final BitSet FOLLOW_rule__StatementBlock__Group__3_in_rule__StatementBlock__Group__22749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StatementBlock__StatementsAssignment_2_in_rule__StatementBlock__Group__2__Impl2776 = new BitSet(new long[]{0x00004000A7120012L});
    public static final BitSet FOLLOW_rule__StatementBlock__Group__3__Impl_in_rule__StatementBlock__Group__32807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__StatementBlock__Group__3__Impl2835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Affectation__Group__0__Impl_in_rule__Affectation__Group__02874 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Affectation__Group__1_in_rule__Affectation__Group__02877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Affectation__VariableAssignment_0_in_rule__Affectation__Group__0__Impl2904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Affectation__Group__1__Impl_in_rule__Affectation__Group__12934 = new BitSet(new long[]{0x00001000002000F0L});
    public static final BitSet FOLLOW_rule__Affectation__Group__2_in_rule__Affectation__Group__12937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Affectation__Group__1__Impl2965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Affectation__Group__2__Impl_in_rule__Affectation__Group__22996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Affectation__ValueAssignment_2_in_rule__Affectation__Group__2__Impl3023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__Group__0__Impl_in_rule__If__Group__03059 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__If__Group__1_in_rule__If__Group__03062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__If__Group__0__Impl3090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__Group__1__Impl_in_rule__If__Group__13121 = new BitSet(new long[]{0x00001000002000F0L});
    public static final BitSet FOLLOW_rule__If__Group__2_in_rule__If__Group__13124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__If__Group__1__Impl3152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__Group__2__Impl_in_rule__If__Group__23183 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__If__Group__3_in_rule__If__Group__23186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__ConditionAssignment_2_in_rule__If__Group__2__Impl3213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__Group__3__Impl_in_rule__If__Group__33243 = new BitSet(new long[]{0x00004000A7120010L});
    public static final BitSet FOLLOW_rule__If__Group__4_in_rule__If__Group__33246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__If__Group__3__Impl3274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__Group__4__Impl_in_rule__If__Group__43305 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__If__Group__5_in_rule__If__Group__43308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__ThenAssignment_4_in_rule__If__Group__4__Impl3335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__Group__5__Impl_in_rule__If__Group__53365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__Group_5__0_in_rule__If__Group__5__Impl3392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__Group_5__0__Impl_in_rule__If__Group_5__03435 = new BitSet(new long[]{0x00004000A7120010L});
    public static final BitSet FOLLOW_rule__If__Group_5__1_in_rule__If__Group_5__03438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__If__Group_5__0__Impl3467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__Group_5__1__Impl_in_rule__If__Group_5__13499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__ElseAssignment_5_1_in_rule__If__Group_5__1__Impl3526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__While__Group__0__Impl_in_rule__While__Group__03560 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__While__Group__1_in_rule__While__Group__03563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__While__Group__0__Impl3591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__While__Group__1__Impl_in_rule__While__Group__13622 = new BitSet(new long[]{0x00001000002000F0L});
    public static final BitSet FOLLOW_rule__While__Group__2_in_rule__While__Group__13625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__While__Group__1__Impl3653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__While__Group__2__Impl_in_rule__While__Group__23684 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__While__Group__3_in_rule__While__Group__23687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__While__ConditionAssignment_2_in_rule__While__Group__2__Impl3714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__While__Group__3__Impl_in_rule__While__Group__33744 = new BitSet(new long[]{0x00004000A7120010L});
    public static final BitSet FOLLOW_rule__While__Group__4_in_rule__While__Group__33747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__While__Group__3__Impl3775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__While__Group__4__Impl_in_rule__While__Group__43806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__While__StatementAssignment_4_in_rule__While__Group__4__Impl3833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__For__Group__0__Impl_in_rule__For__Group__03873 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__For__Group__1_in_rule__For__Group__03876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__For__Group__0__Impl3904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__For__Group__1__Impl_in_rule__For__Group__13935 = new BitSet(new long[]{0x0000000004000010L});
    public static final BitSet FOLLOW_rule__For__Group__2_in_rule__For__Group__13938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__For__Group__1__Impl3966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__For__Group__2__Impl_in_rule__For__Group__23997 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__For__Group__3_in_rule__For__Group__24000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__For__IteratorAssignment_2_in_rule__For__Group__2__Impl4027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__For__Group__3__Impl_in_rule__For__Group__34057 = new BitSet(new long[]{0x00004000A7120010L});
    public static final BitSet FOLLOW_rule__For__Group__4_in_rule__For__Group__34060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__For__Group__3__Impl4088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__For__Group__4__Impl_in_rule__For__Group__44119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__For__StatementAssignment_4_in_rule__For__Group__4__Impl4146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EachIterator__Group__0__Impl_in_rule__EachIterator__Group__04186 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__EachIterator__Group__1_in_rule__EachIterator__Group__04189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EachIterator__Group_0__0_in_rule__EachIterator__Group__0__Impl4216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EachIterator__Group__1__Impl_in_rule__EachIterator__Group__14247 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EachIterator__Group__2_in_rule__EachIterator__Group__14250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__EachIterator__Group__1__Impl4278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EachIterator__Group__2__Impl_in_rule__EachIterator__Group__24309 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__EachIterator__Group__3_in_rule__EachIterator__Group__24312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EachIterator__ValueAssignment_2_in_rule__EachIterator__Group__2__Impl4339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EachIterator__Group__3__Impl_in_rule__EachIterator__Group__34369 = new BitSet(new long[]{0x00001000002000F0L});
    public static final BitSet FOLLOW_rule__EachIterator__Group__4_in_rule__EachIterator__Group__34372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__EachIterator__Group__3__Impl4400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EachIterator__Group__4__Impl_in_rule__EachIterator__Group__44431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EachIterator__ArrayAssignment_4_in_rule__EachIterator__Group__4__Impl4458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EachIterator__Group_0__0__Impl_in_rule__EachIterator__Group_0__04498 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EachIterator__Group_0__1_in_rule__EachIterator__Group_0__04501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__EachIterator__Group_0__0__Impl4530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EachIterator__Group_0__1__Impl_in_rule__EachIterator__Group_0__14562 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__EachIterator__Group_0__2_in_rule__EachIterator__Group_0__14565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EachIterator__KeyAssignment_0_1_in_rule__EachIterator__Group_0__1__Impl4592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EachIterator__Group_0__2__Impl_in_rule__EachIterator__Group_0__24622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__EachIterator__Group_0__2__Impl4650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableIterator__Group__0__Impl_in_rule__VariableIterator__Group__04687 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__VariableIterator__Group__1_in_rule__VariableIterator__Group__04690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableIterator__InitializationAssignment_0_in_rule__VariableIterator__Group__0__Impl4717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableIterator__Group__1__Impl_in_rule__VariableIterator__Group__14747 = new BitSet(new long[]{0x00001000002000F0L});
    public static final BitSet FOLLOW_rule__VariableIterator__Group__2_in_rule__VariableIterator__Group__14750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__VariableIterator__Group__1__Impl4778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableIterator__Group__2__Impl_in_rule__VariableIterator__Group__24809 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__VariableIterator__Group__3_in_rule__VariableIterator__Group__24812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableIterator__ConditionAssignment_2_in_rule__VariableIterator__Group__2__Impl4839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableIterator__Group__3__Impl_in_rule__VariableIterator__Group__34869 = new BitSet(new long[]{0x00001000002000F0L});
    public static final BitSet FOLLOW_rule__VariableIterator__Group__4_in_rule__VariableIterator__Group__34872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__VariableIterator__Group__3__Impl4900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableIterator__Group__4__Impl_in_rule__VariableIterator__Group__44931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableIterator__IncrementAssignment_4_in_rule__VariableIterator__Group__4__Impl4958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__Group__0__Impl_in_rule__FunctionDeclaration__Group__04998 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__Group__1_in_rule__FunctionDeclaration__Group__05001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__FunctionDeclaration__Group__0__Impl5029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__Group__1__Impl_in_rule__FunctionDeclaration__Group__15060 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__Group__2_in_rule__FunctionDeclaration__Group__15063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__NameAssignment_1_in_rule__FunctionDeclaration__Group__1__Impl5090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__Group__2__Impl_in_rule__FunctionDeclaration__Group__25120 = new BitSet(new long[]{0x0001000000400000L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__Group__3_in_rule__FunctionDeclaration__Group__25123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__FunctionDeclaration__Group__2__Impl5151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__Group__3__Impl_in_rule__FunctionDeclaration__Group__35182 = new BitSet(new long[]{0x0001000000400000L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__Group__4_in_rule__FunctionDeclaration__Group__35185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__Group_3__0_in_rule__FunctionDeclaration__Group__3__Impl5212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__Group__4__Impl_in_rule__FunctionDeclaration__Group__45243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__FunctionDeclaration__Group__4__Impl5271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__Group_3__0__Impl_in_rule__FunctionDeclaration__Group_3__05312 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__Group_3__1_in_rule__FunctionDeclaration__Group_3__05315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__ParameterAssignment_3_0_in_rule__FunctionDeclaration__Group_3__0__Impl5342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__Group_3__1__Impl_in_rule__FunctionDeclaration__Group_3__15372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__Group_3_1__0_in_rule__FunctionDeclaration__Group_3__1__Impl5399 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__Group_3_1__0__Impl_in_rule__FunctionDeclaration__Group_3_1__05434 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__Group_3_1__1_in_rule__FunctionDeclaration__Group_3_1__05437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__FunctionDeclaration__Group_3_1__0__Impl5465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__Group_3_1__1__Impl_in_rule__FunctionDeclaration__Group_3_1__15496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__ParameterAssignment_3_1_1_in_rule__FunctionDeclaration__Group_3_1__1__Impl5523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterDeclaration__Group__0__Impl_in_rule__ParameterDeclaration__Group__05557 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ParameterDeclaration__Group__1_in_rule__ParameterDeclaration__Group__05560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterDeclaration__ByAdressAssignment_0_in_rule__ParameterDeclaration__Group__0__Impl5587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterDeclaration__Group__1__Impl_in_rule__ParameterDeclaration__Group__15617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterDeclaration__NameAssignment_1_in_rule__ParameterDeclaration__Group__1__Impl5644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LocalDeclaration__Group__0__Impl_in_rule__LocalDeclaration__Group__05678 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__LocalDeclaration__Group__1_in_rule__LocalDeclaration__Group__05681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__LocalDeclaration__Group__0__Impl5709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LocalDeclaration__Group__1__Impl_in_rule__LocalDeclaration__Group__15740 = new BitSet(new long[]{0x0000000040010000L});
    public static final BitSet FOLLOW_rule__LocalDeclaration__Group__2_in_rule__LocalDeclaration__Group__15743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LocalDeclaration__VariablesAssignment_1_in_rule__LocalDeclaration__Group__1__Impl5770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LocalDeclaration__Group__2__Impl_in_rule__LocalDeclaration__Group__25800 = new BitSet(new long[]{0x0000000040010000L});
    public static final BitSet FOLLOW_rule__LocalDeclaration__Group__3_in_rule__LocalDeclaration__Group__25803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LocalDeclaration__Group_2__0_in_rule__LocalDeclaration__Group__2__Impl5830 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_rule__LocalDeclaration__Group__3__Impl_in_rule__LocalDeclaration__Group__35861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__LocalDeclaration__Group__3__Impl5889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LocalDeclaration__Group_2__0__Impl_in_rule__LocalDeclaration__Group_2__05928 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__LocalDeclaration__Group_2__1_in_rule__LocalDeclaration__Group_2__05931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__LocalDeclaration__Group_2__0__Impl5959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LocalDeclaration__Group_2__1__Impl_in_rule__LocalDeclaration__Group_2__15990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LocalDeclaration__VariablesAssignment_2_1_in_rule__LocalDeclaration__Group_2__1__Impl6017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GlobalDeclaration__Group__0__Impl_in_rule__GlobalDeclaration__Group__06051 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__GlobalDeclaration__Group__1_in_rule__GlobalDeclaration__Group__06054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__GlobalDeclaration__Group__0__Impl6082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GlobalDeclaration__Group__1__Impl_in_rule__GlobalDeclaration__Group__16113 = new BitSet(new long[]{0x0000000040010000L});
    public static final BitSet FOLLOW_rule__GlobalDeclaration__Group__2_in_rule__GlobalDeclaration__Group__16116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GlobalDeclaration__VariablesAssignment_1_in_rule__GlobalDeclaration__Group__1__Impl6143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GlobalDeclaration__Group__2__Impl_in_rule__GlobalDeclaration__Group__26173 = new BitSet(new long[]{0x0000000040010000L});
    public static final BitSet FOLLOW_rule__GlobalDeclaration__Group__3_in_rule__GlobalDeclaration__Group__26176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GlobalDeclaration__Group_2__0_in_rule__GlobalDeclaration__Group__2__Impl6203 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_rule__GlobalDeclaration__Group__3__Impl_in_rule__GlobalDeclaration__Group__36234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__GlobalDeclaration__Group__3__Impl6262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GlobalDeclaration__Group_2__0__Impl_in_rule__GlobalDeclaration__Group_2__06301 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__GlobalDeclaration__Group_2__1_in_rule__GlobalDeclaration__Group_2__06304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__GlobalDeclaration__Group_2__0__Impl6332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GlobalDeclaration__Group_2__1__Impl_in_rule__GlobalDeclaration__Group_2__16363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GlobalDeclaration__VariablesAssignment_2_1_in_rule__GlobalDeclaration__Group_2__1__Impl6390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group__0__Impl_in_rule__VariableDeclaration__Group__06424 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group__1_in_rule__VariableDeclaration__Group__06427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__NameAssignment_0_in_rule__VariableDeclaration__Group__0__Impl6454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group__1__Impl_in_rule__VariableDeclaration__Group__16484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group_1__0_in_rule__VariableDeclaration__Group__1__Impl6511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group_1__0__Impl_in_rule__VariableDeclaration__Group_1__06546 = new BitSet(new long[]{0x00001000002000F0L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group_1__1_in_rule__VariableDeclaration__Group_1__06549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__VariableDeclaration__Group_1__0__Impl6577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group_1__1__Impl_in_rule__VariableDeclaration__Group_1__16608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__ValueAssignment_1_1_in_rule__VariableDeclaration__Group_1__1__Impl6635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group__0__Impl_in_rule__Comparison__Group__06669 = new BitSet(new long[]{0x000000FF00000000L});
    public static final BitSet FOLLOW_rule__Comparison__Group__1_in_rule__Comparison__Group__06672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOr_in_rule__Comparison__Group__0__Impl6699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group__1__Impl_in_rule__Comparison__Group__16728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1__0_in_rule__Comparison__Group__1__Impl6755 = new BitSet(new long[]{0x000000FF00000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1__0__Impl_in_rule__Comparison__Group_1__06790 = new BitSet(new long[]{0x00001000002000F0L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1__1_in_rule__Comparison__Group_1__06793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Alternatives_1_0_in_rule__Comparison__Group_1__0__Impl6820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1__1__Impl_in_rule__Comparison__Group_1__16850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__RightAssignment_1_1_in_rule__Comparison__Group_1__1__Impl6877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1_0_0__0__Impl_in_rule__Comparison__Group_1_0_0__06911 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1_0_0__1_in_rule__Comparison__Group_1_0_0__06914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1_0_0__1__Impl_in_rule__Comparison__Group_1_0_0__16972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Comparison__Group_1_0_0__1__Impl7000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1_0_1__0__Impl_in_rule__Comparison__Group_1_0_1__07035 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1_0_1__1_in_rule__Comparison__Group_1_0_1__07038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1_0_1__1__Impl_in_rule__Comparison__Group_1_0_1__17096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Comparison__Group_1_0_1__1__Impl7124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1_0_2__0__Impl_in_rule__Comparison__Group_1_0_2__07159 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1_0_2__1_in_rule__Comparison__Group_1_0_2__07162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1_0_2__1__Impl_in_rule__Comparison__Group_1_0_2__17220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Comparison__Group_1_0_2__1__Impl7248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1_0_3__0__Impl_in_rule__Comparison__Group_1_0_3__07283 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1_0_3__1_in_rule__Comparison__Group_1_0_3__07286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1_0_3__1__Impl_in_rule__Comparison__Group_1_0_3__17344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Comparison__Group_1_0_3__1__Impl7372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1_0_4__0__Impl_in_rule__Comparison__Group_1_0_4__07407 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1_0_4__1_in_rule__Comparison__Group_1_0_4__07410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1_0_4__1__Impl_in_rule__Comparison__Group_1_0_4__17468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Comparison__Group_1_0_4__1__Impl7496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1_0_5__0__Impl_in_rule__Comparison__Group_1_0_5__07531 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1_0_5__1_in_rule__Comparison__Group_1_0_5__07534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1_0_5__1__Impl_in_rule__Comparison__Group_1_0_5__17592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Comparison__Group_1_0_5__1__Impl7620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1_0_6__0__Impl_in_rule__Comparison__Group_1_0_6__07655 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1_0_6__1_in_rule__Comparison__Group_1_0_6__07658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1_0_6__1__Impl_in_rule__Comparison__Group_1_0_6__17716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Comparison__Group_1_0_6__1__Impl7744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1_0_7__0__Impl_in_rule__Comparison__Group_1_0_7__07779 = new BitSet(new long[]{0x000000FF00000000L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1_0_7__1_in_rule__Comparison__Group_1_0_7__07782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1_0_7__1__Impl_in_rule__Comparison__Group_1_0_7__17840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Comparison__Group_1_0_7__1__Impl7868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Or__Group__0__Impl_in_rule__Or__Group__07903 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_rule__Or__Group__1_in_rule__Or__Group__07906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnd_in_rule__Or__Group__0__Impl7933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Or__Group__1__Impl_in_rule__Or__Group__17962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Or__Group_1__0_in_rule__Or__Group__1__Impl7989 = new BitSet(new long[]{0x0000000000003002L});
    public static final BitSet FOLLOW_rule__Or__Group_1__0__Impl_in_rule__Or__Group_1__08024 = new BitSet(new long[]{0x00001000002000F0L});
    public static final BitSet FOLLOW_rule__Or__Group_1__1_in_rule__Or__Group_1__08027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Or__Group_1_0__0_in_rule__Or__Group_1__0__Impl8054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Or__Group_1__1__Impl_in_rule__Or__Group_1__18084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Or__RightAssignment_1_1_in_rule__Or__Group_1__1__Impl8111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Or__Group_1_0__0__Impl_in_rule__Or__Group_1_0__08145 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_rule__Or__Group_1_0__1_in_rule__Or__Group_1_0__08148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Or__Group_1_0__1__Impl_in_rule__Or__Group_1_0__18206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Or__Alternatives_1_0_1_in_rule__Or__Group_1_0__1__Impl8233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__And__Group__0__Impl_in_rule__And__Group__08267 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_rule__And__Group__1_in_rule__And__Group__08270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddition_in_rule__And__Group__0__Impl8297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__And__Group__1__Impl_in_rule__And__Group__18326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__And__Group_1__0_in_rule__And__Group__1__Impl8353 = new BitSet(new long[]{0x000000000000C002L});
    public static final BitSet FOLLOW_rule__And__Group_1__0__Impl_in_rule__And__Group_1__08388 = new BitSet(new long[]{0x00001000002000F0L});
    public static final BitSet FOLLOW_rule__And__Group_1__1_in_rule__And__Group_1__08391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__And__Group_1_0__0_in_rule__And__Group_1__0__Impl8418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__And__Group_1__1__Impl_in_rule__And__Group_1__18448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__And__RightAssignment_1_1_in_rule__And__Group_1__1__Impl8475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__And__Group_1_0__0__Impl_in_rule__And__Group_1_0__08509 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_rule__And__Group_1_0__1_in_rule__And__Group_1_0__08512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__And__Group_1_0__1__Impl_in_rule__And__Group_1_0__18570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__And__Alternatives_1_0_1_in_rule__And__Group_1_0__1__Impl8597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group__0__Impl_in_rule__Addition__Group__08631 = new BitSet(new long[]{0x0000030000000000L});
    public static final BitSet FOLLOW_rule__Addition__Group__1_in_rule__Addition__Group__08634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplication_in_rule__Addition__Group__0__Impl8661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group__1__Impl_in_rule__Addition__Group__18690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1__0_in_rule__Addition__Group__1__Impl8717 = new BitSet(new long[]{0x0000030000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1__0__Impl_in_rule__Addition__Group_1__08752 = new BitSet(new long[]{0x00001000002000F0L});
    public static final BitSet FOLLOW_rule__Addition__Group_1__1_in_rule__Addition__Group_1__08755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Alternatives_1_0_in_rule__Addition__Group_1__0__Impl8782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1__1__Impl_in_rule__Addition__Group_1__18812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__RightAssignment_1_1_in_rule__Addition__Group_1__1__Impl8839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1_0_0__0__Impl_in_rule__Addition__Group_1_0_0__08873 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__Addition__Group_1_0_0__1_in_rule__Addition__Group_1_0_0__08876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1_0_0__1__Impl_in_rule__Addition__Group_1_0_0__18934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Addition__Group_1_0_0__1__Impl8962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1_0_1__0__Impl_in_rule__Addition__Group_1_0_1__08997 = new BitSet(new long[]{0x0000030000000000L});
    public static final BitSet FOLLOW_rule__Addition__Group_1_0_1__1_in_rule__Addition__Group_1_0_1__09000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1_0_1__1__Impl_in_rule__Addition__Group_1_0_1__19058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__Addition__Group_1_0_1__1__Impl9086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group__0__Impl_in_rule__Multiplication__Group__09121 = new BitSet(new long[]{0x00000C0000000000L});
    public static final BitSet FOLLOW_rule__Multiplication__Group__1_in_rule__Multiplication__Group__09124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_rule__Multiplication__Group__0__Impl9151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group__1__Impl_in_rule__Multiplication__Group__19180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1__0_in_rule__Multiplication__Group__1__Impl9207 = new BitSet(new long[]{0x00000C0000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1__0__Impl_in_rule__Multiplication__Group_1__09242 = new BitSet(new long[]{0x00001000002000F0L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1__1_in_rule__Multiplication__Group_1__09245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Alternatives_1_0_in_rule__Multiplication__Group_1__0__Impl9272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1__1__Impl_in_rule__Multiplication__Group_1__19302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__RightAssignment_1_1_in_rule__Multiplication__Group_1__1__Impl9329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1_0_0__0__Impl_in_rule__Multiplication__Group_1_0_0__09363 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1_0_0__1_in_rule__Multiplication__Group_1_0_0__09366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1_0_0__1__Impl_in_rule__Multiplication__Group_1_0_0__19424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__Multiplication__Group_1_0_0__1__Impl9452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1_0_1__0__Impl_in_rule__Multiplication__Group_1_0_1__09487 = new BitSet(new long[]{0x00000C0000000000L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1_0_1__1_in_rule__Multiplication__Group_1_0_1__09490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1_0_1__1__Impl_in_rule__Multiplication__Group_1_0_1__19548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__Multiplication__Group_1_0_1__1__Impl9576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_0__0__Impl_in_rule__PrimaryExpression__Group_0__09611 = new BitSet(new long[]{0x00001000002000F0L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_0__1_in_rule__PrimaryExpression__Group_0__09614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__PrimaryExpression__Group_0__0__Impl9642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_0__1__Impl_in_rule__PrimaryExpression__Group_0__19673 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_0__2_in_rule__PrimaryExpression__Group_0__19676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__PrimaryExpression__Group_0__1__Impl9703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_0__2__Impl_in_rule__PrimaryExpression__Group_0__29732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__PrimaryExpression__Group_0__2__Impl9760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_1__0__Impl_in_rule__PrimaryExpression__Group_1__09797 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_1__1_in_rule__PrimaryExpression__Group_1__09800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_1__1__Impl_in_rule__PrimaryExpression__Group_1__19858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__ValueAssignment_1_1_in_rule__PrimaryExpression__Group_1__1__Impl9885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_2__0__Impl_in_rule__PrimaryExpression__Group_2__09919 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_2__1_in_rule__PrimaryExpression__Group_2__09922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_2__1__Impl_in_rule__PrimaryExpression__Group_2__19980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__ValueAssignment_2_1_in_rule__PrimaryExpression__Group_2__1__Impl10007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_5__0__Impl_in_rule__PrimaryExpression__Group_5__010041 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_5__1_in_rule__PrimaryExpression__Group_5__010044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_5__1__Impl_in_rule__PrimaryExpression__Group_5__110102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__ValueAssignment_5_1_in_rule__PrimaryExpression__Group_5__1__Impl10129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayLiteral__Group__0__Impl_in_rule__ArrayLiteral__Group__010163 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__ArrayLiteral__Group__1_in_rule__ArrayLiteral__Group__010166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__ArrayLiteral__Group__0__Impl10194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayLiteral__Group__1__Impl_in_rule__ArrayLiteral__Group__110225 = new BitSet(new long[]{0x00001000002000F0L});
    public static final BitSet FOLLOW_rule__ArrayLiteral__Group__2_in_rule__ArrayLiteral__Group__110228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__ArrayLiteral__Group__1__Impl10256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayLiteral__Group__2__Impl_in_rule__ArrayLiteral__Group__210287 = new BitSet(new long[]{0x0000200040000000L});
    public static final BitSet FOLLOW_rule__ArrayLiteral__Group__3_in_rule__ArrayLiteral__Group__210290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayLiteral__ValuesAssignment_2_in_rule__ArrayLiteral__Group__2__Impl10317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayLiteral__Group__3__Impl_in_rule__ArrayLiteral__Group__310347 = new BitSet(new long[]{0x0000200040000000L});
    public static final BitSet FOLLOW_rule__ArrayLiteral__Group__4_in_rule__ArrayLiteral__Group__310350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayLiteral__Group_3__0_in_rule__ArrayLiteral__Group__3__Impl10377 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_rule__ArrayLiteral__Group__4__Impl_in_rule__ArrayLiteral__Group__410408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__ArrayLiteral__Group__4__Impl10436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayLiteral__Group_3__0__Impl_in_rule__ArrayLiteral__Group_3__010477 = new BitSet(new long[]{0x00001000002000F0L});
    public static final BitSet FOLLOW_rule__ArrayLiteral__Group_3__1_in_rule__ArrayLiteral__Group_3__010480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__ArrayLiteral__Group_3__0__Impl10508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayLiteral__Group_3__1__Impl_in_rule__ArrayLiteral__Group_3__110539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayLiteral__ValuesAssignment_3_1_in_rule__ArrayLiteral__Group_3__1__Impl10566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableReference__Group__0__Impl_in_rule__VariableReference__Group__010600 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_rule__VariableReference__Group__1_in_rule__VariableReference__Group__010603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableReference__VariableAssignment_0_in_rule__VariableReference__Group__0__Impl10630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableReference__Group__1__Impl_in_rule__VariableReference__Group__110660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableReference__Group_1__0_in_rule__VariableReference__Group__1__Impl10687 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_rule__VariableReference__Group_1__0__Impl_in_rule__VariableReference__Group_1__010722 = new BitSet(new long[]{0x00001000002000F0L});
    public static final BitSet FOLLOW_rule__VariableReference__Group_1__1_in_rule__VariableReference__Group_1__010725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__VariableReference__Group_1__0__Impl10753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableReference__Group_1__1__Impl_in_rule__VariableReference__Group_1__110784 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_rule__VariableReference__Group_1__2_in_rule__VariableReference__Group_1__110787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableReference__DimensionsAssignment_1_1_in_rule__VariableReference__Group_1__1__Impl10814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableReference__Group_1__2__Impl_in_rule__VariableReference__Group_1__210844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__VariableReference__Group_1__2__Impl10872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionCall__Group__0__Impl_in_rule__FunctionCall__Group__010909 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__FunctionCall__Group__1_in_rule__FunctionCall__Group__010912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionCall__Group__1__Impl_in_rule__FunctionCall__Group__110970 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__FunctionCall__Group__2_in_rule__FunctionCall__Group__110973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionCall__FunctionAssignment_1_in_rule__FunctionCall__Group__1__Impl11000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionCall__Group__2__Impl_in_rule__FunctionCall__Group__211030 = new BitSet(new long[]{0x00001000002000F0L});
    public static final BitSet FOLLOW_rule__FunctionCall__Group__3_in_rule__FunctionCall__Group__211033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__FunctionCall__Group__2__Impl11061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionCall__Group__3__Impl_in_rule__FunctionCall__Group__311092 = new BitSet(new long[]{0x0000000040400000L});
    public static final BitSet FOLLOW_rule__FunctionCall__Group__4_in_rule__FunctionCall__Group__311095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionCall__ArgsAssignment_3_in_rule__FunctionCall__Group__3__Impl11122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionCall__Group__4__Impl_in_rule__FunctionCall__Group__411152 = new BitSet(new long[]{0x0000000040400000L});
    public static final BitSet FOLLOW_rule__FunctionCall__Group__5_in_rule__FunctionCall__Group__411155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionCall__Group_4__0_in_rule__FunctionCall__Group__4__Impl11182 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_rule__FunctionCall__Group__5__Impl_in_rule__FunctionCall__Group__511213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__FunctionCall__Group__5__Impl11241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionCall__Group_4__0__Impl_in_rule__FunctionCall__Group_4__011284 = new BitSet(new long[]{0x00001000002000F0L});
    public static final BitSet FOLLOW_rule__FunctionCall__Group_4__1_in_rule__FunctionCall__Group_4__011287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__FunctionCall__Group_4__0__Impl11315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionCall__Group_4__1__Impl_in_rule__FunctionCall__Group_4__111346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionCall__ArgsAssignment_4_1_in_rule__FunctionCall__Group_4__1__Impl11373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Include__Group__0__Impl_in_rule__Include__Group__011407 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Include__Group__1_in_rule__Include__Group__011410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__Include__Group__0__Impl11438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Include__Group__1__Impl_in_rule__Include__Group__111469 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_rule__Include__Group__2_in_rule__Include__Group__111472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Include__Group__1__Impl11500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Include__Group__2__Impl_in_rule__Include__Group__211531 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Include__Group__3_in_rule__Include__Group__211534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__Include__Group__2__Impl11562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Include__Group__3__Impl_in_rule__Include__Group__311593 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_rule__Include__Group__4_in_rule__Include__Group__311596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Include__Group__3__Impl11623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Include__Group__4__Impl_in_rule__Include__Group__411652 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Include__Group__5_in_rule__Include__Group__411655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__Include__Group__4__Impl11683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Include__Group__5__Impl_in_rule__Include__Group__511714 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Include__Group__6_in_rule__Include__Group__511717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Include__Group__5__Impl11745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Include__Group__6__Impl_in_rule__Include__Group__611776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Include__Group__6__Impl11804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_rule__Script__StatementsAssignment11854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_rule__StatementBlock__StatementsAssignment_211885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableReference_in_rule__Affectation__VariableAssignment_011916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__Affectation__ValueAssignment_211947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__If__ConditionAssignment_211978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_rule__If__ThenAssignment_412009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_rule__If__ElseAssignment_5_112040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__While__ConditionAssignment_212071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_rule__While__StatementAssignment_412102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForIterator_in_rule__For__IteratorAssignment_212133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_rule__For__StatementAssignment_412164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_rule__EachIterator__KeyAssignment_0_112195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_rule__EachIterator__ValueAssignment_212226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__EachIterator__ArrayAssignment_412257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAffectation_in_rule__VariableIterator__InitializationAssignment_012288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__VariableIterator__ConditionAssignment_212319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__VariableIterator__IncrementAssignment_412350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FunctionDeclaration__NameAssignment_112381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterDeclaration_in_rule__FunctionDeclaration__ParameterAssignment_3_012412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterDeclaration_in_rule__FunctionDeclaration__ParameterAssignment_3_1_112443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__ParameterDeclaration__ByAdressAssignment_012479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ParameterDeclaration__NameAssignment_112518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_rule__LocalDeclaration__VariablesAssignment_112549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_rule__LocalDeclaration__VariablesAssignment_2_112580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_rule__GlobalDeclaration__VariablesAssignment_112611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_rule__GlobalDeclaration__VariablesAssignment_2_112642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__VariableDeclaration__NameAssignment_012673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__VariableDeclaration__ValueAssignment_1_112704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOr_in_rule__Comparison__RightAssignment_1_112735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnd_in_rule__Or__RightAssignment_1_112766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddition_in_rule__And__RightAssignment_1_112797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplication_in_rule__Addition__RightAssignment_1_112828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_rule__Multiplication__RightAssignment_1_112859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_REAL_in_rule__PrimaryExpression__ValueAssignment_1_112890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__PrimaryExpression__ValueAssignment_2_112921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__PrimaryExpression__ValueAssignment_5_112952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__ArrayLiteral__ValuesAssignment_212983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__ArrayLiteral__ValuesAssignment_3_113014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__VariableReference__VariableAssignment_013049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__VariableReference__DimensionsAssignment_1_113084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FunctionCall__FunctionAssignment_113119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__FunctionCall__ArgsAssignment_313154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__FunctionCall__ArgsAssignment_4_113185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__Group_5__0_in_synpred30_InternalLeek3392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EachIterator__Group_0__0_in_synpred31_InternalLeek4216 = new BitSet(new long[]{0x0000000000000002L});

}