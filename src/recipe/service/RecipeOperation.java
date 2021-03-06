
package recipe.service;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import recipestorage.service.Ingredient;
import recipestorage.service.Recipe;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "RecipeOperation", targetNamespace = "http://service.recipe/")
@XmlSeeAlso({
    recipe.service.ObjectFactory.class,
    recipestorage.service.ObjectFactory.class
})
public interface RecipeOperation {


    /**
     * 
     * @param arg0
     * @return
     *     returns recipestorage.service.Recipe
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "saveRecipe", targetNamespace = "http://service.recipe/", className = "recipe.service.SaveRecipe")
    @ResponseWrapper(localName = "saveRecipeResponse", targetNamespace = "http://service.recipe/", className = "recipe.service.SaveRecipeResponse")
    @Action(input = "http://service.recipe/RecipeOperation/saveRecipeRequest", output = "http://service.recipe/RecipeOperation/saveRecipeResponse")
    public Recipe saveRecipe(
        @WebParam(name = "arg0", targetNamespace = "")
        Recipe arg0);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns recipestorage.service.Recipe
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "createInstantRecipe", targetNamespace = "http://service.recipe/", className = "recipe.service.CreateInstantRecipe")
    @ResponseWrapper(localName = "createInstantRecipeResponse", targetNamespace = "http://service.recipe/", className = "recipe.service.CreateInstantRecipeResponse")
    @Action(input = "http://service.recipe/RecipeOperation/createInstantRecipeRequest", output = "http://service.recipe/RecipeOperation/createInstantRecipeResponse")
    public Recipe createInstantRecipe(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        Ingredient arg1);

    /**
     * 
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns recipestorage.service.Recipe
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "updateRecipeIngredients", targetNamespace = "http://service.recipe/", className = "recipe.service.UpdateRecipeIngredients")
    @ResponseWrapper(localName = "updateRecipeIngredientsResponse", targetNamespace = "http://service.recipe/", className = "recipe.service.UpdateRecipeIngredientsResponse")
    @Action(input = "http://service.recipe/RecipeOperation/updateRecipeIngredientsRequest", output = "http://service.recipe/RecipeOperation/updateRecipeIngredientsResponse")
    public Recipe updateRecipeIngredients(
        @WebParam(name = "arg0", targetNamespace = "")
        Recipe arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        Ingredient arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        Double arg2);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns java.util.List<recipestorage.service.Recipe>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findRecipe", targetNamespace = "http://service.recipe/", className = "recipe.service.FindRecipe")
    @ResponseWrapper(localName = "findRecipeResponse", targetNamespace = "http://service.recipe/", className = "recipe.service.FindRecipeResponse")
    @Action(input = "http://service.recipe/RecipeOperation/findRecipeRequest", output = "http://service.recipe/RecipeOperation/findRecipeResponse")
    public List<Recipe> findRecipe(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<recipestorage.service.Ingredient>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findIngredient", targetNamespace = "http://service.recipe/", className = "recipe.service.FindIngredient")
    @ResponseWrapper(localName = "findIngredientResponse", targetNamespace = "http://service.recipe/", className = "recipe.service.FindIngredientResponse")
    @Action(input = "http://service.recipe/RecipeOperation/findIngredientRequest", output = "http://service.recipe/RecipeOperation/findIngredientResponse")
    public List<Ingredient> findIngredient(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

}
