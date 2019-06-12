// Generated from src/JCLParser.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JCLParser}.
 */
public interface JCLParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JCLParser#startRule}.
	 * @param ctx the parse tree
	 */
	void enterStartRule(JCLParser.StartRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#startRule}.
	 * @param ctx the parse tree
	 */
	void exitStartRule(JCLParser.StartRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#jcl}.
	 * @param ctx the parse tree
	 */
	void enterJcl(JCLParser.JclContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#jcl}.
	 * @param ctx the parse tree
	 */
	void exitJcl(JCLParser.JclContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#execJCL}.
	 * @param ctx the parse tree
	 */
	void enterExecJCL(JCLParser.ExecJCLContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#execJCL}.
	 * @param ctx the parse tree
	 */
	void exitExecJCL(JCLParser.ExecJCLContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#commentStatement}.
	 * @param ctx the parse tree
	 */
	void enterCommentStatement(JCLParser.CommentStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#commentStatement}.
	 * @param ctx the parse tree
	 */
	void exitCommentStatement(JCLParser.CommentStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#execStatement}.
	 * @param ctx the parse tree
	 */
	void enterExecStatement(JCLParser.ExecStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#execStatement}.
	 * @param ctx the parse tree
	 */
	void exitExecStatement(JCLParser.ExecStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#execParameter}.
	 * @param ctx the parse tree
	 */
	void enterExecParameter(JCLParser.ExecParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#execParameter}.
	 * @param ctx the parse tree
	 */
	void exitExecParameter(JCLParser.ExecParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#execParmACCT}.
	 * @param ctx the parse tree
	 */
	void enterExecParmACCT(JCLParser.ExecParmACCTContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#execParmACCT}.
	 * @param ctx the parse tree
	 */
	void exitExecParmACCT(JCLParser.ExecParmACCTContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#execParmADDRSPC}.
	 * @param ctx the parse tree
	 */
	void enterExecParmADDRSPC(JCLParser.ExecParmADDRSPCContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#execParmADDRSPC}.
	 * @param ctx the parse tree
	 */
	void exitExecParmADDRSPC(JCLParser.ExecParmADDRSPCContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#execParmCCSID}.
	 * @param ctx the parse tree
	 */
	void enterExecParmCCSID(JCLParser.ExecParmCCSIDContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#execParmCCSID}.
	 * @param ctx the parse tree
	 */
	void exitExecParmCCSID(JCLParser.ExecParmCCSIDContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#execParmCOND}.
	 * @param ctx the parse tree
	 */
	void enterExecParmCOND(JCLParser.ExecParmCONDContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#execParmCOND}.
	 * @param ctx the parse tree
	 */
	void exitExecParmCOND(JCLParser.ExecParmCONDContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#execParmDYNAMNBR}.
	 * @param ctx the parse tree
	 */
	void enterExecParmDYNAMNBR(JCLParser.ExecParmDYNAMNBRContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#execParmDYNAMNBR}.
	 * @param ctx the parse tree
	 */
	void exitExecParmDYNAMNBR(JCLParser.ExecParmDYNAMNBRContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#execParmMEMLIMIT}.
	 * @param ctx the parse tree
	 */
	void enterExecParmMEMLIMIT(JCLParser.ExecParmMEMLIMITContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#execParmMEMLIMIT}.
	 * @param ctx the parse tree
	 */
	void exitExecParmMEMLIMIT(JCLParser.ExecParmMEMLIMITContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#execParmPARM}.
	 * @param ctx the parse tree
	 */
	void enterExecParmPARM(JCLParser.ExecParmPARMContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#execParmPARM}.
	 * @param ctx the parse tree
	 */
	void exitExecParmPARM(JCLParser.ExecParmPARMContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#execParmPARMDD}.
	 * @param ctx the parse tree
	 */
	void enterExecParmPARMDD(JCLParser.ExecParmPARMDDContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#execParmPARMDD}.
	 * @param ctx the parse tree
	 */
	void exitExecParmPARMDD(JCLParser.ExecParmPARMDDContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#execParmPERFORM}.
	 * @param ctx the parse tree
	 */
	void enterExecParmPERFORM(JCLParser.ExecParmPERFORMContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#execParmPERFORM}.
	 * @param ctx the parse tree
	 */
	void exitExecParmPERFORM(JCLParser.ExecParmPERFORMContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#execParmRD}.
	 * @param ctx the parse tree
	 */
	void enterExecParmRD(JCLParser.ExecParmRDContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#execParmRD}.
	 * @param ctx the parse tree
	 */
	void exitExecParmRD(JCLParser.ExecParmRDContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#execParmREGION}.
	 * @param ctx the parse tree
	 */
	void enterExecParmREGION(JCLParser.ExecParmREGIONContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#execParmREGION}.
	 * @param ctx the parse tree
	 */
	void exitExecParmREGION(JCLParser.ExecParmREGIONContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#execParmREGIONX}.
	 * @param ctx the parse tree
	 */
	void enterExecParmREGIONX(JCLParser.ExecParmREGIONXContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#execParmREGIONX}.
	 * @param ctx the parse tree
	 */
	void exitExecParmREGIONX(JCLParser.ExecParmREGIONXContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#execParmRLSTMOUT}.
	 * @param ctx the parse tree
	 */
	void enterExecParmRLSTMOUT(JCLParser.ExecParmRLSTMOUTContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#execParmRLSTMOUT}.
	 * @param ctx the parse tree
	 */
	void exitExecParmRLSTMOUT(JCLParser.ExecParmRLSTMOUTContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#execParmTIME}.
	 * @param ctx the parse tree
	 */
	void enterExecParmTIME(JCLParser.ExecParmTIMEContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#execParmTIME}.
	 * @param ctx the parse tree
	 */
	void exitExecParmTIME(JCLParser.ExecParmTIMEContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#execParmTVSMSG}.
	 * @param ctx the parse tree
	 */
	void enterExecParmTVSMSG(JCLParser.ExecParmTVSMSGContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#execParmTVSMSG}.
	 * @param ctx the parse tree
	 */
	void exitExecParmTVSMSG(JCLParser.ExecParmTVSMSGContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#execParmTVSAMCOM}.
	 * @param ctx the parse tree
	 */
	void enterExecParmTVSAMCOM(JCLParser.ExecParmTVSAMCOMContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#execParmTVSAMCOM}.
	 * @param ctx the parse tree
	 */
	void exitExecParmTVSAMCOM(JCLParser.ExecParmTVSAMCOMContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddStatement}.
	 * @param ctx the parse tree
	 */
	void enterDdStatement(JCLParser.DdStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddStatement}.
	 * @param ctx the parse tree
	 */
	void exitDdStatement(JCLParser.DdStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddName}.
	 * @param ctx the parse tree
	 */
	void enterDdName(JCLParser.DdNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddName}.
	 * @param ctx the parse tree
	 */
	void exitDdName(JCLParser.DdNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParameter}.
	 * @param ctx the parse tree
	 */
	void enterDdParameter(JCLParser.DdParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParameter}.
	 * @param ctx the parse tree
	 */
	void exitDdParameter(JCLParser.DdParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmACCODE}.
	 * @param ctx the parse tree
	 */
	void enterDdParmACCODE(JCLParser.DdParmACCODEContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmACCODE}.
	 * @param ctx the parse tree
	 */
	void exitDdParmACCODE(JCLParser.DdParmACCODEContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmAMP}.
	 * @param ctx the parse tree
	 */
	void enterDdParmAMP(JCLParser.DdParmAMPContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmAMP}.
	 * @param ctx the parse tree
	 */
	void exitDdParmAMP(JCLParser.DdParmAMPContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmASTERISK}.
	 * @param ctx the parse tree
	 */
	void enterDdParmASTERISK(JCLParser.DdParmASTERISKContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmASTERISK}.
	 * @param ctx the parse tree
	 */
	void exitDdParmASTERISK(JCLParser.DdParmASTERISKContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmASTERISK_DATA}.
	 * @param ctx the parse tree
	 */
	void enterDdParmASTERISK_DATA(JCLParser.DdParmASTERISK_DATAContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmASTERISK_DATA}.
	 * @param ctx the parse tree
	 */
	void exitDdParmASTERISK_DATA(JCLParser.DdParmASTERISK_DATAContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmAVGREC}.
	 * @param ctx the parse tree
	 */
	void enterDdParmAVGREC(JCLParser.DdParmAVGRECContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmAVGREC}.
	 * @param ctx the parse tree
	 */
	void exitDdParmAVGREC(JCLParser.DdParmAVGRECContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmBLKSIZE}.
	 * @param ctx the parse tree
	 */
	void enterDdParmBLKSIZE(JCLParser.DdParmBLKSIZEContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmBLKSIZE}.
	 * @param ctx the parse tree
	 */
	void exitDdParmBLKSIZE(JCLParser.DdParmBLKSIZEContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmBLKSZLIM}.
	 * @param ctx the parse tree
	 */
	void enterDdParmBLKSZLIM(JCLParser.DdParmBLKSZLIMContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmBLKSZLIM}.
	 * @param ctx the parse tree
	 */
	void exitDdParmBLKSZLIM(JCLParser.DdParmBLKSZLIMContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmBURST}.
	 * @param ctx the parse tree
	 */
	void enterDdParmBURST(JCLParser.DdParmBURSTContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmBURST}.
	 * @param ctx the parse tree
	 */
	void exitDdParmBURST(JCLParser.DdParmBURSTContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmCCSID}.
	 * @param ctx the parse tree
	 */
	void enterDdParmCCSID(JCLParser.DdParmCCSIDContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmCCSID}.
	 * @param ctx the parse tree
	 */
	void exitDdParmCCSID(JCLParser.DdParmCCSIDContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmCHARS}.
	 * @param ctx the parse tree
	 */
	void enterDdParmCHARS(JCLParser.DdParmCHARSContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmCHARS}.
	 * @param ctx the parse tree
	 */
	void exitDdParmCHARS(JCLParser.DdParmCHARSContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmCHKPT}.
	 * @param ctx the parse tree
	 */
	void enterDdParmCHKPT(JCLParser.DdParmCHKPTContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmCHKPT}.
	 * @param ctx the parse tree
	 */
	void exitDdParmCHKPT(JCLParser.DdParmCHKPTContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmCNTL}.
	 * @param ctx the parse tree
	 */
	void enterDdParmCNTL(JCLParser.DdParmCNTLContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmCNTL}.
	 * @param ctx the parse tree
	 */
	void exitDdParmCNTL(JCLParser.DdParmCNTLContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmCOPIES}.
	 * @param ctx the parse tree
	 */
	void enterDdParmCOPIES(JCLParser.DdParmCOPIESContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmCOPIES}.
	 * @param ctx the parse tree
	 */
	void exitDdParmCOPIES(JCLParser.DdParmCOPIESContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmDATA}.
	 * @param ctx the parse tree
	 */
	void enterDdParmDATA(JCLParser.DdParmDATAContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmDATA}.
	 * @param ctx the parse tree
	 */
	void exitDdParmDATA(JCLParser.DdParmDATAContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmDATACLAS}.
	 * @param ctx the parse tree
	 */
	void enterDdParmDATACLAS(JCLParser.DdParmDATACLASContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmDATACLAS}.
	 * @param ctx the parse tree
	 */
	void exitDdParmDATACLAS(JCLParser.DdParmDATACLASContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmDCB}.
	 * @param ctx the parse tree
	 */
	void enterDdParmDCB(JCLParser.DdParmDCBContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmDCB}.
	 * @param ctx the parse tree
	 */
	void exitDdParmDCB(JCLParser.DdParmDCBContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmDDNAME}.
	 * @param ctx the parse tree
	 */
	void enterDdParmDDNAME(JCLParser.DdParmDDNAMEContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmDDNAME}.
	 * @param ctx the parse tree
	 */
	void exitDdParmDDNAME(JCLParser.DdParmDDNAMEContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmDEST}.
	 * @param ctx the parse tree
	 */
	void enterDdParmDEST(JCLParser.DdParmDESTContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmDEST}.
	 * @param ctx the parse tree
	 */
	void exitDdParmDEST(JCLParser.DdParmDESTContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmDISP}.
	 * @param ctx the parse tree
	 */
	void enterDdParmDISP(JCLParser.DdParmDISPContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmDISP}.
	 * @param ctx the parse tree
	 */
	void exitDdParmDISP(JCLParser.DdParmDISPContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmDLM}.
	 * @param ctx the parse tree
	 */
	void enterDdParmDLM(JCLParser.DdParmDLMContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmDLM}.
	 * @param ctx the parse tree
	 */
	void exitDdParmDLM(JCLParser.DdParmDLMContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmDSID}.
	 * @param ctx the parse tree
	 */
	void enterDdParmDSID(JCLParser.DdParmDSIDContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmDSID}.
	 * @param ctx the parse tree
	 */
	void exitDdParmDSID(JCLParser.DdParmDSIDContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmDSKEYLBL}.
	 * @param ctx the parse tree
	 */
	void enterDdParmDSKEYLBL(JCLParser.DdParmDSKEYLBLContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmDSKEYLBL}.
	 * @param ctx the parse tree
	 */
	void exitDdParmDSKEYLBL(JCLParser.DdParmDSKEYLBLContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmDSNAME}.
	 * @param ctx the parse tree
	 */
	void enterDdParmDSNAME(JCLParser.DdParmDSNAMEContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmDSNAME}.
	 * @param ctx the parse tree
	 */
	void exitDdParmDSNAME(JCLParser.DdParmDSNAMEContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmDSNTYPE}.
	 * @param ctx the parse tree
	 */
	void enterDdParmDSNTYPE(JCLParser.DdParmDSNTYPEContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmDSNTYPE}.
	 * @param ctx the parse tree
	 */
	void exitDdParmDSNTYPE(JCLParser.DdParmDSNTYPEContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmDUMMY}.
	 * @param ctx the parse tree
	 */
	void enterDdParmDUMMY(JCLParser.DdParmDUMMYContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmDUMMY}.
	 * @param ctx the parse tree
	 */
	void exitDdParmDUMMY(JCLParser.DdParmDUMMYContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmDYNAM}.
	 * @param ctx the parse tree
	 */
	void enterDdParmDYNAM(JCLParser.DdParmDYNAMContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmDYNAM}.
	 * @param ctx the parse tree
	 */
	void exitDdParmDYNAM(JCLParser.DdParmDYNAMContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmEATTR}.
	 * @param ctx the parse tree
	 */
	void enterDdParmEATTR(JCLParser.DdParmEATTRContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmEATTR}.
	 * @param ctx the parse tree
	 */
	void exitDdParmEATTR(JCLParser.DdParmEATTRContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmEXPDT}.
	 * @param ctx the parse tree
	 */
	void enterDdParmEXPDT(JCLParser.DdParmEXPDTContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmEXPDT}.
	 * @param ctx the parse tree
	 */
	void exitDdParmEXPDT(JCLParser.DdParmEXPDTContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmFCB}.
	 * @param ctx the parse tree
	 */
	void enterDdParmFCB(JCLParser.DdParmFCBContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmFCB}.
	 * @param ctx the parse tree
	 */
	void exitDdParmFCB(JCLParser.DdParmFCBContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmFILEDATA}.
	 * @param ctx the parse tree
	 */
	void enterDdParmFILEDATA(JCLParser.DdParmFILEDATAContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmFILEDATA}.
	 * @param ctx the parse tree
	 */
	void exitDdParmFILEDATA(JCLParser.DdParmFILEDATAContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmFLASH}.
	 * @param ctx the parse tree
	 */
	void enterDdParmFLASH(JCLParser.DdParmFLASHContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmFLASH}.
	 * @param ctx the parse tree
	 */
	void exitDdParmFLASH(JCLParser.DdParmFLASHContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmFREE}.
	 * @param ctx the parse tree
	 */
	void enterDdParmFREE(JCLParser.DdParmFREEContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmFREE}.
	 * @param ctx the parse tree
	 */
	void exitDdParmFREE(JCLParser.DdParmFREEContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmFREEVOL}.
	 * @param ctx the parse tree
	 */
	void enterDdParmFREEVOL(JCLParser.DdParmFREEVOLContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmFREEVOL}.
	 * @param ctx the parse tree
	 */
	void exitDdParmFREEVOL(JCLParser.DdParmFREEVOLContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmGDGORDER}.
	 * @param ctx the parse tree
	 */
	void enterDdParmGDGORDER(JCLParser.DdParmGDGORDERContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmGDGORDER}.
	 * @param ctx the parse tree
	 */
	void exitDdParmGDGORDER(JCLParser.DdParmGDGORDERContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmHOLD}.
	 * @param ctx the parse tree
	 */
	void enterDdParmHOLD(JCLParser.DdParmHOLDContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmHOLD}.
	 * @param ctx the parse tree
	 */
	void exitDdParmHOLD(JCLParser.DdParmHOLDContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmKEYLABL1}.
	 * @param ctx the parse tree
	 */
	void enterDdParmKEYLABL1(JCLParser.DdParmKEYLABL1Context ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmKEYLABL1}.
	 * @param ctx the parse tree
	 */
	void exitDdParmKEYLABL1(JCLParser.DdParmKEYLABL1Context ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmKEYLABL2}.
	 * @param ctx the parse tree
	 */
	void enterDdParmKEYLABL2(JCLParser.DdParmKEYLABL2Context ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmKEYLABL2}.
	 * @param ctx the parse tree
	 */
	void exitDdParmKEYLABL2(JCLParser.DdParmKEYLABL2Context ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmKEYENCD1}.
	 * @param ctx the parse tree
	 */
	void enterDdParmKEYENCD1(JCLParser.DdParmKEYENCD1Context ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmKEYENCD1}.
	 * @param ctx the parse tree
	 */
	void exitDdParmKEYENCD1(JCLParser.DdParmKEYENCD1Context ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmKEYENCD2}.
	 * @param ctx the parse tree
	 */
	void enterDdParmKEYENCD2(JCLParser.DdParmKEYENCD2Context ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmKEYENCD2}.
	 * @param ctx the parse tree
	 */
	void exitDdParmKEYENCD2(JCLParser.DdParmKEYENCD2Context ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmKEYLEN}.
	 * @param ctx the parse tree
	 */
	void enterDdParmKEYLEN(JCLParser.DdParmKEYLENContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmKEYLEN}.
	 * @param ctx the parse tree
	 */
	void exitDdParmKEYLEN(JCLParser.DdParmKEYLENContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmKEYOFF}.
	 * @param ctx the parse tree
	 */
	void enterDdParmKEYOFF(JCLParser.DdParmKEYOFFContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmKEYOFF}.
	 * @param ctx the parse tree
	 */
	void exitDdParmKEYOFF(JCLParser.DdParmKEYOFFContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmLABEL}.
	 * @param ctx the parse tree
	 */
	void enterDdParmLABEL(JCLParser.DdParmLABELContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmLABEL}.
	 * @param ctx the parse tree
	 */
	void exitDdParmLABEL(JCLParser.DdParmLABELContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmLGSTREAM}.
	 * @param ctx the parse tree
	 */
	void enterDdParmLGSTREAM(JCLParser.DdParmLGSTREAMContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmLGSTREAM}.
	 * @param ctx the parse tree
	 */
	void exitDdParmLGSTREAM(JCLParser.DdParmLGSTREAMContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmLIKE}.
	 * @param ctx the parse tree
	 */
	void enterDdParmLIKE(JCLParser.DdParmLIKEContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmLIKE}.
	 * @param ctx the parse tree
	 */
	void exitDdParmLIKE(JCLParser.DdParmLIKEContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmLRECL}.
	 * @param ctx the parse tree
	 */
	void enterDdParmLRECL(JCLParser.DdParmLRECLContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmLRECL}.
	 * @param ctx the parse tree
	 */
	void exitDdParmLRECL(JCLParser.DdParmLRECLContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmMAXGENS}.
	 * @param ctx the parse tree
	 */
	void enterDdParmMAXGENS(JCLParser.DdParmMAXGENSContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmMAXGENS}.
	 * @param ctx the parse tree
	 */
	void exitDdParmMAXGENS(JCLParser.DdParmMAXGENSContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmMGMTCLAS}.
	 * @param ctx the parse tree
	 */
	void enterDdParmMGMTCLAS(JCLParser.DdParmMGMTCLASContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmMGMTCLAS}.
	 * @param ctx the parse tree
	 */
	void exitDdParmMGMTCLAS(JCLParser.DdParmMGMTCLASContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmMODIFY}.
	 * @param ctx the parse tree
	 */
	void enterDdParmMODIFY(JCLParser.DdParmMODIFYContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmMODIFY}.
	 * @param ctx the parse tree
	 */
	void exitDdParmMODIFY(JCLParser.DdParmMODIFYContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmOUTLIM}.
	 * @param ctx the parse tree
	 */
	void enterDdParmOUTLIM(JCLParser.DdParmOUTLIMContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmOUTLIM}.
	 * @param ctx the parse tree
	 */
	void exitDdParmOUTLIM(JCLParser.DdParmOUTLIMContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmOUTPUT}.
	 * @param ctx the parse tree
	 */
	void enterDdParmOUTPUT(JCLParser.DdParmOUTPUTContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmOUTPUT}.
	 * @param ctx the parse tree
	 */
	void exitDdParmOUTPUT(JCLParser.DdParmOUTPUTContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmPATH}.
	 * @param ctx the parse tree
	 */
	void enterDdParmPATH(JCLParser.DdParmPATHContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmPATH}.
	 * @param ctx the parse tree
	 */
	void exitDdParmPATH(JCLParser.DdParmPATHContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmPATHDISP}.
	 * @param ctx the parse tree
	 */
	void enterDdParmPATHDISP(JCLParser.DdParmPATHDISPContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmPATHDISP}.
	 * @param ctx the parse tree
	 */
	void exitDdParmPATHDISP(JCLParser.DdParmPATHDISPContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmPATHMODE}.
	 * @param ctx the parse tree
	 */
	void enterDdParmPATHMODE(JCLParser.DdParmPATHMODEContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmPATHMODE}.
	 * @param ctx the parse tree
	 */
	void exitDdParmPATHMODE(JCLParser.DdParmPATHMODEContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmPATHOPTS}.
	 * @param ctx the parse tree
	 */
	void enterDdParmPATHOPTS(JCLParser.DdParmPATHOPTSContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmPATHOPTS}.
	 * @param ctx the parse tree
	 */
	void exitDdParmPATHOPTS(JCLParser.DdParmPATHOPTSContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmPROTECT}.
	 * @param ctx the parse tree
	 */
	void enterDdParmPROTECT(JCLParser.DdParmPROTECTContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmPROTECT}.
	 * @param ctx the parse tree
	 */
	void exitDdParmPROTECT(JCLParser.DdParmPROTECTContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmRECFM}.
	 * @param ctx the parse tree
	 */
	void enterDdParmRECFM(JCLParser.DdParmRECFMContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmRECFM}.
	 * @param ctx the parse tree
	 */
	void exitDdParmRECFM(JCLParser.DdParmRECFMContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmRECORG}.
	 * @param ctx the parse tree
	 */
	void enterDdParmRECORG(JCLParser.DdParmRECORGContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmRECORG}.
	 * @param ctx the parse tree
	 */
	void exitDdParmRECORG(JCLParser.DdParmRECORGContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmREFDD}.
	 * @param ctx the parse tree
	 */
	void enterDdParmREFDD(JCLParser.DdParmREFDDContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmREFDD}.
	 * @param ctx the parse tree
	 */
	void exitDdParmREFDD(JCLParser.DdParmREFDDContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmRETPD}.
	 * @param ctx the parse tree
	 */
	void enterDdParmRETPD(JCLParser.DdParmRETPDContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmRETPD}.
	 * @param ctx the parse tree
	 */
	void exitDdParmRETPD(JCLParser.DdParmRETPDContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmRLS}.
	 * @param ctx the parse tree
	 */
	void enterDdParmRLS(JCLParser.DdParmRLSContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmRLS}.
	 * @param ctx the parse tree
	 */
	void exitDdParmRLS(JCLParser.DdParmRLSContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmROACCESS}.
	 * @param ctx the parse tree
	 */
	void enterDdParmROACCESS(JCLParser.DdParmROACCESSContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmROACCESS}.
	 * @param ctx the parse tree
	 */
	void exitDdParmROACCESS(JCLParser.DdParmROACCESSContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmSECMODEL}.
	 * @param ctx the parse tree
	 */
	void enterDdParmSECMODEL(JCLParser.DdParmSECMODELContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmSECMODEL}.
	 * @param ctx the parse tree
	 */
	void exitDdParmSECMODEL(JCLParser.DdParmSECMODELContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmSEGMENT}.
	 * @param ctx the parse tree
	 */
	void enterDdParmSEGMENT(JCLParser.DdParmSEGMENTContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmSEGMENT}.
	 * @param ctx the parse tree
	 */
	void exitDdParmSEGMENT(JCLParser.DdParmSEGMENTContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmSPACE}.
	 * @param ctx the parse tree
	 */
	void enterDdParmSPACE(JCLParser.DdParmSPACEContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmSPACE}.
	 * @param ctx the parse tree
	 */
	void exitDdParmSPACE(JCLParser.DdParmSPACEContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmSPIN}.
	 * @param ctx the parse tree
	 */
	void enterDdParmSPIN(JCLParser.DdParmSPINContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmSPIN}.
	 * @param ctx the parse tree
	 */
	void exitDdParmSPIN(JCLParser.DdParmSPINContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmSTORCLAS}.
	 * @param ctx the parse tree
	 */
	void enterDdParmSTORCLAS(JCLParser.DdParmSTORCLASContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmSTORCLAS}.
	 * @param ctx the parse tree
	 */
	void exitDdParmSTORCLAS(JCLParser.DdParmSTORCLASContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmSUBSYS}.
	 * @param ctx the parse tree
	 */
	void enterDdParmSUBSYS(JCLParser.DdParmSUBSYSContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmSUBSYS}.
	 * @param ctx the parse tree
	 */
	void exitDdParmSUBSYS(JCLParser.DdParmSUBSYSContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmSYMBOLS}.
	 * @param ctx the parse tree
	 */
	void enterDdParmSYMBOLS(JCLParser.DdParmSYMBOLSContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmSYMBOLS}.
	 * @param ctx the parse tree
	 */
	void exitDdParmSYMBOLS(JCLParser.DdParmSYMBOLSContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmSYMLIST}.
	 * @param ctx the parse tree
	 */
	void enterDdParmSYMLIST(JCLParser.DdParmSYMLISTContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmSYMLIST}.
	 * @param ctx the parse tree
	 */
	void exitDdParmSYMLIST(JCLParser.DdParmSYMLISTContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmSYSOUT}.
	 * @param ctx the parse tree
	 */
	void enterDdParmSYSOUT(JCLParser.DdParmSYSOUTContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmSYSOUT}.
	 * @param ctx the parse tree
	 */
	void exitDdParmSYSOUT(JCLParser.DdParmSYSOUTContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmTERM}.
	 * @param ctx the parse tree
	 */
	void enterDdParmTERM(JCLParser.DdParmTERMContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmTERM}.
	 * @param ctx the parse tree
	 */
	void exitDdParmTERM(JCLParser.DdParmTERMContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmUCS}.
	 * @param ctx the parse tree
	 */
	void enterDdParmUCS(JCLParser.DdParmUCSContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmUCS}.
	 * @param ctx the parse tree
	 */
	void exitDdParmUCS(JCLParser.DdParmUCSContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmUNIT}.
	 * @param ctx the parse tree
	 */
	void enterDdParmUNIT(JCLParser.DdParmUNITContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmUNIT}.
	 * @param ctx the parse tree
	 */
	void exitDdParmUNIT(JCLParser.DdParmUNITContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmVOLUME}.
	 * @param ctx the parse tree
	 */
	void enterDdParmVOLUME(JCLParser.DdParmVOLUMEContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmVOLUME}.
	 * @param ctx the parse tree
	 */
	void exitDdParmVOLUME(JCLParser.DdParmVOLUMEContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmAMP_Parameter}.
	 * @param ctx the parse tree
	 */
	void enterDdParmAMP_Parameter(JCLParser.DdParmAMP_ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmAMP_Parameter}.
	 * @param ctx the parse tree
	 */
	void exitDdParmAMP_Parameter(JCLParser.DdParmAMP_ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmAMP_ACCBIAS}.
	 * @param ctx the parse tree
	 */
	void enterDdParmAMP_ACCBIAS(JCLParser.DdParmAMP_ACCBIASContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmAMP_ACCBIAS}.
	 * @param ctx the parse tree
	 */
	void exitDdParmAMP_ACCBIAS(JCLParser.DdParmAMP_ACCBIASContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmAMP_AMORG}.
	 * @param ctx the parse tree
	 */
	void enterDdParmAMP_AMORG(JCLParser.DdParmAMP_AMORGContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmAMP_AMORG}.
	 * @param ctx the parse tree
	 */
	void exitDdParmAMP_AMORG(JCLParser.DdParmAMP_AMORGContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmAMP_BUFND}.
	 * @param ctx the parse tree
	 */
	void enterDdParmAMP_BUFND(JCLParser.DdParmAMP_BUFNDContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmAMP_BUFND}.
	 * @param ctx the parse tree
	 */
	void exitDdParmAMP_BUFND(JCLParser.DdParmAMP_BUFNDContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmAMP_BUFNI}.
	 * @param ctx the parse tree
	 */
	void enterDdParmAMP_BUFNI(JCLParser.DdParmAMP_BUFNIContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmAMP_BUFNI}.
	 * @param ctx the parse tree
	 */
	void exitDdParmAMP_BUFNI(JCLParser.DdParmAMP_BUFNIContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmAMP_BUFSP}.
	 * @param ctx the parse tree
	 */
	void enterDdParmAMP_BUFSP(JCLParser.DdParmAMP_BUFSPContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmAMP_BUFSP}.
	 * @param ctx the parse tree
	 */
	void exitDdParmAMP_BUFSP(JCLParser.DdParmAMP_BUFSPContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmAMP_CROPS}.
	 * @param ctx the parse tree
	 */
	void enterDdParmAMP_CROPS(JCLParser.DdParmAMP_CROPSContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmAMP_CROPS}.
	 * @param ctx the parse tree
	 */
	void exitDdParmAMP_CROPS(JCLParser.DdParmAMP_CROPSContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmAMP_FRLOG}.
	 * @param ctx the parse tree
	 */
	void enterDdParmAMP_FRLOG(JCLParser.DdParmAMP_FRLOGContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmAMP_FRLOG}.
	 * @param ctx the parse tree
	 */
	void exitDdParmAMP_FRLOG(JCLParser.DdParmAMP_FRLOGContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmAMP_MSG}.
	 * @param ctx the parse tree
	 */
	void enterDdParmAMP_MSG(JCLParser.DdParmAMP_MSGContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmAMP_MSG}.
	 * @param ctx the parse tree
	 */
	void exitDdParmAMP_MSG(JCLParser.DdParmAMP_MSGContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmAMP_OPTCD}.
	 * @param ctx the parse tree
	 */
	void enterDdParmAMP_OPTCD(JCLParser.DdParmAMP_OPTCDContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmAMP_OPTCD}.
	 * @param ctx the parse tree
	 */
	void exitDdParmAMP_OPTCD(JCLParser.DdParmAMP_OPTCDContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmAMP_RECFM}.
	 * @param ctx the parse tree
	 */
	void enterDdParmAMP_RECFM(JCLParser.DdParmAMP_RECFMContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmAMP_RECFM}.
	 * @param ctx the parse tree
	 */
	void exitDdParmAMP_RECFM(JCLParser.DdParmAMP_RECFMContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmAMP_RMODE31}.
	 * @param ctx the parse tree
	 */
	void enterDdParmAMP_RMODE31(JCLParser.DdParmAMP_RMODE31Context ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmAMP_RMODE31}.
	 * @param ctx the parse tree
	 */
	void exitDdParmAMP_RMODE31(JCLParser.DdParmAMP_RMODE31Context ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmAMP_SMBDFR}.
	 * @param ctx the parse tree
	 */
	void enterDdParmAMP_SMBDFR(JCLParser.DdParmAMP_SMBDFRContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmAMP_SMBDFR}.
	 * @param ctx the parse tree
	 */
	void exitDdParmAMP_SMBDFR(JCLParser.DdParmAMP_SMBDFRContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmAMP_SMBHWT}.
	 * @param ctx the parse tree
	 */
	void enterDdParmAMP_SMBHWT(JCLParser.DdParmAMP_SMBHWTContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmAMP_SMBHWT}.
	 * @param ctx the parse tree
	 */
	void exitDdParmAMP_SMBHWT(JCLParser.DdParmAMP_SMBHWTContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmAMP_SMBVSP}.
	 * @param ctx the parse tree
	 */
	void enterDdParmAMP_SMBVSP(JCLParser.DdParmAMP_SMBVSPContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmAMP_SMBVSP}.
	 * @param ctx the parse tree
	 */
	void exitDdParmAMP_SMBVSP(JCLParser.DdParmAMP_SMBVSPContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmAMP_SMBVSPI}.
	 * @param ctx the parse tree
	 */
	void enterDdParmAMP_SMBVSPI(JCLParser.DdParmAMP_SMBVSPIContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmAMP_SMBVSPI}.
	 * @param ctx the parse tree
	 */
	void exitDdParmAMP_SMBVSPI(JCLParser.DdParmAMP_SMBVSPIContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmAMP_STRNO}.
	 * @param ctx the parse tree
	 */
	void enterDdParmAMP_STRNO(JCLParser.DdParmAMP_STRNOContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmAMP_STRNO}.
	 * @param ctx the parse tree
	 */
	void exitDdParmAMP_STRNO(JCLParser.DdParmAMP_STRNOContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmAMP_SYNAD}.
	 * @param ctx the parse tree
	 */
	void enterDdParmAMP_SYNAD(JCLParser.DdParmAMP_SYNADContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmAMP_SYNAD}.
	 * @param ctx the parse tree
	 */
	void exitDdParmAMP_SYNAD(JCLParser.DdParmAMP_SYNADContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmAMP_TRACE}.
	 * @param ctx the parse tree
	 */
	void enterDdParmAMP_TRACE(JCLParser.DdParmAMP_TRACEContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmAMP_TRACE}.
	 * @param ctx the parse tree
	 */
	void exitDdParmAMP_TRACE(JCLParser.DdParmAMP_TRACEContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmAMP_TRACE_Parameter}.
	 * @param ctx the parse tree
	 */
	void enterDdParmAMP_TRACE_Parameter(JCLParser.DdParmAMP_TRACE_ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmAMP_TRACE_Parameter}.
	 * @param ctx the parse tree
	 */
	void exitDdParmAMP_TRACE_Parameter(JCLParser.DdParmAMP_TRACE_ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmAMP_TRACE_HOOK}.
	 * @param ctx the parse tree
	 */
	void enterDdParmAMP_TRACE_HOOK(JCLParser.DdParmAMP_TRACE_HOOKContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmAMP_TRACE_HOOK}.
	 * @param ctx the parse tree
	 */
	void exitDdParmAMP_TRACE_HOOK(JCLParser.DdParmAMP_TRACE_HOOKContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmAMP_TRACE_ECODE}.
	 * @param ctx the parse tree
	 */
	void enterDdParmAMP_TRACE_ECODE(JCLParser.DdParmAMP_TRACE_ECODEContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmAMP_TRACE_ECODE}.
	 * @param ctx the parse tree
	 */
	void exitDdParmAMP_TRACE_ECODE(JCLParser.DdParmAMP_TRACE_ECODEContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmAMP_TRACE_KEY}.
	 * @param ctx the parse tree
	 */
	void enterDdParmAMP_TRACE_KEY(JCLParser.DdParmAMP_TRACE_KEYContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmAMP_TRACE_KEY}.
	 * @param ctx the parse tree
	 */
	void exitDdParmAMP_TRACE_KEY(JCLParser.DdParmAMP_TRACE_KEYContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmAMP_TRACE_PARM1}.
	 * @param ctx the parse tree
	 */
	void enterDdParmAMP_TRACE_PARM1(JCLParser.DdParmAMP_TRACE_PARM1Context ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmAMP_TRACE_PARM1}.
	 * @param ctx the parse tree
	 */
	void exitDdParmAMP_TRACE_PARM1(JCLParser.DdParmAMP_TRACE_PARM1Context ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#ddParmAMP_TRACE_PARM2}.
	 * @param ctx the parse tree
	 */
	void enterDdParmAMP_TRACE_PARM2(JCLParser.DdParmAMP_TRACE_PARM2Context ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#ddParmAMP_TRACE_PARM2}.
	 * @param ctx the parse tree
	 */
	void exitDdParmAMP_TRACE_PARM2(JCLParser.DdParmAMP_TRACE_PARM2Context ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#jobCard}.
	 * @param ctx the parse tree
	 */
	void enterJobCard(JCLParser.JobCardContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#jobCard}.
	 * @param ctx the parse tree
	 */
	void exitJobCard(JCLParser.JobCardContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#jobName}.
	 * @param ctx the parse tree
	 */
	void enterJobName(JCLParser.JobNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#jobName}.
	 * @param ctx the parse tree
	 */
	void exitJobName(JCLParser.JobNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#jobProgrammerName}.
	 * @param ctx the parse tree
	 */
	void enterJobProgrammerName(JCLParser.JobProgrammerNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#jobProgrammerName}.
	 * @param ctx the parse tree
	 */
	void exitJobProgrammerName(JCLParser.JobProgrammerNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#jobAccountingInformation}.
	 * @param ctx the parse tree
	 */
	void enterJobAccountingInformation(JCLParser.JobAccountingInformationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#jobAccountingInformation}.
	 * @param ctx the parse tree
	 */
	void exitJobAccountingInformation(JCLParser.JobAccountingInformationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#jobAccountingInformationSimple}.
	 * @param ctx the parse tree
	 */
	void enterJobAccountingInformationSimple(JCLParser.JobAccountingInformationSimpleContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#jobAccountingInformationSimple}.
	 * @param ctx the parse tree
	 */
	void exitJobAccountingInformationSimple(JCLParser.JobAccountingInformationSimpleContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#jobAccountingInformationMultiLine}.
	 * @param ctx the parse tree
	 */
	void enterJobAccountingInformationMultiLine(JCLParser.JobAccountingInformationMultiLineContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#jobAccountingInformationMultiLine}.
	 * @param ctx the parse tree
	 */
	void exitJobAccountingInformationMultiLine(JCLParser.JobAccountingInformationMultiLineContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#jobKeywordParameter}.
	 * @param ctx the parse tree
	 */
	void enterJobKeywordParameter(JCLParser.JobKeywordParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#jobKeywordParameter}.
	 * @param ctx the parse tree
	 */
	void exitJobKeywordParameter(JCLParser.JobKeywordParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#jobParmBYTES}.
	 * @param ctx the parse tree
	 */
	void enterJobParmBYTES(JCLParser.JobParmBYTESContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#jobParmBYTES}.
	 * @param ctx the parse tree
	 */
	void exitJobParmBYTES(JCLParser.JobParmBYTESContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#jobParmCARDS}.
	 * @param ctx the parse tree
	 */
	void enterJobParmCARDS(JCLParser.JobParmCARDSContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#jobParmCARDS}.
	 * @param ctx the parse tree
	 */
	void exitJobParmCARDS(JCLParser.JobParmCARDSContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#jobParmLINES}.
	 * @param ctx the parse tree
	 */
	void enterJobParmLINES(JCLParser.JobParmLINESContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#jobParmLINES}.
	 * @param ctx the parse tree
	 */
	void exitJobParmLINES(JCLParser.JobParmLINESContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#jobParmPAGES}.
	 * @param ctx the parse tree
	 */
	void enterJobParmPAGES(JCLParser.JobParmPAGESContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#jobParmPAGES}.
	 * @param ctx the parse tree
	 */
	void exitJobParmPAGES(JCLParser.JobParmPAGESContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#jobParmADDRSPC}.
	 * @param ctx the parse tree
	 */
	void enterJobParmADDRSPC(JCLParser.JobParmADDRSPCContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#jobParmADDRSPC}.
	 * @param ctx the parse tree
	 */
	void exitJobParmADDRSPC(JCLParser.JobParmADDRSPCContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#jobParmCCSID}.
	 * @param ctx the parse tree
	 */
	void enterJobParmCCSID(JCLParser.JobParmCCSIDContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#jobParmCCSID}.
	 * @param ctx the parse tree
	 */
	void exitJobParmCCSID(JCLParser.JobParmCCSIDContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#jobParmCLASS}.
	 * @param ctx the parse tree
	 */
	void enterJobParmCLASS(JCLParser.JobParmCLASSContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#jobParmCLASS}.
	 * @param ctx the parse tree
	 */
	void exitJobParmCLASS(JCLParser.JobParmCLASSContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#jobParmCOND}.
	 * @param ctx the parse tree
	 */
	void enterJobParmCOND(JCLParser.JobParmCONDContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#jobParmCOND}.
	 * @param ctx the parse tree
	 */
	void exitJobParmCOND(JCLParser.JobParmCONDContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#jobParmDSENQSHR}.
	 * @param ctx the parse tree
	 */
	void enterJobParmDSENQSHR(JCLParser.JobParmDSENQSHRContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#jobParmDSENQSHR}.
	 * @param ctx the parse tree
	 */
	void exitJobParmDSENQSHR(JCLParser.JobParmDSENQSHRContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#jobParmEMAIL}.
	 * @param ctx the parse tree
	 */
	void enterJobParmEMAIL(JCLParser.JobParmEMAILContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#jobParmEMAIL}.
	 * @param ctx the parse tree
	 */
	void exitJobParmEMAIL(JCLParser.JobParmEMAILContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#jobParmGDGBIAS}.
	 * @param ctx the parse tree
	 */
	void enterJobParmGDGBIAS(JCLParser.JobParmGDGBIASContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#jobParmGDGBIAS}.
	 * @param ctx the parse tree
	 */
	void exitJobParmGDGBIAS(JCLParser.JobParmGDGBIASContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#jobParmGROUP}.
	 * @param ctx the parse tree
	 */
	void enterJobParmGROUP(JCLParser.JobParmGROUPContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#jobParmGROUP}.
	 * @param ctx the parse tree
	 */
	void exitJobParmGROUP(JCLParser.JobParmGROUPContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#jobParmJESLOG}.
	 * @param ctx the parse tree
	 */
	void enterJobParmJESLOG(JCLParser.JobParmJESLOGContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#jobParmJESLOG}.
	 * @param ctx the parse tree
	 */
	void exitJobParmJESLOG(JCLParser.JobParmJESLOGContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#jobParmJOBRC}.
	 * @param ctx the parse tree
	 */
	void enterJobParmJOBRC(JCLParser.JobParmJOBRCContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#jobParmJOBRC}.
	 * @param ctx the parse tree
	 */
	void exitJobParmJOBRC(JCLParser.JobParmJOBRCContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#jobParmMEMLIMIT}.
	 * @param ctx the parse tree
	 */
	void enterJobParmMEMLIMIT(JCLParser.JobParmMEMLIMITContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#jobParmMEMLIMIT}.
	 * @param ctx the parse tree
	 */
	void exitJobParmMEMLIMIT(JCLParser.JobParmMEMLIMITContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#jobParmMSGCLASS}.
	 * @param ctx the parse tree
	 */
	void enterJobParmMSGCLASS(JCLParser.JobParmMSGCLASSContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#jobParmMSGCLASS}.
	 * @param ctx the parse tree
	 */
	void exitJobParmMSGCLASS(JCLParser.JobParmMSGCLASSContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#jobParmMSGLEVEL}.
	 * @param ctx the parse tree
	 */
	void enterJobParmMSGLEVEL(JCLParser.JobParmMSGLEVELContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#jobParmMSGLEVEL}.
	 * @param ctx the parse tree
	 */
	void exitJobParmMSGLEVEL(JCLParser.JobParmMSGLEVELContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#jobParmNOTIFY}.
	 * @param ctx the parse tree
	 */
	void enterJobParmNOTIFY(JCLParser.JobParmNOTIFYContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#jobParmNOTIFY}.
	 * @param ctx the parse tree
	 */
	void exitJobParmNOTIFY(JCLParser.JobParmNOTIFYContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#jobParmPASSWORD}.
	 * @param ctx the parse tree
	 */
	void enterJobParmPASSWORD(JCLParser.JobParmPASSWORDContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#jobParmPASSWORD}.
	 * @param ctx the parse tree
	 */
	void exitJobParmPASSWORD(JCLParser.JobParmPASSWORDContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#jobParmPERFORM}.
	 * @param ctx the parse tree
	 */
	void enterJobParmPERFORM(JCLParser.JobParmPERFORMContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#jobParmPERFORM}.
	 * @param ctx the parse tree
	 */
	void exitJobParmPERFORM(JCLParser.JobParmPERFORMContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#jobParmPRTY}.
	 * @param ctx the parse tree
	 */
	void enterJobParmPRTY(JCLParser.JobParmPRTYContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#jobParmPRTY}.
	 * @param ctx the parse tree
	 */
	void exitJobParmPRTY(JCLParser.JobParmPRTYContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#jobParmRD}.
	 * @param ctx the parse tree
	 */
	void enterJobParmRD(JCLParser.JobParmRDContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#jobParmRD}.
	 * @param ctx the parse tree
	 */
	void exitJobParmRD(JCLParser.JobParmRDContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#jobParmREGION}.
	 * @param ctx the parse tree
	 */
	void enterJobParmREGION(JCLParser.JobParmREGIONContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#jobParmREGION}.
	 * @param ctx the parse tree
	 */
	void exitJobParmREGION(JCLParser.JobParmREGIONContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#jobParmREGIONX}.
	 * @param ctx the parse tree
	 */
	void enterJobParmREGIONX(JCLParser.JobParmREGIONXContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#jobParmREGIONX}.
	 * @param ctx the parse tree
	 */
	void exitJobParmREGIONX(JCLParser.JobParmREGIONXContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#jobParmRESTART}.
	 * @param ctx the parse tree
	 */
	void enterJobParmRESTART(JCLParser.JobParmRESTARTContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#jobParmRESTART}.
	 * @param ctx the parse tree
	 */
	void exitJobParmRESTART(JCLParser.JobParmRESTARTContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#jobParmSECLABEL}.
	 * @param ctx the parse tree
	 */
	void enterJobParmSECLABEL(JCLParser.JobParmSECLABELContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#jobParmSECLABEL}.
	 * @param ctx the parse tree
	 */
	void exitJobParmSECLABEL(JCLParser.JobParmSECLABELContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#jobParmSCHENV}.
	 * @param ctx the parse tree
	 */
	void enterJobParmSCHENV(JCLParser.JobParmSCHENVContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#jobParmSCHENV}.
	 * @param ctx the parse tree
	 */
	void exitJobParmSCHENV(JCLParser.JobParmSCHENVContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#jobParmSYSAFF}.
	 * @param ctx the parse tree
	 */
	void enterJobParmSYSAFF(JCLParser.JobParmSYSAFFContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#jobParmSYSAFF}.
	 * @param ctx the parse tree
	 */
	void exitJobParmSYSAFF(JCLParser.JobParmSYSAFFContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#jobParmSYSTEM}.
	 * @param ctx the parse tree
	 */
	void enterJobParmSYSTEM(JCLParser.JobParmSYSTEMContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#jobParmSYSTEM}.
	 * @param ctx the parse tree
	 */
	void exitJobParmSYSTEM(JCLParser.JobParmSYSTEMContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#jobParmTIME}.
	 * @param ctx the parse tree
	 */
	void enterJobParmTIME(JCLParser.JobParmTIMEContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#jobParmTIME}.
	 * @param ctx the parse tree
	 */
	void exitJobParmTIME(JCLParser.JobParmTIMEContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#jobParmTYPRUN}.
	 * @param ctx the parse tree
	 */
	void enterJobParmTYPRUN(JCLParser.JobParmTYPRUNContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#jobParmTYPRUN}.
	 * @param ctx the parse tree
	 */
	void exitJobParmTYPRUN(JCLParser.JobParmTYPRUNContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#jobParmUJOBCORR}.
	 * @param ctx the parse tree
	 */
	void enterJobParmUJOBCORR(JCLParser.JobParmUJOBCORRContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#jobParmUJOBCORR}.
	 * @param ctx the parse tree
	 */
	void exitJobParmUJOBCORR(JCLParser.JobParmUJOBCORRContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#jobParmUSER}.
	 * @param ctx the parse tree
	 */
	void enterJobParmUSER(JCLParser.JobParmUSERContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#jobParmUSER}.
	 * @param ctx the parse tree
	 */
	void exitJobParmUSER(JCLParser.JobParmUSERContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#inlineComment}.
	 * @param ctx the parse tree
	 */
	void enterInlineComment(JCLParser.InlineCommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#inlineComment}.
	 * @param ctx the parse tree
	 */
	void exitInlineComment(JCLParser.InlineCommentContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#proc}.
	 * @param ctx the parse tree
	 */
	void enterProc(JCLParser.ProcContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#proc}.
	 * @param ctx the parse tree
	 */
	void exitProc(JCLParser.ProcContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#symbolicParameter}.
	 * @param ctx the parse tree
	 */
	void enterSymbolicParameter(JCLParser.SymbolicParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#symbolicParameter}.
	 * @param ctx the parse tree
	 */
	void exitSymbolicParameter(JCLParser.SymbolicParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#symbolicParameters}.
	 * @param ctx the parse tree
	 */
	void enterSymbolicParameters(JCLParser.SymbolicParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#symbolicParameters}.
	 * @param ctx the parse tree
	 */
	void exitSymbolicParameters(JCLParser.SymbolicParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#stepName}.
	 * @param ctx the parse tree
	 */
	void enterStepName(JCLParser.StepNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#stepName}.
	 * @param ctx the parse tree
	 */
	void exitStepName(JCLParser.StepNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JCLParser#procName}.
	 * @param ctx the parse tree
	 */
	void enterProcName(JCLParser.ProcNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JCLParser#procName}.
	 * @param ctx the parse tree
	 */
	void exitProcName(JCLParser.ProcNameContext ctx);
}