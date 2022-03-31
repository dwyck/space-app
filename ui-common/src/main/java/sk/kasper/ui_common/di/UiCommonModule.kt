package sk.kasper.ui_common.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import sk.kasper.ui_common.settings.SettingsManager
import sk.kasper.ui_common.settings.SettingsManagerImpl

@InstallIn(SingletonComponent::class)
@Module
class UiCommonModule {

    @Provides
    internal fun bindsSettingsManager(impl: SettingsManagerImpl): SettingsManager = impl

}