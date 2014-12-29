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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_REAL", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "';'", "'break'", "'continue'", "'{'", "'}'", "'='", "'-='", "'+='", "'--'", "'++'", "'if'", "'('", "')'", "'else'", "'while'", "'for'", "':'", "'in'", "'var'", "'function'", "','", "'@'", "'global'", "'==='", "'=='", "'!=='", "'!='", "'<='", "'<'", "'>='", "'>'", "'or'", "'||'", "'and'", "'&&'", "'+'", "'-'", "'*'", "'/'", "'?'", "'!'", "'null'", "'false'", "'true'", "'['", "']'", "'return'", "'include'"
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
    public static final int T__56=56;
    public static final int T__19=19;
    public static final int T__57=57;
    public static final int T__58=58;
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
    public static final int T__59=59;
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

                if ( (LA1_0==RULE_ID||(LA1_0>=12 && LA1_0<=15)||(LA1_0>=20 && LA1_0<=22)||(LA1_0>=26 && LA1_0<=27)||(LA1_0>=30 && LA1_0<=31)||LA1_0==34||(LA1_0>=58 && LA1_0<=59)) ) {
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
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:115:1: ruleStatement returns [EObject current=null] : ( (this_Include_0= ruleInclude otherlv_1= ';' ) | (this_GlobalDeclaration_2= ruleGlobalDeclaration otherlv_3= ';' ) | this_FunctionDeclaration_4= ruleFunctionDeclaration | (this_LocalDeclaration_5= ruleLocalDeclaration otherlv_6= ';' ) | (this_FunctionCall_7= ruleFunctionCall otherlv_8= ';' ) | this_Iteration_9= ruleIteration | this_If_10= ruleIf | (this_AffectationStatement_11= ruleAffectationStatement otherlv_12= ';' ) | this_StatementBlock_13= ruleStatementBlock | (this_ReturnStatement_14= ruleReturnStatement otherlv_15= ';' ) | (this_BreakStatement_16= ruleBreakStatement otherlv_17= ';' ) | (this_ContinueStatement_18= ruleContinueStatement otherlv_19= ';' ) | ( () otherlv_21= ';' ) ) ;
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

        EObject this_AffectationStatement_11 = null;

        EObject this_StatementBlock_13 = null;

        EObject this_ReturnStatement_14 = null;

        EObject this_BreakStatement_16 = null;

        EObject this_ContinueStatement_18 = null;


         enterRule(); 
            
        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:118:28: ( ( (this_Include_0= ruleInclude otherlv_1= ';' ) | (this_GlobalDeclaration_2= ruleGlobalDeclaration otherlv_3= ';' ) | this_FunctionDeclaration_4= ruleFunctionDeclaration | (this_LocalDeclaration_5= ruleLocalDeclaration otherlv_6= ';' ) | (this_FunctionCall_7= ruleFunctionCall otherlv_8= ';' ) | this_Iteration_9= ruleIteration | this_If_10= ruleIf | (this_AffectationStatement_11= ruleAffectationStatement otherlv_12= ';' ) | this_StatementBlock_13= ruleStatementBlock | (this_ReturnStatement_14= ruleReturnStatement otherlv_15= ';' ) | (this_BreakStatement_16= ruleBreakStatement otherlv_17= ';' ) | (this_ContinueStatement_18= ruleContinueStatement otherlv_19= ';' ) | ( () otherlv_21= ';' ) ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:119:1: ( (this_Include_0= ruleInclude otherlv_1= ';' ) | (this_GlobalDeclaration_2= ruleGlobalDeclaration otherlv_3= ';' ) | this_FunctionDeclaration_4= ruleFunctionDeclaration | (this_LocalDeclaration_5= ruleLocalDeclaration otherlv_6= ';' ) | (this_FunctionCall_7= ruleFunctionCall otherlv_8= ';' ) | this_Iteration_9= ruleIteration | this_If_10= ruleIf | (this_AffectationStatement_11= ruleAffectationStatement otherlv_12= ';' ) | this_StatementBlock_13= ruleStatementBlock | (this_ReturnStatement_14= ruleReturnStatement otherlv_15= ';' ) | (this_BreakStatement_16= ruleBreakStatement otherlv_17= ';' ) | (this_ContinueStatement_18= ruleContinueStatement otherlv_19= ';' ) | ( () otherlv_21= ';' ) )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:119:1: ( (this_Include_0= ruleInclude otherlv_1= ';' ) | (this_GlobalDeclaration_2= ruleGlobalDeclaration otherlv_3= ';' ) | this_FunctionDeclaration_4= ruleFunctionDeclaration | (this_LocalDeclaration_5= ruleLocalDeclaration otherlv_6= ';' ) | (this_FunctionCall_7= ruleFunctionCall otherlv_8= ';' ) | this_Iteration_9= ruleIteration | this_If_10= ruleIf | (this_AffectationStatement_11= ruleAffectationStatement otherlv_12= ';' ) | this_StatementBlock_13= ruleStatementBlock | (this_ReturnStatement_14= ruleReturnStatement otherlv_15= ';' ) | (this_BreakStatement_16= ruleBreakStatement otherlv_17= ';' ) | (this_ContinueStatement_18= ruleContinueStatement otherlv_19= ';' ) | ( () otherlv_21= ';' ) )
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
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:205:6: (this_AffectationStatement_11= ruleAffectationStatement otherlv_12= ';' )
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:205:6: (this_AffectationStatement_11= ruleAffectationStatement otherlv_12= ';' )
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:206:5: this_AffectationStatement_11= ruleAffectationStatement otherlv_12= ';'
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getAffectationStatementParserRuleCall_7_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAffectationStatement_in_ruleStatement469);
                    this_AffectationStatement_11=ruleAffectationStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_AffectationStatement_11; 
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

                if ( (LA3_0==RULE_ID||(LA3_0>=12 && LA3_0<=15)||(LA3_0>=20 && LA3_0<=22)||(LA3_0>=26 && LA3_0<=27)||(LA3_0>=30 && LA3_0<=31)||LA3_0==34||(LA3_0>=58 && LA3_0<=59)) ) {
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


    // $ANTLR start "entryRuleAffectationStatement"
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:404:1: entryRuleAffectationStatement returns [EObject current=null] : iv_ruleAffectationStatement= ruleAffectationStatement EOF ;
    public final EObject entryRuleAffectationStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAffectationStatement = null;


        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:405:2: (iv_ruleAffectationStatement= ruleAffectationStatement EOF )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:406:2: iv_ruleAffectationStatement= ruleAffectationStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAffectationStatementRule()); 
            }
            pushFollow(FOLLOW_ruleAffectationStatement_in_entryRuleAffectationStatement1006);
            iv_ruleAffectationStatement=ruleAffectationStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAffectationStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAffectationStatement1016); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAffectationStatement"


    // $ANTLR start "ruleAffectationStatement"
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:413:1: ruleAffectationStatement returns [EObject current=null] : ( ( ( ruleAffectationDecrement )=>this_AffectationDecrement_0= ruleAffectationDecrement ) | ( ( ruleAffectationIncrement )=>this_AffectationIncrement_1= ruleAffectationIncrement ) | ( ( ruleAffectationPostfixStatement )=>this_AffectationPostfixStatement_2= ruleAffectationPostfixStatement ) | ( ( ruleAffectationPrefixStatement )=>this_AffectationPrefixStatement_3= ruleAffectationPrefixStatement ) | this_Affectation_4= ruleAffectation ) ;
    public final EObject ruleAffectationStatement() throws RecognitionException {
        EObject current = null;

        EObject this_AffectationDecrement_0 = null;

        EObject this_AffectationIncrement_1 = null;

        EObject this_AffectationPostfixStatement_2 = null;

        EObject this_AffectationPrefixStatement_3 = null;

        EObject this_Affectation_4 = null;


         enterRule(); 
            
        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:416:28: ( ( ( ( ruleAffectationDecrement )=>this_AffectationDecrement_0= ruleAffectationDecrement ) | ( ( ruleAffectationIncrement )=>this_AffectationIncrement_1= ruleAffectationIncrement ) | ( ( ruleAffectationPostfixStatement )=>this_AffectationPostfixStatement_2= ruleAffectationPostfixStatement ) | ( ( ruleAffectationPrefixStatement )=>this_AffectationPrefixStatement_3= ruleAffectationPrefixStatement ) | this_Affectation_4= ruleAffectation ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:417:1: ( ( ( ruleAffectationDecrement )=>this_AffectationDecrement_0= ruleAffectationDecrement ) | ( ( ruleAffectationIncrement )=>this_AffectationIncrement_1= ruleAffectationIncrement ) | ( ( ruleAffectationPostfixStatement )=>this_AffectationPostfixStatement_2= ruleAffectationPostfixStatement ) | ( ( ruleAffectationPrefixStatement )=>this_AffectationPrefixStatement_3= ruleAffectationPrefixStatement ) | this_Affectation_4= ruleAffectation )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:417:1: ( ( ( ruleAffectationDecrement )=>this_AffectationDecrement_0= ruleAffectationDecrement ) | ( ( ruleAffectationIncrement )=>this_AffectationIncrement_1= ruleAffectationIncrement ) | ( ( ruleAffectationPostfixStatement )=>this_AffectationPostfixStatement_2= ruleAffectationPostfixStatement ) | ( ( ruleAffectationPrefixStatement )=>this_AffectationPrefixStatement_3= ruleAffectationPrefixStatement ) | this_Affectation_4= ruleAffectation )
            int alt4=5;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                int LA4_1 = input.LA(2);

                if ( (synpred1_InternalLeek()) ) {
                    alt4=1;
                }
                else if ( (synpred2_InternalLeek()) ) {
                    alt4=2;
                }
                else if ( (synpred3_InternalLeek()) ) {
                    alt4=3;
                }
                else if ( (true) ) {
                    alt4=5;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA4_0==20) && (synpred4_InternalLeek())) {
                alt4=4;
            }
            else if ( (LA4_0==21) && (synpred4_InternalLeek())) {
                alt4=4;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:417:2: ( ( ruleAffectationDecrement )=>this_AffectationDecrement_0= ruleAffectationDecrement )
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:417:2: ( ( ruleAffectationDecrement )=>this_AffectationDecrement_0= ruleAffectationDecrement )
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:417:3: ( ruleAffectationDecrement )=>this_AffectationDecrement_0= ruleAffectationDecrement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAffectationStatementAccess().getAffectationDecrementParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAffectationDecrement_in_ruleAffectationStatement1069);
                    this_AffectationDecrement_0=ruleAffectationDecrement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_AffectationDecrement_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:427:6: ( ( ruleAffectationIncrement )=>this_AffectationIncrement_1= ruleAffectationIncrement )
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:427:6: ( ( ruleAffectationIncrement )=>this_AffectationIncrement_1= ruleAffectationIncrement )
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:427:7: ( ruleAffectationIncrement )=>this_AffectationIncrement_1= ruleAffectationIncrement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAffectationStatementAccess().getAffectationIncrementParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAffectationIncrement_in_ruleAffectationStatement1103);
                    this_AffectationIncrement_1=ruleAffectationIncrement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_AffectationIncrement_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:437:6: ( ( ruleAffectationPostfixStatement )=>this_AffectationPostfixStatement_2= ruleAffectationPostfixStatement )
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:437:6: ( ( ruleAffectationPostfixStatement )=>this_AffectationPostfixStatement_2= ruleAffectationPostfixStatement )
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:437:7: ( ruleAffectationPostfixStatement )=>this_AffectationPostfixStatement_2= ruleAffectationPostfixStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAffectationStatementAccess().getAffectationPostfixStatementParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAffectationPostfixStatement_in_ruleAffectationStatement1137);
                    this_AffectationPostfixStatement_2=ruleAffectationPostfixStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_AffectationPostfixStatement_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:447:6: ( ( ruleAffectationPrefixStatement )=>this_AffectationPrefixStatement_3= ruleAffectationPrefixStatement )
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:447:6: ( ( ruleAffectationPrefixStatement )=>this_AffectationPrefixStatement_3= ruleAffectationPrefixStatement )
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:447:7: ( ruleAffectationPrefixStatement )=>this_AffectationPrefixStatement_3= ruleAffectationPrefixStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAffectationStatementAccess().getAffectationPrefixStatementParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAffectationPrefixStatement_in_ruleAffectationStatement1171);
                    this_AffectationPrefixStatement_3=ruleAffectationPrefixStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_AffectationPrefixStatement_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:458:5: this_Affectation_4= ruleAffectation
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAffectationStatementAccess().getAffectationParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAffectation_in_ruleAffectationStatement1199);
                    this_Affectation_4=ruleAffectation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Affectation_4; 
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
    // $ANTLR end "ruleAffectationStatement"


    // $ANTLR start "entryRuleAffectation"
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:474:1: entryRuleAffectation returns [EObject current=null] : iv_ruleAffectation= ruleAffectation EOF ;
    public final EObject entryRuleAffectation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAffectation = null;


        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:475:2: (iv_ruleAffectation= ruleAffectation EOF )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:476:2: iv_ruleAffectation= ruleAffectation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAffectationRule()); 
            }
            pushFollow(FOLLOW_ruleAffectation_in_entryRuleAffectation1234);
            iv_ruleAffectation=ruleAffectation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAffectation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAffectation1244); if (state.failed) return current;

            }

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
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:483:1: ruleAffectation returns [EObject current=null] : ( ( (lv_variable_0_0= ruleVariableReference ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) ) ) ;
    public final EObject ruleAffectation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_variable_0_0 = null;

        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:486:28: ( ( ( (lv_variable_0_0= ruleVariableReference ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) ) ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:487:1: ( ( (lv_variable_0_0= ruleVariableReference ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) ) )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:487:1: ( ( (lv_variable_0_0= ruleVariableReference ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:487:2: ( (lv_variable_0_0= ruleVariableReference ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:487:2: ( (lv_variable_0_0= ruleVariableReference ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:488:1: (lv_variable_0_0= ruleVariableReference )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:488:1: (lv_variable_0_0= ruleVariableReference )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:489:3: lv_variable_0_0= ruleVariableReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAffectationAccess().getVariableVariableReferenceParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVariableReference_in_ruleAffectation1290);
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

            otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleAffectation1302); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getAffectationAccess().getEqualsSignKeyword_1());
                  
            }
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:509:1: ( (lv_value_2_0= ruleExpression ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:510:1: (lv_value_2_0= ruleExpression )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:510:1: (lv_value_2_0= ruleExpression )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:511:3: lv_value_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAffectationAccess().getValueExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleAffectation1323);
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


    // $ANTLR start "entryRuleAffectationDecrement"
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:535:1: entryRuleAffectationDecrement returns [EObject current=null] : iv_ruleAffectationDecrement= ruleAffectationDecrement EOF ;
    public final EObject entryRuleAffectationDecrement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAffectationDecrement = null;


        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:536:2: (iv_ruleAffectationDecrement= ruleAffectationDecrement EOF )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:537:2: iv_ruleAffectationDecrement= ruleAffectationDecrement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAffectationDecrementRule()); 
            }
            pushFollow(FOLLOW_ruleAffectationDecrement_in_entryRuleAffectationDecrement1359);
            iv_ruleAffectationDecrement=ruleAffectationDecrement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAffectationDecrement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAffectationDecrement1369); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAffectationDecrement"


    // $ANTLR start "ruleAffectationDecrement"
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:544:1: ruleAffectationDecrement returns [EObject current=null] : ( ( (lv_variable_0_0= ruleVariableReference ) ) otherlv_1= '-=' ( (lv_decrement_2_0= ruleExpression ) ) ) ;
    public final EObject ruleAffectationDecrement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_variable_0_0 = null;

        EObject lv_decrement_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:547:28: ( ( ( (lv_variable_0_0= ruleVariableReference ) ) otherlv_1= '-=' ( (lv_decrement_2_0= ruleExpression ) ) ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:548:1: ( ( (lv_variable_0_0= ruleVariableReference ) ) otherlv_1= '-=' ( (lv_decrement_2_0= ruleExpression ) ) )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:548:1: ( ( (lv_variable_0_0= ruleVariableReference ) ) otherlv_1= '-=' ( (lv_decrement_2_0= ruleExpression ) ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:548:2: ( (lv_variable_0_0= ruleVariableReference ) ) otherlv_1= '-=' ( (lv_decrement_2_0= ruleExpression ) )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:548:2: ( (lv_variable_0_0= ruleVariableReference ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:549:1: (lv_variable_0_0= ruleVariableReference )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:549:1: (lv_variable_0_0= ruleVariableReference )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:550:3: lv_variable_0_0= ruleVariableReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAffectationDecrementAccess().getVariableVariableReferenceParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVariableReference_in_ruleAffectationDecrement1415);
            lv_variable_0_0=ruleVariableReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAffectationDecrementRule());
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

            otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleAffectationDecrement1427); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getAffectationDecrementAccess().getHyphenMinusEqualsSignKeyword_1());
                  
            }
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:570:1: ( (lv_decrement_2_0= ruleExpression ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:571:1: (lv_decrement_2_0= ruleExpression )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:571:1: (lv_decrement_2_0= ruleExpression )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:572:3: lv_decrement_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAffectationDecrementAccess().getDecrementExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleAffectationDecrement1448);
            lv_decrement_2_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAffectationDecrementRule());
              	        }
                     		set(
                     			current, 
                     			"decrement",
                      		lv_decrement_2_0, 
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
    // $ANTLR end "ruleAffectationDecrement"


    // $ANTLR start "entryRuleAffectationIncrement"
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:596:1: entryRuleAffectationIncrement returns [EObject current=null] : iv_ruleAffectationIncrement= ruleAffectationIncrement EOF ;
    public final EObject entryRuleAffectationIncrement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAffectationIncrement = null;


        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:597:2: (iv_ruleAffectationIncrement= ruleAffectationIncrement EOF )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:598:2: iv_ruleAffectationIncrement= ruleAffectationIncrement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAffectationIncrementRule()); 
            }
            pushFollow(FOLLOW_ruleAffectationIncrement_in_entryRuleAffectationIncrement1484);
            iv_ruleAffectationIncrement=ruleAffectationIncrement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAffectationIncrement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAffectationIncrement1494); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAffectationIncrement"


    // $ANTLR start "ruleAffectationIncrement"
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:605:1: ruleAffectationIncrement returns [EObject current=null] : ( ( (lv_variable_0_0= ruleVariableReference ) ) otherlv_1= '+=' ( (lv_increment_2_0= ruleExpression ) ) ) ;
    public final EObject ruleAffectationIncrement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_variable_0_0 = null;

        EObject lv_increment_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:608:28: ( ( ( (lv_variable_0_0= ruleVariableReference ) ) otherlv_1= '+=' ( (lv_increment_2_0= ruleExpression ) ) ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:609:1: ( ( (lv_variable_0_0= ruleVariableReference ) ) otherlv_1= '+=' ( (lv_increment_2_0= ruleExpression ) ) )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:609:1: ( ( (lv_variable_0_0= ruleVariableReference ) ) otherlv_1= '+=' ( (lv_increment_2_0= ruleExpression ) ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:609:2: ( (lv_variable_0_0= ruleVariableReference ) ) otherlv_1= '+=' ( (lv_increment_2_0= ruleExpression ) )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:609:2: ( (lv_variable_0_0= ruleVariableReference ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:610:1: (lv_variable_0_0= ruleVariableReference )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:610:1: (lv_variable_0_0= ruleVariableReference )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:611:3: lv_variable_0_0= ruleVariableReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAffectationIncrementAccess().getVariableVariableReferenceParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVariableReference_in_ruleAffectationIncrement1540);
            lv_variable_0_0=ruleVariableReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAffectationIncrementRule());
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

            otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleAffectationIncrement1552); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getAffectationIncrementAccess().getPlusSignEqualsSignKeyword_1());
                  
            }
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:631:1: ( (lv_increment_2_0= ruleExpression ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:632:1: (lv_increment_2_0= ruleExpression )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:632:1: (lv_increment_2_0= ruleExpression )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:633:3: lv_increment_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAffectationIncrementAccess().getIncrementExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleAffectationIncrement1573);
            lv_increment_2_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAffectationIncrementRule());
              	        }
                     		set(
                     			current, 
                     			"increment",
                      		lv_increment_2_0, 
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
    // $ANTLR end "ruleAffectationIncrement"


    // $ANTLR start "entryRuleAffectationPostfixStatement"
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:657:1: entryRuleAffectationPostfixStatement returns [EObject current=null] : iv_ruleAffectationPostfixStatement= ruleAffectationPostfixStatement EOF ;
    public final EObject entryRuleAffectationPostfixStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAffectationPostfixStatement = null;


        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:658:2: (iv_ruleAffectationPostfixStatement= ruleAffectationPostfixStatement EOF )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:659:2: iv_ruleAffectationPostfixStatement= ruleAffectationPostfixStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAffectationPostfixStatementRule()); 
            }
            pushFollow(FOLLOW_ruleAffectationPostfixStatement_in_entryRuleAffectationPostfixStatement1609);
            iv_ruleAffectationPostfixStatement=ruleAffectationPostfixStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAffectationPostfixStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAffectationPostfixStatement1619); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAffectationPostfixStatement"


    // $ANTLR start "ruleAffectationPostfixStatement"
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:666:1: ruleAffectationPostfixStatement returns [EObject current=null] : (this_VariableReference_0= ruleVariableReference ( ( () otherlv_2= '--' ) | ( () otherlv_4= '++' ) ) ) ;
    public final EObject ruleAffectationPostfixStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_VariableReference_0 = null;


         enterRule(); 
            
        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:669:28: ( (this_VariableReference_0= ruleVariableReference ( ( () otherlv_2= '--' ) | ( () otherlv_4= '++' ) ) ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:670:1: (this_VariableReference_0= ruleVariableReference ( ( () otherlv_2= '--' ) | ( () otherlv_4= '++' ) ) )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:670:1: (this_VariableReference_0= ruleVariableReference ( ( () otherlv_2= '--' ) | ( () otherlv_4= '++' ) ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:671:5: this_VariableReference_0= ruleVariableReference ( ( () otherlv_2= '--' ) | ( () otherlv_4= '++' ) )
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getAffectationPostfixStatementAccess().getVariableReferenceParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleVariableReference_in_ruleAffectationPostfixStatement1666);
            this_VariableReference_0=ruleVariableReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_VariableReference_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:679:1: ( ( () otherlv_2= '--' ) | ( () otherlv_4= '++' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==20) ) {
                alt5=1;
            }
            else if ( (LA5_0==21) ) {
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
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:679:2: ( () otherlv_2= '--' )
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:679:2: ( () otherlv_2= '--' )
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:679:3: () otherlv_2= '--'
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:679:3: ()
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:680:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getAffectationPostfixStatementAccess().getPostfixDecrementValueAction_1_0_0(),
                                  current);
                          
                    }

                    }

                    otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleAffectationPostfixStatement1688); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getAffectationPostfixStatementAccess().getHyphenMinusHyphenMinusKeyword_1_0_1());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:690:6: ( () otherlv_4= '++' )
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:690:6: ( () otherlv_4= '++' )
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:690:7: () otherlv_4= '++'
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:690:7: ()
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:691:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getAffectationPostfixStatementAccess().getPostfixIncrementValueAction_1_1_0(),
                                  current);
                          
                    }

                    }

                    otherlv_4=(Token)match(input,21,FOLLOW_21_in_ruleAffectationPostfixStatement1717); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getAffectationPostfixStatementAccess().getPlusSignPlusSignKeyword_1_1_1());
                          
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
    // $ANTLR end "ruleAffectationPostfixStatement"


    // $ANTLR start "entryRuleAffectationPrefixStatement"
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:708:1: entryRuleAffectationPrefixStatement returns [EObject current=null] : iv_ruleAffectationPrefixStatement= ruleAffectationPrefixStatement EOF ;
    public final EObject entryRuleAffectationPrefixStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAffectationPrefixStatement = null;


        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:709:2: (iv_ruleAffectationPrefixStatement= ruleAffectationPrefixStatement EOF )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:710:2: iv_ruleAffectationPrefixStatement= ruleAffectationPrefixStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAffectationPrefixStatementRule()); 
            }
            pushFollow(FOLLOW_ruleAffectationPrefixStatement_in_entryRuleAffectationPrefixStatement1755);
            iv_ruleAffectationPrefixStatement=ruleAffectationPrefixStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAffectationPrefixStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAffectationPrefixStatement1765); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAffectationPrefixStatement"


    // $ANTLR start "ruleAffectationPrefixStatement"
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:717:1: ruleAffectationPrefixStatement returns [EObject current=null] : ( ( ( () otherlv_1= '--' ) | ( () otherlv_3= '++' ) ) ( (lv_right_4_0= ruleVariableReference ) ) ) ;
    public final EObject ruleAffectationPrefixStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_right_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:720:28: ( ( ( ( () otherlv_1= '--' ) | ( () otherlv_3= '++' ) ) ( (lv_right_4_0= ruleVariableReference ) ) ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:721:1: ( ( ( () otherlv_1= '--' ) | ( () otherlv_3= '++' ) ) ( (lv_right_4_0= ruleVariableReference ) ) )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:721:1: ( ( ( () otherlv_1= '--' ) | ( () otherlv_3= '++' ) ) ( (lv_right_4_0= ruleVariableReference ) ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:721:2: ( ( () otherlv_1= '--' ) | ( () otherlv_3= '++' ) ) ( (lv_right_4_0= ruleVariableReference ) )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:721:2: ( ( () otherlv_1= '--' ) | ( () otherlv_3= '++' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==20) ) {
                alt6=1;
            }
            else if ( (LA6_0==21) ) {
                alt6=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:721:3: ( () otherlv_1= '--' )
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:721:3: ( () otherlv_1= '--' )
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:721:4: () otherlv_1= '--'
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:721:4: ()
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:722:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getAffectationPrefixStatementAccess().getPrefixDecrementAction_0_0_0(),
                                  current);
                          
                    }

                    }

                    otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleAffectationPrefixStatement1813); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getAffectationPrefixStatementAccess().getHyphenMinusHyphenMinusKeyword_0_0_1());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:732:6: ( () otherlv_3= '++' )
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:732:6: ( () otherlv_3= '++' )
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:732:7: () otherlv_3= '++'
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:732:7: ()
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:733:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getAffectationPrefixStatementAccess().getPrefixIncrementAction_0_1_0(),
                                  current);
                          
                    }

                    }

                    otherlv_3=(Token)match(input,21,FOLLOW_21_in_ruleAffectationPrefixStatement1842); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getAffectationPrefixStatementAccess().getPlusSignPlusSignKeyword_0_1_1());
                          
                    }

                    }


                    }
                    break;

            }

            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:742:3: ( (lv_right_4_0= ruleVariableReference ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:743:1: (lv_right_4_0= ruleVariableReference )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:743:1: (lv_right_4_0= ruleVariableReference )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:744:3: lv_right_4_0= ruleVariableReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAffectationPrefixStatementAccess().getRightVariableReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVariableReference_in_ruleAffectationPrefixStatement1865);
            lv_right_4_0=ruleVariableReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAffectationPrefixStatementRule());
              	        }
                     		set(
                     			current, 
                     			"right",
                      		lv_right_4_0, 
                      		"VariableReference");
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
    // $ANTLR end "ruleAffectationPrefixStatement"


    // $ANTLR start "entryRuleIf"
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:768:1: entryRuleIf returns [EObject current=null] : iv_ruleIf= ruleIf EOF ;
    public final EObject entryRuleIf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIf = null;


        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:769:2: (iv_ruleIf= ruleIf EOF )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:770:2: iv_ruleIf= ruleIf EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIfRule()); 
            }
            pushFollow(FOLLOW_ruleIf_in_entryRuleIf1901);
            iv_ruleIf=ruleIf();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIf; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIf1911); if (state.failed) return current;

            }

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
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:777:1: ruleIf returns [EObject current=null] : (otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleIfCondition ) ) otherlv_3= ')' ( (lv_then_4_0= ruleStatement ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleStatement ) ) )? ) ;
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
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:780:28: ( (otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleIfCondition ) ) otherlv_3= ')' ( (lv_then_4_0= ruleStatement ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleStatement ) ) )? ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:781:1: (otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleIfCondition ) ) otherlv_3= ')' ( (lv_then_4_0= ruleStatement ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleStatement ) ) )? )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:781:1: (otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleIfCondition ) ) otherlv_3= ')' ( (lv_then_4_0= ruleStatement ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleStatement ) ) )? )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:781:3: otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleIfCondition ) ) otherlv_3= ')' ( (lv_then_4_0= ruleStatement ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleStatement ) ) )?
            {
            otherlv_0=(Token)match(input,22,FOLLOW_22_in_ruleIf1948); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getIfAccess().getIfKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,23,FOLLOW_23_in_ruleIf1960); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getIfAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:789:1: ( (lv_condition_2_0= ruleIfCondition ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:790:1: (lv_condition_2_0= ruleIfCondition )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:790:1: (lv_condition_2_0= ruleIfCondition )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:791:3: lv_condition_2_0= ruleIfCondition
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIfAccess().getConditionIfConditionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleIfCondition_in_ruleIf1981);
            lv_condition_2_0=ruleIfCondition();

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
                      		"IfCondition");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,24,FOLLOW_24_in_ruleIf1993); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getIfAccess().getRightParenthesisKeyword_3());
                  
            }
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:811:1: ( (lv_then_4_0= ruleStatement ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:812:1: (lv_then_4_0= ruleStatement )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:812:1: (lv_then_4_0= ruleStatement )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:813:3: lv_then_4_0= ruleStatement
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIfAccess().getThenStatementParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleStatement_in_ruleIf2014);
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

            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:829:2: ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleStatement ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==25) ) {
                int LA7_1 = input.LA(2);

                if ( (synpred5_InternalLeek()) ) {
                    alt7=1;
                }
            }
            switch (alt7) {
                case 1 :
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:829:3: ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleStatement ) )
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:829:3: ( ( 'else' )=>otherlv_5= 'else' )
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:829:4: ( 'else' )=>otherlv_5= 'else'
                    {
                    otherlv_5=(Token)match(input,25,FOLLOW_25_in_ruleIf2035); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getIfAccess().getElseKeyword_5_0());
                          
                    }

                    }

                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:834:2: ( (lv_else_6_0= ruleStatement ) )
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:835:1: (lv_else_6_0= ruleStatement )
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:835:1: (lv_else_6_0= ruleStatement )
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:836:3: lv_else_6_0= ruleStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIfAccess().getElseStatementParserRuleCall_5_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStatement_in_ruleIf2057);
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


    // $ANTLR start "entryRuleIfCondition"
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:860:1: entryRuleIfCondition returns [EObject current=null] : iv_ruleIfCondition= ruleIfCondition EOF ;
    public final EObject entryRuleIfCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfCondition = null;


        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:861:2: (iv_ruleIfCondition= ruleIfCondition EOF )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:862:2: iv_ruleIfCondition= ruleIfCondition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIfConditionRule()); 
            }
            pushFollow(FOLLOW_ruleIfCondition_in_entryRuleIfCondition2095);
            iv_ruleIfCondition=ruleIfCondition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIfCondition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIfCondition2105); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIfCondition"


    // $ANTLR start "ruleIfCondition"
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:869:1: ruleIfCondition returns [EObject current=null] : ( ( ( ruleAffectation )=>this_Affectation_0= ruleAffectation ) | this_Expression_1= ruleExpression ) ;
    public final EObject ruleIfCondition() throws RecognitionException {
        EObject current = null;

        EObject this_Affectation_0 = null;

        EObject this_Expression_1 = null;


         enterRule(); 
            
        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:872:28: ( ( ( ( ruleAffectation )=>this_Affectation_0= ruleAffectation ) | this_Expression_1= ruleExpression ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:873:1: ( ( ( ruleAffectation )=>this_Affectation_0= ruleAffectation ) | this_Expression_1= ruleExpression )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:873:1: ( ( ( ruleAffectation )=>this_Affectation_0= ruleAffectation ) | this_Expression_1= ruleExpression )
            int alt8=2;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:873:2: ( ( ruleAffectation )=>this_Affectation_0= ruleAffectation )
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:873:2: ( ( ruleAffectation )=>this_Affectation_0= ruleAffectation )
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:873:3: ( ruleAffectation )=>this_Affectation_0= ruleAffectation
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getIfConditionAccess().getAffectationParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAffectation_in_ruleIfCondition2158);
                    this_Affectation_0=ruleAffectation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Affectation_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:884:5: this_Expression_1= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getIfConditionAccess().getExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleIfCondition2186);
                    this_Expression_1=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Expression_1; 
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
    // $ANTLR end "ruleIfCondition"


    // $ANTLR start "entryRuleIteration"
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:900:1: entryRuleIteration returns [EObject current=null] : iv_ruleIteration= ruleIteration EOF ;
    public final EObject entryRuleIteration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIteration = null;


        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:901:2: (iv_ruleIteration= ruleIteration EOF )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:902:2: iv_ruleIteration= ruleIteration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIterationRule()); 
            }
            pushFollow(FOLLOW_ruleIteration_in_entryRuleIteration2221);
            iv_ruleIteration=ruleIteration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIteration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIteration2231); if (state.failed) return current;

            }

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
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:909:1: ruleIteration returns [EObject current=null] : (this_While_0= ruleWhile | this_ForIn_1= ruleForIn | this_For_2= ruleFor ) ;
    public final EObject ruleIteration() throws RecognitionException {
        EObject current = null;

        EObject this_While_0 = null;

        EObject this_ForIn_1 = null;

        EObject this_For_2 = null;


         enterRule(); 
            
        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:912:28: ( (this_While_0= ruleWhile | this_ForIn_1= ruleForIn | this_For_2= ruleFor ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:913:1: (this_While_0= ruleWhile | this_ForIn_1= ruleForIn | this_For_2= ruleFor )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:913:1: (this_While_0= ruleWhile | this_ForIn_1= ruleForIn | this_For_2= ruleFor )
            int alt9=3;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==26) ) {
                alt9=1;
            }
            else if ( (LA9_0==27) ) {
                int LA9_2 = input.LA(2);

                if ( (LA9_2==23) ) {
                    int LA9_3 = input.LA(3);

                    if ( (LA9_3==30) ) {
                        int LA9_4 = input.LA(4);

                        if ( (LA9_4==RULE_ID) ) {
                            int LA9_6 = input.LA(5);

                            if ( ((LA9_6>=28 && LA9_6<=29)) ) {
                                alt9=2;
                            }
                            else if ( (LA9_6==17) ) {
                                alt9=3;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 9, 6, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 9, 4, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA9_3==RULE_ID) ) {
                        int LA9_5 = input.LA(4);

                        if ( ((LA9_5>=28 && LA9_5<=29)) ) {
                            alt9=2;
                        }
                        else if ( (LA9_5==17||LA9_5==56) ) {
                            alt9=3;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 9, 5, input);

                            throw nvae;
                        }
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
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:914:5: this_While_0= ruleWhile
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getIterationAccess().getWhileParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleWhile_in_ruleIteration2278);
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
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:924:5: this_ForIn_1= ruleForIn
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getIterationAccess().getForInParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleForIn_in_ruleIteration2305);
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
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:934:5: this_For_2= ruleFor
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getIterationAccess().getForParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleFor_in_ruleIteration2332);
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
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:950:1: entryRuleWhile returns [EObject current=null] : iv_ruleWhile= ruleWhile EOF ;
    public final EObject entryRuleWhile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhile = null;


        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:951:2: (iv_ruleWhile= ruleWhile EOF )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:952:2: iv_ruleWhile= ruleWhile EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getWhileRule()); 
            }
            pushFollow(FOLLOW_ruleWhile_in_entryRuleWhile2367);
            iv_ruleWhile=ruleWhile();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleWhile; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleWhile2377); if (state.failed) return current;

            }

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
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:959:1: ruleWhile returns [EObject current=null] : (otherlv_0= 'while' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_statement_4_0= ruleStatement ) ) ) ;
    public final EObject ruleWhile() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_condition_2_0 = null;

        EObject lv_statement_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:962:28: ( (otherlv_0= 'while' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_statement_4_0= ruleStatement ) ) ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:963:1: (otherlv_0= 'while' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_statement_4_0= ruleStatement ) ) )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:963:1: (otherlv_0= 'while' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_statement_4_0= ruleStatement ) ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:963:3: otherlv_0= 'while' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_statement_4_0= ruleStatement ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_26_in_ruleWhile2414); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getWhileAccess().getWhileKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,23,FOLLOW_23_in_ruleWhile2426); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getWhileAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:971:1: ( (lv_condition_2_0= ruleExpression ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:972:1: (lv_condition_2_0= ruleExpression )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:972:1: (lv_condition_2_0= ruleExpression )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:973:3: lv_condition_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getWhileAccess().getConditionExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleWhile2447);
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

            otherlv_3=(Token)match(input,24,FOLLOW_24_in_ruleWhile2459); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getWhileAccess().getRightParenthesisKeyword_3());
                  
            }
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:993:1: ( (lv_statement_4_0= ruleStatement ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:994:1: (lv_statement_4_0= ruleStatement )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:994:1: (lv_statement_4_0= ruleStatement )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:995:3: lv_statement_4_0= ruleStatement
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getWhileAccess().getStatementStatementParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleStatement_in_ruleWhile2480);
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
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1019:1: entryRuleFor returns [EObject current=null] : iv_ruleFor= ruleFor EOF ;
    public final EObject entryRuleFor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFor = null;


        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1020:2: (iv_ruleFor= ruleFor EOF )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1021:2: iv_ruleFor= ruleFor EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getForRule()); 
            }
            pushFollow(FOLLOW_ruleFor_in_entryRuleFor2516);
            iv_ruleFor=ruleFor();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFor; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFor2526); if (state.failed) return current;

            }

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
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1028:1: ruleFor returns [EObject current=null] : (otherlv_0= 'for' otherlv_1= '(' ( (lv_initializer_2_0= ruleForInitializer ) ) otherlv_3= ';' ( (lv_condition_4_0= ruleExpression ) ) otherlv_5= ';' ( (lv_increment_6_0= ruleForAffectation ) ) otherlv_7= ')' ( (lv_statement_8_0= ruleStatement ) ) ) ;
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
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1031:28: ( (otherlv_0= 'for' otherlv_1= '(' ( (lv_initializer_2_0= ruleForInitializer ) ) otherlv_3= ';' ( (lv_condition_4_0= ruleExpression ) ) otherlv_5= ';' ( (lv_increment_6_0= ruleForAffectation ) ) otherlv_7= ')' ( (lv_statement_8_0= ruleStatement ) ) ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1032:1: (otherlv_0= 'for' otherlv_1= '(' ( (lv_initializer_2_0= ruleForInitializer ) ) otherlv_3= ';' ( (lv_condition_4_0= ruleExpression ) ) otherlv_5= ';' ( (lv_increment_6_0= ruleForAffectation ) ) otherlv_7= ')' ( (lv_statement_8_0= ruleStatement ) ) )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1032:1: (otherlv_0= 'for' otherlv_1= '(' ( (lv_initializer_2_0= ruleForInitializer ) ) otherlv_3= ';' ( (lv_condition_4_0= ruleExpression ) ) otherlv_5= ';' ( (lv_increment_6_0= ruleForAffectation ) ) otherlv_7= ')' ( (lv_statement_8_0= ruleStatement ) ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1032:3: otherlv_0= 'for' otherlv_1= '(' ( (lv_initializer_2_0= ruleForInitializer ) ) otherlv_3= ';' ( (lv_condition_4_0= ruleExpression ) ) otherlv_5= ';' ( (lv_increment_6_0= ruleForAffectation ) ) otherlv_7= ')' ( (lv_statement_8_0= ruleStatement ) )
            {
            otherlv_0=(Token)match(input,27,FOLLOW_27_in_ruleFor2563); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getForAccess().getForKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,23,FOLLOW_23_in_ruleFor2575); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getForAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1040:1: ( (lv_initializer_2_0= ruleForInitializer ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1041:1: (lv_initializer_2_0= ruleForInitializer )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1041:1: (lv_initializer_2_0= ruleForInitializer )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1042:3: lv_initializer_2_0= ruleForInitializer
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getForAccess().getInitializerForInitializerParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleForInitializer_in_ruleFor2596);
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

            otherlv_3=(Token)match(input,12,FOLLOW_12_in_ruleFor2608); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getForAccess().getSemicolonKeyword_3());
                  
            }
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1062:1: ( (lv_condition_4_0= ruleExpression ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1063:1: (lv_condition_4_0= ruleExpression )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1063:1: (lv_condition_4_0= ruleExpression )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1064:3: lv_condition_4_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getForAccess().getConditionExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleFor2629);
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

            otherlv_5=(Token)match(input,12,FOLLOW_12_in_ruleFor2641); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getForAccess().getSemicolonKeyword_5());
                  
            }
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1084:1: ( (lv_increment_6_0= ruleForAffectation ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1085:1: (lv_increment_6_0= ruleForAffectation )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1085:1: (lv_increment_6_0= ruleForAffectation )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1086:3: lv_increment_6_0= ruleForAffectation
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getForAccess().getIncrementForAffectationParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleForAffectation_in_ruleFor2662);
            lv_increment_6_0=ruleForAffectation();

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
                      		"ForAffectation");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_7=(Token)match(input,24,FOLLOW_24_in_ruleFor2674); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getForAccess().getRightParenthesisKeyword_7());
                  
            }
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1106:1: ( (lv_statement_8_0= ruleStatement ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1107:1: (lv_statement_8_0= ruleStatement )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1107:1: (lv_statement_8_0= ruleStatement )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1108:3: lv_statement_8_0= ruleStatement
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getForAccess().getStatementStatementParserRuleCall_8_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleStatement_in_ruleFor2695);
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
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1132:1: entryRuleForIn returns [EObject current=null] : iv_ruleForIn= ruleForIn EOF ;
    public final EObject entryRuleForIn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForIn = null;


        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1133:2: (iv_ruleForIn= ruleForIn EOF )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1134:2: iv_ruleForIn= ruleForIn EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getForInRule()); 
            }
            pushFollow(FOLLOW_ruleForIn_in_entryRuleForIn2731);
            iv_ruleForIn=ruleForIn();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleForIn; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleForIn2741); if (state.failed) return current;

            }

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
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1141:1: ruleForIn returns [EObject current=null] : (otherlv_0= 'for' otherlv_1= '(' ( ( (lv_key_2_0= ruleForInVariableReference ) ) otherlv_3= ':' )? ( (lv_value_4_0= ruleForInVariableReference ) ) otherlv_5= 'in' ( (lv_array_6_0= ruleExpression ) ) otherlv_7= ')' ( (lv_statement_8_0= ruleStatement ) ) ) ;
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
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1144:28: ( (otherlv_0= 'for' otherlv_1= '(' ( ( (lv_key_2_0= ruleForInVariableReference ) ) otherlv_3= ':' )? ( (lv_value_4_0= ruleForInVariableReference ) ) otherlv_5= 'in' ( (lv_array_6_0= ruleExpression ) ) otherlv_7= ')' ( (lv_statement_8_0= ruleStatement ) ) ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1145:1: (otherlv_0= 'for' otherlv_1= '(' ( ( (lv_key_2_0= ruleForInVariableReference ) ) otherlv_3= ':' )? ( (lv_value_4_0= ruleForInVariableReference ) ) otherlv_5= 'in' ( (lv_array_6_0= ruleExpression ) ) otherlv_7= ')' ( (lv_statement_8_0= ruleStatement ) ) )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1145:1: (otherlv_0= 'for' otherlv_1= '(' ( ( (lv_key_2_0= ruleForInVariableReference ) ) otherlv_3= ':' )? ( (lv_value_4_0= ruleForInVariableReference ) ) otherlv_5= 'in' ( (lv_array_6_0= ruleExpression ) ) otherlv_7= ')' ( (lv_statement_8_0= ruleStatement ) ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1145:3: otherlv_0= 'for' otherlv_1= '(' ( ( (lv_key_2_0= ruleForInVariableReference ) ) otherlv_3= ':' )? ( (lv_value_4_0= ruleForInVariableReference ) ) otherlv_5= 'in' ( (lv_array_6_0= ruleExpression ) ) otherlv_7= ')' ( (lv_statement_8_0= ruleStatement ) )
            {
            otherlv_0=(Token)match(input,27,FOLLOW_27_in_ruleForIn2778); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getForInAccess().getForKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,23,FOLLOW_23_in_ruleForIn2790); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getForInAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1153:1: ( ( (lv_key_2_0= ruleForInVariableReference ) ) otherlv_3= ':' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==30) ) {
                int LA10_1 = input.LA(2);

                if ( (LA10_1==RULE_ID) ) {
                    int LA10_3 = input.LA(3);

                    if ( (LA10_3==28) ) {
                        alt10=1;
                    }
                }
            }
            else if ( (LA10_0==RULE_ID) ) {
                int LA10_2 = input.LA(2);

                if ( (LA10_2==28) ) {
                    alt10=1;
                }
            }
            switch (alt10) {
                case 1 :
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1153:2: ( (lv_key_2_0= ruleForInVariableReference ) ) otherlv_3= ':'
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1153:2: ( (lv_key_2_0= ruleForInVariableReference ) )
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1154:1: (lv_key_2_0= ruleForInVariableReference )
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1154:1: (lv_key_2_0= ruleForInVariableReference )
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1155:3: lv_key_2_0= ruleForInVariableReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getForInAccess().getKeyForInVariableReferenceParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleForInVariableReference_in_ruleForIn2812);
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

                    otherlv_3=(Token)match(input,28,FOLLOW_28_in_ruleForIn2824); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getForInAccess().getColonKeyword_2_1());
                          
                    }

                    }
                    break;

            }

            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1175:3: ( (lv_value_4_0= ruleForInVariableReference ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1176:1: (lv_value_4_0= ruleForInVariableReference )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1176:1: (lv_value_4_0= ruleForInVariableReference )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1177:3: lv_value_4_0= ruleForInVariableReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getForInAccess().getValueForInVariableReferenceParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleForInVariableReference_in_ruleForIn2847);
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

            otherlv_5=(Token)match(input,29,FOLLOW_29_in_ruleForIn2859); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getForInAccess().getInKeyword_4());
                  
            }
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1197:1: ( (lv_array_6_0= ruleExpression ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1198:1: (lv_array_6_0= ruleExpression )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1198:1: (lv_array_6_0= ruleExpression )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1199:3: lv_array_6_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getForInAccess().getArrayExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleForIn2880);
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

            otherlv_7=(Token)match(input,24,FOLLOW_24_in_ruleForIn2892); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getForInAccess().getRightParenthesisKeyword_6());
                  
            }
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1219:1: ( (lv_statement_8_0= ruleStatement ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1220:1: (lv_statement_8_0= ruleStatement )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1220:1: (lv_statement_8_0= ruleStatement )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1221:3: lv_statement_8_0= ruleStatement
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getForInAccess().getStatementStatementParserRuleCall_7_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleStatement_in_ruleForIn2913);
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
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1245:1: entryRuleForInVariableReference returns [EObject current=null] : iv_ruleForInVariableReference= ruleForInVariableReference EOF ;
    public final EObject entryRuleForInVariableReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForInVariableReference = null;


        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1246:2: (iv_ruleForInVariableReference= ruleForInVariableReference EOF )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1247:2: iv_ruleForInVariableReference= ruleForInVariableReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getForInVariableReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleForInVariableReference_in_entryRuleForInVariableReference2949);
            iv_ruleForInVariableReference=ruleForInVariableReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleForInVariableReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleForInVariableReference2959); if (state.failed) return current;

            }

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
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1254:1: ruleForInVariableReference returns [EObject current=null] : ( (otherlv_0= 'var' this_VariableDeclarationUnitialized_1= ruleVariableDeclarationUnitialized ) | this_VariableReferenceSimple_2= ruleVariableReferenceSimple ) ;
    public final EObject ruleForInVariableReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_VariableDeclarationUnitialized_1 = null;

        EObject this_VariableReferenceSimple_2 = null;


         enterRule(); 
            
        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1257:28: ( ( (otherlv_0= 'var' this_VariableDeclarationUnitialized_1= ruleVariableDeclarationUnitialized ) | this_VariableReferenceSimple_2= ruleVariableReferenceSimple ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1258:1: ( (otherlv_0= 'var' this_VariableDeclarationUnitialized_1= ruleVariableDeclarationUnitialized ) | this_VariableReferenceSimple_2= ruleVariableReferenceSimple )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1258:1: ( (otherlv_0= 'var' this_VariableDeclarationUnitialized_1= ruleVariableDeclarationUnitialized ) | this_VariableReferenceSimple_2= ruleVariableReferenceSimple )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==30) ) {
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
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1258:2: (otherlv_0= 'var' this_VariableDeclarationUnitialized_1= ruleVariableDeclarationUnitialized )
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1258:2: (otherlv_0= 'var' this_VariableDeclarationUnitialized_1= ruleVariableDeclarationUnitialized )
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1258:4: otherlv_0= 'var' this_VariableDeclarationUnitialized_1= ruleVariableDeclarationUnitialized
                    {
                    otherlv_0=(Token)match(input,30,FOLLOW_30_in_ruleForInVariableReference2997); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getForInVariableReferenceAccess().getVarKeyword_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getForInVariableReferenceAccess().getVariableDeclarationUnitializedParserRuleCall_0_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleVariableDeclarationUnitialized_in_ruleForInVariableReference3019);
                    this_VariableDeclarationUnitialized_1=ruleVariableDeclarationUnitialized();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_VariableDeclarationUnitialized_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1273:5: this_VariableReferenceSimple_2= ruleVariableReferenceSimple
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getForInVariableReferenceAccess().getVariableReferenceSimpleParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleVariableReferenceSimple_in_ruleForInVariableReference3047);
                    this_VariableReferenceSimple_2=ruleVariableReferenceSimple();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_VariableReferenceSimple_2; 
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
    // $ANTLR end "ruleForInVariableReference"


    // $ANTLR start "entryRuleForInitializer"
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1289:1: entryRuleForInitializer returns [EObject current=null] : iv_ruleForInitializer= ruleForInitializer EOF ;
    public final EObject entryRuleForInitializer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForInitializer = null;


        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1290:2: (iv_ruleForInitializer= ruleForInitializer EOF )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1291:2: iv_ruleForInitializer= ruleForInitializer EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getForInitializerRule()); 
            }
            pushFollow(FOLLOW_ruleForInitializer_in_entryRuleForInitializer3082);
            iv_ruleForInitializer=ruleForInitializer();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleForInitializer; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleForInitializer3092); if (state.failed) return current;

            }

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
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1298:1: ruleForInitializer returns [EObject current=null] : ( (otherlv_0= 'var' this_VariableDeclarationWithValue_1= ruleVariableDeclarationWithValue ) | this_Affectation_2= ruleAffectation ) ;
    public final EObject ruleForInitializer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_VariableDeclarationWithValue_1 = null;

        EObject this_Affectation_2 = null;


         enterRule(); 
            
        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1301:28: ( ( (otherlv_0= 'var' this_VariableDeclarationWithValue_1= ruleVariableDeclarationWithValue ) | this_Affectation_2= ruleAffectation ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1302:1: ( (otherlv_0= 'var' this_VariableDeclarationWithValue_1= ruleVariableDeclarationWithValue ) | this_Affectation_2= ruleAffectation )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1302:1: ( (otherlv_0= 'var' this_VariableDeclarationWithValue_1= ruleVariableDeclarationWithValue ) | this_Affectation_2= ruleAffectation )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==30) ) {
                alt12=1;
            }
            else if ( (LA12_0==RULE_ID) ) {
                alt12=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1302:2: (otherlv_0= 'var' this_VariableDeclarationWithValue_1= ruleVariableDeclarationWithValue )
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1302:2: (otherlv_0= 'var' this_VariableDeclarationWithValue_1= ruleVariableDeclarationWithValue )
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1302:4: otherlv_0= 'var' this_VariableDeclarationWithValue_1= ruleVariableDeclarationWithValue
                    {
                    otherlv_0=(Token)match(input,30,FOLLOW_30_in_ruleForInitializer3130); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getForInitializerAccess().getVarKeyword_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getForInitializerAccess().getVariableDeclarationWithValueParserRuleCall_0_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleVariableDeclarationWithValue_in_ruleForInitializer3152);
                    this_VariableDeclarationWithValue_1=ruleVariableDeclarationWithValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_VariableDeclarationWithValue_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1317:5: this_Affectation_2= ruleAffectation
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getForInitializerAccess().getAffectationParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAffectation_in_ruleForInitializer3180);
                    this_Affectation_2=ruleAffectation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Affectation_2; 
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
    // $ANTLR end "ruleForInitializer"


    // $ANTLR start "entryRuleForAffectation"
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1333:1: entryRuleForAffectation returns [EObject current=null] : iv_ruleForAffectation= ruleForAffectation EOF ;
    public final EObject entryRuleForAffectation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForAffectation = null;


        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1334:2: (iv_ruleForAffectation= ruleForAffectation EOF )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1335:2: iv_ruleForAffectation= ruleForAffectation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getForAffectationRule()); 
            }
            pushFollow(FOLLOW_ruleForAffectation_in_entryRuleForAffectation3215);
            iv_ruleForAffectation=ruleForAffectation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleForAffectation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleForAffectation3225); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleForAffectation"


    // $ANTLR start "ruleForAffectation"
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1342:1: ruleForAffectation returns [EObject current=null] : ( ( ( ruleAffectation )=>this_Affectation_0= ruleAffectation ) | this_Expression_1= ruleExpression ) ;
    public final EObject ruleForAffectation() throws RecognitionException {
        EObject current = null;

        EObject this_Affectation_0 = null;

        EObject this_Expression_1 = null;


         enterRule(); 
            
        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1345:28: ( ( ( ( ruleAffectation )=>this_Affectation_0= ruleAffectation ) | this_Expression_1= ruleExpression ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1346:1: ( ( ( ruleAffectation )=>this_Affectation_0= ruleAffectation ) | this_Expression_1= ruleExpression )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1346:1: ( ( ( ruleAffectation )=>this_Affectation_0= ruleAffectation ) | this_Expression_1= ruleExpression )
            int alt13=2;
            alt13 = dfa13.predict(input);
            switch (alt13) {
                case 1 :
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1346:2: ( ( ruleAffectation )=>this_Affectation_0= ruleAffectation )
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1346:2: ( ( ruleAffectation )=>this_Affectation_0= ruleAffectation )
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1346:3: ( ruleAffectation )=>this_Affectation_0= ruleAffectation
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getForAffectationAccess().getAffectationParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAffectation_in_ruleForAffectation3278);
                    this_Affectation_0=ruleAffectation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Affectation_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1357:5: this_Expression_1= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getForAffectationAccess().getExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleForAffectation3306);
                    this_Expression_1=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Expression_1; 
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
    // $ANTLR end "ruleForAffectation"


    // $ANTLR start "entryRuleFunctionDeclaration"
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1373:1: entryRuleFunctionDeclaration returns [EObject current=null] : iv_ruleFunctionDeclaration= ruleFunctionDeclaration EOF ;
    public final EObject entryRuleFunctionDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionDeclaration = null;


        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1374:2: (iv_ruleFunctionDeclaration= ruleFunctionDeclaration EOF )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1375:2: iv_ruleFunctionDeclaration= ruleFunctionDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunctionDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleFunctionDeclaration_in_entryRuleFunctionDeclaration3341);
            iv_ruleFunctionDeclaration=ruleFunctionDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFunctionDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionDeclaration3351); if (state.failed) return current;

            }

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
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1382:1: ruleFunctionDeclaration returns [EObject current=null] : (otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleParameterDeclaration ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameterDeclaration ) ) )* )? otherlv_6= ')' ( (lv_body_7_0= ruleStatementBlock ) ) ) ;
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
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1385:28: ( (otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleParameterDeclaration ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameterDeclaration ) ) )* )? otherlv_6= ')' ( (lv_body_7_0= ruleStatementBlock ) ) ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1386:1: (otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleParameterDeclaration ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameterDeclaration ) ) )* )? otherlv_6= ')' ( (lv_body_7_0= ruleStatementBlock ) ) )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1386:1: (otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleParameterDeclaration ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameterDeclaration ) ) )* )? otherlv_6= ')' ( (lv_body_7_0= ruleStatementBlock ) ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1386:3: otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleParameterDeclaration ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameterDeclaration ) ) )* )? otherlv_6= ')' ( (lv_body_7_0= ruleStatementBlock ) )
            {
            otherlv_0=(Token)match(input,31,FOLLOW_31_in_ruleFunctionDeclaration3388); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getFunctionDeclarationAccess().getFunctionKeyword_0());
                  
            }
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1390:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1391:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1391:1: (lv_name_1_0= RULE_ID )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1392:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionDeclaration3405); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,23,FOLLOW_23_in_ruleFunctionDeclaration3422); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getFunctionDeclarationAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1412:1: ( ( (lv_parameters_3_0= ruleParameterDeclaration ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameterDeclaration ) ) )* )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_ID||LA15_0==33) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1412:2: ( (lv_parameters_3_0= ruleParameterDeclaration ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameterDeclaration ) ) )*
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1412:2: ( (lv_parameters_3_0= ruleParameterDeclaration ) )
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1413:1: (lv_parameters_3_0= ruleParameterDeclaration )
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1413:1: (lv_parameters_3_0= ruleParameterDeclaration )
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1414:3: lv_parameters_3_0= ruleParameterDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFunctionDeclarationAccess().getParametersParameterDeclarationParserRuleCall_3_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleParameterDeclaration_in_ruleFunctionDeclaration3444);
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

                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1430:2: (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameterDeclaration ) ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==32) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1430:4: otherlv_4= ',' ( (lv_parameters_5_0= ruleParameterDeclaration ) )
                    	    {
                    	    otherlv_4=(Token)match(input,32,FOLLOW_32_in_ruleFunctionDeclaration3457); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getFunctionDeclarationAccess().getCommaKeyword_3_1_0());
                    	          
                    	    }
                    	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1434:1: ( (lv_parameters_5_0= ruleParameterDeclaration ) )
                    	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1435:1: (lv_parameters_5_0= ruleParameterDeclaration )
                    	    {
                    	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1435:1: (lv_parameters_5_0= ruleParameterDeclaration )
                    	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1436:3: lv_parameters_5_0= ruleParameterDeclaration
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getFunctionDeclarationAccess().getParametersParameterDeclarationParserRuleCall_3_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleParameterDeclaration_in_ruleFunctionDeclaration3478);
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
                    	    break loop14;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,24,FOLLOW_24_in_ruleFunctionDeclaration3494); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getFunctionDeclarationAccess().getRightParenthesisKeyword_4());
                  
            }
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1456:1: ( (lv_body_7_0= ruleStatementBlock ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1457:1: (lv_body_7_0= ruleStatementBlock )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1457:1: (lv_body_7_0= ruleStatementBlock )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1458:3: lv_body_7_0= ruleStatementBlock
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFunctionDeclarationAccess().getBodyStatementBlockParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleStatementBlock_in_ruleFunctionDeclaration3515);
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
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1482:1: entryRuleParameterDeclaration returns [EObject current=null] : iv_ruleParameterDeclaration= ruleParameterDeclaration EOF ;
    public final EObject entryRuleParameterDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterDeclaration = null;


        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1483:2: (iv_ruleParameterDeclaration= ruleParameterDeclaration EOF )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1484:2: iv_ruleParameterDeclaration= ruleParameterDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleParameterDeclaration_in_entryRuleParameterDeclaration3551);
            iv_ruleParameterDeclaration=ruleParameterDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameterDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameterDeclaration3561); if (state.failed) return current;

            }

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
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1491:1: ruleParameterDeclaration returns [EObject current=null] : ( ( (lv_byAdress_0_0= '@' ) )? ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleParameterDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_byAdress_0_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1494:28: ( ( ( (lv_byAdress_0_0= '@' ) )? ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1495:1: ( ( (lv_byAdress_0_0= '@' ) )? ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1495:1: ( ( (lv_byAdress_0_0= '@' ) )? ( (lv_name_1_0= RULE_ID ) ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1495:2: ( (lv_byAdress_0_0= '@' ) )? ( (lv_name_1_0= RULE_ID ) )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1495:2: ( (lv_byAdress_0_0= '@' ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==33) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1496:1: (lv_byAdress_0_0= '@' )
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1496:1: (lv_byAdress_0_0= '@' )
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1497:3: lv_byAdress_0_0= '@'
                    {
                    lv_byAdress_0_0=(Token)match(input,33,FOLLOW_33_in_ruleParameterDeclaration3604); if (state.failed) return current;
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

            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1510:3: ( (lv_name_1_0= RULE_ID ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1511:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1511:1: (lv_name_1_0= RULE_ID )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1512:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParameterDeclaration3635); if (state.failed) return current;
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
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1536:1: entryRuleLocalDeclaration returns [EObject current=null] : iv_ruleLocalDeclaration= ruleLocalDeclaration EOF ;
    public final EObject entryRuleLocalDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocalDeclaration = null;


        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1537:2: (iv_ruleLocalDeclaration= ruleLocalDeclaration EOF )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1538:2: iv_ruleLocalDeclaration= ruleLocalDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLocalDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleLocalDeclaration_in_entryRuleLocalDeclaration3676);
            iv_ruleLocalDeclaration=ruleLocalDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLocalDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLocalDeclaration3686); if (state.failed) return current;

            }

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
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1545:1: ruleLocalDeclaration returns [EObject current=null] : (otherlv_0= 'var' ( (lv_variables_1_0= ruleVariableDeclaration ) ) (otherlv_2= ',' ( (lv_variables_3_0= ruleVariableDeclaration ) ) )* ) ;
    public final EObject ruleLocalDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_variables_1_0 = null;

        EObject lv_variables_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1548:28: ( (otherlv_0= 'var' ( (lv_variables_1_0= ruleVariableDeclaration ) ) (otherlv_2= ',' ( (lv_variables_3_0= ruleVariableDeclaration ) ) )* ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1549:1: (otherlv_0= 'var' ( (lv_variables_1_0= ruleVariableDeclaration ) ) (otherlv_2= ',' ( (lv_variables_3_0= ruleVariableDeclaration ) ) )* )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1549:1: (otherlv_0= 'var' ( (lv_variables_1_0= ruleVariableDeclaration ) ) (otherlv_2= ',' ( (lv_variables_3_0= ruleVariableDeclaration ) ) )* )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1549:3: otherlv_0= 'var' ( (lv_variables_1_0= ruleVariableDeclaration ) ) (otherlv_2= ',' ( (lv_variables_3_0= ruleVariableDeclaration ) ) )*
            {
            otherlv_0=(Token)match(input,30,FOLLOW_30_in_ruleLocalDeclaration3723); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getLocalDeclarationAccess().getVarKeyword_0());
                  
            }
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1553:1: ( (lv_variables_1_0= ruleVariableDeclaration ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1554:1: (lv_variables_1_0= ruleVariableDeclaration )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1554:1: (lv_variables_1_0= ruleVariableDeclaration )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1555:3: lv_variables_1_0= ruleVariableDeclaration
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLocalDeclarationAccess().getVariablesVariableDeclarationParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVariableDeclaration_in_ruleLocalDeclaration3744);
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

            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1571:2: (otherlv_2= ',' ( (lv_variables_3_0= ruleVariableDeclaration ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==32) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1571:4: otherlv_2= ',' ( (lv_variables_3_0= ruleVariableDeclaration ) )
            	    {
            	    otherlv_2=(Token)match(input,32,FOLLOW_32_in_ruleLocalDeclaration3757); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getLocalDeclarationAccess().getCommaKeyword_2_0());
            	          
            	    }
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1575:1: ( (lv_variables_3_0= ruleVariableDeclaration ) )
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1576:1: (lv_variables_3_0= ruleVariableDeclaration )
            	    {
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1576:1: (lv_variables_3_0= ruleVariableDeclaration )
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1577:3: lv_variables_3_0= ruleVariableDeclaration
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLocalDeclarationAccess().getVariablesVariableDeclarationParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleVariableDeclaration_in_ruleLocalDeclaration3778);
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
    // $ANTLR end "ruleLocalDeclaration"


    // $ANTLR start "entryRuleGlobalDeclaration"
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1601:1: entryRuleGlobalDeclaration returns [EObject current=null] : iv_ruleGlobalDeclaration= ruleGlobalDeclaration EOF ;
    public final EObject entryRuleGlobalDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGlobalDeclaration = null;


        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1602:2: (iv_ruleGlobalDeclaration= ruleGlobalDeclaration EOF )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1603:2: iv_ruleGlobalDeclaration= ruleGlobalDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGlobalDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleGlobalDeclaration_in_entryRuleGlobalDeclaration3816);
            iv_ruleGlobalDeclaration=ruleGlobalDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGlobalDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGlobalDeclaration3826); if (state.failed) return current;

            }

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
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1610:1: ruleGlobalDeclaration returns [EObject current=null] : (otherlv_0= 'global' ( (lv_variables_1_0= ruleVariableDeclaration ) ) (otherlv_2= ',' ( (lv_variables_3_0= ruleVariableDeclaration ) ) )* ) ;
    public final EObject ruleGlobalDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_variables_1_0 = null;

        EObject lv_variables_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1613:28: ( (otherlv_0= 'global' ( (lv_variables_1_0= ruleVariableDeclaration ) ) (otherlv_2= ',' ( (lv_variables_3_0= ruleVariableDeclaration ) ) )* ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1614:1: (otherlv_0= 'global' ( (lv_variables_1_0= ruleVariableDeclaration ) ) (otherlv_2= ',' ( (lv_variables_3_0= ruleVariableDeclaration ) ) )* )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1614:1: (otherlv_0= 'global' ( (lv_variables_1_0= ruleVariableDeclaration ) ) (otherlv_2= ',' ( (lv_variables_3_0= ruleVariableDeclaration ) ) )* )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1614:3: otherlv_0= 'global' ( (lv_variables_1_0= ruleVariableDeclaration ) ) (otherlv_2= ',' ( (lv_variables_3_0= ruleVariableDeclaration ) ) )*
            {
            otherlv_0=(Token)match(input,34,FOLLOW_34_in_ruleGlobalDeclaration3863); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getGlobalDeclarationAccess().getGlobalKeyword_0());
                  
            }
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1618:1: ( (lv_variables_1_0= ruleVariableDeclaration ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1619:1: (lv_variables_1_0= ruleVariableDeclaration )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1619:1: (lv_variables_1_0= ruleVariableDeclaration )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1620:3: lv_variables_1_0= ruleVariableDeclaration
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getGlobalDeclarationAccess().getVariablesVariableDeclarationParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVariableDeclaration_in_ruleGlobalDeclaration3884);
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

            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1636:2: (otherlv_2= ',' ( (lv_variables_3_0= ruleVariableDeclaration ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==32) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1636:4: otherlv_2= ',' ( (lv_variables_3_0= ruleVariableDeclaration ) )
            	    {
            	    otherlv_2=(Token)match(input,32,FOLLOW_32_in_ruleGlobalDeclaration3897); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getGlobalDeclarationAccess().getCommaKeyword_2_0());
            	          
            	    }
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1640:1: ( (lv_variables_3_0= ruleVariableDeclaration ) )
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1641:1: (lv_variables_3_0= ruleVariableDeclaration )
            	    {
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1641:1: (lv_variables_3_0= ruleVariableDeclaration )
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1642:3: lv_variables_3_0= ruleVariableDeclaration
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getGlobalDeclarationAccess().getVariablesVariableDeclarationParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleVariableDeclaration_in_ruleGlobalDeclaration3918);
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
            	    break loop18;
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
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1666:1: entryRuleVariableDeclaration returns [EObject current=null] : iv_ruleVariableDeclaration= ruleVariableDeclaration EOF ;
    public final EObject entryRuleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDeclaration = null;


        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1667:2: (iv_ruleVariableDeclaration= ruleVariableDeclaration EOF )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1668:2: iv_ruleVariableDeclaration= ruleVariableDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleVariableDeclaration_in_entryRuleVariableDeclaration3956);
            iv_ruleVariableDeclaration=ruleVariableDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariableDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableDeclaration3966); if (state.failed) return current;

            }

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
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1675:1: ruleVariableDeclaration returns [EObject current=null] : (this_VariableDeclarationWithValue_0= ruleVariableDeclarationWithValue | this_VariableDeclarationUnitialized_1= ruleVariableDeclarationUnitialized ) ;
    public final EObject ruleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_VariableDeclarationWithValue_0 = null;

        EObject this_VariableDeclarationUnitialized_1 = null;


         enterRule(); 
            
        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1678:28: ( (this_VariableDeclarationWithValue_0= ruleVariableDeclarationWithValue | this_VariableDeclarationUnitialized_1= ruleVariableDeclarationUnitialized ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1679:1: (this_VariableDeclarationWithValue_0= ruleVariableDeclarationWithValue | this_VariableDeclarationUnitialized_1= ruleVariableDeclarationUnitialized )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1679:1: (this_VariableDeclarationWithValue_0= ruleVariableDeclarationWithValue | this_VariableDeclarationUnitialized_1= ruleVariableDeclarationUnitialized )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_ID) ) {
                int LA19_1 = input.LA(2);

                if ( (LA19_1==17) ) {
                    alt19=1;
                }
                else if ( (LA19_1==EOF||LA19_1==12||LA19_1==32) ) {
                    alt19=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 19, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1680:5: this_VariableDeclarationWithValue_0= ruleVariableDeclarationWithValue
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getVariableDeclarationAccess().getVariableDeclarationWithValueParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleVariableDeclarationWithValue_in_ruleVariableDeclaration4013);
                    this_VariableDeclarationWithValue_0=ruleVariableDeclarationWithValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_VariableDeclarationWithValue_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1690:5: this_VariableDeclarationUnitialized_1= ruleVariableDeclarationUnitialized
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getVariableDeclarationAccess().getVariableDeclarationUnitializedParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleVariableDeclarationUnitialized_in_ruleVariableDeclaration4040);
                    this_VariableDeclarationUnitialized_1=ruleVariableDeclarationUnitialized();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_VariableDeclarationUnitialized_1; 
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
    // $ANTLR end "ruleVariableDeclaration"


    // $ANTLR start "entryRuleVariableDeclarationWithValue"
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1706:1: entryRuleVariableDeclarationWithValue returns [EObject current=null] : iv_ruleVariableDeclarationWithValue= ruleVariableDeclarationWithValue EOF ;
    public final EObject entryRuleVariableDeclarationWithValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDeclarationWithValue = null;


        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1707:2: (iv_ruleVariableDeclarationWithValue= ruleVariableDeclarationWithValue EOF )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1708:2: iv_ruleVariableDeclarationWithValue= ruleVariableDeclarationWithValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableDeclarationWithValueRule()); 
            }
            pushFollow(FOLLOW_ruleVariableDeclarationWithValue_in_entryRuleVariableDeclarationWithValue4075);
            iv_ruleVariableDeclarationWithValue=ruleVariableDeclarationWithValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariableDeclarationWithValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableDeclarationWithValue4085); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariableDeclarationWithValue"


    // $ANTLR start "ruleVariableDeclarationWithValue"
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1715:1: ruleVariableDeclarationWithValue returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) ) ) ;
    public final EObject ruleVariableDeclarationWithValue() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1718:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) ) ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1719:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) ) )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1719:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1719:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1719:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1720:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1720:1: (lv_name_0_0= RULE_ID )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1721:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariableDeclarationWithValue4127); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_0_0, grammarAccess.getVariableDeclarationWithValueAccess().getNameIDTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getVariableDeclarationWithValueRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleVariableDeclarationWithValue4144); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getVariableDeclarationWithValueAccess().getEqualsSignKeyword_1());
                  
            }
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1741:1: ( (lv_value_2_0= ruleExpression ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1742:1: (lv_value_2_0= ruleExpression )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1742:1: (lv_value_2_0= ruleExpression )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1743:3: lv_value_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getVariableDeclarationWithValueAccess().getValueExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleVariableDeclarationWithValue4165);
            lv_value_2_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getVariableDeclarationWithValueRule());
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
    // $ANTLR end "ruleVariableDeclarationWithValue"


    // $ANTLR start "entryRuleVariableDeclarationUnitialized"
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1767:1: entryRuleVariableDeclarationUnitialized returns [EObject current=null] : iv_ruleVariableDeclarationUnitialized= ruleVariableDeclarationUnitialized EOF ;
    public final EObject entryRuleVariableDeclarationUnitialized() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDeclarationUnitialized = null;


        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1768:2: (iv_ruleVariableDeclarationUnitialized= ruleVariableDeclarationUnitialized EOF )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1769:2: iv_ruleVariableDeclarationUnitialized= ruleVariableDeclarationUnitialized EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableDeclarationUnitializedRule()); 
            }
            pushFollow(FOLLOW_ruleVariableDeclarationUnitialized_in_entryRuleVariableDeclarationUnitialized4201);
            iv_ruleVariableDeclarationUnitialized=ruleVariableDeclarationUnitialized();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariableDeclarationUnitialized; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableDeclarationUnitialized4211); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariableDeclarationUnitialized"


    // $ANTLR start "ruleVariableDeclarationUnitialized"
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1776:1: ruleVariableDeclarationUnitialized returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleVariableDeclarationUnitialized() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1779:28: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1780:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1780:1: ( (lv_name_0_0= RULE_ID ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1781:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1781:1: (lv_name_0_0= RULE_ID )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1782:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariableDeclarationUnitialized4252); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_0_0, grammarAccess.getVariableDeclarationUnitializedAccess().getNameIDTerminalRuleCall_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getVariableDeclarationUnitializedRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"ID");
              	    
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
    // $ANTLR end "ruleVariableDeclarationUnitialized"


    // $ANTLR start "entryRuleExpression"
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1806:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1807:2: (iv_ruleExpression= ruleExpression EOF )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1808:2: iv_ruleExpression= ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression4292);
            iv_ruleExpression=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression4302); if (state.failed) return current;

            }

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
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1815:1: ruleExpression returns [EObject current=null] : this_Comparison_0= ruleComparison ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Comparison_0 = null;


         enterRule(); 
            
        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1818:28: (this_Comparison_0= ruleComparison )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1820:5: this_Comparison_0= ruleComparison
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExpressionAccess().getComparisonParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleComparison_in_ruleExpression4348);
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
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1836:1: entryRuleComparison returns [EObject current=null] : iv_ruleComparison= ruleComparison EOF ;
    public final EObject entryRuleComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparison = null;


        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1837:2: (iv_ruleComparison= ruleComparison EOF )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1838:2: iv_ruleComparison= ruleComparison EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getComparisonRule()); 
            }
            pushFollow(FOLLOW_ruleComparison_in_entryRuleComparison4382);
            iv_ruleComparison=ruleComparison();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleComparison; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleComparison4392); if (state.failed) return current;

            }

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
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1845:1: ruleComparison returns [EObject current=null] : (this_Or_0= ruleOr ( ( ( () otherlv_2= '===' ) | ( () otherlv_4= '==' ) | ( () otherlv_6= '!==' ) | ( () otherlv_8= '!=' ) | ( () otherlv_10= '<=' ) | ( () otherlv_12= '<' ) | ( () otherlv_14= '>=' ) | ( () otherlv_16= '>' ) ) ( (lv_right_17_0= ruleOr ) ) )* ) ;
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
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1848:28: ( (this_Or_0= ruleOr ( ( ( () otherlv_2= '===' ) | ( () otherlv_4= '==' ) | ( () otherlv_6= '!==' ) | ( () otherlv_8= '!=' ) | ( () otherlv_10= '<=' ) | ( () otherlv_12= '<' ) | ( () otherlv_14= '>=' ) | ( () otherlv_16= '>' ) ) ( (lv_right_17_0= ruleOr ) ) )* ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1849:1: (this_Or_0= ruleOr ( ( ( () otherlv_2= '===' ) | ( () otherlv_4= '==' ) | ( () otherlv_6= '!==' ) | ( () otherlv_8= '!=' ) | ( () otherlv_10= '<=' ) | ( () otherlv_12= '<' ) | ( () otherlv_14= '>=' ) | ( () otherlv_16= '>' ) ) ( (lv_right_17_0= ruleOr ) ) )* )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1849:1: (this_Or_0= ruleOr ( ( ( () otherlv_2= '===' ) | ( () otherlv_4= '==' ) | ( () otherlv_6= '!==' ) | ( () otherlv_8= '!=' ) | ( () otherlv_10= '<=' ) | ( () otherlv_12= '<' ) | ( () otherlv_14= '>=' ) | ( () otherlv_16= '>' ) ) ( (lv_right_17_0= ruleOr ) ) )* )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1850:5: this_Or_0= ruleOr ( ( ( () otherlv_2= '===' ) | ( () otherlv_4= '==' ) | ( () otherlv_6= '!==' ) | ( () otherlv_8= '!=' ) | ( () otherlv_10= '<=' ) | ( () otherlv_12= '<' ) | ( () otherlv_14= '>=' ) | ( () otherlv_16= '>' ) ) ( (lv_right_17_0= ruleOr ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getComparisonAccess().getOrParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleOr_in_ruleComparison4439);
            this_Or_0=ruleOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_Or_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1858:1: ( ( ( () otherlv_2= '===' ) | ( () otherlv_4= '==' ) | ( () otherlv_6= '!==' ) | ( () otherlv_8= '!=' ) | ( () otherlv_10= '<=' ) | ( () otherlv_12= '<' ) | ( () otherlv_14= '>=' ) | ( () otherlv_16= '>' ) ) ( (lv_right_17_0= ruleOr ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=35 && LA21_0<=42)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1858:2: ( ( () otherlv_2= '===' ) | ( () otherlv_4= '==' ) | ( () otherlv_6= '!==' ) | ( () otherlv_8= '!=' ) | ( () otherlv_10= '<=' ) | ( () otherlv_12= '<' ) | ( () otherlv_14= '>=' ) | ( () otherlv_16= '>' ) ) ( (lv_right_17_0= ruleOr ) )
            	    {
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1858:2: ( ( () otherlv_2= '===' ) | ( () otherlv_4= '==' ) | ( () otherlv_6= '!==' ) | ( () otherlv_8= '!=' ) | ( () otherlv_10= '<=' ) | ( () otherlv_12= '<' ) | ( () otherlv_14= '>=' ) | ( () otherlv_16= '>' ) )
            	    int alt20=8;
            	    switch ( input.LA(1) ) {
            	    case 35:
            	        {
            	        alt20=1;
            	        }
            	        break;
            	    case 36:
            	        {
            	        alt20=2;
            	        }
            	        break;
            	    case 37:
            	        {
            	        alt20=3;
            	        }
            	        break;
            	    case 38:
            	        {
            	        alt20=4;
            	        }
            	        break;
            	    case 39:
            	        {
            	        alt20=5;
            	        }
            	        break;
            	    case 40:
            	        {
            	        alt20=6;
            	        }
            	        break;
            	    case 41:
            	        {
            	        alt20=7;
            	        }
            	        break;
            	    case 42:
            	        {
            	        alt20=8;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 20, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt20) {
            	        case 1 :
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1858:3: ( () otherlv_2= '===' )
            	            {
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1858:3: ( () otherlv_2= '===' )
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1858:4: () otherlv_2= '==='
            	            {
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1858:4: ()
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1859:5: 
            	            {
            	            if ( state.backtracking==0 ) {

            	                      current = forceCreateModelElementAndSet(
            	                          grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0_0_0(),
            	                          current);
            	                  
            	            }

            	            }

            	            otherlv_2=(Token)match(input,35,FOLLOW_35_in_ruleComparison4462); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_2, grammarAccess.getComparisonAccess().getEqualsSignEqualsSignEqualsSignKeyword_1_0_0_1());
            	                  
            	            }

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1869:6: ( () otherlv_4= '==' )
            	            {
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1869:6: ( () otherlv_4= '==' )
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1869:7: () otherlv_4= '=='
            	            {
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1869:7: ()
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1870:5: 
            	            {
            	            if ( state.backtracking==0 ) {

            	                      current = forceCreateModelElementAndSet(
            	                          grammarAccess.getComparisonAccess().getEqualsLeftAction_1_0_1_0(),
            	                          current);
            	                  
            	            }

            	            }

            	            otherlv_4=(Token)match(input,36,FOLLOW_36_in_ruleComparison4491); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_4, grammarAccess.getComparisonAccess().getEqualsSignEqualsSignKeyword_1_0_1_1());
            	                  
            	            }

            	            }


            	            }
            	            break;
            	        case 3 :
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1880:6: ( () otherlv_6= '!==' )
            	            {
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1880:6: ( () otherlv_6= '!==' )
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1880:7: () otherlv_6= '!=='
            	            {
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1880:7: ()
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1881:5: 
            	            {
            	            if ( state.backtracking==0 ) {

            	                      current = forceCreateModelElementAndSet(
            	                          grammarAccess.getComparisonAccess().getTypedDifferentLeftAction_1_0_2_0(),
            	                          current);
            	                  
            	            }

            	            }

            	            otherlv_6=(Token)match(input,37,FOLLOW_37_in_ruleComparison4520); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_6, grammarAccess.getComparisonAccess().getExclamationMarkEqualsSignEqualsSignKeyword_1_0_2_1());
            	                  
            	            }

            	            }


            	            }
            	            break;
            	        case 4 :
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1891:6: ( () otherlv_8= '!=' )
            	            {
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1891:6: ( () otherlv_8= '!=' )
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1891:7: () otherlv_8= '!='
            	            {
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1891:7: ()
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1892:5: 
            	            {
            	            if ( state.backtracking==0 ) {

            	                      current = forceCreateModelElementAndSet(
            	                          grammarAccess.getComparisonAccess().getDifferentLeftAction_1_0_3_0(),
            	                          current);
            	                  
            	            }

            	            }

            	            otherlv_8=(Token)match(input,38,FOLLOW_38_in_ruleComparison4549); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_8, grammarAccess.getComparisonAccess().getExclamationMarkEqualsSignKeyword_1_0_3_1());
            	                  
            	            }

            	            }


            	            }
            	            break;
            	        case 5 :
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1902:6: ( () otherlv_10= '<=' )
            	            {
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1902:6: ( () otherlv_10= '<=' )
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1902:7: () otherlv_10= '<='
            	            {
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1902:7: ()
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1903:5: 
            	            {
            	            if ( state.backtracking==0 ) {

            	                      current = forceCreateModelElementAndSet(
            	                          grammarAccess.getComparisonAccess().getLessOrEqualsLeftAction_1_0_4_0(),
            	                          current);
            	                  
            	            }

            	            }

            	            otherlv_10=(Token)match(input,39,FOLLOW_39_in_ruleComparison4578); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_10, grammarAccess.getComparisonAccess().getLessThanSignEqualsSignKeyword_1_0_4_1());
            	                  
            	            }

            	            }


            	            }
            	            break;
            	        case 6 :
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1913:6: ( () otherlv_12= '<' )
            	            {
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1913:6: ( () otherlv_12= '<' )
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1913:7: () otherlv_12= '<'
            	            {
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1913:7: ()
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1914:5: 
            	            {
            	            if ( state.backtracking==0 ) {

            	                      current = forceCreateModelElementAndSet(
            	                          grammarAccess.getComparisonAccess().getLessLeftAction_1_0_5_0(),
            	                          current);
            	                  
            	            }

            	            }

            	            otherlv_12=(Token)match(input,40,FOLLOW_40_in_ruleComparison4607); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_12, grammarAccess.getComparisonAccess().getLessThanSignKeyword_1_0_5_1());
            	                  
            	            }

            	            }


            	            }
            	            break;
            	        case 7 :
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1924:6: ( () otherlv_14= '>=' )
            	            {
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1924:6: ( () otherlv_14= '>=' )
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1924:7: () otherlv_14= '>='
            	            {
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1924:7: ()
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1925:5: 
            	            {
            	            if ( state.backtracking==0 ) {

            	                      current = forceCreateModelElementAndSet(
            	                          grammarAccess.getComparisonAccess().getMoreOrEqualsLeftAction_1_0_6_0(),
            	                          current);
            	                  
            	            }

            	            }

            	            otherlv_14=(Token)match(input,41,FOLLOW_41_in_ruleComparison4636); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_14, grammarAccess.getComparisonAccess().getGreaterThanSignEqualsSignKeyword_1_0_6_1());
            	                  
            	            }

            	            }


            	            }
            	            break;
            	        case 8 :
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1935:6: ( () otherlv_16= '>' )
            	            {
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1935:6: ( () otherlv_16= '>' )
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1935:7: () otherlv_16= '>'
            	            {
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1935:7: ()
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1936:5: 
            	            {
            	            if ( state.backtracking==0 ) {

            	                      current = forceCreateModelElementAndSet(
            	                          grammarAccess.getComparisonAccess().getMoreLeftAction_1_0_7_0(),
            	                          current);
            	                  
            	            }

            	            }

            	            otherlv_16=(Token)match(input,42,FOLLOW_42_in_ruleComparison4665); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_16, grammarAccess.getComparisonAccess().getGreaterThanSignKeyword_1_0_7_1());
            	                  
            	            }

            	            }


            	            }
            	            break;

            	    }

            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1945:3: ( (lv_right_17_0= ruleOr ) )
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1946:1: (lv_right_17_0= ruleOr )
            	    {
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1946:1: (lv_right_17_0= ruleOr )
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1947:3: lv_right_17_0= ruleOr
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getComparisonAccess().getRightOrParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOr_in_ruleComparison4688);
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
    // $ANTLR end "ruleComparison"


    // $ANTLR start "entryRuleOr"
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1971:1: entryRuleOr returns [EObject current=null] : iv_ruleOr= ruleOr EOF ;
    public final EObject entryRuleOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOr = null;


        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1972:2: (iv_ruleOr= ruleOr EOF )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1973:2: iv_ruleOr= ruleOr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOrRule()); 
            }
            pushFollow(FOLLOW_ruleOr_in_entryRuleOr4726);
            iv_ruleOr=ruleOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOr; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOr4736); if (state.failed) return current;

            }

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
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1980:1: ruleOr returns [EObject current=null] : (this_And_0= ruleAnd ( ( () (otherlv_2= 'or' | otherlv_3= '||' ) ) ( (lv_right_4_0= ruleAnd ) ) )* ) ;
    public final EObject ruleOr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject this_And_0 = null;

        EObject lv_right_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1983:28: ( (this_And_0= ruleAnd ( ( () (otherlv_2= 'or' | otherlv_3= '||' ) ) ( (lv_right_4_0= ruleAnd ) ) )* ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1984:1: (this_And_0= ruleAnd ( ( () (otherlv_2= 'or' | otherlv_3= '||' ) ) ( (lv_right_4_0= ruleAnd ) ) )* )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1984:1: (this_And_0= ruleAnd ( ( () (otherlv_2= 'or' | otherlv_3= '||' ) ) ( (lv_right_4_0= ruleAnd ) ) )* )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1985:5: this_And_0= ruleAnd ( ( () (otherlv_2= 'or' | otherlv_3= '||' ) ) ( (lv_right_4_0= ruleAnd ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getOrAccess().getAndParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleAnd_in_ruleOr4783);
            this_And_0=ruleAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_And_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1993:1: ( ( () (otherlv_2= 'or' | otherlv_3= '||' ) ) ( (lv_right_4_0= ruleAnd ) ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>=43 && LA23_0<=44)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1993:2: ( () (otherlv_2= 'or' | otherlv_3= '||' ) ) ( (lv_right_4_0= ruleAnd ) )
            	    {
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1993:2: ( () (otherlv_2= 'or' | otherlv_3= '||' ) )
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1993:3: () (otherlv_2= 'or' | otherlv_3= '||' )
            	    {
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1993:3: ()
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1994:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getOrAccess().getOrLeftAction_1_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1999:2: (otherlv_2= 'or' | otherlv_3= '||' )
            	    int alt22=2;
            	    int LA22_0 = input.LA(1);

            	    if ( (LA22_0==43) ) {
            	        alt22=1;
            	    }
            	    else if ( (LA22_0==44) ) {
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
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1999:4: otherlv_2= 'or'
            	            {
            	            otherlv_2=(Token)match(input,43,FOLLOW_43_in_ruleOr4806); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_2, grammarAccess.getOrAccess().getOrKeyword_1_0_1_0());
            	                  
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2004:7: otherlv_3= '||'
            	            {
            	            otherlv_3=(Token)match(input,44,FOLLOW_44_in_ruleOr4824); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_3, grammarAccess.getOrAccess().getVerticalLineVerticalLineKeyword_1_0_1_1());
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }

            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2008:3: ( (lv_right_4_0= ruleAnd ) )
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2009:1: (lv_right_4_0= ruleAnd )
            	    {
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2009:1: (lv_right_4_0= ruleAnd )
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2010:3: lv_right_4_0= ruleAnd
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getOrAccess().getRightAndParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAnd_in_ruleOr4847);
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
    // $ANTLR end "ruleOr"


    // $ANTLR start "entryRuleAnd"
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2034:1: entryRuleAnd returns [EObject current=null] : iv_ruleAnd= ruleAnd EOF ;
    public final EObject entryRuleAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnd = null;


        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2035:2: (iv_ruleAnd= ruleAnd EOF )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2036:2: iv_ruleAnd= ruleAnd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAndRule()); 
            }
            pushFollow(FOLLOW_ruleAnd_in_entryRuleAnd4885);
            iv_ruleAnd=ruleAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAnd; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnd4895); if (state.failed) return current;

            }

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
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2043:1: ruleAnd returns [EObject current=null] : (this_Addition_0= ruleAddition ( ( () (otherlv_2= 'and' | otherlv_3= '&&' ) ) ( (lv_right_4_0= ruleAddition ) ) )* ) ;
    public final EObject ruleAnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject this_Addition_0 = null;

        EObject lv_right_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2046:28: ( (this_Addition_0= ruleAddition ( ( () (otherlv_2= 'and' | otherlv_3= '&&' ) ) ( (lv_right_4_0= ruleAddition ) ) )* ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2047:1: (this_Addition_0= ruleAddition ( ( () (otherlv_2= 'and' | otherlv_3= '&&' ) ) ( (lv_right_4_0= ruleAddition ) ) )* )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2047:1: (this_Addition_0= ruleAddition ( ( () (otherlv_2= 'and' | otherlv_3= '&&' ) ) ( (lv_right_4_0= ruleAddition ) ) )* )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2048:5: this_Addition_0= ruleAddition ( ( () (otherlv_2= 'and' | otherlv_3= '&&' ) ) ( (lv_right_4_0= ruleAddition ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getAndAccess().getAdditionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleAddition_in_ruleAnd4942);
            this_Addition_0=ruleAddition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_Addition_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2056:1: ( ( () (otherlv_2= 'and' | otherlv_3= '&&' ) ) ( (lv_right_4_0= ruleAddition ) ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>=45 && LA25_0<=46)) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2056:2: ( () (otherlv_2= 'and' | otherlv_3= '&&' ) ) ( (lv_right_4_0= ruleAddition ) )
            	    {
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2056:2: ( () (otherlv_2= 'and' | otherlv_3= '&&' ) )
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2056:3: () (otherlv_2= 'and' | otherlv_3= '&&' )
            	    {
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2056:3: ()
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2057:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getAndAccess().getAndLeftAction_1_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2062:2: (otherlv_2= 'and' | otherlv_3= '&&' )
            	    int alt24=2;
            	    int LA24_0 = input.LA(1);

            	    if ( (LA24_0==45) ) {
            	        alt24=1;
            	    }
            	    else if ( (LA24_0==46) ) {
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
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2062:4: otherlv_2= 'and'
            	            {
            	            otherlv_2=(Token)match(input,45,FOLLOW_45_in_ruleAnd4965); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_2, grammarAccess.getAndAccess().getAndKeyword_1_0_1_0());
            	                  
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2067:7: otherlv_3= '&&'
            	            {
            	            otherlv_3=(Token)match(input,46,FOLLOW_46_in_ruleAnd4983); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_3, grammarAccess.getAndAccess().getAmpersandAmpersandKeyword_1_0_1_1());
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }

            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2071:3: ( (lv_right_4_0= ruleAddition ) )
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2072:1: (lv_right_4_0= ruleAddition )
            	    {
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2072:1: (lv_right_4_0= ruleAddition )
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2073:3: lv_right_4_0= ruleAddition
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAndAccess().getRightAdditionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAddition_in_ruleAnd5006);
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
    // $ANTLR end "ruleAnd"


    // $ANTLR start "entryRuleAddition"
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2097:1: entryRuleAddition returns [EObject current=null] : iv_ruleAddition= ruleAddition EOF ;
    public final EObject entryRuleAddition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddition = null;


        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2098:2: (iv_ruleAddition= ruleAddition EOF )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2099:2: iv_ruleAddition= ruleAddition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAdditionRule()); 
            }
            pushFollow(FOLLOW_ruleAddition_in_entryRuleAddition5044);
            iv_ruleAddition=ruleAddition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAddition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAddition5054); if (state.failed) return current;

            }

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
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2106:1: ruleAddition returns [EObject current=null] : (this_Multiplication_0= ruleMultiplication ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )* ) ;
    public final EObject ruleAddition() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_Multiplication_0 = null;

        EObject lv_right_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2109:28: ( (this_Multiplication_0= ruleMultiplication ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )* ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2110:1: (this_Multiplication_0= ruleMultiplication ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )* )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2110:1: (this_Multiplication_0= ruleMultiplication ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )* )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2111:5: this_Multiplication_0= ruleMultiplication ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getAdditionAccess().getMultiplicationParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleMultiplication_in_ruleAddition5101);
            this_Multiplication_0=ruleMultiplication();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_Multiplication_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2119:1: ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>=47 && LA27_0<=48)) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2119:2: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplication ) )
            	    {
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2119:2: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) )
            	    int alt26=2;
            	    int LA26_0 = input.LA(1);

            	    if ( (LA26_0==47) ) {
            	        alt26=1;
            	    }
            	    else if ( (LA26_0==48) ) {
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
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2119:3: ( () otherlv_2= '+' )
            	            {
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2119:3: ( () otherlv_2= '+' )
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2119:4: () otherlv_2= '+'
            	            {
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2119:4: ()
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2120:5: 
            	            {
            	            if ( state.backtracking==0 ) {

            	                      current = forceCreateModelElementAndSet(
            	                          grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0(),
            	                          current);
            	                  
            	            }

            	            }

            	            otherlv_2=(Token)match(input,47,FOLLOW_47_in_ruleAddition5124); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_2, grammarAccess.getAdditionAccess().getPlusSignKeyword_1_0_0_1());
            	                  
            	            }

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2130:6: ( () otherlv_4= '-' )
            	            {
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2130:6: ( () otherlv_4= '-' )
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2130:7: () otherlv_4= '-'
            	            {
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2130:7: ()
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2131:5: 
            	            {
            	            if ( state.backtracking==0 ) {

            	                      current = forceCreateModelElementAndSet(
            	                          grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0(),
            	                          current);
            	                  
            	            }

            	            }

            	            otherlv_4=(Token)match(input,48,FOLLOW_48_in_ruleAddition5153); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_4, grammarAccess.getAdditionAccess().getHyphenMinusKeyword_1_0_1_1());
            	                  
            	            }

            	            }


            	            }
            	            break;

            	    }

            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2140:3: ( (lv_right_5_0= ruleMultiplication ) )
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2141:1: (lv_right_5_0= ruleMultiplication )
            	    {
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2141:1: (lv_right_5_0= ruleMultiplication )
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2142:3: lv_right_5_0= ruleMultiplication
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAdditionAccess().getRightMultiplicationParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleMultiplication_in_ruleAddition5176);
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
    // $ANTLR end "ruleAddition"


    // $ANTLR start "entryRuleMultiplication"
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2166:1: entryRuleMultiplication returns [EObject current=null] : iv_ruleMultiplication= ruleMultiplication EOF ;
    public final EObject entryRuleMultiplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplication = null;


        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2167:2: (iv_ruleMultiplication= ruleMultiplication EOF )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2168:2: iv_ruleMultiplication= ruleMultiplication EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultiplicationRule()); 
            }
            pushFollow(FOLLOW_ruleMultiplication_in_entryRuleMultiplication5214);
            iv_ruleMultiplication=ruleMultiplication();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMultiplication; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiplication5224); if (state.failed) return current;

            }

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
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2175:1: ruleMultiplication returns [EObject current=null] : (this_TernaryIf_0= ruleTernaryIf ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= ruleTernaryIf ) ) )* ) ;
    public final EObject ruleMultiplication() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_TernaryIf_0 = null;

        EObject lv_right_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2178:28: ( (this_TernaryIf_0= ruleTernaryIf ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= ruleTernaryIf ) ) )* ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2179:1: (this_TernaryIf_0= ruleTernaryIf ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= ruleTernaryIf ) ) )* )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2179:1: (this_TernaryIf_0= ruleTernaryIf ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= ruleTernaryIf ) ) )* )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2180:5: this_TernaryIf_0= ruleTernaryIf ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= ruleTernaryIf ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getMultiplicationAccess().getTernaryIfParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleTernaryIf_in_ruleMultiplication5271);
            this_TernaryIf_0=ruleTernaryIf();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_TernaryIf_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2188:1: ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= ruleTernaryIf ) ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( ((LA29_0>=49 && LA29_0<=50)) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2188:2: ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= ruleTernaryIf ) )
            	    {
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2188:2: ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) )
            	    int alt28=2;
            	    int LA28_0 = input.LA(1);

            	    if ( (LA28_0==49) ) {
            	        alt28=1;
            	    }
            	    else if ( (LA28_0==50) ) {
            	        alt28=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 28, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt28) {
            	        case 1 :
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2188:3: ( () otherlv_2= '*' )
            	            {
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2188:3: ( () otherlv_2= '*' )
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2188:4: () otherlv_2= '*'
            	            {
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2188:4: ()
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2189:5: 
            	            {
            	            if ( state.backtracking==0 ) {

            	                      current = forceCreateModelElementAndSet(
            	                          grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0_0_0(),
            	                          current);
            	                  
            	            }

            	            }

            	            otherlv_2=(Token)match(input,49,FOLLOW_49_in_ruleMultiplication5294); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_2, grammarAccess.getMultiplicationAccess().getAsteriskKeyword_1_0_0_1());
            	                  
            	            }

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2199:6: ( () otherlv_4= '/' )
            	            {
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2199:6: ( () otherlv_4= '/' )
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2199:7: () otherlv_4= '/'
            	            {
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2199:7: ()
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2200:5: 
            	            {
            	            if ( state.backtracking==0 ) {

            	                      current = forceCreateModelElementAndSet(
            	                          grammarAccess.getMultiplicationAccess().getDivLeftAction_1_0_1_0(),
            	                          current);
            	                  
            	            }

            	            }

            	            otherlv_4=(Token)match(input,50,FOLLOW_50_in_ruleMultiplication5323); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_4, grammarAccess.getMultiplicationAccess().getSolidusKeyword_1_0_1_1());
            	                  
            	            }

            	            }


            	            }
            	            break;

            	    }

            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2209:3: ( (lv_right_5_0= ruleTernaryIf ) )
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2210:1: (lv_right_5_0= ruleTernaryIf )
            	    {
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2210:1: (lv_right_5_0= ruleTernaryIf )
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2211:3: lv_right_5_0= ruleTernaryIf
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMultiplicationAccess().getRightTernaryIfParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleTernaryIf_in_ruleMultiplication5346);
            	    lv_right_5_0=ruleTernaryIf();

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
            	              		"TernaryIf");
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
    // $ANTLR end "ruleMultiplication"


    // $ANTLR start "entryRuleTernaryIf"
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2235:1: entryRuleTernaryIf returns [EObject current=null] : iv_ruleTernaryIf= ruleTernaryIf EOF ;
    public final EObject entryRuleTernaryIf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTernaryIf = null;


        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2236:2: (iv_ruleTernaryIf= ruleTernaryIf EOF )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2237:2: iv_ruleTernaryIf= ruleTernaryIf EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTernaryIfRule()); 
            }
            pushFollow(FOLLOW_ruleTernaryIf_in_entryRuleTernaryIf5384);
            iv_ruleTernaryIf=ruleTernaryIf();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTernaryIf; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTernaryIf5394); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTernaryIf"


    // $ANTLR start "ruleTernaryIf"
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2244:1: ruleTernaryIf returns [EObject current=null] : (this_PrimaryExpression_0= rulePrimaryExpression ( () otherlv_2= '?' ( (lv_then_3_0= rulePrimaryExpression ) ) otherlv_4= ':' ( (lv_else_5_0= rulePrimaryExpression ) ) )* ) ;
    public final EObject ruleTernaryIf() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_PrimaryExpression_0 = null;

        EObject lv_then_3_0 = null;

        EObject lv_else_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2247:28: ( (this_PrimaryExpression_0= rulePrimaryExpression ( () otherlv_2= '?' ( (lv_then_3_0= rulePrimaryExpression ) ) otherlv_4= ':' ( (lv_else_5_0= rulePrimaryExpression ) ) )* ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2248:1: (this_PrimaryExpression_0= rulePrimaryExpression ( () otherlv_2= '?' ( (lv_then_3_0= rulePrimaryExpression ) ) otherlv_4= ':' ( (lv_else_5_0= rulePrimaryExpression ) ) )* )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2248:1: (this_PrimaryExpression_0= rulePrimaryExpression ( () otherlv_2= '?' ( (lv_then_3_0= rulePrimaryExpression ) ) otherlv_4= ':' ( (lv_else_5_0= rulePrimaryExpression ) ) )* )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2249:5: this_PrimaryExpression_0= rulePrimaryExpression ( () otherlv_2= '?' ( (lv_then_3_0= rulePrimaryExpression ) ) otherlv_4= ':' ( (lv_else_5_0= rulePrimaryExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getTernaryIfAccess().getPrimaryExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_rulePrimaryExpression_in_ruleTernaryIf5441);
            this_PrimaryExpression_0=rulePrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_PrimaryExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2257:1: ( () otherlv_2= '?' ( (lv_then_3_0= rulePrimaryExpression ) ) otherlv_4= ':' ( (lv_else_5_0= rulePrimaryExpression ) ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==51) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2257:2: () otherlv_2= '?' ( (lv_then_3_0= rulePrimaryExpression ) ) otherlv_4= ':' ( (lv_else_5_0= rulePrimaryExpression ) )
            	    {
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2257:2: ()
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2258:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getTernaryIfAccess().getTernaryIfLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,51,FOLLOW_51_in_ruleTernaryIf5462); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getTernaryIfAccess().getQuestionMarkKeyword_1_1());
            	          
            	    }
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2267:1: ( (lv_then_3_0= rulePrimaryExpression ) )
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2268:1: (lv_then_3_0= rulePrimaryExpression )
            	    {
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2268:1: (lv_then_3_0= rulePrimaryExpression )
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2269:3: lv_then_3_0= rulePrimaryExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getTernaryIfAccess().getThenPrimaryExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulePrimaryExpression_in_ruleTernaryIf5483);
            	    lv_then_3_0=rulePrimaryExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getTernaryIfRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"then",
            	              		lv_then_3_0, 
            	              		"PrimaryExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    otherlv_4=(Token)match(input,28,FOLLOW_28_in_ruleTernaryIf5495); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_4, grammarAccess.getTernaryIfAccess().getColonKeyword_1_3());
            	          
            	    }
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2289:1: ( (lv_else_5_0= rulePrimaryExpression ) )
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2290:1: (lv_else_5_0= rulePrimaryExpression )
            	    {
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2290:1: (lv_else_5_0= rulePrimaryExpression )
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2291:3: lv_else_5_0= rulePrimaryExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getTernaryIfAccess().getElsePrimaryExpressionParserRuleCall_1_4_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulePrimaryExpression_in_ruleTernaryIf5516);
            	    lv_else_5_0=rulePrimaryExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getTernaryIfRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"else",
            	              		lv_else_5_0, 
            	              		"PrimaryExpression");
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
    // $ANTLR end "ruleTernaryIf"


    // $ANTLR start "entryRulePrimaryExpression"
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2315:1: entryRulePrimaryExpression returns [EObject current=null] : iv_rulePrimaryExpression= rulePrimaryExpression EOF ;
    public final EObject entryRulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpression = null;


        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2316:2: (iv_rulePrimaryExpression= rulePrimaryExpression EOF )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2317:2: iv_rulePrimaryExpression= rulePrimaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimaryExpressionRule()); 
            }
            pushFollow(FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression5554);
            iv_rulePrimaryExpression=rulePrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimaryExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimaryExpression5564); if (state.failed) return current;

            }

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
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2324:1: rulePrimaryExpression returns [EObject current=null] : ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () otherlv_4= '-' ( (lv_expression_5_0= rulePrimaryExpression ) ) ) | ( () otherlv_7= '!' ( (lv_expression_8_0= rulePrimaryExpression ) ) ) | ( () ( (lv_value_10_0= RULE_REAL ) ) ) | ( () ( (lv_value_12_0= RULE_INT ) ) ) | this_FunctionCall_13= ruleFunctionCall | this_Prefix_14= rulePrefix | this_Postfix_15= rulePostfix | ( () ( (lv_value_17_0= RULE_STRING ) ) ) | this_ArrayLiteral_18= ruleArrayLiteral | this_FunctionDeclaration_19= ruleFunctionDeclaration | ( () otherlv_21= 'null' ) | ( () otherlv_23= 'false' ) | ( () otherlv_25= 'true' ) ) ;
    public final EObject rulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        Token lv_value_10_0=null;
        Token lv_value_12_0=null;
        Token lv_value_17_0=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        EObject this_Expression_1 = null;

        EObject lv_expression_5_0 = null;

        EObject lv_expression_8_0 = null;

        EObject this_FunctionCall_13 = null;

        EObject this_Prefix_14 = null;

        EObject this_Postfix_15 = null;

        EObject this_ArrayLiteral_18 = null;

        EObject this_FunctionDeclaration_19 = null;


         enterRule(); 
            
        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2327:28: ( ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () otherlv_4= '-' ( (lv_expression_5_0= rulePrimaryExpression ) ) ) | ( () otherlv_7= '!' ( (lv_expression_8_0= rulePrimaryExpression ) ) ) | ( () ( (lv_value_10_0= RULE_REAL ) ) ) | ( () ( (lv_value_12_0= RULE_INT ) ) ) | this_FunctionCall_13= ruleFunctionCall | this_Prefix_14= rulePrefix | this_Postfix_15= rulePostfix | ( () ( (lv_value_17_0= RULE_STRING ) ) ) | this_ArrayLiteral_18= ruleArrayLiteral | this_FunctionDeclaration_19= ruleFunctionDeclaration | ( () otherlv_21= 'null' ) | ( () otherlv_23= 'false' ) | ( () otherlv_25= 'true' ) ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2328:1: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () otherlv_4= '-' ( (lv_expression_5_0= rulePrimaryExpression ) ) ) | ( () otherlv_7= '!' ( (lv_expression_8_0= rulePrimaryExpression ) ) ) | ( () ( (lv_value_10_0= RULE_REAL ) ) ) | ( () ( (lv_value_12_0= RULE_INT ) ) ) | this_FunctionCall_13= ruleFunctionCall | this_Prefix_14= rulePrefix | this_Postfix_15= rulePostfix | ( () ( (lv_value_17_0= RULE_STRING ) ) ) | this_ArrayLiteral_18= ruleArrayLiteral | this_FunctionDeclaration_19= ruleFunctionDeclaration | ( () otherlv_21= 'null' ) | ( () otherlv_23= 'false' ) | ( () otherlv_25= 'true' ) )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2328:1: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () otherlv_4= '-' ( (lv_expression_5_0= rulePrimaryExpression ) ) ) | ( () otherlv_7= '!' ( (lv_expression_8_0= rulePrimaryExpression ) ) ) | ( () ( (lv_value_10_0= RULE_REAL ) ) ) | ( () ( (lv_value_12_0= RULE_INT ) ) ) | this_FunctionCall_13= ruleFunctionCall | this_Prefix_14= rulePrefix | this_Postfix_15= rulePostfix | ( () ( (lv_value_17_0= RULE_STRING ) ) ) | this_ArrayLiteral_18= ruleArrayLiteral | this_FunctionDeclaration_19= ruleFunctionDeclaration | ( () otherlv_21= 'null' ) | ( () otherlv_23= 'false' ) | ( () otherlv_25= 'true' ) )
            int alt31=14;
            alt31 = dfa31.predict(input);
            switch (alt31) {
                case 1 :
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2328:2: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2328:2: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2328:4: otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,23,FOLLOW_23_in_rulePrimaryExpression5602); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getExpressionParserRuleCall_0_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExpression_in_rulePrimaryExpression5624);
                    this_Expression_1=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Expression_1; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_2=(Token)match(input,24,FOLLOW_24_in_rulePrimaryExpression5635); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_0_2());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2346:6: ( () otherlv_4= '-' ( (lv_expression_5_0= rulePrimaryExpression ) ) )
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2346:6: ( () otherlv_4= '-' ( (lv_expression_5_0= rulePrimaryExpression ) ) )
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2346:7: () otherlv_4= '-' ( (lv_expression_5_0= rulePrimaryExpression ) )
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2346:7: ()
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2347:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getPrimaryExpressionAccess().getUnitaryMinusAction_1_0(),
                                  current);
                          
                    }

                    }

                    otherlv_4=(Token)match(input,48,FOLLOW_48_in_rulePrimaryExpression5664); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getPrimaryExpressionAccess().getHyphenMinusKeyword_1_1());
                          
                    }
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2356:1: ( (lv_expression_5_0= rulePrimaryExpression ) )
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2357:1: (lv_expression_5_0= rulePrimaryExpression )
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2357:1: (lv_expression_5_0= rulePrimaryExpression )
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2358:3: lv_expression_5_0= rulePrimaryExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getExpressionPrimaryExpressionParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulePrimaryExpression_in_rulePrimaryExpression5685);
                    lv_expression_5_0=rulePrimaryExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPrimaryExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"expression",
                              		lv_expression_5_0, 
                              		"PrimaryExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2375:6: ( () otherlv_7= '!' ( (lv_expression_8_0= rulePrimaryExpression ) ) )
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2375:6: ( () otherlv_7= '!' ( (lv_expression_8_0= rulePrimaryExpression ) ) )
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2375:7: () otherlv_7= '!' ( (lv_expression_8_0= rulePrimaryExpression ) )
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2375:7: ()
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2376:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getPrimaryExpressionAccess().getNotAction_2_0(),
                                  current);
                          
                    }

                    }

                    otherlv_7=(Token)match(input,52,FOLLOW_52_in_rulePrimaryExpression5714); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getPrimaryExpressionAccess().getExclamationMarkKeyword_2_1());
                          
                    }
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2385:1: ( (lv_expression_8_0= rulePrimaryExpression ) )
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2386:1: (lv_expression_8_0= rulePrimaryExpression )
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2386:1: (lv_expression_8_0= rulePrimaryExpression )
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2387:3: lv_expression_8_0= rulePrimaryExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getExpressionPrimaryExpressionParserRuleCall_2_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulePrimaryExpression_in_rulePrimaryExpression5735);
                    lv_expression_8_0=rulePrimaryExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPrimaryExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"expression",
                              		lv_expression_8_0, 
                              		"PrimaryExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2404:6: ( () ( (lv_value_10_0= RULE_REAL ) ) )
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2404:6: ( () ( (lv_value_10_0= RULE_REAL ) ) )
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2404:7: () ( (lv_value_10_0= RULE_REAL ) )
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2404:7: ()
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2405:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getPrimaryExpressionAccess().getRealLiteralAction_3_0(),
                                  current);
                          
                    }

                    }

                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2410:2: ( (lv_value_10_0= RULE_REAL ) )
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2411:1: (lv_value_10_0= RULE_REAL )
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2411:1: (lv_value_10_0= RULE_REAL )
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2412:3: lv_value_10_0= RULE_REAL
                    {
                    lv_value_10_0=(Token)match(input,RULE_REAL,FOLLOW_RULE_REAL_in_rulePrimaryExpression5769); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_value_10_0, grammarAccess.getPrimaryExpressionAccess().getValueREALTerminalRuleCall_3_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getPrimaryExpressionRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"value",
                              		lv_value_10_0, 
                              		"REAL");
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2429:6: ( () ( (lv_value_12_0= RULE_INT ) ) )
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2429:6: ( () ( (lv_value_12_0= RULE_INT ) ) )
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2429:7: () ( (lv_value_12_0= RULE_INT ) )
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2429:7: ()
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2430:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getPrimaryExpressionAccess().getIntLiteralAction_4_0(),
                                  current);
                          
                    }

                    }

                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2435:2: ( (lv_value_12_0= RULE_INT ) )
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2436:1: (lv_value_12_0= RULE_INT )
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2436:1: (lv_value_12_0= RULE_INT )
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2437:3: lv_value_12_0= RULE_INT
                    {
                    lv_value_12_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_rulePrimaryExpression5808); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_value_12_0, grammarAccess.getPrimaryExpressionAccess().getValueINTTerminalRuleCall_4_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getPrimaryExpressionRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"value",
                              		lv_value_12_0, 
                              		"INT");
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 6 :
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2455:5: this_FunctionCall_13= ruleFunctionCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getFunctionCallParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleFunctionCall_in_rulePrimaryExpression5842);
                    this_FunctionCall_13=ruleFunctionCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_FunctionCall_13; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 7 :
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2465:5: this_Prefix_14= rulePrefix
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getPrefixParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_rulePrefix_in_rulePrimaryExpression5869);
                    this_Prefix_14=rulePrefix();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Prefix_14; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 8 :
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2475:5: this_Postfix_15= rulePostfix
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getPostfixParserRuleCall_7()); 
                          
                    }
                    pushFollow(FOLLOW_rulePostfix_in_rulePrimaryExpression5896);
                    this_Postfix_15=rulePostfix();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Postfix_15; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 9 :
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2484:6: ( () ( (lv_value_17_0= RULE_STRING ) ) )
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2484:6: ( () ( (lv_value_17_0= RULE_STRING ) ) )
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2484:7: () ( (lv_value_17_0= RULE_STRING ) )
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2484:7: ()
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2485:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getPrimaryExpressionAccess().getStringLiteralAction_8_0(),
                                  current);
                          
                    }

                    }

                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2490:2: ( (lv_value_17_0= RULE_STRING ) )
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2491:1: (lv_value_17_0= RULE_STRING )
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2491:1: (lv_value_17_0= RULE_STRING )
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2492:3: lv_value_17_0= RULE_STRING
                    {
                    lv_value_17_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePrimaryExpression5928); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_value_17_0, grammarAccess.getPrimaryExpressionAccess().getValueSTRINGTerminalRuleCall_8_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getPrimaryExpressionRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"value",
                              		lv_value_17_0, 
                              		"STRING");
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 10 :
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2510:5: this_ArrayLiteral_18= ruleArrayLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getArrayLiteralParserRuleCall_9()); 
                          
                    }
                    pushFollow(FOLLOW_ruleArrayLiteral_in_rulePrimaryExpression5962);
                    this_ArrayLiteral_18=ruleArrayLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ArrayLiteral_18; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 11 :
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2520:5: this_FunctionDeclaration_19= ruleFunctionDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getFunctionDeclarationParserRuleCall_10()); 
                          
                    }
                    pushFollow(FOLLOW_ruleFunctionDeclaration_in_rulePrimaryExpression5989);
                    this_FunctionDeclaration_19=ruleFunctionDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_FunctionDeclaration_19; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 12 :
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2529:6: ( () otherlv_21= 'null' )
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2529:6: ( () otherlv_21= 'null' )
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2529:7: () otherlv_21= 'null'
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2529:7: ()
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2530:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getPrimaryExpressionAccess().getNullLiteralAction_11_0(),
                                  current);
                          
                    }

                    }

                    otherlv_21=(Token)match(input,53,FOLLOW_53_in_rulePrimaryExpression6016); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_21, grammarAccess.getPrimaryExpressionAccess().getNullKeyword_11_1());
                          
                    }

                    }


                    }
                    break;
                case 13 :
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2540:6: ( () otherlv_23= 'false' )
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2540:6: ( () otherlv_23= 'false' )
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2540:7: () otherlv_23= 'false'
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2540:7: ()
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2541:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getPrimaryExpressionAccess().getFalseLiteralAction_12_0(),
                                  current);
                          
                    }

                    }

                    otherlv_23=(Token)match(input,54,FOLLOW_54_in_rulePrimaryExpression6045); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_23, grammarAccess.getPrimaryExpressionAccess().getFalseKeyword_12_1());
                          
                    }

                    }


                    }
                    break;
                case 14 :
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2551:6: ( () otherlv_25= 'true' )
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2551:6: ( () otherlv_25= 'true' )
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2551:7: () otherlv_25= 'true'
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2551:7: ()
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2552:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getPrimaryExpressionAccess().getTrueLiteralAction_13_0(),
                                  current);
                          
                    }

                    }

                    otherlv_25=(Token)match(input,55,FOLLOW_55_in_rulePrimaryExpression6074); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_25, grammarAccess.getPrimaryExpressionAccess().getTrueKeyword_13_1());
                          
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
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2569:1: entryRuleArrayLiteral returns [EObject current=null] : iv_ruleArrayLiteral= ruleArrayLiteral EOF ;
    public final EObject entryRuleArrayLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayLiteral = null;


        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2570:2: (iv_ruleArrayLiteral= ruleArrayLiteral EOF )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2571:2: iv_ruleArrayLiteral= ruleArrayLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArrayLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleArrayLiteral_in_entryRuleArrayLiteral6111);
            iv_ruleArrayLiteral=ruleArrayLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArrayLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleArrayLiteral6121); if (state.failed) return current;

            }

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
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2578:1: ruleArrayLiteral returns [EObject current=null] : ( () otherlv_1= '[' ( ( (lv_values_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleExpression ) ) )* )? otherlv_5= ']' ) ;
    public final EObject ruleArrayLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_values_2_0 = null;

        EObject lv_values_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2581:28: ( ( () otherlv_1= '[' ( ( (lv_values_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleExpression ) ) )* )? otherlv_5= ']' ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2582:1: ( () otherlv_1= '[' ( ( (lv_values_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleExpression ) ) )* )? otherlv_5= ']' )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2582:1: ( () otherlv_1= '[' ( ( (lv_values_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleExpression ) ) )* )? otherlv_5= ']' )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2582:2: () otherlv_1= '[' ( ( (lv_values_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleExpression ) ) )* )? otherlv_5= ']'
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2582:2: ()
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2583:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getArrayLiteralAccess().getArrayLiteralAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,56,FOLLOW_56_in_ruleArrayLiteral6167); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getArrayLiteralAccess().getLeftSquareBracketKeyword_1());
                  
            }
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2592:1: ( ( (lv_values_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleExpression ) ) )* )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( ((LA33_0>=RULE_ID && LA33_0<=RULE_STRING)||(LA33_0>=20 && LA33_0<=21)||LA33_0==23||LA33_0==31||LA33_0==48||(LA33_0>=52 && LA33_0<=56)) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2592:2: ( (lv_values_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleExpression ) ) )*
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2592:2: ( (lv_values_2_0= ruleExpression ) )
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2593:1: (lv_values_2_0= ruleExpression )
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2593:1: (lv_values_2_0= ruleExpression )
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2594:3: lv_values_2_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getArrayLiteralAccess().getValuesExpressionParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleArrayLiteral6189);
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

                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2610:2: (otherlv_3= ',' ( (lv_values_4_0= ruleExpression ) ) )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==32) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2610:4: otherlv_3= ',' ( (lv_values_4_0= ruleExpression ) )
                    	    {
                    	    otherlv_3=(Token)match(input,32,FOLLOW_32_in_ruleArrayLiteral6202); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getArrayLiteralAccess().getCommaKeyword_2_1_0());
                    	          
                    	    }
                    	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2614:1: ( (lv_values_4_0= ruleExpression ) )
                    	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2615:1: (lv_values_4_0= ruleExpression )
                    	    {
                    	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2615:1: (lv_values_4_0= ruleExpression )
                    	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2616:3: lv_values_4_0= ruleExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getArrayLiteralAccess().getValuesExpressionParserRuleCall_2_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleExpression_in_ruleArrayLiteral6223);
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
                    	    break loop32;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,57,FOLLOW_57_in_ruleArrayLiteral6239); if (state.failed) return current;
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
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2644:1: entryRulePostfix returns [EObject current=null] : iv_rulePostfix= rulePostfix EOF ;
    public final EObject entryRulePostfix() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePostfix = null;


        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2645:2: (iv_rulePostfix= rulePostfix EOF )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2646:2: iv_rulePostfix= rulePostfix EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPostfixRule()); 
            }
            pushFollow(FOLLOW_rulePostfix_in_entryRulePostfix6275);
            iv_rulePostfix=rulePostfix();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePostfix; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePostfix6285); if (state.failed) return current;

            }

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
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2653:1: rulePostfix returns [EObject current=null] : (this_VariableReference_0= ruleVariableReference ( ( () otherlv_2= '--' ) | ( () otherlv_4= '++' ) )? ) ;
    public final EObject rulePostfix() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_VariableReference_0 = null;


         enterRule(); 
            
        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2656:28: ( (this_VariableReference_0= ruleVariableReference ( ( () otherlv_2= '--' ) | ( () otherlv_4= '++' ) )? ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2657:1: (this_VariableReference_0= ruleVariableReference ( ( () otherlv_2= '--' ) | ( () otherlv_4= '++' ) )? )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2657:1: (this_VariableReference_0= ruleVariableReference ( ( () otherlv_2= '--' ) | ( () otherlv_4= '++' ) )? )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2658:5: this_VariableReference_0= ruleVariableReference ( ( () otherlv_2= '--' ) | ( () otherlv_4= '++' ) )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getPostfixAccess().getVariableReferenceParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleVariableReference_in_rulePostfix6332);
            this_VariableReference_0=ruleVariableReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_VariableReference_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2666:1: ( ( () otherlv_2= '--' ) | ( () otherlv_4= '++' ) )?
            int alt34=3;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==20) ) {
                alt34=1;
            }
            else if ( (LA34_0==21) ) {
                alt34=2;
            }
            switch (alt34) {
                case 1 :
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2666:2: ( () otherlv_2= '--' )
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2666:2: ( () otherlv_2= '--' )
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2666:3: () otherlv_2= '--'
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2666:3: ()
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2667:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getPostfixAccess().getPostfixDecrementValueAction_1_0_0(),
                                  current);
                          
                    }

                    }

                    otherlv_2=(Token)match(input,20,FOLLOW_20_in_rulePostfix6354); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getPostfixAccess().getHyphenMinusHyphenMinusKeyword_1_0_1());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2677:6: ( () otherlv_4= '++' )
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2677:6: ( () otherlv_4= '++' )
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2677:7: () otherlv_4= '++'
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2677:7: ()
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2678:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getPostfixAccess().getPostfixIncrementValueAction_1_1_0(),
                                  current);
                          
                    }

                    }

                    otherlv_4=(Token)match(input,21,FOLLOW_21_in_rulePostfix6383); if (state.failed) return current;
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


    // $ANTLR start "entryRulePrefix"
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2695:1: entryRulePrefix returns [EObject current=null] : iv_rulePrefix= rulePrefix EOF ;
    public final EObject entryRulePrefix() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrefix = null;


        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2696:2: (iv_rulePrefix= rulePrefix EOF )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2697:2: iv_rulePrefix= rulePrefix EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrefixRule()); 
            }
            pushFollow(FOLLOW_rulePrefix_in_entryRulePrefix6422);
            iv_rulePrefix=rulePrefix();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrefix; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePrefix6432); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrefix"


    // $ANTLR start "rulePrefix"
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2704:1: rulePrefix returns [EObject current=null] : ( ( ( () otherlv_1= '--' ) | ( () otherlv_3= '++' ) ) ( (lv_right_4_0= ruleVariableReference ) ) ) ;
    public final EObject rulePrefix() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_right_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2707:28: ( ( ( ( () otherlv_1= '--' ) | ( () otherlv_3= '++' ) ) ( (lv_right_4_0= ruleVariableReference ) ) ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2708:1: ( ( ( () otherlv_1= '--' ) | ( () otherlv_3= '++' ) ) ( (lv_right_4_0= ruleVariableReference ) ) )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2708:1: ( ( ( () otherlv_1= '--' ) | ( () otherlv_3= '++' ) ) ( (lv_right_4_0= ruleVariableReference ) ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2708:2: ( ( () otherlv_1= '--' ) | ( () otherlv_3= '++' ) ) ( (lv_right_4_0= ruleVariableReference ) )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2708:2: ( ( () otherlv_1= '--' ) | ( () otherlv_3= '++' ) )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==20) ) {
                alt35=1;
            }
            else if ( (LA35_0==21) ) {
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
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2708:3: ( () otherlv_1= '--' )
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2708:3: ( () otherlv_1= '--' )
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2708:4: () otherlv_1= '--'
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2708:4: ()
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2709:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getPrefixAccess().getPrefixDecrementAction_0_0_0(),
                                  current);
                          
                    }

                    }

                    otherlv_1=(Token)match(input,20,FOLLOW_20_in_rulePrefix6480); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getPrefixAccess().getHyphenMinusHyphenMinusKeyword_0_0_1());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2719:6: ( () otherlv_3= '++' )
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2719:6: ( () otherlv_3= '++' )
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2719:7: () otherlv_3= '++'
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2719:7: ()
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2720:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getPrefixAccess().getPrefixIncrementAction_0_1_0(),
                                  current);
                          
                    }

                    }

                    otherlv_3=(Token)match(input,21,FOLLOW_21_in_rulePrefix6509); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getPrefixAccess().getPlusSignPlusSignKeyword_0_1_1());
                          
                    }

                    }


                    }
                    break;

            }

            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2729:3: ( (lv_right_4_0= ruleVariableReference ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2730:1: (lv_right_4_0= ruleVariableReference )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2730:1: (lv_right_4_0= ruleVariableReference )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2731:3: lv_right_4_0= ruleVariableReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPrefixAccess().getRightVariableReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVariableReference_in_rulePrefix6532);
            lv_right_4_0=ruleVariableReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getPrefixRule());
              	        }
                     		set(
                     			current, 
                     			"right",
                      		lv_right_4_0, 
                      		"VariableReference");
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
    // $ANTLR end "rulePrefix"


    // $ANTLR start "entryRuleVariableReference"
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2755:1: entryRuleVariableReference returns [EObject current=null] : iv_ruleVariableReference= ruleVariableReference EOF ;
    public final EObject entryRuleVariableReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableReference = null;


        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2756:2: (iv_ruleVariableReference= ruleVariableReference EOF )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2757:2: iv_ruleVariableReference= ruleVariableReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleVariableReference_in_entryRuleVariableReference6568);
            iv_ruleVariableReference=ruleVariableReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariableReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableReference6578); if (state.failed) return current;

            }

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
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2764:1: ruleVariableReference returns [EObject current=null] : ( ( ( ruleVariableReferenceArray )=>this_VariableReferenceArray_0= ruleVariableReferenceArray ) | this_VariableReferenceSimple_1= ruleVariableReferenceSimple ) ;
    public final EObject ruleVariableReference() throws RecognitionException {
        EObject current = null;

        EObject this_VariableReferenceArray_0 = null;

        EObject this_VariableReferenceSimple_1 = null;


         enterRule(); 
            
        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2767:28: ( ( ( ( ruleVariableReferenceArray )=>this_VariableReferenceArray_0= ruleVariableReferenceArray ) | this_VariableReferenceSimple_1= ruleVariableReferenceSimple ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2768:1: ( ( ( ruleVariableReferenceArray )=>this_VariableReferenceArray_0= ruleVariableReferenceArray ) | this_VariableReferenceSimple_1= ruleVariableReferenceSimple )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2768:1: ( ( ( ruleVariableReferenceArray )=>this_VariableReferenceArray_0= ruleVariableReferenceArray ) | this_VariableReferenceSimple_1= ruleVariableReferenceSimple )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==RULE_ID) ) {
                int LA36_1 = input.LA(2);

                if ( (LA36_1==56) && (synpred8_InternalLeek())) {
                    alt36=1;
                }
                else if ( (LA36_1==EOF||LA36_1==12||(LA36_1>=17 && LA36_1<=21)||LA36_1==24||LA36_1==28||LA36_1==32||(LA36_1>=35 && LA36_1<=51)||LA36_1==57) ) {
                    alt36=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 36, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2768:2: ( ( ruleVariableReferenceArray )=>this_VariableReferenceArray_0= ruleVariableReferenceArray )
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2768:2: ( ( ruleVariableReferenceArray )=>this_VariableReferenceArray_0= ruleVariableReferenceArray )
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2768:3: ( ruleVariableReferenceArray )=>this_VariableReferenceArray_0= ruleVariableReferenceArray
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getVariableReferenceAccess().getVariableReferenceArrayParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleVariableReferenceArray_in_ruleVariableReference6631);
                    this_VariableReferenceArray_0=ruleVariableReferenceArray();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_VariableReferenceArray_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2779:5: this_VariableReferenceSimple_1= ruleVariableReferenceSimple
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getVariableReferenceAccess().getVariableReferenceSimpleParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleVariableReferenceSimple_in_ruleVariableReference6659);
                    this_VariableReferenceSimple_1=ruleVariableReferenceSimple();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_VariableReferenceSimple_1; 
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
    // $ANTLR end "ruleVariableReference"


    // $ANTLR start "entryRuleVariableReferenceSimple"
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2795:1: entryRuleVariableReferenceSimple returns [EObject current=null] : iv_ruleVariableReferenceSimple= ruleVariableReferenceSimple EOF ;
    public final EObject entryRuleVariableReferenceSimple() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableReferenceSimple = null;


        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2796:2: (iv_ruleVariableReferenceSimple= ruleVariableReferenceSimple EOF )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2797:2: iv_ruleVariableReferenceSimple= ruleVariableReferenceSimple EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableReferenceSimpleRule()); 
            }
            pushFollow(FOLLOW_ruleVariableReferenceSimple_in_entryRuleVariableReferenceSimple6694);
            iv_ruleVariableReferenceSimple=ruleVariableReferenceSimple();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariableReferenceSimple; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableReferenceSimple6704); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariableReferenceSimple"


    // $ANTLR start "ruleVariableReferenceSimple"
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2804:1: ruleVariableReferenceSimple returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleVariableReferenceSimple() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2807:28: ( ( (otherlv_0= RULE_ID ) ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2808:1: ( (otherlv_0= RULE_ID ) )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2808:1: ( (otherlv_0= RULE_ID ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2809:1: (otherlv_0= RULE_ID )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2809:1: (otherlv_0= RULE_ID )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2810:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getVariableReferenceSimpleRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariableReferenceSimple6748); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getVariableReferenceSimpleAccess().getVariableVariableDeclarationCrossReference_0()); 
              	
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
    // $ANTLR end "ruleVariableReferenceSimple"


    // $ANTLR start "entryRuleVariableReferenceArray"
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2829:1: entryRuleVariableReferenceArray returns [EObject current=null] : iv_ruleVariableReferenceArray= ruleVariableReferenceArray EOF ;
    public final EObject entryRuleVariableReferenceArray() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableReferenceArray = null;


        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2830:2: (iv_ruleVariableReferenceArray= ruleVariableReferenceArray EOF )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2831:2: iv_ruleVariableReferenceArray= ruleVariableReferenceArray EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableReferenceArrayRule()); 
            }
            pushFollow(FOLLOW_ruleVariableReferenceArray_in_entryRuleVariableReferenceArray6783);
            iv_ruleVariableReferenceArray=ruleVariableReferenceArray();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariableReferenceArray; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableReferenceArray6793); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariableReferenceArray"


    // $ANTLR start "ruleVariableReferenceArray"
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2838:1: ruleVariableReferenceArray returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_dimensions_2_0= ruleExpression ) ) otherlv_3= ']' )+ ) ;
    public final EObject ruleVariableReferenceArray() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_dimensions_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2841:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_dimensions_2_0= ruleExpression ) ) otherlv_3= ']' )+ ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2842:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_dimensions_2_0= ruleExpression ) ) otherlv_3= ']' )+ )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2842:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_dimensions_2_0= ruleExpression ) ) otherlv_3= ']' )+ )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2842:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_dimensions_2_0= ruleExpression ) ) otherlv_3= ']' )+
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2842:2: ( (otherlv_0= RULE_ID ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2843:1: (otherlv_0= RULE_ID )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2843:1: (otherlv_0= RULE_ID )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2844:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getVariableReferenceArrayRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariableReferenceArray6838); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getVariableReferenceArrayAccess().getVariableVariableDeclarationCrossReference_0_0()); 
              	
            }

            }


            }

            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2855:2: (otherlv_1= '[' ( (lv_dimensions_2_0= ruleExpression ) ) otherlv_3= ']' )+
            int cnt37=0;
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==56) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2855:4: otherlv_1= '[' ( (lv_dimensions_2_0= ruleExpression ) ) otherlv_3= ']'
            	    {
            	    otherlv_1=(Token)match(input,56,FOLLOW_56_in_ruleVariableReferenceArray6851); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getVariableReferenceArrayAccess().getLeftSquareBracketKeyword_1_0());
            	          
            	    }
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2859:1: ( (lv_dimensions_2_0= ruleExpression ) )
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2860:1: (lv_dimensions_2_0= ruleExpression )
            	    {
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2860:1: (lv_dimensions_2_0= ruleExpression )
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2861:3: lv_dimensions_2_0= ruleExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getVariableReferenceArrayAccess().getDimensionsExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExpression_in_ruleVariableReferenceArray6872);
            	    lv_dimensions_2_0=ruleExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getVariableReferenceArrayRule());
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

            	    otherlv_3=(Token)match(input,57,FOLLOW_57_in_ruleVariableReferenceArray6884); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getVariableReferenceArrayAccess().getRightSquareBracketKeyword_1_2());
            	          
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt37 >= 1 ) break loop37;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(37, input);
                        throw eee;
                }
                cnt37++;
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
    // $ANTLR end "ruleVariableReferenceArray"


    // $ANTLR start "entryRuleFunctionCall"
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2889:1: entryRuleFunctionCall returns [EObject current=null] : iv_ruleFunctionCall= ruleFunctionCall EOF ;
    public final EObject entryRuleFunctionCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionCall = null;


        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2890:2: (iv_ruleFunctionCall= ruleFunctionCall EOF )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2891:2: iv_ruleFunctionCall= ruleFunctionCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunctionCallRule()); 
            }
            pushFollow(FOLLOW_ruleFunctionCall_in_entryRuleFunctionCall6922);
            iv_ruleFunctionCall=ruleFunctionCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFunctionCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionCall6932); if (state.failed) return current;

            }

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
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2898:1: ruleFunctionCall returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )? otherlv_6= ')' ) ;
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
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2901:28: ( ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )? otherlv_6= ')' ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2902:1: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )? otherlv_6= ')' )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2902:1: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )? otherlv_6= ')' )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2902:2: () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )? otherlv_6= ')'
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2902:2: ()
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2903:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getFunctionCallAccess().getFunctionCallAction_0(),
                          current);
                  
            }

            }

            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2908:2: ( (otherlv_1= RULE_ID ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2909:1: (otherlv_1= RULE_ID )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2909:1: (otherlv_1= RULE_ID )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2910:3: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getFunctionCallRule());
              	        }
                      
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionCall6986); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_1, grammarAccess.getFunctionCallAccess().getFunctionFunctionDeclarationCrossReference_1_0()); 
              	
            }

            }


            }

            otherlv_2=(Token)match(input,23,FOLLOW_23_in_ruleFunctionCall6998); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getFunctionCallAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2925:1: ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( ((LA39_0>=RULE_ID && LA39_0<=RULE_STRING)||(LA39_0>=20 && LA39_0<=21)||LA39_0==23||LA39_0==31||LA39_0==48||(LA39_0>=52 && LA39_0<=56)) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2925:2: ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )*
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2925:2: ( (lv_args_3_0= ruleExpression ) )
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2926:1: (lv_args_3_0= ruleExpression )
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2926:1: (lv_args_3_0= ruleExpression )
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2927:3: lv_args_3_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFunctionCallAccess().getArgsExpressionParserRuleCall_3_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleFunctionCall7020);
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

                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2943:2: (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )*
                    loop38:
                    do {
                        int alt38=2;
                        int LA38_0 = input.LA(1);

                        if ( (LA38_0==32) ) {
                            alt38=1;
                        }


                        switch (alt38) {
                    	case 1 :
                    	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2943:4: otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) )
                    	    {
                    	    otherlv_4=(Token)match(input,32,FOLLOW_32_in_ruleFunctionCall7033); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getFunctionCallAccess().getCommaKeyword_3_1_0());
                    	          
                    	    }
                    	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2947:1: ( (lv_args_5_0= ruleExpression ) )
                    	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2948:1: (lv_args_5_0= ruleExpression )
                    	    {
                    	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2948:1: (lv_args_5_0= ruleExpression )
                    	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2949:3: lv_args_5_0= ruleExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getFunctionCallAccess().getArgsExpressionParserRuleCall_3_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleExpression_in_ruleFunctionCall7054);
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
                    	    break loop38;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,24,FOLLOW_24_in_ruleFunctionCall7070); if (state.failed) return current;
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
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2977:1: entryRuleReturnStatement returns [EObject current=null] : iv_ruleReturnStatement= ruleReturnStatement EOF ;
    public final EObject entryRuleReturnStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReturnStatement = null;


        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2978:2: (iv_ruleReturnStatement= ruleReturnStatement EOF )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2979:2: iv_ruleReturnStatement= ruleReturnStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReturnStatementRule()); 
            }
            pushFollow(FOLLOW_ruleReturnStatement_in_entryRuleReturnStatement7106);
            iv_ruleReturnStatement=ruleReturnStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReturnStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReturnStatement7116); if (state.failed) return current;

            }

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
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2986:1: ruleReturnStatement returns [EObject current=null] : ( () otherlv_1= 'return' ( (lv_value_2_0= ruleExpression ) )? ) ;
    public final EObject ruleReturnStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2989:28: ( ( () otherlv_1= 'return' ( (lv_value_2_0= ruleExpression ) )? ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2990:1: ( () otherlv_1= 'return' ( (lv_value_2_0= ruleExpression ) )? )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2990:1: ( () otherlv_1= 'return' ( (lv_value_2_0= ruleExpression ) )? )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2990:2: () otherlv_1= 'return' ( (lv_value_2_0= ruleExpression ) )?
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2990:2: ()
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2991:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getReturnStatementAccess().getReturnStatementAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,58,FOLLOW_58_in_ruleReturnStatement7162); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getReturnStatementAccess().getReturnKeyword_1());
                  
            }
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:3000:1: ( (lv_value_2_0= ruleExpression ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( ((LA40_0>=RULE_ID && LA40_0<=RULE_STRING)||(LA40_0>=20 && LA40_0<=21)||LA40_0==23||LA40_0==31||LA40_0==48||(LA40_0>=52 && LA40_0<=56)) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:3001:1: (lv_value_2_0= ruleExpression )
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:3001:1: (lv_value_2_0= ruleExpression )
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:3002:3: lv_value_2_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getReturnStatementAccess().getValueExpressionParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleReturnStatement7183);
                    lv_value_2_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getReturnStatementRule());
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
    // $ANTLR end "ruleReturnStatement"


    // $ANTLR start "entryRuleInclude"
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:3026:1: entryRuleInclude returns [EObject current=null] : iv_ruleInclude= ruleInclude EOF ;
    public final EObject entryRuleInclude() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInclude = null;


        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:3027:2: (iv_ruleInclude= ruleInclude EOF )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:3028:2: iv_ruleInclude= ruleInclude EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIncludeRule()); 
            }
            pushFollow(FOLLOW_ruleInclude_in_entryRuleInclude7220);
            iv_ruleInclude=ruleInclude();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInclude; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInclude7230); if (state.failed) return current;

            }

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
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:3035:1: ruleInclude returns [EObject current=null] : (otherlv_0= 'include' otherlv_1= '(' ( (lv_importURI_2_0= RULE_STRING ) ) otherlv_3= ')' ) ;
    public final EObject ruleInclude() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_importURI_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:3038:28: ( (otherlv_0= 'include' otherlv_1= '(' ( (lv_importURI_2_0= RULE_STRING ) ) otherlv_3= ')' ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:3039:1: (otherlv_0= 'include' otherlv_1= '(' ( (lv_importURI_2_0= RULE_STRING ) ) otherlv_3= ')' )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:3039:1: (otherlv_0= 'include' otherlv_1= '(' ( (lv_importURI_2_0= RULE_STRING ) ) otherlv_3= ')' )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:3039:3: otherlv_0= 'include' otherlv_1= '(' ( (lv_importURI_2_0= RULE_STRING ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,59,FOLLOW_59_in_ruleInclude7267); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getIncludeAccess().getIncludeKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,23,FOLLOW_23_in_ruleInclude7279); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getIncludeAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:3047:1: ( (lv_importURI_2_0= RULE_STRING ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:3048:1: (lv_importURI_2_0= RULE_STRING )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:3048:1: (lv_importURI_2_0= RULE_STRING )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:3049:3: lv_importURI_2_0= RULE_STRING
            {
            lv_importURI_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleInclude7296); if (state.failed) return current;
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

            otherlv_3=(Token)match(input,24,FOLLOW_24_in_ruleInclude7313); if (state.failed) return current;
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
        // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:417:3: ( ruleAffectationDecrement )
        // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:417:5: ruleAffectationDecrement
        {
        pushFollow(FOLLOW_ruleAffectationDecrement_in_synpred1_InternalLeek1053);
        ruleAffectationDecrement();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalLeek

    // $ANTLR start synpred2_InternalLeek
    public final void synpred2_InternalLeek_fragment() throws RecognitionException {   
        // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:427:7: ( ruleAffectationIncrement )
        // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:427:9: ruleAffectationIncrement
        {
        pushFollow(FOLLOW_ruleAffectationIncrement_in_synpred2_InternalLeek1087);
        ruleAffectationIncrement();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_InternalLeek

    // $ANTLR start synpred3_InternalLeek
    public final void synpred3_InternalLeek_fragment() throws RecognitionException {   
        // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:437:7: ( ruleAffectationPostfixStatement )
        // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:437:9: ruleAffectationPostfixStatement
        {
        pushFollow(FOLLOW_ruleAffectationPostfixStatement_in_synpred3_InternalLeek1121);
        ruleAffectationPostfixStatement();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred3_InternalLeek

    // $ANTLR start synpred4_InternalLeek
    public final void synpred4_InternalLeek_fragment() throws RecognitionException {   
        // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:447:7: ( ruleAffectationPrefixStatement )
        // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:447:9: ruleAffectationPrefixStatement
        {
        pushFollow(FOLLOW_ruleAffectationPrefixStatement_in_synpred4_InternalLeek1155);
        ruleAffectationPrefixStatement();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred4_InternalLeek

    // $ANTLR start synpred5_InternalLeek
    public final void synpred5_InternalLeek_fragment() throws RecognitionException {   
        // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:829:4: ( 'else' )
        // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:829:6: 'else'
        {
        match(input,25,FOLLOW_25_in_synpred5_InternalLeek2027); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred5_InternalLeek

    // $ANTLR start synpred6_InternalLeek
    public final void synpred6_InternalLeek_fragment() throws RecognitionException {   
        // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:873:3: ( ruleAffectation )
        // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:873:5: ruleAffectation
        {
        pushFollow(FOLLOW_ruleAffectation_in_synpred6_InternalLeek2142);
        ruleAffectation();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred6_InternalLeek

    // $ANTLR start synpred7_InternalLeek
    public final void synpred7_InternalLeek_fragment() throws RecognitionException {   
        // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1346:3: ( ruleAffectation )
        // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1346:5: ruleAffectation
        {
        pushFollow(FOLLOW_ruleAffectation_in_synpred7_InternalLeek3262);
        ruleAffectation();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred7_InternalLeek

    // $ANTLR start synpred8_InternalLeek
    public final void synpred8_InternalLeek_fragment() throws RecognitionException {   
        // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2768:3: ( ruleVariableReferenceArray )
        // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2768:5: ruleVariableReferenceArray
        {
        pushFollow(FOLLOW_ruleVariableReferenceArray_in_synpred8_InternalLeek6615);
        ruleVariableReferenceArray();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred8_InternalLeek

    // Delegated rules

    public final boolean synpred4_InternalLeek() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_InternalLeek_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_InternalLeek() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalLeek_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred7_InternalLeek() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_InternalLeek_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred6_InternalLeek() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_InternalLeek_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
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
    public final boolean synpred8_InternalLeek() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred8_InternalLeek_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_InternalLeek() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_InternalLeek_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_InternalLeek() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalLeek_fragment(); // can never throw exception
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
    protected DFA8 dfa8 = new DFA8(this);
    protected DFA13 dfa13 = new DFA13(this);
    protected DFA31 dfa31 = new DFA31(this);
    static final String DFA2_eotS =
        "\17\uffff";
    static final String DFA2_eofS =
        "\17\uffff";
    static final String DFA2_minS =
        "\1\4\4\uffff\1\21\11\uffff";
    static final String DFA2_maxS =
        "\1\73\4\uffff\1\70\11\uffff";
    static final String DFA2_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\uffff\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\5";
    static final String DFA2_specialS =
        "\17\uffff}>";
    static final String[] DFA2_transitionS = {
            "\1\5\7\uffff\1\15\1\13\1\14\1\11\4\uffff\2\10\1\7\3\uffff\2\6\2\uffff\1\4\1\3\2\uffff\1\2\27\uffff\1\12\1\1",
            "",
            "",
            "",
            "",
            "\5\10\1\uffff\1\16\40\uffff\1\10",
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
            return "119:1: ( (this_Include_0= ruleInclude otherlv_1= ';' ) | (this_GlobalDeclaration_2= ruleGlobalDeclaration otherlv_3= ';' ) | this_FunctionDeclaration_4= ruleFunctionDeclaration | (this_LocalDeclaration_5= ruleLocalDeclaration otherlv_6= ';' ) | (this_FunctionCall_7= ruleFunctionCall otherlv_8= ';' ) | this_Iteration_9= ruleIteration | this_If_10= ruleIf | (this_AffectationStatement_11= ruleAffectationStatement otherlv_12= ';' ) | this_StatementBlock_13= ruleStatementBlock | (this_ReturnStatement_14= ruleReturnStatement otherlv_15= ';' ) | (this_BreakStatement_16= ruleBreakStatement otherlv_17= ';' ) | (this_ContinueStatement_18= ruleContinueStatement otherlv_19= ';' ) | ( () otherlv_21= ';' ) )";
        }
    }
    static final String DFA8_eotS =
        "\20\uffff";
    static final String DFA8_eofS =
        "\20\uffff";
    static final String DFA8_minS =
        "\1\4\1\0\16\uffff";
    static final String DFA8_maxS =
        "\1\70\1\0\16\uffff";
    static final String DFA8_acceptS =
        "\2\uffff\1\2\14\uffff\1\1";
    static final String DFA8_specialS =
        "\1\uffff\1\0\16\uffff}>";
    static final String[] DFA8_transitionS = {
            "\1\1\3\2\14\uffff\2\2\1\uffff\1\2\7\uffff\1\2\20\uffff\1\2\3\uffff\5\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
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
            return "873:1: ( ( ( ruleAffectation )=>this_Affectation_0= ruleAffectation ) | this_Expression_1= ruleExpression )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA8_1 = input.LA(1);

                         
                        int index8_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_InternalLeek()) ) {s = 15;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index8_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 8, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA13_eotS =
        "\20\uffff";
    static final String DFA13_eofS =
        "\20\uffff";
    static final String DFA13_minS =
        "\1\4\1\0\16\uffff";
    static final String DFA13_maxS =
        "\1\70\1\0\16\uffff";
    static final String DFA13_acceptS =
        "\2\uffff\1\2\14\uffff\1\1";
    static final String DFA13_specialS =
        "\1\uffff\1\0\16\uffff}>";
    static final String[] DFA13_transitionS = {
            "\1\1\3\2\14\uffff\2\2\1\uffff\1\2\7\uffff\1\2\20\uffff\1\2\3\uffff\5\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
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

    static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
    static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
    static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
    static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
    static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
    static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
    static final short[][] DFA13_transition;

    static {
        int numStates = DFA13_transitionS.length;
        DFA13_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        }
    }

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = DFA13_eot;
            this.eof = DFA13_eof;
            this.min = DFA13_min;
            this.max = DFA13_max;
            this.accept = DFA13_accept;
            this.special = DFA13_special;
            this.transition = DFA13_transition;
        }
        public String getDescription() {
            return "1346:1: ( ( ( ruleAffectation )=>this_Affectation_0= ruleAffectation ) | this_Expression_1= ruleExpression )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA13_1 = input.LA(1);

                         
                        int index13_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalLeek()) ) {s = 15;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index13_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 13, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA31_eotS =
        "\20\uffff";
    static final String DFA31_eofS =
        "\6\uffff\1\16\11\uffff";
    static final String DFA31_minS =
        "\1\4\5\uffff\1\14\11\uffff";
    static final String DFA31_maxS =
        "\1\70\5\uffff\1\71\11\uffff";
    static final String DFA31_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\uffff\1\7\1\11\1\12\1\13\1\14\1\15\1\16\1\10\1\6";
    static final String DFA31_specialS =
        "\20\uffff}>";
    static final String[] DFA31_transitionS = {
            "\1\6\1\4\1\5\1\10\14\uffff\2\7\1\uffff\1\1\7\uffff\1\12\20\uffff\1\2\3\uffff\1\3\1\13\1\14\1\15\1\11",
            "",
            "",
            "",
            "",
            "",
            "\1\16\7\uffff\2\16\1\uffff\1\17\1\16\3\uffff\1\16\3\uffff\1\16\2\uffff\21\16\4\uffff\2\16",
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

    static final short[] DFA31_eot = DFA.unpackEncodedString(DFA31_eotS);
    static final short[] DFA31_eof = DFA.unpackEncodedString(DFA31_eofS);
    static final char[] DFA31_min = DFA.unpackEncodedStringToUnsignedChars(DFA31_minS);
    static final char[] DFA31_max = DFA.unpackEncodedStringToUnsignedChars(DFA31_maxS);
    static final short[] DFA31_accept = DFA.unpackEncodedString(DFA31_acceptS);
    static final short[] DFA31_special = DFA.unpackEncodedString(DFA31_specialS);
    static final short[][] DFA31_transition;

    static {
        int numStates = DFA31_transitionS.length;
        DFA31_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA31_transition[i] = DFA.unpackEncodedString(DFA31_transitionS[i]);
        }
    }

    class DFA31 extends DFA {

        public DFA31(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 31;
            this.eot = DFA31_eot;
            this.eof = DFA31_eof;
            this.min = DFA31_min;
            this.max = DFA31_max;
            this.accept = DFA31_accept;
            this.special = DFA31_special;
            this.transition = DFA31_transition;
        }
        public String getDescription() {
            return "2328:1: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () otherlv_4= '-' ( (lv_expression_5_0= rulePrimaryExpression ) ) ) | ( () otherlv_7= '!' ( (lv_expression_8_0= rulePrimaryExpression ) ) ) | ( () ( (lv_value_10_0= RULE_REAL ) ) ) | ( () ( (lv_value_12_0= RULE_INT ) ) ) | this_FunctionCall_13= ruleFunctionCall | this_Prefix_14= rulePrefix | this_Postfix_15= rulePostfix | ( () ( (lv_value_17_0= RULE_STRING ) ) ) | this_ArrayLiteral_18= ruleArrayLiteral | this_FunctionDeclaration_19= ruleFunctionDeclaration | ( () otherlv_21= 'null' ) | ( () otherlv_23= 'false' ) | ( () otherlv_25= 'true' ) )";
        }
    }
 

    public static final BitSet FOLLOW_ruleScript_in_entryRuleScript75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleScript85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleScript130 = new BitSet(new long[]{0x0C000004CC70F012L});
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
    public static final BitSet FOLLOW_ruleAffectationStatement_in_ruleStatement469 = new BitSet(new long[]{0x0000000000001000L});
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
    public static final BitSet FOLLOW_15_in_ruleStatementBlock927 = new BitSet(new long[]{0x0C000004CC71F010L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleStatementBlock957 = new BitSet(new long[]{0x0C000004CC71F010L});
    public static final BitSet FOLLOW_16_in_ruleStatementBlock970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAffectationStatement_in_entryRuleAffectationStatement1006 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAffectationStatement1016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAffectationDecrement_in_ruleAffectationStatement1069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAffectationIncrement_in_ruleAffectationStatement1103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAffectationPostfixStatement_in_ruleAffectationStatement1137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAffectationPrefixStatement_in_ruleAffectationStatement1171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAffectation_in_ruleAffectationStatement1199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAffectation_in_entryRuleAffectation1234 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAffectation1244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableReference_in_ruleAffectation1290 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleAffectation1302 = new BitSet(new long[]{0x01F1000080B000F0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleAffectation1323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAffectationDecrement_in_entryRuleAffectationDecrement1359 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAffectationDecrement1369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableReference_in_ruleAffectationDecrement1415 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleAffectationDecrement1427 = new BitSet(new long[]{0x01F1000080B000F0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleAffectationDecrement1448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAffectationIncrement_in_entryRuleAffectationIncrement1484 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAffectationIncrement1494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableReference_in_ruleAffectationIncrement1540 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleAffectationIncrement1552 = new BitSet(new long[]{0x01F1000080B000F0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleAffectationIncrement1573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAffectationPostfixStatement_in_entryRuleAffectationPostfixStatement1609 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAffectationPostfixStatement1619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableReference_in_ruleAffectationPostfixStatement1666 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_20_in_ruleAffectationPostfixStatement1688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleAffectationPostfixStatement1717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAffectationPrefixStatement_in_entryRuleAffectationPrefixStatement1755 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAffectationPrefixStatement1765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleAffectationPrefixStatement1813 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_21_in_ruleAffectationPrefixStatement1842 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVariableReference_in_ruleAffectationPrefixStatement1865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIf_in_entryRuleIf1901 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIf1911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleIf1948 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleIf1960 = new BitSet(new long[]{0x01F1000080B000F0L});
    public static final BitSet FOLLOW_ruleIfCondition_in_ruleIf1981 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleIf1993 = new BitSet(new long[]{0x0C000004CE70F010L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleIf2014 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_25_in_ruleIf2035 = new BitSet(new long[]{0x0C000004CC70F010L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleIf2057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIfCondition_in_entryRuleIfCondition2095 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIfCondition2105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAffectation_in_ruleIfCondition2158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleIfCondition2186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIteration_in_entryRuleIteration2221 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIteration2231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhile_in_ruleIteration2278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForIn_in_ruleIteration2305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFor_in_ruleIteration2332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhile_in_entryRuleWhile2367 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWhile2377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleWhile2414 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleWhile2426 = new BitSet(new long[]{0x01F1000080B000F0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleWhile2447 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleWhile2459 = new BitSet(new long[]{0x0C000004CC70F010L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleWhile2480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFor_in_entryRuleFor2516 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFor2526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleFor2563 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleFor2575 = new BitSet(new long[]{0x0000000040300010L});
    public static final BitSet FOLLOW_ruleForInitializer_in_ruleFor2596 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleFor2608 = new BitSet(new long[]{0x01F1000080B000F0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleFor2629 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleFor2641 = new BitSet(new long[]{0x01F1000080B000F0L});
    public static final BitSet FOLLOW_ruleForAffectation_in_ruleFor2662 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleFor2674 = new BitSet(new long[]{0x0C000004CC70F010L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleFor2695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForIn_in_entryRuleForIn2731 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleForIn2741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleForIn2778 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleForIn2790 = new BitSet(new long[]{0x0000000040000010L});
    public static final BitSet FOLLOW_ruleForInVariableReference_in_ruleForIn2812 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleForIn2824 = new BitSet(new long[]{0x0000000040000010L});
    public static final BitSet FOLLOW_ruleForInVariableReference_in_ruleForIn2847 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleForIn2859 = new BitSet(new long[]{0x01F1000080B000F0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleForIn2880 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleForIn2892 = new BitSet(new long[]{0x0C000004CC70F010L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleForIn2913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForInVariableReference_in_entryRuleForInVariableReference2949 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleForInVariableReference2959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleForInVariableReference2997 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVariableDeclarationUnitialized_in_ruleForInVariableReference3019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableReferenceSimple_in_ruleForInVariableReference3047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForInitializer_in_entryRuleForInitializer3082 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleForInitializer3092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleForInitializer3130 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVariableDeclarationWithValue_in_ruleForInitializer3152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAffectation_in_ruleForInitializer3180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForAffectation_in_entryRuleForAffectation3215 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleForAffectation3225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAffectation_in_ruleForAffectation3278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleForAffectation3306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionDeclaration_in_entryRuleFunctionDeclaration3341 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionDeclaration3351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleFunctionDeclaration3388 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionDeclaration3405 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleFunctionDeclaration3422 = new BitSet(new long[]{0x0000000201000010L});
    public static final BitSet FOLLOW_ruleParameterDeclaration_in_ruleFunctionDeclaration3444 = new BitSet(new long[]{0x0000000101000000L});
    public static final BitSet FOLLOW_32_in_ruleFunctionDeclaration3457 = new BitSet(new long[]{0x0000000200000010L});
    public static final BitSet FOLLOW_ruleParameterDeclaration_in_ruleFunctionDeclaration3478 = new BitSet(new long[]{0x0000000101000000L});
    public static final BitSet FOLLOW_24_in_ruleFunctionDeclaration3494 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ruleStatementBlock_in_ruleFunctionDeclaration3515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterDeclaration_in_entryRuleParameterDeclaration3551 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameterDeclaration3561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleParameterDeclaration3604 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleParameterDeclaration3635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocalDeclaration_in_entryRuleLocalDeclaration3676 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLocalDeclaration3686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleLocalDeclaration3723 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_ruleLocalDeclaration3744 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_32_in_ruleLocalDeclaration3757 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_ruleLocalDeclaration3778 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_ruleGlobalDeclaration_in_entryRuleGlobalDeclaration3816 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGlobalDeclaration3826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleGlobalDeclaration3863 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_ruleGlobalDeclaration3884 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_32_in_ruleGlobalDeclaration3897 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_ruleGlobalDeclaration3918 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_entryRuleVariableDeclaration3956 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableDeclaration3966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDeclarationWithValue_in_ruleVariableDeclaration4013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDeclarationUnitialized_in_ruleVariableDeclaration4040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDeclarationWithValue_in_entryRuleVariableDeclarationWithValue4075 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableDeclarationWithValue4085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariableDeclarationWithValue4127 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleVariableDeclarationWithValue4144 = new BitSet(new long[]{0x01F1000080B000F0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleVariableDeclarationWithValue4165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDeclarationUnitialized_in_entryRuleVariableDeclarationUnitialized4201 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableDeclarationUnitialized4211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariableDeclarationUnitialized4252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression4292 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression4302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparison_in_ruleExpression4348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparison_in_entryRuleComparison4382 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComparison4392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOr_in_ruleComparison4439 = new BitSet(new long[]{0x000007F800000002L});
    public static final BitSet FOLLOW_35_in_ruleComparison4462 = new BitSet(new long[]{0x01F1000080B000F0L});
    public static final BitSet FOLLOW_36_in_ruleComparison4491 = new BitSet(new long[]{0x01F1000080B000F0L});
    public static final BitSet FOLLOW_37_in_ruleComparison4520 = new BitSet(new long[]{0x01F1000080B000F0L});
    public static final BitSet FOLLOW_38_in_ruleComparison4549 = new BitSet(new long[]{0x01F1000080B000F0L});
    public static final BitSet FOLLOW_39_in_ruleComparison4578 = new BitSet(new long[]{0x01F1000080B000F0L});
    public static final BitSet FOLLOW_40_in_ruleComparison4607 = new BitSet(new long[]{0x01F1000080B000F0L});
    public static final BitSet FOLLOW_41_in_ruleComparison4636 = new BitSet(new long[]{0x01F1000080B000F0L});
    public static final BitSet FOLLOW_42_in_ruleComparison4665 = new BitSet(new long[]{0x01F1000080B000F0L});
    public static final BitSet FOLLOW_ruleOr_in_ruleComparison4688 = new BitSet(new long[]{0x000007F800000002L});
    public static final BitSet FOLLOW_ruleOr_in_entryRuleOr4726 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOr4736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnd_in_ruleOr4783 = new BitSet(new long[]{0x0000180000000002L});
    public static final BitSet FOLLOW_43_in_ruleOr4806 = new BitSet(new long[]{0x01F1000080B000F0L});
    public static final BitSet FOLLOW_44_in_ruleOr4824 = new BitSet(new long[]{0x01F1000080B000F0L});
    public static final BitSet FOLLOW_ruleAnd_in_ruleOr4847 = new BitSet(new long[]{0x0000180000000002L});
    public static final BitSet FOLLOW_ruleAnd_in_entryRuleAnd4885 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnd4895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddition_in_ruleAnd4942 = new BitSet(new long[]{0x0000600000000002L});
    public static final BitSet FOLLOW_45_in_ruleAnd4965 = new BitSet(new long[]{0x01F1000080B000F0L});
    public static final BitSet FOLLOW_46_in_ruleAnd4983 = new BitSet(new long[]{0x01F1000080B000F0L});
    public static final BitSet FOLLOW_ruleAddition_in_ruleAnd5006 = new BitSet(new long[]{0x0000600000000002L});
    public static final BitSet FOLLOW_ruleAddition_in_entryRuleAddition5044 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAddition5054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplication_in_ruleAddition5101 = new BitSet(new long[]{0x0001800000000002L});
    public static final BitSet FOLLOW_47_in_ruleAddition5124 = new BitSet(new long[]{0x01F1000080B000F0L});
    public static final BitSet FOLLOW_48_in_ruleAddition5153 = new BitSet(new long[]{0x01F1000080B000F0L});
    public static final BitSet FOLLOW_ruleMultiplication_in_ruleAddition5176 = new BitSet(new long[]{0x0001800000000002L});
    public static final BitSet FOLLOW_ruleMultiplication_in_entryRuleMultiplication5214 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiplication5224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTernaryIf_in_ruleMultiplication5271 = new BitSet(new long[]{0x0006000000000002L});
    public static final BitSet FOLLOW_49_in_ruleMultiplication5294 = new BitSet(new long[]{0x01F1000080B000F0L});
    public static final BitSet FOLLOW_50_in_ruleMultiplication5323 = new BitSet(new long[]{0x01F1000080B000F0L});
    public static final BitSet FOLLOW_ruleTernaryIf_in_ruleMultiplication5346 = new BitSet(new long[]{0x0006000000000002L});
    public static final BitSet FOLLOW_ruleTernaryIf_in_entryRuleTernaryIf5384 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTernaryIf5394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_ruleTernaryIf5441 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_51_in_ruleTernaryIf5462 = new BitSet(new long[]{0x01F1000080B000F0L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_ruleTernaryIf5483 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleTernaryIf5495 = new BitSet(new long[]{0x01F1000080B000F0L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_ruleTernaryIf5516 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression5554 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimaryExpression5564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rulePrimaryExpression5602 = new BitSet(new long[]{0x01F1000080B000F0L});
    public static final BitSet FOLLOW_ruleExpression_in_rulePrimaryExpression5624 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_rulePrimaryExpression5635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rulePrimaryExpression5664 = new BitSet(new long[]{0x01F1000080B000F0L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_rulePrimaryExpression5685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rulePrimaryExpression5714 = new BitSet(new long[]{0x01F1000080B000F0L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_rulePrimaryExpression5735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_REAL_in_rulePrimaryExpression5769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rulePrimaryExpression5808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionCall_in_rulePrimaryExpression5842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrefix_in_rulePrimaryExpression5869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePostfix_in_rulePrimaryExpression5896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePrimaryExpression5928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayLiteral_in_rulePrimaryExpression5962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionDeclaration_in_rulePrimaryExpression5989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rulePrimaryExpression6016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rulePrimaryExpression6045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_rulePrimaryExpression6074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayLiteral_in_entryRuleArrayLiteral6111 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArrayLiteral6121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleArrayLiteral6167 = new BitSet(new long[]{0x03F1000080B000F0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleArrayLiteral6189 = new BitSet(new long[]{0x0200000100000000L});
    public static final BitSet FOLLOW_32_in_ruleArrayLiteral6202 = new BitSet(new long[]{0x01F1000080B000F0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleArrayLiteral6223 = new BitSet(new long[]{0x0200000100000000L});
    public static final BitSet FOLLOW_57_in_ruleArrayLiteral6239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePostfix_in_entryRulePostfix6275 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePostfix6285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableReference_in_rulePostfix6332 = new BitSet(new long[]{0x0000000000300002L});
    public static final BitSet FOLLOW_20_in_rulePostfix6354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rulePostfix6383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrefix_in_entryRulePrefix6422 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrefix6432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rulePrefix6480 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_21_in_rulePrefix6509 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVariableReference_in_rulePrefix6532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableReference_in_entryRuleVariableReference6568 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableReference6578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableReferenceArray_in_ruleVariableReference6631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableReferenceSimple_in_ruleVariableReference6659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableReferenceSimple_in_entryRuleVariableReferenceSimple6694 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableReferenceSimple6704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariableReferenceSimple6748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableReferenceArray_in_entryRuleVariableReferenceArray6783 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableReferenceArray6793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariableReferenceArray6838 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_ruleVariableReferenceArray6851 = new BitSet(new long[]{0x01F1000080B000F0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleVariableReferenceArray6872 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_ruleVariableReferenceArray6884 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_ruleFunctionCall_in_entryRuleFunctionCall6922 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionCall6932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionCall6986 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleFunctionCall6998 = new BitSet(new long[]{0x01F1000081B000F0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleFunctionCall7020 = new BitSet(new long[]{0x0000000101000000L});
    public static final BitSet FOLLOW_32_in_ruleFunctionCall7033 = new BitSet(new long[]{0x01F1000080B000F0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleFunctionCall7054 = new BitSet(new long[]{0x0000000101000000L});
    public static final BitSet FOLLOW_24_in_ruleFunctionCall7070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReturnStatement_in_entryRuleReturnStatement7106 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReturnStatement7116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleReturnStatement7162 = new BitSet(new long[]{0x01F1000080B000F2L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleReturnStatement7183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInclude_in_entryRuleInclude7220 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInclude7230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleInclude7267 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleInclude7279 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleInclude7296 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleInclude7313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAffectationDecrement_in_synpred1_InternalLeek1053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAffectationIncrement_in_synpred2_InternalLeek1087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAffectationPostfixStatement_in_synpred3_InternalLeek1121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAffectationPrefixStatement_in_synpred4_InternalLeek1155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_synpred5_InternalLeek2027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAffectation_in_synpred6_InternalLeek2142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAffectation_in_synpred7_InternalLeek3262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableReferenceArray_in_synpred8_InternalLeek6615 = new BitSet(new long[]{0x0000000000000002L});

}