//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.12.13 at 05:06:12 PM WET 
//


package movies;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}Title"/>
 *         &lt;element ref="{}AdultContent"/>
 *         &lt;element ref="{}Score" minOccurs="0"/>
 *         &lt;element ref="{}GenresList"/>
 *         &lt;element ref="{}DirectorList"/>
 *         &lt;element ref="{}StarList"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "title",
    "adultContent",
    "score",
    "genresList",
    "directorList",
    "starList"
})
@XmlRootElement(name = "Movie")
public class Movie {

    @XmlElement(name = "Title", required = true)
    protected String title;
    @XmlElement(name = "AdultContent")
    protected boolean adultContent;
    @XmlElement(name = "Score")
    protected Integer score;
    @XmlElement(name = "GenresList", required = true)
    protected GenresList genresList;
    @XmlElement(name = "DirectorList", required = true)
    protected DirectorList directorList;
    @XmlElement(name = "StarList", required = true)
    protected StarList starList;

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the adultContent property.
     * 
     */
    public boolean isAdultContent() {
        return adultContent;
    }

    /**
     * Sets the value of the adultContent property.
     * 
     */
    public void setAdultContent(boolean value) {
        this.adultContent = value;
    }

    /**
     * Gets the value of the score property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getScore() {
        return score;
    }

    /**
     * Sets the value of the score property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setScore(Integer value) {
        this.score = value;
    }

    /**
     * Gets the value of the genresList property.
     * 
     * @return
     *     possible object is
     *     {@link GenresList }
     *     
     */
    public GenresList getGenresList() {
        return genresList;
    }

    /**
     * Sets the value of the genresList property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenresList }
     *     
     */
    public void setGenresList(GenresList value) {
        this.genresList = value;
    }

    /**
     * Gets the value of the directorList property.
     * 
     * @return
     *     possible object is
     *     {@link DirectorList }
     *     
     */
    public DirectorList getDirectorList() {
        return directorList;
    }

    /**
     * Sets the value of the directorList property.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectorList }
     *     
     */
    public void setDirectorList(DirectorList value) {
        this.directorList = value;
    }

    /**
     * Gets the value of the starList property.
     * 
     * @return
     *     possible object is
     *     {@link StarList }
     *     
     */
    public StarList getStarList() {
        return starList;
    }

    /**
     * Sets the value of the starList property.
     * 
     * @param value
     *     allowed object is
     *     {@link StarList }
     *     
     */
    public void setStarList(StarList value) {
        this.starList = value;
    }

}