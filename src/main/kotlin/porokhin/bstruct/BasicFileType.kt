package porokhin.bstruct

import com.intellij.openapi.fileTypes.LanguageFileType
import javax.swing.Icon

class BasicFileType: LanguageFileType(BasicLanguage()) {
    override fun getName(): String {
        return "Basic"
    }

    override fun getDescription(): String {
        return "Basic source code"
    }

    override fun getDefaultExtension(): String {
        return "bas"
    }

    override fun getIcon(): Icon {
        return BasicIcon.FILE
    }
    companion object{
        val INSTANCE = BasicFileType()
    }
}
