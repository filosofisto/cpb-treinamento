<?xml version="1.0" encoding="UTF-8" ?>

<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    <xsl:output method="html"/>

    <xsl:template match="books">
        <h3>Livros de <xsl:value-of select="@author"/></h3>
        <xsl:apply-templates/>
    </xsl:template>
    
    <xsl:template match="book">
        <h4 style="color:red"><strong>Título:</strong> <xsl:value-of select="@title"/></h4>
    </xsl:template>
    
</xsl:stylesheet>
