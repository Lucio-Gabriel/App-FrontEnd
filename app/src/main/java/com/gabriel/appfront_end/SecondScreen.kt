package com.gabriel.appfront_end

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.gabriel.appfront_end.model.Adapter.AdapterTecnologia
import com.gabriel.appfront_end.model.Tecnologia

class SecondScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_second_screen)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets

        }

        val recyclerView_tecnologias = findViewById<RecyclerView>(R.id.recyclerview_tecnologias)
        recyclerView_tecnologias.layoutManager = LinearLayoutManager(this) // fixar na vertical
        recyclerView_tecnologias.setHasFixedSize(true) // para dar mais desempenho na nossa lista
//        configurar o adpater
        val listaTecnlogia: MutableList<Tecnologia> = mutableListOf()
        val adapterTecnologia = AdapterTecnologia(this, listaTecnlogia)
        recyclerView_tecnologias.adapter = adapterTecnologia

        val tecnlogia01 = Tecnologia(
            R.drawable.html,
            "HTML",
            "HTML (HyperText Markup Language) é a linguagem padrão para criar e estruturar conteúdo na web. Ele usa uma série de elementos e tags para definir textos, imagens, links e outros componentes de uma página."
        )
        listaTecnlogia.add(tecnlogia01)

        val tecnologia02 = Tecnologia(
            R.drawable.css,
            "CSS",
            "CSS (Cascading Style Sheets) é uma linguagem de estilo usada para descrever a apresentação visual de um documento HTML. Com CSS, é possível controlar a cor, fontes, espaçamento, layout e outros aspectos visuais das páginas web."
        )
        listaTecnlogia.add(tecnologia02)

        val tecnologia03 = Tecnologia(
            R.drawable.javascript,
            "JAVASCRIPT",
            "JavaScript é uma linguagem de programação que permite adicionar interatividade e funcionalidades dinâmicas às páginas web. Ele pode ser usado para manipular elementos HTML, validar formulários, criar animações, entre outros."
        )
        listaTecnlogia.add(tecnologia03)

        val tecnologia04 = Tecnologia(
            R.drawable.react,
            "REACT",
            "React é uma biblioteca JavaScript desenvolvida pelo Facebook para construir interfaces de usuário, permitindo a criação de componentes reutilizáveis e a gestão eficiente do estado da aplicação."
        )
        listaTecnlogia.add(tecnologia04)

        val tecnologia05 = Tecnologia(
            R.drawable.angular,
            "ANGULAR",
            "Angular é um framework front-end do Google, escrito em TypeScript, que utiliza componentes e two-way data binding, ideal para projetos de grande escala e aplicativos empresariais."
        )
        listaTecnlogia.add(tecnologia05)

        var tecnologia06 = Tecnologia(
            R.drawable.vue,
            "VUE",
            "Vue é um framework JavaScript criado por Evan You, focado em interfaces de usuário e aplicativos de página única, sendo leve, fácil de aprender e adequado para projetos de qualquer escala."
        )
    }
}