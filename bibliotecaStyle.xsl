<?xml version="1.0" encoding="UTF-8"?>

<!--
    Document   : bibliotecaStyle.xsl
    Created on : May 20, 2015, 10:53 PM
    Author     : antonio
    Description:
        Purpose of transformation follows.
-->

<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    <xsl:output method="html"/>

    <!-- TODO customize transformation rules 
         syntax recommendation http://www.w3.org/TR/xslt 
    -->
    <xsl:template match="/">
        <html>
            <head>
                <title>bibliotecaStyle.xsl</title>
            </head>
            <body>
                <table>
                    <th style="font-weight:bold">Titulo</th>
                    <th>Versão</th>
                    
                    <xsl:for-each select="livros/livro"> 
                        <tr>
                            <td>
                                <xsl:value-of select="titulo"/>
                            </td>
                            <td>
                                <xsl:value-of select="versao/@type"/>
                                <!-- o arroba na linha anterior serve para forçar o mostrar do valor do atributo -->
                            </td>
                        </tr>
                    </xsl:for-each>
                </table>
            </body>
        </html>
    </xsl:template>

</xsl:stylesheet>
