//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.1-05/30/2003 05:06 AM(java_re)-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2008.02.23 at 11:11:43 GMT+01:00 
//


package freemind.controller.actions.generated.instance.impl;

public class PluginImpl
    extends freemind.controller.actions.generated.instance.impl.PluginTypeImpl
    implements freemind.controller.actions.generated.instance.Plugin, com.sun.xml.bind.JAXBObject, com.sun.xml.bind.RIElement, freemind.controller.actions.generated.instance.impl.runtime.UnmarshallableObject, freemind.controller.actions.generated.instance.impl.runtime.XMLSerializable, freemind.controller.actions.generated.instance.impl.runtime.ValidatableObject
{

    public final static java.lang.Class version = (freemind.controller.actions.generated.instance.impl.JAXBVersion.class);
    private static com.sun.msv.grammar.Grammar schemaFragment;

    public java.lang.String ____jaxb_ri____getNamespaceURI() {
        return "";
    }

    public java.lang.String ____jaxb_ri____getLocalName() {
        return "plugin";
    }

    private final static java.lang.Class PRIMARY_INTERFACE_CLASS() {
        return (freemind.controller.actions.generated.instance.Plugin.class);
    }

    public freemind.controller.actions.generated.instance.impl.runtime.UnmarshallingEventHandler createUnmarshaller(freemind.controller.actions.generated.instance.impl.runtime.UnmarshallingContext context) {
        return new freemind.controller.actions.generated.instance.impl.PluginImpl.Unmarshaller(context);
    }

    public void serializeElementBody(freemind.controller.actions.generated.instance.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        context.startElement("", "plugin");
        super.serializeURIs(context);
        context.endNamespaceDecls();
        super.serializeAttributes(context);
        context.endAttributes();
        super.serializeElementBody(context);
        context.endElement();
    }

    public void serializeAttributes(freemind.controller.actions.generated.instance.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
    }

    public void serializeAttributeBody(freemind.controller.actions.generated.instance.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        context.startElement("", "plugin");
        super.serializeURIs(context);
        context.endNamespaceDecls();
        super.serializeAttributes(context);
        context.endAttributes();
        super.serializeElementBody(context);
        context.endElement();
    }

    public void serializeURIs(freemind.controller.actions.generated.instance.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
    }

    public java.lang.Class getPrimaryInterface() {
        return (freemind.controller.actions.generated.instance.Plugin.class);
    }

    public com.sun.msv.verifier.DocumentDeclaration createRawValidator() {
        if (schemaFragment == null) {
            schemaFragment = com.sun.xml.bind.validator.SchemaDeserializer.deserialize((
 "\u00ac\u00ed\u0000\u0005sr\u0000\'com.sun.msv.grammar.trex.ElementPattern\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000"
+"\tnameClasst\u0000\u001fLcom/sun/msv/grammar/NameClass;xr\u0000\u001ecom.sun.msv."
+"grammar.ElementExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002Z\u0000\u001aignoreUndeclaredAttributesL\u0000"
+"\fcontentModelt\u0000 Lcom/sun/msv/grammar/Expression;xr\u0000\u001ecom.sun."
+"msv.grammar.Expression\u00f8\u0018\u0082\u00e8N5~O\u0002\u0000\u0003I\u0000\u000ecachedHashCodeL\u0000\u0013epsilon"
+"Reducibilityt\u0000\u0013Ljava/lang/Boolean;L\u0000\u000bexpandedExpq\u0000~\u0000\u0003xp\u0005\u00fe\u0089\u00e6p"
+"p\u0000sr\u0000\u001fcom.sun.msv.grammar.SequenceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.sun."
+"msv.grammar.BinaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0004exp1q\u0000~\u0000\u0003L\u0000\u0004exp2q\u0000~\u0000\u0003xq\u0000~"
+"\u0000\u0004\u0005\u00fe\u0089\u00dbppsq\u0000~\u0000\u0007\u0004~\u00e7cppsq\u0000~\u0000\u0007\u0002\u00ffD\u00ebppsr\u0000\u001dcom.sun.msv.grammar.Choi"
+"ceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\b\u0001\u007f\u00a2sppsr\u0000 com.sun.msv.grammar.OneOrMor"
+"eExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001ccom.sun.msv.grammar.UnaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000"
+"\u0003expq\u0000~\u0000\u0003xq\u0000~\u0000\u0004\u0001\u007f\u00a2hsr\u0000\u0011java.lang.Boolean\u00cd r\u0080\u00d5\u009c\u00fa\u00ee\u0002\u0000\u0001Z\u0000\u0005valuex"
+"p\u0000psq\u0000~\u0000\f\u0001\u007f\u00a2eq\u0000~\u0000\u0012psq\u0000~\u0000\u0000\u0000\u00bf\u00d17q\u0000~\u0000\u0012p\u0000sq\u0000~\u0000\u0000\u0000\u00bf\u00d1,pp\u0000sq\u0000~\u0000\f\u0000\u00bf\u00d1!p"
+"psq\u0000~\u0000\u000e\u0000\u00bf\u00d1\u0016q\u0000~\u0000\u0012psr\u0000 com.sun.msv.grammar.AttributeExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000"
+"\u0001\u0002\u0000\u0002L\u0000\u0003expq\u0000~\u0000\u0003L\u0000\tnameClassq\u0000~\u0000\u0001xq\u0000~\u0000\u0004\u0000\u00bf\u00d1\u0013q\u0000~\u0000\u0012psr\u00002com.sun."
+"msv.grammar.Expression$AnyStringExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0004\u0000"
+"\u0000\u0000\bsq\u0000~\u0000\u0011\u0001psr\u0000 com.sun.msv.grammar.AnyNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr"
+"\u0000\u001dcom.sun.msv.grammar.NameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpsr\u00000com.sun.msv."
+"grammar.Expression$EpsilonExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0004\u0000\u0000\u0000\tq\u0000~"
+"\u0000\u001cq\u0000~\u0000!sr\u0000#com.sun.msv.grammar.SimpleNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\t"
+"localNamet\u0000\u0012Ljava/lang/String;L\u0000\fnamespaceURIq\u0000~\u0000#xq\u0000~\u0000\u001et\u0000Bf"
+"reemind.controller.actions.generated.instance.PluginClasspat"
+"hTypet\u0000+http://java.sun.com/jaxb/xjc/dummy-elementssq\u0000~\u0000\"t\u0000\u0010"
+"plugin_classpatht\u0000\u0000sq\u0000~\u0000\u0000\u0000\u00bf\u00d1,q\u0000~\u0000\u0012p\u0000sq\u0000~\u0000\f\u0000\u00bf\u00d1!ppsq\u0000~\u0000\u000e\u0000\u00bf\u00d1\u0016q\u0000"
+"~\u0000\u0012psq\u0000~\u0000\u0018\u0000\u00bf\u00d1\u0013q\u0000~\u0000\u0012pq\u0000~\u0000\u001bq\u0000~\u0000\u001fq\u0000~\u0000!sq\u0000~\u0000\"t\u0000>freemind.control"
+"ler.actions.generated.instance.PluginClasspathq\u0000~\u0000&q\u0000~\u0000!sq\u0000~"
+"\u0000\f\u0001\u007f\u00a2sppsq\u0000~\u0000\u000e\u0001\u007f\u00a2hq\u0000~\u0000\u0012psq\u0000~\u0000\f\u0001\u007f\u00a2eq\u0000~\u0000\u0012psq\u0000~\u0000\u0000\u0000\u00bf\u00d17q\u0000~\u0000\u0012p\u0000sq\u0000"
+"~\u0000\u0000\u0000\u00bf\u00d1,pp\u0000sq\u0000~\u0000\f\u0000\u00bf\u00d1!ppsq\u0000~\u0000\u000e\u0000\u00bf\u00d1\u0016q\u0000~\u0000\u0012psq\u0000~\u0000\u0018\u0000\u00bf\u00d1\u0013q\u0000~\u0000\u0012pq\u0000~\u0000\u001bq"
+"\u0000~\u0000\u001fq\u0000~\u0000!sq\u0000~\u0000\"t\u0000Efreemind.controller.actions.generated.inst"
+"ance.PluginRegistrationTypeq\u0000~\u0000&sq\u0000~\u0000\"t\u0000\u0013plugin_registration"
+"q\u0000~\u0000)sq\u0000~\u0000\u0000\u0000\u00bf\u00d1,q\u0000~\u0000\u0012p\u0000sq\u0000~\u0000\f\u0000\u00bf\u00d1!ppsq\u0000~\u0000\u000e\u0000\u00bf\u00d1\u0016q\u0000~\u0000\u0012psq\u0000~\u0000\u0018\u0000\u00bf\u00d1\u0013"
+"q\u0000~\u0000\u0012pq\u0000~\u0000\u001bq\u0000~\u0000\u001fq\u0000~\u0000!sq\u0000~\u0000\"t\u0000Afreemind.controller.actions.ge"
+"nerated.instance.PluginRegistrationq\u0000~\u0000&q\u0000~\u0000!sq\u0000~\u0000\f\u0001\u007f\u00a2sppsq\u0000"
+"~\u0000\u000e\u0001\u007f\u00a2hq\u0000~\u0000\u0012psq\u0000~\u0000\f\u0001\u007f\u00a2eq\u0000~\u0000\u0012psq\u0000~\u0000\u0000\u0000\u00bf\u00d17q\u0000~\u0000\u0012p\u0000sq\u0000~\u0000\u0000\u0000\u00bf\u00d1,pp\u0000s"
+"q\u0000~\u0000\f\u0000\u00bf\u00d1!ppsq\u0000~\u0000\u000e\u0000\u00bf\u00d1\u0016q\u0000~\u0000\u0012psq\u0000~\u0000\u0018\u0000\u00bf\u00d1\u0013q\u0000~\u0000\u0012pq\u0000~\u0000\u001bq\u0000~\u0000\u001fq\u0000~\u0000!sq"
+"\u0000~\u0000\"t\u0000?freemind.controller.actions.generated.instance.Plugin"
+"ActionTypeq\u0000~\u0000&sq\u0000~\u0000\"t\u0000\rplugin_actionq\u0000~\u0000)sq\u0000~\u0000\u0000\u0000\u00bf\u00d1,q\u0000~\u0000\u0012p\u0000s"
+"q\u0000~\u0000\f\u0000\u00bf\u00d1!ppsq\u0000~\u0000\u000e\u0000\u00bf\u00d1\u0016q\u0000~\u0000\u0012psq\u0000~\u0000\u0018\u0000\u00bf\u00d1\u0013q\u0000~\u0000\u0012pq\u0000~\u0000\u001bq\u0000~\u0000\u001fq\u0000~\u0000!sq"
+"\u0000~\u0000\"t\u0000;freemind.controller.actions.generated.instance.Plugin"
+"Actionq\u0000~\u0000&q\u0000~\u0000!sq\u0000~\u0000\f\u0001\u007f\u00a2sppsq\u0000~\u0000\u000e\u0001\u007f\u00a2hq\u0000~\u0000\u0012psq\u0000~\u0000\f\u0001\u007f\u00a2eq\u0000~\u0000\u0012p"
+"sq\u0000~\u0000\u0000\u0000\u00bf\u00d17q\u0000~\u0000\u0012p\u0000sq\u0000~\u0000\u0000\u0000\u00bf\u00d1,pp\u0000sq\u0000~\u0000\f\u0000\u00bf\u00d1!ppsq\u0000~\u0000\u000e\u0000\u00bf\u00d1\u0016q\u0000~\u0000\u0012psq"
+"\u0000~\u0000\u0018\u0000\u00bf\u00d1\u0013q\u0000~\u0000\u0012pq\u0000~\u0000\u001bq\u0000~\u0000\u001fq\u0000~\u0000!sq\u0000~\u0000\"t\u0000@freemind.controller.ac"
+"tions.generated.instance.PluginStringsTypeq\u0000~\u0000&sq\u0000~\u0000\"t\u0000\u000eplug"
+"in_stringsq\u0000~\u0000)sq\u0000~\u0000\u0000\u0000\u00bf\u00d1,q\u0000~\u0000\u0012p\u0000sq\u0000~\u0000\f\u0000\u00bf\u00d1!ppsq\u0000~\u0000\u000e\u0000\u00bf\u00d1\u0016q\u0000~\u0000\u0012p"
+"sq\u0000~\u0000\u0018\u0000\u00bf\u00d1\u0013q\u0000~\u0000\u0012pq\u0000~\u0000\u001bq\u0000~\u0000\u001fq\u0000~\u0000!sq\u0000~\u0000\"t\u0000<freemind.controller."
+"actions.generated.instance.PluginStringsq\u0000~\u0000&q\u0000~\u0000!sq\u0000~\u0000\"t\u0000\u0006p"
+"luginq\u0000~\u0000)sr\u0000\"com.sun.msv.grammar.ExpressionPool\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L"
+"\u0000\bexpTablet\u0000/Lcom/sun/msv/grammar/ExpressionPool$ClosedHash;"
+"xpsr\u0000-com.sun.msv.grammar.ExpressionPool$ClosedHash\u00d7j\u00d0N\u00ef\u00e8\u00ed\u001c\u0002"
+"\u0000\u0004I\u0000\u0005countI\u0000\tthresholdL\u0000\u0006parentq\u0000~\u0000i[\u0000\u0005tablet\u0000![Lcom/sun/msv"
+"/grammar/Expression;xp\u0000\u0000\u0000\u001f\u0000\u0000\u00009pur\u0000![Lcom.sun.msv.grammar.Exp"
+"ression;\u00d68D\u00c3]\u00ad\u00a7\n\u0002\u0000\u0000xp\u0000\u0000\u0000\u00bfppppppppppppppppppppppppppppppppppp"
+"pppppppppppq\u0000~\u0000\u0017q\u0000~\u0000,q\u0000~\u00006q\u0000~\u0000>q\u0000~\u0000Hq\u0000~\u0000Pq\u0000~\u0000Zq\u0000~\u0000bpppq\u0000~\u0000\u0016q"
+"\u0000~\u0000+q\u0000~\u00005q\u0000~\u0000=q\u0000~\u0000Gq\u0000~\u0000Oq\u0000~\u0000Yq\u0000~\u0000apppppppppppppppppppppppppp"
+"pppq\u0000~\u0000\tppppppppppppppppppppppq\u0000~\u0000\nppppppppppppppppppppppq\u0000~"
+"\u0000\u000bppppppppq\u0000~\u0000\u0013q\u0000~\u00002q\u0000~\u0000Dq\u0000~\u0000\u0010q\u0000~\u00001q\u0000~\u0000Cq\u0000~\u0000Vq\u0000~\u0000Uppppppq\u0000~\u0000"
+"\rq\u0000~\u00000q\u0000~\u0000Bq\u0000~\u0000Tpppppppppppppppppppppppp"));
        }
        return new com.sun.msv.verifier.regexp.REDocumentDeclaration(schemaFragment);
    }

    public class Unmarshaller
        extends freemind.controller.actions.generated.instance.impl.runtime.AbstractUnmarshallingEventHandlerImpl
    {


        public Unmarshaller(freemind.controller.actions.generated.instance.impl.runtime.UnmarshallingContext context) {
            super(context, "----");
        }

        protected Unmarshaller(freemind.controller.actions.generated.instance.impl.runtime.UnmarshallingContext context, int startState) {
            this(context);
            state = startState;
        }

        public java.lang.Object owner() {
            return freemind.controller.actions.generated.instance.impl.PluginImpl.this;
        }

        public void enterElement(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname, org.xml.sax.Attributes __atts)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  3 :
                        revertToParentFromEnterElement(___uri, ___local, ___qname, __atts);
                        return ;
                    case  0 :
                        if (("plugin" == ___local)&&("" == ___uri)) {
                            context.pushAttributes(__atts, false);
                            state = 1;
                            return ;
                        }
                        break;
                    case  1 :
                        if (("plugin_classpath" == ___local)&&("" == ___uri)) {
                            spawnHandlerFromEnterElement((((freemind.controller.actions.generated.instance.impl.PluginTypeImpl)freemind.controller.actions.generated.instance.impl.PluginImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("plugin_registration" == ___local)&&("" == ___uri)) {
                            spawnHandlerFromEnterElement((((freemind.controller.actions.generated.instance.impl.PluginTypeImpl)freemind.controller.actions.generated.instance.impl.PluginImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("plugin_action" == ___local)&&("" == ___uri)) {
                            spawnHandlerFromEnterElement((((freemind.controller.actions.generated.instance.impl.PluginTypeImpl)freemind.controller.actions.generated.instance.impl.PluginImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("plugin_strings" == ___local)&&("" == ___uri)) {
                            spawnHandlerFromEnterElement((((freemind.controller.actions.generated.instance.impl.PluginTypeImpl)freemind.controller.actions.generated.instance.impl.PluginImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        spawnHandlerFromEnterElement((((freemind.controller.actions.generated.instance.impl.PluginTypeImpl)freemind.controller.actions.generated.instance.impl.PluginImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                        return ;
                }
                super.enterElement(___uri, ___local, ___qname, __atts);
                break;
            }
        }

        public void leaveElement(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  3 :
                        revertToParentFromLeaveElement(___uri, ___local, ___qname);
                        return ;
                    case  2 :
                        if (("plugin" == ___local)&&("" == ___uri)) {
                            context.popAttributes();
                            state = 3;
                            return ;
                        }
                        break;
                    case  1 :
                        spawnHandlerFromLeaveElement((((freemind.controller.actions.generated.instance.impl.PluginTypeImpl)freemind.controller.actions.generated.instance.impl.PluginImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname);
                        return ;
                }
                super.leaveElement(___uri, ___local, ___qname);
                break;
            }
        }

        public void enterAttribute(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  3 :
                        revertToParentFromEnterAttribute(___uri, ___local, ___qname);
                        return ;
                    case  1 :
                        spawnHandlerFromEnterAttribute((((freemind.controller.actions.generated.instance.impl.PluginTypeImpl)freemind.controller.actions.generated.instance.impl.PluginImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname);
                        return ;
                }
                super.enterAttribute(___uri, ___local, ___qname);
                break;
            }
        }

        public void leaveAttribute(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  3 :
                        revertToParentFromLeaveAttribute(___uri, ___local, ___qname);
                        return ;
                    case  1 :
                        spawnHandlerFromLeaveAttribute((((freemind.controller.actions.generated.instance.impl.PluginTypeImpl)freemind.controller.actions.generated.instance.impl.PluginImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname);
                        return ;
                }
                super.leaveAttribute(___uri, ___local, ___qname);
                break;
            }
        }

        public void handleText(final java.lang.String value)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                try {
                    switch (state) {
                        case  3 :
                            revertToParentFromText(value);
                            return ;
                        case  1 :
                            spawnHandlerFromText((((freemind.controller.actions.generated.instance.impl.PluginTypeImpl)freemind.controller.actions.generated.instance.impl.PluginImpl.this).new Unmarshaller(context)), 2, value);
                            return ;
                    }
                } catch (java.lang.RuntimeException e) {
                    handleUnexpectedTextException(value, e);
                }
                break;
            }
        }

    }

}