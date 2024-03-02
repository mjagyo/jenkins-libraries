/**
    Arguments:
        test - this is the definition, update
        anotherArgs - another definition for different args
        name - the definition of name that has a default of "Alice"
    
    Usage:
        anotherFunction("valueForTest", "valueForAnotherArgs", "valueForNameArgs")
*/

def call(String test, String anotherArgs, String name = "Alice") {
    script {
        sh """
            echo Hi ${name}
        """
    }
}
