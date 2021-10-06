package porokhin.bstruct

import com.intellij.lexer.Lexer
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors
import com.intellij.openapi.editor.HighlighterColors
import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.editor.markup.TextAttributes
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase
import com.intellij.psi.TokenType
import com.intellij.psi.tree.IElementType
import generated.GeneratedTypes

class BasicLSyntaxHighlighter: SyntaxHighlighterBase() {
    companion object{
        val KEYWORD = TextAttributesKey.createTextAttributesKey("KEYWORD", DefaultLanguageHighlighterColors.KEYWORD)
        val COMMENT = TextAttributesKey.createTextAttributesKey("COMMENT", DefaultLanguageHighlighterColors.LINE_COMMENT)
        val BAD_CHARACTERS = TextAttributesKey.createTextAttributesKey("BAD_CHARACTERS", HighlighterColors.BAD_CHARACTER)

        val KEQORD_KEYS = arrayOf(KEYWORD)
        val COMMENT_KEYS = arrayOf(COMMENT)
        val BAD_CHARACTERS_KEYS = arrayOf(BAD_CHARACTERS)
        val EMPTY_KEYS = emptyArray<TextAttributesKey>()
    }
    override fun getHighlightingLexer(): Lexer {
        return BasicFlexAdapter()
    }

    override fun getTokenHighlights(tokenType: IElementType?): Array<TextAttributesKey> {
        return when(tokenType){
            GeneratedTypes.DIM, GeneratedTypes.DECLARE -> KEQORD_KEYS
            GeneratedTypes.LINE_COMMENT -> COMMENT_KEYS
            TokenType.BAD_CHARACTER -> BAD_CHARACTERS_KEYS
            else -> EMPTY_KEYS
        }
    }
}