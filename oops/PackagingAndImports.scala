// package oops


object PackagingAndImports extends App{

    // Package members can be accessible by simple name.

    /*
        import packages
        if we are using somthing out of the package then, we need to import tha package by using import keyword.
        package followed by import
        if you dont want to import then, you need to use the fully qualified name of the class or object you want to use.
        

        -- package object
        Universal contants or methods.
        these can be created by below code
        package object durga {
            // methods and members
        }

        durga is a package object which will be setteled under package.scala file.
        Intellij might give a good view for this file when it is viewed in project explorer window of intellij.

        Grouping Imports can be done in scala using {} curl braces. As below:
        import playground.{PrinceCharming, Cinderalla}

        if the group become to big, then we can use _ (underscore), which basically imports everything from the package playground.
        import playgorund._

        We can also do name aliasing in Scala while importing.
        import playground.{PrinceCharming, Cinderalla => Princess}

        "=>" is used to mention the alias name for the class.
        so now if you want to create object for Cinderalla then you can use below codes:
            new Princess        (by using alias name)
            or
            new Cinderalla      (name as it is)
        both are same.

        This can be mainly used when you are importing 2 classes of different packages with same name as below example:
            import java.util.Date
            import java.sql.{Date => SqlDate}

            option 1  using fuly qualified names.
            val d = new Date    // defaulty compiler takes java.util.Date as it is mentioned first in the import list.
            val sqldate = new java.sql.Date

            option 2 use aliasing
            val d = new Date
            val sqlDate = new SqlDate
            
        -- Default imports
        imports which are automatically imported without any intention from our side.
        java.lang -> exception, String,object
        scala -> Int, Nothing, Function
        scala.Predef -> println, ???
        

    */


}