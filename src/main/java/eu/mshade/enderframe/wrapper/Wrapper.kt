package eu.mshade.enderframe.wrapper

open abstract class Wrapper<I, O> {

    private var outputByInput: MutableMap<I, O> = HashMap()
    private var inputByOutput: MutableMap<O, I> = HashMap()

    fun wrap(input: I): O? {
        return outputByInput[input]
    }

    fun reverse(output: O): I? {
        return inputByOutput[output]
    }

    fun register(i: I, o: O) {
        inputByOutput[o] = i
        outputByInput[i] = o
    }

    fun registerInput(i: I, o: O) {
        outputByInput[i] = o
    }

    fun registerOutput(o: O, i: I) {
        inputByOutput[o] = i
    }

}