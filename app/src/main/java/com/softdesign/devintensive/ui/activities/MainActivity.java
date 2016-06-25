package com.softdesign.devintensive.ui.activities;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.softdesign.devintensive.R;
import com.softdesign.devintensive.utils.ConstantManager;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private static final String TAG = ConstantManager.TAG_PREFIX + "Main Activity";


    /**
     * Метод вызывается при создании активити (после изменения конфигурации/возврата к текущей
     * активности после его уничтожения).
     * <p/>
     * в данном методе инициализируется/производится:
     * - UI пользовательский интерфейс (статика)
     * - инициализация статических данных активити
     * - связь данных со списками (инициализация адаптеров)
     * <p/>
     * Не запускать длительные операции по работе с данныит в onCreate() !!!
     *
     * @param savedInstanceState - объект со значениями сохранёнными в Bundle - состояние UI
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Привязывает разметку к данной активити.
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate");


        if (savedInstanceState == null) {
            //активити создаётся впервые
        } else {
            //активити уже создавалось
        }


    }

    /**
     * Метод вызывается при старте активити перед моментом того как UI станет доступен пользователю
     * как правило в данном методе происходит регистрация подписи на события остановка которых была
     * произведена в onStop()
     */
    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart");
    }

    /**
     * Метод вызывается когда активити становится доступна пользователю для взаимодействия.
     * В данном методе как пправило происходит запуск анимаций/аудио/видео/запуск BroadcastReceiver
     * необходимых для реализации UI логики/запуск выполнения потоков и т.д.
     * Метод должен быть максимально легковестным для максимальной отзывчивости UI
     */
    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume");
    }

    /**
     * Метод вызывается когда текущая активити теряет фокус, но отаётся видимой (всплытие
     * диалогового окна/частичное перекрытие другой активити/ и т.д.)
     * <p/>
     * В данном метоже реализуют сохранение легковестных UI данных/анимаций/аудио/видео и т.д.
     */
    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause");
    }

    /**
     * Метод вызывается когда активити становится невидимым для пользователя.
     * В данном методе происходит отписка от событий, остановка сложных анимаций, сложные операции
     * по сохранению данных/прерывание запущенных потоков/ и т.д.
     */
    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop");
    }

    /**
     * Метод вызывается при окончании работы активити (когда это происходит системно или после
     * вызова метода finish() )
     */
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy");
    }

    /**
     * Метод вызывается при рестарте активити/возобновлении работы после вызова метода onStop().
     * В данном методе реализуется специфическая бизнес логика, которая должна быть реализована
     * именно при рестарте активности - например запросы к серверу, которые необходимо вызывать при
     * возвращении из другой активности (обновление данных, подписка на определённое событие
     * проинициализированное на другом экране/специфическая бизнес логика завязанная именно на
     * перезапуске активити)
     */
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart");
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
        }
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
    }
}
