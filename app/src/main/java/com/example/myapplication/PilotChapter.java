package com.example.myapplication;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class PilotChapter extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pilot_chapter);
        final TextView text1 = (TextView) findViewById(R.id.textView1);
        final TextView text2 = (TextView) findViewById(R.id.textView2);
        final TextView text3 = (TextView) findViewById(R.id.textView3);
        final TextView text4 = (TextView) findViewById(R.id.textView4);
        final TextView text5 = (TextView) findViewById(R.id.textView5);
        final TextView text6 = (TextView) findViewById(R.id.textView6);
        final TextView text7 = (TextView) findViewById(R.id.textView7);
        final TextView text8 = (TextView) findViewById(R.id.textView8);
        final TextView text9 = (TextView) findViewById(R.id.textView9);
        final TextView text10 = (TextView) findViewById(R.id.textView10);
        final TextView text11 = (TextView) findViewById(R.id.textView11);
        final TextView text12 = (TextView) findViewById(R.id.textView12);
        final TextView text13 = (TextView) findViewById(R.id.textView13);
        final TextView text14 = (TextView) findViewById(R.id.textView14);
        final Button hack = findViewById(R.id.buttonHack);
        final Button boom = findViewById(R.id.buttonBoom);
        final Button search = findViewById(R.id.buttonSearch);

        hack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hack.setVisibility(View.GONE);
                search.setVisibility(View.GONE);
                boom.setVisibility(View.GONE);
                text1.setText("X: Ок, сейчас поглядим... Ага, электромагнитный замок. Можно поискать ключ, или отключить электро-питание. Дайте-ка кусачки...");
                text2.setText("Y: А тебя током не долбнет случайно? Провод же под напряжением.");
                text3.setText("X: X: Нет, ручки на кусачках изолированные.");
                text4.setText("Y: А можно попонятнее объяснить?");
                text5.setText("X: Накладки на ручках резиновые. ");
                text6.setText("X перекусил провода при помощи инструмента. Дверь была открыта. ");
                text6.setTextColor(Color.parseColor("#535353"));
                text7.setText("X: Проходите, господа, вытирайте ноги.");
                text8.setText("Z: Хорошая работа!");
                text8.setTextColor(Color.parseColor("#000000"));
                text9.setText("X: Благодарю");
                text10.setText("Отряд прошёл в следующее помещение...");
                text11.setVisibility(View.INVISIBLE);
                text12.setVisibility(View.INVISIBLE);
                text13.setVisibility(View.INVISIBLE);
                text14.setVisibility(View.INVISIBLE);
            }
        });

        boom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text1.setText("Q: Ты уверен, что это безопасно?");
                text2.setText("Z: Не боись, у меня не настолько мощная взрывчатка, чтобы обрушить своды тонннеля.");
                text3.setText("Q: Не могу поверить, что говорю это... Но ладно, чёрт возьми. Только давайте, на всякий случай, спрячемся, я не хочу получить осколок в лицо. ");
                text4.setText("Z встал у двери и начал закладывать взрывчатку");
                text4.setTextColor(Color.parseColor("#535353"));
                text5.setText("Z: Всем прикрыть головы! Сейчас рванёт!");
                text6.setText("БАБАХ");
                text6.setTextColor(Color.parseColor("#535353"));
                text7.setText("Y: Кажется сработало.");
                text8.setText("X: Тихо: вы это слышите?");
                text9.setText("Члены отряда прислушались и уловили едва слышимый топот");
                text9.setTextColor(Color.parseColor("#535353"));
                text10.setText("X: ЧЕРТ ПОДЕРИ, ПОЛУНДРА, БЫСТРО ВНУТРЬ!");
                text11.setText("Z: Что за...");
                text12.setText("К команде приближалось покрытое хитином членистоногое существо с массивным хвостом и шестью лапами");
                text12.setTextColor(Color.parseColor("#535353"));
                text13.setText("Q: Твою...");
                text14.setText("Существо нанесло тяжёлый удар хвостом по ноге Q");
                text14.setTextColor(Color.parseColor("#535353"));
                hack.setVisibility(View.GONE);
                search.setVisibility(View.GONE);
                boom.setText("Далее");
                boom.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        hack.setVisibility(View.VISIBLE);
                        search.setVisibility(View.VISIBLE);
                        text1.setText("Q: АААЙ!");
                        text2.setText("Y схватил лежащий на земле кусок арматуры");
                        text2.setTextColor(Color.parseColor("#535353"));
                        text3.setVisibility(View.INVISIBLE);
                        text4.setVisibility(View.INVISIBLE);
                        text5.setVisibility(View.INVISIBLE);
                        text6.setVisibility(View.INVISIBLE);
                        text7.setVisibility(View.INVISIBLE);
                        text8.setVisibility(View.INVISIBLE);
                        text9.setVisibility(View.INVISIBLE);
                        text10.setVisibility(View.INVISIBLE);
                        text11.setVisibility(View.INVISIBLE);
                        text12.setVisibility(View.INVISIBLE);
                        text13.setVisibility(View.INVISIBLE);
                        text14.setVisibility(View.INVISIBLE);
                        text5.setVisibility(View.INVISIBLE);
                        text6.setVisibility(View.INVISIBLE);
                        hack.setText("Нанести удар по голове");
                        boom.setText("Нанести удар в тело");
                        search.setText("Нанести удар по хвосту");
                        hack.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                text3.setVisibility(View.VISIBLE);
                                text4.setVisibility(View.VISIBLE);
                                text5.setVisibility(View.VISIBLE);
                                text6.setVisibility(View.VISIBLE);
                                text7.setVisibility(View.VISIBLE);
                                text8.setVisibility(View.VISIBLE);
                                text9.setVisibility(View.VISIBLE);
                                text10.setVisibility(View.VISIBLE);
                                text11.setVisibility(View.VISIBLE);
                                text12.setVisibility(View.VISIBLE);
                                text13.setVisibility(View.VISIBLE);
                                text14.setVisibility(View.VISIBLE);
                                hack.setVisibility(View.GONE);
                                search.setVisibility(View.GONE);
                                boom.setVisibility(View.GONE);
                                text14.setVisibility(View.INVISIBLE);
                                text3.setText("Y замахнулся и попытался ударить нечто по голове, но промазал. Чудовище,  испугавшись, убежало в глубь тоннеля");
                                text3.setTextColor(Color.parseColor("#535353"));
                                text4.setText("Z: Что это была за тварь?");
                                text4.setTextColor(Color.parseColor("#000000"));
                                text5.setText("Y: Чёрт её знает. Док, ты там в порядке?");
                                text6.setText("Q: [стонет от боли], кажется нога сломана. Кто-нибудь... поищите две лёгкие, но более-менее прочные палки и достаньте из аптечки бинты.");
                                text6.setTextColor(Color.parseColor("#000000"));
                                text7.setText("Z поднял две металиические палки, лежащие около взорванной двери, Y открыл аптечку и достал оттуда бинты .");
                                text7.setTextColor(Color.parseColor("#535353"));
                                text8.setText("Z: Эти подойдут?");
                                text8.setTextColor(Color.parseColor("#000000"));
                                text9.setText("Z: Вполне");
                                text9.setTextColor(Color.parseColor("#000000"));
                                text10.setText("Q: Теперь, Z, приложи их с двух сторон. Эй! Аккуратнее, эта нога мне ещё нужна! А ты, Y, обмотай потуже бинт вокруг нноги");
                                text11.setText("Z приложил палки с разных сторон к голени Q, Y туго обмотал бинт вокруг ноги Q");
                                text11.setTextColor(Color.parseColor("#535353"));
                                text12.setText("Q: Отлично, именно так, теперь помогите мне встать и пошли внутрь, нам ещё задание выполнить надо...");
                                text12.setTextColor(Color.parseColor("#000000"));
                                text13.setText("X и Y помогли Q подняться на ноги и, поддерживая его, вместе с Z отправились внутрь...");
                                text13.setTextColor(Color.parseColor("#535353"));

                            }
                        });
                        boom.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                text3.setVisibility(View.VISIBLE);
                                text4.setVisibility(View.VISIBLE);
                                text5.setVisibility(View.VISIBLE);
                                text6.setVisibility(View.VISIBLE);
                                text7.setVisibility(View.VISIBLE);
                                text8.setVisibility(View.VISIBLE);
                                text9.setVisibility(View.VISIBLE);
                                text10.setVisibility(View.VISIBLE);
                                text11.setVisibility(View.VISIBLE);
                                text12.setVisibility(View.VISIBLE);
                                text13.setVisibility(View.VISIBLE);
                                text14.setVisibility(View.VISIBLE);
                                hack.setVisibility(View.GONE);
                                search.setVisibility(View.GONE);
                                boom.setVisibility(View.GONE);
                                text3.setText("Y замахнулся и нанёс тяжелый удар по туловищу. Послышался хруст хитинового панциря, чудовище было убито.");
                                text4.setTextColor(Color.parseColor("#535353"));
                                text5.setText("Z: Оно сдохло?");
                                text6.setText("Y: Нет, блин, наелось и спит. Док, ты там в порядке?");
                                text6.setTextColor(Color.parseColor("#000000"));
                                text7.setText("Q: [стонет от боли], кажется нога сломана. Кто-нибудь... поищите две лёгкие, но прочные палки и достаньте из аптечки бинты.");
                                text8.setText("Z поднял две металиические палки, лежищие около взорванной двери, Y открыл аптечку и достал оттуда бинты .");
                                text8.setTextColor(Color.parseColor("#535353"));
                                text9.setText("Z: Эти подойдут?");
                                text9.setTextColor(Color.parseColor("#000000"));
                                text10.setText("Z: Вполне");
                                text11.setText("Q: Теперь, Z, приложи их с двух сторон. Эй! Аккуратнее, эта нога мне ещё нужна! А ты, Y, обмотай потуже обмотай бинт вокруг нноги");
                                text12.setText("Z приложил палки с разных сторон к голени Q, Y туго обмотал бинт вокруг ноги Q");
                                text12.setTextColor(Color.parseColor("#535353"));
                                text13.setText("Q: Отлично, именно так, теперь помогите мне встать и пошли внутрь, нам ещё задание выполнить надо...");
                                text14.setText("X и Y помогли Q подняться на ноги и, поддерживая его, вместе с Z отправились внутрь...");
                                text14.setTextColor(Color.parseColor("#535353"));

                            }
                        });
                        search.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                text3.setVisibility(View.VISIBLE);
                                text4.setVisibility(View.VISIBLE);
                                text5.setVisibility(View.VISIBLE);
                                text6.setVisibility(View.VISIBLE);
                                text7.setVisibility(View.VISIBLE);
                                text8.setVisibility(View.VISIBLE);
                                text9.setVisibility(View.VISIBLE);
                                text10.setVisibility(View.VISIBLE);
                                text11.setVisibility(View.VISIBLE);
                                text12.setVisibility(View.VISIBLE);
                                text13.setVisibility(View.VISIBLE);
                                text14.setVisibility(View.VISIBLE);
                                hack.setVisibility(View.GONE);
                                search.setVisibility(View.GONE);
                                boom.setVisibility(View.GONE);
                                text3.setText("Y замахнулся и проткнул хвост существа. Чудовище взревело от боли и бросилось на утёк в глубь тоннеля.");
                                text3.setTextColor(Color.parseColor("#535353"));
                                text4.setText("Z: Господи, слава богу, оно ушло... Ненавижу насекомых. Больших в том числе.");
                                text4.setTextColor(Color.parseColor("#000000"));
                                text5.setText("Y: Надеюсь, мы его больше не увидим. Док, ты там в порядке?");
                                text6.setText("Q: [стонет от боли], кажется нога сломана. Кто-нибудь... поищите две лёгкие, но прочные палки и достаньте из аптечки бинты.");
                                text6.setTextColor(Color.parseColor("#000000"));
                                text7.setText("Z поднял две металиические палки, лежищие около взорванной двери, Y открыл аптечку и достал оттуда бинты.");
                                text7.setTextColor(Color.parseColor("#535353"));
                                text8.setText("Z: Эти подойдут?");
                                text8.setTextColor(Color.parseColor("#000000"));
                                text9.setText("Z: Вполне");
                                text9.setTextColor(Color.parseColor("#000000"));
                                text10.setText("Q: Теперь, Z, приложи их с двух сторон. Эй! Аккуратнее, эта нога мне ещё нужна! А ты, Y, обмотай потуже обмотай бинт вокруг нноги");
                                text11.setText("Z приложил палки с разных сторон к голени Q, Y туго обмотал бинт вокруг ноги Q");
                                text11.setTextColor(Color.parseColor("#535353"));
                                text12.setText("Q: Отлично, именно так, теперь помогите мне встать и пошли внутрь, нам ещё задание выполнить надо...");
                                text12.setTextColor(Color.parseColor("#000000"));
                                text13.setText("X и Y помогли Q подняться на ноги и, поддерживая его, вместе с Z отправились внутрь...");
                                text13.setTextColor(Color.parseColor("#535353"));
                                text14.setVisibility(View.INVISIBLE);

                            }
                        });
                    }
                });


            }
        });

        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hack.setVisibility(View.GONE);
                search.setVisibility(View.GONE);
                boom.setVisibility(View.GONE);
                text1.setText("X: Эх, Z, видно, не судьба нам повыпендриваться своими навыками... ");
                text2.setText("Z: Представится ещё случай. Я, конечно, не эксперт, но думаю, что вот там, наверху, должен находиться человек, открывающий дверь в случае чего. ");
                text3.setText("Z указал остальной команде на платформу наверху");
                text3.setTextColor(Color.parseColor("#535353"));
                text4.setText("Q: А вот, кажется, и лестница, а ну-ка помогите мне...");
                text5.setText("Y забрался по лестнице наверх и увидел перед собой кнопку для открытия двери. Ударив по ней пару раз, Y понял, что кнопка пришла в неисправность");
                text5.setTextColor(Color.parseColor("#535353"));
                text6.setText("Y: Она не работает. ");
                text7.setText("X: Поищи тогда ключ-карту.");
                text8.setText("Y: Кажется вот она!");
                text9.setText("Q: Отлично!");
                text10.setText("Y быстро проскользил с лестницы, после чего поднёс ключ к замку. Дверь была открыта.");
                text10.setTextColor(Color.parseColor("#535353"));
                text11.setText("Отряд прошёл в следующее помещение...");
                text11.setTextColor(Color.parseColor("#535353"));
                text12.setVisibility(View.INVISIBLE);
                text13.setVisibility(View.INVISIBLE);
                text14.setVisibility(View.INVISIBLE);
            }
        });
    }
}