package org.example;

import net.bytebuddy.ByteBuddy;
import net.bytebuddy.dynamic.ClassFileLocator;
import net.bytebuddy.implementation.FixedValue;
import net.bytebuddy.pool.TypePool;

import java.io.File;

import static net.bytebuddy.matcher.ElementMatchers.named;

public class Msulsa {
    public static void main(String[] args) {
      /*  try {
            new ByteBuddy().redefine(Moja.class).method(named("pullOut")).intercept(FixedValue.value("Rabbit!")).make().saveIn(new File("C:\\Users\\adminmaster\\IdeaProjects\\untitled1\\target\\classes"));
        } catch (Exception e) {
            System.out.println(e);
        }*/

     /*   ClassLoader classLoader = Msulsa.class.getClassLoader();
        TypePool typePool = TypePool.Default.of(classLoader);
        try{
            new ByteBuddy().redefine(typePool.describe("org.example.Moja").resolve(),
                    ClassFileLocator.ForClassLoader.of(classLoader))
                    .method(named("pullOut")).intercept(FixedValue.value("Rabbit!!")).make().saveIn(new File("C:\\Users\\adminmaster\\IdeaProjects\\untitled1\\target\\classes"));
        }catch (Exception e){
            e.printStackTrace();
        }*/

        System.out.println(new Moja().pullOut());
    }
}
