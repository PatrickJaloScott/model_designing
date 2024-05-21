package visitors;

import elements.*;

public class CodeGeneratingVisitor implements Visitor {
    @Override
    public void VisitAssignment(AssignmentElement element) {
    }

    @Override
    public void VisitVariableReference(VariableRefElement ref) {
    }
}
