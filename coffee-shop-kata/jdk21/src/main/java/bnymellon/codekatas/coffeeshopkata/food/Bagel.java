/*
 * Copyright 2023 The Bank of New York Mellon.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package bnymellon.codekatas.coffeeshopkata.food;

/**
 * Replace the entire class with a Record.
 * This replaces the need for a constructor, getters, toString(),
 * equals() and hashcode() method
 * NOTE: This example highlights the usage of a record to replace the
 * boilerplate of a plain Java class.
 *
 * @see <a href="https://openjdk.org/jeps/395">...</a>
 */
// TODO: convert class to record
public record Bagel(BagelType bagelType, SpreadType spreadType, boolean toasted) implements BakeryItem
{
    @Override
    public double getPrice()
    {
        return 2.50;
    }
//    private final BagelType bagelType;
//    private final SpreadType spreadType;
//    private final boolean toasted;
//
////    public record Bagel(BagelType bagelType, SpreadType spreadType, boolean toasted){}
//
//    public Bagel(BagelType bagelType, SpreadType spreadType, boolean toasted)
//    {
//        this.bagelType = bagelType;
//        this.spreadType = spreadType;
//        this.toasted = toasted;
//    }


//
//    public boolean isToasted()
//    {
//        return toasted;
//    }
//
//    public BagelType getBagelType()
//    {
//        return bagelType;
//    }
//
//    public SpreadType getSpreadType()
//    {
//        return spreadType;
//    }
}
