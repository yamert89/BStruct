package porokhin.bstruct

import com.intellij.extapi.psi.PsiFileBase
import com.intellij.openapi.fileTypes.FileType
import com.intellij.psi.FileViewProvider

class BasicFile(viewProvider: FileViewProvider): PsiFileBase(viewProvider, BasicLanguage2.INSTANCE) {
    override fun getFileType(): FileType {
        return BasicFileType.INSTANCE
    }

    override fun toString(): String {
        return "Basic file"
    }
}