package porokhin.bstruct

import com.intellij.psi.tree.IElementType

class BasicTokenType(debugName: String): IElementType(debugName, BasicLanguage2.INSTANCE) {
    override fun toString(): String {
        return "BasicTokenType" + super.toString()
    }
}