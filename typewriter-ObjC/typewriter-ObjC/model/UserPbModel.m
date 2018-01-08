//
//  UserPbModel.m
//  Autogenerated by typewriter
//
//  Generation Date On 2018/01/08
//  Version: 1.0.0

#import "UserPbModel.h"
#import "PetPbModel.h"
#import "HousePbModel.h"
#import "ClothesPbModel.h"
#import "UserPb.pbobjc.h"
#import "PetPb.pbobjc.h"
#import "HousePb.pbobjc.h"
#import "ClothesPb.pbobjc.h"

@implementation UserPbModel
- (instancetype)init UNAVAILABLE_ATTRIBUTE
{
    NSAssert(NO, @"please use designed initializer instead!");
    return nil;
}
+ (nullable instancetype)modelWithUserPb:(UserPb *)prototype objectId:(nullable NSString *)objectId
{
    return [[self alloc] initWithUserPb:prototype objectId:objectId];
}
- (nullable instancetype)initWithUserPb:(UserPb *)prototype objectId:(nullable NSString *)objectId
{
    NSParameterAssert(prototype);
    if (!(self = [super init])) {
        return nil;
    }
    [self propertyMapWithPrototype:prototype mapping:@{@"name" : @"userName",
                                                       @"favouriteSport" : @"favouriteSport",
                                                       @"favouriteMovie" : @"favouriteMovie",
                                                       @"hasMarried" : @"hasMarried",
                                                       @"age" : @"age",
                                                       @"psychologicalAge" : @"psychologicalAge",
                                                       @"hasPet" : @"hasPet"}];
    self->_objectId = objectId;
    self->_education = [prototype.educationEnum intValue];
    self->_pet = [self transformModelFromPrototype:prototype.pet];
    self->_houses = [self transformModelFromPrototype:prototype.ownHousesArray];
    self->_wardrobes = [self transformModelFromPrototype:prototype.wardrobes];
    [UserPbModel unidirectionalDataflow:self objectId:self.objectId];
    return self;
}
- (nullable id)transformModelFromPrototype:(id)prototype
{
    if (!prototype) {
        return nil;
    }
    if ([prototype isKindOfClass:[HousePb class]]) {
        HousePbModel * model = [HousePbModel modelWithHousePb:prototype];
        return model;
    }
    if ([prototype isKindOfClass:[ClothesPb class]]) {
        ClothesPbModel * model = [ClothesPbModel modelWithClothesPb:prototype objectId:self.objectId];
        return model;
    }
    if ([prototype isKindOfClass:[PetPb class]]) {
        PetPbModel * model = [PetPbModel modelWithPetPb:prototype];
        return model;
    }
    return [super transformModelFromPrototype:prototype];
}
- (instancetype)initWithUserPbModelBuilder:(UserPbModelBuilder *)builder
{
    NSParameterAssert(builder);
    if (!(self = [super init])) {
        return self;
    }
    [self propertyMapWithPrototype:builder mapping:@{@"objectId": @"objectId",
                                                     @"name": @"name",
                                                     @"favouriteSport": @"favouriteSport",
                                                     @"favouriteMovie": @"favouriteMovie",
                                                     @"hasMarried": @"hasMarried",
                                                     @"education": @"education",
                                                     @"age": @"age",
                                                     @"psychologicalAge": @"psychologicalAge",
                                                     @"pet": @"pet",
                                                     @"hasPet": @"hasPet",
                                                     @"houses": @"houses",
                                                     @"wardrobes": @"wardrobes"}];
    [UserPbModel unidirectionalDataflow:self objectId:self.objectId];
    return self;
}
- (instancetype)mergeWithBlock:(void(^)(UserPbModelBuilder *builder))block
{
    NSParameterAssert(block);
    UserPbModelBuilder *builder = [[UserPbModelBuilder alloc] initWithUserPbModel:self];
    block(builder);
    return [builder build];
}
@end

@implementation UserPbModelBuilder
- (instancetype)initWithUserPbModel:(UserPbModel *)model
{
    NSParameterAssert(model);
    if (!(self = [super init])) {
        return self;
    }
    [self propertyMapWithPrototype:model mapping:@{@"objectId": @"objectId",
                                                   @"name": @"name",
                                                   @"favouriteSport": @"favouriteSport",
                                                   @"favouriteMovie": @"favouriteMovie",
                                                   @"hasMarried": @"hasMarried",
                                                   @"education": @"education",
                                                   @"age": @"age",
                                                   @"psychologicalAge": @"psychologicalAge",
                                                   @"pet": @"pet",
                                                   @"hasPet": @"hasPet",
                                                   @"houses": @"houses",
                                                   @"wardrobes": @"wardrobes"}];
    return self;
}
- (UserPbModel *)build
{
    return [[UserPbModel alloc] initWithUserPbModelBuilder:self];
}
@end

@implementation UserPbModel (Extension)
+ (void)unidirectionalDataflow:(UserPbModel *)model objectId:(NSString *)objectId
{
    // unidirectional data flow
}
@end