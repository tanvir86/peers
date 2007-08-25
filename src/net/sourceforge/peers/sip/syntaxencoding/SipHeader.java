/*
    This file is part of Peers.

    Peers is free software; you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation; either version 2 of the License, or
    (at your option) any later version.

    Peers is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with Foobar; if not, write to the Free Software
    Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA  02110-1301  USA
    
    Copyright 2007 Yohann Martineau 
*/

package net.sourceforge.peers.sip.syntaxencoding;

public class SipHeader {

    private SipHeaderFieldName name;
    private SipHeaderFieldValue value;
    
    SipHeader(SipHeaderFieldName name, SipHeaderFieldValue value) {
        super();
        this.name = name;
        this.value = value;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof SipHeader) {
            SipHeader objHdr = (SipHeader) obj;
            return name.equals(objHdr.name);
        }
        return false;
    }

    public SipHeaderFieldName getName() {
        return name;
    }

    public SipHeaderFieldValue getValue() {
        return value;
    }

    public void setValue(SipHeaderFieldValue value) {
        this.value = value;
    }
    
}