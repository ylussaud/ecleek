package org.processus.ecleek.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.processus.ecleek.services.LeekGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalLeekParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_REAL", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "';'", "'{'", "'}'", "'break'", "'continue'", "'='", "'if'", "'('", "')'", "'else'", "'while'", "'for'", "':'", "'in'", "'var'", "'function'", "','", "'@'", "'global'", "'==='", "'=='", "'!=='", "'!='", "'<='", "'<'", "'>='", "'>'", "'or'", "'||'", "'and'", "'&&'", "'+'", "'-'", "'*'", "'/'", "'null'", "'false'", "'true'", "'['", "']'", "'return'", "'include'"
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
    public static final int T__51=51;
    public static final int T__16=16;
    public static final int T__52=52;
    public static final int T__15=15;
    public static final int T__53=53;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
    public static final int RULE_REAL=5;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
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
    public String getGrammarFileName() { return "../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g"; }



     	private LeekGrammarAccess grammarAccess;
     	
        public InternalLeekParser(TokenStream input, LeekGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Script";	
       	}
       	
       	@Override
       	protected LeekGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleScript"
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:67:1: entryRuleScript returns [EObject current=null] : iv_ruleScript= ruleScript EOF ;
    public final EObject entryRuleScript() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScript = null;


        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:68:2: (iv_ruleScript= ruleScript EOF )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:69:2: iv_ruleScript= ruleScript EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getScriptRule()); 
            }
            pushFollow(FOLLOW_ruleScript_in_entryRuleScript75);
            iv_ruleScript=ruleScript();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleScript; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleScript85); if (state.failed) return current;

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
    // $ANTLR end "entryRuleScript"


    // $ANTLR start "ruleScript"
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:76:1: ruleScript returns [EObject current=null] : ( (lv_statements_0_0= ruleToplevelStatement ) )* ;
    public final EObject ruleScript() throws RecognitionException {
        EObject current = null;

        EObject lv_statements_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:79:28: ( ( (lv_statements_0_0= ruleToplevelStatement ) )* )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:80:1: ( (lv_statements_0_0= ruleToplevelStatement ) )*
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:80:1: ( (lv_statements_0_0= ruleToplevelStatement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID||(LA1_0>=12 && LA1_0<=13)||LA1_0==18||(LA1_0>=22 && LA1_0<=23)||(LA1_0>=26 && LA1_0<=27)||LA1_0==30||LA1_0==53) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:81:1: (lv_statements_0_0= ruleToplevelStatement )
            	    {
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:81:1: (lv_statements_0_0= ruleToplevelStatement )
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:82:3: lv_statements_0_0= ruleToplevelStatement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getScriptAccess().getStatementsToplevelStatementParserRuleCall_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleToplevelStatement_in_ruleScript130);
            	    lv_statements_0_0=ruleToplevelStatement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getScriptRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"statements",
            	              		lv_statements_0_0, 
            	              		"ToplevelStatement");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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
    // $ANTLR end "ruleScript"


    // $ANTLR start "entryRuleToplevelStatement"
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:106:1: entryRuleToplevelStatement returns [EObject current=null] : iv_ruleToplevelStatement= ruleToplevelStatement EOF ;
    public final EObject entryRuleToplevelStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleToplevelStatement = null;


        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:107:2: (iv_ruleToplevelStatement= ruleToplevelStatement EOF )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:108:2: iv_ruleToplevelStatement= ruleToplevelStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getToplevelStatementRule()); 
            }
            pushFollow(FOLLOW_ruleToplevelStatement_in_entryRuleToplevelStatement166);
            iv_ruleToplevelStatement=ruleToplevelStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleToplevelStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleToplevelStatement176); if (state.failed) return current;

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
    // $ANTLR end "entryRuleToplevelStatement"


    // $ANTLR start "ruleToplevelStatement"
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:115:1: ruleToplevelStatement returns [EObject current=null] : ( (this_Include_0= ruleInclude otherlv_1= ';' ) | (this_GlobalDeclaration_2= ruleGlobalDeclaration otherlv_3= ';' ) | this_FunctionDeclaration_4= ruleFunctionDeclaration | this_Statement_5= ruleStatement ) ;
    public final EObject ruleToplevelStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject this_Include_0 = null;

        EObject this_GlobalDeclaration_2 = null;

        EObject this_FunctionDeclaration_4 = null;

        EObject this_Statement_5 = null;


         enterRule(); 
            
        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:118:28: ( ( (this_Include_0= ruleInclude otherlv_1= ';' ) | (this_GlobalDeclaration_2= ruleGlobalDeclaration otherlv_3= ';' ) | this_FunctionDeclaration_4= ruleFunctionDeclaration | this_Statement_5= ruleStatement ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:119:1: ( (this_Include_0= ruleInclude otherlv_1= ';' ) | (this_GlobalDeclaration_2= ruleGlobalDeclaration otherlv_3= ';' ) | this_FunctionDeclaration_4= ruleFunctionDeclaration | this_Statement_5= ruleStatement )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:119:1: ( (this_Include_0= ruleInclude otherlv_1= ';' ) | (this_GlobalDeclaration_2= ruleGlobalDeclaration otherlv_3= ';' ) | this_FunctionDeclaration_4= ruleFunctionDeclaration | this_Statement_5= ruleStatement )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 53:
                {
                alt2=1;
                }
                break;
            case 30:
                {
                alt2=2;
                }
                break;
            case 27:
                {
                alt2=3;
                }
                break;
            case RULE_ID:
            case 12:
            case 13:
            case 18:
            case 22:
            case 23:
            case 26:
                {
                alt2=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:119:2: (this_Include_0= ruleInclude otherlv_1= ';' )
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:119:2: (this_Include_0= ruleInclude otherlv_1= ';' )
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:120:5: this_Include_0= ruleInclude otherlv_1= ';'
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getToplevelStatementAccess().getIncludeParserRuleCall_0_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInclude_in_ruleToplevelStatement224);
                    this_Include_0=ruleInclude();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Include_0; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleToplevelStatement235); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getToplevelStatementAccess().getSemicolonKeyword_0_1());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:133:6: (this_GlobalDeclaration_2= ruleGlobalDeclaration otherlv_3= ';' )
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:133:6: (this_GlobalDeclaration_2= ruleGlobalDeclaration otherlv_3= ';' )
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:134:5: this_GlobalDeclaration_2= ruleGlobalDeclaration otherlv_3= ';'
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getToplevelStatementAccess().getGlobalDeclarationParserRuleCall_1_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleGlobalDeclaration_in_ruleToplevelStatement265);
                    this_GlobalDeclaration_2=ruleGlobalDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_GlobalDeclaration_2; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_3=(Token)match(input,12,FOLLOW_12_in_ruleToplevelStatement276); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getToplevelStatementAccess().getSemicolonKeyword_1_1());
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:148:5: this_FunctionDeclaration_4= ruleFunctionDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getToplevelStatementAccess().getFunctionDeclarationParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleFunctionDeclaration_in_ruleToplevelStatement305);
                    this_FunctionDeclaration_4=ruleFunctionDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_FunctionDeclaration_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:158:5: this_Statement_5= ruleStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getToplevelStatementAccess().getStatementParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStatement_in_ruleToplevelStatement332);
                    this_Statement_5=ruleStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Statement_5; 
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
    // $ANTLR end "ruleToplevelStatement"


    // $ANTLR start "entryRuleStatement"
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:174:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:175:2: (iv_ruleStatement= ruleStatement EOF )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:176:2: iv_ruleStatement= ruleStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatementRule()); 
            }
            pushFollow(FOLLOW_ruleStatement_in_entryRuleStatement367);
            iv_ruleStatement=ruleStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatement377); if (state.failed) return current;

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
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:183:1: ruleStatement returns [EObject current=null] : ( ( () otherlv_1= ';' ) | (this_LocalDeclaration_2= ruleLocalDeclaration otherlv_3= ';' ) | (this_FunctionCall_4= ruleFunctionCall otherlv_5= ';' ) | this_Iteration_6= ruleIteration | this_If_7= ruleIf | (this_Affectation_8= ruleAffectation otherlv_9= ';' ) | this_StatementBlock_10= ruleStatementBlock ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_9=null;
        EObject this_LocalDeclaration_2 = null;

        EObject this_FunctionCall_4 = null;

        EObject this_Iteration_6 = null;

        EObject this_If_7 = null;

        EObject this_Affectation_8 = null;

        EObject this_StatementBlock_10 = null;


         enterRule(); 
            
        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:186:28: ( ( ( () otherlv_1= ';' ) | (this_LocalDeclaration_2= ruleLocalDeclaration otherlv_3= ';' ) | (this_FunctionCall_4= ruleFunctionCall otherlv_5= ';' ) | this_Iteration_6= ruleIteration | this_If_7= ruleIf | (this_Affectation_8= ruleAffectation otherlv_9= ';' ) | this_StatementBlock_10= ruleStatementBlock ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:187:1: ( ( () otherlv_1= ';' ) | (this_LocalDeclaration_2= ruleLocalDeclaration otherlv_3= ';' ) | (this_FunctionCall_4= ruleFunctionCall otherlv_5= ';' ) | this_Iteration_6= ruleIteration | this_If_7= ruleIf | (this_Affectation_8= ruleAffectation otherlv_9= ';' ) | this_StatementBlock_10= ruleStatementBlock )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:187:1: ( ( () otherlv_1= ';' ) | (this_LocalDeclaration_2= ruleLocalDeclaration otherlv_3= ';' ) | (this_FunctionCall_4= ruleFunctionCall otherlv_5= ';' ) | this_Iteration_6= ruleIteration | this_If_7= ruleIf | (this_Affectation_8= ruleAffectation otherlv_9= ';' ) | this_StatementBlock_10= ruleStatementBlock )
            int alt3=7;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt3=1;
                }
                break;
            case 26:
                {
                alt3=2;
                }
                break;
            case RULE_ID:
                {
                int LA3_3 = input.LA(2);

                if ( (LA3_3==19) ) {
                    alt3=3;
                }
                else if ( (LA3_3==17||LA3_3==50) ) {
                    alt3=6;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 3, input);

                    throw nvae;
                }
                }
                break;
            case 22:
            case 23:
                {
                alt3=4;
                }
                break;
            case 18:
                {
                alt3=5;
                }
                break;
            case 13:
                {
                alt3=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:187:2: ( () otherlv_1= ';' )
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:187:2: ( () otherlv_1= ';' )
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:187:3: () otherlv_1= ';'
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:187:3: ()
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:188:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getStatementAccess().getEmptyStatementAction_0_0(),
                                  current);
                          
                    }

                    }

                    otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleStatement424); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getStatementAccess().getSemicolonKeyword_0_1());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:198:6: (this_LocalDeclaration_2= ruleLocalDeclaration otherlv_3= ';' )
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:198:6: (this_LocalDeclaration_2= ruleLocalDeclaration otherlv_3= ';' )
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:199:5: this_LocalDeclaration_2= ruleLocalDeclaration otherlv_3= ';'
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getLocalDeclarationParserRuleCall_1_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLocalDeclaration_in_ruleStatement454);
                    this_LocalDeclaration_2=ruleLocalDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_LocalDeclaration_2; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_3=(Token)match(input,12,FOLLOW_12_in_ruleStatement465); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getStatementAccess().getSemicolonKeyword_1_1());
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:212:6: (this_FunctionCall_4= ruleFunctionCall otherlv_5= ';' )
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:212:6: (this_FunctionCall_4= ruleFunctionCall otherlv_5= ';' )
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:213:5: this_FunctionCall_4= ruleFunctionCall otherlv_5= ';'
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getFunctionCallParserRuleCall_2_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleFunctionCall_in_ruleStatement495);
                    this_FunctionCall_4=ruleFunctionCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_FunctionCall_4; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_5=(Token)match(input,12,FOLLOW_12_in_ruleStatement506); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getStatementAccess().getSemicolonKeyword_2_1());
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:227:5: this_Iteration_6= ruleIteration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getIterationParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleIteration_in_ruleStatement535);
                    this_Iteration_6=ruleIteration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Iteration_6; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:237:5: this_If_7= ruleIf
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getIfParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleIf_in_ruleStatement562);
                    this_If_7=ruleIf();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_If_7; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:246:6: (this_Affectation_8= ruleAffectation otherlv_9= ';' )
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:246:6: (this_Affectation_8= ruleAffectation otherlv_9= ';' )
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:247:5: this_Affectation_8= ruleAffectation otherlv_9= ';'
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getAffectationParserRuleCall_5_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAffectation_in_ruleStatement590);
                    this_Affectation_8=ruleAffectation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Affectation_8; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_9=(Token)match(input,12,FOLLOW_12_in_ruleStatement601); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getStatementAccess().getSemicolonKeyword_5_1());
                          
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:261:5: this_StatementBlock_10= ruleStatementBlock
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getStatementBlockParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStatementBlock_in_ruleStatement630);
                    this_StatementBlock_10=ruleStatementBlock();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_StatementBlock_10; 
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
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleIterationStatement"
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:277:1: entryRuleIterationStatement returns [EObject current=null] : iv_ruleIterationStatement= ruleIterationStatement EOF ;
    public final EObject entryRuleIterationStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIterationStatement = null;


        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:278:2: (iv_ruleIterationStatement= ruleIterationStatement EOF )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:279:2: iv_ruleIterationStatement= ruleIterationStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIterationStatementRule()); 
            }
            pushFollow(FOLLOW_ruleIterationStatement_in_entryRuleIterationStatement665);
            iv_ruleIterationStatement=ruleIterationStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIterationStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIterationStatement675); if (state.failed) return current;

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
    // $ANTLR end "entryRuleIterationStatement"


    // $ANTLR start "ruleIterationStatement"
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:286:1: ruleIterationStatement returns [EObject current=null] : (this_Statement_0= ruleStatement | (this_BreakStatement_1= ruleBreakStatement otherlv_2= ';' ) | (this_ContinueStatement_3= ruleContinueStatement otherlv_4= ';' ) ) ;
    public final EObject ruleIterationStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_Statement_0 = null;

        EObject this_BreakStatement_1 = null;

        EObject this_ContinueStatement_3 = null;


         enterRule(); 
            
        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:289:28: ( (this_Statement_0= ruleStatement | (this_BreakStatement_1= ruleBreakStatement otherlv_2= ';' ) | (this_ContinueStatement_3= ruleContinueStatement otherlv_4= ';' ) ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:290:1: (this_Statement_0= ruleStatement | (this_BreakStatement_1= ruleBreakStatement otherlv_2= ';' ) | (this_ContinueStatement_3= ruleContinueStatement otherlv_4= ';' ) )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:290:1: (this_Statement_0= ruleStatement | (this_BreakStatement_1= ruleBreakStatement otherlv_2= ';' ) | (this_ContinueStatement_3= ruleContinueStatement otherlv_4= ';' ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case 12:
            case 13:
            case 18:
            case 22:
            case 23:
            case 26:
                {
                alt4=1;
                }
                break;
            case 15:
                {
                alt4=2;
                }
                break;
            case 16:
                {
                alt4=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:291:5: this_Statement_0= ruleStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getIterationStatementAccess().getStatementParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStatement_in_ruleIterationStatement722);
                    this_Statement_0=ruleStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Statement_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:300:6: (this_BreakStatement_1= ruleBreakStatement otherlv_2= ';' )
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:300:6: (this_BreakStatement_1= ruleBreakStatement otherlv_2= ';' )
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:301:5: this_BreakStatement_1= ruleBreakStatement otherlv_2= ';'
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getIterationStatementAccess().getBreakStatementParserRuleCall_1_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBreakStatement_in_ruleIterationStatement750);
                    this_BreakStatement_1=ruleBreakStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_BreakStatement_1; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleIterationStatement761); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getIterationStatementAccess().getSemicolonKeyword_1_1());
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:314:6: (this_ContinueStatement_3= ruleContinueStatement otherlv_4= ';' )
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:314:6: (this_ContinueStatement_3= ruleContinueStatement otherlv_4= ';' )
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:315:5: this_ContinueStatement_3= ruleContinueStatement otherlv_4= ';'
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getIterationStatementAccess().getContinueStatementParserRuleCall_2_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleContinueStatement_in_ruleIterationStatement791);
                    this_ContinueStatement_3=ruleContinueStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ContinueStatement_3; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_4=(Token)match(input,12,FOLLOW_12_in_ruleIterationStatement802); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getIterationStatementAccess().getSemicolonKeyword_2_1());
                          
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
    // $ANTLR end "ruleIterationStatement"


    // $ANTLR start "entryRuleFunctionStatement"
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:335:1: entryRuleFunctionStatement returns [EObject current=null] : iv_ruleFunctionStatement= ruleFunctionStatement EOF ;
    public final EObject entryRuleFunctionStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionStatement = null;


        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:336:2: (iv_ruleFunctionStatement= ruleFunctionStatement EOF )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:337:2: iv_ruleFunctionStatement= ruleFunctionStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunctionStatementRule()); 
            }
            pushFollow(FOLLOW_ruleFunctionStatement_in_entryRuleFunctionStatement839);
            iv_ruleFunctionStatement=ruleFunctionStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFunctionStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionStatement849); if (state.failed) return current;

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
    // $ANTLR end "entryRuleFunctionStatement"


    // $ANTLR start "ruleFunctionStatement"
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:344:1: ruleFunctionStatement returns [EObject current=null] : (this_Statement_0= ruleStatement | (this_ReturnStatement_1= ruleReturnStatement otherlv_2= ';' ) ) ;
    public final EObject ruleFunctionStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Statement_0 = null;

        EObject this_ReturnStatement_1 = null;


         enterRule(); 
            
        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:347:28: ( (this_Statement_0= ruleStatement | (this_ReturnStatement_1= ruleReturnStatement otherlv_2= ';' ) ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:348:1: (this_Statement_0= ruleStatement | (this_ReturnStatement_1= ruleReturnStatement otherlv_2= ';' ) )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:348:1: (this_Statement_0= ruleStatement | (this_ReturnStatement_1= ruleReturnStatement otherlv_2= ';' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID||(LA5_0>=12 && LA5_0<=13)||LA5_0==18||(LA5_0>=22 && LA5_0<=23)||LA5_0==26) ) {
                alt5=1;
            }
            else if ( (LA5_0==52) ) {
                alt5=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:349:5: this_Statement_0= ruleStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getFunctionStatementAccess().getStatementParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStatement_in_ruleFunctionStatement896);
                    this_Statement_0=ruleStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Statement_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:358:6: (this_ReturnStatement_1= ruleReturnStatement otherlv_2= ';' )
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:358:6: (this_ReturnStatement_1= ruleReturnStatement otherlv_2= ';' )
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:359:5: this_ReturnStatement_1= ruleReturnStatement otherlv_2= ';'
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getFunctionStatementAccess().getReturnStatementParserRuleCall_1_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleReturnStatement_in_ruleFunctionStatement924);
                    this_ReturnStatement_1=ruleReturnStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ReturnStatement_1; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleFunctionStatement935); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getFunctionStatementAccess().getSemicolonKeyword_1_1());
                          
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
    // $ANTLR end "ruleFunctionStatement"


    // $ANTLR start "entryRuleFunctionStatementBlock"
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:379:1: entryRuleFunctionStatementBlock returns [EObject current=null] : iv_ruleFunctionStatementBlock= ruleFunctionStatementBlock EOF ;
    public final EObject entryRuleFunctionStatementBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionStatementBlock = null;


        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:380:2: (iv_ruleFunctionStatementBlock= ruleFunctionStatementBlock EOF )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:381:2: iv_ruleFunctionStatementBlock= ruleFunctionStatementBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunctionStatementBlockRule()); 
            }
            pushFollow(FOLLOW_ruleFunctionStatementBlock_in_entryRuleFunctionStatementBlock972);
            iv_ruleFunctionStatementBlock=ruleFunctionStatementBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFunctionStatementBlock; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionStatementBlock982); if (state.failed) return current;

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
    // $ANTLR end "entryRuleFunctionStatementBlock"


    // $ANTLR start "ruleFunctionStatementBlock"
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:388:1: ruleFunctionStatementBlock returns [EObject current=null] : (otherlv_0= '{' () ( (lv_statements_2_0= ruleFunctionStatement ) )* otherlv_3= '}' ) ;
    public final EObject ruleFunctionStatementBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject lv_statements_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:391:28: ( (otherlv_0= '{' () ( (lv_statements_2_0= ruleFunctionStatement ) )* otherlv_3= '}' ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:392:1: (otherlv_0= '{' () ( (lv_statements_2_0= ruleFunctionStatement ) )* otherlv_3= '}' )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:392:1: (otherlv_0= '{' () ( (lv_statements_2_0= ruleFunctionStatement ) )* otherlv_3= '}' )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:392:3: otherlv_0= '{' () ( (lv_statements_2_0= ruleFunctionStatement ) )* otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleFunctionStatementBlock1019); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getFunctionStatementBlockAccess().getLeftCurlyBracketKeyword_0());
                  
            }
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:396:1: ()
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:397:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getFunctionStatementBlockAccess().getFunctionStatementBlockAction_1(),
                          current);
                  
            }

            }

            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:402:2: ( (lv_statements_2_0= ruleFunctionStatement ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID||(LA6_0>=12 && LA6_0<=13)||LA6_0==18||(LA6_0>=22 && LA6_0<=23)||LA6_0==26||LA6_0==52) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:403:1: (lv_statements_2_0= ruleFunctionStatement )
            	    {
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:403:1: (lv_statements_2_0= ruleFunctionStatement )
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:404:3: lv_statements_2_0= ruleFunctionStatement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getFunctionStatementBlockAccess().getStatementsFunctionStatementParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleFunctionStatement_in_ruleFunctionStatementBlock1049);
            	    lv_statements_2_0=ruleFunctionStatement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getFunctionStatementBlockRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"statements",
            	              		lv_statements_2_0, 
            	              		"FunctionStatement");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleFunctionStatementBlock1062); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getFunctionStatementBlockAccess().getRightCurlyBracketKeyword_3());
                  
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
    // $ANTLR end "ruleFunctionStatementBlock"


    // $ANTLR start "entryRuleBreakStatement"
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:432:1: entryRuleBreakStatement returns [EObject current=null] : iv_ruleBreakStatement= ruleBreakStatement EOF ;
    public final EObject entryRuleBreakStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBreakStatement = null;


        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:433:2: (iv_ruleBreakStatement= ruleBreakStatement EOF )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:434:2: iv_ruleBreakStatement= ruleBreakStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBreakStatementRule()); 
            }
            pushFollow(FOLLOW_ruleBreakStatement_in_entryRuleBreakStatement1098);
            iv_ruleBreakStatement=ruleBreakStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBreakStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBreakStatement1108); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBreakStatement"


    // $ANTLR start "ruleBreakStatement"
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:441:1: ruleBreakStatement returns [EObject current=null] : ( () otherlv_1= 'break' ) ;
    public final EObject ruleBreakStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:444:28: ( ( () otherlv_1= 'break' ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:445:1: ( () otherlv_1= 'break' )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:445:1: ( () otherlv_1= 'break' )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:445:2: () otherlv_1= 'break'
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:445:2: ()
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:446:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getBreakStatementAccess().getBreakStatementAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,15,FOLLOW_15_in_ruleBreakStatement1154); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getBreakStatementAccess().getBreakKeyword_1());
                  
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
    // $ANTLR end "ruleBreakStatement"


    // $ANTLR start "entryRuleContinueStatement"
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:463:1: entryRuleContinueStatement returns [EObject current=null] : iv_ruleContinueStatement= ruleContinueStatement EOF ;
    public final EObject entryRuleContinueStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContinueStatement = null;


        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:464:2: (iv_ruleContinueStatement= ruleContinueStatement EOF )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:465:2: iv_ruleContinueStatement= ruleContinueStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getContinueStatementRule()); 
            }
            pushFollow(FOLLOW_ruleContinueStatement_in_entryRuleContinueStatement1190);
            iv_ruleContinueStatement=ruleContinueStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleContinueStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleContinueStatement1200); if (state.failed) return current;

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
    // $ANTLR end "entryRuleContinueStatement"


    // $ANTLR start "ruleContinueStatement"
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:472:1: ruleContinueStatement returns [EObject current=null] : ( () otherlv_1= 'continue' ) ;
    public final EObject ruleContinueStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:475:28: ( ( () otherlv_1= 'continue' ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:476:1: ( () otherlv_1= 'continue' )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:476:1: ( () otherlv_1= 'continue' )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:476:2: () otherlv_1= 'continue'
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:476:2: ()
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:477:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getContinueStatementAccess().getContinueStatementAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleContinueStatement1246); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getContinueStatementAccess().getContinueKeyword_1());
                  
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
    // $ANTLR end "ruleContinueStatement"


    // $ANTLR start "entryRuleStatementBlock"
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:494:1: entryRuleStatementBlock returns [EObject current=null] : iv_ruleStatementBlock= ruleStatementBlock EOF ;
    public final EObject entryRuleStatementBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatementBlock = null;


        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:495:2: (iv_ruleStatementBlock= ruleStatementBlock EOF )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:496:2: iv_ruleStatementBlock= ruleStatementBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatementBlockRule()); 
            }
            pushFollow(FOLLOW_ruleStatementBlock_in_entryRuleStatementBlock1282);
            iv_ruleStatementBlock=ruleStatementBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStatementBlock; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatementBlock1292); if (state.failed) return current;

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
    // $ANTLR end "entryRuleStatementBlock"


    // $ANTLR start "ruleStatementBlock"
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:503:1: ruleStatementBlock returns [EObject current=null] : (otherlv_0= '{' () ( (lv_statements_2_0= ruleStatement ) )* otherlv_3= '}' ) ;
    public final EObject ruleStatementBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject lv_statements_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:506:28: ( (otherlv_0= '{' () ( (lv_statements_2_0= ruleStatement ) )* otherlv_3= '}' ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:507:1: (otherlv_0= '{' () ( (lv_statements_2_0= ruleStatement ) )* otherlv_3= '}' )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:507:1: (otherlv_0= '{' () ( (lv_statements_2_0= ruleStatement ) )* otherlv_3= '}' )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:507:3: otherlv_0= '{' () ( (lv_statements_2_0= ruleStatement ) )* otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleStatementBlock1329); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getStatementBlockAccess().getLeftCurlyBracketKeyword_0());
                  
            }
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:511:1: ()
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:512:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getStatementBlockAccess().getStatementBlockAction_1(),
                          current);
                  
            }

            }

            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:517:2: ( (lv_statements_2_0= ruleStatement ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID||(LA7_0>=12 && LA7_0<=13)||LA7_0==18||(LA7_0>=22 && LA7_0<=23)||LA7_0==26) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:518:1: (lv_statements_2_0= ruleStatement )
            	    {
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:518:1: (lv_statements_2_0= ruleStatement )
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:519:3: lv_statements_2_0= ruleStatement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getStatementBlockAccess().getStatementsStatementParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleStatement_in_ruleStatementBlock1359);
            	    lv_statements_2_0=ruleStatement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getStatementBlockRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"statements",
            	              		lv_statements_2_0, 
            	              		"Statement");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleStatementBlock1372); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getStatementBlockAccess().getRightCurlyBracketKeyword_3());
                  
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
    // $ANTLR end "ruleStatementBlock"


    // $ANTLR start "entryRuleAffectation"
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:547:1: entryRuleAffectation returns [EObject current=null] : iv_ruleAffectation= ruleAffectation EOF ;
    public final EObject entryRuleAffectation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAffectation = null;


        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:548:2: (iv_ruleAffectation= ruleAffectation EOF )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:549:2: iv_ruleAffectation= ruleAffectation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAffectationRule()); 
            }
            pushFollow(FOLLOW_ruleAffectation_in_entryRuleAffectation1408);
            iv_ruleAffectation=ruleAffectation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAffectation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAffectation1418); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAffectation"


    // $ANTLR start "ruleAffectation"
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:556:1: ruleAffectation returns [EObject current=null] : ( ( (lv_variable_0_0= ruleVariableReference ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) ) ) ;
    public final EObject ruleAffectation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_variable_0_0 = null;

        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:559:28: ( ( ( (lv_variable_0_0= ruleVariableReference ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) ) ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:560:1: ( ( (lv_variable_0_0= ruleVariableReference ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) ) )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:560:1: ( ( (lv_variable_0_0= ruleVariableReference ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:560:2: ( (lv_variable_0_0= ruleVariableReference ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:560:2: ( (lv_variable_0_0= ruleVariableReference ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:561:1: (lv_variable_0_0= ruleVariableReference )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:561:1: (lv_variable_0_0= ruleVariableReference )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:562:3: lv_variable_0_0= ruleVariableReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAffectationAccess().getVariableVariableReferenceParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVariableReference_in_ruleAffectation1464);
            lv_variable_0_0=ruleVariableReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAffectationRule());
              	        }
                     		set(
                     			current, 
                     			"variable",
                      		lv_variable_0_0, 
                      		"VariableReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleAffectation1476); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getAffectationAccess().getEqualsSignKeyword_1());
                  
            }
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:582:1: ( (lv_value_2_0= ruleExpression ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:583:1: (lv_value_2_0= ruleExpression )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:583:1: (lv_value_2_0= ruleExpression )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:584:3: lv_value_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAffectationAccess().getValueExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleAffectation1497);
            lv_value_2_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAffectationRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_2_0, 
                      		"Expression");
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
    // $ANTLR end "ruleAffectation"


    // $ANTLR start "entryRuleIf"
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:608:1: entryRuleIf returns [EObject current=null] : iv_ruleIf= ruleIf EOF ;
    public final EObject entryRuleIf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIf = null;


        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:609:2: (iv_ruleIf= ruleIf EOF )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:610:2: iv_ruleIf= ruleIf EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIfRule()); 
            }
            pushFollow(FOLLOW_ruleIf_in_entryRuleIf1533);
            iv_ruleIf=ruleIf();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIf; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIf1543); if (state.failed) return current;

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
    // $ANTLR end "entryRuleIf"


    // $ANTLR start "ruleIf"
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:617:1: ruleIf returns [EObject current=null] : (otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_then_4_0= ruleStatement ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleStatement ) ) )? ) ;
    public final EObject ruleIf() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_condition_2_0 = null;

        EObject lv_then_4_0 = null;

        EObject lv_else_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:620:28: ( (otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_then_4_0= ruleStatement ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleStatement ) ) )? ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:621:1: (otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_then_4_0= ruleStatement ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleStatement ) ) )? )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:621:1: (otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_then_4_0= ruleStatement ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleStatement ) ) )? )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:621:3: otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_then_4_0= ruleStatement ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleStatement ) ) )?
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleIf1580); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getIfAccess().getIfKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleIf1592); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getIfAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:629:1: ( (lv_condition_2_0= ruleExpression ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:630:1: (lv_condition_2_0= ruleExpression )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:630:1: (lv_condition_2_0= ruleExpression )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:631:3: lv_condition_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIfAccess().getConditionExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleIf1613);
            lv_condition_2_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getIfRule());
              	        }
                     		set(
                     			current, 
                     			"condition",
                      		lv_condition_2_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleIf1625); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getIfAccess().getRightParenthesisKeyword_3());
                  
            }
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:651:1: ( (lv_then_4_0= ruleStatement ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:652:1: (lv_then_4_0= ruleStatement )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:652:1: (lv_then_4_0= ruleStatement )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:653:3: lv_then_4_0= ruleStatement
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIfAccess().getThenStatementParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleStatement_in_ruleIf1646);
            lv_then_4_0=ruleStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getIfRule());
              	        }
                     		set(
                     			current, 
                     			"then",
                      		lv_then_4_0, 
                      		"Statement");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:669:2: ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleStatement ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==21) ) {
                int LA8_1 = input.LA(2);

                if ( (synpred1_InternalLeek()) ) {
                    alt8=1;
                }
            }
            switch (alt8) {
                case 1 :
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:669:3: ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleStatement ) )
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:669:3: ( ( 'else' )=>otherlv_5= 'else' )
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:669:4: ( 'else' )=>otherlv_5= 'else'
                    {
                    otherlv_5=(Token)match(input,21,FOLLOW_21_in_ruleIf1667); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getIfAccess().getElseKeyword_5_0());
                          
                    }

                    }

                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:674:2: ( (lv_else_6_0= ruleStatement ) )
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:675:1: (lv_else_6_0= ruleStatement )
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:675:1: (lv_else_6_0= ruleStatement )
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:676:3: lv_else_6_0= ruleStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIfAccess().getElseStatementParserRuleCall_5_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStatement_in_ruleIf1689);
                    lv_else_6_0=ruleStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getIfRule());
                      	        }
                             		set(
                             			current, 
                             			"else",
                              		lv_else_6_0, 
                              		"Statement");
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
    // $ANTLR end "ruleIf"


    // $ANTLR start "entryRuleIteration"
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:700:1: entryRuleIteration returns [EObject current=null] : iv_ruleIteration= ruleIteration EOF ;
    public final EObject entryRuleIteration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIteration = null;


        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:701:2: (iv_ruleIteration= ruleIteration EOF )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:702:2: iv_ruleIteration= ruleIteration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIterationRule()); 
            }
            pushFollow(FOLLOW_ruleIteration_in_entryRuleIteration1727);
            iv_ruleIteration=ruleIteration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIteration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIteration1737); if (state.failed) return current;

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
    // $ANTLR end "entryRuleIteration"


    // $ANTLR start "ruleIteration"
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:709:1: ruleIteration returns [EObject current=null] : (this_While_0= ruleWhile | this_ForIn_1= ruleForIn | this_For_2= ruleFor ) ;
    public final EObject ruleIteration() throws RecognitionException {
        EObject current = null;

        EObject this_While_0 = null;

        EObject this_ForIn_1 = null;

        EObject this_For_2 = null;


         enterRule(); 
            
        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:712:28: ( (this_While_0= ruleWhile | this_ForIn_1= ruleForIn | this_For_2= ruleFor ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:713:1: (this_While_0= ruleWhile | this_ForIn_1= ruleForIn | this_For_2= ruleFor )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:713:1: (this_While_0= ruleWhile | this_ForIn_1= ruleForIn | this_For_2= ruleFor )
            int alt9=3;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==22) ) {
                alt9=1;
            }
            else if ( (LA9_0==23) ) {
                int LA9_2 = input.LA(2);

                if ( (LA9_2==19) ) {
                    int LA9_3 = input.LA(3);

                    if ( (LA9_3==RULE_ID) ) {
                        int LA9_4 = input.LA(4);

                        if ( ((LA9_4>=24 && LA9_4<=25)) ) {
                            alt9=2;
                        }
                        else if ( (LA9_4==12||LA9_4==50) ) {
                            alt9=3;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 9, 4, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA9_3==26) ) {
                        alt9=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 9, 3, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:714:5: this_While_0= ruleWhile
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getIterationAccess().getWhileParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleWhile_in_ruleIteration1784);
                    this_While_0=ruleWhile();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_While_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:724:5: this_ForIn_1= ruleForIn
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getIterationAccess().getForInParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleForIn_in_ruleIteration1811);
                    this_ForIn_1=ruleForIn();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ForIn_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:734:5: this_For_2= ruleFor
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getIterationAccess().getForParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleFor_in_ruleIteration1838);
                    this_For_2=ruleFor();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_For_2; 
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
    // $ANTLR end "ruleIteration"


    // $ANTLR start "entryRuleWhile"
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:750:1: entryRuleWhile returns [EObject current=null] : iv_ruleWhile= ruleWhile EOF ;
    public final EObject entryRuleWhile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhile = null;


        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:751:2: (iv_ruleWhile= ruleWhile EOF )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:752:2: iv_ruleWhile= ruleWhile EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getWhileRule()); 
            }
            pushFollow(FOLLOW_ruleWhile_in_entryRuleWhile1873);
            iv_ruleWhile=ruleWhile();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleWhile; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleWhile1883); if (state.failed) return current;

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
    // $ANTLR end "entryRuleWhile"


    // $ANTLR start "ruleWhile"
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:759:1: ruleWhile returns [EObject current=null] : (otherlv_0= 'while' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_statement_4_0= ruleIterationStatement ) ) ) ;
    public final EObject ruleWhile() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_condition_2_0 = null;

        EObject lv_statement_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:762:28: ( (otherlv_0= 'while' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_statement_4_0= ruleIterationStatement ) ) ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:763:1: (otherlv_0= 'while' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_statement_4_0= ruleIterationStatement ) ) )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:763:1: (otherlv_0= 'while' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_statement_4_0= ruleIterationStatement ) ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:763:3: otherlv_0= 'while' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_statement_4_0= ruleIterationStatement ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_22_in_ruleWhile1920); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getWhileAccess().getWhileKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleWhile1932); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getWhileAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:771:1: ( (lv_condition_2_0= ruleExpression ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:772:1: (lv_condition_2_0= ruleExpression )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:772:1: (lv_condition_2_0= ruleExpression )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:773:3: lv_condition_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getWhileAccess().getConditionExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleWhile1953);
            lv_condition_2_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getWhileRule());
              	        }
                     		set(
                     			current, 
                     			"condition",
                      		lv_condition_2_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleWhile1965); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getWhileAccess().getRightParenthesisKeyword_3());
                  
            }
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:793:1: ( (lv_statement_4_0= ruleIterationStatement ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:794:1: (lv_statement_4_0= ruleIterationStatement )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:794:1: (lv_statement_4_0= ruleIterationStatement )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:795:3: lv_statement_4_0= ruleIterationStatement
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getWhileAccess().getStatementIterationStatementParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleIterationStatement_in_ruleWhile1986);
            lv_statement_4_0=ruleIterationStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getWhileRule());
              	        }
                     		set(
                     			current, 
                     			"statement",
                      		lv_statement_4_0, 
                      		"IterationStatement");
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
    // $ANTLR end "ruleWhile"


    // $ANTLR start "entryRuleFor"
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:819:1: entryRuleFor returns [EObject current=null] : iv_ruleFor= ruleFor EOF ;
    public final EObject entryRuleFor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFor = null;


        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:820:2: (iv_ruleFor= ruleFor EOF )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:821:2: iv_ruleFor= ruleFor EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getForRule()); 
            }
            pushFollow(FOLLOW_ruleFor_in_entryRuleFor2022);
            iv_ruleFor=ruleFor();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFor; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFor2032); if (state.failed) return current;

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
    // $ANTLR end "entryRuleFor"


    // $ANTLR start "ruleFor"
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:828:1: ruleFor returns [EObject current=null] : (otherlv_0= 'for' otherlv_1= '(' ( (lv_initializer_2_0= ruleForInitializer ) ) otherlv_3= ';' ( (lv_condition_4_0= ruleExpression ) ) otherlv_5= ';' ( (lv_increment_6_0= ruleExpression ) ) otherlv_7= ')' ( (lv_statement_8_0= ruleIterationStatement ) ) ) ;
    public final EObject ruleFor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_initializer_2_0 = null;

        EObject lv_condition_4_0 = null;

        EObject lv_increment_6_0 = null;

        EObject lv_statement_8_0 = null;


         enterRule(); 
            
        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:831:28: ( (otherlv_0= 'for' otherlv_1= '(' ( (lv_initializer_2_0= ruleForInitializer ) ) otherlv_3= ';' ( (lv_condition_4_0= ruleExpression ) ) otherlv_5= ';' ( (lv_increment_6_0= ruleExpression ) ) otherlv_7= ')' ( (lv_statement_8_0= ruleIterationStatement ) ) ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:832:1: (otherlv_0= 'for' otherlv_1= '(' ( (lv_initializer_2_0= ruleForInitializer ) ) otherlv_3= ';' ( (lv_condition_4_0= ruleExpression ) ) otherlv_5= ';' ( (lv_increment_6_0= ruleExpression ) ) otherlv_7= ')' ( (lv_statement_8_0= ruleIterationStatement ) ) )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:832:1: (otherlv_0= 'for' otherlv_1= '(' ( (lv_initializer_2_0= ruleForInitializer ) ) otherlv_3= ';' ( (lv_condition_4_0= ruleExpression ) ) otherlv_5= ';' ( (lv_increment_6_0= ruleExpression ) ) otherlv_7= ')' ( (lv_statement_8_0= ruleIterationStatement ) ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:832:3: otherlv_0= 'for' otherlv_1= '(' ( (lv_initializer_2_0= ruleForInitializer ) ) otherlv_3= ';' ( (lv_condition_4_0= ruleExpression ) ) otherlv_5= ';' ( (lv_increment_6_0= ruleExpression ) ) otherlv_7= ')' ( (lv_statement_8_0= ruleIterationStatement ) )
            {
            otherlv_0=(Token)match(input,23,FOLLOW_23_in_ruleFor2069); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getForAccess().getForKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleFor2081); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getForAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:840:1: ( (lv_initializer_2_0= ruleForInitializer ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:841:1: (lv_initializer_2_0= ruleForInitializer )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:841:1: (lv_initializer_2_0= ruleForInitializer )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:842:3: lv_initializer_2_0= ruleForInitializer
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getForAccess().getInitializerForInitializerParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleForInitializer_in_ruleFor2102);
            lv_initializer_2_0=ruleForInitializer();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getForRule());
              	        }
                     		set(
                     			current, 
                     			"initializer",
                      		lv_initializer_2_0, 
                      		"ForInitializer");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_12_in_ruleFor2114); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getForAccess().getSemicolonKeyword_3());
                  
            }
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:862:1: ( (lv_condition_4_0= ruleExpression ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:863:1: (lv_condition_4_0= ruleExpression )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:863:1: (lv_condition_4_0= ruleExpression )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:864:3: lv_condition_4_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getForAccess().getConditionExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleFor2135);
            lv_condition_4_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getForRule());
              	        }
                     		set(
                     			current, 
                     			"condition",
                      		lv_condition_4_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,12,FOLLOW_12_in_ruleFor2147); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getForAccess().getSemicolonKeyword_5());
                  
            }
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:884:1: ( (lv_increment_6_0= ruleExpression ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:885:1: (lv_increment_6_0= ruleExpression )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:885:1: (lv_increment_6_0= ruleExpression )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:886:3: lv_increment_6_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getForAccess().getIncrementExpressionParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleFor2168);
            lv_increment_6_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getForRule());
              	        }
                     		set(
                     			current, 
                     			"increment",
                      		lv_increment_6_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_7=(Token)match(input,20,FOLLOW_20_in_ruleFor2180); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getForAccess().getRightParenthesisKeyword_7());
                  
            }
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:906:1: ( (lv_statement_8_0= ruleIterationStatement ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:907:1: (lv_statement_8_0= ruleIterationStatement )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:907:1: (lv_statement_8_0= ruleIterationStatement )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:908:3: lv_statement_8_0= ruleIterationStatement
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getForAccess().getStatementIterationStatementParserRuleCall_8_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleIterationStatement_in_ruleFor2201);
            lv_statement_8_0=ruleIterationStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getForRule());
              	        }
                     		set(
                     			current, 
                     			"statement",
                      		lv_statement_8_0, 
                      		"IterationStatement");
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
    // $ANTLR end "ruleFor"


    // $ANTLR start "entryRuleForIn"
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:932:1: entryRuleForIn returns [EObject current=null] : iv_ruleForIn= ruleForIn EOF ;
    public final EObject entryRuleForIn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForIn = null;


        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:933:2: (iv_ruleForIn= ruleForIn EOF )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:934:2: iv_ruleForIn= ruleForIn EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getForInRule()); 
            }
            pushFollow(FOLLOW_ruleForIn_in_entryRuleForIn2237);
            iv_ruleForIn=ruleForIn();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleForIn; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleForIn2247); if (state.failed) return current;

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
    // $ANTLR end "entryRuleForIn"


    // $ANTLR start "ruleForIn"
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:941:1: ruleForIn returns [EObject current=null] : (otherlv_0= 'for' otherlv_1= '(' ( ( (lv_key_2_0= ruleForInVariableReference ) ) otherlv_3= ':' )? ( (lv_value_4_0= ruleForInVariableReference ) ) otherlv_5= 'in' ( (lv_array_6_0= ruleExpression ) ) otherlv_7= ')' ( (lv_statement_8_0= ruleIterationStatement ) ) ) ;
    public final EObject ruleForIn() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_key_2_0 = null;

        EObject lv_value_4_0 = null;

        EObject lv_array_6_0 = null;

        EObject lv_statement_8_0 = null;


         enterRule(); 
            
        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:944:28: ( (otherlv_0= 'for' otherlv_1= '(' ( ( (lv_key_2_0= ruleForInVariableReference ) ) otherlv_3= ':' )? ( (lv_value_4_0= ruleForInVariableReference ) ) otherlv_5= 'in' ( (lv_array_6_0= ruleExpression ) ) otherlv_7= ')' ( (lv_statement_8_0= ruleIterationStatement ) ) ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:945:1: (otherlv_0= 'for' otherlv_1= '(' ( ( (lv_key_2_0= ruleForInVariableReference ) ) otherlv_3= ':' )? ( (lv_value_4_0= ruleForInVariableReference ) ) otherlv_5= 'in' ( (lv_array_6_0= ruleExpression ) ) otherlv_7= ')' ( (lv_statement_8_0= ruleIterationStatement ) ) )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:945:1: (otherlv_0= 'for' otherlv_1= '(' ( ( (lv_key_2_0= ruleForInVariableReference ) ) otherlv_3= ':' )? ( (lv_value_4_0= ruleForInVariableReference ) ) otherlv_5= 'in' ( (lv_array_6_0= ruleExpression ) ) otherlv_7= ')' ( (lv_statement_8_0= ruleIterationStatement ) ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:945:3: otherlv_0= 'for' otherlv_1= '(' ( ( (lv_key_2_0= ruleForInVariableReference ) ) otherlv_3= ':' )? ( (lv_value_4_0= ruleForInVariableReference ) ) otherlv_5= 'in' ( (lv_array_6_0= ruleExpression ) ) otherlv_7= ')' ( (lv_statement_8_0= ruleIterationStatement ) )
            {
            otherlv_0=(Token)match(input,23,FOLLOW_23_in_ruleForIn2284); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getForInAccess().getForKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleForIn2296); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getForInAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:953:1: ( ( (lv_key_2_0= ruleForInVariableReference ) ) otherlv_3= ':' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==26) ) {
                int LA10_1 = input.LA(2);

                if ( (LA10_1==RULE_ID) ) {
                    int LA10_3 = input.LA(3);

                    if ( (LA10_3==24) ) {
                        alt10=1;
                    }
                }
            }
            else if ( (LA10_0==RULE_ID) ) {
                int LA10_2 = input.LA(2);

                if ( (LA10_2==24) ) {
                    alt10=1;
                }
            }
            switch (alt10) {
                case 1 :
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:953:2: ( (lv_key_2_0= ruleForInVariableReference ) ) otherlv_3= ':'
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:953:2: ( (lv_key_2_0= ruleForInVariableReference ) )
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:954:1: (lv_key_2_0= ruleForInVariableReference )
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:954:1: (lv_key_2_0= ruleForInVariableReference )
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:955:3: lv_key_2_0= ruleForInVariableReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getForInAccess().getKeyForInVariableReferenceParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleForInVariableReference_in_ruleForIn2318);
                    lv_key_2_0=ruleForInVariableReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getForInRule());
                      	        }
                             		set(
                             			current, 
                             			"key",
                              		lv_key_2_0, 
                              		"ForInVariableReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_3=(Token)match(input,24,FOLLOW_24_in_ruleForIn2330); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getForInAccess().getColonKeyword_2_1());
                          
                    }

                    }
                    break;

            }

            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:975:3: ( (lv_value_4_0= ruleForInVariableReference ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:976:1: (lv_value_4_0= ruleForInVariableReference )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:976:1: (lv_value_4_0= ruleForInVariableReference )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:977:3: lv_value_4_0= ruleForInVariableReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getForInAccess().getValueForInVariableReferenceParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleForInVariableReference_in_ruleForIn2353);
            lv_value_4_0=ruleForInVariableReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getForInRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_4_0, 
                      		"ForInVariableReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,25,FOLLOW_25_in_ruleForIn2365); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getForInAccess().getInKeyword_4());
                  
            }
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:997:1: ( (lv_array_6_0= ruleExpression ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:998:1: (lv_array_6_0= ruleExpression )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:998:1: (lv_array_6_0= ruleExpression )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:999:3: lv_array_6_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getForInAccess().getArrayExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleForIn2386);
            lv_array_6_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getForInRule());
              	        }
                     		set(
                     			current, 
                     			"array",
                      		lv_array_6_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_7=(Token)match(input,20,FOLLOW_20_in_ruleForIn2398); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getForInAccess().getRightParenthesisKeyword_6());
                  
            }
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1019:1: ( (lv_statement_8_0= ruleIterationStatement ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1020:1: (lv_statement_8_0= ruleIterationStatement )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1020:1: (lv_statement_8_0= ruleIterationStatement )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1021:3: lv_statement_8_0= ruleIterationStatement
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getForInAccess().getStatementIterationStatementParserRuleCall_7_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleIterationStatement_in_ruleForIn2419);
            lv_statement_8_0=ruleIterationStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getForInRule());
              	        }
                     		set(
                     			current, 
                     			"statement",
                      		lv_statement_8_0, 
                      		"IterationStatement");
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
    // $ANTLR end "ruleForIn"


    // $ANTLR start "entryRuleForInVariableReference"
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1045:1: entryRuleForInVariableReference returns [EObject current=null] : iv_ruleForInVariableReference= ruleForInVariableReference EOF ;
    public final EObject entryRuleForInVariableReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForInVariableReference = null;


        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1046:2: (iv_ruleForInVariableReference= ruleForInVariableReference EOF )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1047:2: iv_ruleForInVariableReference= ruleForInVariableReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getForInVariableReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleForInVariableReference_in_entryRuleForInVariableReference2455);
            iv_ruleForInVariableReference=ruleForInVariableReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleForInVariableReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleForInVariableReference2465); if (state.failed) return current;

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
    // $ANTLR end "entryRuleForInVariableReference"


    // $ANTLR start "ruleForInVariableReference"
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1054:1: ruleForInVariableReference returns [EObject current=null] : ( (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) ) | ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleForInVariableReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1057:28: ( ( (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) ) | ( (otherlv_2= RULE_ID ) ) ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1058:1: ( (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) ) | ( (otherlv_2= RULE_ID ) ) )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1058:1: ( (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) ) | ( (otherlv_2= RULE_ID ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==26) ) {
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
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1058:2: (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) )
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1058:2: (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) )
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1058:4: otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) )
                    {
                    otherlv_0=(Token)match(input,26,FOLLOW_26_in_ruleForInVariableReference2503); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getForInVariableReferenceAccess().getVarKeyword_0_0());
                          
                    }
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1062:1: ( (lv_name_1_0= RULE_ID ) )
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1063:1: (lv_name_1_0= RULE_ID )
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1063:1: (lv_name_1_0= RULE_ID )
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1064:3: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleForInVariableReference2520); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_name_1_0, grammarAccess.getForInVariableReferenceAccess().getNameIDTerminalRuleCall_0_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getForInVariableReferenceRule());
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
                    break;
                case 2 :
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1081:6: ( (otherlv_2= RULE_ID ) )
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1081:6: ( (otherlv_2= RULE_ID ) )
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1082:1: (otherlv_2= RULE_ID )
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1082:1: (otherlv_2= RULE_ID )
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1083:3: otherlv_2= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getForInVariableReferenceRule());
                      	        }
                              
                    }
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleForInVariableReference2552); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_2, grammarAccess.getForInVariableReferenceAccess().getVariableVariableReferenceCrossReference_1_0()); 
                      	
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
    // $ANTLR end "ruleForInVariableReference"


    // $ANTLR start "entryRuleForInitializer"
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1102:1: entryRuleForInitializer returns [EObject current=null] : iv_ruleForInitializer= ruleForInitializer EOF ;
    public final EObject entryRuleForInitializer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForInitializer = null;


        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1103:2: (iv_ruleForInitializer= ruleForInitializer EOF )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1104:2: iv_ruleForInitializer= ruleForInitializer EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getForInitializerRule()); 
            }
            pushFollow(FOLLOW_ruleForInitializer_in_entryRuleForInitializer2588);
            iv_ruleForInitializer=ruleForInitializer();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleForInitializer; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleForInitializer2598); if (state.failed) return current;

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
    // $ANTLR end "entryRuleForInitializer"


    // $ANTLR start "ruleForInitializer"
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1111:1: ruleForInitializer returns [EObject current=null] : this_VariableReference_0= ruleVariableReference ;
    public final EObject ruleForInitializer() throws RecognitionException {
        EObject current = null;

        EObject this_VariableReference_0 = null;


         enterRule(); 
            
        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1114:28: (this_VariableReference_0= ruleVariableReference )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1116:5: this_VariableReference_0= ruleVariableReference
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getForInitializerAccess().getVariableReferenceParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleVariableReference_in_ruleForInitializer2644);
            this_VariableReference_0=ruleVariableReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_VariableReference_0; 
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
    // $ANTLR end "ruleForInitializer"


    // $ANTLR start "entryRuleFunctionDeclaration"
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1132:1: entryRuleFunctionDeclaration returns [EObject current=null] : iv_ruleFunctionDeclaration= ruleFunctionDeclaration EOF ;
    public final EObject entryRuleFunctionDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionDeclaration = null;


        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1133:2: (iv_ruleFunctionDeclaration= ruleFunctionDeclaration EOF )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1134:2: iv_ruleFunctionDeclaration= ruleFunctionDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunctionDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleFunctionDeclaration_in_entryRuleFunctionDeclaration2678);
            iv_ruleFunctionDeclaration=ruleFunctionDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFunctionDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionDeclaration2688); if (state.failed) return current;

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
    // $ANTLR end "entryRuleFunctionDeclaration"


    // $ANTLR start "ruleFunctionDeclaration"
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1141:1: ruleFunctionDeclaration returns [EObject current=null] : (otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleParameterDeclaration ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameterDeclaration ) ) )* )? otherlv_6= ')' ( (lv_body_7_0= ruleFunctionStatementBlock ) ) ) ;
    public final EObject ruleFunctionDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_parameters_3_0 = null;

        EObject lv_parameters_5_0 = null;

        EObject lv_body_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1144:28: ( (otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleParameterDeclaration ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameterDeclaration ) ) )* )? otherlv_6= ')' ( (lv_body_7_0= ruleFunctionStatementBlock ) ) ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1145:1: (otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleParameterDeclaration ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameterDeclaration ) ) )* )? otherlv_6= ')' ( (lv_body_7_0= ruleFunctionStatementBlock ) ) )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1145:1: (otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleParameterDeclaration ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameterDeclaration ) ) )* )? otherlv_6= ')' ( (lv_body_7_0= ruleFunctionStatementBlock ) ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1145:3: otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleParameterDeclaration ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameterDeclaration ) ) )* )? otherlv_6= ')' ( (lv_body_7_0= ruleFunctionStatementBlock ) )
            {
            otherlv_0=(Token)match(input,27,FOLLOW_27_in_ruleFunctionDeclaration2725); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getFunctionDeclarationAccess().getFunctionKeyword_0());
                  
            }
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1149:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1150:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1150:1: (lv_name_1_0= RULE_ID )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1151:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionDeclaration2742); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getFunctionDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getFunctionDeclarationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleFunctionDeclaration2759); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getFunctionDeclarationAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1171:1: ( ( (lv_parameters_3_0= ruleParameterDeclaration ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameterDeclaration ) ) )* )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID||LA13_0==29) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1171:2: ( (lv_parameters_3_0= ruleParameterDeclaration ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameterDeclaration ) ) )*
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1171:2: ( (lv_parameters_3_0= ruleParameterDeclaration ) )
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1172:1: (lv_parameters_3_0= ruleParameterDeclaration )
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1172:1: (lv_parameters_3_0= ruleParameterDeclaration )
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1173:3: lv_parameters_3_0= ruleParameterDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFunctionDeclarationAccess().getParametersParameterDeclarationParserRuleCall_3_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleParameterDeclaration_in_ruleFunctionDeclaration2781);
                    lv_parameters_3_0=ruleParameterDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getFunctionDeclarationRule());
                      	        }
                             		add(
                             			current, 
                             			"parameters",
                              		lv_parameters_3_0, 
                              		"ParameterDeclaration");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1189:2: (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameterDeclaration ) ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==28) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1189:4: otherlv_4= ',' ( (lv_parameters_5_0= ruleParameterDeclaration ) )
                    	    {
                    	    otherlv_4=(Token)match(input,28,FOLLOW_28_in_ruleFunctionDeclaration2794); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getFunctionDeclarationAccess().getCommaKeyword_3_1_0());
                    	          
                    	    }
                    	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1193:1: ( (lv_parameters_5_0= ruleParameterDeclaration ) )
                    	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1194:1: (lv_parameters_5_0= ruleParameterDeclaration )
                    	    {
                    	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1194:1: (lv_parameters_5_0= ruleParameterDeclaration )
                    	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1195:3: lv_parameters_5_0= ruleParameterDeclaration
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getFunctionDeclarationAccess().getParametersParameterDeclarationParserRuleCall_3_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleParameterDeclaration_in_ruleFunctionDeclaration2815);
                    	    lv_parameters_5_0=ruleParameterDeclaration();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getFunctionDeclarationRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"parameters",
                    	              		lv_parameters_5_0, 
                    	              		"ParameterDeclaration");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,20,FOLLOW_20_in_ruleFunctionDeclaration2831); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getFunctionDeclarationAccess().getRightParenthesisKeyword_4());
                  
            }
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1215:1: ( (lv_body_7_0= ruleFunctionStatementBlock ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1216:1: (lv_body_7_0= ruleFunctionStatementBlock )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1216:1: (lv_body_7_0= ruleFunctionStatementBlock )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1217:3: lv_body_7_0= ruleFunctionStatementBlock
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFunctionDeclarationAccess().getBodyFunctionStatementBlockParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFunctionStatementBlock_in_ruleFunctionDeclaration2852);
            lv_body_7_0=ruleFunctionStatementBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getFunctionDeclarationRule());
              	        }
                     		set(
                     			current, 
                     			"body",
                      		lv_body_7_0, 
                      		"FunctionStatementBlock");
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
    // $ANTLR end "ruleFunctionDeclaration"


    // $ANTLR start "entryRuleParameterDeclaration"
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1241:1: entryRuleParameterDeclaration returns [EObject current=null] : iv_ruleParameterDeclaration= ruleParameterDeclaration EOF ;
    public final EObject entryRuleParameterDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterDeclaration = null;


        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1242:2: (iv_ruleParameterDeclaration= ruleParameterDeclaration EOF )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1243:2: iv_ruleParameterDeclaration= ruleParameterDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleParameterDeclaration_in_entryRuleParameterDeclaration2888);
            iv_ruleParameterDeclaration=ruleParameterDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameterDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameterDeclaration2898); if (state.failed) return current;

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
    // $ANTLR end "entryRuleParameterDeclaration"


    // $ANTLR start "ruleParameterDeclaration"
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1250:1: ruleParameterDeclaration returns [EObject current=null] : ( ( (lv_byAdress_0_0= '@' ) )? ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleParameterDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_byAdress_0_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1253:28: ( ( ( (lv_byAdress_0_0= '@' ) )? ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1254:1: ( ( (lv_byAdress_0_0= '@' ) )? ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1254:1: ( ( (lv_byAdress_0_0= '@' ) )? ( (lv_name_1_0= RULE_ID ) ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1254:2: ( (lv_byAdress_0_0= '@' ) )? ( (lv_name_1_0= RULE_ID ) )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1254:2: ( (lv_byAdress_0_0= '@' ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==29) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1255:1: (lv_byAdress_0_0= '@' )
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1255:1: (lv_byAdress_0_0= '@' )
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1256:3: lv_byAdress_0_0= '@'
                    {
                    lv_byAdress_0_0=(Token)match(input,29,FOLLOW_29_in_ruleParameterDeclaration2941); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_byAdress_0_0, grammarAccess.getParameterDeclarationAccess().getByAdressCommercialAtKeyword_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getParameterDeclarationRule());
                      	        }
                             		setWithLastConsumed(current, "byAdress", true, "@");
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1269:3: ( (lv_name_1_0= RULE_ID ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1270:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1270:1: (lv_name_1_0= RULE_ID )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1271:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParameterDeclaration2972); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getParameterDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getParameterDeclarationRule());
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
    // $ANTLR end "ruleParameterDeclaration"


    // $ANTLR start "entryRuleLocalDeclaration"
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1295:1: entryRuleLocalDeclaration returns [EObject current=null] : iv_ruleLocalDeclaration= ruleLocalDeclaration EOF ;
    public final EObject entryRuleLocalDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocalDeclaration = null;


        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1296:2: (iv_ruleLocalDeclaration= ruleLocalDeclaration EOF )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1297:2: iv_ruleLocalDeclaration= ruleLocalDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLocalDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleLocalDeclaration_in_entryRuleLocalDeclaration3013);
            iv_ruleLocalDeclaration=ruleLocalDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLocalDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLocalDeclaration3023); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLocalDeclaration"


    // $ANTLR start "ruleLocalDeclaration"
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1304:1: ruleLocalDeclaration returns [EObject current=null] : (otherlv_0= 'var' ( (lv_variables_1_0= ruleVariableDeclaration ) ) (otherlv_2= ',' ( (lv_variables_3_0= ruleVariableDeclaration ) ) )* ) ;
    public final EObject ruleLocalDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_variables_1_0 = null;

        EObject lv_variables_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1307:28: ( (otherlv_0= 'var' ( (lv_variables_1_0= ruleVariableDeclaration ) ) (otherlv_2= ',' ( (lv_variables_3_0= ruleVariableDeclaration ) ) )* ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1308:1: (otherlv_0= 'var' ( (lv_variables_1_0= ruleVariableDeclaration ) ) (otherlv_2= ',' ( (lv_variables_3_0= ruleVariableDeclaration ) ) )* )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1308:1: (otherlv_0= 'var' ( (lv_variables_1_0= ruleVariableDeclaration ) ) (otherlv_2= ',' ( (lv_variables_3_0= ruleVariableDeclaration ) ) )* )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1308:3: otherlv_0= 'var' ( (lv_variables_1_0= ruleVariableDeclaration ) ) (otherlv_2= ',' ( (lv_variables_3_0= ruleVariableDeclaration ) ) )*
            {
            otherlv_0=(Token)match(input,26,FOLLOW_26_in_ruleLocalDeclaration3060); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getLocalDeclarationAccess().getVarKeyword_0());
                  
            }
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1312:1: ( (lv_variables_1_0= ruleVariableDeclaration ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1313:1: (lv_variables_1_0= ruleVariableDeclaration )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1313:1: (lv_variables_1_0= ruleVariableDeclaration )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1314:3: lv_variables_1_0= ruleVariableDeclaration
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLocalDeclarationAccess().getVariablesVariableDeclarationParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVariableDeclaration_in_ruleLocalDeclaration3081);
            lv_variables_1_0=ruleVariableDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getLocalDeclarationRule());
              	        }
                     		add(
                     			current, 
                     			"variables",
                      		lv_variables_1_0, 
                      		"VariableDeclaration");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1330:2: (otherlv_2= ',' ( (lv_variables_3_0= ruleVariableDeclaration ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==28) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1330:4: otherlv_2= ',' ( (lv_variables_3_0= ruleVariableDeclaration ) )
            	    {
            	    otherlv_2=(Token)match(input,28,FOLLOW_28_in_ruleLocalDeclaration3094); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getLocalDeclarationAccess().getCommaKeyword_2_0());
            	          
            	    }
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1334:1: ( (lv_variables_3_0= ruleVariableDeclaration ) )
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1335:1: (lv_variables_3_0= ruleVariableDeclaration )
            	    {
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1335:1: (lv_variables_3_0= ruleVariableDeclaration )
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1336:3: lv_variables_3_0= ruleVariableDeclaration
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLocalDeclarationAccess().getVariablesVariableDeclarationParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleVariableDeclaration_in_ruleLocalDeclaration3115);
            	    lv_variables_3_0=ruleVariableDeclaration();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getLocalDeclarationRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"variables",
            	              		lv_variables_3_0, 
            	              		"VariableDeclaration");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // $ANTLR end "ruleLocalDeclaration"


    // $ANTLR start "entryRuleGlobalDeclaration"
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1360:1: entryRuleGlobalDeclaration returns [EObject current=null] : iv_ruleGlobalDeclaration= ruleGlobalDeclaration EOF ;
    public final EObject entryRuleGlobalDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGlobalDeclaration = null;


        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1361:2: (iv_ruleGlobalDeclaration= ruleGlobalDeclaration EOF )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1362:2: iv_ruleGlobalDeclaration= ruleGlobalDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGlobalDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleGlobalDeclaration_in_entryRuleGlobalDeclaration3153);
            iv_ruleGlobalDeclaration=ruleGlobalDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGlobalDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGlobalDeclaration3163); if (state.failed) return current;

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
    // $ANTLR end "entryRuleGlobalDeclaration"


    // $ANTLR start "ruleGlobalDeclaration"
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1369:1: ruleGlobalDeclaration returns [EObject current=null] : (otherlv_0= 'global' ( (lv_variables_1_0= ruleVariableDeclaration ) ) (otherlv_2= ',' ( (lv_variables_3_0= ruleVariableDeclaration ) ) )* ) ;
    public final EObject ruleGlobalDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_variables_1_0 = null;

        EObject lv_variables_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1372:28: ( (otherlv_0= 'global' ( (lv_variables_1_0= ruleVariableDeclaration ) ) (otherlv_2= ',' ( (lv_variables_3_0= ruleVariableDeclaration ) ) )* ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1373:1: (otherlv_0= 'global' ( (lv_variables_1_0= ruleVariableDeclaration ) ) (otherlv_2= ',' ( (lv_variables_3_0= ruleVariableDeclaration ) ) )* )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1373:1: (otherlv_0= 'global' ( (lv_variables_1_0= ruleVariableDeclaration ) ) (otherlv_2= ',' ( (lv_variables_3_0= ruleVariableDeclaration ) ) )* )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1373:3: otherlv_0= 'global' ( (lv_variables_1_0= ruleVariableDeclaration ) ) (otherlv_2= ',' ( (lv_variables_3_0= ruleVariableDeclaration ) ) )*
            {
            otherlv_0=(Token)match(input,30,FOLLOW_30_in_ruleGlobalDeclaration3200); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getGlobalDeclarationAccess().getGlobalKeyword_0());
                  
            }
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1377:1: ( (lv_variables_1_0= ruleVariableDeclaration ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1378:1: (lv_variables_1_0= ruleVariableDeclaration )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1378:1: (lv_variables_1_0= ruleVariableDeclaration )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1379:3: lv_variables_1_0= ruleVariableDeclaration
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getGlobalDeclarationAccess().getVariablesVariableDeclarationParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVariableDeclaration_in_ruleGlobalDeclaration3221);
            lv_variables_1_0=ruleVariableDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getGlobalDeclarationRule());
              	        }
                     		add(
                     			current, 
                     			"variables",
                      		lv_variables_1_0, 
                      		"VariableDeclaration");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1395:2: (otherlv_2= ',' ( (lv_variables_3_0= ruleVariableDeclaration ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==28) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1395:4: otherlv_2= ',' ( (lv_variables_3_0= ruleVariableDeclaration ) )
            	    {
            	    otherlv_2=(Token)match(input,28,FOLLOW_28_in_ruleGlobalDeclaration3234); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getGlobalDeclarationAccess().getCommaKeyword_2_0());
            	          
            	    }
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1399:1: ( (lv_variables_3_0= ruleVariableDeclaration ) )
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1400:1: (lv_variables_3_0= ruleVariableDeclaration )
            	    {
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1400:1: (lv_variables_3_0= ruleVariableDeclaration )
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1401:3: lv_variables_3_0= ruleVariableDeclaration
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getGlobalDeclarationAccess().getVariablesVariableDeclarationParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleVariableDeclaration_in_ruleGlobalDeclaration3255);
            	    lv_variables_3_0=ruleVariableDeclaration();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getGlobalDeclarationRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"variables",
            	              		lv_variables_3_0, 
            	              		"VariableDeclaration");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // $ANTLR end "ruleGlobalDeclaration"


    // $ANTLR start "entryRuleVariableDeclaration"
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1425:1: entryRuleVariableDeclaration returns [EObject current=null] : iv_ruleVariableDeclaration= ruleVariableDeclaration EOF ;
    public final EObject entryRuleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDeclaration = null;


        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1426:2: (iv_ruleVariableDeclaration= ruleVariableDeclaration EOF )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1427:2: iv_ruleVariableDeclaration= ruleVariableDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleVariableDeclaration_in_entryRuleVariableDeclaration3293);
            iv_ruleVariableDeclaration=ruleVariableDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariableDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableDeclaration3303); if (state.failed) return current;

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
    // $ANTLR end "entryRuleVariableDeclaration"


    // $ANTLR start "ruleVariableDeclaration"
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1434:1: ruleVariableDeclaration returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) ) )? ) ;
    public final EObject ruleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1437:28: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) ) )? ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1438:1: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) ) )? )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1438:1: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) ) )? )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1438:2: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) ) )?
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1438:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1439:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1439:1: (lv_name_0_0= RULE_ID )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1440:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariableDeclaration3345); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_0_0, grammarAccess.getVariableDeclarationAccess().getNameIDTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getVariableDeclarationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1456:2: (otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==17) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1456:4: otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) )
                    {
                    otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleVariableDeclaration3363); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getVariableDeclarationAccess().getEqualsSignKeyword_1_0());
                          
                    }
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1460:1: ( (lv_value_2_0= ruleExpression ) )
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1461:1: (lv_value_2_0= ruleExpression )
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1461:1: (lv_value_2_0= ruleExpression )
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1462:3: lv_value_2_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getVariableDeclarationAccess().getValueExpressionParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleVariableDeclaration3384);
                    lv_value_2_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getVariableDeclarationRule());
                      	        }
                             		set(
                             			current, 
                             			"value",
                              		lv_value_2_0, 
                              		"Expression");
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
    // $ANTLR end "ruleVariableDeclaration"


    // $ANTLR start "entryRuleExpression"
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1486:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1487:2: (iv_ruleExpression= ruleExpression EOF )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1488:2: iv_ruleExpression= ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression3422);
            iv_ruleExpression=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression3432); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1495:1: ruleExpression returns [EObject current=null] : this_Comparison_0= ruleComparison ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Comparison_0 = null;


         enterRule(); 
            
        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1498:28: (this_Comparison_0= ruleComparison )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1500:5: this_Comparison_0= ruleComparison
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExpressionAccess().getComparisonParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleComparison_in_ruleExpression3478);
            this_Comparison_0=ruleComparison();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_Comparison_0; 
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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleComparison"
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1516:1: entryRuleComparison returns [EObject current=null] : iv_ruleComparison= ruleComparison EOF ;
    public final EObject entryRuleComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparison = null;


        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1517:2: (iv_ruleComparison= ruleComparison EOF )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1518:2: iv_ruleComparison= ruleComparison EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getComparisonRule()); 
            }
            pushFollow(FOLLOW_ruleComparison_in_entryRuleComparison3512);
            iv_ruleComparison=ruleComparison();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleComparison; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleComparison3522); if (state.failed) return current;

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
    // $ANTLR end "entryRuleComparison"


    // $ANTLR start "ruleComparison"
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1525:1: ruleComparison returns [EObject current=null] : (this_Or_0= ruleOr ( ( ( () otherlv_2= '===' ) | ( () otherlv_4= '==' ) | ( () otherlv_6= '!==' ) | ( () otherlv_8= '!=' ) | ( () otherlv_10= '<=' ) | ( () otherlv_12= '<' ) | ( () otherlv_14= '>=' ) | ( () otherlv_16= '>' ) ) ( (lv_right_17_0= ruleOr ) ) )* ) ;
    public final EObject ruleComparison() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        EObject this_Or_0 = null;

        EObject lv_right_17_0 = null;


         enterRule(); 
            
        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1528:28: ( (this_Or_0= ruleOr ( ( ( () otherlv_2= '===' ) | ( () otherlv_4= '==' ) | ( () otherlv_6= '!==' ) | ( () otherlv_8= '!=' ) | ( () otherlv_10= '<=' ) | ( () otherlv_12= '<' ) | ( () otherlv_14= '>=' ) | ( () otherlv_16= '>' ) ) ( (lv_right_17_0= ruleOr ) ) )* ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1529:1: (this_Or_0= ruleOr ( ( ( () otherlv_2= '===' ) | ( () otherlv_4= '==' ) | ( () otherlv_6= '!==' ) | ( () otherlv_8= '!=' ) | ( () otherlv_10= '<=' ) | ( () otherlv_12= '<' ) | ( () otherlv_14= '>=' ) | ( () otherlv_16= '>' ) ) ( (lv_right_17_0= ruleOr ) ) )* )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1529:1: (this_Or_0= ruleOr ( ( ( () otherlv_2= '===' ) | ( () otherlv_4= '==' ) | ( () otherlv_6= '!==' ) | ( () otherlv_8= '!=' ) | ( () otherlv_10= '<=' ) | ( () otherlv_12= '<' ) | ( () otherlv_14= '>=' ) | ( () otherlv_16= '>' ) ) ( (lv_right_17_0= ruleOr ) ) )* )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1530:5: this_Or_0= ruleOr ( ( ( () otherlv_2= '===' ) | ( () otherlv_4= '==' ) | ( () otherlv_6= '!==' ) | ( () otherlv_8= '!=' ) | ( () otherlv_10= '<=' ) | ( () otherlv_12= '<' ) | ( () otherlv_14= '>=' ) | ( () otherlv_16= '>' ) ) ( (lv_right_17_0= ruleOr ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getComparisonAccess().getOrParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleOr_in_ruleComparison3569);
            this_Or_0=ruleOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_Or_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1538:1: ( ( ( () otherlv_2= '===' ) | ( () otherlv_4= '==' ) | ( () otherlv_6= '!==' ) | ( () otherlv_8= '!=' ) | ( () otherlv_10= '<=' ) | ( () otherlv_12= '<' ) | ( () otherlv_14= '>=' ) | ( () otherlv_16= '>' ) ) ( (lv_right_17_0= ruleOr ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=31 && LA19_0<=38)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1538:2: ( ( () otherlv_2= '===' ) | ( () otherlv_4= '==' ) | ( () otherlv_6= '!==' ) | ( () otherlv_8= '!=' ) | ( () otherlv_10= '<=' ) | ( () otherlv_12= '<' ) | ( () otherlv_14= '>=' ) | ( () otherlv_16= '>' ) ) ( (lv_right_17_0= ruleOr ) )
            	    {
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1538:2: ( ( () otherlv_2= '===' ) | ( () otherlv_4= '==' ) | ( () otherlv_6= '!==' ) | ( () otherlv_8= '!=' ) | ( () otherlv_10= '<=' ) | ( () otherlv_12= '<' ) | ( () otherlv_14= '>=' ) | ( () otherlv_16= '>' ) )
            	    int alt18=8;
            	    switch ( input.LA(1) ) {
            	    case 31:
            	        {
            	        alt18=1;
            	        }
            	        break;
            	    case 32:
            	        {
            	        alt18=2;
            	        }
            	        break;
            	    case 33:
            	        {
            	        alt18=3;
            	        }
            	        break;
            	    case 34:
            	        {
            	        alt18=4;
            	        }
            	        break;
            	    case 35:
            	        {
            	        alt18=5;
            	        }
            	        break;
            	    case 36:
            	        {
            	        alt18=6;
            	        }
            	        break;
            	    case 37:
            	        {
            	        alt18=7;
            	        }
            	        break;
            	    case 38:
            	        {
            	        alt18=8;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 18, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt18) {
            	        case 1 :
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1538:3: ( () otherlv_2= '===' )
            	            {
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1538:3: ( () otherlv_2= '===' )
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1538:4: () otherlv_2= '==='
            	            {
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1538:4: ()
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1539:5: 
            	            {
            	            if ( state.backtracking==0 ) {

            	                      current = forceCreateModelElementAndSet(
            	                          grammarAccess.getComparisonAccess().getTypedEqualsLeftAction_1_0_0_0(),
            	                          current);
            	                  
            	            }

            	            }

            	            otherlv_2=(Token)match(input,31,FOLLOW_31_in_ruleComparison3592); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_2, grammarAccess.getComparisonAccess().getEqualsSignEqualsSignEqualsSignKeyword_1_0_0_1());
            	                  
            	            }

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1549:6: ( () otherlv_4= '==' )
            	            {
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1549:6: ( () otherlv_4= '==' )
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1549:7: () otherlv_4= '=='
            	            {
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1549:7: ()
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1550:5: 
            	            {
            	            if ( state.backtracking==0 ) {

            	                      current = forceCreateModelElementAndSet(
            	                          grammarAccess.getComparisonAccess().getEqualsLeftAction_1_0_1_0(),
            	                          current);
            	                  
            	            }

            	            }

            	            otherlv_4=(Token)match(input,32,FOLLOW_32_in_ruleComparison3621); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_4, grammarAccess.getComparisonAccess().getEqualsSignEqualsSignKeyword_1_0_1_1());
            	                  
            	            }

            	            }


            	            }
            	            break;
            	        case 3 :
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1560:6: ( () otherlv_6= '!==' )
            	            {
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1560:6: ( () otherlv_6= '!==' )
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1560:7: () otherlv_6= '!=='
            	            {
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1560:7: ()
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1561:5: 
            	            {
            	            if ( state.backtracking==0 ) {

            	                      current = forceCreateModelElementAndSet(
            	                          grammarAccess.getComparisonAccess().getTypedDifferentLeftAction_1_0_2_0(),
            	                          current);
            	                  
            	            }

            	            }

            	            otherlv_6=(Token)match(input,33,FOLLOW_33_in_ruleComparison3650); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_6, grammarAccess.getComparisonAccess().getExclamationMarkEqualsSignEqualsSignKeyword_1_0_2_1());
            	                  
            	            }

            	            }


            	            }
            	            break;
            	        case 4 :
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1571:6: ( () otherlv_8= '!=' )
            	            {
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1571:6: ( () otherlv_8= '!=' )
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1571:7: () otherlv_8= '!='
            	            {
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1571:7: ()
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1572:5: 
            	            {
            	            if ( state.backtracking==0 ) {

            	                      current = forceCreateModelElementAndSet(
            	                          grammarAccess.getComparisonAccess().getDifferentLeftAction_1_0_3_0(),
            	                          current);
            	                  
            	            }

            	            }

            	            otherlv_8=(Token)match(input,34,FOLLOW_34_in_ruleComparison3679); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_8, grammarAccess.getComparisonAccess().getExclamationMarkEqualsSignKeyword_1_0_3_1());
            	                  
            	            }

            	            }


            	            }
            	            break;
            	        case 5 :
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1582:6: ( () otherlv_10= '<=' )
            	            {
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1582:6: ( () otherlv_10= '<=' )
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1582:7: () otherlv_10= '<='
            	            {
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1582:7: ()
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1583:5: 
            	            {
            	            if ( state.backtracking==0 ) {

            	                      current = forceCreateModelElementAndSet(
            	                          grammarAccess.getComparisonAccess().getLessOrEqualsLeftAction_1_0_4_0(),
            	                          current);
            	                  
            	            }

            	            }

            	            otherlv_10=(Token)match(input,35,FOLLOW_35_in_ruleComparison3708); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_10, grammarAccess.getComparisonAccess().getLessThanSignEqualsSignKeyword_1_0_4_1());
            	                  
            	            }

            	            }


            	            }
            	            break;
            	        case 6 :
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1593:6: ( () otherlv_12= '<' )
            	            {
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1593:6: ( () otherlv_12= '<' )
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1593:7: () otherlv_12= '<'
            	            {
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1593:7: ()
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1594:5: 
            	            {
            	            if ( state.backtracking==0 ) {

            	                      current = forceCreateModelElementAndSet(
            	                          grammarAccess.getComparisonAccess().getLessLeftAction_1_0_5_0(),
            	                          current);
            	                  
            	            }

            	            }

            	            otherlv_12=(Token)match(input,36,FOLLOW_36_in_ruleComparison3737); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_12, grammarAccess.getComparisonAccess().getLessThanSignKeyword_1_0_5_1());
            	                  
            	            }

            	            }


            	            }
            	            break;
            	        case 7 :
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1604:6: ( () otherlv_14= '>=' )
            	            {
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1604:6: ( () otherlv_14= '>=' )
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1604:7: () otherlv_14= '>='
            	            {
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1604:7: ()
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1605:5: 
            	            {
            	            if ( state.backtracking==0 ) {

            	                      current = forceCreateModelElementAndSet(
            	                          grammarAccess.getComparisonAccess().getMoreOrEqualsLeftAction_1_0_6_0(),
            	                          current);
            	                  
            	            }

            	            }

            	            otherlv_14=(Token)match(input,37,FOLLOW_37_in_ruleComparison3766); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_14, grammarAccess.getComparisonAccess().getGreaterThanSignEqualsSignKeyword_1_0_6_1());
            	                  
            	            }

            	            }


            	            }
            	            break;
            	        case 8 :
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1615:6: ( () otherlv_16= '>' )
            	            {
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1615:6: ( () otherlv_16= '>' )
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1615:7: () otherlv_16= '>'
            	            {
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1615:7: ()
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1616:5: 
            	            {
            	            if ( state.backtracking==0 ) {

            	                      current = forceCreateModelElementAndSet(
            	                          grammarAccess.getComparisonAccess().getMoreLeftAction_1_0_7_0(),
            	                          current);
            	                  
            	            }

            	            }

            	            otherlv_16=(Token)match(input,38,FOLLOW_38_in_ruleComparison3795); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_16, grammarAccess.getComparisonAccess().getGreaterThanSignKeyword_1_0_7_1());
            	                  
            	            }

            	            }


            	            }
            	            break;

            	    }

            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1625:3: ( (lv_right_17_0= ruleOr ) )
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1626:1: (lv_right_17_0= ruleOr )
            	    {
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1626:1: (lv_right_17_0= ruleOr )
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1627:3: lv_right_17_0= ruleOr
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getComparisonAccess().getRightOrParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOr_in_ruleComparison3818);
            	    lv_right_17_0=ruleOr();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getComparisonRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_17_0, 
            	              		"Or");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
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
    // $ANTLR end "ruleComparison"


    // $ANTLR start "entryRuleOr"
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1651:1: entryRuleOr returns [EObject current=null] : iv_ruleOr= ruleOr EOF ;
    public final EObject entryRuleOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOr = null;


        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1652:2: (iv_ruleOr= ruleOr EOF )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1653:2: iv_ruleOr= ruleOr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOrRule()); 
            }
            pushFollow(FOLLOW_ruleOr_in_entryRuleOr3856);
            iv_ruleOr=ruleOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOr; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOr3866); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOr"


    // $ANTLR start "ruleOr"
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1660:1: ruleOr returns [EObject current=null] : (this_And_0= ruleAnd ( ( () (otherlv_2= 'or' | otherlv_3= '||' ) ) ( (lv_right_4_0= ruleAnd ) ) )* ) ;
    public final EObject ruleOr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject this_And_0 = null;

        EObject lv_right_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1663:28: ( (this_And_0= ruleAnd ( ( () (otherlv_2= 'or' | otherlv_3= '||' ) ) ( (lv_right_4_0= ruleAnd ) ) )* ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1664:1: (this_And_0= ruleAnd ( ( () (otherlv_2= 'or' | otherlv_3= '||' ) ) ( (lv_right_4_0= ruleAnd ) ) )* )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1664:1: (this_And_0= ruleAnd ( ( () (otherlv_2= 'or' | otherlv_3= '||' ) ) ( (lv_right_4_0= ruleAnd ) ) )* )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1665:5: this_And_0= ruleAnd ( ( () (otherlv_2= 'or' | otherlv_3= '||' ) ) ( (lv_right_4_0= ruleAnd ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getOrAccess().getAndParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleAnd_in_ruleOr3913);
            this_And_0=ruleAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_And_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1673:1: ( ( () (otherlv_2= 'or' | otherlv_3= '||' ) ) ( (lv_right_4_0= ruleAnd ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=39 && LA21_0<=40)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1673:2: ( () (otherlv_2= 'or' | otherlv_3= '||' ) ) ( (lv_right_4_0= ruleAnd ) )
            	    {
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1673:2: ( () (otherlv_2= 'or' | otherlv_3= '||' ) )
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1673:3: () (otherlv_2= 'or' | otherlv_3= '||' )
            	    {
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1673:3: ()
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1674:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getOrAccess().getTypedEqualsLeftAction_1_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1679:2: (otherlv_2= 'or' | otherlv_3= '||' )
            	    int alt20=2;
            	    int LA20_0 = input.LA(1);

            	    if ( (LA20_0==39) ) {
            	        alt20=1;
            	    }
            	    else if ( (LA20_0==40) ) {
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
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1679:4: otherlv_2= 'or'
            	            {
            	            otherlv_2=(Token)match(input,39,FOLLOW_39_in_ruleOr3936); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_2, grammarAccess.getOrAccess().getOrKeyword_1_0_1_0());
            	                  
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1684:7: otherlv_3= '||'
            	            {
            	            otherlv_3=(Token)match(input,40,FOLLOW_40_in_ruleOr3954); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_3, grammarAccess.getOrAccess().getVerticalLineVerticalLineKeyword_1_0_1_1());
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }

            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1688:3: ( (lv_right_4_0= ruleAnd ) )
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1689:1: (lv_right_4_0= ruleAnd )
            	    {
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1689:1: (lv_right_4_0= ruleAnd )
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1690:3: lv_right_4_0= ruleAnd
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getOrAccess().getRightAndParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAnd_in_ruleOr3977);
            	    lv_right_4_0=ruleAnd();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getOrRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_4_0, 
            	              		"And");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
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
    // $ANTLR end "ruleOr"


    // $ANTLR start "entryRuleAnd"
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1714:1: entryRuleAnd returns [EObject current=null] : iv_ruleAnd= ruleAnd EOF ;
    public final EObject entryRuleAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnd = null;


        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1715:2: (iv_ruleAnd= ruleAnd EOF )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1716:2: iv_ruleAnd= ruleAnd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAndRule()); 
            }
            pushFollow(FOLLOW_ruleAnd_in_entryRuleAnd4015);
            iv_ruleAnd=ruleAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAnd; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnd4025); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAnd"


    // $ANTLR start "ruleAnd"
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1723:1: ruleAnd returns [EObject current=null] : (this_Addition_0= ruleAddition ( ( () (otherlv_2= 'and' | otherlv_3= '&&' ) ) ( (lv_right_4_0= ruleAddition ) ) )* ) ;
    public final EObject ruleAnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject this_Addition_0 = null;

        EObject lv_right_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1726:28: ( (this_Addition_0= ruleAddition ( ( () (otherlv_2= 'and' | otherlv_3= '&&' ) ) ( (lv_right_4_0= ruleAddition ) ) )* ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1727:1: (this_Addition_0= ruleAddition ( ( () (otherlv_2= 'and' | otherlv_3= '&&' ) ) ( (lv_right_4_0= ruleAddition ) ) )* )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1727:1: (this_Addition_0= ruleAddition ( ( () (otherlv_2= 'and' | otherlv_3= '&&' ) ) ( (lv_right_4_0= ruleAddition ) ) )* )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1728:5: this_Addition_0= ruleAddition ( ( () (otherlv_2= 'and' | otherlv_3= '&&' ) ) ( (lv_right_4_0= ruleAddition ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getAndAccess().getAdditionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleAddition_in_ruleAnd4072);
            this_Addition_0=ruleAddition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_Addition_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1736:1: ( ( () (otherlv_2= 'and' | otherlv_3= '&&' ) ) ( (lv_right_4_0= ruleAddition ) ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>=41 && LA23_0<=42)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1736:2: ( () (otherlv_2= 'and' | otherlv_3= '&&' ) ) ( (lv_right_4_0= ruleAddition ) )
            	    {
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1736:2: ( () (otherlv_2= 'and' | otherlv_3= '&&' ) )
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1736:3: () (otherlv_2= 'and' | otherlv_3= '&&' )
            	    {
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1736:3: ()
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1737:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getAndAccess().getTypedEqualsLeftAction_1_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1742:2: (otherlv_2= 'and' | otherlv_3= '&&' )
            	    int alt22=2;
            	    int LA22_0 = input.LA(1);

            	    if ( (LA22_0==41) ) {
            	        alt22=1;
            	    }
            	    else if ( (LA22_0==42) ) {
            	        alt22=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 22, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt22) {
            	        case 1 :
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1742:4: otherlv_2= 'and'
            	            {
            	            otherlv_2=(Token)match(input,41,FOLLOW_41_in_ruleAnd4095); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_2, grammarAccess.getAndAccess().getAndKeyword_1_0_1_0());
            	                  
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1747:7: otherlv_3= '&&'
            	            {
            	            otherlv_3=(Token)match(input,42,FOLLOW_42_in_ruleAnd4113); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_3, grammarAccess.getAndAccess().getAmpersandAmpersandKeyword_1_0_1_1());
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }

            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1751:3: ( (lv_right_4_0= ruleAddition ) )
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1752:1: (lv_right_4_0= ruleAddition )
            	    {
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1752:1: (lv_right_4_0= ruleAddition )
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1753:3: lv_right_4_0= ruleAddition
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAndAccess().getRightAdditionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAddition_in_ruleAnd4136);
            	    lv_right_4_0=ruleAddition();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getAndRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_4_0, 
            	              		"Addition");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


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
    // $ANTLR end "ruleAnd"


    // $ANTLR start "entryRuleAddition"
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1777:1: entryRuleAddition returns [EObject current=null] : iv_ruleAddition= ruleAddition EOF ;
    public final EObject entryRuleAddition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddition = null;


        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1778:2: (iv_ruleAddition= ruleAddition EOF )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1779:2: iv_ruleAddition= ruleAddition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAdditionRule()); 
            }
            pushFollow(FOLLOW_ruleAddition_in_entryRuleAddition4174);
            iv_ruleAddition=ruleAddition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAddition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAddition4184); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAddition"


    // $ANTLR start "ruleAddition"
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1786:1: ruleAddition returns [EObject current=null] : (this_Multiplication_0= ruleMultiplication ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )* ) ;
    public final EObject ruleAddition() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_Multiplication_0 = null;

        EObject lv_right_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1789:28: ( (this_Multiplication_0= ruleMultiplication ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )* ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1790:1: (this_Multiplication_0= ruleMultiplication ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )* )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1790:1: (this_Multiplication_0= ruleMultiplication ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )* )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1791:5: this_Multiplication_0= ruleMultiplication ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getAdditionAccess().getMultiplicationParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleMultiplication_in_ruleAddition4231);
            this_Multiplication_0=ruleMultiplication();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_Multiplication_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1799:1: ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>=43 && LA25_0<=44)) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1799:2: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplication ) )
            	    {
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1799:2: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) )
            	    int alt24=2;
            	    int LA24_0 = input.LA(1);

            	    if ( (LA24_0==43) ) {
            	        alt24=1;
            	    }
            	    else if ( (LA24_0==44) ) {
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
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1799:3: ( () otherlv_2= '+' )
            	            {
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1799:3: ( () otherlv_2= '+' )
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1799:4: () otherlv_2= '+'
            	            {
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1799:4: ()
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1800:5: 
            	            {
            	            if ( state.backtracking==0 ) {

            	                      current = forceCreateModelElementAndSet(
            	                          grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0(),
            	                          current);
            	                  
            	            }

            	            }

            	            otherlv_2=(Token)match(input,43,FOLLOW_43_in_ruleAddition4254); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_2, grammarAccess.getAdditionAccess().getPlusSignKeyword_1_0_0_1());
            	                  
            	            }

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1810:6: ( () otherlv_4= '-' )
            	            {
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1810:6: ( () otherlv_4= '-' )
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1810:7: () otherlv_4= '-'
            	            {
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1810:7: ()
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1811:5: 
            	            {
            	            if ( state.backtracking==0 ) {

            	                      current = forceCreateModelElementAndSet(
            	                          grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0(),
            	                          current);
            	                  
            	            }

            	            }

            	            otherlv_4=(Token)match(input,44,FOLLOW_44_in_ruleAddition4283); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_4, grammarAccess.getAdditionAccess().getHyphenMinusKeyword_1_0_1_1());
            	                  
            	            }

            	            }


            	            }
            	            break;

            	    }

            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1820:3: ( (lv_right_5_0= ruleMultiplication ) )
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1821:1: (lv_right_5_0= ruleMultiplication )
            	    {
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1821:1: (lv_right_5_0= ruleMultiplication )
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1822:3: lv_right_5_0= ruleMultiplication
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAdditionAccess().getRightMultiplicationParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleMultiplication_in_ruleAddition4306);
            	    lv_right_5_0=ruleMultiplication();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getAdditionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_5_0, 
            	              		"Multiplication");
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
    // $ANTLR end "ruleAddition"


    // $ANTLR start "entryRuleMultiplication"
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1846:1: entryRuleMultiplication returns [EObject current=null] : iv_ruleMultiplication= ruleMultiplication EOF ;
    public final EObject entryRuleMultiplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplication = null;


        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1847:2: (iv_ruleMultiplication= ruleMultiplication EOF )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1848:2: iv_ruleMultiplication= ruleMultiplication EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultiplicationRule()); 
            }
            pushFollow(FOLLOW_ruleMultiplication_in_entryRuleMultiplication4344);
            iv_ruleMultiplication=ruleMultiplication();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMultiplication; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiplication4354); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMultiplication"


    // $ANTLR start "ruleMultiplication"
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1855:1: ruleMultiplication returns [EObject current=null] : (this_PrimaryExpression_0= rulePrimaryExpression ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimaryExpression ) ) )* ) ;
    public final EObject ruleMultiplication() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_PrimaryExpression_0 = null;

        EObject lv_right_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1858:28: ( (this_PrimaryExpression_0= rulePrimaryExpression ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimaryExpression ) ) )* ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1859:1: (this_PrimaryExpression_0= rulePrimaryExpression ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimaryExpression ) ) )* )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1859:1: (this_PrimaryExpression_0= rulePrimaryExpression ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimaryExpression ) ) )* )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1860:5: this_PrimaryExpression_0= rulePrimaryExpression ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimaryExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getMultiplicationAccess().getPrimaryExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_rulePrimaryExpression_in_ruleMultiplication4401);
            this_PrimaryExpression_0=rulePrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_PrimaryExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1868:1: ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimaryExpression ) ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>=45 && LA27_0<=46)) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1868:2: ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimaryExpression ) )
            	    {
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1868:2: ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) )
            	    int alt26=2;
            	    int LA26_0 = input.LA(1);

            	    if ( (LA26_0==45) ) {
            	        alt26=1;
            	    }
            	    else if ( (LA26_0==46) ) {
            	        alt26=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 26, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt26) {
            	        case 1 :
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1868:3: ( () otherlv_2= '*' )
            	            {
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1868:3: ( () otherlv_2= '*' )
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1868:4: () otherlv_2= '*'
            	            {
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1868:4: ()
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1869:5: 
            	            {
            	            if ( state.backtracking==0 ) {

            	                      current = forceCreateModelElementAndSet(
            	                          grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0_0_0(),
            	                          current);
            	                  
            	            }

            	            }

            	            otherlv_2=(Token)match(input,45,FOLLOW_45_in_ruleMultiplication4424); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_2, grammarAccess.getMultiplicationAccess().getAsteriskKeyword_1_0_0_1());
            	                  
            	            }

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1879:6: ( () otherlv_4= '/' )
            	            {
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1879:6: ( () otherlv_4= '/' )
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1879:7: () otherlv_4= '/'
            	            {
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1879:7: ()
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1880:5: 
            	            {
            	            if ( state.backtracking==0 ) {

            	                      current = forceCreateModelElementAndSet(
            	                          grammarAccess.getMultiplicationAccess().getDivLeftAction_1_0_1_0(),
            	                          current);
            	                  
            	            }

            	            }

            	            otherlv_4=(Token)match(input,46,FOLLOW_46_in_ruleMultiplication4453); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_4, grammarAccess.getMultiplicationAccess().getSolidusKeyword_1_0_1_1());
            	                  
            	            }

            	            }


            	            }
            	            break;

            	    }

            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1889:3: ( (lv_right_5_0= rulePrimaryExpression ) )
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1890:1: (lv_right_5_0= rulePrimaryExpression )
            	    {
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1890:1: (lv_right_5_0= rulePrimaryExpression )
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1891:3: lv_right_5_0= rulePrimaryExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMultiplicationAccess().getRightPrimaryExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulePrimaryExpression_in_ruleMultiplication4476);
            	    lv_right_5_0=rulePrimaryExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getMultiplicationRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_5_0, 
            	              		"PrimaryExpression");
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
    // $ANTLR end "ruleMultiplication"


    // $ANTLR start "entryRulePrimaryExpression"
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1915:1: entryRulePrimaryExpression returns [EObject current=null] : iv_rulePrimaryExpression= rulePrimaryExpression EOF ;
    public final EObject entryRulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpression = null;


        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1916:2: (iv_rulePrimaryExpression= rulePrimaryExpression EOF )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1917:2: iv_rulePrimaryExpression= rulePrimaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimaryExpressionRule()); 
            }
            pushFollow(FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression4514);
            iv_rulePrimaryExpression=rulePrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimaryExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimaryExpression4524); if (state.failed) return current;

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
    // $ANTLR end "entryRulePrimaryExpression"


    // $ANTLR start "rulePrimaryExpression"
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1924:1: rulePrimaryExpression returns [EObject current=null] : ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () ( (lv_value_4_0= RULE_REAL ) ) ) | ( () ( (lv_value_6_0= RULE_INT ) ) ) | this_FunctionCall_7= ruleFunctionCall | this_VariableReference_8= ruleVariableReference | ( () ( (lv_value_10_0= RULE_STRING ) ) ) | this_ArrayLiteral_11= ruleArrayLiteral | this_FunctionDeclaration_12= ruleFunctionDeclaration | ( () otherlv_14= 'null' ) | ( () otherlv_16= 'false' ) | ( () otherlv_18= 'true' ) ) ;
    public final EObject rulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_value_4_0=null;
        Token lv_value_6_0=null;
        Token lv_value_10_0=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        EObject this_Expression_1 = null;

        EObject this_FunctionCall_7 = null;

        EObject this_VariableReference_8 = null;

        EObject this_ArrayLiteral_11 = null;

        EObject this_FunctionDeclaration_12 = null;


         enterRule(); 
            
        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1927:28: ( ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () ( (lv_value_4_0= RULE_REAL ) ) ) | ( () ( (lv_value_6_0= RULE_INT ) ) ) | this_FunctionCall_7= ruleFunctionCall | this_VariableReference_8= ruleVariableReference | ( () ( (lv_value_10_0= RULE_STRING ) ) ) | this_ArrayLiteral_11= ruleArrayLiteral | this_FunctionDeclaration_12= ruleFunctionDeclaration | ( () otherlv_14= 'null' ) | ( () otherlv_16= 'false' ) | ( () otherlv_18= 'true' ) ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1928:1: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () ( (lv_value_4_0= RULE_REAL ) ) ) | ( () ( (lv_value_6_0= RULE_INT ) ) ) | this_FunctionCall_7= ruleFunctionCall | this_VariableReference_8= ruleVariableReference | ( () ( (lv_value_10_0= RULE_STRING ) ) ) | this_ArrayLiteral_11= ruleArrayLiteral | this_FunctionDeclaration_12= ruleFunctionDeclaration | ( () otherlv_14= 'null' ) | ( () otherlv_16= 'false' ) | ( () otherlv_18= 'true' ) )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1928:1: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () ( (lv_value_4_0= RULE_REAL ) ) ) | ( () ( (lv_value_6_0= RULE_INT ) ) ) | this_FunctionCall_7= ruleFunctionCall | this_VariableReference_8= ruleVariableReference | ( () ( (lv_value_10_0= RULE_STRING ) ) ) | this_ArrayLiteral_11= ruleArrayLiteral | this_FunctionDeclaration_12= ruleFunctionDeclaration | ( () otherlv_14= 'null' ) | ( () otherlv_16= 'false' ) | ( () otherlv_18= 'true' ) )
            int alt28=11;
            alt28 = dfa28.predict(input);
            switch (alt28) {
                case 1 :
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1928:2: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1928:2: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1928:4: otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,19,FOLLOW_19_in_rulePrimaryExpression4562); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getExpressionParserRuleCall_0_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExpression_in_rulePrimaryExpression4584);
                    this_Expression_1=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Expression_1; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_2=(Token)match(input,20,FOLLOW_20_in_rulePrimaryExpression4595); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_0_2());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1946:6: ( () ( (lv_value_4_0= RULE_REAL ) ) )
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1946:6: ( () ( (lv_value_4_0= RULE_REAL ) ) )
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1946:7: () ( (lv_value_4_0= RULE_REAL ) )
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1946:7: ()
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1947:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getPrimaryExpressionAccess().getRealLiteralAction_1_0(),
                                  current);
                          
                    }

                    }

                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1952:2: ( (lv_value_4_0= RULE_REAL ) )
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1953:1: (lv_value_4_0= RULE_REAL )
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1953:1: (lv_value_4_0= RULE_REAL )
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1954:3: lv_value_4_0= RULE_REAL
                    {
                    lv_value_4_0=(Token)match(input,RULE_REAL,FOLLOW_RULE_REAL_in_rulePrimaryExpression4629); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_value_4_0, grammarAccess.getPrimaryExpressionAccess().getValueREALTerminalRuleCall_1_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getPrimaryExpressionRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"value",
                              		lv_value_4_0, 
                              		"REAL");
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1971:6: ( () ( (lv_value_6_0= RULE_INT ) ) )
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1971:6: ( () ( (lv_value_6_0= RULE_INT ) ) )
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1971:7: () ( (lv_value_6_0= RULE_INT ) )
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1971:7: ()
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1972:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getPrimaryExpressionAccess().getIntLiteralAction_2_0(),
                                  current);
                          
                    }

                    }

                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1977:2: ( (lv_value_6_0= RULE_INT ) )
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1978:1: (lv_value_6_0= RULE_INT )
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1978:1: (lv_value_6_0= RULE_INT )
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1979:3: lv_value_6_0= RULE_INT
                    {
                    lv_value_6_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_rulePrimaryExpression4668); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_value_6_0, grammarAccess.getPrimaryExpressionAccess().getValueINTTerminalRuleCall_2_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getPrimaryExpressionRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"value",
                              		lv_value_6_0, 
                              		"INT");
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1997:5: this_FunctionCall_7= ruleFunctionCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getFunctionCallParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleFunctionCall_in_rulePrimaryExpression4702);
                    this_FunctionCall_7=ruleFunctionCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_FunctionCall_7; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2007:5: this_VariableReference_8= ruleVariableReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getVariableReferenceParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleVariableReference_in_rulePrimaryExpression4729);
                    this_VariableReference_8=ruleVariableReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_VariableReference_8; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2016:6: ( () ( (lv_value_10_0= RULE_STRING ) ) )
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2016:6: ( () ( (lv_value_10_0= RULE_STRING ) ) )
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2016:7: () ( (lv_value_10_0= RULE_STRING ) )
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2016:7: ()
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2017:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getPrimaryExpressionAccess().getStringLiteralAction_5_0(),
                                  current);
                          
                    }

                    }

                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2022:2: ( (lv_value_10_0= RULE_STRING ) )
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2023:1: (lv_value_10_0= RULE_STRING )
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2023:1: (lv_value_10_0= RULE_STRING )
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2024:3: lv_value_10_0= RULE_STRING
                    {
                    lv_value_10_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePrimaryExpression4761); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_value_10_0, grammarAccess.getPrimaryExpressionAccess().getValueSTRINGTerminalRuleCall_5_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getPrimaryExpressionRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"value",
                              		lv_value_10_0, 
                              		"STRING");
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 7 :
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2042:5: this_ArrayLiteral_11= ruleArrayLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getArrayLiteralParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleArrayLiteral_in_rulePrimaryExpression4795);
                    this_ArrayLiteral_11=ruleArrayLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ArrayLiteral_11; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 8 :
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2052:5: this_FunctionDeclaration_12= ruleFunctionDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getFunctionDeclarationParserRuleCall_7()); 
                          
                    }
                    pushFollow(FOLLOW_ruleFunctionDeclaration_in_rulePrimaryExpression4822);
                    this_FunctionDeclaration_12=ruleFunctionDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_FunctionDeclaration_12; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 9 :
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2061:6: ( () otherlv_14= 'null' )
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2061:6: ( () otherlv_14= 'null' )
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2061:7: () otherlv_14= 'null'
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2061:7: ()
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2062:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getPrimaryExpressionAccess().getNullLiteralAction_8_0(),
                                  current);
                          
                    }

                    }

                    otherlv_14=(Token)match(input,47,FOLLOW_47_in_rulePrimaryExpression4849); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_14, grammarAccess.getPrimaryExpressionAccess().getNullKeyword_8_1());
                          
                    }

                    }


                    }
                    break;
                case 10 :
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2072:6: ( () otherlv_16= 'false' )
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2072:6: ( () otherlv_16= 'false' )
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2072:7: () otherlv_16= 'false'
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2072:7: ()
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2073:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getPrimaryExpressionAccess().getFalseLiteralAction_9_0(),
                                  current);
                          
                    }

                    }

                    otherlv_16=(Token)match(input,48,FOLLOW_48_in_rulePrimaryExpression4878); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_16, grammarAccess.getPrimaryExpressionAccess().getFalseKeyword_9_1());
                          
                    }

                    }


                    }
                    break;
                case 11 :
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2083:6: ( () otherlv_18= 'true' )
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2083:6: ( () otherlv_18= 'true' )
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2083:7: () otherlv_18= 'true'
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2083:7: ()
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2084:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getPrimaryExpressionAccess().getTrueLiteralAction_10_0(),
                                  current);
                          
                    }

                    }

                    otherlv_18=(Token)match(input,49,FOLLOW_49_in_rulePrimaryExpression4907); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_18, grammarAccess.getPrimaryExpressionAccess().getTrueKeyword_10_1());
                          
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
    // $ANTLR end "rulePrimaryExpression"


    // $ANTLR start "entryRuleArrayLiteral"
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2101:1: entryRuleArrayLiteral returns [EObject current=null] : iv_ruleArrayLiteral= ruleArrayLiteral EOF ;
    public final EObject entryRuleArrayLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayLiteral = null;


        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2102:2: (iv_ruleArrayLiteral= ruleArrayLiteral EOF )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2103:2: iv_ruleArrayLiteral= ruleArrayLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArrayLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleArrayLiteral_in_entryRuleArrayLiteral4944);
            iv_ruleArrayLiteral=ruleArrayLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArrayLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleArrayLiteral4954); if (state.failed) return current;

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
    // $ANTLR end "entryRuleArrayLiteral"


    // $ANTLR start "ruleArrayLiteral"
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2110:1: ruleArrayLiteral returns [EObject current=null] : ( () otherlv_1= '[' ( ( (lv_values_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleExpression ) ) )* )? otherlv_5= ']' ) ;
    public final EObject ruleArrayLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_values_2_0 = null;

        EObject lv_values_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2113:28: ( ( () otherlv_1= '[' ( ( (lv_values_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleExpression ) ) )* )? otherlv_5= ']' ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2114:1: ( () otherlv_1= '[' ( ( (lv_values_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleExpression ) ) )* )? otherlv_5= ']' )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2114:1: ( () otherlv_1= '[' ( ( (lv_values_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleExpression ) ) )* )? otherlv_5= ']' )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2114:2: () otherlv_1= '[' ( ( (lv_values_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleExpression ) ) )* )? otherlv_5= ']'
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2114:2: ()
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2115:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getArrayLiteralAccess().getArrayLiteralAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,50,FOLLOW_50_in_ruleArrayLiteral5000); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getArrayLiteralAccess().getLeftSquareBracketKeyword_1());
                  
            }
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2124:1: ( ( (lv_values_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleExpression ) ) )* )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( ((LA30_0>=RULE_ID && LA30_0<=RULE_STRING)||LA30_0==19||LA30_0==27||(LA30_0>=47 && LA30_0<=50)) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2124:2: ( (lv_values_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleExpression ) ) )*
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2124:2: ( (lv_values_2_0= ruleExpression ) )
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2125:1: (lv_values_2_0= ruleExpression )
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2125:1: (lv_values_2_0= ruleExpression )
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2126:3: lv_values_2_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getArrayLiteralAccess().getValuesExpressionParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleArrayLiteral5022);
                    lv_values_2_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getArrayLiteralRule());
                      	        }
                             		add(
                             			current, 
                             			"values",
                              		lv_values_2_0, 
                              		"Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2142:2: (otherlv_3= ',' ( (lv_values_4_0= ruleExpression ) ) )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==28) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2142:4: otherlv_3= ',' ( (lv_values_4_0= ruleExpression ) )
                    	    {
                    	    otherlv_3=(Token)match(input,28,FOLLOW_28_in_ruleArrayLiteral5035); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getArrayLiteralAccess().getCommaKeyword_2_1_0());
                    	          
                    	    }
                    	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2146:1: ( (lv_values_4_0= ruleExpression ) )
                    	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2147:1: (lv_values_4_0= ruleExpression )
                    	    {
                    	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2147:1: (lv_values_4_0= ruleExpression )
                    	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2148:3: lv_values_4_0= ruleExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getArrayLiteralAccess().getValuesExpressionParserRuleCall_2_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleExpression_in_ruleArrayLiteral5056);
                    	    lv_values_4_0=ruleExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getArrayLiteralRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"values",
                    	              		lv_values_4_0, 
                    	              		"Expression");
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
                    break;

            }

            otherlv_5=(Token)match(input,51,FOLLOW_51_in_ruleArrayLiteral5072); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getArrayLiteralAccess().getRightSquareBracketKeyword_3());
                  
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
    // $ANTLR end "ruleArrayLiteral"


    // $ANTLR start "entryRuleVariableReference"
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2178:1: entryRuleVariableReference returns [EObject current=null] : iv_ruleVariableReference= ruleVariableReference EOF ;
    public final EObject entryRuleVariableReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableReference = null;


        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2179:2: (iv_ruleVariableReference= ruleVariableReference EOF )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2180:2: iv_ruleVariableReference= ruleVariableReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleVariableReference_in_entryRuleVariableReference5110);
            iv_ruleVariableReference=ruleVariableReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariableReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableReference5120); if (state.failed) return current;

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
    // $ANTLR end "entryRuleVariableReference"


    // $ANTLR start "ruleVariableReference"
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2187:1: ruleVariableReference returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_dimensions_2_0= ruleExpression ) ) otherlv_3= ']' )* ) ;
    public final EObject ruleVariableReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_dimensions_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2190:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_dimensions_2_0= ruleExpression ) ) otherlv_3= ']' )* ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2191:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_dimensions_2_0= ruleExpression ) ) otherlv_3= ']' )* )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2191:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_dimensions_2_0= ruleExpression ) ) otherlv_3= ']' )* )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2191:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_dimensions_2_0= ruleExpression ) ) otherlv_3= ']' )*
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2191:2: ( (otherlv_0= RULE_ID ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2192:1: (otherlv_0= RULE_ID )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2192:1: (otherlv_0= RULE_ID )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2193:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getVariableReferenceRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariableReference5165); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getVariableReferenceAccess().getVariableVariableReferenceableCrossReference_0_0()); 
              	
            }

            }


            }

            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2204:2: (otherlv_1= '[' ( (lv_dimensions_2_0= ruleExpression ) ) otherlv_3= ']' )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==50) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2204:4: otherlv_1= '[' ( (lv_dimensions_2_0= ruleExpression ) ) otherlv_3= ']'
            	    {
            	    otherlv_1=(Token)match(input,50,FOLLOW_50_in_ruleVariableReference5178); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getVariableReferenceAccess().getLeftSquareBracketKeyword_1_0());
            	          
            	    }
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2208:1: ( (lv_dimensions_2_0= ruleExpression ) )
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2209:1: (lv_dimensions_2_0= ruleExpression )
            	    {
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2209:1: (lv_dimensions_2_0= ruleExpression )
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2210:3: lv_dimensions_2_0= ruleExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getVariableReferenceAccess().getDimensionsExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExpression_in_ruleVariableReference5199);
            	    lv_dimensions_2_0=ruleExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getVariableReferenceRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"dimensions",
            	              		lv_dimensions_2_0, 
            	              		"Expression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    otherlv_3=(Token)match(input,51,FOLLOW_51_in_ruleVariableReference5211); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getVariableReferenceAccess().getRightSquareBracketKeyword_1_2());
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop31;
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
    // $ANTLR end "ruleVariableReference"


    // $ANTLR start "entryRuleFunctionCall"
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2238:1: entryRuleFunctionCall returns [EObject current=null] : iv_ruleFunctionCall= ruleFunctionCall EOF ;
    public final EObject entryRuleFunctionCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionCall = null;


        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2239:2: (iv_ruleFunctionCall= ruleFunctionCall EOF )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2240:2: iv_ruleFunctionCall= ruleFunctionCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunctionCallRule()); 
            }
            pushFollow(FOLLOW_ruleFunctionCall_in_entryRuleFunctionCall5249);
            iv_ruleFunctionCall=ruleFunctionCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFunctionCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionCall5259); if (state.failed) return current;

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
    // $ANTLR end "entryRuleFunctionCall"


    // $ANTLR start "ruleFunctionCall"
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2247:1: ruleFunctionCall returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )? otherlv_6= ')' ) ;
    public final EObject ruleFunctionCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_args_3_0 = null;

        EObject lv_args_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2250:28: ( ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )? otherlv_6= ')' ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2251:1: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )? otherlv_6= ')' )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2251:1: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )? otherlv_6= ')' )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2251:2: () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )? otherlv_6= ')'
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2251:2: ()
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2252:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getFunctionCallAccess().getFunctionCallAction_0(),
                          current);
                  
            }

            }

            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2257:2: ( (otherlv_1= RULE_ID ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2258:1: (otherlv_1= RULE_ID )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2258:1: (otherlv_1= RULE_ID )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2259:3: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getFunctionCallRule());
              	        }
                      
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionCall5313); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_1, grammarAccess.getFunctionCallAccess().getFunctionFunctionDeclarationCrossReference_1_0()); 
              	
            }

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleFunctionCall5325); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getFunctionCallAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2274:1: ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( ((LA33_0>=RULE_ID && LA33_0<=RULE_STRING)||LA33_0==19||LA33_0==27||(LA33_0>=47 && LA33_0<=50)) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2274:2: ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )*
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2274:2: ( (lv_args_3_0= ruleExpression ) )
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2275:1: (lv_args_3_0= ruleExpression )
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2275:1: (lv_args_3_0= ruleExpression )
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2276:3: lv_args_3_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFunctionCallAccess().getArgsExpressionParserRuleCall_3_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleFunctionCall5347);
                    lv_args_3_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getFunctionCallRule());
                      	        }
                             		add(
                             			current, 
                             			"args",
                              		lv_args_3_0, 
                              		"Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2292:2: (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==28) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2292:4: otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) )
                    	    {
                    	    otherlv_4=(Token)match(input,28,FOLLOW_28_in_ruleFunctionCall5360); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getFunctionCallAccess().getCommaKeyword_3_1_0());
                    	          
                    	    }
                    	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2296:1: ( (lv_args_5_0= ruleExpression ) )
                    	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2297:1: (lv_args_5_0= ruleExpression )
                    	    {
                    	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2297:1: (lv_args_5_0= ruleExpression )
                    	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2298:3: lv_args_5_0= ruleExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getFunctionCallAccess().getArgsExpressionParserRuleCall_3_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleExpression_in_ruleFunctionCall5381);
                    	    lv_args_5_0=ruleExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getFunctionCallRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"args",
                    	              		lv_args_5_0, 
                    	              		"Expression");
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
                    break;

            }

            otherlv_6=(Token)match(input,20,FOLLOW_20_in_ruleFunctionCall5397); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getFunctionCallAccess().getRightParenthesisKeyword_4());
                  
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
    // $ANTLR end "ruleFunctionCall"


    // $ANTLR start "entryRuleReturnStatement"
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2326:1: entryRuleReturnStatement returns [EObject current=null] : iv_ruleReturnStatement= ruleReturnStatement EOF ;
    public final EObject entryRuleReturnStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReturnStatement = null;


        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2327:2: (iv_ruleReturnStatement= ruleReturnStatement EOF )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2328:2: iv_ruleReturnStatement= ruleReturnStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReturnStatementRule()); 
            }
            pushFollow(FOLLOW_ruleReturnStatement_in_entryRuleReturnStatement5433);
            iv_ruleReturnStatement=ruleReturnStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReturnStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReturnStatement5443); if (state.failed) return current;

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
    // $ANTLR end "entryRuleReturnStatement"


    // $ANTLR start "ruleReturnStatement"
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2335:1: ruleReturnStatement returns [EObject current=null] : (otherlv_0= 'return' ( (lv_value_1_0= ruleExpression ) ) ) ;
    public final EObject ruleReturnStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2338:28: ( (otherlv_0= 'return' ( (lv_value_1_0= ruleExpression ) ) ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2339:1: (otherlv_0= 'return' ( (lv_value_1_0= ruleExpression ) ) )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2339:1: (otherlv_0= 'return' ( (lv_value_1_0= ruleExpression ) ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2339:3: otherlv_0= 'return' ( (lv_value_1_0= ruleExpression ) )
            {
            otherlv_0=(Token)match(input,52,FOLLOW_52_in_ruleReturnStatement5480); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getReturnStatementAccess().getReturnKeyword_0());
                  
            }
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2343:1: ( (lv_value_1_0= ruleExpression ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2344:1: (lv_value_1_0= ruleExpression )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2344:1: (lv_value_1_0= ruleExpression )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2345:3: lv_value_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getReturnStatementAccess().getValueExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleReturnStatement5501);
            lv_value_1_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getReturnStatementRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_1_0, 
                      		"Expression");
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
    // $ANTLR end "ruleReturnStatement"


    // $ANTLR start "entryRuleInclude"
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2369:1: entryRuleInclude returns [EObject current=null] : iv_ruleInclude= ruleInclude EOF ;
    public final EObject entryRuleInclude() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInclude = null;


        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2370:2: (iv_ruleInclude= ruleInclude EOF )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2371:2: iv_ruleInclude= ruleInclude EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIncludeRule()); 
            }
            pushFollow(FOLLOW_ruleInclude_in_entryRuleInclude5537);
            iv_ruleInclude=ruleInclude();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInclude; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInclude5547); if (state.failed) return current;

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
    // $ANTLR end "entryRuleInclude"


    // $ANTLR start "ruleInclude"
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2378:1: ruleInclude returns [EObject current=null] : (otherlv_0= 'include' otherlv_1= '(' ( (lv_importURI_2_0= RULE_STRING ) ) otherlv_3= ')' ) ;
    public final EObject ruleInclude() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_importURI_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2381:28: ( (otherlv_0= 'include' otherlv_1= '(' ( (lv_importURI_2_0= RULE_STRING ) ) otherlv_3= ')' ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2382:1: (otherlv_0= 'include' otherlv_1= '(' ( (lv_importURI_2_0= RULE_STRING ) ) otherlv_3= ')' )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2382:1: (otherlv_0= 'include' otherlv_1= '(' ( (lv_importURI_2_0= RULE_STRING ) ) otherlv_3= ')' )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2382:3: otherlv_0= 'include' otherlv_1= '(' ( (lv_importURI_2_0= RULE_STRING ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,53,FOLLOW_53_in_ruleInclude5584); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getIncludeAccess().getIncludeKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleInclude5596); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getIncludeAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2390:1: ( (lv_importURI_2_0= RULE_STRING ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2391:1: (lv_importURI_2_0= RULE_STRING )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2391:1: (lv_importURI_2_0= RULE_STRING )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2392:3: lv_importURI_2_0= RULE_STRING
            {
            lv_importURI_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleInclude5613); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_importURI_2_0, grammarAccess.getIncludeAccess().getImportURISTRINGTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getIncludeRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"importURI",
                      		lv_importURI_2_0, 
                      		"STRING");
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleInclude5630); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getIncludeAccess().getRightParenthesisKeyword_3());
                  
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
    // $ANTLR end "ruleInclude"

    // $ANTLR start synpred1_InternalLeek
    public final void synpred1_InternalLeek_fragment() throws RecognitionException {   
        // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:669:4: ( 'else' )
        // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:669:6: 'else'
        {
        match(input,21,FOLLOW_21_in_synpred1_InternalLeek1659); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalLeek

    // Delegated rules

    public final boolean synpred1_InternalLeek() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalLeek_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA28 dfa28 = new DFA28(this);
    static final String DFA28_eotS =
        "\15\uffff";
    static final String DFA28_eofS =
        "\4\uffff\1\14\10\uffff";
    static final String DFA28_minS =
        "\1\4\3\uffff\1\14\10\uffff";
    static final String DFA28_maxS =
        "\1\62\3\uffff\1\63\10\uffff";
    static final String DFA28_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\uffff\1\6\1\7\1\10\1\11\1\12\1\13\1\4\1\5";
    static final String DFA28_specialS =
        "\15\uffff}>";
    static final String[] DFA28_transitionS = {
            "\1\4\1\2\1\3\1\5\13\uffff\1\1\7\uffff\1\7\23\uffff\1\10\1\11\1\12\1\6",
            "",
            "",
            "",
            "\1\14\6\uffff\1\13\1\14\7\uffff\1\14\2\uffff\20\14\3\uffff\2\14",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA28_eot = DFA.unpackEncodedString(DFA28_eotS);
    static final short[] DFA28_eof = DFA.unpackEncodedString(DFA28_eofS);
    static final char[] DFA28_min = DFA.unpackEncodedStringToUnsignedChars(DFA28_minS);
    static final char[] DFA28_max = DFA.unpackEncodedStringToUnsignedChars(DFA28_maxS);
    static final short[] DFA28_accept = DFA.unpackEncodedString(DFA28_acceptS);
    static final short[] DFA28_special = DFA.unpackEncodedString(DFA28_specialS);
    static final short[][] DFA28_transition;

    static {
        int numStates = DFA28_transitionS.length;
        DFA28_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA28_transition[i] = DFA.unpackEncodedString(DFA28_transitionS[i]);
        }
    }

    class DFA28 extends DFA {

        public DFA28(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 28;
            this.eot = DFA28_eot;
            this.eof = DFA28_eof;
            this.min = DFA28_min;
            this.max = DFA28_max;
            this.accept = DFA28_accept;
            this.special = DFA28_special;
            this.transition = DFA28_transition;
        }
        public String getDescription() {
            return "1928:1: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () ( (lv_value_4_0= RULE_REAL ) ) ) | ( () ( (lv_value_6_0= RULE_INT ) ) ) | this_FunctionCall_7= ruleFunctionCall | this_VariableReference_8= ruleVariableReference | ( () ( (lv_value_10_0= RULE_STRING ) ) ) | this_ArrayLiteral_11= ruleArrayLiteral | this_FunctionDeclaration_12= ruleFunctionDeclaration | ( () otherlv_14= 'null' ) | ( () otherlv_16= 'false' ) | ( () otherlv_18= 'true' ) )";
        }
    }
 

    public static final BitSet FOLLOW_ruleScript_in_entryRuleScript75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleScript85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleToplevelStatement_in_ruleScript130 = new BitSet(new long[]{0x002000004CC43012L});
    public static final BitSet FOLLOW_ruleToplevelStatement_in_entryRuleToplevelStatement166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleToplevelStatement176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInclude_in_ruleToplevelStatement224 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleToplevelStatement235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGlobalDeclaration_in_ruleToplevelStatement265 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleToplevelStatement276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionDeclaration_in_ruleToplevelStatement305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleToplevelStatement332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_entryRuleStatement367 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatement377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleStatement424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocalDeclaration_in_ruleStatement454 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleStatement465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionCall_in_ruleStatement495 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleStatement506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIteration_in_ruleStatement535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIf_in_ruleStatement562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAffectation_in_ruleStatement590 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleStatement601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatementBlock_in_ruleStatement630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIterationStatement_in_entryRuleIterationStatement665 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIterationStatement675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleIterationStatement722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBreakStatement_in_ruleIterationStatement750 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleIterationStatement761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContinueStatement_in_ruleIterationStatement791 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleIterationStatement802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionStatement_in_entryRuleFunctionStatement839 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionStatement849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleFunctionStatement896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReturnStatement_in_ruleFunctionStatement924 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleFunctionStatement935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionStatementBlock_in_entryRuleFunctionStatementBlock972 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionStatementBlock982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleFunctionStatementBlock1019 = new BitSet(new long[]{0x003000004CC47010L});
    public static final BitSet FOLLOW_ruleFunctionStatement_in_ruleFunctionStatementBlock1049 = new BitSet(new long[]{0x003000004CC47010L});
    public static final BitSet FOLLOW_14_in_ruleFunctionStatementBlock1062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBreakStatement_in_entryRuleBreakStatement1098 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBreakStatement1108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleBreakStatement1154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContinueStatement_in_entryRuleContinueStatement1190 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContinueStatement1200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleContinueStatement1246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatementBlock_in_entryRuleStatementBlock1282 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatementBlock1292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleStatementBlock1329 = new BitSet(new long[]{0x002000004CC47010L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleStatementBlock1359 = new BitSet(new long[]{0x002000004CC47010L});
    public static final BitSet FOLLOW_14_in_ruleStatementBlock1372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAffectation_in_entryRuleAffectation1408 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAffectation1418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableReference_in_ruleAffectation1464 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleAffectation1476 = new BitSet(new long[]{0x00078000080800F0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleAffectation1497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIf_in_entryRuleIf1533 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIf1543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleIf1580 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleIf1592 = new BitSet(new long[]{0x00078000080800F0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleIf1613 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleIf1625 = new BitSet(new long[]{0x002000004CE43010L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleIf1646 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_21_in_ruleIf1667 = new BitSet(new long[]{0x002000004CC43010L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleIf1689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIteration_in_entryRuleIteration1727 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIteration1737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhile_in_ruleIteration1784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForIn_in_ruleIteration1811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFor_in_ruleIteration1838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhile_in_entryRuleWhile1873 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWhile1883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleWhile1920 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleWhile1932 = new BitSet(new long[]{0x00078000080800F0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleWhile1953 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleWhile1965 = new BitSet(new long[]{0x002000004CC5B010L});
    public static final BitSet FOLLOW_ruleIterationStatement_in_ruleWhile1986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFor_in_entryRuleFor2022 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFor2032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleFor2069 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleFor2081 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleForInitializer_in_ruleFor2102 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleFor2114 = new BitSet(new long[]{0x00078000080800F0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleFor2135 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleFor2147 = new BitSet(new long[]{0x00078000080800F0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleFor2168 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleFor2180 = new BitSet(new long[]{0x002000004CC5B010L});
    public static final BitSet FOLLOW_ruleIterationStatement_in_ruleFor2201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForIn_in_entryRuleForIn2237 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleForIn2247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleForIn2284 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleForIn2296 = new BitSet(new long[]{0x0000000004000010L});
    public static final BitSet FOLLOW_ruleForInVariableReference_in_ruleForIn2318 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleForIn2330 = new BitSet(new long[]{0x0000000004000010L});
    public static final BitSet FOLLOW_ruleForInVariableReference_in_ruleForIn2353 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleForIn2365 = new BitSet(new long[]{0x00078000080800F0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleForIn2386 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleForIn2398 = new BitSet(new long[]{0x002000004CC5B010L});
    public static final BitSet FOLLOW_ruleIterationStatement_in_ruleForIn2419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForInVariableReference_in_entryRuleForInVariableReference2455 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleForInVariableReference2465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleForInVariableReference2503 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleForInVariableReference2520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleForInVariableReference2552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForInitializer_in_entryRuleForInitializer2588 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleForInitializer2598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableReference_in_ruleForInitializer2644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionDeclaration_in_entryRuleFunctionDeclaration2678 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionDeclaration2688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleFunctionDeclaration2725 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionDeclaration2742 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleFunctionDeclaration2759 = new BitSet(new long[]{0x0000000020100010L});
    public static final BitSet FOLLOW_ruleParameterDeclaration_in_ruleFunctionDeclaration2781 = new BitSet(new long[]{0x0000000010100000L});
    public static final BitSet FOLLOW_28_in_ruleFunctionDeclaration2794 = new BitSet(new long[]{0x0000000020000010L});
    public static final BitSet FOLLOW_ruleParameterDeclaration_in_ruleFunctionDeclaration2815 = new BitSet(new long[]{0x0000000010100000L});
    public static final BitSet FOLLOW_20_in_ruleFunctionDeclaration2831 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ruleFunctionStatementBlock_in_ruleFunctionDeclaration2852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterDeclaration_in_entryRuleParameterDeclaration2888 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameterDeclaration2898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleParameterDeclaration2941 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleParameterDeclaration2972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocalDeclaration_in_entryRuleLocalDeclaration3013 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLocalDeclaration3023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleLocalDeclaration3060 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_ruleLocalDeclaration3081 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_28_in_ruleLocalDeclaration3094 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_ruleLocalDeclaration3115 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_ruleGlobalDeclaration_in_entryRuleGlobalDeclaration3153 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGlobalDeclaration3163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleGlobalDeclaration3200 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_ruleGlobalDeclaration3221 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_28_in_ruleGlobalDeclaration3234 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_ruleGlobalDeclaration3255 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_entryRuleVariableDeclaration3293 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableDeclaration3303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariableDeclaration3345 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_ruleVariableDeclaration3363 = new BitSet(new long[]{0x00078000080800F0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleVariableDeclaration3384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression3422 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression3432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparison_in_ruleExpression3478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparison_in_entryRuleComparison3512 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComparison3522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOr_in_ruleComparison3569 = new BitSet(new long[]{0x0000007F80000002L});
    public static final BitSet FOLLOW_31_in_ruleComparison3592 = new BitSet(new long[]{0x00078000080800F0L});
    public static final BitSet FOLLOW_32_in_ruleComparison3621 = new BitSet(new long[]{0x00078000080800F0L});
    public static final BitSet FOLLOW_33_in_ruleComparison3650 = new BitSet(new long[]{0x00078000080800F0L});
    public static final BitSet FOLLOW_34_in_ruleComparison3679 = new BitSet(new long[]{0x00078000080800F0L});
    public static final BitSet FOLLOW_35_in_ruleComparison3708 = new BitSet(new long[]{0x00078000080800F0L});
    public static final BitSet FOLLOW_36_in_ruleComparison3737 = new BitSet(new long[]{0x00078000080800F0L});
    public static final BitSet FOLLOW_37_in_ruleComparison3766 = new BitSet(new long[]{0x00078000080800F0L});
    public static final BitSet FOLLOW_38_in_ruleComparison3795 = new BitSet(new long[]{0x00078000080800F0L});
    public static final BitSet FOLLOW_ruleOr_in_ruleComparison3818 = new BitSet(new long[]{0x0000007F80000002L});
    public static final BitSet FOLLOW_ruleOr_in_entryRuleOr3856 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOr3866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnd_in_ruleOr3913 = new BitSet(new long[]{0x0000018000000002L});
    public static final BitSet FOLLOW_39_in_ruleOr3936 = new BitSet(new long[]{0x00078000080800F0L});
    public static final BitSet FOLLOW_40_in_ruleOr3954 = new BitSet(new long[]{0x00078000080800F0L});
    public static final BitSet FOLLOW_ruleAnd_in_ruleOr3977 = new BitSet(new long[]{0x0000018000000002L});
    public static final BitSet FOLLOW_ruleAnd_in_entryRuleAnd4015 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnd4025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddition_in_ruleAnd4072 = new BitSet(new long[]{0x0000060000000002L});
    public static final BitSet FOLLOW_41_in_ruleAnd4095 = new BitSet(new long[]{0x00078000080800F0L});
    public static final BitSet FOLLOW_42_in_ruleAnd4113 = new BitSet(new long[]{0x00078000080800F0L});
    public static final BitSet FOLLOW_ruleAddition_in_ruleAnd4136 = new BitSet(new long[]{0x0000060000000002L});
    public static final BitSet FOLLOW_ruleAddition_in_entryRuleAddition4174 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAddition4184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplication_in_ruleAddition4231 = new BitSet(new long[]{0x0000180000000002L});
    public static final BitSet FOLLOW_43_in_ruleAddition4254 = new BitSet(new long[]{0x00078000080800F0L});
    public static final BitSet FOLLOW_44_in_ruleAddition4283 = new BitSet(new long[]{0x00078000080800F0L});
    public static final BitSet FOLLOW_ruleMultiplication_in_ruleAddition4306 = new BitSet(new long[]{0x0000180000000002L});
    public static final BitSet FOLLOW_ruleMultiplication_in_entryRuleMultiplication4344 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiplication4354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_ruleMultiplication4401 = new BitSet(new long[]{0x0000600000000002L});
    public static final BitSet FOLLOW_45_in_ruleMultiplication4424 = new BitSet(new long[]{0x00078000080800F0L});
    public static final BitSet FOLLOW_46_in_ruleMultiplication4453 = new BitSet(new long[]{0x00078000080800F0L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_ruleMultiplication4476 = new BitSet(new long[]{0x0000600000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression4514 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimaryExpression4524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rulePrimaryExpression4562 = new BitSet(new long[]{0x00078000080800F0L});
    public static final BitSet FOLLOW_ruleExpression_in_rulePrimaryExpression4584 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_rulePrimaryExpression4595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_REAL_in_rulePrimaryExpression4629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rulePrimaryExpression4668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionCall_in_rulePrimaryExpression4702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableReference_in_rulePrimaryExpression4729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePrimaryExpression4761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayLiteral_in_rulePrimaryExpression4795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionDeclaration_in_rulePrimaryExpression4822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rulePrimaryExpression4849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rulePrimaryExpression4878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rulePrimaryExpression4907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayLiteral_in_entryRuleArrayLiteral4944 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArrayLiteral4954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleArrayLiteral5000 = new BitSet(new long[]{0x000F8000080800F0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleArrayLiteral5022 = new BitSet(new long[]{0x0008000010000000L});
    public static final BitSet FOLLOW_28_in_ruleArrayLiteral5035 = new BitSet(new long[]{0x00078000080800F0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleArrayLiteral5056 = new BitSet(new long[]{0x0008000010000000L});
    public static final BitSet FOLLOW_51_in_ruleArrayLiteral5072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableReference_in_entryRuleVariableReference5110 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableReference5120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariableReference5165 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_50_in_ruleVariableReference5178 = new BitSet(new long[]{0x00078000080800F0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleVariableReference5199 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_ruleVariableReference5211 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_ruleFunctionCall_in_entryRuleFunctionCall5249 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionCall5259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionCall5313 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleFunctionCall5325 = new BitSet(new long[]{0x00078000081800F0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleFunctionCall5347 = new BitSet(new long[]{0x0000000010100000L});
    public static final BitSet FOLLOW_28_in_ruleFunctionCall5360 = new BitSet(new long[]{0x00078000080800F0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleFunctionCall5381 = new BitSet(new long[]{0x0000000010100000L});
    public static final BitSet FOLLOW_20_in_ruleFunctionCall5397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReturnStatement_in_entryRuleReturnStatement5433 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReturnStatement5443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleReturnStatement5480 = new BitSet(new long[]{0x00078000080800F0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleReturnStatement5501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInclude_in_entryRuleInclude5537 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInclude5547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleInclude5584 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleInclude5596 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleInclude5613 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleInclude5630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_synpred1_InternalLeek1659 = new BitSet(new long[]{0x0000000000000002L});

}