package com.prachi;

/**
 * @author prachi
 *
 *
 * Thrown when a stack overflow occurs because an application
 * recurses too deeply.
 *
 */
public class GetStackOverFlowError {

     static GetStackOverFlowError obj = new GetStackOverFlowError();

    public static void main(String[] args) {

        // Step 1 - here you are creating class object
        // Step 2 - while creating class object it initializes the instance variable obj, by creating a class object again, repeating step 1 again
        // Step 3 - Recursion began and after fes seconds it throws StackOverFlowError

        GetStackOverFlowError obj = new GetStackOverFlowError();
    }
}
