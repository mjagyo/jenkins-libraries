/**
    Arguments:
        anotherArg1 - this is the definition
        anotherArg2 - another definition for different args
    
    Usage:
        anotherFunction("valueForanotherArg1")
        anotherFunction("valueForanotherArg1", "valueForanotherArg2")
*/

def call(String anotherArg1, String anotherArg2 = "default") {
    script {
        sh """
            echo Hi ${anotherArg2}
        """
    }
}
