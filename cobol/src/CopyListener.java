
import java.util.*;
import java.util.logging.Logger;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class CopyListener extends CobolPreprocessorBaseListener {
	public ArrayList<CopyStatementContextWrapper> copies = null;
	public String callingModuleName = null;

	public CopyListener(
			ArrayList<CopyStatementContextWrapper> copies
			) {
		super();
		this.copies = copies;
	}

	@Override public void enterEveryRule(ParserRuleContext ctx) {  //see CobolBaseListener for allowed functions
		//TestIntegration.LOGGER.finest("enterEveryRule: " + ctx.getClass().getName() + " @line " + ctx.start.getLine() + ": " + ctx.getText());      //code that executes per rule
	}

	@Override public void enterCopyStatement(CobolPreprocessorParser.CopyStatementContext ctx) { 
		this.copies.add(new CopyStatementContextWrapper(ctx));
	}

}
