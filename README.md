# tempids-test

The tempids re-mapping works fine, please ignore the title.

This is just a very simple project that (on my machine) emits this error in the browser with "3.0.8" of Fulcro:

```
core.cljs:1226 Uncaught Error: [object Object] is not ISeqable
    at Object.cljs$core$seq [as seq] (core.cljs:1226)
    at Object.cljs$core$rest [as rest] (core.cljs:1246)
    at Object.cljs$core$next [as next] (core.cljs:1259)
    at cljs$core$second (core.cljs:1746)
    at core.cljs:5230
    at core.cljs:1512
    at Function.cljs$core$IFn$_invoke$arity$4 (core.cljs:1512)
    at Object.cljs$core$IReduce$_reduce$arity$3 (core.cljs:1648)
    at Function.cljs$core$IFn$_invoke$arity$3 (core.cljs:692)
    at Function.cljs$core$IFn$_invoke$arity$3 (core.cljs:2536)
```    
At "3.0.6" this error does not come up.     
