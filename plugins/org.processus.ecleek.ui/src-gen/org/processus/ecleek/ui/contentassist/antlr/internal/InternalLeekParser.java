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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_REAL", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'or'", "'||'", "'and'", "'&&'", "';'", "'{'", "'}'", "'='", "'if'", "'('", "')'", "'else'", "'while'", "'for'", "':'", "'in'", "'function'", "','", "'var'", "'global'", "'==='", "'=='", "'!=='", "'!='", "'<='", "'<'", "'>='", "'>'", "'+'", "'-'", "'*'", "'/'", "'['", "']'", "'include'", "'\"'", "'@'"
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




    // $ANTLR start "entryRuleModel"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:61:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:62:1: ( ruleModel EOF )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:63:1: ruleModel EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelRule()); 
            }
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel67);
            ruleModel();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel74); if (state.failed) return ;

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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:70:1: ruleModel : ( ( rule__Model__StatementsAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:74:2: ( ( ( rule__Model__StatementsAssignment )* ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:75:1: ( ( rule__Model__StatementsAssignment )* )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:75:1: ( ( rule__Model__StatementsAssignment )* )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:76:1: ( rule__Model__StatementsAssignment )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getStatementsAssignment()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:77:1: ( rule__Model__StatementsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID||LA1_0==17||LA1_0==20||(LA1_0>=24 && LA1_0<=25)||LA1_0==28||(LA1_0>=30 && LA1_0<=31)||LA1_0==46) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:77:2: rule__Model__StatementsAssignment
            	    {
            	    pushFollow(FOLLOW_rule__Model__StatementsAssignment_in_ruleModel100);
            	    rule__Model__StatementsAssignment();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getStatementsAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


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


    // $ANTLR start "entryRuleEachKeyIterator"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:257:1: entryRuleEachKeyIterator : ruleEachKeyIterator EOF ;
    public final void entryRuleEachKeyIterator() throws RecognitionException {
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:258:1: ( ruleEachKeyIterator EOF )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:259:1: ruleEachKeyIterator EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEachKeyIteratorRule()); 
            }
            pushFollow(FOLLOW_ruleEachKeyIterator_in_entryRuleEachKeyIterator488);
            ruleEachKeyIterator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEachKeyIteratorRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEachKeyIterator495); if (state.failed) return ;

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
    // $ANTLR end "entryRuleEachKeyIterator"


    // $ANTLR start "ruleEachKeyIterator"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:266:1: ruleEachKeyIterator : ( ( rule__EachKeyIterator__Group__0 ) ) ;
    public final void ruleEachKeyIterator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:270:2: ( ( ( rule__EachKeyIterator__Group__0 ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:271:1: ( ( rule__EachKeyIterator__Group__0 ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:271:1: ( ( rule__EachKeyIterator__Group__0 ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:272:1: ( rule__EachKeyIterator__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEachKeyIteratorAccess().getGroup()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:273:1: ( rule__EachKeyIterator__Group__0 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:273:2: rule__EachKeyIterator__Group__0
            {
            pushFollow(FOLLOW_rule__EachKeyIterator__Group__0_in_ruleEachKeyIterator521);
            rule__EachKeyIterator__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEachKeyIteratorAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEachKeyIterator"


    // $ANTLR start "entryRuleEachValueIterator"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:285:1: entryRuleEachValueIterator : ruleEachValueIterator EOF ;
    public final void entryRuleEachValueIterator() throws RecognitionException {
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:286:1: ( ruleEachValueIterator EOF )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:287:1: ruleEachValueIterator EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEachValueIteratorRule()); 
            }
            pushFollow(FOLLOW_ruleEachValueIterator_in_entryRuleEachValueIterator548);
            ruleEachValueIterator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEachValueIteratorRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEachValueIterator555); if (state.failed) return ;

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
    // $ANTLR end "entryRuleEachValueIterator"


    // $ANTLR start "ruleEachValueIterator"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:294:1: ruleEachValueIterator : ( ( rule__EachValueIterator__Group__0 ) ) ;
    public final void ruleEachValueIterator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:298:2: ( ( ( rule__EachValueIterator__Group__0 ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:299:1: ( ( rule__EachValueIterator__Group__0 ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:299:1: ( ( rule__EachValueIterator__Group__0 ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:300:1: ( rule__EachValueIterator__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEachValueIteratorAccess().getGroup()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:301:1: ( rule__EachValueIterator__Group__0 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:301:2: rule__EachValueIterator__Group__0
            {
            pushFollow(FOLLOW_rule__EachValueIterator__Group__0_in_ruleEachValueIterator581);
            rule__EachValueIterator__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEachValueIteratorAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEachValueIterator"


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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:399:1: entryRuleLocalDeclaration : ruleLocalDeclaration EOF ;
    public final void entryRuleLocalDeclaration() throws RecognitionException {
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:400:1: ( ruleLocalDeclaration EOF )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:401:1: ruleLocalDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleLocalDeclaration_in_entryRuleLocalDeclaration790);
            ruleLocalDeclaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocalDeclarationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLocalDeclaration797); if (state.failed) return ;

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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:408:1: ruleLocalDeclaration : ( ( rule__LocalDeclaration__Group__0 ) ) ;
    public final void ruleLocalDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:412:2: ( ( ( rule__LocalDeclaration__Group__0 ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:413:1: ( ( rule__LocalDeclaration__Group__0 ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:413:1: ( ( rule__LocalDeclaration__Group__0 ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:414:1: ( rule__LocalDeclaration__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalDeclarationAccess().getGroup()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:415:1: ( rule__LocalDeclaration__Group__0 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:415:2: rule__LocalDeclaration__Group__0
            {
            pushFollow(FOLLOW_rule__LocalDeclaration__Group__0_in_ruleLocalDeclaration823);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:427:1: entryRuleGlobalDeclaration : ruleGlobalDeclaration EOF ;
    public final void entryRuleGlobalDeclaration() throws RecognitionException {
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:428:1: ( ruleGlobalDeclaration EOF )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:429:1: ruleGlobalDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGlobalDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleGlobalDeclaration_in_entryRuleGlobalDeclaration850);
            ruleGlobalDeclaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGlobalDeclarationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGlobalDeclaration857); if (state.failed) return ;

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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:436:1: ruleGlobalDeclaration : ( ( rule__GlobalDeclaration__Group__0 ) ) ;
    public final void ruleGlobalDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:440:2: ( ( ( rule__GlobalDeclaration__Group__0 ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:441:1: ( ( rule__GlobalDeclaration__Group__0 ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:441:1: ( ( rule__GlobalDeclaration__Group__0 ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:442:1: ( rule__GlobalDeclaration__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGlobalDeclarationAccess().getGroup()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:443:1: ( rule__GlobalDeclaration__Group__0 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:443:2: rule__GlobalDeclaration__Group__0
            {
            pushFollow(FOLLOW_rule__GlobalDeclaration__Group__0_in_ruleGlobalDeclaration883);
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


    // $ANTLR start "entryRuleExpression"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:455:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:456:1: ( ruleExpression EOF )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:457:1: ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression910);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression917); if (state.failed) return ;

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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:464:1: ruleExpression : ( ruleComparison ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:468:2: ( ( ruleComparison ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:469:1: ( ruleComparison )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:469:1: ( ruleComparison )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:470:1: ruleComparison
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getComparisonParserRuleCall()); 
            }
            pushFollow(FOLLOW_ruleComparison_in_ruleExpression943);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:483:1: entryRuleComparison : ruleComparison EOF ;
    public final void entryRuleComparison() throws RecognitionException {
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:484:1: ( ruleComparison EOF )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:485:1: ruleComparison EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonRule()); 
            }
            pushFollow(FOLLOW_ruleComparison_in_entryRuleComparison969);
            ruleComparison();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleComparison976); if (state.failed) return ;

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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:492:1: ruleComparison : ( ( rule__Comparison__Group__0 ) ) ;
    public final void ruleComparison() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:496:2: ( ( ( rule__Comparison__Group__0 ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:497:1: ( ( rule__Comparison__Group__0 ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:497:1: ( ( rule__Comparison__Group__0 ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:498:1: ( rule__Comparison__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getGroup()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:499:1: ( rule__Comparison__Group__0 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:499:2: rule__Comparison__Group__0
            {
            pushFollow(FOLLOW_rule__Comparison__Group__0_in_ruleComparison1002);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:511:1: entryRuleOr : ruleOr EOF ;
    public final void entryRuleOr() throws RecognitionException {
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:512:1: ( ruleOr EOF )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:513:1: ruleOr EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrRule()); 
            }
            pushFollow(FOLLOW_ruleOr_in_entryRuleOr1029);
            ruleOr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOr1036); if (state.failed) return ;

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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:520:1: ruleOr : ( ( rule__Or__Group__0 ) ) ;
    public final void ruleOr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:524:2: ( ( ( rule__Or__Group__0 ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:525:1: ( ( rule__Or__Group__0 ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:525:1: ( ( rule__Or__Group__0 ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:526:1: ( rule__Or__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAccess().getGroup()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:527:1: ( rule__Or__Group__0 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:527:2: rule__Or__Group__0
            {
            pushFollow(FOLLOW_rule__Or__Group__0_in_ruleOr1062);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:539:1: entryRuleAnd : ruleAnd EOF ;
    public final void entryRuleAnd() throws RecognitionException {
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:540:1: ( ruleAnd EOF )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:541:1: ruleAnd EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndRule()); 
            }
            pushFollow(FOLLOW_ruleAnd_in_entryRuleAnd1089);
            ruleAnd();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnd1096); if (state.failed) return ;

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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:548:1: ruleAnd : ( ( rule__And__Group__0 ) ) ;
    public final void ruleAnd() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:552:2: ( ( ( rule__And__Group__0 ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:553:1: ( ( rule__And__Group__0 ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:553:1: ( ( rule__And__Group__0 ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:554:1: ( rule__And__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndAccess().getGroup()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:555:1: ( rule__And__Group__0 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:555:2: rule__And__Group__0
            {
            pushFollow(FOLLOW_rule__And__Group__0_in_ruleAnd1122);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:567:1: entryRuleAddition : ruleAddition EOF ;
    public final void entryRuleAddition() throws RecognitionException {
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:568:1: ( ruleAddition EOF )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:569:1: ruleAddition EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionRule()); 
            }
            pushFollow(FOLLOW_ruleAddition_in_entryRuleAddition1149);
            ruleAddition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAddition1156); if (state.failed) return ;

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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:576:1: ruleAddition : ( ( rule__Addition__Group__0 ) ) ;
    public final void ruleAddition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:580:2: ( ( ( rule__Addition__Group__0 ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:581:1: ( ( rule__Addition__Group__0 ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:581:1: ( ( rule__Addition__Group__0 ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:582:1: ( rule__Addition__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getGroup()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:583:1: ( rule__Addition__Group__0 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:583:2: rule__Addition__Group__0
            {
            pushFollow(FOLLOW_rule__Addition__Group__0_in_ruleAddition1182);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:595:1: entryRuleMultiplication : ruleMultiplication EOF ;
    public final void entryRuleMultiplication() throws RecognitionException {
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:596:1: ( ruleMultiplication EOF )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:597:1: ruleMultiplication EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationRule()); 
            }
            pushFollow(FOLLOW_ruleMultiplication_in_entryRuleMultiplication1209);
            ruleMultiplication();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiplication1216); if (state.failed) return ;

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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:604:1: ruleMultiplication : ( ( rule__Multiplication__Group__0 ) ) ;
    public final void ruleMultiplication() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:608:2: ( ( ( rule__Multiplication__Group__0 ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:609:1: ( ( rule__Multiplication__Group__0 ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:609:1: ( ( rule__Multiplication__Group__0 ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:610:1: ( rule__Multiplication__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getGroup()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:611:1: ( rule__Multiplication__Group__0 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:611:2: rule__Multiplication__Group__0
            {
            pushFollow(FOLLOW_rule__Multiplication__Group__0_in_ruleMultiplication1242);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:623:1: entryRulePrimaryExpression : rulePrimaryExpression EOF ;
    public final void entryRulePrimaryExpression() throws RecognitionException {
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:624:1: ( rulePrimaryExpression EOF )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:625:1: rulePrimaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExpressionRule()); 
            }
            pushFollow(FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression1269);
            rulePrimaryExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimaryExpression1276); if (state.failed) return ;

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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:632:1: rulePrimaryExpression : ( ( rule__PrimaryExpression__Alternatives ) ) ;
    public final void rulePrimaryExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:636:2: ( ( ( rule__PrimaryExpression__Alternatives ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:637:1: ( ( rule__PrimaryExpression__Alternatives ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:637:1: ( ( rule__PrimaryExpression__Alternatives ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:638:1: ( rule__PrimaryExpression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExpressionAccess().getAlternatives()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:639:1: ( rule__PrimaryExpression__Alternatives )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:639:2: rule__PrimaryExpression__Alternatives
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__Alternatives_in_rulePrimaryExpression1302);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:651:1: entryRuleArrayLiteral : ruleArrayLiteral EOF ;
    public final void entryRuleArrayLiteral() throws RecognitionException {
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:652:1: ( ruleArrayLiteral EOF )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:653:1: ruleArrayLiteral EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleArrayLiteral_in_entryRuleArrayLiteral1329);
            ruleArrayLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayLiteralRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleArrayLiteral1336); if (state.failed) return ;

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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:660:1: ruleArrayLiteral : ( ( rule__ArrayLiteral__Group__0 ) ) ;
    public final void ruleArrayLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:664:2: ( ( ( rule__ArrayLiteral__Group__0 ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:665:1: ( ( rule__ArrayLiteral__Group__0 ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:665:1: ( ( rule__ArrayLiteral__Group__0 ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:666:1: ( rule__ArrayLiteral__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayLiteralAccess().getGroup()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:667:1: ( rule__ArrayLiteral__Group__0 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:667:2: rule__ArrayLiteral__Group__0
            {
            pushFollow(FOLLOW_rule__ArrayLiteral__Group__0_in_ruleArrayLiteral1362);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:679:1: entryRuleVariableReference : ruleVariableReference EOF ;
    public final void entryRuleVariableReference() throws RecognitionException {
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:680:1: ( ruleVariableReference EOF )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:681:1: ruleVariableReference EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleVariableReference_in_entryRuleVariableReference1389);
            ruleVariableReference();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableReferenceRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableReference1396); if (state.failed) return ;

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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:688:1: ruleVariableReference : ( ( rule__VariableReference__Group__0 ) ) ;
    public final void ruleVariableReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:692:2: ( ( ( rule__VariableReference__Group__0 ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:693:1: ( ( rule__VariableReference__Group__0 ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:693:1: ( ( rule__VariableReference__Group__0 ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:694:1: ( rule__VariableReference__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableReferenceAccess().getGroup()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:695:1: ( rule__VariableReference__Group__0 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:695:2: rule__VariableReference__Group__0
            {
            pushFollow(FOLLOW_rule__VariableReference__Group__0_in_ruleVariableReference1422);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:707:1: entryRuleFunctionCall : ruleFunctionCall EOF ;
    public final void entryRuleFunctionCall() throws RecognitionException {
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:708:1: ( ruleFunctionCall EOF )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:709:1: ruleFunctionCall EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallRule()); 
            }
            pushFollow(FOLLOW_ruleFunctionCall_in_entryRuleFunctionCall1449);
            ruleFunctionCall();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionCallRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionCall1456); if (state.failed) return ;

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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:716:1: ruleFunctionCall : ( ( rule__FunctionCall__Group__0 ) ) ;
    public final void ruleFunctionCall() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:720:2: ( ( ( rule__FunctionCall__Group__0 ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:721:1: ( ( rule__FunctionCall__Group__0 ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:721:1: ( ( rule__FunctionCall__Group__0 ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:722:1: ( rule__FunctionCall__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getGroup()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:723:1: ( rule__FunctionCall__Group__0 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:723:2: rule__FunctionCall__Group__0
            {
            pushFollow(FOLLOW_rule__FunctionCall__Group__0_in_ruleFunctionCall1482);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:735:1: entryRuleInclude : ruleInclude EOF ;
    public final void entryRuleInclude() throws RecognitionException {
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:736:1: ( ruleInclude EOF )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:737:1: ruleInclude EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIncludeRule()); 
            }
            pushFollow(FOLLOW_ruleInclude_in_entryRuleInclude1509);
            ruleInclude();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIncludeRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInclude1516); if (state.failed) return ;

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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:744:1: ruleInclude : ( ( rule__Include__Group__0 ) ) ;
    public final void ruleInclude() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:748:2: ( ( ( rule__Include__Group__0 ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:749:1: ( ( rule__Include__Group__0 ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:749:1: ( ( rule__Include__Group__0 ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:750:1: ( rule__Include__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIncludeAccess().getGroup()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:751:1: ( rule__Include__Group__0 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:751:2: rule__Include__Group__0
            {
            pushFollow(FOLLOW_rule__Include__Group__0_in_ruleInclude1542);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:763:1: rule__Statement__Alternatives : ( ( ruleInclude ) | ( ruleGlobalDeclaration ) | ( ruleLocalDeclaration ) | ( ruleFunctionDeclaration ) | ( ( rule__Statement__Group_4__0 ) ) | ( ruleFor ) | ( ruleWhile ) | ( ruleIf ) | ( ( rule__Statement__Group_8__0 ) ) | ( ruleStatementBlock ) );
    public final void rule__Statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:767:1: ( ( ruleInclude ) | ( ruleGlobalDeclaration ) | ( ruleLocalDeclaration ) | ( ruleFunctionDeclaration ) | ( ( rule__Statement__Group_4__0 ) ) | ( ruleFor ) | ( ruleWhile ) | ( ruleIf ) | ( ( rule__Statement__Group_8__0 ) ) | ( ruleStatementBlock ) )
            int alt2=10;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:768:1: ( ruleInclude )
                    {
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:768:1: ( ruleInclude )
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:769:1: ruleInclude
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getIncludeParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleInclude_in_rule__Statement__Alternatives1578);
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
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:774:6: ( ruleGlobalDeclaration )
                    {
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:774:6: ( ruleGlobalDeclaration )
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:775:1: ruleGlobalDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getGlobalDeclarationParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleGlobalDeclaration_in_rule__Statement__Alternatives1595);
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
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:780:6: ( ruleLocalDeclaration )
                    {
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:780:6: ( ruleLocalDeclaration )
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:781:1: ruleLocalDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getLocalDeclarationParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_ruleLocalDeclaration_in_rule__Statement__Alternatives1612);
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
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:786:6: ( ruleFunctionDeclaration )
                    {
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:786:6: ( ruleFunctionDeclaration )
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:787:1: ruleFunctionDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getFunctionDeclarationParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_ruleFunctionDeclaration_in_rule__Statement__Alternatives1629);
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
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:792:6: ( ( rule__Statement__Group_4__0 ) )
                    {
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:792:6: ( ( rule__Statement__Group_4__0 ) )
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:793:1: ( rule__Statement__Group_4__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getGroup_4()); 
                    }
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:794:1: ( rule__Statement__Group_4__0 )
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:794:2: rule__Statement__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Statement__Group_4__0_in_rule__Statement__Alternatives1646);
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
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:798:6: ( ruleFor )
                    {
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:798:6: ( ruleFor )
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:799:1: ruleFor
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getForParserRuleCall_5()); 
                    }
                    pushFollow(FOLLOW_ruleFor_in_rule__Statement__Alternatives1664);
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
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:804:6: ( ruleWhile )
                    {
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:804:6: ( ruleWhile )
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:805:1: ruleWhile
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getWhileParserRuleCall_6()); 
                    }
                    pushFollow(FOLLOW_ruleWhile_in_rule__Statement__Alternatives1681);
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
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:810:6: ( ruleIf )
                    {
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:810:6: ( ruleIf )
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:811:1: ruleIf
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getIfParserRuleCall_7()); 
                    }
                    pushFollow(FOLLOW_ruleIf_in_rule__Statement__Alternatives1698);
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
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:816:6: ( ( rule__Statement__Group_8__0 ) )
                    {
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:816:6: ( ( rule__Statement__Group_8__0 ) )
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:817:1: ( rule__Statement__Group_8__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getGroup_8()); 
                    }
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:818:1: ( rule__Statement__Group_8__0 )
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:818:2: rule__Statement__Group_8__0
                    {
                    pushFollow(FOLLOW_rule__Statement__Group_8__0_in_rule__Statement__Alternatives1715);
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
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:822:6: ( ruleStatementBlock )
                    {
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:822:6: ( ruleStatementBlock )
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:823:1: ruleStatementBlock
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getStatementBlockParserRuleCall_9()); 
                    }
                    pushFollow(FOLLOW_ruleStatementBlock_in_rule__Statement__Alternatives1733);
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


    // $ANTLR start "rule__For__IteratorAlternatives_1_0"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:833:1: rule__For__IteratorAlternatives_1_0 : ( ( ruleEachKeyIterator ) | ( ruleEachValueIterator ) | ( ruleVariableIterator ) );
    public final void rule__For__IteratorAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:837:1: ( ( ruleEachKeyIterator ) | ( ruleEachValueIterator ) | ( ruleVariableIterator ) )
            int alt3=3;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==21) ) {
                int LA3_1 = input.LA(2);

                if ( (synpred11_InternalLeek()) ) {
                    alt3=1;
                }
                else if ( (synpred12_InternalLeek()) ) {
                    alt3=2;
                }
                else if ( (true) ) {
                    alt3=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:838:1: ( ruleEachKeyIterator )
                    {
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:838:1: ( ruleEachKeyIterator )
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:839:1: ruleEachKeyIterator
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getForAccess().getIteratorEachKeyIteratorParserRuleCall_1_0_0()); 
                    }
                    pushFollow(FOLLOW_ruleEachKeyIterator_in_rule__For__IteratorAlternatives_1_01765);
                    ruleEachKeyIterator();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getForAccess().getIteratorEachKeyIteratorParserRuleCall_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:844:6: ( ruleEachValueIterator )
                    {
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:844:6: ( ruleEachValueIterator )
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:845:1: ruleEachValueIterator
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getForAccess().getIteratorEachValueIteratorParserRuleCall_1_0_1()); 
                    }
                    pushFollow(FOLLOW_ruleEachValueIterator_in_rule__For__IteratorAlternatives_1_01782);
                    ruleEachValueIterator();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getForAccess().getIteratorEachValueIteratorParserRuleCall_1_0_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:850:6: ( ruleVariableIterator )
                    {
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:850:6: ( ruleVariableIterator )
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:851:1: ruleVariableIterator
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getForAccess().getIteratorVariableIteratorParserRuleCall_1_0_2()); 
                    }
                    pushFollow(FOLLOW_ruleVariableIterator_in_rule__For__IteratorAlternatives_1_01799);
                    ruleVariableIterator();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getForAccess().getIteratorVariableIteratorParserRuleCall_1_0_2()); 
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
    // $ANTLR end "rule__For__IteratorAlternatives_1_0"


    // $ANTLR start "rule__Comparison__Alternatives_1_0"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:862:1: rule__Comparison__Alternatives_1_0 : ( ( ( rule__Comparison__Group_1_0_0__0 ) ) | ( ( rule__Comparison__Group_1_0_1__0 ) ) | ( ( rule__Comparison__Group_1_0_2__0 ) ) | ( ( rule__Comparison__Group_1_0_3__0 ) ) | ( ( rule__Comparison__Group_1_0_4__0 ) ) | ( ( rule__Comparison__Group_1_0_5__0 ) ) | ( ( rule__Comparison__Group_1_0_6__0 ) ) | ( ( rule__Comparison__Group_1_0_7__0 ) ) );
    public final void rule__Comparison__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:866:1: ( ( ( rule__Comparison__Group_1_0_0__0 ) ) | ( ( rule__Comparison__Group_1_0_1__0 ) ) | ( ( rule__Comparison__Group_1_0_2__0 ) ) | ( ( rule__Comparison__Group_1_0_3__0 ) ) | ( ( rule__Comparison__Group_1_0_4__0 ) ) | ( ( rule__Comparison__Group_1_0_5__0 ) ) | ( ( rule__Comparison__Group_1_0_6__0 ) ) | ( ( rule__Comparison__Group_1_0_7__0 ) ) )
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
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:867:1: ( ( rule__Comparison__Group_1_0_0__0 ) )
                    {
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:867:1: ( ( rule__Comparison__Group_1_0_0__0 ) )
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:868:1: ( rule__Comparison__Group_1_0_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComparisonAccess().getGroup_1_0_0()); 
                    }
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:869:1: ( rule__Comparison__Group_1_0_0__0 )
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:869:2: rule__Comparison__Group_1_0_0__0
                    {
                    pushFollow(FOLLOW_rule__Comparison__Group_1_0_0__0_in_rule__Comparison__Alternatives_1_01832);
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
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:873:6: ( ( rule__Comparison__Group_1_0_1__0 ) )
                    {
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:873:6: ( ( rule__Comparison__Group_1_0_1__0 ) )
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:874:1: ( rule__Comparison__Group_1_0_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComparisonAccess().getGroup_1_0_1()); 
                    }
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:875:1: ( rule__Comparison__Group_1_0_1__0 )
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:875:2: rule__Comparison__Group_1_0_1__0
                    {
                    pushFollow(FOLLOW_rule__Comparison__Group_1_0_1__0_in_rule__Comparison__Alternatives_1_01850);
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
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:879:6: ( ( rule__Comparison__Group_1_0_2__0 ) )
                    {
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:879:6: ( ( rule__Comparison__Group_1_0_2__0 ) )
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:880:1: ( rule__Comparison__Group_1_0_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComparisonAccess().getGroup_1_0_2()); 
                    }
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:881:1: ( rule__Comparison__Group_1_0_2__0 )
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:881:2: rule__Comparison__Group_1_0_2__0
                    {
                    pushFollow(FOLLOW_rule__Comparison__Group_1_0_2__0_in_rule__Comparison__Alternatives_1_01868);
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
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:885:6: ( ( rule__Comparison__Group_1_0_3__0 ) )
                    {
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:885:6: ( ( rule__Comparison__Group_1_0_3__0 ) )
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:886:1: ( rule__Comparison__Group_1_0_3__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComparisonAccess().getGroup_1_0_3()); 
                    }
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:887:1: ( rule__Comparison__Group_1_0_3__0 )
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:887:2: rule__Comparison__Group_1_0_3__0
                    {
                    pushFollow(FOLLOW_rule__Comparison__Group_1_0_3__0_in_rule__Comparison__Alternatives_1_01886);
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
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:891:6: ( ( rule__Comparison__Group_1_0_4__0 ) )
                    {
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:891:6: ( ( rule__Comparison__Group_1_0_4__0 ) )
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:892:1: ( rule__Comparison__Group_1_0_4__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComparisonAccess().getGroup_1_0_4()); 
                    }
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:893:1: ( rule__Comparison__Group_1_0_4__0 )
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:893:2: rule__Comparison__Group_1_0_4__0
                    {
                    pushFollow(FOLLOW_rule__Comparison__Group_1_0_4__0_in_rule__Comparison__Alternatives_1_01904);
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
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:897:6: ( ( rule__Comparison__Group_1_0_5__0 ) )
                    {
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:897:6: ( ( rule__Comparison__Group_1_0_5__0 ) )
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:898:1: ( rule__Comparison__Group_1_0_5__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComparisonAccess().getGroup_1_0_5()); 
                    }
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:899:1: ( rule__Comparison__Group_1_0_5__0 )
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:899:2: rule__Comparison__Group_1_0_5__0
                    {
                    pushFollow(FOLLOW_rule__Comparison__Group_1_0_5__0_in_rule__Comparison__Alternatives_1_01922);
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
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:903:6: ( ( rule__Comparison__Group_1_0_6__0 ) )
                    {
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:903:6: ( ( rule__Comparison__Group_1_0_6__0 ) )
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:904:1: ( rule__Comparison__Group_1_0_6__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComparisonAccess().getGroup_1_0_6()); 
                    }
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:905:1: ( rule__Comparison__Group_1_0_6__0 )
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:905:2: rule__Comparison__Group_1_0_6__0
                    {
                    pushFollow(FOLLOW_rule__Comparison__Group_1_0_6__0_in_rule__Comparison__Alternatives_1_01940);
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
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:909:6: ( ( rule__Comparison__Group_1_0_7__0 ) )
                    {
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:909:6: ( ( rule__Comparison__Group_1_0_7__0 ) )
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:910:1: ( rule__Comparison__Group_1_0_7__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComparisonAccess().getGroup_1_0_7()); 
                    }
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:911:1: ( rule__Comparison__Group_1_0_7__0 )
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:911:2: rule__Comparison__Group_1_0_7__0
                    {
                    pushFollow(FOLLOW_rule__Comparison__Group_1_0_7__0_in_rule__Comparison__Alternatives_1_01958);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:920:1: rule__Or__Alternatives_1_0_1 : ( ( 'or' ) | ( '||' ) );
    public final void rule__Or__Alternatives_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:924:1: ( ( 'or' ) | ( '||' ) )
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
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:925:1: ( 'or' )
                    {
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:925:1: ( 'or' )
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:926:1: 'or'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOrAccess().getOrKeyword_1_0_1_0()); 
                    }
                    match(input,12,FOLLOW_12_in_rule__Or__Alternatives_1_0_11992); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOrAccess().getOrKeyword_1_0_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:933:6: ( '||' )
                    {
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:933:6: ( '||' )
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:934:1: '||'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOrAccess().getVerticalLineVerticalLineKeyword_1_0_1_1()); 
                    }
                    match(input,13,FOLLOW_13_in_rule__Or__Alternatives_1_0_12012); if (state.failed) return ;
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:946:1: rule__And__Alternatives_1_0_1 : ( ( 'and' ) | ( '&&' ) );
    public final void rule__And__Alternatives_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:950:1: ( ( 'and' ) | ( '&&' ) )
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
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:951:1: ( 'and' )
                    {
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:951:1: ( 'and' )
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:952:1: 'and'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAndAccess().getAndKeyword_1_0_1_0()); 
                    }
                    match(input,14,FOLLOW_14_in_rule__And__Alternatives_1_0_12047); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAndAccess().getAndKeyword_1_0_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:959:6: ( '&&' )
                    {
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:959:6: ( '&&' )
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:960:1: '&&'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAndAccess().getAmpersandAmpersandKeyword_1_0_1_1()); 
                    }
                    match(input,15,FOLLOW_15_in_rule__And__Alternatives_1_0_12067); if (state.failed) return ;
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:972:1: rule__Addition__Alternatives_1_0 : ( ( ( rule__Addition__Group_1_0_0__0 ) ) | ( ( rule__Addition__Group_1_0_1__0 ) ) );
    public final void rule__Addition__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:976:1: ( ( ( rule__Addition__Group_1_0_0__0 ) ) | ( ( rule__Addition__Group_1_0_1__0 ) ) )
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
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:977:1: ( ( rule__Addition__Group_1_0_0__0 ) )
                    {
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:977:1: ( ( rule__Addition__Group_1_0_0__0 ) )
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:978:1: ( rule__Addition__Group_1_0_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAdditionAccess().getGroup_1_0_0()); 
                    }
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:979:1: ( rule__Addition__Group_1_0_0__0 )
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:979:2: rule__Addition__Group_1_0_0__0
                    {
                    pushFollow(FOLLOW_rule__Addition__Group_1_0_0__0_in_rule__Addition__Alternatives_1_02101);
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
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:983:6: ( ( rule__Addition__Group_1_0_1__0 ) )
                    {
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:983:6: ( ( rule__Addition__Group_1_0_1__0 ) )
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:984:1: ( rule__Addition__Group_1_0_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAdditionAccess().getGroup_1_0_1()); 
                    }
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:985:1: ( rule__Addition__Group_1_0_1__0 )
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:985:2: rule__Addition__Group_1_0_1__0
                    {
                    pushFollow(FOLLOW_rule__Addition__Group_1_0_1__0_in_rule__Addition__Alternatives_1_02119);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:994:1: rule__Multiplication__Alternatives_1_0 : ( ( ( rule__Multiplication__Group_1_0_0__0 ) ) | ( ( rule__Multiplication__Group_1_0_1__0 ) ) );
    public final void rule__Multiplication__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:998:1: ( ( ( rule__Multiplication__Group_1_0_0__0 ) ) | ( ( rule__Multiplication__Group_1_0_1__0 ) ) )
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
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:999:1: ( ( rule__Multiplication__Group_1_0_0__0 ) )
                    {
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:999:1: ( ( rule__Multiplication__Group_1_0_0__0 ) )
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1000:1: ( rule__Multiplication__Group_1_0_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMultiplicationAccess().getGroup_1_0_0()); 
                    }
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1001:1: ( rule__Multiplication__Group_1_0_0__0 )
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1001:2: rule__Multiplication__Group_1_0_0__0
                    {
                    pushFollow(FOLLOW_rule__Multiplication__Group_1_0_0__0_in_rule__Multiplication__Alternatives_1_02152);
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
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1005:6: ( ( rule__Multiplication__Group_1_0_1__0 ) )
                    {
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1005:6: ( ( rule__Multiplication__Group_1_0_1__0 ) )
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1006:1: ( rule__Multiplication__Group_1_0_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMultiplicationAccess().getGroup_1_0_1()); 
                    }
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1007:1: ( rule__Multiplication__Group_1_0_1__0 )
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1007:2: rule__Multiplication__Group_1_0_1__0
                    {
                    pushFollow(FOLLOW_rule__Multiplication__Group_1_0_1__0_in_rule__Multiplication__Alternatives_1_02170);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1016:1: rule__PrimaryExpression__Alternatives : ( ( ( rule__PrimaryExpression__Group_0__0 ) ) | ( ( rule__PrimaryExpression__Group_1__0 ) ) | ( ( rule__PrimaryExpression__Group_2__0 ) ) | ( ruleFunctionCall ) | ( ruleVariableReference ) | ( ( rule__PrimaryExpression__Group_5__0 ) ) | ( ruleArrayLiteral ) );
    public final void rule__PrimaryExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1020:1: ( ( ( rule__PrimaryExpression__Group_0__0 ) ) | ( ( rule__PrimaryExpression__Group_1__0 ) ) | ( ( rule__PrimaryExpression__Group_2__0 ) ) | ( ruleFunctionCall ) | ( ruleVariableReference ) | ( ( rule__PrimaryExpression__Group_5__0 ) ) | ( ruleArrayLiteral ) )
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

                if ( (LA9_4==EOF||(LA9_4>=12 && LA9_4<=16)||LA9_4==22||LA9_4==29||(LA9_4>=32 && LA9_4<=45)) ) {
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
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1021:1: ( ( rule__PrimaryExpression__Group_0__0 ) )
                    {
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1021:1: ( ( rule__PrimaryExpression__Group_0__0 ) )
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1022:1: ( rule__PrimaryExpression__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryExpressionAccess().getGroup_0()); 
                    }
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1023:1: ( rule__PrimaryExpression__Group_0__0 )
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1023:2: rule__PrimaryExpression__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__PrimaryExpression__Group_0__0_in_rule__PrimaryExpression__Alternatives2203);
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
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1027:6: ( ( rule__PrimaryExpression__Group_1__0 ) )
                    {
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1027:6: ( ( rule__PrimaryExpression__Group_1__0 ) )
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1028:1: ( rule__PrimaryExpression__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryExpressionAccess().getGroup_1()); 
                    }
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1029:1: ( rule__PrimaryExpression__Group_1__0 )
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1029:2: rule__PrimaryExpression__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__PrimaryExpression__Group_1__0_in_rule__PrimaryExpression__Alternatives2221);
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
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1033:6: ( ( rule__PrimaryExpression__Group_2__0 ) )
                    {
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1033:6: ( ( rule__PrimaryExpression__Group_2__0 ) )
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1034:1: ( rule__PrimaryExpression__Group_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryExpressionAccess().getGroup_2()); 
                    }
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1035:1: ( rule__PrimaryExpression__Group_2__0 )
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1035:2: rule__PrimaryExpression__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__PrimaryExpression__Group_2__0_in_rule__PrimaryExpression__Alternatives2239);
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
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1039:6: ( ruleFunctionCall )
                    {
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1039:6: ( ruleFunctionCall )
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1040:1: ruleFunctionCall
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryExpressionAccess().getFunctionCallParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_ruleFunctionCall_in_rule__PrimaryExpression__Alternatives2257);
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
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1045:6: ( ruleVariableReference )
                    {
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1045:6: ( ruleVariableReference )
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1046:1: ruleVariableReference
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryExpressionAccess().getVariableReferenceParserRuleCall_4()); 
                    }
                    pushFollow(FOLLOW_ruleVariableReference_in_rule__PrimaryExpression__Alternatives2274);
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
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1051:6: ( ( rule__PrimaryExpression__Group_5__0 ) )
                    {
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1051:6: ( ( rule__PrimaryExpression__Group_5__0 ) )
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1052:1: ( rule__PrimaryExpression__Group_5__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryExpressionAccess().getGroup_5()); 
                    }
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1053:1: ( rule__PrimaryExpression__Group_5__0 )
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1053:2: rule__PrimaryExpression__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__PrimaryExpression__Group_5__0_in_rule__PrimaryExpression__Alternatives2291);
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
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1057:6: ( ruleArrayLiteral )
                    {
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1057:6: ( ruleArrayLiteral )
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1058:1: ruleArrayLiteral
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryExpressionAccess().getArrayLiteralParserRuleCall_6()); 
                    }
                    pushFollow(FOLLOW_ruleArrayLiteral_in_rule__PrimaryExpression__Alternatives2309);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1070:1: rule__Statement__Group_4__0 : rule__Statement__Group_4__0__Impl rule__Statement__Group_4__1 ;
    public final void rule__Statement__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1074:1: ( rule__Statement__Group_4__0__Impl rule__Statement__Group_4__1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1075:2: rule__Statement__Group_4__0__Impl rule__Statement__Group_4__1
            {
            pushFollow(FOLLOW_rule__Statement__Group_4__0__Impl_in_rule__Statement__Group_4__02339);
            rule__Statement__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Statement__Group_4__1_in_rule__Statement__Group_4__02342);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1082:1: rule__Statement__Group_4__0__Impl : ( ruleFunctionCall ) ;
    public final void rule__Statement__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1086:1: ( ( ruleFunctionCall ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1087:1: ( ruleFunctionCall )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1087:1: ( ruleFunctionCall )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1088:1: ruleFunctionCall
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getFunctionCallParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_ruleFunctionCall_in_rule__Statement__Group_4__0__Impl2369);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1099:1: rule__Statement__Group_4__1 : rule__Statement__Group_4__1__Impl ;
    public final void rule__Statement__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1103:1: ( rule__Statement__Group_4__1__Impl )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1104:2: rule__Statement__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Statement__Group_4__1__Impl_in_rule__Statement__Group_4__12398);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1110:1: rule__Statement__Group_4__1__Impl : ( ';' ) ;
    public final void rule__Statement__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1114:1: ( ( ';' ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1115:1: ( ';' )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1115:1: ( ';' )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1116:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getSemicolonKeyword_4_1()); 
            }
            match(input,16,FOLLOW_16_in_rule__Statement__Group_4__1__Impl2426); if (state.failed) return ;
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1133:1: rule__Statement__Group_8__0 : rule__Statement__Group_8__0__Impl rule__Statement__Group_8__1 ;
    public final void rule__Statement__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1137:1: ( rule__Statement__Group_8__0__Impl rule__Statement__Group_8__1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1138:2: rule__Statement__Group_8__0__Impl rule__Statement__Group_8__1
            {
            pushFollow(FOLLOW_rule__Statement__Group_8__0__Impl_in_rule__Statement__Group_8__02461);
            rule__Statement__Group_8__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Statement__Group_8__1_in_rule__Statement__Group_8__02464);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1145:1: rule__Statement__Group_8__0__Impl : ( ruleAffectation ) ;
    public final void rule__Statement__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1149:1: ( ( ruleAffectation ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1150:1: ( ruleAffectation )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1150:1: ( ruleAffectation )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1151:1: ruleAffectation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getAffectationParserRuleCall_8_0()); 
            }
            pushFollow(FOLLOW_ruleAffectation_in_rule__Statement__Group_8__0__Impl2491);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1162:1: rule__Statement__Group_8__1 : rule__Statement__Group_8__1__Impl ;
    public final void rule__Statement__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1166:1: ( rule__Statement__Group_8__1__Impl )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1167:2: rule__Statement__Group_8__1__Impl
            {
            pushFollow(FOLLOW_rule__Statement__Group_8__1__Impl_in_rule__Statement__Group_8__12520);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1173:1: rule__Statement__Group_8__1__Impl : ( ';' ) ;
    public final void rule__Statement__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1177:1: ( ( ';' ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1178:1: ( ';' )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1178:1: ( ';' )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1179:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getSemicolonKeyword_8_1()); 
            }
            match(input,16,FOLLOW_16_in_rule__Statement__Group_8__1__Impl2548); if (state.failed) return ;
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1196:1: rule__StatementBlock__Group__0 : rule__StatementBlock__Group__0__Impl rule__StatementBlock__Group__1 ;
    public final void rule__StatementBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1200:1: ( rule__StatementBlock__Group__0__Impl rule__StatementBlock__Group__1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1201:2: rule__StatementBlock__Group__0__Impl rule__StatementBlock__Group__1
            {
            pushFollow(FOLLOW_rule__StatementBlock__Group__0__Impl_in_rule__StatementBlock__Group__02583);
            rule__StatementBlock__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__StatementBlock__Group__1_in_rule__StatementBlock__Group__02586);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1208:1: rule__StatementBlock__Group__0__Impl : ( '{' ) ;
    public final void rule__StatementBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1212:1: ( ( '{' ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1213:1: ( '{' )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1213:1: ( '{' )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1214:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementBlockAccess().getLeftCurlyBracketKeyword_0()); 
            }
            match(input,17,FOLLOW_17_in_rule__StatementBlock__Group__0__Impl2614); if (state.failed) return ;
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1227:1: rule__StatementBlock__Group__1 : rule__StatementBlock__Group__1__Impl rule__StatementBlock__Group__2 ;
    public final void rule__StatementBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1231:1: ( rule__StatementBlock__Group__1__Impl rule__StatementBlock__Group__2 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1232:2: rule__StatementBlock__Group__1__Impl rule__StatementBlock__Group__2
            {
            pushFollow(FOLLOW_rule__StatementBlock__Group__1__Impl_in_rule__StatementBlock__Group__12645);
            rule__StatementBlock__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__StatementBlock__Group__2_in_rule__StatementBlock__Group__12648);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1239:1: rule__StatementBlock__Group__1__Impl : ( () ) ;
    public final void rule__StatementBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1243:1: ( ( () ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1244:1: ( () )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1244:1: ( () )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1245:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementBlockAccess().getStatementBlockAction_1()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1246:1: ()
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1248:1: 
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1258:1: rule__StatementBlock__Group__2 : rule__StatementBlock__Group__2__Impl rule__StatementBlock__Group__3 ;
    public final void rule__StatementBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1262:1: ( rule__StatementBlock__Group__2__Impl rule__StatementBlock__Group__3 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1263:2: rule__StatementBlock__Group__2__Impl rule__StatementBlock__Group__3
            {
            pushFollow(FOLLOW_rule__StatementBlock__Group__2__Impl_in_rule__StatementBlock__Group__22706);
            rule__StatementBlock__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__StatementBlock__Group__3_in_rule__StatementBlock__Group__22709);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1270:1: rule__StatementBlock__Group__2__Impl : ( ( rule__StatementBlock__StatementsAssignment_2 )* ) ;
    public final void rule__StatementBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1274:1: ( ( ( rule__StatementBlock__StatementsAssignment_2 )* ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1275:1: ( ( rule__StatementBlock__StatementsAssignment_2 )* )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1275:1: ( ( rule__StatementBlock__StatementsAssignment_2 )* )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1276:1: ( rule__StatementBlock__StatementsAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementBlockAccess().getStatementsAssignment_2()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1277:1: ( rule__StatementBlock__StatementsAssignment_2 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID||LA10_0==17||LA10_0==20||(LA10_0>=24 && LA10_0<=25)||LA10_0==28||(LA10_0>=30 && LA10_0<=31)||LA10_0==46) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1277:2: rule__StatementBlock__StatementsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__StatementBlock__StatementsAssignment_2_in_rule__StatementBlock__Group__2__Impl2736);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1287:1: rule__StatementBlock__Group__3 : rule__StatementBlock__Group__3__Impl ;
    public final void rule__StatementBlock__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1291:1: ( rule__StatementBlock__Group__3__Impl )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1292:2: rule__StatementBlock__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__StatementBlock__Group__3__Impl_in_rule__StatementBlock__Group__32767);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1298:1: rule__StatementBlock__Group__3__Impl : ( '}' ) ;
    public final void rule__StatementBlock__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1302:1: ( ( '}' ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1303:1: ( '}' )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1303:1: ( '}' )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1304:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementBlockAccess().getRightCurlyBracketKeyword_3()); 
            }
            match(input,18,FOLLOW_18_in_rule__StatementBlock__Group__3__Impl2795); if (state.failed) return ;
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1325:1: rule__Affectation__Group__0 : rule__Affectation__Group__0__Impl rule__Affectation__Group__1 ;
    public final void rule__Affectation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1329:1: ( rule__Affectation__Group__0__Impl rule__Affectation__Group__1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1330:2: rule__Affectation__Group__0__Impl rule__Affectation__Group__1
            {
            pushFollow(FOLLOW_rule__Affectation__Group__0__Impl_in_rule__Affectation__Group__02834);
            rule__Affectation__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Affectation__Group__1_in_rule__Affectation__Group__02837);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1337:1: rule__Affectation__Group__0__Impl : ( ( rule__Affectation__VariableAssignment_0 ) ) ;
    public final void rule__Affectation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1341:1: ( ( ( rule__Affectation__VariableAssignment_0 ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1342:1: ( ( rule__Affectation__VariableAssignment_0 ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1342:1: ( ( rule__Affectation__VariableAssignment_0 ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1343:1: ( rule__Affectation__VariableAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAffectationAccess().getVariableAssignment_0()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1344:1: ( rule__Affectation__VariableAssignment_0 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1344:2: rule__Affectation__VariableAssignment_0
            {
            pushFollow(FOLLOW_rule__Affectation__VariableAssignment_0_in_rule__Affectation__Group__0__Impl2864);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1354:1: rule__Affectation__Group__1 : rule__Affectation__Group__1__Impl rule__Affectation__Group__2 ;
    public final void rule__Affectation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1358:1: ( rule__Affectation__Group__1__Impl rule__Affectation__Group__2 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1359:2: rule__Affectation__Group__1__Impl rule__Affectation__Group__2
            {
            pushFollow(FOLLOW_rule__Affectation__Group__1__Impl_in_rule__Affectation__Group__12894);
            rule__Affectation__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Affectation__Group__2_in_rule__Affectation__Group__12897);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1366:1: rule__Affectation__Group__1__Impl : ( '=' ) ;
    public final void rule__Affectation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1370:1: ( ( '=' ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1371:1: ( '=' )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1371:1: ( '=' )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1372:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAffectationAccess().getEqualsSignKeyword_1()); 
            }
            match(input,19,FOLLOW_19_in_rule__Affectation__Group__1__Impl2925); if (state.failed) return ;
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1385:1: rule__Affectation__Group__2 : rule__Affectation__Group__2__Impl ;
    public final void rule__Affectation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1389:1: ( rule__Affectation__Group__2__Impl )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1390:2: rule__Affectation__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Affectation__Group__2__Impl_in_rule__Affectation__Group__22956);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1396:1: rule__Affectation__Group__2__Impl : ( ( rule__Affectation__ValueAssignment_2 ) ) ;
    public final void rule__Affectation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1400:1: ( ( ( rule__Affectation__ValueAssignment_2 ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1401:1: ( ( rule__Affectation__ValueAssignment_2 ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1401:1: ( ( rule__Affectation__ValueAssignment_2 ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1402:1: ( rule__Affectation__ValueAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAffectationAccess().getValueAssignment_2()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1403:1: ( rule__Affectation__ValueAssignment_2 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1403:2: rule__Affectation__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__Affectation__ValueAssignment_2_in_rule__Affectation__Group__2__Impl2983);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1419:1: rule__If__Group__0 : rule__If__Group__0__Impl rule__If__Group__1 ;
    public final void rule__If__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1423:1: ( rule__If__Group__0__Impl rule__If__Group__1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1424:2: rule__If__Group__0__Impl rule__If__Group__1
            {
            pushFollow(FOLLOW_rule__If__Group__0__Impl_in_rule__If__Group__03019);
            rule__If__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__If__Group__1_in_rule__If__Group__03022);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1431:1: rule__If__Group__0__Impl : ( 'if' ) ;
    public final void rule__If__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1435:1: ( ( 'if' ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1436:1: ( 'if' )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1436:1: ( 'if' )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1437:1: 'if'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getIfKeyword_0()); 
            }
            match(input,20,FOLLOW_20_in_rule__If__Group__0__Impl3050); if (state.failed) return ;
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1450:1: rule__If__Group__1 : rule__If__Group__1__Impl rule__If__Group__2 ;
    public final void rule__If__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1454:1: ( rule__If__Group__1__Impl rule__If__Group__2 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1455:2: rule__If__Group__1__Impl rule__If__Group__2
            {
            pushFollow(FOLLOW_rule__If__Group__1__Impl_in_rule__If__Group__13081);
            rule__If__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__If__Group__2_in_rule__If__Group__13084);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1462:1: rule__If__Group__1__Impl : ( '(' ) ;
    public final void rule__If__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1466:1: ( ( '(' ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1467:1: ( '(' )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1467:1: ( '(' )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1468:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,21,FOLLOW_21_in_rule__If__Group__1__Impl3112); if (state.failed) return ;
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1481:1: rule__If__Group__2 : rule__If__Group__2__Impl rule__If__Group__3 ;
    public final void rule__If__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1485:1: ( rule__If__Group__2__Impl rule__If__Group__3 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1486:2: rule__If__Group__2__Impl rule__If__Group__3
            {
            pushFollow(FOLLOW_rule__If__Group__2__Impl_in_rule__If__Group__23143);
            rule__If__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__If__Group__3_in_rule__If__Group__23146);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1493:1: rule__If__Group__2__Impl : ( ( rule__If__ConditionAssignment_2 ) ) ;
    public final void rule__If__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1497:1: ( ( ( rule__If__ConditionAssignment_2 ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1498:1: ( ( rule__If__ConditionAssignment_2 ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1498:1: ( ( rule__If__ConditionAssignment_2 ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1499:1: ( rule__If__ConditionAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getConditionAssignment_2()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1500:1: ( rule__If__ConditionAssignment_2 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1500:2: rule__If__ConditionAssignment_2
            {
            pushFollow(FOLLOW_rule__If__ConditionAssignment_2_in_rule__If__Group__2__Impl3173);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1510:1: rule__If__Group__3 : rule__If__Group__3__Impl rule__If__Group__4 ;
    public final void rule__If__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1514:1: ( rule__If__Group__3__Impl rule__If__Group__4 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1515:2: rule__If__Group__3__Impl rule__If__Group__4
            {
            pushFollow(FOLLOW_rule__If__Group__3__Impl_in_rule__If__Group__33203);
            rule__If__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__If__Group__4_in_rule__If__Group__33206);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1522:1: rule__If__Group__3__Impl : ( ')' ) ;
    public final void rule__If__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1526:1: ( ( ')' ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1527:1: ( ')' )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1527:1: ( ')' )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1528:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getRightParenthesisKeyword_3()); 
            }
            match(input,22,FOLLOW_22_in_rule__If__Group__3__Impl3234); if (state.failed) return ;
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1541:1: rule__If__Group__4 : rule__If__Group__4__Impl rule__If__Group__5 ;
    public final void rule__If__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1545:1: ( rule__If__Group__4__Impl rule__If__Group__5 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1546:2: rule__If__Group__4__Impl rule__If__Group__5
            {
            pushFollow(FOLLOW_rule__If__Group__4__Impl_in_rule__If__Group__43265);
            rule__If__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__If__Group__5_in_rule__If__Group__43268);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1553:1: rule__If__Group__4__Impl : ( ( rule__If__ThenAssignment_4 ) ) ;
    public final void rule__If__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1557:1: ( ( ( rule__If__ThenAssignment_4 ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1558:1: ( ( rule__If__ThenAssignment_4 ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1558:1: ( ( rule__If__ThenAssignment_4 ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1559:1: ( rule__If__ThenAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getThenAssignment_4()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1560:1: ( rule__If__ThenAssignment_4 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1560:2: rule__If__ThenAssignment_4
            {
            pushFollow(FOLLOW_rule__If__ThenAssignment_4_in_rule__If__Group__4__Impl3295);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1570:1: rule__If__Group__5 : rule__If__Group__5__Impl ;
    public final void rule__If__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1574:1: ( rule__If__Group__5__Impl )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1575:2: rule__If__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__If__Group__5__Impl_in_rule__If__Group__53325);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1581:1: rule__If__Group__5__Impl : ( ( rule__If__Group_5__0 )? ) ;
    public final void rule__If__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1585:1: ( ( ( rule__If__Group_5__0 )? ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1586:1: ( ( rule__If__Group_5__0 )? )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1586:1: ( ( rule__If__Group_5__0 )? )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1587:1: ( rule__If__Group_5__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getGroup_5()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1588:1: ( rule__If__Group_5__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==23) ) {
                int LA11_1 = input.LA(2);

                if ( (synpred31_InternalLeek()) ) {
                    alt11=1;
                }
            }
            switch (alt11) {
                case 1 :
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1588:2: rule__If__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__If__Group_5__0_in_rule__If__Group__5__Impl3352);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1610:1: rule__If__Group_5__0 : rule__If__Group_5__0__Impl rule__If__Group_5__1 ;
    public final void rule__If__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1614:1: ( rule__If__Group_5__0__Impl rule__If__Group_5__1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1615:2: rule__If__Group_5__0__Impl rule__If__Group_5__1
            {
            pushFollow(FOLLOW_rule__If__Group_5__0__Impl_in_rule__If__Group_5__03395);
            rule__If__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__If__Group_5__1_in_rule__If__Group_5__03398);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1622:1: rule__If__Group_5__0__Impl : ( ( 'else' ) ) ;
    public final void rule__If__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1626:1: ( ( ( 'else' ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1627:1: ( ( 'else' ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1627:1: ( ( 'else' ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1628:1: ( 'else' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getElseKeyword_5_0()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1629:1: ( 'else' )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1630:2: 'else'
            {
            match(input,23,FOLLOW_23_in_rule__If__Group_5__0__Impl3427); if (state.failed) return ;

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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1641:1: rule__If__Group_5__1 : rule__If__Group_5__1__Impl ;
    public final void rule__If__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1645:1: ( rule__If__Group_5__1__Impl )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1646:2: rule__If__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__If__Group_5__1__Impl_in_rule__If__Group_5__13459);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1652:1: rule__If__Group_5__1__Impl : ( ( rule__If__ElseAssignment_5_1 ) ) ;
    public final void rule__If__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1656:1: ( ( ( rule__If__ElseAssignment_5_1 ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1657:1: ( ( rule__If__ElseAssignment_5_1 ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1657:1: ( ( rule__If__ElseAssignment_5_1 ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1658:1: ( rule__If__ElseAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getElseAssignment_5_1()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1659:1: ( rule__If__ElseAssignment_5_1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1659:2: rule__If__ElseAssignment_5_1
            {
            pushFollow(FOLLOW_rule__If__ElseAssignment_5_1_in_rule__If__Group_5__1__Impl3486);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1673:1: rule__While__Group__0 : rule__While__Group__0__Impl rule__While__Group__1 ;
    public final void rule__While__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1677:1: ( rule__While__Group__0__Impl rule__While__Group__1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1678:2: rule__While__Group__0__Impl rule__While__Group__1
            {
            pushFollow(FOLLOW_rule__While__Group__0__Impl_in_rule__While__Group__03520);
            rule__While__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__While__Group__1_in_rule__While__Group__03523);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1685:1: rule__While__Group__0__Impl : ( 'while' ) ;
    public final void rule__While__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1689:1: ( ( 'while' ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1690:1: ( 'while' )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1690:1: ( 'while' )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1691:1: 'while'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileAccess().getWhileKeyword_0()); 
            }
            match(input,24,FOLLOW_24_in_rule__While__Group__0__Impl3551); if (state.failed) return ;
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1704:1: rule__While__Group__1 : rule__While__Group__1__Impl rule__While__Group__2 ;
    public final void rule__While__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1708:1: ( rule__While__Group__1__Impl rule__While__Group__2 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1709:2: rule__While__Group__1__Impl rule__While__Group__2
            {
            pushFollow(FOLLOW_rule__While__Group__1__Impl_in_rule__While__Group__13582);
            rule__While__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__While__Group__2_in_rule__While__Group__13585);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1716:1: rule__While__Group__1__Impl : ( '(' ) ;
    public final void rule__While__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1720:1: ( ( '(' ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1721:1: ( '(' )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1721:1: ( '(' )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1722:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,21,FOLLOW_21_in_rule__While__Group__1__Impl3613); if (state.failed) return ;
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1735:1: rule__While__Group__2 : rule__While__Group__2__Impl rule__While__Group__3 ;
    public final void rule__While__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1739:1: ( rule__While__Group__2__Impl rule__While__Group__3 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1740:2: rule__While__Group__2__Impl rule__While__Group__3
            {
            pushFollow(FOLLOW_rule__While__Group__2__Impl_in_rule__While__Group__23644);
            rule__While__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__While__Group__3_in_rule__While__Group__23647);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1747:1: rule__While__Group__2__Impl : ( ( rule__While__ConditionAssignment_2 ) ) ;
    public final void rule__While__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1751:1: ( ( ( rule__While__ConditionAssignment_2 ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1752:1: ( ( rule__While__ConditionAssignment_2 ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1752:1: ( ( rule__While__ConditionAssignment_2 ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1753:1: ( rule__While__ConditionAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileAccess().getConditionAssignment_2()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1754:1: ( rule__While__ConditionAssignment_2 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1754:2: rule__While__ConditionAssignment_2
            {
            pushFollow(FOLLOW_rule__While__ConditionAssignment_2_in_rule__While__Group__2__Impl3674);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1764:1: rule__While__Group__3 : rule__While__Group__3__Impl rule__While__Group__4 ;
    public final void rule__While__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1768:1: ( rule__While__Group__3__Impl rule__While__Group__4 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1769:2: rule__While__Group__3__Impl rule__While__Group__4
            {
            pushFollow(FOLLOW_rule__While__Group__3__Impl_in_rule__While__Group__33704);
            rule__While__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__While__Group__4_in_rule__While__Group__33707);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1776:1: rule__While__Group__3__Impl : ( ')' ) ;
    public final void rule__While__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1780:1: ( ( ')' ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1781:1: ( ')' )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1781:1: ( ')' )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1782:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileAccess().getRightParenthesisKeyword_3()); 
            }
            match(input,22,FOLLOW_22_in_rule__While__Group__3__Impl3735); if (state.failed) return ;
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1795:1: rule__While__Group__4 : rule__While__Group__4__Impl ;
    public final void rule__While__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1799:1: ( rule__While__Group__4__Impl )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1800:2: rule__While__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__While__Group__4__Impl_in_rule__While__Group__43766);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1806:1: rule__While__Group__4__Impl : ( ( rule__While__StatementAssignment_4 ) ) ;
    public final void rule__While__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1810:1: ( ( ( rule__While__StatementAssignment_4 ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1811:1: ( ( rule__While__StatementAssignment_4 ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1811:1: ( ( rule__While__StatementAssignment_4 ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1812:1: ( rule__While__StatementAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileAccess().getStatementAssignment_4()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1813:1: ( rule__While__StatementAssignment_4 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1813:2: rule__While__StatementAssignment_4
            {
            pushFollow(FOLLOW_rule__While__StatementAssignment_4_in_rule__While__Group__4__Impl3793);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1833:1: rule__For__Group__0 : rule__For__Group__0__Impl rule__For__Group__1 ;
    public final void rule__For__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1837:1: ( rule__For__Group__0__Impl rule__For__Group__1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1838:2: rule__For__Group__0__Impl rule__For__Group__1
            {
            pushFollow(FOLLOW_rule__For__Group__0__Impl_in_rule__For__Group__03833);
            rule__For__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__For__Group__1_in_rule__For__Group__03836);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1845:1: rule__For__Group__0__Impl : ( 'for' ) ;
    public final void rule__For__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1849:1: ( ( 'for' ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1850:1: ( 'for' )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1850:1: ( 'for' )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1851:1: 'for'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForAccess().getForKeyword_0()); 
            }
            match(input,25,FOLLOW_25_in_rule__For__Group__0__Impl3864); if (state.failed) return ;
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1864:1: rule__For__Group__1 : rule__For__Group__1__Impl rule__For__Group__2 ;
    public final void rule__For__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1868:1: ( rule__For__Group__1__Impl rule__For__Group__2 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1869:2: rule__For__Group__1__Impl rule__For__Group__2
            {
            pushFollow(FOLLOW_rule__For__Group__1__Impl_in_rule__For__Group__13895);
            rule__For__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__For__Group__2_in_rule__For__Group__13898);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1876:1: rule__For__Group__1__Impl : ( ( rule__For__IteratorAssignment_1 ) ) ;
    public final void rule__For__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1880:1: ( ( ( rule__For__IteratorAssignment_1 ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1881:1: ( ( rule__For__IteratorAssignment_1 ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1881:1: ( ( rule__For__IteratorAssignment_1 ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1882:1: ( rule__For__IteratorAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForAccess().getIteratorAssignment_1()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1883:1: ( rule__For__IteratorAssignment_1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1883:2: rule__For__IteratorAssignment_1
            {
            pushFollow(FOLLOW_rule__For__IteratorAssignment_1_in_rule__For__Group__1__Impl3925);
            rule__For__IteratorAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getForAccess().getIteratorAssignment_1()); 
            }

            }


            }

        }
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1893:1: rule__For__Group__2 : rule__For__Group__2__Impl ;
    public final void rule__For__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1897:1: ( rule__For__Group__2__Impl )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1898:2: rule__For__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__For__Group__2__Impl_in_rule__For__Group__23955);
            rule__For__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1904:1: rule__For__Group__2__Impl : ( ( rule__For__StatementAssignment_2 ) ) ;
    public final void rule__For__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1908:1: ( ( ( rule__For__StatementAssignment_2 ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1909:1: ( ( rule__For__StatementAssignment_2 ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1909:1: ( ( rule__For__StatementAssignment_2 ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1910:1: ( rule__For__StatementAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForAccess().getStatementAssignment_2()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1911:1: ( rule__For__StatementAssignment_2 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1911:2: rule__For__StatementAssignment_2
            {
            pushFollow(FOLLOW_rule__For__StatementAssignment_2_in_rule__For__Group__2__Impl3982);
            rule__For__StatementAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getForAccess().getStatementAssignment_2()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__EachKeyIterator__Group__0"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1927:1: rule__EachKeyIterator__Group__0 : rule__EachKeyIterator__Group__0__Impl rule__EachKeyIterator__Group__1 ;
    public final void rule__EachKeyIterator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1931:1: ( rule__EachKeyIterator__Group__0__Impl rule__EachKeyIterator__Group__1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1932:2: rule__EachKeyIterator__Group__0__Impl rule__EachKeyIterator__Group__1
            {
            pushFollow(FOLLOW_rule__EachKeyIterator__Group__0__Impl_in_rule__EachKeyIterator__Group__04018);
            rule__EachKeyIterator__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EachKeyIterator__Group__1_in_rule__EachKeyIterator__Group__04021);
            rule__EachKeyIterator__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EachKeyIterator__Group__0"


    // $ANTLR start "rule__EachKeyIterator__Group__0__Impl"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1939:1: rule__EachKeyIterator__Group__0__Impl : ( '(' ) ;
    public final void rule__EachKeyIterator__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1943:1: ( ( '(' ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1944:1: ( '(' )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1944:1: ( '(' )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1945:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEachKeyIteratorAccess().getLeftParenthesisKeyword_0()); 
            }
            match(input,21,FOLLOW_21_in_rule__EachKeyIterator__Group__0__Impl4049); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEachKeyIteratorAccess().getLeftParenthesisKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EachKeyIterator__Group__0__Impl"


    // $ANTLR start "rule__EachKeyIterator__Group__1"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1958:1: rule__EachKeyIterator__Group__1 : rule__EachKeyIterator__Group__1__Impl rule__EachKeyIterator__Group__2 ;
    public final void rule__EachKeyIterator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1962:1: ( rule__EachKeyIterator__Group__1__Impl rule__EachKeyIterator__Group__2 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1963:2: rule__EachKeyIterator__Group__1__Impl rule__EachKeyIterator__Group__2
            {
            pushFollow(FOLLOW_rule__EachKeyIterator__Group__1__Impl_in_rule__EachKeyIterator__Group__14080);
            rule__EachKeyIterator__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EachKeyIterator__Group__2_in_rule__EachKeyIterator__Group__14083);
            rule__EachKeyIterator__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EachKeyIterator__Group__1"


    // $ANTLR start "rule__EachKeyIterator__Group__1__Impl"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1970:1: rule__EachKeyIterator__Group__1__Impl : ( ( rule__EachKeyIterator__KeyAssignment_1 ) ) ;
    public final void rule__EachKeyIterator__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1974:1: ( ( ( rule__EachKeyIterator__KeyAssignment_1 ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1975:1: ( ( rule__EachKeyIterator__KeyAssignment_1 ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1975:1: ( ( rule__EachKeyIterator__KeyAssignment_1 ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1976:1: ( rule__EachKeyIterator__KeyAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEachKeyIteratorAccess().getKeyAssignment_1()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1977:1: ( rule__EachKeyIterator__KeyAssignment_1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1977:2: rule__EachKeyIterator__KeyAssignment_1
            {
            pushFollow(FOLLOW_rule__EachKeyIterator__KeyAssignment_1_in_rule__EachKeyIterator__Group__1__Impl4110);
            rule__EachKeyIterator__KeyAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEachKeyIteratorAccess().getKeyAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EachKeyIterator__Group__1__Impl"


    // $ANTLR start "rule__EachKeyIterator__Group__2"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1987:1: rule__EachKeyIterator__Group__2 : rule__EachKeyIterator__Group__2__Impl rule__EachKeyIterator__Group__3 ;
    public final void rule__EachKeyIterator__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1991:1: ( rule__EachKeyIterator__Group__2__Impl rule__EachKeyIterator__Group__3 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1992:2: rule__EachKeyIterator__Group__2__Impl rule__EachKeyIterator__Group__3
            {
            pushFollow(FOLLOW_rule__EachKeyIterator__Group__2__Impl_in_rule__EachKeyIterator__Group__24140);
            rule__EachKeyIterator__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EachKeyIterator__Group__3_in_rule__EachKeyIterator__Group__24143);
            rule__EachKeyIterator__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EachKeyIterator__Group__2"


    // $ANTLR start "rule__EachKeyIterator__Group__2__Impl"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1999:1: rule__EachKeyIterator__Group__2__Impl : ( ':' ) ;
    public final void rule__EachKeyIterator__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2003:1: ( ( ':' ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2004:1: ( ':' )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2004:1: ( ':' )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2005:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEachKeyIteratorAccess().getColonKeyword_2()); 
            }
            match(input,26,FOLLOW_26_in_rule__EachKeyIterator__Group__2__Impl4171); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEachKeyIteratorAccess().getColonKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EachKeyIterator__Group__2__Impl"


    // $ANTLR start "rule__EachKeyIterator__Group__3"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2018:1: rule__EachKeyIterator__Group__3 : rule__EachKeyIterator__Group__3__Impl rule__EachKeyIterator__Group__4 ;
    public final void rule__EachKeyIterator__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2022:1: ( rule__EachKeyIterator__Group__3__Impl rule__EachKeyIterator__Group__4 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2023:2: rule__EachKeyIterator__Group__3__Impl rule__EachKeyIterator__Group__4
            {
            pushFollow(FOLLOW_rule__EachKeyIterator__Group__3__Impl_in_rule__EachKeyIterator__Group__34202);
            rule__EachKeyIterator__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EachKeyIterator__Group__4_in_rule__EachKeyIterator__Group__34205);
            rule__EachKeyIterator__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EachKeyIterator__Group__3"


    // $ANTLR start "rule__EachKeyIterator__Group__3__Impl"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2030:1: rule__EachKeyIterator__Group__3__Impl : ( ( rule__EachKeyIterator__ValueAssignment_3 ) ) ;
    public final void rule__EachKeyIterator__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2034:1: ( ( ( rule__EachKeyIterator__ValueAssignment_3 ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2035:1: ( ( rule__EachKeyIterator__ValueAssignment_3 ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2035:1: ( ( rule__EachKeyIterator__ValueAssignment_3 ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2036:1: ( rule__EachKeyIterator__ValueAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEachKeyIteratorAccess().getValueAssignment_3()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2037:1: ( rule__EachKeyIterator__ValueAssignment_3 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2037:2: rule__EachKeyIterator__ValueAssignment_3
            {
            pushFollow(FOLLOW_rule__EachKeyIterator__ValueAssignment_3_in_rule__EachKeyIterator__Group__3__Impl4232);
            rule__EachKeyIterator__ValueAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEachKeyIteratorAccess().getValueAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EachKeyIterator__Group__3__Impl"


    // $ANTLR start "rule__EachKeyIterator__Group__4"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2047:1: rule__EachKeyIterator__Group__4 : rule__EachKeyIterator__Group__4__Impl rule__EachKeyIterator__Group__5 ;
    public final void rule__EachKeyIterator__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2051:1: ( rule__EachKeyIterator__Group__4__Impl rule__EachKeyIterator__Group__5 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2052:2: rule__EachKeyIterator__Group__4__Impl rule__EachKeyIterator__Group__5
            {
            pushFollow(FOLLOW_rule__EachKeyIterator__Group__4__Impl_in_rule__EachKeyIterator__Group__44262);
            rule__EachKeyIterator__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EachKeyIterator__Group__5_in_rule__EachKeyIterator__Group__44265);
            rule__EachKeyIterator__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EachKeyIterator__Group__4"


    // $ANTLR start "rule__EachKeyIterator__Group__4__Impl"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2059:1: rule__EachKeyIterator__Group__4__Impl : ( 'in' ) ;
    public final void rule__EachKeyIterator__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2063:1: ( ( 'in' ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2064:1: ( 'in' )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2064:1: ( 'in' )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2065:1: 'in'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEachKeyIteratorAccess().getInKeyword_4()); 
            }
            match(input,27,FOLLOW_27_in_rule__EachKeyIterator__Group__4__Impl4293); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEachKeyIteratorAccess().getInKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EachKeyIterator__Group__4__Impl"


    // $ANTLR start "rule__EachKeyIterator__Group__5"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2078:1: rule__EachKeyIterator__Group__5 : rule__EachKeyIterator__Group__5__Impl rule__EachKeyIterator__Group__6 ;
    public final void rule__EachKeyIterator__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2082:1: ( rule__EachKeyIterator__Group__5__Impl rule__EachKeyIterator__Group__6 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2083:2: rule__EachKeyIterator__Group__5__Impl rule__EachKeyIterator__Group__6
            {
            pushFollow(FOLLOW_rule__EachKeyIterator__Group__5__Impl_in_rule__EachKeyIterator__Group__54324);
            rule__EachKeyIterator__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EachKeyIterator__Group__6_in_rule__EachKeyIterator__Group__54327);
            rule__EachKeyIterator__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EachKeyIterator__Group__5"


    // $ANTLR start "rule__EachKeyIterator__Group__5__Impl"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2090:1: rule__EachKeyIterator__Group__5__Impl : ( ( rule__EachKeyIterator__ArrayAssignment_5 ) ) ;
    public final void rule__EachKeyIterator__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2094:1: ( ( ( rule__EachKeyIterator__ArrayAssignment_5 ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2095:1: ( ( rule__EachKeyIterator__ArrayAssignment_5 ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2095:1: ( ( rule__EachKeyIterator__ArrayAssignment_5 ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2096:1: ( rule__EachKeyIterator__ArrayAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEachKeyIteratorAccess().getArrayAssignment_5()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2097:1: ( rule__EachKeyIterator__ArrayAssignment_5 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2097:2: rule__EachKeyIterator__ArrayAssignment_5
            {
            pushFollow(FOLLOW_rule__EachKeyIterator__ArrayAssignment_5_in_rule__EachKeyIterator__Group__5__Impl4354);
            rule__EachKeyIterator__ArrayAssignment_5();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEachKeyIteratorAccess().getArrayAssignment_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EachKeyIterator__Group__5__Impl"


    // $ANTLR start "rule__EachKeyIterator__Group__6"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2107:1: rule__EachKeyIterator__Group__6 : rule__EachKeyIterator__Group__6__Impl ;
    public final void rule__EachKeyIterator__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2111:1: ( rule__EachKeyIterator__Group__6__Impl )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2112:2: rule__EachKeyIterator__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__EachKeyIterator__Group__6__Impl_in_rule__EachKeyIterator__Group__64384);
            rule__EachKeyIterator__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EachKeyIterator__Group__6"


    // $ANTLR start "rule__EachKeyIterator__Group__6__Impl"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2118:1: rule__EachKeyIterator__Group__6__Impl : ( ')' ) ;
    public final void rule__EachKeyIterator__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2122:1: ( ( ')' ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2123:1: ( ')' )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2123:1: ( ')' )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2124:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEachKeyIteratorAccess().getRightParenthesisKeyword_6()); 
            }
            match(input,22,FOLLOW_22_in_rule__EachKeyIterator__Group__6__Impl4412); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEachKeyIteratorAccess().getRightParenthesisKeyword_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EachKeyIterator__Group__6__Impl"


    // $ANTLR start "rule__EachValueIterator__Group__0"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2151:1: rule__EachValueIterator__Group__0 : rule__EachValueIterator__Group__0__Impl rule__EachValueIterator__Group__1 ;
    public final void rule__EachValueIterator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2155:1: ( rule__EachValueIterator__Group__0__Impl rule__EachValueIterator__Group__1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2156:2: rule__EachValueIterator__Group__0__Impl rule__EachValueIterator__Group__1
            {
            pushFollow(FOLLOW_rule__EachValueIterator__Group__0__Impl_in_rule__EachValueIterator__Group__04457);
            rule__EachValueIterator__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EachValueIterator__Group__1_in_rule__EachValueIterator__Group__04460);
            rule__EachValueIterator__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EachValueIterator__Group__0"


    // $ANTLR start "rule__EachValueIterator__Group__0__Impl"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2163:1: rule__EachValueIterator__Group__0__Impl : ( '(' ) ;
    public final void rule__EachValueIterator__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2167:1: ( ( '(' ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2168:1: ( '(' )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2168:1: ( '(' )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2169:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEachValueIteratorAccess().getLeftParenthesisKeyword_0()); 
            }
            match(input,21,FOLLOW_21_in_rule__EachValueIterator__Group__0__Impl4488); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEachValueIteratorAccess().getLeftParenthesisKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EachValueIterator__Group__0__Impl"


    // $ANTLR start "rule__EachValueIterator__Group__1"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2182:1: rule__EachValueIterator__Group__1 : rule__EachValueIterator__Group__1__Impl rule__EachValueIterator__Group__2 ;
    public final void rule__EachValueIterator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2186:1: ( rule__EachValueIterator__Group__1__Impl rule__EachValueIterator__Group__2 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2187:2: rule__EachValueIterator__Group__1__Impl rule__EachValueIterator__Group__2
            {
            pushFollow(FOLLOW_rule__EachValueIterator__Group__1__Impl_in_rule__EachValueIterator__Group__14519);
            rule__EachValueIterator__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EachValueIterator__Group__2_in_rule__EachValueIterator__Group__14522);
            rule__EachValueIterator__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EachValueIterator__Group__1"


    // $ANTLR start "rule__EachValueIterator__Group__1__Impl"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2194:1: rule__EachValueIterator__Group__1__Impl : ( ( rule__EachValueIterator__ValueAssignment_1 ) ) ;
    public final void rule__EachValueIterator__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2198:1: ( ( ( rule__EachValueIterator__ValueAssignment_1 ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2199:1: ( ( rule__EachValueIterator__ValueAssignment_1 ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2199:1: ( ( rule__EachValueIterator__ValueAssignment_1 ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2200:1: ( rule__EachValueIterator__ValueAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEachValueIteratorAccess().getValueAssignment_1()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2201:1: ( rule__EachValueIterator__ValueAssignment_1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2201:2: rule__EachValueIterator__ValueAssignment_1
            {
            pushFollow(FOLLOW_rule__EachValueIterator__ValueAssignment_1_in_rule__EachValueIterator__Group__1__Impl4549);
            rule__EachValueIterator__ValueAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEachValueIteratorAccess().getValueAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EachValueIterator__Group__1__Impl"


    // $ANTLR start "rule__EachValueIterator__Group__2"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2211:1: rule__EachValueIterator__Group__2 : rule__EachValueIterator__Group__2__Impl rule__EachValueIterator__Group__3 ;
    public final void rule__EachValueIterator__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2215:1: ( rule__EachValueIterator__Group__2__Impl rule__EachValueIterator__Group__3 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2216:2: rule__EachValueIterator__Group__2__Impl rule__EachValueIterator__Group__3
            {
            pushFollow(FOLLOW_rule__EachValueIterator__Group__2__Impl_in_rule__EachValueIterator__Group__24579);
            rule__EachValueIterator__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EachValueIterator__Group__3_in_rule__EachValueIterator__Group__24582);
            rule__EachValueIterator__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EachValueIterator__Group__2"


    // $ANTLR start "rule__EachValueIterator__Group__2__Impl"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2223:1: rule__EachValueIterator__Group__2__Impl : ( 'in' ) ;
    public final void rule__EachValueIterator__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2227:1: ( ( 'in' ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2228:1: ( 'in' )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2228:1: ( 'in' )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2229:1: 'in'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEachValueIteratorAccess().getInKeyword_2()); 
            }
            match(input,27,FOLLOW_27_in_rule__EachValueIterator__Group__2__Impl4610); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEachValueIteratorAccess().getInKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EachValueIterator__Group__2__Impl"


    // $ANTLR start "rule__EachValueIterator__Group__3"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2242:1: rule__EachValueIterator__Group__3 : rule__EachValueIterator__Group__3__Impl rule__EachValueIterator__Group__4 ;
    public final void rule__EachValueIterator__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2246:1: ( rule__EachValueIterator__Group__3__Impl rule__EachValueIterator__Group__4 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2247:2: rule__EachValueIterator__Group__3__Impl rule__EachValueIterator__Group__4
            {
            pushFollow(FOLLOW_rule__EachValueIterator__Group__3__Impl_in_rule__EachValueIterator__Group__34641);
            rule__EachValueIterator__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EachValueIterator__Group__4_in_rule__EachValueIterator__Group__34644);
            rule__EachValueIterator__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EachValueIterator__Group__3"


    // $ANTLR start "rule__EachValueIterator__Group__3__Impl"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2254:1: rule__EachValueIterator__Group__3__Impl : ( ( rule__EachValueIterator__ArrayAssignment_3 ) ) ;
    public final void rule__EachValueIterator__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2258:1: ( ( ( rule__EachValueIterator__ArrayAssignment_3 ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2259:1: ( ( rule__EachValueIterator__ArrayAssignment_3 ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2259:1: ( ( rule__EachValueIterator__ArrayAssignment_3 ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2260:1: ( rule__EachValueIterator__ArrayAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEachValueIteratorAccess().getArrayAssignment_3()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2261:1: ( rule__EachValueIterator__ArrayAssignment_3 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2261:2: rule__EachValueIterator__ArrayAssignment_3
            {
            pushFollow(FOLLOW_rule__EachValueIterator__ArrayAssignment_3_in_rule__EachValueIterator__Group__3__Impl4671);
            rule__EachValueIterator__ArrayAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEachValueIteratorAccess().getArrayAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EachValueIterator__Group__3__Impl"


    // $ANTLR start "rule__EachValueIterator__Group__4"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2271:1: rule__EachValueIterator__Group__4 : rule__EachValueIterator__Group__4__Impl ;
    public final void rule__EachValueIterator__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2275:1: ( rule__EachValueIterator__Group__4__Impl )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2276:2: rule__EachValueIterator__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__EachValueIterator__Group__4__Impl_in_rule__EachValueIterator__Group__44701);
            rule__EachValueIterator__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EachValueIterator__Group__4"


    // $ANTLR start "rule__EachValueIterator__Group__4__Impl"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2282:1: rule__EachValueIterator__Group__4__Impl : ( ')' ) ;
    public final void rule__EachValueIterator__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2286:1: ( ( ')' ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2287:1: ( ')' )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2287:1: ( ')' )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2288:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEachValueIteratorAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,22,FOLLOW_22_in_rule__EachValueIterator__Group__4__Impl4729); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEachValueIteratorAccess().getRightParenthesisKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EachValueIterator__Group__4__Impl"


    // $ANTLR start "rule__VariableIterator__Group__0"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2311:1: rule__VariableIterator__Group__0 : rule__VariableIterator__Group__0__Impl rule__VariableIterator__Group__1 ;
    public final void rule__VariableIterator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2315:1: ( rule__VariableIterator__Group__0__Impl rule__VariableIterator__Group__1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2316:2: rule__VariableIterator__Group__0__Impl rule__VariableIterator__Group__1
            {
            pushFollow(FOLLOW_rule__VariableIterator__Group__0__Impl_in_rule__VariableIterator__Group__04770);
            rule__VariableIterator__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__VariableIterator__Group__1_in_rule__VariableIterator__Group__04773);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2323:1: rule__VariableIterator__Group__0__Impl : ( '(' ) ;
    public final void rule__VariableIterator__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2327:1: ( ( '(' ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2328:1: ( '(' )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2328:1: ( '(' )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2329:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableIteratorAccess().getLeftParenthesisKeyword_0()); 
            }
            match(input,21,FOLLOW_21_in_rule__VariableIterator__Group__0__Impl4801); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableIteratorAccess().getLeftParenthesisKeyword_0()); 
            }

            }


            }

        }
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2342:1: rule__VariableIterator__Group__1 : rule__VariableIterator__Group__1__Impl rule__VariableIterator__Group__2 ;
    public final void rule__VariableIterator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2346:1: ( rule__VariableIterator__Group__1__Impl rule__VariableIterator__Group__2 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2347:2: rule__VariableIterator__Group__1__Impl rule__VariableIterator__Group__2
            {
            pushFollow(FOLLOW_rule__VariableIterator__Group__1__Impl_in_rule__VariableIterator__Group__14832);
            rule__VariableIterator__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__VariableIterator__Group__2_in_rule__VariableIterator__Group__14835);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2354:1: rule__VariableIterator__Group__1__Impl : ( ( rule__VariableIterator__InitializationAssignment_1 ) ) ;
    public final void rule__VariableIterator__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2358:1: ( ( ( rule__VariableIterator__InitializationAssignment_1 ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2359:1: ( ( rule__VariableIterator__InitializationAssignment_1 ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2359:1: ( ( rule__VariableIterator__InitializationAssignment_1 ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2360:1: ( rule__VariableIterator__InitializationAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableIteratorAccess().getInitializationAssignment_1()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2361:1: ( rule__VariableIterator__InitializationAssignment_1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2361:2: rule__VariableIterator__InitializationAssignment_1
            {
            pushFollow(FOLLOW_rule__VariableIterator__InitializationAssignment_1_in_rule__VariableIterator__Group__1__Impl4862);
            rule__VariableIterator__InitializationAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableIteratorAccess().getInitializationAssignment_1()); 
            }

            }


            }

        }
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2371:1: rule__VariableIterator__Group__2 : rule__VariableIterator__Group__2__Impl rule__VariableIterator__Group__3 ;
    public final void rule__VariableIterator__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2375:1: ( rule__VariableIterator__Group__2__Impl rule__VariableIterator__Group__3 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2376:2: rule__VariableIterator__Group__2__Impl rule__VariableIterator__Group__3
            {
            pushFollow(FOLLOW_rule__VariableIterator__Group__2__Impl_in_rule__VariableIterator__Group__24892);
            rule__VariableIterator__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__VariableIterator__Group__3_in_rule__VariableIterator__Group__24895);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2383:1: rule__VariableIterator__Group__2__Impl : ( ';' ) ;
    public final void rule__VariableIterator__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2387:1: ( ( ';' ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2388:1: ( ';' )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2388:1: ( ';' )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2389:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableIteratorAccess().getSemicolonKeyword_2()); 
            }
            match(input,16,FOLLOW_16_in_rule__VariableIterator__Group__2__Impl4923); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableIteratorAccess().getSemicolonKeyword_2()); 
            }

            }


            }

        }
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2402:1: rule__VariableIterator__Group__3 : rule__VariableIterator__Group__3__Impl rule__VariableIterator__Group__4 ;
    public final void rule__VariableIterator__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2406:1: ( rule__VariableIterator__Group__3__Impl rule__VariableIterator__Group__4 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2407:2: rule__VariableIterator__Group__3__Impl rule__VariableIterator__Group__4
            {
            pushFollow(FOLLOW_rule__VariableIterator__Group__3__Impl_in_rule__VariableIterator__Group__34954);
            rule__VariableIterator__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__VariableIterator__Group__4_in_rule__VariableIterator__Group__34957);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2414:1: rule__VariableIterator__Group__3__Impl : ( ( rule__VariableIterator__ConditionAssignment_3 ) ) ;
    public final void rule__VariableIterator__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2418:1: ( ( ( rule__VariableIterator__ConditionAssignment_3 ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2419:1: ( ( rule__VariableIterator__ConditionAssignment_3 ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2419:1: ( ( rule__VariableIterator__ConditionAssignment_3 ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2420:1: ( rule__VariableIterator__ConditionAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableIteratorAccess().getConditionAssignment_3()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2421:1: ( rule__VariableIterator__ConditionAssignment_3 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2421:2: rule__VariableIterator__ConditionAssignment_3
            {
            pushFollow(FOLLOW_rule__VariableIterator__ConditionAssignment_3_in_rule__VariableIterator__Group__3__Impl4984);
            rule__VariableIterator__ConditionAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableIteratorAccess().getConditionAssignment_3()); 
            }

            }


            }

        }
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2431:1: rule__VariableIterator__Group__4 : rule__VariableIterator__Group__4__Impl rule__VariableIterator__Group__5 ;
    public final void rule__VariableIterator__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2435:1: ( rule__VariableIterator__Group__4__Impl rule__VariableIterator__Group__5 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2436:2: rule__VariableIterator__Group__4__Impl rule__VariableIterator__Group__5
            {
            pushFollow(FOLLOW_rule__VariableIterator__Group__4__Impl_in_rule__VariableIterator__Group__45014);
            rule__VariableIterator__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__VariableIterator__Group__5_in_rule__VariableIterator__Group__45017);
            rule__VariableIterator__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2443:1: rule__VariableIterator__Group__4__Impl : ( ';' ) ;
    public final void rule__VariableIterator__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2447:1: ( ( ';' ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2448:1: ( ';' )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2448:1: ( ';' )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2449:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableIteratorAccess().getSemicolonKeyword_4()); 
            }
            match(input,16,FOLLOW_16_in_rule__VariableIterator__Group__4__Impl5045); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableIteratorAccess().getSemicolonKeyword_4()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__VariableIterator__Group__5"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2462:1: rule__VariableIterator__Group__5 : rule__VariableIterator__Group__5__Impl rule__VariableIterator__Group__6 ;
    public final void rule__VariableIterator__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2466:1: ( rule__VariableIterator__Group__5__Impl rule__VariableIterator__Group__6 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2467:2: rule__VariableIterator__Group__5__Impl rule__VariableIterator__Group__6
            {
            pushFollow(FOLLOW_rule__VariableIterator__Group__5__Impl_in_rule__VariableIterator__Group__55076);
            rule__VariableIterator__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__VariableIterator__Group__6_in_rule__VariableIterator__Group__55079);
            rule__VariableIterator__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableIterator__Group__5"


    // $ANTLR start "rule__VariableIterator__Group__5__Impl"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2474:1: rule__VariableIterator__Group__5__Impl : ( ( rule__VariableIterator__IncrementAssignment_5 ) ) ;
    public final void rule__VariableIterator__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2478:1: ( ( ( rule__VariableIterator__IncrementAssignment_5 ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2479:1: ( ( rule__VariableIterator__IncrementAssignment_5 ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2479:1: ( ( rule__VariableIterator__IncrementAssignment_5 ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2480:1: ( rule__VariableIterator__IncrementAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableIteratorAccess().getIncrementAssignment_5()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2481:1: ( rule__VariableIterator__IncrementAssignment_5 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2481:2: rule__VariableIterator__IncrementAssignment_5
            {
            pushFollow(FOLLOW_rule__VariableIterator__IncrementAssignment_5_in_rule__VariableIterator__Group__5__Impl5106);
            rule__VariableIterator__IncrementAssignment_5();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableIteratorAccess().getIncrementAssignment_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableIterator__Group__5__Impl"


    // $ANTLR start "rule__VariableIterator__Group__6"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2491:1: rule__VariableIterator__Group__6 : rule__VariableIterator__Group__6__Impl ;
    public final void rule__VariableIterator__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2495:1: ( rule__VariableIterator__Group__6__Impl )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2496:2: rule__VariableIterator__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__VariableIterator__Group__6__Impl_in_rule__VariableIterator__Group__65136);
            rule__VariableIterator__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableIterator__Group__6"


    // $ANTLR start "rule__VariableIterator__Group__6__Impl"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2502:1: rule__VariableIterator__Group__6__Impl : ( ')' ) ;
    public final void rule__VariableIterator__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2506:1: ( ( ')' ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2507:1: ( ')' )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2507:1: ( ')' )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2508:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableIteratorAccess().getRightParenthesisKeyword_6()); 
            }
            match(input,22,FOLLOW_22_in_rule__VariableIterator__Group__6__Impl5164); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableIteratorAccess().getRightParenthesisKeyword_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableIterator__Group__6__Impl"


    // $ANTLR start "rule__FunctionDeclaration__Group__0"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2535:1: rule__FunctionDeclaration__Group__0 : rule__FunctionDeclaration__Group__0__Impl rule__FunctionDeclaration__Group__1 ;
    public final void rule__FunctionDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2539:1: ( rule__FunctionDeclaration__Group__0__Impl rule__FunctionDeclaration__Group__1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2540:2: rule__FunctionDeclaration__Group__0__Impl rule__FunctionDeclaration__Group__1
            {
            pushFollow(FOLLOW_rule__FunctionDeclaration__Group__0__Impl_in_rule__FunctionDeclaration__Group__05209);
            rule__FunctionDeclaration__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FunctionDeclaration__Group__1_in_rule__FunctionDeclaration__Group__05212);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2547:1: rule__FunctionDeclaration__Group__0__Impl : ( 'function' ) ;
    public final void rule__FunctionDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2551:1: ( ( 'function' ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2552:1: ( 'function' )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2552:1: ( 'function' )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2553:1: 'function'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionDeclarationAccess().getFunctionKeyword_0()); 
            }
            match(input,28,FOLLOW_28_in_rule__FunctionDeclaration__Group__0__Impl5240); if (state.failed) return ;
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2566:1: rule__FunctionDeclaration__Group__1 : rule__FunctionDeclaration__Group__1__Impl rule__FunctionDeclaration__Group__2 ;
    public final void rule__FunctionDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2570:1: ( rule__FunctionDeclaration__Group__1__Impl rule__FunctionDeclaration__Group__2 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2571:2: rule__FunctionDeclaration__Group__1__Impl rule__FunctionDeclaration__Group__2
            {
            pushFollow(FOLLOW_rule__FunctionDeclaration__Group__1__Impl_in_rule__FunctionDeclaration__Group__15271);
            rule__FunctionDeclaration__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FunctionDeclaration__Group__2_in_rule__FunctionDeclaration__Group__15274);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2578:1: rule__FunctionDeclaration__Group__1__Impl : ( ( rule__FunctionDeclaration__NameAssignment_1 ) ) ;
    public final void rule__FunctionDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2582:1: ( ( ( rule__FunctionDeclaration__NameAssignment_1 ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2583:1: ( ( rule__FunctionDeclaration__NameAssignment_1 ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2583:1: ( ( rule__FunctionDeclaration__NameAssignment_1 ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2584:1: ( rule__FunctionDeclaration__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionDeclarationAccess().getNameAssignment_1()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2585:1: ( rule__FunctionDeclaration__NameAssignment_1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2585:2: rule__FunctionDeclaration__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__FunctionDeclaration__NameAssignment_1_in_rule__FunctionDeclaration__Group__1__Impl5301);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2595:1: rule__FunctionDeclaration__Group__2 : rule__FunctionDeclaration__Group__2__Impl rule__FunctionDeclaration__Group__3 ;
    public final void rule__FunctionDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2599:1: ( rule__FunctionDeclaration__Group__2__Impl rule__FunctionDeclaration__Group__3 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2600:2: rule__FunctionDeclaration__Group__2__Impl rule__FunctionDeclaration__Group__3
            {
            pushFollow(FOLLOW_rule__FunctionDeclaration__Group__2__Impl_in_rule__FunctionDeclaration__Group__25331);
            rule__FunctionDeclaration__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FunctionDeclaration__Group__3_in_rule__FunctionDeclaration__Group__25334);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2607:1: rule__FunctionDeclaration__Group__2__Impl : ( '(' ) ;
    public final void rule__FunctionDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2611:1: ( ( '(' ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2612:1: ( '(' )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2612:1: ( '(' )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2613:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionDeclarationAccess().getLeftParenthesisKeyword_2()); 
            }
            match(input,21,FOLLOW_21_in_rule__FunctionDeclaration__Group__2__Impl5362); if (state.failed) return ;
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2626:1: rule__FunctionDeclaration__Group__3 : rule__FunctionDeclaration__Group__3__Impl rule__FunctionDeclaration__Group__4 ;
    public final void rule__FunctionDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2630:1: ( rule__FunctionDeclaration__Group__3__Impl rule__FunctionDeclaration__Group__4 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2631:2: rule__FunctionDeclaration__Group__3__Impl rule__FunctionDeclaration__Group__4
            {
            pushFollow(FOLLOW_rule__FunctionDeclaration__Group__3__Impl_in_rule__FunctionDeclaration__Group__35393);
            rule__FunctionDeclaration__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FunctionDeclaration__Group__4_in_rule__FunctionDeclaration__Group__35396);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2638:1: rule__FunctionDeclaration__Group__3__Impl : ( ( rule__FunctionDeclaration__Group_3__0 )? ) ;
    public final void rule__FunctionDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2642:1: ( ( ( rule__FunctionDeclaration__Group_3__0 )? ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2643:1: ( ( rule__FunctionDeclaration__Group_3__0 )? )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2643:1: ( ( rule__FunctionDeclaration__Group_3__0 )? )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2644:1: ( rule__FunctionDeclaration__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionDeclarationAccess().getGroup_3()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2645:1: ( rule__FunctionDeclaration__Group_3__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==48) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2645:2: rule__FunctionDeclaration__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__FunctionDeclaration__Group_3__0_in_rule__FunctionDeclaration__Group__3__Impl5423);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2655:1: rule__FunctionDeclaration__Group__4 : rule__FunctionDeclaration__Group__4__Impl ;
    public final void rule__FunctionDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2659:1: ( rule__FunctionDeclaration__Group__4__Impl )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2660:2: rule__FunctionDeclaration__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__FunctionDeclaration__Group__4__Impl_in_rule__FunctionDeclaration__Group__45454);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2666:1: rule__FunctionDeclaration__Group__4__Impl : ( ')' ) ;
    public final void rule__FunctionDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2670:1: ( ( ')' ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2671:1: ( ')' )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2671:1: ( ')' )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2672:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionDeclarationAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,22,FOLLOW_22_in_rule__FunctionDeclaration__Group__4__Impl5482); if (state.failed) return ;
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2695:1: rule__FunctionDeclaration__Group_3__0 : rule__FunctionDeclaration__Group_3__0__Impl rule__FunctionDeclaration__Group_3__1 ;
    public final void rule__FunctionDeclaration__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2699:1: ( rule__FunctionDeclaration__Group_3__0__Impl rule__FunctionDeclaration__Group_3__1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2700:2: rule__FunctionDeclaration__Group_3__0__Impl rule__FunctionDeclaration__Group_3__1
            {
            pushFollow(FOLLOW_rule__FunctionDeclaration__Group_3__0__Impl_in_rule__FunctionDeclaration__Group_3__05523);
            rule__FunctionDeclaration__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FunctionDeclaration__Group_3__1_in_rule__FunctionDeclaration__Group_3__05526);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2707:1: rule__FunctionDeclaration__Group_3__0__Impl : ( ( rule__FunctionDeclaration__ParameterAssignment_3_0 ) ) ;
    public final void rule__FunctionDeclaration__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2711:1: ( ( ( rule__FunctionDeclaration__ParameterAssignment_3_0 ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2712:1: ( ( rule__FunctionDeclaration__ParameterAssignment_3_0 ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2712:1: ( ( rule__FunctionDeclaration__ParameterAssignment_3_0 ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2713:1: ( rule__FunctionDeclaration__ParameterAssignment_3_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionDeclarationAccess().getParameterAssignment_3_0()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2714:1: ( rule__FunctionDeclaration__ParameterAssignment_3_0 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2714:2: rule__FunctionDeclaration__ParameterAssignment_3_0
            {
            pushFollow(FOLLOW_rule__FunctionDeclaration__ParameterAssignment_3_0_in_rule__FunctionDeclaration__Group_3__0__Impl5553);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2724:1: rule__FunctionDeclaration__Group_3__1 : rule__FunctionDeclaration__Group_3__1__Impl ;
    public final void rule__FunctionDeclaration__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2728:1: ( rule__FunctionDeclaration__Group_3__1__Impl )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2729:2: rule__FunctionDeclaration__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__FunctionDeclaration__Group_3__1__Impl_in_rule__FunctionDeclaration__Group_3__15583);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2735:1: rule__FunctionDeclaration__Group_3__1__Impl : ( ( rule__FunctionDeclaration__Group_3_1__0 )* ) ;
    public final void rule__FunctionDeclaration__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2739:1: ( ( ( rule__FunctionDeclaration__Group_3_1__0 )* ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2740:1: ( ( rule__FunctionDeclaration__Group_3_1__0 )* )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2740:1: ( ( rule__FunctionDeclaration__Group_3_1__0 )* )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2741:1: ( rule__FunctionDeclaration__Group_3_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionDeclarationAccess().getGroup_3_1()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2742:1: ( rule__FunctionDeclaration__Group_3_1__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==29) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2742:2: rule__FunctionDeclaration__Group_3_1__0
            	    {
            	    pushFollow(FOLLOW_rule__FunctionDeclaration__Group_3_1__0_in_rule__FunctionDeclaration__Group_3__1__Impl5610);
            	    rule__FunctionDeclaration__Group_3_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop13;
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2756:1: rule__FunctionDeclaration__Group_3_1__0 : rule__FunctionDeclaration__Group_3_1__0__Impl rule__FunctionDeclaration__Group_3_1__1 ;
    public final void rule__FunctionDeclaration__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2760:1: ( rule__FunctionDeclaration__Group_3_1__0__Impl rule__FunctionDeclaration__Group_3_1__1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2761:2: rule__FunctionDeclaration__Group_3_1__0__Impl rule__FunctionDeclaration__Group_3_1__1
            {
            pushFollow(FOLLOW_rule__FunctionDeclaration__Group_3_1__0__Impl_in_rule__FunctionDeclaration__Group_3_1__05645);
            rule__FunctionDeclaration__Group_3_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FunctionDeclaration__Group_3_1__1_in_rule__FunctionDeclaration__Group_3_1__05648);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2768:1: rule__FunctionDeclaration__Group_3_1__0__Impl : ( ',' ) ;
    public final void rule__FunctionDeclaration__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2772:1: ( ( ',' ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2773:1: ( ',' )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2773:1: ( ',' )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2774:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionDeclarationAccess().getCommaKeyword_3_1_0()); 
            }
            match(input,29,FOLLOW_29_in_rule__FunctionDeclaration__Group_3_1__0__Impl5676); if (state.failed) return ;
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2787:1: rule__FunctionDeclaration__Group_3_1__1 : rule__FunctionDeclaration__Group_3_1__1__Impl ;
    public final void rule__FunctionDeclaration__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2791:1: ( rule__FunctionDeclaration__Group_3_1__1__Impl )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2792:2: rule__FunctionDeclaration__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_rule__FunctionDeclaration__Group_3_1__1__Impl_in_rule__FunctionDeclaration__Group_3_1__15707);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2798:1: rule__FunctionDeclaration__Group_3_1__1__Impl : ( ( rule__FunctionDeclaration__ParameterAssignment_3_1_1 ) ) ;
    public final void rule__FunctionDeclaration__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2802:1: ( ( ( rule__FunctionDeclaration__ParameterAssignment_3_1_1 ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2803:1: ( ( rule__FunctionDeclaration__ParameterAssignment_3_1_1 ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2803:1: ( ( rule__FunctionDeclaration__ParameterAssignment_3_1_1 ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2804:1: ( rule__FunctionDeclaration__ParameterAssignment_3_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionDeclarationAccess().getParameterAssignment_3_1_1()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2805:1: ( rule__FunctionDeclaration__ParameterAssignment_3_1_1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2805:2: rule__FunctionDeclaration__ParameterAssignment_3_1_1
            {
            pushFollow(FOLLOW_rule__FunctionDeclaration__ParameterAssignment_3_1_1_in_rule__FunctionDeclaration__Group_3_1__1__Impl5734);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2819:1: rule__ParameterDeclaration__Group__0 : rule__ParameterDeclaration__Group__0__Impl rule__ParameterDeclaration__Group__1 ;
    public final void rule__ParameterDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2823:1: ( rule__ParameterDeclaration__Group__0__Impl rule__ParameterDeclaration__Group__1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2824:2: rule__ParameterDeclaration__Group__0__Impl rule__ParameterDeclaration__Group__1
            {
            pushFollow(FOLLOW_rule__ParameterDeclaration__Group__0__Impl_in_rule__ParameterDeclaration__Group__05768);
            rule__ParameterDeclaration__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ParameterDeclaration__Group__1_in_rule__ParameterDeclaration__Group__05771);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2831:1: rule__ParameterDeclaration__Group__0__Impl : ( ( rule__ParameterDeclaration__ByAdressAssignment_0 ) ) ;
    public final void rule__ParameterDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2835:1: ( ( ( rule__ParameterDeclaration__ByAdressAssignment_0 ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2836:1: ( ( rule__ParameterDeclaration__ByAdressAssignment_0 ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2836:1: ( ( rule__ParameterDeclaration__ByAdressAssignment_0 ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2837:1: ( rule__ParameterDeclaration__ByAdressAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterDeclarationAccess().getByAdressAssignment_0()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2838:1: ( rule__ParameterDeclaration__ByAdressAssignment_0 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2838:2: rule__ParameterDeclaration__ByAdressAssignment_0
            {
            pushFollow(FOLLOW_rule__ParameterDeclaration__ByAdressAssignment_0_in_rule__ParameterDeclaration__Group__0__Impl5798);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2848:1: rule__ParameterDeclaration__Group__1 : rule__ParameterDeclaration__Group__1__Impl ;
    public final void rule__ParameterDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2852:1: ( rule__ParameterDeclaration__Group__1__Impl )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2853:2: rule__ParameterDeclaration__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ParameterDeclaration__Group__1__Impl_in_rule__ParameterDeclaration__Group__15828);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2859:1: rule__ParameterDeclaration__Group__1__Impl : ( ( rule__ParameterDeclaration__NameAssignment_1 ) ) ;
    public final void rule__ParameterDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2863:1: ( ( ( rule__ParameterDeclaration__NameAssignment_1 ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2864:1: ( ( rule__ParameterDeclaration__NameAssignment_1 ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2864:1: ( ( rule__ParameterDeclaration__NameAssignment_1 ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2865:1: ( rule__ParameterDeclaration__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterDeclarationAccess().getNameAssignment_1()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2866:1: ( rule__ParameterDeclaration__NameAssignment_1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2866:2: rule__ParameterDeclaration__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__ParameterDeclaration__NameAssignment_1_in_rule__ParameterDeclaration__Group__1__Impl5855);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2880:1: rule__LocalDeclaration__Group__0 : rule__LocalDeclaration__Group__0__Impl rule__LocalDeclaration__Group__1 ;
    public final void rule__LocalDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2884:1: ( rule__LocalDeclaration__Group__0__Impl rule__LocalDeclaration__Group__1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2885:2: rule__LocalDeclaration__Group__0__Impl rule__LocalDeclaration__Group__1
            {
            pushFollow(FOLLOW_rule__LocalDeclaration__Group__0__Impl_in_rule__LocalDeclaration__Group__05889);
            rule__LocalDeclaration__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__LocalDeclaration__Group__1_in_rule__LocalDeclaration__Group__05892);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2892:1: rule__LocalDeclaration__Group__0__Impl : ( 'var' ) ;
    public final void rule__LocalDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2896:1: ( ( 'var' ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2897:1: ( 'var' )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2897:1: ( 'var' )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2898:1: 'var'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalDeclarationAccess().getVarKeyword_0()); 
            }
            match(input,30,FOLLOW_30_in_rule__LocalDeclaration__Group__0__Impl5920); if (state.failed) return ;
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2911:1: rule__LocalDeclaration__Group__1 : rule__LocalDeclaration__Group__1__Impl rule__LocalDeclaration__Group__2 ;
    public final void rule__LocalDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2915:1: ( rule__LocalDeclaration__Group__1__Impl rule__LocalDeclaration__Group__2 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2916:2: rule__LocalDeclaration__Group__1__Impl rule__LocalDeclaration__Group__2
            {
            pushFollow(FOLLOW_rule__LocalDeclaration__Group__1__Impl_in_rule__LocalDeclaration__Group__15951);
            rule__LocalDeclaration__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__LocalDeclaration__Group__2_in_rule__LocalDeclaration__Group__15954);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2923:1: rule__LocalDeclaration__Group__1__Impl : ( ( rule__LocalDeclaration__NameAssignment_1 ) ) ;
    public final void rule__LocalDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2927:1: ( ( ( rule__LocalDeclaration__NameAssignment_1 ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2928:1: ( ( rule__LocalDeclaration__NameAssignment_1 ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2928:1: ( ( rule__LocalDeclaration__NameAssignment_1 ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2929:1: ( rule__LocalDeclaration__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalDeclarationAccess().getNameAssignment_1()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2930:1: ( rule__LocalDeclaration__NameAssignment_1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2930:2: rule__LocalDeclaration__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__LocalDeclaration__NameAssignment_1_in_rule__LocalDeclaration__Group__1__Impl5981);
            rule__LocalDeclaration__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocalDeclarationAccess().getNameAssignment_1()); 
            }

            }


            }

        }
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2940:1: rule__LocalDeclaration__Group__2 : rule__LocalDeclaration__Group__2__Impl rule__LocalDeclaration__Group__3 ;
    public final void rule__LocalDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2944:1: ( rule__LocalDeclaration__Group__2__Impl rule__LocalDeclaration__Group__3 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2945:2: rule__LocalDeclaration__Group__2__Impl rule__LocalDeclaration__Group__3
            {
            pushFollow(FOLLOW_rule__LocalDeclaration__Group__2__Impl_in_rule__LocalDeclaration__Group__26011);
            rule__LocalDeclaration__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__LocalDeclaration__Group__3_in_rule__LocalDeclaration__Group__26014);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2952:1: rule__LocalDeclaration__Group__2__Impl : ( ( rule__LocalDeclaration__ValueAssignment_2 )? ) ;
    public final void rule__LocalDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2956:1: ( ( ( rule__LocalDeclaration__ValueAssignment_2 )? ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2957:1: ( ( rule__LocalDeclaration__ValueAssignment_2 )? )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2957:1: ( ( rule__LocalDeclaration__ValueAssignment_2 )? )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2958:1: ( rule__LocalDeclaration__ValueAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalDeclarationAccess().getValueAssignment_2()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2959:1: ( rule__LocalDeclaration__ValueAssignment_2 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=RULE_ID && LA14_0<=RULE_STRING)||LA14_0==21||LA14_0==44) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2959:2: rule__LocalDeclaration__ValueAssignment_2
                    {
                    pushFollow(FOLLOW_rule__LocalDeclaration__ValueAssignment_2_in_rule__LocalDeclaration__Group__2__Impl6041);
                    rule__LocalDeclaration__ValueAssignment_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocalDeclarationAccess().getValueAssignment_2()); 
            }

            }


            }

        }
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2969:1: rule__LocalDeclaration__Group__3 : rule__LocalDeclaration__Group__3__Impl ;
    public final void rule__LocalDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2973:1: ( rule__LocalDeclaration__Group__3__Impl )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2974:2: rule__LocalDeclaration__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__LocalDeclaration__Group__3__Impl_in_rule__LocalDeclaration__Group__36072);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2980:1: rule__LocalDeclaration__Group__3__Impl : ( ';' ) ;
    public final void rule__LocalDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2984:1: ( ( ';' ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2985:1: ( ';' )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2985:1: ( ';' )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:2986:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalDeclarationAccess().getSemicolonKeyword_3()); 
            }
            match(input,16,FOLLOW_16_in_rule__LocalDeclaration__Group__3__Impl6100); if (state.failed) return ;
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


    // $ANTLR start "rule__GlobalDeclaration__Group__0"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3007:1: rule__GlobalDeclaration__Group__0 : rule__GlobalDeclaration__Group__0__Impl rule__GlobalDeclaration__Group__1 ;
    public final void rule__GlobalDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3011:1: ( rule__GlobalDeclaration__Group__0__Impl rule__GlobalDeclaration__Group__1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3012:2: rule__GlobalDeclaration__Group__0__Impl rule__GlobalDeclaration__Group__1
            {
            pushFollow(FOLLOW_rule__GlobalDeclaration__Group__0__Impl_in_rule__GlobalDeclaration__Group__06139);
            rule__GlobalDeclaration__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GlobalDeclaration__Group__1_in_rule__GlobalDeclaration__Group__06142);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3019:1: rule__GlobalDeclaration__Group__0__Impl : ( 'global' ) ;
    public final void rule__GlobalDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3023:1: ( ( 'global' ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3024:1: ( 'global' )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3024:1: ( 'global' )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3025:1: 'global'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGlobalDeclarationAccess().getGlobalKeyword_0()); 
            }
            match(input,31,FOLLOW_31_in_rule__GlobalDeclaration__Group__0__Impl6170); if (state.failed) return ;
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3038:1: rule__GlobalDeclaration__Group__1 : rule__GlobalDeclaration__Group__1__Impl rule__GlobalDeclaration__Group__2 ;
    public final void rule__GlobalDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3042:1: ( rule__GlobalDeclaration__Group__1__Impl rule__GlobalDeclaration__Group__2 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3043:2: rule__GlobalDeclaration__Group__1__Impl rule__GlobalDeclaration__Group__2
            {
            pushFollow(FOLLOW_rule__GlobalDeclaration__Group__1__Impl_in_rule__GlobalDeclaration__Group__16201);
            rule__GlobalDeclaration__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GlobalDeclaration__Group__2_in_rule__GlobalDeclaration__Group__16204);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3050:1: rule__GlobalDeclaration__Group__1__Impl : ( ( rule__GlobalDeclaration__NameAssignment_1 ) ) ;
    public final void rule__GlobalDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3054:1: ( ( ( rule__GlobalDeclaration__NameAssignment_1 ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3055:1: ( ( rule__GlobalDeclaration__NameAssignment_1 ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3055:1: ( ( rule__GlobalDeclaration__NameAssignment_1 ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3056:1: ( rule__GlobalDeclaration__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGlobalDeclarationAccess().getNameAssignment_1()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3057:1: ( rule__GlobalDeclaration__NameAssignment_1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3057:2: rule__GlobalDeclaration__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__GlobalDeclaration__NameAssignment_1_in_rule__GlobalDeclaration__Group__1__Impl6231);
            rule__GlobalDeclaration__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGlobalDeclarationAccess().getNameAssignment_1()); 
            }

            }


            }

        }
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3067:1: rule__GlobalDeclaration__Group__2 : rule__GlobalDeclaration__Group__2__Impl rule__GlobalDeclaration__Group__3 ;
    public final void rule__GlobalDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3071:1: ( rule__GlobalDeclaration__Group__2__Impl rule__GlobalDeclaration__Group__3 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3072:2: rule__GlobalDeclaration__Group__2__Impl rule__GlobalDeclaration__Group__3
            {
            pushFollow(FOLLOW_rule__GlobalDeclaration__Group__2__Impl_in_rule__GlobalDeclaration__Group__26261);
            rule__GlobalDeclaration__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GlobalDeclaration__Group__3_in_rule__GlobalDeclaration__Group__26264);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3079:1: rule__GlobalDeclaration__Group__2__Impl : ( ( rule__GlobalDeclaration__ValueAssignment_2 )? ) ;
    public final void rule__GlobalDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3083:1: ( ( ( rule__GlobalDeclaration__ValueAssignment_2 )? ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3084:1: ( ( rule__GlobalDeclaration__ValueAssignment_2 )? )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3084:1: ( ( rule__GlobalDeclaration__ValueAssignment_2 )? )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3085:1: ( rule__GlobalDeclaration__ValueAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGlobalDeclarationAccess().getValueAssignment_2()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3086:1: ( rule__GlobalDeclaration__ValueAssignment_2 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=RULE_ID && LA15_0<=RULE_STRING)||LA15_0==21||LA15_0==44) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3086:2: rule__GlobalDeclaration__ValueAssignment_2
                    {
                    pushFollow(FOLLOW_rule__GlobalDeclaration__ValueAssignment_2_in_rule__GlobalDeclaration__Group__2__Impl6291);
                    rule__GlobalDeclaration__ValueAssignment_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGlobalDeclarationAccess().getValueAssignment_2()); 
            }

            }


            }

        }
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3096:1: rule__GlobalDeclaration__Group__3 : rule__GlobalDeclaration__Group__3__Impl ;
    public final void rule__GlobalDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3100:1: ( rule__GlobalDeclaration__Group__3__Impl )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3101:2: rule__GlobalDeclaration__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__GlobalDeclaration__Group__3__Impl_in_rule__GlobalDeclaration__Group__36322);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3107:1: rule__GlobalDeclaration__Group__3__Impl : ( ';' ) ;
    public final void rule__GlobalDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3111:1: ( ( ';' ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3112:1: ( ';' )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3112:1: ( ';' )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3113:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGlobalDeclarationAccess().getSemicolonKeyword_3()); 
            }
            match(input,16,FOLLOW_16_in_rule__GlobalDeclaration__Group__3__Impl6350); if (state.failed) return ;
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


    // $ANTLR start "rule__Comparison__Group__0"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3134:1: rule__Comparison__Group__0 : rule__Comparison__Group__0__Impl rule__Comparison__Group__1 ;
    public final void rule__Comparison__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3138:1: ( rule__Comparison__Group__0__Impl rule__Comparison__Group__1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3139:2: rule__Comparison__Group__0__Impl rule__Comparison__Group__1
            {
            pushFollow(FOLLOW_rule__Comparison__Group__0__Impl_in_rule__Comparison__Group__06389);
            rule__Comparison__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Comparison__Group__1_in_rule__Comparison__Group__06392);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3146:1: rule__Comparison__Group__0__Impl : ( ruleOr ) ;
    public final void rule__Comparison__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3150:1: ( ( ruleOr ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3151:1: ( ruleOr )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3151:1: ( ruleOr )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3152:1: ruleOr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getOrParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleOr_in_rule__Comparison__Group__0__Impl6419);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3163:1: rule__Comparison__Group__1 : rule__Comparison__Group__1__Impl ;
    public final void rule__Comparison__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3167:1: ( rule__Comparison__Group__1__Impl )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3168:2: rule__Comparison__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Comparison__Group__1__Impl_in_rule__Comparison__Group__16448);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3174:1: rule__Comparison__Group__1__Impl : ( ( rule__Comparison__Group_1__0 )* ) ;
    public final void rule__Comparison__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3178:1: ( ( ( rule__Comparison__Group_1__0 )* ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3179:1: ( ( rule__Comparison__Group_1__0 )* )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3179:1: ( ( rule__Comparison__Group_1__0 )* )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3180:1: ( rule__Comparison__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getGroup_1()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3181:1: ( rule__Comparison__Group_1__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=32 && LA16_0<=39)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3181:2: rule__Comparison__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Comparison__Group_1__0_in_rule__Comparison__Group__1__Impl6475);
            	    rule__Comparison__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop16;
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3195:1: rule__Comparison__Group_1__0 : rule__Comparison__Group_1__0__Impl rule__Comparison__Group_1__1 ;
    public final void rule__Comparison__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3199:1: ( rule__Comparison__Group_1__0__Impl rule__Comparison__Group_1__1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3200:2: rule__Comparison__Group_1__0__Impl rule__Comparison__Group_1__1
            {
            pushFollow(FOLLOW_rule__Comparison__Group_1__0__Impl_in_rule__Comparison__Group_1__06510);
            rule__Comparison__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Comparison__Group_1__1_in_rule__Comparison__Group_1__06513);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3207:1: rule__Comparison__Group_1__0__Impl : ( ( rule__Comparison__Alternatives_1_0 ) ) ;
    public final void rule__Comparison__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3211:1: ( ( ( rule__Comparison__Alternatives_1_0 ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3212:1: ( ( rule__Comparison__Alternatives_1_0 ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3212:1: ( ( rule__Comparison__Alternatives_1_0 ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3213:1: ( rule__Comparison__Alternatives_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getAlternatives_1_0()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3214:1: ( rule__Comparison__Alternatives_1_0 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3214:2: rule__Comparison__Alternatives_1_0
            {
            pushFollow(FOLLOW_rule__Comparison__Alternatives_1_0_in_rule__Comparison__Group_1__0__Impl6540);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3224:1: rule__Comparison__Group_1__1 : rule__Comparison__Group_1__1__Impl ;
    public final void rule__Comparison__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3228:1: ( rule__Comparison__Group_1__1__Impl )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3229:2: rule__Comparison__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Comparison__Group_1__1__Impl_in_rule__Comparison__Group_1__16570);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3235:1: rule__Comparison__Group_1__1__Impl : ( ( rule__Comparison__RightAssignment_1_1 ) ) ;
    public final void rule__Comparison__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3239:1: ( ( ( rule__Comparison__RightAssignment_1_1 ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3240:1: ( ( rule__Comparison__RightAssignment_1_1 ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3240:1: ( ( rule__Comparison__RightAssignment_1_1 ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3241:1: ( rule__Comparison__RightAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getRightAssignment_1_1()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3242:1: ( rule__Comparison__RightAssignment_1_1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3242:2: rule__Comparison__RightAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Comparison__RightAssignment_1_1_in_rule__Comparison__Group_1__1__Impl6597);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3256:1: rule__Comparison__Group_1_0_0__0 : rule__Comparison__Group_1_0_0__0__Impl rule__Comparison__Group_1_0_0__1 ;
    public final void rule__Comparison__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3260:1: ( rule__Comparison__Group_1_0_0__0__Impl rule__Comparison__Group_1_0_0__1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3261:2: rule__Comparison__Group_1_0_0__0__Impl rule__Comparison__Group_1_0_0__1
            {
            pushFollow(FOLLOW_rule__Comparison__Group_1_0_0__0__Impl_in_rule__Comparison__Group_1_0_0__06631);
            rule__Comparison__Group_1_0_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Comparison__Group_1_0_0__1_in_rule__Comparison__Group_1_0_0__06634);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3268:1: rule__Comparison__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__Comparison__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3272:1: ( ( () ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3273:1: ( () )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3273:1: ( () )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3274:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getTypedEqualsLeftAction_1_0_0_0()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3275:1: ()
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3277:1: 
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3287:1: rule__Comparison__Group_1_0_0__1 : rule__Comparison__Group_1_0_0__1__Impl ;
    public final void rule__Comparison__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3291:1: ( rule__Comparison__Group_1_0_0__1__Impl )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3292:2: rule__Comparison__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Comparison__Group_1_0_0__1__Impl_in_rule__Comparison__Group_1_0_0__16692);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3298:1: rule__Comparison__Group_1_0_0__1__Impl : ( '===' ) ;
    public final void rule__Comparison__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3302:1: ( ( '===' ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3303:1: ( '===' )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3303:1: ( '===' )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3304:1: '==='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getEqualsSignEqualsSignEqualsSignKeyword_1_0_0_1()); 
            }
            match(input,32,FOLLOW_32_in_rule__Comparison__Group_1_0_0__1__Impl6720); if (state.failed) return ;
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3321:1: rule__Comparison__Group_1_0_1__0 : rule__Comparison__Group_1_0_1__0__Impl rule__Comparison__Group_1_0_1__1 ;
    public final void rule__Comparison__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3325:1: ( rule__Comparison__Group_1_0_1__0__Impl rule__Comparison__Group_1_0_1__1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3326:2: rule__Comparison__Group_1_0_1__0__Impl rule__Comparison__Group_1_0_1__1
            {
            pushFollow(FOLLOW_rule__Comparison__Group_1_0_1__0__Impl_in_rule__Comparison__Group_1_0_1__06755);
            rule__Comparison__Group_1_0_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Comparison__Group_1_0_1__1_in_rule__Comparison__Group_1_0_1__06758);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3333:1: rule__Comparison__Group_1_0_1__0__Impl : ( () ) ;
    public final void rule__Comparison__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3337:1: ( ( () ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3338:1: ( () )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3338:1: ( () )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3339:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getEqualsLeftAction_1_0_1_0()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3340:1: ()
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3342:1: 
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3352:1: rule__Comparison__Group_1_0_1__1 : rule__Comparison__Group_1_0_1__1__Impl ;
    public final void rule__Comparison__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3356:1: ( rule__Comparison__Group_1_0_1__1__Impl )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3357:2: rule__Comparison__Group_1_0_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Comparison__Group_1_0_1__1__Impl_in_rule__Comparison__Group_1_0_1__16816);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3363:1: rule__Comparison__Group_1_0_1__1__Impl : ( '==' ) ;
    public final void rule__Comparison__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3367:1: ( ( '==' ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3368:1: ( '==' )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3368:1: ( '==' )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3369:1: '=='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getEqualsSignEqualsSignKeyword_1_0_1_1()); 
            }
            match(input,33,FOLLOW_33_in_rule__Comparison__Group_1_0_1__1__Impl6844); if (state.failed) return ;
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3386:1: rule__Comparison__Group_1_0_2__0 : rule__Comparison__Group_1_0_2__0__Impl rule__Comparison__Group_1_0_2__1 ;
    public final void rule__Comparison__Group_1_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3390:1: ( rule__Comparison__Group_1_0_2__0__Impl rule__Comparison__Group_1_0_2__1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3391:2: rule__Comparison__Group_1_0_2__0__Impl rule__Comparison__Group_1_0_2__1
            {
            pushFollow(FOLLOW_rule__Comparison__Group_1_0_2__0__Impl_in_rule__Comparison__Group_1_0_2__06879);
            rule__Comparison__Group_1_0_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Comparison__Group_1_0_2__1_in_rule__Comparison__Group_1_0_2__06882);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3398:1: rule__Comparison__Group_1_0_2__0__Impl : ( () ) ;
    public final void rule__Comparison__Group_1_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3402:1: ( ( () ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3403:1: ( () )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3403:1: ( () )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3404:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getTypedDifferentLeftAction_1_0_2_0()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3405:1: ()
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3407:1: 
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3417:1: rule__Comparison__Group_1_0_2__1 : rule__Comparison__Group_1_0_2__1__Impl ;
    public final void rule__Comparison__Group_1_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3421:1: ( rule__Comparison__Group_1_0_2__1__Impl )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3422:2: rule__Comparison__Group_1_0_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Comparison__Group_1_0_2__1__Impl_in_rule__Comparison__Group_1_0_2__16940);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3428:1: rule__Comparison__Group_1_0_2__1__Impl : ( '!==' ) ;
    public final void rule__Comparison__Group_1_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3432:1: ( ( '!==' ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3433:1: ( '!==' )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3433:1: ( '!==' )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3434:1: '!=='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getExclamationMarkEqualsSignEqualsSignKeyword_1_0_2_1()); 
            }
            match(input,34,FOLLOW_34_in_rule__Comparison__Group_1_0_2__1__Impl6968); if (state.failed) return ;
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3451:1: rule__Comparison__Group_1_0_3__0 : rule__Comparison__Group_1_0_3__0__Impl rule__Comparison__Group_1_0_3__1 ;
    public final void rule__Comparison__Group_1_0_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3455:1: ( rule__Comparison__Group_1_0_3__0__Impl rule__Comparison__Group_1_0_3__1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3456:2: rule__Comparison__Group_1_0_3__0__Impl rule__Comparison__Group_1_0_3__1
            {
            pushFollow(FOLLOW_rule__Comparison__Group_1_0_3__0__Impl_in_rule__Comparison__Group_1_0_3__07003);
            rule__Comparison__Group_1_0_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Comparison__Group_1_0_3__1_in_rule__Comparison__Group_1_0_3__07006);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3463:1: rule__Comparison__Group_1_0_3__0__Impl : ( () ) ;
    public final void rule__Comparison__Group_1_0_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3467:1: ( ( () ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3468:1: ( () )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3468:1: ( () )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3469:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getDifferentLeftAction_1_0_3_0()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3470:1: ()
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3472:1: 
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3482:1: rule__Comparison__Group_1_0_3__1 : rule__Comparison__Group_1_0_3__1__Impl ;
    public final void rule__Comparison__Group_1_0_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3486:1: ( rule__Comparison__Group_1_0_3__1__Impl )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3487:2: rule__Comparison__Group_1_0_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Comparison__Group_1_0_3__1__Impl_in_rule__Comparison__Group_1_0_3__17064);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3493:1: rule__Comparison__Group_1_0_3__1__Impl : ( '!=' ) ;
    public final void rule__Comparison__Group_1_0_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3497:1: ( ( '!=' ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3498:1: ( '!=' )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3498:1: ( '!=' )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3499:1: '!='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getExclamationMarkEqualsSignKeyword_1_0_3_1()); 
            }
            match(input,35,FOLLOW_35_in_rule__Comparison__Group_1_0_3__1__Impl7092); if (state.failed) return ;
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3516:1: rule__Comparison__Group_1_0_4__0 : rule__Comparison__Group_1_0_4__0__Impl rule__Comparison__Group_1_0_4__1 ;
    public final void rule__Comparison__Group_1_0_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3520:1: ( rule__Comparison__Group_1_0_4__0__Impl rule__Comparison__Group_1_0_4__1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3521:2: rule__Comparison__Group_1_0_4__0__Impl rule__Comparison__Group_1_0_4__1
            {
            pushFollow(FOLLOW_rule__Comparison__Group_1_0_4__0__Impl_in_rule__Comparison__Group_1_0_4__07127);
            rule__Comparison__Group_1_0_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Comparison__Group_1_0_4__1_in_rule__Comparison__Group_1_0_4__07130);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3528:1: rule__Comparison__Group_1_0_4__0__Impl : ( () ) ;
    public final void rule__Comparison__Group_1_0_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3532:1: ( ( () ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3533:1: ( () )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3533:1: ( () )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3534:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getLessOrEqualsLeftAction_1_0_4_0()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3535:1: ()
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3537:1: 
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3547:1: rule__Comparison__Group_1_0_4__1 : rule__Comparison__Group_1_0_4__1__Impl ;
    public final void rule__Comparison__Group_1_0_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3551:1: ( rule__Comparison__Group_1_0_4__1__Impl )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3552:2: rule__Comparison__Group_1_0_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Comparison__Group_1_0_4__1__Impl_in_rule__Comparison__Group_1_0_4__17188);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3558:1: rule__Comparison__Group_1_0_4__1__Impl : ( '<=' ) ;
    public final void rule__Comparison__Group_1_0_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3562:1: ( ( '<=' ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3563:1: ( '<=' )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3563:1: ( '<=' )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3564:1: '<='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getLessThanSignEqualsSignKeyword_1_0_4_1()); 
            }
            match(input,36,FOLLOW_36_in_rule__Comparison__Group_1_0_4__1__Impl7216); if (state.failed) return ;
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3581:1: rule__Comparison__Group_1_0_5__0 : rule__Comparison__Group_1_0_5__0__Impl rule__Comparison__Group_1_0_5__1 ;
    public final void rule__Comparison__Group_1_0_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3585:1: ( rule__Comparison__Group_1_0_5__0__Impl rule__Comparison__Group_1_0_5__1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3586:2: rule__Comparison__Group_1_0_5__0__Impl rule__Comparison__Group_1_0_5__1
            {
            pushFollow(FOLLOW_rule__Comparison__Group_1_0_5__0__Impl_in_rule__Comparison__Group_1_0_5__07251);
            rule__Comparison__Group_1_0_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Comparison__Group_1_0_5__1_in_rule__Comparison__Group_1_0_5__07254);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3593:1: rule__Comparison__Group_1_0_5__0__Impl : ( () ) ;
    public final void rule__Comparison__Group_1_0_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3597:1: ( ( () ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3598:1: ( () )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3598:1: ( () )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3599:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getLessLeftAction_1_0_5_0()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3600:1: ()
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3602:1: 
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3612:1: rule__Comparison__Group_1_0_5__1 : rule__Comparison__Group_1_0_5__1__Impl ;
    public final void rule__Comparison__Group_1_0_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3616:1: ( rule__Comparison__Group_1_0_5__1__Impl )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3617:2: rule__Comparison__Group_1_0_5__1__Impl
            {
            pushFollow(FOLLOW_rule__Comparison__Group_1_0_5__1__Impl_in_rule__Comparison__Group_1_0_5__17312);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3623:1: rule__Comparison__Group_1_0_5__1__Impl : ( '<' ) ;
    public final void rule__Comparison__Group_1_0_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3627:1: ( ( '<' ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3628:1: ( '<' )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3628:1: ( '<' )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3629:1: '<'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getLessThanSignKeyword_1_0_5_1()); 
            }
            match(input,37,FOLLOW_37_in_rule__Comparison__Group_1_0_5__1__Impl7340); if (state.failed) return ;
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3646:1: rule__Comparison__Group_1_0_6__0 : rule__Comparison__Group_1_0_6__0__Impl rule__Comparison__Group_1_0_6__1 ;
    public final void rule__Comparison__Group_1_0_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3650:1: ( rule__Comparison__Group_1_0_6__0__Impl rule__Comparison__Group_1_0_6__1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3651:2: rule__Comparison__Group_1_0_6__0__Impl rule__Comparison__Group_1_0_6__1
            {
            pushFollow(FOLLOW_rule__Comparison__Group_1_0_6__0__Impl_in_rule__Comparison__Group_1_0_6__07375);
            rule__Comparison__Group_1_0_6__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Comparison__Group_1_0_6__1_in_rule__Comparison__Group_1_0_6__07378);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3658:1: rule__Comparison__Group_1_0_6__0__Impl : ( () ) ;
    public final void rule__Comparison__Group_1_0_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3662:1: ( ( () ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3663:1: ( () )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3663:1: ( () )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3664:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getMoreOrEqualsLeftAction_1_0_6_0()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3665:1: ()
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3667:1: 
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3677:1: rule__Comparison__Group_1_0_6__1 : rule__Comparison__Group_1_0_6__1__Impl ;
    public final void rule__Comparison__Group_1_0_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3681:1: ( rule__Comparison__Group_1_0_6__1__Impl )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3682:2: rule__Comparison__Group_1_0_6__1__Impl
            {
            pushFollow(FOLLOW_rule__Comparison__Group_1_0_6__1__Impl_in_rule__Comparison__Group_1_0_6__17436);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3688:1: rule__Comparison__Group_1_0_6__1__Impl : ( '>=' ) ;
    public final void rule__Comparison__Group_1_0_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3692:1: ( ( '>=' ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3693:1: ( '>=' )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3693:1: ( '>=' )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3694:1: '>='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getGreaterThanSignEqualsSignKeyword_1_0_6_1()); 
            }
            match(input,38,FOLLOW_38_in_rule__Comparison__Group_1_0_6__1__Impl7464); if (state.failed) return ;
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3711:1: rule__Comparison__Group_1_0_7__0 : rule__Comparison__Group_1_0_7__0__Impl rule__Comparison__Group_1_0_7__1 ;
    public final void rule__Comparison__Group_1_0_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3715:1: ( rule__Comparison__Group_1_0_7__0__Impl rule__Comparison__Group_1_0_7__1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3716:2: rule__Comparison__Group_1_0_7__0__Impl rule__Comparison__Group_1_0_7__1
            {
            pushFollow(FOLLOW_rule__Comparison__Group_1_0_7__0__Impl_in_rule__Comparison__Group_1_0_7__07499);
            rule__Comparison__Group_1_0_7__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Comparison__Group_1_0_7__1_in_rule__Comparison__Group_1_0_7__07502);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3723:1: rule__Comparison__Group_1_0_7__0__Impl : ( () ) ;
    public final void rule__Comparison__Group_1_0_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3727:1: ( ( () ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3728:1: ( () )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3728:1: ( () )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3729:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getMoreLeftAction_1_0_7_0()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3730:1: ()
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3732:1: 
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3742:1: rule__Comparison__Group_1_0_7__1 : rule__Comparison__Group_1_0_7__1__Impl ;
    public final void rule__Comparison__Group_1_0_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3746:1: ( rule__Comparison__Group_1_0_7__1__Impl )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3747:2: rule__Comparison__Group_1_0_7__1__Impl
            {
            pushFollow(FOLLOW_rule__Comparison__Group_1_0_7__1__Impl_in_rule__Comparison__Group_1_0_7__17560);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3753:1: rule__Comparison__Group_1_0_7__1__Impl : ( '>' ) ;
    public final void rule__Comparison__Group_1_0_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3757:1: ( ( '>' ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3758:1: ( '>' )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3758:1: ( '>' )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3759:1: '>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getGreaterThanSignKeyword_1_0_7_1()); 
            }
            match(input,39,FOLLOW_39_in_rule__Comparison__Group_1_0_7__1__Impl7588); if (state.failed) return ;
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3776:1: rule__Or__Group__0 : rule__Or__Group__0__Impl rule__Or__Group__1 ;
    public final void rule__Or__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3780:1: ( rule__Or__Group__0__Impl rule__Or__Group__1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3781:2: rule__Or__Group__0__Impl rule__Or__Group__1
            {
            pushFollow(FOLLOW_rule__Or__Group__0__Impl_in_rule__Or__Group__07623);
            rule__Or__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Or__Group__1_in_rule__Or__Group__07626);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3788:1: rule__Or__Group__0__Impl : ( ruleAnd ) ;
    public final void rule__Or__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3792:1: ( ( ruleAnd ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3793:1: ( ruleAnd )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3793:1: ( ruleAnd )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3794:1: ruleAnd
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAccess().getAndParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleAnd_in_rule__Or__Group__0__Impl7653);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3805:1: rule__Or__Group__1 : rule__Or__Group__1__Impl ;
    public final void rule__Or__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3809:1: ( rule__Or__Group__1__Impl )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3810:2: rule__Or__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Or__Group__1__Impl_in_rule__Or__Group__17682);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3816:1: rule__Or__Group__1__Impl : ( ( rule__Or__Group_1__0 )* ) ;
    public final void rule__Or__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3820:1: ( ( ( rule__Or__Group_1__0 )* ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3821:1: ( ( rule__Or__Group_1__0 )* )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3821:1: ( ( rule__Or__Group_1__0 )* )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3822:1: ( rule__Or__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAccess().getGroup_1()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3823:1: ( rule__Or__Group_1__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=12 && LA17_0<=13)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3823:2: rule__Or__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Or__Group_1__0_in_rule__Or__Group__1__Impl7709);
            	    rule__Or__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop17;
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3837:1: rule__Or__Group_1__0 : rule__Or__Group_1__0__Impl rule__Or__Group_1__1 ;
    public final void rule__Or__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3841:1: ( rule__Or__Group_1__0__Impl rule__Or__Group_1__1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3842:2: rule__Or__Group_1__0__Impl rule__Or__Group_1__1
            {
            pushFollow(FOLLOW_rule__Or__Group_1__0__Impl_in_rule__Or__Group_1__07744);
            rule__Or__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Or__Group_1__1_in_rule__Or__Group_1__07747);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3849:1: rule__Or__Group_1__0__Impl : ( ( rule__Or__Group_1_0__0 ) ) ;
    public final void rule__Or__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3853:1: ( ( ( rule__Or__Group_1_0__0 ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3854:1: ( ( rule__Or__Group_1_0__0 ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3854:1: ( ( rule__Or__Group_1_0__0 ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3855:1: ( rule__Or__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAccess().getGroup_1_0()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3856:1: ( rule__Or__Group_1_0__0 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3856:2: rule__Or__Group_1_0__0
            {
            pushFollow(FOLLOW_rule__Or__Group_1_0__0_in_rule__Or__Group_1__0__Impl7774);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3866:1: rule__Or__Group_1__1 : rule__Or__Group_1__1__Impl ;
    public final void rule__Or__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3870:1: ( rule__Or__Group_1__1__Impl )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3871:2: rule__Or__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Or__Group_1__1__Impl_in_rule__Or__Group_1__17804);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3877:1: rule__Or__Group_1__1__Impl : ( ( rule__Or__RightAssignment_1_1 ) ) ;
    public final void rule__Or__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3881:1: ( ( ( rule__Or__RightAssignment_1_1 ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3882:1: ( ( rule__Or__RightAssignment_1_1 ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3882:1: ( ( rule__Or__RightAssignment_1_1 ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3883:1: ( rule__Or__RightAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAccess().getRightAssignment_1_1()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3884:1: ( rule__Or__RightAssignment_1_1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3884:2: rule__Or__RightAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Or__RightAssignment_1_1_in_rule__Or__Group_1__1__Impl7831);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3898:1: rule__Or__Group_1_0__0 : rule__Or__Group_1_0__0__Impl rule__Or__Group_1_0__1 ;
    public final void rule__Or__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3902:1: ( rule__Or__Group_1_0__0__Impl rule__Or__Group_1_0__1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3903:2: rule__Or__Group_1_0__0__Impl rule__Or__Group_1_0__1
            {
            pushFollow(FOLLOW_rule__Or__Group_1_0__0__Impl_in_rule__Or__Group_1_0__07865);
            rule__Or__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Or__Group_1_0__1_in_rule__Or__Group_1_0__07868);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3910:1: rule__Or__Group_1_0__0__Impl : ( () ) ;
    public final void rule__Or__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3914:1: ( ( () ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3915:1: ( () )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3915:1: ( () )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3916:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAccess().getTypedEqualsLeftAction_1_0_0()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3917:1: ()
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3919:1: 
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3929:1: rule__Or__Group_1_0__1 : rule__Or__Group_1_0__1__Impl ;
    public final void rule__Or__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3933:1: ( rule__Or__Group_1_0__1__Impl )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3934:2: rule__Or__Group_1_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Or__Group_1_0__1__Impl_in_rule__Or__Group_1_0__17926);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3940:1: rule__Or__Group_1_0__1__Impl : ( ( rule__Or__Alternatives_1_0_1 ) ) ;
    public final void rule__Or__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3944:1: ( ( ( rule__Or__Alternatives_1_0_1 ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3945:1: ( ( rule__Or__Alternatives_1_0_1 ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3945:1: ( ( rule__Or__Alternatives_1_0_1 ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3946:1: ( rule__Or__Alternatives_1_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAccess().getAlternatives_1_0_1()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3947:1: ( rule__Or__Alternatives_1_0_1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3947:2: rule__Or__Alternatives_1_0_1
            {
            pushFollow(FOLLOW_rule__Or__Alternatives_1_0_1_in_rule__Or__Group_1_0__1__Impl7953);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3961:1: rule__And__Group__0 : rule__And__Group__0__Impl rule__And__Group__1 ;
    public final void rule__And__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3965:1: ( rule__And__Group__0__Impl rule__And__Group__1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3966:2: rule__And__Group__0__Impl rule__And__Group__1
            {
            pushFollow(FOLLOW_rule__And__Group__0__Impl_in_rule__And__Group__07987);
            rule__And__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__And__Group__1_in_rule__And__Group__07990);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3973:1: rule__And__Group__0__Impl : ( ruleAddition ) ;
    public final void rule__And__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3977:1: ( ( ruleAddition ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3978:1: ( ruleAddition )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3978:1: ( ruleAddition )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3979:1: ruleAddition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndAccess().getAdditionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleAddition_in_rule__And__Group__0__Impl8017);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3990:1: rule__And__Group__1 : rule__And__Group__1__Impl ;
    public final void rule__And__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3994:1: ( rule__And__Group__1__Impl )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:3995:2: rule__And__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__And__Group__1__Impl_in_rule__And__Group__18046);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4001:1: rule__And__Group__1__Impl : ( ( rule__And__Group_1__0 )* ) ;
    public final void rule__And__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4005:1: ( ( ( rule__And__Group_1__0 )* ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4006:1: ( ( rule__And__Group_1__0 )* )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4006:1: ( ( rule__And__Group_1__0 )* )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4007:1: ( rule__And__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndAccess().getGroup_1()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4008:1: ( rule__And__Group_1__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=14 && LA18_0<=15)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4008:2: rule__And__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__And__Group_1__0_in_rule__And__Group__1__Impl8073);
            	    rule__And__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop18;
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4022:1: rule__And__Group_1__0 : rule__And__Group_1__0__Impl rule__And__Group_1__1 ;
    public final void rule__And__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4026:1: ( rule__And__Group_1__0__Impl rule__And__Group_1__1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4027:2: rule__And__Group_1__0__Impl rule__And__Group_1__1
            {
            pushFollow(FOLLOW_rule__And__Group_1__0__Impl_in_rule__And__Group_1__08108);
            rule__And__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__And__Group_1__1_in_rule__And__Group_1__08111);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4034:1: rule__And__Group_1__0__Impl : ( ( rule__And__Group_1_0__0 ) ) ;
    public final void rule__And__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4038:1: ( ( ( rule__And__Group_1_0__0 ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4039:1: ( ( rule__And__Group_1_0__0 ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4039:1: ( ( rule__And__Group_1_0__0 ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4040:1: ( rule__And__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndAccess().getGroup_1_0()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4041:1: ( rule__And__Group_1_0__0 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4041:2: rule__And__Group_1_0__0
            {
            pushFollow(FOLLOW_rule__And__Group_1_0__0_in_rule__And__Group_1__0__Impl8138);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4051:1: rule__And__Group_1__1 : rule__And__Group_1__1__Impl ;
    public final void rule__And__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4055:1: ( rule__And__Group_1__1__Impl )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4056:2: rule__And__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__And__Group_1__1__Impl_in_rule__And__Group_1__18168);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4062:1: rule__And__Group_1__1__Impl : ( ( rule__And__RightAssignment_1_1 ) ) ;
    public final void rule__And__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4066:1: ( ( ( rule__And__RightAssignment_1_1 ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4067:1: ( ( rule__And__RightAssignment_1_1 ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4067:1: ( ( rule__And__RightAssignment_1_1 ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4068:1: ( rule__And__RightAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndAccess().getRightAssignment_1_1()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4069:1: ( rule__And__RightAssignment_1_1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4069:2: rule__And__RightAssignment_1_1
            {
            pushFollow(FOLLOW_rule__And__RightAssignment_1_1_in_rule__And__Group_1__1__Impl8195);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4083:1: rule__And__Group_1_0__0 : rule__And__Group_1_0__0__Impl rule__And__Group_1_0__1 ;
    public final void rule__And__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4087:1: ( rule__And__Group_1_0__0__Impl rule__And__Group_1_0__1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4088:2: rule__And__Group_1_0__0__Impl rule__And__Group_1_0__1
            {
            pushFollow(FOLLOW_rule__And__Group_1_0__0__Impl_in_rule__And__Group_1_0__08229);
            rule__And__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__And__Group_1_0__1_in_rule__And__Group_1_0__08232);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4095:1: rule__And__Group_1_0__0__Impl : ( () ) ;
    public final void rule__And__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4099:1: ( ( () ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4100:1: ( () )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4100:1: ( () )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4101:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndAccess().getTypedEqualsLeftAction_1_0_0()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4102:1: ()
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4104:1: 
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4114:1: rule__And__Group_1_0__1 : rule__And__Group_1_0__1__Impl ;
    public final void rule__And__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4118:1: ( rule__And__Group_1_0__1__Impl )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4119:2: rule__And__Group_1_0__1__Impl
            {
            pushFollow(FOLLOW_rule__And__Group_1_0__1__Impl_in_rule__And__Group_1_0__18290);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4125:1: rule__And__Group_1_0__1__Impl : ( ( rule__And__Alternatives_1_0_1 ) ) ;
    public final void rule__And__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4129:1: ( ( ( rule__And__Alternatives_1_0_1 ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4130:1: ( ( rule__And__Alternatives_1_0_1 ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4130:1: ( ( rule__And__Alternatives_1_0_1 ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4131:1: ( rule__And__Alternatives_1_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndAccess().getAlternatives_1_0_1()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4132:1: ( rule__And__Alternatives_1_0_1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4132:2: rule__And__Alternatives_1_0_1
            {
            pushFollow(FOLLOW_rule__And__Alternatives_1_0_1_in_rule__And__Group_1_0__1__Impl8317);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4146:1: rule__Addition__Group__0 : rule__Addition__Group__0__Impl rule__Addition__Group__1 ;
    public final void rule__Addition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4150:1: ( rule__Addition__Group__0__Impl rule__Addition__Group__1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4151:2: rule__Addition__Group__0__Impl rule__Addition__Group__1
            {
            pushFollow(FOLLOW_rule__Addition__Group__0__Impl_in_rule__Addition__Group__08351);
            rule__Addition__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Addition__Group__1_in_rule__Addition__Group__08354);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4158:1: rule__Addition__Group__0__Impl : ( ruleMultiplication ) ;
    public final void rule__Addition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4162:1: ( ( ruleMultiplication ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4163:1: ( ruleMultiplication )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4163:1: ( ruleMultiplication )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4164:1: ruleMultiplication
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getMultiplicationParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleMultiplication_in_rule__Addition__Group__0__Impl8381);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4175:1: rule__Addition__Group__1 : rule__Addition__Group__1__Impl ;
    public final void rule__Addition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4179:1: ( rule__Addition__Group__1__Impl )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4180:2: rule__Addition__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Addition__Group__1__Impl_in_rule__Addition__Group__18410);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4186:1: rule__Addition__Group__1__Impl : ( ( rule__Addition__Group_1__0 )* ) ;
    public final void rule__Addition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4190:1: ( ( ( rule__Addition__Group_1__0 )* ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4191:1: ( ( rule__Addition__Group_1__0 )* )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4191:1: ( ( rule__Addition__Group_1__0 )* )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4192:1: ( rule__Addition__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getGroup_1()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4193:1: ( rule__Addition__Group_1__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=40 && LA19_0<=41)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4193:2: rule__Addition__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Addition__Group_1__0_in_rule__Addition__Group__1__Impl8437);
            	    rule__Addition__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop19;
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4207:1: rule__Addition__Group_1__0 : rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1 ;
    public final void rule__Addition__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4211:1: ( rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4212:2: rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1
            {
            pushFollow(FOLLOW_rule__Addition__Group_1__0__Impl_in_rule__Addition__Group_1__08472);
            rule__Addition__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Addition__Group_1__1_in_rule__Addition__Group_1__08475);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4219:1: rule__Addition__Group_1__0__Impl : ( ( rule__Addition__Alternatives_1_0 ) ) ;
    public final void rule__Addition__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4223:1: ( ( ( rule__Addition__Alternatives_1_0 ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4224:1: ( ( rule__Addition__Alternatives_1_0 ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4224:1: ( ( rule__Addition__Alternatives_1_0 ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4225:1: ( rule__Addition__Alternatives_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getAlternatives_1_0()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4226:1: ( rule__Addition__Alternatives_1_0 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4226:2: rule__Addition__Alternatives_1_0
            {
            pushFollow(FOLLOW_rule__Addition__Alternatives_1_0_in_rule__Addition__Group_1__0__Impl8502);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4236:1: rule__Addition__Group_1__1 : rule__Addition__Group_1__1__Impl ;
    public final void rule__Addition__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4240:1: ( rule__Addition__Group_1__1__Impl )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4241:2: rule__Addition__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Addition__Group_1__1__Impl_in_rule__Addition__Group_1__18532);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4247:1: rule__Addition__Group_1__1__Impl : ( ( rule__Addition__RightAssignment_1_1 ) ) ;
    public final void rule__Addition__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4251:1: ( ( ( rule__Addition__RightAssignment_1_1 ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4252:1: ( ( rule__Addition__RightAssignment_1_1 ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4252:1: ( ( rule__Addition__RightAssignment_1_1 ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4253:1: ( rule__Addition__RightAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getRightAssignment_1_1()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4254:1: ( rule__Addition__RightAssignment_1_1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4254:2: rule__Addition__RightAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Addition__RightAssignment_1_1_in_rule__Addition__Group_1__1__Impl8559);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4268:1: rule__Addition__Group_1_0_0__0 : rule__Addition__Group_1_0_0__0__Impl rule__Addition__Group_1_0_0__1 ;
    public final void rule__Addition__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4272:1: ( rule__Addition__Group_1_0_0__0__Impl rule__Addition__Group_1_0_0__1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4273:2: rule__Addition__Group_1_0_0__0__Impl rule__Addition__Group_1_0_0__1
            {
            pushFollow(FOLLOW_rule__Addition__Group_1_0_0__0__Impl_in_rule__Addition__Group_1_0_0__08593);
            rule__Addition__Group_1_0_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Addition__Group_1_0_0__1_in_rule__Addition__Group_1_0_0__08596);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4280:1: rule__Addition__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__Addition__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4284:1: ( ( () ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4285:1: ( () )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4285:1: ( () )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4286:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4287:1: ()
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4289:1: 
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4299:1: rule__Addition__Group_1_0_0__1 : rule__Addition__Group_1_0_0__1__Impl ;
    public final void rule__Addition__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4303:1: ( rule__Addition__Group_1_0_0__1__Impl )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4304:2: rule__Addition__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Addition__Group_1_0_0__1__Impl_in_rule__Addition__Group_1_0_0__18654);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4310:1: rule__Addition__Group_1_0_0__1__Impl : ( '+' ) ;
    public final void rule__Addition__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4314:1: ( ( '+' ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4315:1: ( '+' )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4315:1: ( '+' )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4316:1: '+'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getPlusSignKeyword_1_0_0_1()); 
            }
            match(input,40,FOLLOW_40_in_rule__Addition__Group_1_0_0__1__Impl8682); if (state.failed) return ;
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4333:1: rule__Addition__Group_1_0_1__0 : rule__Addition__Group_1_0_1__0__Impl rule__Addition__Group_1_0_1__1 ;
    public final void rule__Addition__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4337:1: ( rule__Addition__Group_1_0_1__0__Impl rule__Addition__Group_1_0_1__1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4338:2: rule__Addition__Group_1_0_1__0__Impl rule__Addition__Group_1_0_1__1
            {
            pushFollow(FOLLOW_rule__Addition__Group_1_0_1__0__Impl_in_rule__Addition__Group_1_0_1__08717);
            rule__Addition__Group_1_0_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Addition__Group_1_0_1__1_in_rule__Addition__Group_1_0_1__08720);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4345:1: rule__Addition__Group_1_0_1__0__Impl : ( () ) ;
    public final void rule__Addition__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4349:1: ( ( () ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4350:1: ( () )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4350:1: ( () )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4351:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4352:1: ()
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4354:1: 
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4364:1: rule__Addition__Group_1_0_1__1 : rule__Addition__Group_1_0_1__1__Impl ;
    public final void rule__Addition__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4368:1: ( rule__Addition__Group_1_0_1__1__Impl )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4369:2: rule__Addition__Group_1_0_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Addition__Group_1_0_1__1__Impl_in_rule__Addition__Group_1_0_1__18778);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4375:1: rule__Addition__Group_1_0_1__1__Impl : ( '-' ) ;
    public final void rule__Addition__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4379:1: ( ( '-' ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4380:1: ( '-' )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4380:1: ( '-' )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4381:1: '-'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getHyphenMinusKeyword_1_0_1_1()); 
            }
            match(input,41,FOLLOW_41_in_rule__Addition__Group_1_0_1__1__Impl8806); if (state.failed) return ;
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4398:1: rule__Multiplication__Group__0 : rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1 ;
    public final void rule__Multiplication__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4402:1: ( rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4403:2: rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1
            {
            pushFollow(FOLLOW_rule__Multiplication__Group__0__Impl_in_rule__Multiplication__Group__08841);
            rule__Multiplication__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Multiplication__Group__1_in_rule__Multiplication__Group__08844);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4410:1: rule__Multiplication__Group__0__Impl : ( rulePrimaryExpression ) ;
    public final void rule__Multiplication__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4414:1: ( ( rulePrimaryExpression ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4415:1: ( rulePrimaryExpression )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4415:1: ( rulePrimaryExpression )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4416:1: rulePrimaryExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getPrimaryExpressionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_rulePrimaryExpression_in_rule__Multiplication__Group__0__Impl8871);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4427:1: rule__Multiplication__Group__1 : rule__Multiplication__Group__1__Impl ;
    public final void rule__Multiplication__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4431:1: ( rule__Multiplication__Group__1__Impl )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4432:2: rule__Multiplication__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Multiplication__Group__1__Impl_in_rule__Multiplication__Group__18900);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4438:1: rule__Multiplication__Group__1__Impl : ( ( rule__Multiplication__Group_1__0 )* ) ;
    public final void rule__Multiplication__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4442:1: ( ( ( rule__Multiplication__Group_1__0 )* ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4443:1: ( ( rule__Multiplication__Group_1__0 )* )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4443:1: ( ( rule__Multiplication__Group_1__0 )* )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4444:1: ( rule__Multiplication__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getGroup_1()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4445:1: ( rule__Multiplication__Group_1__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=42 && LA20_0<=43)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4445:2: rule__Multiplication__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Multiplication__Group_1__0_in_rule__Multiplication__Group__1__Impl8927);
            	    rule__Multiplication__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop20;
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4459:1: rule__Multiplication__Group_1__0 : rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1 ;
    public final void rule__Multiplication__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4463:1: ( rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4464:2: rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1
            {
            pushFollow(FOLLOW_rule__Multiplication__Group_1__0__Impl_in_rule__Multiplication__Group_1__08962);
            rule__Multiplication__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Multiplication__Group_1__1_in_rule__Multiplication__Group_1__08965);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4471:1: rule__Multiplication__Group_1__0__Impl : ( ( rule__Multiplication__Alternatives_1_0 ) ) ;
    public final void rule__Multiplication__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4475:1: ( ( ( rule__Multiplication__Alternatives_1_0 ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4476:1: ( ( rule__Multiplication__Alternatives_1_0 ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4476:1: ( ( rule__Multiplication__Alternatives_1_0 ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4477:1: ( rule__Multiplication__Alternatives_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getAlternatives_1_0()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4478:1: ( rule__Multiplication__Alternatives_1_0 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4478:2: rule__Multiplication__Alternatives_1_0
            {
            pushFollow(FOLLOW_rule__Multiplication__Alternatives_1_0_in_rule__Multiplication__Group_1__0__Impl8992);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4488:1: rule__Multiplication__Group_1__1 : rule__Multiplication__Group_1__1__Impl ;
    public final void rule__Multiplication__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4492:1: ( rule__Multiplication__Group_1__1__Impl )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4493:2: rule__Multiplication__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Multiplication__Group_1__1__Impl_in_rule__Multiplication__Group_1__19022);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4499:1: rule__Multiplication__Group_1__1__Impl : ( ( rule__Multiplication__RightAssignment_1_1 ) ) ;
    public final void rule__Multiplication__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4503:1: ( ( ( rule__Multiplication__RightAssignment_1_1 ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4504:1: ( ( rule__Multiplication__RightAssignment_1_1 ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4504:1: ( ( rule__Multiplication__RightAssignment_1_1 ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4505:1: ( rule__Multiplication__RightAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getRightAssignment_1_1()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4506:1: ( rule__Multiplication__RightAssignment_1_1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4506:2: rule__Multiplication__RightAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Multiplication__RightAssignment_1_1_in_rule__Multiplication__Group_1__1__Impl9049);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4520:1: rule__Multiplication__Group_1_0_0__0 : rule__Multiplication__Group_1_0_0__0__Impl rule__Multiplication__Group_1_0_0__1 ;
    public final void rule__Multiplication__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4524:1: ( rule__Multiplication__Group_1_0_0__0__Impl rule__Multiplication__Group_1_0_0__1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4525:2: rule__Multiplication__Group_1_0_0__0__Impl rule__Multiplication__Group_1_0_0__1
            {
            pushFollow(FOLLOW_rule__Multiplication__Group_1_0_0__0__Impl_in_rule__Multiplication__Group_1_0_0__09083);
            rule__Multiplication__Group_1_0_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Multiplication__Group_1_0_0__1_in_rule__Multiplication__Group_1_0_0__09086);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4532:1: rule__Multiplication__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__Multiplication__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4536:1: ( ( () ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4537:1: ( () )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4537:1: ( () )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4538:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0_0_0()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4539:1: ()
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4541:1: 
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4551:1: rule__Multiplication__Group_1_0_0__1 : rule__Multiplication__Group_1_0_0__1__Impl ;
    public final void rule__Multiplication__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4555:1: ( rule__Multiplication__Group_1_0_0__1__Impl )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4556:2: rule__Multiplication__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Multiplication__Group_1_0_0__1__Impl_in_rule__Multiplication__Group_1_0_0__19144);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4562:1: rule__Multiplication__Group_1_0_0__1__Impl : ( '*' ) ;
    public final void rule__Multiplication__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4566:1: ( ( '*' ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4567:1: ( '*' )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4567:1: ( '*' )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4568:1: '*'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getAsteriskKeyword_1_0_0_1()); 
            }
            match(input,42,FOLLOW_42_in_rule__Multiplication__Group_1_0_0__1__Impl9172); if (state.failed) return ;
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4585:1: rule__Multiplication__Group_1_0_1__0 : rule__Multiplication__Group_1_0_1__0__Impl rule__Multiplication__Group_1_0_1__1 ;
    public final void rule__Multiplication__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4589:1: ( rule__Multiplication__Group_1_0_1__0__Impl rule__Multiplication__Group_1_0_1__1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4590:2: rule__Multiplication__Group_1_0_1__0__Impl rule__Multiplication__Group_1_0_1__1
            {
            pushFollow(FOLLOW_rule__Multiplication__Group_1_0_1__0__Impl_in_rule__Multiplication__Group_1_0_1__09207);
            rule__Multiplication__Group_1_0_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Multiplication__Group_1_0_1__1_in_rule__Multiplication__Group_1_0_1__09210);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4597:1: rule__Multiplication__Group_1_0_1__0__Impl : ( () ) ;
    public final void rule__Multiplication__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4601:1: ( ( () ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4602:1: ( () )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4602:1: ( () )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4603:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getDivLeftAction_1_0_1_0()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4604:1: ()
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4606:1: 
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4616:1: rule__Multiplication__Group_1_0_1__1 : rule__Multiplication__Group_1_0_1__1__Impl ;
    public final void rule__Multiplication__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4620:1: ( rule__Multiplication__Group_1_0_1__1__Impl )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4621:2: rule__Multiplication__Group_1_0_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Multiplication__Group_1_0_1__1__Impl_in_rule__Multiplication__Group_1_0_1__19268);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4627:1: rule__Multiplication__Group_1_0_1__1__Impl : ( '/' ) ;
    public final void rule__Multiplication__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4631:1: ( ( '/' ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4632:1: ( '/' )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4632:1: ( '/' )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4633:1: '/'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getSolidusKeyword_1_0_1_1()); 
            }
            match(input,43,FOLLOW_43_in_rule__Multiplication__Group_1_0_1__1__Impl9296); if (state.failed) return ;
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4650:1: rule__PrimaryExpression__Group_0__0 : rule__PrimaryExpression__Group_0__0__Impl rule__PrimaryExpression__Group_0__1 ;
    public final void rule__PrimaryExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4654:1: ( rule__PrimaryExpression__Group_0__0__Impl rule__PrimaryExpression__Group_0__1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4655:2: rule__PrimaryExpression__Group_0__0__Impl rule__PrimaryExpression__Group_0__1
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__Group_0__0__Impl_in_rule__PrimaryExpression__Group_0__09331);
            rule__PrimaryExpression__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PrimaryExpression__Group_0__1_in_rule__PrimaryExpression__Group_0__09334);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4662:1: rule__PrimaryExpression__Group_0__0__Impl : ( '(' ) ;
    public final void rule__PrimaryExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4666:1: ( ( '(' ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4667:1: ( '(' )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4667:1: ( '(' )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4668:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_0_0()); 
            }
            match(input,21,FOLLOW_21_in_rule__PrimaryExpression__Group_0__0__Impl9362); if (state.failed) return ;
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4681:1: rule__PrimaryExpression__Group_0__1 : rule__PrimaryExpression__Group_0__1__Impl rule__PrimaryExpression__Group_0__2 ;
    public final void rule__PrimaryExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4685:1: ( rule__PrimaryExpression__Group_0__1__Impl rule__PrimaryExpression__Group_0__2 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4686:2: rule__PrimaryExpression__Group_0__1__Impl rule__PrimaryExpression__Group_0__2
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__Group_0__1__Impl_in_rule__PrimaryExpression__Group_0__19393);
            rule__PrimaryExpression__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PrimaryExpression__Group_0__2_in_rule__PrimaryExpression__Group_0__19396);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4693:1: rule__PrimaryExpression__Group_0__1__Impl : ( ruleExpression ) ;
    public final void rule__PrimaryExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4697:1: ( ( ruleExpression ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4698:1: ( ruleExpression )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4698:1: ( ruleExpression )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4699:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExpressionAccess().getExpressionParserRuleCall_0_1()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__PrimaryExpression__Group_0__1__Impl9423);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4710:1: rule__PrimaryExpression__Group_0__2 : rule__PrimaryExpression__Group_0__2__Impl ;
    public final void rule__PrimaryExpression__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4714:1: ( rule__PrimaryExpression__Group_0__2__Impl )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4715:2: rule__PrimaryExpression__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__Group_0__2__Impl_in_rule__PrimaryExpression__Group_0__29452);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4721:1: rule__PrimaryExpression__Group_0__2__Impl : ( ')' ) ;
    public final void rule__PrimaryExpression__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4725:1: ( ( ')' ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4726:1: ( ')' )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4726:1: ( ')' )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4727:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_0_2()); 
            }
            match(input,22,FOLLOW_22_in_rule__PrimaryExpression__Group_0__2__Impl9480); if (state.failed) return ;
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4746:1: rule__PrimaryExpression__Group_1__0 : rule__PrimaryExpression__Group_1__0__Impl rule__PrimaryExpression__Group_1__1 ;
    public final void rule__PrimaryExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4750:1: ( rule__PrimaryExpression__Group_1__0__Impl rule__PrimaryExpression__Group_1__1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4751:2: rule__PrimaryExpression__Group_1__0__Impl rule__PrimaryExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__Group_1__0__Impl_in_rule__PrimaryExpression__Group_1__09517);
            rule__PrimaryExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PrimaryExpression__Group_1__1_in_rule__PrimaryExpression__Group_1__09520);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4758:1: rule__PrimaryExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__PrimaryExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4762:1: ( ( () ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4763:1: ( () )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4763:1: ( () )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4764:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExpressionAccess().getRealLiteralAction_1_0()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4765:1: ()
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4767:1: 
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4777:1: rule__PrimaryExpression__Group_1__1 : rule__PrimaryExpression__Group_1__1__Impl ;
    public final void rule__PrimaryExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4781:1: ( rule__PrimaryExpression__Group_1__1__Impl )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4782:2: rule__PrimaryExpression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__Group_1__1__Impl_in_rule__PrimaryExpression__Group_1__19578);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4788:1: rule__PrimaryExpression__Group_1__1__Impl : ( ( rule__PrimaryExpression__ValueAssignment_1_1 ) ) ;
    public final void rule__PrimaryExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4792:1: ( ( ( rule__PrimaryExpression__ValueAssignment_1_1 ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4793:1: ( ( rule__PrimaryExpression__ValueAssignment_1_1 ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4793:1: ( ( rule__PrimaryExpression__ValueAssignment_1_1 ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4794:1: ( rule__PrimaryExpression__ValueAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExpressionAccess().getValueAssignment_1_1()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4795:1: ( rule__PrimaryExpression__ValueAssignment_1_1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4795:2: rule__PrimaryExpression__ValueAssignment_1_1
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__ValueAssignment_1_1_in_rule__PrimaryExpression__Group_1__1__Impl9605);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4809:1: rule__PrimaryExpression__Group_2__0 : rule__PrimaryExpression__Group_2__0__Impl rule__PrimaryExpression__Group_2__1 ;
    public final void rule__PrimaryExpression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4813:1: ( rule__PrimaryExpression__Group_2__0__Impl rule__PrimaryExpression__Group_2__1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4814:2: rule__PrimaryExpression__Group_2__0__Impl rule__PrimaryExpression__Group_2__1
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__Group_2__0__Impl_in_rule__PrimaryExpression__Group_2__09639);
            rule__PrimaryExpression__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PrimaryExpression__Group_2__1_in_rule__PrimaryExpression__Group_2__09642);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4821:1: rule__PrimaryExpression__Group_2__0__Impl : ( () ) ;
    public final void rule__PrimaryExpression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4825:1: ( ( () ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4826:1: ( () )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4826:1: ( () )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4827:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExpressionAccess().getIntLiteralAction_2_0()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4828:1: ()
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4830:1: 
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4840:1: rule__PrimaryExpression__Group_2__1 : rule__PrimaryExpression__Group_2__1__Impl ;
    public final void rule__PrimaryExpression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4844:1: ( rule__PrimaryExpression__Group_2__1__Impl )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4845:2: rule__PrimaryExpression__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__Group_2__1__Impl_in_rule__PrimaryExpression__Group_2__19700);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4851:1: rule__PrimaryExpression__Group_2__1__Impl : ( ( rule__PrimaryExpression__ValueAssignment_2_1 ) ) ;
    public final void rule__PrimaryExpression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4855:1: ( ( ( rule__PrimaryExpression__ValueAssignment_2_1 ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4856:1: ( ( rule__PrimaryExpression__ValueAssignment_2_1 ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4856:1: ( ( rule__PrimaryExpression__ValueAssignment_2_1 ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4857:1: ( rule__PrimaryExpression__ValueAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExpressionAccess().getValueAssignment_2_1()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4858:1: ( rule__PrimaryExpression__ValueAssignment_2_1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4858:2: rule__PrimaryExpression__ValueAssignment_2_1
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__ValueAssignment_2_1_in_rule__PrimaryExpression__Group_2__1__Impl9727);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4872:1: rule__PrimaryExpression__Group_5__0 : rule__PrimaryExpression__Group_5__0__Impl rule__PrimaryExpression__Group_5__1 ;
    public final void rule__PrimaryExpression__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4876:1: ( rule__PrimaryExpression__Group_5__0__Impl rule__PrimaryExpression__Group_5__1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4877:2: rule__PrimaryExpression__Group_5__0__Impl rule__PrimaryExpression__Group_5__1
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__Group_5__0__Impl_in_rule__PrimaryExpression__Group_5__09761);
            rule__PrimaryExpression__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PrimaryExpression__Group_5__1_in_rule__PrimaryExpression__Group_5__09764);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4884:1: rule__PrimaryExpression__Group_5__0__Impl : ( () ) ;
    public final void rule__PrimaryExpression__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4888:1: ( ( () ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4889:1: ( () )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4889:1: ( () )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4890:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExpressionAccess().getStringLiteralAction_5_0()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4891:1: ()
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4893:1: 
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4903:1: rule__PrimaryExpression__Group_5__1 : rule__PrimaryExpression__Group_5__1__Impl ;
    public final void rule__PrimaryExpression__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4907:1: ( rule__PrimaryExpression__Group_5__1__Impl )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4908:2: rule__PrimaryExpression__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__Group_5__1__Impl_in_rule__PrimaryExpression__Group_5__19822);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4914:1: rule__PrimaryExpression__Group_5__1__Impl : ( ( rule__PrimaryExpression__ValueAssignment_5_1 ) ) ;
    public final void rule__PrimaryExpression__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4918:1: ( ( ( rule__PrimaryExpression__ValueAssignment_5_1 ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4919:1: ( ( rule__PrimaryExpression__ValueAssignment_5_1 ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4919:1: ( ( rule__PrimaryExpression__ValueAssignment_5_1 ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4920:1: ( rule__PrimaryExpression__ValueAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExpressionAccess().getValueAssignment_5_1()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4921:1: ( rule__PrimaryExpression__ValueAssignment_5_1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4921:2: rule__PrimaryExpression__ValueAssignment_5_1
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__ValueAssignment_5_1_in_rule__PrimaryExpression__Group_5__1__Impl9849);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4935:1: rule__ArrayLiteral__Group__0 : rule__ArrayLiteral__Group__0__Impl rule__ArrayLiteral__Group__1 ;
    public final void rule__ArrayLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4939:1: ( rule__ArrayLiteral__Group__0__Impl rule__ArrayLiteral__Group__1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4940:2: rule__ArrayLiteral__Group__0__Impl rule__ArrayLiteral__Group__1
            {
            pushFollow(FOLLOW_rule__ArrayLiteral__Group__0__Impl_in_rule__ArrayLiteral__Group__09883);
            rule__ArrayLiteral__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ArrayLiteral__Group__1_in_rule__ArrayLiteral__Group__09886);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4947:1: rule__ArrayLiteral__Group__0__Impl : ( '[' ) ;
    public final void rule__ArrayLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4951:1: ( ( '[' ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4952:1: ( '[' )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4952:1: ( '[' )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4953:1: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayLiteralAccess().getLeftSquareBracketKeyword_0()); 
            }
            match(input,44,FOLLOW_44_in_rule__ArrayLiteral__Group__0__Impl9914); if (state.failed) return ;
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4966:1: rule__ArrayLiteral__Group__1 : rule__ArrayLiteral__Group__1__Impl rule__ArrayLiteral__Group__2 ;
    public final void rule__ArrayLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4970:1: ( rule__ArrayLiteral__Group__1__Impl rule__ArrayLiteral__Group__2 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4971:2: rule__ArrayLiteral__Group__1__Impl rule__ArrayLiteral__Group__2
            {
            pushFollow(FOLLOW_rule__ArrayLiteral__Group__1__Impl_in_rule__ArrayLiteral__Group__19945);
            rule__ArrayLiteral__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ArrayLiteral__Group__2_in_rule__ArrayLiteral__Group__19948);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4978:1: rule__ArrayLiteral__Group__1__Impl : ( '(' ) ;
    public final void rule__ArrayLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4982:1: ( ( '(' ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4983:1: ( '(' )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4983:1: ( '(' )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4984:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayLiteralAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,21,FOLLOW_21_in_rule__ArrayLiteral__Group__1__Impl9976); if (state.failed) return ;
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:4997:1: rule__ArrayLiteral__Group__2 : rule__ArrayLiteral__Group__2__Impl rule__ArrayLiteral__Group__3 ;
    public final void rule__ArrayLiteral__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5001:1: ( rule__ArrayLiteral__Group__2__Impl rule__ArrayLiteral__Group__3 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5002:2: rule__ArrayLiteral__Group__2__Impl rule__ArrayLiteral__Group__3
            {
            pushFollow(FOLLOW_rule__ArrayLiteral__Group__2__Impl_in_rule__ArrayLiteral__Group__210007);
            rule__ArrayLiteral__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ArrayLiteral__Group__3_in_rule__ArrayLiteral__Group__210010);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5009:1: rule__ArrayLiteral__Group__2__Impl : ( ( rule__ArrayLiteral__ValuesAssignment_2 ) ) ;
    public final void rule__ArrayLiteral__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5013:1: ( ( ( rule__ArrayLiteral__ValuesAssignment_2 ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5014:1: ( ( rule__ArrayLiteral__ValuesAssignment_2 ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5014:1: ( ( rule__ArrayLiteral__ValuesAssignment_2 ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5015:1: ( rule__ArrayLiteral__ValuesAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayLiteralAccess().getValuesAssignment_2()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5016:1: ( rule__ArrayLiteral__ValuesAssignment_2 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5016:2: rule__ArrayLiteral__ValuesAssignment_2
            {
            pushFollow(FOLLOW_rule__ArrayLiteral__ValuesAssignment_2_in_rule__ArrayLiteral__Group__2__Impl10037);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5026:1: rule__ArrayLiteral__Group__3 : rule__ArrayLiteral__Group__3__Impl rule__ArrayLiteral__Group__4 ;
    public final void rule__ArrayLiteral__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5030:1: ( rule__ArrayLiteral__Group__3__Impl rule__ArrayLiteral__Group__4 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5031:2: rule__ArrayLiteral__Group__3__Impl rule__ArrayLiteral__Group__4
            {
            pushFollow(FOLLOW_rule__ArrayLiteral__Group__3__Impl_in_rule__ArrayLiteral__Group__310067);
            rule__ArrayLiteral__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ArrayLiteral__Group__4_in_rule__ArrayLiteral__Group__310070);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5038:1: rule__ArrayLiteral__Group__3__Impl : ( ( rule__ArrayLiteral__Group_3__0 )* ) ;
    public final void rule__ArrayLiteral__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5042:1: ( ( ( rule__ArrayLiteral__Group_3__0 )* ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5043:1: ( ( rule__ArrayLiteral__Group_3__0 )* )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5043:1: ( ( rule__ArrayLiteral__Group_3__0 )* )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5044:1: ( rule__ArrayLiteral__Group_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayLiteralAccess().getGroup_3()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5045:1: ( rule__ArrayLiteral__Group_3__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==29) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5045:2: rule__ArrayLiteral__Group_3__0
            	    {
            	    pushFollow(FOLLOW_rule__ArrayLiteral__Group_3__0_in_rule__ArrayLiteral__Group__3__Impl10097);
            	    rule__ArrayLiteral__Group_3__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop21;
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5055:1: rule__ArrayLiteral__Group__4 : rule__ArrayLiteral__Group__4__Impl ;
    public final void rule__ArrayLiteral__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5059:1: ( rule__ArrayLiteral__Group__4__Impl )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5060:2: rule__ArrayLiteral__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__ArrayLiteral__Group__4__Impl_in_rule__ArrayLiteral__Group__410128);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5066:1: rule__ArrayLiteral__Group__4__Impl : ( ']' ) ;
    public final void rule__ArrayLiteral__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5070:1: ( ( ']' ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5071:1: ( ']' )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5071:1: ( ']' )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5072:1: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayLiteralAccess().getRightSquareBracketKeyword_4()); 
            }
            match(input,45,FOLLOW_45_in_rule__ArrayLiteral__Group__4__Impl10156); if (state.failed) return ;
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5095:1: rule__ArrayLiteral__Group_3__0 : rule__ArrayLiteral__Group_3__0__Impl rule__ArrayLiteral__Group_3__1 ;
    public final void rule__ArrayLiteral__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5099:1: ( rule__ArrayLiteral__Group_3__0__Impl rule__ArrayLiteral__Group_3__1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5100:2: rule__ArrayLiteral__Group_3__0__Impl rule__ArrayLiteral__Group_3__1
            {
            pushFollow(FOLLOW_rule__ArrayLiteral__Group_3__0__Impl_in_rule__ArrayLiteral__Group_3__010197);
            rule__ArrayLiteral__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ArrayLiteral__Group_3__1_in_rule__ArrayLiteral__Group_3__010200);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5107:1: rule__ArrayLiteral__Group_3__0__Impl : ( ',' ) ;
    public final void rule__ArrayLiteral__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5111:1: ( ( ',' ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5112:1: ( ',' )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5112:1: ( ',' )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5113:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayLiteralAccess().getCommaKeyword_3_0()); 
            }
            match(input,29,FOLLOW_29_in_rule__ArrayLiteral__Group_3__0__Impl10228); if (state.failed) return ;
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5126:1: rule__ArrayLiteral__Group_3__1 : rule__ArrayLiteral__Group_3__1__Impl ;
    public final void rule__ArrayLiteral__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5130:1: ( rule__ArrayLiteral__Group_3__1__Impl )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5131:2: rule__ArrayLiteral__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__ArrayLiteral__Group_3__1__Impl_in_rule__ArrayLiteral__Group_3__110259);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5137:1: rule__ArrayLiteral__Group_3__1__Impl : ( ( rule__ArrayLiteral__ValuesAssignment_3_1 ) ) ;
    public final void rule__ArrayLiteral__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5141:1: ( ( ( rule__ArrayLiteral__ValuesAssignment_3_1 ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5142:1: ( ( rule__ArrayLiteral__ValuesAssignment_3_1 ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5142:1: ( ( rule__ArrayLiteral__ValuesAssignment_3_1 ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5143:1: ( rule__ArrayLiteral__ValuesAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayLiteralAccess().getValuesAssignment_3_1()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5144:1: ( rule__ArrayLiteral__ValuesAssignment_3_1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5144:2: rule__ArrayLiteral__ValuesAssignment_3_1
            {
            pushFollow(FOLLOW_rule__ArrayLiteral__ValuesAssignment_3_1_in_rule__ArrayLiteral__Group_3__1__Impl10286);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5158:1: rule__VariableReference__Group__0 : rule__VariableReference__Group__0__Impl rule__VariableReference__Group__1 ;
    public final void rule__VariableReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5162:1: ( rule__VariableReference__Group__0__Impl rule__VariableReference__Group__1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5163:2: rule__VariableReference__Group__0__Impl rule__VariableReference__Group__1
            {
            pushFollow(FOLLOW_rule__VariableReference__Group__0__Impl_in_rule__VariableReference__Group__010320);
            rule__VariableReference__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__VariableReference__Group__1_in_rule__VariableReference__Group__010323);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5170:1: rule__VariableReference__Group__0__Impl : ( ( rule__VariableReference__VariableAssignment_0 ) ) ;
    public final void rule__VariableReference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5174:1: ( ( ( rule__VariableReference__VariableAssignment_0 ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5175:1: ( ( rule__VariableReference__VariableAssignment_0 ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5175:1: ( ( rule__VariableReference__VariableAssignment_0 ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5176:1: ( rule__VariableReference__VariableAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableReferenceAccess().getVariableAssignment_0()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5177:1: ( rule__VariableReference__VariableAssignment_0 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5177:2: rule__VariableReference__VariableAssignment_0
            {
            pushFollow(FOLLOW_rule__VariableReference__VariableAssignment_0_in_rule__VariableReference__Group__0__Impl10350);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5187:1: rule__VariableReference__Group__1 : rule__VariableReference__Group__1__Impl ;
    public final void rule__VariableReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5191:1: ( rule__VariableReference__Group__1__Impl )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5192:2: rule__VariableReference__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__VariableReference__Group__1__Impl_in_rule__VariableReference__Group__110380);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5198:1: rule__VariableReference__Group__1__Impl : ( ( rule__VariableReference__Group_1__0 )* ) ;
    public final void rule__VariableReference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5202:1: ( ( ( rule__VariableReference__Group_1__0 )* ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5203:1: ( ( rule__VariableReference__Group_1__0 )* )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5203:1: ( ( rule__VariableReference__Group_1__0 )* )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5204:1: ( rule__VariableReference__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableReferenceAccess().getGroup_1()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5205:1: ( rule__VariableReference__Group_1__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==44) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5205:2: rule__VariableReference__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__VariableReference__Group_1__0_in_rule__VariableReference__Group__1__Impl10407);
            	    rule__VariableReference__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop22;
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5219:1: rule__VariableReference__Group_1__0 : rule__VariableReference__Group_1__0__Impl rule__VariableReference__Group_1__1 ;
    public final void rule__VariableReference__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5223:1: ( rule__VariableReference__Group_1__0__Impl rule__VariableReference__Group_1__1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5224:2: rule__VariableReference__Group_1__0__Impl rule__VariableReference__Group_1__1
            {
            pushFollow(FOLLOW_rule__VariableReference__Group_1__0__Impl_in_rule__VariableReference__Group_1__010442);
            rule__VariableReference__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__VariableReference__Group_1__1_in_rule__VariableReference__Group_1__010445);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5231:1: rule__VariableReference__Group_1__0__Impl : ( '[' ) ;
    public final void rule__VariableReference__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5235:1: ( ( '[' ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5236:1: ( '[' )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5236:1: ( '[' )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5237:1: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableReferenceAccess().getLeftSquareBracketKeyword_1_0()); 
            }
            match(input,44,FOLLOW_44_in_rule__VariableReference__Group_1__0__Impl10473); if (state.failed) return ;
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5250:1: rule__VariableReference__Group_1__1 : rule__VariableReference__Group_1__1__Impl rule__VariableReference__Group_1__2 ;
    public final void rule__VariableReference__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5254:1: ( rule__VariableReference__Group_1__1__Impl rule__VariableReference__Group_1__2 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5255:2: rule__VariableReference__Group_1__1__Impl rule__VariableReference__Group_1__2
            {
            pushFollow(FOLLOW_rule__VariableReference__Group_1__1__Impl_in_rule__VariableReference__Group_1__110504);
            rule__VariableReference__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__VariableReference__Group_1__2_in_rule__VariableReference__Group_1__110507);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5262:1: rule__VariableReference__Group_1__1__Impl : ( ( rule__VariableReference__DimensionsAssignment_1_1 ) ) ;
    public final void rule__VariableReference__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5266:1: ( ( ( rule__VariableReference__DimensionsAssignment_1_1 ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5267:1: ( ( rule__VariableReference__DimensionsAssignment_1_1 ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5267:1: ( ( rule__VariableReference__DimensionsAssignment_1_1 ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5268:1: ( rule__VariableReference__DimensionsAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableReferenceAccess().getDimensionsAssignment_1_1()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5269:1: ( rule__VariableReference__DimensionsAssignment_1_1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5269:2: rule__VariableReference__DimensionsAssignment_1_1
            {
            pushFollow(FOLLOW_rule__VariableReference__DimensionsAssignment_1_1_in_rule__VariableReference__Group_1__1__Impl10534);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5279:1: rule__VariableReference__Group_1__2 : rule__VariableReference__Group_1__2__Impl ;
    public final void rule__VariableReference__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5283:1: ( rule__VariableReference__Group_1__2__Impl )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5284:2: rule__VariableReference__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__VariableReference__Group_1__2__Impl_in_rule__VariableReference__Group_1__210564);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5290:1: rule__VariableReference__Group_1__2__Impl : ( ']' ) ;
    public final void rule__VariableReference__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5294:1: ( ( ']' ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5295:1: ( ']' )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5295:1: ( ']' )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5296:1: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableReferenceAccess().getRightSquareBracketKeyword_1_2()); 
            }
            match(input,45,FOLLOW_45_in_rule__VariableReference__Group_1__2__Impl10592); if (state.failed) return ;
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5315:1: rule__FunctionCall__Group__0 : rule__FunctionCall__Group__0__Impl rule__FunctionCall__Group__1 ;
    public final void rule__FunctionCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5319:1: ( rule__FunctionCall__Group__0__Impl rule__FunctionCall__Group__1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5320:2: rule__FunctionCall__Group__0__Impl rule__FunctionCall__Group__1
            {
            pushFollow(FOLLOW_rule__FunctionCall__Group__0__Impl_in_rule__FunctionCall__Group__010629);
            rule__FunctionCall__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FunctionCall__Group__1_in_rule__FunctionCall__Group__010632);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5327:1: rule__FunctionCall__Group__0__Impl : ( () ) ;
    public final void rule__FunctionCall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5331:1: ( ( () ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5332:1: ( () )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5332:1: ( () )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5333:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getFunctionCallAction_0()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5334:1: ()
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5336:1: 
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5346:1: rule__FunctionCall__Group__1 : rule__FunctionCall__Group__1__Impl rule__FunctionCall__Group__2 ;
    public final void rule__FunctionCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5350:1: ( rule__FunctionCall__Group__1__Impl rule__FunctionCall__Group__2 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5351:2: rule__FunctionCall__Group__1__Impl rule__FunctionCall__Group__2
            {
            pushFollow(FOLLOW_rule__FunctionCall__Group__1__Impl_in_rule__FunctionCall__Group__110690);
            rule__FunctionCall__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FunctionCall__Group__2_in_rule__FunctionCall__Group__110693);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5358:1: rule__FunctionCall__Group__1__Impl : ( ( rule__FunctionCall__FunctionAssignment_1 ) ) ;
    public final void rule__FunctionCall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5362:1: ( ( ( rule__FunctionCall__FunctionAssignment_1 ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5363:1: ( ( rule__FunctionCall__FunctionAssignment_1 ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5363:1: ( ( rule__FunctionCall__FunctionAssignment_1 ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5364:1: ( rule__FunctionCall__FunctionAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getFunctionAssignment_1()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5365:1: ( rule__FunctionCall__FunctionAssignment_1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5365:2: rule__FunctionCall__FunctionAssignment_1
            {
            pushFollow(FOLLOW_rule__FunctionCall__FunctionAssignment_1_in_rule__FunctionCall__Group__1__Impl10720);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5375:1: rule__FunctionCall__Group__2 : rule__FunctionCall__Group__2__Impl rule__FunctionCall__Group__3 ;
    public final void rule__FunctionCall__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5379:1: ( rule__FunctionCall__Group__2__Impl rule__FunctionCall__Group__3 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5380:2: rule__FunctionCall__Group__2__Impl rule__FunctionCall__Group__3
            {
            pushFollow(FOLLOW_rule__FunctionCall__Group__2__Impl_in_rule__FunctionCall__Group__210750);
            rule__FunctionCall__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FunctionCall__Group__3_in_rule__FunctionCall__Group__210753);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5387:1: rule__FunctionCall__Group__2__Impl : ( '(' ) ;
    public final void rule__FunctionCall__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5391:1: ( ( '(' ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5392:1: ( '(' )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5392:1: ( '(' )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5393:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getLeftParenthesisKeyword_2()); 
            }
            match(input,21,FOLLOW_21_in_rule__FunctionCall__Group__2__Impl10781); if (state.failed) return ;
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5406:1: rule__FunctionCall__Group__3 : rule__FunctionCall__Group__3__Impl rule__FunctionCall__Group__4 ;
    public final void rule__FunctionCall__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5410:1: ( rule__FunctionCall__Group__3__Impl rule__FunctionCall__Group__4 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5411:2: rule__FunctionCall__Group__3__Impl rule__FunctionCall__Group__4
            {
            pushFollow(FOLLOW_rule__FunctionCall__Group__3__Impl_in_rule__FunctionCall__Group__310812);
            rule__FunctionCall__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FunctionCall__Group__4_in_rule__FunctionCall__Group__310815);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5418:1: rule__FunctionCall__Group__3__Impl : ( ( rule__FunctionCall__ArgsAssignment_3 ) ) ;
    public final void rule__FunctionCall__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5422:1: ( ( ( rule__FunctionCall__ArgsAssignment_3 ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5423:1: ( ( rule__FunctionCall__ArgsAssignment_3 ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5423:1: ( ( rule__FunctionCall__ArgsAssignment_3 ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5424:1: ( rule__FunctionCall__ArgsAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getArgsAssignment_3()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5425:1: ( rule__FunctionCall__ArgsAssignment_3 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5425:2: rule__FunctionCall__ArgsAssignment_3
            {
            pushFollow(FOLLOW_rule__FunctionCall__ArgsAssignment_3_in_rule__FunctionCall__Group__3__Impl10842);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5435:1: rule__FunctionCall__Group__4 : rule__FunctionCall__Group__4__Impl rule__FunctionCall__Group__5 ;
    public final void rule__FunctionCall__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5439:1: ( rule__FunctionCall__Group__4__Impl rule__FunctionCall__Group__5 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5440:2: rule__FunctionCall__Group__4__Impl rule__FunctionCall__Group__5
            {
            pushFollow(FOLLOW_rule__FunctionCall__Group__4__Impl_in_rule__FunctionCall__Group__410872);
            rule__FunctionCall__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FunctionCall__Group__5_in_rule__FunctionCall__Group__410875);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5447:1: rule__FunctionCall__Group__4__Impl : ( ( rule__FunctionCall__Group_4__0 )* ) ;
    public final void rule__FunctionCall__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5451:1: ( ( ( rule__FunctionCall__Group_4__0 )* ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5452:1: ( ( rule__FunctionCall__Group_4__0 )* )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5452:1: ( ( rule__FunctionCall__Group_4__0 )* )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5453:1: ( rule__FunctionCall__Group_4__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getGroup_4()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5454:1: ( rule__FunctionCall__Group_4__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==29) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5454:2: rule__FunctionCall__Group_4__0
            	    {
            	    pushFollow(FOLLOW_rule__FunctionCall__Group_4__0_in_rule__FunctionCall__Group__4__Impl10902);
            	    rule__FunctionCall__Group_4__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop23;
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5464:1: rule__FunctionCall__Group__5 : rule__FunctionCall__Group__5__Impl ;
    public final void rule__FunctionCall__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5468:1: ( rule__FunctionCall__Group__5__Impl )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5469:2: rule__FunctionCall__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__FunctionCall__Group__5__Impl_in_rule__FunctionCall__Group__510933);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5475:1: rule__FunctionCall__Group__5__Impl : ( ')' ) ;
    public final void rule__FunctionCall__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5479:1: ( ( ')' ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5480:1: ( ')' )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5480:1: ( ')' )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5481:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getRightParenthesisKeyword_5()); 
            }
            match(input,22,FOLLOW_22_in_rule__FunctionCall__Group__5__Impl10961); if (state.failed) return ;
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5506:1: rule__FunctionCall__Group_4__0 : rule__FunctionCall__Group_4__0__Impl rule__FunctionCall__Group_4__1 ;
    public final void rule__FunctionCall__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5510:1: ( rule__FunctionCall__Group_4__0__Impl rule__FunctionCall__Group_4__1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5511:2: rule__FunctionCall__Group_4__0__Impl rule__FunctionCall__Group_4__1
            {
            pushFollow(FOLLOW_rule__FunctionCall__Group_4__0__Impl_in_rule__FunctionCall__Group_4__011004);
            rule__FunctionCall__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FunctionCall__Group_4__1_in_rule__FunctionCall__Group_4__011007);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5518:1: rule__FunctionCall__Group_4__0__Impl : ( ',' ) ;
    public final void rule__FunctionCall__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5522:1: ( ( ',' ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5523:1: ( ',' )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5523:1: ( ',' )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5524:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getCommaKeyword_4_0()); 
            }
            match(input,29,FOLLOW_29_in_rule__FunctionCall__Group_4__0__Impl11035); if (state.failed) return ;
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5537:1: rule__FunctionCall__Group_4__1 : rule__FunctionCall__Group_4__1__Impl ;
    public final void rule__FunctionCall__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5541:1: ( rule__FunctionCall__Group_4__1__Impl )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5542:2: rule__FunctionCall__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__FunctionCall__Group_4__1__Impl_in_rule__FunctionCall__Group_4__111066);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5548:1: rule__FunctionCall__Group_4__1__Impl : ( ( rule__FunctionCall__ArgsAssignment_4_1 ) ) ;
    public final void rule__FunctionCall__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5552:1: ( ( ( rule__FunctionCall__ArgsAssignment_4_1 ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5553:1: ( ( rule__FunctionCall__ArgsAssignment_4_1 ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5553:1: ( ( rule__FunctionCall__ArgsAssignment_4_1 ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5554:1: ( rule__FunctionCall__ArgsAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getArgsAssignment_4_1()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5555:1: ( rule__FunctionCall__ArgsAssignment_4_1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5555:2: rule__FunctionCall__ArgsAssignment_4_1
            {
            pushFollow(FOLLOW_rule__FunctionCall__ArgsAssignment_4_1_in_rule__FunctionCall__Group_4__1__Impl11093);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5569:1: rule__Include__Group__0 : rule__Include__Group__0__Impl rule__Include__Group__1 ;
    public final void rule__Include__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5573:1: ( rule__Include__Group__0__Impl rule__Include__Group__1 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5574:2: rule__Include__Group__0__Impl rule__Include__Group__1
            {
            pushFollow(FOLLOW_rule__Include__Group__0__Impl_in_rule__Include__Group__011127);
            rule__Include__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Include__Group__1_in_rule__Include__Group__011130);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5581:1: rule__Include__Group__0__Impl : ( 'include' ) ;
    public final void rule__Include__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5585:1: ( ( 'include' ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5586:1: ( 'include' )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5586:1: ( 'include' )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5587:1: 'include'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIncludeAccess().getIncludeKeyword_0()); 
            }
            match(input,46,FOLLOW_46_in_rule__Include__Group__0__Impl11158); if (state.failed) return ;
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5600:1: rule__Include__Group__1 : rule__Include__Group__1__Impl rule__Include__Group__2 ;
    public final void rule__Include__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5604:1: ( rule__Include__Group__1__Impl rule__Include__Group__2 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5605:2: rule__Include__Group__1__Impl rule__Include__Group__2
            {
            pushFollow(FOLLOW_rule__Include__Group__1__Impl_in_rule__Include__Group__111189);
            rule__Include__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Include__Group__2_in_rule__Include__Group__111192);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5612:1: rule__Include__Group__1__Impl : ( '(' ) ;
    public final void rule__Include__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5616:1: ( ( '(' ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5617:1: ( '(' )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5617:1: ( '(' )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5618:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIncludeAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,21,FOLLOW_21_in_rule__Include__Group__1__Impl11220); if (state.failed) return ;
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5631:1: rule__Include__Group__2 : rule__Include__Group__2__Impl rule__Include__Group__3 ;
    public final void rule__Include__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5635:1: ( rule__Include__Group__2__Impl rule__Include__Group__3 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5636:2: rule__Include__Group__2__Impl rule__Include__Group__3
            {
            pushFollow(FOLLOW_rule__Include__Group__2__Impl_in_rule__Include__Group__211251);
            rule__Include__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Include__Group__3_in_rule__Include__Group__211254);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5643:1: rule__Include__Group__2__Impl : ( '\"' ) ;
    public final void rule__Include__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5647:1: ( ( '\"' ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5648:1: ( '\"' )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5648:1: ( '\"' )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5649:1: '\"'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIncludeAccess().getQuotationMarkKeyword_2()); 
            }
            match(input,47,FOLLOW_47_in_rule__Include__Group__2__Impl11282); if (state.failed) return ;
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5662:1: rule__Include__Group__3 : rule__Include__Group__3__Impl rule__Include__Group__4 ;
    public final void rule__Include__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5666:1: ( rule__Include__Group__3__Impl rule__Include__Group__4 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5667:2: rule__Include__Group__3__Impl rule__Include__Group__4
            {
            pushFollow(FOLLOW_rule__Include__Group__3__Impl_in_rule__Include__Group__311313);
            rule__Include__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Include__Group__4_in_rule__Include__Group__311316);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5674:1: rule__Include__Group__3__Impl : ( RULE_ID ) ;
    public final void rule__Include__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5678:1: ( ( RULE_ID ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5679:1: ( RULE_ID )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5679:1: ( RULE_ID )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5680:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIncludeAccess().getIDTerminalRuleCall_3()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Include__Group__3__Impl11343); if (state.failed) return ;
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5691:1: rule__Include__Group__4 : rule__Include__Group__4__Impl rule__Include__Group__5 ;
    public final void rule__Include__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5695:1: ( rule__Include__Group__4__Impl rule__Include__Group__5 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5696:2: rule__Include__Group__4__Impl rule__Include__Group__5
            {
            pushFollow(FOLLOW_rule__Include__Group__4__Impl_in_rule__Include__Group__411372);
            rule__Include__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Include__Group__5_in_rule__Include__Group__411375);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5703:1: rule__Include__Group__4__Impl : ( '\"' ) ;
    public final void rule__Include__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5707:1: ( ( '\"' ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5708:1: ( '\"' )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5708:1: ( '\"' )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5709:1: '\"'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIncludeAccess().getQuotationMarkKeyword_4()); 
            }
            match(input,47,FOLLOW_47_in_rule__Include__Group__4__Impl11403); if (state.failed) return ;
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5722:1: rule__Include__Group__5 : rule__Include__Group__5__Impl rule__Include__Group__6 ;
    public final void rule__Include__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5726:1: ( rule__Include__Group__5__Impl rule__Include__Group__6 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5727:2: rule__Include__Group__5__Impl rule__Include__Group__6
            {
            pushFollow(FOLLOW_rule__Include__Group__5__Impl_in_rule__Include__Group__511434);
            rule__Include__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Include__Group__6_in_rule__Include__Group__511437);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5734:1: rule__Include__Group__5__Impl : ( ')' ) ;
    public final void rule__Include__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5738:1: ( ( ')' ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5739:1: ( ')' )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5739:1: ( ')' )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5740:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIncludeAccess().getRightParenthesisKeyword_5()); 
            }
            match(input,22,FOLLOW_22_in_rule__Include__Group__5__Impl11465); if (state.failed) return ;
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5753:1: rule__Include__Group__6 : rule__Include__Group__6__Impl ;
    public final void rule__Include__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5757:1: ( rule__Include__Group__6__Impl )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5758:2: rule__Include__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Include__Group__6__Impl_in_rule__Include__Group__611496);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5764:1: rule__Include__Group__6__Impl : ( ';' ) ;
    public final void rule__Include__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5768:1: ( ( ';' ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5769:1: ( ';' )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5769:1: ( ';' )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5770:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIncludeAccess().getSemicolonKeyword_6()); 
            }
            match(input,16,FOLLOW_16_in_rule__Include__Group__6__Impl11524); if (state.failed) return ;
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


    // $ANTLR start "rule__Model__StatementsAssignment"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5798:1: rule__Model__StatementsAssignment : ( ruleStatement ) ;
    public final void rule__Model__StatementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5802:1: ( ( ruleStatement ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5803:1: ( ruleStatement )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5803:1: ( ruleStatement )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5804:1: ruleStatement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getStatementsStatementParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleStatement_in_rule__Model__StatementsAssignment11574);
            ruleStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getStatementsStatementParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__StatementsAssignment"


    // $ANTLR start "rule__StatementBlock__StatementsAssignment_2"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5813:1: rule__StatementBlock__StatementsAssignment_2 : ( ruleStatement ) ;
    public final void rule__StatementBlock__StatementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5817:1: ( ( ruleStatement ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5818:1: ( ruleStatement )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5818:1: ( ruleStatement )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5819:1: ruleStatement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementBlockAccess().getStatementsStatementParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleStatement_in_rule__StatementBlock__StatementsAssignment_211605);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5828:1: rule__Affectation__VariableAssignment_0 : ( ruleVariableReference ) ;
    public final void rule__Affectation__VariableAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5832:1: ( ( ruleVariableReference ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5833:1: ( ruleVariableReference )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5833:1: ( ruleVariableReference )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5834:1: ruleVariableReference
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAffectationAccess().getVariableVariableReferenceParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleVariableReference_in_rule__Affectation__VariableAssignment_011636);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5843:1: rule__Affectation__ValueAssignment_2 : ( ruleExpression ) ;
    public final void rule__Affectation__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5847:1: ( ( ruleExpression ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5848:1: ( ruleExpression )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5848:1: ( ruleExpression )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5849:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAffectationAccess().getValueExpressionParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__Affectation__ValueAssignment_211667);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5858:1: rule__If__ConditionAssignment_2 : ( ruleExpression ) ;
    public final void rule__If__ConditionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5862:1: ( ( ruleExpression ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5863:1: ( ruleExpression )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5863:1: ( ruleExpression )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5864:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getConditionExpressionParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__If__ConditionAssignment_211698);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5873:1: rule__If__ThenAssignment_4 : ( ruleStatement ) ;
    public final void rule__If__ThenAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5877:1: ( ( ruleStatement ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5878:1: ( ruleStatement )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5878:1: ( ruleStatement )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5879:1: ruleStatement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getThenStatementParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_ruleStatement_in_rule__If__ThenAssignment_411729);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5888:1: rule__If__ElseAssignment_5_1 : ( ruleStatement ) ;
    public final void rule__If__ElseAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5892:1: ( ( ruleStatement ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5893:1: ( ruleStatement )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5893:1: ( ruleStatement )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5894:1: ruleStatement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getElseStatementParserRuleCall_5_1_0()); 
            }
            pushFollow(FOLLOW_ruleStatement_in_rule__If__ElseAssignment_5_111760);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5903:1: rule__While__ConditionAssignment_2 : ( ruleExpression ) ;
    public final void rule__While__ConditionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5907:1: ( ( ruleExpression ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5908:1: ( ruleExpression )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5908:1: ( ruleExpression )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5909:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileAccess().getConditionExpressionParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__While__ConditionAssignment_211791);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5918:1: rule__While__StatementAssignment_4 : ( ruleStatement ) ;
    public final void rule__While__StatementAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5922:1: ( ( ruleStatement ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5923:1: ( ruleStatement )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5923:1: ( ruleStatement )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5924:1: ruleStatement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileAccess().getStatementStatementParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_ruleStatement_in_rule__While__StatementAssignment_411822);
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


    // $ANTLR start "rule__For__IteratorAssignment_1"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5933:1: rule__For__IteratorAssignment_1 : ( ( rule__For__IteratorAlternatives_1_0 ) ) ;
    public final void rule__For__IteratorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5937:1: ( ( ( rule__For__IteratorAlternatives_1_0 ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5938:1: ( ( rule__For__IteratorAlternatives_1_0 ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5938:1: ( ( rule__For__IteratorAlternatives_1_0 ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5939:1: ( rule__For__IteratorAlternatives_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForAccess().getIteratorAlternatives_1_0()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5940:1: ( rule__For__IteratorAlternatives_1_0 )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5940:2: rule__For__IteratorAlternatives_1_0
            {
            pushFollow(FOLLOW_rule__For__IteratorAlternatives_1_0_in_rule__For__IteratorAssignment_111853);
            rule__For__IteratorAlternatives_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getForAccess().getIteratorAlternatives_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__For__IteratorAssignment_1"


    // $ANTLR start "rule__For__StatementAssignment_2"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5949:1: rule__For__StatementAssignment_2 : ( ruleStatement ) ;
    public final void rule__For__StatementAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5953:1: ( ( ruleStatement ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5954:1: ( ruleStatement )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5954:1: ( ruleStatement )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5955:1: ruleStatement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForAccess().getStatementStatementParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleStatement_in_rule__For__StatementAssignment_211886);
            ruleStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForAccess().getStatementStatementParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__For__StatementAssignment_2"


    // $ANTLR start "rule__EachKeyIterator__KeyAssignment_1"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5964:1: rule__EachKeyIterator__KeyAssignment_1 : ( ruleLocalDeclaration ) ;
    public final void rule__EachKeyIterator__KeyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5968:1: ( ( ruleLocalDeclaration ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5969:1: ( ruleLocalDeclaration )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5969:1: ( ruleLocalDeclaration )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5970:1: ruleLocalDeclaration
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEachKeyIteratorAccess().getKeyLocalDeclarationParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleLocalDeclaration_in_rule__EachKeyIterator__KeyAssignment_111917);
            ruleLocalDeclaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEachKeyIteratorAccess().getKeyLocalDeclarationParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EachKeyIterator__KeyAssignment_1"


    // $ANTLR start "rule__EachKeyIterator__ValueAssignment_3"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5979:1: rule__EachKeyIterator__ValueAssignment_3 : ( ruleLocalDeclaration ) ;
    public final void rule__EachKeyIterator__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5983:1: ( ( ruleLocalDeclaration ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5984:1: ( ruleLocalDeclaration )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5984:1: ( ruleLocalDeclaration )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5985:1: ruleLocalDeclaration
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEachKeyIteratorAccess().getValueLocalDeclarationParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleLocalDeclaration_in_rule__EachKeyIterator__ValueAssignment_311948);
            ruleLocalDeclaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEachKeyIteratorAccess().getValueLocalDeclarationParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EachKeyIterator__ValueAssignment_3"


    // $ANTLR start "rule__EachKeyIterator__ArrayAssignment_5"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5994:1: rule__EachKeyIterator__ArrayAssignment_5 : ( ruleExpression ) ;
    public final void rule__EachKeyIterator__ArrayAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5998:1: ( ( ruleExpression ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5999:1: ( ruleExpression )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:5999:1: ( ruleExpression )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6000:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEachKeyIteratorAccess().getArrayExpressionParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__EachKeyIterator__ArrayAssignment_511979);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEachKeyIteratorAccess().getArrayExpressionParserRuleCall_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EachKeyIterator__ArrayAssignment_5"


    // $ANTLR start "rule__EachValueIterator__ValueAssignment_1"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6009:1: rule__EachValueIterator__ValueAssignment_1 : ( ruleLocalDeclaration ) ;
    public final void rule__EachValueIterator__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6013:1: ( ( ruleLocalDeclaration ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6014:1: ( ruleLocalDeclaration )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6014:1: ( ruleLocalDeclaration )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6015:1: ruleLocalDeclaration
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEachValueIteratorAccess().getValueLocalDeclarationParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleLocalDeclaration_in_rule__EachValueIterator__ValueAssignment_112010);
            ruleLocalDeclaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEachValueIteratorAccess().getValueLocalDeclarationParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EachValueIterator__ValueAssignment_1"


    // $ANTLR start "rule__EachValueIterator__ArrayAssignment_3"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6024:1: rule__EachValueIterator__ArrayAssignment_3 : ( ruleExpression ) ;
    public final void rule__EachValueIterator__ArrayAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6028:1: ( ( ruleExpression ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6029:1: ( ruleExpression )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6029:1: ( ruleExpression )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6030:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEachValueIteratorAccess().getArrayExpressionParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__EachValueIterator__ArrayAssignment_312041);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEachValueIteratorAccess().getArrayExpressionParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EachValueIterator__ArrayAssignment_3"


    // $ANTLR start "rule__VariableIterator__InitializationAssignment_1"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6039:1: rule__VariableIterator__InitializationAssignment_1 : ( ruleAffectation ) ;
    public final void rule__VariableIterator__InitializationAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6043:1: ( ( ruleAffectation ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6044:1: ( ruleAffectation )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6044:1: ( ruleAffectation )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6045:1: ruleAffectation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableIteratorAccess().getInitializationAffectationParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleAffectation_in_rule__VariableIterator__InitializationAssignment_112072);
            ruleAffectation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableIteratorAccess().getInitializationAffectationParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableIterator__InitializationAssignment_1"


    // $ANTLR start "rule__VariableIterator__ConditionAssignment_3"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6054:1: rule__VariableIterator__ConditionAssignment_3 : ( ruleExpression ) ;
    public final void rule__VariableIterator__ConditionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6058:1: ( ( ruleExpression ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6059:1: ( ruleExpression )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6059:1: ( ruleExpression )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6060:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableIteratorAccess().getConditionExpressionParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__VariableIterator__ConditionAssignment_312103);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableIteratorAccess().getConditionExpressionParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableIterator__ConditionAssignment_3"


    // $ANTLR start "rule__VariableIterator__IncrementAssignment_5"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6069:1: rule__VariableIterator__IncrementAssignment_5 : ( ruleExpression ) ;
    public final void rule__VariableIterator__IncrementAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6073:1: ( ( ruleExpression ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6074:1: ( ruleExpression )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6074:1: ( ruleExpression )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6075:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableIteratorAccess().getIncrementExpressionParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__VariableIterator__IncrementAssignment_512134);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableIteratorAccess().getIncrementExpressionParserRuleCall_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableIterator__IncrementAssignment_5"


    // $ANTLR start "rule__FunctionDeclaration__NameAssignment_1"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6084:1: rule__FunctionDeclaration__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__FunctionDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6088:1: ( ( RULE_ID ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6089:1: ( RULE_ID )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6089:1: ( RULE_ID )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6090:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FunctionDeclaration__NameAssignment_112165); if (state.failed) return ;
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6099:1: rule__FunctionDeclaration__ParameterAssignment_3_0 : ( ruleParameterDeclaration ) ;
    public final void rule__FunctionDeclaration__ParameterAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6103:1: ( ( ruleParameterDeclaration ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6104:1: ( ruleParameterDeclaration )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6104:1: ( ruleParameterDeclaration )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6105:1: ruleParameterDeclaration
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionDeclarationAccess().getParameterParameterDeclarationParserRuleCall_3_0_0()); 
            }
            pushFollow(FOLLOW_ruleParameterDeclaration_in_rule__FunctionDeclaration__ParameterAssignment_3_012196);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6114:1: rule__FunctionDeclaration__ParameterAssignment_3_1_1 : ( ruleParameterDeclaration ) ;
    public final void rule__FunctionDeclaration__ParameterAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6118:1: ( ( ruleParameterDeclaration ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6119:1: ( ruleParameterDeclaration )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6119:1: ( ruleParameterDeclaration )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6120:1: ruleParameterDeclaration
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionDeclarationAccess().getParameterParameterDeclarationParserRuleCall_3_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleParameterDeclaration_in_rule__FunctionDeclaration__ParameterAssignment_3_1_112227);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6129:1: rule__ParameterDeclaration__ByAdressAssignment_0 : ( ( '@' ) ) ;
    public final void rule__ParameterDeclaration__ByAdressAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6133:1: ( ( ( '@' ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6134:1: ( ( '@' ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6134:1: ( ( '@' ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6135:1: ( '@' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterDeclarationAccess().getByAdressCommercialAtKeyword_0_0()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6136:1: ( '@' )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6137:1: '@'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterDeclarationAccess().getByAdressCommercialAtKeyword_0_0()); 
            }
            match(input,48,FOLLOW_48_in_rule__ParameterDeclaration__ByAdressAssignment_012263); if (state.failed) return ;
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6152:1: rule__ParameterDeclaration__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ParameterDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6156:1: ( ( RULE_ID ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6157:1: ( RULE_ID )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6157:1: ( RULE_ID )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6158:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ParameterDeclaration__NameAssignment_112302); if (state.failed) return ;
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


    // $ANTLR start "rule__LocalDeclaration__NameAssignment_1"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6167:1: rule__LocalDeclaration__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__LocalDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6171:1: ( ( RULE_ID ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6172:1: ( RULE_ID )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6172:1: ( RULE_ID )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6173:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__LocalDeclaration__NameAssignment_112333); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocalDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalDeclaration__NameAssignment_1"


    // $ANTLR start "rule__LocalDeclaration__ValueAssignment_2"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6182:1: rule__LocalDeclaration__ValueAssignment_2 : ( ruleExpression ) ;
    public final void rule__LocalDeclaration__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6186:1: ( ( ruleExpression ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6187:1: ( ruleExpression )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6187:1: ( ruleExpression )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6188:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalDeclarationAccess().getValueExpressionParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__LocalDeclaration__ValueAssignment_212364);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocalDeclarationAccess().getValueExpressionParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalDeclaration__ValueAssignment_2"


    // $ANTLR start "rule__GlobalDeclaration__NameAssignment_1"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6197:1: rule__GlobalDeclaration__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__GlobalDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6201:1: ( ( RULE_ID ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6202:1: ( RULE_ID )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6202:1: ( RULE_ID )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6203:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGlobalDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__GlobalDeclaration__NameAssignment_112395); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGlobalDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalDeclaration__NameAssignment_1"


    // $ANTLR start "rule__GlobalDeclaration__ValueAssignment_2"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6212:1: rule__GlobalDeclaration__ValueAssignment_2 : ( ruleExpression ) ;
    public final void rule__GlobalDeclaration__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6216:1: ( ( ruleExpression ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6217:1: ( ruleExpression )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6217:1: ( ruleExpression )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6218:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGlobalDeclarationAccess().getValueExpressionParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__GlobalDeclaration__ValueAssignment_212426);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGlobalDeclarationAccess().getValueExpressionParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalDeclaration__ValueAssignment_2"


    // $ANTLR start "rule__Comparison__RightAssignment_1_1"
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6227:1: rule__Comparison__RightAssignment_1_1 : ( ruleOr ) ;
    public final void rule__Comparison__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6231:1: ( ( ruleOr ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6232:1: ( ruleOr )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6232:1: ( ruleOr )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6233:1: ruleOr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getRightOrParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleOr_in_rule__Comparison__RightAssignment_1_112457);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6242:1: rule__Or__RightAssignment_1_1 : ( ruleAnd ) ;
    public final void rule__Or__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6246:1: ( ( ruleAnd ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6247:1: ( ruleAnd )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6247:1: ( ruleAnd )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6248:1: ruleAnd
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAccess().getRightAndParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleAnd_in_rule__Or__RightAssignment_1_112488);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6257:1: rule__And__RightAssignment_1_1 : ( ruleAddition ) ;
    public final void rule__And__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6261:1: ( ( ruleAddition ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6262:1: ( ruleAddition )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6262:1: ( ruleAddition )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6263:1: ruleAddition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndAccess().getRightAdditionParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleAddition_in_rule__And__RightAssignment_1_112519);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6272:1: rule__Addition__RightAssignment_1_1 : ( ruleMultiplication ) ;
    public final void rule__Addition__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6276:1: ( ( ruleMultiplication ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6277:1: ( ruleMultiplication )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6277:1: ( ruleMultiplication )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6278:1: ruleMultiplication
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getRightMultiplicationParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleMultiplication_in_rule__Addition__RightAssignment_1_112550);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6287:1: rule__Multiplication__RightAssignment_1_1 : ( rulePrimaryExpression ) ;
    public final void rule__Multiplication__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6291:1: ( ( rulePrimaryExpression ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6292:1: ( rulePrimaryExpression )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6292:1: ( rulePrimaryExpression )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6293:1: rulePrimaryExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getRightPrimaryExpressionParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_rulePrimaryExpression_in_rule__Multiplication__RightAssignment_1_112581);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6302:1: rule__PrimaryExpression__ValueAssignment_1_1 : ( RULE_REAL ) ;
    public final void rule__PrimaryExpression__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6306:1: ( ( RULE_REAL ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6307:1: ( RULE_REAL )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6307:1: ( RULE_REAL )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6308:1: RULE_REAL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExpressionAccess().getValueREALTerminalRuleCall_1_1_0()); 
            }
            match(input,RULE_REAL,FOLLOW_RULE_REAL_in_rule__PrimaryExpression__ValueAssignment_1_112612); if (state.failed) return ;
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6317:1: rule__PrimaryExpression__ValueAssignment_2_1 : ( RULE_INT ) ;
    public final void rule__PrimaryExpression__ValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6321:1: ( ( RULE_INT ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6322:1: ( RULE_INT )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6322:1: ( RULE_INT )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6323:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExpressionAccess().getValueINTTerminalRuleCall_2_1_0()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__PrimaryExpression__ValueAssignment_2_112643); if (state.failed) return ;
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6332:1: rule__PrimaryExpression__ValueAssignment_5_1 : ( RULE_STRING ) ;
    public final void rule__PrimaryExpression__ValueAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6336:1: ( ( RULE_STRING ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6337:1: ( RULE_STRING )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6337:1: ( RULE_STRING )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6338:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExpressionAccess().getValueSTRINGTerminalRuleCall_5_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__PrimaryExpression__ValueAssignment_5_112674); if (state.failed) return ;
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6347:1: rule__ArrayLiteral__ValuesAssignment_2 : ( ruleExpression ) ;
    public final void rule__ArrayLiteral__ValuesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6351:1: ( ( ruleExpression ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6352:1: ( ruleExpression )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6352:1: ( ruleExpression )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6353:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayLiteralAccess().getValuesExpressionParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__ArrayLiteral__ValuesAssignment_212705);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6362:1: rule__ArrayLiteral__ValuesAssignment_3_1 : ( ruleExpression ) ;
    public final void rule__ArrayLiteral__ValuesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6366:1: ( ( ruleExpression ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6367:1: ( ruleExpression )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6367:1: ( ruleExpression )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6368:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayLiteralAccess().getValuesExpressionParserRuleCall_3_1_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__ArrayLiteral__ValuesAssignment_3_112736);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6377:1: rule__VariableReference__VariableAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__VariableReference__VariableAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6381:1: ( ( ( RULE_ID ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6382:1: ( ( RULE_ID ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6382:1: ( ( RULE_ID ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6383:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableReferenceAccess().getVariableVariableDeclarationCrossReference_0_0()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6384:1: ( RULE_ID )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6385:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableReferenceAccess().getVariableVariableDeclarationIDTerminalRuleCall_0_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__VariableReference__VariableAssignment_012771); if (state.failed) return ;
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6396:1: rule__VariableReference__DimensionsAssignment_1_1 : ( ruleExpression ) ;
    public final void rule__VariableReference__DimensionsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6400:1: ( ( ruleExpression ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6401:1: ( ruleExpression )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6401:1: ( ruleExpression )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6402:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableReferenceAccess().getDimensionsExpressionParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__VariableReference__DimensionsAssignment_1_112806);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6411:1: rule__FunctionCall__FunctionAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__FunctionCall__FunctionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6415:1: ( ( ( RULE_ID ) ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6416:1: ( ( RULE_ID ) )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6416:1: ( ( RULE_ID ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6417:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getFunctionFunctionDeclarationCrossReference_1_0()); 
            }
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6418:1: ( RULE_ID )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6419:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getFunctionFunctionDeclarationIDTerminalRuleCall_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FunctionCall__FunctionAssignment_112841); if (state.failed) return ;
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6430:1: rule__FunctionCall__ArgsAssignment_3 : ( ruleExpression ) ;
    public final void rule__FunctionCall__ArgsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6434:1: ( ( ruleExpression ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6435:1: ( ruleExpression )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6435:1: ( ruleExpression )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6436:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getArgsExpressionParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__FunctionCall__ArgsAssignment_312876);
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
    // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6445:1: rule__FunctionCall__ArgsAssignment_4_1 : ( ruleExpression ) ;
    public final void rule__FunctionCall__ArgsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6449:1: ( ( ruleExpression ) )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6450:1: ( ruleExpression )
            {
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6450:1: ( ruleExpression )
            // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:6451:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getArgsExpressionParserRuleCall_4_1_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__FunctionCall__ArgsAssignment_4_112907);
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

    // $ANTLR start synpred11_InternalLeek
    public final void synpred11_InternalLeek_fragment() throws RecognitionException {   
        // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:838:1: ( ( ruleEachKeyIterator ) )
        // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:838:1: ( ruleEachKeyIterator )
        {
        // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:838:1: ( ruleEachKeyIterator )
        // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:839:1: ruleEachKeyIterator
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getForAccess().getIteratorEachKeyIteratorParserRuleCall_1_0_0()); 
        }
        pushFollow(FOLLOW_ruleEachKeyIterator_in_synpred11_InternalLeek1765);
        ruleEachKeyIterator();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred11_InternalLeek

    // $ANTLR start synpred12_InternalLeek
    public final void synpred12_InternalLeek_fragment() throws RecognitionException {   
        // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:844:6: ( ( ruleEachValueIterator ) )
        // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:844:6: ( ruleEachValueIterator )
        {
        // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:844:6: ( ruleEachValueIterator )
        // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:845:1: ruleEachValueIterator
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getForAccess().getIteratorEachValueIteratorParserRuleCall_1_0_1()); 
        }
        pushFollow(FOLLOW_ruleEachValueIterator_in_synpred12_InternalLeek1782);
        ruleEachValueIterator();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred12_InternalLeek

    // $ANTLR start synpred31_InternalLeek
    public final void synpred31_InternalLeek_fragment() throws RecognitionException {   
        // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1588:2: ( rule__If__Group_5__0 )
        // ../org.processus.ecleek.ui/src-gen/org/processus/ecleek/ui/contentassist/antlr/internal/InternalLeek.g:1588:2: rule__If__Group_5__0
        {
        pushFollow(FOLLOW_rule__If__Group_5__0_in_synpred31_InternalLeek3352);
        rule__If__Group_5__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred31_InternalLeek

    // Delegated rules

    public final boolean synpred12_InternalLeek() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred12_InternalLeek_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred11_InternalLeek() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred11_InternalLeek_fragment(); // can never throw exception
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
            "\1\5\14\uffff\1\11\2\uffff\1\10\3\uffff\1\7\1\6\2\uffff\1\4\1\uffff\1\3\1\2\16\uffff\1\1",
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
            return "763:1: rule__Statement__Alternatives : ( ( ruleInclude ) | ( ruleGlobalDeclaration ) | ( ruleLocalDeclaration ) | ( ruleFunctionDeclaration ) | ( ( rule__Statement__Group_4__0 ) ) | ( ruleFor ) | ( ruleWhile ) | ( ruleIf ) | ( ( rule__Statement__Group_8__0 ) ) | ( ruleStatementBlock ) );";
        }
    }
 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel67 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel74 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__StatementsAssignment_in_ruleModel100 = new BitSet(new long[]{0x00004000D3120012L});
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
    public static final BitSet FOLLOW_ruleEachKeyIterator_in_entryRuleEachKeyIterator488 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEachKeyIterator495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EachKeyIterator__Group__0_in_ruleEachKeyIterator521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEachValueIterator_in_entryRuleEachValueIterator548 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEachValueIterator555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EachValueIterator__Group__0_in_ruleEachValueIterator581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableIterator_in_entryRuleVariableIterator608 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableIterator615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableIterator__Group__0_in_ruleVariableIterator641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionDeclaration_in_entryRuleFunctionDeclaration668 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionDeclaration675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__Group__0_in_ruleFunctionDeclaration701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterDeclaration_in_entryRuleParameterDeclaration728 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameterDeclaration735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterDeclaration__Group__0_in_ruleParameterDeclaration761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocalDeclaration_in_entryRuleLocalDeclaration790 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLocalDeclaration797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LocalDeclaration__Group__0_in_ruleLocalDeclaration823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGlobalDeclaration_in_entryRuleGlobalDeclaration850 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGlobalDeclaration857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GlobalDeclaration__Group__0_in_ruleGlobalDeclaration883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression910 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparison_in_ruleExpression943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparison_in_entryRuleComparison969 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComparison976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group__0_in_ruleComparison1002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOr_in_entryRuleOr1029 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOr1036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Or__Group__0_in_ruleOr1062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnd_in_entryRuleAnd1089 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnd1096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__And__Group__0_in_ruleAnd1122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddition_in_entryRuleAddition1149 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAddition1156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group__0_in_ruleAddition1182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplication_in_entryRuleMultiplication1209 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiplication1216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group__0_in_ruleMultiplication1242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression1269 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimaryExpression1276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Alternatives_in_rulePrimaryExpression1302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayLiteral_in_entryRuleArrayLiteral1329 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArrayLiteral1336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayLiteral__Group__0_in_ruleArrayLiteral1362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableReference_in_entryRuleVariableReference1389 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableReference1396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableReference__Group__0_in_ruleVariableReference1422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionCall_in_entryRuleFunctionCall1449 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionCall1456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionCall__Group__0_in_ruleFunctionCall1482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInclude_in_entryRuleInclude1509 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInclude1516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Include__Group__0_in_ruleInclude1542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInclude_in_rule__Statement__Alternatives1578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGlobalDeclaration_in_rule__Statement__Alternatives1595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocalDeclaration_in_rule__Statement__Alternatives1612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionDeclaration_in_rule__Statement__Alternatives1629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_4__0_in_rule__Statement__Alternatives1646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFor_in_rule__Statement__Alternatives1664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhile_in_rule__Statement__Alternatives1681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIf_in_rule__Statement__Alternatives1698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_8__0_in_rule__Statement__Alternatives1715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatementBlock_in_rule__Statement__Alternatives1733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEachKeyIterator_in_rule__For__IteratorAlternatives_1_01765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEachValueIterator_in_rule__For__IteratorAlternatives_1_01782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableIterator_in_rule__For__IteratorAlternatives_1_01799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1_0_0__0_in_rule__Comparison__Alternatives_1_01832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1_0_1__0_in_rule__Comparison__Alternatives_1_01850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1_0_2__0_in_rule__Comparison__Alternatives_1_01868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1_0_3__0_in_rule__Comparison__Alternatives_1_01886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1_0_4__0_in_rule__Comparison__Alternatives_1_01904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1_0_5__0_in_rule__Comparison__Alternatives_1_01922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1_0_6__0_in_rule__Comparison__Alternatives_1_01940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1_0_7__0_in_rule__Comparison__Alternatives_1_01958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Or__Alternatives_1_0_11992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Or__Alternatives_1_0_12012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__And__Alternatives_1_0_12047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__And__Alternatives_1_0_12067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1_0_0__0_in_rule__Addition__Alternatives_1_02101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1_0_1__0_in_rule__Addition__Alternatives_1_02119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1_0_0__0_in_rule__Multiplication__Alternatives_1_02152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1_0_1__0_in_rule__Multiplication__Alternatives_1_02170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_0__0_in_rule__PrimaryExpression__Alternatives2203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_1__0_in_rule__PrimaryExpression__Alternatives2221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_2__0_in_rule__PrimaryExpression__Alternatives2239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionCall_in_rule__PrimaryExpression__Alternatives2257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableReference_in_rule__PrimaryExpression__Alternatives2274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_5__0_in_rule__PrimaryExpression__Alternatives2291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayLiteral_in_rule__PrimaryExpression__Alternatives2309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_4__0__Impl_in_rule__Statement__Group_4__02339 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Statement__Group_4__1_in_rule__Statement__Group_4__02342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionCall_in_rule__Statement__Group_4__0__Impl2369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_4__1__Impl_in_rule__Statement__Group_4__12398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Statement__Group_4__1__Impl2426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_8__0__Impl_in_rule__Statement__Group_8__02461 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Statement__Group_8__1_in_rule__Statement__Group_8__02464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAffectation_in_rule__Statement__Group_8__0__Impl2491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_8__1__Impl_in_rule__Statement__Group_8__12520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Statement__Group_8__1__Impl2548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StatementBlock__Group__0__Impl_in_rule__StatementBlock__Group__02583 = new BitSet(new long[]{0x00004000D3160010L});
    public static final BitSet FOLLOW_rule__StatementBlock__Group__1_in_rule__StatementBlock__Group__02586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__StatementBlock__Group__0__Impl2614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StatementBlock__Group__1__Impl_in_rule__StatementBlock__Group__12645 = new BitSet(new long[]{0x00004000D3160010L});
    public static final BitSet FOLLOW_rule__StatementBlock__Group__2_in_rule__StatementBlock__Group__12648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StatementBlock__Group__2__Impl_in_rule__StatementBlock__Group__22706 = new BitSet(new long[]{0x00004000D3160010L});
    public static final BitSet FOLLOW_rule__StatementBlock__Group__3_in_rule__StatementBlock__Group__22709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StatementBlock__StatementsAssignment_2_in_rule__StatementBlock__Group__2__Impl2736 = new BitSet(new long[]{0x00004000D3120012L});
    public static final BitSet FOLLOW_rule__StatementBlock__Group__3__Impl_in_rule__StatementBlock__Group__32767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__StatementBlock__Group__3__Impl2795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Affectation__Group__0__Impl_in_rule__Affectation__Group__02834 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Affectation__Group__1_in_rule__Affectation__Group__02837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Affectation__VariableAssignment_0_in_rule__Affectation__Group__0__Impl2864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Affectation__Group__1__Impl_in_rule__Affectation__Group__12894 = new BitSet(new long[]{0x00001000002000F0L});
    public static final BitSet FOLLOW_rule__Affectation__Group__2_in_rule__Affectation__Group__12897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Affectation__Group__1__Impl2925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Affectation__Group__2__Impl_in_rule__Affectation__Group__22956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Affectation__ValueAssignment_2_in_rule__Affectation__Group__2__Impl2983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__Group__0__Impl_in_rule__If__Group__03019 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__If__Group__1_in_rule__If__Group__03022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__If__Group__0__Impl3050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__Group__1__Impl_in_rule__If__Group__13081 = new BitSet(new long[]{0x00001000002000F0L});
    public static final BitSet FOLLOW_rule__If__Group__2_in_rule__If__Group__13084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__If__Group__1__Impl3112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__Group__2__Impl_in_rule__If__Group__23143 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__If__Group__3_in_rule__If__Group__23146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__ConditionAssignment_2_in_rule__If__Group__2__Impl3173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__Group__3__Impl_in_rule__If__Group__33203 = new BitSet(new long[]{0x00004000D3120010L});
    public static final BitSet FOLLOW_rule__If__Group__4_in_rule__If__Group__33206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__If__Group__3__Impl3234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__Group__4__Impl_in_rule__If__Group__43265 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__If__Group__5_in_rule__If__Group__43268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__ThenAssignment_4_in_rule__If__Group__4__Impl3295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__Group__5__Impl_in_rule__If__Group__53325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__Group_5__0_in_rule__If__Group__5__Impl3352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__Group_5__0__Impl_in_rule__If__Group_5__03395 = new BitSet(new long[]{0x00004000D3120010L});
    public static final BitSet FOLLOW_rule__If__Group_5__1_in_rule__If__Group_5__03398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__If__Group_5__0__Impl3427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__Group_5__1__Impl_in_rule__If__Group_5__13459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__ElseAssignment_5_1_in_rule__If__Group_5__1__Impl3486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__While__Group__0__Impl_in_rule__While__Group__03520 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__While__Group__1_in_rule__While__Group__03523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__While__Group__0__Impl3551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__While__Group__1__Impl_in_rule__While__Group__13582 = new BitSet(new long[]{0x00001000002000F0L});
    public static final BitSet FOLLOW_rule__While__Group__2_in_rule__While__Group__13585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__While__Group__1__Impl3613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__While__Group__2__Impl_in_rule__While__Group__23644 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__While__Group__3_in_rule__While__Group__23647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__While__ConditionAssignment_2_in_rule__While__Group__2__Impl3674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__While__Group__3__Impl_in_rule__While__Group__33704 = new BitSet(new long[]{0x00004000D3120010L});
    public static final BitSet FOLLOW_rule__While__Group__4_in_rule__While__Group__33707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__While__Group__3__Impl3735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__While__Group__4__Impl_in_rule__While__Group__43766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__While__StatementAssignment_4_in_rule__While__Group__4__Impl3793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__For__Group__0__Impl_in_rule__For__Group__03833 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__For__Group__1_in_rule__For__Group__03836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__For__Group__0__Impl3864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__For__Group__1__Impl_in_rule__For__Group__13895 = new BitSet(new long[]{0x00004000D3120010L});
    public static final BitSet FOLLOW_rule__For__Group__2_in_rule__For__Group__13898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__For__IteratorAssignment_1_in_rule__For__Group__1__Impl3925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__For__Group__2__Impl_in_rule__For__Group__23955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__For__StatementAssignment_2_in_rule__For__Group__2__Impl3982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EachKeyIterator__Group__0__Impl_in_rule__EachKeyIterator__Group__04018 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__EachKeyIterator__Group__1_in_rule__EachKeyIterator__Group__04021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__EachKeyIterator__Group__0__Impl4049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EachKeyIterator__Group__1__Impl_in_rule__EachKeyIterator__Group__14080 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__EachKeyIterator__Group__2_in_rule__EachKeyIterator__Group__14083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EachKeyIterator__KeyAssignment_1_in_rule__EachKeyIterator__Group__1__Impl4110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EachKeyIterator__Group__2__Impl_in_rule__EachKeyIterator__Group__24140 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__EachKeyIterator__Group__3_in_rule__EachKeyIterator__Group__24143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__EachKeyIterator__Group__2__Impl4171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EachKeyIterator__Group__3__Impl_in_rule__EachKeyIterator__Group__34202 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__EachKeyIterator__Group__4_in_rule__EachKeyIterator__Group__34205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EachKeyIterator__ValueAssignment_3_in_rule__EachKeyIterator__Group__3__Impl4232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EachKeyIterator__Group__4__Impl_in_rule__EachKeyIterator__Group__44262 = new BitSet(new long[]{0x00001000002000F0L});
    public static final BitSet FOLLOW_rule__EachKeyIterator__Group__5_in_rule__EachKeyIterator__Group__44265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__EachKeyIterator__Group__4__Impl4293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EachKeyIterator__Group__5__Impl_in_rule__EachKeyIterator__Group__54324 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__EachKeyIterator__Group__6_in_rule__EachKeyIterator__Group__54327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EachKeyIterator__ArrayAssignment_5_in_rule__EachKeyIterator__Group__5__Impl4354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EachKeyIterator__Group__6__Impl_in_rule__EachKeyIterator__Group__64384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__EachKeyIterator__Group__6__Impl4412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EachValueIterator__Group__0__Impl_in_rule__EachValueIterator__Group__04457 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__EachValueIterator__Group__1_in_rule__EachValueIterator__Group__04460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__EachValueIterator__Group__0__Impl4488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EachValueIterator__Group__1__Impl_in_rule__EachValueIterator__Group__14519 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__EachValueIterator__Group__2_in_rule__EachValueIterator__Group__14522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EachValueIterator__ValueAssignment_1_in_rule__EachValueIterator__Group__1__Impl4549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EachValueIterator__Group__2__Impl_in_rule__EachValueIterator__Group__24579 = new BitSet(new long[]{0x00001000002000F0L});
    public static final BitSet FOLLOW_rule__EachValueIterator__Group__3_in_rule__EachValueIterator__Group__24582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__EachValueIterator__Group__2__Impl4610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EachValueIterator__Group__3__Impl_in_rule__EachValueIterator__Group__34641 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__EachValueIterator__Group__4_in_rule__EachValueIterator__Group__34644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EachValueIterator__ArrayAssignment_3_in_rule__EachValueIterator__Group__3__Impl4671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EachValueIterator__Group__4__Impl_in_rule__EachValueIterator__Group__44701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__EachValueIterator__Group__4__Impl4729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableIterator__Group__0__Impl_in_rule__VariableIterator__Group__04770 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__VariableIterator__Group__1_in_rule__VariableIterator__Group__04773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__VariableIterator__Group__0__Impl4801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableIterator__Group__1__Impl_in_rule__VariableIterator__Group__14832 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__VariableIterator__Group__2_in_rule__VariableIterator__Group__14835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableIterator__InitializationAssignment_1_in_rule__VariableIterator__Group__1__Impl4862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableIterator__Group__2__Impl_in_rule__VariableIterator__Group__24892 = new BitSet(new long[]{0x00001000002000F0L});
    public static final BitSet FOLLOW_rule__VariableIterator__Group__3_in_rule__VariableIterator__Group__24895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__VariableIterator__Group__2__Impl4923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableIterator__Group__3__Impl_in_rule__VariableIterator__Group__34954 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__VariableIterator__Group__4_in_rule__VariableIterator__Group__34957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableIterator__ConditionAssignment_3_in_rule__VariableIterator__Group__3__Impl4984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableIterator__Group__4__Impl_in_rule__VariableIterator__Group__45014 = new BitSet(new long[]{0x00001000002000F0L});
    public static final BitSet FOLLOW_rule__VariableIterator__Group__5_in_rule__VariableIterator__Group__45017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__VariableIterator__Group__4__Impl5045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableIterator__Group__5__Impl_in_rule__VariableIterator__Group__55076 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__VariableIterator__Group__6_in_rule__VariableIterator__Group__55079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableIterator__IncrementAssignment_5_in_rule__VariableIterator__Group__5__Impl5106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableIterator__Group__6__Impl_in_rule__VariableIterator__Group__65136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__VariableIterator__Group__6__Impl5164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__Group__0__Impl_in_rule__FunctionDeclaration__Group__05209 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__Group__1_in_rule__FunctionDeclaration__Group__05212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__FunctionDeclaration__Group__0__Impl5240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__Group__1__Impl_in_rule__FunctionDeclaration__Group__15271 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__Group__2_in_rule__FunctionDeclaration__Group__15274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__NameAssignment_1_in_rule__FunctionDeclaration__Group__1__Impl5301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__Group__2__Impl_in_rule__FunctionDeclaration__Group__25331 = new BitSet(new long[]{0x0001000000400000L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__Group__3_in_rule__FunctionDeclaration__Group__25334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__FunctionDeclaration__Group__2__Impl5362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__Group__3__Impl_in_rule__FunctionDeclaration__Group__35393 = new BitSet(new long[]{0x0001000000400000L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__Group__4_in_rule__FunctionDeclaration__Group__35396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__Group_3__0_in_rule__FunctionDeclaration__Group__3__Impl5423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__Group__4__Impl_in_rule__FunctionDeclaration__Group__45454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__FunctionDeclaration__Group__4__Impl5482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__Group_3__0__Impl_in_rule__FunctionDeclaration__Group_3__05523 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__Group_3__1_in_rule__FunctionDeclaration__Group_3__05526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__ParameterAssignment_3_0_in_rule__FunctionDeclaration__Group_3__0__Impl5553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__Group_3__1__Impl_in_rule__FunctionDeclaration__Group_3__15583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__Group_3_1__0_in_rule__FunctionDeclaration__Group_3__1__Impl5610 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__Group_3_1__0__Impl_in_rule__FunctionDeclaration__Group_3_1__05645 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__Group_3_1__1_in_rule__FunctionDeclaration__Group_3_1__05648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__FunctionDeclaration__Group_3_1__0__Impl5676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__Group_3_1__1__Impl_in_rule__FunctionDeclaration__Group_3_1__15707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__ParameterAssignment_3_1_1_in_rule__FunctionDeclaration__Group_3_1__1__Impl5734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterDeclaration__Group__0__Impl_in_rule__ParameterDeclaration__Group__05768 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ParameterDeclaration__Group__1_in_rule__ParameterDeclaration__Group__05771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterDeclaration__ByAdressAssignment_0_in_rule__ParameterDeclaration__Group__0__Impl5798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterDeclaration__Group__1__Impl_in_rule__ParameterDeclaration__Group__15828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterDeclaration__NameAssignment_1_in_rule__ParameterDeclaration__Group__1__Impl5855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LocalDeclaration__Group__0__Impl_in_rule__LocalDeclaration__Group__05889 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__LocalDeclaration__Group__1_in_rule__LocalDeclaration__Group__05892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__LocalDeclaration__Group__0__Impl5920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LocalDeclaration__Group__1__Impl_in_rule__LocalDeclaration__Group__15951 = new BitSet(new long[]{0x00001000002100F0L});
    public static final BitSet FOLLOW_rule__LocalDeclaration__Group__2_in_rule__LocalDeclaration__Group__15954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LocalDeclaration__NameAssignment_1_in_rule__LocalDeclaration__Group__1__Impl5981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LocalDeclaration__Group__2__Impl_in_rule__LocalDeclaration__Group__26011 = new BitSet(new long[]{0x00001000002100F0L});
    public static final BitSet FOLLOW_rule__LocalDeclaration__Group__3_in_rule__LocalDeclaration__Group__26014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LocalDeclaration__ValueAssignment_2_in_rule__LocalDeclaration__Group__2__Impl6041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LocalDeclaration__Group__3__Impl_in_rule__LocalDeclaration__Group__36072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__LocalDeclaration__Group__3__Impl6100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GlobalDeclaration__Group__0__Impl_in_rule__GlobalDeclaration__Group__06139 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__GlobalDeclaration__Group__1_in_rule__GlobalDeclaration__Group__06142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__GlobalDeclaration__Group__0__Impl6170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GlobalDeclaration__Group__1__Impl_in_rule__GlobalDeclaration__Group__16201 = new BitSet(new long[]{0x00001000002100F0L});
    public static final BitSet FOLLOW_rule__GlobalDeclaration__Group__2_in_rule__GlobalDeclaration__Group__16204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GlobalDeclaration__NameAssignment_1_in_rule__GlobalDeclaration__Group__1__Impl6231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GlobalDeclaration__Group__2__Impl_in_rule__GlobalDeclaration__Group__26261 = new BitSet(new long[]{0x00001000002100F0L});
    public static final BitSet FOLLOW_rule__GlobalDeclaration__Group__3_in_rule__GlobalDeclaration__Group__26264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GlobalDeclaration__ValueAssignment_2_in_rule__GlobalDeclaration__Group__2__Impl6291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GlobalDeclaration__Group__3__Impl_in_rule__GlobalDeclaration__Group__36322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__GlobalDeclaration__Group__3__Impl6350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group__0__Impl_in_rule__Comparison__Group__06389 = new BitSet(new long[]{0x000000FF00000000L});
    public static final BitSet FOLLOW_rule__Comparison__Group__1_in_rule__Comparison__Group__06392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOr_in_rule__Comparison__Group__0__Impl6419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group__1__Impl_in_rule__Comparison__Group__16448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1__0_in_rule__Comparison__Group__1__Impl6475 = new BitSet(new long[]{0x000000FF00000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1__0__Impl_in_rule__Comparison__Group_1__06510 = new BitSet(new long[]{0x00001000002000F0L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1__1_in_rule__Comparison__Group_1__06513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Alternatives_1_0_in_rule__Comparison__Group_1__0__Impl6540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1__1__Impl_in_rule__Comparison__Group_1__16570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__RightAssignment_1_1_in_rule__Comparison__Group_1__1__Impl6597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1_0_0__0__Impl_in_rule__Comparison__Group_1_0_0__06631 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1_0_0__1_in_rule__Comparison__Group_1_0_0__06634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1_0_0__1__Impl_in_rule__Comparison__Group_1_0_0__16692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Comparison__Group_1_0_0__1__Impl6720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1_0_1__0__Impl_in_rule__Comparison__Group_1_0_1__06755 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1_0_1__1_in_rule__Comparison__Group_1_0_1__06758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1_0_1__1__Impl_in_rule__Comparison__Group_1_0_1__16816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Comparison__Group_1_0_1__1__Impl6844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1_0_2__0__Impl_in_rule__Comparison__Group_1_0_2__06879 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1_0_2__1_in_rule__Comparison__Group_1_0_2__06882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1_0_2__1__Impl_in_rule__Comparison__Group_1_0_2__16940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Comparison__Group_1_0_2__1__Impl6968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1_0_3__0__Impl_in_rule__Comparison__Group_1_0_3__07003 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1_0_3__1_in_rule__Comparison__Group_1_0_3__07006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1_0_3__1__Impl_in_rule__Comparison__Group_1_0_3__17064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Comparison__Group_1_0_3__1__Impl7092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1_0_4__0__Impl_in_rule__Comparison__Group_1_0_4__07127 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1_0_4__1_in_rule__Comparison__Group_1_0_4__07130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1_0_4__1__Impl_in_rule__Comparison__Group_1_0_4__17188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Comparison__Group_1_0_4__1__Impl7216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1_0_5__0__Impl_in_rule__Comparison__Group_1_0_5__07251 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1_0_5__1_in_rule__Comparison__Group_1_0_5__07254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1_0_5__1__Impl_in_rule__Comparison__Group_1_0_5__17312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Comparison__Group_1_0_5__1__Impl7340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1_0_6__0__Impl_in_rule__Comparison__Group_1_0_6__07375 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1_0_6__1_in_rule__Comparison__Group_1_0_6__07378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1_0_6__1__Impl_in_rule__Comparison__Group_1_0_6__17436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Comparison__Group_1_0_6__1__Impl7464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1_0_7__0__Impl_in_rule__Comparison__Group_1_0_7__07499 = new BitSet(new long[]{0x000000FF00000000L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1_0_7__1_in_rule__Comparison__Group_1_0_7__07502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1_0_7__1__Impl_in_rule__Comparison__Group_1_0_7__17560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Comparison__Group_1_0_7__1__Impl7588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Or__Group__0__Impl_in_rule__Or__Group__07623 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_rule__Or__Group__1_in_rule__Or__Group__07626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnd_in_rule__Or__Group__0__Impl7653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Or__Group__1__Impl_in_rule__Or__Group__17682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Or__Group_1__0_in_rule__Or__Group__1__Impl7709 = new BitSet(new long[]{0x0000000000003002L});
    public static final BitSet FOLLOW_rule__Or__Group_1__0__Impl_in_rule__Or__Group_1__07744 = new BitSet(new long[]{0x00001000002000F0L});
    public static final BitSet FOLLOW_rule__Or__Group_1__1_in_rule__Or__Group_1__07747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Or__Group_1_0__0_in_rule__Or__Group_1__0__Impl7774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Or__Group_1__1__Impl_in_rule__Or__Group_1__17804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Or__RightAssignment_1_1_in_rule__Or__Group_1__1__Impl7831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Or__Group_1_0__0__Impl_in_rule__Or__Group_1_0__07865 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_rule__Or__Group_1_0__1_in_rule__Or__Group_1_0__07868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Or__Group_1_0__1__Impl_in_rule__Or__Group_1_0__17926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Or__Alternatives_1_0_1_in_rule__Or__Group_1_0__1__Impl7953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__And__Group__0__Impl_in_rule__And__Group__07987 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_rule__And__Group__1_in_rule__And__Group__07990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddition_in_rule__And__Group__0__Impl8017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__And__Group__1__Impl_in_rule__And__Group__18046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__And__Group_1__0_in_rule__And__Group__1__Impl8073 = new BitSet(new long[]{0x000000000000C002L});
    public static final BitSet FOLLOW_rule__And__Group_1__0__Impl_in_rule__And__Group_1__08108 = new BitSet(new long[]{0x00001000002000F0L});
    public static final BitSet FOLLOW_rule__And__Group_1__1_in_rule__And__Group_1__08111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__And__Group_1_0__0_in_rule__And__Group_1__0__Impl8138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__And__Group_1__1__Impl_in_rule__And__Group_1__18168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__And__RightAssignment_1_1_in_rule__And__Group_1__1__Impl8195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__And__Group_1_0__0__Impl_in_rule__And__Group_1_0__08229 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_rule__And__Group_1_0__1_in_rule__And__Group_1_0__08232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__And__Group_1_0__1__Impl_in_rule__And__Group_1_0__18290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__And__Alternatives_1_0_1_in_rule__And__Group_1_0__1__Impl8317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group__0__Impl_in_rule__Addition__Group__08351 = new BitSet(new long[]{0x0000030000000000L});
    public static final BitSet FOLLOW_rule__Addition__Group__1_in_rule__Addition__Group__08354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplication_in_rule__Addition__Group__0__Impl8381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group__1__Impl_in_rule__Addition__Group__18410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1__0_in_rule__Addition__Group__1__Impl8437 = new BitSet(new long[]{0x0000030000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1__0__Impl_in_rule__Addition__Group_1__08472 = new BitSet(new long[]{0x00001000002000F0L});
    public static final BitSet FOLLOW_rule__Addition__Group_1__1_in_rule__Addition__Group_1__08475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Alternatives_1_0_in_rule__Addition__Group_1__0__Impl8502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1__1__Impl_in_rule__Addition__Group_1__18532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__RightAssignment_1_1_in_rule__Addition__Group_1__1__Impl8559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1_0_0__0__Impl_in_rule__Addition__Group_1_0_0__08593 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__Addition__Group_1_0_0__1_in_rule__Addition__Group_1_0_0__08596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1_0_0__1__Impl_in_rule__Addition__Group_1_0_0__18654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Addition__Group_1_0_0__1__Impl8682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1_0_1__0__Impl_in_rule__Addition__Group_1_0_1__08717 = new BitSet(new long[]{0x0000030000000000L});
    public static final BitSet FOLLOW_rule__Addition__Group_1_0_1__1_in_rule__Addition__Group_1_0_1__08720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1_0_1__1__Impl_in_rule__Addition__Group_1_0_1__18778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__Addition__Group_1_0_1__1__Impl8806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group__0__Impl_in_rule__Multiplication__Group__08841 = new BitSet(new long[]{0x00000C0000000000L});
    public static final BitSet FOLLOW_rule__Multiplication__Group__1_in_rule__Multiplication__Group__08844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_rule__Multiplication__Group__0__Impl8871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group__1__Impl_in_rule__Multiplication__Group__18900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1__0_in_rule__Multiplication__Group__1__Impl8927 = new BitSet(new long[]{0x00000C0000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1__0__Impl_in_rule__Multiplication__Group_1__08962 = new BitSet(new long[]{0x00001000002000F0L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1__1_in_rule__Multiplication__Group_1__08965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Alternatives_1_0_in_rule__Multiplication__Group_1__0__Impl8992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1__1__Impl_in_rule__Multiplication__Group_1__19022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__RightAssignment_1_1_in_rule__Multiplication__Group_1__1__Impl9049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1_0_0__0__Impl_in_rule__Multiplication__Group_1_0_0__09083 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1_0_0__1_in_rule__Multiplication__Group_1_0_0__09086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1_0_0__1__Impl_in_rule__Multiplication__Group_1_0_0__19144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__Multiplication__Group_1_0_0__1__Impl9172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1_0_1__0__Impl_in_rule__Multiplication__Group_1_0_1__09207 = new BitSet(new long[]{0x00000C0000000000L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1_0_1__1_in_rule__Multiplication__Group_1_0_1__09210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1_0_1__1__Impl_in_rule__Multiplication__Group_1_0_1__19268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__Multiplication__Group_1_0_1__1__Impl9296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_0__0__Impl_in_rule__PrimaryExpression__Group_0__09331 = new BitSet(new long[]{0x00001000002000F0L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_0__1_in_rule__PrimaryExpression__Group_0__09334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__PrimaryExpression__Group_0__0__Impl9362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_0__1__Impl_in_rule__PrimaryExpression__Group_0__19393 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_0__2_in_rule__PrimaryExpression__Group_0__19396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__PrimaryExpression__Group_0__1__Impl9423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_0__2__Impl_in_rule__PrimaryExpression__Group_0__29452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__PrimaryExpression__Group_0__2__Impl9480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_1__0__Impl_in_rule__PrimaryExpression__Group_1__09517 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_1__1_in_rule__PrimaryExpression__Group_1__09520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_1__1__Impl_in_rule__PrimaryExpression__Group_1__19578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__ValueAssignment_1_1_in_rule__PrimaryExpression__Group_1__1__Impl9605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_2__0__Impl_in_rule__PrimaryExpression__Group_2__09639 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_2__1_in_rule__PrimaryExpression__Group_2__09642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_2__1__Impl_in_rule__PrimaryExpression__Group_2__19700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__ValueAssignment_2_1_in_rule__PrimaryExpression__Group_2__1__Impl9727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_5__0__Impl_in_rule__PrimaryExpression__Group_5__09761 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_5__1_in_rule__PrimaryExpression__Group_5__09764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_5__1__Impl_in_rule__PrimaryExpression__Group_5__19822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__ValueAssignment_5_1_in_rule__PrimaryExpression__Group_5__1__Impl9849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayLiteral__Group__0__Impl_in_rule__ArrayLiteral__Group__09883 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__ArrayLiteral__Group__1_in_rule__ArrayLiteral__Group__09886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__ArrayLiteral__Group__0__Impl9914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayLiteral__Group__1__Impl_in_rule__ArrayLiteral__Group__19945 = new BitSet(new long[]{0x00001000002000F0L});
    public static final BitSet FOLLOW_rule__ArrayLiteral__Group__2_in_rule__ArrayLiteral__Group__19948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__ArrayLiteral__Group__1__Impl9976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayLiteral__Group__2__Impl_in_rule__ArrayLiteral__Group__210007 = new BitSet(new long[]{0x0000200020000000L});
    public static final BitSet FOLLOW_rule__ArrayLiteral__Group__3_in_rule__ArrayLiteral__Group__210010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayLiteral__ValuesAssignment_2_in_rule__ArrayLiteral__Group__2__Impl10037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayLiteral__Group__3__Impl_in_rule__ArrayLiteral__Group__310067 = new BitSet(new long[]{0x0000200020000000L});
    public static final BitSet FOLLOW_rule__ArrayLiteral__Group__4_in_rule__ArrayLiteral__Group__310070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayLiteral__Group_3__0_in_rule__ArrayLiteral__Group__3__Impl10097 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_rule__ArrayLiteral__Group__4__Impl_in_rule__ArrayLiteral__Group__410128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__ArrayLiteral__Group__4__Impl10156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayLiteral__Group_3__0__Impl_in_rule__ArrayLiteral__Group_3__010197 = new BitSet(new long[]{0x00001000002000F0L});
    public static final BitSet FOLLOW_rule__ArrayLiteral__Group_3__1_in_rule__ArrayLiteral__Group_3__010200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__ArrayLiteral__Group_3__0__Impl10228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayLiteral__Group_3__1__Impl_in_rule__ArrayLiteral__Group_3__110259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayLiteral__ValuesAssignment_3_1_in_rule__ArrayLiteral__Group_3__1__Impl10286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableReference__Group__0__Impl_in_rule__VariableReference__Group__010320 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_rule__VariableReference__Group__1_in_rule__VariableReference__Group__010323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableReference__VariableAssignment_0_in_rule__VariableReference__Group__0__Impl10350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableReference__Group__1__Impl_in_rule__VariableReference__Group__110380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableReference__Group_1__0_in_rule__VariableReference__Group__1__Impl10407 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_rule__VariableReference__Group_1__0__Impl_in_rule__VariableReference__Group_1__010442 = new BitSet(new long[]{0x00001000002000F0L});
    public static final BitSet FOLLOW_rule__VariableReference__Group_1__1_in_rule__VariableReference__Group_1__010445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__VariableReference__Group_1__0__Impl10473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableReference__Group_1__1__Impl_in_rule__VariableReference__Group_1__110504 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_rule__VariableReference__Group_1__2_in_rule__VariableReference__Group_1__110507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableReference__DimensionsAssignment_1_1_in_rule__VariableReference__Group_1__1__Impl10534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableReference__Group_1__2__Impl_in_rule__VariableReference__Group_1__210564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__VariableReference__Group_1__2__Impl10592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionCall__Group__0__Impl_in_rule__FunctionCall__Group__010629 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__FunctionCall__Group__1_in_rule__FunctionCall__Group__010632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionCall__Group__1__Impl_in_rule__FunctionCall__Group__110690 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__FunctionCall__Group__2_in_rule__FunctionCall__Group__110693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionCall__FunctionAssignment_1_in_rule__FunctionCall__Group__1__Impl10720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionCall__Group__2__Impl_in_rule__FunctionCall__Group__210750 = new BitSet(new long[]{0x00001000002000F0L});
    public static final BitSet FOLLOW_rule__FunctionCall__Group__3_in_rule__FunctionCall__Group__210753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__FunctionCall__Group__2__Impl10781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionCall__Group__3__Impl_in_rule__FunctionCall__Group__310812 = new BitSet(new long[]{0x0000000020400000L});
    public static final BitSet FOLLOW_rule__FunctionCall__Group__4_in_rule__FunctionCall__Group__310815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionCall__ArgsAssignment_3_in_rule__FunctionCall__Group__3__Impl10842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionCall__Group__4__Impl_in_rule__FunctionCall__Group__410872 = new BitSet(new long[]{0x0000000020400000L});
    public static final BitSet FOLLOW_rule__FunctionCall__Group__5_in_rule__FunctionCall__Group__410875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionCall__Group_4__0_in_rule__FunctionCall__Group__4__Impl10902 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_rule__FunctionCall__Group__5__Impl_in_rule__FunctionCall__Group__510933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__FunctionCall__Group__5__Impl10961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionCall__Group_4__0__Impl_in_rule__FunctionCall__Group_4__011004 = new BitSet(new long[]{0x00001000002000F0L});
    public static final BitSet FOLLOW_rule__FunctionCall__Group_4__1_in_rule__FunctionCall__Group_4__011007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__FunctionCall__Group_4__0__Impl11035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionCall__Group_4__1__Impl_in_rule__FunctionCall__Group_4__111066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionCall__ArgsAssignment_4_1_in_rule__FunctionCall__Group_4__1__Impl11093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Include__Group__0__Impl_in_rule__Include__Group__011127 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Include__Group__1_in_rule__Include__Group__011130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__Include__Group__0__Impl11158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Include__Group__1__Impl_in_rule__Include__Group__111189 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_rule__Include__Group__2_in_rule__Include__Group__111192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Include__Group__1__Impl11220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Include__Group__2__Impl_in_rule__Include__Group__211251 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Include__Group__3_in_rule__Include__Group__211254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__Include__Group__2__Impl11282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Include__Group__3__Impl_in_rule__Include__Group__311313 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_rule__Include__Group__4_in_rule__Include__Group__311316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Include__Group__3__Impl11343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Include__Group__4__Impl_in_rule__Include__Group__411372 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Include__Group__5_in_rule__Include__Group__411375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__Include__Group__4__Impl11403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Include__Group__5__Impl_in_rule__Include__Group__511434 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Include__Group__6_in_rule__Include__Group__511437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Include__Group__5__Impl11465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Include__Group__6__Impl_in_rule__Include__Group__611496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Include__Group__6__Impl11524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_rule__Model__StatementsAssignment11574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_rule__StatementBlock__StatementsAssignment_211605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableReference_in_rule__Affectation__VariableAssignment_011636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__Affectation__ValueAssignment_211667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__If__ConditionAssignment_211698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_rule__If__ThenAssignment_411729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_rule__If__ElseAssignment_5_111760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__While__ConditionAssignment_211791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_rule__While__StatementAssignment_411822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__For__IteratorAlternatives_1_0_in_rule__For__IteratorAssignment_111853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_rule__For__StatementAssignment_211886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocalDeclaration_in_rule__EachKeyIterator__KeyAssignment_111917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocalDeclaration_in_rule__EachKeyIterator__ValueAssignment_311948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__EachKeyIterator__ArrayAssignment_511979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocalDeclaration_in_rule__EachValueIterator__ValueAssignment_112010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__EachValueIterator__ArrayAssignment_312041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAffectation_in_rule__VariableIterator__InitializationAssignment_112072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__VariableIterator__ConditionAssignment_312103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__VariableIterator__IncrementAssignment_512134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FunctionDeclaration__NameAssignment_112165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterDeclaration_in_rule__FunctionDeclaration__ParameterAssignment_3_012196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterDeclaration_in_rule__FunctionDeclaration__ParameterAssignment_3_1_112227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__ParameterDeclaration__ByAdressAssignment_012263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ParameterDeclaration__NameAssignment_112302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__LocalDeclaration__NameAssignment_112333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__LocalDeclaration__ValueAssignment_212364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__GlobalDeclaration__NameAssignment_112395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__GlobalDeclaration__ValueAssignment_212426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOr_in_rule__Comparison__RightAssignment_1_112457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnd_in_rule__Or__RightAssignment_1_112488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddition_in_rule__And__RightAssignment_1_112519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplication_in_rule__Addition__RightAssignment_1_112550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_rule__Multiplication__RightAssignment_1_112581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_REAL_in_rule__PrimaryExpression__ValueAssignment_1_112612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__PrimaryExpression__ValueAssignment_2_112643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__PrimaryExpression__ValueAssignment_5_112674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__ArrayLiteral__ValuesAssignment_212705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__ArrayLiteral__ValuesAssignment_3_112736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__VariableReference__VariableAssignment_012771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__VariableReference__DimensionsAssignment_1_112806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FunctionCall__FunctionAssignment_112841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__FunctionCall__ArgsAssignment_312876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__FunctionCall__ArgsAssignment_4_112907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEachKeyIterator_in_synpred11_InternalLeek1765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEachValueIterator_in_synpred12_InternalLeek1782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__Group_5__0_in_synpred31_InternalLeek3352 = new BitSet(new long[]{0x0000000000000002L});

}