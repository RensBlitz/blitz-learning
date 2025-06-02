namespace Variables.Exercises;

public class BasicVariableDeclarationSolution
{
    public static object[] CreateVariables()
    {
        int integerVariable = 25;
        double doubleVariable = 98.6;
        char characterVariable = 'A';
        bool booleanVariable = false;
        return new object[] { integerVariable, doubleVariable, characterVariable, booleanVariable };
    }
} 