<%-- 
    Document   : header
    Created on : May 29, 2024, 9:27:42 PM
    Author     : Duy.Tran
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Nihongo</title>
        <script src="https://cdn.tailwindcss.com"></script>
    </head>
    <body>
        <nav class="bg-emerald-950 p-4 z-50  sticky top-0 ">
            <div class="container mx-auto flex justify-around items-center h-full">
                <a class="no-underline text-white text-lg md:text-[2vw] lg:text-[2.5vw] xl:text-[2.5vw] font-bold hover:text-gray-400" href="welcome.jsp">Nihongo logo</a>
                <ul class="flex space-x-14">
                    <li><a class="no-underline text-white text-lg md:text-[1vw] lg:text-[1vw] xl:text-[1.2vw] hover:text-gray-400" href="#">Home</a></li>
                    <li><a class="no-underline text-white text-lg md:text-[1vw] lg:text-[1vw] xl:text-[1.2vw] hover:text-gray-400" href="#">Vocabulary</a></li>
                    <li><a class="no-underline text-white text-lg md:text-[1vw] lg:text-[1vw] xl:text-[1.2vw] hover:text-gray-400" href="#">Grammar</a></li>
                    <li><a class="no-underline text-white text-lg md:text-[1vw] lg:text-[1vw] xl:text-[1.2vw] hover:text-gray-400" href="#">Kanji</a></li>
                    <li><a class="no-underline text-white text-lg md:text-[1vw] lg:text-[1vw] xl:text-[1.2vw] hover:text-gray-400" href="#">Listening</a></li>
                </ul>
                <button class="no-underline text-white text-lg md:text-[0.8vw] lg:text-[1vw] xl:text-[1.2vw] font-bold hover:text-gray-400"><a href="#">Login</a></button>
            </div>
        </nav>