package visitors;

import elements.*;

public interface Visitor {
    void VisitAssignment(AssignmentElement element);
    void VisitVariableReference(VariableRefElement ref);
}
