<?xml version="1.0" encoding="UTF-8" ?>

<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    <xsl:output method="html"/>

    <xsl:template match="books">
        <h1>Livros de <xsl:value-of select="@author"/></h1>
        <xsl:apply-templates/>
    </xsl:template>
    
    <xsl:template match="book">
        <h3>Título: <xsl:value-of select="@title"/></h3>
    </xsl:template>
    
</xsl:stylesheet>
