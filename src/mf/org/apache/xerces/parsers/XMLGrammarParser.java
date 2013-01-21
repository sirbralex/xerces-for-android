/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package mf.org.apache.xerces.parsers;

import mf.org.apache.xerces.impl.Constants;
import mf.org.apache.xerces.impl.dv.DTDDVFactory;
import mf.org.apache.xerces.util.SymbolTable;
import mf.org.apache.xerces.xni.parser.XMLParserConfiguration;


/**
 * @version $Id: XMLGrammarParser.java 447239 2006-09-18 05:08:26Z mrglavas $
 */
public abstract class XMLGrammarParser
    extends XMLParser {

    //
    // Data
    //

    /** fDatatypeValidatorFactory */
    protected DTDDVFactory fDatatypeValidatorFactory;

    //
    // Constructors
    //

    /**
     * Construct an XMLGrammarParser with the specified symbol table
     *
     * @param symbolTable
     */
    //MF
    protected XMLGrammarParser(SymbolTable symbolTable) {
        super((XMLParserConfiguration)ObjectFactory.createObject(
            "mf.org.apache.xerces.xni.parser.XMLParserConfiguration",
            "mf.org.apache.xerces.parsers.XIncludeAwareParserConfiguration"
            ));
        fConfiguration.setProperty(Constants.XERCES_PROPERTY_PREFIX+Constants.SYMBOL_TABLE_PROPERTY, symbolTable);
    }

} // class XMLGrammarParser
