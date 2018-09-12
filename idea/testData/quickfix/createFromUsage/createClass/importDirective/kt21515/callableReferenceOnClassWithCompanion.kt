// "Add explicit import" "true"
// LANGUAGE_VERSION: 1.2

open class Bar {
    companion object {
        class FromBarCompanion {
            fun foo() = 42

            // We need it to cover another code-path
            companion object { }
        }
    }
}

class Foo : Bar() {
    val a = <caret>FromBarCompanion::foo
}