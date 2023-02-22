package com.generamobile.heads.gtjigtjijgit

import android.app.Application
import android.content.Context
import android.content.SharedPreferences
import com.generamobile.heads.frojifrojifrigt.NJfnrfrhuhfrhfr
import com.generamobile.heads.frojifrojifrigt.Nfrfhrufruh
import com.generamobile.heads.frojifrojifrigt.JIOFjiojrfijfrijrf
import com.generamobile.heads.frojifrojifrigt.NJfnrrfhufruhfrhurf
import com.generamobile.heads.jtgijgtjigt.JIOfjrfjfrjfrf
import com.squareup.moshi.Moshi
import org.koin.android.ext.koin.androidApplication
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.qualifier.named
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory


fun bgnhnhujuj(app: Application): SharedPreferences {
    return app.applicationContext.getSharedPreferences(
        "SHARED_PREF",
        Context.MODE_PRIVATE
    )
}

val IUFhrffhrhuhrf = module {
    single<NJfnrrfhufruhfrhurf>(named("HostInter")) {
        get<Retrofit>(named("RetroDev"))
            .create(NJfnrrfhufruhfrhurf::class.java)
    }

    single <NJfnrfrhuhfrhfr> (named("ApiInter")) {
        get<Retrofit>(named("RetroCountry"))
            .create(NJfnrfrhuhfrhfr::class.java)
    }
    single<Retrofit>(named("RetroCountry")) {
        Retrofit.Builder()
            .baseUrl("http://pro.ip-api.com/")
            .addConverterFactory(MoshiConverterFactory.create())
            .build()
    }
    single<Retrofit>(named("RetroDev")) {
        Retrofit.Builder()
            .baseUrl("http://amethystshield.world/")
            .addConverterFactory(MoshiConverterFactory.create())
            .build()
    }
    factory(named("DevRep")) {
        JIOFjiojrfijfrijrf(get(named("HostInter")))
    }
    factory (named("CountryRep")) {
        Nfrfhrufruh(get(named("ApiInter")))
    }

    single {
        gtktgjitggtijgt()
    }
    single(named("SharedPreferences")) {
        bgnhnhujuj(androidApplication())
    }

}


fun gtktgjitggtijgt(): Moshi {
    return Moshi.Builder().build()
}

val gtkoigtjoigtjigt = module {
    viewModel (named("MainModel")){
        JIOfjrfjfrjfrf(get(named("CountryRep")), get(named("DevRep")), get(named("SharedPreferences")), get())
    }
}