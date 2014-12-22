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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_REAL", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "';'", "'{'", "'}'", "'='", "'if'", "'('", "')'", "'else'", "'while'", "'for'", "'var'", "':'", "'in'", "'function'", "','", "'@'", "'global'", "'==='", "'=='", "'!=='", "'!='", "'<='", "'<'", "'>='", "'>'", "'or'", "'||'", "'and'", "'&&'", "'+'", "'-'", "'*'", "'/'", "'['", "']'", "'include'", "'\"'"
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

                if ( (LA1_0==RULE_ID||LA1_0==13||LA1_0==16||(LA1_0>=20 && LA1_0<=22)||LA1_0==25||LA1_0==28||LA1_0==47) ) {
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
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:115:1: ruleStatement returns [EObject current=null] : ( ruleInclude | this_GlobalDeclaration_1= ruleGlobalDeclaration | this_LocalDeclaration_2= ruleLocalDeclaration | this_FunctionDeclaration_3= ruleFunctionDeclaration | (this_FunctionCall_4= ruleFunctionCall otherlv_5= ';' ) | this_For_6= ruleFor | this_While_7= ruleWhile | this_If_8= ruleIf | (this_Affectation_9= ruleAffectation otherlv_10= ';' ) | this_StatementBlock_11= ruleStatementBlock ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_5=null;
        Token otherlv_10=null;
        EObject this_GlobalDeclaration_1 = null;

        EObject this_LocalDeclaration_2 = null;

        EObject this_FunctionDeclaration_3 = null;

        EObject this_FunctionCall_4 = null;

        EObject this_For_6 = null;

        EObject this_While_7 = null;

        EObject this_If_8 = null;

        EObject this_Affectation_9 = null;

        EObject this_StatementBlock_11 = null;


         enterRule(); 
            
        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:118:28: ( ( ruleInclude | this_GlobalDeclaration_1= ruleGlobalDeclaration | this_LocalDeclaration_2= ruleLocalDeclaration | this_FunctionDeclaration_3= ruleFunctionDeclaration | (this_FunctionCall_4= ruleFunctionCall otherlv_5= ';' ) | this_For_6= ruleFor | this_While_7= ruleWhile | this_If_8= ruleIf | (this_Affectation_9= ruleAffectation otherlv_10= ';' ) | this_StatementBlock_11= ruleStatementBlock ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:119:1: ( ruleInclude | this_GlobalDeclaration_1= ruleGlobalDeclaration | this_LocalDeclaration_2= ruleLocalDeclaration | this_FunctionDeclaration_3= ruleFunctionDeclaration | (this_FunctionCall_4= ruleFunctionCall otherlv_5= ';' ) | this_For_6= ruleFor | this_While_7= ruleWhile | this_If_8= ruleIf | (this_Affectation_9= ruleAffectation otherlv_10= ';' ) | this_StatementBlock_11= ruleStatementBlock )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:119:1: ( ruleInclude | this_GlobalDeclaration_1= ruleGlobalDeclaration | this_LocalDeclaration_2= ruleLocalDeclaration | this_FunctionDeclaration_3= ruleFunctionDeclaration | (this_FunctionCall_4= ruleFunctionCall otherlv_5= ';' ) | this_For_6= ruleFor | this_While_7= ruleWhile | this_If_8= ruleIf | (this_Affectation_9= ruleAffectation otherlv_10= ';' ) | this_StatementBlock_11= ruleStatementBlock )
            int alt2=10;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:120:5: ruleInclude
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getIncludeParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInclude_in_ruleStatement217);
                    ruleInclude();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:129:5: this_GlobalDeclaration_1= ruleGlobalDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getGlobalDeclarationParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleGlobalDeclaration_in_ruleStatement244);
                    this_GlobalDeclaration_1=ruleGlobalDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_GlobalDeclaration_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:139:5: this_LocalDeclaration_2= ruleLocalDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getLocalDeclarationParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLocalDeclaration_in_ruleStatement271);
                    this_LocalDeclaration_2=ruleLocalDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_LocalDeclaration_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:149:5: this_FunctionDeclaration_3= ruleFunctionDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getFunctionDeclarationParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleFunctionDeclaration_in_ruleStatement298);
                    this_FunctionDeclaration_3=ruleFunctionDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_FunctionDeclaration_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:158:6: (this_FunctionCall_4= ruleFunctionCall otherlv_5= ';' )
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:158:6: (this_FunctionCall_4= ruleFunctionCall otherlv_5= ';' )
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:159:5: this_FunctionCall_4= ruleFunctionCall otherlv_5= ';'
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getFunctionCallParserRuleCall_4_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleFunctionCall_in_ruleStatement326);
                    this_FunctionCall_4=ruleFunctionCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_FunctionCall_4; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_5=(Token)match(input,12,FOLLOW_12_in_ruleStatement337); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getStatementAccess().getSemicolonKeyword_4_1());
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:173:5: this_For_6= ruleFor
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getForParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleFor_in_ruleStatement366);
                    this_For_6=ruleFor();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_For_6; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 7 :
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:183:5: this_While_7= ruleWhile
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getWhileParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleWhile_in_ruleStatement393);
                    this_While_7=ruleWhile();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_While_7; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 8 :
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:193:5: this_If_8= ruleIf
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getIfParserRuleCall_7()); 
                          
                    }
                    pushFollow(FOLLOW_ruleIf_in_ruleStatement420);
                    this_If_8=ruleIf();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_If_8; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 9 :
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:202:6: (this_Affectation_9= ruleAffectation otherlv_10= ';' )
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:202:6: (this_Affectation_9= ruleAffectation otherlv_10= ';' )
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:203:5: this_Affectation_9= ruleAffectation otherlv_10= ';'
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getAffectationParserRuleCall_8_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAffectation_in_ruleStatement448);
                    this_Affectation_9=ruleAffectation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Affectation_9; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_10=(Token)match(input,12,FOLLOW_12_in_ruleStatement459); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_10, grammarAccess.getStatementAccess().getSemicolonKeyword_8_1());
                          
                    }

                    }


                    }
                    break;
                case 10 :
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:217:5: this_StatementBlock_11= ruleStatementBlock
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getStatementBlockParserRuleCall_9()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStatementBlock_in_ruleStatement488);
                    this_StatementBlock_11=ruleStatementBlock();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_StatementBlock_11; 
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


    // $ANTLR start "entryRuleStatementBlock"
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:233:1: entryRuleStatementBlock returns [EObject current=null] : iv_ruleStatementBlock= ruleStatementBlock EOF ;
    public final EObject entryRuleStatementBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatementBlock = null;


        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:234:2: (iv_ruleStatementBlock= ruleStatementBlock EOF )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:235:2: iv_ruleStatementBlock= ruleStatementBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatementBlockRule()); 
            }
            pushFollow(FOLLOW_ruleStatementBlock_in_entryRuleStatementBlock523);
            iv_ruleStatementBlock=ruleStatementBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStatementBlock; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatementBlock533); if (state.failed) return current;

            }

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
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:242:1: ruleStatementBlock returns [EObject current=null] : (otherlv_0= '{' () ( (lv_statements_2_0= ruleStatement ) )* otherlv_3= '}' ) ;
    public final EObject ruleStatementBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject lv_statements_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:245:28: ( (otherlv_0= '{' () ( (lv_statements_2_0= ruleStatement ) )* otherlv_3= '}' ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:246:1: (otherlv_0= '{' () ( (lv_statements_2_0= ruleStatement ) )* otherlv_3= '}' )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:246:1: (otherlv_0= '{' () ( (lv_statements_2_0= ruleStatement ) )* otherlv_3= '}' )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:246:3: otherlv_0= '{' () ( (lv_statements_2_0= ruleStatement ) )* otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleStatementBlock570); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getStatementBlockAccess().getLeftCurlyBracketKeyword_0());
                  
            }
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:250:1: ()
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:251:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getStatementBlockAccess().getStatementBlockAction_1(),
                          current);
                  
            }

            }

            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:256:2: ( (lv_statements_2_0= ruleStatement ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID||LA3_0==13||LA3_0==16||(LA3_0>=20 && LA3_0<=22)||LA3_0==25||LA3_0==28||LA3_0==47) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:257:1: (lv_statements_2_0= ruleStatement )
            	    {
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:257:1: (lv_statements_2_0= ruleStatement )
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:258:3: lv_statements_2_0= ruleStatement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getStatementBlockAccess().getStatementsStatementParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleStatement_in_ruleStatementBlock600);
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

            otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleStatementBlock613); if (state.failed) return current;
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
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:286:1: entryRuleAffectation returns [EObject current=null] : iv_ruleAffectation= ruleAffectation EOF ;
    public final EObject entryRuleAffectation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAffectation = null;


        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:287:2: (iv_ruleAffectation= ruleAffectation EOF )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:288:2: iv_ruleAffectation= ruleAffectation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAffectationRule()); 
            }
            pushFollow(FOLLOW_ruleAffectation_in_entryRuleAffectation649);
            iv_ruleAffectation=ruleAffectation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAffectation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAffectation659); if (state.failed) return current;

            }

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
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:295:1: ruleAffectation returns [EObject current=null] : ( ( (lv_variable_0_0= ruleVariableReference ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) ) ) ;
    public final EObject ruleAffectation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_variable_0_0 = null;

        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:298:28: ( ( ( (lv_variable_0_0= ruleVariableReference ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) ) ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:299:1: ( ( (lv_variable_0_0= ruleVariableReference ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) ) )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:299:1: ( ( (lv_variable_0_0= ruleVariableReference ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:299:2: ( (lv_variable_0_0= ruleVariableReference ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:299:2: ( (lv_variable_0_0= ruleVariableReference ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:300:1: (lv_variable_0_0= ruleVariableReference )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:300:1: (lv_variable_0_0= ruleVariableReference )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:301:3: lv_variable_0_0= ruleVariableReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAffectationAccess().getVariableVariableReferenceParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVariableReference_in_ruleAffectation705);
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

            otherlv_1=(Token)match(input,15,FOLLOW_15_in_ruleAffectation717); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getAffectationAccess().getEqualsSignKeyword_1());
                  
            }
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:321:1: ( (lv_value_2_0= ruleExpression ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:322:1: (lv_value_2_0= ruleExpression )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:322:1: (lv_value_2_0= ruleExpression )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:323:3: lv_value_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAffectationAccess().getValueExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleAffectation738);
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
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:347:1: entryRuleIf returns [EObject current=null] : iv_ruleIf= ruleIf EOF ;
    public final EObject entryRuleIf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIf = null;


        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:348:2: (iv_ruleIf= ruleIf EOF )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:349:2: iv_ruleIf= ruleIf EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIfRule()); 
            }
            pushFollow(FOLLOW_ruleIf_in_entryRuleIf774);
            iv_ruleIf=ruleIf();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIf; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIf784); if (state.failed) return current;

            }

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
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:356:1: ruleIf returns [EObject current=null] : (otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_then_4_0= ruleStatement ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleStatement ) ) )? ) ;
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
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:359:28: ( (otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_then_4_0= ruleStatement ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleStatement ) ) )? ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:360:1: (otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_then_4_0= ruleStatement ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleStatement ) ) )? )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:360:1: (otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_then_4_0= ruleStatement ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleStatement ) ) )? )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:360:3: otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_then_4_0= ruleStatement ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleStatement ) ) )?
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleIf821); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getIfAccess().getIfKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleIf833); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getIfAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:368:1: ( (lv_condition_2_0= ruleExpression ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:369:1: (lv_condition_2_0= ruleExpression )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:369:1: (lv_condition_2_0= ruleExpression )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:370:3: lv_condition_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIfAccess().getConditionExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleIf854);
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

            otherlv_3=(Token)match(input,18,FOLLOW_18_in_ruleIf866); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getIfAccess().getRightParenthesisKeyword_3());
                  
            }
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:390:1: ( (lv_then_4_0= ruleStatement ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:391:1: (lv_then_4_0= ruleStatement )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:391:1: (lv_then_4_0= ruleStatement )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:392:3: lv_then_4_0= ruleStatement
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIfAccess().getThenStatementParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleStatement_in_ruleIf887);
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

            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:408:2: ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleStatement ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==19) ) {
                int LA4_1 = input.LA(2);

                if ( (synpred1_InternalLeek()) ) {
                    alt4=1;
                }
            }
            switch (alt4) {
                case 1 :
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:408:3: ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleStatement ) )
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:408:3: ( ( 'else' )=>otherlv_5= 'else' )
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:408:4: ( 'else' )=>otherlv_5= 'else'
                    {
                    otherlv_5=(Token)match(input,19,FOLLOW_19_in_ruleIf908); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getIfAccess().getElseKeyword_5_0());
                          
                    }

                    }

                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:413:2: ( (lv_else_6_0= ruleStatement ) )
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:414:1: (lv_else_6_0= ruleStatement )
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:414:1: (lv_else_6_0= ruleStatement )
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:415:3: lv_else_6_0= ruleStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIfAccess().getElseStatementParserRuleCall_5_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStatement_in_ruleIf930);
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


    // $ANTLR start "entryRuleWhile"
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:439:1: entryRuleWhile returns [EObject current=null] : iv_ruleWhile= ruleWhile EOF ;
    public final EObject entryRuleWhile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhile = null;


        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:440:2: (iv_ruleWhile= ruleWhile EOF )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:441:2: iv_ruleWhile= ruleWhile EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getWhileRule()); 
            }
            pushFollow(FOLLOW_ruleWhile_in_entryRuleWhile968);
            iv_ruleWhile=ruleWhile();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleWhile; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleWhile978); if (state.failed) return current;

            }

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
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:448:1: ruleWhile returns [EObject current=null] : (otherlv_0= 'while' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_statement_4_0= ruleStatement ) ) ) ;
    public final EObject ruleWhile() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_condition_2_0 = null;

        EObject lv_statement_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:451:28: ( (otherlv_0= 'while' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_statement_4_0= ruleStatement ) ) ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:452:1: (otherlv_0= 'while' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_statement_4_0= ruleStatement ) ) )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:452:1: (otherlv_0= 'while' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_statement_4_0= ruleStatement ) ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:452:3: otherlv_0= 'while' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_statement_4_0= ruleStatement ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20_in_ruleWhile1015); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getWhileAccess().getWhileKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleWhile1027); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getWhileAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:460:1: ( (lv_condition_2_0= ruleExpression ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:461:1: (lv_condition_2_0= ruleExpression )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:461:1: (lv_condition_2_0= ruleExpression )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:462:3: lv_condition_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getWhileAccess().getConditionExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleWhile1048);
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

            otherlv_3=(Token)match(input,18,FOLLOW_18_in_ruleWhile1060); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getWhileAccess().getRightParenthesisKeyword_3());
                  
            }
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:482:1: ( (lv_statement_4_0= ruleStatement ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:483:1: (lv_statement_4_0= ruleStatement )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:483:1: (lv_statement_4_0= ruleStatement )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:484:3: lv_statement_4_0= ruleStatement
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getWhileAccess().getStatementStatementParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleStatement_in_ruleWhile1081);
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
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:508:1: entryRuleFor returns [EObject current=null] : iv_ruleFor= ruleFor EOF ;
    public final EObject entryRuleFor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFor = null;


        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:509:2: (iv_ruleFor= ruleFor EOF )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:510:2: iv_ruleFor= ruleFor EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getForRule()); 
            }
            pushFollow(FOLLOW_ruleFor_in_entryRuleFor1117);
            iv_ruleFor=ruleFor();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFor; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFor1127); if (state.failed) return current;

            }

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
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:517:1: ruleFor returns [EObject current=null] : (otherlv_0= 'for' otherlv_1= '(' ( (lv_iterator_2_0= ruleForIterator ) ) otherlv_3= ')' ( (lv_statement_4_0= ruleStatement ) ) ) ;
    public final EObject ruleFor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_iterator_2_0 = null;

        EObject lv_statement_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:520:28: ( (otherlv_0= 'for' otherlv_1= '(' ( (lv_iterator_2_0= ruleForIterator ) ) otherlv_3= ')' ( (lv_statement_4_0= ruleStatement ) ) ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:521:1: (otherlv_0= 'for' otherlv_1= '(' ( (lv_iterator_2_0= ruleForIterator ) ) otherlv_3= ')' ( (lv_statement_4_0= ruleStatement ) ) )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:521:1: (otherlv_0= 'for' otherlv_1= '(' ( (lv_iterator_2_0= ruleForIterator ) ) otherlv_3= ')' ( (lv_statement_4_0= ruleStatement ) ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:521:3: otherlv_0= 'for' otherlv_1= '(' ( (lv_iterator_2_0= ruleForIterator ) ) otherlv_3= ')' ( (lv_statement_4_0= ruleStatement ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_21_in_ruleFor1164); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getForAccess().getForKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleFor1176); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getForAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:529:1: ( (lv_iterator_2_0= ruleForIterator ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:530:1: (lv_iterator_2_0= ruleForIterator )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:530:1: (lv_iterator_2_0= ruleForIterator )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:531:3: lv_iterator_2_0= ruleForIterator
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getForAccess().getIteratorForIteratorParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleForIterator_in_ruleFor1197);
            lv_iterator_2_0=ruleForIterator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getForRule());
              	        }
                     		set(
                     			current, 
                     			"iterator",
                      		lv_iterator_2_0, 
                      		"ForIterator");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,18,FOLLOW_18_in_ruleFor1209); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getForAccess().getRightParenthesisKeyword_3());
                  
            }
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:551:1: ( (lv_statement_4_0= ruleStatement ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:552:1: (lv_statement_4_0= ruleStatement )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:552:1: (lv_statement_4_0= ruleStatement )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:553:3: lv_statement_4_0= ruleStatement
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getForAccess().getStatementStatementParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleStatement_in_ruleFor1230);
            lv_statement_4_0=ruleStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getForRule());
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
    // $ANTLR end "ruleFor"


    // $ANTLR start "entryRuleForIterator"
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:577:1: entryRuleForIterator returns [EObject current=null] : iv_ruleForIterator= ruleForIterator EOF ;
    public final EObject entryRuleForIterator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForIterator = null;


        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:578:2: (iv_ruleForIterator= ruleForIterator EOF )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:579:2: iv_ruleForIterator= ruleForIterator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getForIteratorRule()); 
            }
            pushFollow(FOLLOW_ruleForIterator_in_entryRuleForIterator1266);
            iv_ruleForIterator=ruleForIterator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleForIterator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleForIterator1276); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleForIterator"


    // $ANTLR start "ruleForIterator"
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:586:1: ruleForIterator returns [EObject current=null] : (this_EachIterator_0= ruleEachIterator | this_VariableIterator_1= ruleVariableIterator ) ;
    public final EObject ruleForIterator() throws RecognitionException {
        EObject current = null;

        EObject this_EachIterator_0 = null;

        EObject this_VariableIterator_1 = null;


         enterRule(); 
            
        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:589:28: ( (this_EachIterator_0= ruleEachIterator | this_VariableIterator_1= ruleVariableIterator ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:590:1: (this_EachIterator_0= ruleEachIterator | this_VariableIterator_1= ruleVariableIterator )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:590:1: (this_EachIterator_0= ruleEachIterator | this_VariableIterator_1= ruleVariableIterator )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==22) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_ID) ) {
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
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:591:5: this_EachIterator_0= ruleEachIterator
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getForIteratorAccess().getEachIteratorParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleEachIterator_in_ruleForIterator1323);
                    this_EachIterator_0=ruleEachIterator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_EachIterator_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:601:5: this_VariableIterator_1= ruleVariableIterator
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getForIteratorAccess().getVariableIteratorParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleVariableIterator_in_ruleForIterator1350);
                    this_VariableIterator_1=ruleVariableIterator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_VariableIterator_1; 
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
    // $ANTLR end "ruleForIterator"


    // $ANTLR start "entryRuleEachIterator"
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:617:1: entryRuleEachIterator returns [EObject current=null] : iv_ruleEachIterator= ruleEachIterator EOF ;
    public final EObject entryRuleEachIterator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEachIterator = null;


        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:618:2: (iv_ruleEachIterator= ruleEachIterator EOF )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:619:2: iv_ruleEachIterator= ruleEachIterator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEachIteratorRule()); 
            }
            pushFollow(FOLLOW_ruleEachIterator_in_entryRuleEachIterator1385);
            iv_ruleEachIterator=ruleEachIterator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEachIterator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEachIterator1395); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEachIterator"


    // $ANTLR start "ruleEachIterator"
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:626:1: ruleEachIterator returns [EObject current=null] : ( ( ( ( 'var' )=>otherlv_0= 'var' ) ( (lv_key_1_0= ruleVariableDeclaration ) ) otherlv_2= ':' )? otherlv_3= 'var' ( (lv_value_4_0= ruleVariableDeclaration ) ) otherlv_5= 'in' ( (lv_array_6_0= ruleExpression ) ) ) ;
    public final EObject ruleEachIterator() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_key_1_0 = null;

        EObject lv_value_4_0 = null;

        EObject lv_array_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:629:28: ( ( ( ( ( 'var' )=>otherlv_0= 'var' ) ( (lv_key_1_0= ruleVariableDeclaration ) ) otherlv_2= ':' )? otherlv_3= 'var' ( (lv_value_4_0= ruleVariableDeclaration ) ) otherlv_5= 'in' ( (lv_array_6_0= ruleExpression ) ) ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:630:1: ( ( ( ( 'var' )=>otherlv_0= 'var' ) ( (lv_key_1_0= ruleVariableDeclaration ) ) otherlv_2= ':' )? otherlv_3= 'var' ( (lv_value_4_0= ruleVariableDeclaration ) ) otherlv_5= 'in' ( (lv_array_6_0= ruleExpression ) ) )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:630:1: ( ( ( ( 'var' )=>otherlv_0= 'var' ) ( (lv_key_1_0= ruleVariableDeclaration ) ) otherlv_2= ':' )? otherlv_3= 'var' ( (lv_value_4_0= ruleVariableDeclaration ) ) otherlv_5= 'in' ( (lv_array_6_0= ruleExpression ) ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:630:2: ( ( ( 'var' )=>otherlv_0= 'var' ) ( (lv_key_1_0= ruleVariableDeclaration ) ) otherlv_2= ':' )? otherlv_3= 'var' ( (lv_value_4_0= ruleVariableDeclaration ) ) otherlv_5= 'in' ( (lv_array_6_0= ruleExpression ) )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:630:2: ( ( ( 'var' )=>otherlv_0= 'var' ) ( (lv_key_1_0= ruleVariableDeclaration ) ) otherlv_2= ':' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==22) ) {
                int LA6_1 = input.LA(2);

                if ( (synpred2_InternalLeek()) ) {
                    alt6=1;
                }
            }
            switch (alt6) {
                case 1 :
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:630:3: ( ( 'var' )=>otherlv_0= 'var' ) ( (lv_key_1_0= ruleVariableDeclaration ) ) otherlv_2= ':'
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:630:3: ( ( 'var' )=>otherlv_0= 'var' )
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:630:4: ( 'var' )=>otherlv_0= 'var'
                    {
                    otherlv_0=(Token)match(input,22,FOLLOW_22_in_ruleEachIterator1441); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getEachIteratorAccess().getVarKeyword_0_0());
                          
                    }

                    }

                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:635:2: ( (lv_key_1_0= ruleVariableDeclaration ) )
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:636:1: (lv_key_1_0= ruleVariableDeclaration )
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:636:1: (lv_key_1_0= ruleVariableDeclaration )
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:637:3: lv_key_1_0= ruleVariableDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEachIteratorAccess().getKeyVariableDeclarationParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleVariableDeclaration_in_ruleEachIterator1463);
                    lv_key_1_0=ruleVariableDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getEachIteratorRule());
                      	        }
                             		set(
                             			current, 
                             			"key",
                              		lv_key_1_0, 
                              		"VariableDeclaration");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_2=(Token)match(input,23,FOLLOW_23_in_ruleEachIterator1475); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getEachIteratorAccess().getColonKeyword_0_2());
                          
                    }

                    }
                    break;

            }

            otherlv_3=(Token)match(input,22,FOLLOW_22_in_ruleEachIterator1489); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getEachIteratorAccess().getVarKeyword_1());
                  
            }
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:661:1: ( (lv_value_4_0= ruleVariableDeclaration ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:662:1: (lv_value_4_0= ruleVariableDeclaration )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:662:1: (lv_value_4_0= ruleVariableDeclaration )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:663:3: lv_value_4_0= ruleVariableDeclaration
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEachIteratorAccess().getValueVariableDeclarationParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVariableDeclaration_in_ruleEachIterator1510);
            lv_value_4_0=ruleVariableDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getEachIteratorRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_4_0, 
                      		"VariableDeclaration");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,24,FOLLOW_24_in_ruleEachIterator1522); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getEachIteratorAccess().getInKeyword_3());
                  
            }
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:683:1: ( (lv_array_6_0= ruleExpression ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:684:1: (lv_array_6_0= ruleExpression )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:684:1: (lv_array_6_0= ruleExpression )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:685:3: lv_array_6_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEachIteratorAccess().getArrayExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleEachIterator1543);
            lv_array_6_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getEachIteratorRule());
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
    // $ANTLR end "ruleEachIterator"


    // $ANTLR start "entryRuleVariableIterator"
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:709:1: entryRuleVariableIterator returns [EObject current=null] : iv_ruleVariableIterator= ruleVariableIterator EOF ;
    public final EObject entryRuleVariableIterator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableIterator = null;


        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:710:2: (iv_ruleVariableIterator= ruleVariableIterator EOF )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:711:2: iv_ruleVariableIterator= ruleVariableIterator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableIteratorRule()); 
            }
            pushFollow(FOLLOW_ruleVariableIterator_in_entryRuleVariableIterator1579);
            iv_ruleVariableIterator=ruleVariableIterator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariableIterator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableIterator1589); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariableIterator"


    // $ANTLR start "ruleVariableIterator"
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:718:1: ruleVariableIterator returns [EObject current=null] : ( ( (lv_initialization_0_0= ruleAffectation ) ) otherlv_1= ';' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ';' ( (lv_increment_4_0= ruleExpression ) ) ) ;
    public final EObject ruleVariableIterator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_initialization_0_0 = null;

        EObject lv_condition_2_0 = null;

        EObject lv_increment_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:721:28: ( ( ( (lv_initialization_0_0= ruleAffectation ) ) otherlv_1= ';' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ';' ( (lv_increment_4_0= ruleExpression ) ) ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:722:1: ( ( (lv_initialization_0_0= ruleAffectation ) ) otherlv_1= ';' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ';' ( (lv_increment_4_0= ruleExpression ) ) )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:722:1: ( ( (lv_initialization_0_0= ruleAffectation ) ) otherlv_1= ';' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ';' ( (lv_increment_4_0= ruleExpression ) ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:722:2: ( (lv_initialization_0_0= ruleAffectation ) ) otherlv_1= ';' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ';' ( (lv_increment_4_0= ruleExpression ) )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:722:2: ( (lv_initialization_0_0= ruleAffectation ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:723:1: (lv_initialization_0_0= ruleAffectation )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:723:1: (lv_initialization_0_0= ruleAffectation )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:724:3: lv_initialization_0_0= ruleAffectation
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getVariableIteratorAccess().getInitializationAffectationParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleAffectation_in_ruleVariableIterator1635);
            lv_initialization_0_0=ruleAffectation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getVariableIteratorRule());
              	        }
                     		set(
                     			current, 
                     			"initialization",
                      		lv_initialization_0_0, 
                      		"Affectation");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleVariableIterator1647); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getVariableIteratorAccess().getSemicolonKeyword_1());
                  
            }
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:744:1: ( (lv_condition_2_0= ruleExpression ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:745:1: (lv_condition_2_0= ruleExpression )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:745:1: (lv_condition_2_0= ruleExpression )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:746:3: lv_condition_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getVariableIteratorAccess().getConditionExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleVariableIterator1668);
            lv_condition_2_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getVariableIteratorRule());
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

            otherlv_3=(Token)match(input,12,FOLLOW_12_in_ruleVariableIterator1680); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getVariableIteratorAccess().getSemicolonKeyword_3());
                  
            }
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:766:1: ( (lv_increment_4_0= ruleExpression ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:767:1: (lv_increment_4_0= ruleExpression )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:767:1: (lv_increment_4_0= ruleExpression )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:768:3: lv_increment_4_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getVariableIteratorAccess().getIncrementExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleVariableIterator1701);
            lv_increment_4_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getVariableIteratorRule());
              	        }
                     		set(
                     			current, 
                     			"increment",
                      		lv_increment_4_0, 
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
    // $ANTLR end "ruleVariableIterator"


    // $ANTLR start "entryRuleFunctionDeclaration"
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:792:1: entryRuleFunctionDeclaration returns [EObject current=null] : iv_ruleFunctionDeclaration= ruleFunctionDeclaration EOF ;
    public final EObject entryRuleFunctionDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionDeclaration = null;


        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:793:2: (iv_ruleFunctionDeclaration= ruleFunctionDeclaration EOF )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:794:2: iv_ruleFunctionDeclaration= ruleFunctionDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunctionDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleFunctionDeclaration_in_entryRuleFunctionDeclaration1737);
            iv_ruleFunctionDeclaration=ruleFunctionDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFunctionDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionDeclaration1747); if (state.failed) return current;

            }

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
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:801:1: ruleFunctionDeclaration returns [EObject current=null] : (otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameter_3_0= ruleParameterDeclaration ) ) (otherlv_4= ',' ( (lv_parameter_5_0= ruleParameterDeclaration ) ) )* )? otherlv_6= ')' ) ;
    public final EObject ruleFunctionDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_parameter_3_0 = null;

        EObject lv_parameter_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:804:28: ( (otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameter_3_0= ruleParameterDeclaration ) ) (otherlv_4= ',' ( (lv_parameter_5_0= ruleParameterDeclaration ) ) )* )? otherlv_6= ')' ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:805:1: (otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameter_3_0= ruleParameterDeclaration ) ) (otherlv_4= ',' ( (lv_parameter_5_0= ruleParameterDeclaration ) ) )* )? otherlv_6= ')' )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:805:1: (otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameter_3_0= ruleParameterDeclaration ) ) (otherlv_4= ',' ( (lv_parameter_5_0= ruleParameterDeclaration ) ) )* )? otherlv_6= ')' )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:805:3: otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameter_3_0= ruleParameterDeclaration ) ) (otherlv_4= ',' ( (lv_parameter_5_0= ruleParameterDeclaration ) ) )* )? otherlv_6= ')'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_25_in_ruleFunctionDeclaration1784); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getFunctionDeclarationAccess().getFunctionKeyword_0());
                  
            }
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:809:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:810:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:810:1: (lv_name_1_0= RULE_ID )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:811:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionDeclaration1801); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleFunctionDeclaration1818); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getFunctionDeclarationAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:831:1: ( ( (lv_parameter_3_0= ruleParameterDeclaration ) ) (otherlv_4= ',' ( (lv_parameter_5_0= ruleParameterDeclaration ) ) )* )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==27) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:831:2: ( (lv_parameter_3_0= ruleParameterDeclaration ) ) (otherlv_4= ',' ( (lv_parameter_5_0= ruleParameterDeclaration ) ) )*
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:831:2: ( (lv_parameter_3_0= ruleParameterDeclaration ) )
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:832:1: (lv_parameter_3_0= ruleParameterDeclaration )
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:832:1: (lv_parameter_3_0= ruleParameterDeclaration )
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:833:3: lv_parameter_3_0= ruleParameterDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFunctionDeclarationAccess().getParameterParameterDeclarationParserRuleCall_3_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleParameterDeclaration_in_ruleFunctionDeclaration1840);
                    lv_parameter_3_0=ruleParameterDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getFunctionDeclarationRule());
                      	        }
                             		add(
                             			current, 
                             			"parameter",
                              		lv_parameter_3_0, 
                              		"ParameterDeclaration");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:849:2: (otherlv_4= ',' ( (lv_parameter_5_0= ruleParameterDeclaration ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==26) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:849:4: otherlv_4= ',' ( (lv_parameter_5_0= ruleParameterDeclaration ) )
                    	    {
                    	    otherlv_4=(Token)match(input,26,FOLLOW_26_in_ruleFunctionDeclaration1853); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getFunctionDeclarationAccess().getCommaKeyword_3_1_0());
                    	          
                    	    }
                    	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:853:1: ( (lv_parameter_5_0= ruleParameterDeclaration ) )
                    	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:854:1: (lv_parameter_5_0= ruleParameterDeclaration )
                    	    {
                    	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:854:1: (lv_parameter_5_0= ruleParameterDeclaration )
                    	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:855:3: lv_parameter_5_0= ruleParameterDeclaration
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getFunctionDeclarationAccess().getParameterParameterDeclarationParserRuleCall_3_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleParameterDeclaration_in_ruleFunctionDeclaration1874);
                    	    lv_parameter_5_0=ruleParameterDeclaration();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getFunctionDeclarationRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"parameter",
                    	              		lv_parameter_5_0, 
                    	              		"ParameterDeclaration");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,18,FOLLOW_18_in_ruleFunctionDeclaration1890); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getFunctionDeclarationAccess().getRightParenthesisKeyword_4());
                  
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
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:883:1: entryRuleParameterDeclaration returns [EObject current=null] : iv_ruleParameterDeclaration= ruleParameterDeclaration EOF ;
    public final EObject entryRuleParameterDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterDeclaration = null;


        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:884:2: (iv_ruleParameterDeclaration= ruleParameterDeclaration EOF )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:885:2: iv_ruleParameterDeclaration= ruleParameterDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleParameterDeclaration_in_entryRuleParameterDeclaration1926);
            iv_ruleParameterDeclaration=ruleParameterDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameterDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameterDeclaration1936); if (state.failed) return current;

            }

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
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:892:1: ruleParameterDeclaration returns [EObject current=null] : ( ( (lv_byAdress_0_0= '@' ) ) ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleParameterDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_byAdress_0_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:895:28: ( ( ( (lv_byAdress_0_0= '@' ) ) ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:896:1: ( ( (lv_byAdress_0_0= '@' ) ) ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:896:1: ( ( (lv_byAdress_0_0= '@' ) ) ( (lv_name_1_0= RULE_ID ) ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:896:2: ( (lv_byAdress_0_0= '@' ) ) ( (lv_name_1_0= RULE_ID ) )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:896:2: ( (lv_byAdress_0_0= '@' ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:897:1: (lv_byAdress_0_0= '@' )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:897:1: (lv_byAdress_0_0= '@' )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:898:3: lv_byAdress_0_0= '@'
            {
            lv_byAdress_0_0=(Token)match(input,27,FOLLOW_27_in_ruleParameterDeclaration1979); if (state.failed) return current;
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

            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:911:2: ( (lv_name_1_0= RULE_ID ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:912:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:912:1: (lv_name_1_0= RULE_ID )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:913:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParameterDeclaration2009); if (state.failed) return current;
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
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:937:1: entryRuleLocalDeclaration returns [EObject current=null] : iv_ruleLocalDeclaration= ruleLocalDeclaration EOF ;
    public final EObject entryRuleLocalDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocalDeclaration = null;


        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:938:2: (iv_ruleLocalDeclaration= ruleLocalDeclaration EOF )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:939:2: iv_ruleLocalDeclaration= ruleLocalDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLocalDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleLocalDeclaration_in_entryRuleLocalDeclaration2050);
            iv_ruleLocalDeclaration=ruleLocalDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLocalDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLocalDeclaration2060); if (state.failed) return current;

            }

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
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:946:1: ruleLocalDeclaration returns [EObject current=null] : (otherlv_0= 'var' ( (lv_variables_1_0= ruleVariableDeclaration ) ) (otherlv_2= ',' ( (lv_variables_3_0= ruleVariableDeclaration ) ) )* otherlv_4= ';' ) ;
    public final EObject ruleLocalDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_variables_1_0 = null;

        EObject lv_variables_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:949:28: ( (otherlv_0= 'var' ( (lv_variables_1_0= ruleVariableDeclaration ) ) (otherlv_2= ',' ( (lv_variables_3_0= ruleVariableDeclaration ) ) )* otherlv_4= ';' ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:950:1: (otherlv_0= 'var' ( (lv_variables_1_0= ruleVariableDeclaration ) ) (otherlv_2= ',' ( (lv_variables_3_0= ruleVariableDeclaration ) ) )* otherlv_4= ';' )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:950:1: (otherlv_0= 'var' ( (lv_variables_1_0= ruleVariableDeclaration ) ) (otherlv_2= ',' ( (lv_variables_3_0= ruleVariableDeclaration ) ) )* otherlv_4= ';' )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:950:3: otherlv_0= 'var' ( (lv_variables_1_0= ruleVariableDeclaration ) ) (otherlv_2= ',' ( (lv_variables_3_0= ruleVariableDeclaration ) ) )* otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_22_in_ruleLocalDeclaration2097); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getLocalDeclarationAccess().getVarKeyword_0());
                  
            }
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:954:1: ( (lv_variables_1_0= ruleVariableDeclaration ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:955:1: (lv_variables_1_0= ruleVariableDeclaration )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:955:1: (lv_variables_1_0= ruleVariableDeclaration )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:956:3: lv_variables_1_0= ruleVariableDeclaration
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLocalDeclarationAccess().getVariablesVariableDeclarationParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVariableDeclaration_in_ruleLocalDeclaration2118);
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

            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:972:2: (otherlv_2= ',' ( (lv_variables_3_0= ruleVariableDeclaration ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==26) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:972:4: otherlv_2= ',' ( (lv_variables_3_0= ruleVariableDeclaration ) )
            	    {
            	    otherlv_2=(Token)match(input,26,FOLLOW_26_in_ruleLocalDeclaration2131); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getLocalDeclarationAccess().getCommaKeyword_2_0());
            	          
            	    }
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:976:1: ( (lv_variables_3_0= ruleVariableDeclaration ) )
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:977:1: (lv_variables_3_0= ruleVariableDeclaration )
            	    {
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:977:1: (lv_variables_3_0= ruleVariableDeclaration )
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:978:3: lv_variables_3_0= ruleVariableDeclaration
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLocalDeclarationAccess().getVariablesVariableDeclarationParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleVariableDeclaration_in_ruleLocalDeclaration2152);
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
            	    break loop9;
                }
            } while (true);

            otherlv_4=(Token)match(input,12,FOLLOW_12_in_ruleLocalDeclaration2166); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getLocalDeclarationAccess().getSemicolonKeyword_3());
                  
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
    // $ANTLR end "ruleLocalDeclaration"


    // $ANTLR start "entryRuleGlobalDeclaration"
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1006:1: entryRuleGlobalDeclaration returns [EObject current=null] : iv_ruleGlobalDeclaration= ruleGlobalDeclaration EOF ;
    public final EObject entryRuleGlobalDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGlobalDeclaration = null;


        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1007:2: (iv_ruleGlobalDeclaration= ruleGlobalDeclaration EOF )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1008:2: iv_ruleGlobalDeclaration= ruleGlobalDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGlobalDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleGlobalDeclaration_in_entryRuleGlobalDeclaration2202);
            iv_ruleGlobalDeclaration=ruleGlobalDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGlobalDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGlobalDeclaration2212); if (state.failed) return current;

            }

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
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1015:1: ruleGlobalDeclaration returns [EObject current=null] : (otherlv_0= 'global' ( (lv_variables_1_0= ruleVariableDeclaration ) ) (otherlv_2= ',' ( (lv_variables_3_0= ruleVariableDeclaration ) ) )* otherlv_4= ';' ) ;
    public final EObject ruleGlobalDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_variables_1_0 = null;

        EObject lv_variables_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1018:28: ( (otherlv_0= 'global' ( (lv_variables_1_0= ruleVariableDeclaration ) ) (otherlv_2= ',' ( (lv_variables_3_0= ruleVariableDeclaration ) ) )* otherlv_4= ';' ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1019:1: (otherlv_0= 'global' ( (lv_variables_1_0= ruleVariableDeclaration ) ) (otherlv_2= ',' ( (lv_variables_3_0= ruleVariableDeclaration ) ) )* otherlv_4= ';' )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1019:1: (otherlv_0= 'global' ( (lv_variables_1_0= ruleVariableDeclaration ) ) (otherlv_2= ',' ( (lv_variables_3_0= ruleVariableDeclaration ) ) )* otherlv_4= ';' )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1019:3: otherlv_0= 'global' ( (lv_variables_1_0= ruleVariableDeclaration ) ) (otherlv_2= ',' ( (lv_variables_3_0= ruleVariableDeclaration ) ) )* otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_28_in_ruleGlobalDeclaration2249); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getGlobalDeclarationAccess().getGlobalKeyword_0());
                  
            }
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1023:1: ( (lv_variables_1_0= ruleVariableDeclaration ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1024:1: (lv_variables_1_0= ruleVariableDeclaration )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1024:1: (lv_variables_1_0= ruleVariableDeclaration )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1025:3: lv_variables_1_0= ruleVariableDeclaration
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getGlobalDeclarationAccess().getVariablesVariableDeclarationParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVariableDeclaration_in_ruleGlobalDeclaration2270);
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

            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1041:2: (otherlv_2= ',' ( (lv_variables_3_0= ruleVariableDeclaration ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==26) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1041:4: otherlv_2= ',' ( (lv_variables_3_0= ruleVariableDeclaration ) )
            	    {
            	    otherlv_2=(Token)match(input,26,FOLLOW_26_in_ruleGlobalDeclaration2283); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getGlobalDeclarationAccess().getCommaKeyword_2_0());
            	          
            	    }
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1045:1: ( (lv_variables_3_0= ruleVariableDeclaration ) )
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1046:1: (lv_variables_3_0= ruleVariableDeclaration )
            	    {
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1046:1: (lv_variables_3_0= ruleVariableDeclaration )
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1047:3: lv_variables_3_0= ruleVariableDeclaration
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getGlobalDeclarationAccess().getVariablesVariableDeclarationParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleVariableDeclaration_in_ruleGlobalDeclaration2304);
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
            	    break loop10;
                }
            } while (true);

            otherlv_4=(Token)match(input,12,FOLLOW_12_in_ruleGlobalDeclaration2318); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getGlobalDeclarationAccess().getSemicolonKeyword_3());
                  
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
    // $ANTLR end "ruleGlobalDeclaration"


    // $ANTLR start "entryRuleVariableDeclaration"
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1075:1: entryRuleVariableDeclaration returns [EObject current=null] : iv_ruleVariableDeclaration= ruleVariableDeclaration EOF ;
    public final EObject entryRuleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDeclaration = null;


        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1076:2: (iv_ruleVariableDeclaration= ruleVariableDeclaration EOF )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1077:2: iv_ruleVariableDeclaration= ruleVariableDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleVariableDeclaration_in_entryRuleVariableDeclaration2354);
            iv_ruleVariableDeclaration=ruleVariableDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariableDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableDeclaration2364); if (state.failed) return current;

            }

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
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1084:1: ruleVariableDeclaration returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) ) )? ) ;
    public final EObject ruleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1087:28: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) ) )? ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1088:1: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) ) )? )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1088:1: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) ) )? )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1088:2: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) ) )?
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1088:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1089:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1089:1: (lv_name_0_0= RULE_ID )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1090:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariableDeclaration2406); if (state.failed) return current;
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

            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1106:2: (otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==15) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1106:4: otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) )
                    {
                    otherlv_1=(Token)match(input,15,FOLLOW_15_in_ruleVariableDeclaration2424); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getVariableDeclarationAccess().getEqualsSignKeyword_1_0());
                          
                    }
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1110:1: ( (lv_value_2_0= ruleExpression ) )
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1111:1: (lv_value_2_0= ruleExpression )
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1111:1: (lv_value_2_0= ruleExpression )
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1112:3: lv_value_2_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getVariableDeclarationAccess().getValueExpressionParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleVariableDeclaration2445);
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
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1136:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1137:2: (iv_ruleExpression= ruleExpression EOF )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1138:2: iv_ruleExpression= ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression2483);
            iv_ruleExpression=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression2493); if (state.failed) return current;

            }

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
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1145:1: ruleExpression returns [EObject current=null] : this_Comparison_0= ruleComparison ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Comparison_0 = null;


         enterRule(); 
            
        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1148:28: (this_Comparison_0= ruleComparison )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1150:5: this_Comparison_0= ruleComparison
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExpressionAccess().getComparisonParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleComparison_in_ruleExpression2539);
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
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1166:1: entryRuleComparison returns [EObject current=null] : iv_ruleComparison= ruleComparison EOF ;
    public final EObject entryRuleComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparison = null;


        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1167:2: (iv_ruleComparison= ruleComparison EOF )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1168:2: iv_ruleComparison= ruleComparison EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getComparisonRule()); 
            }
            pushFollow(FOLLOW_ruleComparison_in_entryRuleComparison2573);
            iv_ruleComparison=ruleComparison();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleComparison; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleComparison2583); if (state.failed) return current;

            }

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
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1175:1: ruleComparison returns [EObject current=null] : (this_Or_0= ruleOr ( ( ( () otherlv_2= '===' ) | ( () otherlv_4= '==' ) | ( () otherlv_6= '!==' ) | ( () otherlv_8= '!=' ) | ( () otherlv_10= '<=' ) | ( () otherlv_12= '<' ) | ( () otherlv_14= '>=' ) | ( () otherlv_16= '>' ) ) ( (lv_right_17_0= ruleOr ) ) )* ) ;
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
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1178:28: ( (this_Or_0= ruleOr ( ( ( () otherlv_2= '===' ) | ( () otherlv_4= '==' ) | ( () otherlv_6= '!==' ) | ( () otherlv_8= '!=' ) | ( () otherlv_10= '<=' ) | ( () otherlv_12= '<' ) | ( () otherlv_14= '>=' ) | ( () otherlv_16= '>' ) ) ( (lv_right_17_0= ruleOr ) ) )* ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1179:1: (this_Or_0= ruleOr ( ( ( () otherlv_2= '===' ) | ( () otherlv_4= '==' ) | ( () otherlv_6= '!==' ) | ( () otherlv_8= '!=' ) | ( () otherlv_10= '<=' ) | ( () otherlv_12= '<' ) | ( () otherlv_14= '>=' ) | ( () otherlv_16= '>' ) ) ( (lv_right_17_0= ruleOr ) ) )* )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1179:1: (this_Or_0= ruleOr ( ( ( () otherlv_2= '===' ) | ( () otherlv_4= '==' ) | ( () otherlv_6= '!==' ) | ( () otherlv_8= '!=' ) | ( () otherlv_10= '<=' ) | ( () otherlv_12= '<' ) | ( () otherlv_14= '>=' ) | ( () otherlv_16= '>' ) ) ( (lv_right_17_0= ruleOr ) ) )* )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1180:5: this_Or_0= ruleOr ( ( ( () otherlv_2= '===' ) | ( () otherlv_4= '==' ) | ( () otherlv_6= '!==' ) | ( () otherlv_8= '!=' ) | ( () otherlv_10= '<=' ) | ( () otherlv_12= '<' ) | ( () otherlv_14= '>=' ) | ( () otherlv_16= '>' ) ) ( (lv_right_17_0= ruleOr ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getComparisonAccess().getOrParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleOr_in_ruleComparison2630);
            this_Or_0=ruleOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_Or_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1188:1: ( ( ( () otherlv_2= '===' ) | ( () otherlv_4= '==' ) | ( () otherlv_6= '!==' ) | ( () otherlv_8= '!=' ) | ( () otherlv_10= '<=' ) | ( () otherlv_12= '<' ) | ( () otherlv_14= '>=' ) | ( () otherlv_16= '>' ) ) ( (lv_right_17_0= ruleOr ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=29 && LA13_0<=36)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1188:2: ( ( () otherlv_2= '===' ) | ( () otherlv_4= '==' ) | ( () otherlv_6= '!==' ) | ( () otherlv_8= '!=' ) | ( () otherlv_10= '<=' ) | ( () otherlv_12= '<' ) | ( () otherlv_14= '>=' ) | ( () otherlv_16= '>' ) ) ( (lv_right_17_0= ruleOr ) )
            	    {
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1188:2: ( ( () otherlv_2= '===' ) | ( () otherlv_4= '==' ) | ( () otherlv_6= '!==' ) | ( () otherlv_8= '!=' ) | ( () otherlv_10= '<=' ) | ( () otherlv_12= '<' ) | ( () otherlv_14= '>=' ) | ( () otherlv_16= '>' ) )
            	    int alt12=8;
            	    switch ( input.LA(1) ) {
            	    case 29:
            	        {
            	        alt12=1;
            	        }
            	        break;
            	    case 30:
            	        {
            	        alt12=2;
            	        }
            	        break;
            	    case 31:
            	        {
            	        alt12=3;
            	        }
            	        break;
            	    case 32:
            	        {
            	        alt12=4;
            	        }
            	        break;
            	    case 33:
            	        {
            	        alt12=5;
            	        }
            	        break;
            	    case 34:
            	        {
            	        alt12=6;
            	        }
            	        break;
            	    case 35:
            	        {
            	        alt12=7;
            	        }
            	        break;
            	    case 36:
            	        {
            	        alt12=8;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 12, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt12) {
            	        case 1 :
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1188:3: ( () otherlv_2= '===' )
            	            {
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1188:3: ( () otherlv_2= '===' )
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1188:4: () otherlv_2= '==='
            	            {
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1188:4: ()
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1189:5: 
            	            {
            	            if ( state.backtracking==0 ) {

            	                      current = forceCreateModelElementAndSet(
            	                          grammarAccess.getComparisonAccess().getTypedEqualsLeftAction_1_0_0_0(),
            	                          current);
            	                  
            	            }

            	            }

            	            otherlv_2=(Token)match(input,29,FOLLOW_29_in_ruleComparison2653); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_2, grammarAccess.getComparisonAccess().getEqualsSignEqualsSignEqualsSignKeyword_1_0_0_1());
            	                  
            	            }

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1199:6: ( () otherlv_4= '==' )
            	            {
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1199:6: ( () otherlv_4= '==' )
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1199:7: () otherlv_4= '=='
            	            {
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1199:7: ()
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1200:5: 
            	            {
            	            if ( state.backtracking==0 ) {

            	                      current = forceCreateModelElementAndSet(
            	                          grammarAccess.getComparisonAccess().getEqualsLeftAction_1_0_1_0(),
            	                          current);
            	                  
            	            }

            	            }

            	            otherlv_4=(Token)match(input,30,FOLLOW_30_in_ruleComparison2682); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_4, grammarAccess.getComparisonAccess().getEqualsSignEqualsSignKeyword_1_0_1_1());
            	                  
            	            }

            	            }


            	            }
            	            break;
            	        case 3 :
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1210:6: ( () otherlv_6= '!==' )
            	            {
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1210:6: ( () otherlv_6= '!==' )
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1210:7: () otherlv_6= '!=='
            	            {
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1210:7: ()
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1211:5: 
            	            {
            	            if ( state.backtracking==0 ) {

            	                      current = forceCreateModelElementAndSet(
            	                          grammarAccess.getComparisonAccess().getTypedDifferentLeftAction_1_0_2_0(),
            	                          current);
            	                  
            	            }

            	            }

            	            otherlv_6=(Token)match(input,31,FOLLOW_31_in_ruleComparison2711); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_6, grammarAccess.getComparisonAccess().getExclamationMarkEqualsSignEqualsSignKeyword_1_0_2_1());
            	                  
            	            }

            	            }


            	            }
            	            break;
            	        case 4 :
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1221:6: ( () otherlv_8= '!=' )
            	            {
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1221:6: ( () otherlv_8= '!=' )
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1221:7: () otherlv_8= '!='
            	            {
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1221:7: ()
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1222:5: 
            	            {
            	            if ( state.backtracking==0 ) {

            	                      current = forceCreateModelElementAndSet(
            	                          grammarAccess.getComparisonAccess().getDifferentLeftAction_1_0_3_0(),
            	                          current);
            	                  
            	            }

            	            }

            	            otherlv_8=(Token)match(input,32,FOLLOW_32_in_ruleComparison2740); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_8, grammarAccess.getComparisonAccess().getExclamationMarkEqualsSignKeyword_1_0_3_1());
            	                  
            	            }

            	            }


            	            }
            	            break;
            	        case 5 :
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1232:6: ( () otherlv_10= '<=' )
            	            {
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1232:6: ( () otherlv_10= '<=' )
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1232:7: () otherlv_10= '<='
            	            {
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1232:7: ()
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1233:5: 
            	            {
            	            if ( state.backtracking==0 ) {

            	                      current = forceCreateModelElementAndSet(
            	                          grammarAccess.getComparisonAccess().getLessOrEqualsLeftAction_1_0_4_0(),
            	                          current);
            	                  
            	            }

            	            }

            	            otherlv_10=(Token)match(input,33,FOLLOW_33_in_ruleComparison2769); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_10, grammarAccess.getComparisonAccess().getLessThanSignEqualsSignKeyword_1_0_4_1());
            	                  
            	            }

            	            }


            	            }
            	            break;
            	        case 6 :
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1243:6: ( () otherlv_12= '<' )
            	            {
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1243:6: ( () otherlv_12= '<' )
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1243:7: () otherlv_12= '<'
            	            {
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1243:7: ()
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1244:5: 
            	            {
            	            if ( state.backtracking==0 ) {

            	                      current = forceCreateModelElementAndSet(
            	                          grammarAccess.getComparisonAccess().getLessLeftAction_1_0_5_0(),
            	                          current);
            	                  
            	            }

            	            }

            	            otherlv_12=(Token)match(input,34,FOLLOW_34_in_ruleComparison2798); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_12, grammarAccess.getComparisonAccess().getLessThanSignKeyword_1_0_5_1());
            	                  
            	            }

            	            }


            	            }
            	            break;
            	        case 7 :
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1254:6: ( () otherlv_14= '>=' )
            	            {
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1254:6: ( () otherlv_14= '>=' )
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1254:7: () otherlv_14= '>='
            	            {
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1254:7: ()
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1255:5: 
            	            {
            	            if ( state.backtracking==0 ) {

            	                      current = forceCreateModelElementAndSet(
            	                          grammarAccess.getComparisonAccess().getMoreOrEqualsLeftAction_1_0_6_0(),
            	                          current);
            	                  
            	            }

            	            }

            	            otherlv_14=(Token)match(input,35,FOLLOW_35_in_ruleComparison2827); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_14, grammarAccess.getComparisonAccess().getGreaterThanSignEqualsSignKeyword_1_0_6_1());
            	                  
            	            }

            	            }


            	            }
            	            break;
            	        case 8 :
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1265:6: ( () otherlv_16= '>' )
            	            {
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1265:6: ( () otherlv_16= '>' )
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1265:7: () otherlv_16= '>'
            	            {
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1265:7: ()
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1266:5: 
            	            {
            	            if ( state.backtracking==0 ) {

            	                      current = forceCreateModelElementAndSet(
            	                          grammarAccess.getComparisonAccess().getMoreLeftAction_1_0_7_0(),
            	                          current);
            	                  
            	            }

            	            }

            	            otherlv_16=(Token)match(input,36,FOLLOW_36_in_ruleComparison2856); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_16, grammarAccess.getComparisonAccess().getGreaterThanSignKeyword_1_0_7_1());
            	                  
            	            }

            	            }


            	            }
            	            break;

            	    }

            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1275:3: ( (lv_right_17_0= ruleOr ) )
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1276:1: (lv_right_17_0= ruleOr )
            	    {
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1276:1: (lv_right_17_0= ruleOr )
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1277:3: lv_right_17_0= ruleOr
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getComparisonAccess().getRightOrParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOr_in_ruleComparison2879);
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
            	    break loop13;
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
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1301:1: entryRuleOr returns [EObject current=null] : iv_ruleOr= ruleOr EOF ;
    public final EObject entryRuleOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOr = null;


        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1302:2: (iv_ruleOr= ruleOr EOF )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1303:2: iv_ruleOr= ruleOr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOrRule()); 
            }
            pushFollow(FOLLOW_ruleOr_in_entryRuleOr2917);
            iv_ruleOr=ruleOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOr; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOr2927); if (state.failed) return current;

            }

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
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1310:1: ruleOr returns [EObject current=null] : (this_And_0= ruleAnd ( ( () (otherlv_2= 'or' | otherlv_3= '||' ) ) ( (lv_right_4_0= ruleAnd ) ) )* ) ;
    public final EObject ruleOr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject this_And_0 = null;

        EObject lv_right_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1313:28: ( (this_And_0= ruleAnd ( ( () (otherlv_2= 'or' | otherlv_3= '||' ) ) ( (lv_right_4_0= ruleAnd ) ) )* ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1314:1: (this_And_0= ruleAnd ( ( () (otherlv_2= 'or' | otherlv_3= '||' ) ) ( (lv_right_4_0= ruleAnd ) ) )* )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1314:1: (this_And_0= ruleAnd ( ( () (otherlv_2= 'or' | otherlv_3= '||' ) ) ( (lv_right_4_0= ruleAnd ) ) )* )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1315:5: this_And_0= ruleAnd ( ( () (otherlv_2= 'or' | otherlv_3= '||' ) ) ( (lv_right_4_0= ruleAnd ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getOrAccess().getAndParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleAnd_in_ruleOr2974);
            this_And_0=ruleAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_And_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1323:1: ( ( () (otherlv_2= 'or' | otherlv_3= '||' ) ) ( (lv_right_4_0= ruleAnd ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=37 && LA15_0<=38)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1323:2: ( () (otherlv_2= 'or' | otherlv_3= '||' ) ) ( (lv_right_4_0= ruleAnd ) )
            	    {
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1323:2: ( () (otherlv_2= 'or' | otherlv_3= '||' ) )
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1323:3: () (otherlv_2= 'or' | otherlv_3= '||' )
            	    {
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1323:3: ()
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1324:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getOrAccess().getTypedEqualsLeftAction_1_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1329:2: (otherlv_2= 'or' | otherlv_3= '||' )
            	    int alt14=2;
            	    int LA14_0 = input.LA(1);

            	    if ( (LA14_0==37) ) {
            	        alt14=1;
            	    }
            	    else if ( (LA14_0==38) ) {
            	        alt14=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 14, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt14) {
            	        case 1 :
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1329:4: otherlv_2= 'or'
            	            {
            	            otherlv_2=(Token)match(input,37,FOLLOW_37_in_ruleOr2997); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_2, grammarAccess.getOrAccess().getOrKeyword_1_0_1_0());
            	                  
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1334:7: otherlv_3= '||'
            	            {
            	            otherlv_3=(Token)match(input,38,FOLLOW_38_in_ruleOr3015); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_3, grammarAccess.getOrAccess().getVerticalLineVerticalLineKeyword_1_0_1_1());
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }

            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1338:3: ( (lv_right_4_0= ruleAnd ) )
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1339:1: (lv_right_4_0= ruleAnd )
            	    {
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1339:1: (lv_right_4_0= ruleAnd )
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1340:3: lv_right_4_0= ruleAnd
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getOrAccess().getRightAndParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAnd_in_ruleOr3038);
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
    // $ANTLR end "ruleOr"


    // $ANTLR start "entryRuleAnd"
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1364:1: entryRuleAnd returns [EObject current=null] : iv_ruleAnd= ruleAnd EOF ;
    public final EObject entryRuleAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnd = null;


        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1365:2: (iv_ruleAnd= ruleAnd EOF )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1366:2: iv_ruleAnd= ruleAnd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAndRule()); 
            }
            pushFollow(FOLLOW_ruleAnd_in_entryRuleAnd3076);
            iv_ruleAnd=ruleAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAnd; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnd3086); if (state.failed) return current;

            }

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
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1373:1: ruleAnd returns [EObject current=null] : (this_Addition_0= ruleAddition ( ( () (otherlv_2= 'and' | otherlv_3= '&&' ) ) ( (lv_right_4_0= ruleAddition ) ) )* ) ;
    public final EObject ruleAnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject this_Addition_0 = null;

        EObject lv_right_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1376:28: ( (this_Addition_0= ruleAddition ( ( () (otherlv_2= 'and' | otherlv_3= '&&' ) ) ( (lv_right_4_0= ruleAddition ) ) )* ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1377:1: (this_Addition_0= ruleAddition ( ( () (otherlv_2= 'and' | otherlv_3= '&&' ) ) ( (lv_right_4_0= ruleAddition ) ) )* )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1377:1: (this_Addition_0= ruleAddition ( ( () (otherlv_2= 'and' | otherlv_3= '&&' ) ) ( (lv_right_4_0= ruleAddition ) ) )* )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1378:5: this_Addition_0= ruleAddition ( ( () (otherlv_2= 'and' | otherlv_3= '&&' ) ) ( (lv_right_4_0= ruleAddition ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getAndAccess().getAdditionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleAddition_in_ruleAnd3133);
            this_Addition_0=ruleAddition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_Addition_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1386:1: ( ( () (otherlv_2= 'and' | otherlv_3= '&&' ) ) ( (lv_right_4_0= ruleAddition ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=39 && LA17_0<=40)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1386:2: ( () (otherlv_2= 'and' | otherlv_3= '&&' ) ) ( (lv_right_4_0= ruleAddition ) )
            	    {
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1386:2: ( () (otherlv_2= 'and' | otherlv_3= '&&' ) )
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1386:3: () (otherlv_2= 'and' | otherlv_3= '&&' )
            	    {
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1386:3: ()
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1387:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getAndAccess().getTypedEqualsLeftAction_1_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1392:2: (otherlv_2= 'and' | otherlv_3= '&&' )
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
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1392:4: otherlv_2= 'and'
            	            {
            	            otherlv_2=(Token)match(input,39,FOLLOW_39_in_ruleAnd3156); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_2, grammarAccess.getAndAccess().getAndKeyword_1_0_1_0());
            	                  
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1397:7: otherlv_3= '&&'
            	            {
            	            otherlv_3=(Token)match(input,40,FOLLOW_40_in_ruleAnd3174); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_3, grammarAccess.getAndAccess().getAmpersandAmpersandKeyword_1_0_1_1());
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }

            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1401:3: ( (lv_right_4_0= ruleAddition ) )
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1402:1: (lv_right_4_0= ruleAddition )
            	    {
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1402:1: (lv_right_4_0= ruleAddition )
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1403:3: lv_right_4_0= ruleAddition
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAndAccess().getRightAdditionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAddition_in_ruleAnd3197);
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
    // $ANTLR end "ruleAnd"


    // $ANTLR start "entryRuleAddition"
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1427:1: entryRuleAddition returns [EObject current=null] : iv_ruleAddition= ruleAddition EOF ;
    public final EObject entryRuleAddition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddition = null;


        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1428:2: (iv_ruleAddition= ruleAddition EOF )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1429:2: iv_ruleAddition= ruleAddition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAdditionRule()); 
            }
            pushFollow(FOLLOW_ruleAddition_in_entryRuleAddition3235);
            iv_ruleAddition=ruleAddition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAddition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAddition3245); if (state.failed) return current;

            }

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
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1436:1: ruleAddition returns [EObject current=null] : (this_Multiplication_0= ruleMultiplication ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )* ) ;
    public final EObject ruleAddition() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_Multiplication_0 = null;

        EObject lv_right_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1439:28: ( (this_Multiplication_0= ruleMultiplication ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )* ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1440:1: (this_Multiplication_0= ruleMultiplication ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )* )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1440:1: (this_Multiplication_0= ruleMultiplication ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )* )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1441:5: this_Multiplication_0= ruleMultiplication ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getAdditionAccess().getMultiplicationParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleMultiplication_in_ruleAddition3292);
            this_Multiplication_0=ruleMultiplication();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_Multiplication_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1449:1: ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=41 && LA19_0<=42)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1449:2: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplication ) )
            	    {
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1449:2: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) )
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
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1449:3: ( () otherlv_2= '+' )
            	            {
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1449:3: ( () otherlv_2= '+' )
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1449:4: () otherlv_2= '+'
            	            {
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1449:4: ()
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1450:5: 
            	            {
            	            if ( state.backtracking==0 ) {

            	                      current = forceCreateModelElementAndSet(
            	                          grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0(),
            	                          current);
            	                  
            	            }

            	            }

            	            otherlv_2=(Token)match(input,41,FOLLOW_41_in_ruleAddition3315); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_2, grammarAccess.getAdditionAccess().getPlusSignKeyword_1_0_0_1());
            	                  
            	            }

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1460:6: ( () otherlv_4= '-' )
            	            {
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1460:6: ( () otherlv_4= '-' )
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1460:7: () otherlv_4= '-'
            	            {
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1460:7: ()
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1461:5: 
            	            {
            	            if ( state.backtracking==0 ) {

            	                      current = forceCreateModelElementAndSet(
            	                          grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0(),
            	                          current);
            	                  
            	            }

            	            }

            	            otherlv_4=(Token)match(input,42,FOLLOW_42_in_ruleAddition3344); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_4, grammarAccess.getAdditionAccess().getHyphenMinusKeyword_1_0_1_1());
            	                  
            	            }

            	            }


            	            }
            	            break;

            	    }

            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1470:3: ( (lv_right_5_0= ruleMultiplication ) )
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1471:1: (lv_right_5_0= ruleMultiplication )
            	    {
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1471:1: (lv_right_5_0= ruleMultiplication )
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1472:3: lv_right_5_0= ruleMultiplication
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAdditionAccess().getRightMultiplicationParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleMultiplication_in_ruleAddition3367);
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
    // $ANTLR end "ruleAddition"


    // $ANTLR start "entryRuleMultiplication"
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1496:1: entryRuleMultiplication returns [EObject current=null] : iv_ruleMultiplication= ruleMultiplication EOF ;
    public final EObject entryRuleMultiplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplication = null;


        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1497:2: (iv_ruleMultiplication= ruleMultiplication EOF )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1498:2: iv_ruleMultiplication= ruleMultiplication EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultiplicationRule()); 
            }
            pushFollow(FOLLOW_ruleMultiplication_in_entryRuleMultiplication3405);
            iv_ruleMultiplication=ruleMultiplication();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMultiplication; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiplication3415); if (state.failed) return current;

            }

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
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1505:1: ruleMultiplication returns [EObject current=null] : (this_PrimaryExpression_0= rulePrimaryExpression ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimaryExpression ) ) )* ) ;
    public final EObject ruleMultiplication() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_PrimaryExpression_0 = null;

        EObject lv_right_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1508:28: ( (this_PrimaryExpression_0= rulePrimaryExpression ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimaryExpression ) ) )* ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1509:1: (this_PrimaryExpression_0= rulePrimaryExpression ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimaryExpression ) ) )* )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1509:1: (this_PrimaryExpression_0= rulePrimaryExpression ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimaryExpression ) ) )* )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1510:5: this_PrimaryExpression_0= rulePrimaryExpression ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimaryExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getMultiplicationAccess().getPrimaryExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_rulePrimaryExpression_in_ruleMultiplication3462);
            this_PrimaryExpression_0=rulePrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_PrimaryExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1518:1: ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimaryExpression ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=43 && LA21_0<=44)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1518:2: ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimaryExpression ) )
            	    {
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1518:2: ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) )
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
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1518:3: ( () otherlv_2= '*' )
            	            {
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1518:3: ( () otherlv_2= '*' )
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1518:4: () otherlv_2= '*'
            	            {
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1518:4: ()
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1519:5: 
            	            {
            	            if ( state.backtracking==0 ) {

            	                      current = forceCreateModelElementAndSet(
            	                          grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0_0_0(),
            	                          current);
            	                  
            	            }

            	            }

            	            otherlv_2=(Token)match(input,43,FOLLOW_43_in_ruleMultiplication3485); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_2, grammarAccess.getMultiplicationAccess().getAsteriskKeyword_1_0_0_1());
            	                  
            	            }

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1529:6: ( () otherlv_4= '/' )
            	            {
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1529:6: ( () otherlv_4= '/' )
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1529:7: () otherlv_4= '/'
            	            {
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1529:7: ()
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1530:5: 
            	            {
            	            if ( state.backtracking==0 ) {

            	                      current = forceCreateModelElementAndSet(
            	                          grammarAccess.getMultiplicationAccess().getDivLeftAction_1_0_1_0(),
            	                          current);
            	                  
            	            }

            	            }

            	            otherlv_4=(Token)match(input,44,FOLLOW_44_in_ruleMultiplication3514); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_4, grammarAccess.getMultiplicationAccess().getSolidusKeyword_1_0_1_1());
            	                  
            	            }

            	            }


            	            }
            	            break;

            	    }

            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1539:3: ( (lv_right_5_0= rulePrimaryExpression ) )
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1540:1: (lv_right_5_0= rulePrimaryExpression )
            	    {
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1540:1: (lv_right_5_0= rulePrimaryExpression )
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1541:3: lv_right_5_0= rulePrimaryExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMultiplicationAccess().getRightPrimaryExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulePrimaryExpression_in_ruleMultiplication3537);
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
    // $ANTLR end "ruleMultiplication"


    // $ANTLR start "entryRulePrimaryExpression"
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1565:1: entryRulePrimaryExpression returns [EObject current=null] : iv_rulePrimaryExpression= rulePrimaryExpression EOF ;
    public final EObject entryRulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpression = null;


        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1566:2: (iv_rulePrimaryExpression= rulePrimaryExpression EOF )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1567:2: iv_rulePrimaryExpression= rulePrimaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimaryExpressionRule()); 
            }
            pushFollow(FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression3575);
            iv_rulePrimaryExpression=rulePrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimaryExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimaryExpression3585); if (state.failed) return current;

            }

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
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1574:1: rulePrimaryExpression returns [EObject current=null] : ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () ( (lv_value_4_0= RULE_REAL ) ) ) | ( () ( (lv_value_6_0= RULE_INT ) ) ) | this_FunctionCall_7= ruleFunctionCall | this_VariableReference_8= ruleVariableReference | ( () ( (lv_value_10_0= RULE_STRING ) ) ) | this_ArrayLiteral_11= ruleArrayLiteral ) ;
    public final EObject rulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_value_4_0=null;
        Token lv_value_6_0=null;
        Token lv_value_10_0=null;
        EObject this_Expression_1 = null;

        EObject this_FunctionCall_7 = null;

        EObject this_VariableReference_8 = null;

        EObject this_ArrayLiteral_11 = null;


         enterRule(); 
            
        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1577:28: ( ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () ( (lv_value_4_0= RULE_REAL ) ) ) | ( () ( (lv_value_6_0= RULE_INT ) ) ) | this_FunctionCall_7= ruleFunctionCall | this_VariableReference_8= ruleVariableReference | ( () ( (lv_value_10_0= RULE_STRING ) ) ) | this_ArrayLiteral_11= ruleArrayLiteral ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1578:1: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () ( (lv_value_4_0= RULE_REAL ) ) ) | ( () ( (lv_value_6_0= RULE_INT ) ) ) | this_FunctionCall_7= ruleFunctionCall | this_VariableReference_8= ruleVariableReference | ( () ( (lv_value_10_0= RULE_STRING ) ) ) | this_ArrayLiteral_11= ruleArrayLiteral )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1578:1: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () ( (lv_value_4_0= RULE_REAL ) ) ) | ( () ( (lv_value_6_0= RULE_INT ) ) ) | this_FunctionCall_7= ruleFunctionCall | this_VariableReference_8= ruleVariableReference | ( () ( (lv_value_10_0= RULE_STRING ) ) ) | this_ArrayLiteral_11= ruleArrayLiteral )
            int alt22=7;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt22=1;
                }
                break;
            case RULE_REAL:
                {
                alt22=2;
                }
                break;
            case RULE_INT:
                {
                alt22=3;
                }
                break;
            case RULE_ID:
                {
                int LA22_4 = input.LA(2);

                if ( (LA22_4==EOF||LA22_4==12||LA22_4==18||(LA22_4>=23 && LA22_4<=24)||LA22_4==26||(LA22_4>=29 && LA22_4<=46)) ) {
                    alt22=5;
                }
                else if ( (LA22_4==17) ) {
                    alt22=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 22, 4, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
                {
                alt22=6;
                }
                break;
            case 45:
                {
                alt22=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1578:2: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1578:2: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1578:4: otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,17,FOLLOW_17_in_rulePrimaryExpression3623); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getExpressionParserRuleCall_0_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExpression_in_rulePrimaryExpression3645);
                    this_Expression_1=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Expression_1; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_2=(Token)match(input,18,FOLLOW_18_in_rulePrimaryExpression3656); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_0_2());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1596:6: ( () ( (lv_value_4_0= RULE_REAL ) ) )
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1596:6: ( () ( (lv_value_4_0= RULE_REAL ) ) )
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1596:7: () ( (lv_value_4_0= RULE_REAL ) )
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1596:7: ()
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1597:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getPrimaryExpressionAccess().getRealLiteralAction_1_0(),
                                  current);
                          
                    }

                    }

                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1602:2: ( (lv_value_4_0= RULE_REAL ) )
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1603:1: (lv_value_4_0= RULE_REAL )
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1603:1: (lv_value_4_0= RULE_REAL )
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1604:3: lv_value_4_0= RULE_REAL
                    {
                    lv_value_4_0=(Token)match(input,RULE_REAL,FOLLOW_RULE_REAL_in_rulePrimaryExpression3690); if (state.failed) return current;
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
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1621:6: ( () ( (lv_value_6_0= RULE_INT ) ) )
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1621:6: ( () ( (lv_value_6_0= RULE_INT ) ) )
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1621:7: () ( (lv_value_6_0= RULE_INT ) )
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1621:7: ()
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1622:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getPrimaryExpressionAccess().getIntLiteralAction_2_0(),
                                  current);
                          
                    }

                    }

                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1627:2: ( (lv_value_6_0= RULE_INT ) )
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1628:1: (lv_value_6_0= RULE_INT )
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1628:1: (lv_value_6_0= RULE_INT )
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1629:3: lv_value_6_0= RULE_INT
                    {
                    lv_value_6_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_rulePrimaryExpression3729); if (state.failed) return current;
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
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1647:5: this_FunctionCall_7= ruleFunctionCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getFunctionCallParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleFunctionCall_in_rulePrimaryExpression3763);
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
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1657:5: this_VariableReference_8= ruleVariableReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getVariableReferenceParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleVariableReference_in_rulePrimaryExpression3790);
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
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1666:6: ( () ( (lv_value_10_0= RULE_STRING ) ) )
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1666:6: ( () ( (lv_value_10_0= RULE_STRING ) ) )
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1666:7: () ( (lv_value_10_0= RULE_STRING ) )
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1666:7: ()
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1667:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getPrimaryExpressionAccess().getStringLiteralAction_5_0(),
                                  current);
                          
                    }

                    }

                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1672:2: ( (lv_value_10_0= RULE_STRING ) )
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1673:1: (lv_value_10_0= RULE_STRING )
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1673:1: (lv_value_10_0= RULE_STRING )
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1674:3: lv_value_10_0= RULE_STRING
                    {
                    lv_value_10_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePrimaryExpression3822); if (state.failed) return current;
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
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1692:5: this_ArrayLiteral_11= ruleArrayLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getArrayLiteralParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleArrayLiteral_in_rulePrimaryExpression3856);
                    this_ArrayLiteral_11=ruleArrayLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ArrayLiteral_11; 
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
    // $ANTLR end "rulePrimaryExpression"


    // $ANTLR start "entryRuleArrayLiteral"
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1708:1: entryRuleArrayLiteral returns [EObject current=null] : iv_ruleArrayLiteral= ruleArrayLiteral EOF ;
    public final EObject entryRuleArrayLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayLiteral = null;


        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1709:2: (iv_ruleArrayLiteral= ruleArrayLiteral EOF )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1710:2: iv_ruleArrayLiteral= ruleArrayLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArrayLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleArrayLiteral_in_entryRuleArrayLiteral3891);
            iv_ruleArrayLiteral=ruleArrayLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArrayLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleArrayLiteral3901); if (state.failed) return current;

            }

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
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1717:1: ruleArrayLiteral returns [EObject current=null] : (otherlv_0= '[' otherlv_1= '(' ( (lv_values_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleExpression ) ) )* otherlv_5= ']' ) ;
    public final EObject ruleArrayLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_values_2_0 = null;

        EObject lv_values_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1720:28: ( (otherlv_0= '[' otherlv_1= '(' ( (lv_values_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleExpression ) ) )* otherlv_5= ']' ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1721:1: (otherlv_0= '[' otherlv_1= '(' ( (lv_values_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleExpression ) ) )* otherlv_5= ']' )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1721:1: (otherlv_0= '[' otherlv_1= '(' ( (lv_values_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleExpression ) ) )* otherlv_5= ']' )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1721:3: otherlv_0= '[' otherlv_1= '(' ( (lv_values_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleExpression ) ) )* otherlv_5= ']'
            {
            otherlv_0=(Token)match(input,45,FOLLOW_45_in_ruleArrayLiteral3938); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getArrayLiteralAccess().getLeftSquareBracketKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleArrayLiteral3950); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getArrayLiteralAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1729:1: ( (lv_values_2_0= ruleExpression ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1730:1: (lv_values_2_0= ruleExpression )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1730:1: (lv_values_2_0= ruleExpression )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1731:3: lv_values_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getArrayLiteralAccess().getValuesExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleArrayLiteral3971);
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

            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1747:2: (otherlv_3= ',' ( (lv_values_4_0= ruleExpression ) ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==26) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1747:4: otherlv_3= ',' ( (lv_values_4_0= ruleExpression ) )
            	    {
            	    otherlv_3=(Token)match(input,26,FOLLOW_26_in_ruleArrayLiteral3984); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getArrayLiteralAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1751:1: ( (lv_values_4_0= ruleExpression ) )
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1752:1: (lv_values_4_0= ruleExpression )
            	    {
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1752:1: (lv_values_4_0= ruleExpression )
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1753:3: lv_values_4_0= ruleExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getArrayLiteralAccess().getValuesExpressionParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExpression_in_ruleArrayLiteral4005);
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
            	    break loop23;
                }
            } while (true);

            otherlv_5=(Token)match(input,46,FOLLOW_46_in_ruleArrayLiteral4019); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getArrayLiteralAccess().getRightSquareBracketKeyword_4());
                  
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
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1781:1: entryRuleVariableReference returns [EObject current=null] : iv_ruleVariableReference= ruleVariableReference EOF ;
    public final EObject entryRuleVariableReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableReference = null;


        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1782:2: (iv_ruleVariableReference= ruleVariableReference EOF )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1783:2: iv_ruleVariableReference= ruleVariableReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleVariableReference_in_entryRuleVariableReference4055);
            iv_ruleVariableReference=ruleVariableReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariableReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableReference4065); if (state.failed) return current;

            }

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
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1790:1: ruleVariableReference returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_dimensions_2_0= ruleExpression ) ) otherlv_3= ']' )* ) ;
    public final EObject ruleVariableReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_dimensions_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1793:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_dimensions_2_0= ruleExpression ) ) otherlv_3= ']' )* ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1794:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_dimensions_2_0= ruleExpression ) ) otherlv_3= ']' )* )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1794:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_dimensions_2_0= ruleExpression ) ) otherlv_3= ']' )* )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1794:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_dimensions_2_0= ruleExpression ) ) otherlv_3= ']' )*
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1794:2: ( (otherlv_0= RULE_ID ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1795:1: (otherlv_0= RULE_ID )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1795:1: (otherlv_0= RULE_ID )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1796:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getVariableReferenceRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariableReference4110); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getVariableReferenceAccess().getVariableVariableDeclarationCrossReference_0_0()); 
              	
            }

            }


            }

            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1807:2: (otherlv_1= '[' ( (lv_dimensions_2_0= ruleExpression ) ) otherlv_3= ']' )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==45) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1807:4: otherlv_1= '[' ( (lv_dimensions_2_0= ruleExpression ) ) otherlv_3= ']'
            	    {
            	    otherlv_1=(Token)match(input,45,FOLLOW_45_in_ruleVariableReference4123); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getVariableReferenceAccess().getLeftSquareBracketKeyword_1_0());
            	          
            	    }
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1811:1: ( (lv_dimensions_2_0= ruleExpression ) )
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1812:1: (lv_dimensions_2_0= ruleExpression )
            	    {
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1812:1: (lv_dimensions_2_0= ruleExpression )
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1813:3: lv_dimensions_2_0= ruleExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getVariableReferenceAccess().getDimensionsExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExpression_in_ruleVariableReference4144);
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

            	    otherlv_3=(Token)match(input,46,FOLLOW_46_in_ruleVariableReference4156); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getVariableReferenceAccess().getRightSquareBracketKeyword_1_2());
            	          
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
    // $ANTLR end "ruleVariableReference"


    // $ANTLR start "entryRuleFunctionCall"
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1841:1: entryRuleFunctionCall returns [EObject current=null] : iv_ruleFunctionCall= ruleFunctionCall EOF ;
    public final EObject entryRuleFunctionCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionCall = null;


        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1842:2: (iv_ruleFunctionCall= ruleFunctionCall EOF )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1843:2: iv_ruleFunctionCall= ruleFunctionCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunctionCallRule()); 
            }
            pushFollow(FOLLOW_ruleFunctionCall_in_entryRuleFunctionCall4194);
            iv_ruleFunctionCall=ruleFunctionCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFunctionCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionCall4204); if (state.failed) return current;

            }

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
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1850:1: ruleFunctionCall returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* otherlv_6= ')' ) ;
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
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1853:28: ( ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* otherlv_6= ')' ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1854:1: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* otherlv_6= ')' )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1854:1: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* otherlv_6= ')' )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1854:2: () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* otherlv_6= ')'
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1854:2: ()
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1855:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getFunctionCallAccess().getFunctionCallAction_0(),
                          current);
                  
            }

            }

            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1860:2: ( (otherlv_1= RULE_ID ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1861:1: (otherlv_1= RULE_ID )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1861:1: (otherlv_1= RULE_ID )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1862:3: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getFunctionCallRule());
              	        }
                      
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionCall4258); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_1, grammarAccess.getFunctionCallAccess().getFunctionFunctionDeclarationCrossReference_1_0()); 
              	
            }

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleFunctionCall4270); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getFunctionCallAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1877:1: ( (lv_args_3_0= ruleExpression ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1878:1: (lv_args_3_0= ruleExpression )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1878:1: (lv_args_3_0= ruleExpression )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1879:3: lv_args_3_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFunctionCallAccess().getArgsExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleFunctionCall4291);
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

            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1895:2: (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==26) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1895:4: otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) )
            	    {
            	    otherlv_4=(Token)match(input,26,FOLLOW_26_in_ruleFunctionCall4304); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_4, grammarAccess.getFunctionCallAccess().getCommaKeyword_4_0());
            	          
            	    }
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1899:1: ( (lv_args_5_0= ruleExpression ) )
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1900:1: (lv_args_5_0= ruleExpression )
            	    {
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1900:1: (lv_args_5_0= ruleExpression )
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1901:3: lv_args_5_0= ruleExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getFunctionCallAccess().getArgsExpressionParserRuleCall_4_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExpression_in_ruleFunctionCall4325);
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
            	    break loop25;
                }
            } while (true);

            otherlv_6=(Token)match(input,18,FOLLOW_18_in_ruleFunctionCall4339); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getFunctionCallAccess().getRightParenthesisKeyword_5());
                  
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


    // $ANTLR start "entryRuleInclude"
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1929:1: entryRuleInclude returns [String current=null] : iv_ruleInclude= ruleInclude EOF ;
    public final String entryRuleInclude() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInclude = null;


        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1930:2: (iv_ruleInclude= ruleInclude EOF )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1931:2: iv_ruleInclude= ruleInclude EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIncludeRule()); 
            }
            pushFollow(FOLLOW_ruleInclude_in_entryRuleInclude4376);
            iv_ruleInclude=ruleInclude();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInclude.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInclude4387); if (state.failed) return current;

            }

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
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1938:1: ruleInclude returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'include' kw= '(' kw= '\"' this_ID_3= RULE_ID kw= '\"' kw= ')' kw= ';' ) ;
    public final AntlrDatatypeRuleToken ruleInclude() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_3=null;

         enterRule(); 
            
        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1941:28: ( (kw= 'include' kw= '(' kw= '\"' this_ID_3= RULE_ID kw= '\"' kw= ')' kw= ';' ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1942:1: (kw= 'include' kw= '(' kw= '\"' this_ID_3= RULE_ID kw= '\"' kw= ')' kw= ';' )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1942:1: (kw= 'include' kw= '(' kw= '\"' this_ID_3= RULE_ID kw= '\"' kw= ')' kw= ';' )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1943:2: kw= 'include' kw= '(' kw= '\"' this_ID_3= RULE_ID kw= '\"' kw= ')' kw= ';'
            {
            kw=(Token)match(input,47,FOLLOW_47_in_ruleInclude4425); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getIncludeAccess().getIncludeKeyword_0()); 
                  
            }
            kw=(Token)match(input,17,FOLLOW_17_in_ruleInclude4438); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getIncludeAccess().getLeftParenthesisKeyword_1()); 
                  
            }
            kw=(Token)match(input,48,FOLLOW_48_in_ruleInclude4451); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getIncludeAccess().getQuotationMarkKeyword_2()); 
                  
            }
            this_ID_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInclude4466); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_3);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_3, grammarAccess.getIncludeAccess().getIDTerminalRuleCall_3()); 
                  
            }
            kw=(Token)match(input,48,FOLLOW_48_in_ruleInclude4484); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getIncludeAccess().getQuotationMarkKeyword_4()); 
                  
            }
            kw=(Token)match(input,18,FOLLOW_18_in_ruleInclude4497); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getIncludeAccess().getRightParenthesisKeyword_5()); 
                  
            }
            kw=(Token)match(input,12,FOLLOW_12_in_ruleInclude4510); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getIncludeAccess().getSemicolonKeyword_6()); 
                  
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
        // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:408:4: ( 'else' )
        // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:408:6: 'else'
        {
        match(input,19,FOLLOW_19_in_synpred1_InternalLeek900); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalLeek

    // $ANTLR start synpred2_InternalLeek
    public final void synpred2_InternalLeek_fragment() throws RecognitionException {   
        // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:630:4: ( 'var' )
        // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:630:6: 'var'
        {
        match(input,22,FOLLOW_22_in_synpred2_InternalLeek1433); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_InternalLeek

    // Delegated rules

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
    static final String DFA2_eotS =
        "\14\uffff";
    static final String DFA2_eofS =
        "\14\uffff";
    static final String DFA2_minS =
        "\1\4\4\uffff\1\17\6\uffff";
    static final String DFA2_maxS =
        "\1\57\4\uffff\1\55\6\uffff";
    static final String DFA2_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\uffff\1\6\1\7\1\10\1\12\1\11\1\5";
    static final String DFA2_specialS =
        "\14\uffff}>";
    static final String[] DFA2_transitionS = {
            "\1\5\10\uffff\1\11\2\uffff\1\10\3\uffff\1\7\1\6\1\3\2\uffff\1\4\2\uffff\1\2\22\uffff\1\1",
            "",
            "",
            "",
            "",
            "\1\12\1\uffff\1\13\33\uffff\1\12",
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
            return "119:1: ( ruleInclude | this_GlobalDeclaration_1= ruleGlobalDeclaration | this_LocalDeclaration_2= ruleLocalDeclaration | this_FunctionDeclaration_3= ruleFunctionDeclaration | (this_FunctionCall_4= ruleFunctionCall otherlv_5= ';' ) | this_For_6= ruleFor | this_While_7= ruleWhile | this_If_8= ruleIf | (this_Affectation_9= ruleAffectation otherlv_10= ';' ) | this_StatementBlock_11= ruleStatementBlock )";
        }
    }
 

    public static final BitSet FOLLOW_ruleScript_in_entryRuleScript75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleScript85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleScript130 = new BitSet(new long[]{0x0000800012712012L});
    public static final BitSet FOLLOW_ruleStatement_in_entryRuleStatement166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatement176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInclude_in_ruleStatement217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGlobalDeclaration_in_ruleStatement244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocalDeclaration_in_ruleStatement271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionDeclaration_in_ruleStatement298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionCall_in_ruleStatement326 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleStatement337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFor_in_ruleStatement366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhile_in_ruleStatement393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIf_in_ruleStatement420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAffectation_in_ruleStatement448 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleStatement459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatementBlock_in_ruleStatement488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatementBlock_in_entryRuleStatementBlock523 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatementBlock533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleStatementBlock570 = new BitSet(new long[]{0x0000800012716010L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleStatementBlock600 = new BitSet(new long[]{0x0000800012716010L});
    public static final BitSet FOLLOW_14_in_ruleStatementBlock613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAffectation_in_entryRuleAffectation649 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAffectation659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableReference_in_ruleAffectation705 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleAffectation717 = new BitSet(new long[]{0x00002000000200F0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleAffectation738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIf_in_entryRuleIf774 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIf784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleIf821 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleIf833 = new BitSet(new long[]{0x00002000000200F0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleIf854 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleIf866 = new BitSet(new long[]{0x0000800012792010L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleIf887 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_ruleIf908 = new BitSet(new long[]{0x0000800012712010L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleIf930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhile_in_entryRuleWhile968 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWhile978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleWhile1015 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleWhile1027 = new BitSet(new long[]{0x00002000000200F0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleWhile1048 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleWhile1060 = new BitSet(new long[]{0x0000800012712010L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleWhile1081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFor_in_entryRuleFor1117 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFor1127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleFor1164 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleFor1176 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_ruleForIterator_in_ruleFor1197 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleFor1209 = new BitSet(new long[]{0x0000800012712010L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleFor1230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForIterator_in_entryRuleForIterator1266 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleForIterator1276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEachIterator_in_ruleForIterator1323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableIterator_in_ruleForIterator1350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEachIterator_in_entryRuleEachIterator1385 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEachIterator1395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleEachIterator1441 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_ruleEachIterator1463 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleEachIterator1475 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleEachIterator1489 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_ruleEachIterator1510 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleEachIterator1522 = new BitSet(new long[]{0x00002000000200F0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleEachIterator1543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableIterator_in_entryRuleVariableIterator1579 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableIterator1589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAffectation_in_ruleVariableIterator1635 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleVariableIterator1647 = new BitSet(new long[]{0x00002000000200F0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleVariableIterator1668 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleVariableIterator1680 = new BitSet(new long[]{0x00002000000200F0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleVariableIterator1701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionDeclaration_in_entryRuleFunctionDeclaration1737 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionDeclaration1747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleFunctionDeclaration1784 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionDeclaration1801 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleFunctionDeclaration1818 = new BitSet(new long[]{0x0000000008040000L});
    public static final BitSet FOLLOW_ruleParameterDeclaration_in_ruleFunctionDeclaration1840 = new BitSet(new long[]{0x0000000004040000L});
    public static final BitSet FOLLOW_26_in_ruleFunctionDeclaration1853 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_ruleParameterDeclaration_in_ruleFunctionDeclaration1874 = new BitSet(new long[]{0x0000000004040000L});
    public static final BitSet FOLLOW_18_in_ruleFunctionDeclaration1890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterDeclaration_in_entryRuleParameterDeclaration1926 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameterDeclaration1936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleParameterDeclaration1979 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleParameterDeclaration2009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocalDeclaration_in_entryRuleLocalDeclaration2050 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLocalDeclaration2060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleLocalDeclaration2097 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_ruleLocalDeclaration2118 = new BitSet(new long[]{0x0000000004001000L});
    public static final BitSet FOLLOW_26_in_ruleLocalDeclaration2131 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_ruleLocalDeclaration2152 = new BitSet(new long[]{0x0000000004001000L});
    public static final BitSet FOLLOW_12_in_ruleLocalDeclaration2166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGlobalDeclaration_in_entryRuleGlobalDeclaration2202 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGlobalDeclaration2212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleGlobalDeclaration2249 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_ruleGlobalDeclaration2270 = new BitSet(new long[]{0x0000000004001000L});
    public static final BitSet FOLLOW_26_in_ruleGlobalDeclaration2283 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_ruleGlobalDeclaration2304 = new BitSet(new long[]{0x0000000004001000L});
    public static final BitSet FOLLOW_12_in_ruleGlobalDeclaration2318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_entryRuleVariableDeclaration2354 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableDeclaration2364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariableDeclaration2406 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_ruleVariableDeclaration2424 = new BitSet(new long[]{0x00002000000200F0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleVariableDeclaration2445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression2483 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression2493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparison_in_ruleExpression2539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparison_in_entryRuleComparison2573 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComparison2583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOr_in_ruleComparison2630 = new BitSet(new long[]{0x0000001FE0000002L});
    public static final BitSet FOLLOW_29_in_ruleComparison2653 = new BitSet(new long[]{0x00002000000200F0L});
    public static final BitSet FOLLOW_30_in_ruleComparison2682 = new BitSet(new long[]{0x00002000000200F0L});
    public static final BitSet FOLLOW_31_in_ruleComparison2711 = new BitSet(new long[]{0x00002000000200F0L});
    public static final BitSet FOLLOW_32_in_ruleComparison2740 = new BitSet(new long[]{0x00002000000200F0L});
    public static final BitSet FOLLOW_33_in_ruleComparison2769 = new BitSet(new long[]{0x00002000000200F0L});
    public static final BitSet FOLLOW_34_in_ruleComparison2798 = new BitSet(new long[]{0x00002000000200F0L});
    public static final BitSet FOLLOW_35_in_ruleComparison2827 = new BitSet(new long[]{0x00002000000200F0L});
    public static final BitSet FOLLOW_36_in_ruleComparison2856 = new BitSet(new long[]{0x00002000000200F0L});
    public static final BitSet FOLLOW_ruleOr_in_ruleComparison2879 = new BitSet(new long[]{0x0000001FE0000002L});
    public static final BitSet FOLLOW_ruleOr_in_entryRuleOr2917 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOr2927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnd_in_ruleOr2974 = new BitSet(new long[]{0x0000006000000002L});
    public static final BitSet FOLLOW_37_in_ruleOr2997 = new BitSet(new long[]{0x00002000000200F0L});
    public static final BitSet FOLLOW_38_in_ruleOr3015 = new BitSet(new long[]{0x00002000000200F0L});
    public static final BitSet FOLLOW_ruleAnd_in_ruleOr3038 = new BitSet(new long[]{0x0000006000000002L});
    public static final BitSet FOLLOW_ruleAnd_in_entryRuleAnd3076 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnd3086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddition_in_ruleAnd3133 = new BitSet(new long[]{0x0000018000000002L});
    public static final BitSet FOLLOW_39_in_ruleAnd3156 = new BitSet(new long[]{0x00002000000200F0L});
    public static final BitSet FOLLOW_40_in_ruleAnd3174 = new BitSet(new long[]{0x00002000000200F0L});
    public static final BitSet FOLLOW_ruleAddition_in_ruleAnd3197 = new BitSet(new long[]{0x0000018000000002L});
    public static final BitSet FOLLOW_ruleAddition_in_entryRuleAddition3235 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAddition3245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplication_in_ruleAddition3292 = new BitSet(new long[]{0x0000060000000002L});
    public static final BitSet FOLLOW_41_in_ruleAddition3315 = new BitSet(new long[]{0x00002000000200F0L});
    public static final BitSet FOLLOW_42_in_ruleAddition3344 = new BitSet(new long[]{0x00002000000200F0L});
    public static final BitSet FOLLOW_ruleMultiplication_in_ruleAddition3367 = new BitSet(new long[]{0x0000060000000002L});
    public static final BitSet FOLLOW_ruleMultiplication_in_entryRuleMultiplication3405 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiplication3415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_ruleMultiplication3462 = new BitSet(new long[]{0x0000180000000002L});
    public static final BitSet FOLLOW_43_in_ruleMultiplication3485 = new BitSet(new long[]{0x00002000000200F0L});
    public static final BitSet FOLLOW_44_in_ruleMultiplication3514 = new BitSet(new long[]{0x00002000000200F0L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_ruleMultiplication3537 = new BitSet(new long[]{0x0000180000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression3575 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimaryExpression3585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rulePrimaryExpression3623 = new BitSet(new long[]{0x00002000000200F0L});
    public static final BitSet FOLLOW_ruleExpression_in_rulePrimaryExpression3645 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_rulePrimaryExpression3656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_REAL_in_rulePrimaryExpression3690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rulePrimaryExpression3729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionCall_in_rulePrimaryExpression3763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableReference_in_rulePrimaryExpression3790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePrimaryExpression3822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayLiteral_in_rulePrimaryExpression3856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayLiteral_in_entryRuleArrayLiteral3891 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArrayLiteral3901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleArrayLiteral3938 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleArrayLiteral3950 = new BitSet(new long[]{0x00002000000200F0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleArrayLiteral3971 = new BitSet(new long[]{0x0000400004000000L});
    public static final BitSet FOLLOW_26_in_ruleArrayLiteral3984 = new BitSet(new long[]{0x00002000000200F0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleArrayLiteral4005 = new BitSet(new long[]{0x0000400004000000L});
    public static final BitSet FOLLOW_46_in_ruleArrayLiteral4019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableReference_in_entryRuleVariableReference4055 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableReference4065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariableReference4110 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_45_in_ruleVariableReference4123 = new BitSet(new long[]{0x00002000000200F0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleVariableReference4144 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleVariableReference4156 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_ruleFunctionCall_in_entryRuleFunctionCall4194 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionCall4204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionCall4258 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleFunctionCall4270 = new BitSet(new long[]{0x00002000000200F0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleFunctionCall4291 = new BitSet(new long[]{0x0000000004040000L});
    public static final BitSet FOLLOW_26_in_ruleFunctionCall4304 = new BitSet(new long[]{0x00002000000200F0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleFunctionCall4325 = new BitSet(new long[]{0x0000000004040000L});
    public static final BitSet FOLLOW_18_in_ruleFunctionCall4339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInclude_in_entryRuleInclude4376 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInclude4387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleInclude4425 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleInclude4438 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleInclude4451 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInclude4466 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleInclude4484 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleInclude4497 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleInclude4510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_synpred1_InternalLeek900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_synpred2_InternalLeek1433 = new BitSet(new long[]{0x0000000000000002L});

}