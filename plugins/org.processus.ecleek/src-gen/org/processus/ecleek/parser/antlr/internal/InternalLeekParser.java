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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_REAL", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "';'", "'break'", "'continue'", "'{'", "'}'", "'='", "'if'", "'('", "')'", "'else'", "'while'", "'for'", "':'", "'in'", "'var'", "'function'", "','", "'@'", "'global'", "'==='", "'=='", "'!=='", "'!='", "'<='", "'<'", "'>='", "'>'", "'or'", "'||'", "'and'", "'&&'", "'+'", "'-'", "'*'", "'/'", "'null'", "'false'", "'true'", "'['", "']'", "'--'", "'++'", "'return'", "'include'"
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
    public static final int T__55=55;
    public static final int T__19=19;
    public static final int T__51=51;
    public static final int T__16=16;
    public static final int T__52=52;
    public static final int T__15=15;
    public static final int T__53=53;
    public static final int T__18=18;
    public static final int T__54=54;
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
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:76:1: ruleScript returns [EObject current=null] : ( (lv_statements_0_0= ruleStatement ) )* ;
    public final EObject ruleScript() throws RecognitionException {
        EObject current = null;

        EObject lv_statements_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:79:28: ( ( (lv_statements_0_0= ruleStatement ) )* )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:80:1: ( (lv_statements_0_0= ruleStatement ) )*
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:80:1: ( (lv_statements_0_0= ruleStatement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID||(LA1_0>=12 && LA1_0<=15)||LA1_0==18||(LA1_0>=22 && LA1_0<=23)||(LA1_0>=26 && LA1_0<=27)||LA1_0==30||(LA1_0>=54 && LA1_0<=55)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:81:1: (lv_statements_0_0= ruleStatement )
            	    {
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:81:1: (lv_statements_0_0= ruleStatement )
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:82:3: lv_statements_0_0= ruleStatement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getScriptAccess().getStatementsStatementParserRuleCall_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleStatement_in_ruleScript130);
            	    lv_statements_0_0=ruleStatement();

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
            	              		"Statement");
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


    // $ANTLR start "entryRuleStatement"
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:106:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:107:2: (iv_ruleStatement= ruleStatement EOF )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:108:2: iv_ruleStatement= ruleStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatementRule()); 
            }
            pushFollow(FOLLOW_ruleStatement_in_entryRuleStatement166);
            iv_ruleStatement=ruleStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatement176); if (state.failed) return current;

            }

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
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:115:1: ruleStatement returns [EObject current=null] : ( (this_Include_0= ruleInclude otherlv_1= ';' ) | (this_GlobalDeclaration_2= ruleGlobalDeclaration otherlv_3= ';' ) | this_FunctionDeclaration_4= ruleFunctionDeclaration | (this_LocalDeclaration_5= ruleLocalDeclaration otherlv_6= ';' ) | (this_FunctionCall_7= ruleFunctionCall otherlv_8= ';' ) | this_Iteration_9= ruleIteration | this_If_10= ruleIf | (this_Affectation_11= ruleAffectation otherlv_12= ';' ) | this_StatementBlock_13= ruleStatementBlock | (this_ReturnStatement_14= ruleReturnStatement otherlv_15= ';' ) | (this_BreakStatement_16= ruleBreakStatement otherlv_17= ';' ) | (this_ContinueStatement_18= ruleContinueStatement otherlv_19= ';' ) | ( () otherlv_21= ';' ) ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_12=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        EObject this_Include_0 = null;

        EObject this_GlobalDeclaration_2 = null;

        EObject this_FunctionDeclaration_4 = null;

        EObject this_LocalDeclaration_5 = null;

        EObject this_FunctionCall_7 = null;

        EObject this_Iteration_9 = null;

        EObject this_If_10 = null;

        EObject this_Affectation_11 = null;

        EObject this_StatementBlock_13 = null;

        EObject this_ReturnStatement_14 = null;

        EObject this_BreakStatement_16 = null;

        EObject this_ContinueStatement_18 = null;


         enterRule(); 
            
        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:118:28: ( ( (this_Include_0= ruleInclude otherlv_1= ';' ) | (this_GlobalDeclaration_2= ruleGlobalDeclaration otherlv_3= ';' ) | this_FunctionDeclaration_4= ruleFunctionDeclaration | (this_LocalDeclaration_5= ruleLocalDeclaration otherlv_6= ';' ) | (this_FunctionCall_7= ruleFunctionCall otherlv_8= ';' ) | this_Iteration_9= ruleIteration | this_If_10= ruleIf | (this_Affectation_11= ruleAffectation otherlv_12= ';' ) | this_StatementBlock_13= ruleStatementBlock | (this_ReturnStatement_14= ruleReturnStatement otherlv_15= ';' ) | (this_BreakStatement_16= ruleBreakStatement otherlv_17= ';' ) | (this_ContinueStatement_18= ruleContinueStatement otherlv_19= ';' ) | ( () otherlv_21= ';' ) ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:119:1: ( (this_Include_0= ruleInclude otherlv_1= ';' ) | (this_GlobalDeclaration_2= ruleGlobalDeclaration otherlv_3= ';' ) | this_FunctionDeclaration_4= ruleFunctionDeclaration | (this_LocalDeclaration_5= ruleLocalDeclaration otherlv_6= ';' ) | (this_FunctionCall_7= ruleFunctionCall otherlv_8= ';' ) | this_Iteration_9= ruleIteration | this_If_10= ruleIf | (this_Affectation_11= ruleAffectation otherlv_12= ';' ) | this_StatementBlock_13= ruleStatementBlock | (this_ReturnStatement_14= ruleReturnStatement otherlv_15= ';' ) | (this_BreakStatement_16= ruleBreakStatement otherlv_17= ';' ) | (this_ContinueStatement_18= ruleContinueStatement otherlv_19= ';' ) | ( () otherlv_21= ';' ) )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:119:1: ( (this_Include_0= ruleInclude otherlv_1= ';' ) | (this_GlobalDeclaration_2= ruleGlobalDeclaration otherlv_3= ';' ) | this_FunctionDeclaration_4= ruleFunctionDeclaration | (this_LocalDeclaration_5= ruleLocalDeclaration otherlv_6= ';' ) | (this_FunctionCall_7= ruleFunctionCall otherlv_8= ';' ) | this_Iteration_9= ruleIteration | this_If_10= ruleIf | (this_Affectation_11= ruleAffectation otherlv_12= ';' ) | this_StatementBlock_13= ruleStatementBlock | (this_ReturnStatement_14= ruleReturnStatement otherlv_15= ';' ) | (this_BreakStatement_16= ruleBreakStatement otherlv_17= ';' ) | (this_ContinueStatement_18= ruleContinueStatement otherlv_19= ';' ) | ( () otherlv_21= ';' ) )
            int alt2=13;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:119:2: (this_Include_0= ruleInclude otherlv_1= ';' )
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:119:2: (this_Include_0= ruleInclude otherlv_1= ';' )
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:120:5: this_Include_0= ruleInclude otherlv_1= ';'
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getIncludeParserRuleCall_0_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInclude_in_ruleStatement224);
                    this_Include_0=ruleInclude();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Include_0; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleStatement235); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getStatementAccess().getSemicolonKeyword_0_1());
                          
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
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getGlobalDeclarationParserRuleCall_1_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleGlobalDeclaration_in_ruleStatement265);
                    this_GlobalDeclaration_2=ruleGlobalDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_GlobalDeclaration_2; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_3=(Token)match(input,12,FOLLOW_12_in_ruleStatement276); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getStatementAccess().getSemicolonKeyword_1_1());
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:148:5: this_FunctionDeclaration_4= ruleFunctionDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getFunctionDeclarationParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleFunctionDeclaration_in_ruleStatement305);
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
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:157:6: (this_LocalDeclaration_5= ruleLocalDeclaration otherlv_6= ';' )
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:157:6: (this_LocalDeclaration_5= ruleLocalDeclaration otherlv_6= ';' )
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:158:5: this_LocalDeclaration_5= ruleLocalDeclaration otherlv_6= ';'
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getLocalDeclarationParserRuleCall_3_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLocalDeclaration_in_ruleStatement333);
                    this_LocalDeclaration_5=ruleLocalDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_LocalDeclaration_5; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_6=(Token)match(input,12,FOLLOW_12_in_ruleStatement344); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getStatementAccess().getSemicolonKeyword_3_1());
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:171:6: (this_FunctionCall_7= ruleFunctionCall otherlv_8= ';' )
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:171:6: (this_FunctionCall_7= ruleFunctionCall otherlv_8= ';' )
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:172:5: this_FunctionCall_7= ruleFunctionCall otherlv_8= ';'
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getFunctionCallParserRuleCall_4_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleFunctionCall_in_ruleStatement374);
                    this_FunctionCall_7=ruleFunctionCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_FunctionCall_7; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_8=(Token)match(input,12,FOLLOW_12_in_ruleStatement385); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getStatementAccess().getSemicolonKeyword_4_1());
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:186:5: this_Iteration_9= ruleIteration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getIterationParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleIteration_in_ruleStatement414);
                    this_Iteration_9=ruleIteration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Iteration_9; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 7 :
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:196:5: this_If_10= ruleIf
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getIfParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleIf_in_ruleStatement441);
                    this_If_10=ruleIf();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_If_10; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 8 :
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:205:6: (this_Affectation_11= ruleAffectation otherlv_12= ';' )
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:205:6: (this_Affectation_11= ruleAffectation otherlv_12= ';' )
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:206:5: this_Affectation_11= ruleAffectation otherlv_12= ';'
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getAffectationParserRuleCall_7_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAffectation_in_ruleStatement469);
                    this_Affectation_11=ruleAffectation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Affectation_11; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_12=(Token)match(input,12,FOLLOW_12_in_ruleStatement480); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_12, grammarAccess.getStatementAccess().getSemicolonKeyword_7_1());
                          
                    }

                    }


                    }
                    break;
                case 9 :
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:220:5: this_StatementBlock_13= ruleStatementBlock
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getStatementBlockParserRuleCall_8()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStatementBlock_in_ruleStatement509);
                    this_StatementBlock_13=ruleStatementBlock();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_StatementBlock_13; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 10 :
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:229:6: (this_ReturnStatement_14= ruleReturnStatement otherlv_15= ';' )
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:229:6: (this_ReturnStatement_14= ruleReturnStatement otherlv_15= ';' )
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:230:5: this_ReturnStatement_14= ruleReturnStatement otherlv_15= ';'
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getReturnStatementParserRuleCall_9_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleReturnStatement_in_ruleStatement537);
                    this_ReturnStatement_14=ruleReturnStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ReturnStatement_14; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_15=(Token)match(input,12,FOLLOW_12_in_ruleStatement548); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_15, grammarAccess.getStatementAccess().getSemicolonKeyword_9_1());
                          
                    }

                    }


                    }
                    break;
                case 11 :
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:243:6: (this_BreakStatement_16= ruleBreakStatement otherlv_17= ';' )
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:243:6: (this_BreakStatement_16= ruleBreakStatement otherlv_17= ';' )
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:244:5: this_BreakStatement_16= ruleBreakStatement otherlv_17= ';'
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getBreakStatementParserRuleCall_10_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBreakStatement_in_ruleStatement578);
                    this_BreakStatement_16=ruleBreakStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_BreakStatement_16; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_17=(Token)match(input,12,FOLLOW_12_in_ruleStatement589); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_17, grammarAccess.getStatementAccess().getSemicolonKeyword_10_1());
                          
                    }

                    }


                    }
                    break;
                case 12 :
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:257:6: (this_ContinueStatement_18= ruleContinueStatement otherlv_19= ';' )
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:257:6: (this_ContinueStatement_18= ruleContinueStatement otherlv_19= ';' )
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:258:5: this_ContinueStatement_18= ruleContinueStatement otherlv_19= ';'
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getContinueStatementParserRuleCall_11_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleContinueStatement_in_ruleStatement619);
                    this_ContinueStatement_18=ruleContinueStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ContinueStatement_18; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_19=(Token)match(input,12,FOLLOW_12_in_ruleStatement630); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_19, grammarAccess.getStatementAccess().getSemicolonKeyword_11_1());
                          
                    }

                    }


                    }
                    break;
                case 13 :
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:271:6: ( () otherlv_21= ';' )
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:271:6: ( () otherlv_21= ';' )
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:271:7: () otherlv_21= ';'
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:271:7: ()
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:272:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getStatementAccess().getEmptyStatementAction_12_0(),
                                  current);
                          
                    }

                    }

                    otherlv_21=(Token)match(input,12,FOLLOW_12_in_ruleStatement659); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_21, grammarAccess.getStatementAccess().getSemicolonKeyword_12_1());
                          
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
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleBreakStatement"
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:289:1: entryRuleBreakStatement returns [EObject current=null] : iv_ruleBreakStatement= ruleBreakStatement EOF ;
    public final EObject entryRuleBreakStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBreakStatement = null;


        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:290:2: (iv_ruleBreakStatement= ruleBreakStatement EOF )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:291:2: iv_ruleBreakStatement= ruleBreakStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBreakStatementRule()); 
            }
            pushFollow(FOLLOW_ruleBreakStatement_in_entryRuleBreakStatement696);
            iv_ruleBreakStatement=ruleBreakStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBreakStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBreakStatement706); if (state.failed) return current;

            }

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
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:298:1: ruleBreakStatement returns [EObject current=null] : ( () otherlv_1= 'break' ) ;
    public final EObject ruleBreakStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:301:28: ( ( () otherlv_1= 'break' ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:302:1: ( () otherlv_1= 'break' )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:302:1: ( () otherlv_1= 'break' )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:302:2: () otherlv_1= 'break'
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:302:2: ()
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:303:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getBreakStatementAccess().getBreakStatementAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,13,FOLLOW_13_in_ruleBreakStatement752); if (state.failed) return current;
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
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:320:1: entryRuleContinueStatement returns [EObject current=null] : iv_ruleContinueStatement= ruleContinueStatement EOF ;
    public final EObject entryRuleContinueStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContinueStatement = null;


        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:321:2: (iv_ruleContinueStatement= ruleContinueStatement EOF )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:322:2: iv_ruleContinueStatement= ruleContinueStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getContinueStatementRule()); 
            }
            pushFollow(FOLLOW_ruleContinueStatement_in_entryRuleContinueStatement788);
            iv_ruleContinueStatement=ruleContinueStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleContinueStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleContinueStatement798); if (state.failed) return current;

            }

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
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:329:1: ruleContinueStatement returns [EObject current=null] : ( () otherlv_1= 'continue' ) ;
    public final EObject ruleContinueStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:332:28: ( ( () otherlv_1= 'continue' ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:333:1: ( () otherlv_1= 'continue' )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:333:1: ( () otherlv_1= 'continue' )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:333:2: () otherlv_1= 'continue'
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:333:2: ()
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:334:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getContinueStatementAccess().getContinueStatementAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleContinueStatement844); if (state.failed) return current;
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
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:351:1: entryRuleStatementBlock returns [EObject current=null] : iv_ruleStatementBlock= ruleStatementBlock EOF ;
    public final EObject entryRuleStatementBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatementBlock = null;


        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:352:2: (iv_ruleStatementBlock= ruleStatementBlock EOF )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:353:2: iv_ruleStatementBlock= ruleStatementBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatementBlockRule()); 
            }
            pushFollow(FOLLOW_ruleStatementBlock_in_entryRuleStatementBlock880);
            iv_ruleStatementBlock=ruleStatementBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStatementBlock; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatementBlock890); if (state.failed) return current;

            }

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
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:360:1: ruleStatementBlock returns [EObject current=null] : (otherlv_0= '{' () ( (lv_statements_2_0= ruleStatement ) )* otherlv_3= '}' ) ;
    public final EObject ruleStatementBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject lv_statements_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:363:28: ( (otherlv_0= '{' () ( (lv_statements_2_0= ruleStatement ) )* otherlv_3= '}' ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:364:1: (otherlv_0= '{' () ( (lv_statements_2_0= ruleStatement ) )* otherlv_3= '}' )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:364:1: (otherlv_0= '{' () ( (lv_statements_2_0= ruleStatement ) )* otherlv_3= '}' )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:364:3: otherlv_0= '{' () ( (lv_statements_2_0= ruleStatement ) )* otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleStatementBlock927); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getStatementBlockAccess().getLeftCurlyBracketKeyword_0());
                  
            }
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:368:1: ()
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:369:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getStatementBlockAccess().getStatementBlockAction_1(),
                          current);
                  
            }

            }

            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:374:2: ( (lv_statements_2_0= ruleStatement ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID||(LA3_0>=12 && LA3_0<=15)||LA3_0==18||(LA3_0>=22 && LA3_0<=23)||(LA3_0>=26 && LA3_0<=27)||LA3_0==30||(LA3_0>=54 && LA3_0<=55)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:375:1: (lv_statements_2_0= ruleStatement )
            	    {
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:375:1: (lv_statements_2_0= ruleStatement )
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:376:3: lv_statements_2_0= ruleStatement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getStatementBlockAccess().getStatementsStatementParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleStatement_in_ruleStatementBlock957);
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
            	    break loop3;
                }
            } while (true);

            otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleStatementBlock970); if (state.failed) return current;
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
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:404:1: entryRuleAffectation returns [EObject current=null] : iv_ruleAffectation= ruleAffectation EOF ;
    public final EObject entryRuleAffectation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAffectation = null;


        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:405:2: (iv_ruleAffectation= ruleAffectation EOF )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:406:2: iv_ruleAffectation= ruleAffectation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAffectationRule()); 
            }
            pushFollow(FOLLOW_ruleAffectation_in_entryRuleAffectation1006);
            iv_ruleAffectation=ruleAffectation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAffectation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAffectation1016); if (state.failed) return current;

            }

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
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:413:1: ruleAffectation returns [EObject current=null] : ( ( (lv_variable_0_0= ruleVariableReference ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) ) ) ;
    public final EObject ruleAffectation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_variable_0_0 = null;

        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:416:28: ( ( ( (lv_variable_0_0= ruleVariableReference ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) ) ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:417:1: ( ( (lv_variable_0_0= ruleVariableReference ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) ) )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:417:1: ( ( (lv_variable_0_0= ruleVariableReference ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:417:2: ( (lv_variable_0_0= ruleVariableReference ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:417:2: ( (lv_variable_0_0= ruleVariableReference ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:418:1: (lv_variable_0_0= ruleVariableReference )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:418:1: (lv_variable_0_0= ruleVariableReference )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:419:3: lv_variable_0_0= ruleVariableReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAffectationAccess().getVariableVariableReferenceParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVariableReference_in_ruleAffectation1062);
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

            otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleAffectation1074); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getAffectationAccess().getEqualsSignKeyword_1());
                  
            }
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:439:1: ( (lv_value_2_0= ruleExpression ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:440:1: (lv_value_2_0= ruleExpression )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:440:1: (lv_value_2_0= ruleExpression )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:441:3: lv_value_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAffectationAccess().getValueExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleAffectation1095);
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
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:465:1: entryRuleIf returns [EObject current=null] : iv_ruleIf= ruleIf EOF ;
    public final EObject entryRuleIf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIf = null;


        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:466:2: (iv_ruleIf= ruleIf EOF )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:467:2: iv_ruleIf= ruleIf EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIfRule()); 
            }
            pushFollow(FOLLOW_ruleIf_in_entryRuleIf1131);
            iv_ruleIf=ruleIf();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIf; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIf1141); if (state.failed) return current;

            }

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
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:474:1: ruleIf returns [EObject current=null] : (otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_then_4_0= ruleStatement ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleStatement ) ) )? ) ;
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
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:477:28: ( (otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_then_4_0= ruleStatement ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleStatement ) ) )? ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:478:1: (otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_then_4_0= ruleStatement ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleStatement ) ) )? )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:478:1: (otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_then_4_0= ruleStatement ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleStatement ) ) )? )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:478:3: otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_then_4_0= ruleStatement ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleStatement ) ) )?
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleIf1178); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getIfAccess().getIfKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleIf1190); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getIfAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:486:1: ( (lv_condition_2_0= ruleExpression ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:487:1: (lv_condition_2_0= ruleExpression )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:487:1: (lv_condition_2_0= ruleExpression )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:488:3: lv_condition_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIfAccess().getConditionExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleIf1211);
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

            otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleIf1223); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getIfAccess().getRightParenthesisKeyword_3());
                  
            }
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:508:1: ( (lv_then_4_0= ruleStatement ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:509:1: (lv_then_4_0= ruleStatement )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:509:1: (lv_then_4_0= ruleStatement )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:510:3: lv_then_4_0= ruleStatement
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIfAccess().getThenStatementParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleStatement_in_ruleIf1244);
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

            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:526:2: ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleStatement ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==21) ) {
                int LA4_1 = input.LA(2);

                if ( (synpred1_InternalLeek()) ) {
                    alt4=1;
                }
            }
            switch (alt4) {
                case 1 :
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:526:3: ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleStatement ) )
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:526:3: ( ( 'else' )=>otherlv_5= 'else' )
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:526:4: ( 'else' )=>otherlv_5= 'else'
                    {
                    otherlv_5=(Token)match(input,21,FOLLOW_21_in_ruleIf1265); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getIfAccess().getElseKeyword_5_0());
                          
                    }

                    }

                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:531:2: ( (lv_else_6_0= ruleStatement ) )
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:532:1: (lv_else_6_0= ruleStatement )
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:532:1: (lv_else_6_0= ruleStatement )
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:533:3: lv_else_6_0= ruleStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIfAccess().getElseStatementParserRuleCall_5_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStatement_in_ruleIf1287);
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
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:557:1: entryRuleIteration returns [EObject current=null] : iv_ruleIteration= ruleIteration EOF ;
    public final EObject entryRuleIteration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIteration = null;


        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:558:2: (iv_ruleIteration= ruleIteration EOF )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:559:2: iv_ruleIteration= ruleIteration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIterationRule()); 
            }
            pushFollow(FOLLOW_ruleIteration_in_entryRuleIteration1325);
            iv_ruleIteration=ruleIteration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIteration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIteration1335); if (state.failed) return current;

            }

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
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:566:1: ruleIteration returns [EObject current=null] : (this_While_0= ruleWhile | this_ForIn_1= ruleForIn | this_For_2= ruleFor ) ;
    public final EObject ruleIteration() throws RecognitionException {
        EObject current = null;

        EObject this_While_0 = null;

        EObject this_ForIn_1 = null;

        EObject this_For_2 = null;


         enterRule(); 
            
        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:569:28: ( (this_While_0= ruleWhile | this_ForIn_1= ruleForIn | this_For_2= ruleFor ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:570:1: (this_While_0= ruleWhile | this_ForIn_1= ruleForIn | this_For_2= ruleFor )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:570:1: (this_While_0= ruleWhile | this_ForIn_1= ruleForIn | this_For_2= ruleFor )
            int alt5=3;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==22) ) {
                alt5=1;
            }
            else if ( (LA5_0==23) ) {
                int LA5_2 = input.LA(2);

                if ( (LA5_2==19) ) {
                    int LA5_3 = input.LA(3);

                    if ( (LA5_3==RULE_ID) ) {
                        int LA5_4 = input.LA(4);

                        if ( (LA5_4==12||LA5_4==50) ) {
                            alt5=3;
                        }
                        else if ( ((LA5_4>=24 && LA5_4<=25)) ) {
                            alt5=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 5, 4, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA5_3==26) ) {
                        alt5=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 3, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:571:5: this_While_0= ruleWhile
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getIterationAccess().getWhileParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleWhile_in_ruleIteration1382);
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
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:581:5: this_ForIn_1= ruleForIn
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getIterationAccess().getForInParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleForIn_in_ruleIteration1409);
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
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:591:5: this_For_2= ruleFor
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getIterationAccess().getForParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleFor_in_ruleIteration1436);
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
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:607:1: entryRuleWhile returns [EObject current=null] : iv_ruleWhile= ruleWhile EOF ;
    public final EObject entryRuleWhile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhile = null;


        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:608:2: (iv_ruleWhile= ruleWhile EOF )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:609:2: iv_ruleWhile= ruleWhile EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getWhileRule()); 
            }
            pushFollow(FOLLOW_ruleWhile_in_entryRuleWhile1471);
            iv_ruleWhile=ruleWhile();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleWhile; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleWhile1481); if (state.failed) return current;

            }

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
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:616:1: ruleWhile returns [EObject current=null] : (otherlv_0= 'while' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_statement_4_0= ruleStatement ) ) ) ;
    public final EObject ruleWhile() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_condition_2_0 = null;

        EObject lv_statement_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:619:28: ( (otherlv_0= 'while' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_statement_4_0= ruleStatement ) ) ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:620:1: (otherlv_0= 'while' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_statement_4_0= ruleStatement ) ) )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:620:1: (otherlv_0= 'while' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_statement_4_0= ruleStatement ) ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:620:3: otherlv_0= 'while' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_statement_4_0= ruleStatement ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_22_in_ruleWhile1518); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getWhileAccess().getWhileKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleWhile1530); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getWhileAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:628:1: ( (lv_condition_2_0= ruleExpression ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:629:1: (lv_condition_2_0= ruleExpression )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:629:1: (lv_condition_2_0= ruleExpression )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:630:3: lv_condition_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getWhileAccess().getConditionExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleWhile1551);
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

            otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleWhile1563); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getWhileAccess().getRightParenthesisKeyword_3());
                  
            }
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:650:1: ( (lv_statement_4_0= ruleStatement ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:651:1: (lv_statement_4_0= ruleStatement )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:651:1: (lv_statement_4_0= ruleStatement )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:652:3: lv_statement_4_0= ruleStatement
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getWhileAccess().getStatementStatementParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleStatement_in_ruleWhile1584);
            lv_statement_4_0=ruleStatement();

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
                      		"Statement");
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
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:676:1: entryRuleFor returns [EObject current=null] : iv_ruleFor= ruleFor EOF ;
    public final EObject entryRuleFor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFor = null;


        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:677:2: (iv_ruleFor= ruleFor EOF )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:678:2: iv_ruleFor= ruleFor EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getForRule()); 
            }
            pushFollow(FOLLOW_ruleFor_in_entryRuleFor1620);
            iv_ruleFor=ruleFor();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFor; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFor1630); if (state.failed) return current;

            }

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
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:685:1: ruleFor returns [EObject current=null] : (otherlv_0= 'for' otherlv_1= '(' ( (lv_initializer_2_0= ruleForInitializer ) ) otherlv_3= ';' ( (lv_condition_4_0= ruleExpression ) ) otherlv_5= ';' ( (lv_increment_6_0= ruleExpression ) ) otherlv_7= ')' ( (lv_statement_8_0= ruleStatement ) ) ) ;
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
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:688:28: ( (otherlv_0= 'for' otherlv_1= '(' ( (lv_initializer_2_0= ruleForInitializer ) ) otherlv_3= ';' ( (lv_condition_4_0= ruleExpression ) ) otherlv_5= ';' ( (lv_increment_6_0= ruleExpression ) ) otherlv_7= ')' ( (lv_statement_8_0= ruleStatement ) ) ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:689:1: (otherlv_0= 'for' otherlv_1= '(' ( (lv_initializer_2_0= ruleForInitializer ) ) otherlv_3= ';' ( (lv_condition_4_0= ruleExpression ) ) otherlv_5= ';' ( (lv_increment_6_0= ruleExpression ) ) otherlv_7= ')' ( (lv_statement_8_0= ruleStatement ) ) )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:689:1: (otherlv_0= 'for' otherlv_1= '(' ( (lv_initializer_2_0= ruleForInitializer ) ) otherlv_3= ';' ( (lv_condition_4_0= ruleExpression ) ) otherlv_5= ';' ( (lv_increment_6_0= ruleExpression ) ) otherlv_7= ')' ( (lv_statement_8_0= ruleStatement ) ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:689:3: otherlv_0= 'for' otherlv_1= '(' ( (lv_initializer_2_0= ruleForInitializer ) ) otherlv_3= ';' ( (lv_condition_4_0= ruleExpression ) ) otherlv_5= ';' ( (lv_increment_6_0= ruleExpression ) ) otherlv_7= ')' ( (lv_statement_8_0= ruleStatement ) )
            {
            otherlv_0=(Token)match(input,23,FOLLOW_23_in_ruleFor1667); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getForAccess().getForKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleFor1679); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getForAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:697:1: ( (lv_initializer_2_0= ruleForInitializer ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:698:1: (lv_initializer_2_0= ruleForInitializer )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:698:1: (lv_initializer_2_0= ruleForInitializer )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:699:3: lv_initializer_2_0= ruleForInitializer
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getForAccess().getInitializerForInitializerParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleForInitializer_in_ruleFor1700);
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

            otherlv_3=(Token)match(input,12,FOLLOW_12_in_ruleFor1712); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getForAccess().getSemicolonKeyword_3());
                  
            }
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:719:1: ( (lv_condition_4_0= ruleExpression ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:720:1: (lv_condition_4_0= ruleExpression )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:720:1: (lv_condition_4_0= ruleExpression )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:721:3: lv_condition_4_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getForAccess().getConditionExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleFor1733);
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

            otherlv_5=(Token)match(input,12,FOLLOW_12_in_ruleFor1745); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getForAccess().getSemicolonKeyword_5());
                  
            }
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:741:1: ( (lv_increment_6_0= ruleExpression ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:742:1: (lv_increment_6_0= ruleExpression )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:742:1: (lv_increment_6_0= ruleExpression )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:743:3: lv_increment_6_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getForAccess().getIncrementExpressionParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleFor1766);
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

            otherlv_7=(Token)match(input,20,FOLLOW_20_in_ruleFor1778); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getForAccess().getRightParenthesisKeyword_7());
                  
            }
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:763:1: ( (lv_statement_8_0= ruleStatement ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:764:1: (lv_statement_8_0= ruleStatement )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:764:1: (lv_statement_8_0= ruleStatement )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:765:3: lv_statement_8_0= ruleStatement
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getForAccess().getStatementStatementParserRuleCall_8_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleStatement_in_ruleFor1799);
            lv_statement_8_0=ruleStatement();

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
                      		"Statement");
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
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:789:1: entryRuleForIn returns [EObject current=null] : iv_ruleForIn= ruleForIn EOF ;
    public final EObject entryRuleForIn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForIn = null;


        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:790:2: (iv_ruleForIn= ruleForIn EOF )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:791:2: iv_ruleForIn= ruleForIn EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getForInRule()); 
            }
            pushFollow(FOLLOW_ruleForIn_in_entryRuleForIn1835);
            iv_ruleForIn=ruleForIn();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleForIn; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleForIn1845); if (state.failed) return current;

            }

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
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:798:1: ruleForIn returns [EObject current=null] : (otherlv_0= 'for' otherlv_1= '(' ( ( (lv_key_2_0= ruleForInVariableReference ) ) otherlv_3= ':' )? ( (lv_value_4_0= ruleForInVariableReference ) ) otherlv_5= 'in' ( (lv_array_6_0= ruleExpression ) ) otherlv_7= ')' ( (lv_statement_8_0= ruleStatement ) ) ) ;
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
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:801:28: ( (otherlv_0= 'for' otherlv_1= '(' ( ( (lv_key_2_0= ruleForInVariableReference ) ) otherlv_3= ':' )? ( (lv_value_4_0= ruleForInVariableReference ) ) otherlv_5= 'in' ( (lv_array_6_0= ruleExpression ) ) otherlv_7= ')' ( (lv_statement_8_0= ruleStatement ) ) ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:802:1: (otherlv_0= 'for' otherlv_1= '(' ( ( (lv_key_2_0= ruleForInVariableReference ) ) otherlv_3= ':' )? ( (lv_value_4_0= ruleForInVariableReference ) ) otherlv_5= 'in' ( (lv_array_6_0= ruleExpression ) ) otherlv_7= ')' ( (lv_statement_8_0= ruleStatement ) ) )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:802:1: (otherlv_0= 'for' otherlv_1= '(' ( ( (lv_key_2_0= ruleForInVariableReference ) ) otherlv_3= ':' )? ( (lv_value_4_0= ruleForInVariableReference ) ) otherlv_5= 'in' ( (lv_array_6_0= ruleExpression ) ) otherlv_7= ')' ( (lv_statement_8_0= ruleStatement ) ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:802:3: otherlv_0= 'for' otherlv_1= '(' ( ( (lv_key_2_0= ruleForInVariableReference ) ) otherlv_3= ':' )? ( (lv_value_4_0= ruleForInVariableReference ) ) otherlv_5= 'in' ( (lv_array_6_0= ruleExpression ) ) otherlv_7= ')' ( (lv_statement_8_0= ruleStatement ) )
            {
            otherlv_0=(Token)match(input,23,FOLLOW_23_in_ruleForIn1882); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getForInAccess().getForKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleForIn1894); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getForInAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:810:1: ( ( (lv_key_2_0= ruleForInVariableReference ) ) otherlv_3= ':' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==26) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==RULE_ID) ) {
                    int LA6_3 = input.LA(3);

                    if ( (LA6_3==24) ) {
                        alt6=1;
                    }
                }
            }
            else if ( (LA6_0==RULE_ID) ) {
                int LA6_2 = input.LA(2);

                if ( (LA6_2==24) ) {
                    alt6=1;
                }
            }
            switch (alt6) {
                case 1 :
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:810:2: ( (lv_key_2_0= ruleForInVariableReference ) ) otherlv_3= ':'
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:810:2: ( (lv_key_2_0= ruleForInVariableReference ) )
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:811:1: (lv_key_2_0= ruleForInVariableReference )
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:811:1: (lv_key_2_0= ruleForInVariableReference )
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:812:3: lv_key_2_0= ruleForInVariableReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getForInAccess().getKeyForInVariableReferenceParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleForInVariableReference_in_ruleForIn1916);
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

                    otherlv_3=(Token)match(input,24,FOLLOW_24_in_ruleForIn1928); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getForInAccess().getColonKeyword_2_1());
                          
                    }

                    }
                    break;

            }

            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:832:3: ( (lv_value_4_0= ruleForInVariableReference ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:833:1: (lv_value_4_0= ruleForInVariableReference )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:833:1: (lv_value_4_0= ruleForInVariableReference )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:834:3: lv_value_4_0= ruleForInVariableReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getForInAccess().getValueForInVariableReferenceParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleForInVariableReference_in_ruleForIn1951);
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

            otherlv_5=(Token)match(input,25,FOLLOW_25_in_ruleForIn1963); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getForInAccess().getInKeyword_4());
                  
            }
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:854:1: ( (lv_array_6_0= ruleExpression ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:855:1: (lv_array_6_0= ruleExpression )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:855:1: (lv_array_6_0= ruleExpression )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:856:3: lv_array_6_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getForInAccess().getArrayExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleForIn1984);
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

            otherlv_7=(Token)match(input,20,FOLLOW_20_in_ruleForIn1996); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getForInAccess().getRightParenthesisKeyword_6());
                  
            }
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:876:1: ( (lv_statement_8_0= ruleStatement ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:877:1: (lv_statement_8_0= ruleStatement )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:877:1: (lv_statement_8_0= ruleStatement )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:878:3: lv_statement_8_0= ruleStatement
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getForInAccess().getStatementStatementParserRuleCall_7_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleStatement_in_ruleForIn2017);
            lv_statement_8_0=ruleStatement();

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
                      		"Statement");
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
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:902:1: entryRuleForInVariableReference returns [EObject current=null] : iv_ruleForInVariableReference= ruleForInVariableReference EOF ;
    public final EObject entryRuleForInVariableReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForInVariableReference = null;


        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:903:2: (iv_ruleForInVariableReference= ruleForInVariableReference EOF )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:904:2: iv_ruleForInVariableReference= ruleForInVariableReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getForInVariableReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleForInVariableReference_in_entryRuleForInVariableReference2053);
            iv_ruleForInVariableReference=ruleForInVariableReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleForInVariableReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleForInVariableReference2063); if (state.failed) return current;

            }

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
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:911:1: ruleForInVariableReference returns [EObject current=null] : ( (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) ) | ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleForInVariableReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:914:28: ( ( (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) ) | ( (otherlv_2= RULE_ID ) ) ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:915:1: ( (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) ) | ( (otherlv_2= RULE_ID ) ) )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:915:1: ( (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) ) | ( (otherlv_2= RULE_ID ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==26) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_ID) ) {
                alt7=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:915:2: (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) )
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:915:2: (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) )
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:915:4: otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) )
                    {
                    otherlv_0=(Token)match(input,26,FOLLOW_26_in_ruleForInVariableReference2101); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getForInVariableReferenceAccess().getVarKeyword_0_0());
                          
                    }
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:919:1: ( (lv_name_1_0= RULE_ID ) )
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:920:1: (lv_name_1_0= RULE_ID )
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:920:1: (lv_name_1_0= RULE_ID )
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:921:3: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleForInVariableReference2118); if (state.failed) return current;
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
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:938:6: ( (otherlv_2= RULE_ID ) )
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:938:6: ( (otherlv_2= RULE_ID ) )
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:939:1: (otherlv_2= RULE_ID )
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:939:1: (otherlv_2= RULE_ID )
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:940:3: otherlv_2= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getForInVariableReferenceRule());
                      	        }
                              
                    }
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleForInVariableReference2150); if (state.failed) return current;
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
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:959:1: entryRuleForInitializer returns [EObject current=null] : iv_ruleForInitializer= ruleForInitializer EOF ;
    public final EObject entryRuleForInitializer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForInitializer = null;


        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:960:2: (iv_ruleForInitializer= ruleForInitializer EOF )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:961:2: iv_ruleForInitializer= ruleForInitializer EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getForInitializerRule()); 
            }
            pushFollow(FOLLOW_ruleForInitializer_in_entryRuleForInitializer2186);
            iv_ruleForInitializer=ruleForInitializer();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleForInitializer; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleForInitializer2196); if (state.failed) return current;

            }

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
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:968:1: ruleForInitializer returns [EObject current=null] : this_VariableReference_0= ruleVariableReference ;
    public final EObject ruleForInitializer() throws RecognitionException {
        EObject current = null;

        EObject this_VariableReference_0 = null;


         enterRule(); 
            
        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:971:28: (this_VariableReference_0= ruleVariableReference )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:973:5: this_VariableReference_0= ruleVariableReference
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getForInitializerAccess().getVariableReferenceParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleVariableReference_in_ruleForInitializer2242);
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
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:989:1: entryRuleFunctionDeclaration returns [EObject current=null] : iv_ruleFunctionDeclaration= ruleFunctionDeclaration EOF ;
    public final EObject entryRuleFunctionDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionDeclaration = null;


        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:990:2: (iv_ruleFunctionDeclaration= ruleFunctionDeclaration EOF )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:991:2: iv_ruleFunctionDeclaration= ruleFunctionDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunctionDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleFunctionDeclaration_in_entryRuleFunctionDeclaration2276);
            iv_ruleFunctionDeclaration=ruleFunctionDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFunctionDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionDeclaration2286); if (state.failed) return current;

            }

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
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:998:1: ruleFunctionDeclaration returns [EObject current=null] : (otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleParameterDeclaration ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameterDeclaration ) ) )* )? otherlv_6= ')' ( (lv_body_7_0= ruleStatementBlock ) ) ) ;
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
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1001:28: ( (otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleParameterDeclaration ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameterDeclaration ) ) )* )? otherlv_6= ')' ( (lv_body_7_0= ruleStatementBlock ) ) ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1002:1: (otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleParameterDeclaration ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameterDeclaration ) ) )* )? otherlv_6= ')' ( (lv_body_7_0= ruleStatementBlock ) ) )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1002:1: (otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleParameterDeclaration ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameterDeclaration ) ) )* )? otherlv_6= ')' ( (lv_body_7_0= ruleStatementBlock ) ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1002:3: otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleParameterDeclaration ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameterDeclaration ) ) )* )? otherlv_6= ')' ( (lv_body_7_0= ruleStatementBlock ) )
            {
            otherlv_0=(Token)match(input,27,FOLLOW_27_in_ruleFunctionDeclaration2323); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getFunctionDeclarationAccess().getFunctionKeyword_0());
                  
            }
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1006:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1007:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1007:1: (lv_name_1_0= RULE_ID )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1008:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionDeclaration2340); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleFunctionDeclaration2357); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getFunctionDeclarationAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1028:1: ( ( (lv_parameters_3_0= ruleParameterDeclaration ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameterDeclaration ) ) )* )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID||LA9_0==29) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1028:2: ( (lv_parameters_3_0= ruleParameterDeclaration ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameterDeclaration ) ) )*
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1028:2: ( (lv_parameters_3_0= ruleParameterDeclaration ) )
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1029:1: (lv_parameters_3_0= ruleParameterDeclaration )
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1029:1: (lv_parameters_3_0= ruleParameterDeclaration )
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1030:3: lv_parameters_3_0= ruleParameterDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFunctionDeclarationAccess().getParametersParameterDeclarationParserRuleCall_3_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleParameterDeclaration_in_ruleFunctionDeclaration2379);
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

                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1046:2: (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameterDeclaration ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==28) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1046:4: otherlv_4= ',' ( (lv_parameters_5_0= ruleParameterDeclaration ) )
                    	    {
                    	    otherlv_4=(Token)match(input,28,FOLLOW_28_in_ruleFunctionDeclaration2392); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getFunctionDeclarationAccess().getCommaKeyword_3_1_0());
                    	          
                    	    }
                    	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1050:1: ( (lv_parameters_5_0= ruleParameterDeclaration ) )
                    	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1051:1: (lv_parameters_5_0= ruleParameterDeclaration )
                    	    {
                    	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1051:1: (lv_parameters_5_0= ruleParameterDeclaration )
                    	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1052:3: lv_parameters_5_0= ruleParameterDeclaration
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getFunctionDeclarationAccess().getParametersParameterDeclarationParserRuleCall_3_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleParameterDeclaration_in_ruleFunctionDeclaration2413);
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
                    	    break loop8;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,20,FOLLOW_20_in_ruleFunctionDeclaration2429); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getFunctionDeclarationAccess().getRightParenthesisKeyword_4());
                  
            }
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1072:1: ( (lv_body_7_0= ruleStatementBlock ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1073:1: (lv_body_7_0= ruleStatementBlock )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1073:1: (lv_body_7_0= ruleStatementBlock )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1074:3: lv_body_7_0= ruleStatementBlock
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFunctionDeclarationAccess().getBodyStatementBlockParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleStatementBlock_in_ruleFunctionDeclaration2450);
            lv_body_7_0=ruleStatementBlock();

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
                      		"StatementBlock");
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
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1098:1: entryRuleParameterDeclaration returns [EObject current=null] : iv_ruleParameterDeclaration= ruleParameterDeclaration EOF ;
    public final EObject entryRuleParameterDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterDeclaration = null;


        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1099:2: (iv_ruleParameterDeclaration= ruleParameterDeclaration EOF )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1100:2: iv_ruleParameterDeclaration= ruleParameterDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleParameterDeclaration_in_entryRuleParameterDeclaration2486);
            iv_ruleParameterDeclaration=ruleParameterDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameterDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameterDeclaration2496); if (state.failed) return current;

            }

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
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1107:1: ruleParameterDeclaration returns [EObject current=null] : ( ( (lv_byAdress_0_0= '@' ) )? ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleParameterDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_byAdress_0_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1110:28: ( ( ( (lv_byAdress_0_0= '@' ) )? ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1111:1: ( ( (lv_byAdress_0_0= '@' ) )? ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1111:1: ( ( (lv_byAdress_0_0= '@' ) )? ( (lv_name_1_0= RULE_ID ) ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1111:2: ( (lv_byAdress_0_0= '@' ) )? ( (lv_name_1_0= RULE_ID ) )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1111:2: ( (lv_byAdress_0_0= '@' ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==29) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1112:1: (lv_byAdress_0_0= '@' )
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1112:1: (lv_byAdress_0_0= '@' )
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1113:3: lv_byAdress_0_0= '@'
                    {
                    lv_byAdress_0_0=(Token)match(input,29,FOLLOW_29_in_ruleParameterDeclaration2539); if (state.failed) return current;
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

            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1126:3: ( (lv_name_1_0= RULE_ID ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1127:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1127:1: (lv_name_1_0= RULE_ID )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1128:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParameterDeclaration2570); if (state.failed) return current;
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
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1152:1: entryRuleLocalDeclaration returns [EObject current=null] : iv_ruleLocalDeclaration= ruleLocalDeclaration EOF ;
    public final EObject entryRuleLocalDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocalDeclaration = null;


        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1153:2: (iv_ruleLocalDeclaration= ruleLocalDeclaration EOF )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1154:2: iv_ruleLocalDeclaration= ruleLocalDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLocalDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleLocalDeclaration_in_entryRuleLocalDeclaration2611);
            iv_ruleLocalDeclaration=ruleLocalDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLocalDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLocalDeclaration2621); if (state.failed) return current;

            }

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
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1161:1: ruleLocalDeclaration returns [EObject current=null] : (otherlv_0= 'var' ( (lv_variables_1_0= ruleVariableDeclaration ) ) (otherlv_2= ',' ( (lv_variables_3_0= ruleVariableDeclaration ) ) )* ) ;
    public final EObject ruleLocalDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_variables_1_0 = null;

        EObject lv_variables_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1164:28: ( (otherlv_0= 'var' ( (lv_variables_1_0= ruleVariableDeclaration ) ) (otherlv_2= ',' ( (lv_variables_3_0= ruleVariableDeclaration ) ) )* ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1165:1: (otherlv_0= 'var' ( (lv_variables_1_0= ruleVariableDeclaration ) ) (otherlv_2= ',' ( (lv_variables_3_0= ruleVariableDeclaration ) ) )* )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1165:1: (otherlv_0= 'var' ( (lv_variables_1_0= ruleVariableDeclaration ) ) (otherlv_2= ',' ( (lv_variables_3_0= ruleVariableDeclaration ) ) )* )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1165:3: otherlv_0= 'var' ( (lv_variables_1_0= ruleVariableDeclaration ) ) (otherlv_2= ',' ( (lv_variables_3_0= ruleVariableDeclaration ) ) )*
            {
            otherlv_0=(Token)match(input,26,FOLLOW_26_in_ruleLocalDeclaration2658); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getLocalDeclarationAccess().getVarKeyword_0());
                  
            }
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1169:1: ( (lv_variables_1_0= ruleVariableDeclaration ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1170:1: (lv_variables_1_0= ruleVariableDeclaration )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1170:1: (lv_variables_1_0= ruleVariableDeclaration )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1171:3: lv_variables_1_0= ruleVariableDeclaration
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLocalDeclarationAccess().getVariablesVariableDeclarationParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVariableDeclaration_in_ruleLocalDeclaration2679);
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

            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1187:2: (otherlv_2= ',' ( (lv_variables_3_0= ruleVariableDeclaration ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==28) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1187:4: otherlv_2= ',' ( (lv_variables_3_0= ruleVariableDeclaration ) )
            	    {
            	    otherlv_2=(Token)match(input,28,FOLLOW_28_in_ruleLocalDeclaration2692); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getLocalDeclarationAccess().getCommaKeyword_2_0());
            	          
            	    }
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1191:1: ( (lv_variables_3_0= ruleVariableDeclaration ) )
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1192:1: (lv_variables_3_0= ruleVariableDeclaration )
            	    {
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1192:1: (lv_variables_3_0= ruleVariableDeclaration )
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1193:3: lv_variables_3_0= ruleVariableDeclaration
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLocalDeclarationAccess().getVariablesVariableDeclarationParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleVariableDeclaration_in_ruleLocalDeclaration2713);
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
            	    break loop11;
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
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1217:1: entryRuleGlobalDeclaration returns [EObject current=null] : iv_ruleGlobalDeclaration= ruleGlobalDeclaration EOF ;
    public final EObject entryRuleGlobalDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGlobalDeclaration = null;


        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1218:2: (iv_ruleGlobalDeclaration= ruleGlobalDeclaration EOF )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1219:2: iv_ruleGlobalDeclaration= ruleGlobalDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGlobalDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleGlobalDeclaration_in_entryRuleGlobalDeclaration2751);
            iv_ruleGlobalDeclaration=ruleGlobalDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGlobalDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGlobalDeclaration2761); if (state.failed) return current;

            }

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
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1226:1: ruleGlobalDeclaration returns [EObject current=null] : (otherlv_0= 'global' ( (lv_variables_1_0= ruleVariableDeclaration ) ) (otherlv_2= ',' ( (lv_variables_3_0= ruleVariableDeclaration ) ) )* ) ;
    public final EObject ruleGlobalDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_variables_1_0 = null;

        EObject lv_variables_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1229:28: ( (otherlv_0= 'global' ( (lv_variables_1_0= ruleVariableDeclaration ) ) (otherlv_2= ',' ( (lv_variables_3_0= ruleVariableDeclaration ) ) )* ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1230:1: (otherlv_0= 'global' ( (lv_variables_1_0= ruleVariableDeclaration ) ) (otherlv_2= ',' ( (lv_variables_3_0= ruleVariableDeclaration ) ) )* )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1230:1: (otherlv_0= 'global' ( (lv_variables_1_0= ruleVariableDeclaration ) ) (otherlv_2= ',' ( (lv_variables_3_0= ruleVariableDeclaration ) ) )* )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1230:3: otherlv_0= 'global' ( (lv_variables_1_0= ruleVariableDeclaration ) ) (otherlv_2= ',' ( (lv_variables_3_0= ruleVariableDeclaration ) ) )*
            {
            otherlv_0=(Token)match(input,30,FOLLOW_30_in_ruleGlobalDeclaration2798); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getGlobalDeclarationAccess().getGlobalKeyword_0());
                  
            }
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1234:1: ( (lv_variables_1_0= ruleVariableDeclaration ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1235:1: (lv_variables_1_0= ruleVariableDeclaration )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1235:1: (lv_variables_1_0= ruleVariableDeclaration )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1236:3: lv_variables_1_0= ruleVariableDeclaration
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getGlobalDeclarationAccess().getVariablesVariableDeclarationParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVariableDeclaration_in_ruleGlobalDeclaration2819);
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

            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1252:2: (otherlv_2= ',' ( (lv_variables_3_0= ruleVariableDeclaration ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==28) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1252:4: otherlv_2= ',' ( (lv_variables_3_0= ruleVariableDeclaration ) )
            	    {
            	    otherlv_2=(Token)match(input,28,FOLLOW_28_in_ruleGlobalDeclaration2832); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getGlobalDeclarationAccess().getCommaKeyword_2_0());
            	          
            	    }
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1256:1: ( (lv_variables_3_0= ruleVariableDeclaration ) )
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1257:1: (lv_variables_3_0= ruleVariableDeclaration )
            	    {
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1257:1: (lv_variables_3_0= ruleVariableDeclaration )
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1258:3: lv_variables_3_0= ruleVariableDeclaration
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getGlobalDeclarationAccess().getVariablesVariableDeclarationParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleVariableDeclaration_in_ruleGlobalDeclaration2853);
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
            	    break loop12;
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
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1282:1: entryRuleVariableDeclaration returns [EObject current=null] : iv_ruleVariableDeclaration= ruleVariableDeclaration EOF ;
    public final EObject entryRuleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDeclaration = null;


        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1283:2: (iv_ruleVariableDeclaration= ruleVariableDeclaration EOF )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1284:2: iv_ruleVariableDeclaration= ruleVariableDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleVariableDeclaration_in_entryRuleVariableDeclaration2891);
            iv_ruleVariableDeclaration=ruleVariableDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariableDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableDeclaration2901); if (state.failed) return current;

            }

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
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1291:1: ruleVariableDeclaration returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) ) )? ) ;
    public final EObject ruleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1294:28: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) ) )? ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1295:1: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) ) )? )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1295:1: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) ) )? )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1295:2: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) ) )?
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1295:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1296:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1296:1: (lv_name_0_0= RULE_ID )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1297:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariableDeclaration2943); if (state.failed) return current;
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

            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1313:2: (otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==17) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1313:4: otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) )
                    {
                    otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleVariableDeclaration2961); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getVariableDeclarationAccess().getEqualsSignKeyword_1_0());
                          
                    }
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1317:1: ( (lv_value_2_0= ruleExpression ) )
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1318:1: (lv_value_2_0= ruleExpression )
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1318:1: (lv_value_2_0= ruleExpression )
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1319:3: lv_value_2_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getVariableDeclarationAccess().getValueExpressionParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleVariableDeclaration2982);
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
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1343:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1344:2: (iv_ruleExpression= ruleExpression EOF )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1345:2: iv_ruleExpression= ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression3020);
            iv_ruleExpression=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression3030); if (state.failed) return current;

            }

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
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1352:1: ruleExpression returns [EObject current=null] : this_Comparison_0= ruleComparison ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Comparison_0 = null;


         enterRule(); 
            
        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1355:28: (this_Comparison_0= ruleComparison )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1357:5: this_Comparison_0= ruleComparison
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExpressionAccess().getComparisonParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleComparison_in_ruleExpression3076);
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
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1373:1: entryRuleComparison returns [EObject current=null] : iv_ruleComparison= ruleComparison EOF ;
    public final EObject entryRuleComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparison = null;


        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1374:2: (iv_ruleComparison= ruleComparison EOF )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1375:2: iv_ruleComparison= ruleComparison EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getComparisonRule()); 
            }
            pushFollow(FOLLOW_ruleComparison_in_entryRuleComparison3110);
            iv_ruleComparison=ruleComparison();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleComparison; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleComparison3120); if (state.failed) return current;

            }

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
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1382:1: ruleComparison returns [EObject current=null] : (this_Or_0= ruleOr ( ( ( () otherlv_2= '===' ) | ( () otherlv_4= '==' ) | ( () otherlv_6= '!==' ) | ( () otherlv_8= '!=' ) | ( () otherlv_10= '<=' ) | ( () otherlv_12= '<' ) | ( () otherlv_14= '>=' ) | ( () otherlv_16= '>' ) ) ( (lv_right_17_0= ruleOr ) ) )* ) ;
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
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1385:28: ( (this_Or_0= ruleOr ( ( ( () otherlv_2= '===' ) | ( () otherlv_4= '==' ) | ( () otherlv_6= '!==' ) | ( () otherlv_8= '!=' ) | ( () otherlv_10= '<=' ) | ( () otherlv_12= '<' ) | ( () otherlv_14= '>=' ) | ( () otherlv_16= '>' ) ) ( (lv_right_17_0= ruleOr ) ) )* ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1386:1: (this_Or_0= ruleOr ( ( ( () otherlv_2= '===' ) | ( () otherlv_4= '==' ) | ( () otherlv_6= '!==' ) | ( () otherlv_8= '!=' ) | ( () otherlv_10= '<=' ) | ( () otherlv_12= '<' ) | ( () otherlv_14= '>=' ) | ( () otherlv_16= '>' ) ) ( (lv_right_17_0= ruleOr ) ) )* )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1386:1: (this_Or_0= ruleOr ( ( ( () otherlv_2= '===' ) | ( () otherlv_4= '==' ) | ( () otherlv_6= '!==' ) | ( () otherlv_8= '!=' ) | ( () otherlv_10= '<=' ) | ( () otherlv_12= '<' ) | ( () otherlv_14= '>=' ) | ( () otherlv_16= '>' ) ) ( (lv_right_17_0= ruleOr ) ) )* )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1387:5: this_Or_0= ruleOr ( ( ( () otherlv_2= '===' ) | ( () otherlv_4= '==' ) | ( () otherlv_6= '!==' ) | ( () otherlv_8= '!=' ) | ( () otherlv_10= '<=' ) | ( () otherlv_12= '<' ) | ( () otherlv_14= '>=' ) | ( () otherlv_16= '>' ) ) ( (lv_right_17_0= ruleOr ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getComparisonAccess().getOrParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleOr_in_ruleComparison3167);
            this_Or_0=ruleOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_Or_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1395:1: ( ( ( () otherlv_2= '===' ) | ( () otherlv_4= '==' ) | ( () otherlv_6= '!==' ) | ( () otherlv_8= '!=' ) | ( () otherlv_10= '<=' ) | ( () otherlv_12= '<' ) | ( () otherlv_14= '>=' ) | ( () otherlv_16= '>' ) ) ( (lv_right_17_0= ruleOr ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=31 && LA15_0<=38)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1395:2: ( ( () otherlv_2= '===' ) | ( () otherlv_4= '==' ) | ( () otherlv_6= '!==' ) | ( () otherlv_8= '!=' ) | ( () otherlv_10= '<=' ) | ( () otherlv_12= '<' ) | ( () otherlv_14= '>=' ) | ( () otherlv_16= '>' ) ) ( (lv_right_17_0= ruleOr ) )
            	    {
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1395:2: ( ( () otherlv_2= '===' ) | ( () otherlv_4= '==' ) | ( () otherlv_6= '!==' ) | ( () otherlv_8= '!=' ) | ( () otherlv_10= '<=' ) | ( () otherlv_12= '<' ) | ( () otherlv_14= '>=' ) | ( () otherlv_16= '>' ) )
            	    int alt14=8;
            	    switch ( input.LA(1) ) {
            	    case 31:
            	        {
            	        alt14=1;
            	        }
            	        break;
            	    case 32:
            	        {
            	        alt14=2;
            	        }
            	        break;
            	    case 33:
            	        {
            	        alt14=3;
            	        }
            	        break;
            	    case 34:
            	        {
            	        alt14=4;
            	        }
            	        break;
            	    case 35:
            	        {
            	        alt14=5;
            	        }
            	        break;
            	    case 36:
            	        {
            	        alt14=6;
            	        }
            	        break;
            	    case 37:
            	        {
            	        alt14=7;
            	        }
            	        break;
            	    case 38:
            	        {
            	        alt14=8;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 14, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt14) {
            	        case 1 :
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1395:3: ( () otherlv_2= '===' )
            	            {
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1395:3: ( () otherlv_2= '===' )
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1395:4: () otherlv_2= '==='
            	            {
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1395:4: ()
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1396:5: 
            	            {
            	            if ( state.backtracking==0 ) {

            	                      current = forceCreateModelElementAndSet(
            	                          grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0_0_0(),
            	                          current);
            	                  
            	            }

            	            }

            	            otherlv_2=(Token)match(input,31,FOLLOW_31_in_ruleComparison3190); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_2, grammarAccess.getComparisonAccess().getEqualsSignEqualsSignEqualsSignKeyword_1_0_0_1());
            	                  
            	            }

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1406:6: ( () otherlv_4= '==' )
            	            {
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1406:6: ( () otherlv_4= '==' )
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1406:7: () otherlv_4= '=='
            	            {
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1406:7: ()
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1407:5: 
            	            {
            	            if ( state.backtracking==0 ) {

            	                      current = forceCreateModelElementAndSet(
            	                          grammarAccess.getComparisonAccess().getEqualsLeftAction_1_0_1_0(),
            	                          current);
            	                  
            	            }

            	            }

            	            otherlv_4=(Token)match(input,32,FOLLOW_32_in_ruleComparison3219); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_4, grammarAccess.getComparisonAccess().getEqualsSignEqualsSignKeyword_1_0_1_1());
            	                  
            	            }

            	            }


            	            }
            	            break;
            	        case 3 :
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1417:6: ( () otherlv_6= '!==' )
            	            {
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1417:6: ( () otherlv_6= '!==' )
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1417:7: () otherlv_6= '!=='
            	            {
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1417:7: ()
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1418:5: 
            	            {
            	            if ( state.backtracking==0 ) {

            	                      current = forceCreateModelElementAndSet(
            	                          grammarAccess.getComparisonAccess().getTypedDifferentLeftAction_1_0_2_0(),
            	                          current);
            	                  
            	            }

            	            }

            	            otherlv_6=(Token)match(input,33,FOLLOW_33_in_ruleComparison3248); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_6, grammarAccess.getComparisonAccess().getExclamationMarkEqualsSignEqualsSignKeyword_1_0_2_1());
            	                  
            	            }

            	            }


            	            }
            	            break;
            	        case 4 :
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1428:6: ( () otherlv_8= '!=' )
            	            {
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1428:6: ( () otherlv_8= '!=' )
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1428:7: () otherlv_8= '!='
            	            {
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1428:7: ()
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1429:5: 
            	            {
            	            if ( state.backtracking==0 ) {

            	                      current = forceCreateModelElementAndSet(
            	                          grammarAccess.getComparisonAccess().getDifferentLeftAction_1_0_3_0(),
            	                          current);
            	                  
            	            }

            	            }

            	            otherlv_8=(Token)match(input,34,FOLLOW_34_in_ruleComparison3277); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_8, grammarAccess.getComparisonAccess().getExclamationMarkEqualsSignKeyword_1_0_3_1());
            	                  
            	            }

            	            }


            	            }
            	            break;
            	        case 5 :
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1439:6: ( () otherlv_10= '<=' )
            	            {
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1439:6: ( () otherlv_10= '<=' )
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1439:7: () otherlv_10= '<='
            	            {
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1439:7: ()
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1440:5: 
            	            {
            	            if ( state.backtracking==0 ) {

            	                      current = forceCreateModelElementAndSet(
            	                          grammarAccess.getComparisonAccess().getLessOrEqualsLeftAction_1_0_4_0(),
            	                          current);
            	                  
            	            }

            	            }

            	            otherlv_10=(Token)match(input,35,FOLLOW_35_in_ruleComparison3306); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_10, grammarAccess.getComparisonAccess().getLessThanSignEqualsSignKeyword_1_0_4_1());
            	                  
            	            }

            	            }


            	            }
            	            break;
            	        case 6 :
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1450:6: ( () otherlv_12= '<' )
            	            {
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1450:6: ( () otherlv_12= '<' )
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1450:7: () otherlv_12= '<'
            	            {
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1450:7: ()
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1451:5: 
            	            {
            	            if ( state.backtracking==0 ) {

            	                      current = forceCreateModelElementAndSet(
            	                          grammarAccess.getComparisonAccess().getLessLeftAction_1_0_5_0(),
            	                          current);
            	                  
            	            }

            	            }

            	            otherlv_12=(Token)match(input,36,FOLLOW_36_in_ruleComparison3335); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_12, grammarAccess.getComparisonAccess().getLessThanSignKeyword_1_0_5_1());
            	                  
            	            }

            	            }


            	            }
            	            break;
            	        case 7 :
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1461:6: ( () otherlv_14= '>=' )
            	            {
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1461:6: ( () otherlv_14= '>=' )
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1461:7: () otherlv_14= '>='
            	            {
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1461:7: ()
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1462:5: 
            	            {
            	            if ( state.backtracking==0 ) {

            	                      current = forceCreateModelElementAndSet(
            	                          grammarAccess.getComparisonAccess().getMoreOrEqualsLeftAction_1_0_6_0(),
            	                          current);
            	                  
            	            }

            	            }

            	            otherlv_14=(Token)match(input,37,FOLLOW_37_in_ruleComparison3364); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_14, grammarAccess.getComparisonAccess().getGreaterThanSignEqualsSignKeyword_1_0_6_1());
            	                  
            	            }

            	            }


            	            }
            	            break;
            	        case 8 :
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1472:6: ( () otherlv_16= '>' )
            	            {
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1472:6: ( () otherlv_16= '>' )
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1472:7: () otherlv_16= '>'
            	            {
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1472:7: ()
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1473:5: 
            	            {
            	            if ( state.backtracking==0 ) {

            	                      current = forceCreateModelElementAndSet(
            	                          grammarAccess.getComparisonAccess().getMoreLeftAction_1_0_7_0(),
            	                          current);
            	                  
            	            }

            	            }

            	            otherlv_16=(Token)match(input,38,FOLLOW_38_in_ruleComparison3393); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_16, grammarAccess.getComparisonAccess().getGreaterThanSignKeyword_1_0_7_1());
            	                  
            	            }

            	            }


            	            }
            	            break;

            	    }

            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1482:3: ( (lv_right_17_0= ruleOr ) )
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1483:1: (lv_right_17_0= ruleOr )
            	    {
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1483:1: (lv_right_17_0= ruleOr )
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1484:3: lv_right_17_0= ruleOr
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getComparisonAccess().getRightOrParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOr_in_ruleComparison3416);
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
    // $ANTLR end "ruleComparison"


    // $ANTLR start "entryRuleOr"
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1508:1: entryRuleOr returns [EObject current=null] : iv_ruleOr= ruleOr EOF ;
    public final EObject entryRuleOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOr = null;


        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1509:2: (iv_ruleOr= ruleOr EOF )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1510:2: iv_ruleOr= ruleOr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOrRule()); 
            }
            pushFollow(FOLLOW_ruleOr_in_entryRuleOr3454);
            iv_ruleOr=ruleOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOr; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOr3464); if (state.failed) return current;

            }

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
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1517:1: ruleOr returns [EObject current=null] : (this_And_0= ruleAnd ( ( () (otherlv_2= 'or' | otherlv_3= '||' ) ) ( (lv_right_4_0= ruleAnd ) ) )* ) ;
    public final EObject ruleOr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject this_And_0 = null;

        EObject lv_right_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1520:28: ( (this_And_0= ruleAnd ( ( () (otherlv_2= 'or' | otherlv_3= '||' ) ) ( (lv_right_4_0= ruleAnd ) ) )* ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1521:1: (this_And_0= ruleAnd ( ( () (otherlv_2= 'or' | otherlv_3= '||' ) ) ( (lv_right_4_0= ruleAnd ) ) )* )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1521:1: (this_And_0= ruleAnd ( ( () (otherlv_2= 'or' | otherlv_3= '||' ) ) ( (lv_right_4_0= ruleAnd ) ) )* )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1522:5: this_And_0= ruleAnd ( ( () (otherlv_2= 'or' | otherlv_3= '||' ) ) ( (lv_right_4_0= ruleAnd ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getOrAccess().getAndParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleAnd_in_ruleOr3511);
            this_And_0=ruleAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_And_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1530:1: ( ( () (otherlv_2= 'or' | otherlv_3= '||' ) ) ( (lv_right_4_0= ruleAnd ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=39 && LA17_0<=40)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1530:2: ( () (otherlv_2= 'or' | otherlv_3= '||' ) ) ( (lv_right_4_0= ruleAnd ) )
            	    {
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1530:2: ( () (otherlv_2= 'or' | otherlv_3= '||' ) )
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1530:3: () (otherlv_2= 'or' | otherlv_3= '||' )
            	    {
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1530:3: ()
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1531:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getOrAccess().getOrLeftAction_1_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1536:2: (otherlv_2= 'or' | otherlv_3= '||' )
            	    int alt16=2;
            	    int LA16_0 = input.LA(1);

            	    if ( (LA16_0==39) ) {
            	        alt16=1;
            	    }
            	    else if ( (LA16_0==40) ) {
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
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1536:4: otherlv_2= 'or'
            	            {
            	            otherlv_2=(Token)match(input,39,FOLLOW_39_in_ruleOr3534); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_2, grammarAccess.getOrAccess().getOrKeyword_1_0_1_0());
            	                  
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1541:7: otherlv_3= '||'
            	            {
            	            otherlv_3=(Token)match(input,40,FOLLOW_40_in_ruleOr3552); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_3, grammarAccess.getOrAccess().getVerticalLineVerticalLineKeyword_1_0_1_1());
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }

            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1545:3: ( (lv_right_4_0= ruleAnd ) )
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1546:1: (lv_right_4_0= ruleAnd )
            	    {
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1546:1: (lv_right_4_0= ruleAnd )
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1547:3: lv_right_4_0= ruleAnd
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getOrAccess().getRightAndParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAnd_in_ruleOr3575);
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
            	    break loop17;
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
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1571:1: entryRuleAnd returns [EObject current=null] : iv_ruleAnd= ruleAnd EOF ;
    public final EObject entryRuleAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnd = null;


        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1572:2: (iv_ruleAnd= ruleAnd EOF )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1573:2: iv_ruleAnd= ruleAnd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAndRule()); 
            }
            pushFollow(FOLLOW_ruleAnd_in_entryRuleAnd3613);
            iv_ruleAnd=ruleAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAnd; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnd3623); if (state.failed) return current;

            }

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
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1580:1: ruleAnd returns [EObject current=null] : (this_Addition_0= ruleAddition ( ( () (otherlv_2= 'and' | otherlv_3= '&&' ) ) ( (lv_right_4_0= ruleAddition ) ) )* ) ;
    public final EObject ruleAnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject this_Addition_0 = null;

        EObject lv_right_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1583:28: ( (this_Addition_0= ruleAddition ( ( () (otherlv_2= 'and' | otherlv_3= '&&' ) ) ( (lv_right_4_0= ruleAddition ) ) )* ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1584:1: (this_Addition_0= ruleAddition ( ( () (otherlv_2= 'and' | otherlv_3= '&&' ) ) ( (lv_right_4_0= ruleAddition ) ) )* )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1584:1: (this_Addition_0= ruleAddition ( ( () (otherlv_2= 'and' | otherlv_3= '&&' ) ) ( (lv_right_4_0= ruleAddition ) ) )* )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1585:5: this_Addition_0= ruleAddition ( ( () (otherlv_2= 'and' | otherlv_3= '&&' ) ) ( (lv_right_4_0= ruleAddition ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getAndAccess().getAdditionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleAddition_in_ruleAnd3670);
            this_Addition_0=ruleAddition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_Addition_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1593:1: ( ( () (otherlv_2= 'and' | otherlv_3= '&&' ) ) ( (lv_right_4_0= ruleAddition ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=41 && LA19_0<=42)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1593:2: ( () (otherlv_2= 'and' | otherlv_3= '&&' ) ) ( (lv_right_4_0= ruleAddition ) )
            	    {
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1593:2: ( () (otherlv_2= 'and' | otherlv_3= '&&' ) )
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1593:3: () (otherlv_2= 'and' | otherlv_3= '&&' )
            	    {
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1593:3: ()
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1594:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getAndAccess().getAndLeftAction_1_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1599:2: (otherlv_2= 'and' | otherlv_3= '&&' )
            	    int alt18=2;
            	    int LA18_0 = input.LA(1);

            	    if ( (LA18_0==41) ) {
            	        alt18=1;
            	    }
            	    else if ( (LA18_0==42) ) {
            	        alt18=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 18, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt18) {
            	        case 1 :
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1599:4: otherlv_2= 'and'
            	            {
            	            otherlv_2=(Token)match(input,41,FOLLOW_41_in_ruleAnd3693); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_2, grammarAccess.getAndAccess().getAndKeyword_1_0_1_0());
            	                  
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1604:7: otherlv_3= '&&'
            	            {
            	            otherlv_3=(Token)match(input,42,FOLLOW_42_in_ruleAnd3711); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_3, grammarAccess.getAndAccess().getAmpersandAmpersandKeyword_1_0_1_1());
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }

            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1608:3: ( (lv_right_4_0= ruleAddition ) )
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1609:1: (lv_right_4_0= ruleAddition )
            	    {
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1609:1: (lv_right_4_0= ruleAddition )
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1610:3: lv_right_4_0= ruleAddition
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAndAccess().getRightAdditionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAddition_in_ruleAnd3734);
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
    // $ANTLR end "ruleAnd"


    // $ANTLR start "entryRuleAddition"
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1634:1: entryRuleAddition returns [EObject current=null] : iv_ruleAddition= ruleAddition EOF ;
    public final EObject entryRuleAddition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddition = null;


        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1635:2: (iv_ruleAddition= ruleAddition EOF )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1636:2: iv_ruleAddition= ruleAddition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAdditionRule()); 
            }
            pushFollow(FOLLOW_ruleAddition_in_entryRuleAddition3772);
            iv_ruleAddition=ruleAddition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAddition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAddition3782); if (state.failed) return current;

            }

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
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1643:1: ruleAddition returns [EObject current=null] : (this_Multiplication_0= ruleMultiplication ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )* ) ;
    public final EObject ruleAddition() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_Multiplication_0 = null;

        EObject lv_right_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1646:28: ( (this_Multiplication_0= ruleMultiplication ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )* ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1647:1: (this_Multiplication_0= ruleMultiplication ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )* )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1647:1: (this_Multiplication_0= ruleMultiplication ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )* )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1648:5: this_Multiplication_0= ruleMultiplication ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getAdditionAccess().getMultiplicationParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleMultiplication_in_ruleAddition3829);
            this_Multiplication_0=ruleMultiplication();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_Multiplication_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1656:1: ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=43 && LA21_0<=44)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1656:2: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplication ) )
            	    {
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1656:2: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) )
            	    int alt20=2;
            	    int LA20_0 = input.LA(1);

            	    if ( (LA20_0==43) ) {
            	        alt20=1;
            	    }
            	    else if ( (LA20_0==44) ) {
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
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1656:3: ( () otherlv_2= '+' )
            	            {
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1656:3: ( () otherlv_2= '+' )
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1656:4: () otherlv_2= '+'
            	            {
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1656:4: ()
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1657:5: 
            	            {
            	            if ( state.backtracking==0 ) {

            	                      current = forceCreateModelElementAndSet(
            	                          grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0(),
            	                          current);
            	                  
            	            }

            	            }

            	            otherlv_2=(Token)match(input,43,FOLLOW_43_in_ruleAddition3852); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_2, grammarAccess.getAdditionAccess().getPlusSignKeyword_1_0_0_1());
            	                  
            	            }

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1667:6: ( () otherlv_4= '-' )
            	            {
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1667:6: ( () otherlv_4= '-' )
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1667:7: () otherlv_4= '-'
            	            {
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1667:7: ()
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1668:5: 
            	            {
            	            if ( state.backtracking==0 ) {

            	                      current = forceCreateModelElementAndSet(
            	                          grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0(),
            	                          current);
            	                  
            	            }

            	            }

            	            otherlv_4=(Token)match(input,44,FOLLOW_44_in_ruleAddition3881); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_4, grammarAccess.getAdditionAccess().getHyphenMinusKeyword_1_0_1_1());
            	                  
            	            }

            	            }


            	            }
            	            break;

            	    }

            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1677:3: ( (lv_right_5_0= ruleMultiplication ) )
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1678:1: (lv_right_5_0= ruleMultiplication )
            	    {
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1678:1: (lv_right_5_0= ruleMultiplication )
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1679:3: lv_right_5_0= ruleMultiplication
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAdditionAccess().getRightMultiplicationParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleMultiplication_in_ruleAddition3904);
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
    // $ANTLR end "ruleAddition"


    // $ANTLR start "entryRuleMultiplication"
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1703:1: entryRuleMultiplication returns [EObject current=null] : iv_ruleMultiplication= ruleMultiplication EOF ;
    public final EObject entryRuleMultiplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplication = null;


        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1704:2: (iv_ruleMultiplication= ruleMultiplication EOF )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1705:2: iv_ruleMultiplication= ruleMultiplication EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultiplicationRule()); 
            }
            pushFollow(FOLLOW_ruleMultiplication_in_entryRuleMultiplication3942);
            iv_ruleMultiplication=ruleMultiplication();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMultiplication; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiplication3952); if (state.failed) return current;

            }

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
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1712:1: ruleMultiplication returns [EObject current=null] : (this_PrimaryExpression_0= rulePrimaryExpression ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimaryExpression ) ) )* ) ;
    public final EObject ruleMultiplication() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_PrimaryExpression_0 = null;

        EObject lv_right_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1715:28: ( (this_PrimaryExpression_0= rulePrimaryExpression ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimaryExpression ) ) )* ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1716:1: (this_PrimaryExpression_0= rulePrimaryExpression ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimaryExpression ) ) )* )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1716:1: (this_PrimaryExpression_0= rulePrimaryExpression ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimaryExpression ) ) )* )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1717:5: this_PrimaryExpression_0= rulePrimaryExpression ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimaryExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getMultiplicationAccess().getPrimaryExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_rulePrimaryExpression_in_ruleMultiplication3999);
            this_PrimaryExpression_0=rulePrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_PrimaryExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1725:1: ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimaryExpression ) ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>=45 && LA23_0<=46)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1725:2: ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimaryExpression ) )
            	    {
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1725:2: ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) )
            	    int alt22=2;
            	    int LA22_0 = input.LA(1);

            	    if ( (LA22_0==45) ) {
            	        alt22=1;
            	    }
            	    else if ( (LA22_0==46) ) {
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
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1725:3: ( () otherlv_2= '*' )
            	            {
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1725:3: ( () otherlv_2= '*' )
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1725:4: () otherlv_2= '*'
            	            {
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1725:4: ()
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1726:5: 
            	            {
            	            if ( state.backtracking==0 ) {

            	                      current = forceCreateModelElementAndSet(
            	                          grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0_0_0(),
            	                          current);
            	                  
            	            }

            	            }

            	            otherlv_2=(Token)match(input,45,FOLLOW_45_in_ruleMultiplication4022); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_2, grammarAccess.getMultiplicationAccess().getAsteriskKeyword_1_0_0_1());
            	                  
            	            }

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1736:6: ( () otherlv_4= '/' )
            	            {
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1736:6: ( () otherlv_4= '/' )
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1736:7: () otherlv_4= '/'
            	            {
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1736:7: ()
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1737:5: 
            	            {
            	            if ( state.backtracking==0 ) {

            	                      current = forceCreateModelElementAndSet(
            	                          grammarAccess.getMultiplicationAccess().getDivLeftAction_1_0_1_0(),
            	                          current);
            	                  
            	            }

            	            }

            	            otherlv_4=(Token)match(input,46,FOLLOW_46_in_ruleMultiplication4051); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_4, grammarAccess.getMultiplicationAccess().getSolidusKeyword_1_0_1_1());
            	                  
            	            }

            	            }


            	            }
            	            break;

            	    }

            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1746:3: ( (lv_right_5_0= rulePrimaryExpression ) )
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1747:1: (lv_right_5_0= rulePrimaryExpression )
            	    {
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1747:1: (lv_right_5_0= rulePrimaryExpression )
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1748:3: lv_right_5_0= rulePrimaryExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMultiplicationAccess().getRightPrimaryExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulePrimaryExpression_in_ruleMultiplication4074);
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
    // $ANTLR end "ruleMultiplication"


    // $ANTLR start "entryRulePrimaryExpression"
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1772:1: entryRulePrimaryExpression returns [EObject current=null] : iv_rulePrimaryExpression= rulePrimaryExpression EOF ;
    public final EObject entryRulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpression = null;


        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1773:2: (iv_rulePrimaryExpression= rulePrimaryExpression EOF )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1774:2: iv_rulePrimaryExpression= rulePrimaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimaryExpressionRule()); 
            }
            pushFollow(FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression4112);
            iv_rulePrimaryExpression=rulePrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimaryExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimaryExpression4122); if (state.failed) return current;

            }

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
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1781:1: rulePrimaryExpression returns [EObject current=null] : ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () ( (lv_value_4_0= RULE_REAL ) ) ) | ( () ( (lv_value_6_0= RULE_INT ) ) ) | this_FunctionCall_7= ruleFunctionCall | this_Postfix_8= rulePostfix | ( () ( (lv_value_10_0= RULE_STRING ) ) ) | this_ArrayLiteral_11= ruleArrayLiteral | this_FunctionDeclaration_12= ruleFunctionDeclaration | ( () otherlv_14= 'null' ) | ( () otherlv_16= 'false' ) | ( () otherlv_18= 'true' ) ) ;
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

        EObject this_Postfix_8 = null;

        EObject this_ArrayLiteral_11 = null;

        EObject this_FunctionDeclaration_12 = null;


         enterRule(); 
            
        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1784:28: ( ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () ( (lv_value_4_0= RULE_REAL ) ) ) | ( () ( (lv_value_6_0= RULE_INT ) ) ) | this_FunctionCall_7= ruleFunctionCall | this_Postfix_8= rulePostfix | ( () ( (lv_value_10_0= RULE_STRING ) ) ) | this_ArrayLiteral_11= ruleArrayLiteral | this_FunctionDeclaration_12= ruleFunctionDeclaration | ( () otherlv_14= 'null' ) | ( () otherlv_16= 'false' ) | ( () otherlv_18= 'true' ) ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1785:1: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () ( (lv_value_4_0= RULE_REAL ) ) ) | ( () ( (lv_value_6_0= RULE_INT ) ) ) | this_FunctionCall_7= ruleFunctionCall | this_Postfix_8= rulePostfix | ( () ( (lv_value_10_0= RULE_STRING ) ) ) | this_ArrayLiteral_11= ruleArrayLiteral | this_FunctionDeclaration_12= ruleFunctionDeclaration | ( () otherlv_14= 'null' ) | ( () otherlv_16= 'false' ) | ( () otherlv_18= 'true' ) )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1785:1: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () ( (lv_value_4_0= RULE_REAL ) ) ) | ( () ( (lv_value_6_0= RULE_INT ) ) ) | this_FunctionCall_7= ruleFunctionCall | this_Postfix_8= rulePostfix | ( () ( (lv_value_10_0= RULE_STRING ) ) ) | this_ArrayLiteral_11= ruleArrayLiteral | this_FunctionDeclaration_12= ruleFunctionDeclaration | ( () otherlv_14= 'null' ) | ( () otherlv_16= 'false' ) | ( () otherlv_18= 'true' ) )
            int alt24=11;
            alt24 = dfa24.predict(input);
            switch (alt24) {
                case 1 :
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1785:2: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1785:2: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1785:4: otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,19,FOLLOW_19_in_rulePrimaryExpression4160); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getExpressionParserRuleCall_0_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExpression_in_rulePrimaryExpression4182);
                    this_Expression_1=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Expression_1; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_2=(Token)match(input,20,FOLLOW_20_in_rulePrimaryExpression4193); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_0_2());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1803:6: ( () ( (lv_value_4_0= RULE_REAL ) ) )
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1803:6: ( () ( (lv_value_4_0= RULE_REAL ) ) )
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1803:7: () ( (lv_value_4_0= RULE_REAL ) )
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1803:7: ()
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1804:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getPrimaryExpressionAccess().getRealLiteralAction_1_0(),
                                  current);
                          
                    }

                    }

                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1809:2: ( (lv_value_4_0= RULE_REAL ) )
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1810:1: (lv_value_4_0= RULE_REAL )
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1810:1: (lv_value_4_0= RULE_REAL )
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1811:3: lv_value_4_0= RULE_REAL
                    {
                    lv_value_4_0=(Token)match(input,RULE_REAL,FOLLOW_RULE_REAL_in_rulePrimaryExpression4227); if (state.failed) return current;
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
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1828:6: ( () ( (lv_value_6_0= RULE_INT ) ) )
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1828:6: ( () ( (lv_value_6_0= RULE_INT ) ) )
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1828:7: () ( (lv_value_6_0= RULE_INT ) )
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1828:7: ()
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1829:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getPrimaryExpressionAccess().getIntLiteralAction_2_0(),
                                  current);
                          
                    }

                    }

                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1834:2: ( (lv_value_6_0= RULE_INT ) )
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1835:1: (lv_value_6_0= RULE_INT )
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1835:1: (lv_value_6_0= RULE_INT )
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1836:3: lv_value_6_0= RULE_INT
                    {
                    lv_value_6_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_rulePrimaryExpression4266); if (state.failed) return current;
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
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1854:5: this_FunctionCall_7= ruleFunctionCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getFunctionCallParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleFunctionCall_in_rulePrimaryExpression4300);
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
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1864:5: this_Postfix_8= rulePostfix
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getPostfixParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_rulePostfix_in_rulePrimaryExpression4327);
                    this_Postfix_8=rulePostfix();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Postfix_8; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1873:6: ( () ( (lv_value_10_0= RULE_STRING ) ) )
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1873:6: ( () ( (lv_value_10_0= RULE_STRING ) ) )
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1873:7: () ( (lv_value_10_0= RULE_STRING ) )
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1873:7: ()
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1874:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getPrimaryExpressionAccess().getStringLiteralAction_5_0(),
                                  current);
                          
                    }

                    }

                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1879:2: ( (lv_value_10_0= RULE_STRING ) )
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1880:1: (lv_value_10_0= RULE_STRING )
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1880:1: (lv_value_10_0= RULE_STRING )
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1881:3: lv_value_10_0= RULE_STRING
                    {
                    lv_value_10_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePrimaryExpression4359); if (state.failed) return current;
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
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1899:5: this_ArrayLiteral_11= ruleArrayLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getArrayLiteralParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleArrayLiteral_in_rulePrimaryExpression4393);
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
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1909:5: this_FunctionDeclaration_12= ruleFunctionDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getFunctionDeclarationParserRuleCall_7()); 
                          
                    }
                    pushFollow(FOLLOW_ruleFunctionDeclaration_in_rulePrimaryExpression4420);
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
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1918:6: ( () otherlv_14= 'null' )
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1918:6: ( () otherlv_14= 'null' )
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1918:7: () otherlv_14= 'null'
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1918:7: ()
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1919:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getPrimaryExpressionAccess().getNullLiteralAction_8_0(),
                                  current);
                          
                    }

                    }

                    otherlv_14=(Token)match(input,47,FOLLOW_47_in_rulePrimaryExpression4447); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_14, grammarAccess.getPrimaryExpressionAccess().getNullKeyword_8_1());
                          
                    }

                    }


                    }
                    break;
                case 10 :
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1929:6: ( () otherlv_16= 'false' )
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1929:6: ( () otherlv_16= 'false' )
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1929:7: () otherlv_16= 'false'
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1929:7: ()
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1930:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getPrimaryExpressionAccess().getFalseLiteralAction_9_0(),
                                  current);
                          
                    }

                    }

                    otherlv_16=(Token)match(input,48,FOLLOW_48_in_rulePrimaryExpression4476); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_16, grammarAccess.getPrimaryExpressionAccess().getFalseKeyword_9_1());
                          
                    }

                    }


                    }
                    break;
                case 11 :
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1940:6: ( () otherlv_18= 'true' )
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1940:6: ( () otherlv_18= 'true' )
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1940:7: () otherlv_18= 'true'
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1940:7: ()
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1941:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getPrimaryExpressionAccess().getTrueLiteralAction_10_0(),
                                  current);
                          
                    }

                    }

                    otherlv_18=(Token)match(input,49,FOLLOW_49_in_rulePrimaryExpression4505); if (state.failed) return current;
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
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1958:1: entryRuleArrayLiteral returns [EObject current=null] : iv_ruleArrayLiteral= ruleArrayLiteral EOF ;
    public final EObject entryRuleArrayLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayLiteral = null;


        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1959:2: (iv_ruleArrayLiteral= ruleArrayLiteral EOF )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1960:2: iv_ruleArrayLiteral= ruleArrayLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArrayLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleArrayLiteral_in_entryRuleArrayLiteral4542);
            iv_ruleArrayLiteral=ruleArrayLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArrayLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleArrayLiteral4552); if (state.failed) return current;

            }

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
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1967:1: ruleArrayLiteral returns [EObject current=null] : ( () otherlv_1= '[' ( ( (lv_values_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleExpression ) ) )* )? otherlv_5= ']' ) ;
    public final EObject ruleArrayLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_values_2_0 = null;

        EObject lv_values_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1970:28: ( ( () otherlv_1= '[' ( ( (lv_values_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleExpression ) ) )* )? otherlv_5= ']' ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1971:1: ( () otherlv_1= '[' ( ( (lv_values_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleExpression ) ) )* )? otherlv_5= ']' )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1971:1: ( () otherlv_1= '[' ( ( (lv_values_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleExpression ) ) )* )? otherlv_5= ']' )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1971:2: () otherlv_1= '[' ( ( (lv_values_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleExpression ) ) )* )? otherlv_5= ']'
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1971:2: ()
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1972:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getArrayLiteralAccess().getArrayLiteralAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,50,FOLLOW_50_in_ruleArrayLiteral4598); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getArrayLiteralAccess().getLeftSquareBracketKeyword_1());
                  
            }
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1981:1: ( ( (lv_values_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleExpression ) ) )* )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( ((LA26_0>=RULE_ID && LA26_0<=RULE_STRING)||LA26_0==19||LA26_0==27||(LA26_0>=47 && LA26_0<=50)) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1981:2: ( (lv_values_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleExpression ) ) )*
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1981:2: ( (lv_values_2_0= ruleExpression ) )
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1982:1: (lv_values_2_0= ruleExpression )
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1982:1: (lv_values_2_0= ruleExpression )
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1983:3: lv_values_2_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getArrayLiteralAccess().getValuesExpressionParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleArrayLiteral4620);
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

                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1999:2: (otherlv_3= ',' ( (lv_values_4_0= ruleExpression ) ) )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==28) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1999:4: otherlv_3= ',' ( (lv_values_4_0= ruleExpression ) )
                    	    {
                    	    otherlv_3=(Token)match(input,28,FOLLOW_28_in_ruleArrayLiteral4633); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getArrayLiteralAccess().getCommaKeyword_2_1_0());
                    	          
                    	    }
                    	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2003:1: ( (lv_values_4_0= ruleExpression ) )
                    	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2004:1: (lv_values_4_0= ruleExpression )
                    	    {
                    	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2004:1: (lv_values_4_0= ruleExpression )
                    	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2005:3: lv_values_4_0= ruleExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getArrayLiteralAccess().getValuesExpressionParserRuleCall_2_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleExpression_in_ruleArrayLiteral4654);
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
                    	    break loop25;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,51,FOLLOW_51_in_ruleArrayLiteral4670); if (state.failed) return current;
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


    // $ANTLR start "entryRulePostfix"
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2035:1: entryRulePostfix returns [EObject current=null] : iv_rulePostfix= rulePostfix EOF ;
    public final EObject entryRulePostfix() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePostfix = null;


        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2036:2: (iv_rulePostfix= rulePostfix EOF )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2037:2: iv_rulePostfix= rulePostfix EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPostfixRule()); 
            }
            pushFollow(FOLLOW_rulePostfix_in_entryRulePostfix4708);
            iv_rulePostfix=rulePostfix();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePostfix; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePostfix4718); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePostfix"


    // $ANTLR start "rulePostfix"
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2044:1: rulePostfix returns [EObject current=null] : (this_VariableReference_0= ruleVariableReference ( ( () otherlv_2= '--' ) | ( () otherlv_4= '++' ) )? ) ;
    public final EObject rulePostfix() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_VariableReference_0 = null;


         enterRule(); 
            
        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2047:28: ( (this_VariableReference_0= ruleVariableReference ( ( () otherlv_2= '--' ) | ( () otherlv_4= '++' ) )? ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2048:1: (this_VariableReference_0= ruleVariableReference ( ( () otherlv_2= '--' ) | ( () otherlv_4= '++' ) )? )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2048:1: (this_VariableReference_0= ruleVariableReference ( ( () otherlv_2= '--' ) | ( () otherlv_4= '++' ) )? )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2049:5: this_VariableReference_0= ruleVariableReference ( ( () otherlv_2= '--' ) | ( () otherlv_4= '++' ) )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getPostfixAccess().getVariableReferenceParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleVariableReference_in_rulePostfix4765);
            this_VariableReference_0=ruleVariableReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_VariableReference_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2057:1: ( ( () otherlv_2= '--' ) | ( () otherlv_4= '++' ) )?
            int alt27=3;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==52) ) {
                alt27=1;
            }
            else if ( (LA27_0==53) ) {
                alt27=2;
            }
            switch (alt27) {
                case 1 :
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2057:2: ( () otherlv_2= '--' )
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2057:2: ( () otherlv_2= '--' )
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2057:3: () otherlv_2= '--'
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2057:3: ()
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2058:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getPostfixAccess().getPostfixDecrementValueAction_1_0_0(),
                                  current);
                          
                    }

                    }

                    otherlv_2=(Token)match(input,52,FOLLOW_52_in_rulePostfix4787); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getPostfixAccess().getHyphenMinusHyphenMinusKeyword_1_0_1());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2068:6: ( () otherlv_4= '++' )
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2068:6: ( () otherlv_4= '++' )
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2068:7: () otherlv_4= '++'
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2068:7: ()
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2069:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getPostfixAccess().getPostfixIncrementValueAction_1_1_0(),
                                  current);
                          
                    }

                    }

                    otherlv_4=(Token)match(input,53,FOLLOW_53_in_rulePostfix4816); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getPostfixAccess().getPlusSignPlusSignKeyword_1_1_1());
                          
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
    // $ANTLR end "rulePostfix"


    // $ANTLR start "entryRuleVariableReference"
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2086:1: entryRuleVariableReference returns [EObject current=null] : iv_ruleVariableReference= ruleVariableReference EOF ;
    public final EObject entryRuleVariableReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableReference = null;


        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2087:2: (iv_ruleVariableReference= ruleVariableReference EOF )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2088:2: iv_ruleVariableReference= ruleVariableReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleVariableReference_in_entryRuleVariableReference4855);
            iv_ruleVariableReference=ruleVariableReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariableReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableReference4865); if (state.failed) return current;

            }

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
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2095:1: ruleVariableReference returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_dimensions_2_0= ruleExpression ) ) otherlv_3= ']' )* ) ;
    public final EObject ruleVariableReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_dimensions_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2098:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_dimensions_2_0= ruleExpression ) ) otherlv_3= ']' )* ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2099:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_dimensions_2_0= ruleExpression ) ) otherlv_3= ']' )* )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2099:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_dimensions_2_0= ruleExpression ) ) otherlv_3= ']' )* )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2099:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_dimensions_2_0= ruleExpression ) ) otherlv_3= ']' )*
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2099:2: ( (otherlv_0= RULE_ID ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2100:1: (otherlv_0= RULE_ID )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2100:1: (otherlv_0= RULE_ID )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2101:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getVariableReferenceRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariableReference4910); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getVariableReferenceAccess().getVariableVariableReferenceableCrossReference_0_0()); 
              	
            }

            }


            }

            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2112:2: (otherlv_1= '[' ( (lv_dimensions_2_0= ruleExpression ) ) otherlv_3= ']' )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==50) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2112:4: otherlv_1= '[' ( (lv_dimensions_2_0= ruleExpression ) ) otherlv_3= ']'
            	    {
            	    otherlv_1=(Token)match(input,50,FOLLOW_50_in_ruleVariableReference4923); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getVariableReferenceAccess().getLeftSquareBracketKeyword_1_0());
            	          
            	    }
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2116:1: ( (lv_dimensions_2_0= ruleExpression ) )
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2117:1: (lv_dimensions_2_0= ruleExpression )
            	    {
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2117:1: (lv_dimensions_2_0= ruleExpression )
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2118:3: lv_dimensions_2_0= ruleExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getVariableReferenceAccess().getDimensionsExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExpression_in_ruleVariableReference4944);
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

            	    otherlv_3=(Token)match(input,51,FOLLOW_51_in_ruleVariableReference4956); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getVariableReferenceAccess().getRightSquareBracketKeyword_1_2());
            	          
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
    // $ANTLR end "ruleVariableReference"


    // $ANTLR start "entryRuleFunctionCall"
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2146:1: entryRuleFunctionCall returns [EObject current=null] : iv_ruleFunctionCall= ruleFunctionCall EOF ;
    public final EObject entryRuleFunctionCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionCall = null;


        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2147:2: (iv_ruleFunctionCall= ruleFunctionCall EOF )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2148:2: iv_ruleFunctionCall= ruleFunctionCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunctionCallRule()); 
            }
            pushFollow(FOLLOW_ruleFunctionCall_in_entryRuleFunctionCall4994);
            iv_ruleFunctionCall=ruleFunctionCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFunctionCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionCall5004); if (state.failed) return current;

            }

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
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2155:1: ruleFunctionCall returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )? otherlv_6= ')' ) ;
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
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2158:28: ( ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )? otherlv_6= ')' ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2159:1: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )? otherlv_6= ')' )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2159:1: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )? otherlv_6= ')' )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2159:2: () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )? otherlv_6= ')'
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2159:2: ()
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2160:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getFunctionCallAccess().getFunctionCallAction_0(),
                          current);
                  
            }

            }

            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2165:2: ( (otherlv_1= RULE_ID ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2166:1: (otherlv_1= RULE_ID )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2166:1: (otherlv_1= RULE_ID )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2167:3: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getFunctionCallRule());
              	        }
                      
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionCall5058); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_1, grammarAccess.getFunctionCallAccess().getFunctionFunctionDeclarationCrossReference_1_0()); 
              	
            }

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleFunctionCall5070); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getFunctionCallAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2182:1: ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( ((LA30_0>=RULE_ID && LA30_0<=RULE_STRING)||LA30_0==19||LA30_0==27||(LA30_0>=47 && LA30_0<=50)) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2182:2: ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )*
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2182:2: ( (lv_args_3_0= ruleExpression ) )
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2183:1: (lv_args_3_0= ruleExpression )
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2183:1: (lv_args_3_0= ruleExpression )
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2184:3: lv_args_3_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFunctionCallAccess().getArgsExpressionParserRuleCall_3_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleFunctionCall5092);
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

                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2200:2: (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==28) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2200:4: otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) )
                    	    {
                    	    otherlv_4=(Token)match(input,28,FOLLOW_28_in_ruleFunctionCall5105); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getFunctionCallAccess().getCommaKeyword_3_1_0());
                    	          
                    	    }
                    	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2204:1: ( (lv_args_5_0= ruleExpression ) )
                    	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2205:1: (lv_args_5_0= ruleExpression )
                    	    {
                    	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2205:1: (lv_args_5_0= ruleExpression )
                    	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2206:3: lv_args_5_0= ruleExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getFunctionCallAccess().getArgsExpressionParserRuleCall_3_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleExpression_in_ruleFunctionCall5126);
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
                    	    break loop29;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,20,FOLLOW_20_in_ruleFunctionCall5142); if (state.failed) return current;
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
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2234:1: entryRuleReturnStatement returns [EObject current=null] : iv_ruleReturnStatement= ruleReturnStatement EOF ;
    public final EObject entryRuleReturnStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReturnStatement = null;


        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2235:2: (iv_ruleReturnStatement= ruleReturnStatement EOF )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2236:2: iv_ruleReturnStatement= ruleReturnStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReturnStatementRule()); 
            }
            pushFollow(FOLLOW_ruleReturnStatement_in_entryRuleReturnStatement5178);
            iv_ruleReturnStatement=ruleReturnStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReturnStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReturnStatement5188); if (state.failed) return current;

            }

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
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2243:1: ruleReturnStatement returns [EObject current=null] : (otherlv_0= 'return' ( (lv_value_1_0= ruleExpression ) ) ) ;
    public final EObject ruleReturnStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2246:28: ( (otherlv_0= 'return' ( (lv_value_1_0= ruleExpression ) ) ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2247:1: (otherlv_0= 'return' ( (lv_value_1_0= ruleExpression ) ) )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2247:1: (otherlv_0= 'return' ( (lv_value_1_0= ruleExpression ) ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2247:3: otherlv_0= 'return' ( (lv_value_1_0= ruleExpression ) )
            {
            otherlv_0=(Token)match(input,54,FOLLOW_54_in_ruleReturnStatement5225); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getReturnStatementAccess().getReturnKeyword_0());
                  
            }
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2251:1: ( (lv_value_1_0= ruleExpression ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2252:1: (lv_value_1_0= ruleExpression )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2252:1: (lv_value_1_0= ruleExpression )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2253:3: lv_value_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getReturnStatementAccess().getValueExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleReturnStatement5246);
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
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2277:1: entryRuleInclude returns [EObject current=null] : iv_ruleInclude= ruleInclude EOF ;
    public final EObject entryRuleInclude() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInclude = null;


        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2278:2: (iv_ruleInclude= ruleInclude EOF )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2279:2: iv_ruleInclude= ruleInclude EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIncludeRule()); 
            }
            pushFollow(FOLLOW_ruleInclude_in_entryRuleInclude5282);
            iv_ruleInclude=ruleInclude();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInclude; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInclude5292); if (state.failed) return current;

            }

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
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2286:1: ruleInclude returns [EObject current=null] : (otherlv_0= 'include' otherlv_1= '(' ( (lv_importURI_2_0= RULE_STRING ) ) otherlv_3= ')' ) ;
    public final EObject ruleInclude() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_importURI_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2289:28: ( (otherlv_0= 'include' otherlv_1= '(' ( (lv_importURI_2_0= RULE_STRING ) ) otherlv_3= ')' ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2290:1: (otherlv_0= 'include' otherlv_1= '(' ( (lv_importURI_2_0= RULE_STRING ) ) otherlv_3= ')' )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2290:1: (otherlv_0= 'include' otherlv_1= '(' ( (lv_importURI_2_0= RULE_STRING ) ) otherlv_3= ')' )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2290:3: otherlv_0= 'include' otherlv_1= '(' ( (lv_importURI_2_0= RULE_STRING ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,55,FOLLOW_55_in_ruleInclude5329); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getIncludeAccess().getIncludeKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleInclude5341); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getIncludeAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2298:1: ( (lv_importURI_2_0= RULE_STRING ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2299:1: (lv_importURI_2_0= RULE_STRING )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2299:1: (lv_importURI_2_0= RULE_STRING )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2300:3: lv_importURI_2_0= RULE_STRING
            {
            lv_importURI_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleInclude5358); if (state.failed) return current;
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

            otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleInclude5375); if (state.failed) return current;
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
        // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:526:4: ( 'else' )
        // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:526:6: 'else'
        {
        match(input,21,FOLLOW_21_in_synpred1_InternalLeek1257); if (state.failed) return ;

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


    protected DFA2 dfa2 = new DFA2(this);
    protected DFA24 dfa24 = new DFA24(this);
    static final String DFA2_eotS =
        "\17\uffff";
    static final String DFA2_eofS =
        "\17\uffff";
    static final String DFA2_minS =
        "\1\4\4\uffff\1\21\11\uffff";
    static final String DFA2_maxS =
        "\1\67\4\uffff\1\62\11\uffff";
    static final String DFA2_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\uffff\1\6\1\7\1\11\1\12\1\13\1\14\1\15\1\5\1\10";
    static final String DFA2_specialS =
        "\17\uffff}>";
    static final String[] DFA2_transitionS = {
            "\1\5\7\uffff\1\14\1\12\1\13\1\10\2\uffff\1\7\3\uffff\2\6\2\uffff\1\4\1\3\2\uffff\1\2\27\uffff\1\11\1\1",
            "",
            "",
            "",
            "",
            "\1\16\1\uffff\1\15\36\uffff\1\16",
            "",
            "",
            "",
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
            return "119:1: ( (this_Include_0= ruleInclude otherlv_1= ';' ) | (this_GlobalDeclaration_2= ruleGlobalDeclaration otherlv_3= ';' ) | this_FunctionDeclaration_4= ruleFunctionDeclaration | (this_LocalDeclaration_5= ruleLocalDeclaration otherlv_6= ';' ) | (this_FunctionCall_7= ruleFunctionCall otherlv_8= ';' ) | this_Iteration_9= ruleIteration | this_If_10= ruleIf | (this_Affectation_11= ruleAffectation otherlv_12= ';' ) | this_StatementBlock_13= ruleStatementBlock | (this_ReturnStatement_14= ruleReturnStatement otherlv_15= ';' ) | (this_BreakStatement_16= ruleBreakStatement otherlv_17= ';' ) | (this_ContinueStatement_18= ruleContinueStatement otherlv_19= ';' ) | ( () otherlv_21= ';' ) )";
        }
    }
    static final String DFA24_eotS =
        "\15\uffff";
    static final String DFA24_eofS =
        "\4\uffff\1\14\10\uffff";
    static final String DFA24_minS =
        "\1\4\3\uffff\1\14\10\uffff";
    static final String DFA24_maxS =
        "\1\62\3\uffff\1\65\10\uffff";
    static final String DFA24_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\uffff\1\6\1\7\1\10\1\11\1\12\1\13\1\4\1\5";
    static final String DFA24_specialS =
        "\15\uffff}>";
    static final String[] DFA24_transitionS = {
            "\1\4\1\2\1\3\1\5\13\uffff\1\1\7\uffff\1\7\23\uffff\1\10\1\11\1\12\1\6",
            "",
            "",
            "",
            "\1\14\6\uffff\1\13\1\14\7\uffff\1\14\2\uffff\20\14\3\uffff\4\14",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA24_eot = DFA.unpackEncodedString(DFA24_eotS);
    static final short[] DFA24_eof = DFA.unpackEncodedString(DFA24_eofS);
    static final char[] DFA24_min = DFA.unpackEncodedStringToUnsignedChars(DFA24_minS);
    static final char[] DFA24_max = DFA.unpackEncodedStringToUnsignedChars(DFA24_maxS);
    static final short[] DFA24_accept = DFA.unpackEncodedString(DFA24_acceptS);
    static final short[] DFA24_special = DFA.unpackEncodedString(DFA24_specialS);
    static final short[][] DFA24_transition;

    static {
        int numStates = DFA24_transitionS.length;
        DFA24_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA24_transition[i] = DFA.unpackEncodedString(DFA24_transitionS[i]);
        }
    }

    class DFA24 extends DFA {

        public DFA24(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 24;
            this.eot = DFA24_eot;
            this.eof = DFA24_eof;
            this.min = DFA24_min;
            this.max = DFA24_max;
            this.accept = DFA24_accept;
            this.special = DFA24_special;
            this.transition = DFA24_transition;
        }
        public String getDescription() {
            return "1785:1: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () ( (lv_value_4_0= RULE_REAL ) ) ) | ( () ( (lv_value_6_0= RULE_INT ) ) ) | this_FunctionCall_7= ruleFunctionCall | this_Postfix_8= rulePostfix | ( () ( (lv_value_10_0= RULE_STRING ) ) ) | this_ArrayLiteral_11= ruleArrayLiteral | this_FunctionDeclaration_12= ruleFunctionDeclaration | ( () otherlv_14= 'null' ) | ( () otherlv_16= 'false' ) | ( () otherlv_18= 'true' ) )";
        }
    }
 

    public static final BitSet FOLLOW_ruleScript_in_entryRuleScript75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleScript85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleScript130 = new BitSet(new long[]{0x00C000004CC4F012L});
    public static final BitSet FOLLOW_ruleStatement_in_entryRuleStatement166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatement176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInclude_in_ruleStatement224 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleStatement235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGlobalDeclaration_in_ruleStatement265 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleStatement276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionDeclaration_in_ruleStatement305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocalDeclaration_in_ruleStatement333 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleStatement344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionCall_in_ruleStatement374 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleStatement385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIteration_in_ruleStatement414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIf_in_ruleStatement441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAffectation_in_ruleStatement469 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleStatement480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatementBlock_in_ruleStatement509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReturnStatement_in_ruleStatement537 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleStatement548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBreakStatement_in_ruleStatement578 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleStatement589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContinueStatement_in_ruleStatement619 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleStatement630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleStatement659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBreakStatement_in_entryRuleBreakStatement696 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBreakStatement706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleBreakStatement752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContinueStatement_in_entryRuleContinueStatement788 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContinueStatement798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleContinueStatement844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatementBlock_in_entryRuleStatementBlock880 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatementBlock890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleStatementBlock927 = new BitSet(new long[]{0x00C000004CC5F010L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleStatementBlock957 = new BitSet(new long[]{0x00C000004CC5F010L});
    public static final BitSet FOLLOW_16_in_ruleStatementBlock970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAffectation_in_entryRuleAffectation1006 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAffectation1016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableReference_in_ruleAffectation1062 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleAffectation1074 = new BitSet(new long[]{0x00078000080800F0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleAffectation1095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIf_in_entryRuleIf1131 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIf1141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleIf1178 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleIf1190 = new BitSet(new long[]{0x00078000080800F0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleIf1211 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleIf1223 = new BitSet(new long[]{0x00C000004CE4F010L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleIf1244 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_21_in_ruleIf1265 = new BitSet(new long[]{0x00C000004CC4F010L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleIf1287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIteration_in_entryRuleIteration1325 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIteration1335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhile_in_ruleIteration1382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForIn_in_ruleIteration1409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFor_in_ruleIteration1436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhile_in_entryRuleWhile1471 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWhile1481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleWhile1518 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleWhile1530 = new BitSet(new long[]{0x00078000080800F0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleWhile1551 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleWhile1563 = new BitSet(new long[]{0x00C000004CC4F010L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleWhile1584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFor_in_entryRuleFor1620 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFor1630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleFor1667 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleFor1679 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleForInitializer_in_ruleFor1700 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleFor1712 = new BitSet(new long[]{0x00078000080800F0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleFor1733 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleFor1745 = new BitSet(new long[]{0x00078000080800F0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleFor1766 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleFor1778 = new BitSet(new long[]{0x00C000004CC4F010L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleFor1799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForIn_in_entryRuleForIn1835 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleForIn1845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleForIn1882 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleForIn1894 = new BitSet(new long[]{0x0000000004000010L});
    public static final BitSet FOLLOW_ruleForInVariableReference_in_ruleForIn1916 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleForIn1928 = new BitSet(new long[]{0x0000000004000010L});
    public static final BitSet FOLLOW_ruleForInVariableReference_in_ruleForIn1951 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleForIn1963 = new BitSet(new long[]{0x00078000080800F0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleForIn1984 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleForIn1996 = new BitSet(new long[]{0x00C000004CC4F010L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleForIn2017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForInVariableReference_in_entryRuleForInVariableReference2053 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleForInVariableReference2063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleForInVariableReference2101 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleForInVariableReference2118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleForInVariableReference2150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForInitializer_in_entryRuleForInitializer2186 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleForInitializer2196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableReference_in_ruleForInitializer2242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionDeclaration_in_entryRuleFunctionDeclaration2276 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionDeclaration2286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleFunctionDeclaration2323 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionDeclaration2340 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleFunctionDeclaration2357 = new BitSet(new long[]{0x0000000020100010L});
    public static final BitSet FOLLOW_ruleParameterDeclaration_in_ruleFunctionDeclaration2379 = new BitSet(new long[]{0x0000000010100000L});
    public static final BitSet FOLLOW_28_in_ruleFunctionDeclaration2392 = new BitSet(new long[]{0x0000000020000010L});
    public static final BitSet FOLLOW_ruleParameterDeclaration_in_ruleFunctionDeclaration2413 = new BitSet(new long[]{0x0000000010100000L});
    public static final BitSet FOLLOW_20_in_ruleFunctionDeclaration2429 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ruleStatementBlock_in_ruleFunctionDeclaration2450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterDeclaration_in_entryRuleParameterDeclaration2486 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameterDeclaration2496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleParameterDeclaration2539 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleParameterDeclaration2570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocalDeclaration_in_entryRuleLocalDeclaration2611 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLocalDeclaration2621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleLocalDeclaration2658 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_ruleLocalDeclaration2679 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_28_in_ruleLocalDeclaration2692 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_ruleLocalDeclaration2713 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_ruleGlobalDeclaration_in_entryRuleGlobalDeclaration2751 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGlobalDeclaration2761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleGlobalDeclaration2798 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_ruleGlobalDeclaration2819 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_28_in_ruleGlobalDeclaration2832 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_ruleGlobalDeclaration2853 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_entryRuleVariableDeclaration2891 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableDeclaration2901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariableDeclaration2943 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_ruleVariableDeclaration2961 = new BitSet(new long[]{0x00078000080800F0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleVariableDeclaration2982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression3020 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression3030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparison_in_ruleExpression3076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparison_in_entryRuleComparison3110 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComparison3120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOr_in_ruleComparison3167 = new BitSet(new long[]{0x0000007F80000002L});
    public static final BitSet FOLLOW_31_in_ruleComparison3190 = new BitSet(new long[]{0x00078000080800F0L});
    public static final BitSet FOLLOW_32_in_ruleComparison3219 = new BitSet(new long[]{0x00078000080800F0L});
    public static final BitSet FOLLOW_33_in_ruleComparison3248 = new BitSet(new long[]{0x00078000080800F0L});
    public static final BitSet FOLLOW_34_in_ruleComparison3277 = new BitSet(new long[]{0x00078000080800F0L});
    public static final BitSet FOLLOW_35_in_ruleComparison3306 = new BitSet(new long[]{0x00078000080800F0L});
    public static final BitSet FOLLOW_36_in_ruleComparison3335 = new BitSet(new long[]{0x00078000080800F0L});
    public static final BitSet FOLLOW_37_in_ruleComparison3364 = new BitSet(new long[]{0x00078000080800F0L});
    public static final BitSet FOLLOW_38_in_ruleComparison3393 = new BitSet(new long[]{0x00078000080800F0L});
    public static final BitSet FOLLOW_ruleOr_in_ruleComparison3416 = new BitSet(new long[]{0x0000007F80000002L});
    public static final BitSet FOLLOW_ruleOr_in_entryRuleOr3454 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOr3464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnd_in_ruleOr3511 = new BitSet(new long[]{0x0000018000000002L});
    public static final BitSet FOLLOW_39_in_ruleOr3534 = new BitSet(new long[]{0x00078000080800F0L});
    public static final BitSet FOLLOW_40_in_ruleOr3552 = new BitSet(new long[]{0x00078000080800F0L});
    public static final BitSet FOLLOW_ruleAnd_in_ruleOr3575 = new BitSet(new long[]{0x0000018000000002L});
    public static final BitSet FOLLOW_ruleAnd_in_entryRuleAnd3613 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnd3623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddition_in_ruleAnd3670 = new BitSet(new long[]{0x0000060000000002L});
    public static final BitSet FOLLOW_41_in_ruleAnd3693 = new BitSet(new long[]{0x00078000080800F0L});
    public static final BitSet FOLLOW_42_in_ruleAnd3711 = new BitSet(new long[]{0x00078000080800F0L});
    public static final BitSet FOLLOW_ruleAddition_in_ruleAnd3734 = new BitSet(new long[]{0x0000060000000002L});
    public static final BitSet FOLLOW_ruleAddition_in_entryRuleAddition3772 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAddition3782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplication_in_ruleAddition3829 = new BitSet(new long[]{0x0000180000000002L});
    public static final BitSet FOLLOW_43_in_ruleAddition3852 = new BitSet(new long[]{0x00078000080800F0L});
    public static final BitSet FOLLOW_44_in_ruleAddition3881 = new BitSet(new long[]{0x00078000080800F0L});
    public static final BitSet FOLLOW_ruleMultiplication_in_ruleAddition3904 = new BitSet(new long[]{0x0000180000000002L});
    public static final BitSet FOLLOW_ruleMultiplication_in_entryRuleMultiplication3942 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiplication3952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_ruleMultiplication3999 = new BitSet(new long[]{0x0000600000000002L});
    public static final BitSet FOLLOW_45_in_ruleMultiplication4022 = new BitSet(new long[]{0x00078000080800F0L});
    public static final BitSet FOLLOW_46_in_ruleMultiplication4051 = new BitSet(new long[]{0x00078000080800F0L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_ruleMultiplication4074 = new BitSet(new long[]{0x0000600000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression4112 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimaryExpression4122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rulePrimaryExpression4160 = new BitSet(new long[]{0x00078000080800F0L});
    public static final BitSet FOLLOW_ruleExpression_in_rulePrimaryExpression4182 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_rulePrimaryExpression4193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_REAL_in_rulePrimaryExpression4227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rulePrimaryExpression4266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionCall_in_rulePrimaryExpression4300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePostfix_in_rulePrimaryExpression4327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePrimaryExpression4359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayLiteral_in_rulePrimaryExpression4393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionDeclaration_in_rulePrimaryExpression4420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rulePrimaryExpression4447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rulePrimaryExpression4476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rulePrimaryExpression4505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayLiteral_in_entryRuleArrayLiteral4542 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArrayLiteral4552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleArrayLiteral4598 = new BitSet(new long[]{0x000F8000080800F0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleArrayLiteral4620 = new BitSet(new long[]{0x0008000010000000L});
    public static final BitSet FOLLOW_28_in_ruleArrayLiteral4633 = new BitSet(new long[]{0x00078000080800F0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleArrayLiteral4654 = new BitSet(new long[]{0x0008000010000000L});
    public static final BitSet FOLLOW_51_in_ruleArrayLiteral4670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePostfix_in_entryRulePostfix4708 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePostfix4718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableReference_in_rulePostfix4765 = new BitSet(new long[]{0x0030000000000002L});
    public static final BitSet FOLLOW_52_in_rulePostfix4787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rulePostfix4816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableReference_in_entryRuleVariableReference4855 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableReference4865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariableReference4910 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_50_in_ruleVariableReference4923 = new BitSet(new long[]{0x00078000080800F0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleVariableReference4944 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_ruleVariableReference4956 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_ruleFunctionCall_in_entryRuleFunctionCall4994 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionCall5004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionCall5058 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleFunctionCall5070 = new BitSet(new long[]{0x00078000081800F0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleFunctionCall5092 = new BitSet(new long[]{0x0000000010100000L});
    public static final BitSet FOLLOW_28_in_ruleFunctionCall5105 = new BitSet(new long[]{0x00078000080800F0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleFunctionCall5126 = new BitSet(new long[]{0x0000000010100000L});
    public static final BitSet FOLLOW_20_in_ruleFunctionCall5142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReturnStatement_in_entryRuleReturnStatement5178 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReturnStatement5188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleReturnStatement5225 = new BitSet(new long[]{0x00078000080800F0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleReturnStatement5246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInclude_in_entryRuleInclude5282 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInclude5292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleInclude5329 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleInclude5341 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleInclude5358 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleInclude5375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_synpred1_InternalLeek1257 = new BitSet(new long[]{0x0000000000000002L});

}