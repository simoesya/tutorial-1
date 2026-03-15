# Tutorial 1 -- Hello World Android Application

Course: Computação Móvel\
Student(s): Rodrigo Simões\
Date: 2026\
Repository URL: https://github.com/SEU_REPOSITORIO

------------------------------------------------------------------------

# 1. Introduction

Este trabalho tem como objetivo desenvolver uma aplicação Android
simples que apresente a mensagem clássica **Hello World**.\
O projeto serve como primeiro contacto com o ambiente **Android
Studio**, com a linguagem **Kotlin** e com a estrutura básica de um
projeto Android.

Os principais objetivos são:

-   compreender a estrutura de um projeto Android
-   aprender a utilizar Kotlin no desenvolvimento mobile
-   executar aplicações num emulador Android
-   compreender a ligação entre código Kotlin e layouts XML

------------------------------------------------------------------------

# 2. System Overview

A aplicação desenvolvida consiste numa aplicação Android extremamente
simples cuja função é apenas apresentar uma mensagem ao utilizador.

### Funcionalidades principais

-   inicializar aplicação Android
-   carregar layout XML
-   apresentar mensagem no ecrã

### Caso de uso

1.  O utilizador abre a aplicação.
2.  A aplicação inicia a **MainActivity**.
3.  O layout da aplicação é carregado.
4.  A mensagem **Hello World** aparece no ecrã.

------------------------------------------------------------------------

# 3. Architecture and Design

O projeto segue a arquitetura padrão utilizada em aplicações Android.

### Estrutura principal do projeto

    app/
     ├── java/
     │   └── com.example.helloworld
     │        └── MainActivity.kt
     │
     ├── res/
     │   ├── layout/
     │   │     └── activity_main.xml
     │   │
     │   ├── values/
     │   │     ├── strings.xml
     │   │     ├── colors.xml
     │   │     └── themes.xml
     │
     └── AndroidManifest.xml

### Componentes principais

**MainActivity.kt**\
Responsável por iniciar a aplicação e carregar o layout.

**activity_main.xml**\
Define a interface gráfica da aplicação.

**AndroidManifest.xml**\
Contém as configurações da aplicação Android.

------------------------------------------------------------------------

# 4. Implementation

### MainActivity.kt

``` kotlin
package com.example.helloworld

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

}
```

### activity_main.xml

``` xml
<TextView
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:text="Hello World!"
    android:textSize="24sp"/>
```

------------------------------------------------------------------------

# 5. Testing and Validation

A aplicação foi testada utilizando o **Android Emulator** no Android
Studio.

### Passos de teste

1.  Abrir o projeto no Android Studio
2.  Compilar o projeto
3.  Executar no emulador Android
4.  Confirmar que a mensagem aparece no ecrã

Resultado esperado:\
A aplicação inicia corretamente e mostra a mensagem **Hello World**.

------------------------------------------------------------------------

# 6. Usage Instructions

### Requisitos

-   Android Studio
-   JDK instalado
-   Android Emulator

### Execução

1.  Abrir o projeto no Android Studio
2.  Selecionar um dispositivo virtual
3.  Carregar no botão **Run**
4.  A aplicação será iniciada automaticamente

------------------------------------------------------------------------

# Autonomous Software Engineering Section

## 7. Prompting Strategy

Durante o desenvolvimento foram utilizadas ferramentas de Inteligência
Artificial como suporte para compreender erros e esclarecer dúvidas
relacionadas com o desenvolvimento Android.

------------------------------------------------------------------------

## 8. Autonomous Agent Workflows

Ferramentas de IA auxiliaram em:

-   explicação de conceitos
-   identificação de erros de código
-   organização do relatório

------------------------------------------------------------------------

## 9. Verification of AI-Generated Artifacts

Todo o conteúdo gerado foi verificado manualmente e testado no Android
Studio antes da sua utilização.

------------------------------------------------------------------------

## 10. Human vs AI Contribution

### Contribuição humana

-   criação do projeto Android
-   implementação da aplicação
-   testes e execução

### Contribuição da IA

-   apoio na estruturação do relatório
-   explicação de conceitos

------------------------------------------------------------------------

## 11. Ethical and Responsible Use

As ferramentas de IA foram utilizadas apenas como suporte educativo.

------------------------------------------------------------------------

# Development Process

## 12. Version Control

O projeto foi versionado utilizando **Git** e armazenado num repositório
**GitHub**.

------------------------------------------------------------------------

## 13. Difficulties and Lessons Learned

Principais dificuldades:

-   configuração inicial do Android Studio
-   execução da aplicação no emulador
-   compreensão da estrutura do projeto Android

------------------------------------------------------------------------

## 14. Future Improvements

Melhorias possíveis:

-   adicionar novas interfaces
-   incluir imagens
-   implementar navegação entre ecrãs

------------------------------------------------------------------------

## 15. AI Usage Disclosure

Ferramenta utilizada:

-   ChatGPT

A ferramenta foi utilizada apenas para apoio na explicação de conceitos
e na organização do relatório.
