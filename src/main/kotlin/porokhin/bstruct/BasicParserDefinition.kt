package porokhin.bstruct

import com.intellij.lang.ASTNode
import com.intellij.lang.ParserDefinition
import com.intellij.lang.PsiParser
import com.intellij.lexer.Lexer
import com.intellij.openapi.project.Project
import com.intellij.psi.FileViewProvider
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiFile
import com.intellij.psi.TokenType
import com.intellij.psi.tree.IFileElementType
import com.intellij.psi.tree.TokenSet

class BasicParserDefinition: ParserDefinition {
    companion object{
        val WHITE_SPACES = TokenSet.create(TokenType.WHITE_SPACE)
        val COMMENTS = TokenSet.create(BasicTypes.LINE_COMMENT)
        val FILE = IFileElementType(BasicLanguage2.INSTANCE)
    }

    override fun createLexer(project: Project?): Lexer {
        return BasicFlexAdapter()
    }

    override fun createParser(project: Project?): PsiParser {
        return BasicParser()
    }

    override fun getFileNodeType(): IFileElementType {
        return FILE
    }

    override fun getCommentTokens(): TokenSet {
        return COMMENTS
    }

    override fun getStringLiteralElements(): TokenSet {
        return TokenSet.EMPTY
    }

    override fun createElement(node: ASTNode?): PsiElement {
        return BasicTypes.Factory.createElement(node)
    }

    override fun createFile(viewProvider: FileViewProvider): PsiFile {
        return BasicFile(viewProvider)
    }

    override fun getWhitespaceTokens(): TokenSet {
        return WHITE_SPACES
    }
}