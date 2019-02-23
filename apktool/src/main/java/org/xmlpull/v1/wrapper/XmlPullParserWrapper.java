/* -*-             c-basic-offset: 4; indent-tabs-mode: nil; -*-  //------100-columns-wide------>|*/
// for license please see accompanying LICENSE.txt file (available also at http://www.xmlpull.org/)

package org.xmlpull.v1.wrapper;

import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/**
 * Extensions to XmlPullParser interface
 *
 * @author <a href="http://www.extreme.indiana.edu/~aslom/">Aleksander Slominski</a>
 * @author Naresh Bhatia
 */
public interface XmlPullParserWrapper extends XmlPullParser {
    public static final String XSI_NS = "http://www.w3.org/2001/XMLSchema-instance";
    public static final String XSD_NS = "http://www.w3.org/2001/XMLSchema";

    /**
     * Return value of attribute with given name and no namespace.
     */
    public String getAttributeValue(String name);

    /**
     * Return PITarget from Processing Instruction (PI) as defined in
     * XML 1.0 Section 2.6 Processing Instructions
     *  <code>[16] PI ::= '&lt;?' PITarget (S (Char* - (Char* '?>' Char*)))? '?>'</code>
     */
    public String getPITarget() throws IllegalStateException;

    /**
     * Return everything past PITarget and S from Processing Instruction (PI) as defined in
     * XML 1.0 Section 2.6 Processing Instructions
     *  <code>[16] PI ::= '&lt;?' PITarget (S (Char* - (Char* '?>' Char*)))? '?>'</code>
     *
     * <p><b>NOTE:</b> if there is no PI data it returns empty string.
     */
    public String getPIData() throws IllegalStateException;


    /**
     * Read attribute value and return it or throw exception if
     * current element does not have such attribute.
     */
    public String getRequiredAttributeValue(String name)
        throws IOException, XmlPullParserException;

    /**
     * Read attribute value and return it or throw exception if
     * current element does not have such attribute.
     */
    public String getRequiredAttributeValue(String namespace, String name)
        throws IOException, XmlPullParserException;

    /**
     * Read the text of a required element and return it or throw exception if
     * required element is not found. Useful for getting the text of simple
     * elements such as <username>johndoe</username>. Assumes that parser is
     * just before the start tag and leaves the parser at the end tag. If the
     * text is nil (e.g. <username xsi:nil="true"/>), then a null will be returned.
     */
    public String getRequiredElementText(String namespace, String name)
        throws IOException, XmlPullParserException;

    /**
     * Is the current tag nil? Checks for xsi:nil="true".
     */
    public boolean isNil() throws IOException, XmlPullParserException;

    /**
     * Tests if the current event is of the given type and if the namespace and name match.
     * null will match any namespace and any name. If the test passes a true is returned
     * otherwise a false is returned.
     */
    public boolean matches(int type, String namespace, String name)
        throws XmlPullParserException;


    /**
     * call parser nextTag() and check that it is START_TAG, throw exception if not.
     */
    public void nextStartTag()
        throws XmlPullParserException, IOException;

    /**
     * combine nextTag(); pp.require(XmlPullParser.START_TAG, null, name);
     */
    public void nextStartTag(String name)
        throws XmlPullParserException, IOException;

    /**
     * combine nextTag(); pp.require(XmlPullParser.START_TAG, namespace, name);
     */
    public void nextStartTag(String namespace, String name)
        throws XmlPullParserException, IOException;

    /**
     * Call parser nextTag() and check that it is END_TAG, throw exception if not.
     */
    public void nextEndTag() throws XmlPullParserException, IOException;

    /**
     * combine nextTag(); pp.require(XmlPullParser.END_TAG, null, name);
     */
    public void nextEndTag(String name)
        throws XmlPullParserException, IOException;


    /**
     * combine nextTag(); pp.require(XmlPullParser.END_TAG, namespace, name);
     */
    public void nextEndTag(String namespace, String name)
        throws XmlPullParserException, IOException;

    /**
     * Read text content of element ith given namespace and name
     * (use null namespace do indicate that nemspace should not be checked)
     */

    public String nextText(String namespace, String name)
        throws IOException, XmlPullParserException;

    /**
     * Skip sub tree that is currently porser positioned on.
     * <br>NOTE: parser must be on START_TAG and when funtion returns
     * parser will be positioned on matching END_TAG
     *
     * This is typically optimized internally by parser but the logic should follow this:
     * <code>
     * pp.require(XmlPullParser.START_TAG, null, null);
     * int level = 1;
     * while(level > 0) {
     *   int eventType = pp.next();
     *   if(eventType == XmlPullParser.END_TAG) {
     *     --level;
     *   } else if(eventType == XmlPullParser.START_TAG) {
     *     ++level;
     *   }
     * }
     * </code>
     */
    public void skipSubTree()
        throws XmlPullParserException, IOException;

    // set of methods to read XSD types

//    /**
//     * Read string content of elment and try to convert it to double.
//     * Take special care of INF, Infinity and NaN.
//     * After this method executed the parser is positioned on END_TAG.
//     */
//    public double readDouble() throws XmlPullParserException, IOException;
//
//    /**
//     * Read string content of elment and convert it to float.
//     * Take special care of INF, Infinity and NaN.
//     * After this method executed the parser is positioned on END_TAG.
//     */
//    public float readFloat() throws XmlPullParserException, IOException;
//
//    /**
//     * Read string content of elment and try to convert it to int.
//     * Take special care of INF, Infinity and NaN.
//     * After this method executed the parser is positioned on END_TAG.
//     */
//    public int readInt() throws XmlPullParserException, IOException;
//
//    /**
//     * Check for xsi:nil and if it has value 'true' returns null
//     * as described in
//     * <a href="http://www.w3.org/TR/xmlschema-1/#Instance_Document_Constructions">XML Schemas
//     * Part 1</a>
//     * otherwise it calls nextText().
//     * After this method executed the parser is positioned on END_TAG.
//     */
//    public String readString() throws XmlPullParserException, IOException;
//
//    /**
//     * Check that parser is on START_TAG with given namespace and name
//     * and then call readDouble().
//     */
//    public double readDoubleElement(String namespace, String name)
//        throws XmlPullParserException, IOException;
//
//    /**
//     * Check that parser is on START_TAG with given namespace and name
//     * and then call readFloat().
//     */
//    public float readFloatElement(String namespace, String name)
//        throws XmlPullParserException, IOException;
//
//    /**
//     * Check that parser is on START_TAG with given namespace and name
//     * and then call readInt().
//     */
//    public int readIntElement(String namespace, String name)
//        throws XmlPullParserException, IOException;
//
//    /**
//     * Check that parser is on START_TAG with given namespace and name
//     * and then call readString().
//     */
//    public String readStringElemet(String namespace, String name)
//        throws XmlPullParserException, IOException;
//
}

