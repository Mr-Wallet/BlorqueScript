package org.example.blorquescript.ui.contentassist.antlr.lexer;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalBlorqueScriptLexer extends Lexer {
    public static final int HyphenMinusHyphenMinus=37;
    public static final int New=29;
    public static final int Null=21;
    public static final int Import=8;
    public static final int AmpersandEqualsSign=33;
    public static final int SolidusEqualsSign=40;
    public static final int SPC=26;
    public static final int Break=15;
    public static final int True=23;
    public static final int String=13;
    public static final int False=17;
    public static final int LessThanSign=66;
    public static final int PercentSign=54;
    public static final int LeftParenthesis=56;
    public static final int RULE_ESCAPE_CODE=81;
    public static final int This=22;
    public static final int Ampersand=55;
    public static final int AsteriskEqualsSign=34;
    public static final int Client=7;
    public static final int VerticalLineEqualsSign=50;
    public static final int RightSquareBracket=72;
    public static final int RULE_TAGGED_STRING=83;
    public static final int ExclamationMark=52;
    public static final int GreaterThanSign=68;
    public static final int RULE_ID=79;
    public static final int For=28;
    public static final int RightParenthesis=57;
    public static final int GreaterThanSignEqualsSign=44;
    public static final int EqualsSignEqualsSign=43;
    public static final int RULE_HEX_VALUE=78;
    public static final int Switch=14;
    public static final int VerticalLine=75;
    public static final int PlusSign=59;
    public static final int RULE_INT=80;
    public static final int FullStopAsterisk=39;
    public static final int RULE_ML_COMMENT=84;
    public static final int CircumflexAccentEqualsSign=48;
    public static final int Object=10;
    public static final int Class=16;
    public static final int LeftSquareBracket=71;
    public static final int Package=6;
    public static final int LessThanSignLessThanSign=41;
    public static final int If=49;
    public static final int NL=47;
    public static final int LessThanSignLessThanSignEqualsSign=24;
    public static final int Parent=11;
    public static final int VerticalLineVerticalLine=51;
    public static final int RULE_STRING=82;
    public static final int Continue=4;
    public static final int Case=19;
    public static final int RULE_SL_COMMENT=85;
    public static final int Comma=60;
    public static final int EqualsSign=67;
    public static final int HyphenMinus=61;
    public static final int Number=9;
    public static final int AmpersandAmpersand=32;
    public static final int HyphenMinusEqualsSign=38;
    public static final int LessThanSignEqualsSign=42;
    public static final int Solidus=63;
    public static final int Colon=64;
    public static final int RightCurlyBracket=76;
    public static final int EOF=-1;
    public static final int Asterisk=58;
    public static final int PercentSignEqualsSign=31;
    public static final int PlusSignEqualsSign=36;
    public static final int FullStop=62;
    public static final int Return=12;
    public static final int CommercialAtEqualsSign=46;
    public static final int RULE_WS=86;
    public static final int LeftCurlyBracket=74;
    public static final int Tilde=77;
    public static final int While=18;
    public static final int RULE_ANY_OTHER=87;
    public static final int GreaterThanSignGreaterThanSign=45;
    public static final int Default=5;
    public static final int CircumflexAccent=73;
    public static final int CommercialAt=70;
    public static final int Semicolon=65;
    public static final int TAB=27;
    public static final int PlusSignPlusSign=35;
    public static final int QuestionMark=69;
    public static final int Else=20;
    public static final int DollarSign=53;
    public static final int ExclamationMarkEqualsSign=30;
    public static final int GreaterThanSignGreaterThanSignEqualsSign=25;

    // delegates
    // delegators

    public InternalBlorqueScriptLexer() {;} 
    public InternalBlorqueScriptLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalBlorqueScriptLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g"; }

    // $ANTLR start "Continue"
    public final void mContinue() throws RecognitionException {
        try {
            int _type = Continue;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:19:10: ( ( 'C' | 'c' ) ( 'O' | 'o' ) ( 'N' | 'n' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'U' | 'u' ) ( 'E' | 'e' ) )
            // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:19:12: ( 'C' | 'c' ) ( 'O' | 'o' ) ( 'N' | 'n' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'U' | 'u' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Continue"

    // $ANTLR start "Default"
    public final void mDefault() throws RecognitionException {
        try {
            int _type = Default;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:21:9: ( ( 'D' | 'd' ) ( 'E' | 'e' ) ( 'F' | 'f' ) ( 'A' | 'a' ) ( 'U' | 'u' ) ( 'L' | 'l' ) ( 'T' | 't' ) )
            // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:21:11: ( 'D' | 'd' ) ( 'E' | 'e' ) ( 'F' | 'f' ) ( 'A' | 'a' ) ( 'U' | 'u' ) ( 'L' | 'l' ) ( 'T' | 't' )
            {
            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Default"

    // $ANTLR start "Package"
    public final void mPackage() throws RecognitionException {
        try {
            int _type = Package;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:23:9: ( ( 'P' | 'p' ) ( 'A' | 'a' ) ( 'C' | 'c' ) ( 'K' | 'k' ) ( 'A' | 'a' ) ( 'G' | 'g' ) ( 'E' | 'e' ) )
            // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:23:11: ( 'P' | 'p' ) ( 'A' | 'a' ) ( 'C' | 'c' ) ( 'K' | 'k' ) ( 'A' | 'a' ) ( 'G' | 'g' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='K'||input.LA(1)=='k' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='G'||input.LA(1)=='g' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Package"

    // $ANTLR start "Client"
    public final void mClient() throws RecognitionException {
        try {
            int _type = Client;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:25:8: ( ( 'C' | 'c' ) ( 'L' | 'l' ) ( 'I' | 'i' ) ( 'E' | 'e' ) ( 'N' | 'n' ) ( 'T' | 't' ) )
            // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:25:10: ( 'C' | 'c' ) ( 'L' | 'l' ) ( 'I' | 'i' ) ( 'E' | 'e' ) ( 'N' | 'n' ) ( 'T' | 't' )
            {
            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Client"

    // $ANTLR start "Import"
    public final void mImport() throws RecognitionException {
        try {
            int _type = Import;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:27:8: ( ( 'I' | 'i' ) ( 'M' | 'm' ) ( 'P' | 'p' ) ( 'O' | 'o' ) ( 'R' | 'r' ) ( 'T' | 't' ) )
            // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:27:10: ( 'I' | 'i' ) ( 'M' | 'm' ) ( 'P' | 'p' ) ( 'O' | 'o' ) ( 'R' | 'r' ) ( 'T' | 't' )
            {
            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Import"

    // $ANTLR start "Number"
    public final void mNumber() throws RecognitionException {
        try {
            int _type = Number;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:29:8: ( ( 'N' | 'n' ) ( 'U' | 'u' ) ( 'M' | 'm' ) ( 'B' | 'b' ) ( 'E' | 'e' ) ( 'R' | 'r' ) )
            // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:29:10: ( 'N' | 'n' ) ( 'U' | 'u' ) ( 'M' | 'm' ) ( 'B' | 'b' ) ( 'E' | 'e' ) ( 'R' | 'r' )
            {
            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Number"

    // $ANTLR start "Object"
    public final void mObject() throws RecognitionException {
        try {
            int _type = Object;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:31:8: ( ( 'O' | 'o' ) ( 'B' | 'b' ) ( 'J' | 'j' ) ( 'E' | 'e' ) ( 'C' | 'c' ) ( 'T' | 't' ) )
            // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:31:10: ( 'O' | 'o' ) ( 'B' | 'b' ) ( 'J' | 'j' ) ( 'E' | 'e' ) ( 'C' | 'c' ) ( 'T' | 't' )
            {
            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='J'||input.LA(1)=='j' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Object"

    // $ANTLR start "Parent"
    public final void mParent() throws RecognitionException {
        try {
            int _type = Parent;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:33:8: ( ( 'P' | 'p' ) ( 'A' | 'a' ) ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'N' | 'n' ) ( 'T' | 't' ) )
            // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:33:10: ( 'P' | 'p' ) ( 'A' | 'a' ) ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'N' | 'n' ) ( 'T' | 't' )
            {
            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Parent"

    // $ANTLR start "Return"
    public final void mReturn() throws RecognitionException {
        try {
            int _type = Return;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:35:8: ( ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'T' | 't' ) ( 'U' | 'u' ) ( 'R' | 'r' ) ( 'N' | 'n' ) )
            // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:35:10: ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'T' | 't' ) ( 'U' | 'u' ) ( 'R' | 'r' ) ( 'N' | 'n' )
            {
            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Return"

    // $ANTLR start "String"
    public final void mString() throws RecognitionException {
        try {
            int _type = String;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:37:8: ( ( 'S' | 's' ) ( 'T' | 't' ) ( 'R' | 'r' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'G' | 'g' ) )
            // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:37:10: ( 'S' | 's' ) ( 'T' | 't' ) ( 'R' | 'r' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'G' | 'g' )
            {
            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='G'||input.LA(1)=='g' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "String"

    // $ANTLR start "Switch"
    public final void mSwitch() throws RecognitionException {
        try {
            int _type = Switch;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:39:8: ( ( 'S' | 's' ) ( 'W' | 'w' ) ( 'I' | 'i' ) ( 'T' | 't' ) ( 'C' | 'c' ) ( 'H' | 'h' ) )
            // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:39:10: ( 'S' | 's' ) ( 'W' | 'w' ) ( 'I' | 'i' ) ( 'T' | 't' ) ( 'C' | 'c' ) ( 'H' | 'h' )
            {
            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='W'||input.LA(1)=='w' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='H'||input.LA(1)=='h' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Switch"

    // $ANTLR start "Break"
    public final void mBreak() throws RecognitionException {
        try {
            int _type = Break;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:41:7: ( ( 'B' | 'b' ) ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'A' | 'a' ) ( 'K' | 'k' ) )
            // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:41:9: ( 'B' | 'b' ) ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'A' | 'a' ) ( 'K' | 'k' )
            {
            if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='K'||input.LA(1)=='k' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Break"

    // $ANTLR start "Class"
    public final void mClass() throws RecognitionException {
        try {
            int _type = Class;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:43:7: ( ( 'C' | 'c' ) ( 'L' | 'l' ) ( 'A' | 'a' ) ( 'S' | 's' ) ( 'S' | 's' ) )
            // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:43:9: ( 'C' | 'c' ) ( 'L' | 'l' ) ( 'A' | 'a' ) ( 'S' | 's' ) ( 'S' | 's' )
            {
            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Class"

    // $ANTLR start "False"
    public final void mFalse() throws RecognitionException {
        try {
            int _type = False;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:45:7: ( ( 'F' | 'f' ) ( 'A' | 'a' ) ( 'L' | 'l' ) ( 'S' | 's' ) ( 'E' | 'e' ) )
            // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:45:9: ( 'F' | 'f' ) ( 'A' | 'a' ) ( 'L' | 'l' ) ( 'S' | 's' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "False"

    // $ANTLR start "While"
    public final void mWhile() throws RecognitionException {
        try {
            int _type = While;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:47:7: ( ( 'W' | 'w' ) ( 'H' | 'h' ) ( 'I' | 'i' ) ( 'L' | 'l' ) ( 'E' | 'e' ) )
            // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:47:9: ( 'W' | 'w' ) ( 'H' | 'h' ) ( 'I' | 'i' ) ( 'L' | 'l' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='W'||input.LA(1)=='w' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='H'||input.LA(1)=='h' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "While"

    // $ANTLR start "Case"
    public final void mCase() throws RecognitionException {
        try {
            int _type = Case;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:49:6: ( ( 'C' | 'c' ) ( 'A' | 'a' ) ( 'S' | 's' ) ( 'E' | 'e' ) )
            // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:49:8: ( 'C' | 'c' ) ( 'A' | 'a' ) ( 'S' | 's' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Case"

    // $ANTLR start "Else"
    public final void mElse() throws RecognitionException {
        try {
            int _type = Else;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:51:6: ( ( 'E' | 'e' ) ( 'L' | 'l' ) ( 'S' | 's' ) ( 'E' | 'e' ) )
            // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:51:8: ( 'E' | 'e' ) ( 'L' | 'l' ) ( 'S' | 's' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Else"

    // $ANTLR start "Null"
    public final void mNull() throws RecognitionException {
        try {
            int _type = Null;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:53:6: ( ( 'N' | 'n' ) ( 'U' | 'u' ) ( 'L' | 'l' ) ( 'L' | 'l' ) )
            // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:53:8: ( 'N' | 'n' ) ( 'U' | 'u' ) ( 'L' | 'l' ) ( 'L' | 'l' )
            {
            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Null"

    // $ANTLR start "This"
    public final void mThis() throws RecognitionException {
        try {
            int _type = This;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:55:6: ( ( 'T' | 't' ) ( 'H' | 'h' ) ( 'I' | 'i' ) ( 'S' | 's' ) )
            // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:55:8: ( 'T' | 't' ) ( 'H' | 'h' ) ( 'I' | 'i' ) ( 'S' | 's' )
            {
            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='H'||input.LA(1)=='h' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "This"

    // $ANTLR start "True"
    public final void mTrue() throws RecognitionException {
        try {
            int _type = True;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:57:6: ( ( 'T' | 't' ) ( 'R' | 'r' ) ( 'U' | 'u' ) ( 'E' | 'e' ) )
            // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:57:8: ( 'T' | 't' ) ( 'R' | 'r' ) ( 'U' | 'u' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "True"

    // $ANTLR start "LessThanSignLessThanSignEqualsSign"
    public final void mLessThanSignLessThanSignEqualsSign() throws RecognitionException {
        try {
            int _type = LessThanSignLessThanSignEqualsSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:59:36: ( '<' '<' '=' )
            // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:59:38: '<' '<' '='
            {
            match('<'); 
            match('<'); 
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LessThanSignLessThanSignEqualsSign"

    // $ANTLR start "GreaterThanSignGreaterThanSignEqualsSign"
    public final void mGreaterThanSignGreaterThanSignEqualsSign() throws RecognitionException {
        try {
            int _type = GreaterThanSignGreaterThanSignEqualsSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:61:42: ( '>' '>' '=' )
            // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:61:44: '>' '>' '='
            {
            match('>'); 
            match('>'); 
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GreaterThanSignGreaterThanSignEqualsSign"

    // $ANTLR start "SPC"
    public final void mSPC() throws RecognitionException {
        try {
            int _type = SPC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:63:5: ( ( 'S' | 's' ) ( 'P' | 'p' ) ( 'C' | 'c' ) )
            // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:63:7: ( 'S' | 's' ) ( 'P' | 'p' ) ( 'C' | 'c' )
            {
            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SPC"

    // $ANTLR start "TAB"
    public final void mTAB() throws RecognitionException {
        try {
            int _type = TAB;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:65:5: ( ( 'T' | 't' ) ( 'A' | 'a' ) ( 'B' | 'b' ) )
            // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:65:7: ( 'T' | 't' ) ( 'A' | 'a' ) ( 'B' | 'b' )
            {
            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TAB"

    // $ANTLR start "For"
    public final void mFor() throws RecognitionException {
        try {
            int _type = For;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:67:5: ( ( 'F' | 'f' ) ( 'O' | 'o' ) ( 'R' | 'r' ) )
            // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:67:7: ( 'F' | 'f' ) ( 'O' | 'o' ) ( 'R' | 'r' )
            {
            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "For"

    // $ANTLR start "New"
    public final void mNew() throws RecognitionException {
        try {
            int _type = New;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:69:5: ( ( 'N' | 'n' ) ( 'E' | 'e' ) ( 'W' | 'w' ) )
            // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:69:7: ( 'N' | 'n' ) ( 'E' | 'e' ) ( 'W' | 'w' )
            {
            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='W'||input.LA(1)=='w' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "New"

    // $ANTLR start "ExclamationMarkEqualsSign"
    public final void mExclamationMarkEqualsSign() throws RecognitionException {
        try {
            int _type = ExclamationMarkEqualsSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:71:27: ( '!' '=' )
            // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:71:29: '!' '='
            {
            match('!'); 
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ExclamationMarkEqualsSign"

    // $ANTLR start "PercentSignEqualsSign"
    public final void mPercentSignEqualsSign() throws RecognitionException {
        try {
            int _type = PercentSignEqualsSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:73:23: ( '%' '=' )
            // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:73:25: '%' '='
            {
            match('%'); 
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PercentSignEqualsSign"

    // $ANTLR start "AmpersandAmpersand"
    public final void mAmpersandAmpersand() throws RecognitionException {
        try {
            int _type = AmpersandAmpersand;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:75:20: ( '&' '&' )
            // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:75:22: '&' '&'
            {
            match('&'); 
            match('&'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AmpersandAmpersand"

    // $ANTLR start "AmpersandEqualsSign"
    public final void mAmpersandEqualsSign() throws RecognitionException {
        try {
            int _type = AmpersandEqualsSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:77:21: ( '&' '=' )
            // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:77:23: '&' '='
            {
            match('&'); 
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AmpersandEqualsSign"

    // $ANTLR start "AsteriskEqualsSign"
    public final void mAsteriskEqualsSign() throws RecognitionException {
        try {
            int _type = AsteriskEqualsSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:79:20: ( '*' '=' )
            // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:79:22: '*' '='
            {
            match('*'); 
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AsteriskEqualsSign"

    // $ANTLR start "PlusSignPlusSign"
    public final void mPlusSignPlusSign() throws RecognitionException {
        try {
            int _type = PlusSignPlusSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:81:18: ( '+' '+' )
            // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:81:20: '+' '+'
            {
            match('+'); 
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PlusSignPlusSign"

    // $ANTLR start "PlusSignEqualsSign"
    public final void mPlusSignEqualsSign() throws RecognitionException {
        try {
            int _type = PlusSignEqualsSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:83:20: ( '+' '=' )
            // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:83:22: '+' '='
            {
            match('+'); 
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PlusSignEqualsSign"

    // $ANTLR start "HyphenMinusHyphenMinus"
    public final void mHyphenMinusHyphenMinus() throws RecognitionException {
        try {
            int _type = HyphenMinusHyphenMinus;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:85:24: ( '-' '-' )
            // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:85:26: '-' '-'
            {
            match('-'); 
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "HyphenMinusHyphenMinus"

    // $ANTLR start "HyphenMinusEqualsSign"
    public final void mHyphenMinusEqualsSign() throws RecognitionException {
        try {
            int _type = HyphenMinusEqualsSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:87:23: ( '-' '=' )
            // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:87:25: '-' '='
            {
            match('-'); 
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "HyphenMinusEqualsSign"

    // $ANTLR start "FullStopAsterisk"
    public final void mFullStopAsterisk() throws RecognitionException {
        try {
            int _type = FullStopAsterisk;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:89:18: ( '.' '*' )
            // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:89:20: '.' '*'
            {
            match('.'); 
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FullStopAsterisk"

    // $ANTLR start "SolidusEqualsSign"
    public final void mSolidusEqualsSign() throws RecognitionException {
        try {
            int _type = SolidusEqualsSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:91:19: ( '/' '=' )
            // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:91:21: '/' '='
            {
            match('/'); 
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SolidusEqualsSign"

    // $ANTLR start "LessThanSignLessThanSign"
    public final void mLessThanSignLessThanSign() throws RecognitionException {
        try {
            int _type = LessThanSignLessThanSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:93:26: ( '<' '<' )
            // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:93:28: '<' '<'
            {
            match('<'); 
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LessThanSignLessThanSign"

    // $ANTLR start "LessThanSignEqualsSign"
    public final void mLessThanSignEqualsSign() throws RecognitionException {
        try {
            int _type = LessThanSignEqualsSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:95:24: ( '<' '=' )
            // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:95:26: '<' '='
            {
            match('<'); 
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LessThanSignEqualsSign"

    // $ANTLR start "EqualsSignEqualsSign"
    public final void mEqualsSignEqualsSign() throws RecognitionException {
        try {
            int _type = EqualsSignEqualsSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:97:22: ( '=' '=' )
            // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:97:24: '=' '='
            {
            match('='); 
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EqualsSignEqualsSign"

    // $ANTLR start "GreaterThanSignEqualsSign"
    public final void mGreaterThanSignEqualsSign() throws RecognitionException {
        try {
            int _type = GreaterThanSignEqualsSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:99:27: ( '>' '=' )
            // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:99:29: '>' '='
            {
            match('>'); 
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GreaterThanSignEqualsSign"

    // $ANTLR start "GreaterThanSignGreaterThanSign"
    public final void mGreaterThanSignGreaterThanSign() throws RecognitionException {
        try {
            int _type = GreaterThanSignGreaterThanSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:101:32: ( '>' '>' )
            // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:101:34: '>' '>'
            {
            match('>'); 
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GreaterThanSignGreaterThanSign"

    // $ANTLR start "CommercialAtEqualsSign"
    public final void mCommercialAtEqualsSign() throws RecognitionException {
        try {
            int _type = CommercialAtEqualsSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:103:24: ( '@' '=' )
            // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:103:26: '@' '='
            {
            match('@'); 
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CommercialAtEqualsSign"

    // $ANTLR start "NL"
    public final void mNL() throws RecognitionException {
        try {
            int _type = NL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:105:4: ( ( 'N' | 'n' ) ( 'L' | 'l' ) )
            // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:105:6: ( 'N' | 'n' ) ( 'L' | 'l' )
            {
            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NL"

    // $ANTLR start "CircumflexAccentEqualsSign"
    public final void mCircumflexAccentEqualsSign() throws RecognitionException {
        try {
            int _type = CircumflexAccentEqualsSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:107:28: ( '^' '=' )
            // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:107:30: '^' '='
            {
            match('^'); 
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CircumflexAccentEqualsSign"

    // $ANTLR start "If"
    public final void mIf() throws RecognitionException {
        try {
            int _type = If;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:109:4: ( ( 'I' | 'i' ) ( 'F' | 'f' ) )
            // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:109:6: ( 'I' | 'i' ) ( 'F' | 'f' )
            {
            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "If"

    // $ANTLR start "VerticalLineEqualsSign"
    public final void mVerticalLineEqualsSign() throws RecognitionException {
        try {
            int _type = VerticalLineEqualsSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:111:24: ( '|' '=' )
            // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:111:26: '|' '='
            {
            match('|'); 
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "VerticalLineEqualsSign"

    // $ANTLR start "VerticalLineVerticalLine"
    public final void mVerticalLineVerticalLine() throws RecognitionException {
        try {
            int _type = VerticalLineVerticalLine;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:113:26: ( '|' '|' )
            // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:113:28: '|' '|'
            {
            match('|'); 
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "VerticalLineVerticalLine"

    // $ANTLR start "ExclamationMark"
    public final void mExclamationMark() throws RecognitionException {
        try {
            int _type = ExclamationMark;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:115:17: ( '!' )
            // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:115:19: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ExclamationMark"

    // $ANTLR start "DollarSign"
    public final void mDollarSign() throws RecognitionException {
        try {
            int _type = DollarSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:117:12: ( '$' )
            // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:117:14: '$'
            {
            match('$'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DollarSign"

    // $ANTLR start "PercentSign"
    public final void mPercentSign() throws RecognitionException {
        try {
            int _type = PercentSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:119:13: ( '%' )
            // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:119:15: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PercentSign"

    // $ANTLR start "Ampersand"
    public final void mAmpersand() throws RecognitionException {
        try {
            int _type = Ampersand;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:121:11: ( '&' )
            // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:121:13: '&'
            {
            match('&'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Ampersand"

    // $ANTLR start "LeftParenthesis"
    public final void mLeftParenthesis() throws RecognitionException {
        try {
            int _type = LeftParenthesis;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:123:17: ( '(' )
            // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:123:19: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LeftParenthesis"

    // $ANTLR start "RightParenthesis"
    public final void mRightParenthesis() throws RecognitionException {
        try {
            int _type = RightParenthesis;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:125:18: ( ')' )
            // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:125:20: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RightParenthesis"

    // $ANTLR start "Asterisk"
    public final void mAsterisk() throws RecognitionException {
        try {
            int _type = Asterisk;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:127:10: ( '*' )
            // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:127:12: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Asterisk"

    // $ANTLR start "PlusSign"
    public final void mPlusSign() throws RecognitionException {
        try {
            int _type = PlusSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:129:10: ( '+' )
            // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:129:12: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PlusSign"

    // $ANTLR start "Comma"
    public final void mComma() throws RecognitionException {
        try {
            int _type = Comma;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:131:7: ( ',' )
            // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:131:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Comma"

    // $ANTLR start "HyphenMinus"
    public final void mHyphenMinus() throws RecognitionException {
        try {
            int _type = HyphenMinus;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:133:13: ( '-' )
            // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:133:15: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "HyphenMinus"

    // $ANTLR start "FullStop"
    public final void mFullStop() throws RecognitionException {
        try {
            int _type = FullStop;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:135:10: ( '.' )
            // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:135:12: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FullStop"

    // $ANTLR start "Solidus"
    public final void mSolidus() throws RecognitionException {
        try {
            int _type = Solidus;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:137:9: ( '/' )
            // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:137:11: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Solidus"

    // $ANTLR start "Colon"
    public final void mColon() throws RecognitionException {
        try {
            int _type = Colon;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:139:7: ( ':' )
            // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:139:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Colon"

    // $ANTLR start "Semicolon"
    public final void mSemicolon() throws RecognitionException {
        try {
            int _type = Semicolon;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:141:11: ( ';' )
            // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:141:13: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Semicolon"

    // $ANTLR start "LessThanSign"
    public final void mLessThanSign() throws RecognitionException {
        try {
            int _type = LessThanSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:143:14: ( '<' )
            // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:143:16: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LessThanSign"

    // $ANTLR start "EqualsSign"
    public final void mEqualsSign() throws RecognitionException {
        try {
            int _type = EqualsSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:145:12: ( '=' )
            // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:145:14: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EqualsSign"

    // $ANTLR start "GreaterThanSign"
    public final void mGreaterThanSign() throws RecognitionException {
        try {
            int _type = GreaterThanSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:147:17: ( '>' )
            // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:147:19: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GreaterThanSign"

    // $ANTLR start "QuestionMark"
    public final void mQuestionMark() throws RecognitionException {
        try {
            int _type = QuestionMark;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:149:14: ( '?' )
            // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:149:16: '?'
            {
            match('?'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "QuestionMark"

    // $ANTLR start "CommercialAt"
    public final void mCommercialAt() throws RecognitionException {
        try {
            int _type = CommercialAt;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:151:14: ( '@' )
            // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:151:16: '@'
            {
            match('@'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CommercialAt"

    // $ANTLR start "LeftSquareBracket"
    public final void mLeftSquareBracket() throws RecognitionException {
        try {
            int _type = LeftSquareBracket;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:153:19: ( '[' )
            // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:153:21: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LeftSquareBracket"

    // $ANTLR start "RightSquareBracket"
    public final void mRightSquareBracket() throws RecognitionException {
        try {
            int _type = RightSquareBracket;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:155:20: ( ']' )
            // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:155:22: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RightSquareBracket"

    // $ANTLR start "CircumflexAccent"
    public final void mCircumflexAccent() throws RecognitionException {
        try {
            int _type = CircumflexAccent;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:157:18: ( '^' )
            // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:157:20: '^'
            {
            match('^'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CircumflexAccent"

    // $ANTLR start "LeftCurlyBracket"
    public final void mLeftCurlyBracket() throws RecognitionException {
        try {
            int _type = LeftCurlyBracket;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:159:18: ( '{' )
            // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:159:20: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LeftCurlyBracket"

    // $ANTLR start "VerticalLine"
    public final void mVerticalLine() throws RecognitionException {
        try {
            int _type = VerticalLine;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:161:14: ( '|' )
            // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:161:16: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "VerticalLine"

    // $ANTLR start "RightCurlyBracket"
    public final void mRightCurlyBracket() throws RecognitionException {
        try {
            int _type = RightCurlyBracket;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:163:19: ( '}' )
            // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:163:21: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RightCurlyBracket"

    // $ANTLR start "Tilde"
    public final void mTilde() throws RecognitionException {
        try {
            int _type = Tilde;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:165:7: ( '~' )
            // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:165:9: '~'
            {
            match('~'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Tilde"

    // $ANTLR start "RULE_HEX_VALUE"
    public final void mRULE_HEX_VALUE() throws RecognitionException {
        try {
            int _type = RULE_HEX_VALUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:169:16: ( '0x' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )* )
            // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:169:18: '0x' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )*
            {
            match("0x"); 

            // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:169:23: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='F')||(LA1_0>='a' && LA1_0<='f')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_HEX_VALUE"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:171:9: ( ( '$' | '%' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' | ':' )* )
            // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:171:11: ( '$' | '%' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' | ':' )*
            {
            // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:171:11: ( '$' | '%' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>='$' && LA2_0<='%')) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:
                    {
                    if ( (input.LA(1)>='$' && input.LA(1)<='%') ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:171:46: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' | ':' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<=':')||(LA3_0>='A' && LA3_0<='Z')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<=':')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:173:10: ( ( '0' .. '9' )+ )
            // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:173:12: ( '0' .. '9' )+
            {
            // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:173:12: ( '0' .. '9' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:173:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_ESCAPE_CODE"
    public final void mRULE_ESCAPE_CODE() throws RecognitionException {
        try {
            // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:175:27: ( '\\\\' ( 'x' . . | 'c' . | ~ ( ( 'c' | 'x' ) ) ) )
            // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:175:29: '\\\\' ( 'x' . . | 'c' . | ~ ( ( 'c' | 'x' ) ) )
            {
            match('\\'); 
            // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:175:34: ( 'x' . . | 'c' . | ~ ( ( 'c' | 'x' ) ) )
            int alt5=3;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='x') ) {
                alt5=1;
            }
            else if ( (LA5_0=='c') ) {
                alt5=2;
            }
            else if ( ((LA5_0>='\u0000' && LA5_0<='b')||(LA5_0>='d' && LA5_0<='w')||(LA5_0>='y' && LA5_0<='\uFFFF')) ) {
                alt5=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:175:35: 'x' . .
                    {
                    match('x'); 
                    matchAny(); 
                    matchAny(); 

                    }
                    break;
                case 2 :
                    // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:175:43: 'c' .
                    {
                    match('c'); 
                    matchAny(); 

                    }
                    break;
                case 3 :
                    // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:175:49: ~ ( ( 'c' | 'x' ) )
                    {
                    if ( (input.LA(1)>='\u0000' && input.LA(1)<='b')||(input.LA(1)>='d' && input.LA(1)<='w')||(input.LA(1)>='y' && input.LA(1)<='\uFFFF') ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_ESCAPE_CODE"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:177:13: ( '\"' ( RULE_ESCAPE_CODE | ~ ( ( '\\\\' | '\"' ) ) )* '\"' )
            // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:177:15: '\"' ( RULE_ESCAPE_CODE | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
            {
            match('\"'); 
            // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:177:19: ( RULE_ESCAPE_CODE | ~ ( ( '\\\\' | '\"' ) ) )*
            loop6:
            do {
                int alt6=3;
                int LA6_0 = input.LA(1);

                if ( (LA6_0=='\\') ) {
                    alt6=1;
                }
                else if ( ((LA6_0>='\u0000' && LA6_0<='!')||(LA6_0>='#' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFF')) ) {
                    alt6=2;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:177:20: RULE_ESCAPE_CODE
            	    {
            	    mRULE_ESCAPE_CODE(); 

            	    }
            	    break;
            	case 2 :
            	    // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:177:37: ~ ( ( '\\\\' | '\"' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_TAGGED_STRING"
    public final void mRULE_TAGGED_STRING() throws RecognitionException {
        try {
            int _type = RULE_TAGGED_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:179:20: ( '\\'' ( RULE_ESCAPE_CODE | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:179:22: '\\'' ( RULE_ESCAPE_CODE | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
            {
            match('\''); 
            // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:179:27: ( RULE_ESCAPE_CODE | ~ ( ( '\\\\' | '\\'' ) ) )*
            loop7:
            do {
                int alt7=3;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='\\') ) {
                    alt7=1;
                }
                else if ( ((LA7_0>='\u0000' && LA7_0<='&')||(LA7_0>='(' && LA7_0<='[')||(LA7_0>=']' && LA7_0<='\uFFFF')) ) {
                    alt7=2;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:179:28: RULE_ESCAPE_CODE
            	    {
            	    mRULE_ESCAPE_CODE(); 

            	    }
            	    break;
            	case 2 :
            	    // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:179:45: ~ ( ( '\\\\' | '\\'' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TAGGED_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:181:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:181:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:181:24: ( options {greedy=false; } : . )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0=='*') ) {
                    int LA8_1 = input.LA(2);

                    if ( (LA8_1=='/') ) {
                        alt8=2;
                    }
                    else if ( ((LA8_1>='\u0000' && LA8_1<='.')||(LA8_1>='0' && LA8_1<='\uFFFF')) ) {
                        alt8=1;
                    }


                }
                else if ( ((LA8_0>='\u0000' && LA8_0<=')')||(LA8_0>='+' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:181:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:183:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:183:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:183:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='\u0000' && LA9_0<='\t')||(LA9_0>='\u000B' && LA9_0<='\f')||(LA9_0>='\u000E' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:183:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:183:40: ( ( '\\r' )? '\\n' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\n'||LA11_0=='\r') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:183:41: ( '\\r' )? '\\n'
                    {
                    // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:183:41: ( '\\r' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='\r') ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:183:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:185:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:185:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:185:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:187:16: ( . )
            // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:187:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:1:8: ( Continue | Default | Package | Client | Import | Number | Object | Parent | Return | String | Switch | Break | Class | False | While | Case | Else | Null | This | True | LessThanSignLessThanSignEqualsSign | GreaterThanSignGreaterThanSignEqualsSign | SPC | TAB | For | New | ExclamationMarkEqualsSign | PercentSignEqualsSign | AmpersandAmpersand | AmpersandEqualsSign | AsteriskEqualsSign | PlusSignPlusSign | PlusSignEqualsSign | HyphenMinusHyphenMinus | HyphenMinusEqualsSign | FullStopAsterisk | SolidusEqualsSign | LessThanSignLessThanSign | LessThanSignEqualsSign | EqualsSignEqualsSign | GreaterThanSignEqualsSign | GreaterThanSignGreaterThanSign | CommercialAtEqualsSign | NL | CircumflexAccentEqualsSign | If | VerticalLineEqualsSign | VerticalLineVerticalLine | ExclamationMark | DollarSign | PercentSign | Ampersand | LeftParenthesis | RightParenthesis | Asterisk | PlusSign | Comma | HyphenMinus | FullStop | Solidus | Colon | Semicolon | LessThanSign | EqualsSign | GreaterThanSign | QuestionMark | CommercialAt | LeftSquareBracket | RightSquareBracket | CircumflexAccent | LeftCurlyBracket | VerticalLine | RightCurlyBracket | Tilde | RULE_HEX_VALUE | RULE_ID | RULE_INT | RULE_STRING | RULE_TAGGED_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt13=83;
        alt13 = dfa13.predict(input);
        switch (alt13) {
            case 1 :
                // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:1:10: Continue
                {
                mContinue(); 

                }
                break;
            case 2 :
                // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:1:19: Default
                {
                mDefault(); 

                }
                break;
            case 3 :
                // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:1:27: Package
                {
                mPackage(); 

                }
                break;
            case 4 :
                // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:1:35: Client
                {
                mClient(); 

                }
                break;
            case 5 :
                // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:1:42: Import
                {
                mImport(); 

                }
                break;
            case 6 :
                // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:1:49: Number
                {
                mNumber(); 

                }
                break;
            case 7 :
                // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:1:56: Object
                {
                mObject(); 

                }
                break;
            case 8 :
                // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:1:63: Parent
                {
                mParent(); 

                }
                break;
            case 9 :
                // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:1:70: Return
                {
                mReturn(); 

                }
                break;
            case 10 :
                // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:1:77: String
                {
                mString(); 

                }
                break;
            case 11 :
                // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:1:84: Switch
                {
                mSwitch(); 

                }
                break;
            case 12 :
                // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:1:91: Break
                {
                mBreak(); 

                }
                break;
            case 13 :
                // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:1:97: Class
                {
                mClass(); 

                }
                break;
            case 14 :
                // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:1:103: False
                {
                mFalse(); 

                }
                break;
            case 15 :
                // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:1:109: While
                {
                mWhile(); 

                }
                break;
            case 16 :
                // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:1:115: Case
                {
                mCase(); 

                }
                break;
            case 17 :
                // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:1:120: Else
                {
                mElse(); 

                }
                break;
            case 18 :
                // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:1:125: Null
                {
                mNull(); 

                }
                break;
            case 19 :
                // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:1:130: This
                {
                mThis(); 

                }
                break;
            case 20 :
                // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:1:135: True
                {
                mTrue(); 

                }
                break;
            case 21 :
                // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:1:140: LessThanSignLessThanSignEqualsSign
                {
                mLessThanSignLessThanSignEqualsSign(); 

                }
                break;
            case 22 :
                // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:1:175: GreaterThanSignGreaterThanSignEqualsSign
                {
                mGreaterThanSignGreaterThanSignEqualsSign(); 

                }
                break;
            case 23 :
                // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:1:216: SPC
                {
                mSPC(); 

                }
                break;
            case 24 :
                // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:1:220: TAB
                {
                mTAB(); 

                }
                break;
            case 25 :
                // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:1:224: For
                {
                mFor(); 

                }
                break;
            case 26 :
                // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:1:228: New
                {
                mNew(); 

                }
                break;
            case 27 :
                // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:1:232: ExclamationMarkEqualsSign
                {
                mExclamationMarkEqualsSign(); 

                }
                break;
            case 28 :
                // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:1:258: PercentSignEqualsSign
                {
                mPercentSignEqualsSign(); 

                }
                break;
            case 29 :
                // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:1:280: AmpersandAmpersand
                {
                mAmpersandAmpersand(); 

                }
                break;
            case 30 :
                // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:1:299: AmpersandEqualsSign
                {
                mAmpersandEqualsSign(); 

                }
                break;
            case 31 :
                // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:1:319: AsteriskEqualsSign
                {
                mAsteriskEqualsSign(); 

                }
                break;
            case 32 :
                // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:1:338: PlusSignPlusSign
                {
                mPlusSignPlusSign(); 

                }
                break;
            case 33 :
                // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:1:355: PlusSignEqualsSign
                {
                mPlusSignEqualsSign(); 

                }
                break;
            case 34 :
                // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:1:374: HyphenMinusHyphenMinus
                {
                mHyphenMinusHyphenMinus(); 

                }
                break;
            case 35 :
                // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:1:397: HyphenMinusEqualsSign
                {
                mHyphenMinusEqualsSign(); 

                }
                break;
            case 36 :
                // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:1:419: FullStopAsterisk
                {
                mFullStopAsterisk(); 

                }
                break;
            case 37 :
                // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:1:436: SolidusEqualsSign
                {
                mSolidusEqualsSign(); 

                }
                break;
            case 38 :
                // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:1:454: LessThanSignLessThanSign
                {
                mLessThanSignLessThanSign(); 

                }
                break;
            case 39 :
                // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:1:479: LessThanSignEqualsSign
                {
                mLessThanSignEqualsSign(); 

                }
                break;
            case 40 :
                // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:1:502: EqualsSignEqualsSign
                {
                mEqualsSignEqualsSign(); 

                }
                break;
            case 41 :
                // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:1:523: GreaterThanSignEqualsSign
                {
                mGreaterThanSignEqualsSign(); 

                }
                break;
            case 42 :
                // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:1:549: GreaterThanSignGreaterThanSign
                {
                mGreaterThanSignGreaterThanSign(); 

                }
                break;
            case 43 :
                // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:1:580: CommercialAtEqualsSign
                {
                mCommercialAtEqualsSign(); 

                }
                break;
            case 44 :
                // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:1:603: NL
                {
                mNL(); 

                }
                break;
            case 45 :
                // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:1:606: CircumflexAccentEqualsSign
                {
                mCircumflexAccentEqualsSign(); 

                }
                break;
            case 46 :
                // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:1:633: If
                {
                mIf(); 

                }
                break;
            case 47 :
                // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:1:636: VerticalLineEqualsSign
                {
                mVerticalLineEqualsSign(); 

                }
                break;
            case 48 :
                // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:1:659: VerticalLineVerticalLine
                {
                mVerticalLineVerticalLine(); 

                }
                break;
            case 49 :
                // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:1:684: ExclamationMark
                {
                mExclamationMark(); 

                }
                break;
            case 50 :
                // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:1:700: DollarSign
                {
                mDollarSign(); 

                }
                break;
            case 51 :
                // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:1:711: PercentSign
                {
                mPercentSign(); 

                }
                break;
            case 52 :
                // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:1:723: Ampersand
                {
                mAmpersand(); 

                }
                break;
            case 53 :
                // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:1:733: LeftParenthesis
                {
                mLeftParenthesis(); 

                }
                break;
            case 54 :
                // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:1:749: RightParenthesis
                {
                mRightParenthesis(); 

                }
                break;
            case 55 :
                // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:1:766: Asterisk
                {
                mAsterisk(); 

                }
                break;
            case 56 :
                // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:1:775: PlusSign
                {
                mPlusSign(); 

                }
                break;
            case 57 :
                // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:1:784: Comma
                {
                mComma(); 

                }
                break;
            case 58 :
                // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:1:790: HyphenMinus
                {
                mHyphenMinus(); 

                }
                break;
            case 59 :
                // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:1:802: FullStop
                {
                mFullStop(); 

                }
                break;
            case 60 :
                // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:1:811: Solidus
                {
                mSolidus(); 

                }
                break;
            case 61 :
                // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:1:819: Colon
                {
                mColon(); 

                }
                break;
            case 62 :
                // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:1:825: Semicolon
                {
                mSemicolon(); 

                }
                break;
            case 63 :
                // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:1:835: LessThanSign
                {
                mLessThanSign(); 

                }
                break;
            case 64 :
                // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:1:848: EqualsSign
                {
                mEqualsSign(); 

                }
                break;
            case 65 :
                // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:1:859: GreaterThanSign
                {
                mGreaterThanSign(); 

                }
                break;
            case 66 :
                // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:1:875: QuestionMark
                {
                mQuestionMark(); 

                }
                break;
            case 67 :
                // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:1:888: CommercialAt
                {
                mCommercialAt(); 

                }
                break;
            case 68 :
                // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:1:901: LeftSquareBracket
                {
                mLeftSquareBracket(); 

                }
                break;
            case 69 :
                // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:1:919: RightSquareBracket
                {
                mRightSquareBracket(); 

                }
                break;
            case 70 :
                // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:1:938: CircumflexAccent
                {
                mCircumflexAccent(); 

                }
                break;
            case 71 :
                // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:1:955: LeftCurlyBracket
                {
                mLeftCurlyBracket(); 

                }
                break;
            case 72 :
                // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:1:972: VerticalLine
                {
                mVerticalLine(); 

                }
                break;
            case 73 :
                // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:1:985: RightCurlyBracket
                {
                mRightCurlyBracket(); 

                }
                break;
            case 74 :
                // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:1:1003: Tilde
                {
                mTilde(); 

                }
                break;
            case 75 :
                // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:1:1009: RULE_HEX_VALUE
                {
                mRULE_HEX_VALUE(); 

                }
                break;
            case 76 :
                // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:1:1024: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 77 :
                // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:1:1032: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 78 :
                // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:1:1041: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 79 :
                // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:1:1053: RULE_TAGGED_STRING
                {
                mRULE_TAGGED_STRING(); 

                }
                break;
            case 80 :
                // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:1:1072: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 81 :
                // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:1:1088: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 82 :
                // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:1:1104: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 83 :
                // ../org.example.blorquescript.ui/src-gen/org/example/blorquescript/ui/contentassist/antlr/lexer/InternalBlorqueScriptLexer.g:1:1112: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA13 dfa13 = new DFA13(this);
    static final String DFA13_eotS =
        "\1\uffff\15\62\1\111\1\114\1\116\1\120\1\123\1\125\1\130\1\133"+
        "\1\135\1\141\1\143\1\145\1\147\1\152\1\153\13\uffff\1\170\2\uffff"+
        "\2\56\2\uffff\3\62\1\uffff\3\62\1\u0084\2\62\1\u0088\15\62\1\u0097"+
        "\2\uffff\1\u0099\61\uffff\10\62\1\uffff\2\62\1\u00a4\1\uffff\4\62"+
        "\1\u00a9\2\62\1\u00ac\4\62\1\u00b1\4\uffff\3\62\1\u00b5\5\62\1\u00bb"+
        "\1\uffff\4\62\1\uffff\2\62\1\uffff\1\62\1\u00c3\1\u00c4\1\u00c5"+
        "\1\uffff\2\62\1\u00c8\1\uffff\5\62\1\uffff\4\62\1\u00d2\1\u00d3"+
        "\1\u00d4\3\uffff\1\62\1\u00d6\1\uffff\2\62\1\u00d9\1\u00da\1\u00db"+
        "\1\u00dc\1\u00dd\1\u00de\1\u00df\3\uffff\1\62\1\uffff\1\u00e1\1"+
        "\u00e2\7\uffff\1\u00e3\3\uffff";
    static final String DFA13_eofS =
        "\u00e4\uffff";
    static final String DFA13_minS =
        "\1\0\1\101\1\105\1\101\1\106\1\105\1\102\1\105\1\120\1\122\1\101"+
        "\1\110\1\114\1\101\1\74\3\75\1\46\1\75\1\53\1\55\2\52\4\75\1\101"+
        "\13\uffff\1\170\2\uffff\2\0\2\uffff\1\116\1\101\1\123\1\uffff\1"+
        "\106\1\103\1\120\1\60\1\114\1\127\1\60\1\112\1\124\1\122\1\111\1"+
        "\103\1\105\1\114\1\122\1\111\1\123\1\111\1\125\1\102\1\75\2\uffff"+
        "\1\75\61\uffff\1\124\1\105\1\123\1\105\1\101\1\113\1\105\1\117\1"+
        "\uffff\1\102\1\114\1\60\1\uffff\1\105\1\125\1\111\1\124\1\60\1\101"+
        "\1\123\1\60\1\114\1\105\1\123\1\105\1\60\4\uffff\1\111\1\116\1\123"+
        "\1\60\1\125\1\101\1\116\1\122\1\105\1\60\1\uffff\1\103\1\122\1\116"+
        "\1\103\1\uffff\1\113\1\105\1\uffff\1\105\3\60\1\uffff\1\116\1\124"+
        "\1\60\1\uffff\1\114\1\107\2\124\1\122\1\uffff\1\124\1\116\1\107"+
        "\1\110\3\60\3\uffff\1\125\1\60\1\uffff\1\124\1\105\7\60\3\uffff"+
        "\1\105\1\uffff\2\60\7\uffff\1\60\3\uffff";
    static final String DFA13_maxS =
        "\1\uffff\1\157\1\145\1\141\1\155\1\165\1\142\1\145\1\167\1\162"+
        "\1\157\1\150\1\154\1\162\1\75\1\76\1\75\1\172\4\75\1\52\4\75\1\174"+
        "\1\172\13\uffff\1\170\2\uffff\2\uffff\2\uffff\1\156\1\151\1\163"+
        "\1\uffff\1\146\1\162\1\160\1\172\1\155\1\167\1\172\1\152\1\164\1"+
        "\162\1\151\1\143\1\145\1\154\1\162\1\151\1\163\1\151\1\165\1\142"+
        "\1\75\2\uffff\1\75\61\uffff\1\164\1\145\1\163\1\145\1\141\1\153"+
        "\1\145\1\157\1\uffff\1\142\1\154\1\172\1\uffff\1\145\1\165\1\151"+
        "\1\164\1\172\1\141\1\163\1\172\1\154\1\145\1\163\1\145\1\172\4\uffff"+
        "\1\151\1\156\1\163\1\172\1\165\1\141\1\156\1\162\1\145\1\172\1\uffff"+
        "\1\143\1\162\1\156\1\143\1\uffff\1\153\1\145\1\uffff\1\145\3\172"+
        "\1\uffff\1\156\1\164\1\172\1\uffff\1\154\1\147\2\164\1\162\1\uffff"+
        "\1\164\1\156\1\147\1\150\3\172\3\uffff\1\165\1\172\1\uffff\1\164"+
        "\1\145\7\172\3\uffff\1\145\1\uffff\2\172\7\uffff\1\172\3\uffff";
    static final String DFA13_acceptS =
        "\35\uffff\1\65\1\66\1\71\1\75\1\76\1\102\1\104\1\105\1\107\1\111"+
        "\1\112\1\uffff\1\114\1\115\2\uffff\1\122\1\123\3\uffff\1\114\25"+
        "\uffff\1\47\1\77\1\uffff\1\51\1\101\1\33\1\61\1\34\1\63\1\35\1\36"+
        "\1\64\1\37\1\67\1\40\1\41\1\70\1\42\1\43\1\72\1\44\1\73\1\45\1\120"+
        "\1\121\1\74\1\50\1\100\1\53\1\103\1\55\1\106\1\57\1\60\1\110\1\62"+
        "\1\65\1\66\1\71\1\75\1\76\1\102\1\104\1\105\1\107\1\111\1\112\1"+
        "\113\1\115\1\116\1\117\1\122\10\uffff\1\56\3\uffff\1\54\15\uffff"+
        "\1\25\1\46\1\26\1\52\12\uffff\1\32\4\uffff\1\27\2\uffff\1\31\4\uffff"+
        "\1\30\3\uffff\1\20\5\uffff\1\22\7\uffff\1\21\1\23\1\24\2\uffff\1"+
        "\15\11\uffff\1\14\1\16\1\17\1\uffff\1\4\2\uffff\1\10\1\5\1\6\1\7"+
        "\1\11\1\12\1\13\1\uffff\1\2\1\3\1\1";
    static final String DFA13_specialS =
        "\1\2\52\uffff\1\0\1\1\u00b7\uffff}>";
    static final String[] DFA13_transitionS = {
            "\11\56\2\55\2\56\1\55\22\56\1\55\1\20\1\53\1\56\1\34\1\21\1"+
            "\22\1\54\1\35\1\36\1\23\1\24\1\37\1\25\1\26\1\27\1\50\11\52"+
            "\1\40\1\41\1\16\1\30\1\17\1\42\1\31\1\51\1\11\1\1\1\2\1\14\1"+
            "\12\2\51\1\4\4\51\1\5\1\6\1\3\1\51\1\7\1\10\1\15\2\51\1\13\3"+
            "\51\1\43\1\56\1\44\1\32\1\51\1\56\1\51\1\11\1\1\1\2\1\14\1\12"+
            "\2\51\1\4\4\51\1\5\1\6\1\3\1\51\1\7\1\10\1\15\2\51\1\13\3\51"+
            "\1\45\1\33\1\46\1\47\uff81\56",
            "\1\61\12\uffff\1\60\2\uffff\1\57\21\uffff\1\61\12\uffff\1"+
            "\60\2\uffff\1\57",
            "\1\63\37\uffff\1\63",
            "\1\64\37\uffff\1\64",
            "\1\66\6\uffff\1\65\30\uffff\1\66\6\uffff\1\65",
            "\1\70\6\uffff\1\71\10\uffff\1\67\17\uffff\1\70\6\uffff\1\71"+
            "\10\uffff\1\67",
            "\1\72\37\uffff\1\72",
            "\1\73\37\uffff\1\73",
            "\1\76\3\uffff\1\74\2\uffff\1\75\30\uffff\1\76\3\uffff\1\74"+
            "\2\uffff\1\75",
            "\1\77\37\uffff\1\77",
            "\1\100\15\uffff\1\101\21\uffff\1\100\15\uffff\1\101",
            "\1\102\37\uffff\1\102",
            "\1\103\37\uffff\1\103",
            "\1\106\6\uffff\1\104\11\uffff\1\105\16\uffff\1\106\6\uffff"+
            "\1\104\11\uffff\1\105",
            "\1\107\1\110",
            "\1\113\1\112",
            "\1\115",
            "\1\117\3\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\121\26\uffff\1\122",
            "\1\124",
            "\1\126\21\uffff\1\127",
            "\1\131\17\uffff\1\132",
            "\1\134",
            "\1\137\4\uffff\1\140\15\uffff\1\136",
            "\1\142",
            "\1\144",
            "\1\146",
            "\1\150\76\uffff\1\151",
            "\32\62\4\uffff\1\62\1\uffff\32\62",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\167",
            "",
            "",
            "\0\171",
            "\0\172",
            "",
            "",
            "\1\174\37\uffff\1\174",
            "\1\176\7\uffff\1\175\27\uffff\1\176\7\uffff\1\175",
            "\1\177\37\uffff\1\177",
            "",
            "\1\u0080\37\uffff\1\u0080",
            "\1\u0081\16\uffff\1\u0082\20\uffff\1\u0081\16\uffff\1\u0082",
            "\1\u0083\37\uffff\1\u0083",
            "\13\62\6\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\u0086\1\u0085\36\uffff\1\u0086\1\u0085",
            "\1\u0087\37\uffff\1\u0087",
            "\13\62\6\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\u0089\37\uffff\1\u0089",
            "\1\u008a\37\uffff\1\u008a",
            "\1\u008b\37\uffff\1\u008b",
            "\1\u008c\37\uffff\1\u008c",
            "\1\u008d\37\uffff\1\u008d",
            "\1\u008e\37\uffff\1\u008e",
            "\1\u008f\37\uffff\1\u008f",
            "\1\u0090\37\uffff\1\u0090",
            "\1\u0091\37\uffff\1\u0091",
            "\1\u0092\37\uffff\1\u0092",
            "\1\u0093\37\uffff\1\u0093",
            "\1\u0094\37\uffff\1\u0094",
            "\1\u0095\37\uffff\1\u0095",
            "\1\u0096",
            "",
            "",
            "\1\u0098",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u009a\37\uffff\1\u009a",
            "\1\u009b\37\uffff\1\u009b",
            "\1\u009c\37\uffff\1\u009c",
            "\1\u009d\37\uffff\1\u009d",
            "\1\u009e\37\uffff\1\u009e",
            "\1\u009f\37\uffff\1\u009f",
            "\1\u00a0\37\uffff\1\u00a0",
            "\1\u00a1\37\uffff\1\u00a1",
            "",
            "\1\u00a2\37\uffff\1\u00a2",
            "\1\u00a3\37\uffff\1\u00a3",
            "\13\62\6\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "",
            "\1\u00a5\37\uffff\1\u00a5",
            "\1\u00a6\37\uffff\1\u00a6",
            "\1\u00a7\37\uffff\1\u00a7",
            "\1\u00a8\37\uffff\1\u00a8",
            "\13\62\6\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\u00aa\37\uffff\1\u00aa",
            "\1\u00ab\37\uffff\1\u00ab",
            "\13\62\6\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\u00ad\37\uffff\1\u00ad",
            "\1\u00ae\37\uffff\1\u00ae",
            "\1\u00af\37\uffff\1\u00af",
            "\1\u00b0\37\uffff\1\u00b0",
            "\13\62\6\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "",
            "",
            "",
            "",
            "\1\u00b2\37\uffff\1\u00b2",
            "\1\u00b3\37\uffff\1\u00b3",
            "\1\u00b4\37\uffff\1\u00b4",
            "\13\62\6\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\u00b6\37\uffff\1\u00b6",
            "\1\u00b7\37\uffff\1\u00b7",
            "\1\u00b8\37\uffff\1\u00b8",
            "\1\u00b9\37\uffff\1\u00b9",
            "\1\u00ba\37\uffff\1\u00ba",
            "\13\62\6\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "",
            "\1\u00bc\37\uffff\1\u00bc",
            "\1\u00bd\37\uffff\1\u00bd",
            "\1\u00be\37\uffff\1\u00be",
            "\1\u00bf\37\uffff\1\u00bf",
            "",
            "\1\u00c0\37\uffff\1\u00c0",
            "\1\u00c1\37\uffff\1\u00c1",
            "",
            "\1\u00c2\37\uffff\1\u00c2",
            "\13\62\6\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\13\62\6\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\13\62\6\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "",
            "\1\u00c6\37\uffff\1\u00c6",
            "\1\u00c7\37\uffff\1\u00c7",
            "\13\62\6\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "",
            "\1\u00c9\37\uffff\1\u00c9",
            "\1\u00ca\37\uffff\1\u00ca",
            "\1\u00cb\37\uffff\1\u00cb",
            "\1\u00cc\37\uffff\1\u00cc",
            "\1\u00cd\37\uffff\1\u00cd",
            "",
            "\1\u00ce\37\uffff\1\u00ce",
            "\1\u00cf\37\uffff\1\u00cf",
            "\1\u00d0\37\uffff\1\u00d0",
            "\1\u00d1\37\uffff\1\u00d1",
            "\13\62\6\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\13\62\6\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\13\62\6\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "",
            "",
            "",
            "\1\u00d5\37\uffff\1\u00d5",
            "\13\62\6\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "",
            "\1\u00d7\37\uffff\1\u00d7",
            "\1\u00d8\37\uffff\1\u00d8",
            "\13\62\6\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\13\62\6\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\13\62\6\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\13\62\6\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\13\62\6\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\13\62\6\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\13\62\6\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "",
            "",
            "",
            "\1\u00e0\37\uffff\1\u00e0",
            "",
            "\13\62\6\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\13\62\6\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\13\62\6\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "",
            "",
            ""
    };

    static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
    static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
    static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
    static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
    static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
    static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
    static final short[][] DFA13_transition;

    static {
        int numStates = DFA13_transitionS.length;
        DFA13_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        }
    }

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = DFA13_eot;
            this.eof = DFA13_eof;
            this.min = DFA13_min;
            this.max = DFA13_max;
            this.accept = DFA13_accept;
            this.special = DFA13_special;
            this.transition = DFA13_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( Continue | Default | Package | Client | Import | Number | Object | Parent | Return | String | Switch | Break | Class | False | While | Case | Else | Null | This | True | LessThanSignLessThanSignEqualsSign | GreaterThanSignGreaterThanSignEqualsSign | SPC | TAB | For | New | ExclamationMarkEqualsSign | PercentSignEqualsSign | AmpersandAmpersand | AmpersandEqualsSign | AsteriskEqualsSign | PlusSignPlusSign | PlusSignEqualsSign | HyphenMinusHyphenMinus | HyphenMinusEqualsSign | FullStopAsterisk | SolidusEqualsSign | LessThanSignLessThanSign | LessThanSignEqualsSign | EqualsSignEqualsSign | GreaterThanSignEqualsSign | GreaterThanSignGreaterThanSign | CommercialAtEqualsSign | NL | CircumflexAccentEqualsSign | If | VerticalLineEqualsSign | VerticalLineVerticalLine | ExclamationMark | DollarSign | PercentSign | Ampersand | LeftParenthesis | RightParenthesis | Asterisk | PlusSign | Comma | HyphenMinus | FullStop | Solidus | Colon | Semicolon | LessThanSign | EqualsSign | GreaterThanSign | QuestionMark | CommercialAt | LeftSquareBracket | RightSquareBracket | CircumflexAccent | LeftCurlyBracket | VerticalLine | RightCurlyBracket | Tilde | RULE_HEX_VALUE | RULE_ID | RULE_INT | RULE_STRING | RULE_TAGGED_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA13_43 = input.LA(1);

                        s = -1;
                        if ( ((LA13_43>='\u0000' && LA13_43<='\uFFFF')) ) {s = 121;}

                        else s = 46;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA13_44 = input.LA(1);

                        s = -1;
                        if ( ((LA13_44>='\u0000' && LA13_44<='\uFFFF')) ) {s = 122;}

                        else s = 46;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA13_0 = input.LA(1);

                        s = -1;
                        if ( (LA13_0=='C'||LA13_0=='c') ) {s = 1;}

                        else if ( (LA13_0=='D'||LA13_0=='d') ) {s = 2;}

                        else if ( (LA13_0=='P'||LA13_0=='p') ) {s = 3;}

                        else if ( (LA13_0=='I'||LA13_0=='i') ) {s = 4;}

                        else if ( (LA13_0=='N'||LA13_0=='n') ) {s = 5;}

                        else if ( (LA13_0=='O'||LA13_0=='o') ) {s = 6;}

                        else if ( (LA13_0=='R'||LA13_0=='r') ) {s = 7;}

                        else if ( (LA13_0=='S'||LA13_0=='s') ) {s = 8;}

                        else if ( (LA13_0=='B'||LA13_0=='b') ) {s = 9;}

                        else if ( (LA13_0=='F'||LA13_0=='f') ) {s = 10;}

                        else if ( (LA13_0=='W'||LA13_0=='w') ) {s = 11;}

                        else if ( (LA13_0=='E'||LA13_0=='e') ) {s = 12;}

                        else if ( (LA13_0=='T'||LA13_0=='t') ) {s = 13;}

                        else if ( (LA13_0=='<') ) {s = 14;}

                        else if ( (LA13_0=='>') ) {s = 15;}

                        else if ( (LA13_0=='!') ) {s = 16;}

                        else if ( (LA13_0=='%') ) {s = 17;}

                        else if ( (LA13_0=='&') ) {s = 18;}

                        else if ( (LA13_0=='*') ) {s = 19;}

                        else if ( (LA13_0=='+') ) {s = 20;}

                        else if ( (LA13_0=='-') ) {s = 21;}

                        else if ( (LA13_0=='.') ) {s = 22;}

                        else if ( (LA13_0=='/') ) {s = 23;}

                        else if ( (LA13_0=='=') ) {s = 24;}

                        else if ( (LA13_0=='@') ) {s = 25;}

                        else if ( (LA13_0=='^') ) {s = 26;}

                        else if ( (LA13_0=='|') ) {s = 27;}

                        else if ( (LA13_0=='$') ) {s = 28;}

                        else if ( (LA13_0=='(') ) {s = 29;}

                        else if ( (LA13_0==')') ) {s = 30;}

                        else if ( (LA13_0==',') ) {s = 31;}

                        else if ( (LA13_0==':') ) {s = 32;}

                        else if ( (LA13_0==';') ) {s = 33;}

                        else if ( (LA13_0=='?') ) {s = 34;}

                        else if ( (LA13_0=='[') ) {s = 35;}

                        else if ( (LA13_0==']') ) {s = 36;}

                        else if ( (LA13_0=='{') ) {s = 37;}

                        else if ( (LA13_0=='}') ) {s = 38;}

                        else if ( (LA13_0=='~') ) {s = 39;}

                        else if ( (LA13_0=='0') ) {s = 40;}

                        else if ( (LA13_0=='A'||(LA13_0>='G' && LA13_0<='H')||(LA13_0>='J' && LA13_0<='M')||LA13_0=='Q'||(LA13_0>='U' && LA13_0<='V')||(LA13_0>='X' && LA13_0<='Z')||LA13_0=='_'||LA13_0=='a'||(LA13_0>='g' && LA13_0<='h')||(LA13_0>='j' && LA13_0<='m')||LA13_0=='q'||(LA13_0>='u' && LA13_0<='v')||(LA13_0>='x' && LA13_0<='z')) ) {s = 41;}

                        else if ( ((LA13_0>='1' && LA13_0<='9')) ) {s = 42;}

                        else if ( (LA13_0=='\"') ) {s = 43;}

                        else if ( (LA13_0=='\'') ) {s = 44;}

                        else if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {s = 45;}

                        else if ( ((LA13_0>='\u0000' && LA13_0<='\b')||(LA13_0>='\u000B' && LA13_0<='\f')||(LA13_0>='\u000E' && LA13_0<='\u001F')||LA13_0=='#'||LA13_0=='\\'||LA13_0=='`'||(LA13_0>='\u007F' && LA13_0<='\uFFFF')) ) {s = 46;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 13, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}