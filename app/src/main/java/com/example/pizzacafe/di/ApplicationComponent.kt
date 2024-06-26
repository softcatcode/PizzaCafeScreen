package com.example.pizzacafe.di

import android.app.Application
import com.example.pizzacafe.di.modules.DataModule
import com.example.pizzacafe.di.modules.DomainModule
import com.example.pizzacafe.di.modules.ViewModelModule
import com.example.pizzacafe.presentation.ui.bucket.BucketFragment
import com.example.pizzacafe.presentation.ui.menu.MenuFragment
import com.example.pizzacafe.presentation.ui.profile.ProfileFragment
import dagger.BindsInstance
import dagger.Component

@Component(modules = [ViewModelModule::class, DomainModule::class, DataModule::class])
interface ApplicationComponent {

    fun inject(fragment: MenuFragment)

    fun inject(fragment: ProfileFragment)

    fun inject(fragment: BucketFragment)

    @Component.Factory
    interface ApplicationComponentFactory {
        fun create(
            @BindsInstance application: Application
        ): ApplicationComponent
    }
}